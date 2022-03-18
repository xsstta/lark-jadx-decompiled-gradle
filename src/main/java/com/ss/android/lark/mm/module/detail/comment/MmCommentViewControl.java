package com.ss.android.lark.mm.module.detail.comment;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment;
import com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.request.AddCommentReq;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.ReplyCommentRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J0\u0010\u000e\u001a\u00020\u000f2&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J0\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J4\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmCommentViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/detail/comment/IMmCommentListener;", "Lcom/ss/android/lark/mm/module/detail/comment/IMmCommentDependency;", "Lcom/ss/android/lark/mm/module/detail/comment/IMmCommentInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "paraCommentsFragment", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment;", "getMmInquirer", "getMmListener", "onChangeComments", "", "commentMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lkotlin/collections/HashMap;", "onDismissComments", "onPostComment", "start", "", "end", "quote", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "adapterPosition", "onViewComment", "locationPosition", "mentionCommentId", "mentionContentId", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.e */
public final class MmCommentViewControl extends MmBaseViewControl<IMmCommentListener, IMmCommentDependency> implements IMmCommentInquirer, IMmCommentListener {

    /* renamed from: a */
    public MmParaCommentsFragment f115975a;

    /* renamed from: b */
    public final IMmViewControlContext f115976b;

    /* renamed from: c */
    public final MmBaseViewControlAdapter<IMmCommentListener, IMmCommentDependency> f115977c;

    /* renamed from: b */
    public IMmCommentListener mo161243c() {
        return this;
    }

    /* renamed from: d */
    public IMmCommentInquirer mo161244e() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmCommentViewControl$onPostComment$2", "Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostDepend;", "getInitContent", "", "getQuote", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.e$b */
    public static final class C46025b implements MmPostCommentFragment.IMmPostDepend {

        /* renamed from: a */
        final /* synthetic */ String f115986a;

        @Override // com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment.IMmPostDepend
        /* renamed from: b */
        public String mo161713b() {
            return "";
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment.IMmPostDepend
        /* renamed from: a */
        public String mo161712a() {
            return this.f115986a;
        }

        C46025b(String str) {
            this.f115986a = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmCommentViewControl$onViewComment$1", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentDepend;", "canComment", "", "getCurrentPara", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "getInitShowPosition", "", "getMentionCommentId", "", "getMentionContentId", "getMmCommentList", "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.e$c */
    public static final class C46026c implements MmParaCommentsFragment.IParaCommentDepend {

        /* renamed from: a */
        final /* synthetic */ MmCommentViewControl f115987a;

        /* renamed from: b */
        final /* synthetic */ int f115988b;

        /* renamed from: c */
        final /* synthetic */ MmMeetingParagraph f115989c;

        /* renamed from: d */
        final /* synthetic */ String f115990d;

        /* renamed from: e */
        final /* synthetic */ String f115991e;

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentDepend
        /* renamed from: a */
        public int mo161714a() {
            return this.f115988b;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentDepend
        /* renamed from: b */
        public MmMeetingParagraph mo161715b() {
            return this.f115989c;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentDepend
        /* renamed from: e */
        public String mo161718e() {
            return this.f115990d;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentDepend
        /* renamed from: f */
        public String mo161719f() {
            return this.f115991e;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentDepend
        /* renamed from: d */
        public MmTranslateLangType mo161717d() {
            return this.f115987a.f115977c.mo161230c().mo161682c();
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentDepend
        /* renamed from: g */
        public boolean mo161720g() {
            MmBaseInfo a = this.f115987a.f115977c.mo161230c().mo161673a();
            if (a != null) {
                return a.isCanComment();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentDepend
        /* renamed from: c */
        public List<MmComment.MmCommentInfo.CommentDetail> mo161716c() {
            Map<String, MmComment.MmCommentInfo> comments;
            String str;
            MmComment b = this.f115987a.f115977c.mo161230c().mo161681b();
            if (b == null || (comments = b.getComments()) == null) {
                return null;
            }
            MmMeetingParagraph b2 = mo161715b();
            if (b2 != null) {
                str = b2.getPid();
            } else {
                str = null;
            }
            MmComment.MmCommentInfo mmCommentInfo = comments.get(str);
            if (mmCommentInfo != null) {
                return mmCommentInfo.getComment_list();
            }
            return null;
        }

        C46026c(MmCommentViewControl eVar, int i, MmMeetingParagraph mmMeetingParagraph, String str, String str2) {
            this.f115987a = eVar;
            this.f115988b = i;
            this.f115989c = mmMeetingParagraph;
            this.f115990d = str;
            this.f115991e = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmCommentViewControl$onPostComment$1", "Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostCommentCallback;", "onDismiss", "", "onPostCommentCallback", "commentContent", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.e$a */
    public static final class C46022a implements MmPostCommentFragment.IMmPostCommentCallback {

        /* renamed from: a */
        final /* synthetic */ MmCommentViewControl f115978a;

        /* renamed from: b */
        final /* synthetic */ MmPostCommentFragment f115979b;

        /* renamed from: c */
        final /* synthetic */ int f115980c;

        /* renamed from: d */
        final /* synthetic */ int f115981d;

        /* renamed from: e */
        final /* synthetic */ String f115982e;

        /* renamed from: f */
        final /* synthetic */ MmMeetingParagraph f115983f;

        /* renamed from: g */
        final /* synthetic */ Ref.BooleanRef f115984g;

        /* renamed from: h */
        final /* synthetic */ int f115985h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.e$a$b */
        static final class C46024b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C46022a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46024b(C46022a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f115979b.mo161816c(false);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment.IMmPostCommentCallback
        /* renamed from: a */
        public void mo161709a() {
            this.f115978a.f115977c.mo161230c().mo161677a(this.f115985h, this.f115984g.element);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "res", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.e$a$a */
        static final class C46023a extends Lambda implements Function1<ReplyCommentRes, Unit> {
            final /* synthetic */ C46022a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46023a(C46022a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ReplyCommentRes replyCommentRes) {
                invoke(replyCommentRes);
                return Unit.INSTANCE;
            }

            public final void invoke(ReplyCommentRes replyCommentRes) {
                Intrinsics.checkParameterIsNotNull(replyCommentRes, "res");
                C47083e.m186423a(this.this$0.f115978a.f115976b.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("create_comment").mo165413a("route", "transcript").mo165421c());
                C47083e.m186423a(this.this$0.f115978a.f115976b.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("create_comment").mo165423e("none").mo165424f("transcript").mo165421c());
                this.this$0.f115984g.element = true;
                this.this$0.f115979b.u_();
                this.this$0.f115978a.f115977c.mo161230c().mo161676a(this.this$0.f115985h, replyCommentRes);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmPostCommentFragment.IMmPostCommentCallback
        /* renamed from: a */
        public void mo161710a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "commentContent");
            this.f115979b.mo161816c(true);
            this.f115978a.f115977c.mo161230c().mo161675a(this.f115980c, this.f115981d, this.f115982e, str, this.f115983f, new C46023a(this), new C46024b(this));
        }

        C46022a(MmCommentViewControl eVar, MmPostCommentFragment kVar, int i, int i2, String str, MmMeetingParagraph mmMeetingParagraph, Ref.BooleanRef booleanRef, int i3) {
            this.f115978a = eVar;
            this.f115979b = kVar;
            this.f115980c = i;
            this.f115981d = i2;
            this.f115982e = str;
            this.f115983f = mmMeetingParagraph;
            this.f115984g = booleanRef;
            this.f115985h = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J.\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmCommentViewControl$onViewComment$2", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentsFragment$IParaCommentCallback;", "addComment", "", "addCommentReq", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/request/AddCommentReq;", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "deleteComment", "pid", "", "commentId", "contentId", "dataCallback", "getIsOwner", "", "onChangeCurrentFocusComment", "highlightRange", "Lkotlin/ranges/IntRange;", "onDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.e$d */
    public static final class C46027d implements MmParaCommentsFragment.IParaCommentCallback {

        /* renamed from: a */
        final /* synthetic */ MmCommentViewControl f115992a;

        /* renamed from: b */
        final /* synthetic */ int f115993b;

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentCallback
        /* renamed from: b */
        public boolean mo161725b() {
            return this.f115992a.f115977c.mo161230c().mo161683d();
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentCallback
        /* renamed from: a */
        public void mo161721a() {
            this.f115992a.f115975a = null;
            this.f115992a.f115977c.mo161230c().mo161674a(this.f115993b);
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentCallback
        /* renamed from: a */
        public void mo161724a(IntRange kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "highlightRange");
            this.f115992a.f115977c.mo161230c().mo161680a(kVar, this.f115993b);
        }

        C46027d(MmCommentViewControl eVar, int i) {
            this.f115992a = eVar;
            this.f115993b = i;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentCallback
        /* renamed from: a */
        public void mo161722a(AddCommentReq addCommentReq, AbstractC47070c<ReplyCommentRes> cVar) {
            Intrinsics.checkParameterIsNotNull(addCommentReq, "addCommentReq");
            Intrinsics.checkParameterIsNotNull(cVar, "callback");
            this.f115992a.f115977c.mo161230c().mo161678a(addCommentReq, cVar);
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentsFragment.IParaCommentCallback
        /* renamed from: a */
        public void mo161723a(String str, String str2, String str3, AbstractC47070c<String> cVar) {
            Intrinsics.checkParameterIsNotNull(str, "pid");
            Intrinsics.checkParameterIsNotNull(str2, "commentId");
            Intrinsics.checkParameterIsNotNull(str3, "contentId");
            Intrinsics.checkParameterIsNotNull(cVar, "dataCallback");
            this.f115992a.f115977c.mo161230c().mo161679a(str, str2, str3, cVar);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentListener
    /* renamed from: a */
    public void mo161684a() {
        MmParaCommentsFragment jVar = this.f115975a;
        if (jVar != null) {
            MmParaCommentsFragment.f116062g.mo161798b(C47107a.m186565a(this.f115976b.mo161232n()), jVar);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentListener
    /* renamed from: a */
    public void mo161687a(HashMap<String, MmComment.MmCommentInfo> hashMap) {
        MmParaCommentsFragment jVar = this.f115975a;
        if (jVar != null) {
            jVar.mo161791a(hashMap);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmCommentViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmCommentListener, IMmCommentDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f115976b = gVar;
        this.f115977c = jVar;
    }

    @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentListener
    /* renamed from: a */
    public void mo161686a(MmMeetingParagraph mmMeetingParagraph, int i, int i2, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
        MmParaCommentsFragment jVar = new MmParaCommentsFragment();
        this.f115975a = jVar;
        if (jVar != null) {
            jVar.mo161789a(new C46026c(this, i2, mmMeetingParagraph, str2, str));
        }
        MmParaCommentsFragment jVar2 = this.f115975a;
        if (jVar2 != null) {
            jVar2.mo161788a(new C46027d(this, i));
        }
        MmParaCommentsFragment jVar3 = this.f115975a;
        if (jVar3 != null) {
            MmParaCommentsFragment.f116062g.mo161797a(C47107a.m186565a(this.f115976b.mo161232n()), jVar3);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentListener
    /* renamed from: a */
    public void mo161685a(int i, int i2, String str, MmMeetingParagraph mmMeetingParagraph, int i3) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkParameterIsNotNull(str, "quote");
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        MmPostCommentFragment kVar = new MmPostCommentFragment();
        kVar.mo161812a(new C46022a(this, kVar, i, i2, str, mmMeetingParagraph, booleanRef, i3));
        kVar.mo161813a(new C46025b(str));
        FragmentActivity a = C47107a.m186565a(this.f115976b.mo161232n());
        if (a != null && (supportFragmentManager = a.getSupportFragmentManager()) != null) {
            kVar.mo5511a(supportFragmentManager, "");
        }
    }
}
