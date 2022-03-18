package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PinSubscribeSetting extends Message<PinSubscribeSetting, C19183a> {
    public static final ProtoAdapter<PinSubscribeSetting> ADAPTER = new C19184b();
    public static final Boolean DEFAULT_IS_SUBSCRIBED_PIN = true;
    public static final Integer DEFAULT_NOTIFY_TIME_HOUR = 20;
    private static final long serialVersionUID = 0;
    public final Boolean is_subscribed_pin;
    public final Integer notify_time_hour;

    /* renamed from: com.bytedance.lark.pb.settings.v1.PinSubscribeSetting$b */
    private static final class C19184b extends ProtoAdapter<PinSubscribeSetting> {
        C19184b() {
            super(FieldEncoding.LENGTH_DELIMITED, PinSubscribeSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(PinSubscribeSetting pinSubscribeSetting) {
            int i;
            int i2 = 0;
            if (pinSubscribeSetting.is_subscribed_pin != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pinSubscribeSetting.is_subscribed_pin);
            } else {
                i = 0;
            }
            if (pinSubscribeSetting.notify_time_hour != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, pinSubscribeSetting.notify_time_hour);
            }
            return i + i2 + pinSubscribeSetting.unknownFields().size();
        }

        /* renamed from: a */
        public PinSubscribeSetting decode(ProtoReader protoReader) throws IOException {
            C19183a aVar = new C19183a();
            aVar.f47341a = true;
            aVar.f47342b = 20;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47341a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47342b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PinSubscribeSetting pinSubscribeSetting) throws IOException {
            if (pinSubscribeSetting.is_subscribed_pin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pinSubscribeSetting.is_subscribed_pin);
            }
            if (pinSubscribeSetting.notify_time_hour != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pinSubscribeSetting.notify_time_hour);
            }
            protoWriter.writeBytes(pinSubscribeSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.PinSubscribeSetting$a */
    public static final class C19183a extends Message.Builder<PinSubscribeSetting, C19183a> {

        /* renamed from: a */
        public Boolean f47341a;

        /* renamed from: b */
        public Integer f47342b;

        /* renamed from: a */
        public PinSubscribeSetting build() {
            return new PinSubscribeSetting(this.f47341a, this.f47342b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19183a newBuilder() {
        C19183a aVar = new C19183a();
        aVar.f47341a = this.is_subscribed_pin;
        aVar.f47342b = this.notify_time_hour;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "PinSubscribeSetting");
        StringBuilder sb = new StringBuilder();
        if (this.is_subscribed_pin != null) {
            sb.append(", is_subscribed_pin=");
            sb.append(this.is_subscribed_pin);
        }
        if (this.notify_time_hour != null) {
            sb.append(", notify_time_hour=");
            sb.append(this.notify_time_hour);
        }
        StringBuilder replace = sb.replace(0, 2, "PinSubscribeSetting{");
        replace.append('}');
        return replace.toString();
    }

    public PinSubscribeSetting(Boolean bool, Integer num) {
        this(bool, num, ByteString.EMPTY);
    }

    public PinSubscribeSetting(Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_subscribed_pin = bool;
        this.notify_time_hour = num;
    }
}
