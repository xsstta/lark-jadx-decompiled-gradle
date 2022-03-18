package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushMeetingMinuteEditors extends Message<PushMeetingMinuteEditors, C15958a> {
    public static final ProtoAdapter<PushMeetingMinuteEditors> ADAPTER = new C15959b();
    public static final Long DEFAULT_EXPIRE_TIME = 10L;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<Chatter> chatters;
    public final Long expire_time;
    public final String meeting_minute_url;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushMeetingMinuteEditors$b */
    private static final class C15959b extends ProtoAdapter<PushMeetingMinuteEditors> {
        C15959b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMeetingMinuteEditors.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMeetingMinuteEditors pushMeetingMinuteEditors) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushMeetingMinuteEditors.meeting_minute_url) + Chatter.ADAPTER.asRepeated().encodedSizeWithTag(2, pushMeetingMinuteEditors.chatters) + ProtoAdapter.STRING.encodedSizeWithTag(3, pushMeetingMinuteEditors.chat_id);
            if (pushMeetingMinuteEditors.expire_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(4, pushMeetingMinuteEditors.expire_time);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushMeetingMinuteEditors.unknownFields().size();
        }

        /* renamed from: a */
        public PushMeetingMinuteEditors decode(ProtoReader protoReader) throws IOException {
            C15958a aVar = new C15958a();
            aVar.f41956a = "";
            aVar.f41958c = "";
            aVar.f41959d = 10L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41956a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41957b.add(Chatter.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f41958c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41959d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMeetingMinuteEditors pushMeetingMinuteEditors) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushMeetingMinuteEditors.meeting_minute_url);
            Chatter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushMeetingMinuteEditors.chatters);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushMeetingMinuteEditors.chat_id);
            if (pushMeetingMinuteEditors.expire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, pushMeetingMinuteEditors.expire_time);
            }
            protoWriter.writeBytes(pushMeetingMinuteEditors.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushMeetingMinuteEditors$a */
    public static final class C15958a extends Message.Builder<PushMeetingMinuteEditors, C15958a> {

        /* renamed from: a */
        public String f41956a;

        /* renamed from: b */
        public List<Chatter> f41957b = Internal.newMutableList();

        /* renamed from: c */
        public String f41958c;

        /* renamed from: d */
        public Long f41959d;

        /* renamed from: a */
        public PushMeetingMinuteEditors build() {
            String str;
            String str2 = this.f41956a;
            if (str2 != null && (str = this.f41958c) != null) {
                return new PushMeetingMinuteEditors(str2, this.f41957b, str, this.f41959d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "meeting_minute_url", this.f41958c, "chat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15958a newBuilder() {
        C15958a aVar = new C15958a();
        aVar.f41956a = this.meeting_minute_url;
        aVar.f41957b = Internal.copyOf("chatters", this.chatters);
        aVar.f41958c = this.chat_id;
        aVar.f41959d = this.expire_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushMeetingMinuteEditors");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_minute_url=");
        sb.append(this.meeting_minute_url);
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.expire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.expire_time);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMeetingMinuteEditors{");
        replace.append('}');
        return replace.toString();
    }

    public PushMeetingMinuteEditors(String str, List<Chatter> list, String str2, Long l) {
        this(str, list, str2, l, ByteString.EMPTY);
    }

    public PushMeetingMinuteEditors(String str, List<Chatter> list, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_minute_url = str;
        this.chatters = Internal.immutableCopyOf("chatters", list);
        this.chat_id = str2;
        this.expire_time = l;
    }
}
