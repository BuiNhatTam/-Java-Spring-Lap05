package thuchanh;

import com.neovisionaries.i18n.CountryCode;
import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import thuchanh.backend.models.Address;
import thuchanh.backend.repositories.AddressRepository;
@SpringBootTest
class LapWeek05ApplicationTests {

    @Autowired
    private AddressRepository repository;

    @PostConstruct
    void add_test() {
        Address add=new Address("11","NVQ","sg","5345643", CountryCode.AF);
        add.setId(1);
        repository.save(add);

    }
    @Test
    void test_01(){
        Address add =repository.findById(1L).get();
        Assertions.assertEquals(add.getNumber(),"11");
    }
}
