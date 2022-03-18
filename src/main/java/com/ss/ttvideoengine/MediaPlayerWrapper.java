package com.ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.huawei.hms.location.LocationRequest;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.FrameMetadataListener;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.LoadControl;
import com.ss.ttm.player.MaskInfo;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.MediaPlayerClient;
import com.ss.ttm.player.MediaTransport;
import com.ss.ttm.player.OSPlayerClient;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttm.player.SubInfo;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

public class MediaPlayerWrapper implements MediaPlayer {
    private static boolean sHasLoadPlayerClass;
    private MediaPlayerClient mClient;
    private String mExceptionStr = "";
    private boolean mHasException;

    public String getExceptionStr() {
        return this.mExceptionStr;
    }

    public MediaPlayerClient getPlayerClient() {
        return this.mClient;
    }

    public boolean hasException() {
        return this.mHasException;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isOSPlayer() {
        return this.mClient instanceof OSPlayerClient;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void pause() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.pause();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prepare() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.prepare();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prepareAsync() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.prepareAsync();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void prevClose() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.prevClose();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void release() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.release();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void releaseAsync() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.releaseAsync();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void reset() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.reset();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void start() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.start();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void stop() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.stop();
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getCurrentPosition() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public String getDataSource() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getDataSource();
        }
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getDuration() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getDuration();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getPlayerType() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getType();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public MediaPlayer.TrackInfo[] getTrackInfo() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient == null) {
            return null;
        }
        mediaPlayerClient.getTrackInfo();
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoHeight() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoHeight();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoType() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoType();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getVideoWidth() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getVideoWidth();
        }
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isLooping() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.isLooping();
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isMute() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.isMute();
        }
        return false;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public boolean isPlaying() {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.isPlaying();
        }
        return false;
    }

    public static String getPluginVersion() {
        try {
            return TTHelper.getClzUsingPluginLoader(201, "com.ss.ttmplugin.player.TTVersion").getField("VERSION_NAME").get(null).toString();
        } catch (Throwable th) {
            TTVideoEngineLog.m256501d(th);
            return "";
        }
    }

    public static boolean tryLoadPlayerPlugin() {
        if (sHasLoadPlayerClass) {
            return true;
        }
        try {
            TTHelper.getClzUsingPluginLoader(LocationRequest.PRIORITY_HD_ACCURACY, "com.ss.ttm.player.TTPlayerClient");
            sHasLoadPlayerClass = true;
            return true;
        } catch (Throwable th) {
            TTVideoEngineLog.m256501d(th);
            return false;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void deselectTrack(int i) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.deselectTrack(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void seekTo(int i) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.seekTo(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void selectTrack(int i) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.selectTrack(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDisplay(surfaceHolder);
        }
    }

    public void setFrameMetadataListener(FrameMetadataListener frameMetadataListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setFrameMetadataListener(frameMetadataListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setIsMute(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setIsMute(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setLooping(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setLooping(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnCompletionListener(onCompletionListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnErrorListener(onErrorListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnExternInfoListener(MediaPlayer.OnExternInfoListener onExternInfoListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnExternInfoListener(onExternInfoListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnInfoListener(onInfoListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnLogListener(MediaPlayer.OnLogListener onLogListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnLogListener(onLogListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnPreparedListener(onPreparedListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnSARChangedListener(MediaPlayer.onSARChangedListener onsarchangedlistener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnSARChangedListener(onsarchangedlistener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setPanoVideoControlModel(int i) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setPanoVideoControlModel(i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setPlaybackParams(PlaybackParams playbackParams) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setPlaybackParams(playbackParams);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setScreenOnWhilePlaying(z);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void takeScreenshot(MediaPlayer.OnScreenshotListener onScreenshotListener) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.takeScreenshot(onScreenshotListener);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getSelectedTrack(int i) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient == null) {
            return 0;
        }
        mediaPlayerClient.getSelectedTrack(i);
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public String getStringOption(int i) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getStringOption(i);
        }
        return null;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setMediaTransport(MediaTransport mediaTransport) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setMediaTransport(mediaTransport);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(iMediaDataSource);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setSurface(Surface surface) {
        MediaPlayerClient mediaPlayerClient;
        if ((surface == null || surface.isValid()) && (mediaPlayerClient = this.mClient) != null) {
            mediaPlayerClient.setSurface(surface);
        }
    }

    public Object getObjectOption(int i) {
        if (this.mClient == null) {
            return null;
        }
        try {
            Method method = TTHelper.getClzUsingPluginLoader(LocationRequest.PRIORITY_HD_ACCURACY, "com.ss.ttm.player.TTPlayerClient").getMethod("getObjectOption", Integer.TYPE);
            method.setAccessible(true);
            return method.invoke(this.mClient, Integer.valueOf(i));
        } catch (Throwable th) {
            TTVideoEngineLog.m256501d(th);
            return null;
        }
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        if (this.mClient != null) {
            try {
                Method method = TTHelper.getClzUsingPluginLoader(LocationRequest.PRIORITY_HD_ACCURACY, "com.ss.ttm.player.TTPlayerClient").getMethod("setAudioProcessor", AudioProcessor.class);
                method.setAccessible(true);
                method.invoke(this.mClient, audioProcessor);
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
            }
        }
    }

    public void setLoadControl(LoadControl loadControl) {
        if (this.mClient != null) {
            try {
                Method method = TTHelper.getClzUsingPluginLoader(LocationRequest.PRIORITY_HD_ACCURACY, "com.ss.ttm.player.TTPlayerClient").getMethod("setLoadControl", LoadControl.class);
                method.setAccessible(true);
                method.invoke(this.mClient, loadControl);
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
            }
        }
    }

    public void setMaskInfo(MaskInfo maskInfo) {
        if (this.mClient != null) {
            try {
                Method method = TTHelper.getClzUsingPluginLoader(LocationRequest.PRIORITY_HD_ACCURACY, "com.ss.ttm.player.TTPlayerClient").getMethod("setMaskInfo", MaskInfo.class);
                method.setAccessible(true);
                method.invoke(this.mClient, maskInfo);
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
            }
        }
    }

    public void setSubInfo(SubInfo subInfo) {
        if (this.mClient != null) {
            try {
                Method method = TTHelper.getClzUsingPluginLoader(LocationRequest.PRIORITY_HD_ACCURACY, "com.ss.ttm.player.TTPlayerClient").getMethod("setSubInfo", SubInfo.class);
                method.setAccessible(true);
                method.invoke(this.mClient, subInfo);
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
            }
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(str);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void rotateCamera(float f, float f2) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.rotateCamera(f, f2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setCacheFile(String str, int i) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setCacheFile(str, i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(context, uri);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setIntOption(int i, int i2) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setIntOption(i, i2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setStringOption(int i, String str) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setStringOption(i, str);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setVolume(float f, float f2) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setVolume(f, f2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setWakeMode(Context context, int i) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setWakeMode(context, i);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void switchStream(int i, int i2) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.switchStream(i, i2);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public float getFloatOption(int i, float f) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getFloatOption(i, f);
        }
        return f;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int getIntOption(int i, int i2) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getIntOption(i, i2);
        }
        return i2;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public long getLongOption(int i, long j) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return mediaPlayerClient.getLongOption(i, j);
        }
        return j;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public int setFloatOption(int i, float f) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient == null) {
            return 0;
        }
        mediaPlayerClient.setFloatOption(i, f);
        return 0;
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public long setLongOption(int i, long j) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            return (long) mediaPlayerClient.setLongOption(i, j);
        }
        return -1;
    }

    private static boolean createExoClient(Context context, MediaPlayerWrapper mediaPlayerWrapper) {
        try {
            Class<?> cls = Class.forName("com.ss.ttexo.ExoPlayerClient");
            Method declaredMethod = cls.getDeclaredMethod("create", MediaPlayer.class, Context.class);
            declaredMethod.setAccessible(true);
            mediaPlayerWrapper.mClient = (MediaPlayerClient) declaredMethod.invoke(cls, mediaPlayerWrapper, context);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            mediaPlayerWrapper.mHasException = true;
            mediaPlayerWrapper.mExceptionStr += th.toString();
            return false;
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void mouseEvent(int i, int i2, int i3) {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.mouseEvent(i, i2, i3);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(context, uri, map);
        }
    }

    @Override // com.ss.ttm.player.MediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        MediaPlayerClient mediaPlayerClient = this.mClient;
        if (mediaPlayerClient != null) {
            mediaPlayerClient.setDataSource(fileDescriptor, j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x027a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.ttm.player.MediaPlayer create(android.content.Context r12, int r13, java.util.HashMap<java.lang.Integer, java.lang.Integer> r14) {
        /*
        // Method dump skipped, instructions count: 717
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.MediaPlayerWrapper.create(android.content.Context, int, java.util.HashMap):com.ss.ttm.player.MediaPlayer");
    }
}
