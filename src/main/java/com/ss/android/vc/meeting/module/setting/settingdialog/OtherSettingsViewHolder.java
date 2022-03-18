package com.ss.android.vc.meeting.module.setting.settingdialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62604b;
import com.ss.android.vc.meeting.module.preview.MeetingDeviceSwitchStateUtil;
import com.ss.android.vc.meeting.module.subtitle.widget.C63215e;
import com.ss.android.vc.net.service.VCSyncGetService;
import com.ss.android.vc.statistics.event.C63751by;
import com.ss.android.vc.statistics.event.bb;
import com.ss.android.vc.statistics.event2.MeetingSettingEvent2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/vc/meeting/module/setting/settingdialog/OtherSettingsViewHolder;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "Lcom/ss/android/vc/meeting/module/setting/AbsSettingsControl$ISettingsViewControl;", "activity", "Landroid/app/Activity;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "dialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "(Landroid/app/Activity;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "TAG", "", "closeBtn", "Landroid/view/View;", "mMirrorContainer", "mSubtitleContainer", "mirrorSwitcher", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "ussSettingHint", "Landroid/widget/TextView;", "ussSettingSwitcher", "contentView", "initAction", "", "initView", "rootView", "onAutoConnectChanged", "open", "", "onDismiss", "refreshWhenCameraSwitch", "saveMirrorSetting", "setMirrorStatus", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.o.a.m */
public final class OtherSettingsViewHolder implements AbstractC61222a.AbstractC61223a, AbstractC62604b.AbstractC62605a {

    /* renamed from: a */
    public final String f157561a = "OtherSettingsViewHolder";

    /* renamed from: b */
    public UDSwitch f157562b;

    /* renamed from: c */
    public Activity f157563c;

    /* renamed from: d */
    public C61303k f157564d;

    /* renamed from: e */
    public AbstractC61222a f157565e;

    /* renamed from: f */
    private View f157566f;

    /* renamed from: g */
    private View f157567g;

    /* renamed from: h */
    private View f157568h;

    /* renamed from: i */
    private UDSwitch f157569i;

    /* renamed from: j */
    private TextView f157570j;

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62604b.AbstractC62605a
    /* renamed from: a */
    public void mo216359a() {
        if (this.f157562b != null) {
            C60735ab.m236001a(new RunnableC62598e(this));
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a.AbstractC61223a
    public void bY_() {
        m244818f();
        AbstractC61417a W = this.f157564d.mo212105W();
        Intrinsics.checkExpressionValueIsNotNull(W, "meeting.meetingControl");
        W.mo212818G().mo216379b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.m$e */
    static final class RunnableC62598e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OtherSettingsViewHolder f157578a;

        RunnableC62598e(OtherSettingsViewHolder mVar) {
            this.f157578a = mVar;
        }

        public final void run() {
            String str = this.f157578a.f157561a;
            C60700b.m235851b(str, "[refreshWhenCameraSwitch]", "isFrontCamera check to " + this.f157578a.f157564d + ".byteRtc.isFrontCamera");
            UDSwitch uDSwitch = this.f157578a.f157562b;
            if (uDSwitch != null) {
                ByteRtc y = this.f157578a.f157564d.mo212165y();
                Intrinsics.checkExpressionValueIsNotNull(y, "meeting.byteRtc");
                uDSwitch.setEnabled(y.mo212029l());
            }
        }
    }

    /* renamed from: d */
    private final void m244816d() {
        UDSwitch uDSwitch;
        ByteRtc y = this.f157564d.mo212165y();
        Intrinsics.checkExpressionValueIsNotNull(y, "meeting.byteRtc");
        if (!y.mo212029l() && (uDSwitch = this.f157562b) != null) {
            uDSwitch.setEnabled(false);
        }
        UDSwitch uDSwitch2 = this.f157562b;
        if (uDSwitch2 != null) {
            AbstractC61417a W = this.f157564d.mo212105W();
            Intrinsics.checkExpressionValueIsNotNull(W, "meeting.meetingControl");
            AbstractC62604b G = W.mo212818G();
            Intrinsics.checkExpressionValueIsNotNull(G, "meeting.meetingControl.settingsControl");
            uDSwitch2.setChecked(G.mo216377a());
        }
    }

    /* renamed from: e */
    private final void m244817e() {
        View view = this.f157566f;
        if (view != null) {
            view.setOnClickListener(new C62592a(this));
        }
        View view2 = this.f157567g;
        if (!(view2 == null || view2 == null)) {
            view2.setOnClickListener(new C62593b(this));
        }
        UDSwitch uDSwitch = this.f157562b;
        if (uDSwitch != null && uDSwitch != null) {
            uDSwitch.setOnCheckedChangeListener(new C62595c(this));
        }
    }

    /* renamed from: c */
    public final View mo216361c() {
        View inflate = LayoutInflater.from(this.f157563c).inflate(R.layout.other_settings, (ViewGroup) null);
        AbstractC61417a W = this.f157564d.mo212105W();
        Intrinsics.checkExpressionValueIsNotNull(W, "meeting.meetingControl");
        W.mo212818G().mo216375a(this);
        m244815a(inflate);
        m244817e();
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        return inflate;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/setting/settingdialog/OtherSettingsViewHolder$initAction$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.m$b */
    public static final class C62593b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ OtherSettingsViewHolder f157572a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.o.a.m$b$a */
        static final class RunnableC62594a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C62593b f157573a;

            RunnableC62594a(C62593b bVar) {
                this.f157573a = bVar;
            }

            public final void run() {
                C63215e.m247567a(this.f157573a.f157572a.f157563c, this.f157573a.f157572a.f157564d, "setting_page").mo211606a();
                MeetingSettingEvent2.f160860b.mo220361a().mo220352a((String) null, this.f157573a.f157572a.f157564d.mo212056e(), (String) null, "subtitle");
                MeetingSettingEvent2.m249884a(MeetingSettingEvent2.f160860b.mo220361a(), this.f157573a.f157572a.f157564d, "subtitle_set", "main", null, null, 24, null);
                C63751by.m250232c(this.f157573a.f157572a.f157564d.mo212056e());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62593b(OtherSettingsViewHolder mVar) {
            this.f157572a = mVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C60700b.m235851b(this.f157572a.f157561a, "[onClick2]", "click subtitle, got to subtitle setting page");
            C60735ab.m236001a(new RunnableC62594a(this));
        }
    }

    /* renamed from: f */
    private final void m244818f() {
        boolean z;
        UDSwitch uDSwitch = this.f157562b;
        if (uDSwitch != null) {
            z = uDSwitch.isChecked();
        } else {
            z = false;
        }
        String str = this.f157561a;
        C60700b.m235851b(str, "[saveMirrorSetting]", "isMirrorSwitchOn = " + z);
        ViewDeviceSetting viewDeviceSetting = VCSyncGetService.getViewDeviceSetting();
        if (viewDeviceSetting == null) {
            viewDeviceSetting = new ViewDeviceSetting();
        }
        ViewDeviceSetting.Video video = viewDeviceSetting.video;
        if (video == null) {
            video = new ViewDeviceSetting.Video();
            if (C62269o.m243179b() != null) {
                video.advancedBeauty = C62269o.m243179b().toString();
            }
            if (C62269o.f156438b != null) {
                video.backgroundBlur = C62269o.f156438b.isBlur;
                video.virtualBackground = C62269o.f156438b.key;
            }
        }
        video.mirror = z;
        viewDeviceSetting.video = video;
        VCSyncGetService.setViewDeviceSetting(viewDeviceSetting);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/setting/settingdialog/OtherSettingsViewHolder$initAction$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.m$a */
    public static final class C62592a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ OtherSettingsViewHolder f157571a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62592a(OtherSettingsViewHolder mVar) {
            this.f157571a = mVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            C60700b.m235851b(this.f157571a.f157561a, "[onClick]", "click closeBtn, dismiss");
            this.f157571a.f157565e.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo216360a(boolean z) {
        MeetingDeviceSwitchStateUtil.m245166b(Boolean.valueOf(z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m244815a(android.view.View r5) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.setting.settingdialog.OtherSettingsViewHolder.m244815a(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "mirrorBtn", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.m$c */
    public static final class C62595c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ OtherSettingsViewHolder f157574a;

        C62595c(OtherSettingsViewHolder mVar) {
            this.f157574a = mVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
            String str = this.f157574a.f157561a;
            C60700b.m235851b(str, "[onClick3]", "click mirrorBtn, isChecked is " + z);
            C60735ab.m236001a(new Runnable(this) {
                /* class com.ss.android.vc.meeting.module.setting.settingdialog.OtherSettingsViewHolder.C62595c.RunnableC625961 */

                /* renamed from: a */
                final /* synthetic */ C62595c f157575a;

                {
                    this.f157575a = r1;
                }

                public final void run() {
                    bb.m250148a(z, this.f157575a.f157574a.f157564d.mo212056e());
                    AbstractC61417a W = this.f157575a.f157574a.f157564d.mo212105W();
                    Intrinsics.checkExpressionValueIsNotNull(W, "meeting.meetingControl");
                    AbstractC62604b G = W.mo212818G();
                    Intrinsics.checkExpressionValueIsNotNull(G, "meeting.meetingControl.settingsControl");
                    G.mo216376a(z);
                    AbstractC61417a W2 = this.f157575a.f157574a.f157564d.mo212105W();
                    Intrinsics.checkExpressionValueIsNotNull(W2, "meeting.meetingControl");
                    W2.mo212818G().mo216378b();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.o.a.m$d */
    public static final class C62597d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ OtherSettingsViewHolder f157577a;

        C62597d(OtherSettingsViewHolder mVar) {
            this.f157577a = mVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str = this.f157577a.f157561a;
            C60700b.m235851b(str, "ussSetting", "ussSettingSwitcher isChecked: " + z);
            MeetingSettingEvent2.f160860b.mo220361a().mo220356a(z, this.f157577a.f157564d.mo212056e());
            this.f157577a.mo216360a(z);
        }
    }

    public OtherSettingsViewHolder(Activity activity, C61303k kVar, AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        Intrinsics.checkParameterIsNotNull(aVar, "dialog");
        this.f157563c = activity;
        this.f157564d = kVar;
        this.f157565e = aVar;
    }
}
