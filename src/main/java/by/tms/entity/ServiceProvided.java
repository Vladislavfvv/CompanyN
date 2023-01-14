package by.tms.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "services")
public class ServiceProvided extends AbstractEntity{
    private String serviceName;

    @ManyToMany
    List<Client> clientList;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;


    public ServiceProvided() {
    }

    public ServiceProvided(String serviceName, List<Client> clientList, Contract contract) {
        this.serviceName = serviceName;
        this.clientList = clientList;
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
