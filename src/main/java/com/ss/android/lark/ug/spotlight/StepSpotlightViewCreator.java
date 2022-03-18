package com.ss.android.lark.ug.spotlight;

import android.app.Activity;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.BubbleListener;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfigFactory;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.ImageConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.StepDelegate;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug_reach.ButtonElement;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterial;
import com.ss.android.lark.pb.ug_reach.SpotlightMaterialItem;
import com.ss.android.lark.pb.ug_reach.TextElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J2\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/StepSpotlightViewCreator;", "Lcom/ss/android/lark/ug/spotlight/SpotlightViewCreator;", "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterial;", "()V", "createSingleButtonConfig", "Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "index", "", "bubbleListener", "Lcom/ss/android/lark/ug/spotlight/SpotlightBubbleListener;", "createView", "Lcom/ss/android/lark/ug/spotlight/StepSpotlightView;", "anchorViews", "", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.m */
public final class StepSpotlightViewCreator {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/ug/spotlight/StepSpotlightViewCreator$createSingleButtonConfig$2", "Lcom/ss/android/lark/guide/ui/config/BubbleListener;", "onDismiss", "", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.m$b */
    public static final class C57519b implements BubbleListener {

        /* renamed from: a */
        final /* synthetic */ boolean f141716a;

        /* renamed from: b */
        final /* synthetic */ SpotlightBubbleListener f141717b;

        public void onDismiss() {
            if (this.f141716a) {
                this.f141717b.onDismiss();
            }
        }

        C57519b(boolean z, SpotlightBubbleListener fVar) {
            this.f141716a = z;
            this.f141717b = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/spotlight/StepSpotlightViewCreator$createSingleButtonConfig$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.m$a */
    public static final class C57518a implements ButtonConfig.ButtonAction {

        /* renamed from: a */
        final /* synthetic */ C57521d f141715a;

        C57518a(C57521d dVar) {
            this.f141715a = dVar;
        }

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
        public void onClick(View view, GuideDelegate gVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "delegate");
            if (gVar instanceof StepDelegate) {
                ((StepDelegate) gVar).mo141668d();
            }
            this.f141715a.mo141770a(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/spotlight/StepSpotlightViewCreator$createSingleButtonConfig$leftBtnCallback$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfigFactory$ButtonCallback;", "onClick", "", "view", "Landroid/view/View;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.m$c */
    public static final class C57520c implements ButtonConfigFactory.ButtonCallback {

        /* renamed from: a */
        final /* synthetic */ SpotlightBubbleListener f141718a;

        /* renamed from: b */
        final /* synthetic */ int f141719b;

        /* renamed from: c */
        final /* synthetic */ int f141720c;

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfigFactory.ButtonCallback
        /* renamed from: a */
        public void mo141770a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f141718a.mo195189a(this.f141719b + 1, this.f141720c);
        }

        C57520c(SpotlightBubbleListener fVar, int i, int i2) {
            this.f141718a = fVar;
            this.f141719b = i;
            this.f141720c = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/spotlight/StepSpotlightViewCreator$createSingleButtonConfig$rightBtnCallback$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfigFactory$ButtonCallback;", "onClick", "", "view", "Landroid/view/View;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.m$d */
    public static final class C57521d implements ButtonConfigFactory.ButtonCallback {

        /* renamed from: a */
        final /* synthetic */ SpotlightBubbleListener f141721a;

        /* renamed from: b */
        final /* synthetic */ int f141722b;

        /* renamed from: c */
        final /* synthetic */ int f141723c;

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfigFactory.ButtonCallback
        /* renamed from: a */
        public void mo141770a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f141721a.mo195190b(this.f141722b + 1, this.f141723c);
        }

        C57521d(SpotlightBubbleListener fVar, int i, int i2) {
            this.f141721a = fVar;
            this.f141722b = i;
            this.f141723c = i2;
        }
    }

    /* renamed from: a */
    public StepSpotlightView mo195202a(Activity activity, List<? extends View> list, SpotlightMaterial spotlightMaterial, SpotlightBubbleListener fVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(list, "anchorViews");
        Intrinsics.checkParameterIsNotNull(spotlightMaterial, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(fVar, "bubbleListener");
        ArrayList arrayList = new ArrayList();
        int size = spotlightMaterial.mspotlights.size();
        if (size >= 0) {
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    ButtonBubbleConfig a = m223257a(activity, (View) list.get(i), spotlightMaterial, i, fVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                } else {
                    Log.m165383e("ug-spotlight", "StepSpotlightViewCreator.createView, invalid index: " + i + " for anchorView size: " + list.size());
                    break;
                }
            }
        }
        return new StepSpotlightView(activity, arrayList);
    }

    /* renamed from: a */
    private final ButtonBubbleConfig m223257a(Activity activity, View view, SpotlightMaterial spotlightMaterial, int i, SpotlightBubbleListener fVar) {
        boolean z;
        boolean z2;
        ButtonConfig b;
        ButtonConfig d;
        String str;
        TextElement textElement;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        int size = spotlightMaterial.mspotlights.size();
        if (i == size - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        SpotlightMaterialItem spotlightMaterialItem = spotlightMaterial.mspotlights.get(i);
        SpotlightMaterialItem.SpotlightContent spotlightContent = spotlightMaterialItem.mcontent;
        String str2 = null;
        if (spotlightContent == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(spotlightContent, "spotlightMaterialItem.mcontent ?: return null");
        Intrinsics.checkExpressionValueIsNotNull(spotlightMaterialItem, "spotlightMaterialItem");
        AnchorConfig a = C57510h.m223228a(view, spotlightMaterialItem);
        MaskConfig a2 = C57510h.m223230a(activity, spotlightMaterial.mspotlight_mask_config, spotlightMaterialItem.mtarget_anchor_config);
        ImageConfig a3 = C57510h.m223232a(activity, spotlightContent.mimage);
        C57521d dVar = new C57521d(fVar, i, size);
        C57520c cVar = new C57520c(fVar, i, size);
        if (z) {
            Activity activity2 = activity;
            b = ButtonConfigFactory.f99522a.mo141771a(activity2, cVar);
            d = ButtonConfigFactory.f99522a.mo141774d(activity2, dVar);
        } else if (z2) {
            Activity activity3 = activity;
            b = ButtonConfigFactory.f99522a.mo141772b(activity3, cVar);
            List<ButtonElement> list = spotlightContent.mbuttons;
            Intrinsics.checkExpressionValueIsNotNull(list, "spotlightContent.mbuttons");
            if (true ^ list.isEmpty()) {
                ButtonElement buttonElement = spotlightContent.mbuttons.get(0);
                Intrinsics.checkExpressionValueIsNotNull(buttonElement, "spotlightContent.mbuttons[0]");
                d = C57510h.m223231a(buttonElement, new C57518a(dVar));
            } else {
                d = ButtonConfigFactory.f99522a.mo141773c(activity3, dVar);
            }
        } else {
            Activity activity4 = activity;
            b = ButtonConfigFactory.f99522a.mo141772b(activity4, cVar);
            d = ButtonConfigFactory.f99522a.mo141774d(activity4, dVar);
        }
        TextElement textElement2 = spotlightContent.mtitle;
        if (textElement2 != null) {
            str2 = textElement2.mcontent;
        }
        SpotlightMaterialItem.SpotlightContent spotlightContent2 = spotlightMaterialItem.mcontent;
        if (spotlightContent2 == null || (textElement = spotlightContent2.mdescription) == null || (str = textElement.mcontent) == null) {
            str = "";
        }
        ButtonBubbleConfig dVar2 = new ButtonBubbleConfig(a, a2, str2, str, a3, b, d);
        dVar2.mo141756a(new C57519b(z2, fVar));
        return dVar2;
    }
}
