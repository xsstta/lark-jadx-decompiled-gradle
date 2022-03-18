package com.ss.android.lark.ug.banner;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.pb.ug_reach.ImageElement;
import com.ss.android.lark.pb.ug_reach.NormalBannerMaterial;
import com.ss.android.lark.pb.ug_reach.TextElement;
import com.ss.android.lark.ug.banner.ui.BannerListener;
import com.ss.android.lark.ug.banner.ui.normal.BannerNormalView;
import com.ss.android.lark.ug.banner.ui.view.BaseBannerView;
import com.ss.android.lark.ug.util.ImageElementParser;
import com.ss.android.lark.ug.util.TextElementParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J<\u0010\u000b\u001a\u00020\f*\u00020\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\f0\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\bJ<\u0010\u0015\u001a\u00020\f*\u00020\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\f0\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ug/banner/NormalBannerCreator;", "Lcom/ss/android/lark/ug/banner/BannerViewCreator;", "Lcom/ss/android/lark/pb/ug_reach/NormalBannerMaterial;", "()V", "createView", "Lcom/ss/android/lark/ug/banner/ui/view/BaseBannerView;", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "listener", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "image", "Lcom/ss/android/lark/ug/banner/ui/normal/BannerNormalView$Builder;", "method", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "str", "imageElement", "Lcom/ss/android/lark/pb/ug_reach/ImageElement;", "text", "textElement", "Lcom/ss/android/lark/pb/ug_reach/TextElement;", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.i */
public final class NormalBannerCreator {
    /* renamed from: a */
    public BaseBannerView mo194555a(Context context, NormalBannerMaterial normalBannerMaterial, BannerListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (normalBannerMaterial == null) {
            return null;
        }
        BannerNormalView.Builder aVar2 = new BannerNormalView.Builder();
        String str = normalBannerMaterial.mbackground_color;
        Intrinsics.checkExpressionValueIsNotNull(str, "normalData.mbackground_color");
        BannerNormalView.Builder a = aVar2.mo194594a(Integer.valueOf(C57364c.m222363a(str)));
        ImageElement imageElement = normalBannerMaterial.mbackground_pic;
        if (imageElement != null) {
            aVar2.mo194595a(ImageElementParser.f141733a.mo195206c(imageElement));
        }
        ImageElement imageElement2 = normalBannerMaterial.mbanner_icon;
        if (imageElement2 != null) {
            aVar2.mo194599b(ImageElementParser.f141733a.mo195206c(imageElement2));
        }
        TextElement textElement = normalBannerMaterial.mtitle;
        if (textElement != null) {
            aVar2.mo194601c(TextElementParser.f141734a.mo195210c(textElement));
        }
        String str2 = normalBannerMaterial.mtitle_color;
        Intrinsics.checkExpressionValueIsNotNull(str2, "normalData.mtitle_color");
        BannerNormalView.Builder b = a.mo194598b(Integer.valueOf(C57364c.m222363a(str2)));
        TextElement textElement2 = normalBannerMaterial.msub_title;
        if (textElement2 != null) {
            aVar2.mo194603d(TextElementParser.f141734a.mo195210c(textElement2));
        }
        String str3 = normalBannerMaterial.msub_title_color;
        Intrinsics.checkExpressionValueIsNotNull(str3, "normalData.msub_title_color");
        BannerNormalView.Builder c = b.mo194600c(Integer.valueOf(C57364c.m222363a(str3)));
        TextElement textElement3 = normalBannerMaterial.mcta_title;
        if (textElement3 != null) {
            aVar2.mo194605e(TextElementParser.f141734a.mo195210c(textElement3));
        }
        String str4 = normalBannerMaterial.mcta_title_color;
        Intrinsics.checkExpressionValueIsNotNull(str4, "normalData.mcta_title_color");
        BannerNormalView.Builder d = c.mo194602d(Integer.valueOf(C57364c.m222363a(str4)));
        String str5 = normalBannerMaterial.mcta_background_color;
        Intrinsics.checkExpressionValueIsNotNull(str5, "normalData.mcta_background_color");
        BannerNormalView.Builder e = d.mo194604e(Integer.valueOf(C57364c.m222363a(str5)));
        Boolean bool = normalBannerMaterial.mbanner_closeable;
        Intrinsics.checkExpressionValueIsNotNull(bool, "normalData.mbanner_closeable");
        BannerNormalView.Builder a2 = e.mo194596a(bool.booleanValue());
        String str6 = normalBannerMaterial.mbanner_closeable_color;
        Intrinsics.checkExpressionValueIsNotNull(str6, "normalData.mbanner_closeable_color");
        BannerNormalView.Builder f = a2.mo194606f(Integer.valueOf(C57364c.m222363a(str6)));
        TextElement textElement4 = normalBannerMaterial.mbutton_link;
        if (textElement4 != null) {
            aVar2.mo194607f(TextElementParser.f141734a.mo195210c(textElement4));
        }
        String str7 = normalBannerMaterial.mframe_color;
        Intrinsics.checkExpressionValueIsNotNull(str7, "normalData.mframe_color");
        BannerNormalView.Builder a3 = f.mo194608g(Integer.valueOf(C57364c.m222363a(str7))).mo194593a(aVar);
        NormalBannerMaterial.Layout layout = normalBannerMaterial.mlayout;
        int i = 1;
        if (layout == null || C57373j.f141235a[layout.ordinal()] != 1) {
            i = 2;
        }
        return a3.mo194597a(context, i);
    }
}
