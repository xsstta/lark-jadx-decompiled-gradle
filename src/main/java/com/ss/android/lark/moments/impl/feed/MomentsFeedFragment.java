package com.ss.android.lark.moments.impl.feed;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.C1067t;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.moments.v1.CreatePostResponse;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.FeedOrder;
import com.bytedance.lark.pb.moments.v1.ListHashtagPostsRequest;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IForwardDependency;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.widget.MomentsPtrFooterView;
import com.ss.android.lark.moments.impl.common.widget.MomentsPtrHeaderView;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.feed.AppBarStateChangeListener;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.empty.MomentsFeedNoPostItem;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import com.ss.android.lark.moments.impl.feed.model.MomentsFeedViewModel;
import com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.mainview.tab.MomentsTabPageSpec;
import com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity;
import com.ss.android.lark.moments.impl.personal.MomentsPostLoadingItem;
import com.ss.android.lark.moments.impl.privatechat.IMomentsSecretChatHandler;
import com.ss.android.lark.moments.impl.publish.MomentsPublishActivity;
import com.ss.android.lark.moments.impl.report.MomentsReportActivity;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0015\u0018\u0000 I2\u00020\u0001:\u0004IJKLB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0002J\u0006\u0010+\u001a\u00020%J\"\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\b\u0010&\u001a\u0004\u0018\u000100H\u0016J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u00010'H\u0016J\b\u00108\u001a\u00020%H\u0016J\b\u00109\u001a\u00020%H\u0016J\u001a\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u0002022\b\u00107\u001a\u0004\u0018\u00010'H\u0016J\u0006\u0010<\u001a\u00020%J\u000e\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020\u0004J\u0012\u0010?\u001a\u00020\u00062\b\b\u0002\u0010@\u001a\u00020\u0006H\u0002J\u000e\u0010A\u001a\u00020%2\u0006\u0010>\u001a\u00020 J\u000e\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020#J\b\u0010D\u001a\u00020%H\u0002J\u0018\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "disableTabListener", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OnDisableTabListener;", "emptyBtIsShowing", "", "firstResume", "isFromCategoryDetail", "()Z", "setFromCategoryDetail", "(Z)V", "mAdapter", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedAdapter;", "getMAdapter", "()Lcom/ss/android/lark/moments/impl/feed/MomentsFeedAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mCancelableCallbackExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mClickListener", "com/ss/android/lark/moments/impl/feed/MomentsFeedFragment$mClickListener$1", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$mClickListener$1;", "mTouchY", "", "mViewModel", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedViewModel;", "getMViewModel", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsFeedViewModel;", "mViewModel$delegate", "onScrolledSent", "outPageApi", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OutPageApi;", "showTopRound", "titleApi", "Lcom/ss/android/lark/moments/impl/feed/TitleApi;", "dealCreatePostResponse", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/os/Bundle;", "initPullToRefresh", "initRecyclerView", "initViewModel", "mainFragmentOnResume", "onActivityResult", "requestCode", "", "resultCode", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onDestroy", "onResume", "onViewCreated", "view", "refreshFeedList", "registerDisableTabListener", "listener", "sendExposureHitPoint", "isScrollEnd", "setOnRefreshListener", "setTitleApi", "api", "showPageSkeleton", "startMomentsDetailById", "postId", "", "openKeyboard", "Companion", "OnDisableTabListener", "OutPageApi", "ScrollLinearLayoutManager", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsFeedFragment extends BaseFragment {

    /* renamed from: i */
    public static final Companion f119750i = new Companion(null);

    /* renamed from: a */
    public float f119751a;

    /* renamed from: b */
    public TitleApi f119752b;

    /* renamed from: c */
    public boolean f119753c;

    /* renamed from: d */
    public OutPageApi f119754d;

    /* renamed from: e */
    public OnDisableTabListener f119755e;

    /* renamed from: f */
    public C25969c f119756f = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: g */
    public boolean f119757g;

    /* renamed from: h */
    public final C47488s f119758h = new C47488s(this);

    /* renamed from: j */
    private final Lazy f119759j = C1067t.m5172a(this, Reflection.getOrCreateKotlinClass(MomentsFeedViewModel.class), new MomentsFeedFragment$$special$$inlined$viewModels$2(new MomentsFeedFragment$$special$$inlined$viewModels$1(this)), null);

    /* renamed from: k */
    private final Lazy f119760k = LazyKt.lazy(new C47487r(this));

    /* renamed from: l */
    private boolean f119761l;

    /* renamed from: m */
    private boolean f119762m = true;

    /* renamed from: n */
    private boolean f119763n;

    /* renamed from: o */
    private HashMap f119764o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OnDisableTabListener;", "", "onDisableTab", "", "tabId", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$b */
    public interface OnDisableTabListener {
        /* renamed from: a */
        void mo166904a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OutPageApi;", "", "onRefresh", "", "toTimeTab", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$c */
    public interface OutPageApi {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$c$a */
        public static final class C47466a {
            /* renamed from: a */
            public static void m188170a(OutPageApi cVar) {
            }
        }

        /* renamed from: a */
        void mo165982a();

        /* renamed from: b */
        void mo165983b();
    }

    /* renamed from: a */
    public View mo166888a(int i) {
        if (this.f119764o == null) {
            this.f119764o = new HashMap();
        }
        View view = (View) this.f119764o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f119764o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsFeedViewModel mo166889a() {
        return (MomentsFeedViewModel) this.f119759j.getValue();
    }

    /* renamed from: b */
    public final MomentsFeedAdapter mo166896b() {
        return (MomentsFeedAdapter) this.f119760k.getValue();
    }

    /* renamed from: g */
    public void mo166902g() {
        HashMap hashMap = this.f119764o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo166902g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$Companion;", "", "()V", "ARGUMENTS_FEED_ORDER", "", "ARGUMENTS_FROM", "ARGUMENTS_HASH_TAG_CONTENT", "ARGUMENTS_TAB_ID", "ARGUMENTS_TOP_ROUND", "AUTO_LOAD_POST_THRESHOLD", "", "LOG_TAG", "PAGE_POST_COUNT", "VALUE_FROM_CATEGORY", "VALUE_FROM_HASHTAG", "VALUE_FROM_TAB", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsFeedFragment$mClickListener$1", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "createPost", "", "getTouchY", "", "onClickHashTag", "id", "", "content", "postId", "onClickPrivateChat", "context", "Landroid/content/Context;", "commentId", "anonymousName", "onForwardClicked", "contentText", "totalShareCount", "", "categoryId", "onItemCellClicked", "onReplyClicked", "onReportClick", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$s */
    public static final class C47488s implements IMomentClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119788a;

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: b */
        public void mo166622b() {
            IMomentClickListener.C47490a.m188220c(this);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: c */
        public void mo166624c() {
            IMomentClickListener.C47490a.m188213a(this);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: d */
        public void mo166626d() {
            IMomentClickListener.C47490a.m188219b(this);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public float mo166614a() {
            return this.f119788a.f119751a;
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: e */
        public void mo166627e() {
            Intent intent = new Intent(this.f119788a.getContext(), MomentsPublishActivity.class);
            if (Intrinsics.areEqual(this.f119788a.mo166889a().getFrom(), "value_from_hashtag")) {
                Intrinsics.checkExpressionValueIsNotNull(intent.putExtra("page_hash_tag_content", this.f119788a.mo166889a().getHashTagContent()), "intent.putExtra(MomentsP…ViewModel.hashTagContent)");
            } else if (Intrinsics.areEqual(this.f119788a.mo166889a().getFrom(), "value_from_category")) {
                intent.putExtra("default_selected_category_id", this.f119788a.mo166889a().getPageEntityId());
            }
            C47282k.m187260a(this.f119788a, intent, 211);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47488s(MomentsFeedFragment momentsFeedFragment) {
            this.f119788a = momentsFeedFragment;
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166616a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intent intent = new Intent(this.f119788a.mContext, MomentsReportActivity.class);
            intent.putExtra("post_id", str);
            this.f119788a.startActivity(intent);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166617a(String str, View view) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(view, "imageView");
            IMomentClickListener.C47490a.m188216a(this, str, view);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: b */
        public void mo166623b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            IMomentClickListener.C47490a.m188217a(this, str, str2);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: c */
        public void mo166625c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, Comment.f24093e, "moments_detail_page_view", str, (String) null, (Integer) null, 24, (Object) null);
            this.f119788a.mo166894a(str, true);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166618a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            MomentsHitPoint.f119720a.mo166842b(str, "feed_page");
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "post", "moments_detail_page_view", str, (String) null, (Integer) null, 24, (Object) null);
            this.f119788a.mo166894a(str, false);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166621a(ArrayList<PhotoItem> arrayList, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(arrayList, "photoList");
            Intrinsics.checkParameterIsNotNull(imageView, "imageView");
            IMomentClickListener.C47490a.m188218a(this, arrayList, imageView);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166620a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(str3, "postId");
            if (!Intrinsics.areEqual(this.f119788a.mo166889a().getFrom(), "value_from_hashtag") || !Intrinsics.areEqual(this.f119788a.mo166889a().getPageEntityId(), str)) {
                MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "hashtag", "moments_feed_page_view", str3, str, (Integer) null, 16, (Object) null);
                MomentsHashTagFeedActivity.Companion aVar = MomentsHashTagFeedActivity.f120187c;
                Context requireContext = this.f119788a.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                aVar.mo167325a(requireContext, str, str2);
            }
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166615a(Context context, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str3, "anonymousName");
            IMomentsSecretChatHandler.C47453a.m188136a(this.f119788a.mo166889a(), str, null, str3, 2, null);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166619a(String str, String str2, int i, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "contentText");
            Intrinsics.checkParameterIsNotNull(str2, "postId");
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "share", "public_multi_select_share_view", str2, (String) null, (Integer) null, 24, (Object) null);
            IForwardDependency forwardDependency = MomentsDependencyHolder.f118998b.mo165899a().forwardDependency();
            Context context = this.f119788a.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            forwardDependency.mo144712a(context, str, str2, i);
        }
    }

    /* renamed from: c */
    public final boolean mo166898c() {
        return this.f119761l;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\n\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$ScrollLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "isScrollEnable", "canScrollVertically", "setScrollEnable", "", "isEnable", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ScrollLinearLayoutManager extends LinearLayoutManager {

        /* renamed from: a */
        private boolean f119765a = true;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public boolean canScrollVertically() {
            if (!this.f119765a || !super.canScrollVertically()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo166903a(boolean z) {
            this.f119765a = z;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ScrollLinearLayoutManager(Context context, int i, boolean z) {
            super(context, i, z);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/moments/impl/feed/MomentsFeedFragment$refreshFeedList$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$t */
    public static final class RunnableC47489t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119789a;

        RunnableC47489t(MomentsFeedFragment momentsFeedFragment) {
            this.f119789a = momentsFeedFragment;
        }

        public final void run() {
            ((LKUIPtrFrameLayout) this.f119789a.mo166888a(R.id.ptrLayout)).autoRefresh();
        }
    }

    /* renamed from: d */
    public final void mo166899d() {
        MomentsHitPointNew.f119721a.mo166851a();
        m188147a(this, false, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$r */
    static final class C47487r extends Lambda implements Function0<MomentsFeedAdapter> {
        final /* synthetic */ MomentsFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47487r(MomentsFeedFragment momentsFeedFragment) {
            super(0);
            this.this$0 = momentsFeedFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsFeedAdapter invoke() {
            Context context = this.this$0.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            return new MomentsFeedAdapter(context, this.this$0.f119758h);
        }
    }

    /* renamed from: e */
    public final void mo166900e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MomentsPostLoadingItem(this.f119763n));
        mo166896b().mo166945a(arrayList);
    }

    /* renamed from: f */
    public final void mo166901f() {
        MomentsFeedRv momentsFeedRv = (MomentsFeedRv) mo166888a(R.id.rvFeed);
        momentsFeedRv.scrollToPosition(0);
        momentsFeedRv.post(new RunnableC47489t(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f119752b = null;
        this.f119755e = null;
        this.f119754d = null;
        this.f119756f.mo92349b();
    }

    /* renamed from: h */
    private final void m188148h() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        ScrollLinearLayoutManager scrollLinearLayoutManager = new ScrollLinearLayoutManager(context, 1, false);
        scrollLinearLayoutManager.setRecycleChildrenOnDetach(true);
        scrollLinearLayoutManager.setStackFromEnd(false);
        MomentsFeedRv momentsFeedRv = (MomentsFeedRv) mo166888a(R.id.rvFeed);
        Intrinsics.checkExpressionValueIsNotNull(momentsFeedRv, "rvFeed");
        momentsFeedRv.setItemAnimator(null);
        MomentsFeedRv momentsFeedRv2 = (MomentsFeedRv) mo166888a(R.id.rvFeed);
        Intrinsics.checkExpressionValueIsNotNull(momentsFeedRv2, "rvFeed");
        momentsFeedRv2.setLayoutManager(scrollLinearLayoutManager);
        TitleApi fVar = this.f119752b;
        if (fVar != null) {
            ((MomentsFeedRv) mo166888a(R.id.rvFeed)).setTitleApi(fVar);
        }
        MomentsFeedRv momentsFeedRv3 = (MomentsFeedRv) mo166888a(R.id.rvFeed);
        Intrinsics.checkExpressionValueIsNotNull(momentsFeedRv3, "rvFeed");
        momentsFeedRv3.setAdapter(mo166896b());
        ((MomentsFeedRv) mo166888a(R.id.rvFeed)).addOnScrollListener(new C47469f(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!Intrinsics.areEqual(mo166889a().getFrom(), "value_from_tab") || MomentsTabPageSpec.f120325e.mo167455a()) {
            MomentsHitHelper.f119719r.mo166815i("feed_page");
            MomentsHitHelper.f119719r.mo166797a(Intrinsics.areEqual(mo166889a().getFrom(), "value_from_hashtag"), Intrinsics.areEqual(mo166889a().getFrom(), "value_from_tab"), mo166889a().getPageEntityId(), mo166889a().getHashTagOrder(), mo166889a().getFeedOrder());
            MomentsHitPointNew.f119721a.mo166851a();
            boolean z = this.f119762m;
            if (!z || (z && !this.f119757g)) {
                m188147a(this, false, 1, null);
            }
            this.f119762m = false;
        }
    }

    /* renamed from: j */
    private final void m188150j() {
        LKUIPtrFrameLayout lKUIPtrFrameLayout = (LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout, "ptrLayout");
        lKUIPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrFrameLayout lKUIPtrFrameLayout2 = (LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout2, "ptrLayout");
        lKUIPtrFrameLayout2.setForceBackWhenComplete(true);
        ((LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout)).setEnableScrollContentAfterLoad(true);
        ((LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout)).disableWhenHorizontalMove(true);
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        MomentsPtrHeaderView momentsPtrHeaderView = new MomentsPtrHeaderView(context, null, 0, 6, null);
        LKUIPtrFrameLayout lKUIPtrFrameLayout3 = (LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrFrameLayout3, "ptrLayout");
        lKUIPtrFrameLayout3.setHeaderView(momentsPtrHeaderView);
        Context context2 = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
        MomentsPtrFooterView momentsPtrFooterView = new MomentsPtrFooterView(context2, null, 0, 6, null);
        ((LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout)).setFooterView(momentsPtrFooterView);
        ((LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout)).addPtrUIHandler(momentsPtrHeaderView);
        ((LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout)).addPtrUIHandler(momentsPtrFooterView);
        ((LKUIPtrFrameLayout) mo166888a(R.id.ptrLayout)).setPtrHandler(new C47467d(this));
        ((MomentsFeedRv) mo166888a(R.id.rvFeed)).setTouchViewListener(new C47468e(this));
    }

    /* renamed from: i */
    private final void m188149i() {
        mo166889a().setOutPageApi(this.f119754d);
        Bundle arguments = getArguments();
        if (arguments != null) {
            MomentsFeedViewModel a = mo166889a();
            String string = arguments.getString("arguments_tab_id");
            String str = "";
            if (string == null) {
                string = str;
            }
            a.setPageEntityId(string);
            mo166889a().setFrom(arguments.getString("arguments_from"));
            MomentsFeedViewModel a2 = mo166889a();
            FeedOrder fromValue = FeedOrder.fromValue(arguments.getInt("arguments_feed_order"));
            Intrinsics.checkExpressionValueIsNotNull(fromValue, "FeedOrder.fromValue(this…nt(ARGUMENTS_FEED_ORDER))");
            a2.setFeedOrder(fromValue);
            MomentsFeedViewModel a3 = mo166889a();
            String string2 = arguments.getString("arguments_hash_tag_content");
            if (string2 != null) {
                str = string2;
            }
            a3.setHashTagContent(str);
            int i = arguments.getInt("arguments_feed_order");
            if (Intrinsics.areEqual(mo166889a().getFrom(), "value_from_hashtag")) {
                MomentsFeedViewModel a4 = mo166889a();
                ListHashtagPostsRequest.HashtagPostOrder fromValue2 = ListHashtagPostsRequest.HashtagPostOrder.fromValue(i);
                Intrinsics.checkExpressionValueIsNotNull(fromValue2, "ListHashtagPostsRequest.…agPostOrder.fromValue(it)");
                a4.setHashTagOrder(fromValue2);
            } else {
                MomentsFeedViewModel a5 = mo166889a();
                FeedOrder fromValue3 = FeedOrder.fromValue(i);
                Intrinsics.checkExpressionValueIsNotNull(fromValue3, "FeedOrder.fromValue(it)");
                a5.setFeedOrder(fromValue3);
            }
            this.f119763n = arguments.getBoolean("arguments_top_round");
        }
        mo166889a().getDataList().mo5923a(getViewLifecycleOwner(), new C47476j(this));
        mo166889a().getCompleteRefresh().mo5923a(getViewLifecycleOwner(), new C47477k(this));
        mo166889a().getScrollPosition().mo5923a(getViewLifecycleOwner(), new C47478l(this));
        mo166889a().getToastResId().mo5923a(getViewLifecycleOwner(), new C47480m(this));
        mo166889a().getShowCircleLoading().mo5923a(getViewLifecycleOwner(), new C47481n(this));
        mo166889a().getReactionDetailLiveData().mo5923a(getViewLifecycleOwner(), new C47482o(this));
        mo166889a().getPageLoading().mo5923a(getViewLifecycleOwner(), new C47485p(this));
        mo166889a().getCannotReadToastStr().mo5923a(getViewLifecycleOwner(), new C47486q(this));
        mo166889a().getNeedRefresh().mo5923a(getViewLifecycleOwner(), new C47470g(this));
        mo166889a().getStartNickIdentityActivity().mo5923a(getViewLifecycleOwner(), new C47472h(this));
        MomentsFeedViewModel a6 = mo166889a();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner, "viewLifecycleOwner");
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        IMomentsSecretChatHandler.C47453a.m188135a(a6, viewLifecycleOwner, context, null, null, 12, null);
        mo166889a().getToTimeTab().mo5923a(getViewLifecycleOwner(), new C47475i(this));
    }

    /* renamed from: a */
    public final void mo166895a(boolean z) {
        this.f119761l = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsFeedFragment$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$d */
    public static final class C47467d extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119766a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47467d(MomentsFeedFragment momentsFeedFragment) {
            this.f119766a = momentsFeedFragment;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f119766a.mo166889a().loadMore();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            MomentsAppreciableHitPoint.f119684a.mo166766r();
            this.f119766a.mo166889a().refreshList();
            OutPageApi cVar = this.f119766a.f119754d;
            if (cVar != null) {
                cVar.mo165982a();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f119766a.mo166889a().canLoadMore() || !((MomentsFeedRv) this.f119766a.mo166888a(R.id.rvFeed)).mo166921a()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            TitleApi fVar = this.f119766a.f119752b;
            if (fVar == null || fVar.mo165985a() == AppBarStateChangeListener.State.EXPANDED) {
                z = true;
            } else {
                z = false;
            }
            if (!super.checkCanDoRefresh(lKUIPtrFrameLayout, view, view2) || !((MomentsFeedRv) this.f119766a.mo166888a(R.id.rvFeed)).mo166922b() || !z) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/moments/impl/feed/MomentsFeedFragment$initRecyclerView$2", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$f */
    public static final class C47469f extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119768a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47469f(MomentsFeedFragment momentsFeedFragment) {
            this.f119768a = momentsFeedFragment;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
            this.f119768a.mo166897b(true);
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
            if (i2 >= this.f119768a.mo166896b().getItemCount() - 6 && this.f119768a.mo166889a().canLoadMore()) {
                this.f119768a.mo166889a().loadMore();
            }
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (!this.f119768a.f119757g && MomentsFeedFragment.m188147a(this.f119768a, false, 1, null)) {
                this.f119768a.f119757g = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo166891a(OnDisableTabListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f119755e = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$i */
    public static final class C47475i<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119774a;

        C47475i(MomentsFeedFragment momentsFeedFragment) {
            this.f119774a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            OutPageApi cVar = this.f119774a.f119754d;
            if (cVar != null) {
                cVar.mo165983b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$k */
    public static final class C47477k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119776a;

        C47477k(MomentsFeedFragment momentsFeedFragment) {
            this.f119776a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ((LKUIPtrFrameLayout) this.f119776a.mo166888a(R.id.ptrLayout)).refreshComplete();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$g */
    public static final class C47470g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119769a;

        C47470g(MomentsFeedFragment momentsFeedFragment) {
            this.f119769a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f119769a.f119756f.mo92346a(new Runnable(this) {
                    /* class com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.C47470g.RunnableC474711 */

                    /* renamed from: a */
                    final /* synthetic */ C47470g f119770a;

                    {
                        this.f119770a = r1;
                    }

                    public final void run() {
                        this.f119770a.f119769a.mo166901f();
                    }
                }, 500);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$l */
    public static final class C47478l<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119777a;

        C47478l(MomentsFeedFragment momentsFeedFragment) {
            this.f119777a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(final Integer num) {
            this.f119777a.f119756f.mo92346a(new Runnable(this) {
                /* class com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.C47478l.RunnableC474791 */

                /* renamed from: a */
                final /* synthetic */ C47478l f119778a;

                {
                    this.f119778a = r1;
                }

                public final void run() {
                    Integer num = num;
                    Intrinsics.checkExpressionValueIsNotNull(num, "it");
                    ((MomentsFeedRv) this.f119778a.f119777a.mo166888a(R.id.rvFeed)).scrollToPosition(num.intValue());
                }
            }, 100);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "showLoading", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$p */
    public static final class C47485p<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119786a;

        C47485p(MomentsFeedFragment momentsFeedFragment) {
            this.f119786a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "showLoading");
            if (bool.booleanValue()) {
                this.f119786a.mo166900e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "resId", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$m */
    public static final class C47480m<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119780a;

        C47480m(MomentsFeedFragment momentsFeedFragment) {
            this.f119780a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            if (num == null || num.intValue() != -1) {
                Context context = this.f119780a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(num, "resId");
                LKUIToast.show(context, UIHelper.getString(num.intValue()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$n */
    public static final class C47481n<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119781a;

        C47481n(MomentsFeedFragment momentsFeedFragment) {
            this.f119781a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                LKUIToast.showLoading(this.f119781a.getContext(), UIHelper.getString(R.string.Lark_Community_Operating));
            } else {
                LKUIToast.cancelLoading();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$ReactionInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$o */
    public static final class C47482o<T> implements AbstractC1178x<MomentsBaseViewModel.ReactionInfo> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119782a;

        C47482o(MomentsFeedFragment momentsFeedFragment) {
            this.f119782a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(final MomentsBaseViewModel.ReactionInfo cVar) {
            C53002b a = C53002b.m205274a(cVar.mo167019a(), cVar.mo167020b(), true);
            a.mo181046a(new C53002b.AbstractC53005b(this) {
                /* class com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.C47482o.C474831 */

                /* renamed from: a */
                final /* synthetic */ C47482o f119783a;

                {
                    this.f119783a = r1;
                }

                @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
                public final void onItemClicked(String str) {
                    MomentsHitPoint.f119720a.mo166849f("feed_page");
                    IProfileModuleDependency profileModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency();
                    Context context = this.f119783a.f119782a.mContext;
                    Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                    Intrinsics.checkExpressionValueIsNotNull(str, "userId");
                    profileModuleDependency.mo144727a(context, str);
                }
            });
            a.mo181045a(new C53002b.AbstractC53004a(this) {
                /* class com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.C47482o.C474842 */

                /* renamed from: a */
                final /* synthetic */ C47482o f119784a;

                {
                    this.f119784a = r1;
                }

                @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53004a
                /* renamed from: a */
                public final ReactionDetailViewModel mo166647a(String str) {
                    MomentsFeedViewModel a = this.f119784a.f119782a.mo166889a();
                    String c = cVar.mo167021c();
                    Intrinsics.checkExpressionValueIsNotNull(str, "reactionKey");
                    return a.fetchReactionDetail(c, str);
                }
            });
            a.mo181044a(this.f119782a.getChildFragmentManager());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "msg", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$q */
    public static final class C47486q<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119787a;

        C47486q(MomentsFeedFragment momentsFeedFragment) {
            this.f119787a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            boolean z;
            OnDisableTabListener bVar;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (bVar = this.f119787a.f119755e) != null) {
                LKUIToast.show(this.f119787a.getContext(), str);
                bVar.mo166904a(this.f119787a.mo166889a().getPageEntityId());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "need", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$h */
    public static final class C47472h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119771a;

        C47472h(MomentsFeedFragment momentsFeedFragment) {
            this.f119771a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Context context;
            if (Intrinsics.areEqual((Object) bool, (Object) true) && (context = this.f119771a.getContext()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                UDDialogBuilder eVar = new UDDialogBuilder(context);
                String string = UIUtils.getString(context, R.string.Lark_Community_SelectNicknameTitle);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(it, R.…nity_SelectNicknameTitle)");
                String string2 = UIUtils.getString(context, R.string.Lark_Community_ChooseNicknameDialogDesc);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(it, R.…ChooseNicknameDialogDesc)");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(string2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Community_ChooseNicknameDialogChooseNicknameButton, new DialogInterface$OnClickListenerC47473a(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Community_ChooseNicknameDialogNotNowButton, DialogInterface$OnClickListenerC47474b.f119773a)).show();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$h$b */
        public static final class DialogInterface$OnClickListenerC47474b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC47474b f119773a = new DialogInterface$OnClickListenerC47474b();

            DialogInterface$OnClickListenerC47474b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/moments/impl/feed/MomentsFeedFragment$initViewModel$11$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$h$a */
        public static final class DialogInterface$OnClickListenerC47473a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47472h f119772a;

            DialogInterface$OnClickListenerC47473a(C47472h hVar) {
                this.f119772a = hVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                MomentsFeedFragment momentsFeedFragment = this.f119772a.f119771a;
                Intent intent = new Intent(this.f119772a.f119771a.getContext(), NickIdentityChooseActivity.class);
                intent.putExtra("from_click_reaction", true);
                momentsFeedFragment.startActivity(intent);
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo166890a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Serializable serializable = bundle.getSerializable("result_key_create_post_response");
        if (serializable instanceof CreatePostResponse) {
            mo166889a().sendNewPost((CreatePostResponse) serializable);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$j */
    public static final class C47476j<T> implements AbstractC1178x<List<? extends IMomentsItemBase>> {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119775a;

        C47476j(MomentsFeedFragment momentsFeedFragment) {
            this.f119775a = momentsFeedFragment;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends IMomentsItemBase> list) {
            boolean z;
            this.f119775a.f119753c = list.isEmpty();
            if (list.isEmpty()) {
                MomentsFeedAdapter b = this.f119775a.mo166896b();
                ArrayList arrayList = new ArrayList();
                boolean c = this.f119775a.mo166898c();
                if (!Intrinsics.areEqual(this.f119775a.mo166889a().getFrom(), "value_from_hashtag") || this.f119775a.mo166889a().getHashTagOrder() != ListHashtagPostsRequest.HashtagPostOrder.PARTICIPATE_COUNT) {
                    z = false;
                } else {
                    z = true;
                }
                arrayList.add(new MomentsFeedNoPostItem(false, true, c, z, this.f119775a.mo166889a().getPageEntityId()));
                b.mo166945a(arrayList);
            } else {
                MomentsFeedAdapter b2 = this.f119775a.mo166896b();
                Intrinsics.checkExpressionValueIsNotNull(list, "list");
                b2.mo166945a(list);
            }
            Log.m165389i("moments_feed", "setData, size is:" + list.size());
        }
    }

    /* renamed from: a */
    public final void mo166892a(OutPageApi cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f119754d = cVar;
    }

    /* renamed from: b */
    public final boolean mo166897b(boolean z) {
        int i;
        if (!MomentsHitHelper.f119719r.mo166801b(Intrinsics.areEqual(mo166889a().getFrom(), "value_from_hashtag"), Intrinsics.areEqual(mo166889a().getFrom(), "value_from_tab"), mo166889a().getPageEntityId(), mo166889a().getHashTagOrder(), mo166889a().getFeedOrder())) {
            return false;
        }
        MomentsFeedRv momentsFeedRv = (MomentsFeedRv) mo166888a(R.id.rvFeed);
        Intrinsics.checkExpressionValueIsNotNull(momentsFeedRv, "rvFeed");
        RecyclerView.LayoutManager layoutManager = momentsFeedRv.getLayoutManager();
        int i2 = -1;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.findFirstVisibleItemPosition();
            i = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            i = -1;
        }
        if (i2 >= 0 && i >= 0) {
            List<IMomentsItemBase> b = mo166896b().mo166946b();
            if (i2 >= b.size() || i >= b.size() || !MomentsHitPointNew.f119721a.mo166860a(b.subList(i2, i))) {
                return false;
            }
            if (z) {
                MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "slide", "none", (String) null, (String) null, (Integer) null, 28, (Object) null);
            }
            MomentsHitHelper.f119719r.mo166795a(b.subList(i2, i));
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo166893a(TitleApi fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "api");
        this.f119752b = fVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "y", "onTouchiew"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$e */
    public static final class C47468e implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedFragment f119767a;

        C47468e(MomentsFeedFragment momentsFeedFragment) {
            this.f119767a = momentsFeedFragment;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            this.f119767a.f119751a = f2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m188148h();
        m188150j();
        m188149i();
        mo166889a().initData();
    }

    /* renamed from: a */
    public final void mo166894a(String str, boolean z) {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        MomentsDetailLauncher.m187946a(MomentsDetailLauncher.f119660a, this, context, str, z, null, "feed_page", false, false, 208, null);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.moments_fragment_feed, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        boolean z = false;
        if (i == 211 && bundle != null) {
            boolean booleanExtra = intent.getBooleanExtra("result_key_is_anonymous_send", false);
            boolean areEqual = Intrinsics.areEqual(mo166889a().getPageEntityId(), String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.ordinal()));
            if (booleanExtra && !areEqual) {
                mo166890a(bundle);
            }
        } else if (i2 == 101005 && bundle != null) {
            boolean z2 = bundle.getBoolean("post_deleted");
            String string = bundle.getString("post_id");
            if (z2) {
                String str = string;
                if (str == null || str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    mo166889a().onPushEntityDeleted(string, EntityType.POST);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m188147a(MomentsFeedFragment momentsFeedFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return momentsFeedFragment.mo166897b(z);
    }
}
