package com.bytedance.ee.bear.mindnote.setting;

import android.view.View;

/* renamed from: com.bytedance.ee.bear.mindnote.setting.d */
class View$OnClickListenerC10185d implements View.OnClickListener {

    /* renamed from: a */
    private AbstractC10184c f27478a;

    /* renamed from: b */
    private String f27479b = "";

    /* renamed from: c */
    private String f27480c = "";

    /* renamed from: a */
    public String mo38944a() {
        return this.f27479b;
    }

    public void onClick(View view) {
        AbstractC10184c cVar = this.f27478a;
        if (cVar != null) {
            cVar.mo38939a(this.f27479b, this.f27480c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38945a(String str, String str2, AbstractC10184c cVar) {
        this.f27479b = str;
        this.f27480c = str2;
        this.f27478a = cVar;
    }

    public View$OnClickListenerC10185d(String str, String str2, AbstractC10184c cVar) {
        mo38945a(str, str2, cVar);
    }
}
