package com.ss.android.lark.ug.banner;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.ug_reach.BannerMaterial;
import com.ss.android.lark.ug.banner.ui.BannerListener;
import com.ss.android.lark.ug.banner.ui.view.BaseBannerView;
import com.ss.android.lark.ug.common.ApmUtils;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/banner/BannerFactory;", "", "()V", "createBannerView", "Lcom/ss/android/lark/ug/banner/ui/view/BaseBannerView;", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/pb/ug_reach/BannerMaterial;", "listener", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.a */
public final class BannerFactory {

    /* renamed from: a */
    public static final BannerFactory f141225a = new BannerFactory();

    private BannerFactory() {
    }

    /* renamed from: a */
    public final BaseBannerView mo194529a(Context context, BannerMaterial bannerMaterial, BannerListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bannerMaterial, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        BannerMaterial.BannerType bannerType = bannerMaterial.mbanner_type;
        if (bannerType != null) {
            int i = C57363b.f141226a[bannerType.ordinal()];
            if (i == 1) {
                return new NormalBannerCreator().mo194555a(context, bannerMaterial.mnormal_banner, aVar);
            }
            if (i == 2) {
                return new TemplateBannerCreator().mo194558a(context, bannerMaterial.mtemplate_banner, aVar);
            }
            if (i == 3) {
                return new CustomBannerCreator().mo194554a(context, bannerMaterial.mcustom_banner, aVar);
            }
        }
        ApmUtils.m222517a("ug_unknown_banner_type", MapsKt.mapOf(TuplesKt.to(ShareHitPoint.f121869d, bannerMaterial.mbanner_type)), null, null, 12, null);
        return null;
    }
}
