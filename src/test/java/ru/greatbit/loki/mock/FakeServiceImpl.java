package ru.greatbit.loki.mock;

import org.springframework.stereotype.Component;

/**
 * Created by azee on 13.08.14.
 */
@Component
public class FakeServiceImpl implements FakeService{
    @Override
    public void doSmtParent(FakeObject valueToUpdate, FakeObject id) {

    }

    @Override
    public void doSmt1(FakeObject valueToUpdate, String id) {

    }

    @Override
    public void doSmt(String valueToUpdate, String id) {

    }
}