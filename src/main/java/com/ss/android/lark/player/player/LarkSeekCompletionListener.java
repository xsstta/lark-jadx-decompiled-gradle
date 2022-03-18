package com.ss.android.lark.player.player;

import android.os.Bundle;
import com.ss.android.lark.log.Log;
import com.ss.ttvideoengine.SeekCompletionListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/player/player/LarkSeekCompletionListener;", "Lcom/ss/ttvideoengine/SeekCompletionListener;", "player", "Lcom/ss/android/lark/player/player/TTEnginePlayer;", "(Lcom/ss/android/lark/player/player/TTEnginePlayer;)V", "mRef", "Ljava/lang/ref/WeakReference;", "onCompletion", "", "success", "", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.f */
public final class LarkSeekCompletionListener implements SeekCompletionListener {

    /* renamed from: a */
    private final WeakReference<C52114o> f129283a;

    public LarkSeekCompletionListener(C52114o oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "player");
        this.f129283a = new WeakReference<>(oVar);
    }

    @Override // com.ss.ttvideoengine.SeekCompletionListener
    public void onCompletion(boolean z) {
        Log.m165389i("TTEnginePlayerListeners", "EVENT_CODE_SEEK_COMPLETE");
        C52114o oVar = this.f129283a.get();
        if (oVar != null) {
            oVar.mo178476a(-99014, (Bundle) null);
        }
    }
}
