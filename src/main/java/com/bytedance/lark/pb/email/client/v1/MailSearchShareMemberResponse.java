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

public final class MailSearchShareMemberResponse extends Message<MailSearchShareMemberResponse, C16878a> {
    public static final ProtoAdapter<MailSearchShareMemberResponse> ADAPTER = new C16879b();
    public static final Boolean DEFAULT_HASMORE = false;
    public static final Integer DEFAULT_TOTAL = 0;
    private static final long serialVersionUID = 0;
    public final Boolean hasMore;
    public final Integer total;
    public final List<UserInfo> users;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchShareMemberResponse$b */
    private static final class C16879b extends ProtoAdapter<MailSearchShareMemberResponse> {
        C16879b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSearchShareMemberResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSearchShareMemberResponse mailSearchShareMemberResponse) {
            int i;
            int encodedSizeWithTag = UserInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, mailSearchShareMemberResponse.users);
            int i2 = 0;
            if (mailSearchShareMemberResponse.hasMore != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailSearchShareMemberResponse.hasMore);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mailSearchShareMemberResponse.total != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, mailSearchShareMemberResponse.total);
            }
            return i3 + i2 + mailSearchShareMemberResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSearchShareMemberResponse decode(ProtoReader protoReader) throws IOException {
            C16878a aVar = new C16878a();
            aVar.f43343b = false;
            aVar.f43344c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43342a.add(UserInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43343b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43344c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSearchShareMemberResponse mailSearchShareMemberResponse) throws IOException {
            UserInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailSearchShareMemberResponse.users);
            if (mailSearchShareMemberResponse.hasMore != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailSearchShareMemberResponse.hasMore);
            }
            if (mailSearchShareMemberResponse.total != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, mailSearchShareMemberResponse.total);
            }
            protoWriter.writeBytes(mailSearchShareMemberResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchShareMemberResponse$a */
    public static final class C16878a extends Message.Builder<MailSearchShareMemberResponse, C16878a> {

        /* renamed from: a */
        public List<UserInfo> f43342a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f43343b;

        /* renamed from: c */
        public Integer f43344c;

        /* renamed from: a */
        public MailSearchShareMemberResponse build() {
            return new MailSearchShareMemberResponse(this.f43342a, this.f43343b, this.f43344c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16878a newBuilder() {
        C16878a aVar = new C16878a();
        aVar.f43342a = Internal.copyOf("users", this.users);
        aVar.f43343b = this.hasMore;
        aVar.f43344c = this.total;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSearchShareMemberResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (this.hasMore != null) {
            sb.append(", hasMore=");
            sb.append(this.hasMore);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSearchShareMemberResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSearchShareMemberResponse(List<UserInfo> list, Boolean bool, Integer num) {
        this(list, bool, num, ByteString.EMPTY);
    }

    public MailSearchShareMemberResponse(List<UserInfo> list, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.users = Internal.immutableCopyOf("users", list);
        this.hasMore = bool;
        this.total = num;
    }
}
