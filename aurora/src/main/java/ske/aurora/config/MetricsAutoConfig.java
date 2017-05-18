package ske.aurora.config;

import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.prometheus.client.CollectorRegistry;
import ske.aurora.prometheus.MetricsConfig;
import ske.aurora.prometheus.collector.HttpMetricsCollector;

@Configuration
public class MetricsAutoConfig {

    @Bean
    public CollectorRegistry prometheusRegistry(Set<HttpMetricsCollector> httpCollectors) {

        return MetricsConfig.init(httpCollectors);

    }

}