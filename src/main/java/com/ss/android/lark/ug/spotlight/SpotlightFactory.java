package com.ss.android.lark.ug.spotlight;

import android.app.Activity;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug_reach.ButtonElement;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterial;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/SpotlightFactory;", "", "()V", "createSpotlight", "Lcom/ss/android/lark/ug/spotlight/SpotlightView;", "activity", "Landroid/app/Activity;", "anchorViews", "", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterial;", "bubbleListener", "Lcom/ss/android/lark/ug/spotlight/SpotlightBubbleListener;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.g */
public final class SpotlightFactory {

    /* renamed from: a */
    public static final SpotlightFactory f141697a = new SpotlightFactory();

    private SpotlightFactory() {
    }

    /* renamed from: a */
    public final SpotlightView mo195191a(Activity activity, List<? extends View> list, SpotlightMaterial spotlightMaterial, SpotlightBubbleListener fVar) {
        boolean z;
        Integer num;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(list, "anchorViews");
        Intrinsics.checkParameterIsNotNull(spotlightMaterial, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(fVar, "bubbleListener");
        List<SpotlightMaterialItem> list2 = spotlightMaterial.mspotlights;
        boolean z2 = false;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("createSpotlight, spotlightCollection.mspotlights size: ");
            List<SpotlightMaterialItem> list3 = spotlightMaterial.mspotlights;
            if (list3 != null) {
                num = Integer.valueOf(list3.size());
            } else {
                num = null;
            }
            sb.append(num);
            Log.m165383e("ug-spotlight", sb.toString());
            return null;
        }
        int size = spotlightMaterial.mspotlights.size();
        if (list.size() != spotlightMaterial.mspotlights.size()) {
            Log.m165383e("ug-spotlight", "createSpotlight, anchorViews size: " + list.size() + ", spotlights size: " + size);
        }
        if (size != 1) {
            return new StepSpotlightViewCreator().mo195202a(activity, list, spotlightMaterial, fVar);
        }
        SpotlightMaterialItem.SpotlightContent spotlightContent = spotlightMaterial.mspotlights.get(0).mcontent;
        if (spotlightContent == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(spotlightContent, "spotlightMaterial.mcontent ?: return null");
        List<ButtonElement> list4 = spotlightContent.mbuttons;
        if (list4 == null || list4.isEmpty()) {
            z2 = true;
        }
        if (z2) {
            return new RawTextSpotlightViewCreator().mo195188a(activity, list, spotlightMaterial, fVar);
        }
        return new ButtonSpotlightViewCreator().mo195187a(activity, list, spotlightMaterial, fVar);
    }
}
