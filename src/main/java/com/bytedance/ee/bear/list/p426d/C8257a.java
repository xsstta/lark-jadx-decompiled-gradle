package com.bytedance.ee.bear.list.p426d;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.facade.glide.p383a.C7744a;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.d.a */
public class C8257a implements AbstractC8259c {

    /* renamed from: a */
    private Document f22273a;

    /* renamed from: b */
    private long f22274b;

    /* renamed from: c */
    private Context f22275c;

    /* renamed from: d */
    private C10917c f22276d;

    /* renamed from: e */
    private boolean f22277e;

    @Override // com.bytedance.ee.bear.list.p426d.AbstractC8259c
    /* renamed from: a */
    public void mo32357a(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        String str;
        appCompatImageView.setVisibility(0);
        appCompatImageView2.setVisibility(8);
        if (appCompatImageView.getDrawable() == null || appCompatImageView.getDrawable().getCurrent().getConstantState() == null || appCompatImageView.getTag(R.id.list_item_unique_id) == null || this.f22274b != ((Long) appCompatImageView.getTag(R.id.list_item_unique_id)).longValue()) {
            appCompatImageView.setImageResource(R.drawable.list_grid_placeholder);
            appCompatImageView.setTag(R.id.list_item_unique_id, Long.valueOf(this.f22274b));
        }
        if (TextUtils.isEmpty(this.f22273a.mo32403S()) && TextUtils.isEmpty(this.f22273a.ac())) {
            StringBuilder sb = new StringBuilder();
            sb.append("thumbnail is empty : ");
            if (TextUtils.isEmpty(this.f22273a.mo32403S())) {
                str = "true";
            } else {
                str = "false";
            }
            sb.append(str);
            sb.append(", type = ");
            sb.append(this.f22273a.mo32483t());
            C13479a.m54764b("DocumentGridItemIconStrategy", sb.toString());
        } else if (this.f22273a.mo32483t() != C8275a.f22375h.mo32555b() || ((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a()) {
            C7754c cVar = new C7754c(this.f22273a.mo32403S(), this.f22273a.ac(), this.f22273a.mo32483t(), this.f22273a.af(), this.f22273a.ad(), this.f22273a.ae(), "space_list", false, appCompatImageView, this.f22276d);
            cVar.mo30376a(Boolean.valueOf(this.f22277e));
            ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f22275c).mo10430i().mo10395a((Object) cVar).mo11145c(cVar.mo30378a(cVar.mo29122g()))).mo11129a(AbstractC2354j.f7812b)).mo11130a((AbstractC2393i<Bitmap>) new C7744a())).mo11123a(R.drawable.list_grid_placeholder)).mo10399a((ImageView) appCompatImageView);
        } else {
            appCompatImageView.setImageResource(R.drawable.list_grid_placeholder);
            appCompatImageView.setTag(R.id.list_item_unique_id, Long.valueOf(this.f22274b));
        }
    }

    C8257a(Document document, long j, Context context, C10917c cVar, boolean z) {
        this.f22273a = document;
        this.f22274b = j;
        this.f22275c = context;
        this.f22276d = cVar;
        this.f22277e = z;
    }
}
