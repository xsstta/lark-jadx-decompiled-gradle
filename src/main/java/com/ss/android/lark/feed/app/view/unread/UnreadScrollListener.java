package com.ss.android.lark.feed.app.view.unread;

import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.view.p1870a.C37963a;
import com.ss.android.lark.feed.app.view.title.ITitleScrollHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/feed/app/view/unread/UnreadScrollListener;", "Lcom/ss/android/lark/feed/app/view/unread/UnreadScrollHelper$OnUnreadScrollListener;", "titleBarCurHeight", "", "titleBarOriHeight", "titleScrollHelper", "Lcom/ss/android/lark/feed/app/view/title/ITitleScrollHelper;", "(IILcom/ss/android/lark/feed/app/view/title/ITitleScrollHelper;)V", "getOriginOffset", "getScrollOffset", "position", "gotoStartPosition", "", "resetTitleBarStatus", "unInit", "visitOtherFilterList", "target", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.view.a.b */
public final class UnreadScrollListener implements C37963a.AbstractC37964a {

    /* renamed from: a */
    private final int f97442a;

    /* renamed from: b */
    private final int f97443b;

    /* renamed from: c */
    private final ITitleScrollHelper f97444c;

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: a */
    public void mo138872a() {
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: a */
    public void mo138873a(FeedFilter feedFilter) {
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: d */
    public void mo138876d() {
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: c */
    public int mo138875c() {
        return this.f97442a;
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: b */
    public void mo138874b() {
        ITitleScrollHelper cVar = this.f97444c;
        if (cVar != null) {
            cVar.mo139137c();
        }
    }

    @Override // com.ss.android.lark.feed.app.view.p1870a.C37963a.AbstractC37964a
    /* renamed from: a */
    public int mo138871a(int i) {
        if (i == 0) {
            return 0;
        }
        return this.f97443b;
    }

    public UnreadScrollListener(int i, int i2, ITitleScrollHelper cVar) {
        this.f97442a = i;
        this.f97443b = i2;
        this.f97444c = cVar;
    }
}
