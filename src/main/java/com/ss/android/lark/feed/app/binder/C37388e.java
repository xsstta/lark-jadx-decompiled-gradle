package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.DocAvatar;
import com.larksuite.component.ui.badge.miniicon.DocMiniIcon;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37378c;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.model.p1863c.C37711b;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.FeedItemView;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.feed.p1847a.C37268c;

/* renamed from: com.ss.android.lark.feed.app.binder.e */
public class C37388e implements AbstractC37406i<DocFeedPreview, C37968c, AbstractC37628k> {

    /* renamed from: a */
    Context f95928a = C37268c.m146766b().mo139170a();

    /* renamed from: b */
    C37394h<DocFeedPreview> f95929b;

    /* renamed from: c */
    private AbstractC37378c<DocFeedPreview> f95930c;

    public C37388e() {
        C373891 r0 = new AbstractC37378c<DocFeedPreview>() {
            /* class com.ss.android.lark.feed.app.binder.C37388e.C373891 */

            /* renamed from: b */
            public boolean mo137238c(DocFeedPreview docFeedPreview) {
                return true;
            }

            /* renamed from: c */
            public boolean mo137237b(DocFeedPreview docFeedPreview) {
                return true;
            }

            /* renamed from: d */
            public boolean mo137236a(DocFeedPreview docFeedPreview) {
                return false;
            }

            /* renamed from: a */
            public boolean mo137239d(DocFeedPreview docFeedPreview) {
                return C37264a.m146753b();
            }
        };
        this.f95930c = r0;
        this.f95929b = new C37394h<DocFeedPreview>(r0) {
            /* class com.ss.android.lark.feed.app.binder.C37388e.C373902 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: b */
            public MiniIconModel mo137258b(FeedPreview feedPreview) {
                return new DocMiniIcon(((DocFeedPreview) feedPreview).getDocType().getNumber());
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public AvatarModel mo137256a(FeedPreview feedPreview) {
                DocFeedPreview docFeedPreview = (DocFeedPreview) feedPreview;
                return ((DocAvatar.Builder) ((DocAvatar.Builder) ((DocAvatar.Builder) ((DocAvatar.Builder) new DocAvatar.Builder().mo88962a(docFeedPreview.getAvatarKey())).mo88967b("")).mo89097c(docFeedPreview.getDocType().getNumber()).mo89098c(docFeedPreview.getName()).mo88960a(Biz.Messenger)).mo88961a(Scene.Feed)).mo88976k();
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public void mo137246a(C37968c cVar, FeedPreview feedPreview) {
                super.mo137246a(cVar, feedPreview);
                DocFeedPreview docFeedPreview = (DocFeedPreview) feedPreview;
                mo137259b(cVar);
                Drawable a = C37711b.m148269a().mo138226a(docFeedPreview.getFeedNameTag());
                if (a == null && !feedPreview.getFeedNameTag().mo90005a()) {
                    a = C37711b.m148267a(this.f95942d, docFeedPreview).mo90006b();
                }
                cVar.f97476a.setFeedTagTV(true, a);
                mo137280f(cVar, feedPreview);
            }
        };
    }

    /* renamed from: b */
    public C37968c mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        return new C37968c((FeedItemView) bVar.mo137128a(FeedItemView.class, viewGroup.getContext()), bVar);
    }

    /* renamed from: a */
    public void mo137226a(C37968c cVar, DocFeedPreview docFeedPreview, AbstractC37628k kVar, int i) {
        this.f95929b.mo137226a(cVar, docFeedPreview, kVar, i);
    }
}
