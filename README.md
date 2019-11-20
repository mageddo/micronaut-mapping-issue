```bash
$ ./gradlew run
$ curl localhost:8080/people/id-123
{"message":"More than 1 route matched the incoming request. The following routes matched /people/id-123: GET - /people/id-123, GET - /people/id-123","_links":{"self":{"href":"/people/id-123","templated":false}}}
```