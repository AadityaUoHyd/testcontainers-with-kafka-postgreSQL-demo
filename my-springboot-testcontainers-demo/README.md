# Spring Boot 3 with Testcontainer's new feature, @ServiceConnections.

we'll be looking at Java TestContainers library. It allows us to use Docker containers within our tests. As a result, we can write self-contained integration tests that depend on external resources. We can use any resource in our tests that have a docker image. For example, there are images for databases, web browsers, web servers, and message queues. Therefore, we can run them as containers for Local Development Support Demo & testing purpose.

- With @ServiceConnections, the new feature of testcontainer library in Spring 3.1.0-SNAPSHOT (i.e. things may vary little bit later), 
we no need to register components in testcontainers, and also get rid of writing docker-compose files.

# How to run this program :

- First of all start your docker engine, and for better UI & management install portainer.
![](https://github.com/AadityaUoHyd/testcontainers-with-kafka-postgreSQL-demo/blob/master/my-springboot-testcontainers-demo/portainer.jpg)

- Now run the Test case :
![](https://github.com/AadityaUoHyd/testcontainers-with-kafka-postgreSQL-demo/blob/master/my-springboot-testcontainers-demo/TestApplicationPic.png)

- Go to postman and hit those controller URL=>
To fetch products :
![](https://github.com/AadityaUoHyd/testcontainers-with-kafka-postgreSQL-demo/blob/master/my-springboot-testcontainers-demo/get1.jpg)

- In case you want to add more products :
![](https://github.com/AadityaUoHyd/testcontainers-with-kafka-postgreSQL-demo/blob/master/my-springboot-testcontainers-demo/post.jpg)

- Now cross check, product get added or not :
![](https://github.com/AadityaUoHyd/testcontainers-with-kafka-postgreSQL-demo/blob/master/my-springboot-testcontainers-demo/get.jpg)



References : https://www.testcontainers.org/ <br>
https://www.baeldung.com/docker-test-containers <br>
https://www.sivalabs.in/spring-boot-integration-testing-using-testcontainers-starter/ <br>
