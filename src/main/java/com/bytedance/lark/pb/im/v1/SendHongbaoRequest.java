package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.bytedance.lark.pb.basic.v1.HongbaoContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class SendHongbaoRequest extends Message<SendHongbaoRequest, Builder> {
    public static final ProtoAdapter<SendHongbaoRequest> ADAPTER = new C18020a();
    public static final Long DEFAULT_COVER_ID = 0L;
    public static final Long DEFAULT_TOTAL_AMOUNT = 0L;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final HongbaoContent.Type DEFAULT_TYPE = HongbaoContent.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final Long cover_id;
    public final DeviceInfo device_info;
    public final String sdk_config;
    public final String subject;
    public final Long total_amount;
    public final Integer total_num;
    public final HongbaoContent.Type type;

    public static final class DeviceInfo extends Message<DeviceInfo, Builder> {
        public static final ProtoAdapter<DeviceInfo> ADAPTER = new C18019a();
        private static final long serialVersionUID = 0;
        public final String finance_sdk_version;

        /* renamed from: com.bytedance.lark.pb.im.v1.SendHongbaoRequest$DeviceInfo$a */
        private static final class C18019a extends ProtoAdapter<DeviceInfo> {
            C18019a() {
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

    /* renamed from: com.bytedance.lark.pb.im.v1.SendHongbaoRequest$a */
    private static final class C18020a extends ProtoAdapter<SendHongbaoRequest> {
        C18020a() {
            super(FieldEncoding.LENGTH_DELIMITED, SendHongbaoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendHongbaoRequest sendHongbaoRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, sendHongbaoRequest.total_amount) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendHongbaoRequest.total_num) + ProtoAdapter.STRING.encodedSizeWithTag(3, sendHongbaoRequest.subject) + HongbaoContent.Type.ADAPTER.encodedSizeWithTag(4, sendHongbaoRequest.type) + Channel.ADAPTER.encodedSizeWithTag(5, sendHongbaoRequest.channel);
            int i3 = 0;
            if (sendHongbaoRequest.sdk_config != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(6, sendHongbaoRequest.sdk_config);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (sendHongbaoRequest.cover_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(7, sendHongbaoRequest.cover_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (sendHongbaoRequest.device_info != null) {
                i3 = DeviceInfo.ADAPTER.encodedSizeWithTag(10, sendHongbaoRequest.device_info);
            }
            return i5 + i3 + sendHongbaoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendHongbaoRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.total_amount = 0L;
            builder.total_num = 0;
            builder.subject = "";
            builder.type = HongbaoContent.Type.UNKNOWN;
            builder.sdk_config = "";
            builder.cover_id = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 10) {
                    switch (nextTag) {
                        case 1:
                            builder.total_amount = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 2:
                            builder.total_num = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 3:
                            builder.subject = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            try {
                                builder.type = HongbaoContent.Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            builder.channel = Channel.ADAPTER.decode(protoReader);
                            continue;
                        case 6:
                            builder.sdk_config = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            builder.cover_id = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    builder.device_info = DeviceInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendHongbaoRequest sendHongbaoRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, sendHongbaoRequest.total_amount);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendHongbaoRequest.total_num);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sendHongbaoRequest.subject);
            HongbaoContent.Type.ADAPTER.encodeWithTag(protoWriter, 4, sendHongbaoRequest.type);
            Channel.ADAPTER.encodeWithTag(protoWriter, 5, sendHongbaoRequest.channel);
            if (sendHongbaoRequest.sdk_config != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sendHongbaoRequest.sdk_config);
            }
            if (sendHongbaoRequest.cover_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, sendHongbaoRequest.cover_id);
            }
            if (sendHongbaoRequest.device_info != null) {
                DeviceInfo.ADAPTER.encodeWithTag(protoWriter, 10, sendHongbaoRequest.device_info);
            }
            protoWriter.writeBytes(sendHongbaoRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.total_amount = this.total_amount;
        builder.total_num = this.total_num;
        builder.subject = this.subject;
        builder.type = this.type;
        builder.channel = this.channel;
        builder.sdk_config = this.sdk_config;
        builder.cover_id = this.cover_id;
        builder.device_info = this.device_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<SendHongbaoRequest, Builder> {
        public Channel channel;
        public Long cover_id;
        public DeviceInfo device_info;
        public String sdk_config;
        public String subject;
        public Long total_amount;
        public Integer total_num;
        public HongbaoContent.Type type;

        @Override // com.squareup.wire.Message.Builder
        public SendHongbaoRequest build() {
            Integer num;
            String str;
            HongbaoContent.Type type2;
            Channel channel2;
            Long l = this.total_amount;
            if (l != null && (num = this.total_num) != null && (str = this.subject) != null && (type2 = this.type) != null && (channel2 = this.channel) != null) {
                return new SendHongbaoRequest(l, num, str, type2, channel2, this.sdk_config, this.cover_id, this.device_info, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "total_amount", this.total_num, "total_num", this.subject, "subject", this.type, ShareHitPoint.f121869d, this.channel, "channel");
        }

        public Builder channel(Channel channel2) {
            this.channel = channel2;
            return this;
        }

        public Builder cover_id(Long l) {
            this.cover_id = l;
            return this;
        }

        public Builder device_info(DeviceInfo deviceInfo) {
            this.device_info = deviceInfo;
            return this;
        }

        public Builder sdk_config(String str) {
            this.sdk_config = str;
            return this;
        }

        public Builder subject(String str) {
            this.subject = str;
            return this;
        }

        public Builder total_amount(Long l) {
            this.total_amount = l;
            return this;
        }

        public Builder total_num(Integer num) {
            this.total_num = num;
            return this;
        }

        public Builder type(HongbaoContent.Type type2) {
            this.type = type2;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendHongbaoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", total_amount=");
        sb.append(this.total_amount);
        sb.append(", total_num=");
        sb.append(this.total_num);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", channel=");
        sb.append(this.channel);
        if (this.sdk_config != null) {
            sb.append(", sdk_config=");
            sb.append(this.sdk_config);
        }
        if (this.cover_id != null) {
            sb.append(", cover_id=");
            sb.append(this.cover_id);
        }
        if (this.device_info != null) {
            sb.append(", device_info=");
            sb.append(this.device_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SendHongbaoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendHongbaoRequest(Long l, Integer num, String str, HongbaoContent.Type type2, Channel channel2, String str2, Long l2, DeviceInfo deviceInfo) {
        this(l, num, str, type2, channel2, str2, l2, deviceInfo, ByteString.EMPTY);
    }

    public SendHongbaoRequest(Long l, Integer num, String str, HongbaoContent.Type type2, Channel channel2, String str2, Long l2, DeviceInfo deviceInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_amount = l;
        this.total_num = num;
        this.subject = str;
        this.type = type2;
        this.channel = channel2;
        this.sdk_config = str2;
        this.cover_id = l2;
        this.device_info = deviceInfo;
    }
}
