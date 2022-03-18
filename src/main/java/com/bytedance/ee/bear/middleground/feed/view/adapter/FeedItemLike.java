package com.bytedance.ee.bear.middleground.feed.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.middleground.comment.widget.CommentTextView;
import com.bytedance.ee.bear.middleground.comment.widget.RichTextInjector;
import com.bytedance.ee.bear.middleground.feed.export.bean.LikeBean;
import com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a;
import com.bytedance.ee.bear.middleground.feed.p457e.C9486c;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p717s.C13723a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002#$B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u0012)\u0010\r\u001a%\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J,\u0010\u0016\u001a\u00020\f2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u001c\u0010\u001c\u001a\u00020\u00022\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\bH\u0002R1\u0010\r\u001a%\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemLike;", "Lcom/bytedance/ee/bear/middleground/feed/multi/IMultiAdapter;", "Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemLike$FeedLikeViewHolder;", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/LikeBean;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "toMessage", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "messageId", "", "readMessage", "", "(Lcom/bytedance/ee/bear/service/ServiceContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "", "getTime", "item", "context", "Landroid/content/Context;", "onBindViewHolder", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "holder", "position", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setLikeUser", "view", "Landroid/widget/ImageView;", "s", "Companion", "FeedLikeViewHolder", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.c */
public final class FeedItemLike implements AbstractC9431a<FeedLikeViewHolder, LikeBean> {

    /* renamed from: c */
    public static final Companion f25427c = new Companion(null);

    /* renamed from: a */
    public final Function1<String, Unit> f25428a;

    /* renamed from: b */
    public final Function1<List<String>, Unit> f25429b;

    /* renamed from: d */
    private final C10917c f25430d;

    @Override // com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a
    /* renamed from: a */
    public int mo35941a() {
        return 7;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemLike$Companion;", "", "()V", "TAG", "", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemLike$FeedLikeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mDivider", "getMDivider", "()Landroid/view/View;", "mTvContent", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "getMTvContent", "()Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "mTvTime", "Landroid/widget/TextView;", "getMTvTime", "()Landroid/widget/TextView;", "mUnReadIco", "getMUnReadIco", "mUserImg", "Landroid/widget/ImageView;", "getMUserImg", "()Landroid/widget/ImageView;", "mUserImg1", "getMUserImg1", "mUserImg2", "getMUserImg2", "mUserImg3", "getMUserImg3", "mUserImg4", "getMUserImg4", "mUserImgMore", "getMUserImgMore", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.c$b */
    public static final class FeedLikeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final CommentTextView f25431a;

        /* renamed from: b */
        private final ImageView f25432b;

        /* renamed from: c */
        private final ImageView f25433c;

        /* renamed from: d */
        private final ImageView f25434d;

        /* renamed from: e */
        private final ImageView f25435e;

        /* renamed from: f */
        private final ImageView f25436f;

        /* renamed from: g */
        private final ImageView f25437g;

        /* renamed from: h */
        private final View f25438h;

        /* renamed from: i */
        private final View f25439i;

        /* renamed from: j */
        private final TextView f25440j;

        /* renamed from: a */
        public final CommentTextView mo36019a() {
            return this.f25431a;
        }

        /* renamed from: b */
        public final ImageView mo36020b() {
            return this.f25432b;
        }

        /* renamed from: c */
        public final ImageView mo36021c() {
            return this.f25433c;
        }

        /* renamed from: d */
        public final ImageView mo36022d() {
            return this.f25434d;
        }

        /* renamed from: e */
        public final ImageView mo36023e() {
            return this.f25435e;
        }

        /* renamed from: f */
        public final ImageView mo36024f() {
            return this.f25436f;
        }

        /* renamed from: g */
        public final ImageView mo36025g() {
            return this.f25437g;
        }

        /* renamed from: h */
        public final View mo36026h() {
            return this.f25438h;
        }

        /* renamed from: i */
        public final View mo36027i() {
            return this.f25439i;
        }

        /* renamed from: j */
        public final TextView mo36028j() {
            return this.f25440j;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FeedLikeViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            View findViewById = this.itemView.findViewById(R.id.tv_content);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_content)");
            this.f25431a = (CommentTextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.user_msg_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.user_msg_image)");
            this.f25432b = (ImageView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.user_msg_image_1);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.user_msg_image_1)");
            this.f25433c = (ImageView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.user_msg_image_2);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.user_msg_image_2)");
            this.f25434d = (ImageView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.user_msg_image_3);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.user_msg_image_3)");
            this.f25435e = (ImageView) findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.user_msg_image_4);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.user_msg_image_4)");
            this.f25436f = (ImageView) findViewById6;
            View findViewById7 = this.itemView.findViewById(R.id.user_msg_image_more);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.user_msg_image_more)");
            this.f25437g = (ImageView) findViewById7;
            View findViewById8 = this.itemView.findViewById(R.id.unread_ico);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "itemView.findViewById(R.id.unread_ico)");
            this.f25438h = findViewById8;
            View findViewById9 = this.itemView.findViewById(R.id.v_divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "itemView.findViewById(R.id.v_divider)");
            this.f25439i = findViewById9;
            View findViewById10 = this.itemView.findViewById(R.id.tv_create_at);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "itemView.findViewById(R.id.tv_create_at)");
            this.f25440j = (TextView) findViewById10;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.c$c */
    public static final class RunnableC9452c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedItemLike f25441a;

        /* renamed from: b */
        final /* synthetic */ LikeBean f25442b;

        RunnableC9452c(FeedItemLike cVar, LikeBean likeBean) {
            this.f25441a = cVar;
            this.f25442b = likeBean;
        }

        public final void run() {
            C13479a.m54764b("FeedItemLike", "read message: Comment");
            this.f25441a.f25429b.invoke(CollectionsKt.mutableListOf(this.f25442b.getMessageId()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.c$d */
    public static final class View$OnClickListenerC9453d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedLikeViewHolder f25443a;

        View$OnClickListenerC9453d(FeedLikeViewHolder bVar) {
            this.f25443a = bVar;
        }

        public final void onClick(View view) {
            this.f25443a.itemView.performClick();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.c$e */
    public static final class View$OnClickListenerC9454e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedItemLike f25444a;

        /* renamed from: b */
        final /* synthetic */ LikeBean f25445b;

        View$OnClickListenerC9454e(FeedItemLike cVar, LikeBean likeBean) {
            this.f25444a = cVar;
            this.f25445b = likeBean;
        }

        public final void onClick(View view) {
            this.f25444a.f25428a.invoke(this.f25445b.getMessageId());
        }
    }

    /* renamed from: a */
    private final String m39106a(LikeBean likeBean, Context context) {
        try {
            String a = C13723a.m55654a(context, likeBean.getCreateTime() * ((long) 1000));
            Intrinsics.checkExpressionValueIsNotNull(a, "DateUtils.getFormatTimeF…onList(context, createAt)");
            return a;
        } catch (Exception unused) {
            C13479a.m54775e("FeedItemLike", "the time isn't right");
            return String.valueOf(likeBean.getCreateTime());
        }
    }

    /* renamed from: b */
    public FeedLikeViewHolder mo35942a(RecyclerView.Adapter<?> adapter, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.middle_feed_item_like, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new FeedLikeViewHolder(inflate);
    }

    /* renamed from: a */
    private final void m39107a(ImageView imageView, String str) {
        imageView.setVisibility(0);
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(imageView.getContext()).mo10414a(new C13664a(str)).mo11129a(AbstractC2354j.f7813c)).mo11123a(R.drawable.facade_common_avatar_place_holder)).mo10399a(imageView);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedItemLike(C10917c cVar, Function1<? super String, Unit> function1, Function1<? super List<String>, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(function1, "toMessage");
        Intrinsics.checkParameterIsNotNull(function12, "readMessage");
        this.f25430d = cVar;
        this.f25428a = function1;
        this.f25429b = function12;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView$ViewHolder, int, com.bytedance.ee.bear.middleground.feed.export.bean.h] */
    @Override // com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo35943a(RecyclerView.Adapter adapter, FeedLikeViewHolder bVar, int i, LikeBean likeBean) {
        mo36017a((RecyclerView.Adapter<?>) adapter, bVar, i, likeBean);
    }

    /* renamed from: a */
    public void mo36017a(RecyclerView.Adapter<?> adapter, FeedLikeViewHolder bVar, int i, LikeBean likeBean) {
        int i2;
        Sequence asSequence;
        Sequence b;
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(likeBean, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        RichTextInjector.m38468a(bVar.mo36019a(), (String) null, (AbstractC10460a.AbstractC10461a) null);
        View view = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(view.getContext()).mo10414a(new C13664a(likeBean.getAvatarUrl())).mo11129a(AbstractC2354j.f7813c)).mo11123a(R.drawable.facade_common_avatar_place_holder)).mo10399a(bVar.mo36020b());
        View h = bVar.mo36026h();
        boolean z = true;
        int i3 = 8;
        if (likeBean.getReadStatus() == 1) {
            bVar.mo36026h().postDelayed(new RunnableC9452c(this, likeBean), 2000);
            i2 = 0;
        } else {
            i2 = 8;
        }
        h.setVisibility(i2);
        bVar.mo36019a().setRawString(likeBean.getTitleStr());
        bVar.mo36019a().setOnClickListener(new View$OnClickListenerC9453d(bVar));
        bVar.mo36021c().setVisibility(8);
        bVar.mo36022d().setVisibility(8);
        bVar.mo36023e().setVisibility(8);
        bVar.mo36024f().setVisibility(8);
        bVar.mo36025g().setVisibility(8);
        List<String> userList = likeBean.getUserList();
        if (!(userList == null || (asSequence = CollectionsKt.asSequence(userList)) == null || (b = C69294l.m266133b(asSequence, 4)) == null)) {
            Iterator a = b.mo4717a();
            int i4 = 0;
            while (a.hasNext()) {
                Object next = a.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) next;
                if (i4 == 0) {
                    m39107a(bVar.mo36021c(), str);
                } else if (i4 == 1) {
                    m39107a(bVar.mo36022d(), str);
                } else if (i4 == 2) {
                    m39107a(bVar.mo36023e(), str);
                } else if (i4 == 3) {
                    m39107a(bVar.mo36024f(), str);
                }
                i4 = i5;
            }
        }
        if (likeBean.getLikeCount() > 4) {
            bVar.mo36025g().setVisibility(0);
        }
        TextView j = bVar.mo36028j();
        Context context = bVar.mo36019a().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holder.mTvContent.context");
        j.setText(m39106a(likeBean, context));
        View i6 = bVar.mo36027i();
        if (!likeBean.isLastItem()) {
            i3 = 0;
        }
        i6.setVisibility(i3);
        View view2 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        if (likeBean.getResolveStatus() != 0 || C9486c.m39211a(this.f25430d)) {
            z = false;
        }
        view2.setSelected(z);
        bVar.itemView.setOnClickListener(new View$OnClickListenerC9454e(this, likeBean));
    }
}
