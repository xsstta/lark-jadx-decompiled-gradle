package com.bytedance.ee.bear.middleground.drive.rustsdk.init;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.drive.DriveCommonConstants;
import com.bytedance.ee.bear.middleground.drive.export.DriveRustFgConfig;
import com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g;
import com.bytedance.ee.bear.middleground.drive.rustsdk.init.DriveRustSdkWrapper;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.space.drive.v1.DriveRustConfig;
import com.bytedance.lark.pb.space.drive.v1.InitDriveRequest;
import com.bytedance.lark.pb.space.drive.v1.InitDriveResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.C57744a;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import java.io.IOException;
import org.json.JSONObject;

public class DriveRustSdkWrapper {

    /* renamed from: a */
    private static volatile C9396a f25255a;

    /* renamed from: b */
    private static volatile DriveRustSdkWrapper f25256b;

    /* access modifiers changed from: private */
    public static final class CCMCacheConfig implements NonProguard {
        public ConfigItem drive;

        /* access modifiers changed from: private */
        public static final class ConfigItem implements NonProguard {
            @JSONField(name = "time_limit")
            public long timeLimit;

            private ConfigItem() {
            }
        }

        private CCMCacheConfig() {
        }

        public static CCMCacheConfig parse(String str) {
            if (TextUtils.isEmpty(str)) {
                C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "parse CCMCacheConfig null");
                return null;
            }
            try {
                CCMCacheConfig cCMCacheConfig = (CCMCacheConfig) JSON.parseObject(new JSONObject(str).getString("ccm"), CCMCacheConfig.class);
                if (cCMCacheConfig.drive != null) {
                    return cCMCacheConfig;
                }
                return null;
            } catch (Exception e) {
                C13479a.m54759a("Middleground_Drive_DriveRustSdkWrapper", "parse CCMCacheConfig fail. ", e);
            }
        }
    }

    private DriveRustSdkWrapper() {
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.init.DriveRustSdkWrapper$a */
    public static class C9396a {

        /* renamed from: a */
        public String f25258a;

        /* renamed from: b */
        public String f25259b;

        /* renamed from: c */
        public String f25260c;

        /* renamed from: d */
        public String f25261d;

        /* renamed from: e */
        public String f25262e;

        /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.init.DriveRustSdkWrapper$a$a */
        public static final class C9397a {

            /* renamed from: a */
            private String f25263a;

            /* renamed from: b */
            private String f25264b;

            /* renamed from: c */
            private String f25265c;

            /* renamed from: d */
            private String f25266d;

            /* renamed from: e */
            private String f25267e;

            /* renamed from: a */
            public C9396a mo35844a() {
                return new C9396a(this.f25263a, this.f25264b, this.f25265c, this.f25266d, this.f25267e);
            }

            /* renamed from: a */
            public C9397a mo35843a(String str) {
                this.f25263a = str;
                return this;
            }

            /* renamed from: b */
            public C9397a mo35845b(String str) {
                this.f25264b = str;
                return this;
            }

            /* renamed from: c */
            public C9397a mo35846c(String str) {
                this.f25265c = str;
                return this;
            }

            /* renamed from: d */
            public C9397a mo35847d(String str) {
                this.f25266d = str;
                return this;
            }

            /* renamed from: e */
            public C9397a mo35848e(String str) {
                this.f25267e = str;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            C9396a aVar = (C9396a) obj;
            if (!TextUtils.equals(this.f25258a, aVar.f25258a) || !TextUtils.equals(this.f25259b, aVar.f25259b) || !TextUtils.equals(this.f25260c, aVar.f25260c) || !TextUtils.equals(this.f25261d, aVar.f25261d) || !TextUtils.equals(this.f25262e, aVar.f25262e)) {
                return false;
            }
            return true;
        }

        private C9396a(String str, String str2, String str3, String str4, String str5) {
            this.f25258a = str;
            this.f25259b = str2;
            this.f25260c = str3;
            this.f25261d = str4;
            this.f25262e = str5;
        }
    }

    /* renamed from: a */
    private static DriveRustSdkWrapper m38804a() {
        if (f25256b == null) {
            synchronized (DriveRustSdkWrapper.class) {
                if (f25256b == null) {
                    f25256b = new DriveRustSdkWrapper();
                }
            }
        }
        return f25256b;
    }

    /* renamed from: f */
    private SdkSender.IParser<Boolean> m38813f(C9396a aVar) {
        return $$Lambda$DriveRustSdkWrapper$z9MdBilxK1L5yQdAMk0y58WaJt0.INSTANCE;
    }

    /* renamed from: d */
    private boolean m38811d(C9396a aVar) {
        return aVar.equals(f25255a);
    }

    /* renamed from: b */
    public static boolean m38809b(C9396a aVar) {
        return m38804a().m38810c(aVar);
    }

    /* renamed from: g */
    private void m38814g(C9396a aVar) {
        if (C13629i.m55308c()) {
            C36808a.m145207a(aVar.f25262e, Long.valueOf(aVar.f25260c).longValue(), aVar.f25259b);
        }
    }

    /* renamed from: a */
    public static AbstractC68307f<Boolean> m38805a(C9396a aVar) {
        return AbstractC68307f.m265080a(new AbstractC68324h() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.$$Lambda$DriveRustSdkWrapper$815758nzWBywY7oRjYKrwmFn6wE */

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                DriveRustSdkWrapper.m38808a(DriveRustSdkWrapper.C9396a.this, gVar);
            }
        }, BackpressureStrategy.BUFFER).mo238004b(C11678b.m48479c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m38806a(byte[] bArr) throws IOException {
        InitDriveResponse decode = InitDriveResponse.ADAPTER.decode(bArr);
        C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "DriveRustPBWrapper sync parse: response=" + decode.toString());
        if (!decode.result.booleanValue()) {
            f25255a = null;
        }
        return decode.result;
    }

    /* renamed from: c */
    private synchronized boolean m38810c(C9396a aVar) {
        C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "DriveRustPBWrapper sync initSdk: ");
        if (m38811d(aVar)) {
            return true;
        }
        f25255a = aVar;
        C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "DriveRustPBWrapper sync initSdk: real ");
        boolean z = false;
        try {
            m38814g(aVar);
            C9379g.m38738a().mo35804b(false);
            z = ((Boolean) SdkSender.syncSend(Command.SUITE_DRIVE_INIT_DRIVE, m38812e(aVar), m38813f(aVar))).booleanValue();
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustSdkWrapper", "DriveRustPBWrapper sync initSdk: ", e);
        }
        return z;
    }

    /* renamed from: e */
    private InitDriveRequest.C19365a m38812e(C9396a aVar) {
        long j;
        try {
            DriveCommonConstants.DriveRustFgConfig driveRustFgConfig = (DriveCommonConstants.DriveRustFgConfig) C4211a.m17514a().mo16532a("drive_rust_config", DriveCommonConstants.DriveRustFgConfig.class, new DriveCommonConstants.DriveRustFgConfig());
            DriveRustFgConfig driveRustFgConfig2 = new DriveRustFgConfig(driveRustFgConfig.disable_cdn_download, driveRustFgConfig.max_thread_size, driveRustFgConfig.max_download_part_size, C4211a.m17514a().mo16536a("spacekit.mobile.drive.pause.background", false));
            C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "getInitDriveRequest rustConfig = " + driveRustFgConfig2);
            CCMCacheConfig parse = CCMCacheConfig.parse(C57744a.m224104a().getString("key_disk_manage_setting", ""));
            if (parse != null) {
                j = parse.drive.timeLimit;
            } else {
                j = 1296000;
            }
            if (C57744a.m224104a().getBoolean("small_disk_on", false)) {
                j = (long) (((float) j) * C57744a.m224104a().getFloat("disk_timeout_factor", 1.0f));
            }
            C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "getInitDriveRequest exceedTime = " + j);
            DriveRustConfig a = new DriveRustConfig.C19361a().mo65965a(Integer.valueOf(driveRustFgConfig2.max_thread_size)).mo65968b(Integer.valueOf(driveRustFgConfig2.max_download_part_size)).mo65964a(Boolean.valueOf(driveRustFgConfig2.pause_background)).mo65967b((Boolean) true).mo65969c(Integer.valueOf((int) j)).build();
            InitDriveRequest.C19365a aVar2 = new InitDriveRequest.C19365a();
            aVar2.mo65979a(aVar.f25258a).mo65983c(aVar.f25259b).mo65982b(aVar.f25260c).mo65985e(aVar.f25261d).mo65984d(aVar.f25262e).mo65978a((Boolean) false).mo65977a(a).mo65981b(Boolean.valueOf(driveRustFgConfig2.disable_cdn_download));
            return aVar2;
        } catch (Exception e) {
            C13479a.m54758a("Middleground_Drive_DriveRustSdkWrapper", "getInitDriveRequest crash" + e);
            InitDriveRequest.C19365a aVar3 = new InitDriveRequest.C19365a();
            aVar3.mo65979a(aVar.f25258a).mo65983c(aVar.f25259b).mo65982b(aVar.f25260c).mo65985e(aVar.f25261d).mo65984d(aVar.f25262e).mo65978a((Boolean) false);
            return aVar3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m38808a(C9396a aVar, final AbstractC68323g gVar) throws Exception {
        m38804a().m38807a(aVar, new IGetDataCallback<Boolean>() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.init.DriveRustSdkWrapper.C93951 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "init drive rust Sdk onSuccess: " + bool);
                gVar.onNext(bool);
                gVar.onComplete();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C13479a.m54758a("Middleground_Drive_DriveRustSdkWrapper", "init drive rust Sdk onError: " + errorResult);
                gVar.onError(new Exception("init drive rust Sdk error"));
                gVar.onComplete();
            }
        });
    }

    /* renamed from: a */
    private synchronized void m38807a(C9396a aVar, IGetDataCallback<Boolean> iGetDataCallback) {
        C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "DriveRustPBWrapper initSdk: ");
        if (m38811d(aVar)) {
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(true);
            }
            return;
        }
        f25255a = aVar;
        C13479a.m54764b("Middleground_Drive_DriveRustSdkWrapper", "DriveRustPBWrapper initSdk: real ");
        try {
            m38814g(aVar);
            C9379g.m38738a().mo35804b(false);
            SdkSender.asynSendRequestNonWrap(Command.SUITE_DRIVE_INIT_DRIVE, m38812e(aVar), iGetDataCallback, m38813f(aVar));
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustSdkWrapper", "DriveRustPBWrapper initSdk: ", e);
        }
    }
}
