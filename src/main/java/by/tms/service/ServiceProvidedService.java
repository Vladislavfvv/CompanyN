package by.tms.service;

import by.tms.dao.ServiceProvidedDao;
import org.springframework.stereotype.Service;

@Service
public class ServiceProvidedService {

    private final ServiceProvidedDao serviceProvided;

    public ServiceProvidedService(ServiceProvidedDao serviceProvided) {
        this.serviceProvided = serviceProvided;
    }


}
