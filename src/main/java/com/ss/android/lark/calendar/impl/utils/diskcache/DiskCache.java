package com.ss.android.lark.calendar.impl.utils.diskcache;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J#\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ&\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/DiskCache;", "", "()V", "checkPathExist", "", "path", "", "getCalendarPath", "context", "Landroid/content/Context;", "syncRestoreFromDiskCache", "T", "fileName", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "syncSaveToDiskCache", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/io/Serializable;", "uerId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.diskcache.c */
public final class DiskCache {

    /* renamed from: a */
    public static final DiskCache f83772a = new DiskCache();

    private DiskCache() {
    }

    /* renamed from: a */
    private final void m125302a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    private final String m125301a(Context context) {
        StringBuilder sb = new StringBuilder();
        File filesDir = context.getFilesDir();
        Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.filesDir");
        sb.append(filesDir.getPath());
        sb.append(File.separator);
        sb.append("calendar");
        return sb.toString();
    }

    /* renamed from: a */
    public final <T> T mo120342a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(m125301a(context) + File.separator + str));
            Object readObject = objectInputStream.readObject();
            if (!(readObject instanceof CalendarSealedObj)) {
                readObject = null;
            }
            CalendarSealedObj calendarSealedObj = (CalendarSealedObj) readObject;
            T t = calendarSealedObj != null ? (T) calendarSealedObj.getObject() : null;
            if (!(t instanceof Object)) {
                t = null;
            }
            objectInputStream.close();
            return t;
        } catch (FileNotFoundException unused) {
            Log.m165389i("CalendarDiskCache", "calendar restore disk no file");
            return null;
        } catch (Exception e) {
            Log.m165398w("CalendarDiskCache", "calendar restore disk error ", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo120343a(Context context, String str, Serializable serializable, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(serializable, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(str2, "uerId");
        String a = m125301a(context);
        m125302a(a);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(a + File.separator + str));
            objectOutputStream.writeObject(new CalendarSealedObj(serializable, str2));
            objectOutputStream.close();
        } catch (Exception e) {
            Log.m165384e("CalendarDiskCache", "calendar save disk error ", e);
        }
    }
}
