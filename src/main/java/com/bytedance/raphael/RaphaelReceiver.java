package com.bytedance.raphael;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.io.File;
import java.io.PrintStream;

public class RaphaelReceiver extends BroadcastReceiver {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo69209a(Context context) {
        File externalFilesDir = context.getExternalFilesDir("raphael");
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdir();
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo69208a(String str) {
        int i;
        int i2;
        if (TextUtils.isEmpty(str)) {
            i = Raphael.MAP64_MODE | Raphael.ALLOC_MODE;
            i2 = Raphael.DIFF_CACHE;
        } else {
            try {
                return Integer.decode(str).intValue();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                i = Raphael.MAP64_MODE | Raphael.ALLOC_MODE;
                i2 = Raphael.DIFF_CACHE;
            }
        }
        return i | i2 | 983040 | 4096;
    }

    public void onReceive(Context context, Intent intent) {
        PrintStream printStream = System.err;
        printStream.println("RAPHAEL >>> onReceived: " + intent);
        String action = intent.getAction();
        if ("com.bytedance.raphael.ACTION_START".equals(action)) {
            Raphael.start(mo69208a(intent.getStringExtra("configs")), mo69209a(context), intent.getStringExtra("regex"));
        } else if ("com.bytedance.raphael.ACTION_STOP".equals(action)) {
            Raphael.stop();
        } else if ("com.bytedance.raphael.ACTION_PRINT".equals(action)) {
            Raphael.print();
        }
    }
}
