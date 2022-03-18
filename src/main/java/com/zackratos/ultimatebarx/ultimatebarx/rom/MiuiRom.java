package com.zackratos.ultimatebarx.ultimatebarx.rom;

import android.content.Context;
import android.provider.Settings;
import com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68099b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0015J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0015¨\u0006\b"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/rom/MiuiRom;", "Lcom/zackratos/ultimatebarx/ultimatebarx/rom/BaseRom;", "()V", "fullScreenGestureOn", "", "context", "Landroid/content/Context;", "screenIndicatorOn", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.e.d */
public final class MiuiRom extends BaseRom {
    /* access modifiers changed from: protected */
    @Override // com.zackratos.ultimatebarx.ultimatebarx.rom.BaseRom
    /* renamed from: b */
    public boolean mo237010b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", -1) > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.zackratos.ultimatebarx.ultimatebarx.rom.BaseRom
    /* renamed from: c */
    public boolean mo237011c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int b = C68099b.m264689b(context);
        int d = C68099b.m264691d(context);
        if (b <= 0 || d / b <= 30) {
            return false;
        }
        return true;
    }
}
