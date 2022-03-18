package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
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

public final class SendHttpResponse extends Message<SendHttpResponse, C15255a> {
    public static final ProtoAdapter<SendHttpResponse> ADAPTER = new C15256b();
    public static final ByteString DEFAULT_BODY = ByteString.EMPTY;
    public static final Integer DEFAULT_HTTP_STATUS_CODE = 0;
    public static final Status DEFAULT_STATUS = Status.Normal;
    private static final long serialVersionUID = 0;
    public final ByteString body;
    public final Map<String, String> headers;
    public final Integer http_status_code;
    public final String json_body;
    public final Status status;
    public final String unknown_error;

    public enum Status implements WireEnum {
        Normal(1),
        Timeout(2),
        UnknownError(3);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return Normal;
            }
            if (i == 2) {
                return Timeout;
            }
            if (i != 3) {
                return null;
            }
            return UnknownError;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendHttpResponse$b */
    private static final class C15256b extends ProtoAdapter<SendHttpResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f40451a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15256b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendHttpResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendHttpResponse sendHttpResponse) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = Status.ADAPTER.encodedSizeWithTag(1, sendHttpResponse.status) + this.f40451a.encodedSizeWithTag(2, sendHttpResponse.headers);
            int i4 = 0;
            if (sendHttpResponse.http_status_code != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, sendHttpResponse.http_status_code);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (sendHttpResponse.body != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(4, sendHttpResponse.body);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (sendHttpResponse.unknown_error != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, sendHttpResponse.unknown_error);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (sendHttpResponse.json_body != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(CommonCode.StatusCode.API_CLIENT_EXPIRED, sendHttpResponse.json_body);
            }
            return i7 + i4 + sendHttpResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendHttpResponse decode(ProtoReader protoReader) throws IOException {
            C15255a aVar = new C15255a();
            aVar.f40445a = Status.Normal;
            aVar.f40447c = 0;
            aVar.f40448d = ByteString.EMPTY;
            aVar.f40449e = "";
            aVar.f40450f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40445a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f40446b.putAll(this.f40451a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f40447c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f40448d = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f40449e = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 1001) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40450f = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendHttpResponse sendHttpResponse) throws IOException {
            Status.ADAPTER.encodeWithTag(protoWriter, 1, sendHttpResponse.status);
            this.f40451a.encodeWithTag(protoWriter, 2, sendHttpResponse.headers);
            if (sendHttpResponse.http_status_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sendHttpResponse.http_status_code);
            }
            if (sendHttpResponse.body != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, sendHttpResponse.body);
            }
            if (sendHttpResponse.unknown_error != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, sendHttpResponse.unknown_error);
            }
            if (sendHttpResponse.json_body != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, CommonCode.StatusCode.API_CLIENT_EXPIRED, sendHttpResponse.json_body);
            }
            protoWriter.writeBytes(sendHttpResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendHttpResponse$a */
    public static final class C15255a extends Message.Builder<SendHttpResponse, C15255a> {

        /* renamed from: a */
        public Status f40445a;

        /* renamed from: b */
        public Map<String, String> f40446b = Internal.newMutableMap();

        /* renamed from: c */
        public Integer f40447c;

        /* renamed from: d */
        public ByteString f40448d;

        /* renamed from: e */
        public String f40449e;

        /* renamed from: f */
        public String f40450f;

        /* renamed from: a */
        public SendHttpResponse build() {
            Status status = this.f40445a;
            if (status != null) {
                return new SendHttpResponse(status, this.f40446b, this.f40447c, this.f40448d, this.f40449e, this.f40450f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(status, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public C15255a newBuilder() {
        C15255a aVar = new C15255a();
        aVar.f40445a = this.status;
        aVar.f40446b = Internal.copyOf("headers", this.headers);
        aVar.f40447c = this.http_status_code;
        aVar.f40448d = this.body;
        aVar.f40449e = this.unknown_error;
        aVar.f40450f = this.json_body;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SendHttpResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.http_status_code != null) {
            sb.append(", http_status_code=");
            sb.append(this.http_status_code);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.unknown_error != null) {
            sb.append(", unknown_error=");
            sb.append(this.unknown_error);
        }
        if (this.json_body != null) {
            sb.append(", json_body=");
            sb.append(this.json_body);
        }
        StringBuilder replace = sb.replace(0, 2, "SendHttpResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendHttpResponse(Status status2, Map<String, String> map, Integer num, ByteString byteString, String str, String str2) {
        this(status2, map, num, byteString, str, str2, ByteString.EMPTY);
    }

    public SendHttpResponse(Status status2, Map<String, String> map, Integer num, ByteString byteString, String str, String str2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.status = status2;
        this.headers = Internal.immutableCopyOf("headers", map);
        this.http_status_code = num;
        this.body = byteString;
        this.unknown_error = str;
        this.json_body = str2;
    }
}
