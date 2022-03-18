package com.bytedance.platform.godzilla.p860a;

import android.app.Application;
import android.database.CursorWindow;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p872b.C20309a;
import com.bytedance.platform.godzilla.plugin.AbstractC20329a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.a.c */
public class C20271c extends AbstractC20329a {

    /* renamed from: a */
    private static int f49556a = -1;

    /* renamed from: b */
    private static Field f49557b;

    /* renamed from: c */
    private int f49558c;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "CursorWindowPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
        int i = this.f49558c;
        if (i > 0) {
            m73980a(i);
        } else {
            m73980a(1048576);
        }
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68531a(Application application) {
        super.mo68531a(application);
    }

    /* renamed from: a */
    private boolean m73980a(int i) {
        Field a = C20309a.m74066a((Class<?>) CursorWindow.class, "sCursorWindowSize");
        f49557b = a;
        if (a == null) {
            return false;
        }
        if (i <= 0) {
            i = 1048576;
        }
        a.setAccessible(true);
        try {
            int intValue = ((Integer) C20309a.m74064a(f49557b)).intValue();
            f49556a = intValue;
            if (intValue != i) {
                C20309a.m74070b(f49557b, Integer.valueOf(i));
            }
            int intValue2 = ((Integer) C20309a.m74064a(f49557b)).intValue();
            String b = mo68532b();
            Logger.m74095a(b, "Resize cursor window size successful! Resize form :" + f49556a + "to " + intValue2);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }
}
