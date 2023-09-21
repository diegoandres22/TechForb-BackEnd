package com.techForb.Bank.Repository;

import com.techForb.Bank.Entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransferRepository extends JpaRepository<Transfer, Long> {

    public Transfer findAllById(Long id);
}
