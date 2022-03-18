package com.bytedance.ee.bear.list.p426d;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.resource.bitmap.C2432i;
import com.bumptech.glide.load.resource.bitmap.C2452w;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p718t.C13749l;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.d.h */
public class C8264h extends AbstractC8266j {

    /* renamed from: e */
    private C10917c f22302e;

    /* renamed from: f */
    private boolean f22303f;

    @Override // com.bytedance.ee.bear.list.p426d.AbstractC8266j
    /* renamed from: a */
    public void mo32360a() {
        int a = C7713a.m30841a(this.f22305b.mo32377C());
        if (this.f22303f || TextUtils.isEmpty(this.f22305b.mo32379D()) || !((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a()) {
            this.f22307d.setImageResource(a);
            return;
        }
        C7754c cVar = new C7754c(this.f22305b.mo32403S(), this.f22305b.mo32379D(), this.f22305b.mo32483t(), this.f22305b.mo32385G(), this.f22305b.mo32381E(), this.f22305b.mo32383F(), "space_list_icon", true, this.f22307d, this.f22302e);
        ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f22304a).mo10430i().mo10395a((Object) cVar).mo11129a(AbstractC2354j.f7812b)).mo11123a(a)).mo11137a(new C8261e(), new C2432i(), new C2452w(C13749l.m55738a(6)))).mo11143c(a)).mo10399a(this.f22307d);
    }

    C8264h(C10917c cVar, Context context, Document document, String str, boolean z, ImageView imageView) {
        super(context, document, str, imageView);
        this.f22302e = cVar;
        this.f22303f = z;
    }
}
