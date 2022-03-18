package com.lynx.component.svg;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.lynx.component.svg.parser.SVG;
import com.lynx.component.svg.parser.SVGParseException;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.ui.image.C26785a;
import com.lynx.tasm.core.C26883b;
import com.lynx.tasm.provider.AbstractC26936c;
import com.lynx.tasm.provider.C26937d;
import com.lynx.tasm.provider.C26938e;
import com.lynx.tasm.utils.C26956j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.lynx.component.svg.c */
public class C26428c {

    /* renamed from: a */
    public List<Bitmap> f65276a = new ArrayList();

    /* renamed from: b */
    private AbstractC26684l f65277b;

    /* renamed from: c */
    private AbstractC26434c f65278c;

    /* renamed from: com.lynx.component.svg.c$a */
    public interface AbstractC26432a {
        /* renamed from: a */
        void mo93810a();
    }

    /* renamed from: com.lynx.component.svg.c$b */
    public interface AbstractC26433b {
    }

    /* renamed from: com.lynx.component.svg.c$c */
    public interface AbstractC26434c {
        /* renamed from: a */
        void mo93811a(String str, AbstractC26433b bVar);
    }

    /* renamed from: com.lynx.component.svg.c$d */
    public interface AbstractC26435d {
        /* renamed from: a */
        void mo93798a();

        /* renamed from: a */
        void mo93799a(SVG svg);

        /* renamed from: a */
        void mo93800a(String str);
    }

    /* renamed from: a */
    public void mo93806a() {
        for (Bitmap bitmap : this.f65276a) {
            try {
                bitmap.recycle();
            } catch (Throwable th) {
                th.printStackTrace();
                Log.e("lynx_SvgResourceManager", th.toString());
            }
        }
    }

    public C26428c(AbstractC26684l lVar) {
        this.f65277b = lVar;
    }

    /* renamed from: b */
    public boolean mo93809b(String str, final AbstractC26435d dVar) {
        if (this.f65278c == null) {
            return false;
        }
        dVar.mo93798a();
        this.f65278c.mo93811a(str, new AbstractC26433b() {
            /* class com.lynx.component.svg.C26428c.C264313 */
        });
        return true;
    }

    /* renamed from: a */
    public void mo93807a(String str, final AbstractC26432a aVar) {
        final DataSource fetchDecodedImage = Fresco.getImagePipeline().fetchDecodedImage(ImageRequestBuilder.newBuilderWithSource(Uri.parse(C26785a.m97218a(this.f65277b, str))).build(), "lynx_SvgResourceManager");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        fetchDecodedImage.subscribe(new BaseBitmapDataSubscriber() {
            /* class com.lynx.component.svg.C26428c.C264291 */
        }, CallerThreadExecutor.getInstance());
        try {
            countDownLatch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            aVar.mo93810a();
        }
    }

    /* renamed from: a */
    public void mo93808a(String str, final AbstractC26435d dVar) {
        if (!mo93809b(str, dVar)) {
            final String a = C26785a.m97218a(this.f65277b, str);
            if (TextUtils.isEmpty(a)) {
                dVar.mo93800a("url is empty!");
            } else if (TextUtils.isEmpty(Uri.parse(a).getScheme())) {
                dVar.mo93800a("scheme is Empty!");
            } else {
                dVar.mo93798a();
                C26883b.m97717a().mo95669a(new C26937d(a), new AbstractC26936c() {
                    /* class com.lynx.component.svg.C26428c.C264302 */

                    @Override // com.lynx.tasm.provider.AbstractC26936c
                    /* renamed from: b */
                    public void mo50300b(C26938e eVar) {
                        dVar.mo93800a(eVar.mo95795c());
                    }

                    @Override // com.lynx.tasm.provider.AbstractC26936c
                    /* renamed from: a */
                    public void mo50299a(C26938e eVar) {
                        SVG svg;
                        try {
                            String a = C26956j.m97955a(eVar.mo95797e());
                            if (TextUtils.isEmpty(a)) {
                                eVar.mo95794b("data is empty!");
                                mo50300b(eVar);
                                return;
                            }
                            if (a.startsWith("res:///")) {
                                svg = SVG.m95749a(LynxEnv.m96123e().mo94110o(), Integer.parseInt(a));
                            } else {
                                svg = SVG.m95751a(a);
                            }
                            dVar.mo93799a(svg);
                        } catch (SVGParseException e) {
                            eVar.mo95794b(e.toString());
                            LLog.m96418a(new RuntimeException(e));
                        }
                    }
                });
            }
        }
    }
}
