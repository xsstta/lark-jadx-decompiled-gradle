package com.ss.android.vc.meeting.module.single.callingringing.observers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver;
import com.ss.android.vc.meeting.utils.C63529q;
import com.ss.android.vc.statistics.event.C63765n;
import com.ss.android.vc.statistics.p3180a.C63693e;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016J \u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\u0012\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/vc/meeting/module/single/callingringing/observers/CrTopBtnsObserver;", "Lcom/ss/android/vc/meeting/module/single/callingringing/observers/base/CallingRingingBaseObserver;", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioStateChangedListener;", "fragment", "Landroidx/fragment/app/Fragment;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Landroidx/fragment/app/Fragment;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "mMinimizeView", "Lcom/ss/android/vc/common/widget/IconFontView;", "mSpeakerContainerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mSpeakerTextView", "Landroid/widget/TextView;", "mSpeakerView", "initClickEvent", "", "initSpeakerView", "onAudioMuted", "onAudioStateChanged", "lastType", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "lastOutSpeaker", "", "needTrack", "onAudioStateUnchanged", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onObserverCreated", "showSpeakerView", "updateTopMarginByStatusBar", "view", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CrTopBtnsObserver extends CallingRingingBaseObserver implements MeetingAudioManager.AbstractC61403a {

    /* renamed from: c */
    private ConstraintLayout f158956c;

    /* renamed from: d */
    private IconFontView f158957d;

    /* renamed from: e */
    private IconFontView f158958e;

    /* renamed from: f */
    private TextView f158959f;

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioMuted() {
    }

    /* renamed from: c */
    private final void m247035c() {
        IconFontView iconFontView = this.f158957d;
        if (iconFontView != null) {
            C63529q.m248970a(iconFontView, new C63067a(this));
        }
    }

    /* renamed from: d */
    private final void m247036d() {
        ConstraintLayout constraintLayout = this.f158956c;
        if (constraintLayout != null) {
            C60752f.m236079a((View) constraintLayout);
        }
        ConstraintLayout constraintLayout2 = this.f158956c;
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new View$OnClickListenerC63068b(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.CrTopBtnsObserver$a */
    public static final class C63067a extends Lambda implements Function0<Unit> {
        final /* synthetic */ CrTopBtnsObserver this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63067a(CrTopBtnsObserver crTopBtnsObserver) {
            super(0);
            this.this$0 = crTopBtnsObserver;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C60700b.m235851b(this.this$0.mo217936f(), "[onClick]", "click calling minimize button");
            C61303k kVar = this.this$0.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            AbstractC61728a ae = kVar.ae();
            Fragment fragment = this.this$0.f151992a;
            Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
            if (ae.mo213808a(fragment.getActivity(), 0)) {
                if (this.this$0.mo217937g() == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
                    C63693e.m249682a("calling");
                } else {
                    C63693e.m249682a("single_ringing");
                }
                C61303k kVar2 = this.this$0.f151993b;
                Intrinsics.checkExpressionValueIsNotNull(kVar2, "meeting");
                C60700b.m235841a(kVar2.mo212056e(), "UI", "UI", "clickCallingMinimize", this.this$0.mo217936f(), "clickCallingMinimizeButton");
            }
        }
    }

    /* renamed from: b */
    private final void m247034b() {
        boolean i = mo217939i();
        boolean z = false;
        if (mo217937g() == ByteRTCMeetingActivity.TYPE.CALLING.ordinal()) {
            m247036d();
        } else {
            i = false;
        }
        Fragment fragment = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
        if (!DesktopUtil.m144301a((Context) fragment.getActivity())) {
            z = i;
        }
        String f = mo217936f();
        C60700b.m235851b(f, "[initSpeakerView]", "voiceOnlyCall=" + z);
        MeetingAudioManager.m239471k().mo212694b(z);
    }

    @Override // com.ss.android.vc.meeting.module.single.callingringing.observers.base.CallingRingingBaseObserver
    public void ca_() {
        IconFontView iconFontView;
        ConstraintLayout constraintLayout;
        IconFontView iconFontView2;
        Fragment fragment = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
        View view = fragment.getView();
        TextView textView = null;
        if (view != null) {
            iconFontView = (IconFontView) view.findViewById(R.id.calling_minimize);
        } else {
            iconFontView = null;
        }
        this.f158957d = iconFontView;
        Fragment fragment2 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment2, "fragment");
        View view2 = fragment2.getView();
        if (view2 != null) {
            constraintLayout = (ConstraintLayout) view2.findViewById(R.id.speaker_container);
        } else {
            constraintLayout = null;
        }
        this.f158956c = constraintLayout;
        Fragment fragment3 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment3, "fragment");
        View view3 = fragment3.getView();
        if (view3 != null) {
            iconFontView2 = (IconFontView) view3.findViewById(R.id.calling_speaker);
        } else {
            iconFontView2 = null;
        }
        this.f158958e = iconFontView2;
        m247033a(this.f158957d);
        Fragment fragment4 = this.f151992a;
        Intrinsics.checkExpressionValueIsNotNull(fragment4, "fragment");
        View view4 = fragment4.getView();
        if (view4 != null) {
            textView = (TextView) view4.findViewById(R.id.calling_speaker_text);
        }
        this.f158959f = textView;
        MeetingAudioManager.m239471k().mo212685a(this);
        m247035c();
        m247034b();
    }

    @Override // com.ss.android.vc.common.lifecycle.BaseFragmentLifeCycleObserver, androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        super.onDestroy(lifecycleOwner);
        MeetingAudioManager.m239471k().mo212693b(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.single.callingringing.observers.CrTopBtnsObserver$b */
    public static final class View$OnClickListenerC63068b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrTopBtnsObserver f158960a;

        View$OnClickListenerC63068b(CrTopBtnsObserver crTopBtnsObserver) {
            this.f158960a = crTopBtnsObserver;
        }

        public final void onClick(View view) {
            MeetingAudioManager k = MeetingAudioManager.m239471k();
            Intrinsics.checkExpressionValueIsNotNull(k, "MeetingAudioManager.getInstance()");
            MeetingAudioManager.AudioType y = k.mo212720y();
            MeetingAudioManager k2 = MeetingAudioManager.m239471k();
            Intrinsics.checkExpressionValueIsNotNull(k2, "MeetingAudioManager.getInstance()");
            boolean z = k2.mo212721z();
            C61303k kVar = this.f158960a.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            C63765n.m250320a(y, z, kVar.mo212056e());
            MeetingAudioManager.m239471k().mo212708m();
        }
    }

    /* renamed from: a */
    private final void m247033a(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin += C60776r.m236148f();
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrTopBtnsObserver(Fragment fragment, C61303k kVar) {
        super(fragment, kVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(audioType, "lastType");
        MeetingAudioManager k = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k, "MeetingAudioManager.getInstance()");
        boolean z3 = k.mo212721z();
        if (z2) {
            C61303k kVar = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            C63765n.m250323b(audioType, z3, kVar.mo212056e());
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(audioType, "lastType");
        MeetingAudioManager k = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k, "MeetingAudioManager.getInstance()");
        boolean z3 = k.mo212721z();
        MeetingAudioManager k2 = MeetingAudioManager.m239471k();
        Intrinsics.checkExpressionValueIsNotNull(k2, "MeetingAudioManager.getInstance()");
        MeetingAudioManager.AudioType y = k2.mo212720y();
        String f = mo217936f();
        C60700b.m235851b(f, "[onAudioStateChanged]", "type=" + y + ", isOutSpeaker=" + z3);
        if (z3) {
            IconFontView iconFontView = this.f158958e;
            if (iconFontView != null) {
                iconFontView.setText(R.string.iconfont_icon_speaker_solid);
            }
            TextView textView = this.f158959f;
            if (textView != null) {
                textView.setText(R.string.View_VM_Speaker);
            }
        } else if (y != null) {
            int i = C63080a.f158987a[y.ordinal()];
            if (i == 1) {
                IconFontView iconFontView2 = this.f158958e;
                if (iconFontView2 != null) {
                    iconFontView2.setText(R.string.iconfont_icon_ear);
                }
                TextView textView2 = this.f158959f;
                if (textView2 != null) {
                    textView2.setText(R.string.View_G_Receiver);
                }
            } else if (i == 2) {
                IconFontView iconFontView3 = this.f158958e;
                if (iconFontView3 != null) {
                    iconFontView3.setText(R.string.iconfont_icon_bluetooth);
                }
                TextView textView3 = this.f158959f;
                if (textView3 != null) {
                    textView3.setText(R.string.View_G_Bluetooth);
                }
            } else if (i == 3) {
                IconFontView iconFontView4 = this.f158958e;
                if (iconFontView4 != null) {
                    iconFontView4.setText(R.string.iconfont_icon_headphone);
                }
                TextView textView4 = this.f158959f;
                if (textView4 != null) {
                    textView4.setText(R.string.View_G_Headphones);
                }
            }
        }
        if (z2) {
            C61303k kVar = this.f151993b;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "meeting");
            C63765n.m250321a(audioType, z, y, z3, kVar.mo212056e());
        }
    }
}
