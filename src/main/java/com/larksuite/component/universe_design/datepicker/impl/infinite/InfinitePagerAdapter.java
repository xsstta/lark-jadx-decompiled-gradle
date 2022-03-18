package com.larksuite.component.universe_design.datepicker.impl.infinite;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH&J \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u0001H\u0019\"\b\b\u0000\u0010\u0019*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0010J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\nH&J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX.¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006$"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfinitePagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "<set-?>", "", "isAllPagesInflated", "()Z", "mInflatedPageCount", "", "mPageViews", "", "Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfinitePageView;", "[Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfinitePageView;", "afterInstantiateItem", "", "position", "destroyItem", "container", "Landroid/view/ViewGroup;", "item", "", "getCount", "getPageView", "T", "Landroid/view/View;", "(I)Landroid/view/View;", "initAdapterViews", "instantiateItem", "isViewFromObject", "view", "onInstantiateItem", "rotateLeft2Right", "rotateRight2Left", "Companion", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.infinite.b */
public abstract class InfinitePagerAdapter extends PagerAdapter {

    /* renamed from: b */
    public static final Companion f63248b = new Companion(null);

    /* renamed from: a */
    private InfinitePageView[] f63249a;

    /* renamed from: c */
    private int f63250c;

    /* renamed from: d */
    private boolean f63251d;

    /* renamed from: e */
    private Context f63252e;

    /* renamed from: a */
    public abstract View mo90460a(int i);

    /* renamed from: b */
    public abstract void mo90466b(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfinitePagerAdapter$Companion;", "", "()V", "OP_ROTATE_LEFT_2_RIGHT", "", "OP_ROTATE_NO_OP", "OP_ROTATE_RIGHT_2_LEFT", "PAGE_COUNT", "PAGE_POSITION_CENTER", "PAGE_POSITION_LEFT", "PAGE_POSITION_RIGHT", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.infinite.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final void mo90546f() {
        this.f63249a = new InfinitePageView[]{new InfinitePageView(this.f63252e, mo90460a(0)), new InfinitePageView(this.f63252e, mo90460a(1)), new InfinitePageView(this.f63252e, mo90460a(2))};
    }

    /* renamed from: g */
    public final void mo90547g() {
        InfinitePageView[] aVarArr = this.f63249a;
        if (aVarArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVarArr[0].mo90543b();
        InfinitePageView[] aVarArr2 = this.f63249a;
        if (aVarArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        View a = aVarArr2[0].mo90541a();
        InfinitePageView[] aVarArr3 = this.f63249a;
        if (aVarArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVarArr3[1].mo90543b();
        InfinitePageView[] aVarArr4 = this.f63249a;
        if (aVarArr4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        InfinitePageView aVar = aVarArr4[0];
        InfinitePageView[] aVarArr5 = this.f63249a;
        if (aVarArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVar.mo90542a(aVarArr5[1].mo90541a());
        InfinitePageView[] aVarArr6 = this.f63249a;
        if (aVarArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVarArr6[2].mo90543b();
        InfinitePageView[] aVarArr7 = this.f63249a;
        if (aVarArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        InfinitePageView aVar2 = aVarArr7[1];
        InfinitePageView[] aVarArr8 = this.f63249a;
        if (aVarArr8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVar2.mo90542a(aVarArr8[2].mo90541a());
        InfinitePageView[] aVarArr9 = this.f63249a;
        if (aVarArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVarArr9[2].mo90542a(a);
    }

    /* renamed from: h */
    public final void mo90548h() {
        InfinitePageView[] aVarArr = this.f63249a;
        if (aVarArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVarArr[2].mo90543b();
        InfinitePageView[] aVarArr2 = this.f63249a;
        if (aVarArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        View a = aVarArr2[2].mo90541a();
        InfinitePageView[] aVarArr3 = this.f63249a;
        if (aVarArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVarArr3[1].mo90543b();
        InfinitePageView[] aVarArr4 = this.f63249a;
        if (aVarArr4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        InfinitePageView aVar = aVarArr4[2];
        InfinitePageView[] aVarArr5 = this.f63249a;
        if (aVarArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVar.mo90542a(aVarArr5[1].mo90541a());
        InfinitePageView[] aVarArr6 = this.f63249a;
        if (aVarArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVarArr6[0].mo90543b();
        InfinitePageView[] aVarArr7 = this.f63249a;
        if (aVarArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        InfinitePageView aVar2 = aVarArr7[1];
        InfinitePageView[] aVarArr8 = this.f63249a;
        if (aVarArr8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVar2.mo90542a(aVarArr8[0].mo90541a());
        InfinitePageView[] aVarArr9 = this.f63249a;
        if (aVarArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        aVarArr9[0].mo90542a(a);
    }

    public InfinitePagerAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f63252e = context;
    }

    /* renamed from: c */
    public final <T extends View> T mo90545c(int i) {
        if (i < 0 || i > 2) {
            return null;
        }
        InfinitePageView[] aVarArr = this.f63249a;
        if (aVarArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        return (T) aVarArr[i].mo90541a();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(obj, "item");
        if (view == ((InfinitePageView) obj).mo90544c()) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        InfinitePageView[] aVarArr = this.f63249a;
        if (aVarArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageViews");
        }
        InfinitePageView aVar = aVarArr[i];
        viewGroup.addView(aVar.mo90544c());
        int i2 = this.f63250c + 1;
        this.f63250c = i2;
        if (i2 == 3) {
            this.f63251d = true;
        }
        mo90466b(i);
        return aVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(obj, "item");
        if (!(obj instanceof InfinitePageView)) {
            obj = null;
        }
        InfinitePageView aVar = (InfinitePageView) obj;
        if (aVar != null) {
            viewGroup.removeView(aVar.mo90544c());
        }
    }
}
