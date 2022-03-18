package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37378c;
import com.ss.android.lark.feed.app.entity.BoxFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.FeedItemView;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.feed.app.binder.b */
public class C37379b implements AbstractC37406i<BoxFeedPreview, C37968c, AbstractC37628k> {

    /* renamed from: a */
    public static final int f95909a = UIHelper.getColor(R.color.lkui_B700);

    /* renamed from: b */
    public static final int f95910b = UIHelper.getColor(R.color.lkui_N500);

    /* renamed from: c */
    Context f95911c = C37268c.m146766b().mo139170a();

    /* renamed from: d */
    C37394h<BoxFeedPreview> f95912d;

    /* renamed from: e */
    private AbstractC37378c<BoxFeedPreview> f95913e;

    public C37379b() {
        C373801 r0 = new AbstractC37378c<BoxFeedPreview>() {
            /* class com.ss.android.lark.feed.app.binder.C37379b.C373801 */

            /* renamed from: a */
            public boolean mo137239d(BoxFeedPreview boxFeedPreview) {
                return false;
            }

            /* renamed from: b */
            public boolean mo137238c(BoxFeedPreview boxFeedPreview) {
                return false;
            }

            /* renamed from: c */
            public boolean mo137237b(BoxFeedPreview boxFeedPreview) {
                return false;
            }

            /* renamed from: d */
            public boolean mo137236a(BoxFeedPreview boxFeedPreview) {
                return false;
            }
        };
        this.f95913e = r0;
        this.f95912d = new C37394h<BoxFeedPreview>(r0) {
            /* class com.ss.android.lark.feed.app.binder.C37379b.C373812 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: c */
            public void mo137248c(C37968c cVar, FeedPreview feedPreview) {
                int i = C37379b.f95910b;
                if (feedPreview instanceof BoxFeedPreview) {
                    cVar.f97476a.setLastMessageTv(0, i, ((BoxFeedPreview) feedPreview).getLocalizedDigestMessage(), feedPreview.isTranslateEmojiCode(), false);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: a */
            public void mo137246a(C37968c cVar, FeedPreview feedPreview) {
                cVar.f97478c.setImageResource(R.drawable.feed_box_icon);
                cVar.f97476a.setChatName(0, this.f95942d.getString(R.string.Lark_Legacy_ChatBox));
                if (cVar.f97481f != null) {
                    cVar.f97481f.setEnabled(false);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: b */
            public void mo137247b(C37968c cVar, FeedPreview feedPreview) {
                if (feedPreview instanceof BoxFeedPreview) {
                    BoxFeedPreview boxFeedPreview = (BoxFeedPreview) feedPreview;
                    if (boxFeedPreview.hasSpecificMsgType(2) || boxFeedPreview.hasSpecificMsgType(16)) {
                        cVar.f97476a.setMarkTv(0, C37379b.f95909a, boxFeedPreview.getMarkText());
                    } else {
                        cVar.f97476a.setMarkTv(8, 0, "");
                    }
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.feed.app.binder.C37394h
            /* renamed from: d */
            public void mo137249d(C37968c cVar, FeedPreview feedPreview) {
                int i;
                if (feedPreview.getUnreadCount() == 0) {
                    cVar.f97476a.setBadge(8, "", 0, 0);
                    return;
                }
                if (f95937c.mo139301d()) {
                    if (!DesktopUtil.m144301a(C37262a.m146726a().mo139170a())) {
                        i = R.drawable.badge_gray_bg_no_count_stroke;
                    } else {
                        i = R.drawable.badge_gray_bg_no_count_stroke_desktop;
                    }
                } else if (!DesktopUtil.m144301a(C37262a.m146726a().mo139170a())) {
                    i = R.drawable.badge_orange_bg_no_count_stroke;
                } else {
                    i = R.drawable.badge_orange_bg_no_count_stroke_desktop;
                }
                cVar.f97476a.setBadge(0, "", 0, i);
            }
        };
    }

    /* renamed from: b */
    public C37968c mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        return new C37968c((FeedItemView) bVar.mo137128a(FeedItemView.class, viewGroup.getContext()), bVar);
    }

    /* renamed from: a */
    public void mo137226a(C37968c cVar, BoxFeedPreview boxFeedPreview, AbstractC37628k kVar, int i) {
        this.f95912d.mo137226a(cVar, boxFeedPreview, kVar, i);
    }
}
