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

public final class MailContactSearchResponse extends Message<MailContactSearchResponse, C16656a> {
    public static final ProtoAdapter<MailContactSearchResponse> ADAPTER = new C16657b();
    public static final Boolean DEFAULT_FROM_LOCAL = false;
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_TOTAL = 0;
    private static final long serialVersionUID = 0;
    public final Boolean from_local;
    public final Boolean has_more;
    public final List<MailContactSearchResult> results;
    public final String search_session;
    public final Integer total;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailContactSearchResponse$b */
    private static final class C16657b extends ProtoAdapter<MailContactSearchResponse> {
        C16657b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailContactSearchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailContactSearchResponse mailContactSearchResponse) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = MailContactSearchResult.ADAPTER.asRepeated().encodedSizeWithTag(1, mailContactSearchResponse.results);
            int i4 = 0;
            if (mailContactSearchResponse.total != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, mailContactSearchResponse.total);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (mailContactSearchResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailContactSearchResponse.has_more);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (mailContactSearchResponse.search_session != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailContactSearchResponse.search_session);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (mailContactSearchResponse.from_local != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, mailContactSearchResponse.from_local);
            }
            return i7 + i4 + mailContactSearchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailContactSearchResponse decode(ProtoReader protoReader) throws IOException {
            C16656a aVar = new C16656a();
            aVar.f43100b = 0;
            aVar.f43101c = false;
            aVar.f43102d = "";
            aVar.f43103e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43099a.add(MailContactSearchResult.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43100b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43101c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f43102d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43103e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailContactSearchResponse mailContactSearchResponse) throws IOException {
            MailContactSearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailContactSearchResponse.results);
            if (mailContactSearchResponse.total != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mailContactSearchResponse.total);
            }
            if (mailContactSearchResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailContactSearchResponse.has_more);
            }
            if (mailContactSearchResponse.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailContactSearchResponse.search_session);
            }
            if (mailContactSearchResponse.from_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, mailContactSearchResponse.from_local);
            }
            protoWriter.writeBytes(mailContactSearchResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailContactSearchResponse$a */
    public static final class C16656a extends Message.Builder<MailContactSearchResponse, C16656a> {

        /* renamed from: a */
        public List<MailContactSearchResult> f43099a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f43100b;

        /* renamed from: c */
        public Boolean f43101c;

        /* renamed from: d */
        public String f43102d;

        /* renamed from: e */
        public Boolean f43103e;

        /* renamed from: a */
        public MailContactSearchResponse build() {
            return new MailContactSearchResponse(this.f43099a, this.f43100b, this.f43101c, this.f43102d, this.f43103e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16656a newBuilder() {
        C16656a aVar = new C16656a();
        aVar.f43099a = Internal.copyOf("results", this.results);
        aVar.f43100b = this.total;
        aVar.f43101c = this.has_more;
        aVar.f43102d = this.search_session;
        aVar.f43103e = this.from_local;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailContactSearchResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (this.from_local != null) {
            sb.append(", from_local=");
            sb.append(this.from_local);
        }
        StringBuilder replace = sb.replace(0, 2, "MailContactSearchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailContactSearchResponse(List<MailContactSearchResult> list, Integer num, Boolean bool, String str, Boolean bool2) {
        this(list, num, bool, str, bool2, ByteString.EMPTY);
    }

    public MailContactSearchResponse(List<MailContactSearchResult> list, Integer num, Boolean bool, String str, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.results = Internal.immutableCopyOf("results", list);
        this.total = num;
        this.has_more = bool;
        this.search_session = str;
        this.from_local = bool2;
    }
}
