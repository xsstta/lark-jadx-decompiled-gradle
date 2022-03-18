package com.ss.android.lark.feed.p1847a;

import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.C23257e;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.widget.recyclerview.C58996h;

/* renamed from: com.ss.android.lark.feed.a.b */
public class C37266b {
    /* renamed from: a */
    private static boolean m146758a() {
        return C37262a.m146726a().mo139198q().mo139256a("lark.feed.anim.disable");
    }

    /* renamed from: a */
    public static void m146757a(RecyclerView recyclerView) {
        C23257e eVar = new C23257e();
        eVar.setSupportsChangeAnimations(false);
        eVar.setRemoveDuration(300);
        recyclerView.setItemAnimator(eVar);
        if (m146758a()) {
            C58996h.m228978b(recyclerView);
        }
    }

    /* renamed from: b */
    public static void m146759b(RecyclerView recyclerView) {
        if (m146758a()) {
            recyclerView.setItemAnimator(null);
            return;
        }
        C23257e eVar = new C23257e();
        eVar.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(eVar);
    }

    /* renamed from: c */
    public static void m146760c(RecyclerView recyclerView) {
        if (m146758a()) {
            recyclerView.getItemAnimator().setRemoveDuration(300);
            recyclerView.getItemAnimator().setMoveDuration(150);
        }
    }

    /* renamed from: d */
    public static void m146761d(RecyclerView recyclerView) {
        if (m146758a()) {
            recyclerView.getItemAnimator().setRemoveDuration(0);
            recyclerView.getItemAnimator().setMoveDuration(0);
        }
    }

    /* renamed from: e */
    public static void m146762e(final RecyclerView recyclerView) {
        if (m146758a()) {
            recyclerView.postDelayed(new Runnable() {
                /* class com.ss.android.lark.feed.p1847a.C37266b.RunnableC372671 */

                public void run() {
                    C37266b.m146761d(recyclerView);
                }
            }, 300);
        }
    }
}
