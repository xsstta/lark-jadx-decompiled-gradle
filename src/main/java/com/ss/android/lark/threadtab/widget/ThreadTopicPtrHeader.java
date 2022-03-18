package com.ss.android.lark.threadtab.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.AbstractC58934a;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0002)*B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J(\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010$\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010%\u001a\u00020\u001eH\u0016J\u0012\u0010&\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010'\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010(\u001a\u00020\u0016H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/threadtab/widget/ThreadTopicPtrHeader;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/widget/ptr/LKUIPtrUIHandler;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "mOnUIResetListener", "Lcom/ss/android/lark/threadtab/widget/ThreadTopicPtrHeader$OnUIResetListener;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/ss/android/lark/threadtab/widget/ThreadTopicPtrHeader$OnUIResetListener;I)V", "getMContext", "()Landroid/content/Context;", "mFlipAnimation", "Landroid/view/animation/RotateAnimation;", "getMOnUIResetListener", "()Lcom/ss/android/lark/threadtab/widget/ThreadTopicPtrHeader$OnUIResetListener;", "setMOnUIResetListener", "(Lcom/ss/android/lark/threadtab/widget/ThreadTopicPtrHeader$OnUIResetListener;)V", "mReverseFlipAnimation", "buildAnimation", "", "hideRotateView", "initImageMarginStart", "initView", "onUIPositionChange", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "isUnderTouch", "", UpdateKey.STATUS, "", "ptrIndicator", "Lcom/ss/android/lark/widget/ptr/indicator/LKUIPtrIndicator;", "onUIRefreshBegin", "onUIRefreshComplete", "isHeader", "onUIRefreshPrepare", "onUIReset", "resetView", "Companion", "OnUIResetListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ThreadTopicPtrHeader extends FrameLayout implements AbstractC58934a {

    /* renamed from: a */
    public static final Companion f138380a = new Companion(null);

    /* renamed from: b */
    private RotateAnimation f138381b;

    /* renamed from: c */
    private RotateAnimation f138382c;

    /* renamed from: d */
    private final Context f138383d;

    /* renamed from: e */
    private OnUIResetListener f138384e;

    /* renamed from: f */
    private HashMap f138385f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/threadtab/widget/ThreadTopicPtrHeader$OnUIResetListener;", "", "onUIReset", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadtab.widget.ThreadTopicPtrHeader$b */
    public interface OnUIResetListener {
        /* renamed from: a */
        void mo190839a();
    }

    public ThreadTopicPtrHeader(Context context) {
        this(context, null, null, 0, 14, null);
    }

    public ThreadTopicPtrHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 0, 12, null);
    }

    public ThreadTopicPtrHeader(Context context, AttributeSet attributeSet, OnUIResetListener bVar) {
        this(context, attributeSet, bVar, 0, 8, null);
    }

    /* renamed from: a */
    public View mo190835a(int i) {
        if (this.f138385f == null) {
            this.f138385f = new HashMap();
        }
        View view = (View) this.f138385f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f138385f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/threadtab/widget/ThreadTopicPtrHeader$Companion;", "", "()V", "ROTATE_ANIMATION_DURATION", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadtab.widget.ThreadTopicPtrHeader$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getMContext() {
        return this.f138383d;
    }

    public final OnUIResetListener getMOnUIResetListener() {
        return this.f138384e;
    }

    /* renamed from: a */
    private final void m217611a() {
        LayoutInflater.from(this.f138383d).inflate(R.layout.thread_topic_ptr_header, (ViewGroup) this, true);
        m217612b();
        m217614d();
    }

    /* renamed from: b */
    private final void m217612b() {
        ((LinearLayout) mo190835a(R.id.rotateViewContainer)).post(new RunnableC55989c(this, DeviceUtils.getScreenWidth(this.f138383d)));
    }

    /* renamed from: d */
    private final void m217614d() {
        m217615e();
        LinearLayout linearLayout = (LinearLayout) mo190835a(R.id.loadingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loadingContainer");
        linearLayout.setVisibility(4);
    }

    /* renamed from: e */
    private final void m217615e() {
        ((ImageView) mo190835a(R.id.rotateView)).clearAnimation();
        LinearLayout linearLayout = (LinearLayout) mo190835a(R.id.rotateViewContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rotateViewContainer");
        linearLayout.setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadtab.widget.ThreadTopicPtrHeader$c */
    public static final class RunnableC55989c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThreadTopicPtrHeader f138386a;

        /* renamed from: b */
        final /* synthetic */ int f138387b;

        RunnableC55989c(ThreadTopicPtrHeader threadTopicPtrHeader, int i) {
            this.f138386a = threadTopicPtrHeader;
            this.f138387b = i;
        }

        public final void run() {
            int i = this.f138387b;
            LinearLayout linearLayout = (LinearLayout) this.f138386a.mo190835a(R.id.rotateViewContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rotateViewContainer");
            int width = (i - linearLayout.getWidth()) / 2;
            LinearLayout linearLayout2 = (LinearLayout) this.f138386a.mo190835a(R.id.rotateViewContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rotateViewContainer");
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            if (layoutParams != null) {
                ((RelativeLayout.LayoutParams) layoutParams).setMarginStart(width);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: c */
    private final void m217613c() {
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f138381b = rotateAnimation;
        if (rotateAnimation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFlipAnimation");
        }
        rotateAnimation.setInterpolator(new LinearInterpolator());
        RotateAnimation rotateAnimation2 = this.f138381b;
        if (rotateAnimation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFlipAnimation");
        }
        rotateAnimation2.setDuration(150);
        RotateAnimation rotateAnimation3 = this.f138381b;
        if (rotateAnimation3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFlipAnimation");
        }
        rotateAnimation3.setFillAfter(true);
        RotateAnimation rotateAnimation4 = new RotateAnimation(-180.0f, BitmapDescriptorFactory.HUE_RED, 1, 0.5f, 1, 0.5f);
        this.f138382c = rotateAnimation4;
        if (rotateAnimation4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReverseFlipAnimation");
        }
        rotateAnimation4.setInterpolator(new LinearInterpolator());
        RotateAnimation rotateAnimation5 = this.f138382c;
        if (rotateAnimation5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReverseFlipAnimation");
        }
        rotateAnimation5.setDuration(150);
        RotateAnimation rotateAnimation6 = this.f138382c;
        if (rotateAnimation6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReverseFlipAnimation");
        }
        rotateAnimation6.setFillAfter(true);
    }

    public final void setMOnUIResetListener(OnUIResetListener bVar) {
        this.f138384e = bVar;
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m217614d();
        OnUIResetListener bVar = this.f138384e;
        if (bVar != null) {
            bVar.mo190839a();
        }
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m217615e();
        LinearLayout linearLayout = (LinearLayout) mo190835a(R.id.loadingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loadingContainer");
        linearLayout.setVisibility(0);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        LinearLayout linearLayout = (LinearLayout) mo190835a(R.id.loadingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loadingContainer");
        linearLayout.setVisibility(4);
        LinearLayout linearLayout2 = (LinearLayout) mo190835a(R.id.rotateViewContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rotateViewContainer");
        linearLayout2.setVisibility(0);
        TextView textView = (TextView) mo190835a(R.id.rotateHeaderText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rotateHeaderText");
        textView.setText(UIHelper.getString(R.string.Lark_Groups_Pulldowntorefresh));
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        m217614d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadTopicPtrHeader(Context context, AttributeSet attributeSet, OnUIResetListener bVar, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f138383d = context;
        this.f138384e = bVar;
        m217611a();
        m217613c();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166239a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z, byte b, C58935a aVar) {
        Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        Intrinsics.checkParameterIsNotNull(aVar, "ptrIndicator");
        int offsetToRefresh = lKUIPtrFrameLayout.getOffsetToRefresh();
        int m = aVar.mo199922m();
        int l = aVar.mo199921l();
        if (z && b == 2) {
            if (m < offsetToRefresh && l >= offsetToRefresh) {
                TextView textView = (TextView) mo190835a(R.id.rotateHeaderText);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rotateHeaderText");
                textView.setText(UIHelper.getString(R.string.Lark_Groups_Pulldowntorefresh));
                ((ImageView) mo190835a(R.id.rotateView)).clearAnimation();
                ImageView imageView = (ImageView) mo190835a(R.id.rotateView);
                RotateAnimation rotateAnimation = this.f138382c;
                if (rotateAnimation == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mReverseFlipAnimation");
                }
                imageView.startAnimation(rotateAnimation);
            } else if (m > offsetToRefresh && l <= offsetToRefresh) {
                TextView textView2 = (TextView) mo190835a(R.id.rotateHeaderText);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "rotateHeaderText");
                textView2.setText(UIHelper.getString(R.string.Lark_Groups_Releasetorefresh));
                ((ImageView) mo190835a(R.id.rotateView)).clearAnimation();
                ImageView imageView2 = (ImageView) mo190835a(R.id.rotateView);
                RotateAnimation rotateAnimation2 = this.f138381b;
                if (rotateAnimation2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFlipAnimation");
                }
                imageView2.startAnimation(rotateAnimation2);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreadTopicPtrHeader(Context context, AttributeSet attributeSet, OnUIResetListener bVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? null : bVar, (i2 & 8) != 0 ? 0 : i);
    }
}
