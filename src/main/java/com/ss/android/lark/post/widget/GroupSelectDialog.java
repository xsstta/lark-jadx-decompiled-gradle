package com.ss.android.lark.post.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.p078b.p079a.C2048a;
import com.p078b.p079a.C2052c;
import com.ss.android.lark.biz.im.api.C29607af;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout;
import com.ss.android.lark.post.widget.GroupSelectAdapter;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0002()B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0006\u0010\u001c\u001a\u00020\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\u0006\u0010\u001f\u001a\u00020\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J\u0006\u0010#\u001a\u00020\u0016J\u0014\u0010$\u001a\u00020\u00162\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "selectedGroup", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "delegate", "Lcom/ss/android/lark/post/widget/GroupSelectDialog$GroupSelectDelegate;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/chat/Chat;Lcom/ss/android/lark/post/widget/GroupSelectDialog$GroupSelectDelegate;)V", "mSelectedGroup", "themeResId", "", "mDelegate", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/chat/Chat;ILcom/ss/android/lark/post/widget/GroupSelectDialog$GroupSelectDelegate;)V", "hasSelectedData", "", "mContext", "mGroupAdapter", "Lcom/ss/android/lark/post/widget/GroupSelectAdapter;", "mSkeleton", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "dismiss", "", "hideKeyBord", "hideLoadingView", "initGroupShowRecycleView", "initGroupsPtrLayout", "initSkeletonRecycleView", "initView", "initWindow", "isShowSkeleton", "refreshComplete", "show", "startHideAnim", "startShowAnim", "trueDismiss", "updateGroupData", "groupData", "", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "Companion", "GroupSelectDelegate", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.post.b.b */
public final class GroupSelectDialog extends BaseDialog {

    /* renamed from: e */
    public static final Companion f129477e = new Companion(null);

    /* renamed from: a */
    public GroupSelectAdapter f129478a;

    /* renamed from: b */
    public boolean f129479b;

    /* renamed from: c */
    public Chat f129480c;

    /* renamed from: d */
    public GroupSelectDelegate f129481d;

    /* renamed from: f */
    private Context f129482f;

    /* renamed from: g */
    private C2048a f129483g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectDialog$GroupSelectDelegate;", "", "canLoadMore", "", "onGroupClick", "", "topicGroup", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "onLoadMore", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$b */
    public interface GroupSelectDelegate {
        /* renamed from: a */
        void mo178652a(C29607af afVar);

        /* renamed from: a */
        boolean mo178653a();

        /* renamed from: b */
        void mo178654b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/post/widget/GroupSelectDialog$Companion;", "", "()V", "AUTO_LOAD_MESSAGE_THRESHOLD", "", "DRAGLAYOUT_TOP_MARGIN", "", "EXPAND_DRAG_BUTTON_TOUCH_SIZE", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectDialog$initGroupShowRecycleView$1", "Lcom/ss/android/lark/post/widget/GroupSelectAdapter$GroupSelectListener;", "onGroupSelected", "", "topicGroup", "Lcom/ss/android/lark/biz/im/api/TopicGroupChat;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$c */
    public static final class C52182c implements GroupSelectAdapter.GroupSelectListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129484a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.post.b.b$c$a */
        static final class RunnableC52183a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C52182c f129485a;

            RunnableC52183a(C52182c cVar) {
                this.f129485a = cVar;
            }

            public final void run() {
                this.f129485a.f129484a.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52182c(GroupSelectDialog bVar) {
            this.f129484a = bVar;
        }

        @Override // com.ss.android.lark.post.widget.GroupSelectAdapter.GroupSelectListener
        /* renamed from: a */
        public void mo178721a(C29607af afVar) {
            Intrinsics.checkParameterIsNotNull(afVar, "topicGroup");
            GroupSelectDialog bVar = this.f129484a;
            Chat a = afVar.mo106680a();
            Intrinsics.checkExpressionValueIsNotNull(a, "topicGroup.chat");
            bVar.f129480c = a;
            this.f129484a.f129481d.mo178652a(afVar);
            this.f129484a.f129479b = true;
            UICallbackExecutor.executeDelayed(new RunnableC52183a(this), 300);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectDialog$initView$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/DragShrinkLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutHideAnimEnd", "onLayoutHideAnimStart", "onLayoutShowAnimEnd", "onLayoutShowAnimStart", "startDrag", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$f */
    public static final class C52186f implements DragShrinkLayout.AbstractC40746a {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129488a;

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: a */
        public void mo147092a() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: b */
        public void mo147094b() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: c */
        public void mo147095c() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: d */
        public void mo147096d() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: e */
        public void mo147097e() {
            this.f129488a.mo178725c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52186f(GroupSelectDialog bVar) {
            this.f129488a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: a */
        public void mo147093a(float f, float f2) {
            View findViewById = this.f129488a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            findViewById.setAlpha(((f - f2) / f) * 0.6f);
        }
    }

    /* renamed from: h */
    private final boolean m202465h() {
        return UIUtils.canShowSkeleton();
    }

    /* renamed from: c */
    public final void mo178725c() {
        super.dismiss();
        KeyboardUtils.showKeyboard(this.f129482f);
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        super.show();
        m202469l();
        this.f129479b = false;
    }

    /* renamed from: b */
    public final void mo178724b() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) findViewById(R.id.groupPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "groupPtrLayout");
        if (lKUIPtrClassicFrameLayout.isRefreshing()) {
            ((LKUIPtrClassicFrameLayout) findViewById(R.id.groupPtrLayout)).refreshComplete();
        }
    }

    /* renamed from: d */
    public final void mo178726d() {
        if (getCurrentFocus() != null) {
            KeyboardUtils.hideKeyboard(this.f129482f, getCurrentFocus());
        } else {
            KeyboardUtils.hideKeyboard(this.f129482f);
        }
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void dismiss() {
        mo178727e();
        if (this.f129479b) {
            ThreadTopicHitPoint.f135906a.mo187741j("select");
        } else {
            ThreadTopicHitPoint.f135906a.mo187741j("fold");
        }
    }

    /* renamed from: f */
    private final void m202463f() {
        WindowManager.LayoutParams layoutParams;
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
    }

    /* renamed from: k */
    private final void m202468k() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.skeletonLoadingRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "skeletonLoadingRv");
        if (recyclerView.getVisibility() == 0) {
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.skeletonLoadingRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "skeletonLoadingRv");
            recyclerView2.setVisibility(8);
            C2048a aVar = this.f129483g;
            if (aVar != null) {
                aVar.mo10130b();
            }
        }
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) findViewById(R.id.groupPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "groupPtrLayout");
        lKUIPtrClassicFrameLayout.setVisibility(0);
    }

    /* renamed from: g */
    private final void m202464g() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f129482f, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        linearLayoutManager.setStackFromEnd(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.skeletonLoadingRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "skeletonLoadingRv");
        recyclerView.setLayoutManager(linearLayoutManager);
        if (m202465h()) {
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.skeletonLoadingRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "skeletonLoadingRv");
            recyclerView2.setVisibility(0);
            this.f129483g = C2052c.m8960a((RecyclerView) findViewById(R.id.skeletonLoadingRv)).mo10139e(R.layout.item_group_select_skeletom).mo10133a(true).mo10138d(20).mo10137c(R.color.a60_white).mo10131a(11).mo10135b(1000).mo10136b(true).mo10134a();
            return;
        }
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.skeletonLoadingRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "skeletonLoadingRv");
        recyclerView3.setVisibility(8);
    }

    /* renamed from: i */
    private final void m202466i() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f129482f, 1, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        PointRecoderRecyclerView pointRecoderRecyclerView = (PointRecoderRecyclerView) findViewById(R.id.groupRv);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView, "groupRv");
        pointRecoderRecyclerView.setLayoutManager(linearLayoutManager);
        this.f129478a.mo178717a(new C52182c(this));
        PointRecoderRecyclerView pointRecoderRecyclerView2 = (PointRecoderRecyclerView) findViewById(R.id.groupRv);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView2, "groupRv");
        pointRecoderRecyclerView2.setAdapter(this.f129478a);
        ((PointRecoderRecyclerView) findViewById(R.id.groupRv)).addOnScrollListener(new C52184d(this));
        this.f129478a.mo178718a(true);
        this.f129478a.mo178715a(this.f129480c);
    }

    /* renamed from: j */
    private final void m202467j() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f129482f);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) findViewById(R.id.groupPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "groupPtrLayout");
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) findViewById(R.id.groupPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "groupPtrLayout");
        lKUIPtrClassicFrameLayout2.setHeaderView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) findViewById(R.id.groupPtrLayout)).disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = (LKUIPtrClassicFrameLayout) findViewById(R.id.groupPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout3, "groupPtrLayout");
        lKUIPtrClassicFrameLayout3.setForceBackWhenComplete(true);
        ((LKUIPtrClassicFrameLayout) findViewById(R.id.groupPtrLayout)).setPtrHandler(new C52185e(this));
    }

    /* renamed from: l */
    private final void m202469l() {
        int screenHeight = DeviceUtils.getScreenHeight(this.f129482f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 0.6f);
        ofFloat.addUpdateListener(new C52191k(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(screenHeight, 0);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new C52192l(this));
        ofInt.addListener(new C52193m(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    /* renamed from: e */
    public final void mo178727e() {
        DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
        int height = dragShrinkLayout.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.6f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.addUpdateListener(new C52188h(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, height);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new C52189i(this));
        ofInt.addListener(new C52190j(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo178722a() {
        DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
        ViewGroup.LayoutParams layoutParams = dragShrinkLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = UIUtils.dp2px(getContext(), 44.0f);
            DragShrinkLayout dragShrinkLayout2 = (DragShrinkLayout) findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout2, "dragLayout");
            dragShrinkLayout2.setLayoutParams(layoutParams2);
            DragShrinkLayout dragShrinkLayout3 = (DragShrinkLayout) findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout3, "dragLayout");
            dragShrinkLayout3.setVisibility(8);
            View findViewById = findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            findViewById.setVisibility(8);
            m202464g();
            m202467j();
            m202466i();
            ((DragShrinkLayout) findViewById(R.id.dragLayout)).setListener(new C52186f(this));
            ak.m95026a(findViewById(R.id.selectDialogTitle), UIHelper.dp2px(10.0f));
            findViewById(R.id.selectDialogTitle).setOnClickListener(new View$OnClickListenerC52187g(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectDialog$startShowAnim$3", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$m */
    public static final class C52193m implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129495a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.post.b.b$m$b */
        static final class View$OnClickListenerC52195b implements View.OnClickListener {

            /* renamed from: a */
            public static final View$OnClickListenerC52195b f129497a = new View$OnClickListenerC52195b();

            View$OnClickListenerC52195b() {
            }

            public final void onClick(View view) {
            }
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.post.b.b$m$a */
        static final class View$OnClickListenerC52194a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C52193m f129496a;

            View$OnClickListenerC52194a(C52193m mVar) {
                this.f129496a = mVar;
            }

            public final void onClick(View view) {
                this.f129496a.f129495a.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52193m(GroupSelectDialog bVar) {
            this.f129495a = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f129495a.findViewById(R.id.shadowView).setOnClickListener(new View$OnClickListenerC52194a(this));
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) this.f129495a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
            dragShrinkLayout.setVisibility(0);
            View findViewById = this.f129495a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            findViewById.setVisibility(0);
            this.f129495a.findViewById(R.id.shadowView).setOnClickListener(View$OnClickListenerC52195b.f129497a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectDialog$initGroupShowRecycleView$2", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$d */
    public static final class C52184d extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129486a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52184d(GroupSelectDialog bVar) {
            this.f129486a = bVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
            if (i2 >= this.f129486a.f129478a.getItemCount() - 5 && this.f129486a.f129481d.mo178653a()) {
                ((LKUIPtrClassicFrameLayout) this.f129486a.findViewById(R.id.groupPtrLayout)).autoLoadMore();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectDialog$initGroupsPtrLayout$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$e */
    public static final class C52185e extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129487a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(view, "content");
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52185e(GroupSelectDialog bVar) {
            this.f129487a = bVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f129487a.f129481d.mo178654b();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(view, "content");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f129487a.f129481d.mo178653a()) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$g */
    public static final class View$OnClickListenerC52187g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129489a;

        View$OnClickListenerC52187g(GroupSelectDialog bVar) {
            this.f129489a = bVar;
        }

        public final void onClick(View view) {
            this.f129489a.mo178727e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/post/widget/GroupSelectDialog$startHideAnim$3", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$j */
    public static final class C52190j implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129492a;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52190j(GroupSelectDialog bVar) {
            this.f129492a = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f129492a.mo178725c();
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f129492a.mo178725c();
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f129492a.mo178726d();
        }
    }

    /* renamed from: a */
    public final void mo178723a(List<C29607af> list) {
        Intrinsics.checkParameterIsNotNull(list, "groupData");
        m202468k();
        this.f129478a.resetAll(list);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$h */
    public static final class C52188h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129490a;

        C52188h(GroupSelectDialog bVar) {
            this.f129490a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View findViewById = this.f129490a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                findViewById.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$i */
    public static final class C52189i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129491a;

        C52189i(GroupSelectDialog bVar) {
            this.f129491a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) this.f129491a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dragShrinkLayout.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$k */
    public static final class C52191k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129493a;

        C52191k(GroupSelectDialog bVar) {
            this.f129493a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View findViewById = this.f129493a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                findViewById.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.b.b$l */
    public static final class C52192l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GroupSelectDialog f129494a;

        C52192l(GroupSelectDialog bVar) {
            this.f129494a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) this.f129494a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dragShrinkLayout.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupSelectDialog(Context context, Chat chat, GroupSelectDelegate bVar) {
        this(context, chat, R.style.GroupSelectDialog, bVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chat, "selectedGroup");
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupSelectDialog(Context context, Chat chat, int i, GroupSelectDelegate bVar) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chat, "mSelectedGroup");
        Intrinsics.checkParameterIsNotNull(bVar, "mDelegate");
        this.f129480c = chat;
        this.f129481d = bVar;
        this.f129482f = context;
        this.f129478a = new GroupSelectAdapter();
        setContentView(R.layout.dialog_thread_group_select);
        m202463f();
        mo178722a();
    }
}
