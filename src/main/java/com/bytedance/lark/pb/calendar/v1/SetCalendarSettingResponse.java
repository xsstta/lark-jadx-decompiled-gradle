package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetCalendarSettingResponse extends Message<SetCalendarSettingResponse, C16038a> {
    public static final ProtoAdapter<SetCalendarSettingResponse> ADAPTER = new C16039b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetCalendarSettingResponse$b */
    private static final class C16039b extends ProtoAdapter<SetCalendarSettingResponse> {
        C16039b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetCalendarSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetCalendarSettingResponse setCalendarSettingResponse) {
            return setCalendarSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetCalendarSettingResponse decode(ProtoReader protoReader) throws IOException {
            C16038a aVar = new C16038a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetCalendarSettingResponse setCalendarSettingResponse) throws IOException {
            protoWriter.writeBytes(setCalendarSettingResponse.unknownFields());
        }
    }

    public SetCalendarSettingResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetCalendarSettingResponse$a */
    public static final class C16038a extends Message.Builder<SetCalendarSettingResponse, C16038a> {
        /* renamed from: a */
        public SetCalendarSettingResponse build() {
            return new SetCalendarSettingResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16038a newBuilder() {
        C16038a aVar = new C16038a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SetCalendarSettingResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetCalendarSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetCalendarSettingResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
