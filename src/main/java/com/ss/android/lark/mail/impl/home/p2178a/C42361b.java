package com.ss.android.lark.mail.impl.home.p2178a;

import android.content.Context;
import android.view.View;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.home.p2178a.C42369e;
import com.ss.android.lark.mail.impl.home.p2178a.C42379g;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.maincore.AbstractC44548e;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.a.b */
public class C42361b implements C42379g.AbstractC42381b.AbstractC42382a {

    /* renamed from: a */
    C42369e f107834a;

    /* renamed from: b */
    C42374f f107835b;

    /* renamed from: c */
    private Context f107836c;

    /* renamed from: d */
    private AbstractC44548e f107837d;

    /* renamed from: b */
    public void mo152521b() {
        this.f107834a.destroy();
    }

    /* renamed from: a */
    public boolean mo152520a() {
        C42374f fVar = this.f107835b;
        if (fVar == null || !fVar.mo152542b()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.home.p2178a.C42379g.AbstractC42381b.AbstractC42382a
    /* renamed from: a */
    public void mo152519a(boolean z) {
        if (!z) {
            this.f107835b = null;
        }
    }

    /* renamed from: a */
    public void mo152518a(AbstractC44548e eVar) {
        this.f107837d = eVar;
        C42374f fVar = this.f107835b;
        if (fVar != null) {
            fVar.mo152538a(eVar);
        }
    }

    public C42361b(final Context context) {
        this.f107836c = context;
        C42369e eVar = new C42369e(new C42369e.AbstractC42373a() {
            /* class com.ss.android.lark.mail.impl.home.p2178a.C42361b.C423621 */

            @Override // com.ss.android.lark.mail.impl.home.p2178a.C42369e.AbstractC42373a
            /* renamed from: a */
            public LifecycleOwner mo152522a() {
                return (ComponentActivity) context;
            }
        });
        this.f107834a = eVar;
        eVar.create();
        this.f107834a.mo152529a().mo5923a((ComponentActivity) this.f107836c, new AbstractC1178x<List<C42368d>>() {
            /* class com.ss.android.lark.mail.impl.home.p2178a.C42361b.C423632 */

            /* renamed from: a */
            public void onChanged(final List<C42368d> list) {
                Object obj;
                StringBuilder sb = new StringBuilder();
                sb.append("account list onChanged : ");
                if (list != null) {
                    obj = Integer.valueOf(list.size());
                } else {
                    obj = "null";
                }
                sb.append(obj);
                Log.m165389i("AccountListComponent", sb.toString());
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.p2178a.C42361b.C423632.RunnableC423641 */

                    public void run() {
                        if (C42361b.this.f107835b != null) {
                            C42361b.this.f107835b.mo152539a(list);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo152517a(View view) {
        C42374f fVar = this.f107835b;
        if (fVar == null || !fVar.mo152542b()) {
            if (this.f107834a.mo152529a().mo5927b() == null) {
                this.f107834a.mo152531b();
            }
            C42374f fVar2 = new C42374f(this.f107836c, this, this.f107837d);
            fVar2.create();
            fVar2.mo152539a(this.f107834a.mo152529a().mo5927b());
            fVar2.mo152536a(view, 0);
            this.f107835b = fVar2;
            return;
        }
        fVar.mo152535a();
        fVar.destroy();
        this.f107835b = null;
    }
}
