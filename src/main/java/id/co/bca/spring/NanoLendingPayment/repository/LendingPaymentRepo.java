package id.co.bca.spring.NanoLendingPayment.repository;

import id.co.bca.spring.NanoLendingPayment.model.LendingPaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LendingPaymentRepo extends JpaRepository<LendingPaymentModel, Integer> {
}
