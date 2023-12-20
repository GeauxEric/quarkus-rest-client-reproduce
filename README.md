# To reproduce Quarkus bug

`RestClient` from other module. Build error.

```bash
./gradlew :user:test
```

`RestClient` from same module. Connection refused: localhost/127.0.0.1:80 error as expected.
```bash
./gradlew :common:test
```
