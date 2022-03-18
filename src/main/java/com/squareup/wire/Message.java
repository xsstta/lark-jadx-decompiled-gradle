package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.Nullable;
import okio.AbstractC69698d;
import okio.ByteString;
import okio.C69694c;

public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    public abstract B newBuilder();

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        @Nullable
        transient C69694c unknownFieldsBuffer;
        transient ByteString unknownFieldsByteString = ByteString.EMPTY;
        transient ProtoWriter unknownFieldsWriter;

        public abstract M build();

        protected Builder() {
        }

        public final ByteString buildUnknownFields() {
            C69694c cVar = this.unknownFieldsBuffer;
            if (cVar != null) {
                this.unknownFieldsByteString = cVar.readByteString();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = ByteString.EMPTY;
            C69694c cVar = this.unknownFieldsBuffer;
            if (cVar != null) {
                cVar.mo244551g();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        private void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                C69694c cVar = new C69694c();
                this.unknownFieldsBuffer = cVar;
                ProtoWriter protoWriter = new ProtoWriter(cVar);
                this.unknownFieldsWriter = protoWriter;
                try {
                    protoWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = ByteString.EMPTY;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final Builder<M, B> addUnknownFields(ByteString byteString) {
            if (byteString.size() > 0) {
                prepareForNewUnknownFields();
                try {
                    this.unknownFieldsWriter.writeBytes(byteString);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, @Nullable Object obj) {
            prepareForNewUnknownFields();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        if (byteString != null) {
            return byteString;
        }
        return ByteString.EMPTY;
    }

    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.adapter.encode(outputStream, this);
    }

    public final void encode(AbstractC69698d dVar) throws IOException {
        this.adapter.encode(dVar, this);
    }

    protected Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        Objects.requireNonNull(protoAdapter, "adapter == null");
        Objects.requireNonNull(byteString, "unknownFields == null");
        this.adapter = protoAdapter;
        this.unknownFields = byteString;
    }
}
