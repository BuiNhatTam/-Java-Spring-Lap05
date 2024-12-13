package thuchanh.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import thuchanh.backend.models.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
