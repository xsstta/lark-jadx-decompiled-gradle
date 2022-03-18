package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.q */
public class C10077q implements AbstractC10070m {

    /* renamed from: a */
    private final Context f27224a;

    /* renamed from: b */
    private final int f27225b;

    /* renamed from: c */
    private final boolean f27226c;

    /* renamed from: d */
    private final boolean f27227d;

    /* renamed from: e */
    private final boolean f27228e;

    /* renamed from: f */
    private final boolean f27229f;

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10070m
    /* renamed from: b */
    public int mo38336b() {
        return C10039l.m41783a(this.f27225b, this.f27228e, this.f27226c, this.f27229f);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10070m
    /* renamed from: a */
    public List<LinkShareItem> mo38335a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C10039l.m41788c(this.f27224a, 1));
        if (this.f27226c) {
            arrayList.add(C10039l.m41788c(this.f27224a, 7));
        } else {
            arrayList.add(C10039l.m41788c(this.f27224a, 3));
            arrayList.add(C10039l.m41788c(this.f27224a, 4));
            if (this.f27227d) {
                arrayList.add(C10039l.m41788c(this.f27224a, 5));
            }
        }
        if (C4211a.m17514a().mo16536a("spacekit.mobile.folder_share_with_password", !C4511g.m18594d().mo17342C()) && this.f27227d) {
            arrayList.add(new LinkShareItem(1000, "", ""));
        }
        return arrayList;
    }

    C10077q(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f27224a = context;
        this.f27225b = i;
        this.f27226c = z;
        this.f27227d = z2;
        this.f27228e = z3;
        this.f27229f = z4;
    }
}
