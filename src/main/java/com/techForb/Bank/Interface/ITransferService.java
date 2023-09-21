package com.techForb.Bank.Interface;

import com.techForb.Bank.Entity.Transfer;
import java.util.List;


public interface ITransferService {
    
    public List<Transfer> getTransfer();
    
    public void saveTransfer ( Transfer transfer);
    
    public void deleteTransfer(Long id);
    
    public Transfer findTransfer(Long id);
}
