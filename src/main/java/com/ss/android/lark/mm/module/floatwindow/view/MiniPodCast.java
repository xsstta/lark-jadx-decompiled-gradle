package com.ss.android.lark.mm.module.floatwindow.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.widget.avatar.Avatar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\rH\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/view/MiniPodCast;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/lark/mm/module/floatwindow/view/IMiniView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isCoverDefault", "", "init", "", "onCover", "url", "", "defaultResId", "onLoading", "onModeChange", "mode", "onPause", "isEnabled", "onProgress", "progress", "", "duration", "onResume", "playCoverAnimation", "isPlay", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MiniPodCast extends LinearLayout implements IMiniView {

    /* renamed from: a */
    private boolean f116677a;

    /* renamed from: b */
    private HashMap f116678b;

    /* renamed from: a */
    public View mo162802a(int i) {
        if (this.f116678b == null) {
            this.f116678b = new HashMap();
        }
        View view = (View) this.f116678b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116678b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m183417a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_mini_pod_cast, this);
        setGravity(16);
        m183418a(true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.floatwindow.view.MiniPodCast$a */
    public static final class RunnableC46323a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MiniPodCast f116679a;

        /* renamed from: b */
        final /* synthetic */ boolean f116680b;

        RunnableC46323a(MiniPodCast miniPodCast, boolean z) {
            this.f116679a = miniPodCast;
            this.f116680b = z;
        }

        public final void run() {
            Animation animation;
            if (this.f116680b) {
                RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(10000);
                rotateAnimation.setRepeatCount(-1);
                ((Avatar) this.f116679a.mo162802a(R.id.ivCover)).startAnimation(rotateAnimation);
                return;
            }
            Avatar avatar = (Avatar) this.f116679a.mo162802a(R.id.ivCover);
            if (avatar != null && (animation = avatar.getAnimation()) != null) {
                animation.cancel();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MiniPodCast(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m183418a(boolean z) {
        ((Avatar) mo162802a(R.id.ivCover)).postDelayed(new RunnableC46323a(this, z), 1000);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MiniPodCast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniPodCast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f116677a = true;
        m183417a();
    }
}
