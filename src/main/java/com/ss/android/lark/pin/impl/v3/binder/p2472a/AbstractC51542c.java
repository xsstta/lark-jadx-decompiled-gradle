package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.utils.ImageUtil;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51612d;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.c */
public abstract class AbstractC51542c extends AbstractC51540b<C51612d> {

    /* renamed from: a */
    AbstractC51472a.AbstractC51480g f128319a = PinModule.m199585b().mo144032f();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Image mo177536b(PinInfo bVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Image mo177538c(PinInfo bVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo177531a() {
        return UIHelper.dp2px(60.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo177535b() {
        return UIHelper.dp2px(75.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo177537c() {
        return UIHelper.dp2px(280.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo177539d() {
        if (DesktopUtil.m144301a(this.f146181d)) {
            return UIHelper.dp2px(160.0f);
        }
        return UIHelper.dp2px(310.0f);
    }

    public AbstractC51542c(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    public C51612d mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C51612d.C51614a.m200245a(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public void mo177520a(C51612d dVar, int i, PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) dVar, i, bVar);
        mo177534a(dVar, mo177536b(bVar), mo177538c(bVar), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177534a(C51612d dVar, Image image, Image image2, PinInfo bVar) {
        if (image == null) {
            ImageUtil.f128174a.mo177356a(this.f146181d, dVar.f128431m);
            return;
        }
        String str = null;
        if (CollectionUtils.isNotEmpty(image.getUrls())) {
            str = image.getUrls().get(0);
        }
        int[] a = bVar.mo177391b() ? new int[]{UIHelper.dp2px(80.0f), UIHelper.dp2px(80.0f)} : ImageUtils.m224135a(image2.getWidth(), image2.getHeight(), mo177539d(), mo177537c(), mo177535b(), mo177531a());
        int i = a[0];
        int i2 = a[1];
        ImageUtil.f128174a.mo177355a(this.f146181d, UIHelper.px2dp((float) i), UIHelper.px2dp((float) i2), dVar.f128431m);
        Drawable drawable = UIUtils.getDrawable(this.f146181d, R.color.bg_body_overlay);
        Drawable drawable2 = UIHelper.getDrawable(R.drawable.common_failed_chat_picture);
        if (this instanceof C51554j) {
            drawable2 = UIUtils.getDrawable(this.f146181d, R.color.bg_filler);
        }
        this.f128319a.mo144054a(this.f146181d, dVar.f128431m, image, str, i, i2, drawable2, drawable, true, false, null);
    }
}
