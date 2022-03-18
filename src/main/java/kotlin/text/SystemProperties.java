package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.text.y */
final class SystemProperties {

    /* renamed from: a */
    public static final String f173373a;

    /* renamed from: b */
    public static final SystemProperties f173374b = new SystemProperties();

    private SystemProperties() {
    }

    static {
        String property = System.getProperty("line.separator");
        if (property == null) {
            Intrinsics.throwNpe();
        }
        f173373a = property;
    }
}
