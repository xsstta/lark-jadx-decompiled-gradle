package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"COROUTINES_DEBUG_METADATA_VERSION", "", "checkDebugMetadataVersion", "", "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", "", "", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlin.coroutines.jvm.internal.d */
public final class C69090d {
    /* renamed from: b */
    private static final DebugMetadata m265843b(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    /* renamed from: c */
    private static final int m265844c(BaseContinuationImpl baseContinuationImpl) {
        int i;
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            Intrinsics.checkExpressionValueIsNotNull(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static final StackTraceElement m265841a(BaseContinuationImpl baseContinuationImpl) {
        int i;
        String str;
        Intrinsics.checkParameterIsNotNull(baseContinuationImpl, "$this$getStackTraceElementImpl");
        DebugMetadata b = m265843b(baseContinuationImpl);
        if (b == null) {
            return null;
        }
        m265842a(1, b.mo239179v());
        int c = m265844c(baseContinuationImpl);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo239175l()[c];
        }
        String a = ModuleNameRetriever.f173134b.mo239182a(baseContinuationImpl);
        if (a == null) {
            str = b.mo239172c();
        } else {
            str = a + '/' + b.mo239172c();
        }
        return new StackTraceElement(str, b.mo239176m(), b.mo239173f(), i);
    }

    /* renamed from: a */
    private static final void m265842a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }
}
