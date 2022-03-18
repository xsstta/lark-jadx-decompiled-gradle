package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DeleteEphemeralMessageRequest extends Message<DeleteEphemeralMessageRequest, C17410a> {
    public static final ProtoAdapter<DeleteEphemeralMessageRequest> ADAPTER = new C17411b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteEphemeralMessageRequest$b */
    private static final class C17411b extends ProtoAdapter<DeleteEphemeralMessageRequest> {
        C17411b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteEphemeralMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteEphemeralMessageRequest deleteEphemeralMessageRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteEphemeralMessageRequest.message_id) + deleteEphemeralMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteEphemeralMessageRequest decode(ProtoReader protoReader) throws IOException {
            C17410a aVar = new C17410a();
            aVar.f44317a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44317a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteEphemeralMessageRequest deleteEphemeralMessageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteEphemeralMessageRequest.message_id);
            protoWriter.writeBytes(deleteEphemeralMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteEphemeralMessageRequest$a */
    public static final class C17410a extends Message.Builder<DeleteEphemeralMessageRequest, C17410a> {

        /* renamed from: a */
        public String f44317a;

        /* renamed from: a */
        public DeleteEphemeralMessageRequest build() {
            String str = this.f44317a;
            if (str != null) {
                return new DeleteEphemeralMessageRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C17410a mo61090a(String str) {
            this.f44317a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17410a newBuilder() {
        C17410a aVar = new C17410a();
        aVar.f44317a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteEphemeralMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        StringBuilder replace = sb.replace(0, 2, "DeleteEphemeralMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteEphemeralMessageRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteEphemeralMessageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
