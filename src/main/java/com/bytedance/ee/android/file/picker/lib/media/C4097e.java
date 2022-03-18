package com.bytedance.ee.android.file.picker.lib.media;

import android.content.Context;
import androidx.loader.content.C1197b;
import com.larksuite.framework.utils.MediaStoreUtil;

/* renamed from: com.bytedance.ee.android.file.picker.lib.media.e */
public class C4097e extends C1197b {

    /* renamed from: w */
    final String[] f12417w;

    public C4097e(Context context) {
        super(context);
        String[] strArr = {"_id", "_data", "_size", "_display_name", "duration"};
        this.f12417w = strArr;
        mo6110a(strArr);
        mo6108a(MediaStoreUtil.m94895b());
        mo6113b("date_added DESC");
        mo6109a("mime_type like ?");
        mo6114b(new String[]{"video/%"});
    }
}
