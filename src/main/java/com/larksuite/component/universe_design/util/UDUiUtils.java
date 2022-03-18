package com.larksuite.component.universe_design.util;

import android.content.Context;
import android.graphics.Point;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/util/UDUiUtils;", "", "()V", "getHeight", "", "view", "Landroid/view/View;", "getScreenSize", "Landroid/util/Size;", "context", "Landroid/content/Context;", "getWidth", "universe-ui-core_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.util.i */
public final class UDUiUtils {

    /* renamed from: a */
    public static final UDUiUtils f63894a = new UDUiUtils();

    private UDUiUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Size m93321a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return new Size(point.x, point.y);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
