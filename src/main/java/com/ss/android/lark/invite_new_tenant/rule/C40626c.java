package com.ss.android.lark.invite_new_tenant.rule;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.invite_new_tenant.rule.C40620a;
import com.ss.android.lark.invite_new_tenant.rule.p2068a.C40624a;

/* renamed from: com.ss.android.lark.invite_new_tenant.rule.c */
public class C40626c extends BasePresenter<C40620a.AbstractC40621a, C40620a.AbstractC40622b, C40620a.AbstractC40622b.AbstractC40623a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C40620a.AbstractC40622b.AbstractC40623a createViewDelegate() {
        return new C40629a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        final C406271 r0 = new IGetDataCallback<C40624a>() {
            /* class com.ss.android.lark.invite_new_tenant.rule.C40626c.C406271 */

            /* renamed from: a */
            public void onSuccess(C40624a aVar) {
                ((C40620a.AbstractC40622b) C40626c.this.getView()).mo146753a(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    ((C40620a.AbstractC40622b) C40626c.this.getView()).mo146754a(errorResult.getDisplayMsg());
                }
            }
        };
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.invite_new_tenant.rule.C40626c.RunnableC406282 */

            public void run() {
                ((C40620a.AbstractC40621a) C40626c.this.getModel()).mo146755a(new UIGetDataCallback(r0));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.invite_new_tenant.rule.c$a */
    public class C40629a implements C40620a.AbstractC40622b.AbstractC40623a {
        private C40629a() {
        }
    }

    public C40626c(C40620a.AbstractC40621a aVar, C40620a.AbstractC40622b bVar) {
        super(aVar, bVar);
    }
}
