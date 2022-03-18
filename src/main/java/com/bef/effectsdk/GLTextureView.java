package com.bef.effectsdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: b */
    public static final C2074j f7090b = new C2074j();

    /* renamed from: a */
    SurfaceTexture f7091a;

    /* renamed from: c */
    public GLSurfaceView.Renderer f7092c;

    /* renamed from: d */
    public AbstractC2069e f7093d;

    /* renamed from: e */
    public AbstractC2070f f7094e;

    /* renamed from: f */
    public AbstractC2071g f7095f;

    /* renamed from: g */
    public AbstractC2075k f7096g;

    /* renamed from: h */
    public int f7097h;

    /* renamed from: i */
    public int f7098i;

    /* renamed from: j */
    public boolean f7099j;

    /* renamed from: k */
    private final WeakReference<GLTextureView> f7100k = new WeakReference<>(this);

    /* renamed from: l */
    private C2073i f7101l;

    /* renamed from: m */
    private boolean f7102m;

    /* renamed from: com.bef.effectsdk.GLTextureView$e */
    public interface AbstractC2069e {
        /* renamed from: a */
        EGLConfig mo10209a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* renamed from: com.bef.effectsdk.GLTextureView$f */
    public interface AbstractC2070f {
        /* renamed from: a */
        EGLContext mo10211a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo10212a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.bef.effectsdk.GLTextureView$g */
    public interface AbstractC2071g {
        /* renamed from: a */
        EGLSurface mo10213a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* renamed from: a */
        void mo10214a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* renamed from: com.bef.effectsdk.GLTextureView$k */
    public interface AbstractC2075k {
        /* renamed from: a */
        GL mo10240a(GL gl);
    }

    /* renamed from: com.bef.effectsdk.GLTextureView$d */
    private static class C2068d implements AbstractC2071g {
        private C2068d() {
        }

        @Override // com.bef.effectsdk.GLTextureView.AbstractC2071g
        /* renamed from: a */
        public void mo10214a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        @Override // com.bef.effectsdk.GLTextureView.AbstractC2071g
        /* renamed from: a */
        public EGLSurface mo10213a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bef.effectsdk.GLTextureView$j */
    public static class C2074j {

        /* renamed from: a */
        private static String f7141a = "GLThreadManager";

        /* renamed from: b */
        private boolean f7142b;

        /* renamed from: c */
        private int f7143c;

        /* renamed from: d */
        private boolean f7144d;

        /* renamed from: e */
        private boolean f7145e;

        /* renamed from: f */
        private boolean f7146f;

        /* renamed from: g */
        private C2073i f7147g;

        private C2074j() {
        }

        /* renamed from: a */
        public synchronized boolean mo10236a() {
            return this.f7146f;
        }

        /* renamed from: b */
        public synchronized boolean mo10237b() {
            m9032c();
            return !this.f7145e;
        }

        /* renamed from: c */
        private void m9032c() {
            if (!this.f7142b) {
                this.f7145e = true;
                String str = f7141a;
                Log.w(str, "checkGLESVersion mGLESVersion = " + this.f7143c + " mMultipleGLESContextsAllowed = " + this.f7145e);
                this.f7142b = true;
            }
        }

        /* renamed from: c */
        public void mo10239c(C2073i iVar) {
            if (this.f7147g == iVar) {
                this.f7147g = null;
            }
            notifyAll();
        }

        /* renamed from: b */
        public boolean mo10238b(C2073i iVar) {
            C2073i iVar2 = this.f7147g;
            if (iVar2 == iVar || iVar2 == null) {
                this.f7147g = iVar;
                notifyAll();
                return true;
            }
            m9032c();
            if (this.f7145e) {
                return true;
            }
            C2073i iVar3 = this.f7147g;
            if (iVar3 == null) {
                return false;
            }
            iVar3.mo10232i();
            return false;
        }

        /* renamed from: a */
        public synchronized void mo10234a(C2073i iVar) {
            Log.i("GLThread", "exiting tid=" + iVar.getId());
            iVar.f7121a = true;
            if (this.f7147g == iVar) {
                this.f7147g = null;
            }
            notifyAll();
        }

        /* renamed from: a */
        public synchronized void mo10235a(GL10 gl10) {
            boolean z;
            if (!this.f7144d) {
                m9032c();
                String glGetString = gl10.glGetString(7937);
                boolean z2 = false;
                if (this.f7143c < 131072) {
                    if (!glGetString.startsWith("Q3Dimension MSM7500 ")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f7145e = z;
                    notifyAll();
                }
                if (!this.f7145e) {
                    z2 = true;
                }
                this.f7146f = z2;
                String str = f7141a;
                Log.w(str, "checkGLDriver renderer = \"" + glGetString + "\" multipleContextsAllowed = " + this.f7145e + " mLimitedGLESContexts = " + this.f7146f);
                this.f7144d = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bef.effectsdk.GLTextureView$l */
    public static class C2076l extends Writer {

        /* renamed from: a */
        private StringBuilder f7148a = new StringBuilder();

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() {
            m9040a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m9040a();
        }

        C2076l() {
        }

        /* renamed from: a */
        private void m9040a() {
            if (this.f7148a.length() > 0) {
                Log.v("GLSurfaceView", this.f7148a.toString());
                StringBuilder sb = this.f7148a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m9040a();
                } else {
                    this.f7148a.append(c);
                }
            }
        }
    }

    /* renamed from: b */
    private void mo10248b() {
        setSurfaceTextureListener(this);
    }

    public int getDebugFlags() {
        return this.f7097h;
    }

    public int getEGLContextClientVersion() {
        return this.f7098i;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f7099j;
    }

    /* renamed from: a */
    public void mo10181a() {
        this.f7101l.mo10226c();
    }

    public int getRenderMode() {
        return this.f7101l.mo10225b();
    }

    public void onDestroy() {
        SurfaceTexture surfaceTexture = this.f7091a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void onPause() {
        this.f7101l.mo10229f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bef.effectsdk.GLTextureView$i */
    public static class C2073i extends Thread {

        /* renamed from: a */
        public boolean f7121a;

        /* renamed from: b */
        private boolean f7122b;

        /* renamed from: c */
        private boolean f7123c;

        /* renamed from: d */
        private boolean f7124d;

        /* renamed from: e */
        private boolean f7125e;

        /* renamed from: f */
        private boolean f7126f;

        /* renamed from: g */
        private boolean f7127g;

        /* renamed from: h */
        private boolean f7128h;

        /* renamed from: i */
        private boolean f7129i;

        /* renamed from: j */
        private boolean f7130j;

        /* renamed from: k */
        private boolean f7131k;

        /* renamed from: l */
        private int f7132l = 0;

        /* renamed from: m */
        private int f7133m = 0;

        /* renamed from: n */
        private int f7134n = 1;

        /* renamed from: o */
        private boolean f7135o = true;

        /* renamed from: p */
        private boolean f7136p;

        /* renamed from: q */
        private ArrayList<Runnable> f7137q = new ArrayList<>();

        /* renamed from: r */
        private boolean f7138r = true;

        /* renamed from: s */
        private C2072h f7139s;

        /* renamed from: t */
        private WeakReference<GLTextureView> f7140t;

        /* renamed from: j */
        private void m9016j() {
            if (this.f7129i) {
                this.f7129i = false;
                this.f7139s.mo10219e();
            }
        }

        /* renamed from: b */
        public int mo10225b() {
            int i;
            synchronized (GLTextureView.f7090b) {
                i = this.f7134n;
            }
            return i;
        }

        /* renamed from: c */
        public void mo10226c() {
            synchronized (GLTextureView.f7090b) {
                this.f7135o = true;
                GLTextureView.f7090b.notifyAll();
            }
        }

        /* renamed from: i */
        public void mo10232i() {
            this.f7131k = true;
            GLTextureView.f7090b.notifyAll();
        }

        /* renamed from: k */
        private void m9017k() {
            if (this.f7128h) {
                this.f7139s.mo10220f();
                this.f7128h = false;
                GLTextureView.f7090b.mo10239c(this);
            }
        }

        /* renamed from: m */
        private boolean m9019m() {
            if (this.f7124d || !this.f7125e || this.f7126f || this.f7132l <= 0 || this.f7133m <= 0 || (!this.f7135o && this.f7134n != 1)) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public void mo10228e() {
            synchronized (GLTextureView.f7090b) {
                Log.i("GLThread", "surfaceDestroyed tid=" + getId());
                this.f7125e = false;
                GLTextureView.f7090b.notifyAll();
                while (!this.f7127g && !this.f7121a) {
                    try {
                        GLTextureView.f7090b.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo10231h() {
            synchronized (GLTextureView.f7090b) {
                this.f7122b = true;
                GLTextureView.f7090b.notifyAll();
                while (!this.f7121a) {
                    try {
                        GLTextureView.f7090b.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: d */
        public void mo10227d() {
            synchronized (GLTextureView.f7090b) {
                Log.i("GLThread", "surfaceCreated tid=" + getId());
                this.f7125e = true;
                this.f7130j = false;
                GLTextureView.f7090b.notifyAll();
                while (this.f7127g && !this.f7130j && !this.f7121a) {
                    try {
                        GLTextureView.f7090b.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo10229f() {
            synchronized (GLTextureView.f7090b) {
                Log.i("GLThread", "onPause tid=" + getId());
                this.f7123c = true;
                GLTextureView.f7090b.notifyAll();
                while (!this.f7121a && !this.f7124d) {
                    Log.i("Main thread", "onPause waiting for mPaused.");
                    try {
                        GLTextureView.f7090b.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* renamed from: g */
        public void mo10230g() {
            synchronized (GLTextureView.f7090b) {
                Log.i("GLThread", "onResume tid=" + getId());
                this.f7123c = false;
                this.f7135o = true;
                this.f7136p = false;
                GLTextureView.f7090b.notifyAll();
                while (!this.f7121a && this.f7124d && !this.f7136p) {
                    Log.i("Main thread", "onResume waiting for !mPaused.");
                    try {
                        GLTextureView.f7090b.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void run() {
            setName("GLThread " + getId());
            Log.i("GLThread", "starting tid=" + getId());
            try {
                m9018l();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                GLTextureView.f7090b.mo10234a(this);
                throw th;
            }
            GLTextureView.f7090b.mo10234a(this);
        }

        /* renamed from: a */
        public boolean mo10224a() {
            if (!this.f7128h || !this.f7129i || !m9019m()) {
                return false;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            r20.f7130j = true;
            com.bef.effectsdk.GLTextureView.f7090b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x025a, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x025b, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0260, code lost:
            r2 = com.bef.effectsdk.GLTextureView.f7090b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0262, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            r20.f7130j = true;
            r20.f7126f = true;
            com.bef.effectsdk.GLTextureView.f7090b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x026d, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x026e, code lost:
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0275, code lost:
            if (r6 == false) goto L_0x0287;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0277, code lost:
            r3 = (javax.microedition.khronos.opengles.GL10) r20.f7139s.mo10217c();
            com.bef.effectsdk.GLTextureView.f7090b.mo10235a(r3);
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0287, code lost:
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0289, code lost:
            if (r4 == false) goto L_0x02a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x028b, code lost:
            android.util.Log.w("GLThread", "onSurfaceCreated");
            r2 = r20.f7140t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x029a, code lost:
            if (r2 == null) goto L_0x02a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x029c, code lost:
            r2.f7092c.onSurfaceCreated(r3, r20.f7139s.f7118d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a5, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a6, code lost:
            if (r14 == null) goto L_0x02ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ad, code lost:
            if (r8 == false) goto L_0x02e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x02af, code lost:
            android.util.Log.w("GLThread", "onSurfaceChanged(" + r12 + ", " + r13 + ")");
            r2 = r20.f7140t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x02da, code lost:
            if (r2 == null) goto L_0x02e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x02dc, code lost:
            r2.f7092c.onSurfaceChanged(r3, r12, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x02e1, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x02e2, code lost:
            android.util.Log.w("GLThread", "onDrawFrame tid=" + getId());
            r2 = r20.f7140t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x0307, code lost:
            if (r2 == null) goto L_0x030e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x0309, code lost:
            r2.f7092c.onDrawFrame(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x030e, code lost:
            r2 = r20.f7139s.mo10218d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x0316, code lost:
            if (r2 == 12288) goto L_0x0351;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x031a, code lost:
            if (r2 == 12302) goto L_0x0333;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x031c, code lost:
            com.bef.effectsdk.GLTextureView.C2072h.m9007a("GLThread", "eglSwapBuffers", r2);
            r2 = com.bef.effectsdk.GLTextureView.f7090b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0325, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
            r20.f7126f = true;
            com.bef.effectsdk.GLTextureView.f7090b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x032e, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0333, code lost:
            r5 = new java.lang.StringBuilder();
            r5.append("egl context lost tid=");
            r15 = r3;
            r5.append(getId());
            android.util.Log.i("GLThread", r5.toString());
            r7 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0351, code lost:
            r15 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0352, code lost:
            if (r9 == false) goto L_0x0355;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0354, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0355, code lost:
            r5 = r5;
            r3 = r15;
            r4 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x023e, code lost:
            if (r5 == false) goto L_0x0275;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0240, code lost:
            android.util.Log.w("GLThread", "egl createSurface");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x024d, code lost:
            if (r20.f7139s.mo10216b() == false) goto L_0x0260;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x024f, code lost:
            r2 = com.bef.effectsdk.GLTextureView.f7090b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0251, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x0209 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x035e A[SYNTHETIC] */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m9018l() throws java.lang.InterruptedException {
            /*
            // Method dump skipped, instructions count: 1030
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.GLTextureView.C2073i.m9018l():void");
        }

        C2073i(WeakReference<GLTextureView> weakReference) {
            this.f7140t = weakReference;
        }

        /* renamed from: a */
        public void mo10221a(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (GLTextureView.f7090b) {
                this.f7134n = i;
                GLTextureView.f7090b.notifyAll();
            }
        }

        /* renamed from: a */
        public void mo10223a(Runnable runnable) {
            if (runnable != null) {
                synchronized (GLTextureView.f7090b) {
                    this.f7137q.add(runnable);
                    GLTextureView.f7090b.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }

        /* renamed from: a */
        public void mo10222a(int i, int i2) {
            synchronized (GLTextureView.f7090b) {
                this.f7132l = i;
                this.f7133m = i2;
                this.f7138r = true;
                this.f7135o = true;
                this.f7136p = false;
                GLTextureView.f7090b.notifyAll();
                while (!this.f7121a && !this.f7124d && !this.f7136p && mo10224a()) {
                    Log.i("Main thread", "onWindowResize waiting for render complete from tid=" + getId());
                    try {
                        GLTextureView.f7090b.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void mo10249c() {
        if (this.f7101l != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() throws Throwable {
        try {
            C2073i iVar = this.f7101l;
            if (iVar != null) {
                iVar.mo10231h();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bef.effectsdk.GLTextureView$h */
    public static class C2072h {

        /* renamed from: a */
        EGL10 f7115a;

        /* renamed from: b */
        EGLDisplay f7116b;

        /* renamed from: c */
        EGLSurface f7117c;

        /* renamed from: d */
        EGLConfig f7118d;

        /* renamed from: e */
        EGLContext f7119e;

        /* renamed from: f */
        private WeakReference<GLTextureView> f7120f;

        /* renamed from: d */
        public int mo10218d() {
            if (!this.f7115a.eglSwapBuffers(this.f7116b, this.f7117c)) {
                return this.f7115a.eglGetError();
            }
            return 12288;
        }

        /* renamed from: g */
        private void m9009g() {
            EGLSurface eGLSurface = this.f7117c;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                this.f7115a.eglMakeCurrent(this.f7116b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = this.f7120f.get();
                if (gLTextureView != null) {
                    gLTextureView.f7095f.mo10214a(this.f7115a, this.f7116b, this.f7117c);
                }
                this.f7117c = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public GL mo10217c() {
            GL gl = this.f7119e.getGL();
            GLTextureView gLTextureView = this.f7120f.get();
            if (gLTextureView == null) {
                return gl;
            }
            if (gLTextureView.f7096g != null) {
                gl = gLTextureView.f7096g.mo10240a(gl);
            }
            if ((gLTextureView.f7097h & 3) == 0) {
                return gl;
            }
            int i = 0;
            C2076l lVar = null;
            if ((gLTextureView.f7097h & 1) != 0) {
                i = 1;
            }
            if ((gLTextureView.f7097h & 2) != 0) {
                lVar = new C2076l();
            }
            return GLDebugHelper.wrap(gl, i, lVar);
        }

        /* renamed from: e */
        public void mo10219e() {
            Log.w("EglHelper", "destroySurface()  tid=" + Thread.currentThread().getId());
            m9009g();
        }

        /* renamed from: f */
        public void mo10220f() {
            Log.w("EglHelper", "finish() tid=" + Thread.currentThread().getId());
            if (this.f7119e != null) {
                GLTextureView gLTextureView = this.f7120f.get();
                if (gLTextureView != null) {
                    gLTextureView.f7094e.mo10212a(this.f7115a, this.f7116b, this.f7119e);
                }
                this.f7119e = null;
            }
            EGLDisplay eGLDisplay = this.f7116b;
            if (eGLDisplay != null) {
                this.f7115a.eglTerminate(eGLDisplay);
                this.f7116b = null;
            }
        }

        /* renamed from: a */
        public void mo10215a() {
            Log.w("EglHelper", "start() tid=" + Thread.currentThread().getId());
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f7115a = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f7116b = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f7115a.eglInitialize(this.f7116b, new int[2])) {
                    GLTextureView gLTextureView = this.f7120f.get();
                    if (gLTextureView == null) {
                        this.f7118d = null;
                        this.f7119e = null;
                    } else {
                        this.f7118d = gLTextureView.f7093d.mo10209a(this.f7115a, this.f7116b);
                        this.f7119e = gLTextureView.f7094e.mo10211a(this.f7115a, this.f7116b, this.f7118d);
                    }
                    EGLContext eGLContext = this.f7119e;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.f7119e = null;
                        m9005a("createContext");
                    }
                    Log.w("EglHelper", "createContext " + this.f7119e + " tid=" + Thread.currentThread().getId());
                    this.f7117c = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        /* renamed from: b */
        public boolean mo10216b() {
            Log.w("EglHelper", "createSurface()  tid=" + Thread.currentThread().getId());
            if (this.f7115a == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.f7116b == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.f7118d != null) {
                m9009g();
                GLTextureView gLTextureView = this.f7120f.get();
                if (gLTextureView != null) {
                    this.f7117c = gLTextureView.f7095f.mo10213a(this.f7115a, this.f7116b, this.f7118d, gLTextureView.getSurfaceTexture());
                } else {
                    this.f7117c = null;
                }
                EGLSurface eGLSurface = this.f7117c;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    if (this.f7115a.eglGetError() == 12299) {
                        Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                    }
                    return false;
                }
                EGL10 egl10 = this.f7115a;
                EGLDisplay eGLDisplay = this.f7116b;
                EGLSurface eGLSurface2 = this.f7117c;
                if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.f7119e)) {
                    return true;
                }
                m9007a("EGLHelper", "eglMakeCurrent", this.f7115a.eglGetError());
                return false;
            } else {
                throw new RuntimeException("mEglConfig not initialized");
            }
        }

        public C2072h(WeakReference<GLTextureView> weakReference) {
            this.f7120f = weakReference;
        }

        /* renamed from: a */
        private void m9005a(String str) {
            m9006a(str, this.f7115a.eglGetError());
        }

        /* renamed from: b */
        public static String m9008b(String str, int i) {
            return str + " failed";
        }

        /* renamed from: a */
        public static void m9006a(String str, int i) {
            String b = m9008b(str, i);
            Log.e("EglHelper", "throwEglException tid=" + Thread.currentThread().getId() + " " + b);
            throw new RuntimeException(b);
        }

        /* renamed from: a */
        public static void m9007a(String str, String str2, int i) {
            Log.w(str, m9008b(str2, i));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Log.d("GLTextureView", "onDetachedFromWindow");
        C2073i iVar = this.f7101l;
        if (iVar != null) {
            iVar.mo10231h();
        }
        this.f7102m = true;
        super.onDetachedFromWindow();
    }

    public void onResume() {
        if (!(this.f7091a == null || getSurfaceTexture() == this.f7091a || Build.VERSION.SDK_INT < 16)) {
            setSurfaceTexture(this.f7091a);
            this.f7101l.mo10227d();
        }
        this.f7101l.mo10230g();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        Log.d("GLTextureView", "onAttachedToWindow reattach =" + this.f7102m);
        if (this.f7102m && this.f7092c != null) {
            C2073i iVar = this.f7101l;
            if (iVar != null) {
                i = iVar.mo10225b();
            } else {
                i = 1;
            }
            C2073i iVar2 = new C2073i(this.f7100k);
            this.f7101l = iVar2;
            if (i != 1) {
                iVar2.mo10221a(i);
            }
            this.f7101l.start();
        }
        this.f7102m = false;
    }

    public void setDebugFlags(int i) {
        this.f7097h = i;
    }

    public void setGLWrapper(AbstractC2075k kVar) {
        this.f7096g = kVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f7099j = z;
    }

    public void setEGLConfigChooser(AbstractC2069e eVar) {
        mo10249c();
        this.f7093d = eVar;
    }

    public void setEGLContextClientVersion(int i) {
        mo10249c();
        this.f7098i = i;
    }

    public void setEGLContextFactory(AbstractC2070f fVar) {
        mo10249c();
        this.f7094e = fVar;
    }

    public void setEGLWindowSurfaceFactory(AbstractC2071g gVar) {
        mo10249c();
        this.f7095f = gVar;
    }

    public void setRenderMode(int i) {
        this.f7101l.mo10221a(i);
    }

    /* renamed from: com.bef.effectsdk.GLTextureView$c */
    private class C2067c implements AbstractC2070f {

        /* renamed from: b */
        private int f7114b;

        private C2067c() {
            this.f7114b = 12440;
        }

        @Override // com.bef.effectsdk.GLTextureView.AbstractC2070f
        /* renamed from: a */
        public EGLContext mo10211a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.f7114b, 3, 12344});
            GLTextureView.this.f7098i = 3;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.f7114b, 2, 12344});
                GLTextureView.this.f7098i = 2;
                if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                    GLTextureView.this.f7098i = 0;
                }
            }
            return eglCreateContext;
        }

        @Override // com.bef.effectsdk.GLTextureView.AbstractC2070f
        /* renamed from: a */
        public void mo10212a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
                StringBuilder sb = new StringBuilder();
                sb.append("tid=");
                sb.append(Thread.currentThread().getId());
                Log.i("DefaultContextFactory", sb.toString());
                C2072h.m9006a("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    public GLTextureView(Context context) {
        super(context);
        mo10248b();
    }

    /* renamed from: a */
    public void mo10183a(Runnable runnable) {
        this.f7101l.mo10223a(runnable);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2073i iVar = this.f7101l;
        if (iVar == null) {
            return false;
        }
        iVar.mo10228e();
        return false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (getRenderMode() != 0) {
            mo10181a();
        }
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C2077m(z));
    }

    /* renamed from: com.bef.effectsdk.GLTextureView$a */
    private abstract class AbstractC2065a implements AbstractC2069e {

        /* renamed from: a */
        protected int[] f7103a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract EGLConfig mo10210a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        /* renamed from: a */
        private int[] m8991a(int[] iArr) {
            if (GLTextureView.this.f7098i == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[(length + 2)];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                return iArr2;
            } else if (GLTextureView.this.f7098i != 3) {
                return iArr;
            } else {
                int length2 = iArr.length;
                int[] iArr3 = new int[(length2 + 2)];
                int i2 = length2 - 1;
                System.arraycopy(iArr, 0, iArr3, 0, i2);
                iArr3[i2] = 12352;
                iArr3[length2] = 64;
                iArr3[length2 + 1] = 12344;
                return iArr3;
            }
        }

        public AbstractC2065a(int[] iArr) {
            this.f7103a = m8991a(iArr);
        }

        @Override // com.bef.effectsdk.GLTextureView.AbstractC2069e
        /* renamed from: a */
        public EGLConfig mo10209a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f7103a, null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.f7103a, eGLConfigArr, i, iArr)) {
                        EGLConfig a = mo10210a(egl10, eGLDisplay, eGLConfigArr);
                        if (a != null) {
                            return a;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        mo10249c();
        if (this.f7093d == null) {
            this.f7093d = new C2077m(true);
        }
        if (this.f7094e == null) {
            this.f7094e = new C2067c();
        }
        if (this.f7095f == null) {
            this.f7095f = new C2068d();
        }
        this.f7092c = renderer;
        C2073i iVar = new C2073i(this.f7100k);
        this.f7101l = iVar;
        iVar.start();
    }

    /* renamed from: com.bef.effectsdk.GLTextureView$m */
    private class C2077m extends C2066b {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2077m(boolean r10) {
            /*
                r8 = this;
                com.bef.effectsdk.GLTextureView.this = r9
                if (r10 == 0) goto L_0x0009
                r10 = 16
                r6 = 16
                goto L_0x000b
            L_0x0009:
                r10 = 0
                r6 = 0
            L_0x000b:
                r7 = 0
                r2 = 8
                r3 = 8
                r4 = 8
                r5 = 0
                r0 = r8
                r1 = r9
                r0.<init>(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.GLTextureView.C2077m.<init>(com.bef.effectsdk.GLTextureView, boolean):void");
        }
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo10248b();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f7101l.mo10222a(i, i2);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f7091a = surfaceTexture;
        C2073i iVar = this.f7101l;
        if (iVar != null) {
            iVar.mo10227d();
        }
    }

    /* renamed from: com.bef.effectsdk.GLTextureView$b */
    private class C2066b extends AbstractC2065a {

        /* renamed from: c */
        protected int f7105c;

        /* renamed from: d */
        protected int f7106d;

        /* renamed from: e */
        protected int f7107e;

        /* renamed from: f */
        protected int f7108f;

        /* renamed from: g */
        protected int f7109g;

        /* renamed from: h */
        protected int f7110h;

        /* renamed from: j */
        private int[] f7112j = new int[1];

        @Override // com.bef.effectsdk.GLTextureView.AbstractC2065a
        /* renamed from: a */
        public EGLConfig mo10210a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int a = m8994a(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int a2 = m8994a(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (a >= this.f7109g && a2 >= this.f7110h) {
                    int a3 = m8994a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int a4 = m8994a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int a5 = m8994a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int a6 = m8994a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (a3 == this.f7105c && a4 == this.f7106d && a5 == this.f7107e && a6 == this.f7108f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        private int m8994a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f7112j)) {
                return this.f7112j[0];
            }
            return i2;
        }

        public C2066b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.f7105c = i;
            this.f7106d = i2;
            this.f7107e = i3;
            this.f7108f = i4;
            this.f7109g = i5;
            this.f7110h = i6;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C2073i iVar = this.f7101l;
        if (iVar != null) {
            iVar.mo10222a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo10182a(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new C2066b(i, i2, i3, i4, i5, i6));
    }
}
