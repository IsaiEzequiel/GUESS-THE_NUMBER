package springinitialzr.scaffolding.services;


import org.springframework.stereotype.Service;
import springinitialzr.scaffolding.models.Dummy;

import java.util.List;

@Service
public interface DummyService {

    Dummy getDummy(Long id);

    List<Dummy> getDummyList();

    Dummy  createDummy(Dummy dummy);

    Dummy  updateDummy(Dummy dummy);

    void  deleteDummy(Dummy dummy);
}
