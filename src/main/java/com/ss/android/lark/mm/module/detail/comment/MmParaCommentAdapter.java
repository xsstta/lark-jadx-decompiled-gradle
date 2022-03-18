package com.ss.android.lark.mm.module.detail.comment;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.comment.MmParaCommentDetailAdapter;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.request.AddCommentReq;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.ReplyCommentRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000289B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0017\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010)\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020%H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010)\u001a\u00020%H\u0016J&\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010)\u001a\u00020%2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0011H\u0016J\u0018\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020%H\u0016J\u000e\u00105\u001a\u00020-2\u0006\u0010)\u001a\u00020%J\u001c\u00106\u001a\u00020-2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u0012072\u0006\u0010&\u001a\u00020'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0014j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b`\u0015X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R*\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "paraId", "", "canComment", "", "mentionCommentId", "mentionContentId", "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getCanComment", "()Z", "getContext", "()Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "loadingStatusMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMentionCommentId", "()Ljava/lang/String;", "setMentionCommentId", "(Ljava/lang/String;)V", "getMentionContentId", "setMentionContentId", "paraCallback", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$IMmParaCommentAdapterCallback;", "getParaCallback", "()Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$IMmParaCommentAdapterCallback;", "setParaCallback", "(Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$IMmParaCommentAdapterCallback;)V", "getParaId", "replyContentMap", "retryTime", "", "translateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "getItemByPosition", "position", "(Ljava/lang/Integer;)Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "getItemCount", "onBindViewHolder", "", "holder", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removePosition", "update", "", "CommentDetailViewHolder", "IMmParaCommentAdapterCallback", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.g */
public final class MmParaCommentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final List<MmComment.MmCommentInfo.CommentDetail> f115998a = new ArrayList();

    /* renamed from: b */
    public final HashMap<String, String> f115999b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, Boolean> f116000c = new HashMap<>();

    /* renamed from: d */
    public MmTranslateLangType f116001d = MmTranslateLangType.DEFAULT;

    /* renamed from: e */
    public int f116002e = 3;

    /* renamed from: f */
    private IMmParaCommentAdapterCallback f116003f;

    /* renamed from: g */
    private final Context f116004g;

    /* renamed from: h */
    private final String f116005h;

    /* renamed from: i */
    private final boolean f116006i;

    /* renamed from: j */
    private String f116007j;

    /* renamed from: k */
    private String f116008k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J.\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J@\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0018H&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$IMmParaCommentAdapterCallback;", "", "addComment", "", "commentReq", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/request/AddCommentReq;", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "deleteComment", "pid", "", "commentId", "contentId", "dataCallback", "getIsOwner", "", "onDeleteComment", "position", "", "startReplyComment", "lastCommentContent", "quote", "onReadyReply", "Lkotlin/Function1;", "onCancelRely", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$b */
    public interface IMmParaCommentAdapterCallback {
        /* renamed from: a */
        void mo161762a(int i);

        /* renamed from: a */
        void mo161763a(AddCommentReq addCommentReq, AbstractC47070c<ReplyCommentRes> cVar);

        /* renamed from: a */
        void mo161764a(String str, String str2, String str3, AbstractC47070c<String> cVar);

        /* renamed from: a */
        void mo161765a(String str, String str2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12);

        /* renamed from: a */
        boolean mo161766a();
    }

    /* renamed from: a */
    public final IMmParaCommentAdapterCallback mo161727a() {
        return this.f116003f;
    }

    /* renamed from: b */
    public final Context mo161733b() {
        return this.f116004g;
    }

    /* renamed from: c */
    public final String mo161735c() {
        return this.f116005h;
    }

    /* renamed from: d */
    public final boolean mo161736d() {
        return this.f116006i;
    }

    /* renamed from: e */
    public final String mo161737e() {
        return this.f116007j;
    }

    /* renamed from: f */
    public final String mo161738f() {
        return this.f116008k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f115998a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0003JB\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u001a\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00130 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0002J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020%H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$CommentDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "contentView", "Landroid/view/View;", "(Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter;Landroid/view/View;)V", "adapter", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter;", "bottomPanelDivider", "kotlin.jvm.PlatformType", "bottomSendPanel", "commentContentRv", "Landroidx/recyclerview/widget/RecyclerView;", "inputView", "Landroid/widget/TextView;", "outOfCountTv", "progressbar", "quoteTextView", "sendActionView", "bindData", "", "mmComment", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "onReplySuccess", "it", "", "populateRecyclerView", "populateSendCommentView", "replyComment", "commentContent", "", "commentId", "onSuccess", "Lkotlin/Function1;", "onRelyFailed", "Lkotlin/Function0;", "scrollToTargetViewHolderPosition", "mentionTargetPosition", "", "setLoadingStatus", "isShow", "", "showOutOfTextView", "outOfCount", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a */
    public final class CommentDetailViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RecyclerView f116009a;

        /* renamed from: b */
        public final TextView f116010b;

        /* renamed from: c */
        public final View f116011c;

        /* renamed from: d */
        public final TextView f116012d;

        /* renamed from: e */
        public MmParaCommentDetailAdapter f116013e;

        /* renamed from: f */
        final /* synthetic */ MmParaCommentAdapter f116014f;

        /* renamed from: g */
        private final TextView f116015g;

        /* renamed from: h */
        private final View f116016h;

        /* renamed from: i */
        private final View f116017i;

        /* renamed from: j */
        private final View f116018j;

        /* renamed from: k */
        private final View f116019k;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$c */
        public static final class RunnableC46031c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ CommentDetailViewHolder f116023a;

            /* renamed from: b */
            final /* synthetic */ MmComment.MmCommentInfo.CommentDetail f116024b;

            RunnableC46031c(CommentDetailViewHolder aVar, MmComment.MmCommentInfo.CommentDetail commentDetail) {
                this.f116023a = aVar;
                this.f116024b = commentDetail;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$CommentDetailViewHolder$populateRecyclerView$3$2$1"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$c$a */
            static final class RunnableC46033a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ int f116026a;

                /* renamed from: b */
                final /* synthetic */ RunnableC46031c f116027b;

                /* renamed from: c */
                final /* synthetic */ Ref.BooleanRef f116028c;

                RunnableC46033a(int i, RunnableC46031c cVar, Ref.BooleanRef booleanRef) {
                    this.f116026a = i;
                    this.f116027b = cVar;
                    this.f116028c = booleanRef;
                }

                public final void run() {
                    this.f116027b.f116023a.mo161739a(this.f116026a);
                }
            }

            public final void run() {
                T t;
                int indexOf;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = false;
                List<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> comment_content_list = this.f116024b.getComment_content_list();
                if (comment_content_list != null) {
                    Iterator<T> it = comment_content_list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        T t2 = t;
                        Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                        if (Intrinsics.areEqual(t2.getContent_id(), this.f116023a.f116014f.mo161738f())) {
                            break;
                        }
                    }
                    T t3 = t;
                    if (!(t3 == null || (indexOf = this.f116024b.getComment_content_list().indexOf(t3)) == -1)) {
                        booleanRef.element = true;
                        C45859k.m181685a(new RunnableC46033a(indexOf, this, booleanRef));
                    }
                }
                if (!booleanRef.element) {
                    C45859k.m181685a(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.CommentDetailViewHolder.RunnableC46031c.RunnableC460321 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC46031c f116025a;

                        {
                            this.f116025a = r1;
                        }

                        public final void run() {
                            RecyclerView recyclerView = this.f116025a.f116023a.f116009a;
                            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "commentContentRv");
                            recyclerView.setVisibility(0);
                            C45858j.m181677a((int) R.string.MMWeb_G_AtMentionCommentDeleted_Toast);
                        }
                    });
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$CommentDetailViewHolder$populateRecyclerView$2", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterDepend;", "deleteComment", "", "pid", "", "commentId", "contentId", "dataCallback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "isOwner", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$b */
        public static final class C46030b implements MmParaCommentDetailAdapter.IMmCommentDetailAdapterDepend {

            /* renamed from: a */
            final /* synthetic */ CommentDetailViewHolder f116022a;

            @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentDetailAdapter.IMmCommentDetailAdapterDepend
            /* renamed from: a */
            public boolean mo161747a() {
                IMmParaCommentAdapterCallback a = this.f116022a.f116014f.mo161727a();
                if (a != null) {
                    return a.mo161766a();
                }
                return false;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C46030b(CommentDetailViewHolder aVar) {
                this.f116022a = aVar;
            }

            @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentDetailAdapter.IMmCommentDetailAdapterDepend
            /* renamed from: a */
            public void mo161746a(String str, String str2, String str3, AbstractC47070c<String> cVar) {
                Intrinsics.checkParameterIsNotNull(str, "pid");
                Intrinsics.checkParameterIsNotNull(str2, "commentId");
                Intrinsics.checkParameterIsNotNull(str3, "contentId");
                Intrinsics.checkParameterIsNotNull(cVar, "dataCallback");
                IMmParaCommentAdapterCallback a = this.f116022a.f116014f.mo161727a();
                if (a != null) {
                    a.mo161764a(str, str2, str3, cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$h */
        public static final class RunnableC46044h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ CommentDetailViewHolder f116033a;

            /* renamed from: b */
            final /* synthetic */ int f116034b;

            RunnableC46044h(CommentDetailViewHolder aVar, int i) {
                this.f116033a = aVar;
                this.f116034b = i;
            }

            public final void run() {
                int i;
                Integer a;
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f116033a.f116009a.findViewHolderForAdapterPosition(this.f116034b);
                boolean z = findViewHolderForAdapterPosition instanceof MmParaCommentDetailAdapter.MmCommentDetailContentViewHolder;
                if (z) {
                    RecyclerView recyclerView = this.f116033a.f116009a;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "commentContentRv");
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int i2 = this.f116034b;
                        if (!z) {
                            findViewHolderForAdapterPosition = null;
                        }
                        MmParaCommentDetailAdapter.MmCommentDetailContentViewHolder cVar = (MmParaCommentDetailAdapter.MmCommentDetailContentViewHolder) findViewHolderForAdapterPosition;
                        if (cVar == null || (a = cVar.mo161775a()) == null) {
                            i = 0;
                        } else {
                            i = a.intValue();
                        }
                        linearLayoutManager.scrollToPositionWithOffset(i2, i);
                        String str = null;
                        this.f116033a.f116014f.mo161731a(str);
                        this.f116033a.f116014f.mo161734b(str);
                        RecyclerView recyclerView2 = this.f116033a.f116009a;
                        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "commentContentRv");
                        recyclerView2.setVisibility(0);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                } else if (this.f116033a.f116014f.f116002e > 0) {
                    MmParaCommentAdapter gVar = this.f116033a.f116014f;
                    gVar.f116002e--;
                    this.f116033a.mo161739a(this.f116034b);
                } else {
                    RecyclerView recyclerView3 = this.f116033a.f116009a;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "commentContentRv");
                    recyclerView3.setVisibility(0);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$d */
        public static final class C46034d extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ MmComment.MmCommentInfo.CommentDetail $mmComment;
            final /* synthetic */ CommentDetailViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46034d(CommentDetailViewHolder aVar, MmComment.MmCommentInfo.CommentDetail commentDetail) {
                super(1);
                this.this$0 = aVar;
                this.$mmComment = commentDetail;
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
                C45855f.m181664c("MmAllCommentAdapter", "click replay comment button");
                IMmParaCommentAdapterCallback a = this.this$0.f116014f.mo161727a();
                if (a != null) {
                    TextView textView = this.this$0.f116010b;
                    Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
                    String obj = textView.getText().toString();
                    String quote = this.$mmComment.getQuote();
                    Intrinsics.checkExpressionValueIsNotNull(quote, "mmComment.quote");
                    a.mo161765a(obj, quote, new Function1<String, Unit>(this) {
                        /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.CommentDetailViewHolder.C46034d.C460351 */
                        final /* synthetic */ C46034d this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke(str);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final String str) {
                            Intrinsics.checkParameterIsNotNull(str, "content");
                            CommentDetailViewHolder aVar = this.this$0.this$0;
                            String comment_id = this.this$0.$mmComment.getComment_id();
                            Intrinsics.checkExpressionValueIsNotNull(comment_id, "mmComment.comment_id");
                            aVar.mo161743a(comment_id, true);
                            CommentDetailViewHolder aVar2 = this.this$0.this$0;
                            String comment_id2 = this.this$0.$mmComment.getComment_id();
                            Intrinsics.checkExpressionValueIsNotNull(comment_id2, "mmComment.comment_id");
                            aVar2.mo161742a(str, comment_id2, new Function1<List<? extends MmComment.MmCommentInfo.CommentDetail>, Unit>(this) {
                                /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.CommentDetailViewHolder.C46034d.C460351.C460361 */
                                final /* synthetic */ C460351 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends MmComment.MmCommentInfo.CommentDetail> list) {
                                    invoke(list);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(List<? extends MmComment.MmCommentInfo.CommentDetail> list) {
                                    this.this$0.this$0.this$0.mo161741a(this.this$0.this$0.$mmComment, list);
                                }
                            }, new Function0<Unit>(this) {
                                /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.CommentDetailViewHolder.C46034d.C460351.C460372 */
                                final /* synthetic */ C460351 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final void invoke() {
                                    String comment_id = this.this$0.this$0.$mmComment.getComment_id();
                                    Intrinsics.checkExpressionValueIsNotNull(comment_id, "mmComment.comment_id");
                                    this.this$0.this$0.this$0.f116014f.f115999b.put(comment_id, str);
                                    TextView textView = this.this$0.this$0.this$0.f116010b;
                                    Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
                                    textView.setText(str);
                                    CommentDetailViewHolder aVar = this.this$0.this$0.this$0;
                                    String comment_id2 = this.this$0.this$0.$mmComment.getComment_id();
                                    Intrinsics.checkExpressionValueIsNotNull(comment_id2, "mmComment.comment_id");
                                    aVar.mo161743a(comment_id2, false);
                                }
                            });
                        }
                    }, new Function1<String, Unit>(this) {
                        /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.CommentDetailViewHolder.C46034d.C460382 */
                        final /* synthetic */ C46034d this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke(str);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(String str) {
                            Intrinsics.checkParameterIsNotNull(str, "content");
                            String comment_id = this.this$0.$mmComment.getComment_id();
                            Intrinsics.checkExpressionValueIsNotNull(comment_id, "mmComment.comment_id");
                            this.this$0.this$0.f116014f.f115999b.put(comment_id, str);
                            TextView textView = this.this$0.this$0.f116010b;
                            Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
                            textView.setText(str);
                        }
                    });
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$CommentDetailViewHolder$populateSendCommentView$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$e */
        public static final class C46039e implements TextWatcher {

            /* renamed from: a */
            final /* synthetic */ CommentDetailViewHolder f116029a;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C46039e(CommentDetailViewHolder aVar) {
                this.f116029a = aVar;
            }

            public void afterTextChanged(Editable editable) {
                TextView textView = this.f116029a.f116010b;
                Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
                int length = textView.getText().length();
                if (length == 0) {
                    View view = this.f116029a.f116011c;
                    Intrinsics.checkExpressionValueIsNotNull(view, "sendActionView");
                    view.setEnabled(false);
                    View view2 = this.f116029a.f116011c;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "sendActionView");
                    view2.setVisibility(0);
                    TextView textView2 = this.f116029a.f116012d;
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "outOfCountTv");
                    textView2.setVisibility(8);
                } else if (1 <= length && 1000 >= length) {
                    View view3 = this.f116029a.f116011c;
                    Intrinsics.checkExpressionValueIsNotNull(view3, "sendActionView");
                    view3.setEnabled(true);
                    View view4 = this.f116029a.f116011c;
                    Intrinsics.checkExpressionValueIsNotNull(view4, "sendActionView");
                    view4.setVisibility(0);
                    TextView textView3 = this.f116029a.f116012d;
                    Intrinsics.checkExpressionValueIsNotNull(textView3, "outOfCountTv");
                    textView3.setVisibility(8);
                } else {
                    View view5 = this.f116029a.f116011c;
                    Intrinsics.checkExpressionValueIsNotNull(view5, "sendActionView");
                    view5.setVisibility(8);
                    TextView textView4 = this.f116029a.f116012d;
                    Intrinsics.checkExpressionValueIsNotNull(textView4, "outOfCountTv");
                    textView4.setVisibility(0);
                    this.f116029a.mo161744b(length - 1000);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$f */
        public static final class C46040f extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ MmComment.MmCommentInfo.CommentDetail $mmComment;
            final /* synthetic */ CommentDetailViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46040f(CommentDetailViewHolder aVar, MmComment.MmCommentInfo.CommentDetail commentDetail) {
                super(1);
                this.this$0 = aVar;
                this.$mmComment = commentDetail;
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
                C45855f.m181664c("MmAllCommentAdapter", "click sendActionView");
                CommentDetailViewHolder aVar = this.this$0;
                String comment_id = this.$mmComment.getComment_id();
                Intrinsics.checkExpressionValueIsNotNull(comment_id, "mmComment.comment_id");
                aVar.mo161743a(comment_id, true);
                CommentDetailViewHolder aVar2 = this.this$0;
                TextView textView = aVar2.f116010b;
                Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
                String obj = textView.getText().toString();
                String comment_id2 = this.$mmComment.getComment_id();
                Intrinsics.checkExpressionValueIsNotNull(comment_id2, "mmComment.comment_id");
                aVar2.mo161742a(obj, comment_id2, new Function1<List<? extends MmComment.MmCommentInfo.CommentDetail>, Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.CommentDetailViewHolder.C46040f.C460411 */
                    final /* synthetic */ C46040f this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends MmComment.MmCommentInfo.CommentDetail> list) {
                        invoke(list);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(List<? extends MmComment.MmCommentInfo.CommentDetail> list) {
                        this.this$0.this$0.mo161741a(this.this$0.$mmComment, list);
                    }
                }, new Function0<Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.comment.MmParaCommentAdapter.CommentDetailViewHolder.C46040f.C460422 */
                    final /* synthetic */ C46040f this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        CommentDetailViewHolder aVar = this.this$0.this$0;
                        String comment_id = this.this$0.$mmComment.getComment_id();
                        Intrinsics.checkExpressionValueIsNotNull(comment_id, "mmComment.comment_id");
                        aVar.mo161743a(comment_id, false);
                    }
                });
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$CommentDetailViewHolder$replyComment$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$g */
        public static final class C46043g extends AbstractC47070c<ReplyCommentRes> {

            /* renamed from: a */
            final /* synthetic */ CommentDetailViewHolder f116030a;

            /* renamed from: b */
            final /* synthetic */ Function1 f116031b;

            /* renamed from: c */
            final /* synthetic */ Function0 f116032c;

            @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
            /* renamed from: a */
            public void mo161288a(C47068a aVar) {
                TextView textView = this.f116030a.f116010b;
                Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
                textView.setEnabled(true);
                C45855f.m181666e("MmAllCommentAdapter", "error: " + aVar);
                this.f116032c.invoke();
            }

            /* renamed from: a */
            public void mo161289a(ReplyCommentRes replyCommentRes) {
                List<MmComment.MmCommentInfo.CommentDetail> comment_list;
                Intrinsics.checkParameterIsNotNull(replyCommentRes, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                TextView textView = this.f116030a.f116010b;
                Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
                textView.setEnabled(true);
                C47083e.m186423a(this.f116030a.f116014f.mo161733b(), "vc_mm_click_button", C47086i.m186432a().mo165409a("create_comment").mo165413a("route", Comment.f24093e).mo165421c());
                C47083e.m186423a(this.f116030a.f116014f.mo161733b(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("create_comment").mo165423e("none").mo165424f(Comment.f24093e).mo165421c());
                MmComment.MmCommentInfo mmCommentInfo = replyCommentRes.getComments().get(this.f116030a.f116014f.mo161735c());
                if (mmCommentInfo != null && (comment_list = mmCommentInfo.getComment_list()) != null) {
                    this.f116030a.f116014f.f115998a.clear();
                    this.f116030a.f116014f.f115998a.addAll(comment_list);
                    this.f116031b.invoke(comment_list);
                }
            }

            C46043g(CommentDetailViewHolder aVar, Function1 function1, Function0 function0) {
                this.f116030a = aVar;
                this.f116031b = function1;
                this.f116032c = function0;
            }
        }

        /* renamed from: a */
        public final void mo161739a(int i) {
            RecyclerView recyclerView = this.f116009a;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "commentContentRv");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
                C45859k.m181686a(new RunnableC46044h(this, i), 300);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmParaCommentAdapter$CommentDetailViewHolder$populateRecyclerView$1", "Lcom/ss/android/lark/mm/module/detail/comment/MmParaCommentDetailAdapter$IMmCommentDetailAdapterCallback;", "onDeleteSuccess", "", "contentId", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.comment.g$a$a */
        public static final class C46029a implements MmParaCommentDetailAdapter.IMmCommentDetailAdapterCallback {

            /* renamed from: a */
            final /* synthetic */ CommentDetailViewHolder f116020a;

            /* renamed from: b */
            final /* synthetic */ MmComment.MmCommentInfo.CommentDetail f116021b;

            @Override // com.ss.android.lark.mm.module.detail.comment.MmParaCommentDetailAdapter.IMmCommentDetailAdapterCallback
            /* renamed from: a */
            public void mo161745a(String str) {
                T t;
                Intrinsics.checkParameterIsNotNull(str, "contentId");
                MmParaCommentDetailAdapter hVar = this.f116020a.f116013e;
                if (hVar != null) {
                    hVar.mo161769a(str);
                }
                MmParaCommentDetailAdapter hVar2 = this.f116020a.f116013e;
                if (hVar2 != null && hVar2.getItemCount() == 0) {
                    List<MmComment.MmCommentInfo.CommentDetail> list = this.f116020a.f116014f.f115998a;
                    Iterator<T> it = this.f116020a.f116014f.f115998a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (Intrinsics.areEqual(t.getComment_id(), this.f116021b.getComment_id())) {
                            break;
                        }
                    }
                    int indexOf = CollectionsKt.indexOf((List) list, (Object) t);
                    if (indexOf != -1) {
                        this.f116020a.f116014f.f115998a.remove(indexOf);
                        this.f116020a.f116014f.notifyItemRemoved(indexOf);
                        IMmParaCommentAdapterCallback a = this.f116020a.f116014f.mo161727a();
                        if (a != null) {
                            a.mo161762a(this.f116020a.getAdapterPosition());
                        }
                    }
                }
            }

            C46029a(CommentDetailViewHolder aVar, MmComment.MmCommentInfo.CommentDetail commentDetail) {
                this.f116020a = aVar;
                this.f116021b = commentDetail;
            }
        }

        /* renamed from: c */
        private final void m182396c(MmComment.MmCommentInfo.CommentDetail commentDetail) {
            TextView textView = this.f116010b;
            Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
            C47110e.m186573a(textView, new C46034d(this, commentDetail));
            this.f116010b.addTextChangedListener(new C46039e(this));
            View view = this.f116011c;
            Intrinsics.checkExpressionValueIsNotNull(view, "sendActionView");
            C47110e.m186573a(view, new C46040f(this, commentDetail));
            TextView textView2 = this.f116010b;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "inputView");
            textView2.setText(this.f116014f.f115999b.get(commentDetail.getComment_id()));
            String comment_id = commentDetail.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "mmComment.comment_id");
            mo161743a(comment_id, Intrinsics.areEqual((Object) this.f116014f.f116000c.get(commentDetail.getComment_id()), (Object) true));
        }

        /* renamed from: a */
        public final void mo161740a(MmComment.MmCommentInfo.CommentDetail commentDetail) {
            int i;
            Intrinsics.checkParameterIsNotNull(commentDetail, "mmComment");
            TextView textView = this.f116015g;
            Intrinsics.checkExpressionValueIsNotNull(textView, "quoteTextView");
            textView.setText(commentDetail.getQuote());
            m182396c(commentDetail);
            m182395b(commentDetail);
            if (this.f116014f.f116001d != MmTranslateLangType.DEFAULT || !this.f116014f.mo161736d()) {
                i = 4;
            } else {
                i = 0;
            }
            View view = this.f116016h;
            Intrinsics.checkExpressionValueIsNotNull(view, "bottomSendPanel");
            view.setVisibility(i);
            View view2 = this.f116017i;
            Intrinsics.checkExpressionValueIsNotNull(view2, "bottomPanelDivider");
            view2.setVisibility(i);
        }

        /* renamed from: b */
        public final void mo161744b(int i) {
            if (i < 1000) {
                TextView textView = this.f116012d;
                Intrinsics.checkExpressionValueIsNotNull(textView, "outOfCountTv");
                StringBuilder sb = new StringBuilder();
                sb.append('-');
                sb.append(i);
                textView.setText(sb.toString());
                return;
            }
            TextView textView2 = this.f116012d;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "outOfCountTv");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('-');
            sb2.append(i / 1000);
            sb2.append('K');
            textView2.setText(sb2.toString());
        }

        /* renamed from: b */
        private final void m182395b(MmComment.MmCommentInfo.CommentDetail commentDetail) {
            if (this.f116013e == null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f116014f.mo161733b());
                RecyclerView recyclerView = this.f116009a;
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "commentContentRv");
                recyclerView.setItemAnimator(null);
                RecyclerView recyclerView2 = this.f116009a;
                Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "commentContentRv");
                recyclerView2.setLayoutManager(linearLayoutManager);
                Context b = this.f116014f.mo161733b();
                String c = this.f116014f.mo161735c();
                String comment_id = commentDetail.getComment_id();
                Intrinsics.checkExpressionValueIsNotNull(comment_id, "mmComment.comment_id");
                this.f116013e = new MmParaCommentDetailAdapter(b, c, comment_id, new C46029a(this, commentDetail), new C46030b(this));
                RecyclerView recyclerView3 = this.f116009a;
                Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "commentContentRv");
                recyclerView3.setAdapter(this.f116013e);
            }
            MmParaCommentDetailAdapter hVar = this.f116013e;
            if (hVar != null) {
                List<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> comment_content_list = commentDetail.getComment_content_list();
                Intrinsics.checkExpressionValueIsNotNull(comment_content_list, "mmComment.comment_content_list");
                hVar.mo161770a(comment_content_list);
            }
            String f = this.f116014f.mo161738f();
            if (f == null || !(!StringsKt.isBlank(f)) || !Intrinsics.areEqual(this.f116014f.mo161737e(), commentDetail.getComment_id())) {
                RecyclerView recyclerView4 = this.f116009a;
                Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "commentContentRv");
                recyclerView4.setVisibility(0);
                return;
            }
            RecyclerView recyclerView5 = this.f116009a;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView5, "commentContentRv");
            recyclerView5.setVisibility(4);
            C45857i.m181676a(new RunnableC46031c(this, commentDetail));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CommentDetailViewHolder(MmParaCommentAdapter gVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "contentView");
            this.f116014f = gVar;
            this.f116019k = view;
            this.f116015g = (TextView) view.findViewById(R.id.quoteText);
            this.f116009a = (RecyclerView) view.findViewById(R.id.commentContentRv);
            this.f116016h = view.findViewById(R.id.bottomSendPanel);
            this.f116017i = view.findViewById(R.id.bottomDivider);
            this.f116010b = (TextView) view.findViewById(R.id.inputView);
            this.f116011c = view.findViewById(R.id.sendActionView);
            this.f116012d = (TextView) view.findViewById(R.id.outOfCountTv);
            this.f116018j = view.findViewById(R.id.progressbar);
        }

        /* renamed from: a */
        public final void mo161741a(MmComment.MmCommentInfo.CommentDetail commentDetail, List<? extends MmComment.MmCommentInfo.CommentDetail> list) {
            T t;
            List<MmComment.MmCommentInfo.CommentDetail.CommentDetailContent> comment_content_list;
            MmParaCommentDetailAdapter hVar;
            String comment_id = commentDetail.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "mmComment.comment_id");
            mo161743a(comment_id, false);
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getComment_id(), commentDetail.getComment_id())) {
                        break;
                    }
                }
                T t2 = t;
                if (!(t2 == null || (comment_content_list = t2.getComment_content_list()) == null || (hVar = this.f116013e) == null)) {
                    MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent = comment_content_list.get(comment_content_list.size() - 1);
                    Intrinsics.checkExpressionValueIsNotNull(commentDetailContent, "cDetailList[cDetailList.size - 1]");
                    hVar.mo161768a(commentDetailContent);
                }
            }
            View view = this.f116011c;
            Intrinsics.checkExpressionValueIsNotNull(view, "sendActionView");
            view.setEnabled(false);
            TextView textView = this.f116010b;
            Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
            textView.setText("");
            String comment_id2 = commentDetail.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id2, "mmComment.comment_id");
            this.f116014f.f115999b.put(comment_id2, "");
            MmParaCommentDetailAdapter hVar2 = this.f116013e;
            if (hVar2 != null) {
                RecyclerView recyclerView = this.f116009a;
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "commentContentRv");
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.scrollToPosition(hVar2.getItemCount() - 1);
                }
            }
        }

        /* renamed from: a */
        public final void mo161743a(String str, boolean z) {
            int i;
            View view = this.f116018j;
            Intrinsics.checkExpressionValueIsNotNull(view, "progressbar");
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = this.f116011c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "sendActionView");
            if (z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            this.f116014f.f116000c.put(str, Boolean.valueOf(z));
        }

        /* renamed from: a */
        public final void mo161742a(String str, String str2, Function1<? super List<? extends MmComment.MmCommentInfo.CommentDetail>, Unit> function1, Function0<Unit> function0) {
            TextView textView = this.f116010b;
            Intrinsics.checkExpressionValueIsNotNull(textView, "inputView");
            textView.setEnabled(false);
            AddCommentReq addCommentReq = new AddCommentReq();
            addCommentReq.setCommentId(str2);
            addCommentReq.setContent(str);
            IMmParaCommentAdapterCallback a = this.f116014f.mo161727a();
            if (a != null) {
                a.mo161763a(addCommentReq, new C46043g(this, function1, function0));
            }
        }
    }

    /* renamed from: a */
    public final void mo161730a(IMmParaCommentAdapterCallback bVar) {
        this.f116003f = bVar;
    }

    /* renamed from: b */
    public final void mo161734b(String str) {
        this.f116008k = str;
    }

    /* renamed from: a */
    public final void mo161731a(String str) {
        this.f116007j = str;
    }

    /* renamed from: a */
    public final void mo161729a(int i) {
        if (i >= 0 && i <= this.f115998a.size() - 1) {
            this.f115998a.remove(i);
            notifyItemRemoved(i);
        }
    }

    /* renamed from: a */
    public final MmComment.MmCommentInfo.CommentDetail mo161728a(Integer num) {
        if (num == null || num.intValue() < 0 || num.intValue() >= this.f115998a.size()) {
            return null;
        }
        return this.f115998a.get(num.intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_comment_detail_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new CommentDetailViewHolder(this, inflate);
    }

    /* renamed from: a */
    public final void mo161732a(List<? extends MmComment.MmCommentInfo.CommentDetail> list, MmTranslateLangType mmTranslateLangType) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
        this.f116001d = mmTranslateLangType;
        if (this.f115998a.isEmpty()) {
            this.f115998a.addAll(list);
            notifyDataSetChanged();
            return;
        }
        C1374g.C1377b a = C1374g.m6298a(new MmParaCommentDiffCallback(this.f115998a, list), false);
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(M…(this.data, data), false)");
        this.f115998a.clear();
        this.f115998a.addAll(list);
        a.mo7412a(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof CommentDetailViewHolder) {
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (this.f115998a.size() > 1) {
                    i2 = C57582a.m223600a(8);
                } else {
                    i2 = 0;
                }
                marginLayoutParams.setMarginEnd(i2);
                View view2 = viewHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                view2.setLayoutParams(marginLayoutParams);
                ((CommentDetailViewHolder) viewHolder).mo161740a(this.f115998a.get(i));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list, "payloads");
        super.onBindViewHolder(viewHolder, i, list);
    }

    public MmParaCommentAdapter(Context context, String str, boolean z, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "paraId");
        this.f116004g = context;
        this.f116005h = str;
        this.f116006i = z;
        this.f116007j = str2;
        this.f116008k = str3;
    }
}
