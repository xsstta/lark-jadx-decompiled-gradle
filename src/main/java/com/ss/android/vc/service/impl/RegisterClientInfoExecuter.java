package com.ss.android.vc.service.impl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.RegisterClientInfoEntity;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.RegisterClientInfoEntityRequest;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.utils.C63490f;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.p3094g.C61001b;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.C63685a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@XClass(isStatic = true)
public class RegisterClientInfoExecuter {

    /* renamed from: a */
    public static UDDialog f160668a;

    /* renamed from: b */
    public static C63490f f160669b = VideoChatManager.m249444a().mo220134l();

    @XClass(runOnProcess = XProcess.VC)
    private static class OnDialogClickListener {
        private OnDialogClickListener() {
        }

        @XMethod
        public static void onRight(String str, String str2) {
            C60700b.m235851b("RegisterClientInfoExecuter", "[checkStateRecovery9]", "<recovery> user cancel rejoin , then end the meeting");
            RegisterClientInfoExecuter.f160669b.mo219634a();
            VcBizService.updateVideoChat(null, str, str2, VideoChat.UpdateVideoChatAction.TERMINATE.getNumber(), null, null);
        }

        @XMethod
        public static void onLeft(String str, String str2) {
            C60700b.m235851b("RegisterClientInfoExecuter", "[checkStateRecovery10]", "<recovery> user click rejoin, meetingId = " + str);
            RegisterClientInfoExecuter.f160669b.mo219634a();
            C57744a.m224104a().putString("vc_sp_key_recovery_meeting_id", str);
            VcBizService.reJoinVideoMeeting(1, str, false, null);
        }
    }

    /* renamed from: b */
    public static void m249570b() {
        C60700b.m235851b("RegisterClientInfoExecuter", "[checkStateRecovery3]", "<recovery> updateAfterNetReconnect");
        if (VideoChatModuleDependency.getLoginDependency().isLogin()) {
            m249568a(RegisterClientInfoEntityRequest.SourceType.LONG_CONNECTION_LOSS);
        }
    }

    /* renamed from: c */
    public static void m249571c() {
        if (f160668a != null) {
            C60700b.m235851b("RegisterClientInfoExecuter", "dismissDialog", "dismiss");
            f160668a.dismiss();
            f160668a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.service.impl.RegisterClientInfoExecuter$4 */
    public static /* synthetic */ class C636524 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160676a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.entity.RegisterClientInfoEntity$StatusCode[] r0 = com.ss.android.vc.entity.RegisterClientInfoEntity.StatusCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.service.impl.RegisterClientInfoExecuter.C636524.f160676a = r0
                com.ss.android.vc.entity.RegisterClientInfoEntity$StatusCode r1 = com.ss.android.vc.entity.RegisterClientInfoEntity.StatusCode.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.service.impl.RegisterClientInfoExecuter.C636524.f160676a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.RegisterClientInfoEntity$StatusCode r1 = com.ss.android.vc.entity.RegisterClientInfoEntity.StatusCode.INACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.service.impl.RegisterClientInfoExecuter.C636524.f160676a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.RegisterClientInfoEntity$StatusCode r1 = com.ss.android.vc.entity.RegisterClientInfoEntity.StatusCode.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.service.impl.RegisterClientInfoExecuter.C636524.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m249564a() {
        boolean z;
        RegisterClientInfoEntityRequest.SourceType sourceType;
        boolean z2 = true;
        boolean a = MeetingManager.m238341a().mo211892a(true);
        C60700b.m235851b("RegisterClientInfoExecuter", "[checkStateRecovery1]", "<recovery> currentOngoing=" + a);
        if (!a) {
            Context a2 = ar.m236694a();
            List<String> b = f160669b.mo219637b();
            if (b == null || b.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            C61001b bVar = new C61001b(a2);
            boolean booleanValue = bVar.mo210459a().booleanValue();
            bVar.mo210461a(false);
            StringBuilder sb = new StringBuilder();
            sb.append("<recovery> shouldRecovery=");
            sb.append(z);
            sb.append(" , crash=");
            sb.append(booleanValue);
            sb.append(" , context is valid ");
            if (a2 == null) {
                z2 = false;
            }
            sb.append(z2);
            C60700b.m235851b("RegisterClientInfoExecuter", "[checkStateRecovery2]", sb.toString());
            if (z) {
                for (String str : b) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("conference_id", str);
                        C63685a.m249653a("vc_voip_interrupted", jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if (booleanValue) {
                    sourceType = RegisterClientInfoEntityRequest.SourceType.CRASHED_STARTUP;
                } else {
                    sourceType = RegisterClientInfoEntityRequest.SourceType.KILLED_STARTUP;
                }
                m249568a(sourceType);
                return;
            }
            f160669b.mo219634a();
        }
    }

    /* renamed from: a */
    private static void m249566a(Participant participant) {
        int i;
        if (participant != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resp_status", participant.getStatus().toString());
                int i2 = 2;
                if (VCAppLifeCycle.m236255b()) {
                    i = 1;
                } else {
                    i = 2;
                }
                jSONObject.put("app_foreground", i);
                if (VideoChatService.m249602d().isOngoing(true)) {
                    i2 = 1;
                }
                jSONObject.put("vc_is_ongoing", i2);
                C63682b.m249642a("vc_ws_reconnected", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m249568a(final RegisterClientInfoEntityRequest.SourceType sourceType) {
        AbstractC61294b bVar;
        List<AbstractC61294b> b = MeetingManager.m238341a().mo211894b();
        if (b.size() == 1) {
            bVar = b.get(0);
        } else {
            if (b.size() > 1) {
                Iterator<AbstractC61294b> it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC61294b next = it.next();
                    if (next.mo212065n()) {
                        bVar = next;
                        break;
                    }
                }
            }
            bVar = null;
        }
        final Participant.Status status = Participant.Status.UNKNOWN;
        if (bVar == null) {
            status = Participant.Status.IDLE;
        } else if (bVar.mo212062k()) {
            status = Participant.Status.IDLE;
        } else if (bVar.mo212064m()) {
            status = Participant.Status.CALLING;
        } else if (bVar.mo212065n()) {
            status = Participant.Status.ON_THE_CALL;
        } else if (bVar.mo212063l()) {
            status = Participant.Status.RINGING;
        }
        VcBizSender.m249146a(status, true, sourceType).mo219893b(new AbstractC63598b<RegisterClientInfoEntity>() {
            /* class com.ss.android.vc.service.impl.RegisterClientInfoExecuter.C636491 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("RegisterClientInfoExecuter", "[checkStateRecovery7]", "<recovery> err = " + eVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0082, code lost:
                if (com.ss.android.lark.desktopmode.utils.DesktopUtil.m144301a(com.ss.android.vc.dependency.ar.m236694a()) != false) goto L_0x0087;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
                if (r0 != 3) goto L_0x00b5;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a6, code lost:
                if (com.ss.android.lark.desktopmode.utils.DesktopUtil.m144301a(com.ss.android.vc.dependency.ar.m236694a()) != false) goto L_0x0087;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0077, code lost:
                if (r0 != 3) goto L_0x00b5;
             */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x013d  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(com.ss.android.vc.entity.RegisterClientInfoEntity r11) {
                /*
                // Method dump skipped, instructions count: 330
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.service.impl.RegisterClientInfoExecuter.C636491.onSuccess(com.ss.android.vc.entity.RegisterClientInfoEntity):void");
            }
        });
    }

    /* renamed from: a */
    public static void m249567a(VideoChat videoChat, String str) {
        String str2;
        C60700b.m235851b("RegisterClientInfoExecuter", "[checkStateRecovery8]", "<recovery> show dialog");
        if (!TextUtils.isEmpty(str)) {
            Context a = ar.m236694a();
            if (videoChat == null || videoChat.getVideoChatSettings() == null) {
                str2 = "";
            } else {
                str2 = videoChat.getVideoChatSettings().getTopic();
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2.length() > 20) {
                    str2 = str2.substring(0, 20) + "...";
                }
            } else if (a != null) {
                str2 = a.getResources().getString(R.string.View_G_ServerNoTitle);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("meeting_topic", str2);
            showDialogX(UIHelper.mustacheFormat((int) R.string.View_M_RejoinMeetingTopicBraces, hashMap), str, MeetingUtil.m238372c(videoChat));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if (r2.getStatus().getNumber() == com.ss.android.vc.entity.Participant.Status.ON_THE_CALL.getNumber()) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m249565a(com.ss.android.vc.entity.Participant.Status r10, java.util.List<com.ss.android.vc.entity.VideoChat> r11) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.service.impl.RegisterClientInfoExecuter.m249565a(com.ss.android.vc.entity.Participant$Status, java.util.List):void");
    }

    @XMethod
    private static void showDialogX(String str, String str2, String str3) {
        C60700b.m235851b("RegisterClientInfoExecuter", "[checkStateRecovery11]", "<showDialogX> meetingId=" + str2 + ", interactiveId=" + str3);
        Activity c = VCAppLifeCycle.m236256c();
        if (c != null) {
            UICallbackExecutor.execute(new Runnable(str, c, str2, str3) {
                /* class com.ss.android.vc.service.impl.$$Lambda$RegisterClientInfoExecuter$sbM2LeI7v99vO0XlHSHk_gXUBfk */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    RegisterClientInfoExecuter.m249569a(this.f$0, this.f$1, this.f$2, this.f$3);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m249569a(String str, Activity activity, final String str2, final String str3) {
        float f;
        C60700b.m235851b("RegisterClientInfoExecuter", "[checkStateRecovery12]", "<recovery> show dialog , message is " + str);
        UDDialogBuilder eVar = new UDDialogBuilder(activity);
        UDDialogBuilder eVar2 = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(str)).backgroundResource(R.drawable.bg_vc_dialog_float)).titleColor(R.color.text_title)).titleLineCount(3)).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.primary_pri_500).mo90704a(activity.getResources().getString(R.string.View_G_RejoinButton)).mo90716g(R.drawable.bg_ud_dialog_right_button).mo90703a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.service.impl.RegisterClientInfoExecuter.DialogInterface$OnClickListenerC636513 */

            public void onClick(DialogInterface dialogInterface, int i) {
                OnDialogClickListener.onLeft(str2, str3);
                dialogInterface.dismiss();
                RegisterClientInfoExecuter.f160668a = null;
            }
        }))).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_secondary).mo90710d(R.color.text_title).mo90704a(activity.getResources().getString(R.string.View_G_NoThanksButton)).mo90703a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.service.impl.RegisterClientInfoExecuter.DialogInterface$OnClickListenerC636502 */

            public void onClick(DialogInterface dialogInterface, int i) {
                OnDialogClickListener.onRight(str2, str3);
                dialogInterface.dismiss();
                RegisterClientInfoExecuter.f160668a = null;
            }
        }));
        if (UDUiModeUtils.m93320a(activity.getResources().getConfiguration())) {
            f = 0.7f;
        } else {
            f = 0.4f;
        }
        ((UDDialogBuilder) eVar2.maskAlpha(f)).cancelOnTouchOutside(false);
        UDDialog build = eVar.build();
        f160668a = build;
        build.show();
    }
}
