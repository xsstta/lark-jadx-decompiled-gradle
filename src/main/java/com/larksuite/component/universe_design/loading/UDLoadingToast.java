package com.larksuite.component.universe_design.loading;

import android.content.Context;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/larksuite/component/universe_design/loading/UDLoadingToast;", "", "()V", "DURATION_MAX", "", "makeToast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "context", "Landroid/content/Context;", "stringId", "", "text", "", "universe-ui-loading_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.d.b */
public final class UDLoadingToast {

    /* renamed from: a */
    public static final UDLoadingToast f63177a = new UDLoadingToast();

    private UDLoadingToast() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final UDToastImpl m92577a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return UDToast.build(context).mo91637a(i).mo91641a(new UDLoadingDrawable(context)).mo91640a(2147483647L).mo91655j();
    }
}
