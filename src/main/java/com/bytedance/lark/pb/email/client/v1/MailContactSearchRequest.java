package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailContactSearchRequest extends Message<MailContactSearchRequest, C16654a> {
    public static final ProtoAdapter<MailContactSearchRequest> ADAPTER = new C16655b();
    public static final Integer DEFAULT_BEGIN = 0;
    public static final Integer DEFAULT_END = 8;
    public static final QueryType DEFAULT_QUERY_TYPE = QueryType.DEFAULT;
    private static final long serialVersionUID = 0;
    public final Integer begin;
    public final Integer end;
    public final String query;
    public final QueryType query_type;
    public final String search_session;

    public enum QueryType implements WireEnum {
        DEFAULT(0),
        ADDRESS_LIST(1);
        
        public static final ProtoAdapter<QueryType> ADAPTER = ProtoAdapter.newEnumAdapter(QueryType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static QueryType fromValue(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return ADDRESS_LIST;
        }

        private QueryType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailContactSearchRequest$b */
    private static final class C16655b extends ProtoAdapter<MailContactSearchRequest> {
        C16655b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailContactSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailContactSearchRequest mailContactSearchRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (mailContactSearchRequest.query != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailContactSearchRequest.query);
            } else {
                i = 0;
            }
            if (mailContactSearchRequest.begin != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, mailContactSearchRequest.begin);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (mailContactSearchRequest.end != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, mailContactSearchRequest.end);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (mailContactSearchRequest.search_session != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailContactSearchRequest.search_session);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (mailContactSearchRequest.query_type != null) {
                i5 = QueryType.ADAPTER.encodedSizeWithTag(5, mailContactSearchRequest.query_type);
            }
            return i8 + i5 + mailContactSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailContactSearchRequest decode(ProtoReader protoReader) throws IOException {
            C16654a aVar = new C16654a();
            aVar.f43094a = "";
            aVar.f43095b = 0;
            aVar.f43096c = 8;
            aVar.f43097d = "";
            aVar.f43098e = QueryType.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43094a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43095b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43096c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f43097d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43098e = QueryType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailContactSearchRequest mailContactSearchRequest) throws IOException {
            if (mailContactSearchRequest.query != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailContactSearchRequest.query);
            }
            if (mailContactSearchRequest.begin != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mailContactSearchRequest.begin);
            }
            if (mailContactSearchRequest.end != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, mailContactSearchRequest.end);
            }
            if (mailContactSearchRequest.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailContactSearchRequest.search_session);
            }
            if (mailContactSearchRequest.query_type != null) {
                QueryType.ADAPTER.encodeWithTag(protoWriter, 5, mailContactSearchRequest.query_type);
            }
            protoWriter.writeBytes(mailContactSearchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailContactSearchRequest$a */
    public static final class C16654a extends Message.Builder<MailContactSearchRequest, C16654a> {

        /* renamed from: a */
        public String f43094a;

        /* renamed from: b */
        public Integer f43095b;

        /* renamed from: c */
        public Integer f43096c;

        /* renamed from: d */
        public String f43097d;

        /* renamed from: e */
        public QueryType f43098e;

        /* renamed from: a */
        public MailContactSearchRequest build() {
            return new MailContactSearchRequest(this.f43094a, this.f43095b, this.f43096c, this.f43097d, this.f43098e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16654a mo59200a(Integer num) {
            this.f43095b = num;
            return this;
        }

        /* renamed from: b */
        public C16654a mo59203b(Integer num) {
            this.f43096c = num;
            return this;
        }

        /* renamed from: a */
        public C16654a mo59201a(String str) {
            this.f43094a = str;
            return this;
        }

        /* renamed from: b */
        public C16654a mo59204b(String str) {
            this.f43097d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16654a newBuilder() {
        C16654a aVar = new C16654a();
        aVar.f43094a = this.query;
        aVar.f43095b = this.begin;
        aVar.f43096c = this.end;
        aVar.f43097d = this.search_session;
        aVar.f43098e = this.query_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailContactSearchRequest");
        StringBuilder sb = new StringBuilder();
        if (this.query != null) {
            sb.append(", query=");
            sb.append(this.query);
        }
        if (this.begin != null) {
            sb.append(", begin=");
            sb.append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=");
            sb.append(this.end);
        }
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (this.query_type != null) {
            sb.append(", query_type=");
            sb.append(this.query_type);
        }
        StringBuilder replace = sb.replace(0, 2, "MailContactSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailContactSearchRequest(String str, Integer num, Integer num2, String str2, QueryType queryType) {
        this(str, num, num2, str2, queryType, ByteString.EMPTY);
    }

    public MailContactSearchRequest(String str, Integer num, Integer num2, String str2, QueryType queryType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.begin = num;
        this.end = num2;
        this.search_session = str2;
        this.query_type = queryType;
    }
}
