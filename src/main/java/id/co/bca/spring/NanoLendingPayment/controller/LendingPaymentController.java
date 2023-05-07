package id.co.bca.spring.NanoLendingPayment.controller;

import id.co.bca.spring.NanoLendingPayment.model.LendingPaymentModel;
import id.co.bca.spring.NanoLendingPayment.repository.LendingPaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/lending")
public class LendingPaymentController {
    @Autowired
    LendingPaymentRepo paymentRepo;
    @GetMapping("/pay")
    @ResponseStatus(HttpStatus.OK)
    public List<LendingPaymentModel> findAll(){return paymentRepo.findAll();}
    @GetMapping("/pay/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional findPaymentById(@PathVariable("id") int id){
        return paymentRepo.findById(id);
    }
    @PostMapping("/pay")
    @ResponseStatus(HttpStatus.OK)
    public LendingPaymentModel addPayment(@RequestBody LendingPaymentModel paymentModel){
        paymentRepo.save(paymentModel);
        return paymentModel;
    }
    @PutMapping("/pay/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LendingPaymentModel updatePayment(@RequestBody LendingPaymentModel paymentModel, @PathVariable("id") int id){
        paymentModel.setId(id);
        paymentRepo.save(paymentModel);
        return paymentModel;
    }
    @DeleteMapping("/pay/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePayment(@PathVariable("id") int id){
        paymentRepo.deleteById(id);
    }

}
