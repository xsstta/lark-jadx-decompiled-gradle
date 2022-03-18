package com.bytedance.ee.bear.document.independentpanel;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/document/independentpanel/IndependentDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "exitAnimDuration", "", "getExitAnimDuration", "()J", "setViewModelInactive", "", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.f.a */
public abstract class IndependentDialogFragment extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: g */
    public static final String f16288g = f16288g;

    /* renamed from: h */
    public static final Companion f16289h = new Companion(null);

    /* renamed from: c */
    private HashMap f16290c;

    /* renamed from: f */
    public abstract long mo18782f();

    /* renamed from: g */
    public abstract void mo18783g();

    /* renamed from: h */
    public void mo18784h() {
        HashMap hashMap = this.f16290c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo18784h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/document/independentpanel/IndependentDialogFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.f.a$b */
    static final class RunnableC5787b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IndependentDialogFragment f16291a;

        /* renamed from: b */
        final /* synthetic */ FragmentManager f16292b;

        /* renamed from: c */
        final /* synthetic */ String f16293c;

        RunnableC5787b(IndependentDialogFragment aVar, FragmentManager fragmentManager, String str) {
            this.f16291a = aVar;
            this.f16292b = fragmentManager;
            this.f16293c = str;
        }

        public final void run() {
            IndependentDialogFragment.super.mo5511a((IndependentDialogFragment) this.f16292b, (FragmentManager) this.f16293c);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public void mo5511a(FragmentManager fragmentManager, String str) {
        long j;
        Intrinsics.checkParameterIsNotNull(fragmentManager, "manager");
        Iterator<Fragment> it = fragmentManager.getFragments().iterator();
        while (true) {
            if (!it.hasNext()) {
                j = 0;
                break;
            }
            Fragment next = it.next();
            if ((next instanceof IndependentDialogFragment) && (!Intrinsics.areEqual(next, this))) {
                IndependentDialogFragment aVar = (IndependentDialogFragment) next;
                j = aVar.mo18782f();
                aVar.mo5513b();
                if (!Intrinsics.areEqual(getClass(), aVar.getClass())) {
                    aVar.mo18783g();
                }
                C13479a.m54764b(f16288g, "dismiss " + next + ", show " + this + ", delayShowTime = " + j);
            }
        }
        if (j > 0) {
            C13742g.m55706a(new RunnableC5787b(this, fragmentManager, str), j);
        } else {
            super.mo5511a(fragmentManager, str);
        }
    }
}
