package com.bytedance.monitor.collector;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.monitor.collector.i */
public class C20149i {

    /* renamed from: a */
    private static MessageQueue f49220a;

    /* renamed from: b */
    private static Field f49221b;

    /* renamed from: c */
    private static Field f49222c;

    /* renamed from: a */
    public static MessageQueue m73522a() {
        if (f49220a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f49220a = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                f49220a = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f49220a = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return f49220a;
    }

    /* renamed from: a */
    protected static Message m73520a(Message message) {
        Field field = f49222c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f49222c = declaredField;
                declaredField.setAccessible(true);
                return (Message) f49222c.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Message m73521a(MessageQueue messageQueue) {
        Field field = f49221b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f49221b = declaredField;
                declaredField.setAccessible(true);
                return (Message) f49221b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }
}
