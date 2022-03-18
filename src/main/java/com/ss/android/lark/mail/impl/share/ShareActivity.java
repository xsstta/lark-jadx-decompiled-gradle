package com.ss.android.lark.mail.impl.share;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43332s;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u;
import com.ss.android.lark.mail.impl.share.C43633a;
import com.ss.android.lark.mail.impl.share.C43691h;
import com.ss.android.lark.mail.impl.share.C43694i;
import com.ss.android.lark.mail.impl.share.collaborate.AbstractC43680e;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;

public class ShareActivity extends BaseMailFragmentActivity implements AbstractC43332s, AbstractC43334u, C43633a.AbstractC43642b, AbstractC43680e {

    /* renamed from: a */
    public C43633a f110673a;

    /* renamed from: b */
    public C43694i f110674b;

    /* renamed from: c */
    private final String f110675c = "ShareActivity";

    /* renamed from: d */
    private final int f110676d = 2041;

    /* renamed from: e */
    private final int f110677e = 9378;

    /* renamed from: f */
    private final int f110678f = 10;

    /* renamed from: g */
    private C43694i.AbstractC43704a f110679g = new C43694i.AbstractC43704a() {
        /* class com.ss.android.lark.mail.impl.share.ShareActivity.C436261 */

        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: a */
        public void mo155662a() {
            Log.m165389i("ShareActivity", "onBackButtonClick");
            ShareActivity.this.finish();
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: c */
        public void mo155669c() {
            Log.m165389i("ShareActivity", "onStartScroll");
            ShareActivity.this.f110674b.mo155781e();
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: d */
        public void mo155670d() {
            Log.m165389i("ShareActivity", "onCreateNewChat");
            ShareActivity shareActivity = ShareActivity.this;
            C42699a.m170213a(shareActivity, 9378, shareActivity.f110673a.mo155688d(), ShareActivity.this.f110673a.mo155689e(), ShareActivity.this.f110673a.mo155692h(), ShareActivity.this.f110673a.mo155686c());
        }

        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: b */
        public void mo155666b() {
            Log.m165389i("ShareActivity", "onDoneButtonClick");
            int i = C436324.f110687a[ShareActivity.this.f110673a.mo155691g().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ShareActivity.this.f110674b.mo155775a(ShareActivity.this.f110673a.mo155676a(), ShareActivity.this.f110673a.mo155692h(), new C43694i.AbstractC43705b() {
                            /* class com.ss.android.lark.mail.impl.share.ShareActivity.C436261.C436282 */

                            @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43705b
                            /* renamed from: a */
                            public void mo155671a(String str) {
                                Log.m165389i("ShareActivity", "onOKButtonClick");
                                if (ShareActivity.this.f110674b.mo155782f()) {
                                    Log.m165389i("ShareActivity", "onOKButtonClick collaborate");
                                    ShareActivity.this.mo155652a(str, true);
                                    C42187a.m168578y();
                                    return;
                                }
                                Log.m165389i("ShareActivity", "onOKButtonClick send to chat");
                                ShareActivity.this.f110674b.mo155772a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
                                ShareActivity.this.f110673a.mo155684b(str, true);
                                C42187a.m168577x();
                            }
                        });
                        return;
                    } else if (i != 4) {
                        Log.m165383e("ShareActivity", "onNextButtonClick switch to default");
                        return;
                    }
                }
                ShareActivity.this.f110674b.mo155775a(ShareActivity.this.f110673a.mo155676a(), ShareActivity.this.f110673a.mo155692h(), new C43694i.AbstractC43705b() {
                    /* class com.ss.android.lark.mail.impl.share.ShareActivity.C436261.C436271 */

                    @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43705b
                    /* renamed from: a */
                    public void mo155671a(String str) {
                        Log.m165389i("ShareActivity", "onOKButtonClick");
                        if (ShareActivity.this.f110674b.mo155782f()) {
                            Log.m165389i("ShareActivity", "onOKButtonClick collaborate");
                            ShareActivity.this.mo155652a(str, false);
                            C42187a.m168578y();
                            return;
                        }
                        Log.m165389i("ShareActivity", "onOKButtonClick send to chat");
                        ShareActivity.this.f110674b.mo155772a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
                        ShareActivity.this.f110673a.mo155684b(str, false);
                        C42187a.m168577x();
                        C42187a.m168552l(C42187a.C42191c.f107445V);
                    }
                });
                return;
            }
            ShareActivity.this.mo155652a("", false);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: b */
        public void mo155668b(String str) {
            Log.m165389i("ShareActivity", "onLoadMoreSearchResult");
            ShareActivity.this.f110673a.mo155678a(str);
        }

        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: a */
        public void mo155664a(String str) {
            Log.m165389i("ShareActivity", "onSearchInputChanged");
            ShareActivity.this.f110674b.mo155774a((ArrayList<C43689g>) null, false, false);
            ShareActivity.this.f110673a.mo155678a(str);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: b */
        public void mo155667b(int i) {
            boolean z;
            Log.m165389i("ShareActivity", "onCandidateClick");
            C43689g c = ShareActivity.this.f110673a.mo155687c(i);
            if (c != null) {
                ShareActivity.this.f110674b.mo155771a(i, c);
                int size = ShareActivity.this.f110673a.mo155676a().size();
                C43694i iVar = ShareActivity.this.f110674b;
                if (size > 0) {
                    z = true;
                } else {
                    z = false;
                }
                iVar.mo155776a(z);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: a */
        public void mo155665a(boolean z) {
            Log.m165389i("ShareActivity", "onShareModeChanged: " + z);
            boolean z2 = true;
            int a = ShareActivity.this.f110673a.mo155675a(C41816b.m166115a().mo150139f(), z ^ true);
            ArrayList<C43689g> a2 = ShareActivity.this.f110673a.mo155676a();
            int size = a2.size();
            ShareActivity.this.f110674b.mo155773a(a2);
            C43694i iVar = ShareActivity.this.f110674b;
            if (size <= 0) {
                z2 = false;
            }
            iVar.mo155776a(z2);
            ShareActivity.this.f110674b.mo155770a(a);
        }

        @Override // com.ss.android.lark.mail.impl.share.C43694i.AbstractC43704a
        /* renamed from: a */
        public void mo155663a(final int i) {
            boolean z;
            Log.m165389i("ShareActivity", "onCandidateClick");
            if (ShareActivity.this.f110673a.mo155685b(i) || ShareActivity.this.f110673a.mo155676a().size() < 10) {
                if (ShareActivity.this.f110673a.mo155682a(i)) {
                    ArrayList<C43689g> a = ShareActivity.this.f110673a.mo155676a();
                    int size = a.size();
                    ShareActivity.this.f110674b.mo155773a(a);
                    C43694i iVar = ShareActivity.this.f110674b;
                    if (size > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iVar.mo155776a(z);
                    ShareActivity.this.f110674b.mo155770a(i);
                }
                if (ShareActivity.this.f110673a.mo155691g() == Mode.SendToChat) {
                    ShareActivity.this.f110674b.mo155781e();
                    if (ShareActivity.this.f110673a.mo155676a().size() == 1) {
                        C43849u.m173827a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.share.ShareActivity.C436261.RunnableC436293 */

                            public void run() {
                                ShareActivity.this.f110674b.mo155778b(i);
                            }
                        }, 200);
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m165389i("ShareActivity", "onCandidateClick selected number exceeded");
            MailToast.m173697a((int) R.string.Mail_Share_SelectMax);
            C42209j.m168611a("share_send_to_chat_max_target", 40001, "toast", "", "", 1);
        }
    };

    public enum Mode {
        Default,
        Collaborate,
        SendToChat,
        CreateNewChat
    }

    /* renamed from: a */
    public Context mo155650a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155651a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150846a(String str) {
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aL_() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m173124a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m173122a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155659f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155660g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m173126c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m173123a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m173125b(this);
    }

    @Override // com.ss.android.lark.mail.impl.share.C43633a.AbstractC43642b
    /* renamed from: a */
    public void mo155654a(boolean z) {
        Log.m165389i("ShareActivity", "onSendToChatFinished");
        mo155656b(z);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Watchers.m167209b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m173127h() {
        int i = C436324.f110688b[this.f110673a.mo155686c().ordinal()];
        if (i == 1) {
            finish();
        } else if (i == 2 || i == 3) {
            C43691h.m173278a(this, new C43691h.AbstractC43693a() {
                /* class com.ss.android.lark.mail.impl.share.ShareActivity.C436302 */

                @Override // com.ss.android.lark.mail.impl.share.C43691h.AbstractC43693a
                public void onOKButtonClick() {
                    if (C43785p.m173546b(ShareActivity.this)) {
                        ShareActivity.this.finish();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.ShareActivity$4 */
    public static /* synthetic */ class C436324 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110687a;

        /* renamed from: b */
        static final /* synthetic */ int[] f110688b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.PermissionCode[] r0 = com.bytedance.lark.pb.email.client.v1.PermissionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.share.ShareActivity.C436324.f110688b = r0
                r1 = 1
                com.bytedance.lark.pb.email.client.v1.PermissionCode r2 = com.bytedance.lark.pb.email.client.v1.PermissionCode.OWNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.mail.impl.share.ShareActivity.C436324.f110688b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r3 = com.bytedance.lark.pb.email.client.v1.PermissionCode.EDIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.lark.mail.impl.share.ShareActivity.C436324.f110688b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r4 = com.bytedance.lark.pb.email.client.v1.PermissionCode.VIEW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode[] r3 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.lark.mail.impl.share.ShareActivity.C436324.f110687a = r3
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode r4 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.Collaborate     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.lark.mail.impl.share.ShareActivity.C436324.f110687a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode r3 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.SendToChat     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.ss.android.lark.mail.impl.share.ShareActivity.C436324.f110687a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode r1 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.CreateNewChat     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = com.ss.android.lark.mail.impl.share.ShareActivity.C436324.f110687a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode r1 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.Default     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.share.ShareActivity.C436324.<clinit>():void");
        }
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        if (this.f110673a.mo155691g() == null) {
            return "";
        }
        int i = C436324.f110687a[this.f110673a.mo155691g().ordinal()];
        if (i == 1) {
            return C42187a.C42190b.f107403f;
        }
        if (i == 2) {
            return C42187a.C42190b.f107413p;
        }
        if (i != 3) {
            return C42187a.C42190b.f107391A;
        }
        return C42187a.C42190b.f107392B;
    }

    /* renamed from: a */
    public static Resources m173123a(ShareActivity shareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareActivity);
        }
        return shareActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m173126c(ShareActivity shareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareActivity);
        }
        return shareActivity.mo155660g();
    }

    /* renamed from: b */
    public static void m173125b(ShareActivity shareActivity) {
        shareActivity.mo155659f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareActivity shareActivity2 = shareActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.share.collaborate.AbstractC43680e
    /* renamed from: c */
    public void mo155657c(String str) {
        Log.m165389i("ShareActivity", "onAddNewCollaboratorsSucceed");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ShareActivity", "onAddNewCollaboratorsSucceed empty threadID");
        } else if (str.equals(this.f110673a.mo155688d())) {
            Log.m165389i("ShareActivity", "onAddNewCollaboratorsSucceed finish");
            C43752b.m173435a(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C43633a aVar = new C43633a(getIntent(), this);
        this.f110673a = aVar;
        C43694i iVar = new C43694i(this, this.f110679g, aVar.mo155691g());
        this.f110674b = iVar;
        setContentView(iVar.mo155769a());
        this.f110674b.mo155776a(false);
        this.f110673a.mo155690f();
        Watchers.m167206a(this);
    }

    @Override // com.ss.android.lark.mail.impl.share.collaborate.AbstractC43680e
    /* renamed from: b */
    public void mo155655b(String str) {
        Log.m165389i("ShareActivity", "onCreateCollaboratingThreadFinished");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ShareActivity", "onCreateCollaboratingThreadFinished empty threadID");
        } else if (str.equals(this.f110673a.mo155688d())) {
            Log.m165389i("ShareActivity", "onCreateCollaboratingThreadFinished finish");
            C43752b.m173435a(this);
        }
    }

    /* renamed from: b */
    public void mo155656b(boolean z) {
        this.f110674b.mo155777b();
        if (z) {
            MailToast.m173698a((int) R.string.Mail_Normal_Success, MailToast.Type.SUCCESS);
            setResult(-1);
            C43752b.m173435a(this);
            return;
        }
        MailToast.m173698a((int) R.string.Mail_Normal_Failed, MailToast.Type.FAIL);
        C42209j.m168612a("mail_normal_failed", "toast");
    }

    /* renamed from: a */
    public static void m173124a(ShareActivity shareActivity, Context context) {
        shareActivity.mo155651a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareActivity);
        }
    }

    /* renamed from: a */
    public static Context m173122a(ShareActivity shareActivity, Configuration configuration) {
        Context a = shareActivity.mo155650a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43332s
    /* renamed from: a */
    public void mo150849a(String str, PermissionCode permissionCode) {
        C43633a aVar = this.f110673a;
        if (aVar != null && TextUtils.equals(aVar.mo155688d(), str)) {
            this.f110673a.mo155677a(permissionCode);
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150850a(String str, String str2) {
        Log.m165389i("ShareActivity", "onUnShareThread");
        if (!TextUtils.isEmpty(str) && str.equals(this.f110673a.mo155688d())) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.share.$$Lambda$ShareActivity$VqwjhPTuoOQyfS9x4VA1yNvfnAw */

                public final void run() {
                    ShareActivity.this.m173127h();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo155652a(String str, boolean z) {
        this.f110674b.mo155772a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
        this.f110673a.mo155679a(str, z, new C43633a.AbstractC43641a() {
            /* class com.ss.android.lark.mail.impl.share.ShareActivity.C436313 */

            @Override // com.ss.android.lark.mail.impl.share.C43633a.AbstractC43641a
            /* renamed from: a */
            public void mo155673a(boolean z) {
                ShareActivity.this.mo155656b(z);
            }

            @Override // com.ss.android.lark.mail.impl.share.C43633a.AbstractC43641a
            /* renamed from: b */
            public void mo155674b(boolean z) {
                ShareActivity.this.mo155656b(z);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.share.C43633a.AbstractC43642b
    /* renamed from: a */
    public void mo155653a(ArrayList<C43689g> arrayList, boolean z) {
        Log.m165389i("ShareActivity", "onCandidateListUpdated");
        this.f110674b.mo155774a(arrayList, z, true);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Log.m165389i("ShareActivity", "onActivityResult: " + i);
        super.onActivityResult(i, i2, intent);
        if (i != 2041) {
            if (i != 9378) {
                Log.m165397w("ShareActivity", "onActivityResult switch to default");
            } else if (i2 == -1) {
                Log.m165389i("ShareActivity", "onActivityResult REQUEST_CODE_CREATE_NEW_CHAT OK");
                C43752b.m173435a(this);
            }
        } else if (intent == null) {
            Log.m165389i("ShareActivity", "onActivityResult empty data");
        } else {
            this.f110673a.mo155680a(intent.getStringArrayListExtra("intent_key_user_id_list"));
            ArrayList<C43689g> a = this.f110673a.mo155676a();
            this.f110674b.mo155773a(a);
            C43694i iVar = this.f110674b;
            if (a.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            iVar.mo155776a(z);
            this.f110674b.mo155780d();
        }
    }
}
