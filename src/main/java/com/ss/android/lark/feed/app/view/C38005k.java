package com.ss.android.lark.feed.app.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.binder.AbstractC37406i;
import com.ss.android.lark.feed.app.binder.C37394h;
import com.ss.android.lark.feed.app.binder.SubscriptionsFeedPreview;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37378c;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.p1847a.C37264a;

/* renamed from: com.ss.android.lark.feed.app.view.k */
public class C38005k implements AbstractC37406i<SubscriptionsFeedPreview, C37968c, AbstractC37628k> {

    /* renamed from: a */
    public static final boolean f97584a = C37262a.m146726a().mo139198q().mo139256a("lark.feed.load_avatar.async");

    /* renamed from: b */
    C37394h<SubscriptionsFeedPreview> f97585b;

    /* renamed from: c */
    private final AbstractC37378c<SubscriptionsFeedPreview> f97586c;

    public C38005k() {
        C380061 r0 = new AbstractC37378c<SubscriptionsFeedPreview>() {
            /* class com.ss.android.lark.feed.app.view.C38005k.C380061 */

            /* renamed from: b */
            public boolean mo137238c(SubscriptionsFeedPreview subscriptionsFeedPreview) {
                return true;
            }

            /* renamed from: c */
            public boolean mo137237b(SubscriptionsFeedPreview subscriptionsFeedPreview) {
                return true;
            }

            /* renamed from: d */
            public boolean mo137236a(SubscriptionsFeedPreview subscriptionsFeedPreview) {
                return true;
            }

            /* renamed from: a */
            public boolean mo137239d(SubscriptionsFeedPreview subscriptionsFeedPreview) {
                return C37264a.m146753b();
            }
        };
        this.f97586c = r0;
        this.f97585b = new C37394h<SubscriptionsFeedPreview>(r0) {
            /* class com.ss.android.lark.feed.app.view.C38005k.C380072 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public AvatarModel mo137256a(FeedPreview feedPreview) {
                return new AvatarModel.Builder().mo88962a(feedPreview.getAvatarKey()).mo88963a(C38005k.f97584a).mo88959a(AvatarModel.Size.MIDDLE).mo88976k();
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: d */
            public void mo137249d(C37968c cVar, FeedPreview feedPreview) {
                super.mo137249d(cVar, feedPreview);
            }
        };
    }

    /* renamed from: b */
    public C37968c mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        return new C37968c((FeedItemView) bVar.mo137128a(FeedItemView.class, viewGroup.getContext()), bVar);
    }

    /* renamed from: a */
    public void mo137226a(C37968c cVar, SubscriptionsFeedPreview subscriptionsFeedPreview, AbstractC37628k kVar, int i) {
        this.f97585b.mo137226a(cVar, subscriptionsFeedPreview, kVar, i);
    }
}
