package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ParticipantChangeSettingsResponse extends Message<ParticipantChangeSettingsResponse, C50908a> {
    public static final ProtoAdapter<ParticipantChangeSettingsResponse> ADAPTER = new C50909b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ParticipantChangeSettingsResponse$b */
    private static final class C50909b extends ProtoAdapter<ParticipantChangeSettingsResponse> {
        C50909b() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantChangeSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ParticipantChangeSettingsResponse participantChangeSettingsResponse) {
            return participantChangeSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ParticipantChangeSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C50908a aVar = new C50908a();
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
        public void encode(ProtoWriter protoWriter, ParticipantChangeSettingsResponse participantChangeSettingsResponse) throws IOException {
            protoWriter.writeBytes(participantChangeSettingsResponse.unknownFields());
        }
    }

    public ParticipantChangeSettingsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ParticipantChangeSettingsResponse$a */
    public static final class C50908a extends Message.Builder<ParticipantChangeSettingsResponse, C50908a> {
        /* renamed from: a */
        public ParticipantChangeSettingsResponse build() {
            return new ParticipantChangeSettingsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50908a newBuilder() {
        C50908a aVar = new C50908a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ParticipantChangeSettingsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ParticipantChangeSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ParticipantChangeSettingsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
