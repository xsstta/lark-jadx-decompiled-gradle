package com.zackratos.ultimatebarx.ultimatebarx.rom;

import android.content.Context;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0015¨\u0006\u0007"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/rom/FuntouchRom;", "Lcom/zackratos/ultimatebarx/ultimatebarx/rom/BaseRom;", "()V", "fullScreenGestureOn", "", "context", "Landroid/content/Context;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.e.c */
public final class FuntouchRom extends BaseRom {
    /* access modifiers changed from: protected */
    @Override // com.zackratos.ultimatebarx.ultimatebarx.rom.BaseRom
    /* renamed from: b */
    public boolean mo237010b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", -1) > 0) {
            return true;
        }
        return false;
    }
}
