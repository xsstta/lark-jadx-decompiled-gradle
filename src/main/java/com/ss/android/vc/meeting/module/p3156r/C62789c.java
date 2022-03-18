package com.ss.android.vc.meeting.module.p3156r;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.p034e.p035a.C0978a;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.TipInfoView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VcI18nKeyInfo;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatNoticeUpdate;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.subtitle.widget.C63215e;
import com.ss.android.vc.net.request.C63603f;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63751by;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;

/* renamed from: com.ss.android.vc.meeting.module.r.c */
public class C62789c extends AbstractC61424d {

    /* renamed from: a */
    private TipInfoView f157961a;

    /* renamed from: b */
    private ViewGroup f157962b;

    /* renamed from: c */
    private BroadcastReceiver f157963c;

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        m245719b();
    }

    /* renamed from: b */
    private void m245719b() {
        if (this.f157963c != null) {
            C0978a.m4782a(ar.m236694a()).mo4990a(this.f157963c);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        m245717a();
        VideoChat e = getMeeting().mo212056e();
        if (e != null && e.getMsgInfo() != null) {
            mo216840a(e.getMsgInfo());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.r.c$2 */
    public static /* synthetic */ class C627912 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157965a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.entity.VcI18nKeyInfo$Type[] r0 = com.ss.android.vc.entity.VcI18nKeyInfo.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.p3156r.C62789c.C627912.f157965a = r0
                com.ss.android.vc.entity.VcI18nKeyInfo$Type r1 = com.ss.android.vc.entity.VcI18nKeyInfo.Type.SCHEME_JUMP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.p3156r.C62789c.C627912.f157965a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.VcI18nKeyInfo$Type r1 = com.ss.android.vc.entity.VcI18nKeyInfo.Type.UPGRADE_JUMP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.p3156r.C62789c.C627912.f157965a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.VcI18nKeyInfo$Type r1 = com.ss.android.vc.entity.VcI18nKeyInfo.Type.CUSTOMER_JUMP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.p3156r.C62789c.C627912.f157965a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.VcI18nKeyInfo$Type r1 = com.ss.android.vc.entity.VcI18nKeyInfo.Type.SUBTITLE_SETTING_JUMP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.p3156r.C62789c.C627912.f157965a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.entity.VcI18nKeyInfo$Type r1 = com.ss.android.vc.entity.VcI18nKeyInfo.Type.PLAN_COUNT_DOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3156r.C62789c.C627912.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m245717a() {
        C60700b.m235851b("TipsViewControl", "[registerReceiver]", "registerReceiver");
        this.f157963c = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.module.p3156r.C62789c.C627901 */

            public void onReceive(Context context, Intent intent) {
                if ("tips_show".equals(intent.getAction())) {
                    C60700b.m235851b("TipsViewControl", "[registerReceiver2]", "onReceive ACTION_TIPS_SHOW");
                    VcMsgInfo vcMsgInfo = (VcMsgInfo) intent.getSerializableExtra("message");
                    if (vcMsgInfo != null) {
                        C62789c.this.mo216840a(vcMsgInfo);
                        VideoChat e = C62789c.this.getMeeting().mo212056e();
                        if (e != null) {
                            e.setMsgInfo(vcMsgInfo);
                        }
                    }
                } else if ("tips_update".equals(intent.getAction())) {
                    C60700b.m235851b("TipsViewControl", "[registerReceiver3]", "onReceive ACTION_TIPS_UPDATE");
                    VideoChatNoticeUpdate videoChatNoticeUpdate = (VideoChatNoticeUpdate) intent.getSerializableExtra("message");
                    if (videoChatNoticeUpdate != null && !TextUtils.isEmpty(videoChatNoticeUpdate.meetingId)) {
                        C62789c.this.mo216841a(videoChatNoticeUpdate);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("tips_show");
        intentFilter.addAction("tips_update");
        C0978a.m4782a(ar.m236694a()).mo4991a(this.f157963c, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m245720b(VcMsgInfo vcMsgInfo) {
        vcMsgInfo.isUiShown = true;
        VideoChatNoticeUpdate videoChatNoticeUpdate = new VideoChatNoticeUpdate();
        videoChatNoticeUpdate.action = VideoChatNoticeUpdate.Action.DISMISS;
        videoChatNoticeUpdate.key = vcMsgInfo.msg_i18n_key.key;
        videoChatNoticeUpdate.meetingId = getMeeting().mo212055d();
        C63603f.m249426a(videoChatNoticeUpdate);
        if (vcMsgInfo.msg_i18n_key.type == VcI18nKeyInfo.Type.PLAN_COUNT_DOWN) {
            getMeeting().ac().mo216835a(true);
        }
    }

    /* renamed from: a */
    public void mo216841a(VideoChatNoticeUpdate videoChatNoticeUpdate) {
        TipInfoView tipInfoView;
        C60700b.m235851b("TipsViewControl", "[dismissTipsOnPush]", "dismissTipsOnPush");
        if (videoChatNoticeUpdate != null && videoChatNoticeUpdate.meetingId != null && videoChatNoticeUpdate.key != null && (tipInfoView = this.f157961a) != null && tipInfoView.getVisibility() == 0 && videoChatNoticeUpdate.meetingId.equals(this.f157961a.f152097f) && videoChatNoticeUpdate.key.equals(this.f157961a.f152098g)) {
            this.f157961a.mo208497d();
        }
    }

    /* renamed from: a */
    public void mo216840a(VcMsgInfo vcMsgInfo) {
        if (C60773o.m236120a(getActivity()) && vcMsgInfo != null && !TextUtils.isEmpty(vcMsgInfo.message) && !vcMsgInfo.isUiShown) {
            if (vcMsgInfo.msg_i18n_key.type != VcI18nKeyInfo.Type.UPGRADE_JUMP || VideoChatModuleDependency.getAppUpgradeDependency().isHasNewVersion()) {
                if (vcMsgInfo.msg_i18n_key.type == VcI18nKeyInfo.Type.PLAN_COUNT_DOWN) {
                    TipInfoView tipInfoView = this.f157961a;
                    if (tipInfoView != null && tipInfoView.getVisibility() == 0) {
                        return;
                    }
                    if (getMeeting().ac().mo216836a()) {
                        C60700b.m235851b("TipsViewControl", "[showTips]", "isCountDownDismiss return.");
                        return;
                    } else if (getMeeting().ac().mo216838b()) {
                        C60700b.m235851b("TipsViewControl", "[showTips2]", "isRoomIn return.");
                        return;
                    }
                }
                if (vcMsgInfo.msg_i18n_key.type != VcI18nKeyInfo.Type.SUBTITLE_SETTING_JUMP || !C63634c.m249496b("byteview.callmeeting.android.subtitle_delete_spoken_language")) {
                    TipInfoView tipInfoView2 = this.f157961a;
                    if (tipInfoView2 != null && tipInfoView2.getVisibility() == 0) {
                        this.f157961a.mo208494b();
                    }
                    TipInfoView tipInfoView3 = new TipInfoView(getContext());
                    this.f157961a = tipInfoView3;
                    tipInfoView3.mo208492a(getMeeting().mo212055d(), vcMsgInfo, new TipInfoView.AbstractC60817c(vcMsgInfo) {
                        /* class com.ss.android.vc.meeting.module.p3156r.$$Lambda$c$Q10qnjLB5PS2e512q5laVbwNlyY */
                        public final /* synthetic */ VcMsgInfo f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.vc.common.widget.TipInfoView.AbstractC60817c
                        public final void onJump(VcI18nKeyInfo vcI18nKeyInfo) {
                            C62789c.this.m245718a(this.f$1, vcI18nKeyInfo);
                        }
                    });
                    if (vcMsgInfo.extra != null) {
                        this.f157961a.setTipIcon(vcMsgInfo.extra.get("icon_type"));
                    }
                    if (vcMsgInfo.msg_i18n_key.type == VcI18nKeyInfo.Type.PLAN_COUNT_DOWN) {
                        this.f157961a.setNeedCountDown(true);
                        getMeeting().ac().mo216835a(false);
                    } else {
                        this.f157961a.setNeedCountDown(false);
                    }
                    this.f157961a.setTimeout(vcMsgInfo.timeout);
                    this.f157961a.mo208491a(this.f157962b);
                    this.f157961a.setOnDismissListener(new TipInfoView.AbstractC60816b(vcMsgInfo) {
                        /* class com.ss.android.vc.meeting.module.p3156r.$$Lambda$c$Ys6aOnuzEQyTCC5swgbSOgCe1ag */
                        public final /* synthetic */ VcMsgInfo f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.vc.common.widget.TipInfoView.AbstractC60816b
                        public final void onDismiss() {
                            C62789c.this.m245720b(this.f$1);
                        }
                    });
                    if (vcMsgInfo.msg_i18n_key.type == VcI18nKeyInfo.Type.SUBTITLE_SETTING_JUMP) {
                        C63751by.m250228a(getMeeting().mo212056e());
                    }
                }
            }
        }
    }

    public C62789c(AbstractC61429i iVar, ViewGroup viewGroup) {
        super(iVar);
        this.f157962b = viewGroup;
        init();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        super.onOrientation(z, z2);
        TipInfoView tipInfoView = this.f157961a;
        if (tipInfoView != null && this.f157962b != null) {
            tipInfoView.mo208493a(z);
            this.f157961a.mo208491a(this.f157962b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245718a(VcMsgInfo vcMsgInfo, VcI18nKeyInfo vcI18nKeyInfo) {
        long j;
        int i = C627912.f157965a[vcI18nKeyInfo.type.ordinal()];
        long j2 = 1500;
        if (i == 1) {
            if (C28460b.m104296a(getActivity())) {
                try {
                    getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(vcI18nKeyInfo.jumpScheme)));
                } catch (Exception e) {
                    e.printStackTrace();
                    C60700b.m235864f("TipsViewControl", "[showTips3]", "startActivity" + vcI18nKeyInfo.jumpScheme);
                }
            }
            if (vcMsgInfo.cmd == 1) {
                MeetingChargingEvent.m249934b();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                j2 = 800;
            }
            gotoFloatWindow(j2);
        } else if (i == 2) {
            if (C28460b.m104296a(getActivity())) {
                VideoChatModuleDependency.getAppUpgradeDependency().launchAppUpgrade(getActivity());
            }
            if (Build.VERSION.SDK_INT < 26) {
                j = 1000;
            } else {
                j = 500;
            }
            gotoFloatWindow(j);
        } else if (i == 3) {
            if (C28460b.m104296a(getActivity())) {
                VideoChatModuleDependency.getCustomerServiceDependency().launchCustomerService(getActivity());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                j2 = 800;
            }
            gotoFloatWindow(j2);
        } else if (i == 4) {
            C63215e.m247567a(C60773o.m236124b(getContext()), getMeeting(), "mismatch_language_tip").mo211606a();
        } else if (i == 5) {
            if (C28460b.m104296a(getActivity())) {
                try {
                    getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(vcI18nKeyInfo.jumpScheme)));
                    C60700b.m235851b("TipsViewControl", "[showTips4]", "PLAN_COUNT_DOWN click with permissionGranted. url is empty:" + TextUtils.isEmpty(vcI18nKeyInfo.jumpScheme));
                } catch (Exception e2) {
                    e2.printStackTrace();
                    C60700b.m235864f("TipsViewControl", "[showTips5]", "startActivity" + vcI18nKeyInfo.jumpScheme);
                }
            }
            MeetingChargingEvent.m249935c();
            if (Build.VERSION.SDK_INT >= 26) {
                j2 = 800;
            }
            gotoFloatWindow(j2);
        }
    }
}
