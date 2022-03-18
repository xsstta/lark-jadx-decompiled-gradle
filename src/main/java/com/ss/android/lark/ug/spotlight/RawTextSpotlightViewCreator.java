package com.ss.android.lark.ug.spotlight;

import android.app.Activity;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterial;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem;
import com.ss.android.lark.pb.ug_reach.TextElement;
import com.ss.android.lark.ug.util.TextElementParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J0\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/RawTextSpotlightViewCreator;", "Lcom/ss/android/lark/ug/spotlight/SpotlightViewCreator;", "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterial;", "()V", "createView", "Lcom/ss/android/lark/ug/spotlight/SpotlightView;", "activity", "Landroid/app/Activity;", "anchorViews", "", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bubbleListener", "Lcom/ss/android/lark/ug/spotlight/SpotlightBubbleListener;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.e */
public final class RawTextSpotlightViewCreator {
    /* renamed from: a */
    public SpotlightView mo195188a(Activity activity, List<? extends View> list, SpotlightMaterial spotlightMaterial, SpotlightBubbleListener fVar) {
        TextElement textElement;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(list, "anchorViews");
        Intrinsics.checkParameterIsNotNull(spotlightMaterial, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(fVar, "bubbleListener");
        TextElement textElement2 = null;
        if (list.isEmpty()) {
            return null;
        }
        SpotlightMaterialItem spotlightMaterialItem = spotlightMaterial.mspotlights.get(0);
        Intrinsics.checkExpressionValueIsNotNull(spotlightMaterialItem, "spotlightMaterial");
        AnchorConfig a = C57510h.m223228a((View) list.get(0), spotlightMaterialItem);
        MaskConfig a2 = C57510h.m223230a(activity, spotlightMaterial.mspotlight_mask_config, spotlightMaterialItem.mtarget_anchor_config);
        TextElementParser bVar = TextElementParser.f141734a;
        SpotlightMaterialItem.SpotlightContent spotlightContent = spotlightMaterialItem.mcontent;
        if (spotlightContent != null) {
            textElement = spotlightContent.mtitle;
        } else {
            textElement = null;
        }
        String c = bVar.mo195210c(textElement);
        TextElementParser bVar2 = TextElementParser.f141734a;
        SpotlightMaterialItem.SpotlightContent spotlightContent2 = spotlightMaterialItem.mcontent;
        if (spotlightContent2 != null) {
            textElement2 = spotlightContent2.mdescription;
        }
        String c2 = bVar2.mo195210c(textElement2);
        if (c2 == null) {
            c2 = "";
        }
        TextBubbleConfig kVar = new TextBubbleConfig(a, a2, c, c2);
        kVar.mo141756a(fVar);
        return new RawTextSpotlightView(activity, kVar);
    }
}
