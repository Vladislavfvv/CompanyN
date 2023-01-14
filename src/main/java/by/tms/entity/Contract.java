package by.tms.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "contracts")
public class Contract extends AbstractEntity {

    @Size(min = 1)
    @OneToMany(mappedBy = "contract")
    private List<ServiceProvided> serviceProvidedList;

    @Enumerated(EnumType.STRING)
    private Payment payment;

    private LocalDateTime dateOfCreatedContract;
    private LocalDateTime dateOfFinishedContract;

    @ManyToOne
    @JoinColumn(name = "contragent_id")
    private Contragent contragent;

    public Contract() {
    }



    public Contract(List<ServiceProvided> serviceProvidedList, Payment payment, LocalDateTime dateOfCreatedContract, LocalDateTime dateOfFinishedContract, Contragent contragent) {
        this.serviceProvidedList = serviceProvidedList;
        this.payment = payment;
        this.dateOfCreatedContract = dateOfCreatedContract;
        this.dateOfFinishedContract = dateOfFinishedContract;
        this.contragent = contragent;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }


    @PrePersist
    private void init(){
        dateOfCreatedContract = LocalDateTime.now();
    }



    public List<ServiceProvided> getServiceRenderedList() {
        return serviceProvidedList;
    }

    public void setServiceRenderedList(List<ServiceProvided> serviceProvidedList) {
        this.serviceProvidedList = serviceProvidedList;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public LocalDateTime getDateOfCreatedContract() {
        return dateOfCreatedContract;
    }

    public void setDateOfCreatedContract(LocalDateTime dateOfCreatedContract) {
        this.dateOfCreatedContract = dateOfCreatedContract;
    }

    public LocalDateTime getDateOfFinishedContract() {
        return dateOfFinishedContract;
    }

    public void setDateOfFinishedContract(LocalDateTime dateOfFinishedContract) {
        this.dateOfFinishedContract = dateOfFinishedContract;
    }
}
