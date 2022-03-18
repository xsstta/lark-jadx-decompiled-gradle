package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.u */
public class C10088u implements AbstractC10070m {

    /* renamed from: a */
    private Context f27271a;

    /* renamed from: b */
    private DocPermSetInfo f27272b;

    /* renamed from: c */
    private boolean f27273c;

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10070m
    /* renamed from: b */
    public int mo38336b() {
        boolean z;
        IDocPublicPermission j = this.f27272b.mo38837j();
        if (this.f27272b.mo38845r() || this.f27272b.mo38846s()) {
            z = true;
        } else {
            z = false;
        }
        return C10039l.m41784a(j, z, this.f27273c);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.AbstractC10070m
    /* renamed from: a */
    public List<LinkShareItem> mo38335a() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C10039l.m41786a(this.f27271a, 1));
        arrayList.add(C10039l.m41786a(this.f27271a, 3));
        arrayList.add(C10039l.m41786a(this.f27271a, 4));
        if (PermFGUtils.m39534c() && this.f27272b.mo38793B()) {
            boolean z2 = false;
            if (this.f27272b.mo38814W() == 1 || this.f27272b.mo38814W() == 4) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(C10039l.m41786a(this.f27271a, 5));
            }
            if (!(this.f27272b.mo38815X() == 1 || this.f27272b.mo38815X() == 4)) {
                z2 = true;
            }
            if (z2) {
                arrayList.add(C10039l.m41786a(this.f27271a, 6));
            }
            if (z || z2) {
                boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.share_with_password", !C4511g.m18594d().mo17342C());
                if (this.f27272b.mo38817Z() && a) {
                    arrayList.add(new LinkShareItem(1000, "", ""));
                }
            }
        }
        return arrayList;
    }

    C10088u(Context context, DocPermSetInfo docPermSetInfo, boolean z) {
        this.f27271a = context;
        this.f27272b = docPermSetInfo;
        this.f27273c = z;
    }
}
