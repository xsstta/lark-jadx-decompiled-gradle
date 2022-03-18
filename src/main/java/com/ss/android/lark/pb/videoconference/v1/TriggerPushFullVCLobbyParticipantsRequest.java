package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TriggerPushFullVCLobbyParticipantsRequest extends Message<TriggerPushFullVCLobbyParticipantsRequest, C51122a> {
    public static final ProtoAdapter<TriggerPushFullVCLobbyParticipantsRequest> ADAPTER = new C51123b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.TriggerPushFullVCLobbyParticipantsRequest$b */
    private static final class C51123b extends ProtoAdapter<TriggerPushFullVCLobbyParticipantsRequest> {
        C51123b() {
            super(FieldEncoding.LENGTH_DELIMITED, TriggerPushFullVCLobbyParticipantsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TriggerPushFullVCLobbyParticipantsRequest triggerPushFullVCLobbyParticipantsRequest) {
            return triggerPushFullVCLobbyParticipantsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TriggerPushFullVCLobbyParticipantsRequest decode(ProtoReader protoReader) throws IOException {
            C51122a aVar = new C51122a();
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
        public void encode(ProtoWriter protoWriter, TriggerPushFullVCLobbyParticipantsRequest triggerPushFullVCLobbyParticipantsRequest) throws IOException {
            protoWriter.writeBytes(triggerPushFullVCLobbyParticipantsRequest.unknownFields());
        }
    }

    public TriggerPushFullVCLobbyParticipantsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.TriggerPushFullVCLobbyParticipantsRequest$a */
    public static final class C51122a extends Message.Builder<TriggerPushFullVCLobbyParticipantsRequest, C51122a> {
        /* renamed from: a */
        public TriggerPushFullVCLobbyParticipantsRequest build() {
            return new TriggerPushFullVCLobbyParticipantsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51122a newBuilder() {
        C51122a aVar = new C51122a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "TriggerPushFullVCLobbyParticipantsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "TriggerPushFullVCLobbyParticipantsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TriggerPushFullVCLobbyParticipantsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
