package com.he.lynx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.he.lynx.loader.MediaLoader;
import com.he.lynx.player.HeliumPlayerImpl;
import com.he.lynx.player.IHeliumPlayer;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import me.ele.lancet.base.annotations.Skip;

public final class HeliumApp {
    static ScriptErrorHandler fatalErrorHandler;
    static LoadSoInHostCallback loadSoInHostCallback;
    static ScriptErrorHandler uncaughtExceptionHandler;
    public ContextWrapper context;
    private final Delegate delegate = new Delegate();
    public final List<Drawable> drawables = new ArrayList(1);
    public WeakReference<LynxDelegate> lynxDelegate = null;
    private PlatformCameraFactory mPlatformCameraFactory;
    public MediaLoader mediaLoader = new MediaLoader() {
        /* class com.he.lynx.HeliumApp.C233832 */

        @Override // com.he.lynx.loader.MediaLoader
        public Uri loadMedia(String str) {
            return Uri.parse(str);
        }

        @Override // com.he.lynx.loader.MediaLoader
        public void onRequest(MediaLoader.RequestParams requestParams, MediaLoader.Responder responder) {
            if (responder != null) {
                responder.onResponse(true);
            }
        }
    };
    private IHeliumPlayer.HeliumPlayerFactory playerFactory = new IHeliumPlayer.HeliumPlayerFactory() {
        /* class com.he.lynx.HeliumApp.C233821 */

        @Override // com.he.lynx.player.IHeliumPlayer.HeliumPlayerFactory
        public IHeliumPlayer create() {
            return new HeliumPlayerImpl();
        }
    };
    public long ptr;
    public Set<StateCallback> resumables = new CopyOnWriteArraySet();
    private BroadcastReceiver screenReceiver;

    public interface LoadSoCallback {
        void complete(boolean z, String str);
    }

    public interface LoadSoInHostCallback {
        void loadSoInHost(String str, LoadSoCallback loadSoCallback);
    }

    public interface LynxDelegate {
        void runOnJsThread(Runnable runnable);
    }

    public interface PlatformCameraFactory {
        IPlatformCamera createPlatformCamera();
    }

    public interface ScriptErrorHandler {
        void handle(String str);
    }

    public interface StateCallback {

        public enum CallType {
            SystemCall,
            JSBridge
        }

        void pause(CallType callType);

        void resume(CallType callType);
    }

    public PlatformCameraFactory getPlatformCameraFactory() {
        return this.mPlatformCameraFactory;
    }

    public IHeliumPlayer createPlayer() {
        return this.playerFactory.create();
    }

    public static boolean loadEffectInHost() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        LoadSoInHostCallback loadSoInHostCallback2 = loadSoInHostCallback;
        if (loadSoInHostCallback2 != null) {
            loadSoInHostCallback2.loadSoInHost("libeffect.so", new LoadSoCallback() {
                /* class com.he.lynx.HeliumApp.C233843 */

                @Override // com.he.lynx.HeliumApp.LoadSoCallback
                public void complete(boolean z, String str) {
                    zArr[0] = z;
                    if (!z) {
                        Log.e("HeliumApp", "loadEffectInHost failed with msg : " + str);
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                Log.e("HeliumApp", e.getMessage());
            }
        }
        return zArr[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = r3.resumables.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r0.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r0.next().pause(com.he.lynx.HeliumApp.StateCallback.CallType.SystemCall);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pause() {
        /*
            r3 = this;
            com.he.lynx.HeliumApp$Delegate r0 = r3.delegate
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.he.lynx.HeliumApp$Delegate r0 = r3.delegate
            monitor-enter(r0)
            com.he.lynx.HeliumApp$Delegate r1 = r3.delegate     // Catch:{ all -> 0x003d }
            boolean r1 = r1.destroyed     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x003b
            com.he.lynx.HeliumApp$Delegate r1 = r3.delegate     // Catch:{ all -> 0x003d }
            boolean r1 = r1.paused     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0017
            goto L_0x003b
        L_0x0017:
            com.he.lynx.HeliumApp$Delegate r1 = r3.delegate     // Catch:{ all -> 0x003d }
            r2 = 1
            r1.paused = r2     // Catch:{ all -> 0x003d }
            long r1 = r3.ptr     // Catch:{ all -> 0x003d }
            com.he.lynx.Helium.onPause(r1)     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            java.util.Set<com.he.lynx.HeliumApp$StateCallback> r0 = r3.resumables
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()
            com.he.lynx.HeliumApp$StateCallback r1 = (com.he.lynx.HeliumApp.StateCallback) r1
            com.he.lynx.HeliumApp$StateCallback$CallType r2 = com.he.lynx.HeliumApp.StateCallback.CallType.SystemCall
            r1.pause(r2)
            goto L_0x0028
        L_0x003a:
            return
        L_0x003b:
            monitor-exit(r0)
            return
        L_0x003d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.lynx.HeliumApp.pause():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = r3.resumables.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r0.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r0.next().resume(com.he.lynx.HeliumApp.StateCallback.CallType.SystemCall);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resume() {
        /*
            r3 = this;
            com.he.lynx.HeliumApp$Delegate r0 = r3.delegate
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.he.lynx.HeliumApp$Delegate r0 = r3.delegate
            monitor-enter(r0)
            com.he.lynx.HeliumApp$Delegate r1 = r3.delegate     // Catch:{ all -> 0x003d }
            boolean r1 = r1.destroyed     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x003b
            com.he.lynx.HeliumApp$Delegate r1 = r3.delegate     // Catch:{ all -> 0x003d }
            boolean r1 = r1.paused     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x0017
            goto L_0x003b
        L_0x0017:
            com.he.lynx.HeliumApp$Delegate r1 = r3.delegate     // Catch:{ all -> 0x003d }
            r2 = 0
            r1.paused = r2     // Catch:{ all -> 0x003d }
            long r1 = r3.ptr     // Catch:{ all -> 0x003d }
            com.he.lynx.Helium.onResume(r1)     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            java.util.Set<com.he.lynx.HeliumApp$StateCallback> r0 = r3.resumables
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()
            com.he.lynx.HeliumApp$StateCallback r1 = (com.he.lynx.HeliumApp.StateCallback) r1
            com.he.lynx.HeliumApp$StateCallback$CallType r2 = com.he.lynx.HeliumApp.StateCallback.CallType.SystemCall
            r1.resume(r2)
            goto L_0x0028
        L_0x003a:
            return
        L_0x003b:
            monitor-exit(r0)
            return
        L_0x003d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.lynx.HeliumApp.resume():void");
    }

    public final void cleanup() {
        this.delegate.destroyed = true;
        BroadcastReceiver broadcastReceiver = this.screenReceiver;
        if (broadcastReceiver != null) {
            this.context.unregisterReceiver(broadcastReceiver);
            this.screenReceiver = null;
        }
        this.context = null;
        for (Drawable drawable : this.drawables) {
            if (drawable.view != null) {
                drawable.view.setOnTouchListener(null);
            }
            drawable.holder.removeCallback(this.delegate);
        }
        this.drawables.clear();
        this.resumables.clear();
        synchronized (this.delegate) {
            long j = this.ptr;
            if (j != 0) {
                Helium.cleanup(j);
                this.ptr = 0;
            }
        }
    }

    public static void setFatalErrorHandler(ScriptErrorHandler scriptErrorHandler) {
        fatalErrorHandler = scriptErrorHandler;
    }

    public static void setLoadSoInHostCallback(LoadSoInHostCallback loadSoInHostCallback2) {
        loadSoInHostCallback = loadSoInHostCallback2;
    }

    public static void setUncaughtExceptionHandler(ScriptErrorHandler scriptErrorHandler) {
        uncaughtExceptionHandler = scriptErrorHandler;
    }

    public void setHeliumPlayerFactory(IHeliumPlayer.HeliumPlayerFactory heliumPlayerFactory) {
        this.playerFactory = heliumPlayerFactory;
    }

    public void setPlatformCameraFactory(PlatformCameraFactory platformCameraFactory) {
        this.mPlatformCameraFactory = platformCameraFactory;
    }

    /* access modifiers changed from: package-private */
    public class Delegate implements SurfaceHolder.Callback, View.OnTouchListener {
        public boolean destroyed;
        public boolean paused;

        Delegate() {
        }

        public final void doFrame(long j) {
            if (!this.destroyed && !this.paused && HeliumApp.this.ptr != 0) {
                Helium.doFrame(HeliumApp.this.ptr);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceCreated(HeliumApp.this.ptr, findSurface, surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceDestroyed(HeliumApp.this.ptr, findSurface);
            }
        }

        private long findSurface(SurfaceHolder surfaceHolder) {
            for (int i = 0; i < HeliumApp.this.drawables.size(); i++) {
                Drawable drawable = HeliumApp.this.drawables.get(i);
                if (drawable.holder == surfaceHolder) {
                    return drawable.ptr;
                }
            }
            return 0;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            for (int i = 0; i < HeliumApp.this.drawables.size(); i++) {
                Drawable drawable = HeliumApp.this.drawables.get(i);
                if (drawable.view == view) {
                    HeliumApp.this.dispatch(drawable, motionEvent);
                }
            }
            return true;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            long findSurface = findSurface(surfaceHolder);
            if (findSurface != 0) {
                Helium.onSurfaceChanged(HeliumApp.this.ptr, findSurface, i2, i3);
            }
        }
    }

    public final void doFrame(long j) {
        this.delegate.doFrame(j);
    }

    public final Drawable addView(SurfaceView surfaceView) {
        return addView(surfaceView, surfaceView.getHolder());
    }

    private Surface getSurface(SurfaceHolder surfaceHolder) {
        Surface surface = surfaceHolder.getSurface();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException unused) {
            }
            surface = surfaceHolder.getSurface();
        }
        return surface;
    }

    public void dispatchToJSThread(Runnable runnable) {
        LynxDelegate lynxDelegate2;
        if (runnable != null && (lynxDelegate2 = this.lynxDelegate.get()) != null) {
            lynxDelegate2.runOnJsThread(runnable);
        }
    }

    public final Drawable addSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            return null;
        }
        Surface surface = getSurface(surfaceHolder);
        if (surface != null) {
            long j = this.ptr;
            if (j != 0) {
                long addView = Helium.addView(j, surface);
                if (addView != 0) {
                    return createDrawable(addView, null, surfaceHolder);
                }
                throw new RuntimeException("failed to create EGLSurface");
            }
            throw new RuntimeException("heliumAppPtr is null");
        }
        throw new RuntimeException("surface is null");
    }

    public final void removeView(Drawable drawable) {
        this.drawables.remove(drawable);
        if (drawable.view instanceof TextureView) {
            Helium.onSurfaceDestroyed(this.ptr, drawable.ptr);
        }
        if (drawable.holder != null) {
            drawable.holder.removeCallback(this.delegate);
        }
        if (drawable.view != null) {
            drawable.view.setOnTouchListener(null);
        }
    }

    public final Drawable addView(TextureView textureView) {
        if (Build.VERSION.SDK_INT >= 24 && this.screenReceiver == null) {
            this.screenReceiver = new BroadcastReceiver() {
                /* class com.he.lynx.HeliumApp.C233854 */

                public void onReceive(Context context, Intent intent) {
                    for (Drawable drawable : HeliumApp.this.drawables) {
                        View view = drawable.view;
                        if ((view instanceof TextureView) && view.getVisibility() == 0) {
                            view.setVisibility(4);
                            view.setVisibility(0);
                            view.invalidate();
                        }
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            INVOKEVIRTUAL_com_he_lynx_HeliumApp_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(this.context, this.screenReceiver, intentFilter);
        }
        return addView(textureView, new TextureViewHolder(textureView));
    }

    public HeliumApp(ContextWrapper contextWrapper, LynxDelegate lynxDelegate2) {
        this.context = contextWrapper;
        this.lynxDelegate = new WeakReference<>(lynxDelegate2);
    }

    private Drawable addView(View view, SurfaceHolder surfaceHolder) {
        Surface surface = getSurface(surfaceHolder);
        if (surface != null) {
            long j = this.ptr;
            if (j != 0) {
                long addView = Helium.addView(j, surface);
                if (addView != 0) {
                    return createDrawable(addView, view, surfaceHolder);
                }
                throw new RuntimeException("failed to create EGLSurface");
            }
            throw new RuntimeException("heliumAppPtr is null");
        }
        throw new RuntimeException("surface is null");
    }

    public static boolean setHostSensitivePermissionStatus(String str, boolean z) {
        if (str != null && str.equals("camera")) {
            Helium.setSensitivePermissionStatus(0, z);
            Helium.cameraPermission = z;
            return true;
        } else if (str == null || !str.equals("record")) {
            return false;
        } else {
            Helium.setSensitivePermissionStatus(1, z);
            return true;
        }
    }

    public void dispatch(Drawable drawable, MotionEvent motionEvent) {
        LynxDelegate lynxDelegate2 = this.lynxDelegate.get();
        if (lynxDelegate2 != null) {
            int actionIndex = motionEvent.getActionIndex();
            int i = 5;
            if (actionIndex < 5) {
                int pointerCount = motionEvent.getPointerCount();
                if (pointerCount <= 5) {
                    i = pointerCount;
                }
                final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(72);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                allocateDirect.clear();
                allocateDirect.put((byte) 1).put((byte) motionEvent.getActionMasked()).put((byte) i).put((byte) actionIndex);
                for (int i2 = 0; i2 < i; i2++) {
                    allocateDirect.putInt(motionEvent.getPointerId(i2)).putFloat(motionEvent.getX(i2)).putFloat(motionEvent.getY(i2));
                }
                allocateDirect.putLong(64, drawable.ptr);
                if (lynxDelegate2 != null) {
                    lynxDelegate2.runOnJsThread(new Runnable() {
                        /* class com.he.lynx.HeliumApp.RunnableC233865 */

                        public void run() {
                            Helium.dispatch(HeliumApp.this.ptr, allocateDirect);
                        }
                    });
                }
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_he_lynx_HeliumApp_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(ContextWrapper contextWrapper, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return contextWrapper.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    private Drawable createDrawable(long j, View view, SurfaceHolder surfaceHolder) {
        Drawable drawable = new Drawable(j, view, surfaceHolder);
        this.drawables.add(drawable);
        if (view != null) {
            view.setOnTouchListener(this.delegate);
        }
        surfaceHolder.addCallback(this.delegate);
        return drawable;
    }
}
