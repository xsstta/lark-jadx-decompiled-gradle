package com.ss.android.lark.todo.impl.features.detail.assignee.service.data;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.todo.v1.GetRecommendedContentsResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/RecommendData;", "", "recommend_contents", "", "Lcom/bytedance/lark/pb/todo/v1/GetRecommendedContentsResponse$RecommendContent;", "chatters", "", "", "Lcom/bytedance/lark/pb/basic/v1/Chatter;", "(Ljava/util/List;Ljava/util/Map;)V", "getChatters", "()Ljava/util/Map;", "getRecommend_contents", "()Ljava/util/List;", "setRecommend_contents", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.b.a.b */
public final class RecommendData {

    /* renamed from: a */
    private List<GetRecommendedContentsResponse.RecommendContent> f139605a;

    /* renamed from: b */
    private final Map<String, Chatter> f139606b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendData)) {
            return false;
        }
        RecommendData bVar = (RecommendData) obj;
        return Intrinsics.areEqual(this.f139605a, bVar.f139605a) && Intrinsics.areEqual(this.f139606b, bVar.f139606b);
    }

    public int hashCode() {
        List<GetRecommendedContentsResponse.RecommendContent> list = this.f139605a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Map<String, Chatter> map = this.f139606b;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RecommendData(recommend_contents=" + this.f139605a + ", chatters=" + this.f139606b + ")";
    }

    /* renamed from: a */
    public final List<GetRecommendedContentsResponse.RecommendContent> mo192225a() {
        return this.f139605a;
    }

    /* renamed from: b */
    public final Map<String, Chatter> mo192226b() {
        return this.f139606b;
    }

    public RecommendData(List<GetRecommendedContentsResponse.RecommendContent> list, Map<String, Chatter> map) {
        this.f139605a = list;
        this.f139606b = map;
    }
}
