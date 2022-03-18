package com.bytedance.ee.bear.middleground.permission.setting.doc.p490a;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionExecutor;
import com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.AbstractC9953f;
import com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9957g;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.a.c */
public class C9947c implements AbstractC9953f.AbstractC9954a {

    /* renamed from: a */
    private final Fragment f26893a;

    /* renamed from: b */
    private final DocPermSetInfo f26894b;

    /* renamed from: c */
    private C9957g f26895c;

    /* renamed from: d */
    private Disposable f26896d;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable = this.f26896d;
        if (disposable != null && !disposable.isDisposed()) {
            this.f26896d.dispose();
        }
    }

    /* renamed from: a */
    private void m41407a() {
        Disposable disposable = this.f26896d;
        if (disposable != null && !disposable.isDisposed()) {
            this.f26896d.dispose();
        }
        this.f26896d = DocPermissionExecutor.f26846a.mo38086c(this.f26894b.mo38827c(), this.f26894b.mo38825b()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$c$1eWgykmyp10MkSR9zphaSj3H4Jc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9947c.this.m41409a((C9947c) ((IDocPublicPermission) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$c$nTMaXX8rMLxWvZ7rtjdX6WBXWGk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9947c.this.m41410a((C9947c) ((Throwable) obj));
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C9957g gVar = (C9957g) aj.m5365a(this.f26893a, C9945a.m41403a(this.f26894b)).mo6005a(C9957g.class);
        this.f26895c = gVar;
        gVar.setState(new C9957g.C9959a(1));
        this.f26895c.getState().mo5923a(this.f26893a, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.$$Lambda$c$GZ6ZOh3zgYBNbqKfVpWFIpVUg3w */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C9947c.this.m41408a((C9947c) ((C9957g.C9959a) obj));
            }
        });
        m41407a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41410a(Throwable th) throws Exception {
        this.f26895c.setPermSetInfo(this.f26894b);
        this.f26895c.setState(new C9957g.C9959a(3, th));
        C13479a.m54759a("DocumentPermissionSetModel", "requestPermission onFailure(): ", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41408a(C9957g.C9959a aVar) {
        C13479a.m54764b("DocumentPermissionSetModel", "new state = " + aVar);
        if (aVar != null && aVar.f26926a == 2) {
            m41407a();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m41409a(IDocPublicPermission iDocPublicPermission) throws Exception {
        C13479a.m54764b("DocumentPermissionSetModel", "requestPermission()...success");
        this.f26894b.mo38819a(iDocPublicPermission);
        this.f26895c.setPermSetInfo(this.f26894b);
        this.f26895c.setState(new C9957g.C9959a(4));
        PermissionAnalyticV2.m39607a(iDocPublicPermission.getReportJson());
    }

    public C9947c(Fragment fragment, DocPermSetInfo docPermSetInfo) {
        this.f26893a = fragment;
        this.f26894b = docPermSetInfo;
    }
}
