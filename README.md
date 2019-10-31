# Greeting Service

## Description
* Greeting Service is a REST application implemented using spring boot.
* To test the application, follow the Getting Started instructions below.
* By default, the application runs on port ```8080```. To change the port, supply ```server.port``` with the new port number. For example: ``` java -jar -Dserver.port=8083 greetingservice-0.0.1-SNAPSHOT.war ```

## Getting Started
```

git clone https://github.com/vkend/greetingservice.git
cd greetingservice
mvn package
cd target
java -jar greetingservice-0.0.1-SNAPSHOT.war

```

## Available REST Services
```
Path : /greeting	
Request Type : get	
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

## Examples :
### /greeting
1. Query : ```http://localhost:8080/greeting?userFirst=Vishal&userLast=Kendre  ```

Output : ```Welcome Vishal Kendre!```

2. Query : ```http://localhost:8080/greeting?userFirst=Vishal ```

Output : ```Welcome Vishal!```

### /visitorstats
Query : ``` http://localhost:8080/visitorstats ```

Output :
``` 
{
  "totalVisits": 3,
  "visitorFirstNames": [
    "Vishal",
  ],
  "visitorLastNames": [
    "Kendre"
  ],
  "visitors": [
    {
      "id": 1,
      "visitCount": 2,
      "userFirst": "Vishal",
      "userLast": null
    },
    {
      "id": 2,
      "visitCount": 1,
      "userFirst": "Vishal",
      "userLast": "Kendre"
    }
  ]
}
 ```


## Customizing message for ``` /greeting ```
* By default the message will be ```Welcome {name}!```, where ```{name}``` is a concatenation of ```userFirst``` and ```userLast``` query params separated by a space.
* The message can be modified by supplying a VM argument ```greeting.message``` which can accept one argument for ```name```. For example : 
``` java -jar -Dgreeting.message="Hello, %s!" greetingservice-0.0.1-SNAPSHOT.war ```
* Querying ``` http://localhost:8080/greeting?userFirst=Vishal ``` will give an output of ``` Hello, Vishal! ```
