package com.ss.android.vc.meeting.module.gallery;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60748b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.IResumeSubscribeObserver;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.statistics.event.C63742at;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cJ\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020*H\u0016J \u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\fH\u0002J\u0006\u0010/\u001a\u00020%J\u0006\u00100\u001a\u00020%J\b\u00101\u001a\u00020%H\u0002J\b\u00102\u001a\u00020%H\u0016J\u0018\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*H\u0016J\b\u00106\u001a\u00020%H\u0016J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020%H\u0016J\u0010\u0010;\u001a\u00020%2\u0006\u00104\u001a\u00020*H\u0002J\u0010\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u000209H\u0016J\u0006\u0010>\u001a\u00020%J\b\u0010?\u001a\u00020%H\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"X\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryViewControl;", "Lcom/ss/android/vc/meeting/module/base/BaseViewControl;", "Lcom/ss/android/vc/meeting/module/gallery/IGalleryViewListener;", "Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/IResumeSubscribeObserver;", "present", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "(Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;)V", "animationDuration", "", "asName", "Lcom/ss/android/vc/common/widget/LineHeightTextView;", "galleryAnimationHeight", "", "galleryContainer", "Landroid/widget/FrameLayout;", "galleryHideContainer", "Landroid/widget/LinearLayout;", "galleryHideIcon", "Lcom/ss/android/vc/common/widget/IconFontView;", "galleryLandscapeTopMargin", "galleryLayout", "Lcom/ss/android/vc/meeting/module/gallery/GalleryLinearLayout;", "galleryList", "Landroidx/recyclerview/widget/RecyclerView;", "hideVideoTip", "Landroid/widget/TextView;", "popupViewRef", "Ljava/lang/ref/WeakReference;", "Landroid/widget/PopupWindow;", "preFirstPosition", "preLastPosition", "getPresent", "()Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "sGuideDependency", "Lcom/ss/android/vc/dependency/IGuideDependency;", "kotlin.jvm.PlatformType", "addPopupWindow", "", "popWindow", "destroy", "destroyGallery", "galleryVideoListVisible", "", "getValidVisiblePos", "recyclerView", "visiblePos", "completeVisiblePos", "hideASAndShowGalleryAnimation", "hideGalleryAnimation", "initGalleryList", "notifyRefreshAll", "onOrientation", "isLandscape", "isRotate", "onResumeSubscribe", "refreshParticipantUI", "key", "", "refreshShownGalleryUI", "resizeAsBanner", "setActiveSpeakerName", "name", "showASAnimation", "showGallery", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.gallery.f */
public final class GalleryViewControl extends AbstractC61424d implements IResumeSubscribeObserver, IGalleryViewListener {

    /* renamed from: i */
    public static final String f155468i;

    /* renamed from: j */
    public static final Companion f155469j;

    /* renamed from: a */
    public RecyclerView f155470a;

    /* renamed from: b */
    public IconFontView f155471b;

    /* renamed from: c */
    public LinearLayout f155472c;

    /* renamed from: d */
    public FrameLayout f155473d;

    /* renamed from: e */
    public final int f155474e = (UIHelper.dp2px(78.5f) - UIHelper.dp2px(4.0f));

    /* renamed from: f */
    public LineHeightTextView f155475f;

    /* renamed from: g */
    public int f155476g;

    /* renamed from: h */
    public int f155477h;

    /* renamed from: k */
    private GalleryLinearLayout f155478k;

    /* renamed from: l */
    private final int f155479l = UIHelper.dp2px(78.5f);

    /* renamed from: m */
    private final long f155480m = 200;

    /* renamed from: n */
    private TextView f155481n;

    /* renamed from: o */
    private final AbstractC60902q f155482o;

    /* renamed from: p */
    private WeakReference<PopupWindow> f155483p;

    /* renamed from: q */
    private final AbstractC61429i f155484q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/gallery/GalleryViewControl$Companion;", "", "()V", "ITEM_VISIBLE_PERCENT", "", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/vc/meeting/module/gallery/GalleryViewControl$initGalleryList$3", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$h */
    public static final class C61913h extends RecyclerView.AbstractC1335d {
        C61913h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            if (recyclerView.getAdapter() != null) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter!!");
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    rect.right = UIHelper.dp2px(3.5f);
                }
            }
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = UIHelper.dp2px(3.5f);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/gallery/GalleryViewControl$showASAnimation$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "p0", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$k */
    public static final class C61916k implements Animator.AnimatorListener {
        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        C61916k() {
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: m */
    public void mo214359m() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.f155470a;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: o */
    public boolean mo214361o() {
        RecyclerView recyclerView = this.f155470a;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    static {
        Companion aVar = new Companion(null);
        f155469j = aVar;
        f155468i = "GalleryViewControl@" + aVar.hashCode();
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.rtcstream.IResumeSubscribeObserver
    /* renamed from: a */
    public void mo212235a() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ax().mo214339e(true);
        mo214359m();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C60700b.m235851b(f155468i, "[destroy]", "destroy");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ax().mo214331b(this);
        mo214374f();
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: n */
    public void mo214360n() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        for (Map.Entry<String, GalleryModel> entry : meeting.ax().mo214337d().entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().mo214367d()) {
                mo214356e(key);
            }
        }
    }

    /* renamed from: e */
    public final void mo214373e() {
        String str = f155468i;
        C60700b.m235851b(str, "[showASAnimation]", "show");
        if (this.f155471b == null || this.f155472c == null) {
            C60700b.m235851b(str, "[showASAnimation2]", "null param");
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(this.f155480m);
        ofFloat.addUpdateListener(new C61915j(this));
        ofFloat.addListener(new C61916k());
        ofFloat.start();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$f */
    public static final class RunnableC61911f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GalleryViewControl f155493a;

        RunnableC61911f(GalleryViewControl fVar) {
            this.f155493a = fVar;
        }

        public final void run() {
            int i;
            if (this.f155493a.f155470a != null) {
                GalleryViewControl fVar = this.f155493a;
                RecyclerView recyclerView = fVar.f155470a;
                if (recyclerView == null) {
                    Intrinsics.throwNpe();
                }
                RecyclerView recyclerView2 = this.f155493a.f155470a;
                if (recyclerView2 == null) {
                    Intrinsics.throwNpe();
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                    RecyclerView recyclerView3 = this.f155493a.f155470a;
                    if (recyclerView3 == null) {
                        Intrinsics.throwNpe();
                    }
                    RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
                    if (layoutManager2 != null) {
                        int a = fVar.mo214368a(recyclerView, findLastVisibleItemPosition, ((LinearLayoutManager) layoutManager2).findLastCompletelyVisibleItemPosition());
                        C61303k meeting = this.f155493a.getMeeting();
                        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                        meeting.ax().mo214330b(a);
                        int e = C60776r.m236147e();
                        RecyclerView recyclerView4 = this.f155493a.f155470a;
                        if (recyclerView4 == null) {
                            Intrinsics.throwNpe();
                        }
                        RecyclerView.LayoutManager layoutManager3 = recyclerView4.getLayoutManager();
                        if (layoutManager3 != null) {
                            View childAt = ((LinearLayoutManager) layoutManager3).getChildAt(0);
                            if (childAt != null) {
                                i = childAt.getMeasuredWidth();
                            } else {
                                i = C60773o.m236115a(114.0d);
                            }
                            C61303k meeting2 = this.f155493a.getMeeting();
                            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                            meeting2.ax().mo214335c((int) (((double) (((float) e) / ((float) i))) + 0.5d));
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
        }
    }

    /* renamed from: g */
    private final void m241858g() {
        C60700b.m235851b(f155468i, "[initGalleryList]", "initGalleryList");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ar.m236694a());
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = this.f155470a;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        InMeetingPresenter j = this.f155484q.mo212925j();
        Intrinsics.checkExpressionValueIsNotNull(j, "present.inMeetingPresenter");
        Activity activity = getActivity();
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
        GalleryAdapter bVar = new GalleryAdapter(meeting, j, activity);
        RecyclerView recyclerView2 = this.f155470a;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(bVar);
        }
        RecyclerView recyclerView3 = this.f155470a;
        if (recyclerView3 != null) {
            recyclerView3.post(new RunnableC61911f(this));
        }
        RecyclerView recyclerView4 = this.f155470a;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new C61912g(this));
        }
        RecyclerView recyclerView5 = this.f155470a;
        if (recyclerView5 != null) {
            recyclerView5.addItemDecoration(new C61913h());
        }
        LinearLayout linearLayout = this.f155472c;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C61914i(this));
        }
    }

    /* renamed from: c */
    public final void mo214371c() {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        TextView textView;
        String str = f155468i;
        C60700b.m235851b(str, "[hideGalleryAnimation]", "hide");
        TextView textView2 = this.f155481n;
        if (!(textView2 == null || textView2.getVisibility() != 0 || (textView = this.f155481n) == null)) {
            C60752f.m236083c(textView);
        }
        if (this.f155471b == null || this.f155470a == null || (frameLayout = this.f155473d) == null) {
            C60700b.m235851b(str, "[hideGalleryAnimation2]", "null param");
            return;
        }
        if (frameLayout == null) {
            Intrinsics.throwNpe();
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            LinearLayout linearLayout = this.f155472c;
            if (linearLayout != null) {
                layoutParams = linearLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
            ofFloat.setDuration(this.f155480m);
            ofFloat.addUpdateListener(new C61909d(this, marginLayoutParams, layoutParams));
            ofFloat.addListener(new C61910e(this));
            ofFloat.start();
            this.f155482o.completeGuide("mobile_vc_magic_share_hide_video", true);
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            C63742at.m250117x(meeting.mo212056e());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: d */
    public final void mo214372d() {
        ViewGroup.LayoutParams layoutParams;
        TextView textView;
        String str = f155468i;
        C60700b.m235851b(str, "[hideASAnimation]", "hide");
        TextView textView2 = this.f155481n;
        if (!(textView2 == null || textView2.getVisibility() != 0 || (textView = this.f155481n) == null)) {
            C60752f.m236083c(textView);
        }
        if (this.f155470a == null || this.f155473d == null) {
            C60700b.m235851b(str, "[hideASAnimation2]", "null param");
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        FrameLayout frameLayout = this.f155473d;
        if (frameLayout == null) {
            Intrinsics.throwNpe();
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            LinearLayout linearLayout = this.f155472c;
            if (linearLayout != null) {
                layoutParams = linearLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
            ofFloat.setDuration(this.f155480m);
            ofFloat.addUpdateListener(new C61907b(this, marginLayoutParams, layoutParams));
            ofFloat.addListener(new C61908c(this));
            ofFloat.start();
            this.f155482o.completeGuide("mobile_vc_magic_share_hide_video", true);
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            C63742at.m250118y(meeting.mo212056e());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: f */
    public void mo214374f() {
        RecyclerView.Adapter adapter;
        if (this.f155478k != null) {
            C60700b.m235851b(f155468i, "[destroyGallery]", "destroyGallery");
            GalleryLinearLayout galleryLinearLayout = this.f155478k;
            if (galleryLinearLayout != null) {
                galleryLinearLayout.setGalleryViewControl(null);
            }
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ax().mo214342g();
            FrameLayout frameLayout = this.f155473d;
            if (frameLayout != null) {
                C60740ad.m236048a(frameLayout, 8, 1000);
            }
            C61303k meeting2 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
            meeting2.mo212102T().mo212219b(this);
            RecyclerView recyclerView = this.f155470a;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (!(adapter instanceof GalleryAdapter)) {
                adapter = null;
            }
            GalleryAdapter bVar = (GalleryAdapter) adapter;
            if (bVar != null) {
                bVar.mo214348a();
            }
            this.f155470a = null;
            this.f155478k = null;
            this.f155471b = null;
            this.f155472c = null;
            this.f155473d = null;
            this.f155475f = null;
            this.f155481n = null;
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            meeting3.ax().mo214339e(false);
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            meeting4.ax().mo214345j();
        }
    }

    /* renamed from: b */
    public void mo214370b() {
        RecyclerView recyclerView;
        IconFontView iconFontView;
        LinearLayout linearLayout;
        LineHeightTextView lineHeightTextView;
        String str = f155468i;
        StringBuilder sb = new StringBuilder();
        sb.append("is showing = ");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        sb.append(meeting.ax().mo214346k());
        C60700b.m235851b(str, "[showGallery]", sb.toString());
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        if (!meeting2.ax().mo214346k()) {
            C61303k meeting3 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
            meeting3.ax().mo214328a(true);
            C61303k meeting4 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
            meeting4.ax().mo214341f();
            C61303k meeting5 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
            meeting5.az().mo216036b();
            TextView textView = null;
            View a = C60748b.m236068a(getActivity(), R.layout.layout_gallery_viewgroup, null, false);
            if (!(a instanceof GalleryLinearLayout)) {
                a = null;
            }
            GalleryLinearLayout galleryLinearLayout = (GalleryLinearLayout) a;
            this.f155478k = galleryLinearLayout;
            if (galleryLinearLayout != null) {
                galleryLinearLayout.setGalleryViewControl(this);
            }
            GalleryLinearLayout galleryLinearLayout2 = this.f155478k;
            if (galleryLinearLayout2 != null) {
                recyclerView = (RecyclerView) galleryLinearLayout2.findViewById(R.id.stream_list_recyclerview);
            } else {
                recyclerView = null;
            }
            this.f155470a = recyclerView;
            GalleryLinearLayout galleryLinearLayout3 = this.f155478k;
            if (galleryLinearLayout3 != null) {
                iconFontView = (IconFontView) galleryLinearLayout3.findViewById(R.id.gallery_hide_icon);
            } else {
                iconFontView = null;
            }
            this.f155471b = iconFontView;
            GalleryLinearLayout galleryLinearLayout4 = this.f155478k;
            if (galleryLinearLayout4 != null) {
                linearLayout = (LinearLayout) galleryLinearLayout4.findViewById(R.id.gallery_hide_icon_container);
            } else {
                linearLayout = null;
            }
            this.f155472c = linearLayout;
            GalleryLinearLayout galleryLinearLayout5 = this.f155478k;
            if (galleryLinearLayout5 != null) {
                lineHeightTextView = (LineHeightTextView) galleryLinearLayout5.findViewById(R.id.gallery_active_speaker_name);
            } else {
                lineHeightTextView = null;
            }
            this.f155475f = lineHeightTextView;
            GalleryLinearLayout galleryLinearLayout6 = this.f155478k;
            if (galleryLinearLayout6 != null) {
                textView = (TextView) galleryLinearLayout6.findViewById(R.id.gellery_show_video_guide);
            }
            this.f155481n = textView;
            this.f155473d = (FrameLayout) getRootView().findViewById(R.id.container_video_gallery);
            LineHeightTextView lineHeightTextView2 = this.f155475f;
            if (lineHeightTextView2 != null) {
                lineHeightTextView2.setText(UIHelper.mustacheFormat((int) R.string.View_VM_SpeakingColonName, "name", ""));
            }
            m241858g();
            onOrientation(C61999a.m242220f(), true);
            FrameLayout frameLayout = this.f155473d;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            FrameLayout frameLayout2 = this.f155473d;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.f155478k, new FrameLayout.LayoutParams(-1, -2));
            }
            C61303k meeting6 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
            meeting6.ax().mo214339e(true);
            C61303k meeting7 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting7, "meeting");
            meeting7.mo212102T().mo212209a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/gallery/GalleryViewControl$hideASAndShowGalleryAnimation$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "p0", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$c */
    public static final class C61908c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ GalleryViewControl f155488a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61908c(GalleryViewControl fVar) {
            this.f155488a = fVar;
        }

        public void onAnimationStart(Animator animator) {
            LineHeightTextView lineHeightTextView = this.f155488a.f155475f;
            if (lineHeightTextView != null) {
                C60752f.m236083c(lineHeightTextView);
            }
            RecyclerView recyclerView = this.f155488a.f155470a;
            if (recyclerView != null) {
                C60752f.m236079a((View) recyclerView);
            }
            this.f155488a.mo214359m();
        }

        public void onAnimationEnd(Animator animator) {
            ViewGroup.LayoutParams layoutParams;
            IconFontView iconFontView = this.f155488a.f155471b;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (iconFontView != null) {
                layoutParams = iconFontView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = UIHelper.dp2px(1.0f);
            }
            LinearLayout linearLayout = this.f155488a.f155472c;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(C60773o.m236126d(R.color.vc_bg_body));
            }
            IconFontView iconFontView2 = this.f155488a.f155471b;
            if (iconFontView2 != null) {
                iconFontView2.setRotation(BitmapDescriptorFactory.HUE_RED);
            }
            LinearLayout linearLayout2 = this.f155488a.f155472c;
            if (linearLayout2 != null) {
                linearLayout2.setAlpha(1.0f);
            }
            C61303k meeting = this.f155488a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ax().mo214336c(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/gallery/GalleryViewControl$hideGalleryAnimation$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "p0", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$e */
    public static final class C61910e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ GalleryViewControl f155492a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61910e(GalleryViewControl fVar) {
            this.f155492a = fVar;
        }

        public void onAnimationEnd(Animator animator) {
            ViewGroup.LayoutParams layoutParams;
            RecyclerView recyclerView = this.f155492a.f155470a;
            if (recyclerView != null) {
                C60752f.m236081b((View) recyclerView);
            }
            this.f155492a.mo214359m();
            LineHeightTextView lineHeightTextView = this.f155492a.f155475f;
            if (lineHeightTextView != null) {
                C60752f.m236079a((View) lineHeightTextView);
            }
            C61303k meeting = this.f155492a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            meeting.ax().mo214336c(false);
            IconFontView iconFontView = this.f155492a.f155471b;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (iconFontView != null) {
                layoutParams = iconFontView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED);
                IconFontView iconFontView2 = this.f155492a.f155471b;
                if (iconFontView2 != null) {
                    iconFontView2.setLayoutParams(marginLayoutParams2);
                }
            }
            LinearLayout linearLayout = this.f155492a.f155472c;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(C60773o.m236116a((int) R.color.ud_N300, 0.5f));
            }
            IconFontView iconFontView3 = this.f155492a.f155471b;
            if (iconFontView3 != null) {
                iconFontView3.setRotation(180.0f);
            }
            this.f155492a.mo214373e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/gallery/GalleryViewControl$initGalleryList$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$g */
    public static final class C61912g extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ GalleryViewControl f155494a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61912g(GalleryViewControl fVar) {
            this.f155494a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            boolean z = false;
            if (i == 0) {
                C60700b.m235851b(GalleryViewControl.f155468i, "[onScrollStateChanged]", "SCROLL_STATE_IDLE");
                C61303k meeting = this.f155494a.getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
                meeting.ax().mo214328a(true);
                GalleryViewControl fVar = this.f155494a;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    if (layoutManager2 != null) {
                        int a = fVar.mo214368a(recyclerView, findFirstVisibleItemPosition, ((LinearLayoutManager) layoutManager2).findFirstCompletelyVisibleItemPosition());
                        GalleryViewControl fVar2 = this.f155494a;
                        RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                        if (layoutManager3 != null) {
                            int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager3).findLastVisibleItemPosition();
                            RecyclerView.LayoutManager layoutManager4 = recyclerView.getLayoutManager();
                            if (layoutManager4 != null) {
                                int a2 = fVar2.mo214368a(recyclerView, findLastVisibleItemPosition, ((LinearLayoutManager) layoutManager4).findLastCompletelyVisibleItemPosition());
                                if (!(a == this.f155494a.f155476g && a2 == this.f155494a.f155477h)) {
                                    this.f155494a.f155476g = a;
                                    this.f155494a.f155477h = a2;
                                    z = true;
                                }
                                C61303k meeting2 = this.f155494a.getMeeting();
                                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                                meeting2.ax().mo214324a(a);
                                C61303k meeting3 = this.f155494a.getMeeting();
                                Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                                meeting3.ax().mo214330b(a2);
                                C61303k meeting4 = this.f155494a.getMeeting();
                                Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
                                if (meeting4.ax().mo214346k()) {
                                    C61303k meeting5 = this.f155494a.getMeeting();
                                    Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
                                    meeting5.ax().mo214323a();
                                    if (z) {
                                        C61303k meeting6 = this.f155494a.getMeeting();
                                        Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
                                        AbsGalleryControl ax = meeting6.ax();
                                        C61303k meeting7 = this.f155494a.getMeeting();
                                        Intrinsics.checkExpressionValueIsNotNull(meeting7, "meeting");
                                        ax.mo214327a("", false, meeting7.mo212163w().mo219600a(), TriggerType.PAGE_CHANGE, (HashSet<String>) null);
                                    }
                                    this.f155494a.mo214359m();
                                    return;
                                }
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
            C60700b.m235851b(GalleryViewControl.f155468i, "[onScrollStateChanged2]", "SCROLL");
            C61303k meeting8 = this.f155494a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting8, "meeting");
            meeting8.ax().mo214328a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/gallery/GalleryViewControl$initGalleryList$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$i */
    public static final class C61914i extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ GalleryViewControl f155495a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61914i(GalleryViewControl fVar) {
            this.f155495a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            RecyclerView recyclerView = this.f155495a.f155470a;
            if (recyclerView == null || recyclerView.getVisibility() != 0) {
                RecyclerView recyclerView2 = this.f155495a.f155470a;
                if (recyclerView2 != null && recyclerView2.getVisibility() == 4 && !C61999a.m242220f()) {
                    this.f155495a.mo214372d();
                    return;
                }
                return;
            }
            this.f155495a.mo214371c();
        }
    }

    /* renamed from: a */
    public final void mo214369a(PopupWindow popupWindow) {
        Intrinsics.checkParameterIsNotNull(popupWindow, "popWindow");
        this.f155483p = new WeakReference<>(popupWindow);
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: e */
    public void mo214356e(String str) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkParameterIsNotNull(str, "key");
        RecyclerView recyclerView = this.f155470a;
        GalleryAdapter bVar = null;
        if (recyclerView != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof GalleryAdapter) {
            bVar = adapter;
        }
        GalleryAdapter bVar2 = bVar;
        if (bVar2 != null) {
            bVar2.mo214351a(str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.gallery.IGalleryViewListener
    /* renamed from: f */
    public void mo214357f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        LineHeightTextView lineHeightTextView = this.f155475f;
        if (lineHeightTextView != null) {
            lineHeightTextView.setText(UIHelper.mustacheFormat((int) R.string.View_VM_SpeakingColonName, "name", str));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$j */
    public static final class C61915j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GalleryViewControl f155496a;

        C61915j(GalleryViewControl fVar) {
            this.f155496a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                LinearLayout linearLayout = this.f155496a.f155472c;
                if (linearLayout != null) {
                    linearLayout.setAlpha(floatValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$b */
    public static final class C61907b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GalleryViewControl f155485a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f155486b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup.LayoutParams f155487c;

        C61907b(GalleryViewControl fVar, ViewGroup.MarginLayoutParams marginLayoutParams, ViewGroup.LayoutParams layoutParams) {
            this.f155485a = fVar;
            this.f155486b = marginLayoutParams;
            this.f155487c = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = ((float) 1) - floatValue;
                this.f155486b.topMargin = (int) (((float) (-this.f155485a.f155474e)) * f);
                FrameLayout frameLayout = this.f155485a.f155473d;
                if (frameLayout != null) {
                    frameLayout.setLayoutParams(this.f155486b);
                }
                LinearLayout linearLayout = this.f155485a.f155472c;
                if (linearLayout != null) {
                    linearLayout.setAlpha(f);
                }
                RecyclerView recyclerView = this.f155485a.f155470a;
                if (recyclerView != null) {
                    recyclerView.setAlpha(floatValue);
                }
                ViewGroup.LayoutParams layoutParams = this.f155487c;
                if (layoutParams != null) {
                    if (layoutParams != null) {
                        layoutParams.height = UIHelper.dp2px(32.0f) - UIHelper.dp2px(((float) 12) * floatValue);
                    }
                    LinearLayout linearLayout2 = this.f155485a.f155472c;
                    if (linearLayout2 != null) {
                        linearLayout2.setLayoutParams(this.f155487c);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.gallery.f$d */
    public static final class C61909d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ GalleryViewControl f155489a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f155490b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup.LayoutParams f155491c;

        C61909d(GalleryViewControl fVar, ViewGroup.MarginLayoutParams marginLayoutParams, ViewGroup.LayoutParams layoutParams) {
            this.f155489a = fVar;
            this.f155490b = marginLayoutParams;
            this.f155491c = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f155490b.topMargin = -((int) (((float) this.f155489a.f155474e) * floatValue));
                FrameLayout frameLayout = this.f155489a.f155473d;
                if (frameLayout != null) {
                    frameLayout.setLayoutParams(this.f155490b);
                }
                ViewGroup.LayoutParams layoutParams = this.f155491c;
                if (layoutParams != null) {
                    if (layoutParams != null) {
                        layoutParams.height = UIHelper.dp2px(20.0f) + UIHelper.dp2px(12.0f * floatValue);
                    }
                    LinearLayout linearLayout = this.f155489a.f155472c;
                    if (linearLayout != null) {
                        linearLayout.setLayoutParams(this.f155491c);
                    }
                }
                RecyclerView recyclerView = this.f155489a.f155470a;
                if (recyclerView != null) {
                    recyclerView.setAlpha(((float) 1) - floatValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryViewControl(AbstractC61429i iVar) {
        super(iVar);
        Intrinsics.checkParameterIsNotNull(iVar, "present");
        this.f155484q = iVar;
        IVideoChatDependency dependency = VideoChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModule.getDependency()");
        this.f155482o = dependency.getGuideDependency();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ax().mo214325a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01b3, code lost:
        if (r0.ax().mo214343h() != false) goto L_0x01b7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m241857a(boolean r10) {
        /*
        // Method dump skipped, instructions count: 479
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.gallery.GalleryViewControl.m241857a(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0105  */
    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientation(boolean r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.gallery.GalleryViewControl.onOrientation(boolean, boolean):void");
    }

    /* renamed from: a */
    public final int mo214368a(RecyclerView recyclerView, int i, int i2) {
        if (i == i2) {
            return i;
        }
        Rect rect = new Rect();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            View findViewByPosition = ((LinearLayoutManager) layoutManager).findViewByPosition(i);
            return (findViewByPosition == null || !findViewByPosition.getGlobalVisibleRect(rect) || ((float) rect.width()) < ((float) findViewByPosition.getMeasuredWidth()) * 0.5f) ? i2 : i;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }
}
