package kotlin.reflect.jvm.internal.calls;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"equals", "", "T", "", "other", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class AnnotationConstructorCallerKt$createAnnotationInstance$2 extends Lambda implements Function1<Object, Boolean> {
    final /* synthetic */ Class $annotationClass;
    final /* synthetic */ List $methods;
    final /* synthetic */ Map $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnnotationConstructorCallerKt$createAnnotationInstance$2(Class cls, List list, Map map) {
        super(1);
        this.$annotationClass = cls;
        this.$methods = list;
        this.$values = map;
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        Object obj2;
        boolean z;
        boolean z2;
        KClass a;
        Class cls = null;
        if (!(obj instanceof Annotation)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        Annotation annotation = (Annotation) obj2;
        if (!(annotation == null || (a = C69113a.m265956a(annotation)) == null)) {
            cls = C69113a.m265954a(a);
        }
        if (Intrinsics.areEqual(cls, this.$annotationClass)) {
            List list = this.$methods;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Method method = (Method) it.next();
                    Object obj3 = this.$values.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj3 instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(zArr, (boolean[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.BooleanArray");
                        }
                    } else if (obj3 instanceof char[]) {
                        char[] cArr = (char[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(cArr, (char[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharArray");
                        }
                    } else if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(bArr, (byte[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(sArr, (short[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.ShortArray");
                        }
                    } else if (obj3 instanceof int[]) {
                        int[] iArr = (int[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(iArr, (int[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
                        }
                    } else if (obj3 instanceof float[]) {
                        float[] fArr = (float[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(fArr, (float[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                    } else if (obj3 instanceof long[]) {
                        long[] jArr = (long[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(jArr, (long[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.LongArray");
                        }
                    } else if (obj3 instanceof double[]) {
                        double[] dArr = (double[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(dArr, (double[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.DoubleArray");
                        }
                    } else if (obj3 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj3;
                        if (invoke != null) {
                            z2 = Arrays.equals(objArr, (Object[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                        }
                    } else {
                        z2 = Intrinsics.areEqual(obj3, invoke);
                        continue;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }
}
