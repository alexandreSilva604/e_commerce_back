# e_commerce_back
Back-end app made with Java and Spring Boot, compatible with 
[e_commerce_front](https://github.com/alexandreSilva604/e_commerce_front).
If you wish to use this project, please contact me.

DataBase support will be added in the future. For now 
all the data is made and sent through the app itself.

# Getting Started
Open the command line, or your IDE's terminal at the 
root folder of the app, and type (or copy-paste) the 
following command:

```bash
./mvnw spring-boot:run -D"spring-boot.run.jvmArguments"='-Dserver.port=9000'
```

Open your browser at http://localhost:9000/allProducts to check if it works.
You should get the products in JSON format.

You can request the information gotten in that page 
through fetch.