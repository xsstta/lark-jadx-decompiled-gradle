package com.lynx.tasm.behavior;

import android.app.Activity;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.base.LLog;
import java.util.WeakHashMap;

/* renamed from: com.lynx.tasm.behavior.j */
public class C26681j {

    /* renamed from: b */
    private static volatile C26681j f66008b;

    /* renamed from: a */
    private WeakHashMap<AbstractC26684l, C26676i> f66009a = new WeakHashMap<>();

    private C26681j() {
    }

    /* renamed from: a */
    public static C26681j m96609a() {
        if (f66008b == null) {
            synchronized (C26681j.class) {
                if (f66008b == null) {
                    f66008b = new C26681j();
                }
            }
        }
        return f66008b;
    }

    /* renamed from: a */
    public void mo94644a(final AbstractC26684l lVar) {
        if (!(lVar.mo94680e() instanceof Activity)) {
            LLog.m96429e(LynxKitALogDelegate.f38587a, "context is not a Activity, KeyBoardEventDispatcher is not functional.");
        } else if (this.f66009a.containsKey(lVar)) {
            this.f66009a.get(lVar).mo94635a();
        } else {
            C26676i iVar = new C26676i(lVar);
            iVar.mo94635a();
            this.f66009a.put(lVar, iVar);
            lVar.mo94682f().addLynxViewClient(new AbstractC26911n() {
                /* class com.lynx.tasm.behavior.C26681j.C266821 */

                @Override // com.lynx.tasm.AbstractC26911n
                /* renamed from: e */
                public void mo11464e() {
                    super.mo11464e();
                    C26681j.this.mo94645b(lVar);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo94645b(AbstractC26684l lVar) {
        if (this.f66009a.size() == 1) {
            if (this.f66009a.get(lVar) != null) {
                this.f66009a.get(lVar).mo94636a(true);
            }
        } else if (this.f66009a.get(lVar) != null) {
            this.f66009a.get(lVar).mo94636a(false);
        }
        this.f66009a.remove(lVar);
    }
}
