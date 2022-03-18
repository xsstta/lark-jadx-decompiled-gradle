package com.ss.videoarch.liveplayer.p3253d;

import android.content.Context;
import android.media.AudioManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.videoarch.liveplayer.d.b */
public final class C65632b {

    /* renamed from: a */
    private final Context f165198a;

    /* renamed from: b */
    private MediaPlayer f165199b;

    /* renamed from: c */
    private float f165200c;

    /* renamed from: d */
    private float f165201d = 1.0f;

    /* renamed from: a */
    public float mo229648a() {
        int i;
        Context context = this.f165198a;
        if (context == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int i2 = 0;
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = 0;
        }
        if (i >= 0) {
            i2 = i;
        }
        return (float) i2;
    }

    /* renamed from: b */
    public float mo229651b() {
        int i;
        Context context = this.f165198a;
        if (context == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int i2 = 0;
        if (audioManager != null) {
            i = audioManager.getStreamVolume(3);
        } else {
            i = 0;
        }
        if (i >= 0) {
            i2 = i;
        }
        return (float) i2;
    }

    /* renamed from: a */
    public void mo229649a(MediaPlayer mediaPlayer) {
        this.f165199b = mediaPlayer;
    }

    /* renamed from: a */
    public void mo229650a(boolean z) {
        MediaPlayer mediaPlayer = this.f165199b;
        if (mediaPlayer != null) {
            if (mediaPlayer.isOSPlayer()) {
                float a = mo229648a();
                if (a > BitmapDescriptorFactory.HUE_RED) {
                    this.f165200c = mo229651b() / a;
                }
                if (z) {
                    this.f165199b.setVolume(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    return;
                }
                MediaPlayer mediaPlayer2 = this.f165199b;
                float f = this.f165200c;
                mediaPlayer2.setVolume(f, f);
                return;
            }
            this.f165199b.setIsMute(z);
        }
    }

    public C65632b(Context context, MediaPlayer mediaPlayer) {
        this.f165199b = mediaPlayer;
        this.f165198a = context;
    }
}
