package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/linkpassword/LinkPwdAPISelector;", "", "()V", "getPwdCreateAPI", "", "isShareFolderV2", "", "getPwdDeleteAPI", "getPwdInputAPI", "getPwdUpdateAPI", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.d */
public final class LinkPwdAPISelector {

    /* renamed from: a */
    public static final LinkPwdAPISelector f27150a = new LinkPwdAPISelector();

    @JvmStatic
    /* renamed from: a */
    public static final String m41825a(boolean z) {
        return z ? "/space/api/suite/permission/space/password/create/" : "/api/suite/permission/password/create/";
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m41826b(boolean z) {
        return z ? "/space/api/suite/permission/space/password/refresh/" : "/api/suite/permission/password/refresh/";
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m41827c(boolean z) {
        return z ? "/space/api/suite/permission/space/password/input/" : "/api/suite/permission/password/input/";
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m41828d(boolean z) {
        return z ? "/space/api/suite/permission/space/password/delete/" : "/api/suite/permission/password/delete/";
    }

    private LinkPwdAPISelector() {
    }
}
