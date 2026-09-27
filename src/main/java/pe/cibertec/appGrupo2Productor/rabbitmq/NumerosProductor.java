package pe.cibertec.appGrupo2Productor.rabbitmq;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import pe.cibertec.appGrupo2Productor.config.RabbitMqConfig;

@RequiredArgsConstructor
@Component
public class NumerosProductor {
    private final RabbitTemplate rabbitTemplate;
    public void enviarNumeros(String cadenaNumeros){
        rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE,  RabbitMqConfig.ROUTING_KEY, cadenaNumeros);
    }
}
