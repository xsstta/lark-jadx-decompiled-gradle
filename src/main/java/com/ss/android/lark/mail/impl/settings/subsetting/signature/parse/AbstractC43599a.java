package com.ss.android.lark.mail.impl.settings.subsetting.signature.parse;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.message.template.AbstractC43088y;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.a */
public abstract class AbstractC43599a<T> {

    /* renamed from: a */
    private static char f110626a = "$".toCharArray()[0];

    /* renamed from: b */
    private static char f110627b = "<".toCharArray()[0];

    /* renamed from: c */
    private static char f110628c = ">".toCharArray()[0];

    /* renamed from: a */
    public String mo155602a(String str) {
        return C43608e.m173074a().mo155617a(str);
    }

    /* renamed from: a */
    public void mo155603a(StringBuilder sb, String str, AbstractC43088y yVar) {
        if (str != null) {
            int length = str.length();
            char[] charArray = str.toCharArray();
            int i = 0;
            while (i < length) {
                if (charArray[i] == f110626a) {
                    StringBuilder sb2 = new StringBuilder();
                    int i2 = i + 1;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (charArray[i2] == f110626a) {
                            String sb3 = sb2.toString();
                            if (TextUtils.isEmpty(sb3)) {
                                sb.append(charArray[i]);
                            } else {
                                String a = yVar.mo154220a(sb3);
                                if (a == null) {
                                    sb.append(f110626a + sb3 + f110626a);
                                } else {
                                    sb.append(a);
                                }
                            }
                        } else {
                            sb2.append(charArray[i2]);
                            i2++;
                        }
                    }
                    if (i2 == length) {
                        sb.append((CharSequence) sb2);
                    }
                    i = i2;
                } else {
                    sb.append(charArray[i]);
                }
                i++;
            }
        }
    }
}
