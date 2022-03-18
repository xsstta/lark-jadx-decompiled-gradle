package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class SetDeviceRequest extends Message<SetDeviceRequest, C16592a> {
    public static final ProtoAdapter<SetDeviceRequest> ADAPTER = new C16593b();
    private static final long serialVersionUID = 0;
    public final String app_name;
    public final String device_id;
    public final String device_platform;
    public final String device_type;
    public final String install_id;
    public final String os_version;
    public final Map<String, String> settings_queries;

    /* renamed from: com.bytedance.lark.pb.device.v1.SetDeviceRequest$b */
    private static final class C16593b extends ProtoAdapter<SetDeviceRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f42960a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C16593b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetDeviceRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetDeviceRequest setDeviceRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, setDeviceRequest.device_id);
            int i5 = 0;
            if (setDeviceRequest.install_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, setDeviceRequest.install_id);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (setDeviceRequest.os_version != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, setDeviceRequest.os_version);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (setDeviceRequest.device_type != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, setDeviceRequest.device_type);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i7 + i3 + this.f42960a.encodedSizeWithTag(5, setDeviceRequest.settings_queries);
            if (setDeviceRequest.app_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, setDeviceRequest.app_name);
            } else {
                i4 = 0;
            }
            int i8 = encodedSizeWithTag2 + i4;
            if (setDeviceRequest.device_platform != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, setDeviceRequest.device_platform);
            }
            return i8 + i5 + setDeviceRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetDeviceRequest decode(ProtoReader protoReader) throws IOException {
            C16592a aVar = new C16592a();
            aVar.f42953a = "";
            aVar.f42954b = "";
            aVar.f42955c = "";
            aVar.f42956d = "";
            aVar.f42958f = "";
            aVar.f42959g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42953a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42954b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42955c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42956d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42957e.putAll(this.f42960a.decode(protoReader));
                            break;
                        case 6:
                            aVar.f42958f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42959g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SetDeviceRequest setDeviceRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setDeviceRequest.device_id);
            if (setDeviceRequest.install_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setDeviceRequest.install_id);
            }
            if (setDeviceRequest.os_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setDeviceRequest.os_version);
            }
            if (setDeviceRequest.device_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, setDeviceRequest.device_type);
            }
            this.f42960a.encodeWithTag(protoWriter, 5, setDeviceRequest.settings_queries);
            if (setDeviceRequest.app_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, setDeviceRequest.app_name);
            }
            if (setDeviceRequest.device_platform != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, setDeviceRequest.device_platform);
            }
            protoWriter.writeBytes(setDeviceRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.SetDeviceRequest$a */
    public static final class C16592a extends Message.Builder<SetDeviceRequest, C16592a> {

        /* renamed from: a */
        public String f42953a;

        /* renamed from: b */
        public String f42954b;

        /* renamed from: c */
        public String f42955c;

        /* renamed from: d */
        public String f42956d;

        /* renamed from: e */
        public Map<String, String> f42957e = Internal.newMutableMap();

        /* renamed from: f */
        public String f42958f;

        /* renamed from: g */
        public String f42959g;

        /* renamed from: a */
        public SetDeviceRequest build() {
            String str = this.f42953a;
            if (str != null) {
                return new SetDeviceRequest(str, this.f42954b, this.f42955c, this.f42956d, this.f42957e, this.f42958f, this.f42959g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "device_id");
        }

        /* renamed from: a */
        public C16592a mo59022a(String str) {
            this.f42953a = str;
            return this;
        }

        /* renamed from: b */
        public C16592a mo59025b(String str) {
            this.f42955c = str;
            return this;
        }

        /* renamed from: c */
        public C16592a mo59026c(String str) {
            this.f42956d = str;
            return this;
        }

        /* renamed from: d */
        public C16592a mo59027d(String str) {
            this.f42958f = str;
            return this;
        }

        /* renamed from: e */
        public C16592a mo59028e(String str) {
            this.f42959g = str;
            return this;
        }

        /* renamed from: a */
        public C16592a mo59023a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f42957e = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16592a newBuilder() {
        C16592a aVar = new C16592a();
        aVar.f42953a = this.device_id;
        aVar.f42954b = this.install_id;
        aVar.f42955c = this.os_version;
        aVar.f42956d = this.device_type;
        aVar.f42957e = Internal.copyOf("settings_queries", this.settings_queries);
        aVar.f42958f = this.app_name;
        aVar.f42959g = this.device_platform;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "SetDeviceRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", device_id=");
        sb.append(this.device_id);
        if (this.install_id != null) {
            sb.append(", install_id=");
            sb.append(this.install_id);
        }
        if (this.os_version != null) {
            sb.append(", os_version=");
            sb.append(this.os_version);
        }
        if (this.device_type != null) {
            sb.append(", device_type=");
            sb.append(this.device_type);
        }
        if (!this.settings_queries.isEmpty()) {
            sb.append(", settings_queries=");
            sb.append(this.settings_queries);
        }
        if (this.app_name != null) {
            sb.append(", app_name=");
            sb.append(this.app_name);
        }
        if (this.device_platform != null) {
            sb.append(", device_platform=");
            sb.append(this.device_platform);
        }
        StringBuilder replace = sb.replace(0, 2, "SetDeviceRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetDeviceRequest(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) {
        this(str, str2, str3, str4, map, str5, str6, ByteString.EMPTY);
    }

    public SetDeviceRequest(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.device_id = str;
        this.install_id = str2;
        this.os_version = str3;
        this.device_type = str4;
        this.settings_queries = Internal.immutableCopyOf("settings_queries", map);
        this.app_name = str5;
        this.device_platform = str6;
    }
}
