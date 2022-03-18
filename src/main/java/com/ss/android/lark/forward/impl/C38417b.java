package com.ss.android.lark.forward.impl;

import android.app.Activity;
import android.content.Intent;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.impl.model.TemplateForwardModel;
import com.ss.android.lark.forward.impl.p1899a.AbstractC38410a;
import com.ss.android.lark.forward.impl.p1899a.C38413b;
import com.ss.android.lark.forward.impl.statistics.ForwardHitPoint;
import com.ss.android.lark.forward.impl.statistics.favourite.ForwardHitpointExtraParams;
import com.ss.android.lark.forward.impl.view.BaseForwardView;
import com.ss.android.lark.forward.impl.view.C38443a;
import com.ss.android.lark.forward.impl.view.p1905a.C38451b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.impl.b */
public class C38417b extends BasePresenter<AbstractC38410a.AbstractC38411a, C38413b.AbstractC38414a, C38413b.AbstractC38414a.AbstractC38415a> {

    /* renamed from: a */
    C38413b.AbstractC38414a f98771a;

    /* renamed from: b */
    AbstractC38410a.AbstractC38411a f98772b;

    /* renamed from: c */
    private final ForwardTemplate f98773c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C38413b.AbstractC38414a.AbstractC38415a createViewDelegate() {
        return new C38451b((C38443a) this.f98771a, (TemplateForwardModel) this.f98772b, this.f98773c);
    }

    /* renamed from: b */
    private void m151525b() {
        final C38413b.AbstractC38416b bVar = (C38413b.AbstractC38416b) this.f98771a;
        ((AbstractC38410a.AbstractC38412b) this.f98772b).mo140939a(new C25975i(new IGetDataCallback<List<SearchBaseInfo>>() {
            /* class com.ss.android.lark.forward.impl.C38417b.C384181 */

            /* renamed from: a */
            public void onSuccess(List<SearchBaseInfo> list) {
                bVar.mo140958d(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("load data failed: " + errorResult.toString());
            }
        }));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (this.f98773c.mo140592e().mo140856b() || this.f98773c.mo140592e().mo140854a()) {
            m151525b();
        } else {
            ((C38413b.AbstractC38416b) this.f98771a).mo140958d(new ArrayList());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m151524a(String str) {
        Chat b = C38364a.m151054a().mo140442d().mo140489b(str);
        if (b != null) {
            ForwardHitPoint.f98819a.mo140997a(Integer.valueOf(b.getMemberCount()), ((AbstractC38410a.AbstractC38411a) getModel()).mo140938c());
        }
    }

    public C38417b(Activity activity, ForwardTemplate forwardTemplate, BaseForwardView.AbstractC38442a aVar) {
        this.f98773c = forwardTemplate;
        this.f98772b = new TemplateForwardModel(forwardTemplate);
        this.f98771a = new C38443a(activity, aVar, forwardTemplate);
        setModel(this.f98772b);
        setView(this.f98771a);
        this.f98771a.setViewDelegate(createViewDelegate());
    }

    /* renamed from: a */
    public void mo140962a(int i, int i2, Intent intent) {
        if (i == 3 && i2 == -1) {
            String stringExtra = intent.getStringExtra(C38364a.m151054a().mo140449k().mo140502a());
            SearchBaseInfo a = ((AbstractC38410a.AbstractC38411a) getModel()).mo140932a(stringExtra);
            if (a != null) {
                this.f98771a.mo140946a(Collections.singletonList(a), ForwardHitpointExtraParams.Scene.GROUP_CREATE_FROM_FORWARD.getValue());
            }
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(stringExtra) {
                /* class com.ss.android.lark.forward.impl.$$Lambda$b$BHak8S7tMUqZLT_5RgGJH8dkfSE */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C38417b.this.m151524a(this.f$1);
                }
            });
        }
    }
}
