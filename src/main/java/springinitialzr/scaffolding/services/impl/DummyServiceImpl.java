package springinitialzr.scaffolding.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springinitialzr.scaffolding.models.Dummy;
import springinitialzr.scaffolding.repositories.DummyRepository;
import springinitialzr.scaffolding.services.DummyService;

import java.util.List;

@Service
public class DummyServiceImpl implements DummyService {

    @Autowired
    private DummyRepository dummyRepository;

    @Override
    public Dummy getDummy(Long id) {
        return null;
    }

    @Override
    public List<Dummy> getDummyList() {
        return List.of();
    }

    @Override
    public Dummy createDummy(Dummy dummy) {
        return null;
    }

    @Override
    public Dummy updateDummy(Dummy dummy) {
        return null;
    }

    @Override
    public void deleteDummy(Dummy dummy) {

    }
}
