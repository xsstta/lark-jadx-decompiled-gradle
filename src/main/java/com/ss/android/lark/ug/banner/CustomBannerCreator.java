package com.ss.android.lark.ug.banner;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.pb.ug_reach.CustomBannerMaterial;
import com.ss.android.lark.ug.banner.ui.BannerListener;
import com.ss.android.lark.ug.banner.ui.view.BaseBannerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/banner/CustomBannerCreator;", "Lcom/ss/android/lark/ug/banner/BannerViewCreator;", "Lcom/ss/android/lark/pb/ug_reach/CustomBannerMaterial;", "()V", "createView", "Lcom/ss/android/lark/ug/banner/ui/view/BaseBannerView;", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "listener", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.g */
public final class CustomBannerCreator {
    /* renamed from: a */
    public BaseBannerView mo194554a(Context context, CustomBannerMaterial customBannerMaterial, BannerListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (customBannerMaterial != null) {
            return new BaseBannerView(context, null, 2, null);
        }
        return null;
    }
}
