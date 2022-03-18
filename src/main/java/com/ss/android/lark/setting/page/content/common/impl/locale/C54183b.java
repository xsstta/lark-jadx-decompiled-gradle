package com.ss.android.lark.setting.page.content.common.impl.locale;

import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49339b;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.b */
public class C54183b {

    /* renamed from: a */
    private static ArrayList<AbstractC49339b> f134160a;

    /* renamed from: b */
    private static C54183b f134161b = new C54183b();

    private C54183b() {
    }

    /* renamed from: a */
    public static C54183b m210396a() {
        return f134161b;
    }

    /* renamed from: a */
    public void mo185488a(AbstractC49339b bVar) {
        ArrayList<AbstractC49339b> arrayList = f134160a;
        if (arrayList != null) {
            arrayList.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo185489a(Locale locale) {
        ArrayList<AbstractC49339b> arrayList = f134160a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).mo172130a(locale);
            }
        }
    }

    /* renamed from: b */
    public void mo185490b(AbstractC49339b bVar) {
        if (bVar != null) {
            if (f134160a == null) {
                f134160a = new ArrayList<>();
            }
            f134160a.add(bVar);
        }
    }
}
