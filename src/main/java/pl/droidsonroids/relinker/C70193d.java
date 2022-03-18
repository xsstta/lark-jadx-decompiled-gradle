package pl.droidsonroids.relinker;

import android.os.Build;
import com.C1711a;
import pl.droidsonroids.relinker.C70185b;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.relinker.d */
public final class C70193d implements C70185b.AbstractC70187b {
    C70193d() {
    }

    @Override // pl.droidsonroids.relinker.C70185b.AbstractC70187b
    /* renamed from: a */
    public String[] mo247338a() {
        if (Build.VERSION.SDK_INT >= 21 && Build.SUPPORTED_ABIS.length > 0) {
            return Build.SUPPORTED_ABIS;
        }
        if (!C70194e.m269009a(Build.CPU_ABI2)) {
            return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        }
        return new String[]{Build.CPU_ABI};
    }

    @Override // pl.droidsonroids.relinker.C70185b.AbstractC70187b
    /* renamed from: a */
    public void mo247337a(String str) {
        C1711a.m7628a(str);
    }

    @Override // pl.droidsonroids.relinker.C70185b.AbstractC70187b
    /* renamed from: b */
    public void mo247339b(String str) {
        System.load(str);
    }

    @Override // pl.droidsonroids.relinker.C70185b.AbstractC70187b
    /* renamed from: d */
    public String mo247341d(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // pl.droidsonroids.relinker.C70185b.AbstractC70187b
    /* renamed from: c */
    public String mo247340c(String str) {
        if (!str.startsWith("lib") || !str.endsWith(".so")) {
            return System.mapLibraryName(str);
        }
        return str;
    }
}
