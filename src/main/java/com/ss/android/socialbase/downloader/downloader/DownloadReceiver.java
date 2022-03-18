package com.ss.android.socialbase.downloader.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import com.ss.android.socialbase.downloader.p3025b.C59990a;

public class DownloadReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f149667a = "DownloadReceiver";

    /* renamed from: a */
    private void m232919a(Context context, String str) {
        if (C60046b.m232939A()) {
            try {
                Intent intent = new Intent(context, DownloadNotificationService.class);
                intent.setAction(str);
                context.startService(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m232920b(Context context, String str) {
        try {
            Intent intent = new Intent(context, DownloadNotificationService.class);
            intent.setAction(str);
            context.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    if (C59990a.m232836a()) {
                        C59990a.m232834a(f149667a, "Received broadcast intent for android.net.conn.CONNECTIVITY_CHANGE");
                    }
                    m232919a(context, action);
                } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    m232920b(context, action);
                }
            }
        }
    }
}
