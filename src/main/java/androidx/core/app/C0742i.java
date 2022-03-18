package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.app.i */
public class C0742i {

    /* renamed from: a */
    private static final Object f3098a = new Object();

    /* renamed from: b */
    private static Field f3099b;

    /* renamed from: c */
    private static boolean f3100c;

    /* renamed from: d */
    private static final Object f3101d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m3614a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static Bundle[] m3615a(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            bundleArr[i] = m3613a(remoteInputArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: a */
    public static Bundle m3611a(Notification notification) {
        synchronized (f3098a) {
            if (f3100c) {
                return null;
            }
            try {
                if (f3099b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f3100c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f3099b = declaredField;
                }
                Bundle bundle = (Bundle) f3099b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f3099b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f3100c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f3100c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    static Bundle m3612a(NotificationCompat.Action action) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat b = action.mo4111b();
        if (b != null) {
            i = b.mo4300c();
        } else {
            i = 0;
        }
        bundle2.putInt("icon", i);
        bundle2.putCharSequence("title", action.mo4112c());
        bundle2.putParcelable("actionIntent", action.mo4113d());
        if (action.mo4114e() != null) {
            bundle = new Bundle(action.mo4114e());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.mo4115f());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m3615a(action.mo4116g()));
        bundle2.putBoolean("showsUserInterface", action.mo4120k());
        bundle2.putInt("semanticAction", action.mo4117h());
        return bundle2;
    }

    /* renamed from: a */
    private static Bundle m3613a(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", remoteInput.mo4222a());
        bundle.putCharSequence("label", remoteInput.mo4223b());
        bundle.putCharSequenceArray("choices", remoteInput.mo4224c());
        bundle.putBoolean("allowFreeFormInput", remoteInput.mo4226e());
        bundle.putBundle("extras", remoteInput.mo4228g());
        Set<String> d = remoteInput.mo4225d();
        if (d != null && !d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d.size());
            for (String str : d) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m3610a(Notification.Builder builder, NotificationCompat.Action action) {
        int i;
        IconCompat b = action.mo4111b();
        if (b != null) {
            i = b.mo4300c();
        } else {
            i = 0;
        }
        builder.addAction(i, action.mo4112c(), action.mo4113d());
        Bundle bundle = new Bundle(action.mo4114e());
        if (action.mo4116g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m3615a(action.mo4116g()));
        }
        if (action.mo4119j() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m3615a(action.mo4119j()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.mo4115f());
        return bundle;
    }
}
