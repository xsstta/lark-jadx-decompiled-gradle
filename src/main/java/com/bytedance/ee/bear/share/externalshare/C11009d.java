package com.bytedance.ee.bear.share.externalshare;

import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.externalshare.d */
public final /* synthetic */ class C11009d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f29628a;

    static {
        int[] iArr = new int[ShareType.values().length];
        f29628a = iArr;
        iArr[ShareType.Wechat.ordinal()] = 1;
        iArr[ShareType.WechatMoments.ordinal()] = 2;
        iArr[ShareType.QQ.ordinal()] = 3;
        iArr[ShareType.Weibo.ordinal()] = 4;
    }
}
