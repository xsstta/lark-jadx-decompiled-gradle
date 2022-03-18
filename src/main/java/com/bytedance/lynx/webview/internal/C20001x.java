package com.bytedance.lynx.webview.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.lynx.webview.internal.C19951h;
import com.bytedance.lynx.webview.sdkadapt.Version;
import com.bytedance.lynx.webview.util.C20026a;
import com.bytedance.lynx.webview.util.C20051j;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.lynx.webview.internal.x */
public class C20001x extends FrameLayout {

    /* renamed from: a */
    public Switch f48859a;

    /* renamed from: b */
    public C19941e f48860b = C19941e.m72704a();

    /* renamed from: c */
    public String f48861c;

    /* renamed from: d */
    public WeakReference<Context> f48862d;

    /* renamed from: e */
    public C19951h.AbstractC19955c f48863e;

    /* renamed from: f */
    private Switch f48864f;

    /* renamed from: g */
    private Switch f48865g;

    /* renamed from: h */
    private Switch f48866h;

    /* renamed from: i */
    private Switch f48867i;

    /* renamed from: j */
    private Switch f48868j;

    /* renamed from: k */
    private Switch f48869k;

    /* renamed from: l */
    private Switch f48870l;

    /* renamed from: m */
    private Switch f48871m;

    /* renamed from: n */
    private Switch f48872n;

    /* renamed from: o */
    private Switch f48873o;

    /* renamed from: p */
    private Switch f48874p;

    /* renamed from: a */
    private void m72966a() {
        m72967a(this.f48864f, ProcessFeatureIndex.ENABLE_USE_TTWEBVIEW);
        m72967a(this.f48865g, ProcessFeatureIndex.ENABLE_RENDER_PROCESS);
        m72967a(this.f48866h, ProcessFeatureIndex.ENABLE_WARMUP);
        m72967a(this.f48867i, ProcessFeatureIndex.ENABLE_RENDER_IN_BROWSER);
        m72967a(this.f48868j, ProcessFeatureIndex.ENABLE_SELECT_MENU);
        m72967a(this.f48869k, ProcessFeatureIndex.ENABLE_WARMUP_RENDERPROCESSHOST);
        m72967a(this.f48870l, ProcessFeatureIndex.ENABLE_CLAMP_JVM_HEAP);
        m72967a(this.f48871m, ProcessFeatureIndex.ENABLE_UNMAP_WEBVIEW_RESERVED);
        m72967a(this.f48872n, ProcessFeatureIndex.ENABLE_MEDIA_TTMP);
        m72967a(this.f48873o, ProcessFeatureIndex.ENABLE_UPLOAD_EVENT);
        m72967a(this.f48874p, ProcessFeatureIndex.ENABLE_UPLOAD_DATA);
    }

    /* renamed from: b */
    private void m72968b() {
        m72969b(this.f48864f, ProcessFeatureIndex.ENABLE_USE_TTWEBVIEW);
        m72969b(this.f48865g, ProcessFeatureIndex.ENABLE_RENDER_PROCESS);
        m72969b(this.f48866h, ProcessFeatureIndex.ENABLE_WARMUP);
        m72969b(this.f48867i, ProcessFeatureIndex.ENABLE_RENDER_IN_BROWSER);
        m72969b(this.f48868j, ProcessFeatureIndex.ENABLE_SELECT_MENU);
        m72969b(this.f48869k, ProcessFeatureIndex.ENABLE_WARMUP_RENDERPROCESSHOST);
        m72969b(this.f48870l, ProcessFeatureIndex.ENABLE_CLAMP_JVM_HEAP);
        m72969b(this.f48871m, ProcessFeatureIndex.ENABLE_UNMAP_WEBVIEW_RESERVED);
        m72969b(this.f48872n, ProcessFeatureIndex.ENABLE_MEDIA_TTMP);
        m72969b(this.f48873o, ProcessFeatureIndex.ENABLE_UPLOAD_EVENT);
        m72969b(this.f48874p, ProcessFeatureIndex.ENABLE_UPLOAD_DATA);
    }

    private C19951h.C19953a getBuilder() {
        AbstractC19937a l;
        if (C19951h.m72733a().mo67748f() == null && (l = C20011y.m73014l()) != null) {
            C20026a.m73079a(DownloadEventType.InitSetting_has_appInfo);
            AppInfo b = l.mo67715b();
            if (b != null) {
                C20026a.m73079a(DownloadEventType.InitSetting_has_miniappInfo);
                String appId = b.getAppId();
                String channel = b.getChannel();
                return new C19951h.C19953a().mo67758c(appId).mo67756b(channel).mo67760d(b.getUpdateVersionCode()).mo67754a(b.getDeviceId());
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo67886a(final String str) {
        C20011y.m72998c(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C20001x.RunnableC200097 */

            public void run() {
                Context context = C20001x.this.f48862d.get();
                if (context != null) {
                    Toast.makeText(context, str, 0).show();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo67887a(boolean z) {
        this.f48864f.setEnabled(z);
        this.f48865g.setEnabled(z);
        this.f48866h.setEnabled(z);
        this.f48867i.setEnabled(z);
        this.f48868j.setEnabled(z);
        this.f48869k.setEnabled(z);
        this.f48870l.setEnabled(z);
        this.f48871m.setEnabled(z);
        this.f48872n.setEnabled(z);
        this.f48873o.setEnabled(z);
        this.f48874p.setEnabled(z);
        m72968b();
    }

    public C20001x(final Context context) {
        super(context);
        String str;
        this.f48862d = new WeakReference<>(context);
        this.f48861c = C20051j.m73197c(context);
        LayoutInflater.from(context).inflate(R.layout.sdk_debug_page, this);
        Switch r0 = (Switch) findViewById(R.id.enable_debug);
        TextView textView = (TextView) findViewById(R.id.version_info);
        this.f48864f = (Switch) findViewById(R.id.use_ttwebview);
        this.f48865g = (Switch) findViewById(R.id.render_process);
        this.f48866h = (Switch) findViewById(R.id.warm_up);
        this.f48867i = (Switch) findViewById(R.id.render_in_browser);
        this.f48868j = (Switch) findViewById(R.id.select_menu);
        this.f48869k = (Switch) findViewById(R.id.warm_up_render_process_host);
        this.f48870l = (Switch) findViewById(R.id.clamp_heap);
        this.f48871m = (Switch) findViewById(R.id.unmap_webview_reserved);
        this.f48872n = (Switch) findViewById(R.id.media_ttmp);
        this.f48873o = (Switch) findViewById(R.id.upload_event);
        this.f48874p = (Switch) findViewById(R.id.upload_data);
        this.f48859a = (Switch) findViewById(R.id.use_online_so);
        Button button = (Button) findViewById(R.id.reboot);
        Button button2 = (Button) findViewById(R.id.pull_ttwebview);
        r0.setChecked(this.f48860b.mo67722a(this.f48861c, "enable_debug", false));
        mo67887a(r0.isChecked());
        r0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.bytedance.lynx.webview.internal.C20001x.C200021 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C20001x.this.f48860b.mo67725b(C20001x.this.f48861c, "enable_debug", z);
                C20001x.this.mo67887a(z);
            }
        });
        if (C20011y.m73013k()) {
            str = "TTWebView";
        } else {
            str = "System WebView";
        }
        textView.setText(String.format("SDK version : %s\n%s : %s\nmd5 : %s", Version.f48944e, str, C20011y.m72976a().mo67900D(), C19986s.m72924a().mo67859b("sdk_upto_so_md5")));
        m72966a();
        m72968b();
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.lynx.webview.internal.C20001x.View$OnClickListenerC200032 */

            /* renamed from: a */
            public void mo67889a() {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid != Process.myPid()) {
                        Process.killProcess(runningAppProcessInfo.pid);
                    }
                }
                Process.killProcess(Process.myPid());
            }

            public void onClick(View view) {
                C20011y.m72985a(new Runnable() {
                    /* class com.bytedance.lynx.webview.internal.C20001x.View$OnClickListenerC200032.RunnableC200041 */

                    public void run() {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.addFlags(67108864);
                        }
                        context.startActivity(launchIntentForPackage);
                        C19941e.m72704a().mo67727c();
                        View$OnClickListenerC200032.this.mo67889a();
                    }
                });
            }
        });
        final C19951h a = C19951h.m72733a();
        this.f48863e = new C19951h.AbstractC19955c() {
            /* class com.bytedance.lynx.webview.internal.C20001x.C200053 */

            @Override // com.bytedance.lynx.webview.internal.C19951h.AbstractC19955c
            /* renamed from: a */
            public void mo67766a(JSONObject jSONObject, boolean z) {
                try {
                    if (C20011y.m72976a().mo67939v().mo67834f().equals(jSONObject.getString("sdk_upto_so_versioncode"))) {
                        C20001x.this.mo67886a("已经是最新版本。");
                    } else {
                        C20001x.this.mo67886a("开始下载内核。");
                        C20011y.m72976a().mo67939v().mo67839i();
                        C19986s.m72924a().mo67855a(true);
                    }
                    C19951h.m72733a().mo67746c(this);
                } catch (JSONException e) {
                    C20001x xVar = C20001x.this;
                    xVar.mo67886a("读取配置出错:" + e.toString());
                }
            }
        };
        C19986s.m72924a().mo67853a(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C20001x.RunnableC200064 */

            public void run() {
                C20001x.this.mo67886a("下载完成。");
            }
        });
        if (a.mo67748f() == null) {
            a.mo67735a(getBuilder());
        }
        button2.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.lynx.webview.internal.C20001x.View$OnClickListenerC200075 */

            public void onClick(View view) {
                C20001x.this.f48859a.setChecked(true);
                Toast.makeText(C20001x.this.getContext(), "检查线上内核配置。", 0).show();
                a.mo67742b(C20001x.this.f48863e);
                a.mo67743b((JSONObject) null);
                a.mo67745c();
            }
        });
        this.f48859a.setChecked(C19941e.m72704a().mo67726b());
        this.f48859a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.bytedance.lynx.webview.internal.C20001x.C200086 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C19941e.m72704a().mo67720a(z);
            }
        });
    }

    /* renamed from: a */
    private void m72967a(Switch r2, ProcessFeatureIndex processFeatureIndex) {
        final int value = processFeatureIndex.value();
        r2.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.lynx.webview.internal.C20001x.View$OnClickListenerC200108 */

            public void onClick(View view) {
                C20001x.this.f48860b.mo67723b(C20001x.this.f48861c, value, ((Switch) view).isChecked());
            }
        });
    }

    /* renamed from: b */
    private void m72969b(Switch r4, ProcessFeatureIndex processFeatureIndex) {
        r4.setChecked(C19986s.m72924a().mo67857a(this.f48861c, processFeatureIndex.value(), false));
    }
}
