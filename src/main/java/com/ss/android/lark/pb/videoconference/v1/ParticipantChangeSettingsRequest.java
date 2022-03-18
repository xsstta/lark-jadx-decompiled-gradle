package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ParticipantChangeSettingsRequest extends Message<ParticipantChangeSettingsRequest, C50906a> {
    public static final ProtoAdapter<ParticipantChangeSettingsRequest> ADAPTER = new C50907b();
    public static final Boolean DEFAULT_EARLY_PUSH = true;
    public static final Boolean DEFAULT_REQUESTED_BY_HOST = false;
    private static final long serialVersionUID = 0;
    public final String breakout_room_id;
    public final Boolean early_push;
    public final String meeting_id;
    public final ParticipantSettings participant_settings;
    public final Boolean requested_by_host;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ParticipantChangeSettingsRequest$b */
    private static final class C50907b extends ProtoAdapter<ParticipantChangeSettingsRequest> {
        C50907b() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantChangeSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ParticipantChangeSettingsRequest participantChangeSettingsRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, participantChangeSettingsRequest.meeting_id) + ParticipantSettings.ADAPTER.encodedSizeWithTag(2, participantChangeSettingsRequest.participant_settings);
            int i3 = 0;
            if (participantChangeSettingsRequest.requested_by_host != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(3, participantChangeSettingsRequest.requested_by_host);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (participantChangeSettingsRequest.breakout_room_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, participantChangeSettingsRequest.breakout_room_id);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (participantChangeSettingsRequest.early_push != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(99, participantChangeSettingsRequest.early_push);
            }
            return i5 + i3 + participantChangeSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ParticipantChangeSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C50906a aVar = new C50906a();
            aVar.f126883a = "";
            aVar.f126885c = false;
            aVar.f126886d = "";
            aVar.f126887e = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126883a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126884b = ParticipantSettings.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126885c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f126886d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 99) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126887e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ParticipantChangeSettingsRequest participantChangeSettingsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, participantChangeSettingsRequest.meeting_id);
            ParticipantSettings.ADAPTER.encodeWithTag(protoWriter, 2, participantChangeSettingsRequest.participant_settings);
            if (participantChangeSettingsRequest.requested_by_host != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, participantChangeSettingsRequest.requested_by_host);
            }
            if (participantChangeSettingsRequest.breakout_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, participantChangeSettingsRequest.breakout_room_id);
            }
            if (participantChangeSettingsRequest.early_push != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 99, participantChangeSettingsRequest.early_push);
            }
            protoWriter.writeBytes(participantChangeSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ParticipantChangeSettingsRequest$a */
    public static final class C50906a extends Message.Builder<ParticipantChangeSettingsRequest, C50906a> {

        /* renamed from: a */
        public String f126883a;

        /* renamed from: b */
        public ParticipantSettings f126884b;

        /* renamed from: c */
        public Boolean f126885c;

        /* renamed from: d */
        public String f126886d;

        /* renamed from: e */
        public Boolean f126887e;

        /* renamed from: a */
        public ParticipantChangeSettingsRequest build() {
            ParticipantSettings participantSettings;
            String str = this.f126883a;
            if (str != null && (participantSettings = this.f126884b) != null) {
                return new ParticipantChangeSettingsRequest(str, participantSettings, this.f126885c, this.f126886d, this.f126887e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id", this.f126884b, "participant_settings");
        }

        /* renamed from: a */
        public C50906a mo175859a(ParticipantSettings participantSettings) {
            this.f126884b = participantSettings;
            return this;
        }

        /* renamed from: b */
        public C50906a mo175863b(String str) {
            this.f126886d = str;
            return this;
        }

        /* renamed from: a */
        public C50906a mo175860a(Boolean bool) {
            this.f126885c = bool;
            return this;
        }

        /* renamed from: a */
        public C50906a mo175861a(String str) {
            this.f126883a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50906a newBuilder() {
        C50906a aVar = new C50906a();
        aVar.f126883a = this.meeting_id;
        aVar.f126884b = this.participant_settings;
        aVar.f126885c = this.requested_by_host;
        aVar.f126886d = this.breakout_room_id;
        aVar.f126887e = this.early_push;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ParticipantChangeSettingsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", participant_settings=");
        sb.append(this.participant_settings);
        if (this.requested_by_host != null) {
            sb.append(", requested_by_host=");
            sb.append(this.requested_by_host);
        }
        if (this.breakout_room_id != null) {
            sb.append(", breakout_room_id=");
            sb.append(this.breakout_room_id);
        }
        if (this.early_push != null) {
            sb.append(", early_push=");
            sb.append(this.early_push);
        }
        StringBuilder replace = sb.replace(0, 2, "ParticipantChangeSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ParticipantChangeSettingsRequest(String str, ParticipantSettings participantSettings, Boolean bool, String str2, Boolean bool2) {
        this(str, participantSettings, bool, str2, bool2, ByteString.EMPTY);
    }

    public ParticipantChangeSettingsRequest(String str, ParticipantSettings participantSettings, Boolean bool, String str2, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.participant_settings = participantSettings;
        this.requested_by_host = bool;
        this.breakout_room_id = str2;
        this.early_push = bool2;
    }
}
