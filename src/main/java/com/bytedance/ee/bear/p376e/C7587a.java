package com.bytedance.ee.bear.p376e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.ee.bear.p376e.p377a.AbstractC7588a;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.component.ui.avatar.LarkAvatar;

/* renamed from: com.bytedance.ee.bear.e.a */
public class C7587a implements AbstractC7588a {
    @Override // com.bytedance.ee.bear.p376e.p377a.AbstractC7588a
    /* renamed from: a */
    public void mo29854a(ImageView imageView) {
        LarkAvatar.m91597a(imageView.getContext()).mo89066a(imageView);
    }

    /* renamed from: a */
    public Drawable mo29851a(Context context, String str, String str2) {
        IconKeyDrawable oVar = new IconKeyDrawable(context);
        oVar.mo89036a(str, str2, null);
        return oVar;
    }

    @Override // com.bytedance.ee.bear.p376e.p377a.AbstractC7588a
    /* renamed from: a */
    public void mo29857a(String str, String str2, ImageView imageView) {
        imageView.setImageDrawable(mo29851a(imageView.getContext(), str, str2));
    }

    @Override // com.bytedance.ee.bear.p376e.p377a.AbstractC7588a
    /* renamed from: a */
    public Drawable mo29852a(Context context, String str, String str2, int i) {
        IconKeyDrawable oVar = new IconKeyDrawable(context);
        oVar.mo89036a(str, str2, context.getDrawable(i));
        return oVar;
    }

    @Override // com.bytedance.ee.bear.p376e.p377a.AbstractC7588a
    /* renamed from: a */
    public void mo29855a(String str, String str2, int i, ImageView imageView) {
        imageView.setImageDrawable(mo29852a(imageView.getContext(), str, str2, i));
    }

    /* renamed from: a */
    public Drawable mo29853a(Context context, String str, String str2, int i, boolean z) {
        IconKeyDrawable oVar = new IconKeyDrawable(context);
        oVar.mo89034a(str, str2, -1, -1, context.getDrawable(i), z);
        return oVar;
    }

    @Override // com.bytedance.ee.bear.p376e.p377a.AbstractC7588a
    /* renamed from: a */
    public void mo29856a(String str, String str2, int i, ImageView imageView, boolean z) {
        imageView.setImageDrawable(mo29853a(imageView.getContext(), str, str2, i, z));
    }
}
