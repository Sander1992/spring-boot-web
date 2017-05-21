package com.learning.springbootweb.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.learning.springbootweb.domain"})
@EnableJpaRepositories(basePackages = {"com.learning.springbootweb.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}