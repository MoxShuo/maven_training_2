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
<<<<<<< HEAD

        if(methodes.stream().noneMatch(method -> method.getName().equals("ok")))
        {
            throw new AssertionError("Doit avoir une méthode test ok()");
        }
        if(methodes.stream().noneMatch(method -> method.getName().equals("ko")))
        {
            throw new AssertionError("Doit avoir une méthode test ko()");
        }
        if (methodes.size() != 2)
        {
            throw new AssertionError("Doit avoir 2 classes méthodes");
        }
=======
>>>>>>> 08ee9afc1bc598a02008938701c7a43eeccd62e2
    }
}
