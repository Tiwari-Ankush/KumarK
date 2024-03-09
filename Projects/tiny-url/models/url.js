const mongoose = require("mongoose");

const urlSchema = new mongoose.Schema({
    shortId: {
        type: String,
        required: true, // Corrected typo from reqire to required
        unique: true,
    },
    redirectURL: {
        type: String,
        required: true, // Corrected typo from require to required
    },
    visitHistory: [{ timestamp: { type: Number } }],
}, { timestamps: true });

const URL = mongoose.model('URL', urlSchema); // Corrected model name to uppercase

module.exports = URL;
