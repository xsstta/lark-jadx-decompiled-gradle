package com.ss.android.lark.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.utils.v */
public class C57886v {
    /* renamed from: a */
    public static Bitmap m224663a(int i, Context context, int i2, int i3) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(UIUtils.getDimens(context, i2), 0), View.MeasureSpec.makeMeasureSpec(UIUtils.getDimens(context, i3), 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(inflate.getMeasuredWidth(), inflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        inflate.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
