package com.ss.android.ttvecamera.p3038g;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.view.Surface;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60362g;
import com.ss.android.ttvecamera.C60427s;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3038g.AbstractC60370b;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.c */
public class C60375c {

    /* renamed from: a */
    public static final String f150914a = "c";

    /* renamed from: b */
    private AbstractC60370b f150915b;

    /* renamed from: b */
    public AbstractC60370b mo206800b() {
        return this.f150915b;
    }

    /* renamed from: c */
    public int mo206801c() {
        AbstractC60370b bVar = this.f150915b;
        if (bVar != null) {
            return bVar.mo206783c();
        }
        return 0;
    }

    /* renamed from: d */
    public Surface mo206802d() {
        AbstractC60370b bVar = this.f150915b;
        if (bVar != null) {
            return bVar.mo206779a();
        }
        return null;
    }

    /* renamed from: e */
    public Surface[] mo206803e() {
        AbstractC60370b bVar = this.f150915b;
        if (bVar != null) {
            return bVar.mo206793j();
        }
        return null;
    }

    /* renamed from: f */
    public SurfaceTexture mo206804f() {
        AbstractC60370b bVar = this.f150915b;
        if (bVar != null) {
            return bVar.mo206782b();
        }
        return null;
    }

    /* renamed from: g */
    public TEFrameSizei mo206805g() {
        if (this.f150915b.mo206789f()) {
            return this.f150915b.mo206790g();
        }
        return null;
    }

    /* renamed from: h */
    public TEFrameSizei mo206806h() {
        if (!this.f150915b.mo206789f()) {
            return this.f150915b.f150907d;
        }
        return new TEFrameSizei(1080, 1920);
    }

    /* renamed from: a */
    public void mo206798a() {
        AbstractC60370b bVar = this.f150915b;
        if (bVar != null) {
            bVar.mo206791h();
            this.f150915b = null;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.g.c$a */
    public static class C60376a {

        /* renamed from: a */
        public boolean f150916a = true;

        /* renamed from: b */
        public TEFrameSizei f150917b;

        /* renamed from: c */
        public AbstractC60370b.AbstractC60373a f150918c;

        /* renamed from: d */
        public SurfaceTexture f150919d;

        /* renamed from: e */
        public int f150920e;

        /* renamed from: f */
        public int f150921f;

        /* renamed from: g */
        public Surface f150922g;

        /* renamed from: h */
        public TECameraFrame.ETEPixelFormat f150923h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count;

        /* renamed from: a */
        public void mo206807a(C60376a aVar) {
            this.f150916a = aVar.f150916a;
            this.f150917b = aVar.f150917b;
            this.f150918c = aVar.f150918c;
            this.f150919d = aVar.f150919d;
            this.f150920e = aVar.f150920e;
            this.f150921f = aVar.f150921f;
        }

        /* renamed from: b */
        public boolean mo206808b(C60376a aVar) {
            if (aVar != null && this.f150916a == aVar.f150916a && this.f150917b.f150716a == aVar.f150917b.f150716a && this.f150917b.f150717b == aVar.f150917b.f150717b && this.f150918c == aVar.f150918c && this.f150919d == aVar.f150919d && this.f150920e == aVar.f150920e && this.f150921f == aVar.f150921f) {
                return true;
            }
            return false;
        }

        public C60376a(C60376a aVar) {
            this.f150916a = aVar.f150916a;
            this.f150917b = aVar.f150917b;
            this.f150918c = aVar.f150918c;
            this.f150919d = aVar.f150919d;
            this.f150920e = aVar.f150920e;
            this.f150921f = aVar.f150921f;
        }

        public C60376a(TEFrameSizei tEFrameSizei, AbstractC60370b.AbstractC60373a aVar, boolean z, SurfaceTexture surfaceTexture, int i) {
            this.f150917b = tEFrameSizei;
            this.f150918c = aVar;
            this.f150919d = surfaceTexture;
            this.f150920e = i;
            this.f150916a = z;
            this.f150923h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        }

        public C60376a(TEFrameSizei tEFrameSizei, AbstractC60370b.AbstractC60373a aVar, boolean z, SurfaceTexture surfaceTexture, int i, Surface surface) {
            this.f150917b = tEFrameSizei;
            this.f150918c = aVar;
            this.f150919d = surfaceTexture;
            this.f150920e = i;
            this.f150916a = z;
            this.f150923h = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder;
            this.f150922g = surface;
        }

        public C60376a(TEFrameSizei tEFrameSizei, AbstractC60370b.AbstractC60373a aVar, boolean z, SurfaceTexture surfaceTexture, TECameraFrame.ETEPixelFormat eTEPixelFormat, int i) {
            this.f150917b = tEFrameSizei;
            this.f150918c = aVar;
            this.f150919d = surfaceTexture;
            this.f150916a = z;
            this.f150923h = eTEPixelFormat;
            this.f150921f = i;
        }
    }

    /* renamed from: a */
    public int mo206796a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        AbstractC60370b bVar = this.f150915b;
        if (bVar == null || bVar == null) {
            return -112;
        }
        return bVar.mo206787a(streamConfigurationMap, tEFrameSizei);
    }

    /* renamed from: a */
    public int mo206797a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        AbstractC60370b bVar = this.f150915b;
        if (bVar != null) {
            return bVar.mo206778a(list, tEFrameSizei);
        }
        return -112;
    }

    /* renamed from: a */
    public void mo206799a(C60376a aVar, AbstractC60396i iVar) {
        AbstractC60370b bVar = this.f150915b;
        if (bVar != null) {
            bVar.mo206791h();
        }
        boolean z = false;
        try {
            if (iVar.getClass() == Class.forName("com.ss.android.ttvecamera.TEVendorCamera")) {
                z = true;
            }
        } catch (ClassNotFoundException e) {
            String str = f150914a;
            C60427s.m234839a(str, "createProvider get TEVendorCamera class failed " + e.getMessage());
        }
        if (aVar.f150923h == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder) {
            this.f150915b = new C60381f(aVar, iVar);
        } else if (aVar.f150923h == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            this.f150915b = new C60383g(aVar, iVar);
        } else if ((!(iVar instanceof C60362g) && !z) || Build.VERSION.SDK_INT < 19) {
            this.f150915b = new C60368a(aVar, iVar);
        } else if (aVar.f150921f > 0) {
            this.f150915b = new C60379e(aVar, iVar);
        } else {
            this.f150915b = new C60377d(aVar, iVar);
        }
        iVar.mo206851a(this);
    }
}
