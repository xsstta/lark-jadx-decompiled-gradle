package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Device extends Message<Device, C14864a> {
    public static final ProtoAdapter<Device> ADAPTER = new C14865b();
    public static final Boolean DEFAULT_IS_CURRENT_DEVICE = false;
    public static final Boolean DEFAULT_IS_ONLINE = false;
    public static final Long DEFAULT_LOGIN_TIME = 0L;
    public static final Long DEFAULT_RENEWAL_TIME = 0L;
    public static final Terminal DEFAULT_TERMINAL = Terminal.PC;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Boolean is_current_device;
    public final Boolean is_online;
    public final Long login_time;
    public final String model;
    public final String name;
    public final String os;
    public final Long renewal_time;
    public final Terminal terminal;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Device$b */
    private static final class C14865b extends ProtoAdapter<Device> {
        C14865b() {
            super(FieldEncoding.LENGTH_DELIMITED, Device.class);
        }

        /* renamed from: a */
        public int encodedSize(Device device) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, device.id);
            int i8 = 0;
            if (device.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, device.name);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (device.os != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, device.os);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (device.terminal != null) {
                i3 = Terminal.ADAPTER.encodedSizeWithTag(4, device.terminal);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (device.login_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(5, device.login_time);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (device.is_current_device != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, device.is_current_device);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (device.model != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, device.model);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (device.is_online != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, device.is_online);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (device.renewal_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(9, device.renewal_time);
            }
            return i15 + i8 + device.unknownFields().size();
        }

        /* renamed from: a */
        public Device decode(ProtoReader protoReader) throws IOException {
            C14864a aVar = new C14864a();
            aVar.f39303a = "";
            aVar.f39304b = "";
            aVar.f39305c = "";
            aVar.f39306d = Terminal.PC;
            aVar.f39307e = 0L;
            aVar.f39308f = false;
            aVar.f39309g = "";
            aVar.f39310h = false;
            aVar.f39311i = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39303a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39304b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39305c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f39306d = Terminal.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f39307e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39308f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39309g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39310h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39311i = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Device device) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, device.id);
            if (device.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, device.name);
            }
            if (device.os != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, device.os);
            }
            if (device.terminal != null) {
                Terminal.ADAPTER.encodeWithTag(protoWriter, 4, device.terminal);
            }
            if (device.login_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, device.login_time);
            }
            if (device.is_current_device != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, device.is_current_device);
            }
            if (device.model != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, device.model);
            }
            if (device.is_online != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, device.is_online);
            }
            if (device.renewal_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, device.renewal_time);
            }
            protoWriter.writeBytes(device.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Device$a */
    public static final class C14864a extends Message.Builder<Device, C14864a> {

        /* renamed from: a */
        public String f39303a;

        /* renamed from: b */
        public String f39304b;

        /* renamed from: c */
        public String f39305c;

        /* renamed from: d */
        public Terminal f39306d;

        /* renamed from: e */
        public Long f39307e;

        /* renamed from: f */
        public Boolean f39308f;

        /* renamed from: g */
        public String f39309g;

        /* renamed from: h */
        public Boolean f39310h;

        /* renamed from: i */
        public Long f39311i;

        /* renamed from: a */
        public Device build() {
            String str = this.f39303a;
            if (str != null) {
                return new Device(str, this.f39304b, this.f39305c, this.f39306d, this.f39307e, this.f39308f, this.f39309g, this.f39310h, this.f39311i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C14864a newBuilder() {
        C14864a aVar = new C14864a();
        aVar.f39303a = this.id;
        aVar.f39304b = this.name;
        aVar.f39305c = this.os;
        aVar.f39306d = this.terminal;
        aVar.f39307e = this.login_time;
        aVar.f39308f = this.is_current_device;
        aVar.f39309g = this.model;
        aVar.f39310h = this.is_online;
        aVar.f39311i = this.renewal_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Device");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.os != null) {
            sb.append(", os=");
            sb.append(this.os);
        }
        if (this.terminal != null) {
            sb.append(", terminal=");
            sb.append(this.terminal);
        }
        if (this.login_time != null) {
            sb.append(", login_time=");
            sb.append(this.login_time);
        }
        if (this.is_current_device != null) {
            sb.append(", is_current_device=");
            sb.append(this.is_current_device);
        }
        if (this.model != null) {
            sb.append(", model=");
            sb.append(this.model);
        }
        if (this.is_online != null) {
            sb.append(", is_online=");
            sb.append(this.is_online);
        }
        if (this.renewal_time != null) {
            sb.append(", renewal_time=");
            sb.append(this.renewal_time);
        }
        StringBuilder replace = sb.replace(0, 2, "Device{");
        replace.append('}');
        return replace.toString();
    }

    public Device(String str, String str2, String str3, Terminal terminal2, Long l, Boolean bool, String str4, Boolean bool2, Long l2) {
        this(str, str2, str3, terminal2, l, bool, str4, bool2, l2, ByteString.EMPTY);
    }

    public Device(String str, String str2, String str3, Terminal terminal2, Long l, Boolean bool, String str4, Boolean bool2, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.os = str3;
        this.terminal = terminal2;
        this.login_time = l;
        this.is_current_device = bool;
        this.model = str4;
        this.is_online = bool2;
        this.renewal_time = l2;
    }
}
