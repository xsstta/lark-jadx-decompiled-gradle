package com.larksuite.component.ui.p1153e;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.graphics.C0768a;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.larksuite.component.ui.e.a */
public class C25652a {

    /* renamed from: a */
    Context f62626a;

    /* renamed from: b */
    Window f62627b;

    /* renamed from: c */
    int f62628c;

    /* renamed from: d */
    boolean f62629d = true;

    /* renamed from: a */
    public void mo89312a() {
        int i = Build.VERSION.SDK_INT;
        int i2 = DynamicModule.f58006b;
        if (i >= 21) {
            m91887a(this.f62627b);
            i2 = m91888b(m91885a(this.f62627b, DynamicModule.f58006b));
        }
        this.f62627b.getDecorView().setSystemUiVisibility(m91889c(i2));
    }

    /* renamed from: a */
    public C25652a mo89311a(int i) {
        this.f62628c = i;
        return this;
    }

    /* renamed from: a */
    public static C25652a m91886a(Dialog dialog) {
        return new C25652a(dialog.getContext(), dialog.getWindow());
    }

    /* renamed from: b */
    private int m91888b(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i | 8192;
        }
        return i;
    }

    /* renamed from: c */
    private int m91889c(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            i |= 0;
        }
        return i | 4096;
    }

    /* renamed from: a */
    private void m91887a(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    public C25652a(Context context, Window window) {
        this.f62626a = context;
        this.f62627b = window;
    }

    /* renamed from: a */
    private int m91885a(Window window, int i) {
        int i2 = i | 1024;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(C0768a.m3715b(this.f62628c, -16777216, BitmapDescriptorFactory.HUE_RED));
        window.setNavigationBarColor(C0768a.m3715b(this.f62628c, -16777216, BitmapDescriptorFactory.HUE_RED));
        return i2;
    }
}
