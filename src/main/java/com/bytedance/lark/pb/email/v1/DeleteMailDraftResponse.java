package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteMailDraftResponse extends Message<DeleteMailDraftResponse, C17004a> {
    public static final ProtoAdapter<DeleteMailDraftResponse> ADAPTER = new C17005b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.v1.DeleteMailDraftResponse$b */
    private static final class C17005b extends ProtoAdapter<DeleteMailDraftResponse> {
        C17005b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMailDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteMailDraftResponse deleteMailDraftResponse) {
            return deleteMailDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteMailDraftResponse decode(ProtoReader protoReader) throws IOException {
            C17004a aVar = new C17004a();
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
        public void encode(ProtoWriter protoWriter, DeleteMailDraftResponse deleteMailDraftResponse) throws IOException {
            protoWriter.writeBytes(deleteMailDraftResponse.unknownFields());
        }
    }

    public DeleteMailDraftResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.DeleteMailDraftResponse$a */
    public static final class C17004a extends Message.Builder<DeleteMailDraftResponse, C17004a> {
        /* renamed from: a */
        public DeleteMailDraftResponse build() {
            return new DeleteMailDraftResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17004a newBuilder() {
        C17004a aVar = new C17004a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "DeleteMailDraftResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteMailDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteMailDraftResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
