const express = require("express");
const { connectToMongoDB } = require("./connect");
const URL = require("./models/url"); // Added import for URL model
const app = express();
const PORT = 3002;

connectToMongoDB('mongodb://localhost:27017/short-url');

app.use(express.json());
app.use("/url", require("./routes/url")); // Corrected route import

app.get("/:shortId", async (req, res) => { // Added async keyword
    try {
        const shortId = req.params.shortId;
        const entry = await URL.findOneAndUpdate(
            { shortId },
            {
                $push: {
                    visitHistory: { timestamp: Date.now() }
                }
            }
        );
        if (entry) {
            res.redirect(entry.redirectURL);
        } else {
            res.status(404).json({ error: "URL not found" });
        }
    } catch (error) {
        console.error("Error redirecting:", error);
        res.status(500).json({ error: "Internal Server Error" });
    }
});

app.listen(PORT, () => console.log(`Server is running at port ${PORT}`));
