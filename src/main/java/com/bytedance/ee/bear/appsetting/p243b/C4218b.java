package com.bytedance.ee.bear.appsetting.p243b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.appsetting.AbstractC4216b;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.connection.C4975c;
import com.bytedance.ee.bear.connection.NetworkType;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p707j.C13684a;
import com.bytedance.ee.util.p707j.C13686b;
import com.bytedance.ee.util.p718t.C13742g;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.ss.android.lark.sp.AbstractC54924a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.appsetting.b.b */
public class C4218b implements AbstractC4216b {

    /* renamed from: a */
    public final AbstractC4223a f12729a;

    /* renamed from: b */
    private final Context f12730b;

    /* renamed from: c */
    private OkHttpClient f12731c;

    /* renamed from: d */
    private AbstractC54924a f12732d;

    /* renamed from: com.bytedance.ee.bear.appsetting.b.b$a */
    public interface AbstractC4223a {
        /* renamed from: a */
        String mo16559a();

        /* renamed from: b */
        Locale mo16560b();

        /* renamed from: c */
        boolean mo16561c();

        /* renamed from: d */
        String mo16562d();

        /* renamed from: e */
        String mo16563e();

        /* renamed from: f */
        String mo16564f();

        /* renamed from: g */
        String mo16565g();
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: b */
    public int mo16549b() {
        return 0;
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: c */
    public void mo16550c() {
        this.f12732d = null;
    }

    /* renamed from: d */
    public void mo16553d() {
        C11678b.m48478b().scheduleDirect(new Runnable() {
            /* class com.bytedance.ee.bear.appsetting.p243b.$$Lambda$b$41r_yCfErMshvQ7pcboDrPhQH1E */

            public final void run() {
                C4218b.lambda$41r_yCfErMshvQ7pcboDrPhQH1E(C4218b.this);
            }
        });
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public void mo16546a() {
        if (!m17540f()) {
            C13479a.m54758a("MinaRepository", "disconnect, sync config failed");
            return;
        }
        C13479a.m54764b("MinaRepository", "begin sync mina config");
        mo16553d();
    }

    /* renamed from: f */
    private boolean m17540f() {
        if (C4974b.m20620a(this.f12730b) != NetworkType.NETWORK_NO) {
            return true;
        }
        C13479a.m54775e("MinaRepository", "Network isn't connected, sync config later");
        final C4975c cVar = new C4975c(this.f12730b);
        C13742g.m55705a(new Runnable() {
            /* class com.bytedance.ee.bear.appsetting.p243b.C4218b.RunnableC42191 */

            public void run() {
                cVar.mo5925a((AbstractC1178x) new AbstractC1178x<NetworkType>() {
                    /* class com.bytedance.ee.bear.appsetting.p243b.C4218b.RunnableC42191.C42201 */

                    /* renamed from: a */
                    public void onChanged(NetworkType networkType) {
                        if (networkType != NetworkType.NETWORK_NO) {
                            C13479a.m54764b("MinaRepository", "Network has reconnected, begin sync config");
                            C4218b.this.mo16553d();
                            cVar.mo5928b((AbstractC1178x) this);
                        }
                    }
                });
            }
        });
        return false;
    }

    /* renamed from: h */
    private void m17542h() {
        if (this.f12731c == null) {
            this.f12731c = C12617b.m52365c().mo47928a().mo47915a(20000, TimeUnit.MILLISECONDS).mo47920b(20000, TimeUnit.MILLISECONDS).mo47917a(new Dispatcher(BearExecutors.m48467b())).mo47916a(new C13684a(new C13684a.AbstractC13685a() {
                /* class com.bytedance.ee.bear.appsetting.p243b.C4218b.C42223 */

                @Override // com.bytedance.ee.util.p707j.C13684a.AbstractC13685a
                /* renamed from: a */
                public String mo16557a() {
                    return C4218b.this.f12729a.mo16559a();
                }

                @Override // com.bytedance.ee.util.p707j.C13684a.AbstractC13685a
                /* renamed from: b */
                public Locale mo16558b() {
                    return C4218b.this.f12729a.mo16560b();
                }
            })).mo47919a();
        }
    }

    /* renamed from: i */
    private String m17543i() {
        return new Uri.Builder().scheme("https").authority(this.f12729a.mo16565g()).path("space/api/appconfig/get/").build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AbstractC54924a mo16554e() {
        AbstractC54924a aVar = this.f12732d;
        if (aVar != null) {
            return aVar;
        }
        String e = this.f12729a.mo16563e();
        if (TextUtils.isEmpty(e)) {
            C13479a.m54758a("MinaRepository", "getStorage, uid is empty");
            e = "";
        }
        UserSP userSPById = UserSP.getUserSPById(e + "mina");
        this.f12732d = userSPById;
        return userSPById;
    }

    /* renamed from: g */
    private boolean m17541g() {
        boolean z;
        if (this.f12729a.mo16562d() == null || this.f12729a.mo16563e() == null || this.f12729a.mo16564f() == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C13479a.m54758a("MinaRepository", "checkLogin failed, did = " + this.f12729a.mo16562d() + ", uid = " + this.f12729a.mo16563e() + ", tid = " + this.f12729a.mo16564f());
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m17545k() {
        if (m17541g()) {
            m17542h();
            Request.Builder url = new Request.Builder().post(m17544j()).url(m17543i());
            for (Map.Entry<String, String> entry : C13686b.m55572a(this.f12730b, this.f12729a.mo16561c(), this.f12729a.mo16562d(), this.f12729a.mo16563e(), this.f12729a.mo16560b()).entrySet()) {
                url.header(entry.getKey(), entry.getValue());
            }
            this.f12731c.newCall(url.build()).enqueue(new Callback() {
                /* class com.bytedance.ee.bear.appsetting.p243b.C4218b.C42212 */

                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    C13479a.m54759a("MinaRepository", "syncMinaConfig, onFailure", iOException);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    C13479a.m54764b("MinaRepository", "syncMinaConfig, onResponse");
                    String string = response.body().string();
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject.optInt("code") == 0) {
                            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            if (optJSONObject != null) {
                                C4218b.this.mo16552a(optJSONObject);
                                return;
                            }
                            return;
                        }
                        C13479a.m54758a("MinaRepository", "syncMinaConfig failed，data = " + string);
                    } catch (JSONException e) {
                        C13479a.m54759a("MinaRepository", "syncMinaConfig, onResponse", e);
                    }
                }
            });
        }
    }

    /* renamed from: j */
    private RequestBody m17544j() {
        String string = this.f12730b.getString(R.string.mina_version);
        if (this.f12729a.mo16561c()) {
            string = "staging-1.0";
        }
        String d = this.f12729a.mo16562d();
        String e = this.f12729a.mo16563e();
        String f = this.f12729a.mo16564f();
        C13479a.m54764b("MinaRepository", "getRequestBody, did=" + d + ", uid=" + e + ",tid=" + f);
        FormBody.Builder add = new FormBody.Builder().add("appId", "2").add(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, string).add("platform", "android");
        if (!TextUtils.isEmpty(d)) {
            add.add("device_id", d);
        }
        if (!TextUtils.isEmpty(e)) {
            add.add("user_id", e);
        }
        if (!TextUtils.isEmpty(f)) {
            add.add("tenant_id", f);
        }
        return add.build();
    }

    /* renamed from: a */
    public void mo16552a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof Boolean) {
                mo16554e().putBoolean(next, ((Boolean) opt).booleanValue());
            } else {
                mo16554e().putString(next, jSONObject.optString(next));
            }
        }
    }

    public C4218b(Context context, AbstractC4223a aVar) {
        this.f12730b = context;
        this.f12729a = aVar;
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public boolean mo16547a(String str, Class<?> cls) {
        return mo16554e().contains(str);
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public String mo16545a(String str, String str2) {
        String string = mo16554e().getString(str, str2);
        C13479a.m54764b("MinaRepository", "getString, key = " + str + ", value = " + string);
        return string;
    }

    @Override // com.bytedance.ee.bear.appsetting.AbstractC4216b
    /* renamed from: a */
    public boolean mo16548a(String str, boolean z, boolean z2) {
        boolean z3 = mo16554e().getBoolean(str, z);
        C13479a.m54764b("MinaRepository", "getBoolean, key = " + str + ", value = " + z3);
        return z3;
    }
}
