package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;

/* renamed from: com.ss.android.lark.mail.impl.message.template.a */
public abstract class AbstractC43031a<T> {

    /* renamed from: a */
    private static char f109547a = "$".toCharArray()[0];

    /* renamed from: b */
    private static char f109548b = "<".toCharArray()[0];

    /* renamed from: c */
    private static char f109549c = ">".toCharArray()[0];

    /* renamed from: a */
    public String mo154209a(String str) {
        return C43089z.m171291a().mo154272a(str);
    }

    /* renamed from: a */
    public void mo154210a(StringBuilder sb, String str, AbstractC43088y yVar) {
        if (str != null) {
            int length = str.length();
            char[] charArray = str.toCharArray();
            int i = 0;
            while (i < length) {
                if (charArray[i] == f109547a) {
                    StringBuilder sb2 = new StringBuilder();
                    int i2 = i + 1;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (charArray[i2] == f109547a) {
                            String sb3 = sb2.toString();
                            if (TextUtils.isEmpty(sb3)) {
                                sb.append(charArray[i]);
                            } else {
                                String a = yVar.mo154220a(sb3);
                                if (a == null) {
                                    sb.append(f109547a + sb3 + f109547a);
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
