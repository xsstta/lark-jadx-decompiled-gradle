package com.larksuite.framework.flyfish.util;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/larksuite/framework/flyfish/util/ViewUtil;", "", "()V", "Companion", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.flyfish.b.a */
public final class ViewUtil {

    /* renamed from: a */
    public static final Companion f64301a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/framework/flyfish/util/ViewUtil$Companion;", "", "()V", "getMeasureSpecModeStr", "", "measureSpec", "", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo92372a(int i) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == 1073741824) {
                return "MeasureSpec.EXACTLY";
            }
            if (mode == Integer.MIN_VALUE) {
                return "MeasureSpec.AT_MOST";
            }
            return "MeasureSpec.UNSPECIFIED";
        }
    }
}
