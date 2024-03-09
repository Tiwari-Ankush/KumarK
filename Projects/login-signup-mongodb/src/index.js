const express = require("express");
const path = require("path");
const app = express();
const LogInCollection = require("./mongo");
const port = process.env.PORT || 3000;

app.use(express.json());
app.use(express.urlencoded({ extended: false }));

const templatePath = path.join(__dirname, '../templates');
const publicPath = path.join(__dirname, '../public');

app.set('view engine', 'hbs');
app.set('views', templatePath);
app.use(express.static(publicPath));

app.get('/signup', (req, res) => {
    res.render('signup');
});

app.get('/', (req, res) => {
    res.render('login');
});

app.post('/signup', async (req, res) => {
    try {
        const data = new LogInCollection({
            name: req.body.name,
            password: req.body.password
        });
        await data.save();
        res.status(201).render("home", { naming: req.body.name });
    } catch (error) {
        console.error(error);
        res.send("Error signing up");
    }
});

app.post('/login', async (req, res) => {
    try {
        const user = await LogInCollection.findOne({ name: req.body.name, password: req.body.password });
        if (user) {
            res.status(201).render("home", { naming: req.body.name });
        } else {
            res.send("Incorrect username or password");
        }
    } catch (error) {
        console.error(error);
        res.send("Error logging in");
    }
});

app.listen(port, () => {
    console.log(`Server is running at port ${port}`);
});
