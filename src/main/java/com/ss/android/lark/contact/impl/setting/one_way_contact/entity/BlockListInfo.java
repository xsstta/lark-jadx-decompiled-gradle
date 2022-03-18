package com.ss.android.lark.contact.impl.setting.one_way_contact.entity;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/BlockListInfo;", "", "mBlockList", "", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/ExceptionUser;", "mCursor", "", "mHasMore", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "getMBlockList", "()Ljava/util/List;", "getMCursor", "()Ljava/lang/String;", "getMHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.entity.a */
public final class BlockListInfo {

    /* renamed from: a */
    private final List<ExceptionUser> f93145a;

    /* renamed from: b */
    private final String f93146b;

    /* renamed from: c */
    private final Boolean f93147c;

    /* renamed from: a */
    public final List<ExceptionUser> mo132526a() {
        return this.f93145a;
    }

    /* renamed from: b */
    public final String mo132527b() {
        return this.f93146b;
    }

    /* renamed from: c */
    public final Boolean mo132528c() {
        return this.f93147c;
    }

    public BlockListInfo(List<ExceptionUser> list, String str, Boolean bool) {
        this.f93145a = list;
        this.f93146b = str;
        this.f93147c = bool;
    }
}
