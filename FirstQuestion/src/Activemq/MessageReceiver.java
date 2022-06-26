package Activemq;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageReceiver {
    //  JMS server'ın Url'i
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

    // Mesajları alacağımız sıranın adı
    private static String subject = "JCG_QUEUE";

    public static void main(String[] args) throws JMSException {
        // Sunucudan JMS bağlantısı alma
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();

        // Mesaj göndermek için session oluşturma
        Session session = connection.createSession(false,
                Session.AUTO_ACKNOWLEDGE);


        Destination destination = session.createQueue(subject);

        // MessageConsumer mesajları almak için kullanılır
        MessageConsumer consumer = session.createConsumer(destination);

        // Mesajımızı alıyoruz
        Message message = consumer.receive();

        // Örneğimizde TestMessage kullanacağız. MessageProducer bize bir TextMessage gönderdi,
        // bu yüzden .getText() yöntemine erişmek için ona göndermemiz gerekiyor.
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            System.out.println("Received message '" + textMessage.getText() + "'");
        }
        connection.close();
    }

