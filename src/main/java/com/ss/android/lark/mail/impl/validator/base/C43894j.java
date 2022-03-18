package com.ss.android.lark.mail.impl.validator.base;

/* renamed from: com.ss.android.lark.mail.impl.validator.base.j */
public class C43894j {
    /* renamed from: a */
    private static String m173960a(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e) {
            return "<" + (obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj))) + " threw " + e.getClass().getName() + ">";
        }
    }

    /* renamed from: a */
    public static String m173961a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = m173960a(objArr[i2]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) valueOf, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
