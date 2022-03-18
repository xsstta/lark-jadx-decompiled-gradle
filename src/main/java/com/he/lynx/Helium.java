package com.he.lynx;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.C1711a;
import com.he.lynx.HeliumApp;
import com.he.lynx.loader.MediaLoader;
import com.he.lynx.player.IHeliumPlayer;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Helium {
    public static boolean cameraPermission = true;
    private static double[] euler = new double[4];
    static Sensor gyroscopeSensor;
    static volatile boolean helium_loaded;
    private static SensorEventListener orientationListener = new SensorEventListener() {
        /* class com.he.lynx.Helium.C233791 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 15) {
                Helium.sendOrientationData(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.values[3], sensorEvent.timestamp);
            } else if (sensorEvent.sensor.getType() == 4) {
                Helium.sendGyroscopeData(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2], sensorEvent.timestamp);
            }
        }
    };
    public static final Set<IHeliumPlayer> players = new CopyOnWriteArraySet();
    static Sensor rotationSensor;
    static SensorManager sensorManager;

    public static native void _screenshot(long j, int i, int i2, ByteBuffer byteBuffer);

    public static native long addView(long j, Surface surface);

    public static native void cleanup(long j);

    public static native void dispatch(long j, ByteBuffer byteBuffer);

    public static native void doFrame(long j);

    public static native void flushRecord(long j, long j2);

    private static String getMiniAppSoPluginDir() {
        return null;
    }

    public static native void onMediaRequest(long j, Object obj, String str);

    public static native void onMediaStatusChange(long j, int i);

    public static native void onPause(long j);

    private static native void onRecordRequest(long j, Object obj);

    public static native void onResume(long j);

    public static native void onSurfaceChanged(long j, long j2, int i, int i2);

    public static native void onSurfaceCreated(long j, long j2, Surface surface);

    public static native void onSurfaceDestroyed(long j, long j2);

    public static native void sendGyroscopeData(float f, float f2, float f3, long j);

    public static native void sendOrientationData(float f, float f2, float f3, float f4, long j);

    public static native void setLiteExternalEffectLibraryPath(String str);

    public static native void setSensitivePermissionStatus(int i, boolean z);

    private static native void setupEngine(int i, int i2);

    public static native long setupLite(float f, HeliumApp heliumApp, long j, long[] jArr, AssetManager assetManager, String str, boolean z, boolean z2);

    public static native long startRecord(long j, long j2, Surface surface, int i, ByteBuffer byteBuffer, int i2, int i3, float f, float f2, float f3, float f4);

    private static void startRecord(HeliumApp heliumApp, BaseCameraContext baseCameraContext, String str, int i, int i2, boolean z) {
    }

    public static native void stopAudioCapture(long j);

    public static native void stopRecord(long j, long j2);

    static class HostCameraContext extends BaseCameraContext {
        private final IPlatformCamera hostCamera;
        int pageID;

        private void autoFocus() {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.autoFocus();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.he.lynx.Helium.VideoContext
        public void release() {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.dispose();
            }
            if (this.texture != null) {
                this.texture.release();
                this.texture = null;
            }
        }

        private void onSurfaceTextureReady(SurfaceTexture surfaceTexture) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.onSurfaceTextureReady(surfaceTexture);
            }
        }

        @Override // com.he.lynx.HeliumApp.StateCallback
        public void pause(HeliumApp.StateCallback.CallType callType) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.pause(callType);
            }
        }

        @Override // com.he.lynx.HeliumApp.StateCallback
        public void resume(HeliumApp.StateCallback.CallType callType) {
            IPlatformCamera iPlatformCamera = this.hostCamera;
            if (iPlatformCamera != null) {
                iPlatformCamera.resume(callType);
            }
        }

        static HostCameraContext requestHostCameraCtx(int i, HeliumApp.PlatformCameraFactory platformCameraFactory, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i & 96) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            IPlatformCamera createPlatformCamera = platformCameraFactory.createPlatformCamera();
            createPlatformCamera.request(z, z2, z3, 0, i2);
            Size cameraResolution = createPlatformCamera.getCameraResolution();
            return new HostCameraContext(cameraResolution.getWidth(), cameraResolution.getHeight(), createPlatformCamera, i2);
        }

        /* access modifiers changed from: protected */
        @Override // com.he.lynx.Helium.VideoContext
        public void setMediaState(HeliumApp heliumApp, int i, long j) {
            int i2 = i & 15;
            if (i2 == 0) {
                release();
                heliumApp.resumables.remove(this);
            } else if (i2 == 1) {
                int i3 = (i >> 8) & 16777215;
                if (i3 != 0) {
                    this.texture = new SurfaceTexture(i3);
                    onSurfaceTextureReady(this.texture);
                }
                resume(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.add(this);
            } else if (i2 == 2) {
                pause(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.remove(this);
            } else if (i2 == 6) {
                this.texture.updateTexImage();
                this.s_timestamp = this.texture.getTimestamp();
            } else if (i2 == 7) {
                autoFocus();
            }
        }

        HostCameraContext(int i, int i2, IPlatformCamera iPlatformCamera, int i3) {
            super(i, i2);
            this.hostCamera = iPlatformCamera;
            this.pageID = i3;
        }
    }

    public static void setupEngine() {
        setupEngine(0, 1);
    }

    private static void stopSensors() {
        sensorManager.unregisterListener(orientationListener);
    }

    /* access modifiers changed from: package-private */
    public static class PlayerContext extends VideoContext implements IHeliumPlayer.IHeliumPlayerListener {
        final HeliumApp app;
        boolean isComplete;
        boolean loop;
        IHeliumPlayer player;
        Surface surface;
        final Uri uri;
        float volume;

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public boolean onError(IHeliumPlayer iHeliumPlayer, Object obj) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public float getCurrentTime() {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null && !this.isComplete) {
                return ((float) iHeliumPlayer.getCurrentPosition()) / 1000.0f;
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* access modifiers changed from: protected */
        @Override // com.he.lynx.Helium.VideoContext
        public void release() {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null) {
                iHeliumPlayer.release();
                this.player = null;
            }
            Surface surface2 = this.surface;
            if (surface2 != null) {
                surface2.release();
                this.surface = null;
            }
            if (this.texture != null) {
                this.texture.release();
                this.texture = null;
            }
        }

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onPrepared(IHeliumPlayer iHeliumPlayer) {
            try {
                iHeliumPlayer.play();
            } catch (IllegalStateException unused) {
            }
        }

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onRenderStart(IHeliumPlayer iHeliumPlayer) {
            Helium.onMediaStatusChange(this._ptr, 2);
        }

        @Override // com.he.lynx.HeliumApp.StateCallback
        public void pause(HeliumApp.StateCallback.CallType callType) {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer != null) {
                try {
                    iHeliumPlayer.pause();
                } catch (IllegalStateException unused) {
                }
            }
        }

        @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
        public void onCompletion(IHeliumPlayer iHeliumPlayer) {
            if (this.loop) {
                try {
                    if (!iHeliumPlayer.isPlaying()) {
                        iHeliumPlayer.play();
                    }
                    iHeliumPlayer.seekTo(0);
                } catch (IllegalStateException unused) {
                }
            } else {
                this.isComplete = true;
            }
            if (this._ptr != 0) {
                Helium.onMediaStatusChange(this._ptr, 1);
            }
        }

        @Override // com.he.lynx.HeliumApp.StateCallback
        public void resume(HeliumApp.StateCallback.CallType callType) {
            IHeliumPlayer iHeliumPlayer = this.player;
            if (iHeliumPlayer == null) {
                IHeliumPlayer createPlayer = this.app.createPlayer();
                this.player = createPlayer;
                try {
                    createPlayer.setDataSource(this.uri.toString());
                } catch (Exception unused) {
                }
                this.player.setListener(this);
                this.player.prepare();
                this.player.setSurface(this.surface);
                return;
            }
            iHeliumPlayer.setSurface(this.surface);
            IHeliumPlayer iHeliumPlayer2 = this.player;
            float f = this.volume;
            iHeliumPlayer2.setVolume(f, f);
            if (HeliumApp.StateCallback.CallType.SystemCall != callType || !this.isComplete || this.loop) {
                try {
                    this.player.play();
                } catch (IllegalStateException unused2) {
                }
                this.isComplete = false;
                this.player.setListener(this);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.he.lynx.Helium.VideoContext
        public void setMediaState(HeliumApp heliumApp, int i, long j) {
            int i2 = i & 15;
            boolean z = false;
            if (i2 == 1) {
                int i3 = i >> 8;
                if (i3 != 0) {
                    this.texture = new SurfaceTexture(i3 & 16777215);
                    this.surface = new Surface(this.texture);
                }
                if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                    z = true;
                }
                this.loop = z;
                this.volume = (float) Double.longBitsToDouble(j);
            } else if (i2 == 11) {
                if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                    z = true;
                }
                this.loop = z;
            } else if (i2 == 4) {
                if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                    z = true;
                }
                this.loop = z;
                IHeliumPlayer iHeliumPlayer = this.player;
                if (iHeliumPlayer != null) {
                    try {
                        iHeliumPlayer.seekTo((int) (Double.longBitsToDouble(j) * 1000.0d));
                    } catch (IllegalStateException unused) {
                    }
                }
            } else if (i2 == 5) {
                float longBitsToDouble = (float) Double.longBitsToDouble(j);
                this.volume = longBitsToDouble;
                IHeliumPlayer iHeliumPlayer2 = this.player;
                if (iHeliumPlayer2 != null) {
                    iHeliumPlayer2.setVolume(longBitsToDouble, longBitsToDouble);
                }
            }
            super.setMediaState(heliumApp, i, j);
        }

        PlayerContext(HeliumApp heliumApp, Uri uri2, IHeliumPlayer iHeliumPlayer, int i) {
            super(iHeliumPlayer.getVideoWidth(), iHeliumPlayer.getVideoHeight(), iHeliumPlayer.getDuration(), i);
            this.app = heliumApp;
            this.uri = uri2;
            this.player = iHeliumPlayer;
        }
    }

    private static float getCurrentTime(PlayerContext playerContext) {
        return playerContext.getCurrentTime();
    }

    private static String getInstallPath(HeliumApp heliumApp) {
        return heliumApp.context.getApplicationInfo().nativeLibraryDir;
    }

    private static void initSensors(HeliumApp heliumApp) {
        SensorManager sensorManager2 = (SensorManager) heliumApp.context.getSystemService("sensor");
        sensorManager = sensorManager2;
        gyroscopeSensor = sensorManager2.getDefaultSensor(4);
        rotationSensor = sensorManager.getDefaultSensor(15);
    }

    private static void onFatalError(String str) {
        Log.e("HeliumLynx", "onFatalError " + str);
        if (HeliumApp.fatalErrorHandler != null) {
            HeliumApp.fatalErrorHandler.handle(str);
        }
    }

    private static void onUncaughtException(String str) {
        Log.e("HeliumLynx", "onUncaughtException " + str);
        if (HeliumApp.uncaughtExceptionHandler != null) {
            HeliumApp.uncaughtExceptionHandler.handle(str);
        }
    }

    private static long getTimeStamp(BaseCameraContext baseCameraContext) {
        long j;
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - baseCameraContext.s_timestamp);
        if (Build.VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - baseCameraContext.s_timestamp);
        } else {
            j = Long.MAX_VALUE;
        }
        return nanoTime - Math.min(Math.min(abs, j), Math.abs((SystemClock.uptimeMillis() * 1000000) - baseCameraContext.s_timestamp));
    }

    public static boolean loadHelium(String str) {
        boolean z;
        if (helium_loaded) {
            return true;
        }
        synchronized (Helium.class) {
            try {
                if (!helium_loaded) {
                    if (str != null) {
                        System.load(str);
                    } else {
                        C1711a.m7628a("lynx_helium");
                    }
                    helium_loaded = true;
                }
            } catch (Throwable th) {
                Log.e("HeliumLynx", "lynx_helium not loaded", th);
            }
            z = helium_loaded;
        }
        return z;
    }

    private static boolean startSensors(int i) {
        sensorManager.unregisterListener(orientationListener);
        if (!sensorManager.registerListener(orientationListener, rotationSensor, i) || !sensorManager.registerListener(orientationListener, gyroscopeSensor, i)) {
            return false;
        }
        return true;
    }

    public static int getVideoRoration(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (str != null) {
            try {
                mediaMetadataRetriever.setDataSource(str, new HashMap());
            } catch (Exception e) {
                Log.e("HeliumLynx", "getVideoRoration MediaMetadataRetriever exception " + e);
                e.printStackTrace();
                mediaMetadataRetriever.release();
                return 0;
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
        mediaMetadataRetriever.release();
        return parseInt;
    }

    public static abstract class BaseCameraContext extends VideoContext {
        public boolean startRecord(HeliumApp heliumApp, String str, int i, int i2, boolean z) {
            return false;
        }

        public void stopRecord(long j, BaseCameraContext baseCameraContext) {
        }

        protected BaseCameraContext(int i, int i2) {
            super(i, i2, 0, 0);
        }
    }

    public static void onMediaRequest(long j, Object obj) {
        onMediaRequest(j, obj, "");
    }

    static abstract class VideoContext implements HeliumApp.StateCallback {
        protected long _ptr;
        protected final int duration;
        protected final int height;
        protected final int rotation;
        protected long s_timestamp;
        protected SurfaceTexture texture;
        protected final int width;

        /* access modifiers changed from: protected */
        public abstract void release();

        /* access modifiers changed from: protected */
        public void setMediaState(HeliumApp heliumApp, int i, long j) {
            int i2 = i & 15;
            if (i2 == 0) {
                release();
                heliumApp.resumables.remove(this);
            } else if (i2 == 1) {
                resume(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.add(this);
            } else if (i2 == 2) {
                pause(HeliumApp.StateCallback.CallType.JSBridge);
                heliumApp.resumables.remove(this);
            } else if (i2 == 6) {
                this.texture.updateTexImage();
                this.s_timestamp = this.texture.getTimestamp();
            }
        }

        protected VideoContext(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.duration = i3;
            this.rotation = i4;
        }
    }

    private static void loadMedia(final HeliumApp heliumApp, String str, final long j) throws IOException {
        if (heliumApp.mediaLoader != null) {
            final Uri loadMedia = heliumApp.mediaLoader.loadMedia(str);
            if (loadMedia == null) {
                onMediaRequest(j, null);
                return;
            }
            final IHeliumPlayer createPlayer = heliumApp.createPlayer();
            players.add(createPlayer);
            final AnonymousClass1MediaListener r7 = new IHeliumPlayer.IHeliumPlayerListener() {
                /* class com.he.lynx.Helium.AnonymousClass1MediaListener */
                private PlayerContext handle;
                private boolean hasRotation;
                private boolean prepared;
                private int rotation;

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public void onCompletion(IHeliumPlayer iHeliumPlayer) {
                }

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public void onRenderStart(IHeliumPlayer iHeliumPlayer) {
                }

                private void checkPrepared() {
                    if (this.prepared && this.hasRotation) {
                        PlayerContext playerContext = new PlayerContext(heliumApp, loadMedia, createPlayer, this.rotation);
                        this.handle = playerContext;
                        Helium.onMediaRequest(j, playerContext);
                    }
                }

                public void setRotation(int i) {
                    if (!this.hasRotation) {
                        this.hasRotation = true;
                        this.rotation = i;
                        checkPrepared();
                    }
                }

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public void onPrepared(IHeliumPlayer iHeliumPlayer) {
                    if (!this.prepared) {
                        iHeliumPlayer.setListener(null);
                        Helium.players.remove(iHeliumPlayer);
                        this.prepared = true;
                        checkPrepared();
                    }
                }

                @Override // com.he.lynx.player.IHeliumPlayer.IHeliumPlayerListener
                public boolean onError(IHeliumPlayer iHeliumPlayer, Object obj) {
                    iHeliumPlayer.setListener(null);
                    Helium.players.remove(iHeliumPlayer);
                    iHeliumPlayer.release();
                    Helium.onMediaRequest(j, this.handle);
                    return true;
                }
            };
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            newSingleThreadExecutor.execute(new Runnable() {
                /* class com.he.lynx.Helium.RunnableC233802 */

                public void run() {
                    final int videoRoration = Helium.getVideoRoration(loadMedia.toString());
                    heliumApp.dispatchToJSThread(new Runnable() {
                        /* class com.he.lynx.Helium.RunnableC233802.RunnableC233811 */

                        public void run() {
                            r7.setRotation(videoRoration);
                        }
                    });
                }
            });
            newSingleThreadExecutor.shutdown();
            createPlayer.setListener(r7);
            try {
                createPlayer.setDataSource(loadMedia.toString());
            } catch (Exception unused) {
            }
            createPlayer.prepare();
        }
    }

    private static void setMediaState(HeliumApp heliumApp, VideoContext videoContext, int i, long j) {
        videoContext.setMediaState(heliumApp, i, j);
    }

    private static void onMonitor(int i, int i2, int i3, String str) {
        if (i == 1) {
            Log.e("HeliumLynx", "!!! Aurum init fail: " + str);
        } else if (i == 2) {
            Log.e("HeliumLynx", "!!! Effect load fail: " + str);
        }
    }

    private static void requestMedia(final HeliumApp heliumApp, final int i, final int i2, final long j) {
        boolean z;
        boolean z2;
        MediaLoader.FacingMode facingMode;
        if (heliumApp.mediaLoader != null) {
            MediaLoader.RequestParams requestParams = new MediaLoader.RequestParams();
            boolean z3 = false;
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            requestParams.audio = z;
            if ((i & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            requestParams.video = z2;
            if ((i & MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL) != 0) {
                z3 = true;
            }
            requestParams.effect = z3;
            if ((i & 1) != 0) {
                facingMode = MediaLoader.FacingMode.ENVIRONMENT;
            } else {
                facingMode = MediaLoader.FacingMode.USER;
            }
            requestParams.facingMode = facingMode;
            heliumApp.mediaLoader.onRequest(requestParams, new MediaLoader.Responder() {
                /* class com.he.lynx.Helium.AnonymousClass1Callback */
                private boolean called;

                @Override // com.he.lynx.loader.MediaLoader.Responder
                public void onResponse(boolean z) {
                    HeliumApp.StateCallback stateCallback;
                    if (!this.called) {
                        this.called = true;
                        if (!z) {
                            Helium.onMediaRequest(j, null, "no authorization");
                        } else if ((i & 4) == 0) {
                            Helium.onMediaRequest(j, heliumApp);
                        } else {
                            try {
                                HeliumApp.PlatformCameraFactory platformCameraFactory = heliumApp.getPlatformCameraFactory();
                                if (platformCameraFactory != null) {
                                    Log.w("HeliumLynx", "Use Host Camera with pageID = " + i2);
                                    try {
                                        stateCallback = HostCameraContext.requestHostCameraCtx(i, platformCameraFactory, i2);
                                    } catch (IllegalStateException e) {
                                        Helium.onMediaRequest(j, null, e.getMessage());
                                        return;
                                    }
                                } else {
                                    Log.w("HeliumLynx", "Use Helium Camera");
                                    try {
                                        stateCallback = (BaseCameraContext) Class.forName("com.he.lynx.player.HeliumCameraContext").getMethod("requestCamera", Integer.TYPE).invoke(null, Integer.valueOf(i));
                                    } catch (Throwable th) {
                                        Log.w("HeliumLynx", "No Helium Camera " + th.toString());
                                        Helium.onMediaRequest(j, null, th.getMessage());
                                        return;
                                    }
                                }
                                if (stateCallback != null) {
                                    heliumApp.resumables.add(stateCallback);
                                    Helium.onMediaRequest(j, stateCallback);
                                    return;
                                }
                                Helium.onMediaRequest(j, null, "unknown error");
                            } catch (Throwable th2) {
                                Log.w("HeliumLynx", "No Helium Camera " + th2.toString());
                                Helium.onMediaRequest(j, null, th2.getMessage());
                            }
                        }
                    }
                }
            });
        }
    }

    private static byte[] encodeBitmap(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        Bitmap.CompressFormat compressFormat;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        if (i == 1) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        } else if (i == 2) {
            compressFormat = Bitmap.CompressFormat.WEBP;
        } else {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 * i3) / 4) + DynamicModule.f58006b);
        if (createBitmap.compress(compressFormat, i4, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }
}
