package com.ss.android.lark.mail.impl.utils;

import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.utils.i */
public class C43766i {
    /* renamed from: a */
    public static boolean m173484a(File file) {
        return m173487b(m173486b(file));
    }

    /* renamed from: a */
    public static boolean m173485a(String str) {
        return m173487b(m173488c(str));
    }

    /* renamed from: c */
    private static String m173488c(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(".")) <= -1 || str.length() <= lastIndexOf) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: b */
    private static String m173486b(File file) {
        int lastIndexOf;
        String absolutePath = file.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath) || (lastIndexOf = absolutePath.lastIndexOf(".")) <= -1 || absolutePath.length() <= lastIndexOf) {
            return "";
        }
        return absolutePath.substring(lastIndexOf + 1);
    }

    /* renamed from: b */
    public static boolean m173487b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List asList = Arrays.asList("app|bat|chm|cmd|com|cpl|csh|dll|exe|hta|jar|js|jse|ksh|lnk|msc|msh|msh1|msh2|mshxml|msh1xml|msh2xml|msi|msp|mst|msu|pif|pl|prg|ps1|ps1xml|ps2|ps2xml|psc1|psc2|psd1|psdm1|py|pyc|pyo|pyw|pyz|pyzw|scf|scr|sct|shb|shs|vb|vbe|vbs|ws|wsc|wsf|wsh".split("\\|"));
        if (str.startsWith(".")) {
            return asList.contains(str);
        }
        return asList.contains(str);
    }
}
