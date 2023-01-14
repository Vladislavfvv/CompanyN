package by.tms.dao;

import by.tms.entity.Client;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HibernateClientDao implements ClientDao{
    @Override
    public Client save(Client entity) {
        return null;
    }

    @Override
    public List<Client> getList() {
        return null;
    }

    @Override
    public Client findById(Long aLong) {
        return null;
    }
}
