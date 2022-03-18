package com.ss.android.vc.common.p3080d.p3082b;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.common.d.b.c */
public class C60717c extends AbstractC60715a {

    /* renamed from: a */
    protected List<String> f151873a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private SimpleDateFormat f151874b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /* renamed from: d */
    private boolean f151875d;

    @Override // com.ss.android.vc.common.p3080d.p3082b.AbstractC60716b
    /* renamed from: j */
    public void mo208312j() {
        this.f151875d = true;
    }

    @Override // com.ss.android.vc.common.p3080d.p3082b.AbstractC60716b
    /* renamed from: a */
    public void mo208311a(String str, String str2) {
        if (!this.f151875d) {
            List<String> list = this.f151873a;
            list.add("[" + this.f151874b.format(new Date()) + "][" + str + "]" + str2);
            return;
        }
        throw new IllegalStateException("Log can't be added after dumped.");
    }
}
