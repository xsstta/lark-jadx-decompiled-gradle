package com.ss.android.lark.contact.impl.selector.little_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.mvp.C26033a;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.selector.bean.C35968a;
import com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a;
import com.ss.android.lark.contact.impl.selector.little_app.C35981b;
import com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.selector.little_app.c */
public class C35985c extends C26033a<AbstractC35977a.AbstractC35978a, AbstractC35977a.AbstractC35979b> {

    /* renamed from: a */
    public boolean f93024a;

    /* renamed from: b */
    LittleAppSelectMemberView.AbstractC35976a f93025b;

    /* renamed from: c */
    Activity f93026c;

    /* renamed from: d */
    AbstractC35977a.AbstractC35978a f93027d;

    /* renamed from: e */
    AbstractC35977a.AbstractC35979b f93028e;

    /* renamed from: f */
    private boolean f93029f;

    /* renamed from: g */
    private boolean f93030g;

    /* renamed from: h */
    private C35981b.AbstractC35984a f93031h = new C35981b.AbstractC35984a() {
        /* class com.ss.android.lark.contact.impl.selector.little_app.C35985c.C359861 */

        @Override // com.ss.android.lark.contact.impl.selector.little_app.C35981b.AbstractC35984a
        /* renamed from: a */
        public void mo132370a() {
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.C35981b.AbstractC35984a
        /* renamed from: b */
        public void mo132372b() {
            C35985c.this.f93028e.mo132336a(C35985c.this.f93027d.mo132350c());
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.C35981b.AbstractC35984a
        /* renamed from: a */
        public void mo132371a(List<SearchBaseInfo> list) {
            C35985c.this.f93028e.mo132335a(list);
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.C35981b.AbstractC35984a
        /* renamed from: b */
        public void mo132373b(List<SearchBaseInfo> list) {
            C35985c.this.f93028e.mo132339b(list);
        }
    };

    /* renamed from: e */
    public LittleAppSelectMemberView.AbstractC35976a mo132378e() {
        return this.f93025b;
    }

    /* renamed from: c */
    public AbstractC35977a.AbstractC35979b mo132376c() {
        return (AbstractC35977a.AbstractC35979b) mo92551a();
    }

    /* renamed from: d */
    public AbstractC35977a.AbstractC35978a mo132377d() {
        return (AbstractC35977a.AbstractC35978a) mo92554b();
    }

    /* renamed from: f */
    public void mo132379f() {
        this.f93028e.mo132340c();
    }

    /* renamed from: a */
    public void mo132374a(Intent intent) {
        this.f93027d.mo132347a(C35968a.m140985a((ArrayList) intent.getSerializableExtra(C35358a.f91400a), ((AbstractC35977a.AbstractC35978a) mo92554b()).mo132350c()));
    }

    /* renamed from: a */
    public void mo132375a(Bundle bundle) {
        Department a;
        bundle.putSerializable("selectedIds", (HashMap) this.f93027d.mo132350c());
        bundle.putSerializable("preSelectableChatters", (ArrayList) this.f93027d.mo132352e());
        if (this.f93028e.mo132338b() == 2 && (a = ((AbstractC35977a.AbstractC35979b) mo92551a()).mo132332a()) != null) {
            bundle.putString("department_id", a.getId());
        }
    }

    /* renamed from: a */
    private void m141089a(Intent intent, Bundle bundle) {
        this.f93024a = intent.getBooleanExtra("multi", true);
        this.f93029f = intent.getBooleanExtra("externalContact", true);
        boolean booleanExtra = intent.getBooleanExtra("enableChooseDepartment", false);
        this.f93030g = booleanExtra;
        this.f93028e = new LittleAppSelectMemberView(this.f93026c, this.f93025b, this.f93024a, this.f93029f, booleanExtra);
        C35981b bVar = new C35981b(intent, bundle, this.f93031h);
        this.f93027d = bVar;
        mo92553a(this.f93028e, bVar);
        C35987d dVar = new C35987d(this, this.f93024a);
        C35987d dVar2 = dVar;
        dVar2.mo132380a(intent.getIntExtra("maxNum", 100));
        dVar2.mo132381a(intent.getStringExtra("limitTips"));
        this.f93028e.setViewDelegate(dVar);
    }

    public C35985c(Activity activity, Intent intent, Bundle bundle, LittleAppSelectMemberView.AbstractC35976a aVar) {
        this.f93025b = aVar;
        this.f93026c = activity;
        m141089a(intent, bundle);
    }
}
