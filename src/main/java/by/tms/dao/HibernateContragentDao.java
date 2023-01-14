package by.tms.dao;

import by.tms.entity.Contragent;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HibernateContragentDao implements ContragentDao{
    @Override
    public Contragent save(Contragent entity) {
        return null;
    }

    @Override
    public List<Contragent> getList() {
        return null;
    }

    @Override
    public Contragent findById(Long aLong) {
        return null;
    }
}
