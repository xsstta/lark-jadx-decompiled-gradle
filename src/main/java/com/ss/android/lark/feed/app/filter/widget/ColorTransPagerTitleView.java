package com.ss.android.lark.feed.app.filter.widget;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.C69617a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/widget/ColorTransPagerTitleView;", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/SimplePagerTitleView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mListener", "Lcom/ss/android/lark/feed/app/filter/widget/ColorTransPagerTitleView$OnPagerTitleChangeListener;", "mTypeface", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "onDeselected", "", "index", "", "totalCount", "onEnter", "enterPercent", "", "leftToRight", "", "onLeave", "leavePercent", "onSelected", "setOnPagerTitleChangeListener", "OnPagerTitleChangeListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.filter.widget.a */
public final class ColorTransPagerTitleView extends C69633c {

    /* renamed from: a */
    private OnPagerTitleChangeListener f96322a;

    /* renamed from: d */
    private Typeface f96323d = Typeface.DEFAULT;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/widget/ColorTransPagerTitleView$OnPagerTitleChangeListener;", "", "onSelected", "", "index", "", "totalCount", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.widget.a$a */
    public interface OnPagerTitleChangeListener {
        /* renamed from: a */
        void mo137865a(int i, int i2);
    }

    public final void setOnPagerTitleChangeListener(OnPagerTitleChangeListener aVar) {
        this.f96322a = aVar;
    }

    public ColorTransPagerTitleView(Context context) {
        super(context);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
    /* renamed from: a */
    public void mo31041a(int i, int i2) {
        OnPagerTitleChangeListener aVar = this.f96322a;
        if (aVar != null) {
            aVar.mo137865a(i, i2);
        }
        if (!Intrinsics.areEqual(this.f96323d, Typeface.DEFAULT_BOLD)) {
            Typeface typeface = Typeface.DEFAULT_BOLD;
            this.f96323d = typeface;
            setTypeface(typeface);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
    /* renamed from: b */
    public void mo31043b(int i, int i2) {
        if (!Intrinsics.areEqual(this.f96323d, Typeface.DEFAULT)) {
            Typeface typeface = Typeface.DEFAULT;
            this.f96323d = typeface;
            setTypeface(typeface);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
    /* renamed from: a */
    public void mo31042a(int i, int i2, float f, boolean z) {
        setTextColor(C69617a.m267416a(f, this.f174079b, this.f174080c));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c
    /* renamed from: b */
    public void mo31044b(int i, int i2, float f, boolean z) {
        setTextColor(C69617a.m267416a(f, this.f174080c, this.f174079b));
    }
}
