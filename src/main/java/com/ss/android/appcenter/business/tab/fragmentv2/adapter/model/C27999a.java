package com.ss.android.appcenter.business.tab.fragmentv2.adapter.model;

import android.text.TextUtils;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.a */
public class C27999a {

    /* renamed from: a */
    private String f70045a;

    /* renamed from: b */
    private Group f70046b;

    /* renamed from: c */
    private List<ItemInfo> f70047c;

    /* renamed from: d */
    private boolean f70048d;

    /* renamed from: e */
    private String f70049e;

    /* renamed from: f */
    private boolean f70050f;

    /* renamed from: g */
    private boolean f70051g;

    /* renamed from: d */
    public boolean mo99787d() {
        return true;
    }

    /* renamed from: g */
    public int mo99790g() {
        return 4;
    }

    /* renamed from: a */
    public Group mo99784a() {
        return this.f70046b;
    }

    /* renamed from: b */
    public boolean mo99785b() {
        return this.f70048d;
    }

    /* renamed from: h */
    public String mo99791h() {
        return this.f70049e;
    }

    /* renamed from: l */
    public boolean mo99795l() {
        return this.f70051g;
    }

    /* renamed from: m */
    public String mo99796m() {
        return this.f70045a;
    }

    /* renamed from: c */
    public int mo99786c() {
        return ViewType.HEADER_COMMON.getViewTypeValue();
    }

    /* renamed from: e */
    public int mo99788e() {
        return ViewType.FOOTER_COMMON.getViewTypeValue();
    }

    /* renamed from: i */
    public List<ItemInfo> mo99792i() {
        if (this.f70047c == null) {
            this.f70047c = new ArrayList();
        }
        return this.f70047c;
    }

    /* renamed from: j */
    public int mo99793j() {
        return mo99792i().size();
    }

    /* renamed from: k */
    public boolean mo99794k() {
        if (!this.f70050f || mo99792i().size() <= 12 || TextUtils.isEmpty(this.f70045a)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo99797n() {
        for (ItemInfo itemInfo : this.f70047c) {
            if (itemInfo.badgeNum() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo99789f() {
        if (Group.ICON_LIST == this.f70046b) {
            return ViewType.CHILD_ICON_LIST.getViewTypeValue();
        }
        if (Group.RECTANGLE_BUTTON == this.f70046b) {
            return ViewType.CHILD_RECTANGLE_BUTTON.getViewTypeValue();
        }
        if (Group.WIDGET_LIST == this.f70046b) {
            return ViewType.CHILD_WIDGET_LIST.getViewTypeValue();
        }
        return ViewType.DEFAULT.getViewTypeValue();
    }

    public C27999a(Group group) {
        this(group, null, null, false, null, false, false);
    }

    public C27999a(Group group, String str, List<ItemInfo> list, boolean z, String str2) {
        this(group, str, list, z, str2, false, false);
    }

    public C27999a(Group group, String str, List<ItemInfo> list, boolean z, String str2, boolean z2, boolean z3) {
        this.f70046b = group;
        this.f70045a = str;
        this.f70047c = list;
        this.f70048d = z;
        this.f70049e = str2;
        this.f70050f = z2;
        this.f70051g = z3;
    }
}
