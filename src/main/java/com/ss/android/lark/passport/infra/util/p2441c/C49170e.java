package com.ss.android.lark.passport.infra.util.p2441c;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\u001a\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0003H\u0002\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "iterator", "", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.c.e */
public final class C49170e {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"com/ss/android/lark/passport/infra/util/ext/ViewGroupKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "iterator", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.c.e$a */
    public static final class C49171a implements Sequence<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f123455a;

        @Override // kotlin.sequences.Sequence
        /* renamed from: a */
        public Iterator<View> mo4717a() {
            return C49170e.m193881a(this.f123455a);
        }

        C49171a(ViewGroup viewGroup) {
            this.f123455a = viewGroup;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"com/ss/android/lark/passport/infra/util/ext/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "index", "", "hasNext", "", "next", "remove", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.c.e$b */
    public static final class C49172b implements Iterator<View>, KMutableIterator {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f123456a;

        /* renamed from: b */
        private int f123457b;

        public boolean hasNext() {
            if (this.f123457b < this.f123456a.getChildCount()) {
                return true;
            }
            return false;
        }

        public void remove() {
            ViewGroup viewGroup = this.f123456a;
            int i = this.f123457b - 1;
            this.f123457b = i;
            viewGroup.removeViewAt(i);
        }

        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f123456a;
            int i = this.f123457b;
            this.f123457b = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        C49172b(ViewGroup viewGroup) {
            this.f123456a = viewGroup;
        }
    }

    /* renamed from: a */
    public static final Iterator<View> m193881a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$iterator");
        return new C49172b(viewGroup);
    }

    /* renamed from: b */
    public static final Sequence<View> m193882b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$children");
        return new C49171a(viewGroup);
    }
}
