package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;
import com.google.android.libraries.places.internal.zzqy.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzqy<MessageType extends zzqy<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzpo<MessageType, BuilderType> {
    private static Map<Object, zzqy<?, ?>> zzd = new ConcurrentHashMap();
    protected zzts zzb = zzts.zza();
    private int zzc = -1;

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzqy<MessageType, BuilderType> implements zzsm {
        protected zzqt<zzc> zzc = zzqt.zza();
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    public static abstract class zzb<MessageType extends zzqy<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzpr<MessageType, BuilderType> {
        protected MessageType zza;
        protected boolean zzb = false;
        private final MessageType zzc;

        @Override // com.google.android.libraries.places.internal.zzsm
        public final /* synthetic */ zzsk zzm() {
            return this.zzc;
        }

        @Override // com.google.android.libraries.places.internal.zzpr
        public final /* synthetic */ zzpr zza() {
            return (zzb) clone();
        }

        @Override // com.google.android.libraries.places.internal.zzsm
        public final boolean zzg() {
            return zzqy.zza((zzqy) this.zza, false);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.google.android.libraries.places.internal.zzqy$zzb */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Object, com.google.android.libraries.places.internal.zzpr
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzb2 = (zzb) this.zzc.zza(zze.zze, null, null);
            zzb2.zza((zzqy) zze());
            return zzb2;
        }

        /* access modifiers changed from: protected */
        public void zzb() {
            MessageType messagetype = (MessageType) ((zzqy) this.zza.zza(zze.zzd, null, null));
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        /* renamed from: zzc */
        public MessageType zze() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzsw.zza().zza(messagetype).zzb(messagetype);
            this.zzb = true;
            return this.zza;
        }

        /* renamed from: zzd */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) ((zzqy) zze());
            if (messagetype.zzg()) {
                return messagetype;
            }
            throw new zztq(messagetype);
        }

        protected zzb(MessageType messagetype) {
            this.zzc = messagetype;
            this.zza = (MessageType) ((zzqy) messagetype.zza(zze.zzd, null, null));
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzb();
                this.zzb = false;
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzsw.zza().zza(messagetype).zzb(messagetype, messagetype2);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzpo
    public final int zze() {
        return this.zzc;
    }

    static final class zzc implements zzqv<zzc> {
        @Override // com.google.android.libraries.places.internal.zzqv
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.libraries.places.internal.zzqv
        public final zzud zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.libraries.places.internal.zzqv
        public final zzuk zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.libraries.places.internal.zzqv
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.libraries.places.internal.zzqv
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.libraries.places.internal.zzqv
        public final zzsj zza(zzsj zzsj, zzsk zzsk) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.libraries.places.internal.zzqv
        public final zzsq zza(zzsq zzsq, zzsq zzsq2) {
            throw new NoSuchMethodError();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.libraries.places.internal.zzrg, com.google.android.libraries.places.internal.zzra] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.google.android.libraries.places.internal.zzrg zzi() {
        /*
            com.google.android.libraries.places.internal.zzra r0 = com.google.android.libraries.places.internal.zzra.zzd()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqy.zzi():com.google.android.libraries.places.internal.zzrg");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.libraries.places.internal.zzry, com.google.android.libraries.places.internal.zzri] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.google.android.libraries.places.internal.zzri zzj() {
        /*
            com.google.android.libraries.places.internal.zzry r0 = com.google.android.libraries.places.internal.zzry.zzd()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqy.zzj():com.google.android.libraries.places.internal.zzri");
    }

    protected static <E> zzrh<E> zzk() {
        return zzsv.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzsm
    public final boolean zzg() {
        Boolean bool = Boolean.TRUE;
        return zza((zzqy) this, true);
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 1;
        public static final int zzi = 2;
        public static final int zzj = 1;
        public static final int zzk = 2;
        private static final /* synthetic */ int[] zzl = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzm = {1, 2};
        private static final /* synthetic */ int[] zzn = {1, 2};

        public static int[] zza() {
            return (int[]) zzl.clone();
        }
    }

    public String toString() {
        return zzsl.zza(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzqy<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzf() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null));
    }

    @Override // com.google.android.libraries.places.internal.zzsk
    public final /* synthetic */ zzsj zzl() {
        zzb zzb2 = (zzb) zza(zze.zze, (Object) null, (Object) null);
        zzb2.zza((zzqy) this);
        return zzb2;
    }

    @Override // com.google.android.libraries.places.internal.zzsm
    public final /* synthetic */ zzsk zzm() {
        return (zzqy) zza(zze.zzf, (Object) null, (Object) null);
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = zzsw.zza().zza(this).zza(this);
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzsk
    public final int zzh() {
        if (this.zzc == -1) {
            this.zzc = zzsw.zza().zza(this).zzd(this);
        }
        return this.zzc;
    }

    public static class zza<T extends zzqy<T, ?>> extends zzpt<T> {
        private final T zza;

        public zza(T t) {
            this.zza = t;
        }
    }

    protected static <E> zzrh<E> zza(zzrh<E> zzrh) {
        int i;
        int size = zzrh.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return zzrh.zzb(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzsw.zza().zza(this).zza(this, (zzqy) obj);
        }
        return false;
    }

    static <T extends zzqy<?, ?>> T zza(Class<T> cls) {
        zzqy<?, ?> zzqy = zzd.get(cls);
        if (zzqy == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzqy = (T) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzqy == null) {
            zzqy = (T) ((zzqy) ((zzqy) zztv.zza(cls)).zza(zze.zzf, (Object) null, (Object) null));
            if (zzqy != null) {
                zzd.put(cls, zzqy);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzqy;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzpo
    public final void zza(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.libraries.places.internal.zzsk
    public final void zza(zzqk zzqk) throws IOException {
        zzsw.zza().zza(this).zza((Object) this, (zzuj) zzqn.zza(zzqk));
    }

    protected static <T extends zzqy<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends zzqy<T, ?>> boolean zza(T t, boolean z) {
        Object obj;
        byte byteValue = ((Byte) t.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzc2 = zzsw.zza().zza(t).zzc(t);
        if (z) {
            int i = zze.zzb;
            if (zzc2) {
                obj = t;
            } else {
                obj = null;
            }
            t.zza(i, obj, null);
        }
        return zzc2;
    }

    protected static Object zza(zzsk zzsk, String str, Object[] objArr) {
        return new zzsy(zzsk, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }
}
