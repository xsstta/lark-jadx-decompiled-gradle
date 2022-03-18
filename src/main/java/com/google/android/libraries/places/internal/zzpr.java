package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzpo;
import com.google.android.libraries.places.internal.zzpr;

public abstract class zzpr<MessageType extends zzpo<MessageType, BuilderType>, BuilderType extends zzpr<MessageType, BuilderType>> implements zzsj {
    /* renamed from: zza */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.libraries.places.internal.zzpr<MessageType extends com.google.android.libraries.places.internal.zzpo<MessageType, BuilderType>, BuilderType extends com.google.android.libraries.places.internal.zzpr<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzsj
    public final /* synthetic */ zzsj zza(zzsk zzsk) {
        if (zzm().getClass().isInstance(zzsk)) {
            return zza((zzpo) zzsk);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
