package com.bytedance.ee.bear.drive.biz.plugin;

import com.bytedance.ee.bear.archive_api.IArchiveApi;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.lark.p414b.AbstractC8002m;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.plugin.a */
public class C6527a extends AbstractC6533b {

    /* renamed from: e */
    private static volatile C6527a f17977e;

    /* renamed from: a */
    public IArchiveApi f17978a;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: a */
    public void mo26077a(Class cls) throws Throwable {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: a */
    public boolean mo26078a(C6923a aVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: b */
    public String mo26079b() {
        return "com.bytedance.ee.bear.libarchive";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: b */
    public boolean mo26080b(C6923a aVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: c */
    public String mo26081c() {
        return "com.bytedance.ee.bear.libarchive.ArchiveImpl";
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: d */
    public boolean mo26082d() {
        if (!C6534c.m26231a() || C13615c.f35773a == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C6527a m26177a() {
        if (f17977e == null) {
            synchronized (C6527a.class) {
                if (f17977e == null) {
                    f17977e = new C6527a();
                }
            }
        }
        return f17977e;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: e */
    public boolean mo26083e() {
        if (mo26082d()) {
            return mo26101k();
        }
        C13479a.m54758a("ArchivePlugin", "isPluginStateEnable() isPkgCanUsePlugin is false, return false.");
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.biz.plugin.AbstractC6533b
    /* renamed from: f */
    public void mo26084f() {
        this.f17983c.set(true);
        mo26085g().mo238004b(C11678b.m48479c()).mo238001b($$Lambda$a$FrNnUAaZWbz0f99_0c4a064GPqw.INSTANCE, $$Lambda$a$8i0sqrUWIJ9EMEkXSSOlc6HKl2A.INSTANCE);
    }

    /* renamed from: g */
    public AbstractC68307f<IArchiveApi> mo26085g() {
        if (this.f17978a == null) {
            return AbstractC68307f.m265080a(new AbstractC68324h<IArchiveApi>() {
                /* class com.bytedance.ee.bear.drive.biz.plugin.C6527a.C65281 */

                @Override // io.reactivex.AbstractC68324h
                public void subscribe(final AbstractC68323g<IArchiveApi> gVar) {
                    ((AbstractC8002m) KoinJavaComponent.m268610a(AbstractC8002m.class)).mo31014a(C6527a.this.mo26079b(), IArchiveApi.class, C6527a.this.mo26081c(), new AbstractC8002m.AbstractC8003a<IArchiveApi>() {
                        /* class com.bytedance.ee.bear.drive.biz.plugin.C6527a.C65281.C65291 */

                        @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8002m.AbstractC8003a
                        /* renamed from: a */
                        public void mo26086a() {
                            C13479a.m54764b("ArchivePlugin", "onPluginLoading()...");
                        }

                        @Override // com.larksuite.framework.callback.UIGetDataCallback
                        public void onErrored(ErrorResult errorResult) {
                            super.onErrored(errorResult);
                            C13479a.m54759a("ArchivePlugin", "onErrored()...error = ", errorResult);
                            gVar.onError(new PluginException(errorResult));
                            gVar.onComplete();
                        }

                        /* renamed from: a */
                        public void onSuccessed(IArchiveApi iArchiveApi) {
                            super.onSuccessed(iArchiveApi);
                            C13479a.m54764b("ArchivePlugin", "onSuccessed()...iArchiveApi = " + iArchiveApi);
                            gVar.onNext(iArchiveApi);
                            C6527a.this.f17978a = iArchiveApi;
                            gVar.onComplete();
                        }
                    });
                }
            }, BackpressureStrategy.BUFFER);
        }
        C13479a.m54764b("ArchivePlugin", "mArchiveApi already init, return");
        return AbstractC68307f.m265083a(this.f17978a);
    }
}
