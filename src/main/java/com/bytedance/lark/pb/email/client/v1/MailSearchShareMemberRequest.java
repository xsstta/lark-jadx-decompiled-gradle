package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailSearchShareMemberRequest extends Message<MailSearchShareMemberRequest, C16876a> {
    public static final ProtoAdapter<MailSearchShareMemberRequest> ADAPTER = new C16877b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Boolean DEFAULT_FILTER_GROUP = false;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Boolean filter_group;
    public final String keyword;
    public final Integer offset;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchShareMemberRequest$b */
    private static final class C16877b extends ProtoAdapter<MailSearchShareMemberRequest> {
        C16877b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSearchShareMemberRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSearchShareMemberRequest mailSearchShareMemberRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailSearchShareMemberRequest.offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, mailSearchShareMemberRequest.offset);
            } else {
                i = 0;
            }
            if (mailSearchShareMemberRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, mailSearchShareMemberRequest.count);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailSearchShareMemberRequest.keyword != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailSearchShareMemberRequest.keyword);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailSearchShareMemberRequest.filter_group != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailSearchShareMemberRequest.filter_group);
            }
            return i6 + i4 + mailSearchShareMemberRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSearchShareMemberRequest decode(ProtoReader protoReader) throws IOException {
            C16876a aVar = new C16876a();
            aVar.f43338a = 0;
            aVar.f43339b = 0;
            aVar.f43340c = "";
            aVar.f43341d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43338a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43339b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43340c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43341d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSearchShareMemberRequest mailSearchShareMemberRequest) throws IOException {
            if (mailSearchShareMemberRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mailSearchShareMemberRequest.offset);
            }
            if (mailSearchShareMemberRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mailSearchShareMemberRequest.count);
            }
            if (mailSearchShareMemberRequest.keyword != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailSearchShareMemberRequest.keyword);
            }
            if (mailSearchShareMemberRequest.filter_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailSearchShareMemberRequest.filter_group);
            }
            protoWriter.writeBytes(mailSearchShareMemberRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchShareMemberRequest$a */
    public static final class C16876a extends Message.Builder<MailSearchShareMemberRequest, C16876a> {

        /* renamed from: a */
        public Integer f43338a;

        /* renamed from: b */
        public Integer f43339b;

        /* renamed from: c */
        public String f43340c;

        /* renamed from: d */
        public Boolean f43341d;

        /* renamed from: a */
        public MailSearchShareMemberRequest build() {
            return new MailSearchShareMemberRequest(this.f43338a, this.f43339b, this.f43340c, this.f43341d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16876a mo59705a(Boolean bool) {
            this.f43341d = bool;
            return this;
        }

        /* renamed from: b */
        public C16876a mo59709b(Integer num) {
            this.f43339b = num;
            return this;
        }

        /* renamed from: a */
        public C16876a mo59706a(Integer num) {
            this.f43338a = num;
            return this;
        }

        /* renamed from: a */
        public C16876a mo59707a(String str) {
            this.f43340c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16876a newBuilder() {
        C16876a aVar = new C16876a();
        aVar.f43338a = this.offset;
        aVar.f43339b = this.count;
        aVar.f43340c = this.keyword;
        aVar.f43341d = this.filter_group;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSearchShareMemberRequest");
        StringBuilder sb = new StringBuilder();
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.filter_group != null) {
            sb.append(", filter_group=");
            sb.append(this.filter_group);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSearchShareMemberRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSearchShareMemberRequest(Integer num, Integer num2, String str, Boolean bool) {
        this(num, num2, str, bool, ByteString.EMPTY);
    }

    public MailSearchShareMemberRequest(Integer num, Integer num2, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offset = num;
        this.count = num2;
        this.keyword = str;
        this.filter_group = bool;
    }
}
