package com.ss.android.lark.mail.impl.message.pageroute;

import com.ss.android.lark.mail.impl.message.framework.AbstractC42925b;
import com.ss.android.lark.mail.impl.message.pageroute.p2208a.C42943a;
import com.ss.android.lark.mail.impl.message.pageroute.p2208a.C42944b;
import com.ss.android.lark.mail.impl.message.pageroute.p2208a.C42945c;
import com.ss.android.lark.mail.impl.message.pageroute.p2208a.C42946d;
import com.ss.android.lark.mail.impl.message.pageroute.p2208a.C42947e;
import com.ss.android.lark.mail.impl.message.pageroute.p2208a.C42948f;
import com.ss.android.lark.mail.impl.message.pageroute.p2208a.C42949g;
import com.ss.android.lark.mail.impl.message.pageroute.p2208a.C42950h;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mail.impl.message.pageroute.a */
public class C42942a {

    /* renamed from: a */
    private HashMap<Integer, AbstractC42925b> f109376a = new HashMap<>();

    /* renamed from: a */
    public AbstractC42925b mo154040a(int i) {
        AbstractC42925b bVar = this.f109376a.get(Integer.valueOf(i));
        if (bVar == null) {
            switch (i) {
                case 1:
                    bVar = new C42947e();
                    break;
                case 2:
                    bVar = new C42950h();
                    break;
                case 3:
                    bVar = new C42949g();
                    break;
                case 4:
                case 8:
                    bVar = new C42945c();
                    break;
                case 5:
                    bVar = new C42946d();
                    break;
                case 6:
                    bVar = new C42944b();
                    break;
                case 7:
                    bVar = new C42943a();
                    break;
                case 9:
                    bVar = new C42948f();
                    break;
                default:
                    bVar = new C42947e();
                    break;
            }
            this.f109376a.put(Integer.valueOf(i), bVar);
        }
        return bVar;
    }
}
