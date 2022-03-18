package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteChatterWorkStatusRequest extends Message<DeleteChatterWorkStatusRequest, C16160a> {
    public static final ProtoAdapter<DeleteChatterWorkStatusRequest> ADAPTER = new C16161b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteChatterWorkStatusRequest$b */
    private static final class C16161b extends ProtoAdapter<DeleteChatterWorkStatusRequest> {
        C16161b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteChatterWorkStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteChatterWorkStatusRequest deleteChatterWorkStatusRequest) {
            return deleteChatterWorkStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteChatterWorkStatusRequest decode(ProtoReader protoReader) throws IOException {
            C16160a aVar = new C16160a();
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
        public void encode(ProtoWriter protoWriter, DeleteChatterWorkStatusRequest deleteChatterWorkStatusRequest) throws IOException {
            protoWriter.writeBytes(deleteChatterWorkStatusRequest.unknownFields());
        }
    }

    public DeleteChatterWorkStatusRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteChatterWorkStatusRequest$a */
    public static final class C16160a extends Message.Builder<DeleteChatterWorkStatusRequest, C16160a> {
        /* renamed from: a */
        public DeleteChatterWorkStatusRequest build() {
            return new DeleteChatterWorkStatusRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16160a newBuilder() {
        C16160a aVar = new C16160a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "DeleteChatterWorkStatusRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteChatterWorkStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteChatterWorkStatusRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
