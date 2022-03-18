package com.bytedance.ee.bear.drive.view.preview.imageviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.AbstractC7326d;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.C7347f;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.C7282a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.C7290e;
import com.bytedance.ee.bear.drive.view.preview.imageviewer.photoview.PhotoView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.log.C13479a;
import java.util.LinkedHashMap;
import org.koin.java.KoinJavaComponent;

public class ProgressivePhotoView extends PhotoView implements AbstractC7361c {

    /* renamed from: a */
    public AbstractC7365f f19681a;

    /* renamed from: b */
    public boolean f19682b;

    /* renamed from: c */
    public C7555f f19683c;

    /* renamed from: d */
    private String f19684d;

    /* renamed from: e */
    private C7358b f19685e;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!TextUtils.isEmpty(this.f19684d)) {
            C7347f.m29330a().mo28602a(this.f19684d);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7361c
    public void setOnPhotoRequestListener(AbstractC7365f fVar) {
        this.f19681a = fVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7361c
    /* renamed from: a */
    public void mo28628a(C7553d dVar) {
        String str;
        LinkedHashMap<String, String> f = dVar.mo29487f();
        String str2 = null;
        if (f == null || f.isEmpty()) {
            str = null;
        } else {
            str = f.values().iterator().next();
        }
        AccountService.Account f2 = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f2 != null) {
            str2 = f2.f14591h;
        } else {
            C13479a.m54764b("ProgressivePhotoView", "accountService.findUserFromCache() return null. ");
        }
        this.f19684d = C7347f.m29330a().mo28601a(new C7282a(str, new C7290e.C7291a().mo28474a("Cookie", "bear-session=" + str2).mo28474a("doc-device-id", C4511g.m18594d().mo17369s()).mo28475a()), this, new AbstractC7326d<ImageView, Bitmap, byte[]>() {
            /* class com.bytedance.ee.bear.drive.view.preview.imageviewer.ProgressivePhotoView.C73531 */

            @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.AbstractC7326d
            /* renamed from: a */
            public boolean mo28557a(Throwable th) {
                if (ProgressivePhotoView.this.f19681a != null) {
                    ProgressivePhotoView.this.f19681a.mo28627a("progressive_image", th, true);
                }
                return true;
            }

            /* renamed from: a */
            public boolean mo28556a(byte[] bArr, boolean z) {
                if (ProgressivePhotoView.this.f19681a != null) {
                    ProgressivePhotoView.this.f19681a.mo28625a();
                }
                if (ProgressivePhotoView.this.f19683c == null) {
                    return false;
                }
                ProgressivePhotoView.this.f19683c.liveInnerSaveCache().mo5926a(bArr);
                return false;
            }

            /* renamed from: a */
            public boolean mo28555a(Bitmap bitmap, ImageView imageView, boolean z) {
                if (!ProgressivePhotoView.this.f19682b && ProgressivePhotoView.this.f19681a != null) {
                    ProgressivePhotoView.this.f19681a.mo28626a("progressive_image");
                }
                ProgressivePhotoView.this.f19682b = true;
                return false;
            }
        });
    }

    public ProgressivePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ProgressivePhotoView(Context context, C7358b bVar, C7555f fVar) {
        super(context);
        this.f19685e = bVar;
        this.f19683c = fVar;
    }
}
