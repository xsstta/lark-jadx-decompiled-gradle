package com.ss.android.lark.mm.module.player.notification;

import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: com.ss.android.lark.mm.module.player.notification.c */
public class C46707c {
    /* renamed from: a */
    public static PlaybackStateCompat m184863a(PlaybackStateCompat playbackStateCompat, long j) {
        if (playbackStateCompat == null) {
            return null;
        }
        PlaybackStateCompat.C0164a aVar = new PlaybackStateCompat.C0164a();
        aVar.mo508a(playbackStateCompat.mo490e());
        aVar.mo506a(playbackStateCompat.mo485a(), j, playbackStateCompat.mo488d());
        return aVar.mo509a();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m184862a(long j, float f, boolean z) {
        int i;
        PlaybackStateCompat.C0164a aVar = new PlaybackStateCompat.C0164a();
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        return aVar.mo506a(i, j, 1.0f).mo508a(816).mo509a();
    }
}
