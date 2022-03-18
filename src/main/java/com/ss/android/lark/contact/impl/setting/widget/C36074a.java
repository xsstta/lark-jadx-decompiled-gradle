package com.ss.android.lark.contact.impl.setting.widget;

import com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem;

/* renamed from: com.ss.android.lark.contact.impl.setting.widget.a */
public class C36074a {

    /* renamed from: a */
    public String f93236a;

    /* renamed from: b */
    public String f93237b;

    /* renamed from: c */
    public String f93238c;

    /* renamed from: d */
    public boolean f93239d;

    /* renamed from: e */
    public WayToFindMeSettingItem.FindMeType f93240e;

    /* renamed from: f */
    public boolean f93241f;

    public C36074a() {
    }

    public C36074a(String str, String str2, boolean z, WayToFindMeSettingItem.FindMeType findMeType) {
        this.f93236a = str;
        this.f93237b = str2;
        this.f93239d = z;
        this.f93240e = findMeType;
    }

    public C36074a(String str, String str2, String str3, boolean z, WayToFindMeSettingItem.FindMeType findMeType) {
        this(str, str2, z, findMeType);
        this.f93238c = str3;
    }

    public C36074a(String str, String str2, String str3, boolean z, WayToFindMeSettingItem.FindMeType findMeType, boolean z2) {
        this(str, str2, str3, z, findMeType);
        this.f93241f = z2;
    }
}
