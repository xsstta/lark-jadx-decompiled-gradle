package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateDraftResponse extends Message<MailCreateDraftResponse, C16666a> {
    public static final ProtoAdapter<MailCreateDraftResponse> ADAPTER = new C16667b();
    private static final long serialVersionUID = 0;
    public final Draft draft;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateDraftResponse$b */
    private static final class C16667b extends ProtoAdapter<MailCreateDraftResponse> {
        C16667b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateDraftResponse mailCreateDraftResponse) {
            int i;
            if (mailCreateDraftResponse.draft != null) {
                i = Draft.ADAPTER.encodedSizeWithTag(1, mailCreateDraftResponse.draft);
            } else {
                i = 0;
            }
            return i + mailCreateDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateDraftResponse decode(ProtoReader protoReader) throws IOException {
            C16666a aVar = new C16666a();
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
                    aVar.f43130a = Draft.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateDraftResponse mailCreateDraftResponse) throws IOException {
            if (mailCreateDraftResponse.draft != null) {
                Draft.ADAPTER.encodeWithTag(protoWriter, 1, mailCreateDraftResponse.draft);
            }
            protoWriter.writeBytes(mailCreateDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateDraftResponse$a */
    public static final class C16666a extends Message.Builder<MailCreateDraftResponse, C16666a> {

        /* renamed from: a */
        public Draft f43130a;

        /* renamed from: a */
        public MailCreateDraftResponse build() {
            return new MailCreateDraftResponse(this.f43130a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16666a newBuilder() {
        C16666a aVar = new C16666a();
        aVar.f43130a = this.draft;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.draft != null) {
            sb.append(", draft=");
            sb.append(this.draft);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateDraftResponse(Draft draft2) {
        this(draft2, ByteString.EMPTY);
    }

    public MailCreateDraftResponse(Draft draft2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft = draft2;
    }
}
