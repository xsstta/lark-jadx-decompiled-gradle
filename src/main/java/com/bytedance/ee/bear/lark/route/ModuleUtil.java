package com.bytedance.ee.bear.lark.route;

import com.bytedance.ee.bear.list.homepage.navigation.NavigationEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/lark/route/ModuleUtil;", "", "()V", "module", "", "navigationId", "", "lark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lark.route.a */
public final class ModuleUtil {

    /* renamed from: a */
    public static final ModuleUtil f21588a = new ModuleUtil();

    private ModuleUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m32225a(int i) {
        if (i == NavigationEnum.MY_SPACE.id) {
            return "personal";
        }
        if (i == NavigationEnum.SHARED_SPACE.id) {
            return "shared";
        }
        if (i == NavigationEnum.FAVORITE.id) {
            return "favorites";
        }
        if (i == NavigationEnum.MANUAL_OFFLINE.id) {
            return "offline";
        }
        return "";
    }
}
