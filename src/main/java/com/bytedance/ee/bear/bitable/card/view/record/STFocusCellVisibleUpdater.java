package com.bytedance.ee.bear.bitable.card.view.record;

import android.text.Layout;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0002\"#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001c\u0010 \u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010!\u001a\u00020\u0010H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater;", "Lcom/bytedance/ee/bear/bitable/card/view/record/IEditPanelVisibleListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "cellListRecyclerView", "Ljava/lang/ref/WeakReference;", "delayToResetBottomHeight", "Ljava/lang/Runnable;", "delegate", "Lcom/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater$BottomSpaceHeightChangeDelegate;", "getDelegate", "()Lcom/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater$BottomSpaceHeightChangeDelegate;", "setDelegate", "(Lcom/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater$BottomSpaceHeightChangeDelegate;)V", "bringFocusViewVisible", "", "focusView", "Landroid/view/View;", "editPanelHeight", "", "bringViewVisible", "cellList", "viewTop", "viewBottom", "calCursorYPositionOnScreen", "textView", "Lcom/bytedance/ee/bear/widget/AtEditText;", "onHide", "currentView", "editPanel", "Lcom/bytedance/ee/bear/bitable/card/view/cell/ICellEditPanel;", "onShow", "resetBottomSpaceHeight", "BottomSpaceHeightChangeDelegate", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.k */
public final class STFocusCellVisibleUpdater implements AbstractC4548e {

    /* renamed from: a */
    public static final Companion f13424a = new Companion(null);

    /* renamed from: e */
    private static final int f13425e = C13655e.m55411a(20);

    /* renamed from: b */
    private final WeakReference<RecyclerView> f13426b;

    /* renamed from: c */
    private BottomSpaceHeightChangeDelegate f13427c;

    /* renamed from: d */
    private Runnable f13428d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater$BottomSpaceHeightChangeDelegate;", "", "onHeightChanged", "", "height", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.k$a */
    public interface BottomSpaceHeightChangeDelegate {
        /* renamed from: b */
        void mo17896b(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater$Companion;", "", "()V", "DEFAULT_MARGIN_BOTTOM", "", "DELAY_TIME", "", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.k$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater$onHide$1", "Ljava/lang/Runnable;", "run", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.k$d */
    public static final class RunnableC4559d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ STFocusCellVisibleUpdater f13435a;

        public void run() {
            this.f13435a.mo17938a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC4559d(STFocusCellVisibleUpdater kVar) {
            this.f13435a = kVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater$bringFocusViewVisible$1", "Ljava/lang/Runnable;", "run", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.k$c */
    public static final class RunnableC4558c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ STFocusCellVisibleUpdater f13429a;

        /* renamed from: b */
        final /* synthetic */ View f13430b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f13431c;

        /* renamed from: d */
        final /* synthetic */ int f13432d;

        /* renamed from: e */
        final /* synthetic */ int f13433e;

        /* renamed from: f */
        final /* synthetic */ int f13434f;

        public void run() {
            if (this.f13430b.hasFocus()) {
                this.f13429a.mo17940a(this.f13431c, this.f13432d, this.f13433e, this.f13434f);
            }
        }

        RunnableC4558c(STFocusCellVisibleUpdater kVar, View view, RecyclerView recyclerView, int i, int i2, int i3) {
            this.f13429a = kVar;
            this.f13430b = view;
            this.f13431c = recyclerView;
            this.f13432d = i;
            this.f13433e = i2;
            this.f13434f = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/record/STFocusCellVisibleUpdater$onShow$1", "Ljava/lang/Runnable;", "run", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.k$e */
    public static final class RunnableC4560e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ STFocusCellVisibleUpdater f13436a;

        /* renamed from: b */
        final /* synthetic */ View f13437b;

        /* renamed from: c */
        final /* synthetic */ AbstractC4607d f13438c;

        public void run() {
            STFocusCellVisibleUpdater kVar = this.f13436a;
            View view = this.f13437b;
            kVar.mo17939a(view, this.f13438c.mo17990a(view.getContext()));
        }

        RunnableC4560e(STFocusCellVisibleUpdater kVar, View view, AbstractC4607d dVar) {
            this.f13436a = kVar;
            this.f13437b = view;
            this.f13438c = dVar;
        }
    }

    /* renamed from: a */
    public final void mo17938a() {
        if (this.f13426b.get() != null) {
            C13479a.m54772d("STFocusCellVisibleUpdater", "resetBottomSpaceHeight");
            BottomSpaceHeightChangeDelegate aVar = this.f13427c;
            if (aVar != null) {
                aVar.mo17896b(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo17941a(BottomSpaceHeightChangeDelegate aVar) {
        this.f13427c = aVar;
    }

    public STFocusCellVisibleUpdater(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f13426b = new WeakReference<>(recyclerView);
    }

    /* renamed from: a */
    private final int m18934a(AtEditText atEditText) {
        int[] iArr = new int[2];
        atEditText.getLocationOnScreen(iArr);
        int selectionStart = atEditText.getSelectionStart();
        Layout layout = atEditText.getLayout();
        if (layout == null) {
            C13479a.m54758a("STFocusCellVisibleUpdater", "textView's layout is null!");
            return iArr[1];
        }
        int lineForOffset = layout.getLineForOffset(selectionStart);
        int lineBaseline = layout.getLineBaseline(lineForOffset);
        int lineAscent = layout.getLineAscent(lineForOffset);
        C13479a.m54772d("STFocusCellVisibleUpdater", "line " + lineForOffset + " baseline " + lineBaseline + " ascent " + lineAscent + " ypos " + iArr[1]);
        return lineBaseline + lineAscent + iArr[1];
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e
    /* renamed from: a */
    public void mo17908a(View view, AbstractC4607d dVar) {
        if (view != null && dVar != null) {
            C13742g.m55705a(new RunnableC4560e(this, view, dVar));
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e
    /* renamed from: b */
    public void mo17910b(View view, AbstractC4607d dVar) {
        RunnableC4559d dVar2 = new RunnableC4559d(this);
        this.f13428d = dVar2;
        C13742g.m55706a(dVar2, 200);
    }

    /* renamed from: a */
    public final void mo17939a(View view, int i) {
        int i2;
        int i3;
        RecyclerView recyclerView = this.f13426b.get();
        if (recyclerView != null) {
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "cellListRecyclerView.get() ?: return");
            C13479a.m54772d("STFocusCellVisibleUpdater", "show focus view");
            C13479a.m54772d("STFocusCellVisibleUpdater", "panel height: " + i);
            C13742g.m55710c(this.f13428d);
            BottomSpaceHeightChangeDelegate aVar = this.f13427c;
            if (aVar != null) {
                aVar.mo17896b(i - f13425e);
            }
            if (view instanceof AtEditText) {
                AtEditText atEditText = (AtEditText) view;
                int a = m18934a(atEditText);
                i2 = atEditText.getLineHeight() + a + C13749l.m55738a(12);
                i3 = a;
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                C13479a.m54772d("STFocusCellVisibleUpdater", "loc y: " + iArr[1]);
                i3 = iArr[1];
                i2 = iArr[1] + view.getHeight();
            }
            C13742g.m55705a(new RunnableC4558c(this, view, recyclerView, i, i3, i2));
        }
    }

    /* renamed from: a */
    public final void mo17940a(RecyclerView recyclerView, int i, int i2, int i3) {
        int[] iArr = new int[2];
        int c = C13655e.m55416c(recyclerView.getContext());
        recyclerView.getLocationOnScreen(iArr);
        int i4 = iArr[1];
        int i5 = c - i;
        C13479a.m54772d("STFocusCellVisibleUpdater", "viewTop:" + i2 + ", listTop:" + i4 + ", viewBottom:" + i3 + ", " + "panelTop:" + i5);
        if (i2 >= i4 && i3 <= i5) {
            C13479a.m54772d("STFocusCellVisibleUpdater", "no scroll");
        } else if (i3 > i5) {
            C13479a.m54772d("STFocusCellVisibleUpdater", "scroll to bottom visible");
            if (i5 > i4) {
                recyclerView.smoothScrollBy(0, i3 - i5);
            } else {
                recyclerView.smoothScrollBy(0, RangesKt.coerceAtLeast(i2 - i4, 0));
            }
        } else {
            C13479a.m54772d("STFocusCellVisibleUpdater", "other case");
            recyclerView.smoothScrollBy(0, -Math.min(Math.abs(i4 - i2), Math.abs(i5 - i3)));
        }
    }
}
