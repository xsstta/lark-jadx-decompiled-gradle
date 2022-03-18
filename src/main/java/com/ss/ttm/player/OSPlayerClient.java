package com.ss.ttm.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttm.player.MediaPlayer;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public class OSPlayerClient extends MediaPlayerClient {
    protected MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    protected MediaPlayer.OnCompletionListener mOnCompletionListener;
    protected MediaPlayer.OnErrorListener mOnErrorListener;
    protected MediaPlayer.OnInfoListener mOnInfoListener;
    protected MediaPlayer.OnPreparedListener mOnPreparedListener;
    protected MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    protected MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private android.media.MediaPlayer mPlayer;
    private MediaPlayer mWrapper;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getType() {
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void prevClose() {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void selectTrack(int i) {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setFrameMetadataListener(FrameMetadataListener frameMetadataListener) {
    }

    public void setLoadControl(LoadControl loadControl) {
    }

    public void setMaskInfo(MaskInfo maskInfo) {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setMediaTransport(MediaTransport mediaTransport) {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
    }

    public void setSubInfo(SubInfo subInfo) {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void switchStream(int i, int i2) {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void pause() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void prepareAsync() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.prepareAsync();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void reset() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void start() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void stop() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getCurrentPosition() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getCurrentPosition();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getDuration() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getDuration();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getVideoHeight() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getVideoHeight();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getVideoWidth() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getVideoWidth();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public boolean isLooping() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.isLooping();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public boolean isPlaying() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.isPlaying();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void release() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.mPlayer = null;
                throw th;
            }
            this.mPlayer = null;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void prepare() {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void releaseAsync() {
        new_insert_after_java_lang_Thread_by_knot(new Thread(new Runnable() {
            /* class com.ss.ttm.player.OSPlayerClient.RunnableC654151 */

            public void run() {
                OSPlayerClient.this.release();
            }
        })).start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    @Override // com.ss.ttm.player.MediaPlayerClient
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.ttm.player.MediaPlayer.TrackInfo[] getTrackInfo() {
        /*
            r9 = this;
            android.media.MediaPlayer r0 = r9.mPlayer
            r1 = 0
            if (r0 == 0) goto L_0x002c
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0012 }
            r2 = 16
            if (r0 < r2) goto L_0x0012
            android.media.MediaPlayer r0 = r9.mPlayer     // Catch:{ Exception -> 0x0012 }
            android.media.MediaPlayer$TrackInfo[] r0 = r0.getTrackInfo()     // Catch:{ Exception -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 == 0) goto L_0x002c
            int r2 = r0.length
            com.ss.ttm.player.MediaPlayer$TrackInfo[] r2 = new com.ss.ttm.player.MediaPlayer.TrackInfo[r2]
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L_0x001b:
            if (r4 >= r3) goto L_0x002c
            r6 = r0[r4]
            int r7 = r5 + 1
            com.ss.ttm.player.MediaPlayer$TrackInfo r8 = new com.ss.ttm.player.MediaPlayer$TrackInfo
            r8.<init>(r6)
            r2[r5] = r8
            int r4 = r4 + 1
            r5 = r7
            goto L_0x001b
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.OSPlayerClient.getTrackInfo():com.ss.ttm.player.MediaPlayer$TrackInfo[]");
    }

    static class WrapOnCompletionListener implements MediaPlayer.OnCompletionListener {
        private MediaPlayer.OnCompletionListener mListener;
        private MediaPlayer mWrapper;

        public void onCompletion(android.media.MediaPlayer mediaPlayer) {
            this.mListener.onCompletion(this.mWrapper);
        }

        public WrapOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onCompletionListener;
        }
    }

    static class WrapOnPreparedListener implements MediaPlayer.OnPreparedListener {
        private MediaPlayer.OnPreparedListener mListener;
        private MediaPlayer mWrapper;

        public void onPrepared(android.media.MediaPlayer mediaPlayer) {
            this.mListener.onPrepared(this.mWrapper);
        }

        public WrapOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener, MediaPlayer mediaPlayer) {
            this.mListener = onPreparedListener;
            this.mWrapper = mediaPlayer;
        }
    }

    private static class WrapOnSeekCompleteListener implements MediaPlayer.OnSeekCompleteListener {
        private MediaPlayer.OnSeekCompleteListener mListener;
        private MediaPlayer mWrapper;

        public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
            this.mListener.onSeekComplete(this.mWrapper);
        }

        public WrapOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, MediaPlayer mediaPlayer) {
            this.mListener = onSeekCompleteListener;
            this.mWrapper = mediaPlayer;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void seekTo(int i) {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.seekTo(i);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setLooping(boolean z) {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setLooping(z);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setScreenOnWhilePlaying(boolean z) {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setScreenOnWhilePlaying(z);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setSurface(Surface surface) {
        this.mPlayer.setSurface(surface);
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void deselectTrack(int i) {
        if (this.mPlayer != null) {
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.mPlayer.deselectTrack(i);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public int getSelectedTrack(int i) {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer == null) {
            return -1;
        }
        try {
            return mediaPlayer.getSelectedTrack(i);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDisplay(SurfaceHolder surfaceHolder) {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setDisplay(surfaceHolder);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
        this.mPlayer.setOnBufferingUpdateListener(new WrapOnBufferingUpdateListener(onBufferingUpdateListener, this.mWrapper));
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
        this.mPlayer.setOnCompletionListener(new WrapOnCompletionListener(onCompletionListener, this.mWrapper));
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
        this.mPlayer.setOnErrorListener(new WrapOnErrorListener(onErrorListener, this.mWrapper));
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
        this.mPlayer.setOnInfoListener(new WrapOnInfoListener(onInfoListener, this.mWrapper));
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
        this.mPlayer.setOnPreparedListener(new WrapOnPreparedListener(onPreparedListener, this.mWrapper));
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mPlayer.setOnSeekCompleteListener(new WrapOnSeekCompleteListener(onSeekCompleteListener, this.mWrapper));
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mPlayer.setOnVideoSizeChangedListener(new WrapOnVideoSizeChangedListener(onVideoSizeChangedListener, this.mWrapper));
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.mPlayer.setDataSource(str);
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (Build.VERSION.SDK_INT >= 23) {
            PlaybackParams playbackParams2 = new PlaybackParams();
            float speed = playbackParams.getSpeed();
            if (speed > BitmapDescriptorFactory.HUE_RED) {
                playbackParams2.setSpeed(speed);
            }
            int audioFallbackMode = playbackParams.getAudioFallbackMode();
            if (audioFallbackMode >= 0) {
                playbackParams2.setAudioFallbackMode(audioFallbackMode);
            }
            float pitch = playbackParams.getPitch();
            if (pitch > BitmapDescriptorFactory.HUE_RED) {
                playbackParams2.setPitch(pitch);
            }
            android.media.MediaPlayer mediaPlayer = this.mPlayer;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setPlaybackParams(playbackParams2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class WrapOnBufferingUpdateListener implements MediaPlayer.OnBufferingUpdateListener {
        private MediaPlayer.OnBufferingUpdateListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onBufferingUpdateListener;
        }

        public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i) {
            this.mListener.onBufferingUpdate(this.mWrapper, i);
        }
    }

    static class WrapOnErrorListener implements MediaPlayer.OnErrorListener {
        private MediaPlayer.OnErrorListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnErrorListener(MediaPlayer.OnErrorListener onErrorListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onErrorListener;
        }

        public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            return this.mListener.onError(this.mWrapper, i, i2);
        }
    }

    static class WrapOnInfoListener implements MediaPlayer.OnInfoListener {
        private MediaPlayer.OnInfoListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnInfoListener(MediaPlayer.OnInfoListener onInfoListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onInfoListener;
        }

        public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            return this.mListener.onInfo(this.mWrapper, i, i2);
        }
    }

    private static class WrapOnVideoSizeChangedListener implements MediaPlayer.OnVideoSizeChangedListener {
        private MediaPlayer.OnVideoSizeChangedListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener, MediaPlayer mediaPlayer) {
            this.mListener = onVideoSizeChangedListener;
            this.mWrapper = mediaPlayer;
        }

        public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            this.mListener.onVideoSizeChanged(this.mWrapper, i, i2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.mPlayer.setDataSource(context, uri);
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setVolume(float f, float f2) {
        android.media.MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setWakeMode(Context context, int i) {
        this.mPlayer.setWakeMode(context, i);
    }

    public static final synchronized OSPlayerClient create(MediaPlayer mediaPlayer, Context context) {
        OSPlayerClient oSPlayerClient;
        synchronized (OSPlayerClient.class) {
            oSPlayerClient = new OSPlayerClient();
            oSPlayerClient.mPlayer = new android.media.MediaPlayer();
            oSPlayerClient.mWrapper = mediaPlayer;
        }
        return oSPlayerClient;
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.mPlayer.setDataSource(context, uri, map);
    }

    @Override // com.ss.ttm.player.MediaPlayerClient
    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        this.mPlayer.setDataSource(fileDescriptor, j, j2);
    }
}
