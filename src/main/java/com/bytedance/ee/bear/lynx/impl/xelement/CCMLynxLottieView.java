package com.bytedance.ee.bear.lynx.impl.xelement;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0014J(\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0014J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\u0017\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\bH\u0000¢\u0006\u0002\b$J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\bH\u0000¢\u0006\u0002\b'R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xelement/CCMLynxLottieView;", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "mHasInit", "", "needPlay", "cancelAnimation", "", "checkAnimation", "visibility", "", "init", "invalidateDrawable", "dr", "Landroid/graphics/drawable/Drawable;", "isVisible", "onAttachedToWindow", "onDetachedFromWindow", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "onVisibilityChanged", "changedView", "Landroid/view/View;", "playAnimation", "setAnimationAsset", "assetName", "setAnimationAsset$lynx_impl_release", "setAutoplay", "autoplay", "setAutoplay$lynx_impl_release", "setLoop", "loop", "setLoop$lynx_impl_release", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xelement.a */
public final class CCMLynxLottieView extends LottieAnimationView {

    /* renamed from: a */
    private final String f23867a = "CCMLynxLottieView";

    /* renamed from: b */
    private boolean f23868b;

    /* renamed from: c */
    private boolean f23869c;

    @Override // com.airbnb.lottie.LottieAnimationView
    public void cancelAnimation() {
        super.cancelAnimation();
        this.f23868b = false;
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.LottieAnimationView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13479a.m54764b(this.f23867a, "xxx: onDetachedFromWindow");
    }

    /* renamed from: a */
    private final void m37177a() {
        if (isAnimating()) {
            C13479a.m54764b(this.f23867a, "xxx:init: cancel animator");
            super.cancelAnimation();
            this.f23868b = true;
        }
        setAnimation(R.raw.loading_anim);
        this.f23869c = true;
    }

    /* renamed from: b */
    private final boolean m37179b() {
        if (getVisibility() != 0 || getHeight() <= 0 || getWidth() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.LottieAnimationView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAnimating()) {
            C13479a.m54764b(this.f23867a, "xxx: onAttachedToWindow: cancel animator");
            super.cancelAnimation();
            this.f23868b = true;
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void playAnimation() {
        C13479a.m54764b(this.f23867a, "xxx:playAnimation: ");
        if (m37179b()) {
            super.playAnimation();
        } else {
            this.f23868b = true;
        }
    }

    public final void setAutoplay$lynx_impl_release(boolean z) {
        this.f23868b = z;
    }

    public final void setLoop$lynx_impl_release(boolean z) {
        if (z) {
            setRepeatCount(-1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CCMLynxLottieView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m37177a();
    }

    public final void setAnimationAsset$lynx_impl_release(String str) {
        if (!TextUtils.isEmpty(str)) {
            setAnimation(str);
        } else {
            C13479a.m54775e(this.f23867a, "asset name is empty");
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void invalidateDrawable(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "dr");
        if (!this.f23869c) {
            super.invalidateDrawable(drawable);
        } else if (!m37179b()) {
            C13479a.m54764b(this.f23867a, "invalidateDrawable not visible, return");
            if (isAnimating()) {
                this.f23868b = true;
            }
            super.cancelAnimation();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: a */
    private final void m37178a(int i) {
        if (this.f23869c) {
            if (i != 0 || !m37179b() || !this.f23868b) {
                if (isAnimating()) {
                    this.f23868b = true;
                }
                String str = this.f23867a;
                C13479a.m54772d(str, "xxx: checkAnimation: cancel " + hashCode());
                super.cancelAnimation();
                return;
            }
            String str2 = this.f23867a;
            C13479a.m54764b(str2, "xxx: checkAnimation: play " + hashCode());
            super.playAnimation();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.LottieAnimationView
    public void onVisibilityChanged(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "changedView");
        String str = this.f23867a;
        C13479a.m54764b(str, "xxx: onVisibilityChanged: " + i);
        m37178a(i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C13479a.m54764b(this.f23867a, "xxx: onSizeChanged: ");
        m37178a(getVisibility());
    }
}
