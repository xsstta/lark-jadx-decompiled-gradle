package com.ss.android.vc.meeting.module.reaction.listener;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.vc.meeting.module.reaction.entity.ViewItemReaction;
import com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionPosition;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0007H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH&J\"\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0012H&J \u0010%\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0012H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0012H&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0012H&¨\u0006-"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/listener/IReactionViewControlListener;", "", "addReactionCountNum", "", "position", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition;", "countNum", "", "displayPeriod", "bindView", "reactionSendArea", "Landroid/view/ViewGroup;", "completeRefresh", "contractBar", "initDetailPanel", "onBottomBarCollapsed", "onEnterOrExitFullScreenPage", "isFullScreenPage", "", "onEnterOrExitSketchPage", "isSketchPage", "bottomMargin", "onOrientationInSketchPage", "restoreViewPos", "setVisibility", "visibility", "showErrorToast", "toastStr", "", "showReaction", "reactionItem", "Lcom/ss/android/vc/meeting/module/reaction/entity/ViewItemReaction;", "startLongClickAnim", "view", "Landroid/view/View;", "reactionKey", "firstLineOrDetailPanel", "stopLongClickAnim", "count", "shouldCollapseBottomBar", "updateExtendToUp", "reactionExtendUp", "updateReactionMaxLines", "isLandscape", "isMessageBubbleVisible", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.a.a */
public interface IReactionViewControlListener {
    /* renamed from: a */
    void mo216862a(int i);

    /* renamed from: a */
    void mo216863a(View view, String str, boolean z);

    /* renamed from: a */
    void mo216864a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo216865a(ReactionPosition reactionPosition, int i, int i2);

    /* renamed from: a */
    void mo216866a(ReactionPosition reactionPosition, ViewItemReaction fVar);

    /* renamed from: a */
    void mo216867a(String str, int i, boolean z);

    /* renamed from: a */
    void mo216868a(boolean z);

    /* renamed from: a */
    void mo216869a(boolean z, int i);

    /* renamed from: b */
    void mo216870b(boolean z);

    /* renamed from: c */
    void mo216871c();

    /* renamed from: d */
    void mo216872d();

    /* renamed from: e */
    void mo216873e();

    /* renamed from: f */
    void mo216874f();
}
