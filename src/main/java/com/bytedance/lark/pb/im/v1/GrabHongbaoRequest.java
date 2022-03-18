package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GrabHongbaoRequest extends Message<GrabHongbaoRequest, Builder> {
    public static final ProtoAdapter<GrabHongbaoRequest> ADAPTER = new C17778a();
    public static final HongbaoType DEFAULT_HONGBAO_TYPE = HongbaoType.NORMAL;
    public static final Boolean DEFAULT_IS_RETURN_NAME_AUTH = false;
    private static final long serialVersionUID = 0;
    public final DeviceInfo device_info;
    public final HongbaoType hongbao_type;
    public final String id;
    public final Boolean is_return_name_auth;

    public static final class DeviceInfo extends Message<DeviceInfo, Builder> {
        public static final ProtoAdapter<DeviceInfo> ADAPTER = new C17777a();
        private static final long serialVersionUID = 0;
        public final String finance_sdk_version;

        /* renamed from: com.bytedance.lark.pb.im.v1.GrabHongbaoRequest$DeviceInfo$a */
        private static final class C17777a extends ProtoAdapter<DeviceInfo> {
            C17777a() {
                super(FieldEncoding.LENGTH_DELIMITED, DeviceInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(DeviceInfo deviceInfo) {
                int i;
                if (deviceInfo.finance_sdk_version != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, deviceInfo.finance_sdk_version);
                } else {
                    i = 0;
                }
                return i + deviceInfo.unknownFields().size();
            }

            /* renamed from: a */
            public DeviceInfo decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                builder.finance_sdk_version = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return builder.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        builder.finance_sdk_version = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DeviceInfo deviceInfo) throws IOException {
                if (deviceInfo.finance_sdk_version != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deviceInfo.finance_sdk_version);
                }
                protoWriter.writeBytes(deviceInfo.unknownFields());
            }
        }

        public static final class Builder extends Message.Builder<DeviceInfo, Builder> {
            public String finance_sdk_version;

            @Override // com.squareup.wire.Message.Builder
            public DeviceInfo build() {
                return new DeviceInfo(this.finance_sdk_version, super.buildUnknownFields());
            }

            public Builder finance_sdk_version(String str) {
                this.finance_sdk_version = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.finance_sdk_version = this.finance_sdk_version;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "DeviceInfo");
            StringBuilder sb = new StringBuilder();
            if (this.finance_sdk_version != null) {
                sb.append(", finance_sdk_version=");
                sb.append(this.finance_sdk_version);
            }
            StringBuilder replace = sb.replace(0, 2, "DeviceInfo{");
            replace.append('}');
            return replace.toString();
        }

        public DeviceInfo(String str) {
            this(str, ByteString.EMPTY);
        }

        public DeviceInfo(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.finance_sdk_version = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GrabHongbaoRequest$a */
    private static final class C17778a extends ProtoAdapter<GrabHongbaoRequest> {
        C17778a() {
            super(FieldEncoding.LENGTH_DELIMITED, GrabHongbaoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GrabHongbaoRequest grabHongbaoRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, grabHongbaoRequest.id);
            int i3 = 0;
            if (grabHongbaoRequest.is_return_name_auth != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, grabHongbaoRequest.is_return_name_auth);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (grabHongbaoRequest.hongbao_type != null) {
                i2 = HongbaoType.ADAPTER.encodedSizeWithTag(3, grabHongbaoRequest.hongbao_type);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (grabHongbaoRequest.device_info != null) {
                i3 = DeviceInfo.ADAPTER.encodedSizeWithTag(5, grabHongbaoRequest.device_info);
            }
            return i5 + i3 + grabHongbaoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GrabHongbaoRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.id = "";
            builder.is_return_name_auth = false;
            builder.hongbao_type = HongbaoType.NORMAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    builder.is_return_name_auth = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        builder.hongbao_type = HongbaoType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.device_info = DeviceInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GrabHongbaoRequest grabHongbaoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, grabHongbaoRequest.id);
            if (grabHongbaoRequest.is_return_name_auth != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, grabHongbaoRequest.is_return_name_auth);
            }
            if (grabHongbaoRequest.hongbao_type != null) {
                HongbaoType.ADAPTER.encodeWithTag(protoWriter, 3, grabHongbaoRequest.hongbao_type);
            }
            if (grabHongbaoRequest.device_info != null) {
                DeviceInfo.ADAPTER.encodeWithTag(protoWriter, 5, grabHongbaoRequest.device_info);
            }
            protoWriter.writeBytes(grabHongbaoRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.is_return_name_auth = this.is_return_name_auth;
        builder.hongbao_type = this.hongbao_type;
        builder.device_info = this.device_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<GrabHongbaoRequest, Builder> {
        public DeviceInfo device_info;
        public HongbaoType hongbao_type;
        public String id;
        public Boolean is_return_name_auth;

        @Override // com.squareup.wire.Message.Builder
        public GrabHongbaoRequest build() {
            String str = this.id;
            if (str != null) {
                return new GrabHongbaoRequest(str, this.is_return_name_auth, this.hongbao_type, this.device_info, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        public Builder device_info(DeviceInfo deviceInfo) {
            this.device_info = deviceInfo;
            return this;
        }

        public Builder hongbao_type(HongbaoType hongbaoType) {
            this.hongbao_type = hongbaoType;
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder is_return_name_auth(Boolean bool) {
            this.is_return_name_auth = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GrabHongbaoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.is_return_name_auth != null) {
            sb.append(", is_return_name_auth=");
            sb.append(this.is_return_name_auth);
        }
        if (this.hongbao_type != null) {
            sb.append(", hongbao_type=");
            sb.append(this.hongbao_type);
        }
        if (this.device_info != null) {
            sb.append(", device_info=");
            sb.append(this.device_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GrabHongbaoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GrabHongbaoRequest(String str, Boolean bool, HongbaoType hongbaoType, DeviceInfo deviceInfo) {
        this(str, bool, hongbaoType, deviceInfo, ByteString.EMPTY);
    }

    public GrabHongbaoRequest(String str, Boolean bool, HongbaoType hongbaoType, DeviceInfo deviceInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.is_return_name_auth = bool;
        this.hongbao_type = hongbaoType;
        this.device_info = deviceInfo;
    }
}
