package com.ss.android.lark.diskmanage.storage;

import android.content.Context;
import com.ss.android.lark.diskmanage.storage.Storage;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/diskmanage/storage/StorageManager;", "", "()V", "Companion", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.storage.c */
public final class StorageManager {

    /* renamed from: a */
    public static final HashMap<Class<?>, Object> f94667a = new HashMap<>();

    /* renamed from: b */
    public static final Companion f94668b = new Companion(null);

    @Deprecated(message = "6.0 dynamic proxy crash")
    @JvmStatic
    /* renamed from: a */
    public static final <T> T m145313a(Context context, String str, Class<T> cls) {
        return (T) f94668b.mo135701a(context, str, cls);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H\u0007¢\u0006\u0002\u0010\u000eJC\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0013\"\u00020\fH\u0007¢\u0006\u0002\u0010\u0014R2\u0010\u0003\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u0001`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/diskmanage/storage/StorageManager$Companion;", "", "()V", "sProxyCache", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lkotlin/collections/HashMap;", "getStorage", "T", "context", "Landroid/content/Context;", "bizRootDictionary", "", "storage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "bizChildPath", ShareHitPoint.f121869d, "Lcom/ss/android/lark/diskmanage/storage/Storage$Type;", "paths", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/diskmanage/storage/Storage$Type;[Ljava/lang/String;)Ljava/lang/String;", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.diskmanage.storage.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "6.0 dynamic proxy crash")
        @JvmStatic
        /* renamed from: a */
        public final <T> T mo135701a(Context context, String str, Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "bizRootDictionary");
            Intrinsics.checkParameterIsNotNull(cls, "storage");
            if (StorageManager.f94667a.containsKey(cls)) {
                return (T) StorageManager.f94667a.get(cls);
            }
            StorageInvocationHandler aVar = new StorageInvocationHandler(context, str);
            T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, aVar);
            Intrinsics.checkExpressionValueIsNotNull(t, "Proxy.newProxyInstance(s…rrayOf(storage), handler)");
            StorageManager.f94667a.put(cls, t);
            return t;
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo135702a(Context context, String str, String str2, Storage.Type type, String... strArr) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "bizRootDictionary");
            Intrinsics.checkParameterIsNotNull(str2, "bizChildPath");
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(strArr, "paths");
            return StorageInvocationHandler.f94663a.mo135700a(context, str, str2, type, strArr);
        }
    }
}
