package com.taohansen.springwebclient.controller;

import com.taohansen.springwebclient.model.Clima;
import com.taohansen.springwebclient.service.ClimaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class ClimaController {
    private final ClimaService climaService;

    @GetMapping
    public Mono<Clima> getClima() {
        return climaService.getClimaRJ();
    }
}