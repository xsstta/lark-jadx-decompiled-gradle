package com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a;

import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.AddAppItem;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.Group;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.ViewType;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.a.a */
public class C28004a extends C27999a {
    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: g */
    public int mo99790g() {
        if (m102323a(mo99792i())) {
            return 4;
        }
        return 1;
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a
    /* renamed from: f */
    public int mo99789f() {
        if (m102323a(mo99792i())) {
            return ViewType.CHILD_RECTANGLE_BUTTON.getViewTypeValue();
        }
        return ViewType.CHILD_ICON_LIST.getViewTypeValue();
    }

    /* renamed from: a */
    public static boolean m102323a(List<ItemInfo> list) {
        if (list.size() != 1 || !(list.get(0) instanceof AddAppItem)) {
            return false;
        }
        return true;
    }

    public C28004a(Group group, String str, List<ItemInfo> list, boolean z, String str2, boolean z2, boolean z3) {
        super(group, str, list, z, str2, z2, z3);
    }
}
