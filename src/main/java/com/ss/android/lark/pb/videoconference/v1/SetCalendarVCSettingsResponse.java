package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetCalendarVCSettingsResponse extends Message<SetCalendarVCSettingsResponse, C51018a> {
    public static final ProtoAdapter<SetCalendarVCSettingsResponse> ADAPTER = new C51019b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetCalendarVCSettingsResponse$b */
    private static final class C51019b extends ProtoAdapter<SetCalendarVCSettingsResponse> {
        C51019b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetCalendarVCSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetCalendarVCSettingsResponse setCalendarVCSettingsResponse) {
            return setCalendarVCSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetCalendarVCSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C51018a aVar = new C51018a();
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
        public void encode(ProtoWriter protoWriter, SetCalendarVCSettingsResponse setCalendarVCSettingsResponse) throws IOException {
            protoWriter.writeBytes(setCalendarVCSettingsResponse.unknownFields());
        }
    }

    public SetCalendarVCSettingsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetCalendarVCSettingsResponse$a */
    public static final class C51018a extends Message.Builder<SetCalendarVCSettingsResponse, C51018a> {
        /* renamed from: a */
        public SetCalendarVCSettingsResponse build() {
            return new SetCalendarVCSettingsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51018a newBuilder() {
        C51018a aVar = new C51018a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SetCalendarVCSettingsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetCalendarVCSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetCalendarVCSettingsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
