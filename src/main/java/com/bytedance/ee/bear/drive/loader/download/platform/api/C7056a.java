package com.bytedance.ee.bear.drive.loader.download.platform.api;

import android.util.SparseArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.a */
public class C7056a {

    /* renamed from: a */
    private static final List<String> f19018a = Arrays.asList(String.valueOf(0), String.valueOf(1), String.valueOf(2), String.valueOf(3), String.valueOf(7), String.valueOf(8), String.valueOf(9), String.valueOf(11), String.valueOf(12), String.valueOf(13), String.valueOf(14), String.valueOf(15), String.valueOf(16), String.valueOf(17), String.valueOf(19), String.valueOf(20), String.valueOf(21));

    /* renamed from: a */
    public static SparseArray<FileInfoMeta> m28084a(String str) {
        SparseArray<FileInfoMeta> sparseArray = new SparseArray<>();
        if (str == null) {
            return sparseArray;
        }
        try {
            JSONObject jSONObject = JSONObject.parseObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (jSONObject == null) {
                return sparseArray;
            }
            int size = f19018a.size();
            for (int i = 0; i < size; i++) {
                String str2 = f19018a.get(i);
                String string = jSONObject.getString(str2);
                FileInfoMeta fileInfoMeta = (FileInfoMeta) JSONObject.parseObject(string, new TypeReference<FileInfoMeta>() {
                    /* class com.bytedance.ee.bear.drive.loader.download.platform.api.C7056a.C70571 */
                }, new Feature[0]);
                if (!(string == null || fileInfoMeta == null)) {
                    sparseArray.put(Integer.parseInt(str2), fileInfoMeta);
                }
            }
            return sparseArray;
        } catch (JSONException unused) {
            C13479a.m54758a("FileInfoMetaParser", "parse meta exception: " + str);
        }
    }
}
