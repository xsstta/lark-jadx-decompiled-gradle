package com.ss.android.vc.entity.sketch;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/entity/sketch/SketchTransferMode;", "", "Lcom/ss/android/vc/entity/EnumInterface;", "value", "", "(Ljava/lang/String;II)V", "getNumber", "BY_DATA", "BY_VIDEO", "Companion", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum SketchTransferMode {
    BY_DATA(0),
    BY_VIDEO(1);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final SketchTransferMode fromNumber(int i) {
        return Companion.mo210160a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/entity/sketch/SketchTransferMode$Companion;", "", "()V", "fromNumber", "Lcom/ss/android/vc/entity/sketch/SketchTransferMode;", "value", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.sketch.SketchTransferMode$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SketchTransferMode mo210160a(int i) {
            if (i == 0) {
                return SketchTransferMode.BY_DATA;
            }
            if (i != 1) {
                return SketchTransferMode.BY_DATA;
            }
            return SketchTransferMode.BY_VIDEO;
        }
    }

    public int getNumber() {
        return this.value;
    }

    private SketchTransferMode(int i) {
        this.value = i;
    }
}
