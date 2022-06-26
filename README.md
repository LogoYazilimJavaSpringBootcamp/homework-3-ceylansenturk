
. ActiveMQ, Kafka ve RabbitMQ karşılaştırın. Örnek kodlar ile nasıl çalıştığını anlatın. (10 Puan)
--------------------------------------------------------------------------

RabbitMQ , Kafka ve ActiveMQ , asenkron iletişim sağlamak ve süreçleri ayırmak (bir mesajın göndericisini ve alıcısını ayırmak) için kullanılan mesajlaşma teknolojileridir. Bunlara mesaj kuyrukları, mesaj simsarları veya mesajlaşma araçları denir. RabbitMQ, Kafka ve ActiveMQ hepsi aynı temel amaca hizmet eder, ancak işlerini farklı şekilde yapabilirler. Kafka, yüksek verimli dağıtılmış bir mesajlaşma sistemidir. RabbitMQ, AMQP tabanlı güvenilir bir mesaj aracısıdır. ActiveMQ ve Kafka, Apache ürünleridir ve her ikisi de Java ile yazılmıştır; RabbitMQ Erlang'da yazılmıştır.

Kod örnekleri FirstQuestion dosyasının altındadır.


• Microservis ve monolith mimariyi karşılaştırın.(10 Puan)
------------------------------------------------------------------------------
Microservice, API yönetimi ve entegrasyon teknolojileri ile uyumlu bir mikro hizmet mimarisi, yazılım geliştirmeye farklı bir yaklaşım sağlar.
Bunun yerine monolith, ayrı olarak geliştirilen, dağıtılan ve bakımı yapılan bir dizi bağımsız hizmete ayrıştırılır

• SOAP - RESTful karşılaştırın (10 Puan)
----------------------------------------------------------------------
| RESTful                                                                 | SOAP                                                                                                                   |
|-------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| SOAP bir protokoldür .                                                  | REST bir mimari tarzdır                                                                                                |
| SOAP,Simple Object Access Protocol anlamına gelir.                      | REST, REpresentational State Transfer anlamına gelir.                                                                  |
| SOAP bir protokol olduğu için REST kullanamaz.                          | REST bir kavram olduğu için SOAP web servislerini kullanabilir ve HTTP, SOAP gibi herhangi bir protokolü kullanabilir. |
| SOAP , iş mantığını ortaya çıkarmak için hizmet arayüzlerini kullanır . | REST , iş mantığını ortaya çıkarmak için URI'yi kullanır .                                                             |
| JAX-WS , SOAP web servisleri için Java API'sidir.                       | JAX-RS , RESTful web hizmetleri için Java API'sidir.                                                                   |
| SOAP , kesinlikle uyulması gereken standartları tanımlar .              | REST, SOAP gibi çok fazla standart tanımlamaz.                                                                         |
| SOAP , REST'ten daha fazla bant genişliği ve kaynak gerektirir.         | REST , SOAP'tan daha az bant genişliği ve kaynak gerektirir.                                                           |
| SOAP kendi güvenliğini tanımlar .                                       | RESTful web hizmetleri , güvenlik önlemlerini temeldeki aktarımdan devralır.                                           |
| SOAP , yalnızca XML veri biçimine izin verir.                           | REST , düz metin, HTML, XML, JSON vb. gibi farklı veri biçimlerine izin verir .                                        |
| SOAP, REST'ten daha az tercih edilir .                                  | SOAP'tan daha çok REST tercih edilir .                                                                                 |

. isbasi.com üye olup sisteme 3 yeni model ekleyin ve mimariye uygun şekilde
CRUD işlemleri yapan endpointleri yazın. (50 Puan)

• CustomerServisi için gerekli tüm endpoint’leri yazın. (10 Puan)

• Aktif ve pasif müşterileri listeleyen endpoint için gerekli kodu yazın. (10 Puan)
