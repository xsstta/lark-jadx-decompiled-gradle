package com.bytedance.ee.android.file.picker.lib.widget;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.android.file.picker.lib.widget.loadingdialog.LoadingDialog;

/* renamed from: com.bytedance.ee.android.file.picker.lib.widget.b */
public class C4129b {

    /* renamed from: a */
    private final int f12518a = 100;

    /* renamed from: b */
    private final int f12519b = 35;

    /* renamed from: c */
    private final int f12520c = 2;

    /* renamed from: d */
    private final float f12521d = 0.5f;

    /* renamed from: e */
    private final int f12522e = 6;

    /* renamed from: f */
    private final int f12523f = 14;

    /* renamed from: g */
    private LoadingDialog f12524g;

    /* renamed from: h */
    private String f12525h;

    /* renamed from: i */
    private boolean f12526i;

    /* renamed from: j */
    private int f12527j = 100;

    /* renamed from: a */
    public void mo16187a() {
        LoadingDialog loadingDialog = this.f12524g;
        if (loadingDialog != null && loadingDialog.mo16207b()) {
            this.f12524g.mo16209c();
        }
    }

    /* renamed from: a */
    public void mo16189a(boolean z) {
        this.f12526i = z;
    }

    /* renamed from: b */
    private LoadingDialog m17193b(Context context) {
        LoadingDialog a = LoadingDialog.m17211a(context).mo16202a(LoadingDialog.Style.SPIN_INDETERMINATE);
        int i = this.f12527j;
        return a.mo16201a(i, i).mo16206b(35, 35).mo16204a(this.f12526i).mo16208c(14.0f).mo16203a(this.f12525h).mo16205b(6.0f).mo16200a(2).mo16199a(0.5f);
    }

    /* renamed from: a */
    public void mo16188a(Context context) {
        if (this.f12524g == null) {
            this.f12524g = m17193b(context);
        }
        if (!this.f12524g.mo16207b() && !((Activity) context).isFinishing()) {
            this.f12524g.mo16198a();
        }
    }
}
