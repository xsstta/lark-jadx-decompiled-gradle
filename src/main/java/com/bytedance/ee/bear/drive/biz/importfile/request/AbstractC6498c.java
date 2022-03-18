package com.bytedance.ee.bear.drive.biz.importfile.request;

import androidx.core.util.C0844e;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.ImportFailedType;
import com.bytedance.ee.bear.drive.biz.p326a.C6322a;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.jvm.functions.Function0;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.c */
public abstract class AbstractC6498c {

    /* renamed from: a */
    protected CheckImportRequester f17917a;

    /* renamed from: b */
    protected C7128a f17918b = C6920b.m27342f().mo27167b();

    /* renamed from: c */
    protected ImportFileEntity f17919c;

    /* renamed from: d */
    protected C68289a f17920d = new C68289a();

    /* renamed from: e */
    protected AbstractC6500a f17921e;

    /* renamed from: f */
    private volatile boolean f17922f;

    /* renamed from: g */
    private RnPushProtocol f17923g;

    /* renamed from: h */
    private C6322a f17924h;

    /* renamed from: i */
    private C7130c f17925i = C6920b.m27342f().mo27166a();

    /* renamed from: j */
    private LiveData<ConnectionService.NetworkState> f17926j;

    /* renamed from: k */
    private C6496a f17927k;

    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.c$a */
    public interface AbstractC6500a {
        /* renamed from: a */
        void mo25885a(ImportFailedType importFailedType);

        /* renamed from: a */
        void mo25887a(String str, String str2, String str3);

        /* renamed from: a */
        void mo25888a(Throwable th);

        /* renamed from: e */
        void mo25892e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25940a(String str, String str2, int i);

    /* renamed from: c */
    public boolean mo25996c() {
        return this.f17922f;
    }

    /* renamed from: d */
    public C68289a mo25997d() {
        return this.f17920d;
    }

    /* renamed from: a */
    public static AbstractC6498c m26083a() {
        if (C4211a.m17514a().mo16536a("ccm.suite.export_replace_api_enabled", false)) {
            return new StartImportRequesterManagerImplV2();
        }
        return new StartImportRequesterManagerImpl();
    }

    /* renamed from: b */
    public AbstractC68307f<Integer> mo25995b() {
        return this.f17927k.mo25988a(this.f17919c.mo27485a(), true).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$c$2QDdMtJSCkBTVJx87oy5ymCL_7E */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC6498c.this.m26084a((Integer) obj);
            }
        });
    }

    /* renamed from: f */
    public void mo25942f() {
        this.f17921e = null;
        RnPushProtocol rnPushProtocol = this.f17923g;
        if (rnPushProtocol != null) {
            rnPushProtocol.mo40241a();
        }
        C68289a aVar = this.f17920d;
        if (aVar != null) {
            aVar.mo237935a();
        }
    }

    AbstractC6498c() {
        C10917c a = ar.m20936a();
        this.f17917a = new CheckImportRequester(a);
        this.f17927k = new C6496a(a);
    }

    /* renamed from: e */
    public void mo25998e() {
        LiveData<ConnectionService.NetworkState> liveData;
        ImportFileEntity importFileEntity;
        if (this.f17924h != null && (liveData = this.f17926j) != null && liveData.mo5927b() != null && this.f17926j.mo5927b().mo20041b() && (importFileEntity = this.f17919c) != null) {
            this.f17924h.mo25417a(importFileEntity.mo27485a(), new C6322a.AbstractC6323a() {
                /* class com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c.C64991 */

                @Override // com.bytedance.ee.bear.drive.biz.p326a.C6322a.AbstractC6323a
                /* renamed from: a */
                public void mo25421a(Throwable th) {
                    C13479a.m54758a("StartImportRequesterManager", "getDrivePermissionInfo failed + " + th);
                    AbstractC6498c.this.f17921e.mo25885a(ImportFailedType.FailedNoPermisson);
                }

                @Override // com.bytedance.ee.bear.drive.biz.p326a.C6322a.AbstractC6323a
                /* renamed from: a */
                public void mo25420a(C6522b bVar) {
                    C13479a.m54764b("StartImportRequesterManager", "fetch permission info=" + bVar);
                    if (!bVar.mo26059e()) {
                        AbstractC6498c.this.f17921e.mo25885a(ImportFailedType.FailedNoPermisson);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo25991a(LiveData<ConnectionService.NetworkState> liveData) {
        this.f17926j = liveData;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.c$b */
    public class C6501b implements RnPushProtocol.AbstractC10622a {
        private C6501b() {
        }

        @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
        public void didReceivePush(String str) {
            AbstractC6498c.this.mo25998e();
        }
    }

    /* renamed from: a */
    public void mo25994a(boolean z) {
        this.f17922f = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Integer m26084a(Integer num) throws Exception {
        this.f17918b.mo27878a(this.f17919c.mo27485a());
        this.f17918b.mo27885a(this.f17919c.mo27485a(), "can_import");
        this.f17921e.mo25892e();
        return num;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DefinitionParameters m26085a(ImportFileEntity importFileEntity) {
        return C70039b.m268661a("PERMISSION_CHANGE_", importFileEntity.mo27485a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26087a(Throwable th) throws Exception {
        C13479a.m54764b("StartImportRequesterManager", "checkCanImport throwable = " + th);
        this.f17918b.mo27895b(this.f17919c.mo27485a(), "can_import");
        C0844e<String, String> b = this.f17927k.mo25989b(th);
        this.f17918b.mo27888a(b.f3317a, b.f3318b, this.f17919c.mo27485a());
        this.f17921e.mo25885a(this.f17927k.mo25987a(th));
        this.f17921e.mo25888a(th);
    }

    /* renamed from: a */
    public void mo25993a(String str, String str2) {
        this.f17920d.mo237937a(mo25995b().mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str, str2) {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$c$4mJPC22uNL5upPAZ2CyrJLf6BoI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC6498c.this.m26086a((AbstractC6498c) this.f$1, this.f$2, (String) ((Integer) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$c$YPe_QOiWvWQV6aOKc6Bos92FjQA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC6498c.this.m26087a((AbstractC6498c) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26086a(String str, String str2, Integer num) throws Exception {
        this.f17918b.mo27895b(this.f17919c.mo27485a(), "can_import");
        mo25940a(str, str2, num.intValue());
    }

    /* renamed from: a */
    public void mo25992a(ImportFileEntity importFileEntity, C6322a aVar, AbstractC6500a aVar2) {
        this.f17925i.mo27913a(importFileEntity);
        this.f17919c = importFileEntity;
        this.f17921e = aVar2;
        RnPushProtocol rnPushProtocol = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new Function0() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$c$_QAUeuy5YEpJk2WV2ea0c0Yb8k */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC6498c.m26085a(ImportFileEntity.this);
            }
        });
        this.f17923g = rnPushProtocol;
        rnPushProtocol.mo40242a(new C6501b());
        this.f17924h = aVar;
    }
}
