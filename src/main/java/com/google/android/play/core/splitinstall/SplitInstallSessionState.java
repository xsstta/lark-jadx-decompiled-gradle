package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.ArrayList;
import java.util.List;

public abstract class SplitInstallSessionState {
    /* renamed from: a */
    public static SplitInstallSessionState m82545a(Bundle bundle) {
        return new C22703b(bundle.getInt("session_id"), bundle.getInt(UpdateKey.STATUS), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public static SplitInstallSessionState create(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2) {
        if (i2 != 8) {
            return new C22703b(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<String> mo79023a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract List<String> mo79024b();

    public abstract long bytesDownloaded();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract List<Intent> mo79026c();

    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int status = status();
        return status == 0 || status == 5 || status == 6 || status == 7;
    }

    public List<String> languages() {
        return mo79024b() != null ? new ArrayList(mo79024b()) : new ArrayList();
    }

    public List<String> moduleNames() {
        return mo79023a() != null ? new ArrayList(mo79023a()) : new ArrayList();
    }

    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();
}
