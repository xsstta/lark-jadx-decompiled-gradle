package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.AbstractC1409v;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.C1404s;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.utils.C26955i;
import java.lang.ref.WeakReference;
import java.util.Map;

public class UIList extends AbsLynxList<RecyclerView> {

    /* renamed from: e */
    public static boolean f66420e;

    /* renamed from: a */
    public C26801f f66421a;

    /* renamed from: b */
    public int f66422b = 1;

    /* renamed from: c */
    C26792b f66423c;

    /* renamed from: d */
    boolean f66424d = true;

    /* renamed from: f */
    private String f66425f = "single";

    /* renamed from: g */
    private boolean f66426g = true;

    /* renamed from: h */
    private C26793c f66427h;

    /* renamed from: i */
    private boolean f66428i;

    /* renamed from: j */
    private boolean f66429j;

    /* renamed from: k */
    private AbstractC1409v f66430k;

    /* renamed from: l */
    private ViewGroup f66431l;

    /* renamed from: m */
    private View$OnAttachStateChangeListenerC26795d f66432m;

    /* renamed from: n */
    private int f66433n = -1;

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setCacheQueueRatio(AbstractC26517a aVar) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollStateChangeEventThrottle(String str) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollX(AbstractC26517a aVar) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollY(AbstractC26517a aVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C26801f mo53307k() {
        return this.f66421a;
    }

    /* renamed from: i */
    public RecyclerView mo53305i() {
        return (RecyclerView) av();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        int i = this.f66196B + this.f66202H;
        int i2 = this.f66197C + this.f66205K;
        ((RecyclerView) this.f66253Z).setPadding(this.f66245z + this.f66203I, i, this.f66195A + this.f66204J, i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.AbstractC26757c
    /* renamed from: v */
    public void mo95040v() {
        ((RecyclerView) this.f66253Z).requestLayout();
        if (!((RecyclerView) this.f66253Z).isLayoutRequested()) {
            final View view = this.f66253Z;
            ((RecyclerView) this.f66253Z).post(new Runnable() {
                /* class com.lynx.tasm.behavior.ui.list.UIList.RunnableC267871 */

                public void run() {
                    view.requestLayout();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void aH() {
        LLog.m96425c("UIList2", "onLayoutCompleted " + this.f66421a.f66491a.size());
        if (this.f66429j && ((RecyclerView) this.f66253Z).getChildCount() > 0) {
            this.f66423c.mo95294a(this.f66421a.f66491a);
            this.f66429j = false;
        }
    }

    private void aI() {
        if (this.f66426g) {
            RecyclerView.LayoutManager layoutManager = null;
            new WeakReference(this);
            if (TextUtils.equals(this.f66425f, "single")) {
                layoutManager = new ListLayoutManager.ListLinearLayoutManager(this.f66239t, this);
            } else if (TextUtils.equals(this.f66425f, "flow")) {
                layoutManager = new ListLayoutManager.ListGridLayoutManager(this.f66239t, this.f66422b, this);
            } else if (TextUtils.equals(this.f66425f, "waterfall")) {
                layoutManager = new ListLayoutManager.C26786a(this.f66422b, 1, this);
                this.f66421a.f66492b = true;
            }
            View$OnAttachStateChangeListenerC26795d dVar = this.f66432m;
            if (dVar != null) {
                dVar.mo95308a();
            }
            ((RecyclerView) this.f66253Z).setLayoutManager(layoutManager);
        }
        this.f66426g = false;
        if (((RecyclerView) this.f66253Z).getLayoutManager() instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) this.f66253Z).getLayoutManager();
            gridLayoutManager.mo6501a(new GridLayoutManager.AbstractC1297b() {
                /* class com.lynx.tasm.behavior.ui.list.UIList.C267882 */

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
                /* renamed from: a */
                public int mo6533a(int i) {
                    if (!UIList.this.f66421a.mo95329a(i) || UIList.this.f66422b <= 1) {
                        return 1;
                    }
                    return gridLayoutManager.mo6502b();
                }
            });
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void U_() {
        int i;
        super.U_();
        if (((RecyclerView) this.f66253Z).getAdapter() == null) {
            ((RecyclerView) this.f66253Z).setAdapter(this.f66421a);
        }
        this.f66421a.mo95324a();
        if (this.f66421a.f66491a == null) {
            i = 0;
        } else {
            i = this.f66421a.f66491a.size();
        }
        int i2 = this.f66433n;
        if (i > i2 && i2 > -1) {
            this.f66427h.mo95303a(i2, 0);
            this.f66433n = -1;
        }
        LLog.m96425c("UIList2", "onPropsUpdated viewNames " + i);
        aI();
        if (this.f66423c.mo95297a()) {
            this.f66429j = true;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void ah() {
        boolean z;
        int i;
        TraceEvent.m96443a("UIList2.measure");
        ViewGroup viewGroup = this.f66431l;
        if (viewGroup != null) {
            z = viewGroup.isLayoutRequested();
        } else {
            z = ((RecyclerView) this.f66253Z).isLayoutRequested();
        }
        if (!z) {
            TraceEvent.m96444b("UIList2.measure");
            return;
        }
        mo95135o();
        ay();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo94937T(), 1073741824);
        if (this.f66428i) {
            if (f66420e) {
                LLog.m96425c("UIList2", "UIList2 autoMeasure maxHeight " + this.f66214T);
            }
            i = View.MeasureSpec.makeMeasureSpec((int) this.f66214T, Integer.MIN_VALUE);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(mo94938U(), 1073741824);
        }
        ViewGroup viewGroup2 = this.f66431l;
        if (viewGroup2 != null) {
            viewGroup2.measure(makeMeasureSpec, i);
        } else {
            ((RecyclerView) this.f66253Z).measure(makeMeasureSpec, i);
        }
        TraceEvent.m96444b("UIList2.measure");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: j */
    public void mo53306j() {
        boolean z;
        TraceEvent.m96443a("UIList2.layout");
        ViewGroup viewGroup = this.f66431l;
        if (viewGroup != null) {
            z = viewGroup.isLayoutRequested();
        } else {
            z = ((RecyclerView) this.f66253Z).isLayoutRequested();
        }
        if (!z) {
            TraceEvent.m96444b("UIList2.layout");
            return;
        }
        mo53301e();
        ViewGroup viewGroup2 = this.f66431l;
        if (viewGroup2 != null) {
            viewGroup2.layout(mo94940W(), mo94939V(), mo94940W() + mo94937T(), mo94939V() + mo94938U());
        } else {
            ((RecyclerView) this.f66253Z).layout(mo94940W(), mo94939V(), mo94940W() + mo94937T(), mo94939V() + mo94938U());
        }
        ViewCompat.m4038a(this.f66253Z, mo94931N());
        TraceEvent.m96444b("UIList2.layout");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94953a(long j) {
        this.f66421a.mo95325a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public RecyclerView mo95278c(Context context) {
        return new RecyclerView(context);
    }

    @LynxProp(customType = "false", name = "auto-measure")
    public void setAutoMeasure(AbstractC26517a aVar) {
        this.f66428i = C26792b.m97258a(aVar, false);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setInitialScrollIndex(AbstractC26517a aVar) {
        this.f66433n = C26792b.m97254a(aVar, -1);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setLowerThreshold(AbstractC26517a aVar) {
        this.f66423c.mo95299b(aVar);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setLowerThresholdItemCount(AbstractC26517a aVar) {
        this.f66423c.mo95301d(aVar);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setNeedVisibleCells(boolean z) {
        this.f66423c.f66448a = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollEnable(AbstractC26517a aVar) {
        this.f66424d = C26792b.m97258a(aVar, true);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollEventThrottle(AbstractC26517a aVar) {
        this.f66423c.mo95302e(aVar);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setUpperThreshold(AbstractC26517a aVar) {
        this.f66423c.mo95295a(aVar);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setUpperThresholdItemCount(AbstractC26517a aVar) {
        this.f66423c.mo95300c(aVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        this.f66423c.mo95296a(map);
    }

    public UIList(AbstractC26684l lVar) {
        super(lVar);
        if (f66420e) {
            LLog.m96425c("UIList2", "UIList2 init");
        }
    }

    @LynxProp(customType = "true", name = "android-diffable")
    public void setDiffable(AbstractC26517a aVar) {
        if (((RecyclerView) this.f66253Z).getAdapter() == null) {
            this.f66421a.setHasStableIds(!C26792b.m97258a(aVar, true));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setEnableSticky(AbstractC26517a aVar) {
        if (C26792b.m97258a(aVar, false) && this.f66431l == null) {
            View$OnAttachStateChangeListenerC26795d dVar = new View$OnAttachStateChangeListenerC26795d(this);
            this.f66432m = dVar;
            this.f66431l = dVar.mo95310b();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setListType(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "single";
        }
        if (!TextUtils.equals(str, this.f66425f)) {
            this.f66426g = true;
            this.f66425f = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RecyclerView mo33942b(Context context) {
        RecyclerView c = mo95278c(context);
        c.setClipToPadding(false);
        this.f66423c = new C26792b(mo95039u().mo94687i(), c, this);
        C26789a aVar = new C26789a(mo95039u().mo94687i());
        c.setItemAnimator(null);
        this.f66421a = new C26801f(this, aVar);
        this.f66427h = new C26793c(context, c);
        return c;
    }

    @LynxUIMethod
    public void getVisibleCells(Callback callback) {
        if (callback == null) {
            LLog.m96425c("UIList2", "getVisibleCells with null callback");
            return;
        }
        callback.invoke(0, this.f66423c.mo95298b());
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setColumnCount(int i) {
        this.f66422b = i;
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.f66253Z).getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).mo6500a(this.f66422b);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) layoutManager).mo7247a(this.f66422b);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setEnablePagerSnap(AbstractC26517a aVar) {
        if (C26792b.m97258a(aVar, false)) {
            if (this.f66430k == null) {
                this.f66430k = new C1404s();
            }
            this.f66430k.attachToRecyclerView((RecyclerView) this.f66253Z);
            return;
        }
        AbstractC1409v vVar = this.f66430k;
        if (vVar != null) {
            vVar.attachToRecyclerView(null);
            this.f66430k = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setUpdateAnimation(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "none")) {
            ((RecyclerView) this.f66253Z).setItemAnimator(null);
        }
        if (TextUtils.equals(str, "default")) {
            ((RecyclerView) this.f66253Z).setItemAnimator(new C1363f());
        }
    }

    @LynxUIMethod
    public void scrollToPosition(ReadableMap readableMap) {
        int height;
        if (this.f66421a != null) {
            int i = readableMap.getInt("position", 0);
            int a = (int) C26955i.m97951a(readableMap.getDouble("offset", 0.0d));
            boolean z = readableMap.getBoolean("smooth", false);
            int a2 = (int) C26955i.m97951a(readableMap.getDouble("itemHeight", 0.0d));
            String string = readableMap.getString("alignTo", "none");
            if (z) {
                this.f66427h.mo95304a(i, string, a);
                return;
            }
            if (TextUtils.equals(string, "middle")) {
                height = (((RecyclerView) av()).getHeight() - a2) / 2;
            } else {
                if (TextUtils.equals(string, "bottom")) {
                    height = ((RecyclerView) av()).getHeight() - a2;
                }
                this.f66427h.mo95303a(i, a);
            }
            a += height;
            this.f66427h.mo95303a(i, a);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList, com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: c */
    public void mo95130c(LynxBaseUI lynxBaseUI, int i) {
        if (f66420e) {
            LLog.m96425c("UIList2", "insertChild index: " + i + " child: " + lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public AbstractC26623a mo94945a(float f, float f2) {
        AbstractC26623a aVar;
        C26799e eVar;
        UIComponent b;
        if (this.f66421a == null) {
            return this;
        }
        View$OnAttachStateChangeListenerC26795d dVar = this.f66432m;
        if (dVar != null) {
            aVar = dVar.mo95307a((int) f, (int) f2);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        View findChildViewUnder = ((RecyclerView) this.f66253Z).findChildViewUnder(f, f2);
        if (findChildViewUnder == null || (eVar = (C26799e) ((RecyclerView) this.f66253Z).getChildViewHolder(findChildViewUnder)) == null || (b = eVar.mo95320b()) == null) {
            return this;
        }
        return b.mo94945a(f - ((float) findChildViewUnder.getLeft()), f2 - ((float) findChildViewUnder.getTop()));
    }
}
