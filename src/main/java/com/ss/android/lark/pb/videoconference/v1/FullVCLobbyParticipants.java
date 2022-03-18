package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class FullVCLobbyParticipants extends Message<FullVCLobbyParticipants, C50591a> {
    public static final ProtoAdapter<FullVCLobbyParticipants> ADAPTER = new C50592b();
    private static final long serialVersionUID = 0;
    public final List<VCLobbyParticipant> lobby_participants;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FullVCLobbyParticipants$b */
    private static final class C50592b extends ProtoAdapter<FullVCLobbyParticipants> {
        C50592b() {
            super(FieldEncoding.LENGTH_DELIMITED, FullVCLobbyParticipants.class);
        }

        /* renamed from: a */
        public int encodedSize(FullVCLobbyParticipants fullVCLobbyParticipants) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fullVCLobbyParticipants.meeting_id) + VCLobbyParticipant.ADAPTER.asRepeated().encodedSizeWithTag(2, fullVCLobbyParticipants.lobby_participants) + fullVCLobbyParticipants.unknownFields().size();
        }

        /* renamed from: a */
        public FullVCLobbyParticipants decode(ProtoReader protoReader) throws IOException {
            C50591a aVar = new C50591a();
            aVar.f126289a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126289a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126290b.add(VCLobbyParticipant.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FullVCLobbyParticipants fullVCLobbyParticipants) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fullVCLobbyParticipants.meeting_id);
            VCLobbyParticipant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, fullVCLobbyParticipants.lobby_participants);
            protoWriter.writeBytes(fullVCLobbyParticipants.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FullVCLobbyParticipants$a */
    public static final class C50591a extends Message.Builder<FullVCLobbyParticipants, C50591a> {

        /* renamed from: a */
        public String f126289a;

        /* renamed from: b */
        public List<VCLobbyParticipant> f126290b = Internal.newMutableList();

        /* renamed from: a */
        public FullVCLobbyParticipants build() {
            String str = this.f126289a;
            if (str != null) {
                return new FullVCLobbyParticipants(str, this.f126290b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50591a newBuilder() {
        C50591a aVar = new C50591a();
        aVar.f126289a = this.meeting_id;
        aVar.f126290b = Internal.copyOf("lobby_participants", this.lobby_participants);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FullVCLobbyParticipants");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (!this.lobby_participants.isEmpty()) {
            sb.append(", lobby_participants=");
            sb.append(this.lobby_participants);
        }
        StringBuilder replace = sb.replace(0, 2, "FullVCLobbyParticipants{");
        replace.append('}');
        return replace.toString();
    }

    public FullVCLobbyParticipants(String str, List<VCLobbyParticipant> list) {
        this(str, list, ByteString.EMPTY);
    }

    public FullVCLobbyParticipants(String str, List<VCLobbyParticipant> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.lobby_participants = Internal.immutableCopyOf("lobby_participants", list);
    }
}
