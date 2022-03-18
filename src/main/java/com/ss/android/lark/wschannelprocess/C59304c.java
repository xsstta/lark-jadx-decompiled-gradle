package com.ss.android.lark.wschannelprocess;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.wschannelprocess.dto.AppLogEntity;
import com.ss.android.lark.wschannelprocess.dto.TeaLogEntity;
import com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a;
import com.ss.android.lark.wschannelprocess.p2986b.C59301a;
import com.ss.android.lark.wschannelprocess.wschannelipc.C59330a;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.wschannelprocess.c */
public class C59304c {

    /* renamed from: a */
    boolean f147267a;

    /* renamed from: b */
    boolean f147268b;

    /* renamed from: c */
    private C59330a f147269c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.wschannelprocess.c$a */
    public static class C59306a {

        /* renamed from: a */
        public static final C59304c f147270a = new C59304c();
    }

    /* renamed from: a */
    public static C59304c m230268a() {
        return C59306a.f147270a;
    }

    private C59304c() {
        this.f147269c = new C59330a();
    }

    /* renamed from: g */
    public void mo201581g() {
        Log.m165389i("WschannelMgrService", "stopWschannelConnect");
        C59301a.m230265a(true);
    }

    /* renamed from: j */
    private boolean m230269j() {
        if (!RomUtils.m94933a() || !C59307d.m230286b().mo177783a("byteview.callmeeting.android.huawei.push", false)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo201574b() {
        AbstractC59297a b = C59307d.m230286b();
        if (b != null) {
            return b.mo177787e();
        }
        Log.m165383e("WschannelMgrService", "getUserLoginSession get module dependency is null ");
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo201578d() {
        AbstractC59297a b = C59307d.m230286b();
        if (b != null) {
            return b.mo177785c();
        }
        Log.m165383e("WschannelMgrService", "getEnvType get module dependency is null ");
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo201579e() {
        AbstractC59297a b = C59307d.m230286b();
        if (b != null) {
            return b.mo177786d();
        }
        Log.m165383e("WschannelMgrService", "getLongDomain get module dependency is null ");
        return null;
    }

    /* renamed from: i */
    public boolean mo201583i() {
        boolean b = this.f147269c.mo201659b();
        Log.m165389i("WschannelMgrService", "dealVcVoipNotification success: " + b);
        return b;
    }

    /* renamed from: k */
    private boolean m230270k() {
        if (!C59307d.m230286b().mo177783a("lark.wschannel.idle.connect", false) || RomUtils.m94933a() || RomUtils.m94944c() || RomUtils.m94946d() || RomUtils.m94940b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo201576c() {
        AbstractC59297a b = C59307d.m230286b();
        if (b == null) {
            Log.m165383e("WschannelMgrService", "getDeviceId get module dependency is null ");
            return "";
        }
        String b2 = b.mo177784b();
        if (C26284k.m95185a(C59307d.m230286b().mo177782a())) {
            Log.m165389i("WschannelMgrService", "getDeviceId get device is is " + b2);
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo201582h() {
        if (C59307d.m230286b() == null) {
            Log.m165383e("WschannelMgrService", "getDeviceId get module dependency is null ");
            return false;
        }
        boolean a = this.f147269c.mo201658a();
        Log.m165389i("WschannelMgrService", "updateMainProcDozeState bDoze is " + a);
        return a;
    }

    /* renamed from: f */
    public void mo201580f() {
        String c = mo201576c();
        String b = mo201574b();
        int d = mo201578d();
        String e = mo201579e();
        Log.m165389i("WschannelMgrService", "startWschannelConnect");
        Log.m165379d("WschannelMgrService", "run spinUpFrontier deviceId=" + c + ", envtyp is " + d + ", longDomain is " + e);
        if (b != null && b.length() >= 3 && !TextUtils.isEmpty(e)) {
            C59301a.m230265a(false);
            C59301a.m230264a(c, b, d, e);
        }
    }

    /* renamed from: a */
    public void mo201573a(boolean z) {
        Log.m165389i("WschannelMgrService", "handleWschannelConnStateChange received wschannel new state is " + z);
    }

    /* renamed from: b */
    public synchronized void mo201575b(boolean z) {
        this.f147268b = z;
        Log.m165389i("WschannelMgrService", "dealMainProcDozeStateChange bDoze is " + z);
        if (this.f147267a) {
            Log.m165389i("WschannelMgrService", "dealMainProcDozeStateChange main proc doze state is " + z + ", wschannel proc doze state is true, so return!");
            return;
        }
        if (!z) {
            mo201581g();
        } else if (!m230269j()) {
            mo201580f();
        }
    }

    /* renamed from: c */
    public synchronized void mo201577c(boolean z) {
        this.f147267a = z;
        Log.m165389i("WschannelMgrService", "dealWschannelProcDozeStateChange bDoze is " + z);
        boolean h = mo201582h();
        this.f147268b = h;
        if (!h) {
            Log.m165389i("WschannelMgrService", "dealWschannelProcDozeStateChange wschannel proc doze state is " + z + ", main proc doze state is false, so return!");
            return;
        }
        if (z) {
            if (m230270k()) {
                Log.m165389i("WschannelMgrService", "disableOffline");
                return;
            }
            mo201581g();
        } else if (!m230269j()) {
            mo201580f();
        }
    }

    /* renamed from: a */
    public void mo201572a(String str, JSONObject jSONObject) {
        Log.m165389i("WschannelMgrService", "record tea event, eventName is " + str);
        this.f147269c.mo201657a(new TeaLogEntity(str, jSONObject.toString()));
    }

    /* renamed from: a */
    public void mo201571a(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        Log.m165389i("WschannelMgrService", "record app log event");
        this.f147269c.mo201656a(new AppLogEntity(str, str2, str3, j, j2, jSONObject.toString()));
    }
}
