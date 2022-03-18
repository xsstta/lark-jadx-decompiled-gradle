package com.ss.android.lark.team.util;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.entity.C38823a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/team/util/ImageUtil;", "", "()V", "getHolderDrawable", "Landroid/graphics/drawable/GradientDrawable;", "context", "Landroid/content/Context;", "width", "", "height", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.f.c */
public final class ImageUtil {

    /* renamed from: a */
    public static final ImageUtil f136869a = new ImageUtil();

    private ImageUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final GradientDrawable m215113a(Context context, int i, int i2) {
        C38823a aVar = new C38823a();
        aVar.setShape(1);
        aVar.setColor(UIUtils.getColor(context, R.color.bg_body_overlay));
        aVar.setSize(i, i2);
        return aVar;
    }
}
