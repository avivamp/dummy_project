Setup Steps:-

1. Microservice Setup (Spring Boot)
2. DB Setup (Mongo DB)
	- Install and setup mongo db on your local
	- Run command "mongo" to start the DB service
	- Run command "mongod" to listen to db logs
3. UI Setup (React JS)
	- Run "npm start" in the source repo
4. Message Broker (RabbitMq)
	- http://localhost:15672 (UI)
	- Run "brew services start rabbitmq" or "rabbitmq-server" to start the server
5. Caching (Redis)
	- src>redis.server
	- src>redis.cli
	
DB Details:-
DB - site_event
Collection - customer, event, order