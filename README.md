# Greeting Service

### Description
* Greeting Service is a REST application implemented using spring boot.
* To test the application, follow the Getting Started instructions below.
* By default, the application runs on port 8080. To change the port, supply 'server.port' with the new port number. For example: ``` java -jar -Dserver.port=8083 greetingservice-0.0.1-SNAPSHOT.war ```

### Getting Started
```

git clone https://github.com/vkend/greetingservice.git
cd greetingservice
mvn package
cd target
java -jar greetingservice-0.0.1-SNAPSHOT.war

```

### Available REST Services
```
Request Type	Parameters
Path : /greeting	
Request Type :get	
Parameters : 
	{
	  "name": "userFirst",
	  "in": "query",
	  "description": "userFirst",
	  "required": true,
	  "type": "string"
	}
	{
	  "name": "userLast",
	  "in": "query",
	  "description": "userLast",
	  "required": false,
	  "type": "string"
	}

Parameters : /visitorstats	
Request Type : get	
```
