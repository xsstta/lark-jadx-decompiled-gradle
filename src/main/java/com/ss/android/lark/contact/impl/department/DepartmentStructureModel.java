package com.ss.android.lark.contact.impl.department;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.department.C35812c;
import com.ss.android.lark.contact.impl.p1761f.C35917f;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import java.io.Serializable;

public class DepartmentStructureModel extends BaseModel implements C35812c.AbstractC35813a {

    /* renamed from: a */
    private static String f92531a = "DepartmentStructureModel";

    /* renamed from: b */
    private C35812c.AbstractC35813a.AbstractC35814a f92532b;

    /* renamed from: c */
    private String f92533c;

    /* renamed from: d */
    private String f92534d;

    /* renamed from: e */
    private Bundle f92535e;

    /* renamed from: f */
    private Bundle f92536f;

    /* renamed from: g */
    private UnregisterCheckData f92537g;

    /* renamed from: h */
    private boolean f92538h;

    public static class UnregisterCheckData implements Serializable {
        public boolean enabled;
        public String notice;
        public String title;
        public String url;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f92532b = null;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m140092a();
        if (TextUtils.isEmpty(this.f92533c)) {
            return;
        }
        if (this.f92538h) {
            this.f92532b.mo131743a(this.f92533c);
        } else {
            this.f92532b.mo131744a(this.f92533c, this.f92534d);
        }
    }

    /* renamed from: a */
    private void m140092a() {
        Bundle bundle = this.f92536f;
        if (bundle != null) {
            this.f92533c = bundle.getString("department_id");
            this.f92534d = this.f92536f.getString("chat_id");
            this.f92538h = this.f92536f.getBoolean("is_edu", false);
        }
        if (TextUtils.isEmpty(this.f92533c)) {
            this.f92533c = this.f92535e.getString("department_id");
            this.f92534d = this.f92535e.getString("chat_id");
            this.f92538h = this.f92535e.getBoolean("is_edu", false);
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35813a
    /* renamed from: a */
    public void mo131713a(UnregisterCheckData unregisterCheckData) {
        this.f92537g = unregisterCheckData;
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35813a
    /* renamed from: a */
    public void mo131714a(C35812c.AbstractC35813a.AbstractC35814a aVar) {
        this.f92532b = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35813a
    /* renamed from: b */
    public void mo131715b(final IGetDataCallback<Boolean> iGetDataCallback) {
        C35917f.m140749a().mo132182b(new IGetDataCallback<GetAdminPermissionInfoResponse>() {
            /* class com.ss.android.lark.contact.impl.department.DepartmentStructureModel.C357932 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(getAdminPermissionInfoResponse.misSuperAdministrator);
                }
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35813a
    /* renamed from: a */
    public void mo131712a(final IGetDataCallback<Boolean> iGetDataCallback) {
        C35917f.m140749a().mo132182b(new IGetDataCallback<GetAdminPermissionInfoResponse>() {
            /* class com.ss.android.lark.contact.impl.department.DepartmentStructureModel.C357921 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
                boolean z;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    if (getAdminPermissionInfoResponse.misSuperAdministrator.booleanValue() || getAdminPermissionInfoResponse.misDepartmentAdministrator.booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iGetDataCallback.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    public DepartmentStructureModel(Bundle bundle, Bundle bundle2) {
        this.f92535e = bundle;
        this.f92536f = bundle2;
    }

    @Override // com.ss.android.lark.contact.impl.department.C35812c.AbstractC35813a
    /* renamed from: a */
    public void mo131711a(Context context, IGetDataCallback<String> iGetDataCallback) {
        C35358a.m138143a().mo130163h().mo130227a(context, 0, iGetDataCallback);
    }
}
