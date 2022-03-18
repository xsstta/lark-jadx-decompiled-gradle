package com.ss.android.lark.chatwindow.view.firsttip;

/* renamed from: com.ss.android.lark.chatwindow.view.firsttip.e */
public class C35293e extends C35275a {

    /* renamed from: a */
    private TipPopupWindow f91166a;

    /* renamed from: d */
    public void mo129851d() {
        mo129828b();
    }

    /* renamed from: c */
    public void mo129850c() {
        mo129849a(null);
    }

    /* renamed from: a */
    public void mo129849a(TipPopupWindow tipPopupWindow) {
        TipPopupWindow tipPopupWindow2 = this.f91166a;
        if (tipPopupWindow2 != null) {
            tipPopupWindow2.dismiss();
            this.f91166a = null;
        }
        this.f91166a = tipPopupWindow;
    }
}
