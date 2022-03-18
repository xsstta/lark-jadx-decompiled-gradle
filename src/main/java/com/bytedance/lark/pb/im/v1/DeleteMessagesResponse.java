package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteMessagesResponse extends Message<DeleteMessagesResponse, C17416a> {
    public static final ProtoAdapter<DeleteMessagesResponse> ADAPTER = new C17417b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteMessagesResponse$b */
    private static final class C17417b extends ProtoAdapter<DeleteMessagesResponse> {
        C17417b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMessagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteMessagesResponse deleteMessagesResponse) {
            return deleteMessagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteMessagesResponse decode(ProtoReader protoReader) throws IOException {
            C17416a aVar = new C17416a();
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
        public void encode(ProtoWriter protoWriter, DeleteMessagesResponse deleteMessagesResponse) throws IOException {
            protoWriter.writeBytes(deleteMessagesResponse.unknownFields());
        }
    }

    public DeleteMessagesResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteMessagesResponse$a */
    public static final class C17416a extends Message.Builder<DeleteMessagesResponse, C17416a> {
        /* renamed from: a */
        public DeleteMessagesResponse build() {
            return new DeleteMessagesResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17416a newBuilder() {
        C17416a aVar = new C17416a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteMessagesResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteMessagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteMessagesResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
