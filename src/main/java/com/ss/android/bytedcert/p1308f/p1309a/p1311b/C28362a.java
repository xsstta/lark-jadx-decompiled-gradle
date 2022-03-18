package com.ss.android.bytedcert.p1308f.p1309a.p1311b;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import com.bytedance.common.utility.Logger;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1308f.p1309a.p1310a.C28361a;
import com.ss.android.bytedcert.p1308f.p1309a.p1312c.C28371a;
import com.ss.android.bytedcert.p1308f.p1309a.p1312c.C28372b;
import com.ss.android.bytedcert.p1308f.p1309a.p1312c.C28373c;
import com.ss.android.bytedcert.p1308f.p1309a.p1313d.AbstractC28378b;
import com.ss.android.bytedcert.p1308f.p1309a.p1313d.C28374a;
import com.ss.android.bytedcert.utils.Accelerometer;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.bytedcert.f.a.b.a */
public class C28362a implements GLSurfaceView.Renderer {

    /* renamed from: m */
    public static boolean f71253m;

    /* renamed from: A */
    private AbstractC28378b f71254A;

    /* renamed from: B */
    private byte[] f71255B;

    /* renamed from: C */
    private int f71256C;

    /* renamed from: D */
    private int f71257D;

    /* renamed from: E */
    private int f71258E = 100;

    /* renamed from: F */
    private String f71259F = "";

    /* renamed from: G */
    private float[] f71260G = new float[16];

    /* renamed from: H */
    private String f71261H = "";

    /* renamed from: I */
    private SurfaceTexture.OnFrameAvailableListener f71262I = new SurfaceTexture.OnFrameAvailableListener() {
        /* class com.ss.android.bytedcert.p1308f.p1309a.p1311b.C28362a.C283631 */

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (!C28362a.this.f71273k) {
                C28362a.this.f71266d.requestRender();
            }
        }
    };

    /* renamed from: a */
    protected int f71263a = -1;

    /* renamed from: b */
    public int f71264b;

    /* renamed from: c */
    public int f71265c;

    /* renamed from: d */
    public GLSurfaceView f71266d;

    /* renamed from: e */
    public AbstractC28367a f71267e;

    /* renamed from: f */
    public int f71268f;

    /* renamed from: g */
    public int f71269g;

    /* renamed from: h */
    public C28361a f71270h;

    /* renamed from: i */
    public C28369b f71271i;

    /* renamed from: j */
    public ByteBuffer f71272j;

    /* renamed from: k */
    public boolean f71273k;

    /* renamed from: l */
    public int f71274l;

    /* renamed from: n */
    private BytedCertManager f71275n;

    /* renamed from: o */
    private String f71276o = "CameraDisplay";

    /* renamed from: p */
    private Context f71277p;

    /* renamed from: q */
    private SurfaceTexture f71278q;

    /* renamed from: r */
    private int f71279r = 1;

    /* renamed from: s */
    private int[] f71280s;

    /* renamed from: t */
    private int f71281t;

    /* renamed from: u */
    private ArrayList<String> f71282u;

    /* renamed from: v */
    private AbstractC28368b f71283v;

    /* renamed from: w */
    private long f71284w;

    /* renamed from: x */
    private FloatBuffer f71285x;

    /* renamed from: y */
    private boolean f71286y;

    /* renamed from: z */
    private int f71287z = -1;

    /* renamed from: com.ss.android.bytedcert.f.a.b.a$a */
    public interface AbstractC28367a {
        /* renamed from: a */
        void mo100859a(int i, int i2);
    }

    /* renamed from: com.ss.android.bytedcert.f.a.b.a$b */
    public interface AbstractC28368b {
        /* renamed from: a */
        void mo101064a(int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo101055g() {
        m104040j();
        mo101056h();
    }

    /* renamed from: i */
    private int m104039i() {
        int c = Accelerometer.m104197c();
        int i = c - 1;
        if (i < 0) {
            return c ^ 3;
        }
        return i;
    }

    /* renamed from: a */
    public int mo101046a() {
        AbstractC28378b bVar = this.f71254A;
        if (bVar == null) {
            return 0;
        }
        bVar.mo101071a();
        this.f71254A = null;
        return 0;
    }

    /* renamed from: b */
    public int mo101050b() {
        AbstractC28378b bVar = this.f71254A;
        if (bVar != null) {
            return bVar.mo101078b();
        }
        return -1;
    }

    /* renamed from: e */
    public void mo101053e() {
        GLSurfaceView gLSurfaceView = this.f71266d;
        if (gLSurfaceView != null) {
            gLSurfaceView.queueEvent(new Runnable() {
                /* class com.ss.android.bytedcert.p1308f.p1309a.p1311b.C28362a.RunnableC283653 */

                public void run() {
                    C28362a.this.f71272j = null;
                    C28362a.this.mo101055g();
                    C28362a.this.f71271i.mo101067a();
                }
            });
        }
    }

    /* renamed from: f */
    public void mo101054f() {
        this.f71286y = true;
        this.f71270h.mo101041b();
    }

    /* renamed from: h */
    public void mo101056h() {
        int[] iArr = this.f71280s;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f71280s = null;
        }
    }

    /* renamed from: j */
    private void m104040j() {
        int i = this.f71263a;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.f71263a = -1;
    }

    /* renamed from: c */
    public void mo101051c() {
        String str;
        if (this.f71263a == -1) {
            this.f71263a = C28372b.m104065a();
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f71263a);
            this.f71278q = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this.f71262I);
        }
        int size = this.f71282u.size();
        int i = this.f71281t;
        if (size > i) {
            str = this.f71282u.get(i);
        } else {
            str = "640x480";
        }
        int indexOf = str.indexOf(SmEvents.EVENT_NW);
        this.f71265c = Integer.parseInt(str.substring(0, indexOf));
        int parseInt = Integer.parseInt(str.substring(indexOf + 1));
        this.f71264b = parseInt;
        this.f71270h.mo101038a(this.f71265c, parseInt);
        this.f71271i.mo101070a(this.f71270h.mo101043d(), this.f71270h.mo101044e());
        this.f71270h.mo101039a(this.f71278q, (Camera.PreviewCallback) null);
    }

    /* renamed from: d */
    public void mo101052d() {
        this.f71286y = false;
        this.f71270h.mo101042c();
        if (this.f71270h.mo101036a() == null) {
            if (this.f71270h.mo101045f() == 1) {
                this.f71279r = 0;
            }
            this.f71270h.mo101040a(this.f71279r);
            ArrayList<String> a = this.f71270h.mo101037a(new String[]{"1280x720", "640x480"});
            this.f71282u = a;
            if (a.contains("640x480")) {
                this.f71281t = this.f71282u.indexOf("640x480");
            }
        }
        if (this.f71275n.getCameraStartType() == 1) {
            this.f71266d.queueEvent(new Runnable() {
                /* class com.ss.android.bytedcert.p1308f.p1309a.p1311b.C28362a.RunnableC283642 */

                public void run() {
                    C28362a.this.mo101051c();
                }
            });
            this.f71266d.forceLayout();
            this.f71266d.requestRender();
            return;
        }
        mo101049a(this.f71281t);
    }

    /* renamed from: a */
    public void mo101049a(int i) {
        if (this.f71270h.mo101036a() != null && !this.f71273k && !this.f71286y) {
            this.f71281t = i;
            this.f71273k = true;
            this.f71270h.mo101042c();
            this.f71266d.queueEvent(new Runnable() {
                /* class com.ss.android.bytedcert.p1308f.p1309a.p1311b.C28362a.RunnableC283664 */

                public void run() {
                    if (C28362a.this.f71272j != null) {
                        C28362a.this.f71272j.clear();
                    }
                    C28362a.this.f71272j = null;
                    C28362a.this.mo101056h();
                    C28362a.this.mo101051c();
                    C28362a.this.f71271i.mo101068a(C28362a.this.f71264b, C28362a.this.f71265c);
                    C28362a.this.f71271i.mo101069a(C28362a.this.f71268f, C28362a.this.f71269g, C28362a.this.f71264b, C28362a.this.f71265c);
                    if (C28362a.this.f71267e != null) {
                        C28362a.this.f71267e.mo100859a(C28362a.this.f71265c, C28362a.this.f71264b);
                    }
                    C28362a.this.f71273k = false;
                    C28362a.this.f71266d.requestRender();
                }
            });
        }
    }

    public void onDrawFrame(GL10 gl10) {
        boolean gLPause = BytedCertManager.getGLPause();
        this.f71286y = gLPause;
        if (!this.f71273k && !gLPause && this.f71270h.mo101036a() != null) {
            if (this.f71272j == null) {
                this.f71272j = ByteBuffer.allocate(this.f71265c * this.f71264b * 4);
            }
            if (this.f71280s == null) {
                int[] iArr = new int[1];
                this.f71280s = iArr;
                C28371a.m104063a(this.f71264b, this.f71265c, iArr, 3553);
            }
            this.f71278q.updateTexImage();
            long currentTimeMillis = System.currentTimeMillis() - this.f71284w;
            this.f71284w = System.currentTimeMillis();
            AbstractC28368b bVar = this.f71283v;
            if (bVar != null) {
                bVar.mo101064a((int) currentTimeMillis);
            }
            GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            GLES20.glClear(16640);
            this.f71272j.rewind();
            int a = this.f71271i.mo101066a(this.f71263a, this.f71272j, null);
            if (!(this.f71255B != null && this.f71257D == this.f71265c && this.f71256C == this.f71264b)) {
                int i = this.f71264b;
                this.f71256C = i;
                int i2 = this.f71265c;
                this.f71257D = i2;
                this.f71255B = new byte[(i * i2 * 4)];
            }
            int i3 = m104039i();
            AbstractC28378b bVar2 = this.f71254A;
            if (bVar2 != null) {
                bVar2.mo101075a(this.f71272j.array(), i3, this.f71255B, this.f71256C, this.f71257D);
            }
            GLES20.glViewport(0, 0, this.f71268f, this.f71269g);
            this.f71271i.mo101065a(a);
        }
    }

    /* renamed from: a */
    private void m104038a(int i, int i2) {
        this.f71269g = i2;
        this.f71268f = i;
        GLES20.glViewport(0, 0, i, i2);
        this.f71271i.mo101069a(this.f71268f, this.f71269g, this.f71264b, this.f71265c);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (!this.f71286y) {
            GLES20.glEnable(3024);
            GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            GLES20.glEnable(2929);
        }
    }

    /* renamed from: a */
    public int mo101048a(int[] iArr, float[] fArr) {
        if (this.f71254A == null) {
            return -1;
        }
        Logger.m15167d("debug1  mCameraDisplay", "SetConfig");
        return this.f71254A.mo101076a(iArr, fArr);
    }

    /* renamed from: a */
    public int mo101047a(int i, int[] iArr, int i2) {
        AbstractC28378b bVar = this.f71254A;
        if (bVar == null) {
            return -1;
        }
        int a = bVar.mo101072a(i, iArr, i2);
        Logger.m15167d("debug1  mCameraDisplay", "SetParam");
        return a;
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Logger.m15170e("onSurfaceChanged", "CameraDisplay w:" + i + " h:" + i2);
        if (i > i2) {
            Logger.m15170e("onSurfaceChanged", "w>h, quit");
        }
        Logger.m15170e("onSurfaceChanged", "h>w, draw on canvas");
        if (!this.f71286y) {
            m104038a(i, i2);
            this.f71271i.mo101068a(this.f71264b, this.f71265c);
            this.f71284w = System.currentTimeMillis();
        }
    }

    public C28362a(Context context, AbstractC28367a aVar, GLSurfaceView gLSurfaceView, Bundle bundle) {
        this.f71270h = new C28361a(context);
        this.f71266d = gLSurfaceView;
        this.f71267e = aVar;
        this.f71277p = context;
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(this);
        gLSurfaceView.setRenderMode(0);
        this.f71275n = BytedCertManager.getInstance();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(C28373c.f71305a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f71285x = asFloatBuffer;
        asFloatBuffer.put(C28373c.f71305a).position(0);
        this.f71271i = new C28369b();
        this.f71282u = this.f71270h.mo101037a(new String[]{"1280x720", "640x480"});
        C28374a aVar2 = new C28374a();
        this.f71254A = aVar2;
        this.f71274l = aVar2.mo101073a(this.f71277p, bundle);
    }
}
