package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetThreadListRequest extends Message<MailGetThreadListRequest, C16804a> {
    public static final ProtoAdapter<MailGetThreadListRequest> ADAPTER = new C16805b();
    public static final FilterType DEFAULT_FILTER_TYPE = FilterType.ALL_MAIL;
    public static final Long DEFAULT_LENGTH = 15L;
    public static final Long DEFAULT_NEWEST_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final FilterType filter_type;
    public final String label_id;
    public final Long length;
    public final Long newest_timestamp;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadListRequest$b */
    private static final class C16805b extends ProtoAdapter<MailGetThreadListRequest> {
        C16805b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetThreadListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetThreadListRequest mailGetThreadListRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailGetThreadListRequest.filter_type != null) {
                i = FilterType.ADAPTER.encodedSizeWithTag(1, mailGetThreadListRequest.filter_type);
            } else {
                i = 0;
            }
            if (mailGetThreadListRequest.label_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailGetThreadListRequest.label_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailGetThreadListRequest.newest_timestamp != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailGetThreadListRequest.newest_timestamp);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailGetThreadListRequest.length != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, mailGetThreadListRequest.length);
            }
            return i6 + i4 + mailGetThreadListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetThreadListRequest decode(ProtoReader protoReader) throws IOException {
            C16804a aVar = new C16804a();
            aVar.f43267a = FilterType.ALL_MAIL;
            aVar.f43268b = "";
            aVar.f43269c = 0L;
            aVar.f43270d = 15L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f43267a = FilterType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f43268b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43269c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43270d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetThreadListRequest mailGetThreadListRequest) throws IOException {
            if (mailGetThreadListRequest.filter_type != null) {
                FilterType.ADAPTER.encodeWithTag(protoWriter, 1, mailGetThreadListRequest.filter_type);
            }
            if (mailGetThreadListRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailGetThreadListRequest.label_id);
            }
            if (mailGetThreadListRequest.newest_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailGetThreadListRequest.newest_timestamp);
            }
            if (mailGetThreadListRequest.length != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, mailGetThreadListRequest.length);
            }
            protoWriter.writeBytes(mailGetThreadListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadListRequest$a */
    public static final class C16804a extends Message.Builder<MailGetThreadListRequest, C16804a> {

        /* renamed from: a */
        public FilterType f43267a;

        /* renamed from: b */
        public String f43268b;

        /* renamed from: c */
        public Long f43269c;

        /* renamed from: d */
        public Long f43270d;

        /* renamed from: a */
        public MailGetThreadListRequest build() {
            return new MailGetThreadListRequest(this.f43267a, this.f43268b, this.f43269c, this.f43270d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16804a newBuilder() {
        C16804a aVar = new C16804a();
        aVar.f43267a = this.filter_type;
        aVar.f43268b = this.label_id;
        aVar.f43269c = this.newest_timestamp;
        aVar.f43270d = this.length;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetThreadListRequest");
        StringBuilder sb = new StringBuilder();
        if (this.filter_type != null) {
            sb.append(", filter_type=");
            sb.append(this.filter_type);
        }
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (this.newest_timestamp != null) {
            sb.append(", newest_timestamp=");
            sb.append(this.newest_timestamp);
        }
        if (this.length != null) {
            sb.append(", length=");
            sb.append(this.length);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetThreadListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetThreadListRequest(FilterType filterType, String str, Long l, Long l2) {
        this(filterType, str, l, l2, ByteString.EMPTY);
    }

    public MailGetThreadListRequest(FilterType filterType, String str, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.filter_type = filterType;
        this.label_id = str;
        this.newest_timestamp = l;
        this.length = l2;
    }
}
