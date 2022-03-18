package com.bytedance.ee.bear.share.externalshare;

import android.content.ComponentName;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/share/externalshare/ExternalShareSysConfig;", "", "()V", "MOMENTS_SHARE_CLASS_NAME", "", "QQ_PACKAGE_NAME", "QQ_SHARE_CLASS_NAME", "WECHAT_PACKAGE_NAME", "WECHAT_SHARE_CLASS_NAME", "WEIBO_PACKAGE_NAME", "WEIBO_SHARE_CLASS_NAME", "getComponentName", "Landroid/content/ComponentName;", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.externalshare.c */
public final class ExternalShareSysConfig {

    /* renamed from: a */
    public static final ExternalShareSysConfig f29627a = new ExternalShareSysConfig();

    private ExternalShareSysConfig() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ComponentName m45867a(ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        int i = C11009d.f29628a[shareType.ordinal()];
        if (i == 1) {
            return new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI");
        }
        if (i == 2) {
            return new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI");
        }
        if (i == 3) {
            return new ComponentName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity");
        }
        if (i != 4) {
            return null;
        }
        return new ComponentName("com.sina.weibo", "com.sina.weibo.composerinde.ComposerDispatchActivity");
    }
}
