package com.bytedance.ies.xbridge.base.runtime.permission;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions;", "", "()V", "BaseImpl", "Callback", "Companion", "Impl", "MarshmallowImpl", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.base.runtime.permission.a */
public final class Permissions {

    /* renamed from: a */
    public static Impl f37999a;

    /* renamed from: b */
    public static final Companion f38000b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$BaseImpl;", "Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Impl;", "()V", "requestPermissions", "", "activity", "Landroid/app/Activity;", "permissions", "", "", "callback", "Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;", "(Landroid/app/Activity;[Ljava/lang/String;Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;)V", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.permission.a$a */
    public static final class BaseImpl implements Impl {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;", "", "onRequestPermissionResult", "", "grantResults", "", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.permission.a$b */
    public interface Callback {
        /* renamed from: a */
        void mo53063a(int[] iArr);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Impl;", "", "requestPermissions", "", "activity", "Landroid/app/Activity;", "permissions", "", "", "callback", "Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;", "(Landroid/app/Activity;[Ljava/lang/String;Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;)V", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.permission.a$d */
    private interface Impl {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$MarshmallowImpl;", "Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Impl;", "()V", "requestPermissions", "", "activity", "Landroid/app/Activity;", "permissions", "", "", "callback", "Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;", "(Landroid/app/Activity;[Ljava/lang/String;Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;)V", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.permission.a$e */
    public static final class MarshmallowImpl implements Impl {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Companion;", "", "()V", "IMPL", "Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Impl;", "requestPermissions", "", "activity", "Landroid/app/Activity;", "permissions", "", "", "callback", "Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;", "(Landroid/app/Activity;[Ljava/lang/String;Lcom/bytedance/ies/xbridge/base/runtime/permission/Permissions$Callback;)V", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.permission.a$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Impl dVar;
        if (Build.VERSION.SDK_INT >= 23) {
            dVar = new MarshmallowImpl();
        } else {
            dVar = new BaseImpl();
        }
        f37999a = dVar;
    }
}
