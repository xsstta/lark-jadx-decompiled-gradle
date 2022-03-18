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

public final class JoinCalendarGroupMeetingRequest extends Message<JoinCalendarGroupMeetingRequest, C50811a> {
    public static final ProtoAdapter<JoinCalendarGroupMeetingRequest> ADAPTER = new C50812b();
    public static final EntrySource DEFAULT_ENTRY_SOURCE = EntrySource.FROM_UNKNOWN;
    public static final Boolean DEFAULT_FORCE = false;
    public static final ParticipantType DEFAULT_PARTI_TYPE = ParticipantType.UNKNOW;
    private static final long serialVersionUID = 0;
    public final EntrySource entry_source;
    public final Boolean force;
    public final ParticipantType parti_type;
    public final ParticipantSettings participant_settings;
    public final String unique_id;

    public enum EntrySource implements WireEnum {
        FROM_UNKNOWN(0),
        FROM_CALENDAR_DETAIL(1),
        FROM_CARD(2),
        FROM_GROUP(3);
        
        public static final ProtoAdapter<EntrySource> ADAPTER = ProtoAdapter.newEnumAdapter(EntrySource.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EntrySource fromValue(int i) {
            if (i == 0) {
                return FROM_UNKNOWN;
            }
            if (i == 1) {
                return FROM_CALENDAR_DETAIL;
            }
            if (i == 2) {
                return FROM_CARD;
            }
            if (i != 3) {
                return null;
            }
            return FROM_GROUP;
        }

        private EntrySource(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinCalendarGroupMeetingRequest$b */
    private static final class C50812b extends ProtoAdapter<JoinCalendarGroupMeetingRequest> {
        C50812b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinCalendarGroupMeetingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinCalendarGroupMeetingRequest joinCalendarGroupMeetingRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, joinCalendarGroupMeetingRequest.unique_id) + ParticipantType.ADAPTER.encodedSizeWithTag(2, joinCalendarGroupMeetingRequest.parti_type) + EntrySource.ADAPTER.encodedSizeWithTag(3, joinCalendarGroupMeetingRequest.entry_source);
            int i2 = 0;
            if (joinCalendarGroupMeetingRequest.force != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, joinCalendarGroupMeetingRequest.force);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (joinCalendarGroupMeetingRequest.participant_settings != null) {
                i2 = ParticipantSettings.ADAPTER.encodedSizeWithTag(5, joinCalendarGroupMeetingRequest.participant_settings);
            }
            return i3 + i2 + joinCalendarGroupMeetingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JoinCalendarGroupMeetingRequest decode(ProtoReader protoReader) throws IOException {
            C50811a aVar = new C50811a();
            aVar.f126671a = "";
            aVar.f126672b = ParticipantType.UNKNOW;
            aVar.f126673c = EntrySource.FROM_UNKNOWN;
            aVar.f126674d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126671a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126672b = ParticipantType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f126673c = EntrySource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f126674d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126675e = ParticipantSettings.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinCalendarGroupMeetingRequest joinCalendarGroupMeetingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, joinCalendarGroupMeetingRequest.unique_id);
            ParticipantType.ADAPTER.encodeWithTag(protoWriter, 2, joinCalendarGroupMeetingRequest.parti_type);
            EntrySource.ADAPTER.encodeWithTag(protoWriter, 3, joinCalendarGroupMeetingRequest.entry_source);
            if (joinCalendarGroupMeetingRequest.force != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, joinCalendarGroupMeetingRequest.force);
            }
            if (joinCalendarGroupMeetingRequest.participant_settings != null) {
                ParticipantSettings.ADAPTER.encodeWithTag(protoWriter, 5, joinCalendarGroupMeetingRequest.participant_settings);
            }
            protoWriter.writeBytes(joinCalendarGroupMeetingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50811a newBuilder() {
        C50811a aVar = new C50811a();
        aVar.f126671a = this.unique_id;
        aVar.f126672b = this.parti_type;
        aVar.f126673c = this.entry_source;
        aVar.f126674d = this.force;
        aVar.f126675e = this.participant_settings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinCalendarGroupMeetingRequest$a */
    public static final class C50811a extends Message.Builder<JoinCalendarGroupMeetingRequest, C50811a> {

        /* renamed from: a */
        public String f126671a;

        /* renamed from: b */
        public ParticipantType f126672b;

        /* renamed from: c */
        public EntrySource f126673c;

        /* renamed from: d */
        public Boolean f126674d;

        /* renamed from: e */
        public ParticipantSettings f126675e;

        /* renamed from: a */
        public JoinCalendarGroupMeetingRequest build() {
            ParticipantType participantType;
            EntrySource entrySource;
            String str = this.f126671a;
            if (str != null && (participantType = this.f126672b) != null && (entrySource = this.f126673c) != null) {
                return new JoinCalendarGroupMeetingRequest(str, participantType, entrySource, this.f126674d, this.f126675e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "unique_id", this.f126672b, "parti_type", this.f126673c, "entry_source");
        }

        /* renamed from: a */
        public C50811a mo175643a(EntrySource entrySource) {
            this.f126673c = entrySource;
            return this;
        }

        /* renamed from: a */
        public C50811a mo175644a(ParticipantSettings participantSettings) {
            this.f126675e = participantSettings;
            return this;
        }

        /* renamed from: a */
        public C50811a mo175645a(ParticipantType participantType) {
            this.f126672b = participantType;
            return this;
        }

        /* renamed from: a */
        public C50811a mo175646a(Boolean bool) {
            this.f126674d = bool;
            return this;
        }

        /* renamed from: a */
        public C50811a mo175647a(String str) {
            this.f126671a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinCalendarGroupMeetingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", unique_id=");
        sb.append(this.unique_id);
        sb.append(", parti_type=");
        sb.append(this.parti_type);
        sb.append(", entry_source=");
        sb.append(this.entry_source);
        if (this.force != null) {
            sb.append(", force=");
            sb.append(this.force);
        }
        if (this.participant_settings != null) {
            sb.append(", participant_settings=");
            sb.append(this.participant_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinCalendarGroupMeetingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public JoinCalendarGroupMeetingRequest(String str, ParticipantType participantType, EntrySource entrySource, Boolean bool, ParticipantSettings participantSettings) {
        this(str, participantType, entrySource, bool, participantSettings, ByteString.EMPTY);
    }

    public JoinCalendarGroupMeetingRequest(String str, ParticipantType participantType, EntrySource entrySource, Boolean bool, ParticipantSettings participantSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unique_id = str;
        this.parti_type = participantType;
        this.entry_source = entrySource;
        this.force = bool;
        this.participant_settings = participantSettings;
    }
}
