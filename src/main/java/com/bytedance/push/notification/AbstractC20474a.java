package com.bytedance.push.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.push.C20386c;
import com.bytedance.push.PushBody;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.utils.C20549a;
import com.larksuite.suite.R;
import java.io.File;

/* renamed from: com.bytedance.push.notification.a */
public abstract class AbstractC20474a {

    /* renamed from: com.bytedance.push.notification.a$a */
    public interface AbstractC20476a {
        /* renamed from: a */
        void mo68966a();

        /* renamed from: a */
        void mo68967a(Bitmap bitmap);
    }

    /* renamed from: a */
    public abstract void mo68963a(String str, AbstractC20476a aVar);

    /* renamed from: b */
    public abstract Intent mo68965b(Context context, int i, PushBody pushBody);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68961a(final Context context, final int i, final PushBody pushBody) {
        if (pushBody != null) {
            ILogger logger = PushSupporter.logger();
            logger.mo68949d("Show", "show message :" + pushBody.f49734b);
            if (pushBody.f49747o == 0 || TextUtils.isEmpty(pushBody.f49746n)) {
                mo68962a(context, i, pushBody, (Bitmap) null);
            } else {
                mo68963a(pushBody.f49746n, new AbstractC20476a() {
                    /* class com.bytedance.push.notification.AbstractC20474a.C204751 */

                    @Override // com.bytedance.push.notification.AbstractC20474a.AbstractC20476a
                    /* renamed from: a */
                    public void mo68966a() {
                        AbstractC20474a.this.mo68962a(context, i, pushBody, (Bitmap) null);
                    }

                    @Override // com.bytedance.push.notification.AbstractC20474a.AbstractC20476a
                    /* renamed from: a */
                    public void mo68967a(Bitmap bitmap) {
                        AbstractC20474a.this.mo68962a(context, i, pushBody, bitmap);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private static Notification m74520a(Notification.Builder builder, String str, String str2, Bitmap bitmap) {
        builder.setContentTitle(str).setContentText(str2).setLargeIcon(bitmap);
        return builder.build();
    }

    /* renamed from: a */
    private Notification m74517a(Notification.Builder builder, Context context, PushBody pushBody, Bitmap bitmap) {
        if (builder == null || context == null || pushBody == null) {
            return null;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            pushBody.f49747o = 0;
        }
        int i = pushBody.f49747o;
        if (i == 0) {
            return m74518a(builder, context, pushBody.f49745m, pushBody.f49744l);
        }
        if (i == 1) {
            return m74519a(builder, context, pushBody.f49745m, pushBody.f49744l, bitmap);
        }
        if (i != 2) {
            return m74518a(builder, context, pushBody.f49745m, pushBody.f49744l);
        }
        return m74520a(builder, pushBody.f49745m, pushBody.f49744l, bitmap);
    }

    /* renamed from: a */
    private static Notification m74518a(Notification.Builder builder, Context context, String str, String str2) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeResource(context.getResources(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon);
        } catch (Exception unused) {
            bitmap = null;
        }
        Notification.Builder contentText = builder.setContentTitle(str).setContentText(str2);
        if (Build.VERSION.SDK_INT >= 16) {
            contentText.setStyle(new Notification.BigTextStyle().bigText(str2));
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            contentText = contentText.setLargeIcon(bitmap);
        }
        return contentText.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Notification mo68964b(Context context, int i, PushBody pushBody, Bitmap bitmap) {
        Notification.Builder builder;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (StringUtils.isEmpty(pushBody.f49745m)) {
                pushBody.f49745m = context.getString(packageInfo.applicationInfo.labelRes);
            }
            String a = pushBody.mo68710a();
            if (!C20494h.m74563a(context, a)) {
                a = "push";
            }
            if (Build.VERSION.SDK_INT >= 26) {
                builder = new Notification.Builder(context, a);
            } else {
                builder = new Notification.Builder(context);
            }
            long currentTimeMillis = System.currentTimeMillis();
            builder.setTicker(pushBody.f49745m).setAutoCancel(true);
            builder.setWhen(currentTimeMillis);
            builder.setShowWhen(pushBody.f49737e);
            if (Build.VERSION.SDK_INT <= 20) {
                builder.setSmallIcon(R.drawable.status_icon);
            } else if (Build.VERSION.SDK_INT < 29 || !Build.MANUFACTURER.equalsIgnoreCase("oppo")) {
                builder.setSmallIcon(R.drawable.status_icon_l);
            } else {
                builder.setSmallIcon(R.drawable.status_icon);
            }
            if (pushBody.f49749q) {
                builder.setLights(-16711936, 1000, 2500);
            }
            if (Build.VERSION.SDK_INT > 20) {
                builder.setPriority(1);
                builder.setVibrate(new long[0]);
            }
            Notification a2 = m74517a(builder, context, pushBody, bitmap);
            if (pushBody.f49750r) {
                a2.defaults |= 1;
            }
            if (pushBody.f49751s) {
                try {
                    int ringerMode = ((AudioManager) context.getSystemService("audio")).getRingerMode();
                    if (ringerMode == 1 || ringerMode == 2) {
                        a2.defaults |= 2;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return a2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo68962a(Context context, int i, PushBody pushBody, Bitmap bitmap) {
        int i2;
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Intent b = mo68965b(context, i, pushBody);
            if (b != null) {
                if (pushBody.f49742j) {
                    Notification b2 = mo68964b(context, i, pushBody, bitmap);
                    if (b2 != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            try {
                                String a = C20549a.m74837a(context, pushBody.mo68710a());
                                if (new File(a).exists()) {
                                    b2.sound = C20549a.m74840b(context, a);
                                } else {
                                    C20386c configuration = PushSupporter.get().getConfiguration();
                                    if (configuration != null) {
                                        i2 = C20549a.m74835a(pushBody.mo68710a(), configuration.f49776G, null);
                                    } else {
                                        i2 = -1;
                                    }
                                    if (i2 != -1) {
                                        b2.sound = C20549a.m74836a(context, i2);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        int i3 = (int) (pushBody.f49734b % 2147483647L);
                        b2.contentIntent = PendingIntent.getActivity(context, i3, b, 134217728);
                        notificationManager.notify("app_notify", i3, b2);
                        ILogger logger = PushSupporter.logger();
                        logger.mo68949d("Show", "show notification finish. " + pushBody.f49734b);
                        return;
                    }
                    return;
                }
                context.startActivity(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Notification m74519a(Notification.Builder builder, Context context, String str, String str2, Bitmap bitmap) {
        Bitmap bitmap2;
        try {
            bitmap2 = BitmapFactory.decodeResource(context.getResources(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon);
        } catch (Exception unused) {
            bitmap2 = null;
        }
        Notification.Builder contentText = builder.setContentTitle(str).setContentText(str2);
        if (Build.VERSION.SDK_INT >= 16) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle().bigPicture(bitmap).setSummaryText(str2).setBigContentTitle(str);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bigContentTitle = bigContentTitle.bigLargeIcon(bitmap2);
            }
            contentText.setStyle(bigContentTitle).setLargeIcon(bitmap);
        }
        return contentText.build();
    }
}
