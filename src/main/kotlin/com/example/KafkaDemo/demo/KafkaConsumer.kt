import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {
    @KafkaListener(topics = [Constants.TOPIC_NAME])
    fun listen(msg: String) {
        print("Message Received - $msg")
    }
}
