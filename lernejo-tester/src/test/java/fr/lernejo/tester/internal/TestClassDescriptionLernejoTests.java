package fr.lernejo.tester.internal;

import fr.lernejo.tester.SomeLernejoTests;
import fr.lernejo.tester.api.TestMethod;
import java.util.List;
import java.lang.reflect.Method;

public class TestClassDescriptionLernejoTests
{
    @TestMethod
    public void test()
    {
        final TestClassDescription testClassDescription = new TestClassDescription(SomeLernejoTests.class);
        final List<Method> methodes = testClassDescription.listTestMethods();
    }
}
