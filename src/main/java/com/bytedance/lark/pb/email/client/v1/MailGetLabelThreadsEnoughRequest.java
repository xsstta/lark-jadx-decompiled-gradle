package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetLabelThreadsEnoughRequest extends Message<MailGetLabelThreadsEnoughRequest, C16720a> {
    public static final ProtoAdapter<MailGetLabelThreadsEnoughRequest> ADAPTER = new C16721b();
    public static final FilterType DEFAULT_FILTER_TYPE = FilterType.ALL_MAIL;
    public static final Long DEFAULT_LENGTH = 20L;
    public static final Long DEFAULT_NEWEST_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final FilterType filter_type;
    public final String label_id;
    public final Long length;
    public final Long newest_timestamp;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLabelThreadsEnoughRequest$b */
    private static final class C16721b extends ProtoAdapter<MailGetLabelThreadsEnoughRequest> {
        C16721b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetLabelThreadsEnoughRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetLabelThreadsEnoughRequest mailGetLabelThreadsEnoughRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailGetLabelThreadsEnoughRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetLabelThreadsEnoughRequest.label_id);
            } else {
                i = 0;
            }
            if (mailGetLabelThreadsEnoughRequest.newest_timestamp != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, mailGetLabelThreadsEnoughRequest.newest_timestamp);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailGetLabelThreadsEnoughRequest.length != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mailGetLabelThreadsEnoughRequest.length);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailGetLabelThreadsEnoughRequest.filter_type != null) {
                i4 = FilterType.ADAPTER.encodedSizeWithTag(4, mailGetLabelThreadsEnoughRequest.filter_type);
            }
            return i6 + i4 + mailGetLabelThreadsEnoughRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetLabelThreadsEnoughRequest decode(ProtoReader protoReader) throws IOException {
            C16720a aVar = new C16720a();
            aVar.f43185a = "";
            aVar.f43186b = 0L;
            aVar.f43187c = 20L;
            aVar.f43188d = FilterType.ALL_MAIL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43185a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43186b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43187c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43188d = FilterType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetLabelThreadsEnoughRequest mailGetLabelThreadsEnoughRequest) throws IOException {
            if (mailGetLabelThreadsEnoughRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetLabelThreadsEnoughRequest.label_id);
            }
            if (mailGetLabelThreadsEnoughRequest.newest_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mailGetLabelThreadsEnoughRequest.newest_timestamp);
            }
            if (mailGetLabelThreadsEnoughRequest.length != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mailGetLabelThreadsEnoughRequest.length);
            }
            if (mailGetLabelThreadsEnoughRequest.filter_type != null) {
                FilterType.ADAPTER.encodeWithTag(protoWriter, 4, mailGetLabelThreadsEnoughRequest.filter_type);
            }
            protoWriter.writeBytes(mailGetLabelThreadsEnoughRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLabelThreadsEnoughRequest$a */
    public static final class C16720a extends Message.Builder<MailGetLabelThreadsEnoughRequest, C16720a> {

        /* renamed from: a */
        public String f43185a;

        /* renamed from: b */
        public Long f43186b;

        /* renamed from: c */
        public Long f43187c;

        /* renamed from: d */
        public FilterType f43188d;

        /* renamed from: a */
        public MailGetLabelThreadsEnoughRequest build() {
            return new MailGetLabelThreadsEnoughRequest(this.f43185a, this.f43186b, this.f43187c, this.f43188d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16720a mo59367a(Long l) {
            this.f43186b = l;
            return this;
        }

        /* renamed from: b */
        public C16720a mo59370b(Long l) {
            this.f43187c = l;
            return this;
        }

        /* renamed from: a */
        public C16720a mo59368a(String str) {
            this.f43185a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16720a newBuilder() {
        C16720a aVar = new C16720a();
        aVar.f43185a = this.label_id;
        aVar.f43186b = this.newest_timestamp;
        aVar.f43187c = this.length;
        aVar.f43188d = this.filter_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetLabelThreadsEnoughRequest");
        StringBuilder sb = new StringBuilder();
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
        if (this.filter_type != null) {
            sb.append(", filter_type=");
            sb.append(this.filter_type);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetLabelThreadsEnoughRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetLabelThreadsEnoughRequest(String str, Long l, Long l2, FilterType filterType) {
        this(str, l, l2, filterType, ByteString.EMPTY);
    }

    public MailGetLabelThreadsEnoughRequest(String str, Long l, Long l2, FilterType filterType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
        this.newest_timestamp = l;
        this.length = l2;
        this.filter_type = filterType;
    }
}
