package com.bytedance.ee.bear.drive.view.preview.imageviewer;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.view.View;
import com.bytedance.ee.bear.drive.common.C6896i;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.C7363e;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.C7399a;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.ImageViewState;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.e */
public class C7363e extends SubsamplingScaleImageView implements AbstractC7361c {

    /* renamed from: a */
    public AbstractC7365f f19703a;

    /* renamed from: b */
    public C7358b f19704b;

    public float getInitImageScale() {
        return Math.min((((float) C13749l.m55748b()) * 1.0f) / ((float) this.f19704b.mo28638e().outHeight), (((float) C13749l.m55736a()) * 1.0f) / ((float) this.f19704b.mo28638e().outWidth));
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7361c
    public void setOnPhotoRequestListener(AbstractC7365f fVar) {
        this.f19703a = fVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7361c
    /* renamed from: a */
    public void mo28628a(C7553d dVar) {
        C13479a.m54764b("preview_image", "DriveSubsamplingScaleImageView show()");
        setOnImageEventListener(new SubsamplingScaleImageView.C7391d() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.C7363e.C73641 */

            /* access modifiers changed from: public */
            /* renamed from: d */
            private /* synthetic */ void m29398d() {
                View view = (View) C7363e.this.getParent();
                BitmapFactory.Options e = C7363e.this.f19704b.mo28638e();
                C7363e.this.setDrivePhotoViewDoubleTapZoomScale(C6896i.m27266a(view.getHeight(), view.getWidth(), ((float) e.outHeight) * C7363e.this.getMinScale(), ((float) e.outWidth) * C7363e.this.getMinScale()));
                C7363e.this.setDoubleTapZoomDuration(LocationRequest.PRIORITY_HD_ACCURACY);
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.C7391d, com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.AbstractC7393f
            /* renamed from: a */
            public void mo28650a() {
                C13479a.m54764b("preview_image", "DriveSubsamplingScaleImageView onImageLoaded()");
                if (C7363e.this.f19703a != null) {
                    C7363e.this.f19703a.mo28626a("subsampling_image");
                    C7363e.this.f19703a.mo28625a();
                }
                C7363e.this.post(new Runnable() {
                    /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$e$1$X4HhFO7X08a_0UCQ19Q1_tDYrGE */

                    public final void run() {
                        C7363e.C73641.lambda$X4HhFO7X08a_0UCQ19Q1_tDYrGE(C7363e.C73641.this);
                    }
                });
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.C7391d, com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView.AbstractC7393f
            /* renamed from: a */
            public void mo28651a(Exception exc) {
                C13479a.m54765b("preview_image", "DriveSubsamplingScaleImageView onImageLoadError() error=", exc);
                if (C7363e.this.f19703a != null) {
                    C7363e.this.f19703a.mo28627a("subsampling_image", exc, false);
                }
            }
        });
        float initImageScale = getInitImageScale();
        setEagerLoadingEnabled(false);
        setMinimumScaleType(3);
        setMinScale(initImageScale);
        setMaxScale(3.0f + initImageScale);
        mo28786a(C7399a.m29568b(dVar.mo29485e()), new ImageViewState(initImageScale, new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), 0));
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m29395b(float f, boolean z) {
        super.mo28647a(f, z);
    }

    public C7363e(Context context, C7358b bVar) {
        super(context);
        this.f19704b = bVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.SubsamplingScaleImageView, com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7361c
    /* renamed from: a */
    public void mo28647a(float f, boolean z) {
        post(new Runnable(f, z) {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$e$hKWV1iXlRUOP26qtzLC5LhnfOI */
            public final /* synthetic */ float f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7363e.m269479lambda$hKWV1iXlRUOP26qtzLC5LhnfOI(C7363e.this, this.f$1, this.f$2);
            }
        });
    }
}
