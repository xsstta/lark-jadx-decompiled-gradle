package com.ss.android.appcenter.common.view.video.listener;

import android.os.Bundle;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.video.base.player.EnginePlayer;
import com.ss.ttvideoengine.SeekCompletionListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/listener/VideoSeekCompletionListener;", "Lcom/ss/ttvideoengine/SeekCompletionListener;", "player", "Lcom/ss/android/appcenter/common/view/video/base/player/EnginePlayer;", "(Lcom/ss/android/appcenter/common/view/video/base/player/EnginePlayer;)V", "ref", "Ljava/lang/ref/WeakReference;", "tag", "", "onCompletion", "", "success", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.b.h */
public final class VideoSeekCompletionListener implements SeekCompletionListener {

    /* renamed from: a */
    private final String f70844a = "TTSeekCompletionListener";

    /* renamed from: b */
    private final WeakReference<EnginePlayer> f70845b;

    public VideoSeekCompletionListener(EnginePlayer bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "player");
        this.f70845b = new WeakReference<>(bVar);
    }

    @Override // com.ss.ttvideoengine.SeekCompletionListener
    public void onCompletion(boolean z) {
        C28184h.m103250d(this.f70844a, "EVENT_CODE_SEEK_COMPLETE");
        EnginePlayer bVar = this.f70845b.get();
        if (bVar != null) {
            bVar.mo100523a(-99014, (Bundle) null);
        }
    }
}
