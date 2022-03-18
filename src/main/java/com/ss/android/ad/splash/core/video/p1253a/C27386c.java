package com.ss.android.ad.splash.core.video.p1253a;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ad.splash.core.video.a.c */
public class C27386c implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a */
    private final WeakReference<C27387d> f68395a;

    public C27386c(C27387d dVar) {
        this.f68395a = new WeakReference<>(dVar);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f68395a.get() != null) {
            this.f68395a.get().mo97763a();
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (this.f68395a.get() != null) {
            this.f68395a.get().mo97775c();
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f68395a.get() != null) {
            this.f68395a.get().mo97776d();
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (this.f68395a.get() != null) {
            this.f68395a.get().mo97764a(i);
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f68395a.get() == null || !this.f68395a.get().mo97774b(i, i2)) {
            return false;
        }
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f68395a.get() == null || !this.f68395a.get().mo97772a(i, i2)) {
            return false;
        }
        return true;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f68395a.get() != null) {
            this.f68395a.get().mo97765a(i, i2, 1, 1);
        }
    }
}
