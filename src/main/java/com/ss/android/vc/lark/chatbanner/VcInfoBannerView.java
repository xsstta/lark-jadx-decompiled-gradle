package com.ss.android.vc.lark.chatbanner;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.common.widget.avatarlist.VcInfoBannerAvatarListView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.Status;
import com.ss.android.vc.entity.VCMeetingAbbrInfo;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.meeting.module.record.RecordingAniView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VcInfoBannerView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private TextView f152976a;

    /* renamed from: b */
    private TextView f152977b;

    /* renamed from: c */
    private ViewGroup f152978c;

    /* renamed from: d */
    private TextView f152979d;

    /* renamed from: e */
    private View f152980e;

    /* renamed from: f */
    private View f152981f;

    /* renamed from: g */
    private View f152982g;

    /* renamed from: h */
    private RecordingAniView f152983h;

    /* renamed from: i */
    private View f152984i;

    /* renamed from: j */
    private VcInfoBannerAvatarListView f152985j;

    /* renamed from: k */
    private VCMeetingAbbrInfo f152986k;

    /* renamed from: l */
    private AbstractC61084a f152987l;

    /* renamed from: m */
    private boolean f152988m;

    /* renamed from: n */
    private boolean f152989n;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.lark.chatbanner.VcInfoBannerView$a */
    public interface AbstractC61084a {
        /* renamed from: a */
        void mo211297a();

        /* renamed from: b */
        void mo211300b();

        /* renamed from: c */
        void mo211301c();

        /* renamed from: d */
        void mo211302d();

        /* renamed from: e */
        void mo211303e();

        /* renamed from: f */
        void mo211304f();

        /* renamed from: g */
        void mo211305g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.lark.chatbanner.VcInfoBannerView$b */
    public enum EnumC61085b {
        NORMAL,
        FULL,
        LOCKED
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo211317b() {
        AbstractC61084a aVar = this.f152987l;
        if (aVar != null) {
            aVar.mo211300b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo211318c() {
        AbstractC61084a aVar = this.f152987l;
        if (aVar != null) {
            aVar.mo211297a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo211319d() {
        AbstractC61084a aVar = this.f152987l;
        if (aVar != null) {
            aVar.mo211301c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo211320e() {
        AbstractC61084a aVar = this.f152987l;
        if (aVar != null) {
            aVar.mo211302d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo211321f() {
        AbstractC61084a aVar = this.f152987l;
        if (aVar != null) {
            aVar.mo211305g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.lark.chatbanner.VcInfoBannerView$1 */
    public static /* synthetic */ class C610831 {

        /* renamed from: a */
        static final /* synthetic */ int[] f152990a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.lark.chatbanner.VcInfoBannerView$b[] r0 = com.ss.android.vc.lark.chatbanner.VcInfoBannerView.EnumC61085b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.lark.chatbanner.VcInfoBannerView.C610831.f152990a = r0
                com.ss.android.vc.lark.chatbanner.VcInfoBannerView$b r1 = com.ss.android.vc.lark.chatbanner.VcInfoBannerView.EnumC61085b.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.lark.chatbanner.VcInfoBannerView.C610831.f152990a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.lark.chatbanner.VcInfoBannerView$b r1 = com.ss.android.vc.lark.chatbanner.VcInfoBannerView.EnumC61085b.FULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.lark.chatbanner.VcInfoBannerView.C610831.f152990a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.lark.chatbanner.VcInfoBannerView$b r1 = com.ss.android.vc.lark.chatbanner.VcInfoBannerView.EnumC61085b.LOCKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.lark.chatbanner.VcInfoBannerView.C610831.<clinit>():void");
        }
    }

    /* renamed from: h */
    private void m237549h() {
        C60700b.m235851b("VcInfoBannerView@", "[show]", "shown =" + this.f152989n);
        if (!this.f152989n) {
            this.f152989n = true;
            setVisibility(0);
            AbstractC61084a aVar = this.f152987l;
            if (aVar != null) {
                aVar.mo211303e();
            }
        }
    }

    /* renamed from: i */
    private void m237550i() {
        C60700b.m235851b("VcInfoBannerView@", "[hide]", "shown=" + this.f152989n);
        if (this.f152989n) {
            this.f152989n = false;
            this.f152983h.mo217346b();
            setVisibility(8);
            AbstractC61084a aVar = this.f152987l;
            if (aVar != null) {
                aVar.mo211304f();
            }
        }
    }

    /* renamed from: j */
    private void m237551j() {
        String str;
        if (!this.f152988m) {
            this.f152988m = true;
            C25644o oVar = new C25644o(getContext());
            LKUIListItemData[] nVarArr = new LKUIListItemData[2];
            nVarArr[0] = new LKUIListItemData(getResources().getString(R.string.View_M_Share));
            VCMeetingAbbrInfo sVar = this.f152986k;
            if (sVar == null) {
                str = "";
            } else {
                str = sVar.mo210146f();
            }
            nVarArr[1] = new LKUIListItemData(UIHelper.mustacheFormat((int) R.string.View_M_CopyLinkMeetingIDBraces, "meetingID", str));
            ((C25644o) ((C25644o) ((C25644o) ((C25644o) oVar.mo89205a(Arrays.asList(nVarArr))).mo89225a(R.id.lkui_dialog_btn_cancel, getResources().getString(R.string.View_G_CancelButton), new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.lark.chatbanner.$$Lambda$VcInfoBannerView$Dg39r7azewr46pOLxwxA5SJbwg */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    VcInfoBannerView.this.m237547b(dialogInterface, i);
                }
            })).mo89227a(new DialogInterface.OnDismissListener() {
                /* class com.ss.android.vc.lark.chatbanner.$$Lambda$VcInfoBannerView$sKl8COwxjpm_BvHbEWCU5KdIaQ */

                public final void onDismiss(DialogInterface dialogInterface) {
                    VcInfoBannerView.this.m237544a((VcInfoBannerView) dialogInterface);
                }
            })).mo89202a(new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.lark.chatbanner.$$Lambda$VcInfoBannerView$XGzGEBU0QSSyxyxKC5nLb66sNY */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    VcInfoBannerView.this.m237545a((VcInfoBannerView) dialogInterface, (DialogInterface) i);
                }
            })).mo89239c();
        }
    }

    /* renamed from: g */
    private void m237548g() {
        inflate(getContext(), R.layout.videochat_chat_window_banner_vc_info, this);
        setBackgroundColor(C60773o.m236126d(R.color.ud_G100));
        this.f152976a = (TextView) findViewById(R.id.vc_banner_topic);
        this.f152977b = (TextView) findViewById(R.id.vc_banner_time);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.vc_banner_join);
        this.f152978c = viewGroup;
        viewGroup.setOnClickListener(this);
        this.f152980e = findViewById(R.id.vc_banner_join_lock);
        this.f152979d = (TextView) findViewById(R.id.vc_banner_join_text);
        View findViewById = findViewById(R.id.vc_banner_more);
        this.f152984i = findViewById;
        findViewById.setOnClickListener(this);
        this.f152981f = findViewById(R.id.vc_banner_live);
        this.f152982g = findViewById(R.id.vc_banner_recording);
        this.f152983h = (RecordingAniView) findViewById(R.id.vc_banner_recording_anim);
        VcInfoBannerAvatarListView vcInfoBannerAvatarListView = (VcInfoBannerAvatarListView) findViewById(R.id.vc_banner_participants);
        this.f152985j = vcInfoBannerAvatarListView;
        vcInfoBannerAvatarListView.setOnClickListener(this);
        setVisibility(8);
    }

    /* renamed from: a */
    public void mo211314a() {
        long j;
        long j2;
        VCMeetingAbbrInfo sVar = this.f152986k;
        long j3 = 0;
        if (sVar == null) {
            j = 0;
        } else {
            j = sVar.mo210143d().longValue();
        }
        long syncNtpTimeMillis = VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis();
        C60700b.m235851b("VcInfoBannerView@", "[updateTime]", "update [start_time]" + j + "  [currentTime]" + syncNtpTimeMillis);
        if (j > 0) {
            j2 = (syncNtpTimeMillis - j) / 1000;
        } else {
            j2 = 0;
        }
        if (j2 >= 0) {
            j3 = j2;
        }
        this.f152977b.setText(C60774p.m236130a(j3));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237544a(DialogInterface dialogInterface) {
        this.f152988m = false;
    }

    public void setActionListener(AbstractC61084a aVar) {
        this.f152987l = aVar;
    }

    public VcInfoBannerView(Context context) {
        super(context);
        m237548g();
    }

    private void setJoinBtnWidth(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f152978c.getLayoutParams();
        layoutParams.width = i;
        this.f152978c.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private Participant m237541a(VCParticipantAbbrInfo tVar) {
        Participant participant = new Participant();
        ByteviewUser b = tVar.mo210170b();
        participant.setId(b.getUserId());
        participant.setParticipantType(b.getParticipantType());
        return participant;
    }

    public void onClick(View view) {
        if (view == this.f152984i) {
            m237551j();
        } else if (view == this.f152978c) {
            mo211320e();
        } else if (view == this.f152985j) {
            mo211321f();
        }
    }

    /* renamed from: a */
    private List<Participant> m237542a(List<VCParticipantAbbrInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (VCParticipantAbbrInfo tVar : list) {
            arrayList.add(m237541a(tVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo211315a(VCMeetingAbbrInfo sVar) {
        boolean z;
        int i;
        C60700b.m235851b("VcInfoBannerView@", "[update]", "  [meeting_info]" + sVar);
        this.f152986k = sVar;
        if (sVar == null) {
            m237550i();
            return;
        }
        EnumC61085b bVar = EnumC61085b.NORMAL;
        if (sVar.mo210140a()) {
            bVar = EnumC61085b.LOCKED;
        } else if (sVar.mo210148h().booleanValue()) {
            bVar = EnumC61085b.FULL;
        }
        int i2 = 0;
        if (C61086a.m237567a(sVar) != 0) {
            z = true;
        } else {
            z = false;
        }
        m237546a(bVar, z);
        View view = this.f152981f;
        if (sVar.mo210150i().booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f152982g;
        if (!sVar.mo210151j().booleanValue()) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        if (sVar.mo210151j().booleanValue()) {
            this.f152983h.mo217344a();
        } else {
            this.f152983h.mo217346b();
        }
        C60700b.m235851b("VcInfoBannerView@", "[update2]", "[topic modified]" + sVar.mo210152k() + "  [topic]" + sVar.mo210142c());
        if (sVar.mo210152k().booleanValue()) {
            this.f152976a.setText(sVar.mo210142c());
        } else {
            this.f152976a.setText(getResources().getString(R.string.View_M_MeetingInProgress));
        }
        mo211314a();
        this.f152985j.mo208617a(sVar.mo210141b(), m237542a(m237543a(sVar.mo210147g(), Status.ON_THE_CALL)));
        m237549h();
    }

    /* renamed from: a */
    public void mo211316a(boolean z) {
        C60700b.m235851b("VcInfoBannerView@", "[updateJoined]", " [joined]" + z + "  [shown]" + this.f152989n);
        if (this.f152986k == null) {
            C60700b.m235861e("VcInfoBannerView@", "[updateJoined2]", "current meeting is null");
        } else if (this.f152989n) {
            if (z) {
                m237550i();
            }
        } else if (!z) {
            m237549h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m237547b(DialogInterface dialogInterface, int i) {
        mo211319d();
    }

    public VcInfoBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m237548g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237545a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            mo211318c();
        } else if (i == 1) {
            mo211317b();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    private List<VCParticipantAbbrInfo> m237543a(List<VCParticipantAbbrInfo> list, Status status) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (VCParticipantAbbrInfo tVar : list) {
            if (tVar.mo210169a() == status) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m237546a(EnumC61085b bVar, boolean z) {
        boolean z2;
        int i = 0;
        if (bVar == EnumC61085b.NORMAL || (bVar == EnumC61085b.LOCKED && z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f152978c.setActivated(z2);
        View view = this.f152980e;
        if (bVar != EnumC61085b.LOCKED) {
            i = 8;
        }
        view.setVisibility(i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.vc_banner_join_width);
        if (bVar == EnumC61085b.LOCKED && !z) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.vc_banner_join_locked_width);
        }
        setJoinBtnWidth(dimensionPixelSize);
        int i2 = C610831.f152990a[bVar.ordinal()];
        if (i2 == 1) {
            this.f152979d.setText(R.string.View_M_JoinButton);
        } else if (i2 == 2) {
            this.f152979d.setText(R.string.Lark_View_FullButton);
        } else if (i2 == 3) {
            if (z) {
                this.f152979d.setText(R.string.View_M_JoinButton);
            } else {
                this.f152979d.setText(R.string.View_M_Locked);
            }
        }
    }

    public VcInfoBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m237548g();
    }
}
