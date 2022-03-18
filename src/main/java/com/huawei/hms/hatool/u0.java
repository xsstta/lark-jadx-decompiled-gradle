package com.huawei.hms.hatool;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public class u0 {

    /* renamed from: c */
    public static u0 f58330c = new u0();

    /* renamed from: a */
    public boolean f58331a = false;

    /* renamed from: b */
    public Context f58332b = AbstractC23596b.m85619f();

    /* renamed from: b */
    public static u0 m85929b() {
        return f58330c;
    }

    /* renamed from: a */
    public boolean mo83164a() {
        boolean z;
        if (!this.f58331a) {
            Context context = this.f58332b;
            if (context == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null) {
                    z = userManager.isUserUnlocked();
                } else {
                    this.f58331a = false;
                }
            } else {
                z = true;
            }
            this.f58331a = z;
        }
        return this.f58331a;
    }
}
