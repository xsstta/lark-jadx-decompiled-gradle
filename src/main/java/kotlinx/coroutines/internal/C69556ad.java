package kotlinx.coroutines.internal;

import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"AVAILABLE_PROCESSORS", "", "getAVAILABLE_PROCESSORS", "()I", "systemProp", "", "propertyName", "kotlinx-coroutines-core"}, mo238835k = 5, mv = {1, 1, 16}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: kotlinx.coroutines.internal.ad */
public final /* synthetic */ class C69556ad {

    /* renamed from: a */
    private static final int f173808a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m266971a() {
        return f173808a;
    }

    /* renamed from: a */
    public static final String m266972a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
