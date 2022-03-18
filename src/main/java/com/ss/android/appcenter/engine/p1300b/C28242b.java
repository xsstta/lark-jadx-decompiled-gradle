package com.ss.android.appcenter.engine.p1300b;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.engine.model.NodeParams;

/* renamed from: com.ss.android.appcenter.engine.b.b */
public class C28242b {
    @SerializedName("schemaVersion")

    /* renamed from: a */
    public String f70877a;
    @SerializedName("schema")

    /* renamed from: b */
    public NodeParams f70878b;

    /* renamed from: a */
    public boolean mo100622a() {
        return TextUtils.equals("1.0", this.f70877a);
    }
}
