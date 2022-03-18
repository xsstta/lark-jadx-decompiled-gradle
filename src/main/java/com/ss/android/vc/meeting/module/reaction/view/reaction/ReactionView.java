package com.ss.android.vc.meeting.module.reaction.view.reaction;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.reaction.AbsReactionControl;
import com.ss.android.vc.meeting.module.reaction.entity.ViewItemReaction;
import com.ss.android.vc.meeting.module.reaction.util.ReactionUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00012B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u001aJ\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\"\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0010J\u0016\u0010,\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010.\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r`\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "aContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getAContext", "()Landroid/content/Context;", "animRunnableMap", "Ljava/util/HashMap;", "Ljava/lang/Runnable;", "Lkotlin/collections/HashMap;", "mPresent", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "mReactionControl", "Lcom/ss/android/vc/meeting/module/reaction/AbsReactionControl;", "mReactionLoadManager", "Lcom/ss/android/lark/reaction/loader/ReactionLoaderManager;", "kotlin.jvm.PlatformType", "reactionViewList", "", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionItemLayout;", "addReactionCountNum", "", "position", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionPosition;", "countNum", "displayPeriod", "destroy", "generateReactionView", "reactionItem", "Lcom/ss/android/vc/meeting/module/reaction/entity/ViewItemReaction;", "initView", "loadUserAvatar", "imageView", "Landroid/widget/ImageView;", "isShowInterviewer", "", "prepareSlideOutAnimation", "setMeetingCallPresent", "present", "showReaction", "startReactionAnimation", "startSlideInAnimation", "startSlideOutAnimation", "updateReactionMaxNum", "maxNum", "IViewDependency", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReactionView extends ConstraintLayout {

    /* renamed from: a */
    public AbsReactionControl f158265a;

    /* renamed from: b */
    public List<ReactionItemLayout> f158266b;

    /* renamed from: c */
    private AbstractC61429i f158267c;

    /* renamed from: d */
    private final C52977a f158268d;

    /* renamed from: e */
    private HashMap<Integer, Runnable> f158269e;

    /* renamed from: f */
    private final Context f158270f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionView$IViewDependency;", "", "isFollowPage", "", "isShareScreen", "isSharingPage", "isSketchPage", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionView$a */
    public interface IViewDependency {
        /* renamed from: a */
        boolean mo217176a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionView$b */
    public static final class RunnableC62855b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f158271a;

        RunnableC62855b(Runnable runnable) {
            this.f158271a = runnable;
        }

        public final void run() {
        }
    }

    public ReactionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final Context getAContext() {
        return this.f158270f;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionView$c */
    public static final class RunnableC62856c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionView f158272a;

        /* renamed from: b */
        final /* synthetic */ ReactionPosition f158273b;

        RunnableC62856c(ReactionView reactionView, ReactionPosition reactionPosition) {
            this.f158272a = reactionView;
            this.f158273b = reactionPosition;
        }

        public final void run() {
            this.f158272a.mo217202a(this.f158273b);
        }
    }

    /* renamed from: a */
    public final void mo217200a() {
        Collection<Runnable> values = this.f158269e.values();
        Intrinsics.checkExpressionValueIsNotNull(values, "animRunnableMap.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            UICallbackExecutor.removeCallbacks(new RunnableC62855b(it.next()));
        }
        this.f158269e.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.List<com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionItemLayout> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.util.List<com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionItemLayout> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.util.List<com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionItemLayout> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.List<com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionItemLayout> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.List<com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionItemLayout> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: java.util.List<com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionItemLayout> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.util.List<com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionItemLayout> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.util.List<com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionItemLayout> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final void m246050b() {
        System.currentTimeMillis();
        Trace.beginSection("APM-ReactionView-initView");
        LayoutInflater.from(this.f158270f).inflate(R.layout.vc_view_receive_reaction, this);
        this.f158266b.add(getRootView().findViewById(R.id.reaction_0));
        this.f158266b.add(getRootView().findViewById(R.id.reaction_1));
        this.f158266b.add(getRootView().findViewById(R.id.reaction_2));
        this.f158266b.add(getRootView().findViewById(R.id.reaction_3));
        this.f158266b.add(getRootView().findViewById(R.id.reaction_4));
        this.f158266b.add(getRootView().findViewById(R.id.reaction_5));
        this.f158266b.add(getRootView().findViewById(R.id.reaction_6));
        this.f158266b.add(getRootView().findViewById(R.id.reaction_7));
        Trace.endSection();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/reaction/view/reaction/ReactionView$startSlideInAnimation$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionView$d  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC62857d implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ReactionView f158274a;

        /* renamed from: b */
        final /* synthetic */ ReactionPosition f158275b;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            ReactionItemLayout reactionItemLayout = this.f158274a.f158266b.get(this.f158275b.getNumber());
            if (reactionItemLayout != null) {
                reactionItemLayout.setReactionState(ReactionState.DISPLAY);
            }
        }

        public void onAnimationStart(Animation animation) {
            ReactionItemLayout reactionItemLayout = this.f158274a.f158266b.get(this.f158275b.getNumber());
            if (reactionItemLayout != null) {
                reactionItemLayout.setReactionState(ReactionState.SLIDE_IN);
            }
        }

        animationAnimation$AnimationListenerC62857d(ReactionView reactionView, ReactionPosition reactionPosition) {
            this.f158274a = reactionView;
            this.f158275b = reactionPosition;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/reaction/view/reaction/ReactionView$startSlideOutAnimation$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.reaction.ReactionView$e  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC62858e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ReactionView f158276a;

        /* renamed from: b */
        final /* synthetic */ ReactionPosition f158277b;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            ReactionItemLayout reactionItemLayout = this.f158276a.f158266b.get(this.f158277b.getNumber());
            if (reactionItemLayout != null) {
                reactionItemLayout.setReactionState(ReactionState.SLIDE_OUT);
            }
        }

        public void onAnimationEnd(Animation animation) {
            ReactionItemLayout reactionItemLayout = this.f158276a.f158266b.get(this.f158277b.getNumber());
            if (reactionItemLayout != null) {
                reactionItemLayout.setReactionState(ReactionState.OUTSIDE);
            }
            AbsReactionControl aVar = this.f158276a.f158265a;
            if (aVar != null) {
                aVar.mo216848a(this.f158277b);
            }
        }

        animationAnimation$AnimationListenerC62858e(ReactionView reactionView, ReactionPosition reactionPosition) {
            this.f158276a = reactionView;
            this.f158277b = reactionPosition;
        }
    }

    /* renamed from: b */
    private final void m246051b(ReactionPosition reactionPosition) {
        RunnableC62856c cVar = new RunnableC62856c(this, reactionPosition);
        this.f158269e.put(Integer.valueOf(reactionPosition.getNumber()), cVar);
        UICallbackExecutor.executeDelayed(cVar, (long) 6000);
    }

    public final void setMeetingCallPresent(AbstractC61429i iVar) {
        AbsReactionControl aVar;
        Intrinsics.checkParameterIsNotNull(iVar, "present");
        this.f158267c = iVar;
        C61303k f = iVar.mo212921f();
        if (f != null) {
            aVar = f.ar();
        } else {
            aVar = null;
        }
        this.f158265a = aVar;
    }

    /* renamed from: a */
    public final void mo217201a(int i) {
        int i2 = 0;
        for (T t : this.f158266b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (i2 >= i) {
                if (t2 != null) {
                    t2.setVisibility(8);
                }
            } else if (i2 < i && t2 != null) {
                t2.setVisibility(4);
            }
            i2 = i3;
        }
    }

    /* renamed from: a */
    public final void mo217202a(ReactionPosition reactionPosition) {
        View view;
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f158270f, R.anim.vc_im_reaction_slide_out);
        ReactionItemLayout reactionItemLayout = this.f158266b.get(reactionPosition.getNumber());
        if (reactionItemLayout != null) {
            view = reactionItemLayout.getRootView();
        } else {
            view = null;
        }
        if (loadAnimation != null) {
            loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC62858e(this, reactionPosition));
        }
        ReactionItemLayout reactionItemLayout2 = this.f158266b.get(reactionPosition.getNumber());
        if (reactionItemLayout2 != null) {
            reactionItemLayout2.setDisplayDuration(0);
        }
        if (view != null) {
            view.startAnimation(loadAnimation);
        }
    }

    /* renamed from: c */
    private final void m246053c(ReactionPosition reactionPosition, ViewItemReaction fVar) {
        m246054d(reactionPosition, fVar);
    }

    /* renamed from: a */
    public final void mo217204a(ReactionPosition reactionPosition, ViewItemReaction fVar) {
        Intrinsics.checkParameterIsNotNull(reactionPosition, "position");
        Intrinsics.checkParameterIsNotNull(fVar, "reactionItem");
        m246052b(reactionPosition, fVar);
        m246053c(reactionPosition, fVar);
    }

    /* renamed from: d */
    private final void m246054d(ReactionPosition reactionPosition, ViewItemReaction fVar) {
        View view;
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f158270f, R.anim.vc_im_reaction_slide_in);
        ReactionItemLayout reactionItemLayout = this.f158266b.get(reactionPosition.getNumber());
        if (reactionItemLayout != null) {
            view = reactionItemLayout.getRootView();
        } else {
            view = null;
        }
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC62857d(this, reactionPosition));
        if (view != null) {
            view.startAnimation(loadAnimation);
        }
        m246051b(reactionPosition);
    }

    /* renamed from: b */
    private final void m246052b(ReactionPosition reactionPosition, ViewItemReaction fVar) {
        String str;
        boolean z;
        String str2;
        ImageView imageView;
        MeetingManager a = MeetingManager.m238341a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
        AbstractC61294b j = a.mo211906j();
        ImageView imageView2 = null;
        if (j != null) {
            str = j.mo212055d();
        } else {
            str = null;
        }
        if (str != null) {
            z = MeetingUtil.m238368a(str, new ByteviewUser(fVar.mo216950a().mo216940a(), fVar.mo216950a().mo216941b(), ParticipantType.valueOf(fVar.mo216950a().mo216944e().getNumber())), MeetingUtil.IdType.DeviceId);
        } else {
            z = false;
        }
        if (z) {
            str2 = UIHelper.getString(R.string.View_M_Interviewer) + ":";
        } else {
            str2 = fVar.mo216950a().mo216942c() + ":";
        }
        ReactionItemLayout reactionItemLayout = this.f158266b.get(reactionPosition.getNumber());
        if (reactionItemLayout != null) {
            reactionItemLayout.invalidate();
        }
        if (reactionItemLayout != null) {
            imageView = reactionItemLayout.getUserAvatar();
        } else {
            imageView = null;
        }
        m246049a(imageView, fVar, z);
        if (reactionItemLayout != null) {
            reactionItemLayout.setUserName(str2);
        }
        C52977a aVar = this.f158268d;
        if (reactionItemLayout != null) {
            imageView2 = reactionItemLayout.getReactionIcon();
        }
        aVar.mo180995a(imageView2, fVar.mo216952b());
        if (reactionItemLayout != null) {
            reactionItemLayout.setReactionNum(fVar.mo216954c());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "aContext");
        this.f158270f = context;
        this.f158268d = C52977a.m205190a();
        this.f158266b = new ArrayList();
        this.f158269e = new HashMap<>();
        m246050b();
    }

    /* renamed from: a */
    private final void m246049a(ImageView imageView, ViewItemReaction fVar, boolean z) {
        if (z) {
            C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, imageView);
        } else {
            C60783v.m236230a(fVar.mo216950a().mo216943d(), fVar.mo216950a().mo216940a(), ParticipantType.valueOf(fVar.mo216950a().mo216944e().getNumber()), imageView, 28, 28);
        }
    }

    /* renamed from: a */
    public final void mo217203a(ReactionPosition reactionPosition, int i, int i2) {
        ReactionState reactionState;
        TextView textView;
        Intrinsics.checkParameterIsNotNull(reactionPosition, "position");
        ReactionItemLayout reactionItemLayout = this.f158266b.get(reactionPosition.getNumber());
        TextView textView2 = null;
        if (reactionItemLayout != null) {
            reactionState = reactionItemLayout.getReactionState();
        } else {
            reactionState = null;
        }
        if (reactionItemLayout != null) {
            reactionItemLayout.setReactionNum(i);
        }
        if (reactionItemLayout != null) {
            reactionItemLayout.setDisplayDuration(i2);
        }
        if (reactionState == ReactionState.DISPLAY) {
            ReactionUtil cVar = ReactionUtil.f157998a;
            if (reactionItemLayout != null) {
                textView = reactionItemLayout.getReactionNum();
            } else {
                textView = null;
            }
            if (reactionItemLayout != null) {
                textView2 = reactionItemLayout.getMultiplication();
            }
            cVar.mo216893a(textView, textView2);
        }
        UICallbackExecutor.removeCallbacks(this.f158269e.get(Integer.valueOf(reactionPosition.getNumber())));
        m246051b(reactionPosition);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReactionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
