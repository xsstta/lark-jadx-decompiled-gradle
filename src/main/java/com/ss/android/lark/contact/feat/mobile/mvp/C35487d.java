package com.ss.android.lark.contact.feat.mobile.mvp;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.feat.mobile.mvp.C35489e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.d */
public class C35487d extends BasePresenter<C35489e.AbstractC35490a, C35489e.AbstractC35491b, C35489e.AbstractC35491b.AbstractC35492a> {

    /* renamed from: a */
    public ContactMobileApi.AbstractC35403b f91766a;

    /* renamed from: b */
    public String f91767b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C35489e.AbstractC35491b.AbstractC35492a createViewDelegate() {
        return new C35489e.AbstractC35491b.AbstractC35492a() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.C35487d.C354881 */

            @Override // com.ss.android.lark.contact.feat.mobile.mvp.C35489e.AbstractC35491b.AbstractC35492a
            /* renamed from: a */
            public void mo130925a() {
                ((C35489e.AbstractC35490a) C35487d.this.getModel()).mo130923c();
                ((C35489e.AbstractC35491b) C35487d.this.getView()).mo130903a(((C35489e.AbstractC35490a) C35487d.this.getModel()).mo130922b());
                ((C35489e.AbstractC35491b) C35487d.this.getView()).mo130902a(((C35489e.AbstractC35490a) C35487d.this.getModel()).mo130921a());
            }

            @Override // com.ss.android.lark.contact.feat.mobile.mvp.C35489e.AbstractC35491b.AbstractC35492a
            /* renamed from: a */
            public void mo130927a(List<ContactMobileBean> list) {
                if (C35487d.this.f91766a != null) {
                    C35487d.this.f91766a.mo130582b(list);
                }
            }

            @Override // com.ss.android.lark.contact.feat.mobile.mvp.C35489e.AbstractC35491b.AbstractC35492a
            /* renamed from: a */
            public void mo130926a(ContactMobileBean contactMobileBean) {
                if (C35487d.this.f91766a != null) {
                    C35487d.this.f91766a.mo130582b(Collections.singletonList(contactMobileBean));
                }
                C35358a.m138143a().mo130161f(contactMobileBean.getPhone());
            }
        };
    }

    public C35487d(C35489e.AbstractC35490a aVar, C35489e.AbstractC35491b bVar, ContactMobileApi.AbstractC35403b bVar2) {
        super(aVar, bVar);
        this.f91766a = bVar2;
    }
}
