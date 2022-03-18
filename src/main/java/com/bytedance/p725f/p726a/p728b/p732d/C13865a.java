package com.bytedance.p725f.p726a.p728b.p732d;

import android.content.Context;
import android.os.PowerManager;
import com.bytedance.p725f.p726a.p727a.AbstractC13853c;
import com.bytedance.p725f.p726a.p728b.AbstractC13858b;

/* renamed from: com.bytedance.f.a.b.d.a */
public class C13865a extends AbstractC13858b {

    /* renamed from: c */
    private PowerManager f36291c = ((PowerManager) this.f36253a.getSystemService("power"));

    /* renamed from: c */
    public int mo51151c() {
        PowerManager powerManager = this.f36291c;
        if (powerManager != null) {
            return powerManager.getCurrentThermalStatus();
        }
        return 0;
    }

    public C13865a(Context context, AbstractC13853c cVar) {
        super(context, cVar);
    }
}
