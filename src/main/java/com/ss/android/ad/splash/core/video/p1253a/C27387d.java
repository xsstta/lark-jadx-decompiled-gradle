package com.ss.android.ad.splash.core.video.p1253a;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;

/* renamed from: com.ss.android.ad.splash.core.video.a.d */
public class C27387d extends AbstractC27377a {

    /* renamed from: a */
    private final C27386c f68396a;

    /* renamed from: b */
    private MediaDataSource f68397b;

    /* renamed from: c */
    private final MediaPlayer f68398c;

    /* renamed from: d */
    private final Object f68399d;

    /* renamed from: e */
    private boolean f68400e;

    /* renamed from: l */
    public MediaPlayer mo97806l() {
        return this.f68398c;
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: e */
    public void mo97785e() throws IllegalStateException {
        this.f68398c.pause();
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: f */
    public void mo97786f() throws IllegalStateException {
        this.f68398c.stop();
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: j */
    public void mo97790j() throws IllegalStateException {
        this.f68398c.start();
    }

    /* renamed from: m */
    private void m99901m() {
        MediaDataSource mediaDataSource = this.f68397b;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f68397b = null;
        }
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: h */
    public long mo97788h() {
        try {
            return (long) this.f68398c.getDuration();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: k */
    public long mo97791k() {
        try {
            return (long) this.f68398c.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: g */
    public void mo97787g() {
        this.f68400e = true;
        this.f68398c.release();
        m99901m();
        mo97773b();
        m99902n();
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: i */
    public void mo97789i() {
        try {
            this.f68398c.reset();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        m99901m();
        mo97773b();
        m99902n();
    }

    public C27387d() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f68399d = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f68398c = mediaPlayer;
        }
        mediaPlayer.setAudioStreamType(3);
        this.f68396a = new C27386c(this);
        m99902n();
    }

    /* renamed from: n */
    private void m99902n() {
        this.f68398c.setOnSeekCompleteListener(this.f68396a);
        this.f68398c.setOnInfoListener(this.f68396a);
        this.f68398c.setOnCompletionListener(this.f68396a);
        this.f68398c.setOnVideoSizeChangedListener(this.f68396a);
        this.f68398c.setOnPreparedListener(this.f68396a);
        this.f68398c.setOnErrorListener(this.f68396a);
        this.f68398c.setOnBufferingUpdateListener(this.f68396a);
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: a */
    public void mo97778a(long j) throws IllegalStateException {
        this.f68398c.seekTo((int) j);
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: b */
    public void mo97784b(boolean z) {
        this.f68398c.setLooping(z);
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: a */
    public void mo97780a(Surface surface) {
        this.f68398c.setSurface(surface);
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: a */
    public void mo97781a(SurfaceHolder surfaceHolder) {
        synchronized (this.f68399d) {
            if (!this.f68400e) {
                this.f68398c.setDisplay(surfaceHolder);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: a */
    public void mo97782a(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.f68398c.setDataSource(str);
        } else {
            this.f68398c.setDataSource(parse.getPath());
        }
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: a */
    public void mo97783a(boolean z) {
        this.f68398c.setScreenOnWhilePlaying(z);
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: a */
    public void mo97779a(Context context, int i) {
        this.f68398c.setWakeMode(context, i);
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b
    /* renamed from: a */
    public void mo97777a(float f, float f2) {
        MediaPlayer mediaPlayer = this.f68398c;
        if (mediaPlayer != null && !this.f68400e && mediaPlayer.isPlaying()) {
            this.f68398c.setVolume(f, f2);
        }
    }
}
