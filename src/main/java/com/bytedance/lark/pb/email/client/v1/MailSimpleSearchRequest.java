package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSimpleSearchRequest extends Message<MailSimpleSearchRequest, C16900a> {
    public static final ProtoAdapter<MailSimpleSearchRequest> ADAPTER = new C16901b();
    public static final Long DEFAULT_BEGIN = 0L;
    private static final long serialVersionUID = 0;
    public final Long begin;
    public final String keyword;
    public final String search_session;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSimpleSearchRequest$b */
    private static final class C16901b extends ProtoAdapter<MailSimpleSearchRequest> {
        C16901b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSimpleSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSimpleSearchRequest mailSimpleSearchRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailSimpleSearchRequest.search_session != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSimpleSearchRequest.search_session);
            } else {
                i = 0;
            }
            if (mailSimpleSearchRequest.keyword != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailSimpleSearchRequest.keyword);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailSimpleSearchRequest.begin != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailSimpleSearchRequest.begin);
            }
            return i4 + i3 + mailSimpleSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSimpleSearchRequest decode(ProtoReader protoReader) throws IOException {
            C16900a aVar = new C16900a();
            aVar.f43381a = "";
            aVar.f43382b = "";
            aVar.f43383c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43381a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43382b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43383c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSimpleSearchRequest mailSimpleSearchRequest) throws IOException {
            if (mailSimpleSearchRequest.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSimpleSearchRequest.search_session);
            }
            if (mailSimpleSearchRequest.keyword != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailSimpleSearchRequest.keyword);
            }
            if (mailSimpleSearchRequest.begin != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailSimpleSearchRequest.begin);
            }
            protoWriter.writeBytes(mailSimpleSearchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSimpleSearchRequest$a */
    public static final class C16900a extends Message.Builder<MailSimpleSearchRequest, C16900a> {

        /* renamed from: a */
        public String f43381a;

        /* renamed from: b */
        public String f43382b;

        /* renamed from: c */
        public Long f43383c;

        /* renamed from: a */
        public MailSimpleSearchRequest build() {
            return new MailSimpleSearchRequest(this.f43381a, this.f43382b, this.f43383c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16900a newBuilder() {
        C16900a aVar = new C16900a();
        aVar.f43381a = this.search_session;
        aVar.f43382b = this.keyword;
        aVar.f43383c = this.begin;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSimpleSearchRequest");
        StringBuilder sb = new StringBuilder();
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.begin != null) {
            sb.append(", begin=");
            sb.append(this.begin);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSimpleSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSimpleSearchRequest(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public MailSimpleSearchRequest(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_session = str;
        this.keyword = str2;
        this.begin = l;
    }
}
