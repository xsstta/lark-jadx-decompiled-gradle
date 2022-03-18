package com.ss.android.lark.ug.dyflow.steps.video.cover;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.player.p2511a.AbstractC52092k;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ErrorCover;", "Lcom/ss/android/lark/player/cover/BaseCover;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickListener", "Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ErrorCover$OnErrorCoverClickListener;", "onCoverAttachedToWindow", "", "onCreateCoverView", "Landroid/view/View;", "onErrorEvent", "eventCode", "", "bundle", "Landroid/os/Bundle;", "onPlayerEvent", "onReceiverBind", "onReceiverUnBind", "setOnErrorCoverClickListener", "listener", "OnErrorCoverClickListener", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.b */
public final class ErrorCover extends AbstractView$OnAttachStateChangeListenerC52070a {

    /* renamed from: a */
    public OnErrorCoverClickListener f141632a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ErrorCover$OnErrorCoverClickListener;", "", "onRetryClick", "", "view", "Landroid/view/View;", "onSkipClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.b$a */
    public interface OnErrorCoverClickListener {
        /* renamed from: a */
        void mo195054a(View view);

        /* renamed from: b */
        void mo195055b(View view);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: b */
    public void mo127043b() {
        super.mo127043b();
        mo178425b(8);
    }

    public ErrorCover(Context context) {
        super(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/cover/ErrorCover$onCreateCoverView$1$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.b$b */
    public static final class C57475b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ErrorCover f141633a;

        C57475b(ErrorCover bVar) {
            this.f141633a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            OnErrorCoverClickListener aVar = this.f141633a.f141632a;
            if (aVar != null) {
                aVar.mo195055b(view);
            }
            OnboardingHitPoint.f99379a.mo141627g(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/cover/ErrorCover$onCreateCoverView$1$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.b$c */
    public static final class C57476c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ErrorCover f141634a;

        C57476c(ErrorCover bVar) {
            this.f141634a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            OnErrorCoverClickListener aVar = this.f141634a.f141632a;
            if (aVar != null) {
                aVar.mo195054a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo195089a(OnErrorCoverClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f141632a = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.guide_video_error_cover, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.video_retry);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C57475b(this));
        }
        View findViewById2 = inflate.findViewById(R.id.video_skip);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C57476c(this));
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…\n            })\n        }");
        return inflate;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: c */
    public void mo127025c(int i, Bundle bundle) {
        mo178425b(0);
        OnboardingHitPoint.f99379a.mo141604a(false);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        AbstractC52092k j = mo178441j();
        if (j == null || j.mo178465a() != -1) {
            mo178425b(8);
        }
    }
}
