package com.ss.sys.ces.die;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.ss.sys.ces.C65388c;

public class xx {

    /* renamed from: a */
    private static Context f164654a = C65388c.m256417b().mo225028a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.sys.ces.die.xx$a */
    public class C65392a extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f164655a;

        C65392a(String str) {
            this.f164655a = str;
        }

        public void run() {
            Looper.prepare();
            Toast.makeText(xx.f164654a, this.f164655a, 1).show();
            Looper.loop();
        }
    }

    public static void HelloKitty(int i) {
        m256449a(i == 1 ? "[+] detect malware environment" : i == 2 ? "[+] detect rebuild package" : "APP ERROR !!!");
    }

    /* renamed from: a */
    private static void m256449a(String str) {
        new C65392a(str).start();
    }
}
