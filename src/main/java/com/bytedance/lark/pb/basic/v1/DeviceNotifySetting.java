package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeviceNotifySetting extends Message<DeviceNotifySetting, C14866a> {
    public static final ProtoAdapter<DeviceNotifySetting> ADAPTER = new C14867b();
    public static final Boolean DEFAULT_DISABLE_MOBILE_NOTIFY = false;
    public static final Boolean DEFAULT_SHOW_MESSAGE_DETAIL = false;
    public static final Boolean DEFAULT_STILL_NOTIFY_AT = false;
    private static final long serialVersionUID = 0;
    public final Boolean disable_mobile_notify;
    public final Boolean show_message_detail;
    public final Boolean still_notify_at;

    /* renamed from: com.bytedance.lark.pb.basic.v1.DeviceNotifySetting$b */
    private static final class C14867b extends ProtoAdapter<DeviceNotifySetting> {
        C14867b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeviceNotifySetting.class);
        }

        /* renamed from: a */
        public int encodedSize(DeviceNotifySetting deviceNotifySetting) {
            int i;
            int i2;
            int i3 = 0;
            if (deviceNotifySetting.disable_mobile_notify != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, deviceNotifySetting.disable_mobile_notify);
            } else {
                i = 0;
            }
            if (deviceNotifySetting.still_notify_at != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, deviceNotifySetting.still_notify_at);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (deviceNotifySetting.show_message_detail != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, deviceNotifySetting.show_message_detail);
            }
            return i4 + i3 + deviceNotifySetting.unknownFields().size();
        }

        /* renamed from: a */
        public DeviceNotifySetting decode(ProtoReader protoReader) throws IOException {
            C14866a aVar = new C14866a();
            aVar.f39312a = false;
            aVar.f39313b = false;
            aVar.f39314c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39312a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39313b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39314c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeviceNotifySetting deviceNotifySetting) throws IOException {
            if (deviceNotifySetting.disable_mobile_notify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, deviceNotifySetting.disable_mobile_notify);
            }
            if (deviceNotifySetting.still_notify_at != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, deviceNotifySetting.still_notify_at);
            }
            if (deviceNotifySetting.show_message_detail != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, deviceNotifySetting.show_message_detail);
            }
            protoWriter.writeBytes(deviceNotifySetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DeviceNotifySetting$a */
    public static final class C14866a extends Message.Builder<DeviceNotifySetting, C14866a> {

        /* renamed from: a */
        public Boolean f39312a;

        /* renamed from: b */
        public Boolean f39313b;

        /* renamed from: c */
        public Boolean f39314c;

        /* renamed from: a */
        public DeviceNotifySetting build() {
            return new DeviceNotifySetting(this.f39312a, this.f39313b, this.f39314c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14866a mo54514a(Boolean bool) {
            this.f39312a = bool;
            return this;
        }

        /* renamed from: b */
        public C14866a mo54516b(Boolean bool) {
            this.f39313b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14866a newBuilder() {
        C14866a aVar = new C14866a();
        aVar.f39312a = this.disable_mobile_notify;
        aVar.f39313b = this.still_notify_at;
        aVar.f39314c = this.show_message_detail;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DeviceNotifySetting");
        StringBuilder sb = new StringBuilder();
        if (this.disable_mobile_notify != null) {
            sb.append(", disable_mobile_notify=");
            sb.append(this.disable_mobile_notify);
        }
        if (this.still_notify_at != null) {
            sb.append(", still_notify_at=");
            sb.append(this.still_notify_at);
        }
        if (this.show_message_detail != null) {
            sb.append(", show_message_detail=");
            sb.append(this.show_message_detail);
        }
        StringBuilder replace = sb.replace(0, 2, "DeviceNotifySetting{");
        replace.append('}');
        return replace.toString();
    }

    public DeviceNotifySetting(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public DeviceNotifySetting(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.disable_mobile_notify = bool;
        this.still_notify_at = bool2;
        this.show_message_detail = bool3;
    }
}
