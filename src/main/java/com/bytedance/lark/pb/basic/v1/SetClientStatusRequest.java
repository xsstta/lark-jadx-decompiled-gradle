package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SetClientStatusRequest extends Message<SetClientStatusRequest, C15264a> {
    public static final ProtoAdapter<SetClientStatusRequest> ADAPTER = new C15265b();
    public static final AppStatus DEFAULT_APP_STATUS = AppStatus.FOREGROUND_ACTIVE;
    public static final Integer DEFAULT_INVOKE_ORDER = 0;
    public static final NetType DEFAULT_NET_TYPE = NetType.OFFLINE;
    public static final Boolean DEFAULT_SHOW_NOTICE_DETAIL = true;
    public static final Boolean DEFAULT_SHOW_PHONE_ALERT = true;
    private static final long serialVersionUID = 0;
    public final AppStatus app_status;
    public final Integer invoke_order;
    public final NetType net_type;
    public final String settings;
    public final Boolean show_notice_detail;
    public final Boolean show_phone_alert;

    public enum AppStatus implements WireEnum {
        FOREGROUND_ACTIVE(1),
        BACKGROUND_ACTIVE(2),
        INACTIVE(3);
        
        public static final ProtoAdapter<AppStatus> ADAPTER = ProtoAdapter.newEnumAdapter(AppStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AppStatus fromValue(int i) {
            if (i == 1) {
                return FOREGROUND_ACTIVE;
            }
            if (i == 2) {
                return BACKGROUND_ACTIVE;
            }
            if (i != 3) {
                return null;
            }
            return INACTIVE;
        }

        private AppStatus(int i) {
            this.value = i;
        }
    }

    public enum NetType implements WireEnum {
        OFFLINE(1),
        ONLINE_2G(2),
        ONLINE_3G(3),
        ONLINE_4G(4),
        ONLINE_WIFI(5),
        ONLINE_WIRED(6),
        ONLINE_5G(7);
        
        public static final ProtoAdapter<NetType> ADAPTER = ProtoAdapter.newEnumAdapter(NetType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static NetType fromValue(int i) {
            switch (i) {
                case 1:
                    return OFFLINE;
                case 2:
                    return ONLINE_2G;
                case 3:
                    return ONLINE_3G;
                case 4:
                    return ONLINE_4G;
                case 5:
                    return ONLINE_WIFI;
                case 6:
                    return ONLINE_WIRED;
                case 7:
                    return ONLINE_5G;
                default:
                    return null;
            }
        }

        private NetType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetClientStatusRequest$b */
    private static final class C15265b extends ProtoAdapter<SetClientStatusRequest> {
        C15265b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetClientStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetClientStatusRequest setClientStatusRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (setClientStatusRequest.net_type != null) {
                i = NetType.ADAPTER.encodedSizeWithTag(1, setClientStatusRequest.net_type);
            } else {
                i = 0;
            }
            if (setClientStatusRequest.settings != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, setClientStatusRequest.settings);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (setClientStatusRequest.show_notice_detail != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, setClientStatusRequest.show_notice_detail);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (setClientStatusRequest.show_phone_alert != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, setClientStatusRequest.show_phone_alert);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (setClientStatusRequest.app_status != null) {
                i5 = AppStatus.ADAPTER.encodedSizeWithTag(5, setClientStatusRequest.app_status);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (setClientStatusRequest.invoke_order != null) {
                i6 = ProtoAdapter.UINT32.encodedSizeWithTag(6, setClientStatusRequest.invoke_order);
            }
            return i10 + i6 + setClientStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetClientStatusRequest decode(ProtoReader protoReader) throws IOException {
            C15264a aVar = new C15264a();
            aVar.f40462a = NetType.OFFLINE;
            aVar.f40463b = "";
            aVar.f40464c = true;
            aVar.f40465d = true;
            aVar.f40466e = AppStatus.FOREGROUND_ACTIVE;
            aVar.f40467f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f40462a = NetType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f40463b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40464c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40465d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f40466e = AppStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f40467f = ProtoAdapter.UINT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SetClientStatusRequest setClientStatusRequest) throws IOException {
            if (setClientStatusRequest.net_type != null) {
                NetType.ADAPTER.encodeWithTag(protoWriter, 1, setClientStatusRequest.net_type);
            }
            if (setClientStatusRequest.settings != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setClientStatusRequest.settings);
            }
            if (setClientStatusRequest.show_notice_detail != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, setClientStatusRequest.show_notice_detail);
            }
            if (setClientStatusRequest.show_phone_alert != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, setClientStatusRequest.show_phone_alert);
            }
            if (setClientStatusRequest.app_status != null) {
                AppStatus.ADAPTER.encodeWithTag(protoWriter, 5, setClientStatusRequest.app_status);
            }
            if (setClientStatusRequest.invoke_order != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 6, setClientStatusRequest.invoke_order);
            }
            protoWriter.writeBytes(setClientStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetClientStatusRequest$a */
    public static final class C15264a extends Message.Builder<SetClientStatusRequest, C15264a> {

        /* renamed from: a */
        public NetType f40462a;

        /* renamed from: b */
        public String f40463b;

        /* renamed from: c */
        public Boolean f40464c;

        /* renamed from: d */
        public Boolean f40465d;

        /* renamed from: e */
        public AppStatus f40466e;

        /* renamed from: f */
        public Integer f40467f;

        /* renamed from: a */
        public SetClientStatusRequest build() {
            return new SetClientStatusRequest(this.f40462a, this.f40463b, this.f40464c, this.f40465d, this.f40466e, this.f40467f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15264a mo55563a(NetType netType) {
            this.f40462a = netType;
            return this;
        }

        /* renamed from: a */
        public C15264a mo55564a(Boolean bool) {
            this.f40464c = bool;
            return this;
        }

        /* renamed from: a */
        public C15264a mo55565a(Integer num) {
            this.f40467f = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15264a newBuilder() {
        C15264a aVar = new C15264a();
        aVar.f40462a = this.net_type;
        aVar.f40463b = this.settings;
        aVar.f40464c = this.show_notice_detail;
        aVar.f40465d = this.show_phone_alert;
        aVar.f40466e = this.app_status;
        aVar.f40467f = this.invoke_order;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetClientStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (this.net_type != null) {
            sb.append(", net_type=");
            sb.append(this.net_type);
        }
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        if (this.show_notice_detail != null) {
            sb.append(", show_notice_detail=");
            sb.append(this.show_notice_detail);
        }
        if (this.show_phone_alert != null) {
            sb.append(", show_phone_alert=");
            sb.append(this.show_phone_alert);
        }
        if (this.app_status != null) {
            sb.append(", app_status=");
            sb.append(this.app_status);
        }
        if (this.invoke_order != null) {
            sb.append(", invoke_order=");
            sb.append(this.invoke_order);
        }
        StringBuilder replace = sb.replace(0, 2, "SetClientStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetClientStatusRequest(NetType netType, String str, Boolean bool, Boolean bool2, AppStatus appStatus, Integer num) {
        this(netType, str, bool, bool2, appStatus, num, ByteString.EMPTY);
    }

    public SetClientStatusRequest(NetType netType, String str, Boolean bool, Boolean bool2, AppStatus appStatus, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.net_type = netType;
        this.settings = str;
        this.show_notice_detail = bool;
        this.show_phone_alert = bool2;
        this.app_status = appStatus;
        this.invoke_order = num;
    }
}
