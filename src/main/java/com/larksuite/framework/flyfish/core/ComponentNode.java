package com.larksuite.framework.flyfish.core;

import android.view.View;
import com.facebook.yoga.YogaNode;
import com.larksuite.framework.flyfish.FFLog;
import com.larksuite.framework.flyfish.component.BaseComponent;
import com.larksuite.framework.flyfish.util.ViewUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 D2\u00020\u0001:\u0003DEFB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000&J\b\u0010'\u001a\u0004\u0018\u00010\nJ\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u0006J\u0006\u0010+\u001a\u00020\u0006J\u0006\u0010,\u001a\u00020\u0006J\b\u0010-\u001a\u0004\u0018\u00010.J\u0006\u0010/\u001a\u00020\u0006J\u0006\u00100\u001a\u00020\u0006J\u0006\u00101\u001a\u00020\u0003J\u0006\u00102\u001a\u00020\u0019J\u0006\u00103\u001a\u00020\u0019J\u0006\u00104\u001a\u00020\u0019J\u0006\u00105\u001a\u00020\u0019J\u000e\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u00020\u0019J\u0006\u0010:\u001a\u00020\u0019J\u000e\u0010;\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020\u0019J\u000e\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\nJ\u001e\u0010?\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0006J\b\u0010C\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/larksuite/framework/flyfish/core/ComponentNode;", "", "mYogaNode", "Lcom/facebook/yoga/YogaNode;", "(Lcom/facebook/yoga/YogaNode;)V", "mBottom", "", "mChildren", "", "mComponent", "Lcom/larksuite/framework/flyfish/component/BaseComponent;", "mComponentNodeToYogaNodeMap", "", "mLayoutStateCache", "", "Lcom/larksuite/framework/flyfish/core/ComponentNode$LayoutState;", "mLeft", "mMeasureFunction", "Lcom/facebook/yoga/YogaMeasureFunction;", "mMeasureHeight", "mMeasureWidth", "mParent", "mRight", "mTop", "addNode", "", "child", "index", "addNodeNoAffectYoga", "addViewToParent", "parent", "Lcom/larksuite/framework/flyfish/core/IViewOperateSupport;", "calculateLayout", "widthMeasureSpec", "heightMeasureSpec", "getBottom", "getChildCount", "getChildren", "", "getComponent", "getLayoutParam", "Landroid/view/ViewGroup$LayoutParams;", "getLeft", "getRight", "getTop", "getView", "Landroid/view/View;", "getYogaMeasureHeight", "getYogaMeasureWidth", "getYogaNode", "init", "makeComponentLayout", "makeComponentMeasure", "onBind", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMounted", "onUnmounted", "removeNode", "reset", "setComponent", "component", "setUpLayoutState", "tag", "xOffset", "yOffset", "toString", "Companion", "LayoutState", "YogaMeasureFunctionProxy", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.flyfish.core.a */
public final class ComponentNode {

    /* renamed from: a */
    public static final Companion f64302a = new Companion(null);

    /* renamed from: b */
    private final List<ComponentNode> f64303b;

    /* renamed from: c */
    private final Map<String, LayoutState> f64304c;

    /* renamed from: d */
    private ComponentNode f64305d;

    /* renamed from: e */
    private BaseComponent f64306e;

    /* renamed from: f */
    private int f64307f;

    /* renamed from: g */
    private int f64308g;

    /* renamed from: h */
    private int f64309h;

    /* renamed from: i */
    private int f64310i;

    /* renamed from: j */
    private int f64311j;

    /* renamed from: k */
    private int f64312k;

    /* renamed from: l */
    private YogaNode f64313l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\b"}, d2 = {"Lcom/larksuite/framework/flyfish/core/ComponentNode$Companion;", "", "()V", "create", "Lcom/larksuite/framework/flyfish/core/ComponentNode;", "yogaNode", "Lcom/facebook/yoga/YogaNode;", "obtain", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.core.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/larksuite/framework/flyfish/core/ComponentNode$LayoutState;", "", "()V", "bottom", "", "getBottom", "()I", "setBottom", "(I)V", "height", "getHeight", "setHeight", "left", "getLeft", "setLeft", "right", "getRight", "setRight", "top", "getTop", "setTop", "width", "getWidth", "setWidth", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.core.a$b */
    public static final class LayoutState {

        /* renamed from: a */
        private int f64314a;

        /* renamed from: b */
        private int f64315b;

        /* renamed from: c */
        private int f64316c;

        /* renamed from: d */
        private int f64317d;

        /* renamed from: e */
        private int f64318e;

        /* renamed from: f */
        private int f64319f;

        /* renamed from: a */
        public final int mo92384a() {
            return this.f64314a;
        }

        /* renamed from: b */
        public final int mo92386b() {
            return this.f64315b;
        }

        /* renamed from: c */
        public final int mo92388c() {
            return this.f64316c;
        }

        /* renamed from: d */
        public final int mo92390d() {
            return this.f64317d;
        }

        /* renamed from: e */
        public final int mo92392e() {
            return this.f64318e;
        }

        /* renamed from: f */
        public final int mo92394f() {
            return this.f64319f;
        }

        /* renamed from: a */
        public final void mo92385a(int i) {
            this.f64314a = i;
        }

        /* renamed from: b */
        public final void mo92387b(int i) {
            this.f64315b = i;
        }

        /* renamed from: c */
        public final void mo92389c(int i) {
            this.f64316c = i;
        }

        /* renamed from: d */
        public final void mo92391d(int i) {
            this.f64317d = i;
        }

        /* renamed from: e */
        public final void mo92393e(int i) {
            this.f64318e = i;
        }

        /* renamed from: f */
        public final void mo92395f(int i) {
            this.f64319f = i;
        }
    }

    /* renamed from: a */
    public final List<ComponentNode> mo92375a() {
        return this.f64303b;
    }

    /* renamed from: b */
    public final int mo92378b() {
        return this.f64307f;
    }

    /* renamed from: c */
    public final int mo92379c() {
        return this.f64308g;
    }

    /* renamed from: d */
    public final void mo92380d() {
        BaseComponent aVar = this.f64306e;
        if (aVar != null) {
            aVar.mo92369a(View.MeasureSpec.makeMeasureSpec(this.f64307f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f64308g, 1073741824));
        }
    }

    /* renamed from: e */
    public final void mo92381e() {
        FFLog.f64300b.mo92363a("FF_ComponentNode", "makeComponentLayout");
        BaseComponent aVar = this.f64306e;
        if (aVar != null) {
            aVar.mo92368a(this.f64309h, this.f64310i, this.f64311j, this.f64312k);
        }
    }

    /* renamed from: f */
    public final void mo92382f() {
        FFLog.f64300b.mo92363a("FF_ComponentNode", "onBind");
        BaseComponent aVar = this.f64306e;
        if (aVar != null) {
            aVar.mo92367a();
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentNode { \n mComponent=");
        sb.append(this.f64306e);
        sb.append(", \n mParentHashCode=");
        ComponentNode aVar = this.f64305d;
        if (aVar != null) {
            obj = Integer.valueOf(aVar.hashCode());
        } else {
            obj = "NULL";
        }
        sb.append(obj);
        sb.append(", \n childCount=");
        sb.append(this.f64303b.size());
        sb.append(", \n YogaNodeHashCode=");
        sb.append(this.f64313l.hashCode());
        sb.append(", \n hashCode=");
        sb.append(hashCode());
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo92376a(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.f64313l.setHeight((float) size2);
        }
        if (mode == 1073741824) {
            this.f64313l.setWidth((float) size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f64313l.setMaxHeight((float) size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f64313l.setMaxWidth((float) size);
        }
        FFLog.Companion aVar = FFLog.f64300b;
        aVar.mo92363a("FF_ComponentNode", "calculate layout, width = " + size + ", widthMode = " + ViewUtil.f64301a.mo92372a(i) + ", height = " + size2 + ", heightMode = " + ViewUtil.f64301a.mo92372a(i2));
        this.f64313l.calculateLayout(1.0E21f, 1.0E21f);
    }

    /* renamed from: a */
    public final void mo92377a(String str, int i, int i2) {
        LayoutState bVar;
        View view;
        int i3;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        if (this.f64304c.containsKey(str)) {
            LayoutState bVar2 = this.f64304c.get(str);
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            bVar = bVar2;
        } else {
            LayoutState bVar3 = new LayoutState();
            bVar3.mo92385a((int) this.f64313l.getLayoutWidth());
            bVar3.mo92387b((int) this.f64313l.getLayoutHeight());
            bVar3.mo92389c(Math.round(this.f64313l.getLayoutX()) + i);
            bVar3.mo92393e(Math.round(this.f64313l.getLayoutY()) + i2);
            bVar3.mo92391d(bVar3.mo92388c() + bVar3.mo92384a());
            bVar3.mo92395f(bVar3.mo92392e() + bVar3.mo92386b());
            this.f64304c.put(str, bVar3);
            bVar = bVar3;
        }
        this.f64307f = bVar.mo92384a();
        this.f64308g = bVar.mo92386b();
        this.f64309h = bVar.mo92388c();
        this.f64310i = bVar.mo92392e();
        this.f64311j = bVar.mo92390d();
        this.f64312k = bVar.mo92394f();
        FFLog.Companion aVar = FFLog.f64300b;
        aVar.mo92363a("FF_ComponentNode", "setUpLayoutState , mComponent = " + this.f64306e + ", measWidth = " + this.f64307f + ", measHeight = " + this.f64308g + ", mLeft  = " + this.f64309h + ", mTop = " + this.f64310i);
        BaseComponent aVar2 = this.f64306e;
        if (aVar2 != null) {
            view = aVar2.mo92370b();
        } else {
            view = null;
        }
        int i4 = 0;
        if (view == null) {
            i4 = this.f64309h;
            i3 = this.f64310i;
        } else {
            i3 = 0;
        }
        Iterator<T> it = this.f64303b.iterator();
        while (it.hasNext()) {
            it.next().mo92377a(str, i4, i3);
        }
    }
}
