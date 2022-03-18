package com.bytedance.push.third;

import android.content.Context;
import android.content.Intent;
import com.ss.android.message.AbstractC59434a;
import com.ss.android.pushmanager.AbstractC59962b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.push.third.e */
public class C20547e implements AbstractC59434a {

    /* renamed from: a */
    private static volatile C20547e f50113a;

    /* renamed from: b */
    private List<AbstractC59434a> f50114b = Collections.emptyList();

    /* renamed from: c */
    private AbstractC59434a.AbstractC59435a f50115c;

    @Override // com.ss.android.message.AbstractC59434a
    /* renamed from: a */
    public void mo69183a(AbstractC59434a.AbstractC59435a aVar) {
    }

    private C20547e() {
    }

    /* renamed from: a */
    public static C20547e m74826a() {
        if (f50113a == null) {
            synchronized (C20547e.class) {
                if (f50113a == null) {
                    f50113a = new C20547e();
                }
            }
        }
        return f50113a;
    }

    @Override // com.ss.android.message.AbstractC59437b
    /* renamed from: b */
    public void mo69185b() {
        List<AbstractC59434a> list = this.f50114b;
        if (list != null) {
            for (AbstractC59434a aVar : list) {
                try {
                    aVar.mo69185b();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo69184a(List<AbstractC59434a> list) {
        this.f50114b = list;
    }

    @Override // com.ss.android.message.AbstractC59437b
    /* renamed from: a */
    public void mo69179a(Context context) {
        List<AbstractC59434a> list = this.f50114b;
        if (list != null) {
            for (AbstractC59434a aVar : list) {
                try {
                    aVar.mo69179a(context);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.message.AbstractC59437b
    /* renamed from: a */
    public void mo69182a(Intent intent) {
        List<AbstractC59434a> list = this.f50114b;
        if (list != null) {
            for (AbstractC59434a aVar : list) {
                try {
                    aVar.mo69182a(intent);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.message.AbstractC59434a
    /* renamed from: a */
    public void mo69180a(Context context, AbstractC59962b bVar) {
        this.f50115c = new AbstractC59434a.AbstractC59435a() {
            /* class com.bytedance.push.third.C20547e.C205481 */
        };
        List<AbstractC59434a> list = this.f50114b;
        if (list != null) {
            for (AbstractC59434a aVar : list) {
                try {
                    aVar.mo69183a(this.f50115c);
                    aVar.mo69180a(context, bVar);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.message.AbstractC59434a
    /* renamed from: a */
    public void mo69181a(Context context, Map<String, String> map) {
        List<AbstractC59434a> list = this.f50114b;
        if (list != null) {
            for (AbstractC59434a aVar : list) {
                try {
                    aVar.mo69181a(context, map);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
