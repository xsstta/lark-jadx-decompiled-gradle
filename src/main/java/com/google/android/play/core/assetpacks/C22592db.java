package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.db */
public final class C22592db {

    /* renamed from: a */
    private final Context f55910a;

    public C22592db(Context context) {
        this.f55910a = context;
    }

    /* renamed from: a */
    static String m82118a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData;
            if (bundle != null) {
                return bundle.getString("local_testing_dir");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo78811a() {
        return this.f55910a;
    }
}
