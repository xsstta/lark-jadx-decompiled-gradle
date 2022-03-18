package com.bytedance.ee.bear.middleground.permission;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/PermFGUtils;", "", "()V", "permissionRevisionEnable", "", "singlePagePermEnable", "wiki2ShowPermSetting", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.b */
public final class PermFGUtils {

    /* renamed from: a */
    public static final PermFGUtils f25725a = new PermFGUtils();

    private PermFGUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m39532a() {
        return ((IWiki) KoinJavaComponent.m268613a(IWiki.class, null, null, 6, null)).mo21066a();
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m39533b() {
        return C4211a.m17514a().mo16536a("ccm.permission.mobile.permission_settings", false);
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m39534c() {
        return C4211a.m17514a().mo16536a("ccm.wiki.mobile.single_page_permission", false);
    }
}
