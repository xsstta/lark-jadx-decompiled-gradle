package com.ss.android.openbusiness.ui;

import android.content.Context;
import android.widget.ImageView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.openbusiness.ui.a */
public class C59601a {
    /* renamed from: a */
    public static void m231145a(Context context, String str, ImageView imageView) {
        IRequestCreator load = ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, null, LocationRequest.PRIORITY_INDOOR, LocationRequest.PRIORITY_INDOOR).fsUnit(null).build());
        if (load != null) {
            load.placeholder(R.color.bg_filler).error(R.color.bg_filler).into(imageView);
        } else {
            Log.m165389i("imageLoader", "IRequestCreator is null");
        }
    }
}
