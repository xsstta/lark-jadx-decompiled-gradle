package com.bytedance.ies.bullet.service.base.utils;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/utils/Identifier;", "", "()V", "getFullUrl", "", "getIdentifierUrl", "getKitType", "Lcom/bytedance/ies/bullet/service/base/utils/KitType;", "getRawUri", "Landroid/net/Uri;", "getStatisticPlatform", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.utils.a */
public abstract class Identifier {
    /* renamed from: a */
    public abstract String mo52769a();

    /* renamed from: b */
    public abstract KitType mo52770b();

    /* renamed from: c */
    public final String mo52771c() {
        int i = C14420b.f37955a[mo52770b().ordinal()];
        if (i == 1) {
            return "lynx";
        }
        if (i == 2) {
            return "web";
        }
        if (i != 3) {
            return "unknown";
        }
        return "rn";
    }
}
