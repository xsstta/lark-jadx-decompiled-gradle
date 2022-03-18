package com.bytedance.platform.godzilla.common;

import com.bytedance.platform.godzilla.p872b.C20309a;
import com.bytedance.platform.godzilla.p872b.C20313e;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.common.d */
public final class C20324d {
    /* renamed from: a */
    public static Field m74109a(Class<?> cls, String str) {
        if (!C20313e.m74082a()) {
            return C20309a.m74066a(cls, str);
        }
        try {
            return C20325e.m74110a(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
