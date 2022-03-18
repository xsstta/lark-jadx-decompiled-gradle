package com.ss.android.lark.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLAnimationView extends GLSurfaceView {

    /* renamed from: a */
    C58305b f143389a;

    /* renamed from: b */
    public int f143390b = 16777215;

    /* renamed from: c */
    private C58307d f143391c;

    /* renamed from: com.ss.android.lark.widget.GLAnimationView$c */
    public interface AbstractC58306c {
        /* renamed from: a */
        void mo197481a();
    }

    /* renamed from: com.ss.android.lark.widget.GLAnimationView$b */
    public static class C58305b {

        /* renamed from: a */
        private float f143405a;

        /* renamed from: b */
        private boolean f143406b;

        /* renamed from: c */
        private boolean f143407c;

        /* renamed from: d */
        private float f143408d;

        /* renamed from: e */
        private float f143409e;

        /* renamed from: f */
        private int f143410f;

        /* renamed from: g */
        private long f143411g;

        /* renamed from: h */
        private AbstractC58306c f143412h;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo197478a() {
            return this.f143405a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo197480b() {
            AbstractC58306c cVar = this.f143412h;
            if (cVar != null) {
                cVar.mo197481a();
                this.f143412h = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo197479a(long j) {
            if (this.f143407c) {
                mo197480b();
            } else {
                if (this.f143411g == -1) {
                    this.f143411g = j;
                }
                long j2 = j - this.f143411g;
                if (j2 == 0) {
                    return false;
                }
                int i = this.f143410f;
                if (j2 >= ((long) i)) {
                    j2 = (long) i;
                    this.f143407c = true;
                    mo197480b();
                }
                float f = (((float) j2) * 1.0f) / ((float) this.f143410f);
                if (this.f143406b) {
                    float f2 = this.f143408d;
                    this.f143405a = f2 + ((this.f143409e - f2) * f);
                }
            }
            return this.f143407c;
        }
    }

    /* renamed from: com.ss.android.lark.widget.GLAnimationView$a */
    public static class C58304a {

        /* renamed from: a */
        private static float[] f143392a = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

        /* renamed from: b */
        private static float[] f143393b = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};

        /* renamed from: c */
        private final String f143394c = "attribute vec4 vPosition;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = vPosition;textureCoordinate = inputTextureCoordinate;}";

        /* renamed from: d */
        private final String f143395d = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";

        /* renamed from: e */
        private final int f143396e;

        /* renamed from: f */
        private final int f143397f = 8;

        /* renamed from: g */
        private FloatBuffer f143398g;

        /* renamed from: h */
        private FloatBuffer f143399h;

        /* renamed from: i */
        private ShortBuffer f143400i;

        /* renamed from: j */
        private int f143401j;

        /* renamed from: k */
        private int f143402k;

        /* renamed from: l */
        private short[] f143403l = {0, 1, 2, 0, 2, 3};

        /* renamed from: m */
        private int f143404m;

        /* renamed from: a */
        public void mo197477a() {
            GLES20.glUseProgram(this.f143396e);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.f143404m);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f143396e, "vPosition");
            this.f143401j = glGetAttribLocation;
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            this.f143398g.clear();
            this.f143398g.put(f143392a);
            this.f143398g.position(0);
            GLES20.glVertexAttribPointer(this.f143401j, 2, 5126, false, 8, (Buffer) this.f143398g);
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f143396e, "inputTextureCoordinate");
            this.f143402k = glGetAttribLocation2;
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            GLES20.glVertexAttribPointer(this.f143402k, 2, 5126, false, 8, (Buffer) this.f143399h);
            GLES20.glDrawElements(4, this.f143403l.length, 5123, this.f143400i);
            GLES20.glDisableVertexAttribArray(this.f143401j);
            GLES20.glDisableVertexAttribArray(this.f143402k);
        }

        public C58304a(int i) {
            this.f143404m = i;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f143392a.length * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
            this.f143398g = asFloatBuffer;
            asFloatBuffer.put(f143392a);
            this.f143398g.position(0);
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f143403l.length * 2);
            allocateDirect2.order(ByteOrder.nativeOrder());
            ShortBuffer asShortBuffer = allocateDirect2.asShortBuffer();
            this.f143400i = asShortBuffer;
            asShortBuffer.put(this.f143403l);
            this.f143400i.position(0);
            ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(f143393b.length * 4);
            allocateDirect3.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer2 = allocateDirect3.asFloatBuffer();
            this.f143399h = asFloatBuffer2;
            asFloatBuffer2.put(f143393b);
            this.f143399h.position(0);
            int a = m226076a(35633, "attribute vec4 vPosition;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = vPosition;textureCoordinate = inputTextureCoordinate;}");
            int a2 = m226076a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}");
            int glCreateProgram = GLES20.glCreateProgram();
            this.f143396e = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, a);
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glLinkProgram(glCreateProgram);
        }

        /* renamed from: a */
        private int m226076a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            return glCreateShader;
        }
    }

    public void setColor(int i) {
        this.f143390b = i;
    }

    public GLAnimationView(Context context) {
        super(context);
        m226075a(context);
    }

    /* renamed from: a */
    private void m226075a(Context context) {
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-2);
        setZOrderOnTop(true);
        C58307d dVar = new C58307d(getContext(), this);
        this.f143391c = dVar;
        setRenderer(dVar);
        setRenderMode(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.GLAnimationView$d */
    public class C58307d implements GLSurfaceView.Renderer {

        /* renamed from: a */
        Context f143413a;

        /* renamed from: b */
        int f143414b;

        /* renamed from: c */
        C58304a f143415c;

        /* renamed from: e */
        private Surface f143417e;

        /* renamed from: f */
        private int f143418f;

        /* renamed from: g */
        private int f143419g;

        /* renamed from: h */
        private GLAnimationView f143420h;

        /* renamed from: i */
        private SurfaceTexture f143421i;

        /* renamed from: j */
        private Paint f143422j;

        /* renamed from: k */
        private String f143423k;

        /* renamed from: l */
        private float f143424l;

        public void onDrawFrame(GL10 gl10) {
            int i;
            Canvas lockCanvas = this.f143417e.lockCanvas(null);
            C58305b bVar = this.f143420h.f143389a;
            if (bVar != null) {
                bVar.mo197479a(System.currentTimeMillis());
                i = (int) bVar.mo197478a();
            } else {
                i = 255;
            }
            lockCanvas.drawARGB(i, Color.red(GLAnimationView.this.f143390b), Color.green(GLAnimationView.this.f143390b), Color.blue(GLAnimationView.this.f143390b));
            this.f143422j.setAlpha(i);
            lockCanvas.drawText(this.f143423k, (((float) this.f143418f) - this.f143424l) / 2.0f, (float) (this.f143419g / 2), this.f143422j);
            this.f143417e.unlockCanvasAndPost(lockCanvas);
            this.f143417e.release();
            this.f143417e = null;
            this.f143417e = new Surface(this.f143421i);
            this.f143421i.updateTexImage();
            GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            GLES20.glClear(16640);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.f143415c.mo197477a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo197482a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i3 = iArr[0];
            this.f143414b = i3;
            if (i3 > 0) {
                GLES20.glBindTexture(36197, i3);
                GLES20.glTexImage2D(3553, 0, 6407, i, i2, 0, 6407, 5121, null);
                GLES20.glTexParameteri(36197, 10241, 9728);
                GLES20.glTexParameteri(36197, 10240, 9728);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
            }
            return this.f143414b;
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            this.f143417e = null;
            this.f143421i = null;
            this.f143418f = this.f143420h.getWidth();
            int height = this.f143420h.getHeight();
            this.f143419g = height;
            int a = mo197482a(this.f143418f, height);
            this.f143414b = a;
            if (a > 0) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f143414b);
                this.f143421i = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f143418f, this.f143419g);
                this.f143417e = new Surface(this.f143421i);
                this.f143415c = new C58304a(this.f143414b);
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            gl10.glViewport(0, 0, i, i2);
        }

        public C58307d(Context context, GLAnimationView gLAnimationView) {
            this.f143413a = context;
            this.f143420h = gLAnimationView;
            Paint paint = new Paint();
            this.f143422j = paint;
            paint.setTextSize((float) GLAnimationView.m226074a(context, 15.0f));
            this.f143422j.setAntiAlias(true);
            this.f143422j.setColor(ContextCompat.getColor(context, R.color.text_placeholder));
            String string = context.getResources().getString(R.string.Lark_Legacy_LoadingTip);
            this.f143423k = string;
            this.f143424l = this.f143422j.measureText(string);
        }
    }

    public GLAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226075a(context);
    }

    /* renamed from: a */
    public static int m226074a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
