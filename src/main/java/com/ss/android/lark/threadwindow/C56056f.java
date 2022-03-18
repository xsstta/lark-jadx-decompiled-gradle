package com.ss.android.lark.threadwindow;

import android.content.Context;
import android.widget.ImageView;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.entity.AvatarImage;

/* renamed from: com.ss.android.lark.threadwindow.f */
public class C56056f {
    /* renamed from: a */
    public static void m218239a(Context context, int i, int i2, String str, String str2, ImageView imageView, AbstractC38817h hVar) {
        if (DesktopUtil.m144301a(context)) {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
        }
        AvatarImage build = AvatarImage.Builder.obtain(str, str2, i, i2).build();
        ImageLoader.with(context).asBitmap().load(build).placeholder(C34336c.m133122a(context, i, i2, imageView)).override(i, i2).listener(hVar).into(imageView);
    }
}
