
const {nanoid} = require("nanoid");
const URL = require('../models/url')

async function handleGenerateNewShortURL(req,res){
    if(!body.url) return res.status(400).json({error: "url is required"});
    const body = req.body;

    const shortId = nanoid(10);
    await URL.create({
        shortid : shortId,
        redirectURL: body.url,
        visitHistory: []
    })
    return res.json({id: shortId})
}

module.exports = {
    handleGenerateNewShortURL,
}