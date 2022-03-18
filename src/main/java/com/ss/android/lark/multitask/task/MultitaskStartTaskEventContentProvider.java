package com.ss.android.lark.multitask.task;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.log.Log;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J1\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016JO\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\f\u001a\u00020\r2\u0010\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u001eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/multitask/task/MultitaskStartTaskEventContentProvider;", "Landroid/content/ContentProvider;", "()V", "newlyStartedTaskProcessName", "", "call", "Landroid/os/Bundle;", "method", "arg", "extras", "delete", "", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultitaskStartTaskEventContentProvider extends ContentProvider {

    /* renamed from: a */
    public static Uri f121777a;

    /* renamed from: b */
    public static final Companion f121778b = new Companion(null);

    /* renamed from: c */
    private String f121779c;

    public int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return 0;
    }

    public String getType(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J$\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/multitask/task/MultitaskStartTaskEventContentProvider$Companion;", "", "()V", "KEY_PROCESS_NAME", "", "METHOD_GET_NEWLY_STARTED_TASK_PROCESS", "METHOD_NOTIFY_TASK_STARTS", "TAG", "sContentURI", "Landroid/net/Uri;", "getContentURI", "context", "Landroid/content/Context;", "getNewlyStartedTaskProcess", "notifyTaskStarts", "", "processName", "registerContentObserver", "contentObserver", "Landroid/database/ContentObserver;", "safeCall", "Landroid/os/Bundle;", "method", "extras", "unregisterContentObserver", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.task.MultitaskStartTaskEventContentProvider$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: b */
        public final String mo169130b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Bundle a = m190721a(context, "method_get_newly_started_task_process", null);
            if (a != null) {
                return a.getString("key_process_name");
            }
            return null;
        }

        /* renamed from: a */
        public final Uri mo169127a(Context context) {
            Uri uri = MultitaskStartTaskEventContentProvider.f121777a;
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://" + context.getPackageName() + ".provider.multitask_start_task");
            MultitaskStartTaskEventContentProvider.f121777a = parse;
            Intrinsics.checkExpressionValueIsNotNull(parse, "contentUri");
            return parse;
        }

        /* renamed from: a */
        public final void mo169128a(Context context, ContentObserver contentObserver) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(contentObserver, "contentObserver");
            context.getContentResolver().registerContentObserver(mo169127a(context), true, contentObserver);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo169129a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "processName");
            Bundle bundle = new Bundle();
            bundle.putString("key_process_name", str);
            m190721a(context, "method_notify_task_starts", bundle);
        }

        /* renamed from: a */
        private final Bundle m190721a(Context context, String str, Bundle bundle) {
            try {
                return context.getContentResolver().call(mo169127a(context), str, "", bundle);
            } catch (Exception e) {
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                String format = String.format("call method %s failed: %s", Arrays.copyOf(new Object[]{str, e.getMessage()}, 2));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                Log.m165383e("MultitaskStartTaskEventContentProvider", format);
                return null;
            }
        }
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "method");
        if (Intrinsics.areEqual(str, "method_notify_task_starts")) {
            Context context = getContext();
            if (context != null) {
                if (bundle != null) {
                    str3 = bundle.getString("key_process_name");
                } else {
                    str3 = null;
                }
                this.f121779c = str3;
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver != null) {
                    contentResolver.notifyChange(f121778b.mo169127a(context), null);
                }
            }
        } else if (Intrinsics.areEqual(str, "method_get_newly_started_task_process")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("key_process_name", this.f121779c);
            return bundle2;
        }
        return null;
    }
}
