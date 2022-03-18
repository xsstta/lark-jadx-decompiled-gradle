package com.google.android.play.core.splitinstall.p994a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.a.b */
public class C22683b {
    /* renamed from: a */
    public static File m82568a(Context context) {
        String string;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData;
            if (!(bundle == null || (string = bundle.getString("local_testing_dir")) == null)) {
                return new File(context.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
