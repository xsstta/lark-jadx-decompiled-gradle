package com.ss.android.vc.meeting.module.reaction.util;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.dependency.IReactionDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.meeting.module.reaction.widget.C62877d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/util/ReactionUtil;", "", "()V", "addReactionCountNumAnimation", "", "countNumView", "Landroid/widget/TextView;", "multiView", "getReactionView", "Lcom/ss/android/vc/meeting/module/reaction/widget/VcReactionPanelFacade;", "anchorView", "Landroid/view/ViewGroup;", "reactionListener", "Lcom/ss/android/vc/meeting/module/reaction/widget/VcReactionPanelFacade$ReactionClickListener;", "reactionLongClickListener", "Lcom/ss/android/vc/meeting/module/reaction/widget/VcReactionPanelFacade$ReactionLongClickListener;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.b.c */
public final class ReactionUtil {

    /* renamed from: a */
    public static final ReactionUtil f157998a = new ReactionUtil();

    private ReactionUtil() {
    }

    /* renamed from: a */
    public final void mo216893a(TextView textView, TextView textView2) {
        if (textView != null && textView2 != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "scaleX", BitmapDescriptorFactory.HUE_RED, 1.5f, 1.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ObjectAnimator.ofFloat(c…caleX\", 0.0f, 1.5f, 1.0f)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "scaleY", BitmapDescriptorFactory.HUE_RED, 1.5f, 1.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "ObjectAnimator.ofFloat(c…caleY\", 0.0f, 1.5f, 1.0f)");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, "scaleX", BitmapDescriptorFactory.HUE_RED, 1.5f, 1.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat3, "ObjectAnimator.ofFloat(m…caleX\", 0.0f, 1.5f, 1.0f)");
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView2, "scaleY", BitmapDescriptorFactory.HUE_RED, 1.5f, 1.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat4, "ObjectAnimator.ofFloat(m…caleY\", 0.0f, 1.5f, 1.0f)");
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4);
            animatorSet.start();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final C62877d m245802a(ViewGroup viewGroup, C62877d.AbstractC62881b bVar, C62877d.AbstractC62882c cVar) {
        List<String> list;
        Intrinsics.checkParameterIsNotNull(viewGroup, "anchorView");
        Intrinsics.checkParameterIsNotNull(bVar, "reactionListener");
        Intrinsics.checkParameterIsNotNull(cVar, "reactionLongClickListener");
        IReactionDependency reactionDependency = VideoChatModuleDependency.getReactionDependency();
        C62877d.C62880a aVar = new C62877d.C62880a(viewGroup);
        List<String> list2 = null;
        if (reactionDependency != null) {
            list = reactionDependency.getRecentReactionList();
        } else {
            list = null;
        }
        C62877d.C62880a a = aVar.mo217271a(list);
        if (reactionDependency != null) {
            list2 = reactionDependency.getWholeReactionList();
        }
        C62877d a2 = a.mo217275b(list2).mo217269a(bVar).mo217270a(cVar).mo217268a(R.color.icon_n2).mo217274b(R.drawable.vc_bg_im_reaction_collapse).mo217272a(true).mo217273a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "VcReactionPanelFacade.Bu…\n                .build()");
        return a2;
    }
}
