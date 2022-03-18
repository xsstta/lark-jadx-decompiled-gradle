package com.ss.android.lark.cameraview.p1589c;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.lark.cameraview.C32743b;
import com.ss.android.lark.cameraview.C32771d;
import com.ss.android.lark.log.Log;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.cameraview.c.d */
public class C32767d implements AbstractC32770e {

    /* renamed from: a */
    public C32766c f84093a;

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: b */
    public void mo120739b() {
        Log.m165388i("preview state,no confirm event");
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120733a() {
        C32771d.m125799a().mo120694a(new C32743b.AbstractC32751e() {
            /* class com.ss.android.lark.cameraview.p1589c.C32767d.C327681 */

            @Override // com.ss.android.lark.cameraview.C32743b.AbstractC32751e
            /* renamed from: a */
            public void mo120714a(Bitmap bitmap, boolean z) {
                C32767d.this.f84093a.mo120743c().mo120643a(bitmap, z);
                C32767d.this.f84093a.mo120742a(C32767d.this.f84093a.mo120745e());
                Log.m165388i("capture");
            }
        });
    }

    C32767d(C32766c cVar) {
        this.f84093a = cVar;
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120738a(SurfaceHolder surfaceHolder, float f) {
        C32771d.m125799a().mo120700b(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: c */
    public void mo120741c(SurfaceHolder surfaceHolder, float f) {
        Log.m165388i("preview state,no cancel event");
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: b */
    public void mo120740b(SurfaceHolder surfaceHolder, float f) {
        C32771d.m125799a().mo120692a(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120735a(float f, int i) {
        Log.m165379d("PreviewState", "zoom");
        C32771d.m125799a().mo120684a(f, i);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120736a(Context context, Surface surface, float f) {
        C32771d.m125799a().mo120688a(context, surface, f, null);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120737a(Context context, final boolean z, long j) {
        C32771d.m125799a().mo120691a(context, z, new C32743b.AbstractC32750d() {
            /* class com.ss.android.lark.cameraview.p1589c.C32767d.C327692 */

            @Override // com.ss.android.lark.cameraview.C32743b.AbstractC32750d
            /* renamed from: a */
            public void mo120713a(String str, Bitmap bitmap) {
                if (z) {
                    C32767d.this.f84093a.mo120743c().mo120641a(3);
                    return;
                }
                C32767d.this.f84093a.mo120743c().mo120642a(bitmap, str);
                C32767d.this.f84093a.mo120742a(C32767d.this.f84093a.mo120746f());
            }
        });
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120734a(float f, float f2, int i, int i2, C32743b.AbstractC32749c cVar) {
        Log.m165388i("preview state foucs");
        if (this.f84093a.mo120743c().mo120646b(f, f2)) {
            C32771d.m125799a().mo120687a(this.f84093a.mo120744d(), f, f2, i, i2, cVar);
        }
    }
}
