package com.ss.android.lark.mail.impl.entity;

import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.ThreadAction;
import com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel;
import com.bytedance.lark.pb.email.client.v1.UserInfo;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.entity.p */
public class C42104p {

    /* renamed from: a */
    private final String f107124a = "ThreadSwitch";

    /* renamed from: b */
    private List<ThreadAction> f107125b = new ArrayList();

    /* renamed from: c */
    private String f107126c;

    /* renamed from: d */
    private List<MailLabelEntity> f107127d = new ArrayList();

    /* renamed from: e */
    private PermissionCode f107128e;

    /* renamed from: f */
    private UserInfo f107129f;

    /* renamed from: g */
    private boolean f107130g;

    /* renamed from: h */
    private ThreadSecurityLevel f107131h;

    /* renamed from: i */
    private boolean f107132i;

    /* renamed from: j */
    private int f107133j;

    /* renamed from: k */
    private boolean f107134k = false;

    /* renamed from: l */
    private String f107135l;

    /* renamed from: m */
    private List<String> f107136m;

    /* renamed from: n */
    private int f107137n;

    /* renamed from: o */
    private HashMap<ThreadAction, Boolean> f107138o = new HashMap<>();

    /* renamed from: a */
    public String mo152010a() {
        return this.f107126c;
    }

    /* renamed from: b */
    public List<MailLabelEntity> mo152018b() {
        return this.f107127d;
    }

    /* renamed from: c */
    public PermissionCode mo152021c() {
        return this.f107128e;
    }

    /* renamed from: d */
    public boolean mo152022d() {
        return this.f107130g;
    }

    /* renamed from: e */
    public boolean mo152023e() {
        return this.f107132i;
    }

    /* renamed from: f */
    public boolean mo152024f() {
        return this.f107134k;
    }

    /* renamed from: g */
    public String mo152025g() {
        return this.f107135l;
    }

    /* renamed from: h */
    public int mo152026h() {
        return this.f107137n;
    }

    /* renamed from: i */
    private void m168047i() {
        this.f107138o.clear();
        if (!CollectionUtils.isEmpty(this.f107125b)) {
            for (ThreadAction threadAction : this.f107125b) {
                this.f107138o.put(threadAction, true);
            }
        }
    }

    /* renamed from: a */
    public void mo152011a(int i) {
        this.f107133j = i;
    }

    /* renamed from: b */
    public void mo152019b(List<String> list) {
        this.f107136m = list;
    }

    /* renamed from: a */
    public void mo152012a(PermissionCode permissionCode) {
        this.f107128e = permissionCode;
    }

    /* renamed from: b */
    public void mo152020b(boolean z) {
        this.f107134k = z;
    }

    /* renamed from: a */
    public void mo152013a(UserInfo userInfo) {
        this.f107129f = userInfo;
    }

    /* renamed from: a */
    public void mo152014a(String str) {
        this.f107135l = str;
    }

    /* renamed from: a */
    public void mo152015a(List<MailLabelEntity> list) {
        this.f107127d = list;
    }

    /* renamed from: a */
    public void mo152016a(boolean z) {
        this.f107132i = z;
    }

    /* renamed from: a */
    public boolean mo152017a(MailLabelEntity mailLabelEntity, boolean z) {
        for (int i = 0; i < this.f107127d.size(); i++) {
            if (TextUtils.equals(this.f107127d.get(i).mo151527k(), mailLabelEntity.mo151527k())) {
                if (z) {
                    this.f107127d.remove(i);
                    return true;
                } else {
                    this.f107127d.set(i, mailLabelEntity);
                    return true;
                }
            }
        }
        return false;
    }

    public C42104p(String str, List<ThreadAction> list, List<MailLabelEntity> list2, PermissionCode permissionCode, boolean z, ThreadSecurityLevel threadSecurityLevel, boolean z2, int i) {
        if (list != null) {
            this.f107125b = list;
            m168047i();
        }
        this.f107126c = str;
        if (list2 != null) {
            this.f107127d = list2;
        }
        this.f107128e = permissionCode;
        this.f107130g = z;
        this.f107131h = threadSecurityLevel;
        this.f107132i = z2;
        this.f107137n = i;
    }
}
