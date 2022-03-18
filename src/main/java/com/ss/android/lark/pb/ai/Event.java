package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Event extends Message<Event, C49457a> {
    public static final ProtoAdapter<Event> ADAPTER = new C49458b();
    private static final long serialVersionUID = 0;
    public final String mapp_link;
    public final String mdescription;
    public final String mdisplay_time;
    public final String mend_time;
    public final String mname;
    public final String mstart_time;
    public final String msubtitle;

    /* renamed from: com.ss.android.lark.pb.ai.Event$b */
    private static final class C49458b extends ProtoAdapter<Event> {
        C49458b() {
            super(FieldEncoding.LENGTH_DELIMITED, Event.class);
        }

        /* renamed from: a */
        public int encodedSize(Event event) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, event.mdisplay_time) + ProtoAdapter.STRING.encodedSizeWithTag(2, event.mname) + ProtoAdapter.STRING.encodedSizeWithTag(3, event.msubtitle) + ProtoAdapter.STRING.encodedSizeWithTag(4, event.mdescription) + ProtoAdapter.STRING.encodedSizeWithTag(5, event.mapp_link) + ProtoAdapter.STRING.encodedSizeWithTag(6, event.mstart_time) + ProtoAdapter.STRING.encodedSizeWithTag(7, event.mend_time) + event.unknownFields().size();
        }

        /* renamed from: a */
        public Event decode(ProtoReader protoReader) throws IOException {
            C49457a aVar = new C49457a();
            aVar.f124045a = "";
            aVar.f124046b = "";
            aVar.f124047c = "";
            aVar.f124048d = "";
            aVar.f124049e = "";
            aVar.f124050f = "";
            aVar.f124051g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124045a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124046b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124047c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124048d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124049e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124050f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124051g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Event event) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, event.mdisplay_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, event.mname);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, event.msubtitle);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, event.mdescription);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, event.mapp_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, event.mstart_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, event.mend_time);
            protoWriter.writeBytes(event.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49457a newBuilder() {
        C49457a aVar = new C49457a();
        aVar.f124045a = this.mdisplay_time;
        aVar.f124046b = this.mname;
        aVar.f124047c = this.msubtitle;
        aVar.f124048d = this.mdescription;
        aVar.f124049e = this.mapp_link;
        aVar.f124050f = this.mstart_time;
        aVar.f124051g = this.mend_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.Event$a */
    public static final class C49457a extends Message.Builder<Event, C49457a> {

        /* renamed from: a */
        public String f124045a;

        /* renamed from: b */
        public String f124046b;

        /* renamed from: c */
        public String f124047c;

        /* renamed from: d */
        public String f124048d;

        /* renamed from: e */
        public String f124049e;

        /* renamed from: f */
        public String f124050f;

        /* renamed from: g */
        public String f124051g;

        /* renamed from: a */
        public Event build() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7 = this.f124045a;
            if (str7 != null && (str = this.f124046b) != null && (str2 = this.f124047c) != null && (str3 = this.f124048d) != null && (str4 = this.f124049e) != null && (str5 = this.f124050f) != null && (str6 = this.f124051g) != null) {
                return new Event(str7, str, str2, str3, str4, str5, str6, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str7, "mdisplay_time", this.f124046b, "mname", this.f124047c, "msubtitle", this.f124048d, "mdescription", this.f124049e, "mapp_link", this.f124050f, "mstart_time", this.f124051g, "mend_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", display_time=");
        sb.append(this.mdisplay_time);
        sb.append(", name=");
        sb.append(this.mname);
        sb.append(", subtitle=");
        sb.append(this.msubtitle);
        sb.append(", description=");
        sb.append(this.mdescription);
        sb.append(", app_link=");
        sb.append(this.mapp_link);
        sb.append(", start_time=");
        sb.append(this.mstart_time);
        sb.append(", end_time=");
        sb.append(this.mend_time);
        StringBuilder replace = sb.replace(0, 2, "Event{");
        replace.append('}');
        return replace.toString();
    }

    public Event(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, ByteString.EMPTY);
    }

    public Event(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdisplay_time = str;
        this.mname = str2;
        this.msubtitle = str3;
        this.mdescription = str4;
        this.mapp_link = str5;
        this.mstart_time = str6;
        this.mend_time = str7;
    }
}
