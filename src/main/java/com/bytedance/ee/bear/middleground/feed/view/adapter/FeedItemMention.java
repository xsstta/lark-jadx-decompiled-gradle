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
import com.bytedance.ee.bear.middleground.feed.export.bean.AtBean;
import com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a;
import com.bytedance.ee.bear.middleground.feed.p457e.C9486c;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p717s.C13723a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\"#B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u0012)\u0010\r\u001a%\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u00128\u0010\u000f\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J,\u0010\u0019\u001a\u00020\f2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u001c\u0010\u001f\u001a\u00020\u00022\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010 \u001a\u00020!H\u0016R@\u0010\u000f\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\f0\u0010X\u0004¢\u0006\u0002\n\u0000R1\u0010\r\u001a%\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemMention;", "Lcom/bytedance/ee/bear/middleground/feed/multi/IMultiAdapter;", "Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemMention$FeedMentionViewHolder;", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/AtBean;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "toMessage", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "messageId", "", "readMessage", "", "gotoProfile", "Lkotlin/Function2;", "userId", "(Lcom/bytedance/ee/bear/service/ServiceContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getItemViewType", "", "getTime", "item", "context", "Landroid/content/Context;", "onBindViewHolder", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "holder", "position", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Companion", "FeedMentionViewHolder", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.d */
public final class FeedItemMention implements AbstractC9431a<FeedMentionViewHolder, AtBean> {

    /* renamed from: e */
    public static final Companion f25446e = new Companion(null);

    /* renamed from: a */
    public final C10917c f25447a;

    /* renamed from: b */
    public final Function1<String, Unit> f25448b;

    /* renamed from: c */
    public final Function1<List<String>, Unit> f25449c;

    /* renamed from: d */
    public final Function2<String, C10917c, Unit> f25450d;

    @Override // com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a
    /* renamed from: a */
    public int mo35941a() {
        return 3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemMention$Companion;", "", "()V", "TAG", "", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemMention$FeedMentionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mDivider", "getMDivider", "()Landroid/view/View;", "mTvContent", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "getMTvContent", "()Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "mTvTime", "Landroid/widget/TextView;", "getMTvTime", "()Landroid/widget/TextView;", "mUnReadIco", "getMUnReadIco", "mUserImg", "Landroid/widget/ImageView;", "getMUserImg", "()Landroid/widget/ImageView;", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.d$b */
    public static final class FeedMentionViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final CommentTextView f25451a;

        /* renamed from: b */
        private final ImageView f25452b;

        /* renamed from: c */
        private final View f25453c;

        /* renamed from: d */
        private final View f25454d;

        /* renamed from: e */
        private final TextView f25455e;

        /* renamed from: a */
        public final CommentTextView mo36034a() {
            return this.f25451a;
        }

        /* renamed from: b */
        public final ImageView mo36035b() {
            return this.f25452b;
        }

        /* renamed from: c */
        public final View mo36036c() {
            return this.f25453c;
        }

        /* renamed from: d */
        public final View mo36037d() {
            return this.f25454d;
        }

        /* renamed from: e */
        public final TextView mo36038e() {
            return this.f25455e;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FeedMentionViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            View findViewById = this.itemView.findViewById(R.id.tv_content);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_content)");
            this.f25451a = (CommentTextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.user_msg_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.user_msg_image)");
            this.f25452b = (ImageView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.unread_ico);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.unread_ico)");
            this.f25453c = findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.v_divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.v_divider)");
            this.f25454d = findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.tv_create_at);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.tv_create_at)");
            this.f25455e = (TextView) findViewById5;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.d$d */
    public static final class RunnableC9456d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedItemMention f25458a;

        /* renamed from: b */
        final /* synthetic */ AtBean f25459b;

        RunnableC9456d(FeedItemMention dVar, AtBean atBean) {
            this.f25458a = dVar;
            this.f25459b = atBean;
        }

        public final void run() {
            C13479a.m54764b("FeedItemMention", "read message: Comment");
            this.f25458a.f25449c.invoke(CollectionsKt.mutableListOf(this.f25459b.getMessageId()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.d$e */
    public static final class View$OnClickListenerC9457e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedMentionViewHolder f25460a;

        View$OnClickListenerC9457e(FeedMentionViewHolder bVar) {
            this.f25460a = bVar;
        }

        public final void onClick(View view) {
            this.f25460a.itemView.performClick();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.d$c */
    public static final class View$OnClickListenerC9455c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedItemMention f25456a;

        /* renamed from: b */
        final /* synthetic */ AtBean f25457b;

        View$OnClickListenerC9455c(FeedItemMention dVar, AtBean atBean) {
            this.f25456a = dVar;
            this.f25457b = atBean;
        }

        public final void onClick(View view) {
            C13479a.m54772d("FeedItemMention", "onClick()... uid = " + this.f25457b.getUserId());
            this.f25456a.f25450d.invoke(this.f25457b.getUserId(), this.f25456a.f25447a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.d$f */
    public static final class View$OnClickListenerC9458f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedItemMention f25461a;

        /* renamed from: b */
        final /* synthetic */ FeedMentionViewHolder f25462b;

        /* renamed from: c */
        final /* synthetic */ AtBean f25463c;

        View$OnClickListenerC9458f(FeedItemMention dVar, FeedMentionViewHolder bVar, AtBean atBean) {
            this.f25461a = dVar;
            this.f25462b = bVar;
            this.f25463c = atBean;
        }

        public final void onClick(View view) {
            this.f25462b.mo36036c().setVisibility(8);
            this.f25463c.setReadStatus(2);
            this.f25463c.setResolveStatus(1);
            View view2 = this.f25462b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            view2.setSelected(false);
            this.f25461a.f25448b.invoke(this.f25463c.getMessageId());
        }
    }

    /* renamed from: a */
    private final String m39123a(AtBean atBean, Context context) {
        try {
            String a = C13723a.m55654a(context, atBean.getCreateTime() * ((long) 1000));
            Intrinsics.checkExpressionValueIsNotNull(a, "DateUtils.getFormatTimeF…onList(context, createAt)");
            return a;
        } catch (Exception unused) {
            C13479a.m54775e("FeedItemMention", "the time isn't right");
            return String.valueOf(atBean.getCreateTime());
        }
    }

    /* renamed from: b */
    public FeedMentionViewHolder mo35942a(RecyclerView.Adapter<?> adapter, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.middle_feed_item_mention, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new FeedMentionViewHolder(inflate);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView$ViewHolder, int, com.bytedance.ee.bear.middleground.feed.export.bean.h] */
    @Override // com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo35943a(RecyclerView.Adapter adapter, FeedMentionViewHolder bVar, int i, AtBean atBean) {
        mo36032a((RecyclerView.Adapter<?>) adapter, bVar, i, atBean);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.k<? super java.lang.String, ? super com.bytedance.ee.bear.service.c, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedItemMention(C10917c cVar, Function1<? super String, Unit> function1, Function1<? super List<String>, Unit> function12, Function2<? super String, ? super C10917c, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(function1, "toMessage");
        Intrinsics.checkParameterIsNotNull(function12, "readMessage");
        Intrinsics.checkParameterIsNotNull(kVar, "gotoProfile");
        this.f25447a = cVar;
        this.f25448b = function1;
        this.f25449c = function12;
        this.f25450d = kVar;
    }

    /* renamed from: a */
    public void mo36032a(RecyclerView.Adapter<?> adapter, FeedMentionViewHolder bVar, int i, AtBean atBean) {
        int i2;
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(atBean, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        RichTextInjector.m38468a(bVar.mo36034a(), (String) null, (AbstractC10460a.AbstractC10461a) null);
        bVar.mo36034a().setRawString(atBean.getContent());
        View view = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(view.getContext()).mo10414a(new C13664a(atBean.getAvatarUrl())).mo11129a(AbstractC2354j.f7813c)).mo11123a(R.drawable.facade_common_avatar_place_holder)).mo10399a(bVar.mo36035b());
        bVar.mo36035b().setOnClickListener(new View$OnClickListenerC9455c(this, atBean));
        TextView e = bVar.mo36038e();
        Context context = bVar.mo36034a().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holder.mTvContent.context");
        e.setText(m39123a(atBean, context));
        View c = bVar.mo36036c();
        int i3 = 8;
        boolean z = true;
        if (atBean.getReadStatus() == 1) {
            bVar.mo36036c().postDelayed(new RunnableC9456d(this, atBean), 2000);
            i2 = 0;
        } else {
            i2 = 8;
        }
        c.setVisibility(i2);
        bVar.mo36034a().setOnClickListener(new View$OnClickListenerC9457e(bVar));
        View d = bVar.mo36037d();
        if (!atBean.isLastItem()) {
            i3 = 0;
        }
        d.setVisibility(i3);
        View view2 = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        if (atBean.getResolveStatus() != 0 || C9486c.m39211a(this.f25447a)) {
            z = false;
        }
        view2.setSelected(z);
        bVar.itemView.setOnClickListener(new View$OnClickListenerC9458f(this, bVar, atBean));
    }
}
