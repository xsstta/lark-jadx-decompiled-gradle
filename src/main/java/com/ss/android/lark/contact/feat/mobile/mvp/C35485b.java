package com.ss.android.lark.contact.feat.mobile.mvp;

import android.content.Context;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.feat.mobile.mvp.C35489e;
import com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView;
import com.ss.android.lark.ui.CommonTitleBar;

/* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.b */
public class C35485b extends ContactMobileChooseBaseView {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView
    /* renamed from: a */
    public TextView mo130897a(CommonTitleBar commonTitleBar, C35489e.AbstractC35491b.AbstractC35492a aVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView
    /* renamed from: c */
    public int mo130906c() {
        return R.dimen.item_left_margin;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView
    /* renamed from: d */
    public ContactMobileApi.C35402a mo130907d() {
        return ContactMobileApi.C35402a.m138368a();
    }

    public C35485b(Context context, ContactMobileChooseBaseView.AbstractC35482a aVar, ContactMobileApi.AbstractC35403b bVar, String str) {
        super(context, aVar, bVar, str);
    }
}
