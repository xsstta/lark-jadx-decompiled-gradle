package com.bytedance.lark.pb.basic.v1;

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

public final class PushSessionValidatingResponse extends Message<PushSessionValidatingResponse, C15135a> {
    public static final ProtoAdapter<PushSessionValidatingResponse> ADAPTER = new C15136b();
    public static final Long DEFAULT_CURRENT_USER_ID = 0L;
    public static final Long DEFAULT_FRONTIER_ERROR_CODE = 0L;
    private static final long serialVersionUID = 0;
    public final String access_token;
    public final String connection_token;
    public final String context_device_id;
    public final String current_device_id;
    public final Long current_user_id;
    public final String data_base_clear_type;
    public final Long frontier_error_code;
    public final String logic_source;
    public final List<String> new_mac_address;
    public final List<String> old_mac_address;
    public final String reason_source;
    public final String request_id;
    public final String server_reason;
    public final String truncated_access_token;

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushSessionValidatingResponse$b */
    private static final class C15136b extends ProtoAdapter<PushSessionValidatingResponse> {
        C15136b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushSessionValidatingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushSessionValidatingResponse pushSessionValidatingResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(10, pushSessionValidatingResponse.access_token);
            int i10 = 0;
            if (pushSessionValidatingResponse.truncated_access_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(11, pushSessionValidatingResponse.truncated_access_token);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.INT64.encodedSizeWithTag(15, pushSessionValidatingResponse.current_user_id);
            if (pushSessionValidatingResponse.data_base_clear_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(20, pushSessionValidatingResponse.data_base_clear_type);
            } else {
                i2 = 0;
            }
            int i11 = encodedSizeWithTag2 + i2;
            if (pushSessionValidatingResponse.reason_source != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(25, pushSessionValidatingResponse.reason_source);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (pushSessionValidatingResponse.logic_source != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(26, pushSessionValidatingResponse.logic_source);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (pushSessionValidatingResponse.connection_token != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(30, pushSessionValidatingResponse.connection_token);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (pushSessionValidatingResponse.request_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(35, pushSessionValidatingResponse.request_id);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (pushSessionValidatingResponse.frontier_error_code != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(40, pushSessionValidatingResponse.frontier_error_code);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (pushSessionValidatingResponse.current_device_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(45, pushSessionValidatingResponse.current_device_id);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (pushSessionValidatingResponse.context_device_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(46, pushSessionValidatingResponse.context_device_id);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag3 = i17 + i9 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(50, pushSessionValidatingResponse.old_mac_address) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(51, pushSessionValidatingResponse.new_mac_address);
            if (pushSessionValidatingResponse.server_reason != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(55, pushSessionValidatingResponse.server_reason);
            }
            return encodedSizeWithTag3 + i10 + pushSessionValidatingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushSessionValidatingResponse decode(ProtoReader protoReader) throws IOException {
            C15135a aVar = new C15135a();
            aVar.f40111a = "";
            aVar.f40112b = "";
            aVar.f40113c = 0L;
            aVar.f40114d = "";
            aVar.f40115e = "";
            aVar.f40116f = "";
            aVar.f40117g = "";
            aVar.f40118h = "";
            aVar.f40119i = 0L;
            aVar.f40120j = "";
            aVar.f40121k = "";
            aVar.f40124n = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 10) {
                    aVar.f40111a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 11) {
                    aVar.f40112b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 15) {
                    aVar.f40113c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 20) {
                    aVar.f40114d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 30) {
                    aVar.f40117g = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 35) {
                    aVar.f40118h = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 40) {
                    aVar.f40119i = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 55) {
                    aVar.f40124n = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 25) {
                    aVar.f40115e = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 26) {
                    aVar.f40116f = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 45) {
                    aVar.f40120j = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 46) {
                    aVar.f40121k = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 50) {
                    aVar.f40122l.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 51) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40123m.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushSessionValidatingResponse pushSessionValidatingResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, pushSessionValidatingResponse.access_token);
            if (pushSessionValidatingResponse.truncated_access_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, pushSessionValidatingResponse.truncated_access_token);
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 15, pushSessionValidatingResponse.current_user_id);
            if (pushSessionValidatingResponse.data_base_clear_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, pushSessionValidatingResponse.data_base_clear_type);
            }
            if (pushSessionValidatingResponse.reason_source != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, pushSessionValidatingResponse.reason_source);
            }
            if (pushSessionValidatingResponse.logic_source != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, pushSessionValidatingResponse.logic_source);
            }
            if (pushSessionValidatingResponse.connection_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, pushSessionValidatingResponse.connection_token);
            }
            if (pushSessionValidatingResponse.request_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 35, pushSessionValidatingResponse.request_id);
            }
            if (pushSessionValidatingResponse.frontier_error_code != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 40, pushSessionValidatingResponse.frontier_error_code);
            }
            if (pushSessionValidatingResponse.current_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 45, pushSessionValidatingResponse.current_device_id);
            }
            if (pushSessionValidatingResponse.context_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 46, pushSessionValidatingResponse.context_device_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 50, pushSessionValidatingResponse.old_mac_address);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 51, pushSessionValidatingResponse.new_mac_address);
            if (pushSessionValidatingResponse.server_reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 55, pushSessionValidatingResponse.server_reason);
            }
            protoWriter.writeBytes(pushSessionValidatingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushSessionValidatingResponse$a */
    public static final class C15135a extends Message.Builder<PushSessionValidatingResponse, C15135a> {

        /* renamed from: a */
        public String f40111a;

        /* renamed from: b */
        public String f40112b;

        /* renamed from: c */
        public Long f40113c;

        /* renamed from: d */
        public String f40114d;

        /* renamed from: e */
        public String f40115e;

        /* renamed from: f */
        public String f40116f;

        /* renamed from: g */
        public String f40117g;

        /* renamed from: h */
        public String f40118h;

        /* renamed from: i */
        public Long f40119i;

        /* renamed from: j */
        public String f40120j;

        /* renamed from: k */
        public String f40121k;

        /* renamed from: l */
        public List<String> f40122l = Internal.newMutableList();

        /* renamed from: m */
        public List<String> f40123m = Internal.newMutableList();

        /* renamed from: n */
        public String f40124n;

        /* renamed from: a */
        public PushSessionValidatingResponse build() {
            Long l;
            String str = this.f40111a;
            if (str != null && (l = this.f40113c) != null) {
                return new PushSessionValidatingResponse(str, this.f40112b, l, this.f40114d, this.f40115e, this.f40116f, this.f40117g, this.f40118h, this.f40119i, this.f40120j, this.f40121k, this.f40122l, this.f40123m, this.f40124n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "access_token", this.f40113c, "current_user_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15135a newBuilder() {
        C15135a aVar = new C15135a();
        aVar.f40111a = this.access_token;
        aVar.f40112b = this.truncated_access_token;
        aVar.f40113c = this.current_user_id;
        aVar.f40114d = this.data_base_clear_type;
        aVar.f40115e = this.reason_source;
        aVar.f40116f = this.logic_source;
        aVar.f40117g = this.connection_token;
        aVar.f40118h = this.request_id;
        aVar.f40119i = this.frontier_error_code;
        aVar.f40120j = this.current_device_id;
        aVar.f40121k = this.context_device_id;
        aVar.f40122l = Internal.copyOf("old_mac_address", this.old_mac_address);
        aVar.f40123m = Internal.copyOf("new_mac_address", this.new_mac_address);
        aVar.f40124n = this.server_reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PushSessionValidatingResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", access_token=");
        sb.append(this.access_token);
        if (this.truncated_access_token != null) {
            sb.append(", truncated_access_token=");
            sb.append(this.truncated_access_token);
        }
        sb.append(", current_user_id=");
        sb.append(this.current_user_id);
        if (this.data_base_clear_type != null) {
            sb.append(", data_base_clear_type=");
            sb.append(this.data_base_clear_type);
        }
        if (this.reason_source != null) {
            sb.append(", reason_source=");
            sb.append(this.reason_source);
        }
        if (this.logic_source != null) {
            sb.append(", logic_source=");
            sb.append(this.logic_source);
        }
        if (this.connection_token != null) {
            sb.append(", connection_token=");
            sb.append(this.connection_token);
        }
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (this.frontier_error_code != null) {
            sb.append(", frontier_error_code=");
            sb.append(this.frontier_error_code);
        }
        if (this.current_device_id != null) {
            sb.append(", current_device_id=");
            sb.append(this.current_device_id);
        }
        if (this.context_device_id != null) {
            sb.append(", context_device_id=");
            sb.append(this.context_device_id);
        }
        if (!this.old_mac_address.isEmpty()) {
            sb.append(", old_mac_address=");
            sb.append(this.old_mac_address);
        }
        if (!this.new_mac_address.isEmpty()) {
            sb.append(", new_mac_address=");
            sb.append(this.new_mac_address);
        }
        if (this.server_reason != null) {
            sb.append(", server_reason=");
            sb.append(this.server_reason);
        }
        StringBuilder replace = sb.replace(0, 2, "PushSessionValidatingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushSessionValidatingResponse(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, Long l2, String str8, String str9, List<String> list, List<String> list2, String str10) {
        this(str, str2, l, str3, str4, str5, str6, str7, l2, str8, str9, list, list2, str10, ByteString.EMPTY);
    }

    public PushSessionValidatingResponse(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, Long l2, String str8, String str9, List<String> list, List<String> list2, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        this.access_token = str;
        this.truncated_access_token = str2;
        this.current_user_id = l;
        this.data_base_clear_type = str3;
        this.reason_source = str4;
        this.logic_source = str5;
        this.connection_token = str6;
        this.request_id = str7;
        this.frontier_error_code = l2;
        this.current_device_id = str8;
        this.context_device_id = str9;
        this.old_mac_address = Internal.immutableCopyOf("old_mac_address", list);
        this.new_mac_address = Internal.immutableCopyOf("new_mac_address", list2);
        this.server_reason = str10;
    }
}
