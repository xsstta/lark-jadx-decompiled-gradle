package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class SendHttpRequest extends Message<SendHttpRequest, C15253a> {
    public static final ProtoAdapter<SendHttpRequest> ADAPTER = new C15254b();
    public static final ByteString DEFAULT_BODY = ByteString.EMPTY;
    public static final Boolean DEFAULT_ENABLE_COMPLEX_CONNECT = false;
    public static final HostAlias DEFAULT_HOST_ALIAS = HostAlias.UNKNOWN;
    public static final Method DEFAULT_METHOD = Method.GET;
    public static final Priority DEFAULT_PRIORITY = Priority.MEDIUM;
    public static final Integer DEFAULT_RETRY_NUM = 3;
    public static final Integer DEFAULT_TIMEOUT = 0;
    private static final long serialVersionUID = 0;
    public final ByteString body;
    public final String download_file_path;
    public final Boolean enable_complex_connect;
    public final Map<String, String> headers;
    public final HostAlias host_alias;
    public final String json_body;
    public final Method method;
    public final Priority priority;
    public final String request_id;
    public final Integer retry_num;
    public final Integer timeout;
    public final String upload_file_path;
    public final String url;

    public enum HostAlias implements WireEnum {
        UNKNOWN(0),
        API(1),
        FILE(2),
        OAPI(3),
        DRIVE(4),
        DOCS(5),
        MINA(6),
        OPEN(7);
        
        public static final ProtoAdapter<HostAlias> ADAPTER = ProtoAdapter.newEnumAdapter(HostAlias.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static HostAlias fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return API;
                case 2:
                    return FILE;
                case 3:
                    return OAPI;
                case 4:
                    return DRIVE;
                case 5:
                    return DOCS;
                case 6:
                    return MINA;
                case 7:
                    return OPEN;
                default:
                    return null;
            }
        }

        private HostAlias(int i) {
            this.value = i;
        }
    }

    public enum Method implements WireEnum {
        GET(1),
        POST(2),
        DELETE(3),
        PUT(4),
        PATCH(5);
        
        public static final ProtoAdapter<Method> ADAPTER = ProtoAdapter.newEnumAdapter(Method.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Method fromValue(int i) {
            if (i == 1) {
                return GET;
            }
            if (i == 2) {
                return POST;
            }
            if (i == 3) {
                return DELETE;
            }
            if (i == 4) {
                return PUT;
            }
            if (i != 5) {
                return null;
            }
            return PATCH;
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

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendHttpRequest$b */
    private static final class C15254b extends ProtoAdapter<SendHttpRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f40444a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15254b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendHttpRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendHttpRequest sendHttpRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, sendHttpRequest.url) + Method.ADAPTER.encodedSizeWithTag(2, sendHttpRequest.method) + this.f40444a.encodedSizeWithTag(3, sendHttpRequest.headers);
            int i10 = 0;
            if (sendHttpRequest.body != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(4, sendHttpRequest.body);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (sendHttpRequest.timeout != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(5, sendHttpRequest.timeout);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (sendHttpRequest.request_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, sendHttpRequest.request_id);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (sendHttpRequest.enable_complex_connect != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, sendHttpRequest.enable_complex_connect);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (sendHttpRequest.retry_num != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(8, sendHttpRequest.retry_num);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (sendHttpRequest.priority != null) {
                i6 = Priority.ADAPTER.encodedSizeWithTag(9, sendHttpRequest.priority);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (sendHttpRequest.download_file_path != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(10, sendHttpRequest.download_file_path);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (sendHttpRequest.upload_file_path != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, sendHttpRequest.upload_file_path);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (sendHttpRequest.host_alias != null) {
                i9 = HostAlias.ADAPTER.encodedSizeWithTag(12, sendHttpRequest.host_alias);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (sendHttpRequest.json_body != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(1000, sendHttpRequest.json_body);
            }
            return i19 + i10 + sendHttpRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendHttpRequest decode(ProtoReader protoReader) throws IOException {
            C15253a aVar = new C15253a();
            aVar.f40431a = "";
            aVar.f40432b = Method.GET;
            aVar.f40434d = ByteString.EMPTY;
            aVar.f40435e = 0;
            aVar.f40436f = "";
            aVar.f40437g = false;
            aVar.f40438h = 3;
            aVar.f40439i = Priority.MEDIUM;
            aVar.f40440j = "";
            aVar.f40441k = "";
            aVar.f40442l = HostAlias.UNKNOWN;
            aVar.f40443m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1000) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40431a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f40432b = Method.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f40433c.putAll(this.f40444a.decode(protoReader));
                            continue;
                        case 4:
                            aVar.f40434d = ProtoAdapter.BYTES.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f40435e = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f40436f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f40437g = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f40438h = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 9:
                            try {
                                aVar.f40439i = Priority.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 10:
                            aVar.f40440j = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f40441k = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f40442l = HostAlias.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f40443m = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendHttpRequest sendHttpRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendHttpRequest.url);
            Method.ADAPTER.encodeWithTag(protoWriter, 2, sendHttpRequest.method);
            this.f40444a.encodeWithTag(protoWriter, 3, sendHttpRequest.headers);
            if (sendHttpRequest.body != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, sendHttpRequest.body);
            }
            if (sendHttpRequest.timeout != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, sendHttpRequest.timeout);
            }
            if (sendHttpRequest.request_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sendHttpRequest.request_id);
            }
            if (sendHttpRequest.enable_complex_connect != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, sendHttpRequest.enable_complex_connect);
            }
            if (sendHttpRequest.retry_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, sendHttpRequest.retry_num);
            }
            if (sendHttpRequest.priority != null) {
                Priority.ADAPTER.encodeWithTag(protoWriter, 9, sendHttpRequest.priority);
            }
            if (sendHttpRequest.download_file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, sendHttpRequest.download_file_path);
            }
            if (sendHttpRequest.upload_file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, sendHttpRequest.upload_file_path);
            }
            if (sendHttpRequest.host_alias != null) {
                HostAlias.ADAPTER.encodeWithTag(protoWriter, 12, sendHttpRequest.host_alias);
            }
            if (sendHttpRequest.json_body != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1000, sendHttpRequest.json_body);
            }
            protoWriter.writeBytes(sendHttpRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendHttpRequest$a */
    public static final class C15253a extends Message.Builder<SendHttpRequest, C15253a> {

        /* renamed from: a */
        public String f40431a;

        /* renamed from: b */
        public Method f40432b;

        /* renamed from: c */
        public Map<String, String> f40433c = Internal.newMutableMap();

        /* renamed from: d */
        public ByteString f40434d;

        /* renamed from: e */
        public Integer f40435e;

        /* renamed from: f */
        public String f40436f;

        /* renamed from: g */
        public Boolean f40437g;

        /* renamed from: h */
        public Integer f40438h;

        /* renamed from: i */
        public Priority f40439i;

        /* renamed from: j */
        public String f40440j;

        /* renamed from: k */
        public String f40441k;

        /* renamed from: l */
        public HostAlias f40442l;

        /* renamed from: m */
        public String f40443m;

        /* renamed from: a */
        public SendHttpRequest build() {
            Method method;
            String str = this.f40431a;
            if (str != null && (method = this.f40432b) != null) {
                return new SendHttpRequest(str, method, this.f40433c, this.f40434d, this.f40435e, this.f40436f, this.f40437g, this.f40438h, this.f40439i, this.f40440j, this.f40441k, this.f40442l, this.f40443m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url", this.f40432b, "method");
        }

        /* renamed from: a */
        public C15253a mo55526a(Method method) {
            this.f40432b = method;
            return this;
        }

        /* renamed from: b */
        public C15253a mo55532b(String str) {
            this.f40436f = str;
            return this;
        }

        /* renamed from: c */
        public C15253a mo55533c(String str) {
            this.f40443m = str;
            return this;
        }

        /* renamed from: a */
        public C15253a mo55527a(Integer num) {
            this.f40435e = num;
            return this;
        }

        /* renamed from: a */
        public C15253a mo55528a(String str) {
            this.f40431a = str;
            return this;
        }

        /* renamed from: a */
        public C15253a mo55529a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f40433c = map;
            return this;
        }

        /* renamed from: a */
        public C15253a mo55530a(ByteString byteString) {
            this.f40434d = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15253a newBuilder() {
        C15253a aVar = new C15253a();
        aVar.f40431a = this.url;
        aVar.f40432b = this.method;
        aVar.f40433c = Internal.copyOf("headers", this.headers);
        aVar.f40434d = this.body;
        aVar.f40435e = this.timeout;
        aVar.f40436f = this.request_id;
        aVar.f40437g = this.enable_complex_connect;
        aVar.f40438h = this.retry_num;
        aVar.f40439i = this.priority;
        aVar.f40440j = this.download_file_path;
        aVar.f40441k = this.upload_file_path;
        aVar.f40442l = this.host_alias;
        aVar.f40443m = this.json_body;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SendHttpRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", method=");
        sb.append(this.method);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.timeout != null) {
            sb.append(", timeout=");
            sb.append(this.timeout);
        }
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (this.enable_complex_connect != null) {
            sb.append(", enable_complex_connect=");
            sb.append(this.enable_complex_connect);
        }
        if (this.retry_num != null) {
            sb.append(", retry_num=");
            sb.append(this.retry_num);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.download_file_path != null) {
            sb.append(", download_file_path=");
            sb.append(this.download_file_path);
        }
        if (this.upload_file_path != null) {
            sb.append(", upload_file_path=");
            sb.append(this.upload_file_path);
        }
        if (this.host_alias != null) {
            sb.append(", host_alias=");
            sb.append(this.host_alias);
        }
        if (this.json_body != null) {
            sb.append(", json_body=");
            sb.append(this.json_body);
        }
        StringBuilder replace = sb.replace(0, 2, "SendHttpRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendHttpRequest(String str, Method method2, Map<String, String> map, ByteString byteString, Integer num, String str2, Boolean bool, Integer num2, Priority priority2, String str3, String str4, HostAlias hostAlias, String str5) {
        this(str, method2, map, byteString, num, str2, bool, num2, priority2, str3, str4, hostAlias, str5, ByteString.EMPTY);
    }

    public SendHttpRequest(String str, Method method2, Map<String, String> map, ByteString byteString, Integer num, String str2, Boolean bool, Integer num2, Priority priority2, String str3, String str4, HostAlias hostAlias, String str5, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.url = str;
        this.method = method2;
        this.headers = Internal.immutableCopyOf("headers", map);
        this.body = byteString;
        this.timeout = num;
        this.request_id = str2;
        this.enable_complex_connect = bool;
        this.retry_num = num2;
        this.priority = priority2;
        this.download_file_path = str3;
        this.upload_file_path = str4;
        this.host_alias = hostAlias;
        this.json_body = str5;
    }
}
