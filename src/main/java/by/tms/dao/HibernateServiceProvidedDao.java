package by.tms.dao;

import by.tms.entity.ServiceProvided;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HibernateServiceProvidedDao implements ServiceProvidedDao {
    @Override
    public ServiceProvided save(ServiceProvided entity) {
        return null;
    }

    @Override
    public List<ServiceProvided> getList() {
        return null;
    }

    @Override
    public ServiceProvided findById(Long aLong) {
        return null;
    }
}
