package com.ss.android.lark.feed.app.delayed;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.binder.C37382c;
import com.ss.android.lark.feed.app.binder.C37388e;
import com.ss.android.lark.feed.app.binder.C37422n;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.ThreadFeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.view.C37968c;
import com.ss.android.lark.feed.app.view.C37985g;

/* renamed from: com.ss.android.lark.feed.app.delayed.a */
public class C37487a extends C37985g {
    public C37487a() {
        this.f97288d.mo137275b(ChatFeedPreview.class);
        this.f97288d.mo137275b(DocFeedPreview.class);
        this.f97288d.mo137275b(ThreadFeedPreview.class);
        this.f97288d.mo137274a(ChatFeedPreview.class, new C37382c() {
            /* class com.ss.android.lark.feed.app.delayed.C37487a.C374881 */

            @Override // com.ss.android.lark.feed.app.binder.C37382c
            /* renamed from: a */
            public void mo137226a(C37968c cVar, ChatFeedPreview chatFeedPreview, AbstractC37628k kVar, int i) {
                chatFeedPreview.setDisplayedInDelayedFeed(true);
                super.mo137226a(cVar, chatFeedPreview, kVar, i);
                cVar.mo139031d(8);
            }
        });
        this.f97288d.mo137274a(DocFeedPreview.class, new C37388e() {
            /* class com.ss.android.lark.feed.app.delayed.C37487a.C374892 */

            @Override // com.ss.android.lark.feed.app.binder.C37388e
            /* renamed from: a */
            public void mo137226a(C37968c cVar, DocFeedPreview docFeedPreview, AbstractC37628k kVar, int i) {
                docFeedPreview.setDisplayedInDelayedFeed(true);
                super.mo137226a(cVar, docFeedPreview, kVar, i);
                cVar.mo139031d(8);
            }
        });
        this.f97288d.mo137274a(ThreadFeedPreview.class, new C37422n() {
            /* class com.ss.android.lark.feed.app.delayed.C37487a.C374903 */

            @Override // com.ss.android.lark.feed.app.binder.C37422n
            /* renamed from: a */
            public void mo137226a(C37968c cVar, ThreadFeedPreview threadFeedPreview, AbstractC37628k kVar, int i) {
                threadFeedPreview.setDisplayedInDelayedFeed(true);
                super.mo137226a(cVar, threadFeedPreview, kVar, i);
                cVar.mo139031d(8);
            }
        });
    }

    /* renamed from: a */
    private boolean m147483a(UIFeedCard uIFeedCard) {
        if (uIFeedCard.getParentCardId().equals("0") || TextUtils.isEmpty(uIFeedCard.getParentCardId())) {
            return false;
        }
        return true;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g, com.ss.android.lark.feed.app.view.C37985g
    /* renamed from: a */
    public int mo80756a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        int a = super.mo80756a(viewHolder, i, i2, i3);
        if (a != 8194 || getItem(i).isSwipedLeftPinned() || !m147483a(getItem(i))) {
            return a;
        }
        return 2;
    }
}
