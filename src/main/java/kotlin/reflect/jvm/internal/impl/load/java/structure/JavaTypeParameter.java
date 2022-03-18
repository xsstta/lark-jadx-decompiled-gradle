package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;

public interface JavaTypeParameter extends JavaClassifier {
    Collection<JavaClassifierType> getUpperBounds();
}
