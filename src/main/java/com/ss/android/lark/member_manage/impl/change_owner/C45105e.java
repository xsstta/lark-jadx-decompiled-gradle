package com.ss.android.lark.member_manage.impl.change_owner;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.change_owner.AbstractC45117h;
import com.ss.android.lark.member_manage.impl.change_owner.C45110f;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.member_manage.impl.change_owner.e */
public class C45105e extends BasePresenter<AbstractC45117h.AbstractC45118a, AbstractC45117h.AbstractC45119b, IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a> {

    /* renamed from: a */
    public C45102d f114212a;

    /* renamed from: b */
    private CallbackManager f114213b = new CallbackManager();

    /* renamed from: c */
    private C45110f f114214c;

    /* renamed from: d */
    private Bundle f114215d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a createViewDelegate() {
        return new C45114g(this.f114214c, this.f114212a);
    }

    /* renamed from: b */
    public void mo159586b() {
        ((AbstractC45117h.AbstractC45118a) getModel()).mo159435a(new IGetDataCallback<SelectBeansResult>() {
            /* class com.ss.android.lark.member_manage.impl.change_owner.C45105e.C451072 */

            /* renamed from: a */
            public void onSuccess(final SelectBeansResult dVar) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.change_owner.C45105e.C451072.RunnableC451081 */

                    public void run() {
                        ((AbstractC45117h.AbstractC45119b) C45105e.this.getView()).mo159449d(dVar);
                        ((AbstractC45117h.AbstractC45119b) C45105e.this.getView()).mo159448b(new ArrayList(C45105e.this.f114212a.mo159441c().values()));
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.change_owner.C45105e.C451072.RunnableC451092 */

                    public void run() {
                        Log.m165382e(errorResult.toString());
                        ((AbstractC45117h.AbstractC45119b) C45105e.this.getView()).mo159393a(errorResult.getDisplayMsg());
                    }
                });
            }
        });
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f114213b.cancelCallbacks();
        this.f114213b = null;
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC45117h.AbstractC45118a) getModel()).mo159434a(this.f114215d, new IGetDataCallback<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.change_owner.C45105e.C451061 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(SelectMemberInitData selectMemberInitData) {
                ((AbstractC45117h.AbstractC45119b) C45105e.this.getView()).mo159447a(selectMemberInitData.getChat());
                C45105e.this.mo159586b();
            }
        });
    }

    public C45105e(Activity activity, Bundle bundle, C45110f.AbstractC45113a aVar) {
        boolean z;
        this.f114215d = bundle;
        if (bundle == null || !bundle.getBoolean("key_is_thread")) {
            z = false;
        } else {
            z = true;
        }
        this.f114214c = new C45110f(activity, aVar, z);
        C45102d dVar = new C45102d();
        this.f114212a = dVar;
        setModel(dVar);
        setView(this.f114214c);
        this.f114214c.setViewDelegate(createViewDelegate());
    }
}
