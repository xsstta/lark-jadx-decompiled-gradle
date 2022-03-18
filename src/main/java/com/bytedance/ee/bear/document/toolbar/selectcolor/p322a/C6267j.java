package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.j */
public class C6267j extends AbstractC1142af {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected AbstractC6268a callback;
    private C1177w<C6269b> selectParam;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.j$a */
    public interface AbstractC6268a {
        void onColorSelected(String str);
    }

    /* access modifiers changed from: package-private */
    public C1177w<C6269b> getSelectParam() {
        if (this.selectParam == null) {
            this.selectParam = new C1177w<>();
        }
        return this.selectParam;
    }

    public void setCallback(AbstractC6268a aVar) {
        this.callback = aVar;
    }

    /* access modifiers changed from: package-private */
    public void colorSelected(String str) {
        updateSelectedColor(str);
        AbstractC6268a aVar = this.callback;
        if (aVar != null) {
            aVar.onColorSelected(str);
        }
    }

    public void updateSelectedColor(String str) {
        C1177w<C6269b> selectParam2 = getSelectParam();
        C6269b b = selectParam2.mo5927b();
        if (b != null) {
            b.f17393b = str;
            selectParam2.mo5929b(b);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.j$b */
    public static class C6269b {

        /* renamed from: a */
        public String f17392a;

        /* renamed from: b */
        public String f17393b;

        /* renamed from: c */
        public String[] f17394c;

        public C6269b(String str, String str2, String[] strArr) {
            this.f17392a = str;
            this.f17393b = str2;
            this.f17394c = strArr;
        }
    }

    public void selectColor(FragmentActivity fragmentActivity, C6269b bVar, AbstractC6268a aVar) {
        getSelectParam().mo5929b(bVar);
        this.callback = aVar;
        ((DialogInterface$OnCancelListenerC1021b) Fragment.instantiate(fragmentActivity, C6251d.class.getName())).mo5511a(fragmentActivity.getSupportFragmentManager(), "select_color");
    }

    public void selectColorCompat(Fragment fragment, C6269b bVar, AbstractC6268a aVar) {
        Bundle bundle;
        getSelectParam().mo5929b(bVar);
        this.callback = aVar;
        if (fragment.getArguments() == null) {
            bundle = new Bundle();
        } else {
            bundle = fragment.getArguments();
        }
        ((DialogInterface$OnCancelListenerC1021b) Fragment.instantiate(fragment.getActivity(), C6249b.class.getName(), bundle)).mo5511a(fragment.getActivity().getSupportFragmentManager(), "select_color");
    }
}
