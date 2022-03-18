package com.ss.android.vc.meeting.module.p3148o;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.entity.VcDoc;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.o.c */
public class C62606c {

    /* renamed from: a */
    private List<VcDoc> f157598a = new ArrayList();

    /* renamed from: b */
    private List<VcDoc> f157599b = new ArrayList();

    /* renamed from: c */
    private final Object f157600c = new Object();

    /* renamed from: d */
    private final Object f157601d = new Object();

    /* renamed from: e */
    private volatile boolean f157602e = true;

    /* renamed from: b */
    public int mo216386b() {
        return this.f157598a.size();
    }

    /* renamed from: a */
    public List<VcDoc> mo216381a() {
        if (this.f157598a == null) {
            return null;
        }
        return new ArrayList(this.f157598a);
    }

    /* renamed from: a */
    public void mo216385a(boolean z) {
        this.f157602e = z;
    }

    /* renamed from: a */
    public void mo216384a(List<VcDoc> list) {
        synchronized (this.f157600c) {
            this.f157598a.clear();
            if (list != null) {
                this.f157598a.addAll(list);
            }
        }
    }

    /* renamed from: a */
    public void mo216383a(VcDoc vcDoc, boolean z) {
        if (!z || (!CollectionUtils.isEmpty(this.f157598a) && !CollectionUtils.isEmpty(this.f157599b))) {
            synchronized (this.f157601d) {
                if (vcDoc != null) {
                    this.f157599b.remove(vcDoc);
                    this.f157599b.add(0, vcDoc);
                }
                if (this.f157599b.size() > 20) {
                    this.f157599b = this.f157599b.subList(0, 20);
                }
            }
            synchronized (this.f157600c) {
                if (vcDoc != null) {
                    this.f157598a.remove(vcDoc);
                    this.f157598a.add(0, vcDoc);
                }
                if (this.f157598a.size() > 20) {
                    this.f157598a = this.f157598a.subList(0, 20);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo216382a(int i, int i2, int i3) {
        if (i2 == 5) {
            C57744a.m224104a().putString("vc_sp_key_recovery_meeting_id", "");
        }
    }
}
