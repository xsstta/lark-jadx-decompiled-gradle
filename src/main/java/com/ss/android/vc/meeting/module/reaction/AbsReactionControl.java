package com.ss.android.vc.meeting.module.reaction;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener;
import com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionPosition;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H&J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001b\u001a\u00020\u0006H&J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH&J\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H&J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0019H&J\"\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0012H&J \u0010(\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0012H&J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0012H&J \u0010.\u001a\u00020\u00062\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`2H&J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0019H&¨\u00065"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/AbsReactionControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "bindIMListener", "", "listener", "Lcom/ss/android/vc/meeting/module/reaction/listener/IReactionViewControlListener;", "bindView", "reactionSendArea", "Landroid/view/ViewGroup;", "clearReactionStatus", "position", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition;", "contractBar", "initDetailPanel", "needShowGuide", "", "onBottomBarCollapsed", "onEnterOrExitFullScreenPage", "isFullScreenPage", "onEnterOrExitSketchPage", "isSketchPage", "bottomMargin", "", "onOrientationInSketchPage", "restoreViewPos", "sendReactionByLongClick", "reactionKey", "", "sendReactionBySingleClick", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "setVisibility", "visibility", "startLongClickAnim", "view", "Landroid/view/View;", "firstLineOrDetailPanel", "stopLongClickAnim", "count", "isActionUp", "unbindIMListener", "updateExtendToUp", "reactionExtendUp", "updateInteractionMessagesByPush", "messageList", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "Lkotlin/collections/ArrayList;", "updateReactionMaxLines", "maxLines", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.a */
public abstract class AbsReactionControl extends AbstractC61420b {
    /* renamed from: a */
    public abstract void mo216843a();

    /* renamed from: a */
    public abstract void mo216844a(int i);

    /* renamed from: a */
    public abstract void mo216845a(View view, String str, boolean z);

    /* renamed from: a */
    public abstract void mo216846a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo216847a(IReactionViewControlListener aVar);

    /* renamed from: a */
    public abstract void mo216848a(ReactionPosition reactionPosition);

    /* renamed from: a */
    public abstract void mo216849a(String str);

    /* renamed from: a */
    public abstract void mo216850a(String str, int i, boolean z);

    /* renamed from: a */
    public abstract void mo216851a(String str, VideoChat videoChat);

    /* renamed from: a */
    public abstract void mo216852a(ArrayList<InteractionMessage> arrayList);

    /* renamed from: a */
    public abstract void mo216853a(boolean z);

    /* renamed from: a */
    public abstract void mo216854a(boolean z, int i);

    /* renamed from: b */
    public abstract void mo216855b();

    /* renamed from: b */
    public abstract void mo216856b(int i);

    /* renamed from: b */
    public abstract void mo216857b(IReactionViewControlListener aVar);

    /* renamed from: b */
    public abstract void mo216858b(boolean z);

    /* renamed from: c */
    public abstract void mo216859c();

    /* renamed from: d */
    public abstract void mo216860d();

    /* renamed from: e */
    public abstract boolean mo216861e();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsReactionControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }
}
