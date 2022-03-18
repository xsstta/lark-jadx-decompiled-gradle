package com.ss.android.lark.moments.impl.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.CreateCommentResponse;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IForwardDependency;
import com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.widget.C47292b;
import com.ss.android.lark.moments.impl.common.widget.C47297c;
import com.ss.android.lark.moments.impl.common.widget.ScrollerConflictPtrFrameLayout;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.detail.MomentsDetailViewModel;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import com.ss.android.lark.moments.impl.hashtag.MomentsHashTagFeedActivity;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitHelper;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.moments.impl.nickname.NickIdentityChooseActivity;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.report.MomentsReportActivity;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0013\u0018\u0000 N2\u00020\u0001:\u0001NB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020\nH\u0002J\r\u0010$\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010%J$\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J \u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u000103J\b\u00104\u001a\u00020.H\u0002J\b\u00105\u001a\u00020.H\u0002J\b\u00106\u001a\u00020.H\u0002J\b\u00107\u001a\u00020.H\u0002J\b\u00108\u001a\u00020.H\u0002J\b\u00109\u001a\u00020\nH\u0002J\u0006\u0010:\u001a\u00020.J\u0012\u0010;\u001a\u00020.2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J&\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010D\u001a\u00020.H\u0016J\b\u0010E\u001a\u00020.H\u0014J\b\u0010F\u001a\u00020.H\u0016J\b\u0010G\u001a\u00020.H\u0016J\u001a\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020?2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0006\u0010J\u001a\u00020.J\u0010\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020\u0018H\u0002J\u0006\u0010M\u001a\u00020.R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "mAdapter", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailAdapter;", "getMAdapter", "()Lcom/ss/android/lark/moments/impl/detail/MomentsDetailAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mHasSendViewEvent", "", "mKeyBoardManager", "Lcom/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager;", "getMKeyBoardManager", "()Lcom/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager;", "mKeyBoardManager$delegate", "mListScroller", "Lcom/ss/android/lark/moments/impl/common/widget/ListScroller;", "mListener", "com/ss/android/lark/moments/impl/detail/MomentsDetailFragment$mListener$1", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailFragment$mListener$1;", "mNeedShowJumpTitle", "mPostDeleted", "mPostId", "", "mScrollCommentId", "mShowComment", "mTouchY", "", "mViewModel", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel;", "getMViewModel", "()Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel;", "mViewModel$delegate", "toastedDraftFail", "checkValid", "enableClick", "()Ljava/lang/Boolean;", "getDigest", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "hasImage", "user", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", "handleActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "initKeyBoard", "initPullToRefresh", "initRecycleView", "initTitleBar", "initViewModel", "judgeToShowDeletedPage", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onFinish", "onResume", "onStop", "onViewCreated", "view", "resetKeyboardStoppedState", "showReplyCommentMode", "id", "stopKeyboard", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.d */
public final class MomentsDetailFragment extends BaseFragment {

    /* renamed from: j */
    public static final Companion f119611j = new Companion(null);

    /* renamed from: a */
    public String f119612a = "";

    /* renamed from: b */
    public boolean f119613b;

    /* renamed from: c */
    public String f119614c = "";

    /* renamed from: d */
    public boolean f119615d;

    /* renamed from: e */
    public float f119616e;

    /* renamed from: f */
    public boolean f119617f;

    /* renamed from: g */
    public C47297c<MomentsDetailAdapter> f119618g = new C47297c<>();

    /* renamed from: h */
    public boolean f119619h;

    /* renamed from: i */
    public final C47391ad f119620i = new C47391ad(this);

    /* renamed from: k */
    private boolean f119621k;

    /* renamed from: l */
    private final Lazy f119622l = LazyKt.lazy(new C47392ae(this));

    /* renamed from: m */
    private final Lazy f119623m = LazyKt.lazy(new C47389ab(this));

    /* renamed from: n */
    private final Lazy f119624n = LazyKt.lazy(new C47390ac(this));

    /* renamed from: o */
    private HashMap f119625o;

    /* renamed from: a */
    public View mo166601a(int i) {
        if (this.f119625o == null) {
            this.f119625o = new HashMap();
        }
        View view = (View) this.f119625o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f119625o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MomentsDetailViewModel mo166602a() {
        return (MomentsDetailViewModel) this.f119622l.getValue();
    }

    /* renamed from: b */
    public final MomentsDetailAdapter mo166605b() {
        return (MomentsDetailAdapter) this.f119623m.getValue();
    }

    /* renamed from: c */
    public final MomentsCommentKeyBoardManager mo166606c() {
        return (MomentsCommentKeyBoardManager) this.f119624n.getValue();
    }

    /* renamed from: h */
    public void mo166611h() {
        HashMap hashMap = this.f119625o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo166611h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailFragment$Companion;", "", "()V", "EXTRA_POST_DELETED", "", "EXTRA_POST_ID", "LOG_TAG", "RESULT_CODE_DELETE", "", "newInstance", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailFragment;", "argus", "Landroid/os/Bundle;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsDetailFragment mo166612a(Bundle bundle) {
            MomentsDetailFragment dVar = new MomentsDetailFragment();
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J,\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J*\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u001a\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u0019"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsDetailFragment$mListener$1", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "getTouchY", "", "onClickHashTag", "", "id", "", "content", "postId", "onClickPrivateChat", "context", "Landroid/content/Context;", "commentId", "anonymousName", "onForwardClicked", "contentText", "totalShareCount", "", "categoryId", "onItemCellClicked", "onItemCellLongClicked", "onNoContentItemClicked", "onReplyClicked", "onReportClick", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$ad */
    public static final class C47391ad implements IMomentClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119627a;

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
        /* renamed from: e */
        public void mo166627e() {
            IMomentClickListener.C47490a.m188221d(this);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public float mo166614a() {
            return this.f119627a.f119616e;
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: b */
        public void mo166622b() {
            if (!Intrinsics.areEqual((Object) this.f119627a.mo166602a().getDisableComment().mo5927b(), (Object) true)) {
                this.f119627a.mo166606c().mo166571d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47391ad(MomentsDetailFragment dVar) {
            this.f119627a = dVar;
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166616a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "postId");
            Intent intent = new Intent(this.f119627a.mContext, MomentsReportActivity.class);
            intent.putExtra("post_id", str);
            this.f119627a.startActivity(intent);
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
            this.f119627a.mo166606c().mo166572e();
            this.f119627a.mo166606c().mo166574g();
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166618a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            MomentsHitHelper.f119719r.mo166800b("quick_click", "detail_page");
            if (!Intrinsics.areEqual((Object) this.f119627a.mo166602a().getDisableComment().mo5927b(), (Object) true)) {
                if (Intrinsics.areEqual(this.f119627a.f119612a, str) || this.f119627a.mo166606c().mo166576i()) {
                    this.f119627a.mo166606c().mo166572e();
                    this.f119627a.mo166606c().mo166574g();
                    return;
                }
                MomentsHitPointNew.Companion.m188110a(MomentsHitPointNew.f119721a, str, "reply_comment", "none", (String) null, (String) null, 24, (Object) null);
                this.f119627a.mo166604a(str);
            }
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: c */
        public void mo166625c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            MomentsHitHelper.f119719r.mo166800b("long_click", "detail_page");
            if (!Intrinsics.areEqual((Object) this.f119627a.mo166602a().getDisableComment().mo5927b(), (Object) true)) {
                if (Intrinsics.areEqual(str, this.f119627a.f119612a)) {
                    MomentsHitPointNew.Companion.m188110a(MomentsHitPointNew.f119721a, str, Comment.f24093e, "none", (String) null, (String) null, 24, (Object) null);
                    this.f119627a.mo166606c().mo166573f();
                    return;
                }
                this.f119627a.mo166604a(str);
            }
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
            MomentsHitPointNew.f119721a.mo166857a(str3, "hashtag", "moments_feed_page_view", (String) null, str);
            MomentsHashTagFeedActivity.Companion aVar = MomentsHashTagFeedActivity.f120187c;
            Context requireContext = this.f119627a.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            aVar.mo167325a(requireContext, str, str2);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166615a(Context context, String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str3, "anonymousName");
            this.f119627a.mo166602a().requestSecretChat(str, str2, str3);
        }

        @Override // com.ss.android.lark.moments.impl.feed.IMomentClickListener
        /* renamed from: a */
        public void mo166619a(String str, String str2, int i, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "contentText");
            Intrinsics.checkParameterIsNotNull(str2, "postId");
            MomentsHitPointNew.Companion.m188110a(MomentsHitPointNew.f119721a, str2, "share", "public_multi_select_share_view", str3, (String) null, 16, (Object) null);
            IForwardDependency forwardDependency = MomentsDependencyHolder.f118998b.mo165899a().forwardDependency();
            Context context = this.f119627a.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            forwardDependency.mo144712a(context, str, str2, i);
        }
    }

    /* renamed from: d */
    public final void mo166607d() {
        mo166606c().mo166579l();
    }

    /* renamed from: e */
    public final void mo166608e() {
        mo166606c().mo166578k();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$s */
    public static final class C47413s extends Lambda implements Function0<Unit> {
        final /* synthetic */ MomentsDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47413s(MomentsDetailFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo166606c().mo166583p();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$t */
    public static final class C47414t extends Lambda implements Function0<Unit> {
        final /* synthetic */ MomentsDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47414t(MomentsDetailFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo166606c().mo166584q();
        }
    }

    /* renamed from: g */
    public final Boolean mo166610g() {
        return mo166602a().getEnableClick().mo5927b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f119618g.mo166251a();
        mo166606c().mo166580m();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        mo166606c().mo166579l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$ab */
    static final class C47389ab extends Lambda implements Function0<MomentsDetailAdapter> {
        final /* synthetic */ MomentsDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47389ab(MomentsDetailFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsDetailAdapter invoke() {
            Context context = this.this$0.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            return new MomentsDetailAdapter(context, this.this$0.f119620i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/detail/MomentsCommentKeyBoardManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$ac */
    static final class C47390ac extends Lambda implements Function0<MomentsCommentKeyBoardManager> {
        final /* synthetic */ MomentsDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47390ac(MomentsDetailFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsCommentKeyBoardManager invoke() {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            return new MomentsCommentKeyBoardManager(requireActivity, this.this$0.mo166602a(), this.this$0.f119612a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$ae */
    static final class C47392ae extends Lambda implements Function0<MomentsDetailViewModel> {
        final /* synthetic */ MomentsDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47392ae(MomentsDetailFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsDetailViewModel invoke() {
            MomentsDetailFragment dVar = this.this$0;
            return (MomentsDetailViewModel) new C1144ai(dVar, new MomentsDetailViewModelFactory(dVar.f119612a)).mo6005a(MomentsDetailViewModel.class);
        }
    }

    /* renamed from: f */
    public final void mo166609f() {
        Intent intent = new Intent();
        intent.putExtra("post_deleted", this.f119615d);
        intent.putExtra("post_id", this.f119612a);
        setResult(101005, intent);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFinish() {
        super.onFinish();
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MomentsDetailActivity)) {
            activity = null;
        }
        MomentsDetailActivity momentsDetailActivity = (MomentsDetailActivity) activity;
        if (momentsDetailActivity != null) {
            momentsDetailActivity.mo166497a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MomentsHitHelper.f119719r.mo166815i("detail_page");
        MomentsHitHelper.f119719r.mo166796a(mo166602a().getHitpointIdPair());
        mo166606c().mo166582o();
    }

    /* renamed from: k */
    private final void m187889k() {
        ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout = (ScrollerConflictPtrFrameLayout) mo166601a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout, "ptrLayout");
        scrollerConflictPtrFrameLayout.setKeepHeaderWhenRefresh(true);
        ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout2 = (ScrollerConflictPtrFrameLayout) mo166601a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout2, "ptrLayout");
        scrollerConflictPtrFrameLayout2.setForceBackWhenComplete(true);
        ((ScrollerConflictPtrFrameLayout) mo166601a(R.id.ptrLayout)).disableWhenHorizontalMove(true);
        ((ScrollerConflictPtrFrameLayout) mo166601a(R.id.ptrLayout)).setPtrHandler(new C47393b(this));
    }

    /* renamed from: m */
    private final void m187891m() {
        MomentsCommentKeyBoardManager c = mo166606c();
        FrameLayout frameLayout = (FrameLayout) mo166601a(R.id.momentsKeyboardContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "momentsKeyboardContainer");
        ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout = (ScrollerConflictPtrFrameLayout) mo166601a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout, "ptrLayout");
        c.mo166561a(frameLayout, scrollerConflictPtrFrameLayout);
    }

    /* renamed from: j */
    private final boolean m187888j() {
        if (!this.f119615d) {
            return false;
        }
        ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout = (ScrollerConflictPtrFrameLayout) mo166601a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout, "ptrLayout");
        scrollerConflictPtrFrameLayout.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) mo166601a(R.id.page_error_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "page_error_container");
        relativeLayout.setVisibility(0);
        ((ImageView) mo166601a(R.id.page_error_iv)).setImageResource(R.drawable.illustration_empty_neutral_no_content);
        TextView textView = (TextView) mo166601a(R.id.page_error_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "page_error_tv");
        textView.setText(UIHelper.getString(R.string.Lark_Community_ThisActivityHasBeenDeleted));
        MomentsAppreciableHitPoint.f119684a.mo166726K();
        return true;
    }

    /* renamed from: l */
    private final void m187890l() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext, 1, false);
        PointRecoderRecyclerView pointRecoderRecyclerView = (PointRecoderRecyclerView) mo166601a(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView, "recycler");
        RecyclerView.ItemAnimator itemAnimator = pointRecoderRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            PointRecoderRecyclerView pointRecoderRecyclerView2 = (PointRecoderRecyclerView) mo166601a(R.id.recycler);
            Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView2, "recycler");
            pointRecoderRecyclerView2.setLayoutManager(linearLayoutManager);
            PointRecoderRecyclerView pointRecoderRecyclerView3 = (PointRecoderRecyclerView) mo166601a(R.id.recycler);
            Intrinsics.checkExpressionValueIsNotNull(pointRecoderRecyclerView3, "recycler");
            pointRecoderRecyclerView3.setAdapter(mo166605b());
            ((PointRecoderRecyclerView) mo166601a(R.id.recycler)).setTouchViewListener(new C47394c(this));
            this.f119618g.mo166252a((PointRecoderRecyclerView) mo166601a(R.id.recycler));
            this.f119618g.mo166254a(true);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
    }

    /* renamed from: o */
    private final boolean m187893o() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(arguments, "arguments ?: return false");
        String string = arguments.getString("post_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "bundle.getString(Moments…tivity.EXTRA_POST_ID, \"\")");
        this.f119612a = string;
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        this.f119615d = arguments.getBoolean("post_deleted", false);
        this.f119613b = arguments.getBoolean("show_comment", false);
        String string2 = arguments.getString("jump_comment_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string2, "bundle.getString(Moments…XTRA_JUMP_COMMENT_ID, \"\")");
        this.f119614c = string2;
        this.f119621k = arguments.getBoolean("need_show_jump_title", false);
        Log.m165389i("moments_detail", "Enter moments detail, postId is:" + this.f119612a + ", showComment:" + this.f119613b + ", scrollCommentId:" + this.f119614c);
        return true;
    }

    /* renamed from: i */
    private final void m187887i() {
        if (this.f119621k) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setGravity(16);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            TextView textView = new TextView(getContext());
            if (getContext() != null) {
                textView.setText(FakeBoldSpan.f119246a.mo166167a(UIHelper.mustacheFormat((int) R.string.Lark_Community_FromCommunityButton, "communityName", MomentsAppNameHolder.m188686a())));
            }
            textView.setTextColor(UIHelper.getColor(R.color.text_title));
            ImageView imageView = new ImageView(getContext());
            int dp2px = UIUtils.dp2px(requireContext(), 12.0f);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(dp2px, dp2px));
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(requireContext, (int) R.drawable.ud_icon_expand_right_filled, UIHelper.getColor(R.color.icon_n1)));
            linearLayout.addView(textView);
            linearLayout.addView(imageView);
            linearLayout.setOnClickListener(new C47395d(this));
            ((CommonTitleBar) mo166601a(R.id.titlebar)).setCustomTitleView(linearLayout);
            ((CommonTitleBar) mo166601a(R.id.titlebar)).setCenterViewVisible(0);
        } else {
            ((CommonTitleBar) mo166601a(R.id.titlebar)).setTitle(UIUtils.getString(getContext(), R.string.Lark_MomentsDetails_ListTitle));
            ((CommonTitleBar) mo166601a(R.id.titlebar)).setMainTitleColor(UIHelper.getColor(R.color.text_title));
        }
        ((CommonTitleBar) mo166601a(R.id.titlebar)).setLeftClickListener(new C47396e(this));
    }

    /* renamed from: n */
    private final void m187892n() {
        mo166602a().getDataList().mo5923a(getViewLifecycleOwner(), new C47397f(this));
        mo166602a().getSendHitPointPageView().mo5923a(getViewLifecycleOwner(), new C47411q(this));
        mo166602a().getCommentResponse().mo5923a(getViewLifecycleOwner(), new C47415u(this));
        mo166602a().getClosePage().mo5923a(getViewLifecycleOwner(), new C47416v(this));
        mo166602a().getReactionDetailLiveData().mo5923a(getViewLifecycleOwner(), new C47417w(this));
        mo166602a().getPageErrorLiveData().mo5923a(getViewLifecycleOwner(), new C47420x(this));
        mo166602a().getScrollToComment().mo5923a(getViewLifecycleOwner(), new C47421y(this));
        mo166602a().getCompleteRefresh().mo5923a(getViewLifecycleOwner(), new C47424z(this));
        mo166602a().getToastResId().mo5923a(getViewLifecycleOwner(), new C47388aa(this));
        mo166602a().getShowCircleLoading().mo5923a(getViewLifecycleOwner(), new C47398g(this));
        mo166602a().getResetCallback().mo5923a(getViewLifecycleOwner(), C47399h.f119634a);
        mo166602a().getShowUnSupportDialog().mo5923a(getViewLifecycleOwner(), new C47400i(this));
        mo166602a().getHasQuota().mo5923a(getViewLifecycleOwner(), new C47402j(this));
        mo166602a().getCategoryEnableAnonymous().mo5923a(getViewLifecycleOwner(), new C47403k(this));
        mo166602a().getForceDisableAnonymous().mo5923a(getViewLifecycleOwner(), new C47404l(this));
        mo166602a().getStartNickIdentityActivity().mo5923a(getViewLifecycleOwner(), new C47405m(this));
        mo166602a().getAnonymousPostLoading().mo5923a(getViewLifecycleOwner(), new C47408n(this));
        mo166602a().getAnonymousAtError().mo5923a(getViewLifecycleOwner(), new C47409o(this));
        mo166602a().getIdentityType().mo5923a(getViewLifecycleOwner(), new C47410p(this));
        mo166602a().getResetDraftFail().mo5923a(getViewLifecycleOwner(), new C47412r(this));
        MomentsDetailViewModel a = mo166602a();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkExpressionValueIsNotNull(viewLifecycleOwner, "viewLifecycleOwner");
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        a.observeRequestResult(viewLifecycleOwner, context, new C47413s(this), new C47414t(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsDetailFragment$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$b */
    public static final class C47393b extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119628a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47393b(MomentsDetailFragment dVar) {
            this.f119628a = dVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            this.f119628a.mo166602a().loadMore();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f119628a.mo166602a().canLoadMore()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsDetailFragment$initTitleBar$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$d */
    public static final class C47395d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119630a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47395d(MomentsDetailFragment dVar) {
            this.f119630a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Context context = this.f119630a.getContext();
            if (context != null) {
                MomentsHitHelper.f119719r.mo166799b("detail_page");
                if (MomentsDependencyHolder.f118998b.mo165899a().mainDependency().mo144719a("moments")) {
                    IMainModuleDependency mainDependency = MomentsDependencyHolder.f118998b.mo165899a().mainDependency();
                    Intrinsics.checkExpressionValueIsNotNull(context, "it");
                    Bundle bundle = new Bundle();
                    bundle.putString("arguments_key_from", "from_detail_title");
                    mainDependency.mo144717a(context, "moments", bundle);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsDetailFragment$initTitleBar$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$e */
    public static final class C47396e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119631a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47396e(MomentsDetailFragment dVar) {
            this.f119631a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119631a.mo166606c().mo166572e();
            MomentsDetailFragment dVar = this.f119631a;
            Intent intent = new Intent();
            intent.putExtra("post_deleted", this.f119631a.f119615d);
            intent.putExtra("post_id", this.f119631a.f119612a);
            dVar.setResult(101005, intent);
            this.f119631a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailViewModel$DraftAction;", "Lcom/ss/android/lark/widget/richtext/RichText;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$h */
    public static final class C47399h<T> implements AbstractC1178x<Pair<? extends MomentsDetailViewModel.DraftAction, ? extends RichText>> {

        /* renamed from: a */
        public static final C47399h f119634a = new C47399h();

        C47399h() {
        }

        /* renamed from: a */
        public final void onChanged(Pair<? extends MomentsDetailViewModel.DraftAction, ? extends RichText> pair) {
            ((MomentsDetailViewModel.DraftAction) pair.getFirst()).mo166588a((RichText) pair.getSecond());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasQuota", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$j */
    public static final class C47402j<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119637a;

        C47402j(MomentsDetailFragment dVar) {
            this.f119637a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                this.f119637a.mo166606c().mo166567a(bool.booleanValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$p */
    public static final class C47410p<T> implements AbstractC1178x<MomentsPublishViewModel.IdentityType> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119645a;

        C47410p(MomentsDetailFragment dVar) {
            this.f119645a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(MomentsPublishViewModel.IdentityType identityType) {
            MomentsCommentKeyBoardManager c = this.f119645a.mo166606c();
            Intrinsics.checkExpressionValueIsNotNull(identityType, "it");
            c.mo166562a(identityType);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$z */
    public static final class C47424z<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119659a;

        C47424z(MomentsDetailFragment dVar) {
            this.f119659a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ((ScrollerConflictPtrFrameLayout) this.f119659a.mo166601a(R.id.ptrLayout)).refreshComplete();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$k */
    public static final class C47403k<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119638a;

        C47403k(MomentsDetailFragment dVar) {
            this.f119638a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            MomentsCommentKeyBoardManager c = this.f119638a.mo166606c();
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            c.mo166569b(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$l */
    public static final class C47404l<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119639a;

        C47404l(MomentsDetailFragment dVar) {
            this.f119639a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f119639a.mo166606c().mo166577j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "close", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$v */
    public static final class C47416v<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119649a;

        C47416v(MomentsDetailFragment dVar) {
            this.f119649a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "close");
            if (bool.booleanValue()) {
                this.f119649a.mo166606c().mo166572e();
                this.f119649a.finish();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m187893o()) {
            Log.m165383e("moments_detail", "Failed to open moments detail, post id is null");
            mo166606c().mo166572e();
            finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$y */
    public static final class C47421y<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119655a;

        C47421y(MomentsDetailFragment dVar) {
            this.f119655a = dVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "scrolledPosition", "", "onScrollFinish"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.detail.d$y$a */
        public static final class C47422a implements C47297c.AbstractC47301c {

            /* renamed from: a */
            final /* synthetic */ C47421y f119656a;

            /* renamed from: b */
            final /* synthetic */ MomentsKeyFinder f119657b;

            C47422a(C47421y yVar, MomentsKeyFinder hVar) {
                this.f119656a = yVar;
                this.f119657b = hVar;
            }

            @Override // com.ss.android.lark.moments.impl.common.widget.C47297c.AbstractC47301c
            /* renamed from: a */
            public final void mo166265a(int i) {
                if (i >= 0) {
                    new C47292b((PointRecoderRecyclerView) this.f119656a.f119655a.mo166601a(R.id.recycler), C474231.f119658a).mo166246a(this.f119657b).mo166247a();
                }
            }
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (!this.f119655a.f119615d) {
                if (this.f119655a.f119613b) {
                    this.f119655a.f119618g.mo166253a(new C47297c.C47300b().mo166259a(new MomentsTypeFinder(IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_COUNT_HEAD)).mo166264c(150).mo166261a(true).mo166262a());
                } else if (!TextUtils.isEmpty(this.f119655a.f119614c)) {
                    MomentsKeyFinder hVar = new MomentsKeyFinder(this.f119655a.f119614c);
                    this.f119655a.f119618g.mo166253a(new C47297c.C47300b().mo166259a(hVar).mo166264c(150).mo166261a(true).mo166263b(17).mo166260a(new C47422a(this, hVar)).mo166262a());
                } else {
                    this.f119655a.f119618g.mo166253a(new C47297c.C47300b().mo166263b(48).mo166264c(150).mo166258a(0).mo166261a(false).mo166262a());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "resId", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$aa */
    public static final class C47388aa<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119626a;

        C47388aa(MomentsDetailFragment dVar) {
            this.f119626a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            if (num == null || num.intValue() != -1) {
                Context context = this.f119626a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(num, "resId");
                LKUIToast.show(context, UIHelper.getString(num.intValue()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$f */
    public static final class C47397f<T> implements AbstractC1178x<List<? extends IMomentsItemBase>> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119632a;

        C47397f(MomentsDetailFragment dVar) {
            this.f119632a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends IMomentsItemBase> list) {
            Log.m165389i("moments_detail", "setData, size is:" + list.size());
            MomentsDetailAdapter b = this.f119632a.mo166605b();
            Intrinsics.checkExpressionValueIsNotNull(list, "list");
            b.mo166597a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$g */
    public static final class C47398g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119633a;

        C47398g(MomentsDetailFragment dVar) {
            this.f119633a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                LKUIToast.showLoading(this.f119633a.getContext(), UIHelper.getString(R.string.Lark_Community_Operating));
            } else {
                LKUIToast.cancelLoading();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$i */
    public static final class C47400i<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119635a;

        C47400i(MomentsDetailFragment dVar) {
            this.f119635a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            C25639g gVar = new C25639g(this.f119635a.mContext);
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            gVar.mo89237b(UIHelper.getString(num.intValue())).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Community_Confirm, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.moments.impl.detail.MomentsDetailFragment.C47400i.DialogInterface$OnClickListenerC474011 */

                /* renamed from: a */
                final /* synthetic */ C47400i f119636a;

                {
                    this.f119636a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    this.f119636a.f119635a.finish();
                }
            }).mo89247e(false).mo89239c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$o */
    public static final class C47409o<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119644a;

        C47409o(MomentsDetailFragment dVar) {
            this.f119644a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                Context context = this.f119644a.getContext();
                if (this.f119644a.mo166602a().getIdentityType().mo5927b() == MomentsPublishViewModel.IdentityType.ANONYMOUS) {
                    i = R.string.Lark_Community_UnableAnonymousMentionToast;
                } else {
                    i = R.string.Lark_Community_UnableNicknameMentionToast;
                }
                LKUIToast.show(this.f119644a.getContext(), UIUtils.getString(context, i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$q */
    public static final class C47411q<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119646a;

        C47411q(MomentsDetailFragment dVar) {
            this.f119646a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            IMomentsItemBase post;
            boolean z;
            if (!this.f119646a.f119617f && (post = this.f119646a.mo166602a().getPost()) != null && (post instanceof MomentsPostVM)) {
                MomentsUserVM G = ((MomentsPostVM) post).mo166423H();
                if (G != null) {
                    z = G.mo166366e();
                } else {
                    z = false;
                }
                MomentsHitPointNew.f119721a.mo166858a(post.mo166379a(), z);
                this.f119646a.f119617f = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$r */
    public static final class C47412r<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119647a;

        C47412r(MomentsDetailFragment dVar) {
            this.f119647a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (!this.f119647a.f119619h) {
                this.f119647a.f119619h = true;
                LKUIToast.show(this.f119647a.getContext(), UIUtils.getString(this.f119647a.getContext(), R.string.Lark_Community_UnableShareAnonymousToast));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/moments/v1/CreateCommentResponse;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$u */
    public static final class C47415u<T> implements AbstractC1178x<CreateCommentResponse> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119648a;

        C47415u(MomentsDetailFragment dVar) {
            this.f119648a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(CreateCommentResponse createCommentResponse) {
            int i;
            if (createCommentResponse != null) {
                List list = (List) this.f119648a.mo166602a().getDataList().mo5927b();
                if (list != null) {
                    i = list.size();
                } else {
                    i = 1;
                }
                ((PointRecoderRecyclerView) this.f119648a.mo166601a(R.id.recycler)).smoothScrollToPosition(i - 1);
                this.f119648a.mo166606c().mo166581n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$ReactionInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$w */
    public static final class C47417w<T> implements AbstractC1178x<MomentsBaseViewModel.ReactionInfo> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119650a;

        C47417w(MomentsDetailFragment dVar) {
            this.f119650a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(final MomentsBaseViewModel.ReactionInfo cVar) {
            C53002b a = C53002b.m205274a(cVar.mo167019a(), cVar.mo167020b(), true);
            a.mo181046a(new C53002b.AbstractC53005b(this) {
                /* class com.ss.android.lark.moments.impl.detail.MomentsDetailFragment.C47417w.C474181 */

                /* renamed from: a */
                final /* synthetic */ C47417w f119651a;

                {
                    this.f119651a = r1;
                }

                @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
                public final void onItemClicked(String str) {
                    MomentsHitPoint.f119720a.mo166849f("detail_page");
                    IProfileModuleDependency profileModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency();
                    Context context = this.f119651a.f119650a.mContext;
                    Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                    Intrinsics.checkExpressionValueIsNotNull(str, "userId");
                    profileModuleDependency.mo144727a(context, str);
                }
            });
            a.mo181045a(new C53002b.AbstractC53004a(this) {
                /* class com.ss.android.lark.moments.impl.detail.MomentsDetailFragment.C47417w.C474192 */

                /* renamed from: a */
                final /* synthetic */ C47417w f119652a;

                {
                    this.f119652a = r1;
                }

                @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53004a
                /* renamed from: a */
                public final ReactionDetailViewModel mo166647a(String str) {
                    MomentsDetailViewModel a = this.f119652a.f119650a.mo166602a();
                    String c = cVar.mo167021c();
                    Intrinsics.checkExpressionValueIsNotNull(str, "reactionKey");
                    return a.fetchReactionDetail(c, str);
                }
            });
            a.mo181044a(this.f119650a.getChildFragmentManager());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "need", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$m */
    public static final class C47405m<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119640a;

        C47405m(MomentsDetailFragment dVar) {
            this.f119640a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Context context;
            if (Intrinsics.areEqual((Object) bool, (Object) true) && (context = this.f119640a.getContext()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                UDDialogBuilder eVar = new UDDialogBuilder(context);
                String string = UIUtils.getString(context, R.string.Lark_Community_SelectNicknameTitle);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(it, R.…nity_SelectNicknameTitle)");
                String string2 = UIUtils.getString(context, R.string.Lark_Community_ChooseNicknameDialogDesc);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIUtils.getString(it, R.…ChooseNicknameDialogDesc)");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(string2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Community_ChooseNicknameDialogChooseNicknameButton, new DialogInterface$OnClickListenerC47406a(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Community_ChooseNicknameDialogNotNowButton, DialogInterface$OnClickListenerC47407b.f119642a)).show();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.detail.d$m$b */
        public static final class DialogInterface$OnClickListenerC47407b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC47407b f119642a = new DialogInterface$OnClickListenerC47407b();

            DialogInterface$OnClickListenerC47407b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/moments/impl/detail/MomentsDetailFragment$initViewModel$16$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.detail.d$m$a */
        public static final class DialogInterface$OnClickListenerC47406a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C47405m f119641a;

            DialogInterface$OnClickListenerC47406a(C47405m mVar) {
                this.f119641a = mVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(this.f119641a.f119640a.getContext(), NickIdentityChooseActivity.class);
                intent.putExtra("from_click_reaction", true);
                FragmentActivity activity = this.f119641a.f119640a.getActivity();
                if (activity != null) {
                    activity.startActivityForResult(intent, 15619);
                }
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$n */
    public static final class C47408n<T> implements AbstractC1178x<Pair<? extends Integer, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119643a;

        C47408n(MomentsDetailFragment dVar) {
            this.f119643a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Integer, String> pair) {
            int intValue = pair.getFirst().intValue();
            if (intValue == 0) {
                LKUIToast.showLoading(this.f119643a.getContext(), (int) R.string.Lark_Community_Sending);
            } else if (intValue == 1) {
                LKUIToast.cancelLoading();
            } else if (intValue == 2) {
                String second = pair.getSecond();
                if (second == null) {
                    second = UIUtils.getString(this.f119643a.getContext(), R.string.Lark_Community_UnableToPostToast);
                }
                LKUIToast.loadFail(this.f119643a.getContext(), second);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "errorInfo", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel$PageErrorInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$x */
    public static final class C47420x<T> implements AbstractC1178x<MomentsBaseViewModel.PageErrorInfo> {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119654a;

        C47420x(MomentsDetailFragment dVar) {
            this.f119654a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(MomentsBaseViewModel.PageErrorInfo bVar) {
            if (bVar.mo167015c() == MomentsBaseViewModel.PageErrorType.REMOVED) {
                this.f119654a.f119615d = true;
            }
            ScrollerConflictPtrFrameLayout scrollerConflictPtrFrameLayout = (ScrollerConflictPtrFrameLayout) this.f119654a.mo166601a(R.id.ptrLayout);
            Intrinsics.checkExpressionValueIsNotNull(scrollerConflictPtrFrameLayout, "ptrLayout");
            scrollerConflictPtrFrameLayout.setVisibility(8);
            ((CommonTitleBar) this.f119654a.mo166601a(R.id.titlebar)).setCenterViewVisible(8);
            FrameLayout frameLayout = (FrameLayout) this.f119654a.mo166601a(R.id.momentsKeyboardContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "momentsKeyboardContainer");
            frameLayout.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) this.f119654a.mo166601a(R.id.page_error_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "page_error_container");
            relativeLayout.setVisibility(0);
            ((ImageView) this.f119654a.mo166601a(R.id.page_error_iv)).setImageResource(bVar.mo167013a());
            TextView textView = (TextView) this.f119654a.mo166601a(R.id.page_error_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "page_error_tv");
            textView.setText(bVar.mo167014b());
            MomentsAppreciableHitPoint.f119684a.mo166724I();
            MomentsAppreciableHitPoint.f119684a.mo166725J();
            MomentsAppreciableHitPoint.f119684a.mo166726K();
        }
    }

    /* renamed from: a */
    public final void mo166604a(String str) {
        boolean z;
        List<IMomentsItemBase> list = (List) mo166602a().getDataList().mo5927b();
        if (list != null) {
            for (IMomentsItemBase iMomentsItemBase : list) {
                if ((iMomentsItemBase instanceof MomentsCommentVM) && Intrinsics.areEqual(str, iMomentsItemBase.mo166379a())) {
                    MomentsCommentVM eVar = (MomentsCommentVM) iMomentsItemBase;
                    Comment.CommentContent commentContent = eVar.mo166412w().content;
                    String str2 = null;
                    if ((commentContent != null ? commentContent.image_set : null) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    CharSequence a = m187886a(eVar.mo166386b(), z, eVar.mo166414y());
                    if (a != null) {
                        MomentsUserVM x = eVar.mo166414y();
                        if ((x != null ? x.mo166368g() : null) == MomentUser.Type.ANONYMOUS) {
                            MomentsUserVM x2 = eVar.mo166414y();
                            if (x2 != null) {
                                str2 = x2.mo166363b();
                            }
                            if (Intrinsics.areEqual(str2, "0")) {
                                str2 = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
                            } else {
                                str2 = UIHelper.mustacheFormat((int) R.string.Lark_Community_SpectatorNumber, "number", eVar.mo166414y().mo166363b());
                            }
                        } else {
                            MomentsUserVM x3 = eVar.mo166414y();
                            if (x3 != null) {
                                str2 = x3.mo166361a();
                            }
                        }
                        MomentsCommentKeyBoardManager c = mo166606c();
                        if (str2 == null) {
                            str2 = "";
                        }
                        c.mo166563a(str, str2, a);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "y", "onTouchiew"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.d$c */
    public static final class C47394c implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ MomentsDetailFragment f119629a;

        C47394c(MomentsDetailFragment dVar) {
            this.f119629a = dVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            this.f119629a.f119616e = f2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m187887i();
        if (!m187888j()) {
            m187889k();
            m187890l();
            m187892n();
            m187891m();
        }
    }

    /* renamed from: a */
    public final void mo166603a(int i, int i2, Intent intent) {
        mo166606c().mo166559a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.moments_fragment_detail, viewGroup, false);
    }

    /* renamed from: a */
    private final CharSequence m187886a(RichText richText, boolean z, IMomentsUser cVar) {
        MomentUser.Type type;
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (cVar != null) {
            type = cVar.mo166368g();
        } else {
            type = null;
        }
        if (type == MomentUser.Type.ANONYMOUS) {
            if (Intrinsics.areEqual(cVar.mo166363b(), "0")) {
                str = UIHelper.getString(R.string.Lark_Community_AnonymousUser);
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Community_SpectatorNumber, "number", cVar.mo166363b());
            }
        } else if (cVar != null) {
            str = cVar.mo166361a();
        } else {
            str = null;
        }
        if (richText != null) {
            str4 = C59035h.m229201a(richText, UIHelper.getColor(R.color.text_placeholder));
        }
        if (z) {
            str2 = UIUtils.getString(getActivity(), R.string.Lark_Community_Picture);
        } else {
            str2 = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) UIUtils.getString(getActivity(), R.string.Lark_Legacy_Reply)).append((CharSequence) " ");
        if (str != null) {
            str3 = str;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) str3).append((CharSequence) ": ");
        if (str4 == null) {
        }
        append2.append(str4).append((CharSequence) " ").append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
