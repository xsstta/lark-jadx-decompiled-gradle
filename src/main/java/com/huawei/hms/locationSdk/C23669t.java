package com.huawei.hms.locationSdk;

import android.app.PendingIntent;
import java.util.Objects;

/* renamed from: com.huawei.hms.locationSdk.t */
public class C23669t extends AbstractC23675x {

    /* renamed from: b */
    private PendingIntent f58429b;

    /* renamed from: a */
    public void mo83532a(PendingIntent pendingIntent) {
        this.f58429b = pendingIntent;
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23675x
    public boolean equals(Object obj) {
        PendingIntent pendingIntent;
        if (this == obj) {
            return true;
        }
        if (obj == null || C23669t.class != obj.getClass() || (pendingIntent = this.f58429b) == null) {
            return false;
        }
        return pendingIntent.equals(((C23669t) obj).f58429b);
    }

    public int hashCode() {
        return Objects.hash(this.f58429b);
    }
}
