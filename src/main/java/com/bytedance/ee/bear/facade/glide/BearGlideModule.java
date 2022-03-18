package com.bytedance.ee.bear.facade.glide;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.p080a.AbstractC2102d;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.loader.PDFPageModel;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.p374a.C7463b;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.p374a.C7464d;
import com.bytedance.ee.bear.facade.common.C7708g;
import com.bytedance.ee.bear.facade.glide.C7769c;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.facade.glide.p383a.C7766e;
import com.bytedance.ee.bear.middleground.comment.p447e.C9213b;
import com.bytedance.ee.bear.middleground.comment.p447e.C9215d;
import com.bytedance.ee.eenet.httpclient.AbstractC12625f;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.plugin.common.ttpdfreader.PagePart;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p707j.C13684a;
import com.larksuite.framework.utils.C26252ad;
import java.io.InputStream;

public class BearGlideModule extends AbstractC2102d {
    public static boolean isInDocsProcess(Context context) {
        try {
            String a = C26252ad.m94992a(context);
            if (a.endsWith(":docs") || a.endsWith(":p0")) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C13479a.m54765b("BearGlideModule", "isInDocsProcess()", th);
            return false;
        }
    }

    @Override // com.bumptech.glide.p080a.AbstractC2104f, com.bumptech.glide.p080a.AbstractC2102d
    public void registerComponents(Context context, ComponentCallbacks2C2115c cVar, Registry registry) {
        C13684a.AbstractC13685a aVar;
        super.registerComponents(context, cVar, registry);
        C13479a.m54764b("BearGlideModule", "registerComponents");
        if (C26252ad.m94993b(context) || isInDocsProcess(context)) {
            C13479a.m54764b("BearGlideModule", "dependency is ccm dependency");
            aVar = new C7708g.C7709a();
        } else {
            C13479a.m54764b("BearGlideModule", "dependency is dependency wrapper");
            aVar = new C7743a();
        }
        AbstractC12625f a = C12617b.m52365c().mo47928a().mo47916a(new C13684a(aVar)).mo47919a();
        registry.mo10310b(C13664a.class, InputStream.class, new C7769c.C7770a(a));
        registry.mo10310b(C7754c.class, InputStream.class, new C7766e.C7767a(a));
        registry.mo10310b(C9213b.class, InputStream.class, new C9215d.C9216a(a));
        registry.mo10310b(PDFPageModel.class, PagePart.class, new C7464d.C7465a());
        registry.mo10311b(PagePart.class, Bitmap.class, new C7463b());
    }
}
