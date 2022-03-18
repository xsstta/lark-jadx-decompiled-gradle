package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class RecordMeetingRequest extends Message<RecordMeetingRequest, C50958a> {
    public static final ProtoAdapter<RecordMeetingRequest> ADAPTER = new C50959b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String meeting_id;
    public final ByteviewUser request_participant;
    public final ByteviewUser requester;
    public final String time_zone;

    public enum Action implements WireEnum {
        UNKNOWN(0),
        START(1),
        STOP(2),
        HOST_ACCEPT(3),
        HOST_REFUSE(4),
        PARTICIPANT_REQUEST_START(5),
        PARTICIPANT_CONSENT_LEAVE(6),
        PARTICIPANT_CONSENT_STAY(7);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return START;
                case 2:
                    return STOP;
                case 3:
                    return HOST_ACCEPT;
                case 4:
                    return HOST_REFUSE;
                case 5:
                    return PARTICIPANT_REQUEST_START;
                case 6:
                    return PARTICIPANT_CONSENT_LEAVE;
                case 7:
                    return PARTICIPANT_CONSENT_STAY;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RecordMeetingRequest$b */
    private static final class C50959b extends ProtoAdapter<RecordMeetingRequest> {
        C50959b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecordMeetingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RecordMeetingRequest recordMeetingRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, recordMeetingRequest.meeting_id) + Action.ADAPTER.encodedSizeWithTag(2, recordMeetingRequest.action);
            int i3 = 0;
            if (recordMeetingRequest.time_zone != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, recordMeetingRequest.time_zone);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (recordMeetingRequest.request_participant != null) {
                i2 = ByteviewUser.ADAPTER.encodedSizeWithTag(4, recordMeetingRequest.request_participant);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (recordMeetingRequest.requester != null) {
                i3 = ByteviewUser.ADAPTER.encodedSizeWithTag(5, recordMeetingRequest.requester);
            }
            return i5 + i3 + recordMeetingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RecordMeetingRequest decode(ProtoReader protoReader) throws IOException {
            C50958a aVar = new C50958a();
            aVar.f126981a = "";
            aVar.f126982b = Action.UNKNOWN;
            aVar.f126983c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126981a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126982b = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f126983c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f126984d = ByteviewUser.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126985e = ByteviewUser.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecordMeetingRequest recordMeetingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recordMeetingRequest.meeting_id);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, recordMeetingRequest.action);
            if (recordMeetingRequest.time_zone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, recordMeetingRequest.time_zone);
            }
            if (recordMeetingRequest.request_participant != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 4, recordMeetingRequest.request_participant);
            }
            if (recordMeetingRequest.requester != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 5, recordMeetingRequest.requester);
            }
            protoWriter.writeBytes(recordMeetingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RecordMeetingRequest$a */
    public static final class C50958a extends Message.Builder<RecordMeetingRequest, C50958a> {

        /* renamed from: a */
        public String f126981a;

        /* renamed from: b */
        public Action f126982b;

        /* renamed from: c */
        public String f126983c;

        /* renamed from: d */
        public ByteviewUser f126984d;

        /* renamed from: e */
        public ByteviewUser f126985e;

        /* renamed from: a */
        public RecordMeetingRequest build() {
            Action action;
            String str = this.f126981a;
            if (str != null && (action = this.f126982b) != null) {
                return new RecordMeetingRequest(str, action, this.f126983c, this.f126984d, this.f126985e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id", this.f126982b, "action");
        }

        /* renamed from: a */
        public C50958a mo175997a(ByteviewUser byteviewUser) {
            this.f126985e = byteviewUser;
            return this;
        }

        /* renamed from: b */
        public C50958a mo176001b(String str) {
            this.f126983c = str;
            return this;
        }

        /* renamed from: a */
        public C50958a mo175998a(Action action) {
            this.f126982b = action;
            return this;
        }

        /* renamed from: a */
        public C50958a mo175999a(String str) {
            this.f126981a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50958a newBuilder() {
        C50958a aVar = new C50958a();
        aVar.f126981a = this.meeting_id;
        aVar.f126982b = this.action;
        aVar.f126983c = this.time_zone;
        aVar.f126984d = this.request_participant;
        aVar.f126985e = this.requester;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RecordMeetingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", action=");
        sb.append(this.action);
        if (this.time_zone != null) {
            sb.append(", time_zone=");
            sb.append(this.time_zone);
        }
        if (this.request_participant != null) {
            sb.append(", request_participant=");
            sb.append(this.request_participant);
        }
        if (this.requester != null) {
            sb.append(", requester=");
            sb.append(this.requester);
        }
        StringBuilder replace = sb.replace(0, 2, "RecordMeetingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RecordMeetingRequest(String str, Action action2, String str2, ByteviewUser byteviewUser, ByteviewUser byteviewUser2) {
        this(str, action2, str2, byteviewUser, byteviewUser2, ByteString.EMPTY);
    }

    public RecordMeetingRequest(String str, Action action2, String str2, ByteviewUser byteviewUser, ByteviewUser byteviewUser2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.action = action2;
        this.time_zone = str2;
        this.request_participant = byteviewUser;
        this.requester = byteviewUser2;
    }
}
