package com.ss.android.medialib;

import android.media.Image;
import com.ss.android.medialib.camera.C59393c;
import com.ss.android.medialib.camera.ImageFrame;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.e */
public class C59395e {

    /* renamed from: a */
    ImageFrame f147458a;

    public C59395e(ImageFrame imageFrame) {
        this.f147458a = imageFrame;
    }

    /* renamed from: a */
    public boolean mo202250a(int[][] iArr, ByteBuffer[] byteBufferArr) {
        Image.Plane[] a;
        C59393c plane = this.f147458a.getPlane();
        if (plane == null || (a = plane.mo202247a()) == null) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            byteBufferArr[i] = a[i].getBuffer();
            iArr[i] = new int[]{byteBufferArr[i].remaining(), a[i].getRowStride(), a[i].getPixelStride()};
        }
        return true;
    }
}
