package com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.a.d */
public class C6804d implements AbstractC6803c {

    /* renamed from: a */
    private List<C6802b> f18502a = new ArrayList();

    /* renamed from: b */
    private Comparator<C6802b> f18503b = $$Lambda$d$XO5zKStrtNGkMlqEL5Apt53SN4E.INSTANCE;

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.AbstractC6803c
    /* renamed from: a */
    public List<C6802b> mo26803a() {
        return this.f18502a;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.AbstractC6803c
    /* renamed from: b */
    public void mo26806b() {
        Collections.sort(this.f18502a, this.f18503b);
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.AbstractC6803c
    /* renamed from: a */
    public void mo26804a(C6802b bVar) {
        this.f18502a.add(bVar);
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.AbstractC6803c
    /* renamed from: a */
    public int mo26801a(String str) {
        if (str == null) {
            C13479a.m54758a("UpdateListTAG", "find position failed, key == null");
            return -1;
        }
        for (int i = 0; i < this.f18502a.size(); i++) {
            if (str.equals(this.f18502a.get(i).mo26796f())) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.AbstractC6803c
    /* renamed from: b */
    public int mo26805b(C6801a aVar) {
        C13479a.m54764b("UpdateListTAG", "remove complete status file");
        int a = mo26801a(aVar.mo26783c());
        if (a != -1 && a < this.f18502a.size()) {
            C13479a.m54764b("UpdateListTAG", "remove position " + a);
            this.f18502a.remove(a);
        }
        return a;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.AbstractC6803c
    /* renamed from: a */
    public int mo26800a(C6801a aVar) {
        for (int i = 0; i < this.f18502a.size(); i++) {
            if (this.f18502a.get(i).mo26796f().equals(aVar.mo26783c())) {
                String a = aVar.mo26781a();
                if (!TextUtils.isEmpty(a)) {
                    this.f18502a.get(i).mo26787a(a);
                    return i;
                }
                this.f18502a.get(i).mo26790b(aVar.mo26782b());
                this.f18502a.get(i).mo26792c(aVar.mo26784d());
                return i;
            }
        }
        return -1;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.uploadstatuslist.p337a.AbstractC6803c
    /* renamed from: a */
    public C6801a mo26802a(int i) {
        String str;
        int i2;
        int i3 = -1;
        if (i <= -1 || i >= this.f18502a.size()) {
            str = null;
            i2 = 0;
        } else {
            String f = this.f18502a.get(i).mo26796f();
            int d = this.f18502a.get(i).mo26793d();
            i2 = this.f18502a.get(i).mo26797g();
            this.f18502a.remove(i);
            C13479a.m54764b("UpdateListTAG", "remove key = " + f + " position " + i);
            str = f;
            i3 = d;
        }
        return new C6801a(i3, str, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m26846a(C6802b bVar, C6802b bVar2) {
        if (bVar.mo26793d() > bVar2.mo26793d()) {
            return -1;
        }
        if (bVar.mo26793d() < bVar2.mo26793d()) {
            return 1;
        }
        return 0;
    }
}
