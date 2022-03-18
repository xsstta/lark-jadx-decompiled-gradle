package com.ss.android.bytedcert.view.camera;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.common.utility.Logger;
import com.ss.android.bytedcert.activities.OCRTakePhotoActivity;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

public class MyPreview extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    public Context f71536a;

    /* renamed from: b */
    boolean f71537b;

    /* renamed from: c */
    public C28445a f71538c;

    /* renamed from: d */
    String f71539d = "MyPreview";

    /* renamed from: e */
    Camera.PictureCallback f71540e = new Camera.PictureCallback() {
        /* class com.ss.android.bytedcert.view.camera.MyPreview.C284441 */

        public void onPictureTaken(byte[] bArr, Camera camera) {
            Logger.m15167d("TakePicture", "in byted_take picture callback");
            MyPreview.this.f71538c.mo101260e();
            MyPreview.this.f71537b = false;
            if (MyPreview.this.f71536a != null) {
                ((OCRTakePhotoActivity) MyPreview.this.f71536a).mo100885a(((Activity) MyPreview.this.f71536a).getIntent().getStringExtra(ShareHitPoint.f121869d), bArr);
            }
        }
    };

    /* renamed from: f */
    private SurfaceHolder f71541f;

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    /* renamed from: a */
    public void mo101245a() {
        this.f71538c.mo101258c();
    }

    /* renamed from: b */
    public void mo101247b() {
        this.f71538c.mo101259d();
    }

    /* renamed from: c */
    public void mo101248c() {
        this.f71538c.mo101255a(this.f71540e);
    }

    public int getCamId() {
        return this.f71538c.mo101257b();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f71538c.mo101261f();
        this.f71537b = false;
    }

    public MyPreview(Context context) {
        super(context);
        mo101246a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo101246a(Context context) {
        this.f71536a = context;
        this.f71538c = C28445a.m104254a();
        SurfaceHolder holder = getHolder();
        this.f71541f = holder;
        holder.addCallback(this);
        this.f71541f.setType(3);
    }

    public MyPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101246a(context);
    }

    public MyPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101246a(context);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Logger.m15170e("surfaceChanged", "Mypreview w:" + i2 + " h:" + i3);
        Logger.m15170e("surfaceChanged", "h>w, draw on canvas");
        if (this.f71537b) {
            this.f71538c.mo101260e();
            this.f71537b = false;
        }
        this.f71538c.mo101254a(i2, i3);
        this.f71538c.mo101256a(surfaceHolder, (Camera.PreviewCallback) null);
        this.f71537b = true;
    }
}
