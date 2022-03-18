package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailSearchHistoryResponse extends Message<MailSearchHistoryResponse, C16868a> {
    public static final ProtoAdapter<MailSearchHistoryResponse> ADAPTER = new C16869b();
    public static final Boolean DEFAULT_RESULT = false;
    private static final long serialVersionUID = 0;
    public final List<String> keywords;
    public final Boolean result;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchHistoryResponse$b */
    private static final class C16869b extends ProtoAdapter<MailSearchHistoryResponse> {
        C16869b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSearchHistoryResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSearchHistoryResponse mailSearchHistoryResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailSearchHistoryResponse.keywords);
            if (mailSearchHistoryResponse.result != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailSearchHistoryResponse.result);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mailSearchHistoryResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSearchHistoryResponse decode(ProtoReader protoReader) throws IOException {
            C16868a aVar = new C16868a();
            aVar.f43333b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43332a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43333b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSearchHistoryResponse mailSearchHistoryResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailSearchHistoryResponse.keywords);
            if (mailSearchHistoryResponse.result != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailSearchHistoryResponse.result);
            }
            protoWriter.writeBytes(mailSearchHistoryResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchHistoryResponse$a */
    public static final class C16868a extends Message.Builder<MailSearchHistoryResponse, C16868a> {

        /* renamed from: a */
        public List<String> f43332a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f43333b;

        /* renamed from: a */
        public MailSearchHistoryResponse build() {
            return new MailSearchHistoryResponse(this.f43332a, this.f43333b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16868a newBuilder() {
        C16868a aVar = new C16868a();
        aVar.f43332a = Internal.copyOf("keywords", this.keywords);
        aVar.f43333b = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSearchHistoryResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.keywords.isEmpty()) {
            sb.append(", keywords=");
            sb.append(this.keywords);
        }
        if (this.result != null) {
            sb.append(", result=");
            sb.append(this.result);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSearchHistoryResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSearchHistoryResponse(List<String> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public MailSearchHistoryResponse(List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keywords = Internal.immutableCopyOf("keywords", list);
        this.result = bool;
    }
}
