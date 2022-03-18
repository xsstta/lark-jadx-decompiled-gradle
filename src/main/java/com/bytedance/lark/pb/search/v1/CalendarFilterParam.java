package com.bytedance.lark.pb.search.v1;

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

public final class CalendarFilterParam extends Message<CalendarFilterParam, C18811a> {
    public static final ProtoAdapter<CalendarFilterParam> ADAPTER = new C18812b();
    public static final Boolean DEFAULT_SEARCH_MEETING_CHAT = false;
    private static final long serialVersionUID = 0;
    public final List<String> remove_chat_ids;
    public final Boolean search_meeting_chat;

    /* renamed from: com.bytedance.lark.pb.search.v1.CalendarFilterParam$b */
    private static final class C18812b extends ProtoAdapter<CalendarFilterParam> {
        C18812b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarFilterParam calendarFilterParam) {
            int i;
            if (calendarFilterParam.search_meeting_chat != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, calendarFilterParam.search_meeting_chat);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, calendarFilterParam.remove_chat_ids) + calendarFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarFilterParam decode(ProtoReader protoReader) throws IOException {
            C18811a aVar = new C18811a();
            aVar.f46377a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46377a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46378b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarFilterParam calendarFilterParam) throws IOException {
            if (calendarFilterParam.search_meeting_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, calendarFilterParam.search_meeting_chat);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, calendarFilterParam.remove_chat_ids);
            protoWriter.writeBytes(calendarFilterParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.CalendarFilterParam$a */
    public static final class C18811a extends Message.Builder<CalendarFilterParam, C18811a> {

        /* renamed from: a */
        public Boolean f46377a;

        /* renamed from: b */
        public List<String> f46378b = Internal.newMutableList();

        /* renamed from: a */
        public CalendarFilterParam build() {
            return new CalendarFilterParam(this.f46377a, this.f46378b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18811a mo64592a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f46378b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18811a newBuilder() {
        C18811a aVar = new C18811a();
        aVar.f46377a = this.search_meeting_chat;
        aVar.f46378b = Internal.copyOf("remove_chat_ids", this.remove_chat_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "CalendarFilterParam");
        StringBuilder sb = new StringBuilder();
        if (this.search_meeting_chat != null) {
            sb.append(", search_meeting_chat=");
            sb.append(this.search_meeting_chat);
        }
        if (!this.remove_chat_ids.isEmpty()) {
            sb.append(", remove_chat_ids=");
            sb.append(this.remove_chat_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarFilterParam{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarFilterParam(Boolean bool, List<String> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public CalendarFilterParam(Boolean bool, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_meeting_chat = bool;
        this.remove_chat_ids = Internal.immutableCopyOf("remove_chat_ids", list);
    }
}
