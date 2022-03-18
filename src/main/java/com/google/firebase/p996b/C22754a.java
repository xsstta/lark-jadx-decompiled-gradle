package com.google.firebase.p996b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.AbstractC22792a;
import com.google.firebase.events.Event;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.b.a */
public class C22754a {

    /* renamed from: a */
    private final Context f56280a;

    /* renamed from: b */
    private final SharedPreferences f56281b;

    /* renamed from: c */
    private final AbstractC22792a f56282c;

    /* renamed from: d */
    private final AtomicBoolean f56283d = new AtomicBoolean(m82717b());

    /* renamed from: a */
    public boolean mo79140a() {
        return this.f56283d.get();
    }

    /* renamed from: b */
    private boolean m82717b() {
        ApplicationInfo applicationInfo;
        if (this.f56281b.contains("firebase_data_collection_default_enabled")) {
            return this.f56281b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f56280a.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f56280a.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: a */
    private static Context m82716a(Context context) {
        if (Build.VERSION.SDK_INT < 24 || ContextCompat.isDeviceProtectedStorage(context)) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: a */
    public void mo79139a(boolean z) {
        if (this.f56283d.compareAndSet(!z, z)) {
            this.f56281b.edit().putBoolean("firebase_data_collection_default_enabled", z).apply();
            this.f56282c.mo79193a(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
        }
    }

    public C22754a(Context context, String str, AbstractC22792a aVar) {
        this.f56280a = m82716a(context);
        this.f56281b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f56282c = aVar;
    }
}
