package com.ss.android.lark.mm.module.detail.comment;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.C1404s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter;
import com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSentence;
import com.ss.android.lark.mm.module.detail.subtitles.model.request.AddCommentReq;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.ReplyCommentRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.highlight.model.MmHighlightInfo;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.MmCommentIndicatorView;
import com.ss.android.lark.mm.widget.MmKeyboardHideConstraintLayout;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57764ab;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\u00020\u0001:\u0003>?@B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0016\u0010\u001f\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dH\u0002J\b\u0010 \u001a\u00020\u0010H\u0002J\u001c\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J.\u0010'\u001a\u00020\u001a2&\u0010(\u001a\"\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*\u0018\u0001`+J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020\u001aH\u0016J>\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020$2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a092\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a09J\u001a\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u0010=\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006A"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter;", "commentRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "depend", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentDepend;", "getDepend", "()Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentDepend;", "setDepend", "(Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentDepend;)V", "indicatorView", "Lcom/ss/android/lark/mm/widget/MmCommentIndicatorView;", "lastFocusPosition", "", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "parentCallback", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentCallback;", "getParentCallback", "()Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentCallback;", "setParentCallback", "(Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentCallback;)V", "animAlphaEnter", "", "animAlphaExit", "onComplete", "Lkotlin/Function0;", "animPushEnter", "animPushExit", "getInitShowPosition", "getOffsetInParaByComment", "Lkotlin/ranges/IntRange;", "commentId", "", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "onChangeComments", "commentMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lkotlin/collections/HashMap;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStartReplyComment", "lastCommentContent", "quote", "onReadyReply", "Lkotlin/Function1;", "onCancelReply", "onViewCreated", "view", "populateRecyclerView", "Companion", "IParaCommentCallback", "IParaCommentDepend", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.j */
public final class MmParaCommentsFragment extends Fragment {

    /* renamed from: f */
    public static WeakReference<View> f116061f;

    /* renamed from: g */
    public static final Companion f116062g = new Companion(null);

    /* renamed from: a */
    public RecyclerView f116063a;

    /* renamed from: b */
    public LinearLayoutManager f116064b;

    /* renamed from: c */
    public MmCommentIndicatorView f116065c;

    /* renamed from: d */
    public MmParaCommentAdapter f116066d;

    /* renamed from: e */
    public int f116067e;

    /* renamed from: h */
    private IParaCommentCallback f116068h;

    /* renamed from: i */
    private IParaCommentDepend f116069i;

    /* renamed from: j */
    private HashMap f116070j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J.\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentCallback;", "", "addComment", "", "addCommentReq", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/request/AddCommentReq;", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "deleteComment", "pid", "", "commentId", "contentId", "dataCallback", "getIsOwner", "", "onChangeCurrentFocusComment", "highlightRange", "Lkotlin/ranges/IntRange;", "onDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$b */
    public interface IParaCommentCallback {
        /* renamed from: a */
        void mo161721a();

        /* renamed from: a */
        void mo161722a(AddCommentReq addCommentReq, AbstractC47070c<ReplyCommentRes> cVar);

        /* renamed from: a */
        void mo161723a(String str, String str2, String str3, AbstractC47070c<String> cVar);

        /* renamed from: a */
        void mo161724a(IntRange kVar);

        /* renamed from: b */
        boolean mo161725b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentDepend;", "", "canComment", "", "getCurrentPara", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "getInitShowPosition", "", "getMentionCommentId", "", "getMentionContentId", "getMmCommentList", "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$c */
    public interface IParaCommentDepend {
        /* renamed from: a */
        int mo161714a();

        /* renamed from: b */
        MmMeetingParagraph mo161715b();

        /* renamed from: c */
        List<MmComment.MmCommentInfo.CommentDetail> mo161716c();

        /* renamed from: d */
        MmTranslateLangType mo161717d();

        /* renamed from: e */
        String mo161718e();

        /* renamed from: f */
        String mo161719f();

        /* renamed from: g */
        boolean mo161720g();
    }

    /* renamed from: a */
    public View mo161785a(int i) {
        if (this.f116070j == null) {
            this.f116070j = new HashMap();
        }
        View view = (View) this.f116070j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116070j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public void mo161795d() {
        HashMap hashMap = this.f116070j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$Companion;", "", "()V", "containerWR", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "dismiss", "", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment;", "doDismiss", "generateContainer", "onClick", "Lkotlin/Function0;", "show", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$a$a */
        public static final class C46052a extends Lambda implements Function0<Unit> {
            final /* synthetic */ FragmentActivity $mActivity;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46052a(FragmentActivity fragmentActivity) {
                super(0);
                this.$mActivity = fragmentActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                MmParaCommentsFragment.f116062g.mo161796a(this.$mActivity);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$a$c */
        static final class C46054c extends Lambda implements Function0<Unit> {
            final /* synthetic */ MmParaCommentsFragment $fragment;
            final /* synthetic */ FragmentActivity $mActivity;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46054c(FragmentActivity fragmentActivity, MmParaCommentsFragment jVar) {
                super(0);
                this.$mActivity = fragmentActivity;
                this.$fragment = jVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                MmParaCommentsFragment.f116062g.mo161798b(this.$mActivity, this.$fragment);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$Companion$generateContainer$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$a$b */
        public static final class C46053b extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ Function0 $onClick$inlined;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46053b(Function0 function0) {
                super(1);
                this.$onClick$inlined = function0;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkParameterIsNotNull(view, "it");
                this.$onClick$inlined.invoke();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo161796a(FragmentActivity fragmentActivity) {
            View view;
            WeakReference<View> weakReference = MmParaCommentsFragment.f116061f;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            if (view != null) {
                Window window = fragmentActivity.getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
                View decorView = window.getDecorView();
                if (decorView != null) {
                    ((ViewGroup) decorView).removeView(view);
                    MmParaCommentsFragment.f116061f = null;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "mActivity.supportFragmentManager");
                if (!supportFragmentManager.isStateSaved() && !supportFragmentManager.isDestroyed()) {
                    supportFragmentManager.popBackStackImmediate();
                }
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo161798b(FragmentActivity fragmentActivity, MmParaCommentsFragment jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "fragment");
            if (fragmentActivity != null) {
                jVar.mo161792a(new C46052a(fragmentActivity));
            }
        }

        /* renamed from: a */
        private final View m182450a(FragmentActivity fragmentActivity, Function0<Unit> function0) {
            FrameLayout frameLayout = new FrameLayout(fragmentActivity);
            frameLayout.setId(View.generateViewId());
            frameLayout.setFocusable(true);
            frameLayout.setClickable(true);
            frameLayout.setBackgroundColor(ContextCompat.getColor(frameLayout.getContext(), R.color.mm_black_alpha_35));
            FrameLayout frameLayout2 = frameLayout;
            C47110e.m186573a(frameLayout2, new C46053b(function0));
            return frameLayout2;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo161797a(FragmentActivity fragmentActivity, MmParaCommentsFragment jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "fragment");
            if (fragmentActivity != null) {
                View a = m182450a(fragmentActivity, new C46054c(fragmentActivity, jVar));
                MmParaCommentsFragment.f116061f = new WeakReference<>(a);
                Window window = fragmentActivity.getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
                View decorView = window.getDecorView();
                if (decorView != null) {
                    ((ViewGroup) decorView).addView(a, -1, -1);
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(a.getId(), jVar).addToBackStack(null).commitAllowingStateLoss();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$onStartReplyComment$2", "Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostDepend;", "getInitContent", "", "getQuote", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$i */
    public static final class C46060i implements MmPostCommentFragment.IMmPostDepend {

        /* renamed from: a */
        final /* synthetic */ String f116080a;

        /* renamed from: b */
        final /* synthetic */ String f116081b;

        @Override // com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment.IMmPostDepend
        /* renamed from: a */
        public String mo161712a() {
            return this.f116080a;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment.IMmPostDepend
        /* renamed from: b */
        public String mo161713b() {
            return this.f116081b;
        }

        C46060i(String str, String str2) {
            this.f116080a = str;
            this.f116081b = str2;
        }
    }

    /* renamed from: a */
    public final IParaCommentCallback mo161786a() {
        return this.f116068h;
    }

    /* renamed from: b */
    public final IParaCommentDepend mo161793b() {
        return this.f116069i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J.\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J@\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016¨\u0006\u0019¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$populateRecyclerView$3$1", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$IMmParaCommentAdapterCallback;", "addComment", "", "commentReq", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/request/AddCommentReq;", "dataCallback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "deleteComment", "pid", "", "commentId", "contentId", "getIsOwner", "", "onDeleteComment", "position", "", "startReplyComment", "lastCommentContent", "quote", "onReadyReply", "Lkotlin/Function1;", "onCancelRely", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$k */
    public static final class C46062k implements MmParaCommentAdapter.IMmParaCommentAdapterCallback {

        /* renamed from: a */
        final /* synthetic */ MmParaCommentsFragment f116082a;

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.IMmParaCommentAdapterCallback
        /* renamed from: a */
        public boolean mo161766a() {
            IParaCommentCallback a = this.f116082a.mo161786a();
            if (a != null) {
                return a.mo161725b();
            }
            return false;
        }

        C46062k(MmParaCommentsFragment jVar) {
            this.f116082a = jVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.IMmParaCommentAdapterCallback
        /* renamed from: a */
        public void mo161762a(int i) {
            MmParaCommentAdapter gVar = this.f116082a.f116066d;
            if (gVar != null) {
                gVar.mo161729a(i);
            }
            MmParaCommentAdapter gVar2 = this.f116082a.f116066d;
            if (gVar2 == null || gVar2.getItemCount() != 0) {
                RecyclerView recyclerView = this.f116082a.f116063a;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.C46062k.RunnableC460631 */

                        /* renamed from: a */
                        final /* synthetic */ C46062k f116083a;

                        {
                            this.f116083a = r1;
                        }

                        public final void run() {
                            MmComment.MmCommentInfo.CommentDetail a;
                            String comment_id;
                            int i;
                            MmMeetingParagraph mmMeetingParagraph;
                            LinearLayoutManager linearLayoutManager = this.f116083a.f116082a.f116064b;
                            if (linearLayoutManager != null) {
                                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                                MmParaCommentAdapter gVar = this.f116083a.f116082a.f116066d;
                                if (gVar != null && (a = gVar.mo161728a(Integer.valueOf(findFirstVisibleItemPosition))) != null && (comment_id = a.getComment_id()) != null) {
                                    IParaCommentCallback a2 = this.f116083a.f116082a.mo161786a();
                                    if (a2 != null) {
                                        MmParaCommentsFragment jVar = this.f116083a.f116082a;
                                        IParaCommentDepend b = this.f116083a.f116082a.mo161793b();
                                        if (b != null) {
                                            mmMeetingParagraph = b.mo161715b();
                                        } else {
                                            mmMeetingParagraph = null;
                                        }
                                        a2.mo161724a(jVar.mo161787a(comment_id, mmMeetingParagraph));
                                    }
                                    MmCommentIndicatorView mmCommentIndicatorView = this.f116083a.f116082a.f116065c;
                                    if (mmCommentIndicatorView != null) {
                                        MmParaCommentAdapter gVar2 = this.f116083a.f116082a.f116066d;
                                        if (gVar2 != null) {
                                            i = gVar2.getItemCount();
                                        } else {
                                            i = 0;
                                        }
                                        mmCommentIndicatorView.setTotalCount(i);
                                    }
                                    MmCommentIndicatorView mmCommentIndicatorView2 = this.f116083a.f116082a.f116065c;
                                    if (mmCommentIndicatorView2 != null) {
                                        mmCommentIndicatorView2.setCurrentIndex(findFirstVisibleItemPosition);
                                    }
                                    this.f116083a.f116082a.f116067e = findFirstVisibleItemPosition;
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            MmParaCommentsFragment.f116062g.mo161798b(this.f116082a.getActivity(), this.f116082a);
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.IMmParaCommentAdapterCallback
        /* renamed from: a */
        public void mo161763a(AddCommentReq addCommentReq, AbstractC47070c<ReplyCommentRes> cVar) {
            Intrinsics.checkParameterIsNotNull(addCommentReq, "commentReq");
            Intrinsics.checkParameterIsNotNull(cVar, "dataCallback");
            IParaCommentCallback a = this.f116082a.mo161786a();
            if (a != null) {
                a.mo161722a(addCommentReq, cVar);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.IMmParaCommentAdapterCallback
        /* renamed from: a */
        public void mo161764a(String str, String str2, String str3, AbstractC47070c<String> cVar) {
            Intrinsics.checkParameterIsNotNull(str, "pid");
            Intrinsics.checkParameterIsNotNull(str2, "commentId");
            Intrinsics.checkParameterIsNotNull(str3, "contentId");
            Intrinsics.checkParameterIsNotNull(cVar, "dataCallback");
            IParaCommentCallback a = this.f116082a.mo161786a();
            if (a != null) {
                a.mo161723a(str, str2, str3, cVar);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.IMmParaCommentAdapterCallback
        /* renamed from: a */
        public void mo161765a(String str, String str2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(str, "lastCommentContent");
            Intrinsics.checkParameterIsNotNull(str2, "quote");
            Intrinsics.checkParameterIsNotNull(function1, "onReadyReply");
            Intrinsics.checkParameterIsNotNull(function12, "onCancelRely");
            this.f116082a.mo161790a(str, str2, function1, function12);
        }
    }

    /* renamed from: g */
    private final int m182438g() {
        IParaCommentDepend cVar = this.f116069i;
        if (cVar != null) {
            return cVar.mo161714a();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$j */
    public static final class C46061j extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmPostCommentFragment $mPostCommentFragment;
        final /* synthetic */ MmParaCommentsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46061j(MmParaCommentsFragment jVar, MmPostCommentFragment kVar) {
            super(0);
            this.this$0 = jVar;
            this.$mPostCommentFragment = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                MmPostCommentFragment kVar = this.$mPostCommentFragment;
                Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                kVar.mo5511a(activity.getSupportFragmentManager(), "");
            }
        }
    }

    /* renamed from: c */
    public final void mo161794c() {
        RecyclerView recyclerView = this.f116063a;
        if (recyclerView != null) {
            recyclerView.setAlpha(1.0f);
        }
        MmCommentIndicatorView mmCommentIndicatorView = this.f116065c;
        if (mmCommentIndicatorView != null) {
            mmCommentIndicatorView.setAlpha(1.0f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$onStartReplyComment$1", "Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostCommentCallback;", "onDismiss", "", "onPostCommentCallback", "commentContent", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$h */
    public static final class C46059h implements MmPostCommentFragment.IMmPostCommentCallback {

        /* renamed from: a */
        final /* synthetic */ MmParaCommentsFragment f116075a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f116076b;

        /* renamed from: c */
        final /* synthetic */ MmPostCommentFragment f116077c;

        /* renamed from: d */
        final /* synthetic */ Function1 f116078d;

        /* renamed from: e */
        final /* synthetic */ Function1 f116079e;

        @Override // com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment.IMmPostCommentCallback
        /* renamed from: a */
        public void mo161709a() {
            this.f116075a.mo161794c();
            if (this.f116076b.element) {
                this.f116078d.invoke(this.f116077c.mo161818g());
            } else {
                this.f116079e.invoke(this.f116077c.mo161818g());
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment.IMmPostCommentCallback
        /* renamed from: a */
        public void mo161710a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "commentContent");
            this.f116076b.element = true;
            this.f116077c.u_();
        }

        C46059h(MmParaCommentsFragment jVar, Ref.BooleanRef booleanRef, MmPostCommentFragment kVar, Function1 function1, Function1 function12) {
            this.f116075a = jVar;
            this.f116076b = booleanRef;
            this.f116077c = kVar;
            this.f116078d = function1;
            this.f116079e = function12;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        View view2;
        Window window;
        WeakReference<View> weakReference = f116061f;
        if (!(weakReference == null || (view = weakReference.get()) == null)) {
            FragmentActivity activity = getActivity();
            ViewGroup viewGroup = null;
            if (activity == null || (window = activity.getWindow()) == null) {
                view2 = null;
            } else {
                view2 = window.getDecorView();
            }
            if (view2 instanceof ViewGroup) {
                viewGroup = view2;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view);
            }
        }
        IParaCommentCallback bVar = this.f116068h;
        if (bVar != null) {
            bVar.mo161721a();
        }
        super.onDestroyView();
        mo161795d();
    }

    /* renamed from: e */
    private final void m182436e() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        RecyclerView recyclerView = this.f116063a;
        if (recyclerView != null) {
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            recyclerView.setTranslationY((float) C57582a.m223609b(a.getApplicationContext()));
        }
        RecyclerView recyclerView2 = this.f116063a;
        if (!(recyclerView2 == null || (animate = recyclerView2.animate()) == null || (translationY = animate.translationY(BitmapDescriptorFactory.HUE_RED)) == null || (duration = translationY.setDuration(200)) == null || (interpolator = duration.setInterpolator(new AccelerateDecelerateInterpolator())) == null)) {
            interpolator.start();
        }
        MmCommentIndicatorView mmCommentIndicatorView = this.f116065c;
        if (mmCommentIndicatorView != null) {
            mmCommentIndicatorView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            mmCommentIndicatorView.animate().alpha(1.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$g */
    static final class RunnableC46058g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmParaCommentsFragment f116073a;

        /* renamed from: b */
        final /* synthetic */ HashMap f116074b;

        RunnableC46058g(MmParaCommentsFragment jVar, HashMap hashMap) {
            this.f116073a = jVar;
            this.f116074b = hashMap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00c2 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 247
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.RunnableC46058g.run():void");
        }
    }

    /* renamed from: f */
    private final void m182437f() {
        List<MmComment.MmCommentInfo.CommentDetail> c;
        MmComment.MmCommentInfo.CommentDetail a;
        String comment_id;
        IParaCommentCallback bVar;
        int i;
        MmTranslateLangType mmTranslateLangType;
        String str;
        boolean z;
        String str2;
        String str3;
        MmMeetingParagraph b;
        RecyclerView recyclerView = this.f116063a;
        MmMeetingParagraph mmMeetingParagraph = null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.f116063a;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new C46064l(this));
        }
        RecyclerView recyclerView3 = this.f116063a;
        if (recyclerView3 != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            this.f116064b = linearLayoutManager;
            recyclerView3.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView4 = this.f116063a;
        if (recyclerView4 != null) {
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            IParaCommentDepend cVar = this.f116069i;
            if (cVar == null || (b = cVar.mo161715b()) == null || (str = b.getPid()) == null) {
                str = "";
            }
            IParaCommentDepend cVar2 = this.f116069i;
            if (cVar2 != null) {
                z = cVar2.mo161720g();
            } else {
                z = false;
            }
            IParaCommentDepend cVar3 = this.f116069i;
            if (cVar3 != null) {
                str2 = cVar3.mo161719f();
            } else {
                str2 = null;
            }
            IParaCommentDepend cVar4 = this.f116069i;
            if (cVar4 != null) {
                str3 = cVar4.mo161718e();
            } else {
                str3 = null;
            }
            MmParaCommentAdapter gVar = new MmParaCommentAdapter(requireContext, str, z, str2, str3);
            this.f116066d = gVar;
            gVar.mo161730a(new C46062k(this));
            recyclerView4.setAdapter(gVar);
        }
        new C1404s().attachToRecyclerView(this.f116063a);
        IParaCommentDepend cVar5 = this.f116069i;
        if (cVar5 != null && (c = cVar5.mo161716c()) != null) {
            MmParaCommentAdapter gVar2 = this.f116066d;
            if (gVar2 != null) {
                IParaCommentDepend cVar6 = this.f116069i;
                if (cVar6 == null || (mmTranslateLangType = cVar6.mo161717d()) == null) {
                    mmTranslateLangType = MmTranslateLangType.DEFAULT;
                }
                gVar2.mo161732a(c, mmTranslateLangType);
            }
            MmCommentIndicatorView mmCommentIndicatorView = this.f116065c;
            if (mmCommentIndicatorView != null) {
                MmParaCommentAdapter gVar3 = this.f116066d;
                if (gVar3 != null) {
                    i = gVar3.getItemCount();
                } else {
                    i = 0;
                }
                mmCommentIndicatorView.setTotalCount(i);
            }
            MmCommentIndicatorView mmCommentIndicatorView2 = this.f116065c;
            if (mmCommentIndicatorView2 != null) {
                mmCommentIndicatorView2.setCurrentIndex(m182438g());
            }
            LinearLayoutManager linearLayoutManager2 = this.f116064b;
            if (linearLayoutManager2 != null) {
                linearLayoutManager2.scrollToPositionWithOffset(m182438g(), 0);
            }
            this.f116067e = m182438g();
            MmParaCommentAdapter gVar4 = this.f116066d;
            if (gVar4 != null && (a = gVar4.mo161728a(Integer.valueOf(m182438g()))) != null && (comment_id = a.getComment_id()) != null && (bVar = this.f116068h) != null) {
                IParaCommentDepend cVar7 = this.f116069i;
                if (cVar7 != null) {
                    mmMeetingParagraph = cVar7.mo161715b();
                }
                bVar.mo161724a(mo161787a(comment_id, mmMeetingParagraph));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$animAlphaExit$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$d */
    public static final class C46055d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f116071a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        C46055d(Function0 function0) {
            this.f116071a = function0;
        }

        public void onAnimationEnd(Animator animator) {
            this.f116071a.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$animPushExit$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$e */
    public static final class C46056e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f116072a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        C46056e(Function0 function0) {
            this.f116072a = function0;
        }

        public void onAnimationEnd(Animator animator) {
            this.f116072a.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$populateRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$l */
    public static final class C46064l extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MmParaCommentsFragment f116084a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46064l(MmParaCommentsFragment jVar) {
            this.f116084a = jVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            String str;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            MmParaCommentAdapter gVar = this.f116084a.f116066d;
            if (gVar != null) {
                LinearLayoutManager linearLayoutManager = this.f116084a.f116064b;
                if (linearLayoutManager != null) {
                    i3 = linearLayoutManager.findFirstVisibleItemPosition();
                } else {
                    i3 = -1;
                }
                if (i3 <= gVar.getItemCount() && i3 >= 0) {
                    if (i3 != this.f116084a.f116067e) {
                        IParaCommentCallback a = this.f116084a.mo161786a();
                        if (a != null) {
                            MmParaCommentsFragment jVar = this.f116084a;
                            MmComment.MmCommentInfo.CommentDetail a2 = gVar.mo161728a(Integer.valueOf(i3));
                            MmMeetingParagraph mmMeetingParagraph = null;
                            if (a2 != null) {
                                str = a2.getComment_id();
                            } else {
                                str = null;
                            }
                            IParaCommentDepend b = this.f116084a.mo161793b();
                            if (b != null) {
                                mmMeetingParagraph = b.mo161715b();
                            }
                            a.mo161724a(jVar.mo161787a(str, mmMeetingParagraph));
                        }
                        MmCommentIndicatorView mmCommentIndicatorView = this.f116084a.f116065c;
                        if (mmCommentIndicatorView != null) {
                            mmCommentIndicatorView.setCurrentIndex(i3);
                        }
                    }
                    this.f116084a.f116067e = i3;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo161788a(IParaCommentCallback bVar) {
        this.f116068h = bVar;
    }

    /* renamed from: a */
    public final void mo161789a(IParaCommentDepend cVar) {
        this.f116069i = cVar;
    }

    /* renamed from: a */
    public final void mo161791a(HashMap<String, MmComment.MmCommentInfo> hashMap) {
        C45859k.m181685a(new RunnableC46058g(this, hashMap));
    }

    /* renamed from: b */
    private final void m182435b(Function0<Unit> function0) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator listener;
        RecyclerView recyclerView = this.f116063a;
        if (!(recyclerView == null || (animate = recyclerView.animate()) == null || (alpha = animate.alpha(BitmapDescriptorFactory.HUE_RED)) == null || (duration = alpha.setDuration(150)) == null || (interpolator = duration.setInterpolator(new AccelerateDecelerateInterpolator())) == null || (listener = interpolator.setListener(new C46055d(function0))) == null)) {
            listener.start();
        }
        MmCommentIndicatorView mmCommentIndicatorView = this.f116065c;
        if (mmCommentIndicatorView != null) {
            mmCommentIndicatorView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(150).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        }
    }

    /* renamed from: a */
    public final void mo161792a(Function0<Unit> function0) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator listener;
        RecyclerView recyclerView = this.f116063a;
        if (!(recyclerView == null || (animate2 = recyclerView.animate()) == null)) {
            Context a = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
            ViewPropertyAnimator translationY = animate2.translationY((float) C57582a.m223609b(a.getApplicationContext()));
            if (!(translationY == null || (duration2 = translationY.setDuration(200)) == null || (interpolator2 = duration2.setInterpolator(new AccelerateDecelerateInterpolator())) == null || (listener = interpolator2.setListener(new C46056e(function0))) == null)) {
                listener.start();
            }
        }
        MmCommentIndicatorView mmCommentIndicatorView = this.f116065c;
        if (mmCommentIndicatorView != null && (animate = mmCommentIndicatorView.animate()) != null && (alpha = animate.alpha(BitmapDescriptorFactory.HUE_RED)) != null && (duration = alpha.setDuration(200)) != null && (interpolator = duration.setInterpolator(new AccelerateDecelerateInterpolator())) != null) {
            interpolator.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.j$f */
    public static final class C46057f<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(t.getOffsetInPara()), Integer.valueOf(t2.getOffsetInPara()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (C57764ab.m224186a((Activity) getActivity())) {
            i = C57764ab.m224185a(view.getContext()) + C57582a.m223600a(20);
        } else {
            i = C57582a.m223600a(20);
        }
        ((MmKeyboardHideConstraintLayout) mo161785a(R.id.rootView)).setPadding(0, 0, 0, i);
        this.f116063a = (RecyclerView) view.findViewById(R.id.commentRecyclerView);
        this.f116065c = (MmCommentIndicatorView) view.findViewById(R.id.indicatorView);
        m182437f();
        m182436e();
    }

    /* renamed from: a */
    public final IntRange mo161787a(String str, MmMeetingParagraph mmMeetingParagraph) {
        if (mmMeetingParagraph == null || str == null) {
            return new IntRange(-1, -1);
        }
        ArrayList arrayList = new ArrayList();
        List<MmMeetingSentence> sentences = mmMeetingParagraph.getSentences();
        Intrinsics.checkExpressionValueIsNotNull(sentences, "paragraph.sentences");
        for (T t : sentences) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            List<MmHighlightInfo> highlight = t.getHighlight();
            if (highlight != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : highlight) {
                    T t3 = t2;
                    Intrinsics.checkExpressionValueIsNotNull(t3, "it");
                    if (Intrinsics.areEqual(t3.getComment_id(), str)) {
                        arrayList2.add(t2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        if (arrayList.isEmpty()) {
            return new IntRange(-1, -1);
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C46057f());
        }
        return new IntRange(((MmHighlightInfo) arrayList.get(0)).getOffsetInPara(), ((MmHighlightInfo) arrayList.get(arrayList.size() - 1)).getOffsetInPara() + ((MmHighlightInfo) arrayList.get(arrayList.size() - 1)).getSize());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_para_comments_dialog, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo161790a(String str, String str2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "lastCommentContent");
        Intrinsics.checkParameterIsNotNull(str2, "quote");
        Intrinsics.checkParameterIsNotNull(function1, "onReadyReply");
        Intrinsics.checkParameterIsNotNull(function12, "onCancelReply");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        MmPostCommentFragment kVar = new MmPostCommentFragment();
        kVar.mo161812a(new C46059h(this, booleanRef, kVar, function1, function12));
        kVar.mo161813a(new C46060i(str2, str));
        m182435b(new C46061j(this, kVar));
    }
}
