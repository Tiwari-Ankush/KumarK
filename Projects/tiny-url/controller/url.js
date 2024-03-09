const { nanoid } = require("nanoid");
const URL = require('../models/url');

async function handleGenerateNewShortURL(req, res) {
    const body = req.body; // Moved this line up to prevent undefined error
    if (!body.url) return res.status(400).json({ error: "url is required" });

    const shortId = nanoid(10);
    await URL.create({
        shortId: shortId,
        redirectURL: body.url,
        visitHistory: []
    });
    return res.json({ id: shortId });
}

module.exports = {
    handleGenerateNewShortURL,
};
