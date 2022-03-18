package com.ss.android.lark.mm.module.minifloatwindow.view;

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
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.floatwindow.view.progress.Progress;
import com.ss.android.lark.mm.module.minifloatwindow.view.IMiniView;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.utils.MmTimeUtils;
import com.ss.android.lark.mm.widget.BoldTextView;
import com.ss.android.lark.mm.widget.avatar.Avatar;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\rH\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mm/module/minifloatwindow/view/MiniPodCast;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/lark/mm/module/minifloatwindow/view/IMiniView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isCoverDefault", "", "init", "", "onCover", "url", "", "defaultResId", "onLoading", "onPause", "isEnabled", "onProgress", "progress", "", "duration", "onResume", "playCoverAnimation", "isPlay", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MiniPodCast extends LinearLayout implements IMiniView {

    /* renamed from: a */
    private boolean f117138a;

    /* renamed from: b */
    private HashMap f117139b;

    /* renamed from: a */
    public View mo163462a(int i) {
        if (this.f117139b == null) {
            this.f117139b = new HashMap();
        }
        View view = (View) this.f117139b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117139b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: z */
    public void mo163381z() {
        IMiniView.C46541a.m184079a(this);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: A */
    public void mo163375A() {
        m184066b(true);
    }

    /* renamed from: b */
    private final void m184065b() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_mini_pod_cast, this);
        setGravity(16);
        m184066b(true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.view.MiniPodCast$a */
    public static final class RunnableC46540a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MiniPodCast f117140a;

        /* renamed from: b */
        final /* synthetic */ boolean f117141b;

        RunnableC46540a(MiniPodCast miniPodCast, boolean z) {
            this.f117140a = miniPodCast;
            this.f117141b = z;
        }

        public final void run() {
            Animation animation;
            if (this.f117141b) {
                RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(10000);
                rotateAnimation.setRepeatCount(-1);
                ((Avatar) this.f117140a.mo163462a(R.id.ivCover)).startAnimation(rotateAnimation);
                return;
            }
            Avatar avatar = (Avatar) this.f117140a.mo163462a(R.id.ivCover);
            if (avatar != null && (animation = avatar.getAnimation()) != null) {
                animation.cancel();
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163376a() {
        ((Avatar) mo163462a(R.id.ivCover)).setImageResource(R.drawable.mm_ic_default_mini_podcast);
        BoldTextView boldTextView = (BoldTextView) mo163462a(R.id.tvProgress);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvProgress");
        boldTextView.setText(MmTimeUtils.m186495a((Long) 0L));
        Progress progress = (Progress) mo163462a(R.id.progressBar);
        Intrinsics.checkExpressionValueIsNotNull(progress, "progressBar");
        progress.setProgress(0);
        m184066b(false);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163377a(long j) {
        IMiniView.C46541a.m184080a(this, j);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163380a(boolean z) {
        m184066b(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MiniPodCast(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: b */
    private final void m184066b(boolean z) {
        ((Avatar) mo163462a(R.id.ivCover)).postDelayed(new RunnableC46540a(this, z), 1000);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.view.IMiniView
    /* renamed from: a */
    public void mo163458a(Function0<? extends C47084f> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(function0, "trackContextGetter");
        Intrinsics.checkParameterIsNotNull(function02, "onDismiss");
        IMiniView.C46541a.m184083a(this, function0, function02);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MiniPodCast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.view.IMiniView
    /* renamed from: a */
    public void mo163459a(Function0<? extends C47084f> function0, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function0, "trackContextGetter");
        Intrinsics.checkParameterIsNotNull(function1, "onAction");
        IMiniView.C46541a.m184084a(this, function0, function1);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163378a(long j, long j2) {
        BoldTextView boldTextView = (BoldTextView) mo163462a(R.id.tvProgress);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvProgress");
        boldTextView.setText(MmTimeUtils.m186495a(Long.valueOf(j)));
        if (j2 - j < ((long) 1000)) {
            Progress progress = (Progress) mo163462a(R.id.progressBar);
            Intrinsics.checkExpressionValueIsNotNull(progress, "progressBar");
            progress.setProgress(100);
            return;
        }
        Progress progress2 = (Progress) mo163462a(R.id.progressBar);
        Intrinsics.checkExpressionValueIsNotNull(progress2, "progressBar");
        progress2.setProgress((int) ((((float) j) * 100.0f) / ((float) j2)));
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163379a(String str, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f117138a = true;
            ((Avatar) mo163462a(R.id.ivCover)).setImageDrawable(C57582a.m223614c(getContext(), i));
        } else {
            this.f117138a = false;
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getImageLoaderDepend().mo144609a((Avatar) mo163462a(R.id.ivCover), str);
        }
        m184066b(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniPodCast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117138a = true;
        m184065b();
    }
}
