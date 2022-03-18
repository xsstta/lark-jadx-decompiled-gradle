package com.ss.android.vc.meeting.module.follow.p3120a;

import android.view.View;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.VCFloatLayout;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.FollowControl;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event2.MeetingMagicShareEvent;

/* renamed from: com.ss.android.vc.meeting.module.follow.a.c */
public class C61760c extends C61756a implements AbstractC61767j {

    /* renamed from: c */
    private LKUIRoundedImageView f154972c;

    /* renamed from: d */
    private VCFloatLayout f154973d;

    /* renamed from: e */
    private View f154974e;

    /* renamed from: f */
    private C61303k f154975f;

    /* renamed from: com.ss.android.vc.meeting.module.follow.a.c$1 */
    static /* synthetic */ class C617611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f154976a;

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
                com.ss.android.vc.meeting.module.follow.FollowControl$FollowDirection[] r0 = com.ss.android.vc.meeting.module.follow.FollowControl.FollowDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.follow.p3120a.C61760c.C617611.f154976a = r0
                com.ss.android.vc.meeting.module.follow.FollowControl$FollowDirection r1 = com.ss.android.vc.meeting.module.follow.FollowControl.FollowDirection.UP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.follow.p3120a.C61760c.C617611.f154976a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.follow.FollowControl$FollowDirection r1 = com.ss.android.vc.meeting.module.follow.FollowControl.FollowDirection.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.follow.p3120a.C61760c.C617611.f154976a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.follow.FollowControl$FollowDirection r1 = com.ss.android.vc.meeting.module.follow.FollowControl.FollowDirection.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.follow.p3120a.C61760c.C617611.f154976a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.module.follow.FollowControl$FollowDirection r1 = com.ss.android.vc.meeting.module.follow.FollowControl.FollowDirection.DOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.follow.p3120a.C61760c.C617611.f154976a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.meeting.module.follow.FollowControl$FollowDirection r1 = com.ss.android.vc.meeting.module.follow.FollowControl.FollowDirection.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.follow.p3120a.C61760c.C617611.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241159a(VideoChatUser videoChatUser) {
        if (videoChatUser != null && this.f154972c != null) {
            C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), this.f154972c, C60773o.m236115a(28.0d), C60773o.m236115a(28.0d));
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61767j
    /* renamed from: a */
    public void mo213957a(FollowControl.FollowDirection followDirection) {
        C60700b.m235851b("FollowLog_FollowIndicatorViewCont", "[showPresenterView]", "isSharingDevice: " + this.f154975f.ab().mo213889o() + " direction: " + followDirection + " status: " + this.f154975f.ab().mo213896v());
        if (this.f154975f.ab().mo213889o() || followDirection == FollowControl.FollowDirection.UNKNOWN) {
            this.f154973d.setVisibility(4);
            return;
        }
        if (this.f154975f.ab().mo213896v()) {
            this.f154973d.setVisibility(0);
        } else {
            this.f154973d.setVisibility(4);
        }
        FollowInfo h = this.f154975f.ab().mo213882h();
        if (h != null) {
            if (h.getShareType() == FollowInfo.ShareType.UNIVERSAL) {
                this.f154973d.setVisibility(4);
                return;
            }
            UserInfoService.getUserInfoById(this.f154975f.mo212055d(), h.getUserId(), h.getUserType(), new GetUserInfoListener() {
                /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$c$qkAyUSDX1E4D0ktzk4y8RXH1l0 */

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    C61760c.m271248lambda$qkAyUSDX1E4D0ktzk4y8RXH1l0(C61760c.this, videoChatUser);
                }
            });
        }
        this.f154974e.findViewById(R.id.presenter_rl).setOnClickListener(new View.OnClickListener(h) {
            /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$c$UEIYbZn2PgiyiDvr2pPals1qBl0 */
            public final /* synthetic */ FollowInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C61760c.lambda$UEIYbZn2PgiyiDvr2pPals1qBl0(C61760c.this, this.f$1, view);
            }
        });
        int i = C617611.f154976a[followDirection.ordinal()];
        if (i == 1) {
            this.f154973d.findViewById(R.id.follow_arrow_up).setVisibility(0);
            this.f154973d.findViewById(R.id.follow_arrow_down).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_left).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_right).setVisibility(4);
        } else if (i == 2) {
            this.f154973d.findViewById(R.id.follow_arrow_up).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_down).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_left).setVisibility(0);
            this.f154973d.findViewById(R.id.follow_arrow_right).setVisibility(4);
        } else if (i == 3) {
            this.f154973d.findViewById(R.id.follow_arrow_up).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_down).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_left).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_right).setVisibility(0);
        } else if (i != 4) {
            this.f154973d.findViewById(R.id.follow_arrow_up).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_down).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_left).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_right).setVisibility(4);
        } else {
            this.f154973d.findViewById(R.id.follow_arrow_up).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_down).setVisibility(0);
            this.f154973d.findViewById(R.id.follow_arrow_left).setVisibility(4);
            this.f154973d.findViewById(R.id.follow_arrow_right).setVisibility(4);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61767j
    /* renamed from: a */
    public void mo213958a(boolean z, boolean z2) {
        C60700b.m235851b("FollowLog_FollowIndicatorViewCont", "[onOrientation]", String.format("%s, %s", Boolean.valueOf(z), Boolean.valueOf(z2)));
    }

    public C61760c(C61303k kVar, View view) {
        super(kVar);
        this.f154975f = kVar;
        this.f154974e = view;
        this.f154972c = (LKUIRoundedImageView) view.findViewById(R.id.presenter_image);
        VCFloatLayout vCFloatLayout = (VCFloatLayout) view.findViewById(R.id.fv_gesture_icon);
        this.f154973d = vCFloatLayout;
        vCFloatLayout.setStickyMode(VCFloatLayout.StickyMode.RIGHT);
        this.f154973d.setVisibility(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241158a(FollowInfo followInfo, View view) {
        C63742at.m250102i(this.f154975f.mo212056e(), followInfo);
        MeetingMagicShareEvent.m249817a().mo220297a("follow_icon", null, Boolean.valueOf(this.f154960a.ab().mo213889o()), null, this.f154960a.mo212056e(), null);
        this.f154960a.ab().mo213887m();
    }
}
