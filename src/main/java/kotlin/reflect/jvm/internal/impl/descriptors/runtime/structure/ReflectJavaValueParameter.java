package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {
    private final boolean isVararg;
    private final Annotation[] reflectAnnotations;
    private final String reflectName;
    private final ReflectJavaType type;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public ReflectJavaType getType() {
        return this.type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public boolean isVararg() {
        return this.isVararg;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.getAnnotations(this.reflectAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public Name getName() {
        String str = this.reflectName;
        if (str != null) {
            return Name.guessByFirstCharacter(str);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        if (isVararg()) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.findAnnotation(this.reflectAnnotations, fqName);
    }

    public ReflectJavaValueParameter(ReflectJavaType reflectJavaType, Annotation[] annotationArr, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(reflectJavaType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(annotationArr, "reflectAnnotations");
        this.type = reflectJavaType;
        this.reflectAnnotations = annotationArr;
        this.reflectName = str;
        this.isVararg = z;
    }
}
