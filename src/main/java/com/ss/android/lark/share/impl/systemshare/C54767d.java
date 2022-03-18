package com.ss.android.lark.share.impl.systemshare;

import android.content.Context;
import android.net.Uri;
import com.larksuite.framework.utils.LarkUriUtil;

/* renamed from: com.ss.android.lark.share.impl.systemshare.d */
public class C54767d {
    /* renamed from: a */
    public static boolean m212499a(Context context, Uri uri) {
        String f = LarkUriUtil.m95310f(context, uri);
        if (f != null) {
            return f.contains("image/");
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m212500b(Context context, Uri uri) {
        String f = LarkUriUtil.m95310f(context, uri);
        if (f != null) {
            return f.contains("video/");
        }
        return false;
    }
}
