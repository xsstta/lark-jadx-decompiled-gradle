package com.ss.android.lark.contact.feat.mobile.mvp;

import android.app.Activity;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.entity.mobile.util.ContactMobileUtils;
import com.ss.android.lark.contact.feat.mobile.mvp.C35489e;
import com.ss.android.lark.contact.feat.p1745d.C35466d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.c */
public class C35486c implements C35489e.AbstractC35490a {

    /* renamed from: a */
    ArrayList<ContactMobileBean> f91761a = new ArrayList<>();

    /* renamed from: b */
    private LinkedHashMap<Integer, String> f91762b;

    /* renamed from: c */
    private List<ContactMobileBean> f91763c;

    /* renamed from: d */
    private Activity f91764d;

    /* renamed from: e */
    private boolean f91765e;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.ss.android.lark.contact.feat.mobile.mvp.C35489e.AbstractC35490a
    /* renamed from: a */
    public LinkedHashMap<Integer, String> mo130921a() {
        return this.f91762b;
    }

    @Override // com.ss.android.lark.contact.feat.mobile.mvp.C35489e.AbstractC35490a
    /* renamed from: b */
    public List<ContactMobileBean> mo130922b() {
        List<ContactMobileBean> list = this.f91763c;
        if (list != null) {
            return list;
        }
        return null;
    }

    @Override // com.ss.android.lark.contact.feat.mobile.mvp.C35489e.AbstractC35490a
    /* renamed from: c */
    public void mo130923c() {
        if (this.f91762b == null) {
            this.f91762b = new LinkedHashMap<>();
        }
        this.f91763c = m138808d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f91764d = null;
        List<ContactMobileBean> list = this.f91763c;
        if (list != null) {
            list.clear();
        }
        LinkedHashMap<Integer, String> linkedHashMap = this.f91762b;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
        ArrayList<ContactMobileBean> arrayList = this.f91761a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    /* renamed from: d */
    private List<ContactMobileBean> m138808d() {
        int i;
        Activity activity = this.f91764d;
        if (activity == null) {
            return new ArrayList();
        }
        if (ContactMobileUtils.m138439a(activity, "android.permission.READ_CONTACTS", 71)) {
            if (this.f91765e) {
                i = 1;
            } else {
                i = 2;
            }
            this.f91763c = C35466d.m138736a(i);
        } else {
            this.f91763c = new ArrayList(0);
        }
        this.f91761a.addAll(this.f91763c);
        m138809e();
        return this.f91763c;
    }

    /* renamed from: e */
    private void m138809e() {
        this.f91762b.clear();
        if (this.f91763c.size() != 0) {
            m138807a(0, this.f91763c.get(0).getInitial());
            for (int i = 1; i < this.f91763c.size(); i++) {
                if (!this.f91763c.get(i - 1).getInitial().equalsIgnoreCase(this.f91763c.get(i).getInitial())) {
                    m138807a(i, this.f91763c.get(i).getInitial());
                }
            }
        }
    }

    public C35486c(Activity activity, boolean z) {
        this.f91764d = activity;
        this.f91765e = z;
    }

    /* renamed from: a */
    private void m138807a(int i, String str) {
        this.f91762b.put(Integer.valueOf(i), str);
    }
}
