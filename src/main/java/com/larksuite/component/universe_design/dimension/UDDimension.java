package com.larksuite.component.universe_design.dimension;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/larksuite/component/universe_design/dimension/UDDimension;", "", "value", "", "(F)V", "getValue", "()F", "toPixels", "context", "Landroid/content/Context;", "Dp", "Px", "Sp", "Lcom/larksuite/component/universe_design/dimension/UDDimension$Dp;", "Lcom/larksuite/component/universe_design/dimension/UDDimension$Px;", "Lcom/larksuite/component/universe_design/dimension/UDDimension$Sp;", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.b.a */
public abstract class UDDimension {

    /* renamed from: a */
    private final float f63019a;

    /* renamed from: a */
    public abstract float mo90193a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo90192a() {
        return this.f63019a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/larksuite/component/universe_design/dimension/UDDimension$Dp;", "Lcom/larksuite/component/universe_design/dimension/UDDimension;", "value", "", "(I)V", "", "(F)V", "toPixels", "context", "Landroid/content/Context;", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.b.a$a */
    public static final class Dp extends UDDimension {
        public Dp(float f) {
            super(f, null);
        }

        public Dp(int i) {
            this((float) i);
        }

        @Override // com.larksuite.component.universe_design.dimension.UDDimension
        /* renamed from: a */
        public float mo90193a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            float a = mo90192a();
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            return TypedValue.applyDimension(1, a, resources.getDisplayMetrics());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/larksuite/component/universe_design/dimension/UDDimension$Px;", "Lcom/larksuite/component/universe_design/dimension/UDDimension;", "value", "", "(I)V", "", "(F)V", "toPixels", "context", "Landroid/content/Context;", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.b.a$b */
    public static final class Px extends UDDimension {
        public Px(float f) {
            super(f, null);
        }

        public Px(int i) {
            this((float) i);
        }

        @Override // com.larksuite.component.universe_design.dimension.UDDimension
        /* renamed from: a */
        public float mo90193a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return mo90192a();
        }
    }

    private UDDimension(float f) {
        this.f63019a = f;
    }

    public /* synthetic */ UDDimension(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }
}
