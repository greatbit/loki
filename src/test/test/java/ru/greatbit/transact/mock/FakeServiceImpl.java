package ru.greatbit.transact.mock;

import org.springframework.stereotype.Service;

/**
 * Created by azee on 13.08.14.
 */
@Service
public class FakeServiceImpl implements FakeService{
    @Override
    public void doSmt2(FakeObject valueToUpdate, FakeObject id) {

    }

    @Override
    public void doSmt1(FakeObject valueToUpdate, String id) {

    }

    @Override
    public void doSmt(String valueToUpdate, String id) {

    }
}