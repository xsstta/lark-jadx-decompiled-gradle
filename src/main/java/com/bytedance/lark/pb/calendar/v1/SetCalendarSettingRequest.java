package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetCalendarSettingRequest extends Message<SetCalendarSettingRequest, C16036a> {
    public static final ProtoAdapter<SetCalendarSettingRequest> ADAPTER = new C16037b();
    private static final long serialVersionUID = 0;
    public final String local_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetCalendarSettingRequest$b */
    private static final class C16037b extends ProtoAdapter<SetCalendarSettingRequest> {
        C16037b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetCalendarSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetCalendarSettingRequest setCalendarSettingRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setCalendarSettingRequest.local_timezone) + setCalendarSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetCalendarSettingRequest decode(ProtoReader protoReader) throws IOException {
            C16036a aVar = new C16036a();
            aVar.f42114a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42114a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetCalendarSettingRequest setCalendarSettingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setCalendarSettingRequest.local_timezone);
            protoWriter.writeBytes(setCalendarSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetCalendarSettingRequest$a */
    public static final class C16036a extends Message.Builder<SetCalendarSettingRequest, C16036a> {

        /* renamed from: a */
        public String f42114a;

        /* renamed from: a */
        public SetCalendarSettingRequest build() {
            String str = this.f42114a;
            if (str != null) {
                return new SetCalendarSettingRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "local_timezone");
        }
    }

    @Override // com.squareup.wire.Message
    public C16036a newBuilder() {
        C16036a aVar = new C16036a();
        aVar.f42114a = this.local_timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SetCalendarSettingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", local_timezone=");
        sb.append(this.local_timezone);
        StringBuilder replace = sb.replace(0, 2, "SetCalendarSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetCalendarSettingRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetCalendarSettingRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_timezone = str;
    }
}
