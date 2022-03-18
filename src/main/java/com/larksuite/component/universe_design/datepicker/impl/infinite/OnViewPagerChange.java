package com.larksuite.component.universe_design.datepicker.impl.infinite;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/infinite/OnViewPagerChange;", "", "afterPageRotateChange", "", "rotateOperation", "", "beforePageRotateChange", "willMoveToCenterPage", "willMoveToFollowingPage", "from", "Landroid/view/View;", "to", "willMoveToPreviousPage", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.infinite.d */
public interface OnViewPagerChange {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.infinite.d$a */
    public static final class C25742a {
        /* renamed from: a */
        public static void m92705a(OnViewPagerChange dVar) {
        }

        /* renamed from: a */
        public static void m92706a(OnViewPagerChange dVar, int i) {
        }

        /* renamed from: a */
        public static void m92707a(OnViewPagerChange dVar, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(view, "from");
            Intrinsics.checkParameterIsNotNull(view2, "to");
        }

        /* renamed from: b */
        public static void m92708b(OnViewPagerChange dVar, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(view, "from");
            Intrinsics.checkParameterIsNotNull(view2, "to");
        }
    }

    /* renamed from: a */
    void mo90454a();

    /* renamed from: a */
    void mo90455a(int i);

    /* renamed from: a */
    void mo90456a(View view, View view2);

    /* renamed from: b */
    void mo90457b(int i);

    /* renamed from: b */
    void mo90458b(View view, View view2);
}
