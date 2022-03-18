package com.ss.android.lark.widget.richtext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.widget.span.C59160j;

/* renamed from: com.ss.android.lark.widget.richtext.f */
public class C59032f {

    /* renamed from: a */
    private static volatile C59032f f146309a;

    /* renamed from: b */
    private static C59160j.AbstractC59162a f146310b;

    private C59032f() {
    }

    /* renamed from: b */
    public C59160j.AbstractC59162a mo200571b() {
        if (f146310b == null) {
            f146310b = $$Lambda$f$2XzHoIjauCI0RGZTFKnsXEVYbUo.INSTANCE;
        }
        return f146310b;
    }

    /* renamed from: a */
    public static C59032f m229191a() {
        if (f146309a == null) {
            synchronized (C59032f.class) {
                if (f146309a == null) {
                    f146309a = new C59032f();
                }
            }
        }
        return f146309a;
    }

    /* renamed from: a */
    public void mo200569a(Image image, int i, int i2, ImageView imageView) {
        String str;
        if (image != null && imageView != null) {
            String str2 = "";
            if (!TextUtils.isEmpty(image.getToken())) {
                String key = image.getKey();
                if (TextUtils.isEmpty(key)) {
                    str = image.getFirstUrl();
                } else {
                    str = str2;
                    str2 = key;
                }
            } else if (CollectionUtils.isEmpty(image.getUrls())) {
                str = str2;
            } else {
                str = image.getUrls().get(0);
            }
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                ImageLoader.with(imageView.getContext()).load(str).placeholder(R.color.lkui_N100).error(R.drawable.common_failed_chat_picture).override(i, i2).centerCrop().into(imageView);
                return;
            }
            ImageLoader.with(imageView.getContext()).load(new C38824b(str2)).placeholder(R.color.lkui_N100).error(R.drawable.common_failed_chat_picture).centerCrop().dontAnimate(false).override(i, i2).into(imageView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m229192a(Context context, String str, int i, int i2, AbstractC38819j jVar) {
        ImageLoader.with(context).load(new C38824b(str)).placeholder(R.color.lkui_N100).error(R.drawable.common_failed_chat_picture).centerCrop().dontAnimate(false).into(jVar);
    }

    /* renamed from: a */
    public void mo200570a(String str, int i, int i2, ImageView imageView, Drawable drawable, Drawable drawable2) {
        if (!TextUtils.isEmpty(str)) {
            ImageLoader.with(imageView.getContext()).load(new C38824b(str)).centerCrop().dontAnimate(false).override(i, i2).placeholder(drawable).error(drawable2).into(imageView);
        }
    }
}
