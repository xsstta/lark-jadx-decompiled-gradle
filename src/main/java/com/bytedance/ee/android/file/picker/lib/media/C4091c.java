package com.bytedance.ee.android.file.picker.lib.media;

import android.content.Context;
import android.os.Build;
import androidx.loader.content.C1197b;
import com.larksuite.framework.utils.MediaStoreUtil;

/* renamed from: com.bytedance.ee.android.file.picker.lib.media.c */
public class C4091c extends C1197b {

    /* renamed from: w */
    final String[] f12409w;

    public C4091c(Context context, String str) {
        super(context);
        String str2;
        mo6110a(this.f12409w);
        mo6108a(MediaStoreUtil.m94878a());
        mo6113b("date_added DESC");
        mo6114b(new String[]{str});
        if (Build.VERSION.SDK_INT >= 29) {
            str2 = "_display_name like ?";
        } else {
            str2 = "_data like ?";
        }
        mo6109a(str2);
    }
}
