package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CalendarFilterParam extends Message<CalendarFilterParam, C50006a> {
    public static final ProtoAdapter<CalendarFilterParam> ADAPTER = new C50007b();
    public static final Boolean DEFAULT_SEARCH_MEETING_CHAT = false;
    private static final long serialVersionUID = 0;
    public final List<String> mremove_chat_ids;
    public final Boolean msearch_meeting_chat;

    /* renamed from: com.ss.android.lark.pb.searches.CalendarFilterParam$b */
    private static final class C50007b extends ProtoAdapter<CalendarFilterParam> {
        C50007b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarFilterParam calendarFilterParam) {
            int i;
            if (calendarFilterParam.msearch_meeting_chat != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, calendarFilterParam.msearch_meeting_chat);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, calendarFilterParam.mremove_chat_ids) + calendarFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarFilterParam decode(ProtoReader protoReader) throws IOException {
            C50006a aVar = new C50006a();
            aVar.f125057a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125057a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125058b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarFilterParam calendarFilterParam) throws IOException {
            if (calendarFilterParam.msearch_meeting_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, calendarFilterParam.msearch_meeting_chat);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, calendarFilterParam.mremove_chat_ids);
            protoWriter.writeBytes(calendarFilterParam.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.CalendarFilterParam$a */
    public static final class C50006a extends Message.Builder<CalendarFilterParam, C50006a> {

        /* renamed from: a */
        public Boolean f125057a;

        /* renamed from: b */
        public List<String> f125058b = Internal.newMutableList();

        /* renamed from: a */
        public CalendarFilterParam build() {
            return new CalendarFilterParam(this.f125057a, this.f125058b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50006a newBuilder() {
        C50006a aVar = new C50006a();
        aVar.f125057a = this.msearch_meeting_chat;
        aVar.f125058b = Internal.copyOf("mremove_chat_ids", this.mremove_chat_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msearch_meeting_chat != null) {
            sb.append(", search_meeting_chat=");
            sb.append(this.msearch_meeting_chat);
        }
        if (!this.mremove_chat_ids.isEmpty()) {
            sb.append(", remove_chat_ids=");
            sb.append(this.mremove_chat_ids);
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
        this.msearch_meeting_chat = bool;
        this.mremove_chat_ids = Internal.immutableCopyOf("mremove_chat_ids", list);
    }
}
