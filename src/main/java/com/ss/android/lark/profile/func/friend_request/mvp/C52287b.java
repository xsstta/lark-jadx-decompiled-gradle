package com.ss.android.lark.profile.func.friend_request.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;

/* renamed from: com.ss.android.lark.profile.func.friend_request.mvp.b */
public class C52287b extends BaseModel implements AbstractC52283a.AbstractC52284a {

    /* renamed from: a */
    public ContactSource f129671a;

    /* renamed from: b */
    private String f129672b;

    /* renamed from: c */
    private String f129673c;

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52284a
    /* renamed from: a */
    public void mo179112a(ContactSource contactSource) {
        this.f129671a = contactSource;
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52284a
    /* renamed from: b */
    public void mo179115b(String str) {
        this.f129672b = str;
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52284a
    /* renamed from: a */
    public void mo179113a(String str) {
        this.f129673c = str;
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52284a
    /* renamed from: a */
    public void mo179111a(final IGetDataCallback<String> iGetDataCallback) {
        C52239a.m202617d().mo133586p().mo133605a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<ProfileChatter>() {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.C52287b.C522881 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(ProfileChatter profileChatter) {
                if (iGetDataCallback != null) {
                    C52239a.m202617d().mo133586p().mo133607a(profileChatter.getId(), new IProfileModuleDependency.AbstractC52246c.AbstractC52247a() {
                        /* class com.ss.android.lark.profile.func.friend_request.mvp.C52287b.C522881.C522891 */

                        @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.AbstractC52246c.AbstractC52247a
                        /* renamed from: a */
                        public void mo178829a(String str) {
                            iGetDataCallback.onSuccess(str);
                        }
                    });
                }
            }
        }));
    }

    @Override // com.ss.android.lark.profile.func.friend_request.mvp.AbstractC52283a.AbstractC52284a
    /* renamed from: a */
    public void mo179114a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        C52239a.m202617d().mo133582l().mo133656a(this.f129672b, null, str, null, this.f129673c, this.f129671a, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.profile.func.friend_request.mvp.C52287b.C522902 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (C52287b.this.f129671a != null) {
                    ProfileHitPoint.m204701a(C52287b.this.f129671a);
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
            }
        }));
    }
}
