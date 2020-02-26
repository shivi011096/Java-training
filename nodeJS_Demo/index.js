// const express = require('express');
// const app = express();
// const port = 8080;

// app.get('/student',function(req, res){
//     res.send("get all students")
// })

// app.get('/student',function(req, res){
//     let id =req.params.id;
//     res.send("get students by id")
// })

// app.post('/student',function(req, res){
//     res.send("post all students")
// })

// app.put('/student',function(req, res){
//     res.send("put student")
// })

// app.delete('/student',function(req, res){
//     res.send("delete students")
// })

// app.listen(port,function(){
//     console.log('server is running port:'+port)
// })


const express = require('express');
const mysql = require('mysql')

const con = mysql.createConnection({
    'host': 'localhost',
    'username': 'root',
    'password': 'welcome'
})

con.connect(err) => {
    if(err){
        
    }
}