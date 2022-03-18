package com.bytedance.ee.bear.lynx.impl.utli;

import android.content.Context;
import com.bytedance.ee.bear.doc.resupdate.GeckoResConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.xresourceloader.geckox.GeckoXDepender;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/LynxResourceConfig;", "", "()V", "getLynxGeckoConfig", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;", "context", "Landroid/content/Context;", "getResourcePrefixList", "Ljava/util/ArrayList;", "", "getResourceRegion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.c.e */
public final class LynxResourceConfig {

    /* renamed from: a */
    public static final LynxResourceConfig f23772a = new LynxResourceConfig();

    /* renamed from: a */
    public final String mo33922a() {
        return "CN";
    }

    private LynxResourceConfig() {
    }

    /* renamed from: b */
    public final ArrayList<String> mo33923b() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(LynxResourceConstant.f23773a.mo33925b());
        return arrayList;
    }

    /* renamed from: a */
    public final GeckoConfig mo33921a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new GeckoConfig(GeckoResConfig.f15547a.mo21855a(context), "gecko", new GeckoXDepender(), false, false, 24, null);
    }
}
