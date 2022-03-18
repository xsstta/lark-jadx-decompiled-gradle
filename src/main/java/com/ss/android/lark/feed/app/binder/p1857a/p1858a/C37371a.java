package com.ss.android.lark.feed.app.binder.p1857a.p1858a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37370a;
import com.ss.android.lark.feed.app.binder.p1857a.AbstractC37378c;
import com.ss.android.lark.feed.app.entity.FeedPreview;

/* renamed from: com.ss.android.lark.feed.app.binder.a.a.a */
public class C37371a<T extends FeedPreview> extends AbstractC37370a<T> {

    /* renamed from: c */
    AbstractC37378c<T> f95899c;

    @Override // com.ss.android.lark.feed.app.binder.p1857a.AbstractC37370a
    /* renamed from: b */
    public int mo137228b() {
        return 1;
    }

    @Override // com.ss.android.lark.feed.app.binder.p1857a.AbstractC37370a
    /* renamed from: e */
    public boolean mo137231e() {
        return this.f95897a.isDelayed();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.feed.app.binder.a.c<T extends com.ss.android.lark.feed.app.entity.FeedPreview> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.feed.app.binder.p1857a.AbstractC37370a
    /* renamed from: a */
    public boolean mo137227a() {
        return this.f95899c.mo137237b(this.f95897a);
    }

    @Override // com.ss.android.lark.feed.app.binder.p1857a.AbstractC37370a
    /* renamed from: c */
    public Drawable mo137229c() {
        return this.f95898b.getDrawable(R.drawable.feed_menu_delay);
    }

    @Override // com.ss.android.lark.feed.app.binder.p1857a.AbstractC37370a
    /* renamed from: d */
    public String mo137230d() {
        int i;
        Context context = this.f95898b;
        if (this.f95897a.isDelayed()) {
            i = R.string.Lark_Legacy_RemoveMark;
        } else {
            i = R.string.Lark_Legacy_MarkForLater;
        }
        return context.getString(i).replace("\n", " ");
    }

    public C37371a(Context context, T t, AbstractC37378c<T> cVar) {
        super(context, t);
        this.f95899c = cVar;
    }
}
