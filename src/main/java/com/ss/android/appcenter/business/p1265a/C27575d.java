package com.ss.android.appcenter.business.p1265a;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.dto.ItemUrl;

/* renamed from: com.ss.android.appcenter.business.a.d */
public class C27575d {
    /* renamed from: a */
    public static String m100643a(ItemInfo itemInfo) {
        if (itemInfo == null) {
            return "";
        }
        if (itemInfo.isSingleBot()) {
            return "BOT";
        }
        ItemUrl itemUrl = itemInfo.getItemUrl();
        if (itemUrl == null) {
            return "";
        }
        if (!TextUtils.isEmpty(itemUrl.getMobileMpUrl())) {
            return "MP";
        }
        if (!TextUtils.isEmpty(itemUrl.getMobileH5Url())) {
            return "H5";
        }
        return "";
    }

    /* renamed from: a */
    public static String m100644a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path)) {
            return "";
        }
        return path.replaceFirst("/", "").replaceAll("/", "_");
    }
}
