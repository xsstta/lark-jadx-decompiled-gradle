package com.ss.android.ttve.common;

import android.os.Build;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttve.common.a */
public class C60182a {

    /* renamed from: a */
    private static Map<String, Integer> f150199a;

    static {
        HashMap hashMap = new HashMap();
        f150199a = hashMap;
        Integer valueOf = Integer.valueOf((int) SmEvents.EVENT_NW);
        hashMap.put("sdm660", valueOf);
        f150199a.put("msm8994", valueOf);
        f150199a.put("sdm845", 240);
        f150199a.put("sm8150", 480);
    }

    /* renamed from: a */
    public static String m233924a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = readLine;
            }
            if (str.contains("Hardware")) {
                return str.split(":\\s+", 2)[1];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return Build.HARDWARE;
    }

    /* renamed from: a */
    public static int m233923a(String str) {
        if (f150199a.containsKey(str)) {
            return f150199a.get(str).intValue();
        }
        return 0;
    }
}
