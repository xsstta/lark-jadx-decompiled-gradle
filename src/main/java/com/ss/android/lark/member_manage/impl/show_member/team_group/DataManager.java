package com.ss.android.lark.member_manage.impl.show_member.team_group;

import android.text.TextUtils;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/DataManager;", "", "()V", "mSelectIds", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getMSelectIds", "()Ljava/util/HashSet;", "mSelectedBeans", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "Lkotlin/collections/ArrayList;", "getMSelectedBeans", "()Ljava/util/ArrayList;", "setMSelectedBeans", "(Ljava/util/ArrayList;)V", "addSelectedItem", "", "selectBean", "clearSelectedBeans", "release", "removeSelectedItem", "Companion", "SingletonHolder", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.a */
public final class DataManager {

    /* renamed from: a */
    public static final DataManager f114487a = SingletonHolder.f114491a.mo159840a();

    /* renamed from: b */
    public static final Companion f114488b = new Companion(null);

    /* renamed from: c */
    private final HashSet<String> f114489c;

    /* renamed from: d */
    private ArrayList<C45084c> f114490d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/DataManager$Companion;", "", "()V", "mInstance", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/DataManager;", "getMInstance", "()Lcom/ss/android/lark/member_manage/impl/show_member/team_group/DataManager;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final DataManager mo159839a() {
            return DataManager.f114487a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/DataManager$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/DataManager;", "getHolder", "()Lcom/ss/android/lark/member_manage/impl/show_member/team_group/DataManager;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.a$b */
    private static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f114491a = new SingletonHolder();

        /* renamed from: b */
        private static final DataManager f114492b = new DataManager(null);

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final DataManager mo159840a() {
            return f114492b;
        }
    }

    /* renamed from: a */
    public final HashSet<String> mo159833a() {
        return this.f114489c;
    }

    /* renamed from: b */
    public final ArrayList<C45084c> mo159835b() {
        return this.f114490d;
    }

    /* renamed from: c */
    public final void mo159837c() {
        this.f114490d.clear();
        this.f114489c.clear();
    }

    /* renamed from: d */
    public final void mo159838d() {
        this.f114490d.clear();
        this.f114489c.clear();
    }

    private DataManager() {
        this.f114489c = new HashSet<>();
        this.f114490d = new ArrayList<>();
    }

    public /* synthetic */ DataManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo159834a(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectBean");
        if (!this.f114489c.contains(cVar.mo159513h()) && cVar.mo159504b()) {
            this.f114489c.add(cVar.mo159513h());
            this.f114490d.add(cVar);
        }
    }

    /* renamed from: b */
    public final void mo159836b(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectBean");
        if (!cVar.mo159504b()) {
            this.f114489c.remove(cVar.mo159513h());
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (T t : this.f114490d) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!TextUtils.equals(cVar.mo159513h(), t.mo159513h())) {
                    arrayList.add(t);
                }
                i = i2;
            }
            this.f114490d = new ArrayList<>(arrayList);
        }
    }
}
