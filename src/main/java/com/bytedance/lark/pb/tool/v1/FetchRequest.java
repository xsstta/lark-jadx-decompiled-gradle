package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class FetchRequest extends Message<FetchRequest, C19695a> {
    public static final ProtoAdapter<FetchRequest> ADAPTER = new C19696b();
    public static final DomainSettings.Alias DEFAULT_DOMAIN_ALIAS = DomainSettings.Alias.UNKNOWN;
    public static final Boolean DEFAULT_ENABLE_COMPLEX_CONNECT = false;
    public static final Boolean DEFAULT_IS_FOLLOW_REDIRECT = false;
    public static final Method DEFAULT_METHOD = Method.GET;
    public static final Priority DEFAULT_PRIORITY = Priority.MEDIUM;
    public static final Long DEFAULT_REQUEST_ID = 0L;
    public static final Integer DEFAULT_RETRY_NUM = 3;
    public static final Integer DEFAULT_TIMEOUT = 0;
    private static final long serialVersionUID = 0;
    public final DomainSettings.Alias domain_alias;
    public final Boolean enable_complex_connect;
    public final List<HttpHeader> headers;
    public final Boolean is_follow_redirect;
    public final Method method;
    public final Priority priority;
    public final Long request_id;
    public final Integer retry_num;
    public final Integer timeout;
    public final String url;

    public enum Method implements WireEnum {
        GET(1),
        POST(2),
        DELETE(3),
        PUT(4),
        PATCH(5),
        HEAD(6);
        
        public static final ProtoAdapter<Method> ADAPTER = ProtoAdapter.newEnumAdapter(Method.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Method fromValue(int i) {
            switch (i) {
                case 1:
                    return GET;
                case 2:
                    return POST;
                case 3:
                    return DELETE;
                case 4:
                    return PUT;
                case 5:
                    return PATCH;
                case 6:
                    return HEAD;
                default:
                    return null;
            }
        }

        private Method(int i) {
            this.value = i;
        }
    }

    public enum Priority implements WireEnum {
        HIGH(1),
        MEDIUM(2),
        LOW(3);
        
        public static final ProtoAdapter<Priority> ADAPTER = ProtoAdapter.newEnumAdapter(Priority.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Priority fromValue(int i) {
            if (i == 1) {
                return HIGH;
            }
            if (i == 2) {
                return MEDIUM;
            }
            if (i != 3) {
                return null;
            }
            return LOW;
        }

        private Priority(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.FetchRequest$b */
    private static final class C19696b extends ProtoAdapter<FetchRequest> {
        C19696b() {
            super(FieldEncoding.LENGTH_DELIMITED, FetchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FetchRequest fetchRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, fetchRequest.url) + Method.ADAPTER.encodedSizeWithTag(2, fetchRequest.method) + HttpHeader.ADAPTER.asRepeated().encodedSizeWithTag(3, fetchRequest.headers);
            int i6 = 0;
            if (fetchRequest.timeout != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(4, fetchRequest.timeout);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (fetchRequest.is_follow_redirect != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(6, fetchRequest.is_follow_redirect);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i7 + i2 + ProtoAdapter.INT64.encodedSizeWithTag(7, fetchRequest.request_id);
            if (fetchRequest.priority != null) {
                i3 = Priority.ADAPTER.encodedSizeWithTag(8, fetchRequest.priority);
            } else {
                i3 = 0;
            }
            int i8 = encodedSizeWithTag2 + i3;
            if (fetchRequest.enable_complex_connect != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(9, fetchRequest.enable_complex_connect);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (fetchRequest.retry_num != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(10, fetchRequest.retry_num);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (fetchRequest.domain_alias != null) {
                i6 = DomainSettings.Alias.ADAPTER.encodedSizeWithTag(11, fetchRequest.domain_alias);
            }
            return i10 + i6 + fetchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FetchRequest decode(ProtoReader protoReader) throws IOException {
            C19695a aVar = new C19695a();
            aVar.f48144a = "";
            aVar.f48145b = Method.GET;
            aVar.f48147d = 0;
            aVar.f48148e = false;
            aVar.f48149f = 0L;
            aVar.f48150g = Priority.MEDIUM;
            aVar.f48151h = false;
            aVar.f48152i = 3;
            aVar.f48153j = DomainSettings.Alias.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48144a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f48145b = Method.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f48146c.add(HttpHeader.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f48147d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 6:
                            aVar.f48148e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f48149f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f48150g = Priority.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f48151h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f48152i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f48153j = DomainSettings.Alias.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FetchRequest fetchRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fetchRequest.url);
            Method.ADAPTER.encodeWithTag(protoWriter, 2, fetchRequest.method);
            HttpHeader.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, fetchRequest.headers);
            if (fetchRequest.timeout != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, fetchRequest.timeout);
            }
            if (fetchRequest.is_follow_redirect != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, fetchRequest.is_follow_redirect);
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, fetchRequest.request_id);
            if (fetchRequest.priority != null) {
                Priority.ADAPTER.encodeWithTag(protoWriter, 8, fetchRequest.priority);
            }
            if (fetchRequest.enable_complex_connect != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, fetchRequest.enable_complex_connect);
            }
            if (fetchRequest.retry_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, fetchRequest.retry_num);
            }
            if (fetchRequest.domain_alias != null) {
                DomainSettings.Alias.ADAPTER.encodeWithTag(protoWriter, 11, fetchRequest.domain_alias);
            }
            protoWriter.writeBytes(fetchRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19695a newBuilder() {
        C19695a aVar = new C19695a();
        aVar.f48144a = this.url;
        aVar.f48145b = this.method;
        aVar.f48146c = Internal.copyOf("headers", this.headers);
        aVar.f48147d = this.timeout;
        aVar.f48148e = this.is_follow_redirect;
        aVar.f48149f = this.request_id;
        aVar.f48150g = this.priority;
        aVar.f48151h = this.enable_complex_connect;
        aVar.f48152i = this.retry_num;
        aVar.f48153j = this.domain_alias;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.FetchRequest$a */
    public static final class C19695a extends Message.Builder<FetchRequest, C19695a> {

        /* renamed from: a */
        public String f48144a;

        /* renamed from: b */
        public Method f48145b;

        /* renamed from: c */
        public List<HttpHeader> f48146c = Internal.newMutableList();

        /* renamed from: d */
        public Integer f48147d;

        /* renamed from: e */
        public Boolean f48148e;

        /* renamed from: f */
        public Long f48149f;

        /* renamed from: g */
        public Priority f48150g;

        /* renamed from: h */
        public Boolean f48151h;

        /* renamed from: i */
        public Integer f48152i;

        /* renamed from: j */
        public DomainSettings.Alias f48153j;

        /* renamed from: a */
        public FetchRequest build() {
            Method method;
            Long l;
            String str = this.f48144a;
            if (str != null && (method = this.f48145b) != null && (l = this.f48149f) != null) {
                return new FetchRequest(str, method, this.f48146c, this.f48147d, this.f48148e, l, this.f48150g, this.f48151h, this.f48152i, this.f48153j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url", this.f48145b, "method", this.f48149f, "request_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "FetchRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", method=");
        sb.append(this.method);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.timeout != null) {
            sb.append(", timeout=");
            sb.append(this.timeout);
        }
        if (this.is_follow_redirect != null) {
            sb.append(", is_follow_redirect=");
            sb.append(this.is_follow_redirect);
        }
        sb.append(", request_id=");
        sb.append(this.request_id);
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.enable_complex_connect != null) {
            sb.append(", enable_complex_connect=");
            sb.append(this.enable_complex_connect);
        }
        if (this.retry_num != null) {
            sb.append(", retry_num=");
            sb.append(this.retry_num);
        }
        if (this.domain_alias != null) {
            sb.append(", domain_alias=");
            sb.append(this.domain_alias);
        }
        StringBuilder replace = sb.replace(0, 2, "FetchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FetchRequest(String str, Method method2, List<HttpHeader> list, Integer num, Boolean bool, Long l, Priority priority2, Boolean bool2, Integer num2, DomainSettings.Alias alias) {
        this(str, method2, list, num, bool, l, priority2, bool2, num2, alias, ByteString.EMPTY);
    }

    public FetchRequest(String str, Method method2, List<HttpHeader> list, Integer num, Boolean bool, Long l, Priority priority2, Boolean bool2, Integer num2, DomainSettings.Alias alias, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.method = method2;
        this.headers = Internal.immutableCopyOf("headers", list);
        this.timeout = num;
        this.is_follow_redirect = bool;
        this.request_id = l;
        this.priority = priority2;
        this.enable_complex_connect = bool2;
        this.retry_num = num2;
        this.domain_alias = alias;
    }
}
