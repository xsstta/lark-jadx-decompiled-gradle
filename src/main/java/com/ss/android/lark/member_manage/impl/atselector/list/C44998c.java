package com.ss.android.lark.member_manage.impl.atselector.list;

import android.preference.PreferenceManager;
import android.widget.AutoCompleteTextView;
import com.ss.android.lark.member_manage.impl.atselector.C44962a;
import com.ss.android.lark.member_manage.impl.atselector.bean.AtSelectInitData;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.list.c */
public class C44998c {

    /* renamed from: a */
    private static C44998c f113926a;

    /* renamed from: b */
    private C44962a f113927b;

    /* renamed from: c */
    private C44988b f113928c;

    /* renamed from: b */
    public static void m178447b() {
        C44998c cVar = f113926a;
        if (cVar != null) {
            C44988b bVar = cVar.f113928c;
            if (bVar != null) {
                bVar.mo159223b();
                f113926a.f113928c = null;
            }
            C44962a aVar = f113926a.f113927b;
            if (aVar != null) {
                aVar.destroy();
                f113926a.f113927b = null;
            }
        }
    }

    /* renamed from: a */
    public void mo159234a() {
        if (f113926a != null) {
            m178447b();
            f113926a = null;
        }
        f113926a = this;
        C44962a aVar = this.f113927b;
        if (aVar != null) {
            aVar.create();
        }
    }

    public C44998c(int i, String str, boolean z, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener) {
        AtSelectInitData atSelectInitData = new AtSelectInitData(str);
        atSelectInitData.setIsInterruptAtAll(Boolean.valueOf(z));
        C44988b bVar = new C44988b(i, autoCompleteTextView, onActivityResultListener);
        this.f113928c = bVar;
        this.f113927b = new C44962a(atSelectInitData, bVar);
    }
}
