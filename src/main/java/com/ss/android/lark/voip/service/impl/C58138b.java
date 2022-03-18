package com.ss.android.lark.voip.service.impl;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.vc.api.AbstractC57901c;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.AbstractC58001a;
import com.ss.android.lark.voip.service.impl.C58138b;
import com.ss.android.lark.voip.service.impl.app.AbstractC58046e;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.app.C58133t;
import com.ss.android.lark.voip.service.impl.app.KeyguardUnLockReceiver;
import com.ss.android.lark.voip.service.impl.app.VoIPFloatIcon;
import com.ss.android.lark.voip.service.impl.app.VoIpCallActivity;
import com.ss.android.lark.voip.service.impl.app.VoIpDialogHelper;
import com.ss.android.lark.voip.service.impl.p2915c.C58149g;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.service.IVideoChatService;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.voip.service.impl.b */
public class C58138b implements AbstractC58001a {

    /* renamed from: a */
    private Context f143016a;

    /* renamed from: b */
    private KeyguardUnLockReceiver f143017b;

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: a */
    public void mo196624a() {
        C58103o.m225371a().mo196938b();
        this.f143016a.unregisterReceiver(this.f143017b);
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: b */
    public boolean mo196629b() {
        return VoIpDialogHelper.m225111a().mo196763b();
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: e */
    public boolean mo196632e() {
        return VoIPFloatIcon.m225001a().mo196672b();
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: f */
    public boolean mo196633f() {
        return VoIpDialogHelper.m225111a().mo196764c();
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: c */
    public void mo196630c() {
        C58151d.m225578a("ui", "ui", "disable Rtc encryption", "[VoIpCall] disableByteRtcEncryption");
        C58149g.m225570a().mo210567y();
        C58149g.m225570a().mo210565w();
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: d */
    public void mo196631d() {
        C58151d.m225578a("ui", "ui", "stop VoIpCall", "[VoIpCallActivity] onStop: ");
        C58103o.m225371a().mo196935a(false);
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: g */
    public boolean mo196634g() {
        VoiceCall a;
        AbstractC58046e f = C58103o.m225371a().mo196949f();
        if (f == null || (a = f.mo196802a()) == null || a.getStatus() != VoiceCall.Status.RINGING || C58133t.m225480a(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo197024h() {
        VoiceCall a;
        AbstractC58046e f = C58103o.m225371a().mo196949f();
        if (f == null || (a = f.mo196802a()) == null) {
            return false;
        }
        if (a.getStatus() == VoiceCall.Status.CALLING || (a.getStatus() == VoiceCall.Status.RINGING && C58133t.m225480a(a))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: a */
    public void mo196628a(boolean z) {
        if (z) {
            VoipHitPoint.m225638i();
        }
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: a */
    public void mo196627a(Context context) {
        this.f143016a = context.getApplicationContext();
        this.f143017b = new KeyguardUnLockReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        m225503a(this.f143016a, this.f143017b, intentFilter);
        C58103o.m225371a().mo196936a(this.f143016a);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m225503a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: b */
    public void mo197023b(Activity activity, OpenChatter openChatter, String str) {
        C58151d.m225578a("ui", "ui", "start voip activity", "[VoIpCall] startVoIpActivity: enter thread = " + Thread.currentThread().getName());
        Intent intent = new Intent(activity, VoIpCallActivity.class);
        intent.putExtra("voip_user_info", openChatter);
        intent.putExtra("voip_initiative_call", true);
        intent.putExtra("voip_chat_id", str);
        try {
            activity.startActivity(intent);
            activity.overridePendingTransition(0, R.anim.activity_close_to_bottom);
        } catch (Exception e) {
            C58151d.m225579b("ui", "ui", "start voip activity fail", "[VoIpCall] startVoIpActivity: exception = " + e.toString());
        }
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: a */
    public void mo196625a(final Activity activity, final OpenChatter openChatter, final String str) {
        String str2;
        final AbstractC57987d.AbstractC57997h videoChatDependency = C57977a.m224905c().getVideoChatDependency();
        if (VoIPFloatIcon.m225001a().mo196672b() || ((videoChatDependency != null && videoChatDependency.mo145477a()) || VoIpDialogHelper.m225111a().mo196764c())) {
            LKUIToast.show(activity, (int) R.string.View_G_CurrentlyInCall);
        } else if (activity == null || NetworkUtils.isNetworkAvailable(activity)) {
            StringBuilder sb = new StringBuilder();
            sb.append("check audio permission userId = ");
            String str3 = "";
            if (openChatter != null) {
                str2 = openChatter.getId();
            } else {
                str2 = str3;
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[VoIpCall] showVoIpDialogCheckPermission: userId = ");
            if (openChatter != null) {
                str3 = openChatter.getId();
            }
            sb3.append(str3);
            C58151d.m225578a("ui", "rust", sb2, sb3.toString());
            final AbstractC57987d.AbstractC57988a chatDependency = C57977a.m224905c().getChatDependency();
            C57805b.m224326a(activity, new C57805b.AbstractC57809a() {
                /* class com.ss.android.lark.voip.service.impl.C58138b.C581391 */

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public void permissionGranted(boolean z) {
                    String str;
                    StringBuilder sb = new StringBuilder();
                    sb.append("audio permission ");
                    String str2 = "granted";
                    if (z) {
                        str = str2;
                    } else {
                        str = "refuse";
                    }
                    sb.append(str);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("[VoIpCall] showVoIpDialogCheckPermission: permission");
                    if (!z) {
                        str2 = "refuse";
                    }
                    sb3.append(str2);
                    C58151d.m225578a("rust", "ui", sb2, sb3.toString());
                    if (z) {
                        new C25639g(activity).mo89237b(UIHelper.mustacheFormat((int) R.string.View_E_EncryptedCallName, "name", chatDependency.mo145505a(openChatter))).mo89238b(true).mo89251j(2).mo89225a(R.id.lkui_dialog_btn_left, activity.getString(R.string.View_G_CancelButton), (DialogInterface.OnClickListener) null).mo89225a(R.id.lkui_dialog_btn_right, activity.getString(R.string.View_G_ConfirmButton), new DialogInterface.OnClickListener(videoChatDependency, activity, openChatter, str) {
                            /* class com.ss.android.lark.voip.service.impl.$$Lambda$b$1$oI61MtQ8Lum6cBcvM6pz4CEZM0 */
                            public final /* synthetic */ AbstractC57987d.AbstractC57997h f$1;
                            public final /* synthetic */ Activity f$2;
                            public final /* synthetic */ OpenChatter f$3;
                            public final /* synthetic */ String f$4;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                                this.f$4 = r5;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C58138b.C581391.this.m225517a(this.f$1, this.f$2, this.f$3, this.f$4, dialogInterface, i);
                            }
                        }).mo89239c();
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m225517a(AbstractC57987d.AbstractC57997h hVar, Activity activity, OpenChatter openChatter, String str, DialogInterface dialogInterface, int i) {
                    if (VoIPFloatIcon.m225001a().mo196672b() || (hVar != null && hVar.mo145477a())) {
                        C58151d.m225579b("ui", "ui", "start voip fail for busy", "[VoIpCall] showVoIpDialogCheckPermission: onClick call is running");
                        LKUIToast.show(activity, (int) R.string.View_G_CurrentlyInCall);
                        return;
                    }
                    VoipHitPoint.m225636h();
                    C58138b.this.mo197023b(activity, openChatter, str);
                }
            });
        } else {
            C58151d.m225578a("ui", "ui", "check audio permission fail for network unavailable", "[VoIpCall] showVoIpDialogCheckPermission: fail for network unavailable");
            LKUIToast.show(activity, (int) R.string.Lark_Legacy_NetworkUnAvailable);
        }
    }

    @Override // com.ss.android.lark.voip.service.AbstractC58001a
    /* renamed from: a */
    public void mo196626a(final Activity activity, final OpenChatter openChatter, final String str, final AbstractC57901c cVar) {
        String str2;
        AbstractC57987d.AbstractC57997h videoChatDependency = C57977a.m224905c().getVideoChatDependency();
        if (videoChatDependency == null) {
            C58151d.m225577a("VoIpCall", "[startVoIpActivityCheckPermission] mVideoChatService is null");
        } else if (VoIPFloatIcon.m225001a().mo196672b() || videoChatDependency.mo145477a() || VoIpDialogHelper.m225111a().mo196764c()) {
            C58151d.m225579b("ui", "ui", "start voip fail for busy", "[VoIpCall] startVoIpActivityCheckPermission: busy");
            if (mo196634g() || videoChatDependency.mo145478b()) {
                LKUIToast.show(activity, (int) R.string.View_G_IncomingCall);
            } else {
                LKUIToast.show(activity, (int) R.string.View_G_CurrentlyInCall);
            }
        } else if (activity != null && !NetworkUtils.isNetworkAvailable(activity)) {
            C58151d.m225579b("ui", "ui", "start voip fail for network unavailable", "[VoIpCall] startVoIpActivityCheckPermission: fail for network unavailable");
            LKUIToast.show(activity, (int) R.string.Lark_Legacy_NetworkUnAvailable);
        } else if (mo196634g() || mo197024h()) {
            C58151d.m225578a("ui", "ui", "already in a call, startVoIpActivity canceled", "[VoIpCall] already in a call, startVoIpActivity canceled, current status is " + C58103o.m225371a().mo196949f().mo196802a().getStatus().getNumber());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("check audio permission userId = ");
            String str3 = "";
            if (openChatter != null) {
                str2 = openChatter.getId();
            } else {
                str2 = str3;
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[VoIpCall] startVoIpActivityCheckPermission: userId = ");
            if (openChatter != null) {
                str3 = openChatter.getId();
            }
            sb3.append(str3);
            C58151d.m225578a("ui", "rust", sb2, sb3.toString());
            videoChatDependency.mo145476a(activity, openChatter, new IVideoChatService.AbstractC63627b() {
                /* class com.ss.android.lark.voip.service.impl.C58138b.C581402 */

                @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63627b
                /* renamed from: a */
                public void mo197025a() {
                    C58151d.m225577a("VoIpCall", "[startVoIpActivityCheckPermission] auth check passed");
                    C60735ab.m236001a(new Runnable(activity, openChatter, str) {
                        /* class com.ss.android.lark.voip.service.impl.$$Lambda$b$2$nvbqKk7EXSRJ182_NUCFnobldQ8 */
                        public final /* synthetic */ Activity f$1;
                        public final /* synthetic */ OpenChatter f$2;
                        public final /* synthetic */ String f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            C58138b.C581402.this.m225518a(this.f$1, this.f$2, this.f$3);
                        }
                    });
                }

                @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63627b
                /* renamed from: a */
                public void mo197026a(VCLaunchError vCLaunchError) {
                    C58151d.m225577a("VoIpCall", "[startVoIpActivityCheckPermission] auth check failed");
                    C60735ab.m236001a(new Runnable(vCLaunchError) {
                        /* class com.ss.android.lark.voip.service.impl.$$Lambda$b$2$vHH7kAOrQj7tw_TePigEdiUgB64 */
                        public final /* synthetic */ VCLaunchError f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            AbstractC57901c.this.onError(this.f$1);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m225518a(Activity activity, OpenChatter openChatter, String str) {
                    C57805b.m224326a(activity, new C57805b.AbstractC57809a(activity, openChatter, str) {
                        /* class com.ss.android.lark.voip.service.impl.$$Lambda$b$2$Dc_S1blYMsPWkRsL2liABTfrPg */
                        public final /* synthetic */ Activity f$1;
                        public final /* synthetic */ OpenChatter f$2;
                        public final /* synthetic */ String f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                        public final void permissionGranted(boolean z) {
                            C58138b.C581402.this.m225519a(this.f$1, this.f$2, this.f$3, z);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m225519a(Activity activity, OpenChatter openChatter, String str, boolean z) {
                    String str2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("audio permission ");
                    String str3 = "granted";
                    if (z) {
                        str2 = str3;
                    } else {
                        str2 = "refuse";
                    }
                    sb.append(str2);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("[VoIpCall] startVoIpActivityCheckPermission: permission");
                    if (!z) {
                        str3 = "refuse";
                    }
                    sb3.append(str3);
                    C58151d.m225578a("rust", "ui", sb2, sb3.toString());
                    if (z) {
                        C58138b.this.mo197023b(activity, openChatter, str);
                    }
                }
            });
        }
    }
}
