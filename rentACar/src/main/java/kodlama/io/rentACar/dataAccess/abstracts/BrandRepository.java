package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repository veya dao tarzı ek isimler veri tabanına erişim görevi olanlarındır.
//@Repository yazmasan da anlayabiliyor çünkü extend ettiğimizden kaynaklı.
@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {

//    List<Brand> getAll();
}

/*jpa yı kullanarak sanki concrete varmış gibi onun özelliklerini findAll(), gettAll gibi fonksiyonları
kullanabiliriz hazır şekilde. Bunu genelde data accesse  interfacesine extend ederiz yani
JpaRepository bir interfacedir. interface interfaceyi extend edebilir.jpa ile entitymize ulaşmamıızı sağlarız listeleme
gibi birden çok işlemleri yapabiliriz.


*/