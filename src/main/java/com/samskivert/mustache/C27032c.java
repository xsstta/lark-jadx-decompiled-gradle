package com.samskivert.mustache;

import com.huawei.hms.framework.common.ContainerUtils;
import com.samskivert.mustache.C27035d;

/* renamed from: com.samskivert.mustache.c */
public class C27032c {

    /* renamed from: a */
    public static final C27035d.AbstractC27045f f67155a = m98267a(new String[]{ContainerUtils.FIELD_DELIMITER, "&amp;"}, new String[]{"'", "&#39;"}, new String[]{"\"", "&quot;"}, new String[]{"<", "&lt;"}, new String[]{">", "&gt;"}, new String[]{"`", "&#x60;"}, new String[]{ContainerUtils.KEY_VALUE_DELIMITER, "&#x3D;"});

    /* renamed from: b */
    public static final C27035d.AbstractC27045f f67156b = new C27035d.AbstractC27045f() {
        /* class com.samskivert.mustache.C27032c.C270331 */

        @Override // com.samskivert.mustache.C27035d.AbstractC27045f
        /* renamed from: a */
        public String mo96170a(String str) {
            return str;
        }
    };

    /* renamed from: a */
    public static C27035d.AbstractC27045f m98267a(final String[]... strArr) {
        return new C27035d.AbstractC27045f() {
            /* class com.samskivert.mustache.C27032c.C270342 */

            @Override // com.samskivert.mustache.C27035d.AbstractC27045f
            /* renamed from: a */
            public String mo96170a(String str) {
                String[][] strArr = strArr;
                for (String[] strArr2 : strArr) {
                    str = str.replace(strArr2[0], strArr2[1]);
                }
                return str;
            }
        };
    }
}
