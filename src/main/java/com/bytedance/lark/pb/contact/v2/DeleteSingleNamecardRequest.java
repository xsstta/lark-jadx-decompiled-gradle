package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteSingleNamecardRequest extends Message<DeleteSingleNamecardRequest, C16430a> {
    public static final ProtoAdapter<DeleteSingleNamecardRequest> ADAPTER = new C16431b();
    private static final long serialVersionUID = 0;
    public final String namecard_id;

    /* renamed from: com.bytedance.lark.pb.contact.v2.DeleteSingleNamecardRequest$b */
    private static final class C16431b extends ProtoAdapter<DeleteSingleNamecardRequest> {
        C16431b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteSingleNamecardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteSingleNamecardRequest deleteSingleNamecardRequest) {
            int i;
            if (deleteSingleNamecardRequest.namecard_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteSingleNamecardRequest.namecard_id);
            } else {
                i = 0;
            }
            return i + deleteSingleNamecardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteSingleNamecardRequest decode(ProtoReader protoReader) throws IOException {
            C16430a aVar = new C16430a();
            aVar.f42729a = "";
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
                    aVar.f42729a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteSingleNamecardRequest deleteSingleNamecardRequest) throws IOException {
            if (deleteSingleNamecardRequest.namecard_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteSingleNamecardRequest.namecard_id);
            }
            protoWriter.writeBytes(deleteSingleNamecardRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.DeleteSingleNamecardRequest$a */
    public static final class C16430a extends Message.Builder<DeleteSingleNamecardRequest, C16430a> {

        /* renamed from: a */
        public String f42729a;

        /* renamed from: a */
        public DeleteSingleNamecardRequest build() {
            return new DeleteSingleNamecardRequest(this.f42729a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16430a mo58631a(String str) {
            this.f42729a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16430a newBuilder() {
        C16430a aVar = new C16430a();
        aVar.f42729a = this.namecard_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "DeleteSingleNamecardRequest");
        StringBuilder sb = new StringBuilder();
        if (this.namecard_id != null) {
            sb.append(", namecard_id=");
            sb.append(this.namecard_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteSingleNamecardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteSingleNamecardRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteSingleNamecardRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namecard_id = str;
    }
}
