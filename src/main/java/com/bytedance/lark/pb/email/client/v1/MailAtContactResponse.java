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

public final class MailAtContactResponse extends Message<MailAtContactResponse, C16640a> {
    public static final ProtoAdapter<MailAtContactResponse> ADAPTER = new C16641b();
    public static final Boolean DEFAULT_HASMORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean hasMore;
    public final List<SearchMemberInfo> members;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAtContactResponse$b */
    private static final class C16641b extends ProtoAdapter<MailAtContactResponse> {
        C16641b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAtContactResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAtContactResponse mailAtContactResponse) {
            int i;
            int encodedSizeWithTag = SearchMemberInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, mailAtContactResponse.members);
            if (mailAtContactResponse.hasMore != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mailAtContactResponse.hasMore);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mailAtContactResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailAtContactResponse decode(ProtoReader protoReader) throws IOException {
            C16640a aVar = new C16640a();
            aVar.f43087b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43086a.add(SearchMemberInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43087b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAtContactResponse mailAtContactResponse) throws IOException {
            SearchMemberInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailAtContactResponse.members);
            if (mailAtContactResponse.hasMore != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mailAtContactResponse.hasMore);
            }
            protoWriter.writeBytes(mailAtContactResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAtContactResponse$a */
    public static final class C16640a extends Message.Builder<MailAtContactResponse, C16640a> {

        /* renamed from: a */
        public List<SearchMemberInfo> f43086a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f43087b;

        /* renamed from: a */
        public MailAtContactResponse build() {
            return new MailAtContactResponse(this.f43086a, this.f43087b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16640a newBuilder() {
        C16640a aVar = new C16640a();
        aVar.f43086a = Internal.copyOf("members", this.members);
        aVar.f43087b = this.hasMore;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAtContactResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.members.isEmpty()) {
            sb.append(", members=");
            sb.append(this.members);
        }
        if (this.hasMore != null) {
            sb.append(", hasMore=");
            sb.append(this.hasMore);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAtContactResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailAtContactResponse(List<SearchMemberInfo> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public MailAtContactResponse(List<SearchMemberInfo> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.members = Internal.immutableCopyOf("members", list);
        this.hasMore = bool;
    }
}
