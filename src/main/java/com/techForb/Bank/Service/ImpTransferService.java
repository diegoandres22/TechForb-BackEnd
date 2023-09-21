package com.techForb.Bank.Service;

import com.techForb.Bank.Entity.Transfer;
import com.techForb.Bank.Interface.ITransferService;
import com.techForb.Bank.Repository.ITransferRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpTransferService implements ITransferService {

    @Autowired
    ITransferRepository itransferRepository;

    @Override
    public List<Transfer> getTransfer() {
        List<Transfer> transfer = itransferRepository.findAll();
        return transfer;
    }

    @Override
    public void saveTransfer(Transfer transfer) {
        itransferRepository.save(transfer);
    }

    @Override
    public void deleteTransfer(Long id) {
        itransferRepository.deleteById(id);
    }

    @Override
    public Transfer findTransfer(Long id) {
        Transfer transfer = itransferRepository.findById(id).orElse(null);
        return transfer;
    }
}
