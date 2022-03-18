package com.ss.android.photoeditor.crop_rotate;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.crop_rotate.C59703d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.photoeditor.crop_rotate.b */
public class C59685b {

    /* renamed from: a */
    public boolean f148149a = true;

    /* renamed from: b */
    private Bitmap f148150b;

    /* renamed from: c */
    private C59703d f148151c;

    /* renamed from: d */
    private Matrix f148152d = new Matrix();

    /* renamed from: e */
    private C59687a f148153e = new C59687a();

    /* renamed from: a */
    public Bitmap mo203252a() {
        return this.f148150b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.crop_rotate.b$a */
    public class C59687a {

        /* renamed from: a */
        float f148155a;

        /* renamed from: b */
        float f148156b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo203256a() {
            if (this.f148155a == BitmapDescriptorFactory.HUE_RED && this.f148156b == BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            return false;
        }

        C59687a() {
        }
    }

    /* renamed from: b */
    public Matrix mo203254b() {
        this.f148152d.reset();
        if (this.f148153e.mo203256a() || this.f148149a) {
            float width = this.f148151c.mo203301k().width() / ((float) this.f148150b.getWidth());
            float height = this.f148151c.mo203301k().height() / ((float) this.f148150b.getHeight());
            Log.m165379d("PhotoEdit", "scaleX = " + width + " ， scaleY = " + height);
            this.f148153e.f148155a = width;
            this.f148153e.f148156b = height;
            this.f148149a = false;
        }
        float a = this.f148151c.mo203282a() - (this.f148151c.mo203301k().width() / 2.0f);
        float b = this.f148151c.mo203291b() - (this.f148151c.mo203301k().height() / 2.0f);
        Log.m165379d("PhotoEditDrawMatrix", "size width = " + this.f148151c.mo203301k().width() + " , height = " + this.f148151c.mo203301k().height());
        Log.m165379d("PhotoEditDrawMatrix", "dx = " + a + " , dy = " + b + "centerX = " + this.f148151c.mo203282a());
        this.f148152d.postScale(this.f148153e.f148155a, this.f148153e.f148156b);
        this.f148152d.postTranslate(a, b);
        this.f148152d.postRotate((float) this.f148151c.mo203302l(), this.f148151c.mo203282a(), this.f148151c.mo203291b());
        return this.f148152d;
    }

    /* renamed from: a */
    public void mo203253a(Bitmap bitmap) {
        this.f148150b = bitmap;
    }

    C59685b(Bitmap bitmap, C59703d dVar) {
        this.f148150b = bitmap;
        this.f148151c = dVar;
        dVar.mo203289a(new C59703d.AbstractC59704a() {
            /* class com.ss.android.photoeditor.crop_rotate.C59685b.C596861 */

            @Override // com.ss.android.photoeditor.crop_rotate.C59703d.AbstractC59704a
            /* renamed from: a */
            public void mo203255a(RectF rectF) {
                C59685b.this.f148149a = true;
            }
        });
    }
}
