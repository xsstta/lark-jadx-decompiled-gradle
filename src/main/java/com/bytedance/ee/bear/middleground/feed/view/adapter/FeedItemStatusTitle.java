package com.bytedance.ee.bear.middleground.feed.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.widget.CommentTextView;
import com.bytedance.ee.bear.middleground.comment.widget.RichTextInjector;
import com.bytedance.ee.bear.middleground.feed.export.bean.StatusTitleBean;
import com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012f\u0010\u0006\u001ab\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0002\u0010\u0011J\b\u0010\u0016\u001a\u00020\bH\u0016J,\u0010\u0017\u001a\u00020\u00102\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u001c\u0010\u001c\u001a\u00020\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015Rn\u0010\u0006\u001ab\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemStatusTitle;", "Lcom/bytedance/ee/bear/middleground/feed/multi/IMultiAdapter;", "Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemStatusTitle$FeedStatusViewHolder;", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/StatusTitleBean;", "canReOpen", "", "reOpen", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "position", "", "messageId", "commentId", "whole", "", "(ZLkotlin/jvm/functions/Function4;)V", "getCanReOpen", "()Z", "setCanReOpen", "(Z)V", "getItemViewType", "onBindViewHolder", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Companion", "FeedStatusViewHolder", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.e */
public final class FeedItemStatusTitle implements AbstractC9431a<FeedStatusViewHolder, StatusTitleBean> {

    /* renamed from: b */
    public static final Companion f25464b = new Companion(null);

    /* renamed from: a */
    public final Function4<Integer, String, String, Boolean, Unit> f25465a;

    /* renamed from: c */
    private boolean f25466c;

    @Override // com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a
    /* renamed from: a */
    public int mo35941a() {
        return 5;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemStatusTitle$Companion;", "", "()V", "TAG", "", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/view/adapter/FeedItemStatusTitle$FeedStatusViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mTvContent", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "getMTvContent", "()Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "mTvOpen", "Landroid/widget/TextView;", "getMTvOpen", "()Landroid/widget/TextView;", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.e$b */
    public static final class FeedStatusViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final CommentTextView f25467a;

        /* renamed from: b */
        private final TextView f25468b;

        /* renamed from: a */
        public final CommentTextView mo36046a() {
            return this.f25467a;
        }

        /* renamed from: b */
        public final TextView mo36047b() {
            return this.f25468b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FeedStatusViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            View findViewById = this.itemView.findViewById(R.id.tv_content);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_content)");
            this.f25467a = (CommentTextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.tv_open);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_open)");
            this.f25468b = (TextView) findViewById2;
        }
    }

    /* renamed from: a */
    public final void mo36044a(boolean z) {
        this.f25466c = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.e.a.e$c */
    public static final class View$OnClickListenerC9459c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedItemStatusTitle f25469a;

        /* renamed from: b */
        final /* synthetic */ int f25470b;

        /* renamed from: c */
        final /* synthetic */ StatusTitleBean f25471c;

        View$OnClickListenerC9459c(FeedItemStatusTitle eVar, int i, StatusTitleBean statusTitleBean) {
            this.f25469a = eVar;
            this.f25470b = i;
            this.f25471c = statusTitleBean;
        }

        public final void onClick(View view) {
            Function4<Integer, String, String, Boolean, Unit> pVar = this.f25469a.f25465a;
            Integer valueOf = Integer.valueOf(this.f25470b);
            String commentId = this.f25471c.getCommentId();
            boolean z = true;
            if (this.f25471c.getWhole() != 1) {
                z = false;
            }
            pVar.invoke(valueOf, "", commentId, Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public FeedStatusViewHolder mo35942a(RecyclerView.Adapter<?> adapter, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.middle_feed_item_status_title, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new FeedStatusViewHolder(inflate);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, androidx.recyclerview.widget.RecyclerView$ViewHolder, int, com.bytedance.ee.bear.middleground.feed.export.bean.h] */
    @Override // com.bytedance.ee.bear.middleground.feed.p454b.AbstractC9431a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo35943a(RecyclerView.Adapter adapter, FeedStatusViewHolder bVar, int i, StatusTitleBean statusTitleBean) {
        mo36043a((RecyclerView.Adapter<?>) adapter, bVar, i, statusTitleBean);
    }

    /* renamed from: a */
    public void mo36043a(RecyclerView.Adapter<?> adapter, FeedStatusViewHolder bVar, int i, StatusTitleBean statusTitleBean) {
        int i2;
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(statusTitleBean, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        RichTextInjector.m38468a(bVar.mo36046a(), (String) null, (AbstractC10460a.AbstractC10461a) null);
        bVar.mo36046a().setRawString(statusTitleBean.getContent());
        TextView b = bVar.mo36047b();
        if (statusTitleBean.getType() != 0 || !this.f25466c) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        b.setVisibility(i2);
        bVar.mo36047b().setOnClickListener(new View$OnClickListenerC9459c(this, i, statusTitleBean));
    }
}
