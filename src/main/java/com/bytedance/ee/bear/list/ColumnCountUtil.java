package com.bytedance.ee.bear.list;

import android.content.Context;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p718t.C13749l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/list/ColumnCountUtil;", "", "()V", "getColumnCount", "", "context", "Landroid/content/Context;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.b */
public final class ColumnCountUtil {

    /* renamed from: a */
    public static final ColumnCountUtil f21740a = new ColumnCountUtil();

    private ColumnCountUtil() {
    }

    /* renamed from: a */
    public final int mo31471a(Context context) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (C13749l.m55763g(context)) {
            i = C13749l.m55751b(context).widthPixels;
        } else {
            i = C13749l.m55736a();
        }
        int a = i - C13749l.m55738a(32);
        int i2 = 2;
        int a2 = (a - C13749l.m55738a(12)) / 2;
        int a3 = C13749l.m55738a(232);
        int a4 = C13749l.m55738a(138);
        if (a2 < a4 || !C13653a.m55399c(context)) {
            return 2;
        }
        while (true) {
            if (a2 >= a4 && a2 <= a3) {
                return i2;
            }
            i2++;
            a2 = a / i2;
        }
    }
}
