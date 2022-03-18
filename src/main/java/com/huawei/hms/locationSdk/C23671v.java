package com.huawei.hms.locationSdk;

import android.app.PendingIntent;
import java.util.Objects;

/* renamed from: com.huawei.hms.locationSdk.v */
public class C23671v extends AbstractC23675x {

    /* renamed from: b */
    private PendingIntent f58432b;

    /* renamed from: a */
    public void mo83534a(PendingIntent pendingIntent) {
        this.f58432b = pendingIntent;
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23675x
    public boolean equals(Object obj) {
        PendingIntent pendingIntent;
        if (this == obj) {
            return true;
        }
        if (obj == null || C23671v.class != obj.getClass() || (pendingIntent = this.f58432b) == null) {
            return false;
        }
        return pendingIntent.equals(((C23671v) obj).f58432b);
    }

    public int hashCode() {
        return Objects.hash(this.f58432b);
    }
}
