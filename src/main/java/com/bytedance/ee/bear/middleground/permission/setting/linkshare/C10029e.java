package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.e */
public class C10029e implements AbstractC10070m {

    /* renamed from: a */
    private final Context f27116a;

    /* renamed from: b */
    private final DocPermSetInfo f27117b;

    /* renamed from: c */
    private final boolean f27118c;

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10070m
    /* renamed from: b */
    public int mo38336b() {
        boolean z;
        IDocPublicPermission j = this.f27117b.mo38837j();
        if (this.f27117b.mo38845r() || this.f27117b.mo38846s()) {
            z = true;
        } else {
            z = false;
        }
        return C10039l.m41784a(j, z, this.f27118c);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10070m
    /* renamed from: a */
    public List<LinkShareItem> mo38335a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C10039l.m41786a(this.f27116a, 1));
        if (this.f27118c) {
            arrayList.add(C10039l.m41786a(this.f27116a, 7));
            arrayList.add(C10039l.m41786a(this.f27116a, 8));
        } else {
            arrayList.add(C10039l.m41786a(this.f27116a, 3));
            arrayList.add(C10039l.m41786a(this.f27116a, 4));
            if (this.f27117b.mo38793B()) {
                arrayList.add(C10039l.m41786a(this.f27116a, 5));
                arrayList.add(C10039l.m41786a(this.f27116a, 6));
            }
        }
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.share_with_password", !C4511g.m18594d().mo17342C());
        if (this.f27117b.mo38817Z() && a && this.f27117b.mo38793B()) {
            arrayList.add(new LinkShareItem(1000, "", ""));
        }
        return arrayList;
    }

    C10029e(Context context, DocPermSetInfo docPermSetInfo, boolean z) {
        this.f27116a = context;
        this.f27117b = docPermSetInfo;
        this.f27118c = z;
    }
}
