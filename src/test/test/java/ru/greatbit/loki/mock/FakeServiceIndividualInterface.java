package ru.greatbit.loki.mock;

/**
 * Created by azee on 03.09.14.
 */
public interface FakeServiceIndividualInterface{
    public void doSmtParent(FakeObject valueToUpdate, FakeObject id);
    public void doSmt(String valueToUpdate, String id);
    public void doSmt1(FakeObject valueToUpdate, String id);
}
