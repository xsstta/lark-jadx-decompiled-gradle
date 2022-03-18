package com.larksuite.component.ui.layout.plus;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.component.ui.layout.ILKUILayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/InnerPlusType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "createPlus", "Lcom/larksuite/component/ui/layout/plus/BaseInnerPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", GrsBaseInfo.CountryCodeSource.UNKNOWN, "PER_MONITOR_RENDER", "ROUND_SHAPE", "HOVER_EVENT_DISALLOW", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class InnerPlusType extends Enum<InnerPlusType> {
    private static final /* synthetic */ InnerPlusType[] $VALUES;
    public static final InnerPlusType HOVER_EVENT_DISALLOW;
    public static final InnerPlusType PER_MONITOR_RENDER;
    public static final InnerPlusType ROUND_SHAPE;
    public static final InnerPlusType UNKNOWN;
    private final int value;

    static {
        UNKNOWN dVar = new UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        UNKNOWN = dVar;
        PER_MONITOR_RENDER bVar = new PER_MONITOR_RENDER("PER_MONITOR_RENDER", 1);
        PER_MONITOR_RENDER = bVar;
        ROUND_SHAPE cVar = new ROUND_SHAPE("ROUND_SHAPE", 2);
        ROUND_SHAPE = cVar;
        HOVER_EVENT_DISALLOW aVar = new HOVER_EVENT_DISALLOW("HOVER_EVENT_DISALLOW", 3);
        HOVER_EVENT_DISALLOW = aVar;
        $VALUES = new InnerPlusType[]{dVar, bVar, cVar, aVar};
    }

    public static InnerPlusType valueOf(String str) {
        return (InnerPlusType) Enum.valueOf(InnerPlusType.class, str);
    }

    public static InnerPlusType[] values() {
        return (InnerPlusType[]) $VALUES.clone();
    }

    public abstract BaseInnerPlus createPlus(ILKUILayout iLKUILayout);

    public final int getValue() {
        return this.value;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/InnerPlusType$HOVER_EVENT_DISALLOW;", "Lcom/larksuite/component/ui/layout/plus/InnerPlusType;", "createPlus", "Lcom/larksuite/component/ui/layout/plus/HoverEventDisallowLKUIPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.InnerPlusType$a */
    static final class HOVER_EVENT_DISALLOW extends InnerPlusType {
        @Override // com.larksuite.component.ui.layout.plus.InnerPlusType
        public HoverEventDisallowLKUIPlus createPlus(ILKUILayout iLKUILayout) {
            Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
            return new HoverEventDisallowLKUIPlus(iLKUILayout);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        HOVER_EVENT_DISALLOW(String str, int i) {
            super(str, i, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/InnerPlusType$PER_MONITOR_RENDER;", "Lcom/larksuite/component/ui/layout/plus/InnerPlusType;", "createPlus", "Lcom/larksuite/component/ui/layout/plus/PerMonitorRenderLKUIPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.InnerPlusType$b */
    static final class PER_MONITOR_RENDER extends InnerPlusType {
        @Override // com.larksuite.component.ui.layout.plus.InnerPlusType
        public PerMonitorRenderLKUIPlus createPlus(ILKUILayout iLKUILayout) {
            Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
            return new PerMonitorRenderLKUIPlus(iLKUILayout);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        PER_MONITOR_RENDER(String str, int i) {
            super(str, i, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/InnerPlusType$ROUND_SHAPE;", "Lcom/larksuite/component/ui/layout/plus/InnerPlusType;", "createPlus", "Lcom/larksuite/component/ui/layout/plus/RoundShapeLKUIPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.InnerPlusType$c */
    static final class ROUND_SHAPE extends InnerPlusType {
        @Override // com.larksuite.component.ui.layout.plus.InnerPlusType
        public RoundShapeLKUIPlus createPlus(ILKUILayout iLKUILayout) {
            Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
            return new RoundShapeLKUIPlus(iLKUILayout);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ROUND_SHAPE(String str, int i) {
            super(str, i, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/InnerPlusType$UNKNOWN;", "Lcom/larksuite/component/ui/layout/plus/InnerPlusType;", "createPlus", "Lcom/larksuite/component/ui/layout/plus/BaseInnerPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.InnerPlusType$d */
    static final class UNKNOWN extends InnerPlusType {
        @Override // com.larksuite.component.ui.layout.plus.InnerPlusType
        public BaseInnerPlus createPlus(ILKUILayout iLKUILayout) {
            Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        UNKNOWN(String str, int i) {
            super(str, i, 0, null);
        }
    }

    private InnerPlusType(String str, int i, int i2) {
        this.value = i2;
    }

    public /* synthetic */ InnerPlusType(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2);
    }
}
