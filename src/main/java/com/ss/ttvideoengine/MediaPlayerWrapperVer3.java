package com.ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.MediaPlayerClient;
import com.ss.ttm.player.MediaTransport;
import com.ss.ttm.player.PlaybackParams;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public class MediaPlayerWrapperVer3 implements MediaPlayer {
    private String mExceptionStr = "";
    private boolean mHasException;
    private MediaPlayerClient mLittleClient;

    public static MediaPlayer create(Context context, int i) {
        return null;
    }

    public static boolean tryLoadPlayerPlugin() {
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public MediaPlayer.TrackInfo[] getTrackInfo() {
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prevClose() {
    }

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
    public void setMediaTransport(MediaTransport mediaTransport) {
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void switchStream(int i, int i2) {
    }

    public String getExceptionStr() {
        return this.mExceptionStr;
    }

    public boolean hasException() {
        return this.mHasException;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getPlayerType() {
        if (this.mLittleClient != null) {
            return 3;
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isOSPlayer() {
        if (this.mLittleClient == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void pause() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.pause();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prepare() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.prepare();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prepareAsync() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.prepareAsync();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void release() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.release();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void releaseAsync() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.releaseAsync();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void reset() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.reset();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void start() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.start();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void stop() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.stop();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getCurrentPosition() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public String getDataSource() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getDataSource();
        }
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getDuration() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getDuration();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoHeight() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoHeight();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoType() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoType();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoWidth() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoWidth();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isLooping() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.isLooping();
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isMute() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient == null) {
            return false;
        }
        mediaPlayerClient.isMute();
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isPlaying() {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.isPlaying();
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void deselectTrack(int i) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.deselectTrack(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void seekTo(int i) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.seekTo(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDisplay(surfaceHolder);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setIsMute(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setIsMute(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setLooping(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setLooping(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnCompletionListener(onCompletionListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnErrorListener(onErrorListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnExternInfoListener(onExternInfoListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnInfoListener(onInfoListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnLogListener(onLogListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnPreparedListener(onPreparedListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setPanoVideoControlModel(int i) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setPanoVideoControlModel(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setPlaybackParams(PlaybackParams playbackParams) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setPlaybackParams(playbackParams);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setScreenOnWhilePlaying(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.takeScreenshot(onScreenshotListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getSelectedTrack(int i) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient == null) {
            return 0;
        }
        mediaPlayerClient.getSelectedTrack(i);
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public String getStringOption(int i) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getStringOption(i);
        }
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setSurface(Surface surface) {
        MediaPlayerClient mediaPlayerClient;
        if ((surface == null || surface.isValid()) && (mediaPlayerClient = this.mLittleClient) != null) {
            mediaPlayerClient.setSurface(surface);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(str);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void rotateCamera(float f, float f2) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.rotateCamera(f, f2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setCacheFile(String str, int i) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setCacheFile(str, i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(context, uri);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setIntOption(int i, int i2) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setIntOption(i, i2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setStringOption(int i, String str) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setStringOption(i, str);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setVolume(float f, float f2) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setVolume(f, f2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setWakeMode(Context context, int i) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setWakeMode(context, i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public float getFloatOption(int i, float f) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getFloatOption(i, f);
        }
        return f;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getIntOption(int i, int i2) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getIntOption(i, i2);
        }
        return i2;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public long getLongOption(int i, long j) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getLongOption(i, j);
        }
        return j;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int setFloatOption(int i, float f) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient == null) {
            return 0;
        }
        mediaPlayerClient.setFloatOption(i, f);
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public long setLongOption(int i, long j) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            return (long) mediaPlayerClient.setLongOption(i, j);
        }
        return -1;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void mouseEvent(int i, int i2, int i3) {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.mouseEvent(i, i2, i3);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.mLittleClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(context, uri, map);
        }
    }
}
