package com.ss.android.vc.meeting.module.reaction;

import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60772n;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.ap;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessageType;
import com.ss.android.vc.meeting.module.reaction.entity.ReactionContent;
import com.ss.android.vc.meeting.module.reaction.entity.TextContent;
import com.ss.android.vc.meeting.module.reaction.entity.VideoChatParticipant;
import com.ss.android.vc.meeting.module.reaction.entity.ViewItemReaction;
import com.ss.android.vc.meeting.module.reaction.listener.IReactionViewControlListener;
import com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionPosition;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.VideoChatIMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 I2\u00020\u0001:\u0001IB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0016J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\bH\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010'\u001a\u00020\bH\u0002J\u0010\u0010)\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0012H\u0002J\b\u0010+\u001a\u00020%H\u0016J\b\u0010,\u001a\u00020\u0012H\u0016J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020%H\u0016J\u0018\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\u0010\u00104\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u00105\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u00106\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u0007H\u0016J\"\u0010;\u001a\u00020\u00122\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010 \u001a\u00020!2\u0006\u0010>\u001a\u00020%H\u0016J \u0010?\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020%H\u0016J\u0010\u0010B\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020%H\u0016J \u0010E\u001a\u00020\u00122\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\fj\b\u0012\u0004\u0012\u00020\u001d`\rH\u0016J\u0010\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u0007H\u0016R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/ReactionControl;", "Lcom/ss/android/vc/meeting/module/reaction/AbsReactionControl;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "mDisplayReactionMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/vc/meeting/module/reaction/entity/ViewItemReaction;", "Lkotlin/collections/HashMap;", "mMaxReactionNum", "mReactionList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mViewControlListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/vc/meeting/module/reaction/listener/IReactionViewControlListener;", "bindIMListener", "", "listener", "bindView", "reactionSendArea", "Landroid/view/ViewGroup;", "clearReactionStatus", "position", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition;", "contractBar", "generateViewReactionItem", "imMessage", "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "getReactionDisplayDuration", "getReactionItemByKey", "reactionKey", "", "initDetailPanel", "insertReactionList", "isInsertFirst", "", "isAlreadyInList", "itemReaction", "isInDisplayMap", "isSendReactionToPosition", "judgeIfNeedShowReaction", "needShowGuide", "onBottomBarCollapsed", "onEnterOrExitFullScreenPage", "isfullScreenPage", "onEnterOrExitSketchPage", "isSketchPage", "bottomMargin", "onOrientationInSketchPage", "restoreViewPos", "sendReaction", "sendReactionByLongClick", "sendReactionBySingleClick", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "setVisibility", "visibility", "startLongClickAnim", "view", "Landroid/view/View;", "firstLineOrDetailPanel", "stopLongClickAnim", "count", "shouldCollapseBottomBar", "unbindIMListener", "updateExtendToUp", "reactionExtendUp", "updateInteractionMessagesByPush", "messageList", "updateReactionMaxLines", "maxLines", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.b */
public final class ReactionControl extends AbsReactionControl {

    /* renamed from: a */
    public static final Companion f157966a = new Companion(null);

    /* renamed from: b */
    private final CopyOnWriteArrayList<IReactionViewControlListener> f157967b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private ArrayList<ViewItemReaction> f157968c = new ArrayList<>();

    /* renamed from: d */
    private HashMap<Integer, ViewItemReaction> f157969d = new HashMap<>();

    /* renamed from: e */
    private int f157970e = 6;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/ReactionControl$Companion;", "", "()V", "DISPALY_THRESHOLD", "", "DISPLAY_MAX_DURATION", "DISPLAY_MIN_DURATION", "HORIZONTAL_REACTION_NUM", "LATEST_QUEUE_MAX_SIZE", "PAGE_SIZE", "PREVIOUS_QUEUE_MAX_SIZE", "RISKY_MESSAGE_ERR_CODE", "TAG", "", "VERTICAL_REACTION_NUM", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216851a(String str, VideoChat videoChat) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        C60700b.m235851b("ReactionControl", "[sendReactionBySingleClick]", "reactionKey:" + str);
        VideoChatIMEvent.f160907a.mo220402a(str, 1, videoChat);
        m245759c(str);
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216852a(ArrayList<InteractionMessage> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "messageList");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InteractionMessage aVar = arrayList.get(i);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "messageList[index]");
            InteractionMessage aVar2 = aVar;
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            String d = meeting.mo212055d();
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            AbsBreakoutRoomControl al = meeting2.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
            if (al.mo213182i()) {
                C61303k meeting3 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                AbsBreakoutRoomControl al2 = meeting3.al();
                Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                VCBreakoutRoomInfo k = al2.mo213184k();
                if (k != null) {
                    d = k.getBreakoutRoomId();
                }
            }
            MeetingManager a = MeetingManager.m238341a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
            if (a.mo211906j() != null && Intrinsics.areEqual(aVar2.mo216922g(), d)) {
                mo216875a(aVar2, false);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216850a(String str, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216867a(str, i, z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216853a(boolean z) {
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216870b(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216854a(boolean z, int i) {
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216869a(z, i);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: d */
    public void mo216860d() {
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216872d();
        }
    }

    /* renamed from: g */
    private final int m245761g() {
        int size = 6000 - (this.f157968c.size() * 20);
        if (size < 500) {
            return ParticipantRepo.f117150c;
        }
        return size;
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: b */
    public void mo216855b() {
        Iterator<IReactionViewControlListener> it = this.f157967b.iterator();
        while (it.hasNext()) {
            it.next().mo216871c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: c */
    public void mo216859c() {
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216873e();
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: e */
    public boolean mo216861e() {
        IVideoChatDependency dependency = VideoChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModule.getDependency()");
        return dependency.getGuideDependency().checkToShow("mobile_vc_chatandreaction");
    }

    /* renamed from: f */
    private final void m245760f() {
        int number;
        int number2;
        if (!this.f157968c.isEmpty() && (number = ReactionPosition.ZERO.getNumber()) <= (number2 = ReactionPosition.SEVEN.getNumber())) {
            while (true) {
                if ((this.f157970e <= number || !m245758b(ReactionPosition.Companion.mo217198a(number))) && number != number2) {
                    number++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216843a() {
        Iterator<IReactionViewControlListener> it = this.f157967b.iterator();
        while (it.hasNext()) {
            it.next().mo216874f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.b$b */
    public static final class RunnableC62792b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionControl f157971a;

        /* renamed from: b */
        final /* synthetic */ String f157972b;

        RunnableC62792b(ReactionControl bVar, String str) {
            this.f157971a = bVar;
            this.f157972b = str;
        }

        public final void run() {
            final InteractionMessage b = this.f157971a.mo216876b(this.f157972b);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C61303k meeting = this.f157971a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            objectRef.element = (T) meeting.mo212055d();
            C61303k meeting2 = this.f157971a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            AbsBreakoutRoomControl al = meeting2.al();
            Intrinsics.checkExpressionValueIsNotNull(al, "meeting.breakoutRoomControl");
            if (al.mo213182i()) {
                C61303k meeting3 = this.f157971a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                AbsBreakoutRoomControl al2 = meeting3.al();
                Intrinsics.checkExpressionValueIsNotNull(al2, "meeting.breakoutRoomControl");
                VCBreakoutRoomInfo k = al2.mo213184k();
                if (k != null) {
                    objectRef.element = (T) k.getBreakoutRoomId();
                }
            }
            C60735ab.m236001a(new Runnable(this) {
                /* class com.ss.android.vc.meeting.module.reaction.ReactionControl.RunnableC62792b.RunnableC627931 */

                /* renamed from: a */
                final /* synthetic */ RunnableC62792b f157973a;

                {
                    this.f157973a = r1;
                }

                public final void run() {
                    this.f157973a.f157971a.mo216875a(b, true);
                    VcBizSender.m249176a(objectRef.element, InteractionMessageType.REACTION, new ReactionContent(this.f157973a.f157972b), (TextContent) null).mo219893b(new AbstractC63598b<ap>() {
                        /* class com.ss.android.vc.meeting.module.reaction.ReactionControl.RunnableC62792b.RunnableC627931.C627941 */

                        /* renamed from: a */
                        public void onSuccess(ap apVar) {
                            Intrinsics.checkParameterIsNotNull(apVar, "response");
                            C60700b.m235851b("ReactionControl", "[sendReaction]", "onSuccess");
                        }

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            Intrinsics.checkParameterIsNotNull(eVar, "error");
                            C60700b.m235864f("ReactionControl", "[sendReaction2]", "error=" + eVar);
                        }
                    });
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216844a(int i) {
        if (i > 0) {
            this.f157970e = i;
        }
    }

    /* renamed from: c */
    private final void m245759c(String str) {
        C60735ab.m236018e(new RunnableC62792b(this, str));
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216846a(ViewGroup viewGroup) {
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216864a(viewGroup);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: b */
    public void mo216856b(int i) {
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216862a(i);
        }
    }

    /* renamed from: a */
    private final ViewItemReaction m245755a(InteractionMessage aVar) {
        String a;
        ReactionContent h = aVar.mo216923h();
        if (h == null || (a = h.mo216929a()) == null) {
            return null;
        }
        return new ViewItemReaction(aVar.mo216916c(), a, 1, 6000);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: b */
    public void mo216857b(IReactionViewControlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f157967b.remove(aVar);
    }

    /* renamed from: a */
    private final boolean m245756a(ViewItemReaction fVar) {
        for (Map.Entry<Integer, ViewItemReaction> entry : this.f157969d.entrySet()) {
            ViewItemReaction value = entry.getValue();
            if (Intrinsics.areEqual(value.mo216950a().mo216940a(), fVar.mo216950a().mo216940a()) && Intrinsics.areEqual(value.mo216952b(), fVar.mo216952b())) {
                value.mo216951a(value.mo216954c() + 1);
                Iterator<IReactionViewControlListener> it = this.f157967b.iterator();
                while (it.hasNext()) {
                    it.next().mo216865a(ReactionPosition.Companion.mo217198a(entry.getKey().intValue()), value.mo216954c(), m245761g());
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m245757b(ViewItemReaction fVar) {
        Iterator<ViewItemReaction> it = this.f157968c.iterator();
        while (it.hasNext()) {
            ViewItemReaction next = it.next();
            if (Intrinsics.areEqual(next.mo216950a().mo216940a(), fVar.mo216950a().mo216940a()) && Intrinsics.areEqual(next.mo216952b(), fVar.mo216952b())) {
                next.mo216951a(next.mo216954c() + 1);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m245758b(ReactionPosition reactionPosition) {
        if (this.f157969d.containsKey(Integer.valueOf(reactionPosition.getNumber())) && this.f157969d.get(Integer.valueOf(reactionPosition.getNumber())) != null) {
            return false;
        }
        ViewItemReaction fVar = this.f157968c.get(0);
        Intrinsics.checkExpressionValueIsNotNull(fVar, "mReactionList[0]");
        ViewItemReaction fVar2 = fVar;
        fVar2.mo216953b(m245761g());
        Iterator<IReactionViewControlListener> it = this.f157967b.iterator();
        while (it.hasNext()) {
            it.next().mo216866a(reactionPosition, fVar2);
        }
        if (CollectionUtils.isNotEmpty(this.f157968c)) {
            this.f157968c.remove(0);
        }
        this.f157969d.put(Integer.valueOf(reactionPosition.getNumber()), fVar2);
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216847a(IReactionViewControlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f157967b.add(aVar);
        this.f157969d.clear();
    }

    /* renamed from: b */
    public final InteractionMessage mo216876b(String str) {
        String c = VideoChatModuleDependency.m236630c();
        Intrinsics.checkExpressionValueIsNotNull(c, "userId");
        String a = C60772n.m236113a(c);
        Intrinsics.checkExpressionValueIsNotNull(a, "VCChatterUtils.getVcChatterName(userId)");
        String b = C60772n.m236114b(c);
        Intrinsics.checkExpressionValueIsNotNull(b, "VCChatterUtils.getVcChatterAvatarKey(userId)");
        return new InteractionMessage("", InteractionMessageType.REACTION, new VideoChatParticipant(c, "", a, b, ParticipantType.LARK_USER, ParticipantRole.UNKNOW_ROLE, false), "", 0, "", "", new ReactionContent(str), null, null, false, 0);
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: b */
    public void mo216858b(boolean z) {
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216868a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216848a(ReactionPosition reactionPosition) {
        Intrinsics.checkParameterIsNotNull(reactionPosition, "position");
        if (this.f157969d.containsKey(Integer.valueOf(reactionPosition.getNumber()))) {
            this.f157969d.remove(Integer.valueOf(reactionPosition.getNumber()));
        }
        m245760f();
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216849a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        m245759c(str);
    }

    /* renamed from: a */
    public final void mo216875a(InteractionMessage aVar, boolean z) {
        ViewItemReaction a;
        if (aVar.mo216914b() == InteractionMessageType.REACTION && (a = m245755a(aVar)) != null && !m245756a(a)) {
            if (!m245757b(a)) {
                if (!z) {
                    this.f157968c.add(a);
                } else {
                    this.f157968c.add(0, a);
                }
            }
            m245760f();
        }
    }

    @Override // com.ss.android.vc.meeting.module.reaction.AbsReactionControl
    /* renamed from: a */
    public void mo216845a(View view, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        IReactionViewControlListener aVar = (IReactionViewControlListener) CollectionsKt.lastOrNull((List) this.f157967b);
        if (aVar != null) {
            aVar.mo216863a(view, str, z);
        }
    }
}
