package com.bytedance.ee.bear.drive.biz.importfile.request;

import androidx.core.util.C0844e;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveStartImportException;
import com.bytedance.ee.bear.drive.biz.importfile.p328b.C6476a;
import com.bytedance.ee.bear.drive.biz.importfile.reliablesdk.C6480a;
import com.bytedance.ee.bear.drive.biz.importfile.request.CheckImportRequester;
import com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImpl;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.ImportFailedType;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ConnectTimeoutException;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70022d;

public class StartImportRequesterManagerImpl extends AbstractC6498c {

    /* renamed from: f */
    private ConnectionService f17897f = C5084ad.m20847d();

    /* renamed from: g */
    private C6480a f17898g;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m26053a(AbstractC70022d dVar) throws Exception {
    }

    public static class StartImportResult implements Serializable {
        private String ticket;

        public String getTicket() {
            return this.ticket;
        }

        public String toString() {
            return "Result{ticket='" + this.ticket + '\'' + '}';
        }

        public void setTicket(String str) {
            this.ticket = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImpl$a */
    public static class C6486a implements NetService.AbstractC5074c<NetService.Result<StartImportResult>> {
        private C6486a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<StartImportResult> parse(String str) {
            NetService.Result<StartImportResult> result = new NetService.Result<>();
            result.setData((StartImportResult) JSON.parseObject(str, StartImportResult.class));
            return result;
        }
    }

    /* renamed from: g */
    public ImportFileEntity mo25943g() {
        return this.f17919c;
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c
    /* renamed from: f */
    public void mo25942f() {
        super.mo25942f();
        C6480a aVar = this.f17898g;
        if (aVar != null) {
            aVar.mo25899a();
        }
    }

    /* renamed from: a */
    public static ImportFailedType m26047a(Throwable th) {
        if (th instanceof DriveStartImportException) {
            return ImportFailedType.FailedCanContactSupport;
        }
        return ImportFailedType.FailedCanRetry;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m26055b(AbstractC70022d dVar) throws Exception {
        this.f17918b.mo27885a(this.f17919c.mo27485a(), "start_import_file");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ StartImportResult m26046a(NetService.Result result) throws Exception {
        if (result != null && result.code == 0 && result.getData() != null) {
            return (StartImportResult) result.getData();
        }
        throw new DriveStartImportException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m26048a(AccountService.Account account) throws Exception {
        C13479a.m54772d("StartImportRequesterManagerImpl", "Register Reliable SDK");
        C6480a aVar = new C6480a(this, this.f17918b);
        this.f17898g = aVar;
        aVar.mo25901a("PARSE_FILE_", account.f14584a, this.f17921e);
        return "PARSE_FILE_".concat(account.f14584a);
    }

    /* renamed from: b */
    public C0844e<String, String> mo25941b(Throwable th) {
        String str;
        String str2 = "nativeFail";
        if (th instanceof DriveStartImportException) {
            str = "DEC17";
        } else if ((th instanceof SocketTimeoutException) || (th instanceof ConnectTimeoutException)) {
            str2 = "overtime";
            str = "DEC2";
        } else if (this.f17897f.mo20038b() == null || !this.f17897f.mo20038b().mo20041b()) {
            str = "DEC3";
        } else {
            str = C7128a.m28545b(th);
            str2 = "serverFail";
        }
        return new C0844e<>(str2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26049a(CheckImportRequester.ImportCheckResult importCheckResult) throws Exception {
        this.f17918b.mo27895b(this.f17919c.mo27485a(), "check_import_result");
        this.f17918b.mo27888a("success", "DEC0", this.f17919c.mo27485a());
        String str = importCheckResult.getTokens().get(0);
        C13479a.m54764b("StartImportRequesterManagerImpl", "checkImportResult token = " + C13721c.m55650d(str));
        this.f17921e.mo25887a(importCheckResult.getType(), str, importCheckResult.getUrl());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m26056c(Throwable th) throws Exception {
        this.f17918b.mo27895b(this.f17919c.mo27485a(), "check_import_result");
        C0844e<String, String> b = CheckImportRequester.m26042b(th);
        this.f17918b.mo27888a(b.f3317a, b.f3318b, this.f17919c.mo27485a());
        C13479a.m54764b("StartImportRequesterManagerImpl", "checkImportResult throwable = " + th);
        this.f17921e.mo25885a(CheckImportRequester.m26039a(th));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m26057d(Throwable th) throws Exception {
        this.f17918b.mo27895b(this.f17919c.mo27485a(), "start_import_file");
        C0844e<String, String> b = mo25941b(th);
        this.f17918b.mo27888a(b.f3317a, b.f3318b, this.f17919c.mo27485a());
        C13479a.m54764b("StartImportRequesterManagerImpl", "startImport throwable = " + th);
        this.f17921e.mo25885a(m26047a(th));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26050a(StartImportResult startImportResult) throws Exception {
        this.f17898g.mo25900a(startImportResult.getTicket());
        C13479a.m54772d("StartImportRequesterManagerImpl", "ticket " + startImportResult.getTicket());
        this.f17918b.mo27885a(this.f17919c.mo27485a(), "check_import_result");
        this.f17918b.mo27895b(this.f17919c.mo27485a(), "start_import_file");
        m26051a(startImportResult.getTicket());
    }

    /* renamed from: a */
    private void m26051a(final String str) {
        mo25994a(false);
        this.f17920d.mo237937a(AbstractC68307f.m265083a((Object) true).mo238019d(60, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238018d(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImpl.C64851 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (!StartImportRequesterManagerImpl.this.mo25996c()) {
                    StartImportRequesterManagerImpl.this.mo25994a(true);
                    StartImportRequesterManagerImpl startImportRequesterManagerImpl = StartImportRequesterManagerImpl.this;
                    startImportRequesterManagerImpl.mo25939a(str, startImportRequesterManagerImpl.f17917a);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo25939a(String str, CheckImportRequester checkImportRequester) {
        this.f17920d.mo237937a(checkImportRequester.mo25924a(str).mo238013c($$Lambda$StartImportRequesterManagerImpl$uHY7LFru4m2TIxCSVzGwCiPWcd8.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$StartImportRequesterManagerImpl$CkdNzwKSzCCRPNbx3c_WIEOeo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StartImportRequesterManagerImpl.this.m26049a((StartImportRequesterManagerImpl) ((CheckImportRequester.ImportCheckResult) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$StartImportRequesterManagerImpl$4ZfXXl3sAFwoGZs3ZHji8fJKKc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StartImportRequesterManagerImpl.this.m26056c((Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26052a(String str, String str2, int i) {
        String str3;
        C13479a.m54764b("StartImportRequesterManagerImpl", "startImport");
        if (C6476a.m26023b(i) == C8275a.f22371d.mo32555b()) {
            str3 = C8275a.f22378k.mo32553a();
        } else {
            str3 = null;
        }
        NetService.C5077f fVar = new NetService.C5077f("/api/parser/parse_file/v2/");
        HashMap hashMap = new HashMap();
        hashMap.put("file_key", str);
        hashMap.put("tag", str2);
        if (str3 != null) {
            hashMap.put("format", str3);
        }
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        this.f17920d.mo237937a(((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C6486a()).mo20141a(fVar).mo238020d($$Lambda$StartImportRequesterManagerImpl$yc6aykq2rerJFUB7BVMdLtUmFg.INSTANCE).mo238013c(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$StartImportRequesterManagerImpl$DXh_YreLN3IomUqIyEGzV_rIsNA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StartImportRequesterManagerImpl.this.m26055b((StartImportRequesterManagerImpl) ((AbstractC70022d) obj));
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$StartImportRequesterManagerImpl$4N2cmnVG1mNlLTq5ih19DVsoDU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StartImportRequesterManagerImpl.this.m26050a((StartImportRequesterManagerImpl) ((StartImportRequesterManagerImpl.StartImportResult) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$StartImportRequesterManagerImpl$Jq2xeWg6L6B0YFY5d7I8FgFOY8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StartImportRequesterManagerImpl.this.m26057d((Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c
    /* renamed from: a */
    public void mo25940a(String str, String str2, int i) {
        this.f17920d.mo237937a(((an) KoinJavaComponent.m268610a(an.class)).mo16405c().mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$StartImportRequesterManagerImpl$sm_DpOqqiFw5JxajLeygcNLMasY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return StartImportRequesterManagerImpl.this.m26048a((AccountService.Account) obj);
            }
        }).mo238018d(new Consumer(str, i) {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$StartImportRequesterManagerImpl$KuW32lVsDTSwLc4g_kvag7_HY */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StartImportRequesterManagerImpl.this.m26052a((StartImportRequesterManagerImpl) this.f$1, (String) this.f$2, (int) ((String) obj));
            }
        }));
    }
}
