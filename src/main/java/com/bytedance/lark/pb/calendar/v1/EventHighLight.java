package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class EventHighLight extends Message<EventHighLight, C15612a> {
    public static final ProtoAdapter<EventHighLight> ADAPTER = new C15613b();
    public static final Tag DEFAULT_TAG = Tag.UNKNOWN_EVENT_HIGHLIGHT_TAG;
    private static final long serialVersionUID = 0;
    public final List<String> highlights;
    public final Tag tag;

    public enum Tag implements WireEnum {
        UNKNOWN_EVENT_HIGHLIGHT_TAG(0),
        SUMMARY(1),
        DESCRIPTION(2),
        LOCATION(3),
        ATTENDEE(4),
        MEETING_ROOM(5),
        CHAT(6);
        
        public static final ProtoAdapter<Tag> ADAPTER = ProtoAdapter.newEnumAdapter(Tag.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Tag fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_EVENT_HIGHLIGHT_TAG;
                case 1:
                    return SUMMARY;
                case 2:
                    return DESCRIPTION;
                case 3:
                    return LOCATION;
                case 4:
                    return ATTENDEE;
                case 5:
                    return MEETING_ROOM;
                case 6:
                    return CHAT;
                default:
                    return null;
            }
        }

        private Tag(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventHighLight$b */
    private static final class C15613b extends ProtoAdapter<EventHighLight> {
        C15613b() {
            super(FieldEncoding.LENGTH_DELIMITED, EventHighLight.class);
        }

        /* renamed from: a */
        public int encodedSize(EventHighLight eventHighLight) {
            return Tag.ADAPTER.encodedSizeWithTag(1, eventHighLight.tag) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, eventHighLight.highlights) + eventHighLight.unknownFields().size();
        }

        /* renamed from: a */
        public EventHighLight decode(ProtoReader protoReader) throws IOException {
            C15612a aVar = new C15612a();
            aVar.f41357a = Tag.UNKNOWN_EVENT_HIGHLIGHT_TAG;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f41357a = Tag.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41358b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EventHighLight eventHighLight) throws IOException {
            Tag.ADAPTER.encodeWithTag(protoWriter, 1, eventHighLight.tag);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, eventHighLight.highlights);
            protoWriter.writeBytes(eventHighLight.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventHighLight$a */
    public static final class C15612a extends Message.Builder<EventHighLight, C15612a> {

        /* renamed from: a */
        public Tag f41357a;

        /* renamed from: b */
        public List<String> f41358b = Internal.newMutableList();

        /* renamed from: a */
        public EventHighLight build() {
            Tag tag = this.f41357a;
            if (tag != null) {
                return new EventHighLight(tag, this.f41358b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(tag, "tag");
        }
    }

    @Override // com.squareup.wire.Message
    public C15612a newBuilder() {
        C15612a aVar = new C15612a();
        aVar.f41357a = this.tag;
        aVar.f41358b = Internal.copyOf("highlights", this.highlights);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "EventHighLight");
        StringBuilder sb = new StringBuilder();
        sb.append(", tag=");
        sb.append(this.tag);
        if (!this.highlights.isEmpty()) {
            sb.append(", highlights=");
            sb.append(this.highlights);
        }
        StringBuilder replace = sb.replace(0, 2, "EventHighLight{");
        replace.append('}');
        return replace.toString();
    }

    public EventHighLight(Tag tag2, List<String> list) {
        this(tag2, list, ByteString.EMPTY);
    }

    public EventHighLight(Tag tag2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tag = tag2;
        this.highlights = Internal.immutableCopyOf("highlights", list);
    }
}
