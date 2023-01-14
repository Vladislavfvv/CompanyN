package by.tms.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "contragents")
public class Contragent extends AbstractEntity{

    @Size(min = 1)
    @OneToMany(mappedBy = "contragent")
    private List<Contract> contractList;

    public Contragent(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public Contragent() {

    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
