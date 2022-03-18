package com.google.protobuf;

import com.google.protobuf.AbstractC23103a;
import com.google.protobuf.AbstractC23103a.AbstractC23104a;
import com.google.protobuf.AbstractC23125m;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.protobuf.a */
public abstract class AbstractC23103a<MessageType extends AbstractC23103a<MessageType, BuilderType>, BuilderType extends AbstractC23104a<MessageType, BuilderType>> implements AbstractC23125m {

    /* renamed from: a */
    protected int f57034a;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public UninitializedMessageException mo80226c() {
        return new UninitializedMessageException(this);
    }

    @Override // com.google.protobuf.AbstractC23125m
    /* renamed from: b */
    public byte[] mo80225b() {
        try {
            byte[] bArr = new byte[mo80296n()];
            CodedOutputStream a = CodedOutputStream.m83526a(bArr);
            mo80295a(a);
            a.mo80051b();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(mo103936a("byte array"), e);
        }
    }

    @Override // com.google.protobuf.AbstractC23125m
    /* renamed from: a */
    public ByteString mo80224a() {
        try {
            ByteString.C23036e newCodedBuilder = ByteString.newCodedBuilder(mo80296n());
            mo80295a(newCodedBuilder.mo80036b());
            return newCodedBuilder.mo80035a();
        } catch (IOException e) {
            throw new RuntimeException(mo103936a("ByteString"), e);
        }
    }

    /* renamed from: com.google.protobuf.a$a */
    public static abstract class AbstractC23104a<MessageType extends AbstractC23103a<MessageType, BuilderType>, BuilderType extends AbstractC23104a<MessageType, BuilderType>> implements AbstractC23125m.AbstractC23126a {
        /* renamed from: a */
        public abstract BuilderType clone();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract BuilderType mo80137a(MessageType messagetype);

        /* renamed from: a */
        public abstract BuilderType mo80138a(C23108e eVar, C23111g gVar) throws IOException;

        /* renamed from: b */
        protected static UninitializedMessageException m83746b(AbstractC23125m mVar) {
            return new UninitializedMessageException(mVar);
        }

        /* renamed from: a */
        public BuilderType mo80227a(C23108e eVar) throws IOException {
            return mo80138a(eVar, C23111g.m83798b());
        }

        /* renamed from: a */
        private static void mo103982a(Iterable<?> iterable) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
        }

        /* renamed from: a */
        private String mo103952a(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.protobuf.a$a<MessageType extends com.google.protobuf.a<MessageType, BuilderType>, BuilderType extends com.google.protobuf.a$a<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public BuilderType mo80232c(AbstractC23125m mVar) {
            if (mo80132m().getClass().isInstance(mVar)) {
                return (BuilderType) mo80137a((AbstractC23103a) mVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        /* renamed from: a */
        public BuilderType mo80231b(byte[] bArr) throws InvalidProtocolBufferException {
            return mo80230a(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        protected static <T> void m83745a(Iterable<T> iterable, Collection<? super T> collection) {
            Objects.requireNonNull(iterable);
            if (iterable instanceof AbstractC23124l) {
                mo103982a(((AbstractC23124l) iterable).mo80294a());
                collection.addAll((Collection) iterable);
            } else if (iterable instanceof Collection) {
                mo103982a((Iterable<?>) iterable);
                collection.addAll((Collection) iterable);
            } else {
                for (T t : iterable) {
                    Objects.requireNonNull(t);
                    collection.add(t);
                }
            }
        }

        /* renamed from: a */
        public BuilderType mo80230a(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                C23108e a = C23108e.m83767a(bArr, i, i2);
                mo80227a(a);
                a.mo80253a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(mo103952a("byte array"), e2);
            }
        }
    }

    /* renamed from: a */
    private String mo103936a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: a */
    protected static <T> void m83739a(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC23104a.m83745a(iterable, collection);
    }
}
