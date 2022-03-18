package com.bytedance.ee.bear.drive.biz.importfile.reliablesdk;

import androidx.core.util.C0844e;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.importfile.reliablesdk.importresultmodel.ImportFileJsonStringResult;
import com.bytedance.ee.bear.drive.biz.importfile.reliablesdk.importresultmodel.ImportFileResult;
import com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c;
import com.bytedance.ee.bear.drive.biz.importfile.request.CheckImportRequester;
import com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImpl;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.ImportFailedType;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.log.C13479a;
import kotlin.jvm.functions.Function0;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.reliablesdk.a */
public class C6480a {

    /* renamed from: a */
    public StartImportRequesterManagerImpl f17889a;

    /* renamed from: b */
    public AbstractC6498c.AbstractC6500a f17890b;

    /* renamed from: c */
    public C7128a f17891c;

    /* renamed from: d */
    public String f17892d = "";

    /* renamed from: e */
    private RnPushProtocol f17893e;

    /* renamed from: a */
    public void mo25899a() {
        RnPushProtocol rnPushProtocol = this.f17893e;
        if (rnPushProtocol != null) {
            rnPushProtocol.mo40241a();
        }
    }

    /* renamed from: a */
    public void mo25900a(String str) {
        this.f17892d = str;
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.reliablesdk.a$a */
    public class C6482a implements RnPushProtocol.AbstractC10622a {
        private C6482a() {
            C6480a.this = r1;
        }

        @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
        public void didReceivePush(String str) {
            C13479a.m54772d("ImportFileListener", "ImportFile received reliable SDK import result: " + str);
            ImportFileResult b = C6480a.this.mo25902b(str);
            if (b != null) {
                C13479a.m54772d("ImportFileListener", "received ticket " + b.getTicket() + " real file ticket " + C6480a.this.f17892d);
                if (!C6480a.this.f17892d.equals(b.getTicket())) {
                    return;
                }
                if (b.getTokens() == null || b.getCode() != 0) {
                    if (b.getCode() != 0 && !C6480a.this.f17889a.mo25996c()) {
                        C6480a.this.f17889a.mo25994a(true);
                        C6480a.this.f17891c.mo27895b(C6480a.this.f17889a.mo25943g().mo27485a(), "check_import_result");
                        C0844e<String, String> b2 = CheckImportRequester.m26042b(new NetService.ServerErrorException(b.getCode(), "", "", ""));
                        C6480a.this.f17891c.mo27888a(b2.f3317a, b2.f3318b, C6480a.this.f17889a.mo25943g().mo27485a());
                        ImportFailedType a = CheckImportRequester.m26039a(new NetService.ServerErrorException(b.getCode(), "", "", ""));
                        C13479a.m54764b("ImportFileListener", "checkImportResult error code = " + b.getCode());
                        C6480a.this.f17890b.mo25885a(a);
                    }
                } else if (!CollectionUtils.isEmpty(b.getTokens())) {
                    String str2 = b.getTokens().get(0);
                    String url = b.getUrl();
                    String type = b.getType();
                    if (str2 != null && !C6480a.this.f17889a.mo25996c()) {
                        C6480a.this.f17889a.mo25994a(true);
                        C13479a.m54772d("ImportFileListener", "ImportFile: go to doc activity by Reliable SDK");
                        C6480a.this.f17891c.mo27895b(C6480a.this.f17889a.mo25943g().mo27485a(), "check_import_result");
                        C6480a.this.f17891c.mo27888a("success", "DEC0", C6480a.this.f17889a.mo25943g().mo27485a());
                        C6480a.this.f17890b.mo25887a(type, str2, url);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public ImportFileResult mo25902b(String str) {
        String c = m26034c(str);
        if (c != null) {
            try {
                return (ImportFileResult) JSON.parseObject(c, ImportFileResult.class);
            } catch (Exception unused) {
                C13479a.m54758a("ImportFileListener", "ImportFile: parse result json failed");
            }
        }
        return null;
    }

    /* renamed from: c */
    private String m26034c(String str) {
        ImportFileJsonStringResult importFileJsonStringResult;
        try {
            importFileJsonStringResult = (ImportFileJsonStringResult) JSON.parseObject(str, ImportFileJsonStringResult.class);
        } catch (Exception unused) {
            C13479a.m54758a("ImportFileListener", "ImportFile: get data json failed");
            importFileJsonStringResult = null;
        }
        if (importFileJsonStringResult == null || importFileJsonStringResult.getData() == null || importFileJsonStringResult.getData().getBody() == null) {
            return null;
        }
        return importFileJsonStringResult.getData().getBody().getData();
    }

    public C6480a(StartImportRequesterManagerImpl startImportRequesterManagerImpl, C7128a aVar) {
        this.f17889a = startImportRequesterManagerImpl;
        this.f17891c = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DefinitionParameters m26033a(String str, String str2) {
        return C70039b.m268661a(str, str2);
    }

    /* renamed from: a */
    public void mo25901a(String str, String str2, AbstractC6498c.AbstractC6500a aVar) {
        this.f17890b = aVar;
        RnPushProtocol rnPushProtocol = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new Function0(str, str2) {
            /* class com.bytedance.ee.bear.drive.biz.importfile.reliablesdk.$$Lambda$a$gFzPn3TtviLzxQCAzM1GY4dWHY */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6480a.m269368lambda$gFzPn3TtviLzxQCAzM1GY4dWHY(this.f$0, this.f$1);
            }
        });
        this.f17893e = rnPushProtocol;
        rnPushProtocol.mo40242a(new C6482a());
    }
}
