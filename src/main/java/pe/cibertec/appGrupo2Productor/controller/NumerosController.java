package pe.cibertec.appGrupo2Productor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.appGrupo2Productor.rabbitmq.NumerosProductor;

@RequiredArgsConstructor
@RestController
public class NumerosController {
    private final NumerosProductor numerosProductor;

    @GetMapping("/numeros")
    public String enviarNumeros(@RequestParam String numeros) {
        numerosProductor.enviarNumeros(numeros);
        return "Lista enviada a RabbitMQ correctamente.";
    }
}
