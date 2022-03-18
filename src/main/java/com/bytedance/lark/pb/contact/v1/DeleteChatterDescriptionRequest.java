package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DeleteChatterDescriptionRequest extends Message<DeleteChatterDescriptionRequest, C16156a> {
    public static final ProtoAdapter<DeleteChatterDescriptionRequest> ADAPTER = new C16157b();
    private static final long serialVersionUID = 0;
    public final Chatter.Description description;

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteChatterDescriptionRequest$b */
    private static final class C16157b extends ProtoAdapter<DeleteChatterDescriptionRequest> {
        C16157b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteChatterDescriptionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteChatterDescriptionRequest deleteChatterDescriptionRequest) {
            return Chatter.Description.ADAPTER.encodedSizeWithTag(1, deleteChatterDescriptionRequest.description) + deleteChatterDescriptionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteChatterDescriptionRequest decode(ProtoReader protoReader) throws IOException {
            C16156a aVar = new C16156a();
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
                    aVar.f42279a = Chatter.Description.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteChatterDescriptionRequest deleteChatterDescriptionRequest) throws IOException {
            Chatter.Description.ADAPTER.encodeWithTag(protoWriter, 1, deleteChatterDescriptionRequest.description);
            protoWriter.writeBytes(deleteChatterDescriptionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.DeleteChatterDescriptionRequest$a */
    public static final class C16156a extends Message.Builder<DeleteChatterDescriptionRequest, C16156a> {

        /* renamed from: a */
        public Chatter.Description f42279a;

        /* renamed from: a */
        public DeleteChatterDescriptionRequest build() {
            Chatter.Description description = this.f42279a;
            if (description != null) {
                return new DeleteChatterDescriptionRequest(description, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(description, "description");
        }

        /* renamed from: a */
        public C16156a mo57977a(Chatter.Description description) {
            this.f42279a = description;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16156a newBuilder() {
        C16156a aVar = new C16156a();
        aVar.f42279a = this.description;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "DeleteChatterDescriptionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", description=");
        sb.append(this.description);
        StringBuilder replace = sb.replace(0, 2, "DeleteChatterDescriptionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteChatterDescriptionRequest(Chatter.Description description2) {
        this(description2, ByteString.EMPTY);
    }

    public DeleteChatterDescriptionRequest(Chatter.Description description2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.description = description2;
    }
}
