package com.techForb.Bank.Controller;

import com.techForb.Bank.Entity.Transfer;
import com.techForb.Bank.Interface.ITransferService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    @Autowired
    ITransferService itransferService;

    @GetMapping("transfer/getall")
    public List<Transfer> getUser() {
        return itransferService.getTransfer();
    }

    @PostMapping("transfer/post")
    public String createUser(@RequestBody Transfer transfer) {
        itransferService.saveTransfer(transfer);
        return "transfer completed successfully";
    }

    @DeleteMapping("transfer/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        itransferService.deleteTransfer(id);
        return "Transfer Deleted";
    }

}
