package com.google.protobuf;

import com.google.protobuf.AbstractC23103a;
import com.google.protobuf.C23112h;
import com.google.protobuf.C23115i;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.AbstractC23068a;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC23068a<MessageType, BuilderType>> extends AbstractC23103a<MessageType, BuilderType> {

    /* renamed from: b */
    protected C23200v f56980b = C23200v.m83990a();

    /* renamed from: c */
    protected int f56981c = -1;

    public enum MethodToInvoke {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$c */
    static class C23070c implements AbstractC23077i {

        /* renamed from: a */
        static final C23070c f56987a = new C23070c();

        /* renamed from: b */
        static final C23071a f56988b = new C23071a();

        /* renamed from: com.google.protobuf.GeneratedMessageLite$c$a */
        static final class C23071a extends RuntimeException {
            C23071a() {
            }
        }

        private C23070c() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public <T> C23115i.AbstractC23118c<T> mo80153a(C23115i.AbstractC23118c<T> cVar, C23115i.AbstractC23118c<T> cVar2) {
            if (cVar.equals(cVar2)) {
                return cVar;
            }
            throw f56988b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public <T extends AbstractC23125m> T mo80154a(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f56988b;
            }
            ((GeneratedMessageLite) t).mo80121a(this, t2);
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public C23200v mo80155a(C23200v vVar, C23200v vVar2) {
            if (vVar.equals(vVar2)) {
                return vVar;
            }
            throw f56988b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public int mo80151a(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw f56988b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public long mo80152a(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw f56988b;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public String mo80156a(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f56988b;
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$d */
    public static abstract class AbstractC23072d<MessageType extends AbstractC23072d<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements AbstractC23073e<MessageType, BuilderType> {

        /* renamed from: d */
        protected C23112h<C23074f> f56989d = C23112h.m83799a();
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$e */
    public interface AbstractC23073e extends AbstractC23127n {
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.protobuf.GeneratedMessageLite$i */
    public interface AbstractC23077i {
        /* renamed from: a */
        int mo80151a(boolean z, int i, boolean z2, int i2);

        /* renamed from: a */
        long mo80152a(boolean z, long j, boolean z2, long j2);

        /* renamed from: a */
        <T> C23115i.AbstractC23118c<T> mo80153a(C23115i.AbstractC23118c<T> cVar, C23115i.AbstractC23118c<T> cVar2);

        /* renamed from: a */
        <T extends AbstractC23125m> T mo80154a(T t, T t2);

        /* renamed from: a */
        C23200v mo80155a(C23200v vVar, C23200v vVar2);

        /* renamed from: a */
        String mo80156a(boolean z, String str, boolean z2, String str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo80117a(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    /* renamed from: com.google.protobuf.GeneratedMessageLite$a */
    public static abstract class AbstractC23068a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC23068a<MessageType, BuilderType>> extends AbstractC23103a.AbstractC23104a<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f56983a;

        /* renamed from: b */
        protected boolean f56984b = false;

        /* renamed from: c */
        private final MessageType f56985c;

        /* renamed from: f */
        public MessageType mo80132m() {
            return this.f56985c;
        }

        @Override // com.google.protobuf.AbstractC23127n
        /* renamed from: h */
        public final boolean mo80127h() {
            return GeneratedMessageLite.m83629a((GeneratedMessageLite) this.f56983a, false);
        }

        /* renamed from: c */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) mo80132m().mo80131l();
            buildertype.mo80139b(mo80147g());
            return buildertype;
        }

        /* renamed from: e */
        public final MessageType mo80148i() {
            MessageType d = mo80147g();
            if (d.mo80127h()) {
                return d;
            }
            throw m83746b((AbstractC23125m) d);
        }

        /* renamed from: d */
        public MessageType mo80147g() {
            if (this.f56984b) {
                return this.f56983a;
            }
            this.f56983a.mo80126g();
            this.f56984b = true;
            return this.f56983a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo80141b() {
            if (this.f56984b) {
                MessageType messagetype = (MessageType) ((GeneratedMessageLite) this.f56983a.mo80115a(MethodToInvoke.NEW_MUTABLE_INSTANCE));
                messagetype.mo80119a(C23076h.f56994a, this.f56983a);
                this.f56983a = messagetype;
                this.f56984b = false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public BuilderType mo80137a(MessageType messagetype) {
            return mo80139b((GeneratedMessageLite) messagetype);
        }

        /* renamed from: b */
        public BuilderType mo80139b(MessageType messagetype) {
            mo80141b();
            this.f56983a.mo80119a(C23076h.f56994a, messagetype);
            return this;
        }

        protected AbstractC23068a(MessageType messagetype) {
            this.f56985c = messagetype;
            this.f56983a = (MessageType) ((GeneratedMessageLite) messagetype.mo80115a(MethodToInvoke.NEW_MUTABLE_INSTANCE));
        }

        /* renamed from: b */
        public BuilderType mo80138a(C23108e eVar, C23111g gVar) throws IOException {
            mo80141b();
            try {
                this.f56983a.mo80117a(MethodToInvoke.MERGE_FROM_STREAM, eVar, gVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.GeneratedMessageLite$f */
    public static final class C23074f implements C23112h.AbstractC23114a<C23074f> {

        /* renamed from: a */
        final int f56990a;

        /* renamed from: b */
        final WireFormat.FieldType f56991b;

        /* renamed from: c */
        final boolean f56992c;

        @Override // com.google.protobuf.C23112h.AbstractC23114a
        /* renamed from: a */
        public WireFormat.FieldType mo80158a() {
            return this.f56991b;
        }

        @Override // com.google.protobuf.C23112h.AbstractC23114a
        /* renamed from: b */
        public boolean mo80159b() {
            return this.f56992c;
        }

        /* renamed from: c */
        public int mo80160c() {
            return this.f56990a;
        }

        /* renamed from: a */
        public int compareTo(C23074f fVar) {
            return this.f56990a - fVar.f56990a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.GeneratedMessageLite$g */
    public static class C23075g implements AbstractC23077i {

        /* renamed from: a */
        public int f56993a;

        private C23075g() {
        }

        /* synthetic */ C23075g(C230671 r1) {
            this();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public <T> C23115i.AbstractC23118c<T> mo80153a(C23115i.AbstractC23118c<T> cVar, C23115i.AbstractC23118c<T> cVar2) {
            this.f56993a = (this.f56993a * 53) + cVar.hashCode();
            return cVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public <T extends AbstractC23125m> T mo80154a(T t, T t2) {
            int i;
            if (t == null) {
                i = 37;
            } else if (t instanceof GeneratedMessageLite) {
                i = ((GeneratedMessageLite) t).mo80114a(this);
            } else {
                i = t.hashCode();
            }
            this.f56993a = (this.f56993a * 53) + i;
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public C23200v mo80155a(C23200v vVar, C23200v vVar2) {
            this.f56993a = (this.f56993a * 53) + vVar.hashCode();
            return vVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public int mo80151a(boolean z, int i, boolean z2, int i2) {
            this.f56993a = (this.f56993a * 53) + i;
            return i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public long mo80152a(boolean z, long j, boolean z2, long j2) {
            this.f56993a = (this.f56993a * 53) + C23115i.m83808a(j);
            return j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public String mo80156a(boolean z, String str, boolean z2, String str2) {
            this.f56993a = (this.f56993a * 53) + str.hashCode();
            return str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.protobuf.GeneratedMessageLite$h */
    public static class C23076h implements AbstractC23077i {

        /* renamed from: a */
        public static final C23076h f56994a = new C23076h();

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public int mo80151a(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public long mo80152a(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public String mo80156a(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        private C23076h() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public C23200v mo80155a(C23200v vVar, C23200v vVar2) {
            if (vVar2 == C23200v.m83990a()) {
                return vVar;
            }
            return C23200v.m83992a(vVar, vVar2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public <T> C23115i.AbstractC23118c<T> mo80153a(C23115i.AbstractC23118c<T> cVar, C23115i.AbstractC23118c<T> cVar2) {
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.mo80236a()) {
                    cVar = cVar.mo80278a(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            return size > 0 ? cVar : cVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.AbstractC23077i
        /* renamed from: a */
        public <T extends AbstractC23125m> T mo80154a(T t, T t2) {
            return (t == null || t2 == null) ? t != null ? t : t2 : (T) t.mo80130k().mo80232c(t2).mo80148i();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.protobuf.GeneratedMessageLite<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite$a<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo80121a(C23070c cVar, AbstractC23125m mVar) {
        if (this == mVar) {
            return true;
        }
        if (!mo80132m().getClass().isInstance(mVar)) {
            return false;
        }
        mo80119a((AbstractC23077i) cVar, (GeneratedMessageLite) mVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo80120a(int i, C23108e eVar) throws IOException {
        if (WireFormat.m83735a(i) == 4) {
            return false;
        }
        mo103940o();
        return this.f56980b.mo80466a(i, eVar);
    }

    /* renamed from: j */
    protected static <E> C23115i.AbstractC23118c<E> m83630j() {
        return C23130q.m83841d();
    }

    /* renamed from: o */
    private final void mo103940o() {
        if (this.f56980b == C23200v.m83990a()) {
            this.f56980b = C23200v.m83994b();
        }
    }

    @Override // com.google.protobuf.AbstractC23125m
    /* renamed from: d */
    public final AbstractC23129p<MessageType> mo80122d() {
        return (AbstractC23129p) mo80115a(MethodToInvoke.GET_PARSER);
    }

    /* renamed from: e */
    public final MessageType mo80132m() {
        return (MessageType) ((GeneratedMessageLite) mo80115a(MethodToInvoke.GET_DEFAULT_INSTANCE));
    }

    /* renamed from: f */
    public final BuilderType mo80131l() {
        return (BuilderType) ((AbstractC23068a) mo80115a(MethodToInvoke.NEW_BUILDER));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo80126g() {
        mo80115a(MethodToInvoke.MAKE_IMMUTABLE);
        this.f56980b.mo80467c();
    }

    @Override // com.google.protobuf.AbstractC23127n
    /* renamed from: h */
    public final boolean mo80127h() {
        if (mo80116a(MethodToInvoke.IS_INITIALIZED, Boolean.TRUE) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final BuilderType mo80130k() {
        BuilderType buildertype = (BuilderType) ((AbstractC23068a) mo80115a(MethodToInvoke.NEW_BUILDER));
        buildertype.mo80139b(this);
        return buildertype;
    }

    public String toString() {
        return C23128o.m83834a(this, super.toString());
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$1 */
    static /* synthetic */ class C230671 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56982a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.protobuf.WireFormat$JavaType[] r0 = com.google.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.protobuf.GeneratedMessageLite.C230671.f56982a = r0
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.google.protobuf.GeneratedMessageLite.C230671.f56982a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.C230671.<clinit>():void");
        }
    }

    public int hashCode() {
        if (this.f57034a == 0) {
            C23075g gVar = new C23075g(null);
            mo80119a(gVar, this);
            this.f57034a = gVar.f56993a;
        }
        return this.f57034a;
    }

    protected static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final String messageClassName;

        /* access modifiers changed from: protected */
        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((AbstractC23125m) declaredField.get(null)).mo80131l().mo80231b(this.asBytes).mo80147g();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e2) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }

        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((AbstractC23125m) declaredField.get(null)).mo80131l().mo80231b(this.asBytes).mo80147g();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e2);
            } catch (SecurityException e3) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Unable to call parsePartialFrom", e4);
            } catch (InvalidProtocolBufferException e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            }
        }

        public static SerializedForm of(AbstractC23125m mVar) {
            return new SerializedForm(mVar);
        }

        SerializedForm(AbstractC23125m mVar) {
            this.messageClassName = mVar.getClass().getName();
            this.asBytes = mVar.mo80225b();
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$b */
    protected static class C23069b<T extends GeneratedMessageLite<T, ?>> extends AbstractC23105b<T> {

        /* renamed from: a */
        private T f56986a;

        public C23069b(T t) {
            this.f56986a = t;
        }

        /* renamed from: a */
        public T mo80150b(C23108e eVar, C23111g gVar) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.m83626a(this.f56986a, eVar, gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo80115a(MethodToInvoke methodToInvoke) {
        return mo80117a(methodToInvoke, (Object) null, (Object) null);
    }

    /* renamed from: a */
    protected static <E> C23115i.AbstractC23118c<E> m83627a(C23115i.AbstractC23118c<E> cVar) {
        int i;
        int size = cVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return cVar.mo80278a(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.protobuf.GeneratedMessageLite<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite$a<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mo80132m().getClass().isInstance(obj)) {
            return false;
        }
        try {
            mo80119a((AbstractC23077i) C23070c.f56987a, (GeneratedMessageLite) obj);
            return true;
        } catch (C23070c.C23071a unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo80114a(C23075g gVar) {
        if (this.f57034a == 0) {
            int i = gVar.f56993a;
            gVar.f56993a = 0;
            mo80119a(gVar, this);
            this.f57034a = gVar.f56993a;
            gVar.f56993a = i;
        }
        return this.f57034a;
    }

    /* renamed from: a */
    protected static final <T extends GeneratedMessageLite<T, ?>> boolean m83629a(T t, boolean z) {
        if (t.mo80116a(MethodToInvoke.IS_INITIALIZED, Boolean.valueOf(z)) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo80116a(MethodToInvoke methodToInvoke, Object obj) {
        return mo80117a(methodToInvoke, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80118a(int i, int i2) {
        mo103940o();
        this.f56980b.mo80463a(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80119a(AbstractC23077i iVar, MessageType messagetype) {
        mo80117a(MethodToInvoke.VISIT, iVar, messagetype);
        this.f56980b = iVar.mo80155a(this.f56980b, messagetype.f56980b);
    }

    /* renamed from: a */
    static <T extends GeneratedMessageLite<T, ?>> T m83626a(T t, C23108e eVar, C23111g gVar) throws InvalidProtocolBufferException {
        T t2 = (T) ((GeneratedMessageLite) t.mo80115a(MethodToInvoke.NEW_MUTABLE_INSTANCE));
        try {
            t2.mo80117a(MethodToInvoke.MERGE_FROM_STREAM, eVar, gVar);
            t2.mo80126g();
            return t2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw e;
        }
    }

    /* renamed from: a */
    static Object m83628a(Method method, Object obj, Object... objArr) {
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
