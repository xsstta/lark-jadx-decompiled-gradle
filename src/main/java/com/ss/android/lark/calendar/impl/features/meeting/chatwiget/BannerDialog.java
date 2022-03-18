package com.ss.android.lark.calendar.impl.features.meeting.chatwiget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0014J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0004J\b\u0010\u001e\u001a\u00020\u0015H\u0004J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\"H\u0014J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\u0015H\u0014J\b\u0010(\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meeting/chatwiget/BannerDialog;", "Lcom/ss/android/lark/calendar/impl/features/meeting/chatwiget/BaseBannerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationProgress", "", "backgrondColor", "", "dialog2TitleAnim", "Landroid/animation/ValueAnimator;", "isBigStyle", "", "marginLeftRight", "rootViewMagin", "shadowOffsetY", "title2DialogAnim", "bindEventData", "", "title", "", "time", "location", "expandBanner", "foldBanner", "init", "initBanner", "initBaseWidth", "initView", "setCloseListener", "closeListner", "Landroid/view/View$OnClickListener;", "setConfirmListener", "confirmListener", "showBigShadow", "showMiniShadow", "updateBannerTopMargin", "updateView", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BannerDialog extends AbstractC31960b {

    /* renamed from: b */
    public static final Companion f81661b = new Companion(null);

    /* renamed from: a */
    public float f81662a = 1.0f;

    /* renamed from: c */
    private int f81663c;

    /* renamed from: d */
    private int f81664d;

    /* renamed from: e */
    private int f81665e;

    /* renamed from: f */
    private boolean f81666f = true;

    /* renamed from: g */
    private ValueAnimator f81667g = new ValueAnimator();

    /* renamed from: h */
    private ValueAnimator f81668h = new ValueAnimator();

    /* renamed from: i */
    private int f81669i;

    /* renamed from: j */
    private HashMap f81670j;

    /* renamed from: a */
    public View mo116601a(int i) {
        if (this.f81670j == null) {
            this.f81670j = new HashMap();
        }
        View view = (View) this.f81670j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81670j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.AbstractC31960b
    /* renamed from: a */
    public void mo116603a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "time");
        Intrinsics.checkParameterIsNotNull(str3, "location");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meeting/chatwiget/BannerDialog$Companion;", "", "()V", "MIN_STYLE_MAX_WIDTH_DP", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.chatwiget.BannerDialog$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final void m121584e() {
        setElevation(BitmapDescriptorFactory.HUE_RED);
        setBackground(C32634ae.m125184d(R.drawable.bg_white_ractangle_shadow));
    }

    /* renamed from: d */
    private final void m121583d() {
        LayoutInflater.from(getContext()).inflate(R.layout.calendar_meeting_chat_banner_dlalog, this);
        ButterKnife.bind(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo116604b() {
        String b = C32634ae.m125182b(R.string.Calendar_Setting_TransformToNormalGroup);
        TextView textView = (TextView) mo116601a(R.id.tvDialogContent);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvDialogContent");
        int dp2px = UIUtils.dp2px(getContext(), (float) DynamicModule.f58006b);
        this.f81706u += (int) textView.getPaint().measureText(b);
        this.f81706u = Math.min(dp2px, this.f81706u);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.AbstractC31960b
    /* renamed from: c */
    public void mo116605c() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            this.f81705t = layoutParams2.topMargin - this.f81704s;
            m121584e();
            ao.m125223a((View) ((ImageView) mo116601a(R.id.ivDialogClose)), 6, 6);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo116602a() {
        setBackground(ao.m125218a(this.f81663c, new float[]{this.f81710y, this.f81710y, this.f81710y, this.f81710y}, 0, 0));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.AbstractC31960b
    public void setCloseListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "closeListner");
        ((ImageView) mo116601a(R.id.ivDialogClose)).setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.AbstractC31960b
    public void setConfirmListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "confirmListener");
        ((TextView) mo116601a(R.id.tvConfirm)).setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerDialog(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m121582a(context);
        m121583d();
        mo116602a();
        mo116604b();
        m121584e();
    }

    /* renamed from: a */
    private final void m121582a(Context context) {
        this.f81664d = UIUtils.dp2px(context, 12.0f);
        this.f81669i = UIUtils.dp2px(context, 16.0f);
        this.f81665e = UIUtils.dp2px(context, 2.0f);
        this.f81663c = UIUtils.getColor(context, R.color.bg_float);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m121582a(context);
        m121583d();
        mo116602a();
        mo116604b();
        m121584e();
    }
}
