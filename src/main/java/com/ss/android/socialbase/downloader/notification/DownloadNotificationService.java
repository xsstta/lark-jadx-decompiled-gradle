package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.socialbase.downloader.constants.C59996b;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.ArrayList;

public class DownloadNotificationService extends Service {

    /* renamed from: a */
    public static volatile long f150081a = 0;

    /* renamed from: b */
    public static boolean f150082b = false;

    /* renamed from: c */
    public static long f150083c = 900;

    /* renamed from: e */
    private static final String f150084e = "DownloadNotificationService";

    /* renamed from: f */
    private static int f150085f = -1;

    /* renamed from: g */
    private static int f150086g = -1;

    /* renamed from: h */
    private static boolean f150087h = true;

    /* renamed from: i */
    private static boolean f150088i;

    /* renamed from: j */
    private static volatile long f150089j;

    /* renamed from: d */
    public Handler f150090d;

    /* renamed from: k */
    private HandlerThread f150091k;

    /* renamed from: a */
    public static HandlerThread m233703a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        HandlerThread handlerThread = this.f150091k;
        if (handlerThread != null) {
            try {
                handlerThread.quit();
            } catch (Throwable unused) {
            }
            this.f150091k = null;
            this.f150090d = null;
        }
    }

    /* renamed from: a */
    private void m233704a() {
        if (this.f150091k == null) {
            HandlerThread a = m233703a("DownloaderNotifyThread");
            this.f150091k = a;
            a.start();
            this.f150090d = new Handler(this.f150091k.getLooper());
        }
    }

    public void onCreate() {
        super.onCreate();
        m233704a();
        C60046b.m232958a(this);
        C60148a c = C60148a.m233727c();
        int a = c.mo205470a("download_service_foreground", 0);
        if ((a == 1 || a == 3) && f150085f == -1) {
            f150085f = 0;
        }
        if ((a == 2 || a == 3) && f150086g == -1) {
            f150086g = 0;
        }
        f150088i = c.mo205475b("non_going_notification_foreground", false);
        f150082b = c.mo205475b("notify_too_fast", false);
        long a2 = c.mo205471a("notification_time_window", 900L);
        f150083c = a2;
        if (a2 < 0 || a2 > 1200) {
            f150083c = 900;
        }
    }

    /* renamed from: a */
    private void m233705a(final Intent intent) {
        Handler handler;
        if (intent != null) {
            final String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && (handler = this.f150090d) != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.socialbase.downloader.notification.DownloadNotificationService.RunnableC601431 */

                    public void run() {
                        ConnectivityManager connectivityManager;
                        NetworkInfo activeNetworkInfo;
                        long j;
                        final NotificationManager notificationManager = (NotificationManager) DownloadNotificationService.this.getSystemService("notification");
                        final int intExtra = intent.getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
                        if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
                            AbstractC60146a c = C60147b.m233714a().mo205468c(intExtra);
                            if (c != null) {
                                final Notification c2 = c.mo205464c();
                                int intExtra2 = intent.getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
                                if (intExtra != 0 && c2 != null && notificationManager != null) {
                                    if (intExtra2 == 4) {
                                        if (Downloader.getInstance(C60046b.m232945G()).isDownloading(intExtra)) {
                                            DownloadInfo downloadInfo = Downloader.getInstance(C60046b.m232945G()).getDownloadInfo(intExtra);
                                            if (DownloadNotificationService.f150082b) {
                                                if (downloadInfo != null && downloadInfo.canNotifyProgress() && System.currentTimeMillis() - DownloadNotificationService.f150081a > DownloadNotificationService.f150083c) {
                                                    DownloadNotificationService.this.mo205453b(notificationManager, intExtra, c2);
                                                    downloadInfo.setLastNotifyProgressTime();
                                                }
                                            } else if (downloadInfo != null && downloadInfo.canNotifyProgress()) {
                                                DownloadNotificationService.this.mo205453b(notificationManager, intExtra, c2);
                                                downloadInfo.setLastNotifyProgressTime();
                                            }
                                        }
                                    } else if (intExtra2 == -2 || intExtra2 == -3) {
                                        if (DownloadNotificationService.f150082b) {
                                            DownloadNotificationService.this.mo205452a(notificationManager, intExtra, c2);
                                        } else if (DownloadNotificationService.this.f150090d != null) {
                                            Handler handler = DownloadNotificationService.this.f150090d;
                                            RunnableC601441 r6 = new Runnable() {
                                                /* class com.ss.android.socialbase.downloader.notification.DownloadNotificationService.RunnableC601431.RunnableC601441 */

                                                public void run() {
                                                    DownloadNotificationService.this.mo205453b(notificationManager, intExtra, c2);
                                                }
                                            };
                                            if (intExtra2 == -2) {
                                                j = 50;
                                            } else {
                                                j = 200;
                                            }
                                            handler.postDelayed(r6, j);
                                        }
                                    } else if (DownloadNotificationService.f150082b) {
                                        DownloadNotificationService.this.mo205452a(notificationManager, intExtra, c2);
                                    } else {
                                        DownloadNotificationService.this.mo205453b(notificationManager, intExtra, c2);
                                    }
                                }
                            }
                        } else if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
                            if (intExtra != 0) {
                                DownloadNotificationService.this.mo205451a(notificationManager, intExtra);
                            }
                        } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                            try {
                                if (C60161d.m233773a(DownloadNotificationService.this, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) DownloadNotificationService.this.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                                    if (activeNetworkInfo.isConnected()) {
                                        ArrayList arrayList = new ArrayList();
                                        if (!TextUtils.isEmpty(C59996b.f149579a)) {
                                            arrayList.add(C59996b.f149579a);
                                        }
                                        arrayList.add("mime_type_plg");
                                        Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                                        if (applicationContext != null) {
                                            Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                            Downloader.getInstance(applicationContext).restartAllPauseReserveOnWifiDownloadTasks(arrayList);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                            try {
                                Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private boolean m233706a(int i, Notification notification) {
        int i2;
        int i3;
        if (!f150087h || (i2 = f150085f) == i || (i3 = f150086g) == i) {
            return false;
        }
        if (i2 != 0 && i3 != 0) {
            return false;
        }
        if (f150088i && (notification.flags & 2) == 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26 || !TextUtils.isEmpty(notification.getChannelId())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c3 A[Catch:{ all -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo205451a(android.app.NotificationManager r10, int r11) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.mo205451a(android.app.NotificationManager, int):void");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m233705a(intent);
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c A[Catch:{ all -> 0x0080 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo205453b(android.app.NotificationManager r6, int r7, android.app.Notification r8) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.notification.DownloadNotificationService.mo205453b(android.app.NotificationManager, int, android.app.Notification):void");
    }

    /* renamed from: a */
    public void mo205452a(final NotificationManager notificationManager, final int i, final Notification notification) {
        long currentTimeMillis = f150083c - (System.currentTimeMillis() - f150089j);
        if (currentTimeMillis <= 0) {
            currentTimeMillis = 0;
        }
        if (currentTimeMillis > 20000) {
            currentTimeMillis = 20000;
        }
        long currentTimeMillis2 = System.currentTimeMillis() + currentTimeMillis;
        f150081a = currentTimeMillis2;
        f150089j = currentTimeMillis2;
        if (currentTimeMillis <= 0) {
            mo205453b(notificationManager, i, notification);
            return;
        }
        Handler handler = this.f150090d;
        if (handler != null) {
            handler.postDelayed(new Runnable() {
                /* class com.ss.android.socialbase.downloader.notification.DownloadNotificationService.RunnableC601452 */

                public void run() {
                    DownloadNotificationService.this.mo205453b(notificationManager, i, notification);
                }
            }, currentTimeMillis);
        }
    }
}
