package com.bytedance.ee.bear.p398i;

import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.framework.common.ContainerUtils;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.ee.bear.i.d */
public class C7832d implements Function<String, C7827a> {
    /* renamed from: b */
    private C4517a[] m31367b(String str) throws XmlPullParserException, IOException {
        Matcher matcher = Pattern.compile("<at(\n|.)*?>(\n|.)*?</at>").matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            C4517a a = m31365a(str.substring(start, end).replaceAll(ContainerUtils.FIELD_DELIMITER, "&amp;"), start, end);
            if (a != null) {
                arrayList.add(a);
            }
        }
        C4517a[] aVarArr = new C4517a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    /* renamed from: a */
    public C7827a apply(String str) throws Exception {
        C13479a.m54772d("CommentParser", "apply: begin origin=" + str);
        C4517a[] b = m31367b(str);
        String a = m31366a(str, b);
        return new C7827a(a, b, m31368c(a));
    }

    /* renamed from: c */
    private C7838i[] m31368c(String str) {
        Matcher matcher = Pattern.compile("(" + "(https?|http|ftp):\\/\\/((localhost:[0-9]{2,5})|( (([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}(2[0-4][0-9]|25[0-5]|1[0-9]{2}|[1-9][0-9]|[0-9])(:[0-9]{2,5})?))(\\/[-a-zA-Z0-9@:%_+.~#?&//=]*)?" + ")|(" + "((https?|http|ftp):\\/\\/)?[-a-zA-Z0-9:%._+~#=]{2,256}\\.(com|org|net|edu|gov|aero|app|biz|cat|coop|info|int|jobs|mobi|museum|name|pro|travel|arpa|asia|xxx|google|[a-z][a-z])\\b([-a-zA-Z0-9@:%_+.~#?&//=;()$,!]*)" + ")|(" + "^(?!data:)(?:mailto:)?[\\w.!#$%&'*+-/=?^_`{|}~]{1,2000}@[A-Za-z0-9.-]+\\.(com|org|net|edu|gov|aero|app|biz|cat|coop|info|int|jobs|mobi|museum|name|pro|travel|arpa|asia|xxx|[a-z][a-z])" + ")").matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            arrayList.add(new C7838i(start, end, str.substring(start, end)));
        }
        C7838i[] iVarArr = new C7838i[arrayList.size()];
        arrayList.toArray(iVarArr);
        return iVarArr;
    }

    /* renamed from: a */
    private String m31366a(String str, C4517a[] aVarArr) {
        C13479a.m54772d("CommentParser", "replaceAts: ");
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (i < aVarArr.length) {
            C4517a aVar = aVarArr[i];
            int length = (aVar.f13213b - aVar.f13212a) - aVar.f13217f.length();
            sb.replace(aVar.f13212a, aVar.f13213b, aVar.f13217f);
            aVar.f13213b = aVar.f13212a + aVar.f13217f.length();
            i++;
            for (int i2 = i; i2 < aVarArr.length; i2++) {
                C4517a aVar2 = aVarArr[i2];
                aVar2.f13212a -= length;
                aVar2.f13213b -= length;
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.ee.bear.bean.C4517a m31365a(java.lang.String r11, int r12, int r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.p398i.C7832d.m31365a(java.lang.String, int, int):com.bytedance.ee.bear.bean.a");
    }
}
