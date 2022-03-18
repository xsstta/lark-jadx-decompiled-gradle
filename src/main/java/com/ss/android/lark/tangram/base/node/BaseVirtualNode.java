package com.ss.android.lark.tangram.base.node;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.tangram.base.node.IVirtualNode;
import com.ss.android.lark.tangram.base.props.Props;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.tangram.base.style.ValueType;
import com.ss.android.lark.tangram.engine.TangramNative;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010G\u001a\u000200J\u000e\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020\fJ\b\u0010L\u001a\u00020\u0000H&J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0000J\b\u0010O\u001a\u00020PH\u0016J\n\u0010Q\u001a\u0004\u0018\u00010JH&J\u0010\u0010R\u001a\u00020S2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010T\u001a\u00020S2\u0006\u0010I\u001a\u00020JH\u0016J\u0013\u0010U\u001a\u00020\f2\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010W\u001a\u00020SH&J\u0012\u0010X\u001a\u00020Y2\b\u0010(\u001a\u0004\u0018\u00010ZH\u0002J\u0012\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u0002J\u0010\u0010_\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u0000H&J\u0006\u0010`\u001a\u00020\fJ\u0018\u0010a\u001a\u0002002\u0006\u0010b\u001a\u00020Y2\u0006\u0010c\u001a\u00020YH&J\u0010\u0010d\u001a\u00020S2\u0006\u0010N\u001a\u00020\u0000H&J\u0006\u0010e\u001a\u00020SJ\u000e\u0010f\u001a\u00020\u001a2\u0006\u0010g\u001a\u00020\u001aJ\u000e\u0010h\u001a\u00020S2\u0006\u0010i\u001a\u00020PJ\u0010\u0010j\u001a\u00020S2\u0006\u0010I\u001a\u00020JH&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0013j\b\u0012\u0004\u0012\u00020\u0000`\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R$\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f8F@FX\u000e¢\u0006\f\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%R\u001a\u0010+\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R\u001a\u0010-\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010#\"\u0004\b/\u0010%R$\u00101\u001a\u0002002\u0006\u0010(\u001a\u000200@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010(\u001a\u000206@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010E¨\u0006k"}, d2 = {"Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "", "uniqueId", "", "viewTypeIdentity", "ability", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode;", "style", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "props", "Lcom/ss/android/lark/tangram/base/props/Props;", "isVirtualBranch", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/tangram/base/node/IVirtualNode;Lcom/ss/android/lark/tangram/base/style/TCStyle;Lcom/ss/android/lark/tangram/base/props/Props;Z)V", "getAbility", "()Lcom/ss/android/lark/tangram/base/node/IVirtualNode;", "setAbility", "(Lcom/ss/android/lark/tangram/base/node/IVirtualNode;)V", "children", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "currentParentSize", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "getCurrentParentSize", "()Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "setCurrentParentSize", "(Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;)V", "currentSize", "getCurrentSize", "setCurrentSize", "isFrameChange", "()Z", "setFrameChange", "(Z)V", "isHidden", "setHidden", "value", "isNeedUpdate", "setNeedUpdate", "isParentOriginChange", "setParentOriginChange", "isSelfSizing", "setSelfSizing", "setVirtualBranch", "Landroid/graphics/RectF;", "nodeFrame", "getNodeFrame", "()Landroid/graphics/RectF;", "setNodeFrame", "(Landroid/graphics/RectF;)V", "Landroid/graphics/PointF;", "parentNodeOrigin", "getParentNodeOrigin", "()Landroid/graphics/PointF;", "setParentNodeOrigin", "(Landroid/graphics/PointF;)V", "getProps", "()Lcom/ss/android/lark/tangram/base/props/Props;", "setProps", "(Lcom/ss/android/lark/tangram/base/props/Props;)V", "getStyle", "()Lcom/ss/android/lark/tangram/base/style/TCStyle;", "setStyle", "(Lcom/ss/android/lark/tangram/base/style/TCStyle;)V", "getUniqueId", "()Ljava/lang/String;", "getViewTypeIdentity", "boundingRect", "canUpdate", "view", "Landroid/view/View;", "canUpdateSize", "clone", "copy", "node", "createNativeNode", "", "createView", "didMount", "", "didUnMount", "equals", "other", "free", "getSizeValue", "", "Lcom/ss/android/lark/tangram/base/style/Value;", "getSizeValueType", "", "valueType", "Lcom/ss/android/lark/tangram/base/style/ValueType;", "isDataChange", "isLeaf", "layout", "oriWidth", "oriHeight", "merge", "resetIsChange", "sizeToFit", "size", "syncStyle2NativeNode", "nativePointer", "updateView", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.d.a */
public abstract class BaseVirtualNode {

    /* renamed from: a */
    private boolean f136631a;

    /* renamed from: b */
    private boolean f136632b;

    /* renamed from: c */
    private ArrayList<BaseVirtualNode> f136633c = new ArrayList<>();

    /* renamed from: d */
    private IVirtualNode.RectSize f136634d = new IVirtualNode.RectSize(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: e */
    private IVirtualNode.RectSize f136635e = new IVirtualNode.RectSize(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: f */
    private boolean f136636f;

    /* renamed from: g */
    private boolean f136637g;

    /* renamed from: h */
    private RectF f136638h = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: i */
    private PointF f136639i = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: j */
    private final String f136640j;

    /* renamed from: k */
    private final String f136641k;

    /* renamed from: l */
    private IVirtualNode f136642l;

    /* renamed from: m */
    private TCStyle f136643m;

    /* renamed from: n */
    private Props f136644n;

    /* renamed from: o */
    private boolean f136645o;

    /* renamed from: a */
    public long mo126290a() {
        return 0;
    }

    /* renamed from: c */
    public abstract void mo188757c(View view);

    /* renamed from: d */
    public final void mo188761d(boolean z) {
    }

    /* renamed from: n */
    public abstract View mo188773n();

    /* renamed from: p */
    public abstract BaseVirtualNode mo188775p();

    /* renamed from: d */
    public final ArrayList<BaseVirtualNode> mo188760d() {
        return this.f136633c;
    }

    /* renamed from: e */
    public final IVirtualNode.RectSize mo188762e() {
        return this.f136634d;
    }

    /* renamed from: f */
    public final IVirtualNode.RectSize mo188765f() {
        return this.f136635e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo188766g() {
        return this.f136636f;
    }

    /* renamed from: i */
    public final RectF mo188768i() {
        return this.f136638h;
    }

    /* renamed from: j */
    public final PointF mo188769j() {
        return this.f136639i;
    }

    /* renamed from: q */
    public final String mo188776q() {
        return this.f136640j;
    }

    /* renamed from: r */
    public final String mo188777r() {
        return this.f136641k;
    }

    /* renamed from: s */
    public final IVirtualNode mo188778s() {
        return this.f136642l;
    }

    /* renamed from: t */
    public final TCStyle mo188779t() {
        return this.f136643m;
    }

    /* renamed from: u */
    public final Props mo188780u() {
        return this.f136644n;
    }

    /* renamed from: v */
    public final boolean mo188781v() {
        return this.f136645o;
    }

    /* renamed from: a */
    public final void mo188751a(boolean z) {
        this.f136631a = z;
    }

    /* renamed from: l */
    public final boolean mo188771l() {
        return this.f136633c.isEmpty();
    }

    /* renamed from: b */
    public final boolean mo188754b() {
        return this.f136631a;
    }

    /* renamed from: c */
    public final boolean mo188759c() {
        return this.f136632b;
    }

    /* renamed from: k */
    public final boolean mo188770k() {
        IVirtualNode bVar = this.f136642l;
        if (bVar != null) {
            return bVar.mo188740j();
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo188767h() {
        boolean z;
        if (!this.f136636f && !this.f136637g && !this.f136644n.isDataChange()) {
            TCStyle tCStyle = this.f136643m;
            if (tCStyle != null) {
                z = tCStyle.isDataChange();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final void mo188774o() {
        this.f136637g = false;
        this.f136636f = false;
        TCStyle tCStyle = this.f136643m;
        if (tCStyle != null) {
            tCStyle.setDataChange(false);
        }
        this.f136644n.setDataChange(false);
    }

    /* renamed from: m */
    public final RectF mo188772m() {
        return new RectF(this.f136638h.left + this.f136639i.x, this.f136638h.top + this.f136639i.y, this.f136638h.right + this.f136639i.x, this.f136638h.bottom + this.f136639i.y);
    }

    /* renamed from: b */
    public final void mo188753b(boolean z) {
        this.f136632b = z;
    }

    /* renamed from: a */
    public final void mo188748a(IVirtualNode.RectSize aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f136634d = aVar;
    }

    /* renamed from: b */
    public final void mo188752b(IVirtualNode.RectSize aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f136635e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo188758c(boolean z) {
        this.f136636f = z;
    }

    /* renamed from: e */
    public final void mo188763e(boolean z) {
        this.f136645o = z;
    }

    /* renamed from: a */
    private final float m214731a(Value value) {
        Float value2;
        if (value == null || (value2 = value.getValue()) == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return value2.floatValue();
    }

    /* renamed from: a */
    private final int m214732a(ValueType valueType) {
        if (valueType == null) {
            valueType = ValueType.AUTO;
        }
        return valueType.getValue();
    }

    /* renamed from: b */
    public final boolean mo188755b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        IVirtualNode bVar = this.f136642l;
        if (bVar != null) {
            return bVar.mo126284b(view);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo188745a(PointF pointF) {
        Intrinsics.checkParameterIsNotNull(pointF, "value");
        if (!Intrinsics.areEqual(this.f136639i, pointF)) {
            this.f136637g = true;
            this.f136639i = pointF;
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.tangram.base.node.BaseVirtualNode");
        } else if (!Intrinsics.areEqual(this.f136640j, ((BaseVirtualNode) obj).f136640j)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo188746a(RectF rectF) {
        Intrinsics.checkParameterIsNotNull(rectF, "value");
        if (!Intrinsics.areEqual(this.f136638h, rectF)) {
            this.f136636f = true;
            this.f136638h = rectF;
        }
    }

    /* renamed from: c */
    public final IVirtualNode.RectSize mo188756c(IVirtualNode.RectSize aVar) {
        IVirtualNode.RectSize aVar2;
        IVirtualNode.RectSize aVar3;
        float f;
        TCStyle tCStyle;
        Intrinsics.checkParameterIsNotNull(aVar, "size");
        if (!this.f136644n.isDataChange() && (((tCStyle = this.f136643m) == null || !tCStyle.isDataChange()) && Intrinsics.areEqual(aVar, this.f136635e))) {
            return new IVirtualNode.RectSize(this.f136634d.mo188782a(), this.f136634d.mo188783b());
        }
        IVirtualNode bVar = this.f136642l;
        if (bVar != null) {
            aVar2 = bVar.mo126270a(aVar);
        } else {
            aVar2 = null;
        }
        this.f136635e = aVar;
        if (aVar2 != null) {
            aVar3 = aVar2;
        } else {
            aVar3 = this.f136634d;
        }
        this.f136634d = aVar3;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (aVar2 != null) {
            f = aVar2.mo188782a();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (aVar2 != null) {
            f2 = aVar2.mo188783b();
        }
        return new IVirtualNode.RectSize(f, f2);
    }

    /* renamed from: a */
    public final void mo188744a(long j) {
        float f;
        Value value;
        ValueType valueType;
        Value value2;
        ValueType valueType2;
        ValueType valueType3;
        ValueType valueType4;
        ValueType valueType5;
        TCStyle tCStyle = this.f136643m;
        if (tCStyle != null) {
            Float value3 = tCStyle.getScaleWidth().getValue();
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (value3 != null) {
                f = value3.floatValue();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f3 = (float) 0;
            if (f > f3) {
                value = tCStyle.getScaleWidth();
            } else {
                value = tCStyle.getWidth();
            }
            float a = m214731a(value);
            Value width = tCStyle.getWidth();
            ValueType valueType6 = null;
            if (width != null) {
                valueType = width.getValueType();
            } else {
                valueType = null;
            }
            TangramNative.setStyleWidth(j, a, m214732a(valueType));
            Float value4 = tCStyle.getScaleHeight().getValue();
            if (value4 != null) {
                f2 = value4.floatValue();
            }
            if (f2 > f3) {
                value2 = tCStyle.getScaleHeight();
            } else {
                value2 = tCStyle.getHeight();
            }
            float a2 = m214731a(value2);
            Value height = tCStyle.getHeight();
            if (height != null) {
                valueType2 = height.getValueType();
            } else {
                valueType2 = null;
            }
            TangramNative.setStyleHeight(j, a2, m214732a(valueType2));
            float a3 = m214731a(tCStyle.getMaxHeight());
            Value maxHeight = tCStyle.getMaxHeight();
            if (maxHeight != null) {
                valueType3 = maxHeight.getValueType();
            } else {
                valueType3 = null;
            }
            TangramNative.setStyleMaxHeight(j, a3, m214732a(valueType3));
            float a4 = m214731a(tCStyle.getMaxWidth());
            Value maxWidth = tCStyle.getMaxWidth();
            if (maxWidth != null) {
                valueType4 = maxWidth.getValueType();
            } else {
                valueType4 = null;
            }
            TangramNative.setStyleMaxWidth(j, a4, m214732a(valueType4));
            float a5 = m214731a(tCStyle.getMinWidth());
            Value minWidth = tCStyle.getMinWidth();
            if (minWidth != null) {
                valueType5 = minWidth.getValueType();
            } else {
                valueType5 = null;
            }
            TangramNative.setStyleMinWidth(j, a5, m214732a(valueType5));
            float a6 = m214731a(tCStyle.getMinHeight());
            Value minHeight = tCStyle.getMinHeight();
            if (minHeight != null) {
                valueType6 = minHeight.getValueType();
            }
            TangramNative.setStyleMinHeight(j, a6, m214732a(valueType6));
            TangramNative.setStyleAspectRatio(j, tCStyle.getAspectRatio());
            TangramNative.setStyleGrowWeight(j, tCStyle.getGrowWeight());
            TangramNative.setStyleShrinkWeight(j, tCStyle.getShrinkWeight());
        }
    }

    /* renamed from: a */
    public void mo188747a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        IVirtualNode bVar = this.f136642l;
        if (bVar != null) {
            bVar.mo188741k();
        }
    }

    /* renamed from: a */
    public final void mo188749a(IVirtualNode bVar) {
        this.f136642l = bVar;
    }

    /* renamed from: a */
    public final void mo188750a(ArrayList<BaseVirtualNode> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f136633c = arrayList;
    }

    public BaseVirtualNode(String str, String str2, IVirtualNode bVar, TCStyle tCStyle, Props props, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueId");
        Intrinsics.checkParameterIsNotNull(str2, "viewTypeIdentity");
        Intrinsics.checkParameterIsNotNull(props, "props");
        this.f136640j = str;
        this.f136641k = str2;
        this.f136642l = bVar;
        this.f136643m = tCStyle;
        this.f136644n = props;
        this.f136645o = z;
    }
}
