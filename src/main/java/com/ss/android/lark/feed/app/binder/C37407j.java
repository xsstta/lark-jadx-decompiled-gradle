package com.ss.android.lark.feed.app.binder;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37378c;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.model.p1863c.C37711b;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.FeedItemView;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.feed.app.binder.j */
public class C37407j implements AbstractC37406i<LittleAppFeedPreview, C37968c, AbstractC37628k> {

    /* renamed from: a */
    public static final boolean f95974a = C37262a.m146726a().mo139198q().mo139256a("lark.feed.load_avatar.async");

    /* renamed from: b */
    C37394h<LittleAppFeedPreview> f95975b;

    /* renamed from: c */
    private AbstractC37378c<LittleAppFeedPreview> f95976c;

    public C37407j() {
        C374081 r0 = new AbstractC37378c<LittleAppFeedPreview>() {
            /* class com.ss.android.lark.feed.app.binder.C37407j.C374081 */

            /* renamed from: b */
            public boolean mo137238c(LittleAppFeedPreview littleAppFeedPreview) {
                return true;
            }

            /* renamed from: c */
            public boolean mo137237b(LittleAppFeedPreview littleAppFeedPreview) {
                return true;
            }

            /* renamed from: d */
            public boolean mo137236a(LittleAppFeedPreview littleAppFeedPreview) {
                return true;
            }

            /* renamed from: a */
            public boolean mo137239d(LittleAppFeedPreview littleAppFeedPreview) {
                return C37264a.m146753b();
            }
        };
        this.f95976c = r0;
        this.f95975b = new C37394h<LittleAppFeedPreview>(r0) {
            /* class com.ss.android.lark.feed.app.binder.C37407j.C374092 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: b */
            public MiniIconModel mo137258b(FeedPreview feedPreview) {
                return new MiniIconModel(AvatarType.MICROAPP);
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public AvatarModel mo137256a(FeedPreview feedPreview) {
                return new AvatarModel.Builder().mo88962a(feedPreview.getAvatarKey()).mo88963a(C37407j.f95974a).mo88959a(AvatarModel.Size.MIDDLE).mo88960a(Biz.Messenger).mo88961a(Scene.Feed).mo88976k();
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: d */
            public void mo137249d(C37968c cVar, FeedPreview feedPreview) {
                super.mo137249d(cVar, feedPreview);
            }
        };
    }

    /* renamed from: a */
    private void m147217a(C37968c cVar, LittleAppFeedPreview littleAppFeedPreview) {
        if (LarkAvatar.m91601b()) {
            Drawable a = C37711b.m148269a().mo138226a(littleAppFeedPreview.getFeedNameTag());
            if (a == null && !littleAppFeedPreview.getFeedNameTag().mo90005a()) {
                a = C37711b.m148268a(cVar.itemView.getContext(), littleAppFeedPreview).mo90006b();
            }
            cVar.f97476a.setFeedTagTV(true, a);
            return;
        }
        cVar.f97476a.setFeedTagTV(0, R.string.Lark_Search_AppLabel, R.drawable.blue_tag_bg, UIHelper.getColor(R.color.udtoken_tag_text_s_blue));
    }

    /* renamed from: b */
    public C37968c mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        return new C37968c((FeedItemView) bVar.mo137128a(FeedItemView.class, viewGroup.getContext()), bVar);
    }

    /* renamed from: a */
    public void mo137226a(C37968c cVar, LittleAppFeedPreview littleAppFeedPreview, AbstractC37628k kVar, int i) {
        this.f95975b.mo137226a(cVar, littleAppFeedPreview, kVar, i);
        m147217a(cVar, littleAppFeedPreview);
    }
}
