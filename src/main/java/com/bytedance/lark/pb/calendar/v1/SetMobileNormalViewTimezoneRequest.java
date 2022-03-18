package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetMobileNormalViewTimezoneRequest extends Message<SetMobileNormalViewTimezoneRequest, C16044a> {
    public static final ProtoAdapter<SetMobileNormalViewTimezoneRequest> ADAPTER = new C16045b();
    public static final Boolean DEFAULT_USE_SYSTEM_TIMEZONE = true;
    private static final long serialVersionUID = 0;
    public final String timezone_id;
    public final Boolean use_system_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetMobileNormalViewTimezoneRequest$b */
    private static final class C16045b extends ProtoAdapter<SetMobileNormalViewTimezoneRequest> {
        C16045b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetMobileNormalViewTimezoneRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetMobileNormalViewTimezoneRequest setMobileNormalViewTimezoneRequest) {
            int i;
            int i2 = 0;
            if (setMobileNormalViewTimezoneRequest.timezone_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setMobileNormalViewTimezoneRequest.timezone_id);
            } else {
                i = 0;
            }
            if (setMobileNormalViewTimezoneRequest.use_system_timezone != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, setMobileNormalViewTimezoneRequest.use_system_timezone);
            }
            return i + i2 + setMobileNormalViewTimezoneRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetMobileNormalViewTimezoneRequest decode(ProtoReader protoReader) throws IOException {
            C16044a aVar = new C16044a();
            aVar.f42120a = "";
            aVar.f42121b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42120a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42121b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetMobileNormalViewTimezoneRequest setMobileNormalViewTimezoneRequest) throws IOException {
            if (setMobileNormalViewTimezoneRequest.timezone_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setMobileNormalViewTimezoneRequest.timezone_id);
            }
            if (setMobileNormalViewTimezoneRequest.use_system_timezone != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setMobileNormalViewTimezoneRequest.use_system_timezone);
            }
            protoWriter.writeBytes(setMobileNormalViewTimezoneRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetMobileNormalViewTimezoneRequest$a */
    public static final class C16044a extends Message.Builder<SetMobileNormalViewTimezoneRequest, C16044a> {

        /* renamed from: a */
        public String f42120a;

        /* renamed from: b */
        public Boolean f42121b;

        /* renamed from: a */
        public SetMobileNormalViewTimezoneRequest build() {
            return new SetMobileNormalViewTimezoneRequest(this.f42120a, this.f42121b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16044a mo57702a(Boolean bool) {
            this.f42121b = bool;
            return this;
        }

        /* renamed from: a */
        public C16044a mo57703a(String str) {
            this.f42120a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16044a newBuilder() {
        C16044a aVar = new C16044a();
        aVar.f42120a = this.timezone_id;
        aVar.f42121b = this.use_system_timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SetMobileNormalViewTimezoneRequest");
        StringBuilder sb = new StringBuilder();
        if (this.timezone_id != null) {
            sb.append(", timezone_id=");
            sb.append(this.timezone_id);
        }
        if (this.use_system_timezone != null) {
            sb.append(", use_system_timezone=");
            sb.append(this.use_system_timezone);
        }
        StringBuilder replace = sb.replace(0, 2, "SetMobileNormalViewTimezoneRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetMobileNormalViewTimezoneRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public SetMobileNormalViewTimezoneRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timezone_id = str;
        this.use_system_timezone = bool;
    }
}
