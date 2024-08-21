package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponses;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.core.utilities.mapper.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Autowired ne işe yarar dersen constructor içindeki parametrenin yaratılmasını sağlıyor newliyor.

// Bu kısım önemli loosly couple için direkt sadece interface ile haberleşiyoruz. Eğer inmemory yerine başka bir şey olsa onu kullanırız.
@Service   //: Bu sınıf bir business nesnesidir.
@AllArgsConstructor
public class BrandManager implements BrandService {
    //ilk başta interfaceyi implement ettik

    //Veritabanına ulaşmamız lazım oradaki gerçek işlemleri sanki bir dummyye kopyalayacağız
    private BrandRepository brandRepository;

    //Maplememizi kolaylaştıran Servisi kullandık. Biz yazmıştık
    private ModelMapperService modelMapperService;

    //Response Request patternini uyguladık. Esas entitymizi sakladık.
    @Override
    public List<GetAllBrandResponses> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandResponses> brandsResponse = brands.stream()
                .map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandResponses.class))
                .collect(Collectors.toList());
        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse getByIdBrandResponse = this.modelMapperService.forResponse().map(brand,GetByIdBrandResponse.class);
        return  getByIdBrandResponse;
    }


    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }



    // add ile farkı UpdateBrandRequest classında id var yani o idyi updateler. Ama CreateBrandRequest içinde id yok o yüzden yeniden yaratır.
    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }


    //Bunda bir mapleme işi yok çünkü gerçek entity kullanmıyorsun.
    @Override
    public void delete(int id) {
            this.brandRepository.deleteById(id);
    }
}
