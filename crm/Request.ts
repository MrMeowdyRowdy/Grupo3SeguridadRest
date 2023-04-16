import axios from "axios";


const username = "admin";
const password = "admin123";


const url = "http://localhost:8080/api/contacts";


const payload = { Cliente: "JoseN", Reserva: "London", Viaje: "v3" };


const headers = {
  Authorization: `Basic ${btoa(`${username}:${password}`)}`,
  "Content-Type": "application/json",
};


axios.post(url, payload, { headers })
  .then((response) => {
    console.log("Success");
  })
  .catch((error) => {
    console.error(error.response.status);
  });
