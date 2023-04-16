import requests

# Set the authentication credentials
username = "admin"
password = "admin123"

# Set the API URL
url = "http://localhost:8080/api/contacts"

# Set the JSON payload
payload = {"Cliente": "JoseN", "Reserva": "London", "Viaje": "v3"}

# Make a POST request to the API endpoint with authentication
api_response = requests.post(url, json=payload, auth=(username, password))

# Check the response status code
if api_response.status_code == 200:
    print("Success")
else:
    print(api_response.status_code)
