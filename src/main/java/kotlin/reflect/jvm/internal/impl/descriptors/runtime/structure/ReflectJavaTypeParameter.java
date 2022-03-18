package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

public final class ReflectJavaTypeParameter extends ReflectJavaElement implements ReflectJavaAnnotationOwner, JavaTypeParameter {
    private final TypeVariable<?> typeVariable;

    public int hashCode() {
        return this.typeVariable.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return ReflectJavaAnnotationOwner.DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwner.DefaultImpls.getAnnotations(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public AnnotatedElement getElement() {
        TypeVariable<?> typeVariable2 = this.typeVariable;
        if (!(typeVariable2 instanceof AnnotatedElement)) {
            typeVariable2 = null;
        }
        return (AnnotatedElement) typeVariable2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        Name identifier = Name.identifier(this.typeVariable.getName());
        Intrinsics.checkExpressionValueIsNotNull(identifier, "Name.identifier(typeVariable.name)");
        return identifier;
    }

    public String toString() {
        return getClass().getName() + ": " + this.typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    public List<ReflectJavaClassifierType> getUpperBounds() {
        Type type;
        Type[] bounds = this.typeVariable.getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new ReflectJavaClassifierType(type2));
        }
        ArrayList arrayList2 = arrayList;
        ReflectJavaClassifierType reflectJavaClassifierType = (ReflectJavaClassifierType) CollectionsKt.singleOrNull((List) arrayList2);
        if (reflectJavaClassifierType != null) {
            type = reflectJavaClassifierType.getReflectType();
        } else {
            type = null;
        }
        if (Intrinsics.areEqual(type, Object.class)) {
            return CollectionsKt.emptyList();
        }
        return arrayList2;
    }

    public ReflectJavaTypeParameter(TypeVariable<?> typeVariable2) {
        Intrinsics.checkParameterIsNotNull(typeVariable2, "typeVariable");
        this.typeVariable = typeVariable2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return ReflectJavaAnnotationOwner.DefaultImpls.findAnnotation(this, fqName);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReflectJavaTypeParameter) || !Intrinsics.areEqual(this.typeVariable, ((ReflectJavaTypeParameter) obj).typeVariable)) {
            return false;
        }
        return true;
    }
}
