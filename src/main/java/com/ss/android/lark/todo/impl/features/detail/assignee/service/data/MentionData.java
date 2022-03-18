package com.ss.android.lark.todo.impl.features.detail.assignee.service.data;

import com.bytedance.lark.pb.basic.v1.Chatter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JW\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/MentionData;", "", "wanted_mention_ids", "", "", "in_chat_chatter_ids", "out_chat_chatter_ids", "chatters", "", "Lcom/bytedance/lark/pb/basic/v1/Chatter;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getChatters", "()Ljava/util/Map;", "getIn_chat_chatter_ids", "()Ljava/util/List;", "setIn_chat_chatter_ids", "(Ljava/util/List;)V", "getOut_chat_chatter_ids", "setOut_chat_chatter_ids", "getWanted_mention_ids", "setWanted_mention_ids", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.b.a.a */
public final class MentionData {

    /* renamed from: a */
    private List<String> f139601a;

    /* renamed from: b */
    private List<String> f139602b;

    /* renamed from: c */
    private List<String> f139603c;

    /* renamed from: d */
    private final Map<String, Chatter> f139604d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionData)) {
            return false;
        }
        MentionData aVar = (MentionData) obj;
        return Intrinsics.areEqual(this.f139601a, aVar.f139601a) && Intrinsics.areEqual(this.f139602b, aVar.f139602b) && Intrinsics.areEqual(this.f139603c, aVar.f139603c) && Intrinsics.areEqual(this.f139604d, aVar.f139604d);
    }

    public int hashCode() {
        List<String> list = this.f139601a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f139602b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f139603c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Map<String, Chatter> map = this.f139604d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "MentionData(wanted_mention_ids=" + this.f139601a + ", in_chat_chatter_ids=" + this.f139602b + ", out_chat_chatter_ids=" + this.f139603c + ", chatters=" + this.f139604d + ")";
    }

    /* renamed from: a */
    public final List<String> mo192218a() {
        return this.f139601a;
    }

    /* renamed from: b */
    public final List<String> mo192219b() {
        return this.f139602b;
    }

    /* renamed from: c */
    public final List<String> mo192220c() {
        return this.f139603c;
    }

    /* renamed from: d */
    public final Map<String, Chatter> mo192221d() {
        return this.f139604d;
    }

    public MentionData(List<String> list, List<String> list2, List<String> list3, Map<String, Chatter> map) {
        this.f139601a = list;
        this.f139602b = list2;
        this.f139603c = list3;
        this.f139604d = map;
    }
}
