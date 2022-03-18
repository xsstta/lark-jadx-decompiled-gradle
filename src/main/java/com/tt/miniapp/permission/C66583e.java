package com.tt.miniapp.permission;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;

/* renamed from: com.tt.miniapp.permission.e */
public class C66583e extends AbstractC67457c implements AbstractC67734b {
    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    /* renamed from: a */
    public boolean mo232185a(String str, String str2) {
        SharedPreferences c = m260156c(str);
        return c.getBoolean("servicePermission" + str2, false);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50195a(String str) {
        return mo232185a(C67432a.m262319a(this.f170082d).getAppInfo().appId, str);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50194a(int i, String str, boolean z) {
        SharedPreferences b = mo232186b(str);
        return b.getBoolean("permission" + i, z);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50196a(String str, int i) {
        if (mo232186b(str) == null) {
            return false;
        }
        SharedPreferences b = mo232186b(str);
        return b.contains("modifyTime" + i);
    }

    public C66583e(IAppContext iAppContext) {
        super(iAppContext);
    }

    /* renamed from: a */
    private SharedPreferences m260154a(IAppContext iAppContext) {
        return C66581d.m260137a(iAppContext);
    }

    /* renamed from: c */
    private SharedPreferences m260156c(String str) {
        return m260153a(AppbrandContext.getInst().getApplicationContext(), str);
    }

    /* renamed from: b */
    public SharedPreferences mo232186b(String str) {
        return C66581d.m260136a(AppbrandContext.getInst().getApplicationContext(), str);
    }

    /* renamed from: d */
    private String m260157d(String str) {
        return HostDependManager.getInst().getSpPrefixPath() + "service_permission_" + str;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: b */
    public long mo50198b(int i) {
        SharedPreferences a = m260154a(this.f170082d);
        return a.getLong("modifyTime" + i, -1);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50192a(int i) {
        if (m260154a(this.f170082d) == null) {
            return false;
        }
        SharedPreferences a = m260154a(this.f170082d);
        return a.contains("modifyTime" + i);
    }

    /* renamed from: b */
    private SharedPreferences m260155b(Context context, String str) {
        return C66581d.m260136a(context, str);
    }

    /* renamed from: a */
    private SharedPreferences m260153a(Context context, String str) {
        return context.getApplicationContext().getSharedPreferences(m260157d(str), 0);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public void mo50187a(int i, long j) {
        if (m260154a(this.f170082d) != null) {
            SharedPreferences.Editor edit = m260154a(this.f170082d).edit();
            edit.putLong("modifyTime" + i, j).apply();
        }
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public boolean mo50193a(int i, String str) {
        if (mo232186b(str) == null) {
            return false;
        }
        SharedPreferences b = mo232186b(str);
        return b.contains("permission" + i);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public long mo50186a(int i, String str, long j) {
        SharedPreferences b = mo232186b(str);
        return b.getLong("modifyTime" + i, j);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: b */
    public void mo50199b(int i, String str, long j) {
        if (mo232186b(str) != null) {
            SharedPreferences.Editor edit = mo232186b(str).edit();
            edit.putLong("modifyTime" + i, j).apply();
        }
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public void mo50190a(String str, String str2, boolean z) {
        SharedPreferences.Editor edit = m260156c(str).edit();
        edit.putBoolean("servicePermission" + str2, z).apply();
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public void mo50188a(int i, String str, boolean z, long j) {
        if (mo232186b(str) != null) {
            SharedPreferences.Editor edit = mo232186b(str).edit();
            SharedPreferences.Editor putBoolean = edit.putBoolean("permission" + i, z);
            putBoolean.putLong("modifyTime" + i, j).apply();
        }
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67734b
    /* renamed from: a */
    public void mo50189a(Context context, int i, String str, long j) {
        if (m260155b(context, str) != null) {
            SharedPreferences.Editor edit = m260155b(context, str).edit();
            edit.putLong("modifyTime" + i, j).apply();
        }
    }
}
