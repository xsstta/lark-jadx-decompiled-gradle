package com.ss.android.lark.tangram.base.render;

import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.tangram.base.component.IComponent;
import com.ss.android.lark.tangram.base.node.BaseVirtualNode;
import com.ss.android.lark.tangram.base.render.Patch;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.tangram.engine.TangramNative;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 A2\u00020\u0001:\u0002ABB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u000bH\u0016J\u001a\u0010'\u001a\u0004\u0018\u00010\u001d2\u0006\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0002J&\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010,\u001a\u00020\u0011H\u0002J\u001e\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0002J\u0010\u00104\u001a\u0002012\u0006\u00103\u001a\u00020\u001dH\u0002J\b\u00105\u001a\u000201H\u0016J\b\u00106\u001a\u000201H\u0002J\u0018\u00107\u001a\u0002012\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001dH\u0002J\u0018\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\u001d2\u0006\u00108\u001a\u000209H\u0002J\b\u0010=\u001a\u000201H\u0002J\u0010\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020\u0003H\u0016J\b\u0010@\u001a\u000201H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/ss/android/lark/tangram/base/render/Render;", "Lcom/ss/android/lark/tangram/base/render/IRender;", "rootComponent", "Lcom/ss/android/lark/tangram/base/component/IComponent;", "callback", "Lcom/ss/android/lark/tangram/base/render/Render$OnAnchorViewDestroyCallback;", "containerWidth", "", "containerHeight", "(Lcom/ss/android/lark/tangram/base/component/IComponent;Lcom/ss/android/lark/tangram/base/render/Render$OnAnchorViewDestroyCallback;II)V", "bindView", "Landroid/view/View;", "getBindView", "()Landroid/view/View;", "setBindView", "(Landroid/view/View;)V", "bindViewUniqueId", "", "boundingRect", "Landroid/graphics/RectF;", "getBoundingRect", "()Landroid/graphics/RectF;", "setBoundingRect", "(Landroid/graphics/RectF;)V", "getContainerHeight", "()I", "getContainerWidth", "renderTree", "Lcom/ss/android/lark/tangram/base/render/RenderTree;", "Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "rootStyle", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "getRootStyle", "()Lcom/ss/android/lark/tangram/base/style/TCStyle;", "setRootStyle", "(Lcom/ss/android/lark/tangram/base/style/TCStyle;)V", "vNode", "bind", "view", "findAndReplace", "rootNode", "subNode", "findRootDirtyRenderTree", "rootRenderer", "uniqueId", "getView", "containerView", "layout", "markDataIsChange", "", "oldNode", "newNode", "markNewData", "render", "resetMarkDirty", "syncChildNodeFrame", "nativePointer", "", "node", "transformTLNode", "parentNode", "unBind", "update", "component", "vNode2TLNode", "Companion", "OnAnchorViewDestroyCallback", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.e.d */
public final class Render implements IRender {

    /* renamed from: a */
    public static final Companion f136650a = new Companion(null);

    /* renamed from: b */
    private final String f136651b;

    /* renamed from: c */
    private BaseVirtualNode f136652c;

    /* renamed from: d */
    private RenderTree<BaseVirtualNode> f136653d;

    /* renamed from: e */
    private RectF f136654e = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: f */
    private View f136655f;

    /* renamed from: g */
    private TCStyle f136656g;

    /* renamed from: h */
    private final OnAnchorViewDestroyCallback f136657h;

    /* renamed from: i */
    private final int f136658i;

    /* renamed from: j */
    private final int f136659j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tangram/base/render/Render$OnAnchorViewDestroyCallback;", "", "onAnchorViewDestroy", "", "onComponentNotFindError", "component", "Lcom/ss/android/lark/tangram/base/component/IComponent;", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.tangram.base.e.d$b */
    public interface OnAnchorViewDestroyCallback {
        /* renamed from: a */
        void mo122981a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tangram/base/render/Render$Companion;", "", "()V", "TAG", "", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.tangram.base.e.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    private final void m214796c() {
        this.f136655f = null;
    }

    /* renamed from: b */
    private final void m214795b() {
        long a = this.f136652c.mo126290a();
        m214794a(this.f136652c, a);
        float[] calculateLayout = TangramNative.calculateLayout(a, (float) this.f136658i, (float) this.f136659j);
        this.f136652c.mo188746a(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, calculateLayout[0], calculateLayout[1]));
        m214793a(a, this.f136652c);
        TangramNative.deepFreeNode(a);
        TangramNative.hashMap.remove(this.f136652c.mo188776q());
    }

    /* renamed from: d */
    private final void m214797d() {
        this.f136652c.mo188774o();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f136652c.mo188760d());
        while (!linkedList.isEmpty()) {
            BaseVirtualNode aVar = (BaseVirtualNode) linkedList.removeFirst();
            aVar.mo188774o();
            linkedList.addAll(aVar.mo188760d());
        }
    }

    @Override // com.ss.android.lark.tangram.base.render.IRender
    /* renamed from: a */
    public void mo188789a() {
        if (this.f136655f == null) {
            OnAnchorViewDestroyCallback bVar = this.f136657h;
            if (bVar != null) {
                bVar.mo122981a();
            }
        } else if (this.f136653d.mo188794b().mo188754b()) {
            View view = this.f136655f;
            if (view == null) {
                Intrinsics.throwNpe();
            }
            view.setVisibility(8);
        } else {
            View view2 = this.f136655f;
            if (view2 == null) {
                Intrinsics.throwNpe();
            }
            view2.setVisibility(0);
            Patch.Companion aVar = Patch.f136649a;
            RenderTree<BaseVirtualNode> fVar = this.f136653d;
            View view3 = this.f136655f;
            if (view3 == null) {
                Intrinsics.throwNpe();
            }
            aVar.mo188791a(fVar, view3, false);
        }
    }

    /* renamed from: a */
    public IRender mo188792a(View view) {
        Render dVar;
        Intrinsics.checkParameterIsNotNull(view, "view");
        WeakReference<Render> weakReference = C55355e.m214801a().get(Integer.valueOf(view.hashCode()));
        if (weakReference != null) {
            dVar = weakReference.get();
        } else {
            dVar = null;
        }
        Log.i("Render", "bind: oldRender:" + String.valueOf(dVar));
        if (dVar != null) {
            dVar.m214796c();
        }
        this.f136655f = view;
        if (view == null) {
            Intrinsics.throwNpe();
        }
        view.setTag(R.id.virtual_node_id, this.f136651b);
        C55355e.m214801a().put(Integer.valueOf(view.hashCode()), new WeakReference<>(this));
        Log.i("Render", "bind: this " + this);
        return this;
    }

    /* renamed from: a */
    private final void m214794a(BaseVirtualNode aVar, long j) {
        int size = aVar.mo188760d().size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = aVar.mo188760d().get(i).mo126290a();
            BaseVirtualNode aVar2 = aVar.mo188760d().get(i);
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "parentNode.children[i]");
            m214794a(aVar2, jArr[i]);
        }
        TangramNative.setNodeChildren(j, jArr, size);
    }

    /* renamed from: a */
    private final void m214793a(long j, BaseVirtualNode aVar) {
        long[] nodeChildren = TangramNative.getNodeChildren(j);
        Intrinsics.checkExpressionValueIsNotNull(nodeChildren, "nodeChildren");
        int length = nodeChildren.length;
        for (int i = 0; i < length; i++) {
            float[] nodeFrame = TangramNative.getNodeFrame(nodeChildren[i]);
            aVar.mo188760d().get(i).mo188746a(new RectF(nodeFrame[0], nodeFrame[1], nodeFrame[2], nodeFrame[3]));
            long j2 = nodeChildren[i];
            BaseVirtualNode aVar2 = aVar.mo188760d().get(i);
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "node.children[i]");
            m214793a(j2, aVar2);
            TangramNative.hashMap.remove(aVar.mo188760d().get(i).mo188776q());
        }
    }

    public Render(IComponent cVar, OnAnchorViewDestroyCallback bVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(cVar, "rootComponent");
        this.f136657h = bVar;
        this.f136658i = i;
        this.f136659j = i2;
        this.f136651b = cVar.mo188729e();
        this.f136652c = cVar.av_();
        this.f136656g = cVar.mo188733h();
        m214795b();
        BaseVirtualNode p = this.f136652c.mo188775p();
        m214797d();
        RenderTree<BaseVirtualNode> a = Patch.f136649a.mo188790a(p);
        this.f136653d = a;
        this.f136654e = a.mo188794b().mo188772m();
    }
}
