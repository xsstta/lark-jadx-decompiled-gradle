package com.ss.android.lark.moments.impl.categorydetail;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.transition.AutoTransition;
import androidx.transition.C1555u;
import androidx.transition.C1556v;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0003TUVB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020-2\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020KJ&\u0010L\u001a\u00020F2\u0006\u0010G\u001a\u00020-2\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020KJ&\u0010M\u001a\u00020F2\u0006\u0010G\u001a\u00020-2\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020KJ\u0012\u0010N\u001a\u00020F2\b\b\u0002\u0010O\u001a\u00020\nH\u0007J\u0012\u0010P\u001a\u00020F2\b\b\u0002\u0010O\u001a\u00020\nH\u0007J\u0012\u0010Q\u001a\u00020F2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0012\u0010R\u001a\u00020F2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0012\u0010S\u001a\u00020F2\b\b\u0002\u0010O\u001a\u00020\nH\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR$\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103RS\u00104\u001aG\u0012\u0013\u0012\u001106¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b('\u0012\u0013\u0012\u00110-¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u000605X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R!\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00138BX\u0002¢\u0006\f\n\u0004\bD\u0010\u0018\u001a\u0004\bC\u0010\u0016¨\u0006W"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper;", "", "textView", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "collapseCache", "", "collapseLayoutCache", "Landroid/text/Layout;", "enableCache", "", "getEnableCache", "()Z", "setEnableCache", "(Z)V", "enableMaxLinesCheck", "getEnableMaxLinesCheck", "setEnableMaxLinesCheck", "expandSpanList", "", "Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$ExpandSpan;", "getExpandSpanList", "()Ljava/util/List;", "expandSpanList$delegate", "Lkotlin/Lazy;", "<set-?>", "isCollapsed", "value", "mainContent", "getMainContent", "()Ljava/lang/CharSequence;", "setMainContent", "(Ljava/lang/CharSequence;)V", "sceneRoot", "Landroid/view/ViewGroup;", "getSceneRoot", "()Landroid/view/ViewGroup;", "setSceneRoot", "(Landroid/view/ViewGroup;)V", "suffix", "getSuffix", "setSuffix", "suffixSpan", "Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$SuffixSpan;", "targetLineCount", "", "getTargetLineCount", "()I", "setTargetLineCount", "(I)V", "getTextView", "()Landroid/widget/TextView;", "textWrapper", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "text", "suffixIndex", "transition", "Landroidx/transition/Transition;", "getTransition", "()Landroidx/transition/Transition;", "setTransition", "(Landroidx/transition/Transition;)V", "urlSpanList", "Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$UrlSpan;", "getUrlSpanList", "urlSpanList$delegate", "addExpandSpan", "", "fromIndex", "toIndex", "color", "listener", "Landroid/view/View$OnClickListener;", "addSuffixSpan", "addUrlSpan", "collapse", "animation", "expand", "performCollapse", "performExpand", "toggle", "ExpandSpan", "SuffixSpan", "UrlSpan", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.i */
public final class DescriptionSuffixHelper {

    /* renamed from: a */
    public SuffixSpan f119138a;

    /* renamed from: b */
    public CharSequence f119139b;

    /* renamed from: c */
    public Layout f119140c;

    /* renamed from: d */
    private final Lazy f119141d = LazyKt.lazy(C47232d.INSTANCE);

    /* renamed from: e */
    private final Lazy f119142e = LazyKt.lazy(C47241i.INSTANCE);

    /* renamed from: f */
    private CharSequence f119143f;

    /* renamed from: g */
    private CharSequence f119144g;

    /* renamed from: h */
    private boolean f119145h;

    /* renamed from: i */
    private boolean f119146i;

    /* renamed from: j */
    private boolean f119147j;

    /* renamed from: k */
    private int f119148k;

    /* renamed from: l */
    private Transition f119149l;

    /* renamed from: m */
    private ViewGroup f119150m;

    /* renamed from: n */
    private final Function3<String, CharSequence, Integer, CharSequence> f119151n;

    /* renamed from: o */
    private final TextView f119152o;

    /* renamed from: a */
    public final List<ExpandSpan> mo166030a() {
        return (List) this.f119141d.getValue();
    }

    /* renamed from: b */
    public final List<UrlSpan> mo166035b() {
        return (List) this.f119142e.getValue();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$ExpandSpan;", "", "fromIndex", "", "toIndex", "color", "listener", "Landroid/view/View$OnClickListener;", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)V", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFromIndex", "()I", "getListener", "()Landroid/view/View$OnClickListener;", "getToIndex", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$ExpandSpan;", "equals", "", "other", "hashCode", "toString", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$a */
    public static final class ExpandSpan {

        /* renamed from: a */
        private final int f119153a;

        /* renamed from: b */
        private final int f119154b;

        /* renamed from: c */
        private final Integer f119155c;

        /* renamed from: d */
        private final View.OnClickListener f119156d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpandSpan)) {
                return false;
            }
            ExpandSpan aVar = (ExpandSpan) obj;
            return this.f119153a == aVar.f119153a && this.f119154b == aVar.f119154b && Intrinsics.areEqual(this.f119155c, aVar.f119155c) && Intrinsics.areEqual(this.f119156d, aVar.f119156d);
        }

        public int hashCode() {
            int i = ((this.f119153a * 31) + this.f119154b) * 31;
            Integer num = this.f119155c;
            int i2 = 0;
            int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
            View.OnClickListener onClickListener = this.f119156d;
            if (onClickListener != null) {
                i2 = onClickListener.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "ExpandSpan(fromIndex=" + this.f119153a + ", toIndex=" + this.f119154b + ", color=" + this.f119155c + ", listener=" + this.f119156d + ")";
        }

        /* renamed from: a */
        public final int mo166047a() {
            return this.f119153a;
        }

        /* renamed from: b */
        public final int mo166048b() {
            return this.f119154b;
        }

        /* renamed from: c */
        public final Integer mo166049c() {
            return this.f119155c;
        }

        /* renamed from: d */
        public final View.OnClickListener mo166050d() {
            return this.f119156d;
        }

        public ExpandSpan(int i, int i2, Integer num, View.OnClickListener onClickListener) {
            this.f119153a = i;
            this.f119154b = i2;
            this.f119155c = num;
            this.f119156d = onClickListener;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$SuffixSpan;", "", "fromIndex", "", "toIndex", "color", "listener", "Landroid/view/View$OnClickListener;", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)V", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFromIndex", "()I", "getListener", "()Landroid/view/View$OnClickListener;", "getToIndex", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$SuffixSpan;", "equals", "", "other", "hashCode", "toString", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$b */
    public static final class SuffixSpan {

        /* renamed from: a */
        private final int f119157a;

        /* renamed from: b */
        private final int f119158b;

        /* renamed from: c */
        private final Integer f119159c;

        /* renamed from: d */
        private final View.OnClickListener f119160d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuffixSpan)) {
                return false;
            }
            SuffixSpan bVar = (SuffixSpan) obj;
            return this.f119157a == bVar.f119157a && this.f119158b == bVar.f119158b && Intrinsics.areEqual(this.f119159c, bVar.f119159c) && Intrinsics.areEqual(this.f119160d, bVar.f119160d);
        }

        public int hashCode() {
            int i = ((this.f119157a * 31) + this.f119158b) * 31;
            Integer num = this.f119159c;
            int i2 = 0;
            int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
            View.OnClickListener onClickListener = this.f119160d;
            if (onClickListener != null) {
                i2 = onClickListener.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "SuffixSpan(fromIndex=" + this.f119157a + ", toIndex=" + this.f119158b + ", color=" + this.f119159c + ", listener=" + this.f119160d + ")";
        }

        /* renamed from: a */
        public final int mo166054a() {
            return this.f119157a;
        }

        /* renamed from: b */
        public final int mo166055b() {
            return this.f119158b;
        }

        /* renamed from: c */
        public final Integer mo166056c() {
            return this.f119159c;
        }

        /* renamed from: d */
        public final View.OnClickListener mo166057d() {
            return this.f119160d;
        }

        public SuffixSpan(int i, int i2, Integer num, View.OnClickListener onClickListener) {
            this.f119157a = i;
            this.f119158b = i2;
            this.f119159c = num;
            this.f119160d = onClickListener;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$UrlSpan;", "", "fromIndex", "", "toIndex", "color", "listener", "Landroid/view/View$OnClickListener;", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)V", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFromIndex", "()I", "getListener", "()Landroid/view/View$OnClickListener;", "getToIndex", "component1", "component2", "component3", "component4", "copy", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$UrlSpan;", "equals", "", "other", "hashCode", "toString", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$c */
    public static final class UrlSpan {

        /* renamed from: a */
        private final int f119161a;

        /* renamed from: b */
        private final int f119162b;

        /* renamed from: c */
        private final Integer f119163c;

        /* renamed from: d */
        private final View.OnClickListener f119164d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UrlSpan)) {
                return false;
            }
            UrlSpan cVar = (UrlSpan) obj;
            return this.f119161a == cVar.f119161a && this.f119162b == cVar.f119162b && Intrinsics.areEqual(this.f119163c, cVar.f119163c) && Intrinsics.areEqual(this.f119164d, cVar.f119164d);
        }

        public int hashCode() {
            int i = ((this.f119161a * 31) + this.f119162b) * 31;
            Integer num = this.f119163c;
            int i2 = 0;
            int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
            View.OnClickListener onClickListener = this.f119164d;
            if (onClickListener != null) {
                i2 = onClickListener.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "UrlSpan(fromIndex=" + this.f119161a + ", toIndex=" + this.f119162b + ", color=" + this.f119163c + ", listener=" + this.f119164d + ")";
        }

        /* renamed from: a */
        public final int mo166061a() {
            return this.f119161a;
        }

        /* renamed from: b */
        public final int mo166062b() {
            return this.f119162b;
        }

        /* renamed from: c */
        public final Integer mo166063c() {
            return this.f119163c;
        }

        /* renamed from: d */
        public final View.OnClickListener mo166064d() {
            return this.f119164d;
        }

        public UrlSpan(int i, int i2, Integer num, View.OnClickListener onClickListener) {
            this.f119161a = i;
            this.f119162b = i2;
            this.f119163c = num;
            this.f119164d = onClickListener;
        }
    }

    /* renamed from: c */
    public final CharSequence mo166039c() {
        return this.f119143f;
    }

    /* renamed from: d */
    public final CharSequence mo166041d() {
        return this.f119144g;
    }

    /* renamed from: e */
    public final boolean mo166042e() {
        return this.f119145h;
    }

    /* renamed from: f */
    public final int mo166043f() {
        return this.f119148k;
    }

    /* renamed from: g */
    public final Transition mo166044g() {
        return this.f119149l;
    }

    /* renamed from: h */
    public final ViewGroup mo166045h() {
        return this.f119150m;
    }

    /* renamed from: i */
    public final TextView mo166046i() {
        return this.f119152o;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$ExpandSpan;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$d */
    static final class C47232d extends Lambda implements Function0<List<ExpandSpan>> {
        public static final C47232d INSTANCE = new C47232d();

        C47232d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<ExpandSpan> invoke() {
            return new ArrayList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$UrlSpan;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$i */
    static final class C47241i extends Lambda implements Function0<List<UrlSpan>> {
        public static final C47241i INSTANCE = new C47241i();

        C47241i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<UrlSpan> invoke() {
            return new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"defaultCollapse", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$e */
    public static final class C47233e extends Lambda implements Function0<Unit> {
        final /* synthetic */ Transition $transition;
        final /* synthetic */ DescriptionSuffixHelper this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47233e(DescriptionSuffixHelper iVar, Transition transition) {
            super(0);
            this.this$0 = iVar;
            this.$transition = transition;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo166046i().setMaxLines(this.this$0.mo166043f());
            this.this$0.mo166046i().setEllipsize(TextUtils.TruncateAt.END);
            CharSequence text = this.this$0.mo166046i().getText();
            this.this$0.mo166046i().setText(this.this$0.mo166039c());
            if (this.$transition != null) {
                TextView i = this.this$0.mo166046i();
                Layout layout = i.getLayout();
                if (layout != null) {
                    i.setText(text);
                    i.setMaxLines(Integer.MAX_VALUE);
                    i.getLayoutParams().height = layout.getHeight() + i.getPaddingTop() + i.getPaddingBottom();
                    i.setLayoutParams(i.getLayoutParams());
                    this.$transition.mo7880a(new C47234a(i, this, text));
                }
                C1556v.m7131a(this.this$0.mo166045h(), this.$transition);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$performCollapse$2$1$1", "Landroidx/transition/TransitionListenerAdapter;", "onTransitionCancel", "", "transition", "Landroidx/transition/Transition;", "onTransitionEnd", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$e$a */
        public static final class C47234a extends C1555u {

            /* renamed from: a */
            final /* synthetic */ TextView f119165a;

            /* renamed from: b */
            final /* synthetic */ C47233e f119166b;

            /* renamed from: c */
            final /* synthetic */ CharSequence f119167c;

            @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
            /* renamed from: a */
            public void mo7815a(Transition transition) {
                Intrinsics.checkParameterIsNotNull(transition, "transition");
                transition.mo7898b(this);
            }

            @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
            /* renamed from: b */
            public void mo7816b(Transition transition) {
                Intrinsics.checkParameterIsNotNull(transition, "transition");
                transition.mo7898b(this);
                this.f119165a.getLayoutParams().height = -2;
                TextView textView = this.f119165a;
                textView.setLayoutParams(textView.getLayoutParams());
                this.f119165a.setMaxLines(this.f119166b.this$0.mo166043f());
                this.f119165a.setText(this.f119166b.this$0.mo166039c());
            }

            C47234a(TextView textView, C47233e eVar, CharSequence charSequence) {
                this.f119165a = textView;
                this.f119166b = eVar;
                this.f119167c = charSequence;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Landroid/text/SpannableStringBuilder;", "text", "", "<anonymous parameter 1>", "", "suffixIndex", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$h */
    static final class C47237h extends Lambda implements Function3<String, CharSequence, Integer, SpannableStringBuilder> {
        final /* synthetic */ DescriptionSuffixHelper this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47237h(DescriptionSuffixHelper iVar) {
            super(3);
            this.this$0 = iVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$textWrapper$1$1$1$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$h$a */
        public static final class C47238a extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f119168a;

            C47238a(View.OnClickListener onClickListener) {
                this.f119168a = onClickListener;
            }

            public void onClick(View view) {
                Intrinsics.checkParameterIsNotNull(view, "widget");
                this.f119168a.onClick(view);
            }

            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkParameterIsNotNull(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$textWrapper$1$1$2$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$h$b */
        public static final class C47239b extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f119169a;

            C47239b(View.OnClickListener onClickListener) {
                this.f119169a = onClickListener;
            }

            public void onClick(View view) {
                Intrinsics.checkParameterIsNotNull(view, "widget");
                this.f119169a.onClick(view);
            }

            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkParameterIsNotNull(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$textWrapper$1$1$3$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$h$c */
        public static final class C47240c extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f119170a;

            C47240c(View.OnClickListener onClickListener) {
                this.f119170a = onClickListener;
            }

            public void onClick(View view) {
                Intrinsics.checkParameterIsNotNull(view, "widget");
                this.f119170a.onClick(view);
            }

            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkParameterIsNotNull(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(true);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ SpannableStringBuilder invoke(String str, CharSequence charSequence, Integer num) {
            return invoke(str, charSequence, num.intValue());
        }

        public final SpannableStringBuilder invoke(String str, CharSequence charSequence, int i) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            Intrinsics.checkParameterIsNotNull(charSequence, "<anonymous parameter 1>");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            for (T t : this.this$0.mo166030a()) {
                int a = t.mo166047a();
                int min = Math.min(t.mo166048b(), i);
                if (a <= i && a < min) {
                    View.OnClickListener d = t.mo166050d();
                    if (d != null) {
                        spannableStringBuilder.setSpan(new C47238a(d), a, min, 33);
                        this.this$0.mo166046i().setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    Integer c = t.mo166049c();
                    if (c != null) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(c.intValue()), a, min, 33);
                    }
                }
            }
            SuffixSpan bVar = this.this$0.f119138a;
            if (bVar != null) {
                int a2 = bVar.mo166054a() + i;
                int b = bVar.mo166055b() + i;
                View.OnClickListener d2 = bVar.mo166057d();
                if (d2 != null) {
                    spannableStringBuilder.setSpan(new C47239b(d2), a2, b, 33);
                    this.this$0.mo166046i().setMovementMethod(LinkMovementMethod.getInstance());
                }
                Integer c2 = bVar.mo166056c();
                if (c2 != null) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(c2.intValue()), a2, b, 33);
                }
            }
            for (T t2 : this.this$0.mo166035b()) {
                int a3 = t2.mo166061a();
                int min2 = Math.min(t2.mo166062b(), i);
                if (a3 <= i && a3 < min2) {
                    View.OnClickListener d3 = t2.mo166064d();
                    if (d3 != null) {
                        spannableStringBuilder.setSpan(new C47240c(d3), a3, min2, 33);
                        this.this$0.mo166046i().setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    Integer c3 = t2.mo166063c();
                    if (c3 != null) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.intValue()), a3, min2, 33);
                    }
                }
            }
            return spannableStringBuilder;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$f */
    public static final class C47235f extends Lambda implements Function1<CharSequence, Unit> {
        final /* synthetic */ DescriptionSuffixHelper this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47235f(DescriptionSuffixHelper iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke(charSequence);
            return Unit.INSTANCE;
        }

        public final void invoke(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "text");
            this.this$0.f119139b = charSequence;
            DescriptionSuffixHelper iVar = this.this$0;
            iVar.f119140c = iVar.mo166046i().getLayout();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.i$g */
    public static final class C47236g extends Lambda implements Function1<CharSequence, Unit> {
        final /* synthetic */ C47233e $defaultCollapse$2;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47236g(C47233e eVar) {
            super(1);
            this.$defaultCollapse$2 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke(charSequence);
            return Unit.INSTANCE;
        }

        public final void invoke(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "it");
            this.$defaultCollapse$2.invoke();
        }
    }

    /* renamed from: a */
    public final void mo166032a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "<set-?>");
        this.f119150m = viewGroup;
    }

    /* renamed from: b */
    public final void mo166037b(CharSequence charSequence) {
        this.f119139b = null;
        this.f119144g = charSequence;
    }

    /* renamed from: a */
    private final void m187104a(Transition transition) {
        this.f119145h = false;
        C47242j.m187140a(this.f119152o, this.f119143f, transition, this.f119150m, mo166035b());
    }

    /* renamed from: b */
    public final void mo166038b(boolean z) {
        Transition transition;
        if (z) {
            transition = this.f119149l;
        } else {
            transition = null;
        }
        m187104a(transition);
    }

    public DescriptionSuffixHelper(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        this.f119152o = textView;
        CharSequence text = textView.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "textView.text");
        this.f119143f = text;
        this.f119147j = true;
        this.f119148k = 2;
        this.f119149l = new AutoTransition();
        ViewParent parent = textView.getParent();
        if (parent != null) {
            this.f119150m = (ViewGroup) parent;
            this.f119151n = new C47237h(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    private final void m187106b(Transition transition) {
        boolean z;
        if (!this.f119147j || this.f119152o.getMaxLines() >= this.f119148k) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f119145h = true;
            C47233e eVar = new C47233e(this, transition);
            if (this.f119144g == null) {
                eVar.invoke();
                return;
            }
            CharSequence charSequence = this.f119139b;
            if (!this.f119146i || charSequence == null || !Intrinsics.areEqual(this.f119140c, this.f119152o.getLayout())) {
                TextView textView = this.f119152o;
                CharSequence charSequence2 = this.f119143f;
                String str = this.f119144g;
                if (str == null) {
                }
                C47242j.m187141a(textView, charSequence2, str, this.f119148k, transition, this.f119150m, new C47235f(this), new C47236g(eVar), mo166035b(), this.f119151n);
            } else if (!Intrinsics.areEqual(charSequence, this.f119143f)) {
                if (transition != null) {
                    C47242j.m187139a(this.f119152o, charSequence, transition, this.f119150m);
                    return;
                }
                this.f119152o.setMaxLines(this.f119148k);
                this.f119152o.setEllipsize(TextUtils.TruncateAt.END);
                this.f119152o.setText(charSequence);
            }
        } else {
            throw new IllegalArgumentException(("textView.maxLines(" + this.f119152o.getMaxLines() + ") < targetLineCount(" + this.f119148k + ')').toString());
        }
    }

    /* renamed from: a */
    public final void mo166033a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        this.f119139b = null;
        this.f119143f = charSequence;
    }

    /* renamed from: a */
    public final void mo166034a(boolean z) {
        Transition transition;
        if (z) {
            transition = this.f119149l;
        } else {
            transition = null;
        }
        m187106b(transition);
    }

    /* renamed from: a */
    public static /* synthetic */ void m187105a(DescriptionSuffixHelper iVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        iVar.mo166038b(z);
    }

    /* renamed from: b */
    public final void mo166036b(int i, int i2, int i3, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        mo166030a().add(new ExpandSpan(i, i2, Integer.valueOf(i3), onClickListener));
    }

    /* renamed from: c */
    public final void mo166040c(int i, int i2, int i3, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        mo166035b().add(new UrlSpan(i, i2, Integer.valueOf(i3), onClickListener));
    }

    /* renamed from: a */
    public final void mo166031a(int i, int i2, int i3, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        this.f119138a = new SuffixSpan(i, i2, Integer.valueOf(i3), onClickListener);
    }
}
