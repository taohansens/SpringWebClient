package com.taohansen.springwebclient.service;

import com.taohansen.springwebclient.model.Clima;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClimaService {
    private final WebClient.Builder webClientBuilder;

    public Mono<Clima> getClimaRJ() {
        WebClient webClient = webClientBuilder.baseUrl("https://api.open-meteo.com/v1/forecast?latitude=-22.9064&longitude=-43.1822&current=temperature_2m&forecast_days=1").build();
        return webClient.get()
                .retrieve()
                .bodyToMono(Clima.class);
    }
}