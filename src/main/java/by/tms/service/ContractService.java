package by.tms.service;

import by.tms.dao.ContractDao;
import by.tms.entity.Client;
import by.tms.entity.Contract;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ContractService {

    private final ContractDao contractDao;

    public ContractService(ContractDao contractDao) {
        this.contractDao = contractDao;
    }


    public Contract saveContract(Contract contract){
        return contractDao.save(contract);
    }

    public List<Contract> getListContractByClient(Client client){
        return contractDao.findContractsByClient(client);
    }

    public Contract getContractInfoByDate(LocalDate localDate){
        return contractDao.getContractInfoByDate(localDate);
    }


}
