package com.huawei.hms.site;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: com.huawei.hms.site.p */
public class C23765p {

    /* renamed from: a */
    public final Bundle f58840a;

    public C23765p(Bundle bundle) {
        this.f58840a = bundle == null ? new Bundle() : bundle;
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo85127a(String str) {
        try {
            return (T) this.f58840a.getParcelable(str);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
            return null;
        }
    }

    /* renamed from: b */
    public Serializable mo85128b(String str) {
        try {
            return this.f58840a.getSerializable(str);
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("getSerializable exception: "), "SafeBundle", null, true);
            return null;
        }
    }

    public String toString() {
        return this.f58840a.toString();
    }
}
