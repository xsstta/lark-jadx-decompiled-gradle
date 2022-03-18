package com.ss.android.lark.ug.spotlight;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J0\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/spotlight/ButtonSpotlightViewCreator;", "Lcom/ss/android/lark/ug/spotlight/SpotlightViewCreator;", "Lcom/ss/android/lark/pb/ug_reach/SpotlightMaterial;", "()V", "createView", "Lcom/ss/android/lark/ug/spotlight/SpotlightView;", "activity", "Landroid/app/Activity;", "anchorViews", "", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bubbleListener", "Lcom/ss/android/lark/ug/spotlight/SpotlightBubbleListener;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.h.c */
public final class ButtonSpotlightViewCreator {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/spotlight/ButtonSpotlightViewCreator$createView$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.c$a */
    public static final class C57507a implements ButtonConfig.ButtonAction {

        /* renamed from: a */
        final /* synthetic */ SpotlightBubbleListener f141693a;

        C57507a(SpotlightBubbleListener fVar) {
            this.f141693a = fVar;
        }

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
        public void onClick(View view, GuideDelegate gVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "delegate");
            this.f141693a.mo195190b(1, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/spotlight/ButtonSpotlightViewCreator$createView$2", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.c$b */
    public static final class C57508b implements ButtonConfig.ButtonAction {

        /* renamed from: a */
        final /* synthetic */ SpotlightBubbleListener f141694a;

        C57508b(SpotlightBubbleListener fVar) {
            this.f141694a = fVar;
        }

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
        public void onClick(View view, GuideDelegate gVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "delegate");
            this.f141694a.mo195189a(1, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/spotlight/ButtonSpotlightViewCreator$createView$3", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "ug-spotlight_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.h.c$c */
    public static final class C57509c implements ButtonConfig.ButtonAction {

        /* renamed from: a */
        final /* synthetic */ SpotlightBubbleListener f141695a;

        C57509c(SpotlightBubbleListener fVar) {
            this.f141695a = fVar;
        }

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
        public void onClick(View view, GuideDelegate gVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "delegate");
            this.f141695a.mo195190b(1, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.ug.spotlight.SpotlightView mo195187a(android.app.Activity r18, java.util.List<? extends android.view.View> r19, com.ss.android.lark.pb.ug_reach.SpotlightMaterial r20, com.ss.android.lark.ug.spotlight.SpotlightBubbleListener r21) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ug.spotlight.ButtonSpotlightViewCreator.mo195187a(android.app.Activity, java.util.List, com.ss.android.lark.pb.ug_reach.SpotlightMaterial, com.ss.android.lark.ug.h.f):com.ss.android.lark.ug.h.k");
    }
}
