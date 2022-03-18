package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class NoOpChange extends Message<NoOpChange, C17076a> {
    public static final ProtoAdapter<NoOpChange> ADAPTER = new C17077b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.v1.NoOpChange$b */
    private static final class C17077b extends ProtoAdapter<NoOpChange> {
        C17077b() {
            super(FieldEncoding.LENGTH_DELIMITED, NoOpChange.class);
        }

        /* renamed from: a */
        public int encodedSize(NoOpChange noOpChange) {
            return noOpChange.unknownFields().size();
        }

        /* renamed from: a */
        public NoOpChange decode(ProtoReader protoReader) throws IOException {
            C17076a aVar = new C17076a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NoOpChange noOpChange) throws IOException {
            protoWriter.writeBytes(noOpChange.unknownFields());
        }
    }

    public NoOpChange() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.NoOpChange$a */
    public static final class C17076a extends Message.Builder<NoOpChange, C17076a> {
        /* renamed from: a */
        public NoOpChange build() {
            return new NoOpChange(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17076a newBuilder() {
        C17076a aVar = new C17076a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "NoOpChange");
        StringBuilder replace = new StringBuilder().replace(0, 2, "NoOpChange{");
        replace.append('}');
        return replace.toString();
    }

    public NoOpChange(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
