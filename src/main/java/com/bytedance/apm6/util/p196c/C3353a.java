package com.bytedance.apm6.util.p196c;

import android.os.Process;
import com.bytedance.apm6.util.C3354d;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.apm6.util.c.a */
public class C3353a {

    /* renamed from: a */
    private static long f10642a = -1;

    /* renamed from: a */
    public static long m13948a() {
        int myPid = Process.myPid();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + myPid + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                C3354d.m13950b(bufferedReader2);
                return parseLong;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C3354d.m13950b(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            C3354d.m13950b(bufferedReader);
            return -1;
        }
    }
}
