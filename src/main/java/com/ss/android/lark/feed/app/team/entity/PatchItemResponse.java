package com.ss.android.lark.feed.app.team.entity;

import com.ss.android.lark.team.entity.Item;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/feed/app/team/entity/PatchItemResponse;", "", "item", "Lcom/ss/android/lark/team/entity/Item;", "(Lcom/ss/android/lark/team/entity/Item;)V", "getItem", "()Lcom/ss/android/lark/team/entity/Item;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.entity.b */
public final class PatchItemResponse {

    /* renamed from: a */
    private final Item f97124a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PatchItemResponse) && Intrinsics.areEqual(this.f97124a, ((PatchItemResponse) obj).f97124a);
        }
        return true;
    }

    public int hashCode() {
        Item item = this.f97124a;
        if (item != null) {
            return item.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PatchItemResponse(item=" + this.f97124a + ")";
    }

    /* renamed from: a */
    public final Item mo138721a() {
        return this.f97124a;
    }

    public PatchItemResponse(Item item) {
        this.f97124a = item;
    }
}
