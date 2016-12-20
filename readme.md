# Remove App State Lab

This is a small servlet based application that uses the session to store some state.
This is not particularly cloud friendly because the state lives in each app process.
If we scale our app horizontally, then the user will only be logged in if the load balancer
hits the same instance they logged in to.

We can demonstrate this by running two instances of our server, and then running a load balancer in front of them:
in one terminal window run:
`mvn -Dmaven.tomcat.port=8080 -DinstanceNumber=1 tomcat7:run-war`

and in another terminal window run:
`mvn -Dmaven.tomcat.port=9090 -DinstanceNumber=2 tomcat7:run-war`

and in a third window run:
`./start-load-balancer.sh`

Take this example, and introduce a redis server to hold the state.
