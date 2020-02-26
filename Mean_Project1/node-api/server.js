const express = require('express');

const morgan=require('morgan');
const mongoose=require('mongoose');

mongoose.connect(
    "mongodb://localhost:27017/employeeDB",
{
     useNewUrlParser:true,
     useUnifiedTopology:true
},
err =>{
    if(err){
       console.log("could not connect");

    }
    else{
        console.log("mongodb connected")
    }
}
);
const employeeRoutes=require('./routes/employee');
const app = express();

app.get('/',(req,res) => {
     res.status(200).json({

        error:false,
        message: 'Api is up and running'
        
     })

})
app.use(express.json());
app.use(morgan('dev'));
app.use('/api/v1/employee',employeeRoutes);

const PORT=process.env.PORT || 5000;
app.listen(PORT,()=>{
    console.log(`server running at port:${PORT}`)
});
