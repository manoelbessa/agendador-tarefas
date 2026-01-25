package com.javanauta.agendador_tarefas;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {
    @Bean
    @Primary  // Torna este o principal, sobrepondo o auto-config
    public MongoTemplate mongoTemplate() {
        // Cria cliente com URI completa
        String uri = "mongodb://localhost:27017/db_agendador";
        MongoClient mongoClient = MongoClients.create(uri);

        // Força o database "db_agendador"
        return new MongoTemplate(mongoClient, "db_agendador");
    }
}
