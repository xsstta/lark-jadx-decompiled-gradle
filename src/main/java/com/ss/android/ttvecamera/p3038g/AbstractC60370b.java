package com.ss.android.ttvecamera.p3038g;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.b */
public abstract class AbstractC60370b {

    /* renamed from: a */
    private AbstractC60373a f150904a = new AbstractC60373a() {
        /* class com.ss.android.ttvecamera.p3038g.AbstractC60370b.C603711 */

        @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
        /* renamed from: a */
        public void mo206794a(SurfaceTexture surfaceTexture) {
        }

        @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
        /* renamed from: a */
        public void mo206795a(TECameraFrame tECameraFrame) {
        }
    };

    /* renamed from: b */
    AbstractC60373a f150905b;

    /* renamed from: c */
    TECameraFrame.ETEPixelFormat f150906c;

    /* renamed from: d */
    TEFrameSizei f150907d = new TEFrameSizei();

    /* renamed from: e */
    AbstractC60396i f150908e;

    /* renamed from: f */
    boolean f150909f = true;

    /* renamed from: g */
    public int f150910g = 1;

    /* renamed from: h */
    private AbstractC60373a f150911h = new AbstractC60374b() {
        /* class com.ss.android.ttvecamera.p3038g.AbstractC60370b.C603722 */

        @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
        /* renamed from: a */
        public void mo206794a(SurfaceTexture surfaceTexture) {
        }

        @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b.AbstractC60373a
        /* renamed from: a */
        public void mo206795a(TECameraFrame tECameraFrame) {
        }
    };

    /* renamed from: com.ss.android.ttvecamera.g.b$a */
    public interface AbstractC60373a {
        /* renamed from: a */
        void mo206794a(SurfaceTexture surfaceTexture);

        /* renamed from: a */
        void mo206795a(TECameraFrame tECameraFrame);
    }

    /* renamed from: com.ss.android.ttvecamera.g.b$b */
    public interface AbstractC60374b extends AbstractC60373a {
    }

    /* renamed from: a */
    public int mo206787a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    /* renamed from: a */
    public abstract int mo206778a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    /* renamed from: a */
    public abstract Surface mo206779a();

    /* renamed from: b */
    public abstract SurfaceTexture mo206782b();

    /* renamed from: c */
    public abstract int mo206783c();

    /* renamed from: e */
    public abstract void mo206785e();

    /* renamed from: i */
    public Surface mo206792i() {
        return null;
    }

    /* renamed from: j */
    public Surface[] mo206793j() {
        return null;
    }

    /* renamed from: f */
    public boolean mo206789f() {
        return this.f150909f;
    }

    /* renamed from: g */
    public TEFrameSizei mo206790g() {
        return this.f150907d;
    }

    /* renamed from: h */
    public void mo206791h() {
        if (this.f150905b instanceof AbstractC60374b) {
            this.f150905b = this.f150911h;
        } else {
            this.f150905b = this.f150904a;
        }
    }

    /* renamed from: a */
    public static List<TEFrameSizei> m234551a(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo206788a(TECameraFrame tECameraFrame) {
        AbstractC60373a aVar = this.f150905b;
        if (aVar != null) {
            aVar.mo206795a(tECameraFrame);
        }
    }

    public AbstractC60370b(C60375c.C60376a aVar, AbstractC60396i iVar) {
        this.f150906c = aVar.f150923h;
        this.f150905b = aVar.f150918c;
        this.f150907d = aVar.f150917b;
        this.f150908e = iVar;
        this.f150909f = aVar.f150916a;
        this.f150910g = aVar.f150921f;
    }
}
