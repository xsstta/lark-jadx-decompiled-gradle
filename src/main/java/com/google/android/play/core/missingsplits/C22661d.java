package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.play.core.internal.C22630b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.missingsplits.d */
public final class C22661d implements AbstractC22658a {

    /* renamed from: a */
    private static final C22630b f56071a = new C22630b("MissingSplitsManagerImpl");

    /* renamed from: b */
    private final Context f56072b;

    /* renamed from: c */
    private final Runtime f56073c;

    /* renamed from: d */
    private final C22660c f56074d;

    /* renamed from: e */
    private final AtomicReference<Boolean> f56075e;

    C22661d(Context context, Runtime runtime, C22660c cVar, AtomicReference<Boolean> atomicReference) {
        this.f56072b = context;
        this.f56073c = runtime;
        this.f56074d = cVar;
        this.f56075e = atomicReference;
    }

    /* renamed from: b */
    private final List<ActivityManager.AppTask> m82485b() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f56072b.getSystemService("activity")).getAppTasks();
        return appTasks == null ? Collections.emptyList() : appTasks;
    }

    @Override // com.google.android.play.core.missingsplits.AbstractC22658a
    /* renamed from: a */
    public final boolean mo78969a() {
        boolean booleanValue;
        boolean z;
        boolean z2;
        Set set;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        synchronized (this.f56075e) {
            if (this.f56075e.get() == null) {
                AtomicReference<Boolean> atomicReference = this.f56075e;
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        ApplicationInfo applicationInfo = this.f56072b.getPackageManager().getApplicationInfo(this.f56072b.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT);
                        if (!(applicationInfo == null || applicationInfo.metaData == null || !Boolean.TRUE.equals(applicationInfo.metaData.get("com.android.vending.splits.required")))) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                try {
                                    PackageInfo packageInfo = this.f56072b.getPackageManager().getPackageInfo(this.f56072b.getPackageName(), 0);
                                    set = new HashSet();
                                    if (!(packageInfo == null || packageInfo.splitNames == null)) {
                                        Collections.addAll(set, packageInfo.splitNames);
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                    f56071a.mo78875d("App '%s' is not found in PackageManager", this.f56072b.getPackageName());
                                }
                                if (set.isEmpty() || (set.size() == 1 && set.contains(""))) {
                                    z2 = true;
                                    atomicReference.set(Boolean.valueOf(z2));
                                }
                            }
                            set = Collections.emptySet();
                            z2 = true;
                            atomicReference.set(Boolean.valueOf(z2));
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        f56071a.mo78875d("App '%s' is not found in the PackageManager", this.f56072b.getPackageName());
                    }
                }
                z2 = false;
                atomicReference.set(Boolean.valueOf(z2));
            }
            booleanValue = this.f56075e.get().booleanValue();
        }
        if (booleanValue) {
            Iterator<ActivityManager.AppTask> it = m82485b().iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityManager.AppTask next = it.next();
                    if (!(next.getTaskInfo() == null || next.getTaskInfo().baseIntent == null || next.getTaskInfo().baseIntent.getComponent() == null)) {
                        if (PlayCoreMissingSplitsActivity.class.getName().equals(next.getTaskInfo().baseIntent.getComponent().getClassName())) {
                            break;
                        }
                    }
                } else {
                    Iterator<ActivityManager.AppTask> it2 = m82485b().iterator();
                    loop1:
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        ActivityManager.RecentTaskInfo taskInfo = it2.next().getTaskInfo();
                        if (!(taskInfo == null || taskInfo.baseIntent == null || taskInfo.baseIntent.getComponent() == null)) {
                            ComponentName component = taskInfo.baseIntent.getComponent();
                            String className = component.getClassName();
                            try {
                                Class<?> cls = Class.forName(className);
                                while (cls != null) {
                                    if (cls.equals(Activity.class)) {
                                        break loop1;
                                    }
                                    Class<? super Object> superclass = cls.getSuperclass();
                                    cls = superclass != cls ? superclass : null;
                                }
                                continue;
                            } catch (ClassNotFoundException unused3) {
                                f56071a.mo78875d("ClassNotFoundException when scanning class hierarchy of '%s'", className);
                                try {
                                    if (this.f56072b.getPackageManager().getActivityInfo(component, 0) != null) {
                                        break;
                                    }
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    continue;
                                }
                            }
                        }
                    }
                    z = true;
                    this.f56074d.mo78971b();
                    for (ActivityManager.AppTask appTask : m82485b()) {
                        appTask.finishAndRemoveTask();
                    }
                    if (z) {
                        this.f56072b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f56072b, PlayCoreMissingSplitsActivity.class), 1, 1);
                        this.f56072b.startActivity(new Intent(this.f56072b, PlayCoreMissingSplitsActivity.class).addFlags(884998144));
                    }
                    this.f56073c.exit(0);
                }
            }
            return true;
        }
        if (this.f56074d.mo78970a()) {
            this.f56074d.mo78972c();
            this.f56073c.exit(0);
        }
        return false;
    }
}
