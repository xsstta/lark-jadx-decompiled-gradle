package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateVCLobbyParticipantResponse extends Message<UpdateVCLobbyParticipantResponse, C51138a> {
    public static final ProtoAdapter<UpdateVCLobbyParticipantResponse> ADAPTER = new C51139b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateVCLobbyParticipantResponse$b */
    private static final class C51139b extends ProtoAdapter<UpdateVCLobbyParticipantResponse> {
        C51139b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateVCLobbyParticipantResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateVCLobbyParticipantResponse updateVCLobbyParticipantResponse) {
            return updateVCLobbyParticipantResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateVCLobbyParticipantResponse decode(ProtoReader protoReader) throws IOException {
            C51138a aVar = new C51138a();
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
        public void encode(ProtoWriter protoWriter, UpdateVCLobbyParticipantResponse updateVCLobbyParticipantResponse) throws IOException {
            protoWriter.writeBytes(updateVCLobbyParticipantResponse.unknownFields());
        }
    }

    public UpdateVCLobbyParticipantResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateVCLobbyParticipantResponse$a */
    public static final class C51138a extends Message.Builder<UpdateVCLobbyParticipantResponse, C51138a> {
        /* renamed from: a */
        public UpdateVCLobbyParticipantResponse build() {
            return new UpdateVCLobbyParticipantResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51138a newBuilder() {
        C51138a aVar = new C51138a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateVCLobbyParticipantResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateVCLobbyParticipantResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateVCLobbyParticipantResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
