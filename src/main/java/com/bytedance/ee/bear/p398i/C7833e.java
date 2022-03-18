package com.bytedance.ee.bear.p398i;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.i.e */
public class C7833e implements Function<String, String> {
    /* renamed from: a */
    public String apply(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        C13479a.m54772d("CommentRemoveBlankLine", "apply before=" + str);
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\n");
            int i = 0;
            int length = split.length - 1;
            while (i <= length && TextUtils.isEmpty(split[i].trim())) {
                i++;
            }
            while (length > i && TextUtils.isEmpty(split[length].trim())) {
                length--;
            }
            for (int i2 = i; i2 <= length; i2++) {
                if (i2 > i) {
                    sb.append("\n");
                }
                sb.append(split[i2]);
            }
        }
        return sb.toString();
    }
}
