package com.ss.android.lark.userprotocol.impl.app.p2903a;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.biz.core.api.AbstractC29571p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog;
import com.ss.android.lark.userprotocol.impl.app.p2903a.C57727a;
import com.ss.android.lark.userprotocol.impl.p2902a.AbstractC57715a;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.userprotocol.impl.app.a.c */
public class C57734c extends BasePresenter<C57727a.AbstractC57728a, C57727a.AbstractC57729b, C57727a.AbstractC57729b.AbstractC57730a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C57727a.AbstractC57729b.AbstractC57730a createViewDelegate() {
        return new C57727a.AbstractC57729b.AbstractC57730a() {
            /* class com.ss.android.lark.userprotocol.impl.app.p2903a.C57734c.C577351 */
        };
    }

    public C57734c(C57727a.AbstractC57728a aVar, C57727a.AbstractC57729b bVar) {
        super(aVar, bVar);
    }

    /* renamed from: a */
    public void mo195906a(final Activity activity, final AbstractC29571p pVar) {
        final C577362 r0 = new UserProtocolDialog.AbstractC57723a() {
            /* class com.ss.android.lark.userprotocol.impl.app.p2903a.C57734c.C577362 */

            @Override // com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog.AbstractC57723a
            /* renamed from: a */
            public void mo195892a(String str) {
                ((C57727a.AbstractC57728a) C57734c.this.getModel()).mo195900a(str, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.userprotocol.impl.app.p2903a.C57734c.C577362.C577371 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        if (C57734c.this.getView() != null) {
                            ((C57727a.AbstractC57729b) C57734c.this.getView()).mo195901a();
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (C57734c.this.getView() != null) {
                            ((C57727a.AbstractC57729b) C57734c.this.getView()).mo195901a();
                        }
                        if (errorResult != null) {
                            Log.m165382e("sendAffirmNewestPoliciesRequest error = " + errorResult.toString());
                        }
                    }
                });
            }
        };
        ((C57727a.AbstractC57728a) getModel()).mo195899a(new IGetDataCallback<AbstractC57715a.C57716a>() {
            /* class com.ss.android.lark.userprotocol.impl.app.p2903a.C57734c.C577383 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult != null) {
                    Log.m165382e("getNewestPolicies error = " + errorResult.toString());
                }
                pVar.mo105814a(false);
            }

            /* renamed from: a */
            public void onSuccess(AbstractC57715a.C57716a aVar) {
                if (aVar == null) {
                    pVar.mo105814a(false);
                    return;
                }
                String e = aVar.mo195885e();
                if (!TextUtils.isEmpty(e)) {
                    UserSP.getInstance().putString("key_lark_user_protocol", e);
                }
                String f = aVar.mo195886f();
                if (!TextUtils.isEmpty(f)) {
                    UserSP.getInstance().putString("key_lark_user_protocol_software_policy", f);
                }
                if (C57734c.this.getView() == null || !aVar.mo195874a().booleanValue()) {
                    pVar.mo105814a(false);
                    return;
                }
                ((C57727a.AbstractC57729b) C57734c.this.getView()).mo195902a(activity, new UserProtocolDialog.C57724b(aVar.mo195881c(), aVar.mo195883d(), aVar.mo195878b(), aVar.mo195885e(), aVar.mo195886f()), r0, pVar);
            }
        });
    }
}
