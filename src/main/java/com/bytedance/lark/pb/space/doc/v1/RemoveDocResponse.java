package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class RemoveDocResponse extends Message<RemoveDocResponse, C19275a> {
    public static final ProtoAdapter<RemoveDocResponse> ADAPTER = new C19276b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.RemoveDocResponse$b */
    private static final class C19276b extends ProtoAdapter<RemoveDocResponse> {
        C19276b() {
            super(FieldEncoding.LENGTH_DELIMITED, RemoveDocResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RemoveDocResponse removeDocResponse) {
            return removeDocResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RemoveDocResponse decode(ProtoReader protoReader) throws IOException {
            C19275a aVar = new C19275a();
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
        public void encode(ProtoWriter protoWriter, RemoveDocResponse removeDocResponse) throws IOException {
            protoWriter.writeBytes(removeDocResponse.unknownFields());
        }
    }

    public RemoveDocResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.RemoveDocResponse$a */
    public static final class C19275a extends Message.Builder<RemoveDocResponse, C19275a> {
        /* renamed from: a */
        public RemoveDocResponse build() {
            return new RemoveDocResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19275a newBuilder() {
        C19275a aVar = new C19275a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "RemoveDocResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "RemoveDocResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RemoveDocResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
