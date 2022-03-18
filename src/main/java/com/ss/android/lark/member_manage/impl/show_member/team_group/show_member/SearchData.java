package com.ss.android.lark.member_manage.impl.show_member.team_group.show_member;

import com.ss.android.lark.member_manage.impl.bean.C45084c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/SearchData;", "", "key", "", "selectBeans", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "(Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getSelectBeans", "()Ljava/util/List;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.g */
public final class SearchData {

    /* renamed from: a */
    private final String f114585a;

    /* renamed from: b */
    private final List<C45084c> f114586b;

    /* renamed from: a */
    public final String mo159929a() {
        return this.f114585a;
    }

    /* renamed from: b */
    public final List<C45084c> mo159930b() {
        return this.f114586b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.member_manage.impl.bean.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchData(String str, List<? extends C45084c> list) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f114585a = str;
        this.f114586b = list;
    }
}
