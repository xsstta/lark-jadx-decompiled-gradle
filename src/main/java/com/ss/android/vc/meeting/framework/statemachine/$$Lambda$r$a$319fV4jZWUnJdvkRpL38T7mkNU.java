package com.ss.android.vc.meeting.framework.statemachine;

import android.media.MediaPlayer;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.-$$Lambda$r$a$319fV4jZWUnJdvk-RpL38T7mkNU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$r$a$319fV4jZWUnJdvkRpL38T7mkNU implements MediaPlayer.OnPreparedListener {
    public static final /* synthetic */ $$Lambda$r$a$319fV4jZWUnJdvkRpL38T7mkNU INSTANCE = new $$Lambda$r$a$319fV4jZWUnJdvkRpL38T7mkNU();

    private /* synthetic */ $$Lambda$r$a$319fV4jZWUnJdvkRpL38T7mkNU() {
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }
}
