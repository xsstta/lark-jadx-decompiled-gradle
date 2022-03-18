package com.tt.miniapp.component.nativeview.picker.p3274a.p3275a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.component.nativeview.picker.a.a.a */
public abstract class AbstractDialogInterface$OnDismissListenerC65912a<V extends View> implements DialogInterface.OnDismissListener, DialogInterface.OnKeyListener {

    /* renamed from: a */
    public Activity f166322a;

    /* renamed from: b */
    protected int f166323b;

    /* renamed from: c */
    protected int f166324c;

    /* renamed from: d */
    private int f166325d;

    /* renamed from: e */
    private Dialog f166326e;

    /* renamed from: f */
    private FrameLayout f166327f;

    /* renamed from: g */
    private boolean f166328g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo230787a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo230790a(V v) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo230791b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo230794d() {
    }

    /* renamed from: e */
    public void mo230795e() {
        mo230796f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo230796f() {
        this.f166326e.dismiss();
    }

    /* renamed from: g */
    public boolean mo230797g() {
        mo230795e();
        return false;
    }

    /* renamed from: h */
    public Context mo230798h() {
        return this.f166326e.getContext();
    }

    /* renamed from: c */
    public final void mo230793c() {
        if (!this.f166328g || this.f166322a.isFinishing()) {
            mo230791b();
            V a = mo230787a();
            mo230792b(a);
            mo230790a(a);
            this.f166328g = true;
            this.f166326e.show();
            mo230794d();
            return;
        }
        this.f166326e.show();
        mo230794d();
    }

    /* renamed from: i */
    private void mo230803i() {
        FrameLayout frameLayout = new FrameLayout(this.f166322a);
        this.f166327f = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f166327f.setFocusable(true);
        this.f166327f.setFocusableInTouchMode(true);
        Dialog dialog = new Dialog(this.f166322a, R.style.microapp_i_pickerdialog);
        this.f166326e = dialog;
        dialog.setCanceledOnTouchOutside(true);
        this.f166326e.setCancelable(true);
        this.f166326e.setOnKeyListener(this);
        this.f166326e.setOnDismissListener(this);
        Window window = this.f166326e.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
            window.setContentView(this.f166327f);
        }
        mo230788a(this.f166323b, this.f166325d);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        mo230795e();
    }

    /* renamed from: a */
    public void mo230789a(final DialogInterface.OnDismissListener onDismissListener) {
        this.f166326e.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractDialogInterface$OnDismissListenerC65912a.DialogInterface$OnDismissListenerC659131 */

            public void onDismiss(DialogInterface dialogInterface) {
                AbstractDialogInterface$OnDismissListenerC65912a.this.onDismiss(dialogInterface);
                onDismissListener.onDismiss(dialogInterface);
            }
        });
    }

    /* renamed from: b */
    public void mo230792b(View view) {
        this.f166327f.removeAllViews();
        this.f166327f.addView(view);
    }

    public AbstractDialogInterface$OnDismissListenerC65912a(Activity activity) {
        this.f166322a = activity;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        this.f166323b = displayMetrics.widthPixels;
        this.f166324c = displayMetrics.heightPixels;
        this.f166325d = (int) C67590h.m263065a(activity, 280.0f);
        mo230803i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r3 == 0) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo230788a(int r2, int r3) {
        /*
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L_0x0005
            int r2 = r1.f166323b
        L_0x0005:
            r0 = -2
            if (r2 != 0) goto L_0x000e
            if (r3 != 0) goto L_0x000e
            int r2 = r1.f166323b
        L_0x000c:
            r3 = -2
            goto L_0x0016
        L_0x000e:
            if (r2 != 0) goto L_0x0013
            int r2 = r1.f166323b
            goto L_0x0016
        L_0x0013:
            if (r3 != 0) goto L_0x0016
            goto L_0x000c
        L_0x0016:
            android.widget.FrameLayout r0 = r1.f166327f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0024
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r3)
            goto L_0x0028
        L_0x0024:
            r0.width = r2
            r0.height = r3
        L_0x0028:
            android.widget.FrameLayout r2 = r1.f166327f
            r2.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractDialogInterface$OnDismissListenerC65912a.mo230788a(int, int):void");
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        mo230797g();
        return false;
    }
}
