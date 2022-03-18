package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.ByteviewUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/entity/response/GetShareCodeInfoEntity;", "", "byteViewUser", "Lcom/ss/android/vc/entity/ByteviewUser;", "(Lcom/ss/android/vc/entity/ByteviewUser;)V", "getByteViewUser", "()Lcom/ss/android/vc/entity/ByteviewUser;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.response.u */
public final class GetShareCodeInfoEntity {

    /* renamed from: a */
    private final ByteviewUser f152722a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GetShareCodeInfoEntity) && Intrinsics.areEqual(this.f152722a, ((GetShareCodeInfoEntity) obj).f152722a);
        }
        return true;
    }

    public int hashCode() {
        ByteviewUser byteviewUser = this.f152722a;
        if (byteviewUser != null) {
            return byteviewUser.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "GetShareCodeInfoEntity(byteViewUser=" + this.f152722a + ")";
    }

    /* renamed from: a */
    public final ByteviewUser mo210134a() {
        return this.f152722a;
    }

    public GetShareCodeInfoEntity(ByteviewUser byteviewUser) {
        Intrinsics.checkParameterIsNotNull(byteviewUser, "byteViewUser");
        this.f152722a = byteviewUser;
    }
}
