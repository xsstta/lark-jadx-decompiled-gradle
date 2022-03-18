package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailEditMessageResponse extends Message<MailEditMessageResponse, C16702a> {
    public static final ProtoAdapter<MailEditMessageResponse> ADAPTER = new C16703b();
    private static final long serialVersionUID = 0;
    public final Draft draft;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailEditMessageResponse$b */
    private static final class C16703b extends ProtoAdapter<MailEditMessageResponse> {
        C16703b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailEditMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailEditMessageResponse mailEditMessageResponse) {
            int i;
            if (mailEditMessageResponse.draft != null) {
                i = Draft.ADAPTER.encodedSizeWithTag(1, mailEditMessageResponse.draft);
            } else {
                i = 0;
            }
            return i + mailEditMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailEditMessageResponse decode(ProtoReader protoReader) throws IOException {
            C16702a aVar = new C16702a();
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
                    aVar.f43167a = Draft.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailEditMessageResponse mailEditMessageResponse) throws IOException {
            if (mailEditMessageResponse.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 1, mailEditMessageResponse.draft);
            }
            protoWriter.writeBytes(mailEditMessageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailEditMessageResponse$a */
    public static final class C16702a extends Message.Builder<MailEditMessageResponse, C16702a> {

        /* renamed from: a */
        public Draft f43167a;

        /* renamed from: a */
        public MailEditMessageResponse build() {
            return new MailEditMessageResponse(this.f43167a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16702a newBuilder() {
        C16702a aVar = new C16702a();
        aVar.f43167a = this.draft;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailEditMessageResponse");
        StringBuilder sb = new StringBuilder();
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        StringBuilder replace = sb.replace(0, 2, "MailEditMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailEditMessageResponse(Draft draft2) {
        this(draft2, ByteString.EMPTY);
    }

    public MailEditMessageResponse(Draft draft2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft = draft2;
    }
}
