package com.ss.android.lark.moments.impl.detail;

import com.ss.android.lark.moments.impl.common.widget.AbstractC47291a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsKeyFinder;", "Lcom/ss/android/lark/moments/impl/common/widget/ItemFinder;", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailAdapter;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTargetItemPosition", "", "adapter", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.h */
public final class MomentsKeyFinder implements AbstractC47291a<MomentsDetailAdapter> {

    /* renamed from: a */
    private final String f119671a;

    public MomentsKeyFinder(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f119671a = str;
    }

    /* renamed from: a */
    public int getTargetItemPosition(MomentsDetailAdapter cVar) {
        if (cVar == null) {
            return -1;
        }
        int i = 0;
        for (T t : cVar.mo166594a()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t.mo166379a(), this.f119671a)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }
}
