package com.ss.android.lark.tangram.base.node;

import android.graphics.RectF;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/tangram/base/node/IVirtualNode;", "", "canUpdateSize", "", "canUpdateView", "view", "Landroid/view/View;", "componentDidMount", "", "componentUnMount", "createView", "size", "Landroid/graphics/RectF;", "sizeToFit", "Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "updateView", "RectSize", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.d.b */
public interface IVirtualNode {
    /* renamed from: a */
    View mo126262a(RectF rectF);

    /* renamed from: a */
    RectSize mo126270a(RectSize aVar);

    /* renamed from: b */
    boolean mo126284b(View view);

    /* renamed from: c */
    void mo188738c(View view);

    /* renamed from: j */
    boolean mo188740j();

    /* renamed from: k */
    void mo188741k();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/tangram/base/node/IVirtualNode$RectSize;", "", "width", "", "height", "(FF)V", "getHeight", "()F", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.tangram.base.d.b$a */
    public static final class RectSize {

        /* renamed from: a */
        private final float f136646a;

        /* renamed from: b */
        private final float f136647b;

        public RectSize() {
            this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RectSize)) {
                return false;
            }
            RectSize aVar = (RectSize) obj;
            return Float.compare(this.f136646a, aVar.f136646a) == 0 && Float.compare(this.f136647b, aVar.f136647b) == 0;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f136646a) * 31) + Float.floatToIntBits(this.f136647b);
        }

        public String toString() {
            return "RectSize(width=" + this.f136646a + ", height=" + this.f136647b + ")";
        }

        /* renamed from: a */
        public final float mo188782a() {
            return this.f136646a;
        }

        /* renamed from: b */
        public final float mo188783b() {
            return this.f136647b;
        }

        public RectSize(float f, float f2) {
            this.f136646a = f;
            this.f136647b = f2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RectSize(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f2);
        }
    }
}
