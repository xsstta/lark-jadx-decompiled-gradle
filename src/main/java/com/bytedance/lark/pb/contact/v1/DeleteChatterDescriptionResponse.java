package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteChatterDescriptionResponse extends Message<DeleteChatterDescriptionResponse, C16158a> {
    public static final ProtoAdapter<DeleteChatterDescriptionResponse> ADAPTER = new C16159b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteChatterDescriptionResponse$b */
    private static final class C16159b extends ProtoAdapter<DeleteChatterDescriptionResponse> {
        C16159b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteChatterDescriptionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteChatterDescriptionResponse deleteChatterDescriptionResponse) {
            return deleteChatterDescriptionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteChatterDescriptionResponse decode(ProtoReader protoReader) throws IOException {
            C16158a aVar = new C16158a();
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
        public void encode(ProtoWriter protoWriter, DeleteChatterDescriptionResponse deleteChatterDescriptionResponse) throws IOException {
            protoWriter.writeBytes(deleteChatterDescriptionResponse.unknownFields());
        }
    }

    public DeleteChatterDescriptionResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteChatterDescriptionResponse$a */
    public static final class C16158a extends Message.Builder<DeleteChatterDescriptionResponse, C16158a> {
        /* renamed from: a */
        public DeleteChatterDescriptionResponse build() {
            return new DeleteChatterDescriptionResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16158a newBuilder() {
        C16158a aVar = new C16158a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "DeleteChatterDescriptionResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteChatterDescriptionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteChatterDescriptionResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
