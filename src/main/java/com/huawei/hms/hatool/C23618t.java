package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.huawei.hms.hatool.t */
public class C23618t {

    /* renamed from: a */
    public List<C23615q> f58320a;

    /* renamed from: b */
    public String f58321b;

    /* renamed from: c */
    public String f58322c;

    /* renamed from: d */
    public String f58323d;

    public C23618t(List<C23615q> list, String str, String str2, String str3) {
        this.f58320a = list;
        this.f58321b = str;
        this.f58322c = str2;
        this.f58323d = str3;
    }

    /* renamed from: a */
    public void mo83156a() {
        if ("_default_config_tag".equals(this.f58322c)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (C23615q qVar : this.f58320a) {
                String c = qVar.mo83145c();
                if (TextUtils.isEmpty(c) || "oper".equals(c)) {
                    arrayList4.add(qVar);
                } else if ("maint".equals(c)) {
                    arrayList.add(qVar);
                } else if ("preins".equals(c)) {
                    arrayList2.add(qVar);
                } else if ("diffprivacy".equals(c)) {
                    arrayList3.add(qVar);
                }
            }
            mo83157a(arrayList4, "oper", "_default_config_tag");
            mo83157a(arrayList, "maint", "_default_config_tag");
            mo83157a(arrayList2, "preins", "_default_config_tag");
            mo83157a(arrayList3, "diffprivacy", "_default_config_tag");
            return;
        }
        mo83157a(this.f58320a, this.f58322c, this.f58321b);
    }

    /* renamed from: a */
    public final void mo83157a(List<C23615q> list, String str, String str2) {
        if (!list.isEmpty()) {
            int size = (list.size() / ParticipantRepo.f117150c) + 1;
            for (int i = 0; i < size; i++) {
                int i2 = i * ParticipantRepo.f117150c;
                List<C23615q> subList = list.subList(i2, Math.min(list.size(), i2 + ParticipantRepo.f117150c));
                String replace = UUID.randomUUID().toString().replace("-", "");
                long currentTimeMillis = System.currentTimeMillis();
                long b = ((long) AbstractC23598c.m85632b(str2, str)) * 86400000;
                ArrayList arrayList = new ArrayList();
                for (C23615q qVar : subList) {
                    if (!p0.m85880a(qVar.mo83143b(), currentTimeMillis, b)) {
                        arrayList.add(qVar);
                    }
                }
                if (arrayList.size() > 0) {
                    new C23619u(str2, str, this.f58323d, arrayList, replace).mo83159a();
                } else {
                    C23625y.m85981e("hmsSdk", "No data to report handler");
                }
            }
        }
    }
}
