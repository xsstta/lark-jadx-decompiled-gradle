package com.ss.android.vc.meeting.framework.statemachine;

import android.media.MediaPlayer;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.-$$Lambda$r$a$3sg81atxnloquT-WdF9MfuH8QPo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$r$a$3sg81atxnloquTWdF9MfuH8QPo implements MediaPlayer.OnSeekCompleteListener {
    public static final /* synthetic */ $$Lambda$r$a$3sg81atxnloquTWdF9MfuH8QPo INSTANCE = new $$Lambda$r$a$3sg81atxnloquTWdF9MfuH8QPo();

    private /* synthetic */ $$Lambda$r$a$3sg81atxnloquTWdF9MfuH8QPo() {
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }
}
