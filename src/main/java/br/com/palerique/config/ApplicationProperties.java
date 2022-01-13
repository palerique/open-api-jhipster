package br.com.palerique.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Open Api Jhipster.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link tech.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {}
