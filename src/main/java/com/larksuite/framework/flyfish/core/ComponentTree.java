package com.larksuite.framework.flyfish.core;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.flyfish.FFLog;
import com.larksuite.framework.flyfish.util.ViewUtil;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 G2\u00020\u0001:\u0002GHB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050.H\u0004J\b\u0010/\u001a\u0004\u0018\u00010\u0015J\u0012\u0010/\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u00100\u001a\u00020+J\u0018\u00101\u001a\u00020\r2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u00102\u001a\u00020'2\u0006\u00103\u001a\u000204H\u0016J(\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020+H\u0016J\u0018\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020+H\u0016J\u0010\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020'H\u0002J\u0006\u0010A\u001a\u00020'J\u000e\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020\u000fJ\u000e\u0010D\u001a\u00020'2\u0006\u0010E\u001a\u00020\u0015J\u0018\u0010D\u001a\u00020'2\b\b\u0001\u00100\u001a\u00020+2\u0006\u0010E\u001a\u00020\u0015J\b\u0010F\u001a\u00020'H\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006I"}, d2 = {"Lcom/larksuite/framework/flyfish/core/ComponentTree;", "Lcom/larksuite/framework/flyfish/core/IComponentTree;", "context", "Landroid/content/Context;", "mRoot", "Lcom/larksuite/framework/flyfish/core/ComponentNode;", "(Landroid/content/Context;Lcom/larksuite/framework/flyfish/core/ComponentNode;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "mCalculateCache", "", "", "mCalculateLayoutListener", "Lcom/larksuite/framework/flyfish/core/ComponentTree$ICalculateLayoutListener;", "getMCalculateLayoutListener", "()Lcom/larksuite/framework/flyfish/core/ComponentTree$ICalculateLayoutListener;", "setMCalculateLayoutListener", "(Lcom/larksuite/framework/flyfish/core/ComponentTree$ICalculateLayoutListener;)V", "mData", "", "getMData", "()Ljava/lang/Object;", "setMData", "(Ljava/lang/Object;)V", "mDatas", "Landroid/util/SparseArray;", "getMDatas", "()Landroid/util/SparseArray;", "setMDatas", "(Landroid/util/SparseArray;)V", "mGroupView", "Lcom/larksuite/framework/flyfish/core/GroupView;", "getMRoot", "()Lcom/larksuite/framework/flyfish/core/ComponentNode;", "setMRoot", "(Lcom/larksuite/framework/flyfish/core/ComponentNode;)V", "bindData", "", "calculateLayout", "", "widthMeasureSpec", "", "heightMeasureSpec", "getAllComponentNodes", "", "getData", "id", "key", "makeComponentDraw", "canvas", "Landroid/graphics/Canvas;", "makeComponentLayout", "l", "t", "r", C63954b.f161494a, "makeComponentMeasure", "measureWidth", "measureHeight", "mountComponents", "parent", "Lcom/larksuite/framework/flyfish/core/IViewOperateSupport;", "onUnmounted", "reset", "setCalculateLayoutListener", "listener", "setData", "obj", "setUp", "Companion", "ICalculateLayoutListener", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.flyfish.core.b */
public class ComponentTree implements IComponentTree {

    /* renamed from: a */
    public static final Companion f64320a = new Companion(null);

    /* renamed from: b */
    private Object f64321b;

    /* renamed from: c */
    private ICalculateLayoutListener f64322c;

    /* renamed from: d */
    private GroupView f64323d;

    /* renamed from: e */
    private final Set<String> f64324e;

    /* renamed from: f */
    private ComponentNode f64325f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/larksuite/framework/flyfish/core/ComponentTree$ICalculateLayoutListener;", "", "onCalculateFinished", "", "onMissedCache", "widthMeasureSpec", "", "heightMeasureSpec", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.core.b$b */
    public interface ICalculateLayoutListener {
        /* renamed from: a */
        void mo92404a();

        /* renamed from: a */
        void mo92405a(int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\n"}, d2 = {"Lcom/larksuite/framework/flyfish/core/ComponentTree$Companion;", "", "()V", "create", "Lcom/larksuite/framework/flyfish/core/ComponentTree;", "context", "Landroid/content/Context;", "component", "Lcom/larksuite/framework/flyfish/component/BaseComponent;", "obtain", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.core.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Object mo92403c() {
        return this.f64321b;
    }

    @Override // com.larksuite.framework.flyfish.core.IComponentTree
    /* renamed from: b */
    public void mo92401b() {
        Iterator<T> it = mo92396a().iterator();
        while (it.hasNext()) {
            it.next().mo92382f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<ComponentNode> mo92396a() {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.offer(this.f64325f);
        while (!linkedList.isEmpty()) {
            ComponentNode aVar = (ComponentNode) linkedList.poll();
            arrayList.add(aVar);
            Iterator<T> it = aVar.mo92375a().iterator();
            while (it.hasNext()) {
                linkedList.offer(it.next());
            }
        }
        FFLog.Companion aVar2 = FFLog.f64300b;
        aVar2.mo92363a("FF_ComponentTree", "getAllComponentNodes size = " + arrayList.size());
        return arrayList;
    }

    @Override // com.larksuite.framework.flyfish.core.IComponentTree
    /* renamed from: a */
    public void mo92398a(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        FFLog.f64300b.mo92363a("FF_ComponentTree", "makeComponentDraw");
        ICalculateLayoutListener bVar = this.f64322c;
        if (bVar != null) {
            bVar.mo92404a();
        }
    }

    @Override // com.larksuite.framework.flyfish.core.IComponentTree
    /* renamed from: a */
    public void mo92399a(IViewOperateSupport dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "parent");
        GroupView groupView = this.f64323d;
        if (groupView != null) {
            dVar.mo92354a(groupView, dVar.getChildCount(), new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* renamed from: c */
    private final String m94049c(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('-');
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.larksuite.framework.flyfish.core.IComponentTree
    /* renamed from: b */
    public void mo92402b(int i, int i2) {
        FFLog.f64300b.mo92363a("FF_ComponentTree", "makeComponentMeasure");
        GroupView groupView = this.f64323d;
        if (groupView != null) {
            groupView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }
        for (ComponentNode aVar : mo92396a()) {
            aVar.mo92380d();
        }
    }

    @Override // com.larksuite.framework.flyfish.core.IComponentTree
    /* renamed from: a */
    public int[] mo92400a(int i, int i2) {
        String c = m94049c(i, i2);
        if (this.f64324e.contains(c)) {
            FFLog.Companion aVar = FFLog.f64300b;
            aVar.mo92363a("FF_ComponentTree", "calculateLayout # has calculated layout, width = " + View.MeasureSpec.getSize(i) + ", widthMode = " + ViewUtil.f64301a.mo92372a(i) + ", height = " + View.MeasureSpec.getSize(i2) + ", heightMode = " + ViewUtil.f64301a.mo92372a(i2));
        } else {
            FFLog.Companion aVar2 = FFLog.f64300b;
            aVar2.mo92363a("FF_ComponentTree", "calculateLayout # need calculate layout, width = " + View.MeasureSpec.getSize(i) + ", widthMode = " + ViewUtil.f64301a.mo92372a(i) + ", height = " + View.MeasureSpec.getSize(i2) + ", heightMode = " + ViewUtil.f64301a.mo92372a(i2));
            ICalculateLayoutListener bVar = this.f64322c;
            if (bVar != null) {
                bVar.mo92405a(i, i2);
            }
            this.f64325f.mo92376a(i, i2);
            this.f64324e.add(c);
        }
        this.f64325f.mo92377a(c, 0, 0);
        return new int[]{this.f64325f.mo92378b(), this.f64325f.mo92379c()};
    }

    @Override // com.larksuite.framework.flyfish.core.IComponentTree
    /* renamed from: a */
    public void mo92397a(int i, int i2, int i3, int i4) {
        FFLog.f64300b.mo92363a("FF_ComponentTree", "makeComponentLayout");
        GroupView groupView = this.f64323d;
        if (groupView != null) {
            groupView.layout(i, i2, i3, i4);
        }
        for (ComponentNode aVar : mo92396a()) {
            aVar.mo92381e();
        }
    }
}
