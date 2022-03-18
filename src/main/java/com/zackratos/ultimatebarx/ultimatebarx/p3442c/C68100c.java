package com.zackratos.ultimatebarx.ultimatebarx.p3442c;

import android.text.TextUtils;
import com.zackratos.ultimatebarx.ultimatebarx.rom.EmuiRom;
import com.zackratos.ultimatebarx.ultimatebarx.rom.FuntouchRom;
import com.zackratos.ultimatebarx.ultimatebarx.rom.MiuiRom;
import com.zackratos.ultimatebarx.ultimatebarx.rom.OtherRom;
import com.zackratos.ultimatebarx.ultimatebarx.rom.Rom;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\b\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"getProp", "", "name", "getRom", "Lcom/zackratos/ultimatebarx/ultimatebarx/rom/Rom;", "ultimatebarx_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c.c */
public final class C68100c {
    /* renamed from: a */
    public static final Rom m264693a() {
        if (!TextUtils.isEmpty(m264694a("ro.miui.ui.version.name"))) {
            return new MiuiRom();
        }
        if (!TextUtils.isEmpty(m264694a("ro.build.version.emui"))) {
            return new EmuiRom();
        }
        if (!TextUtils.isEmpty(m264694a("ro.vivo.os.version"))) {
            return new FuntouchRom();
        }
        return new OtherRom();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[SYNTHETIC, Splitter:B:19:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String m264694a(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68100c.m264694a(java.lang.String):java.lang.String");
    }
}
