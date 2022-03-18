package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37378c;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.ThreadFeedPreview;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.FeedItemView;
import com.ss.android.lark.feed.p1847a.C37268c;

/* renamed from: com.ss.android.lark.feed.app.binder.n */
public class C37422n implements AbstractC37406i<ThreadFeedPreview, C37968c, AbstractC37628k> {

    /* renamed from: a */
    Context f96019a = C37268c.m146766b().mo139170a();

    /* renamed from: b */
    C37394h<ThreadFeedPreview> f96020b;

    /* renamed from: c */
    private final AbstractC37378c<ThreadFeedPreview> f96021c;

    public C37422n() {
        C374231 r0 = new AbstractC37378c<ThreadFeedPreview>() {
            /* class com.ss.android.lark.feed.app.binder.C37422n.C374231 */

            /* renamed from: a */
            public boolean mo137239d(ThreadFeedPreview threadFeedPreview) {
                return false;
            }

            /* renamed from: b */
            public boolean mo137238c(ThreadFeedPreview threadFeedPreview) {
                return false;
            }

            /* renamed from: c */
            public boolean mo137237b(ThreadFeedPreview threadFeedPreview) {
                return true;
            }

            /* renamed from: d */
            public boolean mo137236a(ThreadFeedPreview threadFeedPreview) {
                return false;
            }
        };
        this.f96021c = r0;
        this.f96020b = new C37394h<ThreadFeedPreview>(r0) {
            /* class com.ss.android.lark.feed.app.binder.C37422n.C374242 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: b */
            public MiniIconModel mo137258b(FeedPreview feedPreview) {
                return new MiniIconModel(AvatarType.TOPIC);
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public void mo137246a(C37968c cVar, FeedPreview feedPreview) {
                int i;
                super.mo137246a(cVar, feedPreview);
                FeedItemView feedItemView = cVar.f97476a;
                if (LarkAvatar.m91602c()) {
                    i = 8;
                } else {
                    i = 0;
                }
                feedItemView.setThreadIconVisibility(i);
            }
        };
    }

    /* renamed from: b */
    public C37968c mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        return new C37968c((FeedItemView) bVar.mo137128a(FeedItemView.class, viewGroup.getContext()), bVar);
    }

    /* renamed from: a */
    public void mo137226a(C37968c cVar, ThreadFeedPreview threadFeedPreview, AbstractC37628k kVar, int i) {
        this.f96020b.mo137226a(cVar, threadFeedPreview, kVar, i);
    }
}
