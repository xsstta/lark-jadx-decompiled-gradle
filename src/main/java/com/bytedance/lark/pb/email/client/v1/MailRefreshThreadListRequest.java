package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailRefreshThreadListRequest extends Message<MailRefreshThreadListRequest, C16858a> {
    public static final ProtoAdapter<MailRefreshThreadListRequest> ADAPTER = new C16859b();
    public static final FilterType DEFAULT_FILTER_TYPE = FilterType.ALL_MAIL;
    public static final Long DEFAULT_FIRST_THREAD_TIMESTAMP = 0L;
    public static final Long DEFAULT_LENGTH = 15L;
    private static final long serialVersionUID = 0;
    public final FilterType filter_type;
    public final Long first_thread_timestamp;
    public final String label_id;
    public final Long length;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailRefreshThreadListRequest$b */
    private static final class C16859b extends ProtoAdapter<MailRefreshThreadListRequest> {
        C16859b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailRefreshThreadListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailRefreshThreadListRequest mailRefreshThreadListRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailRefreshThreadListRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailRefreshThreadListRequest.label_id);
            } else {
                i = 0;
            }
            if (mailRefreshThreadListRequest.filter_type != null) {
                i2 = FilterType.ADAPTER.encodedSizeWithTag(2, mailRefreshThreadListRequest.filter_type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailRefreshThreadListRequest.first_thread_timestamp != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailRefreshThreadListRequest.first_thread_timestamp);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailRefreshThreadListRequest.length != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, mailRefreshThreadListRequest.length);
            }
            return i6 + i4 + mailRefreshThreadListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailRefreshThreadListRequest decode(ProtoReader protoReader) throws IOException {
            C16858a aVar = new C16858a();
            aVar.f43322a = "";
            aVar.f43323b = FilterType.ALL_MAIL;
            aVar.f43324c = 0L;
            aVar.f43325d = 15L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43322a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f43323b = FilterType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f43324c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43325d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailRefreshThreadListRequest mailRefreshThreadListRequest) throws IOException {
            if (mailRefreshThreadListRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailRefreshThreadListRequest.label_id);
            }
            if (mailRefreshThreadListRequest.filter_type != null) {
                FilterType.ADAPTER.encodeWithTag(protoWriter, 2, mailRefreshThreadListRequest.filter_type);
            }
            if (mailRefreshThreadListRequest.first_thread_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailRefreshThreadListRequest.first_thread_timestamp);
            }
            if (mailRefreshThreadListRequest.length != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, mailRefreshThreadListRequest.length);
            }
            protoWriter.writeBytes(mailRefreshThreadListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailRefreshThreadListRequest$a */
    public static final class C16858a extends Message.Builder<MailRefreshThreadListRequest, C16858a> {

        /* renamed from: a */
        public String f43322a;

        /* renamed from: b */
        public FilterType f43323b;

        /* renamed from: c */
        public Long f43324c;

        /* renamed from: d */
        public Long f43325d;

        /* renamed from: a */
        public MailRefreshThreadListRequest build() {
            return new MailRefreshThreadListRequest(this.f43322a, this.f43323b, this.f43324c, this.f43325d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16858a newBuilder() {
        C16858a aVar = new C16858a();
        aVar.f43322a = this.label_id;
        aVar.f43323b = this.filter_type;
        aVar.f43324c = this.first_thread_timestamp;
        aVar.f43325d = this.length;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailRefreshThreadListRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (this.filter_type != null) {
            sb.append(", filter_type=");
            sb.append(this.filter_type);
        }
        if (this.first_thread_timestamp != null) {
            sb.append(", first_thread_timestamp=");
            sb.append(this.first_thread_timestamp);
        }
        if (this.length != null) {
            sb.append(", length=");
            sb.append(this.length);
        }
        StringBuilder replace = sb.replace(0, 2, "MailRefreshThreadListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailRefreshThreadListRequest(String str, FilterType filterType, Long l, Long l2) {
        this(str, filterType, l, l2, ByteString.EMPTY);
    }

    public MailRefreshThreadListRequest(String str, FilterType filterType, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
        this.filter_type = filterType;
        this.first_thread_timestamp = l;
        this.length = l2;
    }
}
