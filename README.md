# Greeting Service

### Description
* Greeting Service is a REST application implemented using spring boot.

### Getting Started
```

git clone the https://github.com/vkend/greetingservice.git
cd greetingservice
mvn clean install
java -jar greetingservice-0.0.1-SNAPSHOT.war

```

###Greeting Service : Available REST Services
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