package by.tms.dao;

import by.tms.entity.Client;
import by.tms.entity.Contract;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public class HibernateContractDao implements ContractDao{
    @Override
    public List<Contract> findContractByServiceName(String serviceName) {
        return null;
    }

    @Override
    public List<Contract> findContractsByClient(Client client) {
        return null;
    }

    @Override
    public Contract getContractInfoByDate(LocalDate localDate) {
        return null;
    }

    @Override
    public Contract save(Contract entity) {
        return null;
    }

    @Override
    public List<Contract> getList() {
        return null;
    }

    @Override
    public Contract findById(Long aLong) {
        return null;
    }
}
