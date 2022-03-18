package com.ss.android.appcenter.common.view.video.base.player;

import android.view.Surface;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\fH&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H&J\u0012\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u001bH&J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\fH&J\u0012\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#H&J\u0012\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010&H&J\u0012\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H&J\u0012\u0010-\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0014\u0010.\u001a\u00020\u00032\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010/H&J\u0012\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u000102H&J\u0018\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020,H&J\b\u00106\u001a\u00020\u0003H&J\u0010\u00106\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H&J\b\u00107\u001a\u00020\u0003H&J\u0010\u00108\u001a\u00020\u00032\u0006\u00108\u001a\u00020\fH&¨\u00069"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/player/IPlayer;", "", "destroy", "", "getBufferPercentage", "", "getCurrentPosition", "getDuration", "getState", "getVideoHeight", "getVideoWidth", "isMute", "", "isPlaying", "isSystemPlayer", "option", "code", "bundle", "Landroid/os/Bundle;", "pause", "prepare", "reset", "resume", "seekTo", "msc", "setDataSource", "dataSource", "Lcom/ss/android/appcenter/common/view/video/data/DataSource;", "setDisplay", "surface", "Landroid/view/Surface;", "setMute", "mute", "setOnBufferingListener", "onBufferingListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnBufferingListener;", "setOnErrorEventListener", "onErrorEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnErrorEventListener;", "setOnPlayerEventListener", "onPlayerEventListener", "Lcom/ss/android/appcenter/common/view/video/listener/OnPlayerEventListener;", "setSpeed", "speed", "", "setSurface", "setTTDataSource", "Lcom/ss/ttvideoengine/DataSource;", "setVideoID", "videoID", "", "setVolume", "left", "right", "start", "stop", "useCache", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.a.b.c */
public interface IPlayer {
    /* renamed from: a */
    void mo100489a(Surface surface);
}
