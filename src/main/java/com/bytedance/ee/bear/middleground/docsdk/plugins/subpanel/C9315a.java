package com.bytedance.ee.bear.middleground.docsdk.plugins.subpanel;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.toolbar.AbstractC6204a;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6267j;
import com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.C9318a;
import com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.DocSDKItemId;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.RoundColorView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.plugins.subpanel.a */
public class C9315a extends AbstractC6204a {

    /* renamed from: c */
    static final /* synthetic */ boolean f25048c = true;

    /* renamed from: d */
    private C9318a f25049d;

    /* renamed from: e */
    private C6267j f25050e;

    /* renamed from: f */
    private RoundColorView f25051f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: f */
    public int mo22132f() {
        return R.layout.doc_toolbar_attribution_fragment;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: g */
    public ItemId mo22133g() {
        return DocSDKItemId.attribution;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: h */
    public AbstractC6212e mo22134h() {
        return this.f25049d;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6204a, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: i */
    public View mo22135i() {
        View i = super.mo22135i();
        this.f25051f = (RoundColorView) i.findViewById(R.id.highLightColor);
        i.findViewById(R.id.selectColor).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.docsdk.plugins.subpanel.C9315a.C93161 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C9315a.this.mo35544j();
            }
        });
        return i;
    }

    /* renamed from: j */
    public void mo35544j() {
        String str;
        Item a = mo25095a(DocSDKTxtAttrId.highlight);
        if (a == null) {
            C13479a.m54758a("DocSDKTxtAttrSubPanelFragment", "selectColor while color item invalid ");
            return;
        }
        this.f25049d.processToolbarItemClick(DocSDKTxtAttrId.highlight, a.getValue());
        C6267j jVar = this.f25050e;
        FragmentActivity activity = getActivity();
        String string = getString(R.string.Doc_Doc_ToolbarHighLight);
        if (TextUtils.equals(a.getValue(), "#clear")) {
            str = "#ffffff";
        } else {
            str = a.getValue();
        }
        jVar.selectColor(activity, new C6267j.C6269b(string, str, a.getList()), new C6267j.AbstractC6268a() {
            /* class com.bytedance.ee.bear.middleground.docsdk.plugins.subpanel.$$Lambda$a$78eGMHCLKK2mPo1Kmw5LpMAXGgo */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6267j.AbstractC6268a
            public final void onColorSelected(String str) {
                C9315a.lambda$78eGMHCLKK2mPo1Kmw5LpMAXGgo(C9315a.this, str);
            }
        });
    }

    /* renamed from: a */
    private void m38496a(String str) {
        if (getContext() != null) {
            boolean equals = TextUtils.equals(str, "#clear");
            if (equals) {
                str = "#ffffff";
            }
            this.f25051f.setClear(equals);
            this.f25051f.setColor(str);
            this.f25050e.updateSelectedColor(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m38497b(String str) {
        if (TextUtils.equals("#ffffff", str)) {
            str = "#clear";
        }
        m38496a(str);
        this.f25049d.processToolbarItemClick(DocSDKTxtAttrId.highlight, str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f25048c || activity != null) {
            this.f25049d = (C9318a) aj.m5366a(activity).mo6005a(C9318a.class);
            this.f25050e = (C6267j) aj.m5366a(activity).mo6005a(C6267j.class);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: a */
    public void mo22131a(Item[] itemArr, View view) {
        super.mo22131a(itemArr, view);
        Item a = mo25095a(DocSDKTxtAttrId.highlight);
        if (a != null) {
            m38496a(a.getValue());
        }
    }
}
