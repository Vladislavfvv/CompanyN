package by.tms.dao;

import by.tms.entity.Client;
import by.tms.entity.Contract;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ContractDao extends CrudDao<Contract, Long> {
    public List<Contract> findContractByServiceName(String serviceName);
    public List<Contract> findContractsByClient(Client client);

    public Contract getContractInfoByDate(LocalDate localDate);
}
