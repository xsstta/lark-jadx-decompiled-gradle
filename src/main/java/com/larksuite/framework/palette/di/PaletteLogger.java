package com.larksuite.framework.palette.di;

import android.util.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/larksuite/framework/palette/di/PaletteLogger;", "", "()V", "sLog", "Lcom/larksuite/framework/palette/di/IPaletteLog;", C63690d.f160779a, "", "tag", "", "msg", "e", "i", "setLog", "log", "w", "palette_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.palette.c.d */
public final class PaletteLogger {

    /* renamed from: a */
    public static final PaletteLogger f64459a = new PaletteLogger();

    /* renamed from: b */
    private static IPaletteLog f64460b;

    private PaletteLogger() {
    }

    /* renamed from: a */
    public final void mo92651a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        IPaletteLog bVar = f64460b;
        if (bVar != null) {
            bVar.mo92648a(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo92652b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        IPaletteLog bVar = f64460b;
        if (bVar != null) {
            bVar.mo92649b(str, str2);
        } else {
            Log.d(str, str2);
        }
    }
}
