package com.ss.android.lark.mail.impl.threadaction;

import java.util.HashMap;

public class ThreadActionFGConfigurator {
    private static HashMap<String, String> fgConfigMap;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        fgConfigMap = hashMap;
        hashMap.put("READMAIL_SEARCH", "larkmail.cli.readmail.contentsearch");
        fgConfigMap.put("FLAG", "larkmail.cli.quicklabel");
    }

    public static String getThreadActionFG(String str) {
        return fgConfigMap.get(str);
    }
}
