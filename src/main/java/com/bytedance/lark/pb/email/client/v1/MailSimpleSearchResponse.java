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

public final class MailSimpleSearchResponse extends Message<MailSimpleSearchResponse, C16902a> {
    public static final ProtoAdapter<MailSimpleSearchResponse> ADAPTER = new C16903b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_BEGIN = 0L;
    public static final Long DEFAULT_TOTAL = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final String keyword;
    public final List<MessagesSummary> msg_summary;
    public final Long next_begin;
    public final String search_session;
    public final Long total;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSimpleSearchResponse$b */
    private static final class C16903b extends ProtoAdapter<MailSimpleSearchResponse> {
        C16903b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSimpleSearchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSimpleSearchResponse mailSimpleSearchResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (mailSimpleSearchResponse.search_session != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSimpleSearchResponse.search_session);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + MessagesSummary.ADAPTER.asRepeated().encodedSizeWithTag(2, mailSimpleSearchResponse.msg_summary);
            if (mailSimpleSearchResponse.total != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailSimpleSearchResponse.total);
            } else {
                i2 = 0;
            }
            int i6 = encodedSizeWithTag + i2;
            if (mailSimpleSearchResponse.has_more != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailSimpleSearchResponse.has_more);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (mailSimpleSearchResponse.keyword != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, mailSimpleSearchResponse.keyword);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (mailSimpleSearchResponse.next_begin != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(6, mailSimpleSearchResponse.next_begin);
            }
            return i8 + i5 + mailSimpleSearchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSimpleSearchResponse decode(ProtoReader protoReader) throws IOException {
            C16902a aVar = new C16902a();
            aVar.f43384a = "";
            aVar.f43386c = 0L;
            aVar.f43387d = false;
            aVar.f43388e = "";
            aVar.f43389f = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43384a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43385b.add(MessagesSummary.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f43386c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43387d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43388e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43389f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSimpleSearchResponse mailSimpleSearchResponse) throws IOException {
            if (mailSimpleSearchResponse.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSimpleSearchResponse.search_session);
            }
            MessagesSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailSimpleSearchResponse.msg_summary);
            if (mailSimpleSearchResponse.total != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailSimpleSearchResponse.total);
            }
            if (mailSimpleSearchResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailSimpleSearchResponse.has_more);
            }
            if (mailSimpleSearchResponse.keyword != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, mailSimpleSearchResponse.keyword);
            }
            if (mailSimpleSearchResponse.next_begin != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, mailSimpleSearchResponse.next_begin);
            }
            protoWriter.writeBytes(mailSimpleSearchResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSimpleSearchResponse$a */
    public static final class C16902a extends Message.Builder<MailSimpleSearchResponse, C16902a> {

        /* renamed from: a */
        public String f43384a;

        /* renamed from: b */
        public List<MessagesSummary> f43385b = Internal.newMutableList();

        /* renamed from: c */
        public Long f43386c;

        /* renamed from: d */
        public Boolean f43387d;

        /* renamed from: e */
        public String f43388e;

        /* renamed from: f */
        public Long f43389f;

        /* renamed from: a */
        public MailSimpleSearchResponse build() {
            return new MailSimpleSearchResponse(this.f43384a, this.f43385b, this.f43386c, this.f43387d, this.f43388e, this.f43389f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16902a newBuilder() {
        C16902a aVar = new C16902a();
        aVar.f43384a = this.search_session;
        aVar.f43385b = Internal.copyOf("msg_summary", this.msg_summary);
        aVar.f43386c = this.total;
        aVar.f43387d = this.has_more;
        aVar.f43388e = this.keyword;
        aVar.f43389f = this.next_begin;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSimpleSearchResponse");
        StringBuilder sb = new StringBuilder();
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (!this.msg_summary.isEmpty()) {
            sb.append(", msg_summary=");
            sb.append(this.msg_summary);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.next_begin != null) {
            sb.append(", next_begin=");
            sb.append(this.next_begin);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSimpleSearchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSimpleSearchResponse(String str, List<MessagesSummary> list, Long l, Boolean bool, String str2, Long l2) {
        this(str, list, l, bool, str2, l2, ByteString.EMPTY);
    }

    public MailSimpleSearchResponse(String str, List<MessagesSummary> list, Long l, Boolean bool, String str2, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_session = str;
        this.msg_summary = Internal.immutableCopyOf("msg_summary", list);
        this.total = l;
        this.has_more = bool;
        this.keyword = str2;
        this.next_begin = l2;
    }
}
