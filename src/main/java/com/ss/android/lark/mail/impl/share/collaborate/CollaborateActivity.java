package com.ss.android.lark.mail.impl.share.collaborate;

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
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u;
import com.ss.android.lark.mail.impl.share.C43691h;
import com.ss.android.lark.mail.impl.share.collaborate.C43658a;
import com.ss.android.lark.mail.impl.share.collaborate.C43666c;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;

public class CollaborateActivity extends BaseMailFragmentActivity implements AbstractC43334u, C43658a.AbstractC43662a, AbstractC43680e {

    /* renamed from: a */
    public C43658a f110756a;

    /* renamed from: b */
    public C43666c f110757b;

    /* renamed from: c */
    private final String f110758c = "CollaborateActivity";

    /* renamed from: d */
    private C43666c.AbstractC43675a f110759d = new C43666c.AbstractC43675a() {
        /* class com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.C436541 */

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.collaborate.C43666c.AbstractC43675a
        /* renamed from: a */
        public void mo155723a() {
            Log.m165389i("CollaborateActivity", "onBackButtonClick");
            C43752b.m173435a(CollaborateActivity.this);
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.collaborate.C43666c.AbstractC43675a
        /* renamed from: b */
        public void mo155726b() {
            Log.m165389i("CollaborateActivity", "onQuitClick");
            CollaborateActivity.this.f110757b.mo155750c();
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.collaborate.C43666c.AbstractC43675a
        /* renamed from: c */
        public void mo155727c() {
            Log.m165389i("CollaborateActivity", "onQuitCollaborateConfirmed");
            CollaborateActivity.this.f110757b.mo155746a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
            CollaborateActivity.this.f110756a.mo155736f();
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.collaborate.C43666c.AbstractC43675a
        /* renamed from: a */
        public void mo155724a(Collaborator collaborator) {
            Log.m165389i("CollaborateActivity", "onRemoveCollaboratorConfirmed");
            if (collaborator == null) {
                Log.m165383e("CollaborateActivity", "onRemoveCollaboratorConfirmed null data");
                return;
            }
            int i = C436574.f110764a[CollaborateActivity.this.f110756a.mo155734d().ordinal()];
            if (i == 1) {
                CollaborateActivity.this.f110757b.mo155746a(C43819s.m173684a((int) R.string.Mail_Share_ToastRemoving));
                CollaborateActivity.this.f110756a.mo155731a(collaborator, PermissionCode.NONE);
            } else if (i != 2) {
                Log.m165383e("CollaborateActivity", "onRemoveCollaboratorConfirmed switch to default");
            } else {
                ArrayList<Collaborator> e = CollaborateActivity.this.f110756a.mo155735e();
                e.remove(collaborator);
                if (CollectionUtils.isEmpty(e)) {
                    CollaborateActivity.this.f110757b.mo155748a(false);
                    C43752b.m173435a(CollaborateActivity.this);
                }
                CollaborateActivity.this.f110757b.mo155747a(e);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.mail.impl.share.collaborate.C43666c.AbstractC43675a
        /* renamed from: a */
        public void mo155725a(Collaborator collaborator, int i) {
            Log.m165389i("CollaborateActivity", "onRemoveCollaboratorClick");
            if (collaborator == null) {
                Log.m165383e("CollaborateActivity", "onRemoveCollaboratorClick null data");
                return;
            }
            CollaborateActivity.this.f110757b.mo155745a(collaborator);
            C42187a.m168458B();
        }
    };

    public enum CollaborateMode {
        Add,
        Edit
    }

    /* renamed from: a */
    public Context mo155714a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155715a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150846a(String str) {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m173206a(this, context);
    }

    @Override // com.ss.android.lark.mail.impl.share.collaborate.AbstractC43680e
    /* renamed from: b */
    public void mo155655b(String str) {
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m173204a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155720f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155721g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m173208c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m173205a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m173207b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Watchers.m167209b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m173209h() {
        int i = C436574.f110765b[this.f110756a.mo155732b().ordinal()];
        if (i == 1) {
            finish();
        } else if (i == 2 || i == 3) {
            C43691h.m173278a(this, new C43691h.AbstractC43693a() {
                /* class com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.C436563 */

                @Override // com.ss.android.lark.mail.impl.share.C43691h.AbstractC43693a
                public void onOKButtonClick() {
                    if (C43785p.m173546b(CollaborateActivity.this)) {
                        CollaborateActivity.this.finish();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        if (this.f110756a.mo155734d() == CollaborateMode.Add) {
            Log.m165389i("CollaborateActivity", "finish setResult");
            Intent intent = new Intent();
            intent.putStringArrayListExtra("intent_key_user_id_list", this.f110756a.mo155737g());
            setResult(-1, intent);
        }
        super.finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity$4 */
    public static /* synthetic */ class C436574 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110764a;

        /* renamed from: b */
        static final /* synthetic */ int[] f110765b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.PermissionCode[] r0 = com.bytedance.lark.pb.email.client.v1.PermissionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.C436574.f110765b = r0
                r1 = 1
                com.bytedance.lark.pb.email.client.v1.PermissionCode r2 = com.bytedance.lark.pb.email.client.v1.PermissionCode.OWNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.C436574.f110765b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r3 = com.bytedance.lark.pb.email.client.v1.PermissionCode.EDIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.C436574.f110765b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r3 = com.bytedance.lark.pb.email.client.v1.PermissionCode.VIEW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity$CollaborateMode[] r2 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.CollaborateMode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.C436574.f110764a = r2
                com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity$CollaborateMode r3 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.CollaborateMode.Edit     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.C436574.f110764a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity$CollaborateMode r2 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.CollaborateMode.Add     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.C436574.<clinit>():void");
        }
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        if (C436574.f110764a[this.f110756a.mo155734d().ordinal()] != 1) {
            return C42187a.C42190b.f107404g;
        }
        return C42187a.C42190b.f107402e;
    }

    /* renamed from: a */
    public static Resources m173205a(CollaborateActivity collaborateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(collaborateActivity);
        }
        return collaborateActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m173208c(CollaborateActivity collaborateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(collaborateActivity);
        }
        return collaborateActivity.mo155721g();
    }

    /* renamed from: b */
    public static void m173207b(CollaborateActivity collaborateActivity) {
        collaborateActivity.mo155720f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CollaborateActivity collaborateActivity2 = collaborateActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    collaborateActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.share.collaborate.AbstractC43680e
    /* renamed from: c */
    public void mo155657c(String str) {
        Log.m165389i("CollaborateActivity", "onAddNewCollaboratorsSucceed");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("CollaborateActivity", "onAddNewCollaboratorsSucceed empty threadID");
        } else if (str.equals(this.f110756a.mo155733c())) {
            Log.m165389i("CollaborateActivity", "onAddNewCollaboratorsSucceed finish");
            C43752b.m173435a(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C43658a aVar = new C43658a(this, getIntent());
        this.f110756a = aVar;
        C43666c cVar = new C43666c(this, this.f110759d, aVar.mo155734d(), this.f110756a.mo155732b());
        this.f110757b = cVar;
        setContentView(cVar.mo155744a());
        if (this.f110756a.mo155734d() == CollaborateMode.Add) {
            this.f110757b.mo155747a(this.f110756a.mo155735e());
        } else {
            this.f110756a.mo155730a();
        }
        Watchers.m167206a(this);
    }

    @Override // com.ss.android.lark.mail.impl.share.collaborate.C43658a.AbstractC43662a
    /* renamed from: a */
    public void mo155716a(final ArrayList<Collaborator> arrayList) {
        Log.m165389i("CollaborateActivity", "onShareMemberListUpdated");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.RunnableC436552 */

            public void run() {
                CollaborateActivity.this.f110757b.mo155747a(arrayList);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.share.collaborate.C43658a.AbstractC43662a
    /* renamed from: a */
    public void mo155717a(boolean z) {
        int i;
        int i2;
        Log.m165389i("CollaborateActivity", "onCancelCollaborationFinished: " + z);
        this.f110757b.mo155749b();
        if (z) {
            if (this.f110756a.mo155732b() == PermissionCode.OWNER) {
                i2 = R.string.Mail_Share_StopShareToastSuccess;
            } else {
                i2 = R.string.Mail_Share_ToastQuitShareSuccess;
            }
            MailToast.m173698a(i2, MailToast.Type.SUCCESS);
            C43752b.m173435a(this);
            return;
        }
        if (this.f110756a.mo155732b() == PermissionCode.OWNER) {
            i = R.string.Mail_Share_StopShareToastFailed;
        } else {
            i = R.string.Mail_Share_ToastQuitShareFail;
        }
        MailToast.m173698a(i, MailToast.Type.FAIL);
        C42209j.m168612a("share_quit_share_from_owner_fail", "toast");
    }

    /* renamed from: a */
    public static void m173206a(CollaborateActivity collaborateActivity, Context context) {
        collaborateActivity.mo155715a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(collaborateActivity);
        }
    }

    /* renamed from: a */
    public static Context m173204a(CollaborateActivity collaborateActivity, Configuration configuration) {
        Context a = collaborateActivity.mo155714a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u
    /* renamed from: a */
    public void mo150850a(String str, String str2) {
        Log.m165389i("CollaborateActivity", "onUnShareThread");
        if (!TextUtils.isEmpty(str) && str.equals(this.f110756a.mo155733c())) {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.share.collaborate.$$Lambda$CollaborateActivity$5nnoVwpRxo9RLQbyR4A4dhm3fk */

                public final void run() {
                    CollaborateActivity.this.m173209h();
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.share.collaborate.C43658a.AbstractC43662a
    /* renamed from: a */
    public void mo155718a(boolean z, PermissionCode permissionCode) {
        Log.m165389i("CollaborateActivity", "onUpdateCollaboratorPermissionCodeFinished: " + z);
        this.f110757b.mo155749b();
        if (z) {
            this.f110756a.mo155730a();
            MailToast.m173698a((int) R.string.Mail_Normal_Success, MailToast.Type.SUCCESS);
            return;
        }
        MailToast.m173698a((int) R.string.Mail_Normal_Failed, MailToast.Type.FAIL);
    }
}
