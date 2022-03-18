package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity;

import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.Objects;

/* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.b */
public class C44487b extends BaseItemViewData {

    /* renamed from: a */
    private TenantInfo f112844a;

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.BaseItemViewData
    /* renamed from: a */
    public int mo157906a() {
        return 0;
    }

    /* renamed from: l */
    public TenantInfo mo157919l() {
        return this.f112844a;
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.BaseItemViewData
    /* renamed from: b */
    public long mo157908b() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo != null) {
            return Long.parseLong(tenantInfo.getUserId());
        }
        return 0;
    }

    /* renamed from: c */
    public String mo157910c() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo != null) {
            return tenantInfo.getUserId();
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo157911d() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo == null || !tenantInfo.isCurrentUser()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public String mo157912e() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo != null) {
            return tenantInfo.getUserName();
        }
        return null;
    }

    /* renamed from: f */
    public String mo157913f() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo != null) {
            return tenantInfo.getUserNameEn();
        }
        return null;
    }

    /* renamed from: g */
    public String mo157914g() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo != null) {
            return tenantInfo.getChatterAvatarKey();
        }
        return null;
    }

    /* renamed from: h */
    public String mo157915h() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo != null) {
            return tenantInfo.getTenantId();
        }
        return null;
    }

    /* renamed from: i */
    public String mo157916i() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo != null) {
            return tenantInfo.getTenantName();
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo157917j() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo == null || !tenantInfo.isToCUnRegistered()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public String mo157918k() {
        TenantInfo tenantInfo = this.f112844a;
        if (tenantInfo != null) {
            return tenantInfo.getAvatarUrl();
        }
        return null;
    }

    public C44487b(C44487b bVar) {
        this.f112844a = bVar.f112844a;
    }

    public C44487b(TenantInfo tenantInfo) {
        this.f112844a = tenantInfo;
    }

    @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.BaseItemViewData
    /* renamed from: a */
    public boolean mo157907a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj) || !Objects.equals(this.f112844a, ((C44487b) obj).f112844a) || !super.mo157907a(obj)) {
            return false;
        }
        return true;
    }
}
