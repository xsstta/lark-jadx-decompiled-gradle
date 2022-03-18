package com.tt.miniapp;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.tt.miniapp.j */
public class C66205j {

    /* renamed from: a */
    private Activity f167109a;

    /* renamed from: b */
    private int f167110b;

    /* renamed from: c */
    private View f167111c;

    /* renamed from: d */
    private boolean f167112d;

    /* renamed from: e */
    private boolean f167113e;

    /* renamed from: f */
    private int f167114f;

    /* renamed from: g */
    private View f167115g;

    /* renamed from: a */
    public void mo231546a() {
        this.f167109a = null;
    }

    /* renamed from: b */
    public void mo231548b() {
        if (this.f167115g != null) {
            if (HostDependManager.getInst().isDesktop()) {
                HostDependManager.getInst().interceptStatusBarToImmersed(this.f167115g, this.f167111c, this.f167114f);
                return;
            }
            View view = this.f167115g;
            view.setPadding(view.getPaddingLeft(), this.f167114f + C67043j.m261285g(this.f167109a), this.f167115g.getPaddingRight(), this.f167115g.getPaddingBottom());
            this.f167111c.setVisibility(0);
        }
    }

    /* renamed from: com.tt.miniapp.j$a */
    public static class C66206a {

        /* renamed from: a */
        public int f167116a = -1;

        /* renamed from: b */
        public boolean f167117b = true;

        /* renamed from: c */
        public boolean f167118c = true;

        /* renamed from: a */
        public C66206a mo231550a(int i) {
            this.f167116a = i;
            return this;
        }

        /* renamed from: a */
        public C66206a mo231551a(boolean z) {
            this.f167117b = z;
            return this;
        }
    }

    /* renamed from: b */
    public void mo231549b(boolean z) {
        m259188a(this.f167109a.getWindow(), z);
    }

    /* renamed from: a */
    public void mo231547a(boolean z) {
        if (!HostDependManager.getInst().isDesktop()) {
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = this.f167109a.getWindow();
                window.clearFlags(67108864);
                window.getDecorView().setSystemUiVisibility(1280);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
            } else if (Build.VERSION.SDK_INT >= 19) {
                this.f167109a.getWindow().addFlags(67108864);
            }
            this.f167111c = m259187a(this.f167109a, this.f167110b);
            if (!z) {
                ((ViewGroup) this.f167109a.getWindow().getDecorView()).addView(this.f167111c);
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.f167109a.findViewById(16908290)).getChildAt(0);
                this.f167115g = viewGroup;
                this.f167114f = viewGroup.getPaddingTop();
                mo231548b();
            }
        }
    }

    public C66205j(Activity activity, C66206a aVar) {
        this.f167109a = activity;
        this.f167110b = aVar.f167116a;
        this.f167112d = aVar.f167117b;
        this.f167113e = aVar.f167118c;
    }

    /* renamed from: a */
    private static View m259187a(Activity activity, int i) {
        int g = C67043j.m261285g(activity);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, g));
        view.setBackgroundColor(i);
        return view;
    }

    /* renamed from: a */
    public static void m259188a(Window window, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            View decorView = window.getDecorView();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i);
            if (C67043j.m261284f()) {
                C67043j.m261274a(z, window);
            }
        }
    }
}
