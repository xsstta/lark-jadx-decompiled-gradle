package kotlin.reflect.jvm.internal.impl.load.java.structure;

public interface JavaMember extends JavaAnnotationOwner, JavaModifierListOwner, JavaNamedElement {
    JavaClass getContainingClass();
}
