package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.internal.cg;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;

public abstract class AssetPackState {
    /* renamed from: a */
    static AssetPackState m81924a(Bundle bundle, String str, bb bbVar, AbstractC22612v vVar) {
        return m81925a(str, vVar.mo78822a(bundle.getInt(cg.m82391a(UpdateKey.STATUS, str)), str), bundle.getInt(cg.m82391a("error_code", str)), bundle.getLong(cg.m82391a("bytes_downloaded", str)), bundle.getLong(cg.m82391a("total_bytes_to_download", str)), bbVar.mo78759b(str));
    }

    /* renamed from: a */
    public static AssetPackState m81925a(String str, int i, int i2, long j, long j2, double d) {
        return new C22578ac(str, i, i2, j, j2, (int) Math.rint(100.0d * d));
    }

    /* renamed from: a */
    public abstract String mo78687a();

    /* renamed from: b */
    public abstract int mo78688b();

    /* renamed from: c */
    public abstract int mo78689c();

    /* renamed from: d */
    public abstract long mo78690d();

    /* renamed from: e */
    public abstract long mo78691e();

    /* renamed from: f */
    public abstract int mo78692f();
}
