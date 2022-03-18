package com.bytedance.ee.bear.widget;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.at.AbstractC4226a;
import com.bytedance.ee.bear.at.AbstractC4230c;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.at.C4233d;
import com.bytedance.ee.bear.atfinder.AbstractC4269d;
import com.bytedance.ee.bear.atfinder.AtFinderResultList;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.widget.e */
public class C11775e extends AbstractC4226a {
    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: d */
    public void mo16644d() {
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: c */
    public void mo16643c() {
        mo45055g();
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: e */
    public final void mo16645e() {
        mo16646f();
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: b */
    public boolean mo16642b() {
        if (this.f12742c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: f */
    public void mo16646f() {
        C13479a.m54772d("AtWindowImp", "close: ");
        if (this.f12740a != null) {
            this.f12740a.mo16651a(false);
        }
        this.f12741b.mo16790c();
        this.f12742c.setVisibility(4);
    }

    /* renamed from: g */
    public void mo45055g() {
        C13479a.m54772d("AtWindowImp", "show: ");
        if (this.f12740a != null) {
            this.f12740a.mo16651a(true);
        }
        this.f12741b.mo16786a(true);
        this.f12742c.setVisibility(0);
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16641a(String str) {
        C13479a.m54772d("AtWindowImp", "search: ");
        this.f12741b.mo16791c(str);
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4230c
    /* renamed from: a */
    public void mo16640a(final AbstractC4230c.AbstractC4231a aVar) {
        C13479a.m54772d("AtWindowImp", "setSelectedCallback: ");
        this.f12741b.mo16782a(new AbstractC4269d() {
            /* class com.bytedance.ee.bear.widget.C11775e.C117761 */

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
            /* renamed from: a */
            public void mo16703a() {
                C13479a.m54772d("AtWindowImp", "onClosedView: ");
                if (C11775e.this.f12740a != null) {
                    C11775e.this.f12740a.mo16651a(false);
                }
                C11775e.this.f12742c.setVisibility(8);
            }

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
            /* renamed from: a */
            public void mo16705a(String str) {
                aVar.mo16648a(str);
            }

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
            /* renamed from: b */
            public void mo16706b(String str) {
                aVar.mo16649b(str);
            }

            @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
            /* renamed from: a */
            public void mo16704a(AtFinderResultList atFinderResultList) {
                C11775e.this.f12741b.mo16790c();
                List<AtObject> result_list = atFinderResultList.getData().getResult_list();
                if (result_list.size() > 0) {
                    AtObject atObject = result_list.get(0);
                    String content = atObject.getContent();
                    aVar.mo16647a(new C4517a.C4518a().mo17391a(0).mo17395b(content.length()).mo17398c(atObject.getType()).mo17392a(atObject.getToken()).mo17396b(atObject.getUrl()).mo17399c(content).mo17402d(atObject.getName()).mo17404e(atObject.getEn_name()).mo17405f(atObject.getCn_name()).mo17403e(atObject.getIcon_type()).mo17407h(atObject.getIcon_key()).mo17406g(atObject.getIcon_fsunit()).mo17397b(atObject.isNot_notify()).mo17400c(atObject.isExternal()).mo17409j(atObject.getUnion_id()).mo17410k(atObject.getDepartment()).mo17394a(), C11775e.this.f12741b.mo16792d());
                }
            }
        });
    }

    public C11775e(FragmentActivity fragmentActivity, C4233d dVar) {
        this.f12742c = dVar.f12763l;
        mo16630a(dVar);
        this.f12741b = this.f12742c.mo45016a(fragmentActivity, mo16626a(), new C4520c(dVar.f12754c, dVar.f12753b, dVar.f12755d, dVar.f12756e, ""));
        mo16645e();
    }
}
