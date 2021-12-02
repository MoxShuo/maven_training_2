package fr.lernejo.tester.internal;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestClassDiscoverer
{
    private final String packageName;
    public TestClassDiscoverer(final String packageName)
    {
        this.packageName = packageName;
    }


    public List<TestClassDescription> listTestClasses()
    {
        final Reflections reflections = new Reflection(packageName,new SubTypesScanner(false));
        Set<Class<?>> allTypes = reflections.getSubTypesOf(Object.class);

        final List<TestClassDescription> testClassDescriptions = new ArrayList<>();
        for(finalClass<?> clas : allTypes)
        {
            final TestClassDescription testClassDescription = new TestClassDescription(clas);
            testClassDescription.add(testClassDescription);
        }
        return testClassDescriptions;
    }

}

