const http = require('http');

http.createServer(function (req, res) {
  //res.setHeader(200, {'Content-Type': 'text/html'});
  res.end('Hello World!');
}).listen(8080);

console.log("server is running at port 8080");