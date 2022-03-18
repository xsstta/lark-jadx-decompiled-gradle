package com.ss.android.lark.feed.app.binder.p1857a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.widget.p2932c.C58348f;

/* renamed from: com.ss.android.lark.feed.app.binder.a.a */
public abstract class AbstractC37370a<T extends FeedPreview> {

    /* renamed from: a */
    protected T f95897a;

    /* renamed from: b */
    protected Context f95898b;

    /* renamed from: a */
    public abstract boolean mo137227a();

    /* renamed from: b */
    public abstract int mo137228b();

    /* renamed from: c */
    public abstract Drawable mo137229c();

    /* renamed from: d */
    public abstract String mo137230d();

    /* renamed from: e */
    public abstract boolean mo137231e();

    /* renamed from: f */
    public C58348f.C58351b mo137232f() {
        return new C58348f.C58351b(mo137228b(), mo137230d(), mo137229c(), mo137231e());
    }

    protected AbstractC37370a(Context context, T t) {
        this.f95898b = context;
        this.f95897a = t;
    }
}
