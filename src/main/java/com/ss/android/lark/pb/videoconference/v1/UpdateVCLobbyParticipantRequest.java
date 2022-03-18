package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateVCLobbyParticipantRequest extends Message<UpdateVCLobbyParticipantRequest, C51136a> {
    public static final ProtoAdapter<UpdateVCLobbyParticipantRequest> ADAPTER = new C51137b();
    public static final Boolean DEFAULT_IS_CAMERA_MUTED = false;
    public static final Boolean DEFAULT_IS_MICROPHONE_MUTED = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_camera_muted;
    public final Boolean is_microphone_muted;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateVCLobbyParticipantRequest$b */
    private static final class C51137b extends ProtoAdapter<UpdateVCLobbyParticipantRequest> {
        C51137b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateVCLobbyParticipantRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateVCLobbyParticipantRequest updateVCLobbyParticipantRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (updateVCLobbyParticipantRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, updateVCLobbyParticipantRequest.meeting_id);
            } else {
                i = 0;
            }
            if (updateVCLobbyParticipantRequest.is_microphone_muted != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, updateVCLobbyParticipantRequest.is_microphone_muted);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (updateVCLobbyParticipantRequest.is_camera_muted != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, updateVCLobbyParticipantRequest.is_camera_muted);
            }
            return i4 + i3 + updateVCLobbyParticipantRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateVCLobbyParticipantRequest decode(ProtoReader protoReader) throws IOException {
            C51136a aVar = new C51136a();
            aVar.f127251a = "";
            aVar.f127252b = false;
            aVar.f127253c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127251a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127252b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127253c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateVCLobbyParticipantRequest updateVCLobbyParticipantRequest) throws IOException {
            if (updateVCLobbyParticipantRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateVCLobbyParticipantRequest.meeting_id);
            }
            if (updateVCLobbyParticipantRequest.is_microphone_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, updateVCLobbyParticipantRequest.is_microphone_muted);
            }
            if (updateVCLobbyParticipantRequest.is_camera_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, updateVCLobbyParticipantRequest.is_camera_muted);
            }
            protoWriter.writeBytes(updateVCLobbyParticipantRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateVCLobbyParticipantRequest$a */
    public static final class C51136a extends Message.Builder<UpdateVCLobbyParticipantRequest, C51136a> {

        /* renamed from: a */
        public String f127251a;

        /* renamed from: b */
        public Boolean f127252b;

        /* renamed from: c */
        public Boolean f127253c;

        /* renamed from: a */
        public UpdateVCLobbyParticipantRequest build() {
            return new UpdateVCLobbyParticipantRequest(this.f127251a, this.f127252b, this.f127253c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51136a mo176437a(Boolean bool) {
            this.f127252b = bool;
            return this;
        }

        /* renamed from: b */
        public C51136a mo176440b(Boolean bool) {
            this.f127253c = bool;
            return this;
        }

        /* renamed from: a */
        public C51136a mo176438a(String str) {
            this.f127251a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51136a newBuilder() {
        C51136a aVar = new C51136a();
        aVar.f127251a = this.meeting_id;
        aVar.f127252b = this.is_microphone_muted;
        aVar.f127253c = this.is_camera_muted;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateVCLobbyParticipantRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.is_microphone_muted != null) {
            sb.append(", is_microphone_muted=");
            sb.append(this.is_microphone_muted);
        }
        if (this.is_camera_muted != null) {
            sb.append(", is_camera_muted=");
            sb.append(this.is_camera_muted);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateVCLobbyParticipantRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateVCLobbyParticipantRequest(String str, Boolean bool, Boolean bool2) {
        this(str, bool, bool2, ByteString.EMPTY);
    }

    public UpdateVCLobbyParticipantRequest(String str, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.is_microphone_muted = bool;
        this.is_camera_muted = bool2;
    }
}
