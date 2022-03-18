package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/AppRouterBuilder;", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IAppRouterBuilder;", "path", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "open", "", "requestCode", "", "openActivity", "openForActivity", "", "activity", "Landroid/app/Activity;", "param", "bundle", "Landroid/os/Bundle;", "key", "", "value", "Ljava/io/Serializable;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.a */
public final class AppRouterBuilder implements AbstractC30023a {

    /* renamed from: a */
    private final Class<?> f100464a;

    /* renamed from: b */
    private final Intent f100465b = new Intent();

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a
    /* renamed from: b */
    public boolean mo108156b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return mo108155a(context, -1);
    }

    public AppRouterBuilder(Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "path");
        this.f100464a = cls;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a
    /* renamed from: a */
    public Intent mo108150a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f100465b.setComponent(new ComponentName(context, this.f100464a));
        this.f100465b.setPackage(context.getPackageName());
        return this.f100465b;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a
    /* renamed from: a */
    public AbstractC30023a mo108151a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        this.f100465b.putExtras(bundle);
        return this;
    }

    /* renamed from: a */
    private final void m154515a(Activity activity, int i) {
        if (i > 0) {
            activity.startActivityForResult(this.f100465b, i);
        } else {
            activity.startActivity(this.f100465b);
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a
    /* renamed from: a */
    public AbstractC30023a mo108152a(String str, Serializable serializable) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(serializable, "value");
        this.f100465b.putExtra(str, serializable);
        return this;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a
    /* renamed from: a */
    public AbstractC30023a mo108153a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        this.f100465b.putExtra(str, str2);
        return this;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a
    /* renamed from: a */
    public AbstractC30023a mo108154a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f100465b.putExtra(str, z);
        return this;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a
    /* renamed from: a */
    public boolean mo108155a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f100465b.setComponent(new ComponentName(context, this.f100464a));
        this.f100465b.setPackage(context.getPackageName());
        return m154516a(context, this.f100465b, i);
    }

    /* renamed from: a */
    private final boolean m154516a(Context context, Intent intent, int i) {
        if (context instanceof Activity) {
            m154515a((Activity) context, i);
            return true;
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
        return true;
    }
}
