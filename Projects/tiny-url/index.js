const express = require("express");

const urlRoute = require("./routes/url");
const{connectToMongoDB} = require("./connect")

const app = express();
const PORT = 3002;

app.use("/url",urlRoute);

app.listen(PORT, () => console.log("Server is running at port ${PORT}"));