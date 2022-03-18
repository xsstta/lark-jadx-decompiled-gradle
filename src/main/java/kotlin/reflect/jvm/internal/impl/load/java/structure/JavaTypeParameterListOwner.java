package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;

public interface JavaTypeParameterListOwner extends JavaElement {
    List<JavaTypeParameter> getTypeParameters();
}
