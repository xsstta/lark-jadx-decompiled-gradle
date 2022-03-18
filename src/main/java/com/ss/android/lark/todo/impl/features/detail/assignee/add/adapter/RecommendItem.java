package com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002$%B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem;", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ShowType;", "isChecked", "", "titleStr", "", "chatterItem", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ChatterItem;", "(Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ShowType;ZLjava/lang/String;Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ChatterItem;)V", "getChatterItem", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ChatterItem;", "setChatterItem", "(Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ChatterItem;)V", "()Z", "setChecked", "(Z)V", "getTitleStr", "()Ljava/lang/String;", "setTitleStr", "(Ljava/lang/String;)V", "getType", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ShowType;", "setType", "(Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ShowType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ChatterItem", "ShowType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RecommendItem {

    /* renamed from: a */
    private ShowType f139562a;

    /* renamed from: b */
    private boolean f139563b;

    /* renamed from: c */
    private String f139564c;

    /* renamed from: d */
    private ChatterItem f139565d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ShowType;", "", "(Ljava/lang/String;I)V", "TITLE", "CHATTER", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ShowType {
        TITLE,
        CHATTER
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendItem)) {
            return false;
        }
        RecommendItem recommendItem = (RecommendItem) obj;
        return Intrinsics.areEqual(this.f139562a, recommendItem.f139562a) && this.f139563b == recommendItem.f139563b && Intrinsics.areEqual(this.f139564c, recommendItem.f139564c) && Intrinsics.areEqual(this.f139565d, recommendItem.f139565d);
    }

    public int hashCode() {
        ShowType showType = this.f139562a;
        int i = 0;
        int hashCode = (showType != null ? showType.hashCode() : 0) * 31;
        boolean z = this.f139563b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        String str = this.f139564c;
        int hashCode2 = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        ChatterItem aVar = this.f139565d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "RecommendItem(type=" + this.f139562a + ", isChecked=" + this.f139563b + ", titleStr=" + this.f139564c + ", chatterItem=" + this.f139565d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem$ChatterItem;", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "department", "", "(Lcom/ss/android/lark/chat/entity/chatter/Chatter;Ljava/lang/String;)V", "getChatter", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "setChatter", "(Lcom/ss/android/lark/chat/entity/chatter/Chatter;)V", "getDepartment", "()Ljava/lang/String;", "setDepartment", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.RecommendItem$a */
    public static final class ChatterItem {

        /* renamed from: a */
        private Chatter f139566a;

        /* renamed from: b */
        private String f139567b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatterItem)) {
                return false;
            }
            ChatterItem aVar = (ChatterItem) obj;
            return Intrinsics.areEqual(this.f139566a, aVar.f139566a) && Intrinsics.areEqual(this.f139567b, aVar.f139567b);
        }

        public int hashCode() {
            Chatter chatter = this.f139566a;
            int i = 0;
            int hashCode = (chatter != null ? chatter.hashCode() : 0) * 31;
            String str = this.f139567b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ChatterItem(chatter=" + this.f139566a + ", department=" + this.f139567b + ")";
        }

        /* renamed from: a */
        public final Chatter mo192172a() {
            return this.f139566a;
        }

        /* renamed from: b */
        public final String mo192173b() {
            return this.f139567b;
        }

        public ChatterItem(Chatter chatter, String str) {
            Intrinsics.checkParameterIsNotNull(str, "department");
            this.f139566a = chatter;
            this.f139567b = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ChatterItem(Chatter chatter, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(chatter, (i & 2) != 0 ? "" : str);
        }
    }

    /* renamed from: a */
    public final ShowType mo192164a() {
        return this.f139562a;
    }

    /* renamed from: b */
    public final boolean mo192166b() {
        return this.f139563b;
    }

    /* renamed from: c */
    public final String mo192167c() {
        return this.f139564c;
    }

    /* renamed from: d */
    public final ChatterItem mo192168d() {
        return this.f139565d;
    }

    /* renamed from: a */
    public final void mo192165a(boolean z) {
        this.f139563b = z;
    }

    public RecommendItem(ShowType showType, boolean z, String str, ChatterItem aVar) {
        Intrinsics.checkParameterIsNotNull(showType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str, "titleStr");
        this.f139562a = showType;
        this.f139563b = z;
        this.f139564c = str;
        this.f139565d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendItem(ShowType showType, boolean z, String str, ChatterItem aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(showType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : aVar);
    }
}
