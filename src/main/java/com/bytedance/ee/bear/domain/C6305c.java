package com.bytedance.ee.bear.domain;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.bear.domain.c */
public class C6305c {

    /* renamed from: a */
    private Pattern f17465a;

    /* renamed from: b */
    private final String[] f17466b;

    /* renamed from: a */
    private void m25284a() {
        String[] strArr = this.f17466b;
        if (strArr == null || strArr.length == 0) {
            C13479a.m54764b("BlackList", "mBlackPathList is null or empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            String[] strArr2 = this.f17466b;
            if (i >= strArr2.length) {
                break;
            }
            if (i == 0) {
                sb.append(strArr2[i]);
            } else {
                sb.append("|");
                sb.append(this.f17466b[i]);
            }
            i++;
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            this.f17465a = Pattern.compile(sb.toString());
        }
        C13479a.m54764b("BlackList", "init()...patternStr = " + ((Object) sb));
    }

    C6305c(String[] strArr) {
        this.f17466b = strArr;
        m25284a();
    }

    /* renamed from: a */
    public boolean mo25363a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("BlackList", "isInBlackList()...url is empty");
            return false;
        } else if (this.f17465a == null) {
            C13479a.m54764b("BlackList", "isInBlackList()...mPattern is null");
            return false;
        } else {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path)) {
                return this.f17465a.matcher(path).find();
            }
            C13479a.m54764b("BlackList", "isInBlackList()...path is empty");
            return false;
        }
    }
}
