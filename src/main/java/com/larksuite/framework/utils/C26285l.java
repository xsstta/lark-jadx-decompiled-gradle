package com.larksuite.framework.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.larksuite.framework.utils.l */
public class C26285l {
    /* renamed from: a */
    public static boolean m95188a(Context context, Uri uri, String str) {
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(uri.getPath());
            if (!file.exists()) {
                return false;
            }
            uri = C26310o.m95259a(context, new File(uri.getPath()));
            if (TextUtils.isEmpty(str)) {
                str = C26311p.m95279b(file);
            }
        } else if (!MediaStoreUtil.m94900b(context, uri)) {
            return false;
        } else {
            if (TextUtils.isEmpty(str)) {
                str = MediaStoreUtil.m94885a(context, uri);
            }
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setDataAndType(uri, str);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            intent.addFlags(2);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
