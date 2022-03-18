package com.bytedance.ee.bear.middleground.feed.view.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.C7727a;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import com.bytedance.ee.bear.middleground.comment.widget.CommentTextView;
import com.bytedance.ee.bear.middleground.comment.widget.RichTextInjector;
import com.bytedance.ee.bear.middleground.feed.export.bean.FeedCommentDetailBean;
import com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a;
import com.bytedance.ee.bear.middleground.feed.p456d.C9437a;
import com.bytedance.ee.bear.middleground.feed.p457e.C9486c;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002;<B¿\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012y\u0010\f\u001au\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\r\u00128\u0010\u0018\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00170\u0019\u0012)\u0010\u001c\u001a%\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00170\u001d\u00128\u0010\u001f\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\u0010!J \u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000eH\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u000eH\u0002J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0002J\b\u0010/\u001a\u00020\u0012H\u0016J\u0018\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u000203H\u0002J,\u00104\u001a\u00020\u00172\n\u00105\u001a\u0006\u0012\u0002\b\u0003062\u0006\u00107\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0003H\u0017J\u001c\u00108\u001a\u00020\u00022\n\u00105\u001a\u0006\u0012\u0002\b\u0003062\u0006\u00109\u001a\u00020:H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R@\u0010\u001f\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00170\u0019X\u0004¢\u0006\u0002\n\u0000R\u0001\u0010\f\u001au\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\rX\u0004¢\u0006\u0002\n\u0000R1\u0010\u001c\u001a%\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00170\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R@\u0010\u0018\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00170\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemComment;", "Lcom/bytedance/ee/bear/middleground/feed/multi/IMultiAdapter;", "Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemComment$FeedCommentViewHolder;", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/FeedCommentDetailBean;", "userToken", "", "config", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "fileSpanClickListener", "Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;", "longListener", "Lkotlin/Function5;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "", "position", "messageId", "commentId", "replyId", "", "toMessage", "Lkotlin/Function2;", "", "whole", "readMessage", "Lkotlin/Function1;", "", "gotoProfile", "userId", "(Ljava/lang/String;Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getConfig", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "setConfig", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;)V", "adjustPosition", "contentTv", "Landroid/widget/TextView;", "tranTv", "tran", "adjustTouchArea", "view", "filterLineScope", "content", "getItemViewType", "getTime", "item", "context", "Landroid/content/Context;", "onBindViewHolder", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Companion", "FeedCommentViewHolder", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a */
public final class FeedItemComment implements AbstractC9431a<FeedCommentViewHolder, FeedCommentDetailBean> {

    /* renamed from: f */
    public static final Companion f25373f = new Companion(null);

    /* renamed from: a */
    public final C10917c f25374a;

    /* renamed from: b */
    public final Function5<View, Integer, String, String, String, Unit> f25375b;

    /* renamed from: c */
    public final Function2<String, Boolean, Unit> f25376c;

    /* renamed from: d */
    public final Function1<List<String>, Unit> f25377d;

    /* renamed from: e */
    public final Function2<String, C10917c, Unit> f25378e;

    /* renamed from: g */
    private final String f25379g;

    /* renamed from: h */
    private TranslateConfig f25380h;

    /* renamed from: i */
    private final AbstractC10460a.AbstractC10461a f25381i;

    @Override // com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a
    /* renamed from: a */
    public int mo35941a() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemComment$Companion;", "", "()V", "TAG", "", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemComment$FeedCommentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mDivider", "getMDivider", "()Landroid/view/View;", "mTvContent", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "getMTvContent", "()Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "mTvName", "Landroid/widget/TextView;", "getMTvName", "()Landroid/widget/TextView;", "mTvTime", "getMTvTime", "mTvTranslate", "getMTvTranslate", "mTvTranslateA", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "getMTvTranslateA", "()Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "mUnReadIco", "getMUnReadIco", "mUserImg", "Landroid/widget/ImageView;", "getMUserImg", "()Landroid/widget/ImageView;", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$b */
    public static final class FeedCommentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final CommentTextView f25382a;

        /* renamed from: b */
        private final CommentTextView f25383b;

        /* renamed from: c */
        private final BearLottieView f25384c;

        /* renamed from: d */
        private final ImageView f25385d;

        /* renamed from: e */
        private final TextView f25386e;

        /* renamed from: f */
        private final TextView f25387f;

        /* renamed from: g */
        private final View f25388g;

        /* renamed from: h */
        private final View f25389h;

        /* renamed from: a */
        public final CommentTextView mo35989a() {
            return this.f25382a;
        }

        /* renamed from: b */
        public final CommentTextView mo35990b() {
            return this.f25383b;
        }

        /* renamed from: c */
        public final BearLottieView mo35991c() {
            return this.f25384c;
        }

        /* renamed from: d */
        public final ImageView mo35992d() {
            return this.f25385d;
        }

        /* renamed from: e */
        public final TextView mo35993e() {
            return this.f25386e;
        }

        /* renamed from: f */
        public final TextView mo35994f() {
            return this.f25387f;
        }

        /* renamed from: g */
        public final View mo35995g() {
            return this.f25388g;
        }

        /* renamed from: h */
        public final View mo35996h() {
            return this.f25389h;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FeedCommentViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            View findViewById = this.itemView.findViewById(R.id.tv_content);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_content)");
            this.f25382a = (CommentTextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.tv_content_translate);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_content_translate)");
            this.f25383b = (CommentTextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.iv_translate);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_translate)");
            this.f25384c = (BearLottieView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.user_msg_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.user_msg_image)");
            this.f25385d = (ImageView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.tv_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.tv_name)");
            this.f25386e = (TextView) findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.tv_create_at);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.tv_create_at)");
            this.f25387f = (TextView) findViewById6;
            View findViewById7 = this.itemView.findViewById(R.id.unread_ico);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.unread_ico)");
            this.f25388g = findViewById7;
            View findViewById8 = this.itemView.findViewById(R.id.v_divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "itemView.findViewById(R.id.v_divider)");
            this.f25389h = findViewById8;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$e */
    public static final class RunnableC9441e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedItemComment f25393a;

        /* renamed from: b */
        final /* synthetic */ FeedCommentViewHolder f25394b;

        RunnableC9441e(FeedItemComment aVar, FeedCommentViewHolder bVar) {
            this.f25393a = aVar;
            this.f25394b = bVar;
        }

        public final void run() {
            this.f25393a.mo35985a(this.f25394b.mo35991c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$j */
    public static final class RunnableC9446j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedItemComment f25406a;

        /* renamed from: b */
        final /* synthetic */ FeedCommentDetailBean f25407b;

        RunnableC9446j(FeedItemComment aVar, FeedCommentDetailBean feedCommentDetailBean) {
            this.f25406a = aVar;
            this.f25407b = feedCommentDetailBean;
        }

        public final void run() {
            C13479a.m54764b("FeedItemComment", "read message: Comment");
            this.f25406a.f25377d.invoke(CollectionsKt.mutableListOf(this.f25407b.getMessageId()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemComment$adjustPosition$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$c */
    public static final class ViewTreeObserver$OnPreDrawListenerC9439c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ TextView f25390a;

        /* renamed from: b */
        final /* synthetic */ View f25391b;

        public boolean onPreDraw() {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.f25390a.getGlobalVisibleRect(rect);
            this.f25391b.getGlobalVisibleRect(rect2);
            String obj = this.f25390a.getText().toString();
            int lineCount = this.f25390a.getLineCount();
            if (this.f25390a.getLayout() == null) {
                this.f25390a.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            int i = lineCount - 1;
            int lineStart = this.f25390a.getLayout().getLineStart(i);
            int lineEnd = this.f25390a.getLayout().getLineEnd(i);
            if (obj != null) {
                String substring = obj.substring(lineStart, lineEnd);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                RelativeLayout.LayoutParams layoutParams = null;
                if (((float) (rect2.left - rect.left)) <= this.f25390a.getPaint().measureText(StringsKt.replace$default(substring, "<doc.at.~#_%=`>", "     ", false, 4, (Object) null))) {
                    ViewGroup.LayoutParams layoutParams2 = this.f25391b.getLayoutParams();
                    if (!(layoutParams2 instanceof RelativeLayout.LayoutParams)) {
                        layoutParams2 = null;
                    }
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                    if (layoutParams3 != null) {
                        layoutParams3.addRule(3, this.f25390a.getId());
                    }
                    ViewGroup.LayoutParams layoutParams4 = this.f25391b.getLayoutParams();
                    if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                        layoutParams = layoutParams4;
                    }
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams;
                    if (layoutParams5 != null) {
                        layoutParams5.addRule(8, -1);
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams6 = this.f25391b.getLayoutParams();
                    if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
                        layoutParams = layoutParams6;
                    }
                    RelativeLayout.LayoutParams layoutParams7 = layoutParams;
                    if (layoutParams7 != null) {
                        layoutParams7.addRule(3, -1);
                    }
                }
                View view = this.f25391b;
                view.setLayoutParams(view.getLayoutParams());
                this.f25390a.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        ViewTreeObserver$OnPreDrawListenerC9439c(TextView textView, View view) {
            this.f25390a = textView;
            this.f25391b = view;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$d */
    public static final class View$OnClickListenerC9440d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedCommentViewHolder f25392a;

        View$OnClickListenerC9440d(FeedCommentViewHolder bVar) {
            this.f25392a = bVar;
        }

        public final void onClick(View view) {
            this.f25392a.itemView.performClick();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$i */
    public static final class View$OnClickListenerC9445i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedItemComment f25404a;

        /* renamed from: b */
        final /* synthetic */ FeedCommentDetailBean f25405b;

        View$OnClickListenerC9445i(FeedItemComment aVar, FeedCommentDetailBean feedCommentDetailBean) {
            this.f25404a = aVar;
            this.f25405b = feedCommentDetailBean;
        }

        public final void onClick(View view) {
            if (!TextUtils.isEmpty(this.f25405b.getUser_id())) {
                this.f25404a.f25378e.invoke(this.f25405b.getUser_id(), this.f25404a.f25374a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$k */
    public static final class View$OnClickListenerC9447k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedItemComment f25408a;

        /* renamed from: b */
        final /* synthetic */ FeedCommentDetailBean f25409b;

        View$OnClickListenerC9447k(FeedItemComment aVar, FeedCommentDetailBean feedCommentDetailBean) {
            this.f25408a = aVar;
            this.f25409b = feedCommentDetailBean;
        }

        public final void onClick(View view) {
            Function2<String, Boolean, Unit> kVar = this.f25408a.f25376c;
            String messageId = this.f25409b.getMessageId();
            boolean z = true;
            if (this.f25409b.getIs_whole() != 1) {
                z = false;
            }
            kVar.invoke(messageId, Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$g */
    public static final class View$OnLongClickListenerC9443g implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedItemComment f25398a;

        /* renamed from: b */
        final /* synthetic */ int f25399b;

        /* renamed from: c */
        final /* synthetic */ FeedCommentDetailBean f25400c;

        View$OnLongClickListenerC9443g(FeedItemComment aVar, int i, FeedCommentDetailBean feedCommentDetailBean) {
            this.f25398a = aVar;
            this.f25399b = i;
            this.f25400c = feedCommentDetailBean;
        }

        public final boolean onLongClick(View view) {
            Function5<View, Integer, String, String, String, Unit> qVar = this.f25398a.f25375b;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Integer valueOf = Integer.valueOf(this.f25399b);
            String messageId = this.f25400c.getMessageId();
            Intrinsics.checkExpressionValueIsNotNull(messageId, "item.messageId");
            qVar.invoke(view, valueOf, messageId, this.f25400c.getComment_id(), this.f25400c.getReply_id());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$h */
    public static final class View$OnLongClickListenerC9444h implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedItemComment f25401a;

        /* renamed from: b */
        final /* synthetic */ int f25402b;

        /* renamed from: c */
        final /* synthetic */ FeedCommentDetailBean f25403c;

        View$OnLongClickListenerC9444h(FeedItemComment aVar, int i, FeedCommentDetailBean feedCommentDetailBean) {
            this.f25401a = aVar;
            this.f25402b = i;
            this.f25403c = feedCommentDetailBean;
        }

        public final boolean onLongClick(View view) {
            Function5<View, Integer, String, String, String, Unit> qVar = this.f25401a.f25375b;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Integer valueOf = Integer.valueOf(this.f25402b);
            String messageId = this.f25403c.getMessageId();
            Intrinsics.checkExpressionValueIsNotNull(messageId, "item.messageId");
            qVar.invoke(view, valueOf, messageId, this.f25403c.getComment_id(), this.f25403c.getReply_id());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.a$f */
    public static final class View$OnClickListenerC9442f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedCommentDetailBean f25395a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.Adapter f25396b;

        /* renamed from: c */
        final /* synthetic */ int f25397c;

        View$OnClickListenerC9442f(FeedCommentDetailBean feedCommentDetailBean, RecyclerView.Adapter adapter, int i) {
            this.f25395a = feedCommentDetailBean;
            this.f25396b = adapter;
            this.f25397c = i;
        }

        public final void onClick(View view) {
            ((ICommentTranslate) KoinJavaComponent.m268613a(ICommentTranslate.class, null, null, 6, null)).mo35258a().put(this.f25395a.getReply_id(), Boolean.valueOf(!Intrinsics.areEqual((Object) ((ICommentTranslate) KoinJavaComponent.m268613a(ICommentTranslate.class, null, null, 6, null)).mo35258a().get(this.f25395a.getReply_id()), (Object) true)));
            this.f25396b.notifyItemChanged(this.f25397c);
        }
    }

    /* renamed from: a */
    private final String m39078a(String str) {
        if (str != null) {
            return StringsKt.trim(StringsKt.trim((CharSequence) str).toString(), '\n');
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    public final void mo35985a(View view) {
        if (view.getVisibility() != 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((View) parent).setTouchDelegate(null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        ViewParent parent2 = view.getParent();
        if (parent2 != null) {
            ((View) parent2).setTouchDelegate(new TouchDelegate(new Rect(rect.left - 200, rect.top - 30, rect.right + LocationRequest.PRIORITY_HD_ACCURACY, rect.bottom + LocationRequest.PRIORITY_HD_ACCURACY), view));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: a */
    public final void mo35987a(TranslateConfig translateConfig) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "<set-?>");
        this.f25380h = translateConfig;
    }

    /* renamed from: a */
    private final String m39077a(FeedCommentDetailBean feedCommentDetailBean, Context context) {
        try {
            String a = C13723a.m55654a(context, feedCommentDetailBean.getCreateTime() * ((long) 1000));
            Intrinsics.checkExpressionValueIsNotNull(a, "DateUtils.getFormatTimeF…onList(context, createAt)");
            return a;
        } catch (Exception unused) {
            C13479a.m54775e("FeedItemComment", "the time isn't right");
            return String.valueOf(feedCommentDetailBean.getCreate_timestamp());
        }
    }

    /* renamed from: b */
    public FeedCommentViewHolder mo35942a(RecyclerView.Adapter<?> adapter, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.middle_feed_item_comment, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new FeedCommentViewHolder(inflate);
    }

    /* renamed from: a */
    private final void m39079a(TextView textView, TextView textView2, View view) {
        if (view.getVisibility() == 0) {
            if (textView2.getVisibility() == 0) {
                textView = textView2;
            }
            textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC9439c(textView, view));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView$ViewHolder, int, com.bytedance.ee.bear.middleground.feed.export.bean.h] */
    @Override // com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo35943a(RecyclerView.Adapter adapter, FeedCommentViewHolder bVar, int i, FeedCommentDetailBean feedCommentDetailBean) {
        mo35986a((RecyclerView.Adapter<?>) adapter, bVar, i, feedCommentDetailBean);
    }

    /* renamed from: a */
    public void mo35986a(RecyclerView.Adapter<?> adapter, FeedCommentViewHolder bVar, int i, FeedCommentDetailBean feedCommentDetailBean) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(feedCommentDetailBean, "item");
        RichTextInjector.m38468a(bVar.mo35989a(), this.f25379g, this.f25381i);
        RichTextInjector.m38468a(bVar.mo35990b(), (String) null, (AbstractC10460a.AbstractC10461a) null);
        bVar.mo35989a().setMovementMethod(C7727a.m30901a());
        bVar.mo35989a().setOnClickListener(new View$OnClickListenerC9440d(bVar));
        CommentBean.CommentDetail a = C9437a.m39065a(feedCommentDetailBean);
        TranslateConfig translateConfig = this.f25380h;
        Intrinsics.checkExpressionValueIsNotNull(a, "commentDetail");
        if (((ICommentTranslate) KoinJavaComponent.m268613a(ICommentTranslate.class, null, null, 6, null)).mo35259a(translateConfig, a)) {
            CommentTextView a2 = bVar.mo35989a();
            String translate_content = feedCommentDetailBean.getTranslate_content();
            Intrinsics.checkExpressionValueIsNotNull(translate_content, "item.translate_content");
            a2.setRawString(m39078a(translate_content));
        } else {
            CommentTextView a3 = bVar.mo35989a();
            String content = feedCommentDetailBean.getContent();
            if (content == null) {
                content = "";
            }
            a3.setRawString(m39078a(content));
        }
        bVar.mo35989a().post(new RunnableC9441e(this, bVar));
        int a4 = C13749l.m55736a() - C13749l.m55738a(86);
        bVar.mo35989a().setMaxWidth(a4);
        bVar.mo35990b().setMaxWidth(a4);
        boolean z = false;
        int i5 = 8;
        if (((ICommentTranslate) KoinJavaComponent.m268613a(ICommentTranslate.class, null, null, 6, null)).mo35260b(this.f25380h, a)) {
            bVar.mo35990b().setVisibility(0);
            if (((ICommentTranslate) KoinJavaComponent.m268613a(ICommentTranslate.class, null, null, 6, null)).mo35261c(this.f25380h, a)) {
                CommentTextView b = bVar.mo35990b();
                String content2 = feedCommentDetailBean.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content2, "item.content");
                b.setRawString(m39078a(content2));
            } else {
                CommentTextView b2 = bVar.mo35990b();
                String translate_content2 = feedCommentDetailBean.getTranslate_content();
                Intrinsics.checkExpressionValueIsNotNull(translate_content2, "item.translate_content");
                b2.setRawString(m39078a(translate_content2));
            }
        } else {
            bVar.mo35990b().setVisibility(8);
        }
        if (Intrinsics.areEqual(feedCommentDetailBean.getTranslate_status(), "loading")) {
            ViewGroup.LayoutParams layoutParams = bVar.mo35991c().getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.addRule(8, R.id.tv_content);
            }
            bVar.mo35991c().playAnimation();
        } else {
            bVar.mo35991c().cancelAnimation();
            bVar.mo35991c().setFrame(0);
            if (bVar.mo35990b().getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams3 = bVar.mo35991c().getLayoutParams();
                if (!(layoutParams3 instanceof RelativeLayout.LayoutParams)) {
                    layoutParams3 = null;
                }
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                if (layoutParams4 != null) {
                    layoutParams4.addRule(8, R.id.tv_content_translate);
                }
            } else {
                ViewGroup.LayoutParams layoutParams5 = bVar.mo35991c().getLayoutParams();
                if (!(layoutParams5 instanceof RelativeLayout.LayoutParams)) {
                    layoutParams5 = null;
                }
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                if (layoutParams6 != null) {
                    layoutParams6.addRule(8, R.id.tv_content);
                }
            }
        }
        BearLottieView c = bVar.mo35991c();
        if (((ICommentTranslate) KoinJavaComponent.m268613a(ICommentTranslate.class, null, null, 6, null)).mo35262d(this.f25380h, a)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        c.setVisibility(i2);
        bVar.mo35991c().setOnClickListener(new View$OnClickListenerC9442f(feedCommentDetailBean, adapter, i));
        bVar.mo35989a().setOnLongClickListener(new View$OnLongClickListenerC9443g(this, i, feedCommentDetailBean));
        bVar.itemView.setOnLongClickListener(new View$OnLongClickListenerC9444h(this, i, feedCommentDetailBean));
        View view = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(view.getContext()).mo10414a(new C13664a(feedCommentDetailBean.getAvatar_url())).mo11129a(AbstractC2354j.f7813c)).mo11123a(R.drawable.facade_common_avatar_place_holder)).mo10399a(bVar.mo35992d());
        bVar.mo35993e().setText(feedCommentDetailBean.getTitleStr());
        TextView f = bVar.mo35994f();
        Context context = bVar.mo35989a().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holder.mTvContent.context");
        f.setText(m39077a(feedCommentDetailBean, context));
        bVar.mo35992d().setOnClickListener(new View$OnClickListenerC9445i(this, feedCommentDetailBean));
        View g = bVar.mo35995g();
        if (feedCommentDetailBean.getReadStatus() == 1) {
            bVar.mo35995g().postDelayed(new RunnableC9446j(this, feedCommentDetailBean), 2000);
            i3 = 0;
        } else {
            i3 = 8;
        }
        g.setVisibility(i3);
        View h = bVar.mo35996h();
        if (!feedCommentDetailBean.isLastItem()) {
            i5 = 0;
        }
        h.setVisibility(i5);
        View view2 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        if (feedCommentDetailBean.getResolveStatus() == 0 && !C9486c.m39211a(this.f25374a)) {
            z = true;
        }
        view2.setSelected(z);
        CommentTextView b3 = bVar.mo35990b();
        View view3 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
        if (view3.isSelected()) {
            i4 = R.drawable.comment_translate_select_bg;
        } else {
            i4 = R.drawable.comment_translate_bg;
        }
        b3.setBackgroundResource(i4);
        bVar.itemView.setOnClickListener(new View$OnClickListenerC9447k(this, feedCommentDetailBean));
        m39079a(bVar.mo35989a(), bVar.mo35990b(), bVar.mo35991c());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.q<? super android.view.View, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.k<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.k<? super java.lang.String, ? super com.bytedance.ee.bear.service.c, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedItemComment(String str, TranslateConfig translateConfig, C10917c cVar, AbstractC10460a.AbstractC10461a aVar, Function5<? super View, ? super Integer, ? super String, ? super String, ? super String, Unit> qVar, Function2<? super String, ? super Boolean, Unit> kVar, Function1<? super List<String>, Unit> function1, Function2<? super String, ? super C10917c, Unit> kVar2) {
        Intrinsics.checkParameterIsNotNull(str, "userToken");
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(aVar, "fileSpanClickListener");
        Intrinsics.checkParameterIsNotNull(qVar, "longListener");
        Intrinsics.checkParameterIsNotNull(kVar, "toMessage");
        Intrinsics.checkParameterIsNotNull(function1, "readMessage");
        Intrinsics.checkParameterIsNotNull(kVar2, "gotoProfile");
        this.f25379g = str;
        this.f25380h = translateConfig;
        this.f25374a = cVar;
        this.f25381i = aVar;
        this.f25375b = qVar;
        this.f25376c = kVar;
        this.f25377d = function1;
        this.f25378e = kVar2;
    }
}
