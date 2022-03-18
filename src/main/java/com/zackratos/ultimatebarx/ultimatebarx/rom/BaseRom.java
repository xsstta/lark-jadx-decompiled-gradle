package com.zackratos.ultimatebarx.ultimatebarx.rom;

import android.content.Context;
import com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68099b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H%J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0015¨\u0006\t"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/rom/BaseRom;", "Lcom/zackratos/ultimatebarx/ultimatebarx/rom/Rom;", "()V", "fullScreenGestureOn", "", "context", "Landroid/content/Context;", "navigationBarExist", "screenIndicatorOn", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.e.a */
public abstract class BaseRom implements Rom {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo237010b(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo237011c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return false;
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.rom.Rom
    /* renamed from: a */
    public boolean mo237009a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!mo237010b(context)) {
            return C68099b.m264692e(context);
        }
        if (mo237011c(context)) {
            return true;
        }
        return false;
    }
}
