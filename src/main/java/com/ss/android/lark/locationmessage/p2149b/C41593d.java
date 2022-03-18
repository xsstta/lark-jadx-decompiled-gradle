package com.ss.android.lark.locationmessage.p2149b;

import android.content.Context;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.utils.ImageUtils;

/* renamed from: com.ss.android.lark.locationmessage.b.d */
public class C41593d {
    /* renamed from: a */
    public static Image m165057a(ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        Image origin = imageSet.getOrigin();
        if (origin == null || CollectionUtils.isEmpty(origin.getUrls()) || !URLUtil.isNetworkUrl(origin.getUrls().get(0))) {
            return origin;
        }
        return imageSet.getThumbnail();
    }

    /* renamed from: a */
    public static void m165058a(Context context, ImageView imageView) {
        int a = ImageUtils.m224128a(context);
        ImageLoader.with(context).load(Integer.valueOf((int) R.drawable.chat_window_image_item_holder)).override(a, a).centerCrop().into(imageView);
    }
}
