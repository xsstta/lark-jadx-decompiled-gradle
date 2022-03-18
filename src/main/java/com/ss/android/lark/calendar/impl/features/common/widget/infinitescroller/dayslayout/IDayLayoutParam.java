package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout;

import android.graphics.Rect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam;", "", "getLayerHeight", "", "getLayerInfo", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam$LayersInfo;", "getLayerWidth", "getLeftMargin", "getShowRect", "Landroid/graphics/Rect;", "getTopMargin", "LayersInfo", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.b */
public interface IDayLayoutParam {
    /* renamed from: a */
    int mo113323a();

    /* renamed from: b */
    int mo113324b();

    /* renamed from: c */
    int mo113325c();

    /* renamed from: d */
    int mo113326d();

    /* renamed from: e */
    LayersInfo mo113327e();

    /* renamed from: f */
    Rect mo113328f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam$LayersInfo;", "", "visibleLayers", "", "cacheLayers", "(II)V", "getCacheLayers", "()I", "layersSum", "getLayersSum", "getVisibleLayers", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.b$a */
    public static final class LayersInfo {

        /* renamed from: a */
        private final int f79047a;

        /* renamed from: b */
        private final int f79048b;

        /* renamed from: c */
        private final int f79049c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayersInfo)) {
                return false;
            }
            LayersInfo aVar = (LayersInfo) obj;
            return this.f79048b == aVar.f79048b && this.f79049c == aVar.f79049c;
        }

        public int hashCode() {
            return (this.f79048b * 31) + this.f79049c;
        }

        public String toString() {
            return "LayersInfo(visibleLayers=" + this.f79048b + ", cacheLayers=" + this.f79049c + ")";
        }

        /* renamed from: a */
        public final int mo113329a() {
            return this.f79047a;
        }

        /* renamed from: b */
        public final int mo113330b() {
            return this.f79049c;
        }

        public LayersInfo(int i, int i2) {
            this.f79048b = i;
            this.f79049c = i2;
            this.f79047a = i + (i2 * 2);
        }
    }
}
