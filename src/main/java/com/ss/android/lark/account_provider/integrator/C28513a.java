package com.ss.android.lark.account_provider.integrator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.account_provider.integrator.a */
public class C28513a {

    /* renamed from: a */
    private static final List<AbstractC28515b> f71669a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private static final List<AbstractC28514a> f71670b = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.account_provider.integrator.a$a */
    public interface AbstractC28514a {
        void onLoginStatusChanged(int i);
    }

    /* renamed from: com.ss.android.lark.account_provider.integrator.a$b */
    public interface AbstractC28515b {
        void onLoginStatusChanged(boolean z);
    }

    /* renamed from: a */
    public static void m104512a(AbstractC28514a aVar) {
        if (aVar != null) {
            f71670b.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m104515b(AbstractC28514a aVar) {
        if (aVar != null) {
            f71670b.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m104513a(AbstractC28515b bVar) {
        if (bVar != null) {
            f71669a.add(bVar);
        }
    }

    /* renamed from: a */
    public static void m104514a(boolean z) {
        int i;
        for (AbstractC28515b bVar : f71669a) {
            bVar.onLoginStatusChanged(z);
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        for (AbstractC28514a aVar : f71670b) {
            aVar.onLoginStatusChanged(i);
        }
    }
}
