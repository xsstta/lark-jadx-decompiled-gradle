package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SmsPhoneUrgentSetting extends Message<SmsPhoneUrgentSetting, C19217a> {
    public static final ProtoAdapter<SmsPhoneUrgentSetting> ADAPTER = new C19218b();
    public static final Boolean DEFAULT_ACCEPT = false;
    public static final Boolean DEFAULT_CAN_MODIFY = false;
    public static final Boolean DEFAULT_CAN_SEND = false;
    public static final Boolean DEFAULT_NEED_CONFIRM = false;
    private static final long serialVersionUID = 0;
    public final Boolean accept;
    public final Boolean can_modify;
    public final Boolean can_send;
    public final Boolean need_confirm;

    /* renamed from: com.bytedance.lark.pb.settings.v1.SmsPhoneUrgentSetting$b */
    private static final class C19218b extends ProtoAdapter<SmsPhoneUrgentSetting> {
        C19218b() {
            super(FieldEncoding.LENGTH_DELIMITED, SmsPhoneUrgentSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(SmsPhoneUrgentSetting smsPhoneUrgentSetting) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (smsPhoneUrgentSetting.accept != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, smsPhoneUrgentSetting.accept);
            } else {
                i = 0;
            }
            if (smsPhoneUrgentSetting.can_modify != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, smsPhoneUrgentSetting.can_modify);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (smsPhoneUrgentSetting.need_confirm != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, smsPhoneUrgentSetting.need_confirm);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (smsPhoneUrgentSetting.can_send != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, smsPhoneUrgentSetting.can_send);
            }
            return i6 + i4 + smsPhoneUrgentSetting.unknownFields().size();
        }

        /* renamed from: a */
        public SmsPhoneUrgentSetting decode(ProtoReader protoReader) throws IOException {
            C19217a aVar = new C19217a();
            aVar.f47389a = false;
            aVar.f47390b = false;
            aVar.f47391c = false;
            aVar.f47392d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47389a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47390b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47391c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47392d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SmsPhoneUrgentSetting smsPhoneUrgentSetting) throws IOException {
            if (smsPhoneUrgentSetting.accept != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, smsPhoneUrgentSetting.accept);
            }
            if (smsPhoneUrgentSetting.can_modify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, smsPhoneUrgentSetting.can_modify);
            }
            if (smsPhoneUrgentSetting.need_confirm != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, smsPhoneUrgentSetting.need_confirm);
            }
            if (smsPhoneUrgentSetting.can_send != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, smsPhoneUrgentSetting.can_send);
            }
            protoWriter.writeBytes(smsPhoneUrgentSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SmsPhoneUrgentSetting$a */
    public static final class C19217a extends Message.Builder<SmsPhoneUrgentSetting, C19217a> {

        /* renamed from: a */
        public Boolean f47389a;

        /* renamed from: b */
        public Boolean f47390b;

        /* renamed from: c */
        public Boolean f47391c;

        /* renamed from: d */
        public Boolean f47392d;

        /* renamed from: a */
        public SmsPhoneUrgentSetting build() {
            return new SmsPhoneUrgentSetting(this.f47389a, this.f47390b, this.f47391c, this.f47392d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19217a newBuilder() {
        C19217a aVar = new C19217a();
        aVar.f47389a = this.accept;
        aVar.f47390b = this.can_modify;
        aVar.f47391c = this.need_confirm;
        aVar.f47392d = this.can_send;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SmsPhoneUrgentSetting");
        StringBuilder sb = new StringBuilder();
        if (this.accept != null) {
            sb.append(", accept=");
            sb.append(this.accept);
        }
        if (this.can_modify != null) {
            sb.append(", can_modify=");
            sb.append(this.can_modify);
        }
        if (this.need_confirm != null) {
            sb.append(", need_confirm=");
            sb.append(this.need_confirm);
        }
        if (this.can_send != null) {
            sb.append(", can_send=");
            sb.append(this.can_send);
        }
        StringBuilder replace = sb.replace(0, 2, "SmsPhoneUrgentSetting{");
        replace.append('}');
        return replace.toString();
    }

    public SmsPhoneUrgentSetting(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(bool, bool2, bool3, bool4, ByteString.EMPTY);
    }

    public SmsPhoneUrgentSetting(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.accept = bool;
        this.can_modify = bool2;
        this.need_confirm = bool3;
        this.can_send = bool4;
    }
}
