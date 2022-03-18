package com.ss.android.vc.meeting.module.toptips;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.p3159s.AbstractC62904a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0014H\u0016R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/vc/meeting/module/toptips/TopTipsViewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseViewControl;", "Lcom/ss/android/vc/meeting/module/toptips/AbsTopTipsControl$ITopTipsViewListener;", "present", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "hasCloseBtn", "", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;Z)V", "rootView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;Z)V", "mCloseBtn", "Landroid/view/View;", "mConfirm", "Landroid/widget/TextView;", "mContainer", "Landroid/widget/FrameLayout;", "mContent", "mRootView", "mTipsOnClickListner", "Lcom/ss/android/vc/meeting/module/toptips/AbsTopTipsControl$ITipsOnClickListener;", "closeTips", "", "destroy", "initView", "onStart", "setConfirmText", "confirmText", "", "setContent", "content", "showTips", "tipsOnClickListener", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.s.c */
public final class TopTipsViewControl extends AbstractC61424d implements AbstractC62904a.AbstractC62907c {

    /* renamed from: c */
    public static final Companion f158452c = new Companion(null);

    /* renamed from: a */
    public AbstractC62904a.AbstractC62906b f158453a;

    /* renamed from: b */
    public FrameLayout f158454b;

    /* renamed from: d */
    private View f158455d;

    /* renamed from: e */
    private TextView f158456e;

    /* renamed from: f */
    private TextView f158457f;

    /* renamed from: g */
    private View f158458g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/toptips/TopTipsViewControl$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.s.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a.AbstractC62907c
    /* renamed from: a */
    public void mo217390a() {
        FrameLayout frameLayout = this.f158454b;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        AbstractC62904a ad;
        super.destroy();
        C61303k meeting = getMeeting();
        if (meeting != null && (ad = meeting.ad()) != null) {
            ad.mo217387a(null);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onStart() {
        super.onStart();
        C61303k meeting = getMeeting();
        if (meeting != null) {
            AbstractC62904a ad = meeting.ad();
            Intrinsics.checkExpressionValueIsNotNull(ad, "it.topTipsControl");
            if (ad.mo217388b()) {
                meeting.ad().mo217386a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m246330a(TopTipsViewControl cVar) {
        FrameLayout frameLayout = cVar.f158454b;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        }
        return frameLayout;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.s.c$c */
    public static final class View$OnClickListenerC62912c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TopTipsViewControl f158460a;

        View$OnClickListenerC62912c(TopTipsViewControl cVar) {
            this.f158460a = cVar;
        }

        public final void onClick(View view) {
            FrameLayout a = TopTipsViewControl.m246330a(this.f158460a);
            if (a != null) {
                a.setVisibility(8);
            }
            AbstractC62904a.AbstractC62906b bVar = this.f158460a.f158453a;
            if (bVar != null) {
                C60700b.m235851b("TopTipsViewControl", "[initView]", "confirm tips");
                bVar.mo215232a();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a.AbstractC62907c
    /* renamed from: b */
    public void mo217393b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "confirmText");
        TextView textView = this.f158457f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfirm");
        }
        textView.setText(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.s.c$b */
    public static final class View$OnClickListenerC62911b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TopTipsViewControl f158459a;

        View$OnClickListenerC62911b(TopTipsViewControl cVar) {
            this.f158459a = cVar;
        }

        public final void onClick(View view) {
            FrameLayout a = TopTipsViewControl.m246330a(this.f158459a);
            if (a != null) {
                a.setVisibility(8);
            }
            AbstractC62904a.AbstractC62906b bVar = this.f158459a.f158453a;
            if (bVar != null) {
                C60700b.m235851b("TopTipsViewControl", "[initView]", "click close tips");
                if (bVar != null) {
                    ((AbstractC62904a.AbstractC62905a) bVar).mo217389b();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.vc.meeting.module.toptips.AbsTopTipsControl.ITipsInMeetingOnClickListener");
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a.AbstractC62907c
    /* renamed from: a */
    public void mo217391a(AbstractC62904a.AbstractC62906b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tipsOnClickListener");
        C60700b.m235851b("TopTipsViewControl", "[showTips]", "show");
        this.f158453a = bVar;
        FrameLayout frameLayout = this.f158454b;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3159s.AbstractC62904a.AbstractC62907c
    /* renamed from: a */
    public void mo217392a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        TextView textView = this.f158456e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContent");
        }
        textView.setText(str);
    }

    /* renamed from: a */
    private final void m246331a(boolean z) {
        C60700b.m235851b("TopTipsViewControl", "[initView]", "start");
        if (this.mPresent != null) {
            View findViewById = findViewById(R.id.container_top_tips);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.container_top_tips)");
            this.f158454b = (FrameLayout) findViewById;
            LayoutInflater from = LayoutInflater.from(getActivity());
            FrameLayout frameLayout = this.f158454b;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            }
            from.inflate(R.layout.vc_top_tips_layout, (ViewGroup) frameLayout, true);
            View findViewById2 = findViewById(R.id.tv_ok);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.tv_ok)");
            this.f158457f = (TextView) findViewById2;
            View findViewById3 = findViewById(R.id.v_close);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.v_close)");
            this.f158455d = findViewById3;
            View findViewById4 = findViewById(R.id.tv_tips);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.tv_tips)");
            this.f158456e = (TextView) findViewById4;
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ad().mo217387a(this);
        }
        View view = this.f158458g;
        if (view != null) {
            View findViewById5 = view.findViewById(R.id.container_top_tips);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "it.findViewById(R.id.container_top_tips)");
            this.f158454b = (FrameLayout) findViewById5;
            LayoutInflater from2 = LayoutInflater.from(view.getContext());
            FrameLayout frameLayout2 = this.f158454b;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            }
            from2.inflate(R.layout.vc_top_tips_layout, (ViewGroup) frameLayout2, true);
            View findViewById6 = view.findViewById(R.id.tv_ok);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "it.findViewById(R.id.tv_ok)");
            this.f158457f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tv_tips);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "it.findViewById(R.id.tv_tips)");
            this.f158456e = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.v_close);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "it.findViewById(R.id.v_close)");
            this.f158455d = findViewById8;
        }
        FrameLayout frameLayout3 = this.f158454b;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        }
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(8);
        }
        if (z) {
            View view2 = this.f158455d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
            }
            view2.setVisibility(0);
            View view3 = this.f158455d;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
            }
            view3.setOnClickListener(new View$OnClickListenerC62911b(this));
        }
        TextView textView = this.f158457f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfirm");
        }
        textView.setOnClickListener(new View$OnClickListenerC62912c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopTipsViewControl(AbstractC61429i iVar, boolean z) {
        super(iVar);
        Intrinsics.checkParameterIsNotNull(iVar, "present");
        m246331a(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopTipsViewControl(ViewGroup viewGroup, boolean z) {
        super(null);
        Intrinsics.checkParameterIsNotNull(viewGroup, "rootView");
        this.f158458g = viewGroup;
        m246331a(z);
    }
}
