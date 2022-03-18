package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49388a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.passport.infra.util.a */
public class C49138a implements AbstractC49388a {

    /* renamed from: a */
    List<IAccountInterceptor> f123398a;

    /* renamed from: b */
    Iterator<IAccountInterceptor> f123399b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.infra.util.a$a */
    public static class C49143a {

        /* renamed from: a */
        public static C49138a f123414a = new C49138a();
    }

    /* renamed from: a */
    public static C49138a m193781a() {
        return C49143a.f123414a;
    }

    private C49138a() {
        this.f123398a = new CopyOnWriteArrayList();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49388a
    /* renamed from: a */
    public void mo171621a(IAccountInterceptor iAccountInterceptor) {
        if (!this.f123398a.contains(iAccountInterceptor)) {
            this.f123398a.add(iAccountInterceptor);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49388a
    /* renamed from: a */
    public void mo171619a(Context context, IAccountInterceptor.AbstractC49386a aVar) {
        this.f123399b = this.f123398a.iterator();
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("AccountInterceptor", "to list intercept size= " + this.f123398a.size());
        if (this.f123399b.hasNext()) {
            m193782a(context, this.f123399b.next(), aVar);
        } else if (aVar != null) {
            aVar.mo133323a();
        }
    }

    /* renamed from: a */
    public void mo171618a(int i, Context context, IAccountInterceptor.AbstractC49386a aVar) {
        if (i == 0) {
            Log.m165389i("AccountInterceptor", "stop process next step");
            if (aVar != null) {
                aVar.mo133324b();
            }
        } else if (i == 1) {
            Log.m165389i("AccountInterceptor", "start process next step");
            if (this.f123399b.hasNext()) {
                m193782a(context, this.f123399b.next(), aVar);
            } else if (aVar != null) {
                aVar.mo133323a();
            }
        } else if (i == 2 && aVar != null) {
            aVar.mo133323a();
        }
    }

    /* renamed from: a */
    private void m193782a(final Context context, final IAccountInterceptor iAccountInterceptor, final IAccountInterceptor.AbstractC49386a aVar) {
        if (iAccountInterceptor.mo144654a()) {
            UDDialogUtils.m193818a(context, iAccountInterceptor.mo144655b().getTitle(), iAccountInterceptor.mo144655b().getDesc(), iAccountInterceptor.mo144655b().getConfirmText(), iAccountInterceptor.mo144655b().getCancelText(), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.passport.infra.util.C49138a.DialogInterface$OnClickListenerC491391 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C49138a.this.mo171620a(context, true, iAccountInterceptor, aVar);
                }
            }, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.passport.infra.util.C49138a.DialogInterface$OnClickListenerC491402 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C49138a.this.mo171620a(context, false, iAccountInterceptor, aVar);
                }
            });
        } else if (this.f123399b.hasNext()) {
            m193782a(context, this.f123399b.next(), aVar);
        } else if (aVar != null) {
            aVar.mo133323a();
        }
    }

    /* renamed from: a */
    public void mo171620a(final Context context, final boolean z, final IAccountInterceptor iAccountInterceptor, final IAccountInterceptor.AbstractC49386a aVar) {
        C57865c.m224574a(new C57865c.AbstractC57873d<Integer>() {
            /* class com.ss.android.lark.passport.infra.util.C49138a.C491413 */

            /* renamed from: a */
            public Integer produce() {
                if (z) {
                    return Integer.valueOf(iAccountInterceptor.mo144656c());
                }
                return Integer.valueOf(iAccountInterceptor.mo144657d());
            }
        }, new C57865c.AbstractC57871b<Integer>() {
            /* class com.ss.android.lark.passport.infra.util.C49138a.C491424 */

            /* renamed from: a */
            public void consume(Integer num) {
                C49138a.this.mo171618a(num.intValue(), context, aVar);
            }
        });
    }
}
