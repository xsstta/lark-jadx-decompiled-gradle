package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

public final class AbstractBinaryClassAnnotationAndConstantLoader$loadClassAnnotations$1 implements KotlinJvmBinaryClass.AnnotationVisitor {
    final /* synthetic */ ArrayList $result;
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader this$0;

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }

    AbstractBinaryClassAnnotationAndConstantLoader$loadClassAnnotations$1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ArrayList arrayList) {
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
        this.$result = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
        Intrinsics.checkParameterIsNotNull(classId, "classId");
        Intrinsics.checkParameterIsNotNull(sourceElement, ShareHitPoint.f121868c);
        return this.this$0.loadAnnotationIfNotSpecial(classId, sourceElement, this.$result);
    }
}
