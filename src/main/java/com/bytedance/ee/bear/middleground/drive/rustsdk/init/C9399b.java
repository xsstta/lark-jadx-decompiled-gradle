package com.bytedance.ee.bear.middleground.drive.rustsdk.init;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.middleground.drive.Drive;
import com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13618f;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p718t.C13748k;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.pb.basic.v1.NoticeClientEventRequest;
import com.bytedance.lark.pb.basic.v1.SetEnvRequest;
import com.bytedance.lark.pb.basic.v1.SetEnvResponse;
import com.bytedance.lark.pb.device.v1.SetDeviceRequest;
import com.bytedance.lark.pb.tool.v1.InitNetRequest;
import com.bytedance.lark.pb.tool.v1.SetAccessTokenOnlyRequest;
import com.bytedance.lark.pb.tool.v1.SetDomainAliasRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.sdk.SdkSender;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.init.b */
public class C9399b {

    /* renamed from: a */
    private static volatile C9399b f25268a;

    /* renamed from: b */
    private static volatile boolean f25269b;

    /* renamed from: h */
    private static AbstractC9402a f25270h;

    /* renamed from: c */
    private NoticeClientEventRequest.Event f25271c;

    /* renamed from: d */
    private C10917c f25272d = new C10917c(new C10929e());

    /* renamed from: e */
    private volatile int f25273e;

    /* renamed from: f */
    private PersistenceSharedPreference f25274f;

    /* renamed from: g */
    private SharedPreferences.OnSharedPreferenceChangeListener f25275g = new SharedPreferences.OnSharedPreferenceChangeListener() {
        /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.$$Lambda$b$jeTXjPUTzry2B1wyryYmDLEfcTc */

        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            C9399b.this.m38831a((C9399b) sharedPreferences, (SharedPreferences) str);
        }
    };

    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.init.b$a */
    public interface AbstractC9402a {
        /* renamed from: a */
        void mo35857a();

        /* renamed from: a */
        void mo35858a(String str, Context context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Object m38830a(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Object m38839b(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m38841c(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Object m38842d(byte[] bArr) throws IOException {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ byte[] m38843e(byte[] bArr) throws IOException {
        return new byte[0];
    }

    public static /* synthetic */ Boolean lambda$0bTL_08zeXWSR9lQp0vxtVpWSCc(byte[] bArr) {
        return true;
    }

    /* renamed from: i */
    private Context m38847i() {
        return C13615c.f35773a;
    }

    /* renamed from: a */
    private void m38838a(boolean z) {
        String str;
        if (C13629i.m55302a() || C13629i.m55308c()) {
            C13479a.m54764b("BaseRustServiceImp", "drive lazyInit start");
            String b = CCMStorage.m21715b(m38847i(), Biz.RUSTSDK, "suiteDrive");
            if (C13629i.m55302a()) {
                str = new File(b, "main").getAbsolutePath();
            } else {
                str = new File(b, "space").getAbsolutePath();
            }
            if (!f25269b || !C13629i.m55302a()) {
                C9379g.m38741a(C13629i.m55302a());
            } else {
                C9379g.m38741a(false);
            }
            if (z) {
                Drive.f25098c.mo35611a(m38847i(), this.f25272d).mo35610b($$Lambda$b$GIz0bgRQzA4H_lwfO82t5_gh6Q.INSTANCE, str);
            } else {
                Drive.f25098c.mo35611a(m38847i(), this.f25272d).mo35607a($$Lambda$b$NVjxljPkxcbenIP48_JG13Y_PM.INSTANCE, str);
            }
        }
    }

    /* renamed from: a */
    public void mo35849a(AccountService.Account account) {
        if (!C13629i.m55302a()) {
            SetAccessTokenOnlyRequest.C19747a aVar = new SetAccessTokenOnlyRequest.C19747a();
            aVar.mo66897a(account.f14591h);
            aVar.mo66899b(account.f14584a);
            SdkSender.asynSendRequestNonWrap(Command.SET_ACCESS_TOKEN_ONLY, aVar, null, $$Lambda$b$qZGhBAhExU6e8cCO6vLBQ9GLROU.INSTANCE);
            C13479a.m54764b("BaseRustServiceImp", "setAccessTokenOnlyRequest by account... ok, uid=" + account.f14584a + " token is empty=" + TextUtils.isEmpty(account.f14591h));
        }
    }

    /* renamed from: r */
    private void m38856r() {
        AbstractC9402a aVar = f25270h;
        if (aVar != null) {
            aVar.mo35857a();
        }
    }

    /* renamed from: e */
    public void mo35853e() {
        C13479a.m54764b("BaseRustServiceImp", "onConfigChanged()...");
        m38840b(true);
    }

    /* renamed from: f */
    public void mo35854f() {
        m38851m();
        m38852n();
        m38855q();
    }

    private C9399b() {
        m38845g();
    }

    /* renamed from: a */
    public static C9399b m38827a() {
        if (f25268a == null) {
            synchronized (C9399b.class) {
                if (f25268a == null) {
                    f25268a = new C9399b();
                }
            }
        }
        return f25268a;
    }

    /* renamed from: h */
    private void m38846h() {
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(new RustSdkServiceImp$1(this));
    }

    /* renamed from: m */
    private void m38851m() {
        C4511g.m18594d().mo17368r().map($$Lambda$b$agMUF9tG8csOhOnBHcDq27A8f4.INSTANCE).subscribe($$Lambda$b$SfqkGW9IYxExe_CrDn7sfTTTwU.INSTANCE, $$Lambda$b$lyVTuG6FAfAtVVq11WiGeMVmSWc.INSTANCE);
    }

    /* renamed from: q */
    private void m38855q() {
        InitNetRequest.C19713a aVar = new InitNetRequest.C19713a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitNetRequest.HostAlias.DOCS_DRIVE);
        arrayList.add(InitNetRequest.HostAlias.DOCS_API);
        aVar.mo66816a(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.INIT_NET, aVar, null, $$Lambda$b$aOsix9uLAO5_Gvs4WETvp_KpCY.INSTANCE);
    }

    /* renamed from: b */
    public boolean mo35850b() {
        int i;
        if ((f25269b && C13629i.m55302a()) || (i = this.f25273e) == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo35851c() {
        C13479a.m54764b("BaseRustServiceImp", "drive initDrive");
        if (f25269b && C13629i.m55302a()) {
            m38856r();
        }
        m38838a(false);
    }

    /* renamed from: d */
    public void mo35852d() {
        if (!Drive.f25098c.mo35611a(m38847i(), this.f25272d).mo35609a()) {
            m38838a(true);
        }
    }

    /* renamed from: j */
    private boolean m38848j() {
        if (f25269b && C13629i.m55302a()) {
            return true;
        }
        if (C13629i.m55305b(m38847i(), ":p0")) {
            this.f25273e = 1;
        } else if (C13629i.m55302a()) {
            this.f25273e = 2;
        }
        if (this.f25273e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m38849k() {
        LiveData<Boolean> liveData;
        AbstractC5238z j = C5102ai.m20872j();
        if (C13629i.m55302a()) {
            liveData = j.mo20208a();
        } else {
            liveData = j.mo20210b();
        }
        LiveData<Boolean> c = j.mo20211c();
        C1174u uVar = new C1174u();
        uVar.mo6042a(liveData, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.$$Lambda$wQsDUZOJbWbeH2rZVx42VorIw5w */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C1174u.this.mo5926a((Boolean) obj);
            }
        });
        uVar.mo6042a(c, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.$$Lambda$wQsDUZOJbWbeH2rZVx42VorIw5w */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C1174u.this.mo5926a((Boolean) obj);
            }
        });
        C13748k.m55732a(new Runnable(uVar, liveData, c) {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.$$Lambda$b$feCAl_zkDtzJbNp4dvvaWVdkPcM */
            public final /* synthetic */ C1174u f$1;
            public final /* synthetic */ LiveData f$2;
            public final /* synthetic */ LiveData f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C9399b.this.m38834a((C9399b) this.f$1, (C1174u) this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: l */
    private void m38850l() {
        SetDomainAliasRequest.C19753a aVar = new SetDomainAliasRequest.C19753a();
        al d = C4511g.m18594d();
        if (!TextUtils.isEmpty(d.mo17362l())) {
            aVar.f48218a.put(d.mo17362l(), DomainSettings.Alias.DOCS_API);
        } else {
            C13479a.m54758a("BaseRustServiceImp", "setDomainAlias: getDocsInterfaceDomain maybe return empty");
        }
        SdkSender.asynSendRequestNonWrap(Command.SET_DOMAIN_ALIAS, aVar, new IGetDataCallback<byte[]>() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.C9399b.C94012 */

            /* renamed from: a */
            public void onSuccess(byte[] bArr) {
                C13479a.m54764b("BaseRustServiceImp", "setDomainAlias() success");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                if (errorResult != null) {
                    str = errorResult.getErrorMsg();
                } else {
                    str = "";
                }
                C13479a.m54764b("BaseRustServiceImp", "setDomainAlias() failure: " + str);
            }
        }, $$Lambda$b$oOsRW7D_Zg3V_5NZz852loEeZsg.INSTANCE);
        C13479a.m54764b("BaseRustServiceImp", "setDomainAlias()");
    }

    /* renamed from: o */
    private void m38853o() {
        PersistenceSharedPreference aVar;
        if (((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20121b() != 2 || (aVar = this.f25274f) == null) {
            C9398a.m38823a("");
            return;
        }
        C9398a.m38823a("#" + ((String) aVar.mo34038b("http_request_id", "")));
    }

    /* renamed from: p */
    private void m38854p() {
        PersistenceSharedPreference aVar = this.f25274f;
        if (aVar != null) {
            String str = (String) aVar.mo34038b("ip_proxy_rust", "");
            if (!TextUtils.isEmpty(str) && str.contains(":")) {
                Uri parse = Uri.parse(str);
                String host = parse.getHost();
                C9398a.m38824a(host, parse.getPort() + "", false);
            }
        }
    }

    /* renamed from: s */
    private boolean m38857s() {
        al d = C4511g.m18594d();
        boolean F = d.mo17345F();
        boolean D = d.mo17343D();
        C13479a.m54758a("BaseRustServiceImp", "isLarkUnit is " + F + " isLarkPackage is " + D);
        if (F == D) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m38845g() {
        if (m38848j()) {
            String a = C13618f.m55265a(m38847i());
            PersistenceSharedPreference aVar = new PersistenceSharedPreference("debug_config");
            this.f25274f = aVar;
            aVar.registerOnSharedPreferenceChangeListener(this.f25275g);
            m38836a(a, m38847i());
            m38853o();
            m38854p();
            m38846h();
        }
        m38850l();
        if (!m38857s() && !C13629i.m55302a()) {
            m38840b(false);
        }
        mo35851c();
    }

    /* renamed from: n */
    private void m38852n() {
        if (!C13629i.m55302a()) {
            String v = C4511g.m18594d().mo17372v();
            if (!TextUtils.isEmpty(v)) {
                SetAccessTokenOnlyRequest.C19747a aVar = new SetAccessTokenOnlyRequest.C19747a();
                aVar.mo66897a(v);
                AccountService.Account d = ((an) KoinJavaComponent.m268610a(an.class)).mo16406d();
                if (d != null && d.mo19677a()) {
                    C13479a.m54764b("BaseRustServiceImp", "setAccessTokenOnlyRequest()... set uid");
                    aVar.mo66899b(d.f14584a);
                }
                SdkSender.asynSendRequestNonWrap(Command.SET_ACCESS_TOKEN_ONLY, aVar, null, $$Lambda$b$OGzXtlFovqcnHjBG3uBINS3P4yo.INSTANCE);
                C13479a.m54764b("BaseRustServiceImp", "setAccessTokenOnlyRequest()... ok");
                return;
            }
            C13479a.m54758a("BaseRustServiceImp", "setAccessTokenOnlyRequest()... token is empty");
        }
    }

    /* renamed from: a */
    private InitSDKRequest.EnvV2 m38828a(int i) {
        String str;
        DocDynamicConfig k = C4511g.m18594d().mo17361k();
        if (k != null) {
            str = k.mo20231g();
        } else {
            str = "";
        }
        if (i == 6) {
            i = 2;
            str = "boecn";
        }
        return new InitSDKRequest.EnvV2(InitSDKRequest.EnvV2.Type.fromValue(i), str, "");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m38829a(String str) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            SetDeviceRequest.C16592a aVar = new SetDeviceRequest.C16592a();
            aVar.mo59022a(str).mo59025b(Build.VERSION.RELEASE).mo59026c(Build.MODEL);
            SdkSender.asynSendRequestNonWrap(Command.SET_DEVICE, aVar, null, $$Lambda$b$OwXAIdybqX6UiKYdHm8fMKFDyC8.INSTANCE);
            return true;
        }
        C13479a.m54758a("BaseRustServiceImp", "setDeviceId()... deviceId is empty");
        return false;
    }

    /* renamed from: b */
    private void m38840b(final boolean z) {
        int i;
        int t = C4511g.m18594d().mo17370t();
        C13479a.m54764b("BaseRustServiceImp", "setEnv: env = " + t + " isInitDrive is " + z);
        SetEnvRequest.C15268a aVar = new SetEnvRequest.C15268a();
        if (t != 6) {
            i = t;
        } else {
            i = 2;
        }
        SetEnvRequest.C15268a a = aVar.mo55574a(InitSDKRequest.EnvType.fromValue(i)).mo55575a(m38828a(t));
        Command command = Command.SET_ENV;
        C94001 r2 = new IGetDataCallback<SetEnvResponse>() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.C9399b.C94001 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(SetEnvResponse setEnvResponse) {
                C9399b.this.mo35854f();
                if (z) {
                    C9399b.this.mo35851c();
                }
            }
        };
        ProtoAdapter<SetEnvResponse> protoAdapter = SetEnvResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, r2, new SdkSender.IParser() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.$$Lambda$s31wCbsDN4llinAb2RLU51AnXo */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SetEnvResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m38835a(Boolean bool) throws Exception {
        C13479a.m54764b("BaseRustServiceImp", "setRustSdkParams()... setDeviceId: result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38831a(SharedPreferences sharedPreferences, String str) {
        if ("http_request_id".equals(str)) {
            m38853o();
        }
        if ("ip_proxy_rust".equals(str)) {
            m38854p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38832a(LiveData liveData, LiveData liveData2) {
        NoticeClientEventRequest.Event event = NoticeClientEventRequest.Event.ENTER_BACKGROUND;
        if (liveData.mo5927b() != null && ((Boolean) liveData.mo5927b()).booleanValue()) {
            event = NoticeClientEventRequest.Event.ENTER_FOREGROUND;
        }
        if (liveData2.mo5927b() != null && ((Boolean) liveData2.mo5927b()).booleanValue()) {
            event = NoticeClientEventRequest.Event.ENTER_FOREGROUND;
        }
        C13479a.m54764b("BaseRustServiceImp", "doc process isForeground event: " + event.name());
        if (this.f25271c != event) {
            SdkSender.asynSendRequestNonWrap(Command.NOTICE_CLIENT_EVENT, new NoticeClientEventRequest.C15097a().mo55075a(NoticeClientEventRequest.Event.fromValue(event.getValue())), null, $$Lambda$b$0bTL_08zeXWSR9lQp0vxtVpWSCc.INSTANCE);
            this.f25271c = event;
        }
    }

    /* renamed from: a */
    private void m38836a(String str, Context context) {
        if (f25270h != null) {
            C13479a.m54764b("BaseRustServiceImp", "only run initSdkCommon in demo");
            f25270h.mo35858a(str, context);
        }
        m38849k();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38833a(LiveData liveData, LiveData liveData2, Boolean bool) {
        C13608f.m55249a(new Runnable(liveData, liveData2) {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.$$Lambda$b$dY4waAseBwpjdaS28eCtgZTavYU */
            public final /* synthetic */ LiveData f$1;
            public final /* synthetic */ LiveData f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C9399b.this.m38832a((C9399b) this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38834a(C1174u uVar, LiveData liveData, LiveData liveData2) {
        uVar.mo5925a((AbstractC1178x) new AbstractC1178x(liveData, liveData2) {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.$$Lambda$b$Q5GwVunfjZNC_UI87cx1IksskPA */
            public final /* synthetic */ LiveData f$1;
            public final /* synthetic */ LiveData f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C9399b.this.m38833a((C9399b) this.f$1, this.f$2, (LiveData) ((Boolean) obj));
            }
        });
    }
}
