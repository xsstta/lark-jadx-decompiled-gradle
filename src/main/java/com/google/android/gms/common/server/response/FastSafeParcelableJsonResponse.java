package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Object mo73780a(String str) {
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public boolean mo73781b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field<?, ?> field : mo72968a().values()) {
            if (mo72969a(field)) {
                i = (i * 31) + mo72970b(field).hashCode();
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : mo72968a().values()) {
            if (mo72969a(field)) {
                if (!fastJsonResponse.mo72969a(field) || !mo72970b(field).equals(fastJsonResponse.mo72970b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo72969a(field)) {
                return false;
            }
        }
        return true;
    }
}
