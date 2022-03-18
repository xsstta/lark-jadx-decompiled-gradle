package com.bytedance.ee.bear.middleground.feed.export.bean;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.service.C10917c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0010J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0016J\u000e\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u001cJ\u000e\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/export/bean/FeedBuilder;", "", "()V", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "getMActivity", "()Landroidx/fragment/app/FragmentActivity;", "setMActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "mFeedData", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/IFeedData;", "getMFeedData", "()Lcom/bytedance/ee/bear/middleground/feed/export/bean/IFeedData;", "setMFeedData", "(Lcom/bytedance/ee/bear/middleground/feed/export/bean/IFeedData;)V", "mFeedListener", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/IFeedListener;", "getMFeedListener", "()Lcom/bytedance/ee/bear/middleground/feed/export/bean/IFeedListener;", "setMFeedListener", "(Lcom/bytedance/ee/bear/middleground/feed/export/bean/IFeedListener;)V", "mMessageConfig", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageConfig;", "getMMessageConfig", "()Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageConfig;", "setMMessageConfig", "(Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageConfig;)V", "mParentView", "Landroid/view/ViewGroup;", "getMParentView", "()Landroid/view/ViewGroup;", "setMParentView", "(Landroid/view/ViewGroup;)V", "mServiceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getMServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "setMServiceContext", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", "setActivity", "activity", "setFeedData", "feedData", "setFeedListener", "feedListener", "setMessageConfig", "messageConfig", "setParentView", "parentView", "setServiceContext", "serviceContext", "middleground-feed-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.export.bean.a */
public final class FeedBuilder {

    /* renamed from: a */
    public FragmentActivity f25512a;

    /* renamed from: b */
    public ViewGroup f25513b;

    /* renamed from: c */
    public AbstractC9492e f25514c;

    /* renamed from: d */
    public AbstractC9494g f25515d;

    /* renamed from: e */
    public C10917c f25516e;

    /* renamed from: f */
    public MessageConfig f25517f;

    /* renamed from: a */
    public final FeedBuilder mo36338a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
        this.f25513b = viewGroup;
        return this;
    }

    /* renamed from: a */
    public final FeedBuilder mo36339a(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f25512a = fragmentActivity;
        return this;
    }

    /* renamed from: a */
    public final FeedBuilder mo36340a(MessageConfig messageConfig) {
        Intrinsics.checkParameterIsNotNull(messageConfig, "messageConfig");
        this.f25517f = messageConfig;
        return this;
    }

    /* renamed from: a */
    public final FeedBuilder mo36341a(AbstractC9492e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "feedData");
        this.f25514c = eVar;
        return this;
    }

    /* renamed from: a */
    public final FeedBuilder mo36342a(AbstractC9494g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "feedListener");
        this.f25515d = gVar;
        return this;
    }

    /* renamed from: a */
    public final FeedBuilder mo36343a(C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f25516e = cVar;
        return this;
    }
}
