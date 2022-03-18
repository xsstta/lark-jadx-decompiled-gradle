package com.ss.android.vc.meeting.module.sharescreen;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event.MeetingShareScreenEvent;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u001a\u0010\"\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u001a\u0010$\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharescreen/ShareScreenStub;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "audioLayout", "audioSwitch", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "getRootView", "()Landroid/view/View;", "setRootView", "shareScreenContainer", "startShareScreenBtn", "Landroid/widget/TextView;", "startShareStatusLt", "Lcom/ss/android/vc/common/widget/LineHeightTextView;", "stopShareScreenBtn", "stopShareStatusLt", "getShareContainer", "gone", "", "initIfNotInflated", "setNeedShareAudio", "shareScreenControl", "Lcom/ss/android/vc/meeting/module/sharescreen/AbsShareScreenControl;", "needShareAudio", "", "updateShareAudioViews", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "updateStartShareViewsVisibility", "visible", "updateStopViewsVisibility", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.p.d */
public final class ShareScreenStub {

    /* renamed from: a */
    private final String f157639a = "ShareScreenViewControl_ShareScreenStub";

    /* renamed from: b */
    private View f157640b;

    /* renamed from: c */
    private TextView f157641c;

    /* renamed from: d */
    private TextView f157642d;

    /* renamed from: e */
    private LineHeightTextView f157643e;

    /* renamed from: f */
    private LineHeightTextView f157644f;

    /* renamed from: g */
    private UDSwitch f157645g;

    /* renamed from: h */
    private View f157646h;

    /* renamed from: i */
    private View f157647i;

    /* renamed from: a */
    public final View mo216439a() {
        return this.f157640b;
    }

    /* renamed from: b */
    private final void m244992b() {
        Context context;
        TextView textView;
        LineHeightTextView lineHeightTextView;
        View view;
        UDSwitch uDSwitch;
        TextView textView2;
        if (this.f157640b == null) {
            View view2 = this.f157647i;
            LineHeightTextView lineHeightTextView2 = null;
            if (view2 != null) {
                context = view2.getContext();
            } else {
                context = null;
            }
            View a = C60748b.m236068a(context, R.layout.mobile_share_screen_prompt_layout, null, false);
            this.f157640b = a;
            if (a != null) {
                textView = (TextView) a.findViewById(R.id.tv_stop_share);
            } else {
                textView = null;
            }
            this.f157641c = textView;
            View view3 = this.f157640b;
            if (view3 != null) {
                lineHeightTextView = (LineHeightTextView) view3.findViewById(R.id.lt_stop_text);
            } else {
                lineHeightTextView = null;
            }
            this.f157643e = lineHeightTextView;
            View view4 = this.f157640b;
            if (view4 != null) {
                view = view4.findViewById(R.id.audio_share_layout);
            } else {
                view = null;
            }
            this.f157646h = view;
            View view5 = this.f157640b;
            if (view5 != null) {
                uDSwitch = (UDSwitch) view5.findViewById(R.id.audio_share_switch);
            } else {
                uDSwitch = null;
            }
            this.f157645g = uDSwitch;
            View view6 = this.f157640b;
            if (view6 != null) {
                textView2 = (TextView) view6.findViewById(R.id.tv_start_share);
            } else {
                textView2 = null;
            }
            this.f157642d = textView2;
            View view7 = this.f157640b;
            if (view7 != null) {
                lineHeightTextView2 = (LineHeightTextView) view7.findViewById(R.id.lt_not_share_text);
            }
            this.f157644f = lineHeightTextView2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.p.d$a */
    public static final class C62618a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ShareScreenStub f157648a;

        /* renamed from: b */
        final /* synthetic */ C61303k f157649b;

        /* renamed from: c */
        final /* synthetic */ boolean f157650c;

        C62618a(ShareScreenStub dVar, C61303k kVar, boolean z) {
            this.f157648a = dVar;
            this.f157649b = kVar;
            this.f157650c = z;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Z", "com/ss/android/vc/meeting/module/sharescreen/ShareScreenStub$updateShareAudioViews$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.p.d$a$a */
        static final class C62619a extends Lambda implements Function1<Boolean, Boolean> {
            final /* synthetic */ boolean $isChecked$inlined;
            final /* synthetic */ Ref.BooleanRef $needShareAudio;
            final /* synthetic */ AbstractC62612a $this_apply;
            final /* synthetic */ C62618a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62619a(AbstractC62612a aVar, Ref.BooleanRef booleanRef, C62618a aVar2, boolean z) {
                super(1);
                this.$this_apply = aVar;
                this.$needShareAudio = booleanRef;
                this.this$0 = aVar2;
                this.$isChecked$inlined = z;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Boolean invoke(Boolean bool) {
                return Boolean.valueOf(invoke(bool));
            }

            public final boolean invoke(Boolean bool) {
                Ref.BooleanRef booleanRef = this.$needShareAudio;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it");
                booleanRef.element = bool.booleanValue();
                if (this.$needShareAudio.element && this.this$0.f157650c) {
                    C63742at.m250065a(this.this$0.f157649b.mo212056e(), this.$isChecked$inlined);
                }
                this.this$0.f157648a.mo216441a(this.$this_apply, this.$needShareAudio.element);
                return this.$needShareAudio.element;
            }
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AbstractC62612a aj;
            C61303k kVar = this.f157649b;
            if (kVar != null && (aj = kVar.aj()) != null) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = z;
                if (z) {
                    aj.mo216405a(new C62619a(aj, booleanRef, this, z));
                    return;
                }
                aj.mo216420j();
                this.f157648a.mo216441a(aj, false);
            }
        }
    }

    public ShareScreenStub(View view) {
        this.f157647i = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/vc/meeting/module/sharescreen/ShareScreenStub$updateStartShareViewsVisibility$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.p.d$b */
    public static final class View$OnClickListenerC62620b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f157651a;

        /* renamed from: b */
        final /* synthetic */ C61303k f157652b;

        View$OnClickListenerC62620b(int i, C61303k kVar) {
            this.f157651a = i;
            this.f157652b = kVar;
        }

        public final void onClick(View view) {
            C61303k kVar = this.f157652b;
            if (kVar != null) {
                kVar.aj().mo216412c();
                if (this.f157652b.f153550c == VideoChat.Type.CALL) {
                    C63763l.m250305b(this.f157652b.mo212056e());
                } else if (this.f157652b.f153550c == VideoChat.Type.MEET) {
                    C63742at.m250105l(this.f157652b.mo212056e());
                }
                MeetingShareScreenEvent.f160896b.mo220396a().mo220395a("start_sharing", "none", this.f157652b.mo212056e(), this.f157652b.mo212093K());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/vc/meeting/module/sharescreen/ShareScreenStub$updateStopViewsVisibility$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.p.d$c */
    public static final class View$OnClickListenerC62621c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f157653a;

        /* renamed from: b */
        final /* synthetic */ int f157654b;

        /* renamed from: c */
        final /* synthetic */ C61303k f157655c;

        View$OnClickListenerC62621c(boolean z, int i, C61303k kVar) {
            this.f157653a = z;
            this.f157654b = i;
            this.f157655c = kVar;
        }

        public final void onClick(View view) {
            VideoChatSettings.SubType subType;
            VideoChatSettings videoChatSettings;
            C61303k kVar = this.f157655c;
            if (kVar != null) {
                VideoChat e = kVar.mo212056e();
                if (e == null || (videoChatSettings = e.getVideoChatSettings()) == null) {
                    subType = null;
                } else {
                    subType = videoChatSettings.getSubType();
                }
                if (subType == VideoChatSettings.SubType.SCREEN_SHARE) {
                    this.f157655c.ah().mo219482b();
                } else {
                    AbstractC62612a aj = this.f157655c.aj();
                    if (aj != null) {
                        aj.mo216414d();
                    }
                }
                if (this.f157655c.f153550c == VideoChat.Type.CALL) {
                    C63763l.m250310d(this.f157655c.mo212056e());
                } else if (this.f157655c.f153550c == VideoChat.Type.MEET) {
                    C63742at.m250107n(this.f157655c.mo212056e());
                }
                MeetingShareScreenEvent.f160896b.mo220396a().mo220395a("stop_sharing", "none", this.f157655c.mo212056e(), this.f157655c.mo212093K());
                MeetingOnTheCallEvent2.m249824a(MeetingOnTheCallEvent2.f160846b.mo220311a(), this.f157655c, "stop_share_screen", null, null, null, null, 60, null);
            }
        }
    }

    /* renamed from: b */
    private final void m244993b(C61303k kVar) {
        boolean z;
        AbstractC62612a aj;
        int i;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 29 || !C62614c.m244945q()) {
            z = false;
        } else {
            z = true;
        }
        View view = this.f157646h;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        UDSwitch uDSwitch = this.f157645g;
        if (uDSwitch != null) {
            if (kVar == null || (aj = kVar.aj()) == null || !aj.mo216422l()) {
                z2 = false;
            }
            uDSwitch.setChecked(z2);
        }
        UDSwitch uDSwitch2 = this.f157645g;
        if (uDSwitch2 != null) {
            uDSwitch2.setOnCheckedChangeListener(new C62618a(this, kVar, z));
        }
    }

    /* renamed from: a */
    public final void mo216440a(C61303k kVar) {
        VideoChat e;
        VideoChatSettings videoChatSettings;
        boolean z;
        m244992b();
        C60700b.m235851b(this.f157639a, "[visible]", String.valueOf(this.f157640b));
        View view = this.f157640b;
        if (view != null) {
            C60752f.m236079a(view);
        }
        if (kVar != null && (e = kVar.mo212056e()) != null && (videoChatSettings = e.getVideoChatSettings()) != null) {
            VideoChatSettings.SubType subType = videoChatSettings.getSubType();
            Intrinsics.checkExpressionValueIsNotNull(subType, "it.subType");
            if (subType.getNumber() == VideoChatSettings.SubType.SCREEN_SHARE.getNumber()) {
                AbstractC62612a aj = kVar.aj();
                Intrinsics.checkExpressionValueIsNotNull(aj, "meeting.shareScreenControl");
                if (!aj.mo216408a()) {
                    z = true;
                    m244994b(kVar, z);
                    m244991a(kVar, !z);
                    m244993b(kVar);
                }
            }
            z = false;
            m244994b(kVar, z);
            m244991a(kVar, !z);
            m244993b(kVar);
        }
    }

    /* renamed from: a */
    public final void mo216441a(AbstractC62612a aVar, boolean z) {
        aVar.mo216413c(z);
        UDSwitch uDSwitch = this.f157645g;
        if (uDSwitch != null) {
            uDSwitch.setChecked(z);
        }
    }

    /* renamed from: b */
    private final void m244994b(C61303k kVar, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LineHeightTextView lineHeightTextView = this.f157644f;
        if (lineHeightTextView != null) {
            lineHeightTextView.setVisibility(i);
        }
        TextView textView = this.f157642d;
        if (textView != null) {
            textView.setVisibility(i);
            textView.setOnClickListener(new View$OnClickListenerC62620b(i, kVar));
        }
    }

    /* renamed from: a */
    private final void m244991a(C61303k kVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        VideoChat e;
        VideoChatSettings videoChatSettings;
        VideoChatSettings.SubType subType;
        int i3 = 0;
        if (kVar == null || (e = kVar.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null || (subType = videoChatSettings.getSubType()) == null || subType.getNumber() != VideoChatSettings.SubType.SCREEN_SHARE.getNumber()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z) {
            i3 = 8;
        }
        LineHeightTextView lineHeightTextView = this.f157643e;
        if (lineHeightTextView != null) {
            lineHeightTextView.setVisibility(i3);
        }
        LineHeightTextView lineHeightTextView2 = this.f157643e;
        if (lineHeightTextView2 != null) {
            if (z2) {
                i2 = R.string.View_M_NowSharingToastMirroring;
            } else {
                i2 = R.string.View_M_NowSharingToast;
            }
            lineHeightTextView2.setText(i2);
        }
        TextView textView = this.f157641c;
        if (textView != null) {
            if (z2) {
                i = R.string.View_VM_StopSharingMirroring;
            } else {
                i = R.string.View_VM_StopSharing;
            }
            textView.setText(i);
            textView.setVisibility(i3);
            textView.setOnClickListener(new View$OnClickListenerC62621c(z2, i3, kVar));
        }
    }
}
