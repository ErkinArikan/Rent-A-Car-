# Rent-A-Car RESTful API
This project is a RESTful API developed for managing car rental operations. The project is structured using layered architecture and the request-response pattern. The goal of this project is to provide a reliable and scalable solution for managing car rental processes.

Project Architecture
Layered Architecture
The project is structured according to the principles of layered architecture. This allows the application to organize its different responsibilities into separate layers. The project consists of four main layers:

Controller Layer:

This layer handles client requests (HTTP requests).
Input validation and routing are performed in this layer.
It communicates with the service layer and generates responses.
Service Layer:

This is where the business logic resides. It contains the business rules and data processing logic.
It receives requests from the controller layer, applies business logic, and passes the results to the data access layer.
Data Access Layer:

This layer is responsible for database operations.
It processes requests from the service layer and interacts with the database.
Data retrieved from the database is passed back to the business logic layer.
Entity Layer:

This layer contains the data models (entities) used in the application.
Classes that map to database tables are defined here.
Request-Response Pattern
The project is based on the request-response pattern, which is commonly used in REST API design. This pattern provides a standard structure for how requests from the client are handled and how responses are generated.

Request Models:

Represent the data received from the client.
Provide the necessary data structure for POST, PUT, and other requests to the API.
Include validation rules to ensure the correctness and validity of the data.
Response Models:

Represent the responses that are returned to the client.
Include the results of operations, error messages, and other relevant information.
Sent to the client in JSON format.
API Features
Add Car: Adds new cars to the system.
List Cars: Lists available cars.
Update Car: Updates information of registered cars.
Delete Car: Removes a specified car from the system.
Rent Car: Rents a specified car for a given period.
Technologies
Java - The programming language.
Spring Boot - The framework used for application development.
Spring Data JPA - Used for the data access layer.
H2 Database - A lightweight database solution (used for development).
Swagger - Used for API documentation.





Bu proje, araç kiralama işlemleri için geliştirilmiş bir RESTful API'dir. Proje, katmanlı mimari ve request-response pattern'i kullanılarak yapılandırılmıştır. Projenin amacı, araç kiralama süreçlerini yönetmek için güvenilir ve ölçeklenebilir bir çözüm sunmaktır.

Proje Mimarisi
Katmanlı Mimari
Proje, katmanlı mimari (Layered Architecture) prensiplerine göre yapılandırılmıştır. Bu, uygulamanın farklı sorumluluklarını ayrı katmanlar halinde organize etmeyi sağlar. Proje dört ana katmandan oluşur:

Controller Katmanı:

Bu katman, istemci taleplerini (HTTP isteklerini) alır ve işleme koyar.
Girdi doğrulama ve yönlendirme işlemleri bu katmanda gerçekleştirilir.
İş mantığı katmanıyla iletişime geçer ve yanıtları oluşturur.
Service Katmanı:

İş mantığının bulunduğu katmandır. Bu katman, iş kurallarını ve veri işleme süreçlerini içerir.
Controller katmanından gelen istekleri alır, iş mantığını uygular ve sonuçları veri erişim katmanına iletir.
Data Access Katmanı:

Veritabanı işlemlerini gerçekleştiren katmandır.
Service katmanından gelen talepleri işleyerek veritabanı ile etkileşime girer.
Veritabanından alınan verileri iş mantığı katmanına geri döner.
Entity Katmanı:

Uygulamada kullanılan veri modellerini (entity) içerir.
Veritabanı tablolarıyla eşlenen sınıflar burada tanımlanır.
Request-Response Pattern
Proje, REST API tasarımında yaygın olarak kullanılan request-response pattern'ini temel alır. Bu pattern, istemciden gelen isteklerin (request) nasıl işleneceği ve yanıtların (response) nasıl oluşturulacağı konusunda standart bir yapı sunar.

Request Modelleri:

İstemciden gelen verileri temsil eder.
API'ye yapılan POST, PUT gibi talepler için gerekli veri yapısını sağlar.
Verilerin doğruluğunu ve geçerliliğini sağlamak için doğrulama kuralları içerir.
Response Modelleri:

İstemciye döndürülecek yanıtları temsil eder.
İşlemlerin sonucunu, hata mesajlarını ve diğer ilgili bilgileri içerir.
JSON formatında istemciye iletilir.
API Özellikleri
Araç Ekleme: Yeni araçları sisteme ekler.
Araç Listeleme: Mevcut araçları listeler.
Araç Güncelleme: Sistemde kayıtlı araç bilgilerini günceller.
Araç Silme: Belirtilen bir aracı sistemden siler.
Araç Kiralama: Belirli bir aracı belirtilen süre için kiralar.
Teknolojiler
Java - Uygulama dili.
Spring Boot - Uygulama geliştirme çerçevesi.
Spring Data JPA - Veri erişim katmanı için kullanılır.
H2 Database - Hafif veritabanı çözümü (geliştirme süreci için).
Swagger - API dokümantasyonu için kullanılır.
