package Activemq;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
public class MessageSender {
    //JMS sunucusunun URL'si. DEFAULT_BROKER_URL sadece JMS sunucusunun localhost üzerinde olduğu anlamına gelir
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

    private static String subject = "JCG_QUEUE"; // Queue Name.Gereksiniminize göre herhangi bir queue adı oluşturabilirsiniz.

    public static void main(String[] args) throws JMSException {
        // Sunucudan JMS bağlantısı alma ve başlatma
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();

        //JMS mesajı göndermek/almak için işlemsel olmayan bir oturum oluşturma.
        Session session = connection.createSession(false,
                Session.AUTO_ACKNOWLEDGE);

        //Destination burada JMS sunucusundaki 'JCG_QUEUE' kuyruğumuzu temsil eder.
        //Queue sunucuda otomatik olarak oluşturulacaktır.
        Destination destination = session.createQueue(subject);

        // MessageProducer, queue'ya mesaj göndermek için kullanılır.
        MessageProducer producer = session.createProducer(destination);

        //'Hello World!!!' diyen küçük bir metin mesajı göndereceğiz.
        TextMessage message = session
                .createTextMessage("Hello !!! Welcome to the world of ActiveMQ.");

        // mesajımızı gönderiyoruz
        producer.send(message);

        System.out.println("JCG printing@@ '" + message.getText() + "'");
        connection.close();
    }
}
