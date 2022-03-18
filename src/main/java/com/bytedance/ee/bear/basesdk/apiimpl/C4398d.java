package com.bytedance.ee.bear.basesdk.apiimpl;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.C2266d;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.resource.bitmap.AbstractC2429f;
import com.bumptech.glide.load.resource.bitmap.C2452w;
import com.bytedance.ee.bear.basesdk.api.AbstractC4378d;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.glide.p383a.C7744a;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.facade.glide.p383a.p384a.C7745a;
import com.bytedance.ee.bear.lark.p421h.C8043a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import java.util.Objects;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.d */
public final class C4398d implements AbstractC4378d {

    /* renamed from: a */
    private C10929e f13006a;

    /* renamed from: b */
    private boolean f13007b;

    /* renamed from: c */
    private boolean f13008c;

    /* renamed from: a */
    private void m18132a() {
        C13479a.m54764b("CardThumbnailImpl", "isConnected:" + this.f13008c + ", hasInitConnected: " + this.f13007b);
        if (!this.f13007b) {
            this.f13007b = true;
            ConnectionService d = C5084ad.m20847d();
            this.f13008c = d.mo20038b().mo20041b();
            d.mo20037a().mo5925a(new AbstractC1178x() {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$d$Svg7JOSfdocEQH_RSU03N_hNuQ */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C4398d.m269089lambda$Svg7JOSfdocEQH_RSU03N_hNuQ(C4398d.this, (ConnectionService.NetworkState) obj);
                }
            });
        }
    }

    public C4398d(C10929e eVar) {
        this.f13006a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18133a(ConnectionService.NetworkState networkState) {
        boolean z;
        if (networkState == null || !networkState.mo20041b()) {
            z = false;
        } else {
            z = true;
        }
        this.f13008c = z;
    }

    /* renamed from: a */
    private String m18131a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).buildUpon().clearQuery().toString();
        } catch (Exception e) {
            C13479a.m54761a("CardThumbnailImpl", e);
            return "";
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4378d
    /* renamed from: a */
    public void m18134b(C8043a aVar) {
        AbstractC2429f fVar;
        C13479a.m54764b("CardThumbnailImpl", "loadThumbnail");
        if (this.f13006a == null) {
            C13479a.m54758a("CardThumbnailImpl", "loadThumbnail error, mService == null");
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            C13742g.m55705a(new Runnable(aVar) {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$d$K9NoIldk4Zd90YYF2c7okCnxtew */
                public final /* synthetic */ C8043a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C4398d.lambda$K9NoIldk4Zd90YYF2c7okCnxtew(C4398d.this, this.f$1);
                }
            });
        } else if (!C13726a.m55674a(aVar.mo31084a())) {
            C13479a.m54764b("CardThumbnailImpl", "context is not active");
        } else if (((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a() || aVar.mo31087d() != C8275a.f22375h.mo32555b()) {
            try {
                m18132a();
                C7754c cVar = new C7754c(aVar.mo31085b(), aVar.mo31090g(), aVar.mo31087d(), aVar.mo31093j(), aVar.mo31091h(), aVar.mo31092i(), aVar.mo31095l(), aVar.mo31094k(), aVar.mo31089f(), new C10917c(this.f13006a));
                cVar.mo30376a(Boolean.valueOf(this.f13008c));
                String a = m18131a(cVar.mo29122g());
                boolean equals = Objects.equals(aVar.mo31089f().getTag(R.id.thumbnail_tag), a);
                Drawable drawable = aVar.mo31089f().getDrawable();
                if (drawable == null) {
                    drawable = new ColorDrawable(-1);
                } else if (!equals) {
                    drawable = new ColorDrawable(-1);
                }
                aVar.mo31089f().setTag(R.id.thumbnail_tag, a);
                C7745a.m31019a().mo30366a(cVar.mo29122g(), aVar.mo31084a().hashCode(), "", aVar.mo31096m());
                if (aVar.mo31086c() != null) {
                    fVar = aVar.mo31086c();
                } else {
                    fVar = new C7744a();
                }
                C2266d dVar = new C2266d(fVar);
                if (aVar.mo31097n() > 0) {
                    dVar = new C2266d(fVar, new C2452w(aVar.mo31097n()));
                }
                ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(aVar.mo31084a()).mo10430i().mo11130a((AbstractC2393i<Bitmap>) dVar)).mo11129a(AbstractC2354j.f7812b)).mo11145c(cVar.mo30378a(cVar.mo29122g()))).mo11125a(drawable)).mo10401b(aVar.mo31088e()).mo10395a((Object) cVar).mo10399a(aVar.mo31089f());
            } catch (Throwable th) {
                C13479a.m54761a("CardThumbnailImpl", th);
            }
        } else {
            C13479a.m54764b("CardThumbnailImpl", "loadThumbnail() file type, isSuiteFileFeatureEnable=false, show placeholder_tool_thumbnailfail_nor imageqq");
            aVar.mo31089f().setImageResource(R.drawable.placeholder_tool_thumbnailfail_nor);
        }
    }
}
