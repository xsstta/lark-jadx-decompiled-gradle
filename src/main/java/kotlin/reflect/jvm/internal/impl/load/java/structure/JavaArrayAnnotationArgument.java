package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;

public interface JavaArrayAnnotationArgument extends JavaAnnotationArgument {
    List<JavaAnnotationArgument> getElements();
}
