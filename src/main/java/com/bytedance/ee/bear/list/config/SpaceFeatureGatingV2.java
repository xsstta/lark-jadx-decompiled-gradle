package com.bytedance.ee.bear.list.config;

import com.bytedance.ee.bear.appsetting.C4211a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/list/config/SpaceFeatureGatingV2;", "", "()V", "isSpaceV2", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.b.a */
public final class SpaceFeatureGatingV2 {

    /* renamed from: a */
    public static final SpaceFeatureGatingV2 f21741a = new SpaceFeatureGatingV2();

    private SpaceFeatureGatingV2() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m32622a() {
        return C4211a.m17514a().mo16538b("spacekit.mobile.single_container_enable", false);
    }
}
