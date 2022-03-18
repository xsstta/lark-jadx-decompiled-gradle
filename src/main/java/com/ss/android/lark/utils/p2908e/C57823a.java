package com.ss.android.lark.utils.p2908e;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.entity.NotificationParam;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.utils.e.a */
public class C57823a {

    /* renamed from: a */
    private static C57823a f142425a;

    /* renamed from: b */
    private final Context f142426b;

    /* renamed from: c */
    private final NotificationManager f142427c;

    /* renamed from: d */
    private final Map<Integer, String> f142428d = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo196175a(String str, String str2, String str3, Uri uri, boolean z) {
        int i;
        if (this.f142427c.getNotificationChannel(str) == null) {
            if (TextUtils.equals(str, "progress")) {
                i = 2;
            } else {
                i = TextUtils.equals(str, "vc_foreground") ? 3 : 4;
            }
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            notificationChannel.enableVibration(z);
            notificationChannel.setSound(uri, null);
            notificationChannel.setDescription(str3);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-16776961);
            this.f142427c.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: a */
    public void mo196173a() {
        try {
            this.f142427c.cancelAll();
            this.f142428d.clear();
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public NotificationChannel mo196172a(String str) {
        return this.f142427c.getNotificationChannel(str);
    }

    /* renamed from: b */
    public void mo196177b(String str) {
        try {
            this.f142427c.deleteNotificationChannel(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private C57823a(Context context) {
        this.f142426b = context.getApplicationContext();
        this.f142427c = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public static C57823a m224448a(Context context) {
        if (f142425a == null) {
            synchronized (C57823a.class) {
                f142425a = new C57823a(context);
            }
        }
        return f142425a;
    }

    /* renamed from: a */
    public static Bitmap m224446a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        float sqrt = (float) Math.sqrt((double) (32768.0f / ((float) byteArrayOutputStream.toByteArray().length)));
        Matrix matrix = new Matrix();
        matrix.setScale(sqrt, sqrt);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        byteArrayOutputStream.reset();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        Bitmap bitmap2 = createBitmap;
        while (byteArrayOutputStream.toByteArray().length > 32768) {
            matrix.setScale(0.9f, 0.9f);
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            byteArrayOutputStream.reset();
            bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        }
        return BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.toByteArray().length);
    }

    /* renamed from: b */
    public void mo196176b(NotificationParam notificationParam) {
        int a = notificationParam.mo169555a();
        NotificationCompat.Builder a2 = m224447a(notificationParam.mo169557c(), notificationParam.mo169558d(), notificationParam.mo169559e(), notificationParam.mo169560f(), notificationParam.mo169561g(), notificationParam.mo169562h(), false, notificationParam.mo169567m(), null, "progress");
        a2.setPriority(0);
        int o = notificationParam.mo169569o();
        if (o < 0) {
            a2.setContentText(UIUtils.getString(this.f142426b, R.string.Lark_Legacy_FileDownloading)).setProgress(100, 0, false);
        } else if (o < 100) {
            a2.setProgress(100, o, false);
        } else {
            a2.setContentText(UIUtils.getString(this.f142426b, R.string.Lark_Legacy_FileDownloaded)).setProgress(0, 0, false);
        }
        this.f142427c.notify(a, a2.build());
    }

    /* renamed from: b */
    public boolean mo196178b(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.m165383e("NotificationUtil", "judge notification show fail " + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public Notification mo196171a(NotificationParam notificationParam) {
        NotificationCompat.Builder a = m224447a(notificationParam.mo169557c(), notificationParam.mo169558d(), notificationParam.mo169559e(), notificationParam.mo169560f(), notificationParam.mo169561g(), notificationParam.mo169562h(), notificationParam.mo169566l(), notificationParam.mo169567m(), notificationParam.mo169568n(), notificationParam.mo169570p());
        a.setPriority(2);
        if (!TextUtils.isEmpty(notificationParam.mo169563i())) {
            a.setSubText(notificationParam.mo169563i());
        }
        NotificationCompat.C0727c cVar = new NotificationCompat.C0727c();
        cVar.mo4217b(notificationParam.mo169562h());
        if (!TextUtils.isEmpty(notificationParam.mo169564j())) {
            cVar.mo4216a(notificationParam.mo169564j());
        }
        a.setStyle(cVar);
        Notification build = a.build();
        m224449a(notificationParam, build, notificationParam.mo169565k());
        return build;
    }

    /* renamed from: a */
    public void mo196174a(int i) {
        try {
            if (this.f142428d.containsKey(Integer.valueOf(i))) {
                this.f142427c.cancel(i);
            }
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    private void m224449a(NotificationParam notificationParam, Notification notification, int i) {
        String str;
        if (i == 0) {
            try {
                this.f142427c.notify(notificationParam.mo169555a(), notification);
                if (notificationParam.mo169556b() != null) {
                    this.f142428d.put(Integer.valueOf(notificationParam.mo169555a()), notificationParam.mo169556b());
                }
            } catch (Exception unused) {
                Log.m165383e("NotificationUtil", "notify notification failed");
            }
        } else if (i == 1 && (str = this.f142428d.get(Integer.valueOf(notificationParam.mo169555a()))) != null && str.equals(notificationParam.mo169556b())) {
            this.f142427c.notify(notificationParam.mo169555a(), notification);
            if (notificationParam.mo169556b() != null) {
                this.f142428d.put(Integer.valueOf(notificationParam.mo169555a()), notificationParam.mo169556b());
            }
        }
    }

    /* renamed from: a */
    private NotificationCompat.Builder m224447a(PendingIntent pendingIntent, int i, Bitmap bitmap, String str, String str2, String str3, boolean z, boolean z2, Uri uri, String str4) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.f142426b);
        if (pendingIntent != null) {
            builder.setContentIntent(pendingIntent);
        }
        if (i != -1) {
            builder.setSmallIcon(i);
        }
        if (bitmap != null) {
            builder.setLargeIcon(m224446a(bitmap));
        }
        if (!TextUtils.isEmpty(str)) {
            builder.setTicker(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setContentTitle(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.setContentText(str3);
        }
        builder.setWhen(System.currentTimeMillis());
        builder.setAutoCancel(true);
        if (C26326z.m95343g()) {
            builder.setChannelId(str4);
        } else {
            int i2 = 0;
            if (z) {
                i2 = 2;
            } else {
                builder.setVibrate(new long[]{0});
            }
            if (z2) {
                i2 |= 4;
            }
            builder.setSound(uri);
            builder.setDefaults(i2);
        }
        return builder;
    }
}
