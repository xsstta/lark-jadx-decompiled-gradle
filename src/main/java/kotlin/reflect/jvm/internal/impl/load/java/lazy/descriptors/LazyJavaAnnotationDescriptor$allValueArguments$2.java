package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* access modifiers changed from: package-private */
public final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends Lambda implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.this$0 = lazyJavaAnnotationDescriptor;
    }

    /* Return type fixed from 'java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final Map<Name, ? extends ConstantValue<?>> invoke() {
        Pair pair;
        ArrayList arrayList = new ArrayList();
        for (T t : this.this$0.javaAnnotation.getArguments()) {
            Name name = t.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            ConstantValue<?> resolveAnnotationArgument = this.this$0.resolveAnnotationArgument(t);
            if (resolveAnnotationArgument != null) {
                pair = TuplesKt.to(name, resolveAnnotationArgument);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
