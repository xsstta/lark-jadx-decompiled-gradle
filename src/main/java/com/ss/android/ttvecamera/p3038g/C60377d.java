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

/* renamed from: com.ss.android.ttvecamera.g.d */
public class C60377d extends AbstractC60370b {

    /* renamed from: a */
    ImageReader f150924a;

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: b */
    public SurfaceTexture mo206782b() {
        return null;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: c */
    public int mo206783c() {
        return 2;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: e */
    public void mo206785e() {
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: a */
    public Surface mo206779a() {
        ImageReader imageReader = this.f150924a;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // com.ss.android.ttvecamera.p3038g.AbstractC60370b
    /* renamed from: h */
    public void mo206791h() {
        super.mo206791h();
        ImageReader imageReader = this.f150924a;
        if (imageReader != null) {
            imageReader.close();
            this.f150924a = null;
        }
    }

    public C60377d(C60375c.C60376a aVar, AbstractC60396i iVar) {
        super(aVar, iVar);
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
        ImageReader imageReader = this.f150924a;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader newInstance = ImageReader.newInstance(this.f150907d.f150716a, this.f150907d.f150717b, TECameraFrame.m234188a(this.f150906c), 1);
        this.f150924a = newInstance;
        newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            /* class com.ss.android.ttvecamera.p3038g.C60377d.C603781 */

            public void onImageAvailable(ImageReader imageReader) {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    try {
                        TECameraFrame tECameraFrame = new TECameraFrame(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                        tECameraFrame.mo206368a(new C60435v(acquireLatestImage.getPlanes()), C60377d.this.f150908e.mo206839M(), C60377d.this.f150906c, C60377d.this.f150908e.mo206840N());
                        C60377d.this.mo206788a(tECameraFrame);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } catch (Throwable th) {
                        acquireLatestImage.close();
                        throw th;
                    }
                    acquireLatestImage.close();
                }
            }
        }, this.f150908e.mo206841O());
        return 0;
    }
}
