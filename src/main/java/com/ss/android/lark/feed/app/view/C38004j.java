package com.ss.android.lark.feed.app.view;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.feed.app.view.j */
public class C38004j {

    /* renamed from: a */
    public static final float f97573a;

    /* renamed from: b */
    public static final float f97574b;

    /* renamed from: c */
    public static final float f97575c;

    /* renamed from: d */
    public static final int f97576d;

    /* renamed from: e */
    public static final float f97577e;

    /* renamed from: f */
    public static final int f97578f;

    /* renamed from: g */
    public static final int f97579g;

    /* renamed from: h */
    public static final int f97580h = UIHelper.getColor(R.color.text_caption);

    /* renamed from: i */
    public static final float f97581i;

    /* renamed from: j */
    public static final float f97582j;

    /* renamed from: k */
    public static final int f97583k;

    static {
        if (DesktopUtil.m144301a(UIHelper.getContext())) {
            f97573a = 66.0f;
            f97574b = 46.0f;
            f97575c = BitmapDescriptorFactory.HUE_RED;
            f97576d = 10;
            f97577e = 0.5f;
            f97578f = 32;
            f97579g = 10;
            f97581i = 8.0f;
            f97582j = 0.5f;
            f97583k = 14;
            return;
        }
        f97573a = 80.0f;
        f97574b = 56.0f;
        f97575c = 0.5f;
        f97576d = 8;
        f97577e = 10.0f;
        f97578f = 54;
        f97579g = 6;
        f97581i = 12.0f;
        f97582j = 2.5f;
        f97583k = 16;
    }
}
