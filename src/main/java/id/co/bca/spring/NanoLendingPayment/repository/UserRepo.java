package id.co.bca.spring.NanoLendingPayment.repository;
import id.co.bca.spring.NanoLendingPayment.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, Integer> {
    UserModel findByUsername(String username);
}
