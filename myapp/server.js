require("dotenv").config();
//const userLib = require("./backend/lib/userLib");
//const mongoose = require("mongoose");
const express = require('express');
const app = express();
const port = process.env.PORT || 5010;
const options = {
	extensions:['htm','html','css','js','ico','jpg','jpeg','png','svg','pdf'],
	index:['index.html'],
}
app.use(express.static("public",options));
app.get("/", function(req, res){
	res.sendFile(__dirname+"/index.html");
});
app.listen(port,function(){
console.log("Server running on https://localhost:"+port);
console.log(`Server running on https://localhost:${port}`);
});
//app.get("/weather", function(req, res){
//	res.sendFile(__dirname+"/weather.html");
//});
//
//app.get("/resume", function(req, res){
//	res.sendFile(__dirname+"/resume.html");
//});
//
//app.get("/card", function(req, res){
//	res.sendFile(__dirname+"/card.html");
//});
// app.get("/NeetCode", function(req, res){
// 	res.sendFile(__dirname+"/NeetCode.html");
// });

// app.get("/todo.html", function(req, res){
// 	res.sendFile(__dirname+"/todo.html");
// });

//mongoose.set('strictQuery', true);
//mongoose.connect(process.env.MONGO_CONNECTION_STRING,{},function (err){
//	if(err){
//		console.error(err);
//	}
//	else{
//		console.log("DB Connected");
//		// TODO: donot create user if atleast 1 user exist int the table
//		// userLib.createFirstUser(function(err,res){
//		// 	if(err){
//		// 		// console.error(err);
//		// 	}
//		// 	else{
//		// 		console.log(res);
//		// 	}
//		// });
//		// userLib.createUser({userName: "nithin1572", yearOfGraduation: 2024},function(err,result){
//		// 	if(err){
//		// 		console.error(err);
//		// 	}
//		// 	else{
//		// 		console.log(result);
//		// 	}
//		// });
//		// userLib.updateUser(function(err,result){
//		// 	if(err){
//		// 		console.error(err);
//		// 	}
//		// 	else{
//		// 		console.log(result);
//		// 	}
//		// });
//		// userLib.deleteUser("nithin1572",function(err,result){
//		// 	if(err){
//		// 		console.error(err);
//		// 	}
//		// 	else{
//		// 		console.log(result);
//		// 	}
//		// });
//		// userLib.getUserByFilter({userName: "nithin1572"}, function(err,result){
//		// 	if(err){
//		// 		console.error(err);
//		// 	}
//		// 	else{
//		// 		console.log(result);
//		// 	}
//		// });
//		// userLib.getAllUsers(function(err,result){
//		// 	if(err){
//		// 		console.error(err);
//		// 	}
//		// 	else{
//		// 		console.log(result);
//		// 	}
//		// });
//
//
//		app.listen(port, function(){
//			console.log("Server running on http://localhost:"+port);
//			console.log(`Server running on http://localhost:${port}`);
//		});
//
//	}
//});