const { default: mongoose } = require("mongoose");
const mangoose = require("mongoose");

async function connectToMongoDB(url){
    return mongoose.connect(url);


}


module.exports = {
    connectToMongoDB
}