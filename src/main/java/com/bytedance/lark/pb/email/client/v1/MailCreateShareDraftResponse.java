package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateShareDraftResponse extends Message<MailCreateShareDraftResponse, C16674a> {
    public static final ProtoAdapter<MailCreateShareDraftResponse> ADAPTER = new C16675b();
    private static final long serialVersionUID = 0;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareDraftResponse$b */
    private static final class C16675b extends ProtoAdapter<MailCreateShareDraftResponse> {
        C16675b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateShareDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateShareDraftResponse mailCreateShareDraftResponse) {
            int i;
            if (mailCreateShareDraftResponse.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateShareDraftResponse.thread_id);
            } else {
                i = 0;
            }
            return i + mailCreateShareDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateShareDraftResponse decode(ProtoReader protoReader) throws IOException {
            C16674a aVar = new C16674a();
            aVar.f43145a = "";
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
                    aVar.f43145a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateShareDraftResponse mailCreateShareDraftResponse) throws IOException {
            if (mailCreateShareDraftResponse.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateShareDraftResponse.thread_id);
            }
            protoWriter.writeBytes(mailCreateShareDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailCreateShareDraftResponse$a */
    public static final class C16674a extends Message.Builder<MailCreateShareDraftResponse, C16674a> {

        /* renamed from: a */
        public String f43145a;

        /* renamed from: a */
        public MailCreateShareDraftResponse build() {
            return new MailCreateShareDraftResponse(this.f43145a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16674a newBuilder() {
        C16674a aVar = new C16674a();
        aVar.f43145a = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateShareDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateShareDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateShareDraftResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailCreateShareDraftResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
    }
}
