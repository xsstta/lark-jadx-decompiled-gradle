package com.bytedance.ee.bear.drive.core.model;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.log.C13479a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.drive.core.model.e */
public class C6952e {
    /* renamed from: a */
    public static String m27607a(SparseArray<PreviewMeta> sparseArray) {
        PreviewMeta previewMeta;
        if (!(sparseArray == null || (previewMeta = sparseArray.get(21)) == null)) {
            String extra = previewMeta.getExtra();
            if (TextUtils.isEmpty(extra)) {
                return "";
            }
            try {
                return new JSONObject(extra).optString("mime_type");
            } catch (JSONException unused) {
                C13479a.m54758a("PreviewMetaParser", "parseMimeTypeFromSparseArray error");
            }
        }
        return "";
    }
}
