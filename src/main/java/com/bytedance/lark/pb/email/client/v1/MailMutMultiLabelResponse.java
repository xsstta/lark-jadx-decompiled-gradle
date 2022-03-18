package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailMutMultiLabelResponse extends Message<MailMutMultiLabelResponse, C16838a> {
    public static final ProtoAdapter<MailMutMultiLabelResponse> ADAPTER = new C16839b();
    private static final long serialVersionUID = 0;
    public final String uuid;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelResponse$b */
    private static final class C16839b extends ProtoAdapter<MailMutMultiLabelResponse> {
        C16839b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMutMultiLabelResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMutMultiLabelResponse mailMutMultiLabelResponse) {
            int i;
            if (mailMutMultiLabelResponse.uuid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailMutMultiLabelResponse.uuid);
            } else {
                i = 0;
            }
            return i + mailMutMultiLabelResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailMutMultiLabelResponse decode(ProtoReader protoReader) throws IOException {
            C16838a aVar = new C16838a();
            aVar.f43308a = "";
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
                    aVar.f43308a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMutMultiLabelResponse mailMutMultiLabelResponse) throws IOException {
            if (mailMutMultiLabelResponse.uuid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailMutMultiLabelResponse.uuid);
            }
            protoWriter.writeBytes(mailMutMultiLabelResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelResponse$a */
    public static final class C16838a extends Message.Builder<MailMutMultiLabelResponse, C16838a> {

        /* renamed from: a */
        public String f43308a;

        /* renamed from: a */
        public MailMutMultiLabelResponse build() {
            return new MailMutMultiLabelResponse(this.f43308a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16838a newBuilder() {
        C16838a aVar = new C16838a();
        aVar.f43308a = this.uuid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMutMultiLabelResponse");
        StringBuilder sb = new StringBuilder();
        if (this.uuid != null) {
            sb.append(", uuid=");
            sb.append(this.uuid);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMutMultiLabelResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailMutMultiLabelResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailMutMultiLabelResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uuid = str;
    }
}
