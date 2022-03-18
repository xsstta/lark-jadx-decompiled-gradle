package com.ss.videoarch.liveplayer.p3253d;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.MediaPlayerClient;
import com.ss.ttm.player.MediaTransport;
import com.ss.ttm.player.OSPlayerClient;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttm.player.TTPlayerConfiger;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.ss.videoarch.liveplayer.d.a */
public final class C65631a implements MediaPlayer {

    /* renamed from: a */
    private MediaPlayerClient f165197a;

    @Override // com.ss.ttm.player.MediaPlayer
    public void selectTrack(int i) {
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void switchStream(int i, int i2) {
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void pause() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.pause();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prepare() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.prepare();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prepareAsync() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.prepareAsync();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prevClose() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.prevClose();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void release() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.release();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void releaseAsync() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.releaseAsync();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void reset() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.reset();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void start() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.start();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void stop() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.stop();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getCurrentPosition() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public String getDataSource() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getDataSource();
        }
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getDuration() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getDuration();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getPlayerType() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getType();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public MediaPlayer.TrackInfo[] getTrackInfo() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getTrackInfo();
        }
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoHeight() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoHeight();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoType() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoType();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoWidth() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoWidth();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isLooping() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.isLooping();
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isMute() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.isMute();
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isOSPlayer() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient == null || mediaPlayerClient.getType() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isPlaying() {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.isPlaying();
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void deselectTrack(int i) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.deselectTrack(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void seekTo(int i) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.seekTo(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDisplay(surfaceHolder);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setIsMute(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setIsMute(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setLooping(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setLooping(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setMediaTransport(MediaTransport mediaTransport) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setMediaTransport(mediaTransport);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnCompletionListener(onCompletionListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnErrorListener(onErrorListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnExternInfoListener(onExternInfoListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnInfoListener(onInfoListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnLogListener(onLogListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnPreparedListener(onPreparedListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnSARChangedListener(onsarchangedlistener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setPanoVideoControlModel(int i) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setPanoVideoControlModel(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setPlaybackParams(PlaybackParams playbackParams) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setPlaybackParams(playbackParams);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setScreenOnWhilePlaying(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.takeScreenshot(onScreenshotListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getSelectedTrack(int i) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getSelectedTrack(i);
        }
        return -1;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public String getStringOption(int i) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getStringOption(i);
        }
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setSurface(Surface surface) {
        if (this.f165197a != null && surface != null && surface.isValid()) {
            this.f165197a.setSurface(surface);
        }
    }

    /* renamed from: a */
    public void mo229647a(Object obj) {
        if (this.f165197a != null) {
            try {
                Class<?> cls = Class.forName("com.ss.ttm.player.FrameMetadataListener");
                if (cls != null) {
                    Method method = Class.forName("com.ss.ttm.player.TTPlayerClient").getMethod("setFrameMetadataListener", cls);
                    method.setAccessible(true);
                    method.invoke(this.f165197a, obj);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(str);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void rotateCamera(float f, float f2) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.rotateCamera(f, f2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setCacheFile(String str, int i) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setCacheFile(str, i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(context, uri);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setIntOption(int i, int i2) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setIntOption(i, i2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setStringOption(int i, String str) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setStringOption(i, str);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setVolume(float f, float f2) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setVolume(f, f2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setWakeMode(Context context, int i) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setWakeMode(context, i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public float getFloatOption(int i, float f) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getFloatOption(i, f);
        }
        return f;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getIntOption(int i, int i2) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getIntOption(i, i2);
        }
        return i2;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public long getLongOption(int i, long j) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getLongOption(i, j);
        }
        return j;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int setFloatOption(int i, float f) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.setFloatOption(i, f);
        }
        return -1;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public long setLongOption(int i, long j) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            return (long) mediaPlayerClient.setLongOption(i, j);
        }
        return -1;
    }

    /* renamed from: a */
    public static MediaPlayer m257264a(Context context, int i) {
        C65631a aVar = new C65631a();
        synchronized (C65631a.class) {
            if (TTPlayerConfiger.isOnTTPlayer()) {
                try {
                    Class<?> cls = Class.forName("com.ss.ttm.player.TTPlayerClient");
                    Method declaredMethod = cls.getDeclaredMethod("create", MediaPlayer.class, Context.class);
                    declaredMethod.setAccessible(true);
                    aVar.f165197a = (MediaPlayerClient) declaredMethod.invoke(cls, aVar, context);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (aVar.f165197a == null && i == 0) {
                    try {
                        Class<?> cls2 = Class.forName("com.ss.ttmplayer.player.TTPlayerClient");
                        Method declaredMethod2 = cls2.getDeclaredMethod("create", MediaPlayer.class, Context.class);
                        declaredMethod2.setAccessible(true);
                        aVar.f165197a = (MediaPlayerClient) declaredMethod2.invoke(cls2, aVar, context);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
            if (aVar.f165197a == null) {
                aVar.f165197a = OSPlayerClient.create(aVar, context);
            }
        }
        return aVar;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void mouseEvent(int i, int i2, int i3) {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.mouseEvent(i, i2, i3);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.f165197a;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(context, uri, map);
        }
    }
}
