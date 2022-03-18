package com.ss.android.lark.profile.func.group_profile.mvp;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.export.p2253a.C44897b;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileChat;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.a */
public class C52323a extends BaseModel implements AbstractC52331c.AbstractC52332a {

    /* renamed from: a */
    public ProfileChat f129746a;

    /* renamed from: b */
    public String f129747b;

    /* renamed from: c */
    public String f129748c;

    /* renamed from: d */
    private String f129749d;

    /* renamed from: e */
    private boolean f129750e;

    /* renamed from: f */
    private boolean f129751f;

    /* renamed from: g */
    private IProfileModuleDependency.AbstractC52246c f129752g = C52239a.m202617d().mo133586p();

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: a */
    public ProfileChat mo179175a() {
        return this.f129746a;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: b */
    public boolean mo179185b() {
        return C52239a.m202617d().mo133587q().mo133628g();
    }

    /* renamed from: c */
    public String mo179186c() {
        String f = C52239a.m202617d().mo133587q().mo133627f();
        this.f129748c = f;
        return f;
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: b */
    public void mo179182b(String str) {
        this.f129749d = str;
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: a */
    public void mo179178a(ProfileChat profileChat) {
        this.f129746a = profileChat;
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: b */
    public void mo179184b(boolean z) {
        this.f129751f = z;
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: a */
    public void mo179179a(String str) {
        this.f129747b = str;
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: a */
    public void mo179181a(boolean z) {
        this.f129750e = z;
    }

    /* renamed from: a */
    public String mo179176a(String str, String str2) {
        return C52239a.m202617d().mo133546a(str, str2);
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: a */
    public void mo179180a(String str, final IGetDataCallback<ProfileChatter> iGetDataCallback) {
        this.f129752g.mo133606a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<ProfileChatter>() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.C52323a.C523241 */

            /* renamed from: a */
            public void onSuccess(ProfileChatter profileChatter) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(profileChatter);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: b */
    public void mo179183b(String str, final IGetDataCallback<Pair<Integer, Bundle>> iGetDataCallback) {
        final String a = C52239a.m202617d().mo133587q().mo133622a();
        C52239a.m202617d().mo133586p().mo133611a(str, Collections.singletonList(a), new IGetDataCallback<Map<String, Boolean>>() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.C52323a.C523252 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Boolean> map) {
                int i;
                Bundle bundle = new Bundle();
                if (map.get(a) != null && map.get(a).booleanValue()) {
                    i = 1;
                } else if (C52323a.this.mo179185b()) {
                    C52323a aVar = C52323a.this;
                    String a = aVar.mo179176a(aVar.f129746a.mo178838a(), C52323a.this.f129747b);
                    Log.m165389i("GroupProfileModel", "inviteUrl is:" + a);
                    if (TextUtils.isEmpty(a)) {
                        iGetDataCallback.onError(new ErrorResult("Failed to get invitation link"));
                        return;
                    } else {
                        bundle.putString("params_invite_url", a);
                        i = 2;
                    }
                } else if (C52323a.this.mo179186c() != null) {
                    i = 3;
                    bundle.putString("params_tenant_id", C52323a.this.f129748c);
                } else {
                    i = 4;
                    bundle.putString("params_invite_url", "https://applink.feishu.cn/client/tenant/personal_use");
                }
                iGetDataCallback.onSuccess(Pair.create(Integer.valueOf(i), bundle));
            }
        });
    }

    @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52332a
    /* renamed from: a */
    public void mo179177a(Context context, AbstractC44896a aVar) {
        if (this.f129746a == null) {
            Log.m165383e("GroupProfileModel", "mCurrentProfileChat is null");
            return;
        }
        String a = C52239a.m202617d().mo133587q().mo133622a();
        if (this.f129750e) {
            ProfileHitPoint.m204727h();
        }
        if (this.f129751f) {
            C52239a.m202617d().mo133554a(context, this.f129746a.mo178838a(), Collections.singletonList(a), 4, (AbstractC44896a) getCallbackManager().wrapAndAddCallback(new C44897b(aVar)));
        } else {
            C52239a.m202617d().mo133556a(context, this.f129746a.mo178838a(), Collections.singletonList(a), this.f129747b, this.f129749d, this.f129750e, (AbstractC44896a) getCallbackManager().wrapAndAddCallback(new C44897b(aVar)));
        }
    }
}
