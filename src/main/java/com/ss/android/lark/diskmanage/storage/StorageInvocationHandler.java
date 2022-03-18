package com.ss.android.lark.diskmanage.storage;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.diskmanage.storage.Storage;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J4\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0010J'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/diskmanage/storage/StorageInvocationHandler;", "Ljava/lang/reflect/InvocationHandler;", "context", "Landroid/content/Context;", "bizRootDictionary", "", "(Landroid/content/Context;Ljava/lang/String;)V", "mBizRootDictionary", "mContext", "invoke", "proxy", "", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/String;", "parseStorageAnnotation", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/String;", "Companion", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.storage.a */
public final class StorageInvocationHandler implements InvocationHandler {

    /* renamed from: a */
    public static final Companion f94663a = new Companion(null);

    /* renamed from: b */
    private final Context f94664b;

    /* renamed from: c */
    private final String f94665c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/diskmanage/storage/StorageInvocationHandler$Companion;", "", "()V", "composeStoragePath", "", "context", "Landroid/content/Context;", "bizRootDictionary", "bizChildPath", ShareHitPoint.f121869d, "Lcom/ss/android/lark/diskmanage/storage/Storage$Type;", "args", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/diskmanage/storage/Storage$Type;[Ljava/lang/Object;)Ljava/lang/String;", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.diskmanage.storage.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo135700a(Context context, String str, String str2, Storage.Type type, Object[] objArr) {
            String str3;
            boolean z;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "bizRootDictionary");
            Intrinsics.checkParameterIsNotNull(str2, "bizChildPath");
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            int i = C36833b.f94666a[type.ordinal()];
            if (i == 1) {
                str3 = StoragePathUtils.f94669a.mo135725W(context) + File.separator;
            } else if (i == 2) {
                str3 = StoragePathUtils.f94669a.mo135724V(context) + File.separator;
            } else if (i == 3) {
                str3 = StoragePathUtils.f94669a.mo135728Z(context) + File.separator;
            } else if (i == 4) {
                str3 = StoragePathUtils.f94669a.mo135727Y(context) + File.separator;
            } else if (i == 5) {
                str3 = StoragePathUtils.f94669a.mo135729a(context);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String str4 = str3 + str;
            if (!TextUtils.isEmpty(str2)) {
                str4 = str4 + File.separator + str2;
            }
            if (objArr != null) {
                if (objArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (Object obj : objArr) {
                        str4 = str4 + File.separator + obj;
                    }
                }
            }
            return str4;
        }
    }

    public StorageInvocationHandler(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "bizRootDictionary");
        this.f94664b = context;
        this.f94665c = str;
    }

    /* renamed from: a */
    private final String m145310a(Method method, Object[] objArr) {
        Annotation[] annotations = method.getAnnotations();
        Intrinsics.checkExpressionValueIsNotNull(annotations, "method.annotations");
        for (Annotation annotation : annotations) {
            if ((annotation instanceof Storage) && Intrinsics.areEqual(method.getReturnType(), String.class)) {
                Storage storage = (Storage) annotation;
                return f94663a.mo135700a(this.f94664b, this.f94665c, storage.bizChildPath(), storage.type(), objArr);
            }
        }
        return "";
    }

    /* renamed from: a */
    public String invoke(Object obj, Method method, Object[] objArr) {
        if (method != null) {
            return m145310a(method, objArr);
        }
        return "";
    }
}
