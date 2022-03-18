package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GeneralCalendarContent extends Message<GeneralCalendarContent, C14953a> {
    public static final ProtoAdapter<GeneralCalendarContent> ADAPTER = new C14954b();
    public static final Type DEFAULT_CALENDAR_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Type calendar_type;
    public final EventCardTemplate event_card;
    public final Map<String, Chatter> message_chatters;
    public final RSVPCommentCardInfo rsvp_comment_card_info;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        TRANSFER_CALENDAR_EVENT(1),
        RSVP_COMMENT(2),
        SWITCH_CALENDAR(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TRANSFER_CALENDAR_EVENT;
            }
            if (i == 2) {
                return RSVP_COMMENT;
            }
            if (i != 3) {
                return null;
            }
            return SWITCH_CALENDAR;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GeneralCalendarContent$a */
    public static final class C14953a extends Message.Builder<GeneralCalendarContent, C14953a> {

        /* renamed from: a */
        public Type f39605a;

        /* renamed from: b */
        public EventCardTemplate f39606b;

        /* renamed from: c */
        public Map<String, Chatter> f39607c = Internal.newMutableMap();

        /* renamed from: d */
        public RSVPCommentCardInfo f39608d;

        /* renamed from: a */
        public GeneralCalendarContent build() {
            return new GeneralCalendarContent(this.f39605a, this.f39606b, this.f39607c, this.f39608d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14953a mo54711a(RSVPCommentCardInfo rSVPCommentCardInfo) {
            this.f39608d = rSVPCommentCardInfo;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GeneralCalendarContent$b */
    private static final class C14954b extends ProtoAdapter<GeneralCalendarContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Chatter>> f39609a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chatter.ADAPTER);

        C14954b() {
            super(FieldEncoding.LENGTH_DELIMITED, GeneralCalendarContent.class);
        }

        /* renamed from: a */
        public int encodedSize(GeneralCalendarContent generalCalendarContent) {
            int i;
            int i2;
            int i3 = 0;
            if (generalCalendarContent.calendar_type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, generalCalendarContent.calendar_type);
            } else {
                i = 0;
            }
            if (generalCalendarContent.event_card != null) {
                i2 = EventCardTemplate.ADAPTER.encodedSizeWithTag(2, generalCalendarContent.event_card);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + this.f39609a.encodedSizeWithTag(3, generalCalendarContent.message_chatters);
            if (generalCalendarContent.rsvp_comment_card_info != null) {
                i3 = RSVPCommentCardInfo.ADAPTER.encodedSizeWithTag(101, generalCalendarContent.rsvp_comment_card_info);
            }
            return encodedSizeWithTag + i3 + generalCalendarContent.unknownFields().size();
        }

        /* renamed from: a */
        public GeneralCalendarContent decode(ProtoReader protoReader) throws IOException {
            C14953a aVar = new C14953a();
            aVar.f39605a = Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f39605a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f39606b = EventCardTemplate.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f39607c.putAll(this.f39609a.decode(protoReader));
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo54711a(RSVPCommentCardInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GeneralCalendarContent generalCalendarContent) throws IOException {
            if (generalCalendarContent.calendar_type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, generalCalendarContent.calendar_type);
            }
            if (generalCalendarContent.event_card != null) {
                EventCardTemplate.ADAPTER.encodeWithTag(protoWriter, 2, generalCalendarContent.event_card);
            }
            this.f39609a.encodeWithTag(protoWriter, 3, generalCalendarContent.message_chatters);
            if (generalCalendarContent.rsvp_comment_card_info != null) {
                RSVPCommentCardInfo.ADAPTER.encodeWithTag(protoWriter, 101, generalCalendarContent.rsvp_comment_card_info);
            }
            protoWriter.writeBytes(generalCalendarContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14953a newBuilder() {
        C14953a aVar = new C14953a();
        aVar.f39605a = this.calendar_type;
        aVar.f39606b = this.event_card;
        aVar.f39607c = Internal.copyOf("message_chatters", this.message_chatters);
        aVar.f39608d = this.rsvp_comment_card_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GeneralCalendarContent");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_type != null) {
            sb.append(", calendar_type=");
            sb.append(this.calendar_type);
        }
        if (this.event_card != null) {
            sb.append(", event_card=");
            sb.append(this.event_card);
        }
        if (!this.message_chatters.isEmpty()) {
            sb.append(", message_chatters=");
            sb.append(this.message_chatters);
        }
        if (this.rsvp_comment_card_info != null) {
            sb.append(", rsvp_comment_card_info=");
            sb.append(this.rsvp_comment_card_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GeneralCalendarContent{");
        replace.append('}');
        return replace.toString();
    }

    public GeneralCalendarContent(Type type, EventCardTemplate eventCardTemplate, Map<String, Chatter> map, RSVPCommentCardInfo rSVPCommentCardInfo) {
        this(type, eventCardTemplate, map, rSVPCommentCardInfo, ByteString.EMPTY);
    }

    public GeneralCalendarContent(Type type, EventCardTemplate eventCardTemplate, Map<String, Chatter> map, RSVPCommentCardInfo rSVPCommentCardInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_type = type;
        this.event_card = eventCardTemplate;
        this.message_chatters = Internal.immutableCopyOf("message_chatters", map);
        this.rsvp_comment_card_info = rSVPCommentCardInfo;
    }
}
