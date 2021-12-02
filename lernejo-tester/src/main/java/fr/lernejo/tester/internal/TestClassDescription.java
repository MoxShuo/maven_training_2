package fr.lernejo.tester.internal;
import fr.lernejo.tester.api.TestMethod;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class TestClassDescription
{
    private final Class<?> clas;

    public TestClassDescription(final Class<?> clas)
    {
        this.clas = clas;
    }

    public List<Method> listTestMethods()
    {
        final List<Method> methodes = new ArrayList<>();
        for (final Method method : clas.getDeclaredMethods())
        {
            // Ignore si methode pas publique
            if(!Modifier.isPublic(method.getModifiers()))
            {
                continue;
            }
            // Ignore si la méthode renvoit quelque chose
            if(!method.getReturnType().equals(void.class))
            {
                continue;
            }
            // Ignore si methode pas annoté
            if(!method.isAnnotationPresent(TestMethod.class))
            {
                continue;
            }
            // On ignore si méthode comporte des params
            if(method.getParameterCount() > 0)
            {
                continue;
            }
            methodes.add(method);
        }
        return methodes;
    }
}
