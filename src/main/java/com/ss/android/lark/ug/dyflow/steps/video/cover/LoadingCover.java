package com.ss.android.lark.ug.dyflow.steps.video.cover;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.player.p2511a.AbstractC52092k;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/cover/LoadingCover;", "Lcom/ss/android/lark/player/cover/BaseCover;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isInPlaybackState", "", "playerStateGetter", "Lcom/ss/android/lark/player/cover/PlayerStateGetter;", "onCoverAttachedToWindow", "", "onCreateCoverView", "Landroid/view/View;", "onErrorEvent", "eventCode", "", "bundle", "Landroid/os/Bundle;", "onPlayerEvent", "onReceiverBind", "onReceiverUnBind", "setLoadingState", "show", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a.c */
public final class LoadingCover extends AbstractView$OnAttachStateChangeListenerC52070a {
    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: b */
    public void mo127043b() {
        AbstractC52092k j = mo178441j();
        boolean z = false;
        if (j != null) {
            Intrinsics.checkExpressionValueIsNotNull(j, "it");
            if (j.mo178467c() && m223068a(j)) {
                z = true;
            }
        }
        m223067a(z);
    }

    public LoadingCover(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m223067a(boolean z) {
        if (z) {
            mo178425b(0);
        } else {
            mo178425b(8);
        }
    }

    /* renamed from: a */
    private final boolean m223068a(AbstractC52092k kVar) {
        int a = kVar.mo178465a();
        if (a == -2 || a == -1 || a == 0 || a == 1 || a == 4 || a == 5) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.guide_video_loading_cover, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…ideo_loading_cover, null)");
        return inflate;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: c */
    public void mo127025c(int i, Bundle bundle) {
        m223067a(false);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        switch (i) {
            case -99052:
            case -99015:
            case -99011:
            case -99007:
                m223067a(false);
                return;
            case -99050:
            case -99010:
            case -99001:
                m223067a(true);
                return;
            default:
                return;
        }
    }
}
