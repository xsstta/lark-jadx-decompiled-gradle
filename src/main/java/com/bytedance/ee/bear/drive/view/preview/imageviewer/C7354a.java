package com.bytedance.ee.bear.drive.view.preview.imageviewer;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.ee.bear.drive.common.C6896i;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.C7354a;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.PhotoView;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.View$OnLayoutChangeListenerC7377j;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.a */
public class C7354a extends PhotoView implements AbstractC7361c {

    /* renamed from: a */
    public AbstractC7365f f19687a;

    /* renamed from: b */
    private C7358b f19688b;

    @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7361c
    public void setOnPhotoRequestListener(AbstractC7365f fVar) {
        this.f19687a = fVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7361c
    /* renamed from: a */
    public void mo28628a(C7553d dVar) {
        final String str;
        C13479a.m54764b("preview_image", "default drive photo view show()");
        String e = dVar.mo29485e();
        BitmapFactory.Options e2 = this.f19688b.mo28638e();
        int i = e2.outHeight;
        int i2 = e2.outWidth;
        if (e2.outHeight * e2.outWidth > C6896i.m27270b()) {
            int d = C6896i.m27273d(e2.outWidth, e2.outHeight);
            int i3 = e2.outHeight / d;
            int i4 = e2.outWidth / d;
            C13479a.m54764b("preview_image", "default drive photo view show(), openType = DriveDevPointConstant.COMPRESSION_PREVIEW factor =" + d);
            str = "compression_image";
            i = i3;
            i2 = i4;
        } else {
            str = "photo_view";
        }
        ((C2124f) ComponentCallbacks2C2115c.m9151c(getContext()).mo10415a(e).mo11144c(i2, i)).mo10392a((AbstractC2536f) new AbstractC2536f<Drawable>() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.C7354a.C73551 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m29374a() {
                View view = (View) C7354a.this.getParent();
                if (view != null && C7354a.this.getDisplayRect() != null) {
                    float height = C7354a.this.getDisplayRect().height();
                    float width = C7354a.this.getDisplayRect().width();
                    float a = C6896i.m27266a(view.getHeight(), view.getWidth(), height, width);
                    if (width > BitmapDescriptorFactory.HUE_RED && View$OnLayoutChangeListenerC7377j.f19723a * width < ((float) C13749l.m55736a())) {
                        C7354a.this.setMaximumScale((((float) C13749l.m55736a()) * 2.0f) / width);
                    }
                    C7354a.this.setDoubleTapScale(a);
                }
            }

            @Override // com.bumptech.glide.request.AbstractC2536f
            /* renamed from: a */
            public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
                C13479a.m54759a("preview_image", "glide onLoadFailed(), error=", glideException);
                if (C7354a.this.f19687a != null) {
                    C7354a.this.f19687a.mo28627a(str, glideException, false);
                }
                return false;
            }

            /* renamed from: a */
            public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
                C13479a.m54758a("preview_image", "glide onResourceReady()");
                if (C7354a.this.f19687a != null) {
                    C7354a.this.f19687a.mo28626a(str);
                    C7354a.this.f19687a.mo28625a();
                }
                C7354a.this.post(new Runnable() {
                    /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.$$Lambda$a$1$xaOAzLgP6ol2LvZhx2OyJd7x9Q */

                    public final void run() {
                        C7354a.C73551.m269478lambda$xaOAzLgP6ol2LvZhx2OyJd7x9Q(C7354a.C73551.this);
                    }
                });
                return false;
            }
        }).mo10399a((ImageView) this);
    }

    public C7354a(Context context, C7358b bVar) {
        super(context);
        this.f19688b = bVar;
    }
}
