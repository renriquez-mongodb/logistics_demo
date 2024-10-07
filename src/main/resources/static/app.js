document.addEventListener("DOMContentLoaded", function () {
    const truckForm = document.getElementById('truck-form');
    const truckList = document.getElementById('truck-list');

    const API_BASE = '/trucks';  // API endpoint for trucks

    // Fetch and display all trucks
    function fetchTrucks() {
        fetch(API_BASE)
            .then(response => response.json())
            .then(data => {
                truckList.innerHTML = '';
                data.forEach(truck => {
                    const li = document.createElement('li');
                    li.innerHTML = `
                        <strong>${truck.make} ${truck.model}</strong> - ${truck.year}, ${truck.type}, ${truck.capacityTons} tons
                        <button onclick="deleteTruck('${truck.id}')">Delete</button>
                    `;
                    truckList.appendChild(li);
                });
            });
    }

    // Create a new truck
    truckForm.addEventListener('submit', function (e) {
        e.preventDefault();

        const truckData = {
            make: document.getElementById('make').value,
            model: document.getElementById('model').value,
            year: parseInt(document.getElementById('year').value),
            type: document.getElementById('type').value,
            capacityTons: parseInt(document.getElementById('capacity').value)
        };

        fetch(API_BASE, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(truckData)
        }).then(response => {
            if (response.ok) {
                alert('Truck added successfully!');
                fetchTrucks();
                truckForm.reset();
            } else {
                alert('Error adding truck');
            }
        });
    });

    // Delete truck by ID
    window.deleteTruck = function (id) {
        if (confirm('Are you sure you want to delete this truck?')) {
            fetch(`${API_BASE}/${id}`, {
                method: 'DELETE',
            }).then(response => {
                if (response.ok) {
                    alert('Truck deleted successfully!');
                    fetchTrucks();
                } else {
                    alert('Error deleting truck');
                }
            });
        }
    };

    // Fetch all trucks on page load
    fetchTrucks();
});
