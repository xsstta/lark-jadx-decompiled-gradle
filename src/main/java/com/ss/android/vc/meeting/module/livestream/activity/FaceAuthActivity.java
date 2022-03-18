package com.ss.android.vc.meeting.module.livestream.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.C60990y;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.livestream.p3134b.C62056b;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.aq;
import java.util.Arrays;

public class FaceAuthActivity extends LiveAuthBaseActivity {

    /* renamed from: b */
    public LinearLayout f155823b;

    /* renamed from: g */
    private String f155824g;

    /* renamed from: h */
    private String f155825h;

    /* renamed from: i */
    private boolean f155826i;

    /* renamed from: j */
    private String f155827j;

    /* renamed from: k */
    private VideoChat f155828k;

    /* renamed from: l */
    private TextView f155829l;

    /* renamed from: m */
    private TextView f155830m;

    /* renamed from: n */
    private IconFontView f155831n;

    /* renamed from: a */
    public Context mo214712a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo214713a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m242348a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m242345a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo214721g() {
        return super.getResources();
    }

    public AssetManager getAssets() {
        return m242351c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m242346a(this);
    }

    /* renamed from: h */
    public void mo214723h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo214724i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m242350b(this);
    }

    /* renamed from: d */
    public void mo214719d() {
        AuthFailActivity.m242332a(this, this.f155827j);
        m242349a(false);
    }

    public void finish() {
        super.finish();
        C60700b.m235851b("FaceAuthActivity", "[finish]", "<LiveAuth>");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        C60700b.m235851b("FaceAuthActivity", "[onDestroy]", "<LiveAuth>");
    }

    /* renamed from: b */
    public void mo214715b() {
        this.f155823b.setEnabled(false);
        mo214729j();
        VcBizSender.m249226b(2841, "feishu_livestream").mo219889a(new AbstractC63598b<C60990y>() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.FaceAuthActivity.C620224 */

            /* renamed from: a */
            public void onSuccess(C60990y yVar) {
                C60700b.m235851b("FaceAuthActivity", "[getTicketAndFaceAuth]", "<LiveAuth> onSuccess , response=" + yVar);
                FaceAuthActivity.this.mo214731l();
                FaceAuthActivity.this.f155823b.setEnabled(true);
                if (yVar != null && !TextUtils.isEmpty(yVar.f152730a)) {
                    FaceAuthActivity.this.mo214714a(yVar.f152730a);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("FaceAuthActivity", "[getTicketAndFaceAuth2]", "<LiveAuth> onError , error=" + eVar);
                FaceAuthActivity.this.mo214731l();
                FaceAuthActivity.this.f155823b.setEnabled(true);
            }
        });
    }

    /* renamed from: c */
    public void mo214717c() {
        C60738ac.m236023a((int) R.string.View_G_AuthenticationSuccess);
        if (!TextUtils.isEmpty(this.f155827j)) {
            C62044d.m242417a(this.f155827j);
        }
        finish();
        mo214728a(Arrays.asList("action.RealAuthenticationActivity.finish"));
        m242349a(true);
    }

    /* renamed from: m */
    private void m242353m() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f155824g = intent.getStringExtra("auth_name");
            this.f155825h = intent.getStringExtra("auth_code");
            this.f155826i = intent.getBooleanExtra("auth.key.from.url", false);
            this.f155827j = intent.getStringExtra("auth.key.meeting.id");
            C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(this.f155827j);
            if (kVar != null) {
                this.f155828k = kVar.mo212056e();
            }
            C60700b.m235851b("FaceAuthActivity", "[initData]", "<LiveAuth> isPageFromUrl=" + this.f155826i);
        }
    }

    /* renamed from: n */
    private void m242354n() {
        setContentView(R.layout.live_auth_activity_split_flow_page);
        TextView textView = (TextView) findViewById(R.id.tv_title);
        this.f155829l = textView;
        textView.setText(R.string.View_G_FacialRecognitionInfo);
        this.f155830m = (TextView) findViewById(R.id.tv_subtitle);
        m242352c(this.f155824g);
        this.f155831n = (IconFontView) findViewById(R.id.iv_back);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llFaceVerify);
        this.f155823b = linearLayout;
        linearLayout.setEnabled(true);
        this.f155831n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.FaceAuthActivity.View$OnClickListenerC620202 */

            public void onClick(View view) {
                FaceAuthActivity.this.finish();
                FaceAuthActivity.this.mo214716b("return");
            }
        });
        this.f155823b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.FaceAuthActivity.C620213 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                FaceAuthActivity.this.mo214716b("start");
                FaceAuthActivity.this.mo214715b();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity
    /* renamed from: a */
    public void mo214702a() {
        this.f155840f = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.FaceAuthActivity.C620191 */

            public void onReceive(Context context, Intent intent) {
                FaceAuthActivity.this.finish();
            }
        };
        this.f155839e.mo4991a(this.f155840f, new IntentFilter("action.FaceAuthActivity.finish"));
    }

    /* renamed from: b */
    public void mo214716b(String str) {
        aq.m250043a("vc_meeting_popup", "face_recognition", str, this.f155828k);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m242353m();
        m242354n();
        mo214716b(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    /* renamed from: a */
    public static Resources m242346a(FaceAuthActivity faceAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceAuthActivity);
        }
        return faceAuthActivity.mo214721g();
    }

    /* renamed from: c */
    public static AssetManager m242351c(FaceAuthActivity faceAuthActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceAuthActivity);
        }
        return faceAuthActivity.mo214724i();
    }

    /* renamed from: b */
    public static void m242350b(FaceAuthActivity faceAuthActivity) {
        faceAuthActivity.mo214723h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FaceAuthActivity faceAuthActivity2 = faceAuthActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    faceAuthActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private void m242352c(String str) {
        if (!TextUtils.isEmpty(str)) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_FacialRecognitionSelf, "name", str);
            SpannableString spannableString = new SpannableString(mustacheFormat);
            int indexOf = mustacheFormat.indexOf(str);
            if (indexOf >= 0 && str.length() + indexOf <= spannableString.length()) {
                spannableString.setSpan(new ForegroundColorSpan(-16777216), indexOf, str.length() + indexOf, 33);
                spannableString.setSpan(new StyleSpan(1), indexOf, str.length() + indexOf, 33);
            }
            this.f155830m.setText(spannableString);
        }
    }

    /* renamed from: a */
    private void m242349a(boolean z) {
        String str;
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        aq.m250043a("vc_meeting_popup", "face_recognition", str, this.f155828k);
    }

    /* renamed from: a */
    public void mo214714a(String str) {
        this.f155823b.setEnabled(false);
        mo214729j();
        C62056b.m242455a(this, str, this.f155825h, this.f155824g, new SDKCallBack.FaceLiveCallback() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.FaceAuthActivity.C620235 */

            @Override // com.ss.android.bytedcert.callback.SDKCallBack.FaceLiveCallback
            public void onFaceLiveFinish(BDResponse bDResponse) {
                FaceAuthActivity.this.mo214731l();
                if (bDResponse != null) {
                    C60700b.m235851b("FaceAuthActivity", "[onFaceLiveFinish]", "<LiveAuth> response is not null");
                    if (bDResponse.success) {
                        C60700b.m235851b("FaceAuthActivity", "[onFaceLiveFinish2]", "<LiveAuth> response success true");
                        FaceAuthActivity.this.mo214717c();
                        return;
                    }
                    C60700b.m235851b("FaceAuthActivity", "[onFaceLiveFinish3]", "<LiveAuth> BDResponse is error " + bDResponse.errorMsg + " , " + bDResponse.errorCode);
                    FaceAuthActivity.this.f155823b.setEnabled(true);
                    if (!TextUtils.isEmpty(bDResponse.errorMsg)) {
                        C60738ac.m236029a(bDResponse.errorMsg);
                    }
                    FaceAuthActivity.this.mo214719d();
                    return;
                }
                FaceAuthActivity.this.f155823b.setEnabled(true);
                C60700b.m235851b("FaceAuthActivity", "[onFaceLiveFinish4]", "<LiveAuth> response is null, then return");
            }
        });
    }

    /* renamed from: a */
    public static void m242348a(FaceAuthActivity faceAuthActivity, Context context) {
        faceAuthActivity.mo214713a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceAuthActivity);
        }
    }

    /* renamed from: a */
    public static Context m242345a(FaceAuthActivity faceAuthActivity, Configuration configuration) {
        Context a = faceAuthActivity.mo214712a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m242347a(Context context, String str, String str2, boolean z, String str3) {
        if (context != null) {
            Intent intent = new Intent(context, FaceAuthActivity.class);
            intent.putExtra("auth_name", str);
            intent.putExtra("auth_code", str2);
            intent.putExtra("auth.key.from.url", z);
            intent.putExtra("auth.key.meeting.id", str3);
            context.startActivity(intent);
        }
    }
}
