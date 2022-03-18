package com.ss.android.lark.mail.impl.entity;

import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.ThreadAction;
import com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mail.impl.service.C43374f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.entity.l */
public class C42099l {

    /* renamed from: a */
    private List<C42097j> f107100a;

    /* renamed from: b */
    private List<MailDraft> f107101b;

    /* renamed from: c */
    private List<ThreadAction> f107102c;

    /* renamed from: d */
    private List<String> f107103d;

    /* renamed from: e */
    private List<MailLabelEntity> f107104e = new ArrayList();

    /* renamed from: f */
    private PermissionCode f107105f;

    /* renamed from: g */
    private boolean f107106g;

    /* renamed from: h */
    private boolean f107107h;

    /* renamed from: i */
    private ThreadSecurityLevel f107108i;

    /* renamed from: j */
    private boolean f107109j = false;

    /* renamed from: k */
    private String f107110k;

    /* renamed from: a */
    public List<C42097j> mo151973a() {
        return this.f107100a;
    }

    /* renamed from: b */
    public List<MailDraft> mo151979b() {
        return this.f107101b;
    }

    /* renamed from: c */
    public List<ThreadAction> mo151983c() {
        return this.f107102c;
    }

    /* renamed from: e */
    public PermissionCode mo151988e() {
        return this.f107105f;
    }

    /* renamed from: f */
    public boolean mo151989f() {
        return this.f107106g;
    }

    /* renamed from: g */
    public ThreadSecurityLevel mo151990g() {
        return this.f107108i;
    }

    /* renamed from: h */
    public boolean mo151991h() {
        return this.f107107h;
    }

    /* renamed from: i */
    public boolean mo151992i() {
        return this.f107109j;
    }

    /* renamed from: j */
    public String mo151993j() {
        return this.f107110k;
    }

    /* renamed from: k */
    public int mo151994k() {
        List<C42097j> list = this.f107100a;
        int i = 0;
        if (list != null) {
            for (C42097j jVar : list) {
                i += jVar.mo151968j() ? 1 : 0;
            }
        }
        return i;
    }

    /* renamed from: d */
    public List<MailLabelEntity> mo151986d() {
        List<MailLabelEntity> list;
        List<String> list2 = this.f107103d;
        if (list2 != null && ((list = this.f107104e) == null || !(list == null || list2.size() == this.f107104e.size()))) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                MailLabelEntity c = C43374f.m172264f().mo155117c(str);
                if (c != null) {
                    arrayList.add(c);
                }
            }
            this.f107104e = arrayList;
        }
        return this.f107104e;
    }

    /* renamed from: d */
    public void mo151987d(List<String> list) {
        this.f107103d = list;
    }

    /* renamed from: a */
    public void mo151974a(PermissionCode permissionCode) {
        this.f107105f = permissionCode;
    }

    /* renamed from: b */
    public void mo151980b(String str) {
        this.f107110k = str;
    }

    /* renamed from: c */
    public void mo151984c(List<ThreadAction> list) {
        this.f107102c = list;
    }

    /* renamed from: a */
    public void mo151975a(ThreadSecurityLevel threadSecurityLevel) {
        this.f107108i = threadSecurityLevel;
    }

    /* renamed from: b */
    public void mo151981b(List<MailDraft> list) {
        this.f107101b = list;
    }

    /* renamed from: c */
    public void mo151985c(boolean z) {
        this.f107109j = z;
    }

    /* renamed from: a */
    public void mo151976a(String str) {
        if (CollectionUtils.isNotEmpty(this.f107100a)) {
            for (C42097j jVar : this.f107100a) {
                jVar.mo151958b(str);
            }
        }
    }

    /* renamed from: b */
    public void mo151982b(boolean z) {
        this.f107107h = z;
    }

    /* renamed from: a */
    public void mo151977a(List<C42097j> list) {
        this.f107100a = list;
    }

    /* renamed from: a */
    public void mo151978a(boolean z) {
        this.f107106g = z;
    }
}
