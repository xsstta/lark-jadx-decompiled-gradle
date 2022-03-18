package com.ss.android.ttvecamera.p3038g;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import com.ss.android.ttvecamera.AbstractC60396i;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.C60435v;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.e */
public class C60379e extends AbstractC60370b {

    /* renamed from: a */
    SurfaceTexture f150926a;

    /* renamed from: h */
    float[] f150927h = new float[16];

    /* renamed from: i */
    int f150928i;

    /* renamed from: j */
    ImageReader[] f150929j;

    /* renamed from: k */
    Surface[] f150930k;

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: c */
    public int mo206783c() {
        return 8;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: e */
    public void mo206785e() {
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: b */
    public SurfaceTexture mo206782b() {
        return this.f150926a;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: j */
    public Surface[] mo206793j() {
        return this.f150930k;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public Surface mo206779a() {
        Surface[] surfaceArr = this.f150930k;
        if (surfaceArr != null) {
            return surfaceArr[0];
        }
        return null;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: h */
    public void mo206791h() {
        Surface[] surfaceArr;
        super.mo206791h();
        ImageReader[] imageReaderArr = this.f150929j;
        if (imageReaderArr != null) {
            for (ImageReader imageReader : imageReaderArr) {
                imageReader.close();
            }
            this.f150929j = null;
        }
        if (!(this.f150926a == null || (surfaceArr = this.f150930k) == null || surfaceArr[0] == null)) {
            surfaceArr[0].release();
        }
    }

    public C60379e(C60375c.C60376a aVar, AbstractC60396i iVar) {
        super(aVar, iVar);
        int i;
        this.f150926a = aVar.f150919d;
        this.f150928i = aVar.f150920e;
        this.f150929j = new ImageReader[this.f150910g];
        if (this.f150926a != null) {
            i = this.f150910g + 1;
        } else {
            i = this.f150910g;
        }
        Surface[] surfaceArr = new Surface[i];
        this.f150930k = surfaceArr;
        if (this.f150926a != null) {
            surfaceArr[0] = new Surface(this.f150926a);
        }
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public int mo206787a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        int a = TECameraFrame.m234188a(this.f150906c);
        int length = outputFormats.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = outputFormats[i2];
            if (i3 == a) {
                i = i3;
                break;
            }
            i2++;
        }
        if (i == 0) {
            i = 35;
            this.f150906c = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420;
        }
        return mo206778a(m234551a(streamConfigurationMap.getOutputSizes(i)), tEFrameSizei);
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public int mo206778a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f150907d = C60410n.m234778a(list, this.f150907d);
        }
        SurfaceTexture surfaceTexture = this.f150926a;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f150907d.f150716a, this.f150907d.f150717b);
        }
        for (int i = 0; i < this.f150910g; i++) {
            this.f150929j[i] = ImageReader.newInstance(this.f150907d.f150716a, this.f150907d.f150717b, TECameraFrame.m234188a(this.f150906c), 1);
            this.f150929j[i].setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
                /* class com.ss.android.ttvecamera.p3038g.C60379e.C603801 */

                public void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        TECameraFrame tECameraFrame = new TECameraFrame(acquireNextImage.getWidth(), acquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
                        tECameraFrame.mo206368a(new C60435v(acquireNextImage.getPlanes()), C60379e.this.f150908e.mo206839M(), C60379e.this.f150906c, C60379e.this.f150908e.mo206840N());
                        C60379e.this.mo206788a(tECameraFrame);
                        acquireNextImage.close();
                    }
                }
            }, this.f150908e.mo206841O());
            if (this.f150926a != null) {
                this.f150930k[i + 1] = this.f150929j[i].getSurface();
            } else {
                this.f150930k[i] = this.f150929j[i].getSurface();
            }
        }
        return 0;
    }
}
