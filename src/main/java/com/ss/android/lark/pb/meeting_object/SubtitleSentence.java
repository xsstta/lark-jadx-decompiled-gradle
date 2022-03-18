package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SubtitleSentence extends Message<SubtitleSentence, C49872a> {
    public static final ProtoAdapter<SubtitleSentence> ADAPTER = new C49873b();
    private static final long serialVersionUID = 0;
    public final List<SubtitleWord> mcontents;
    public final List<HighlightItemInSubtitle> mhighlight;
    public final String mlanguage;
    public final String msid;
    public final String mstart_time;
    public final String mstop_time;

    /* renamed from: com.ss.android.lark.pb.meeting_object.SubtitleSentence$b */
    private static final class C49873b extends ProtoAdapter<SubtitleSentence> {
        C49873b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubtitleSentence.class);
        }

        /* renamed from: a */
        public int encodedSize(SubtitleSentence subtitleSentence) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, subtitleSentence.msid) + ProtoAdapter.STRING.encodedSizeWithTag(2, subtitleSentence.mlanguage) + ProtoAdapter.STRING.encodedSizeWithTag(3, subtitleSentence.mstart_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, subtitleSentence.mstop_time) + SubtitleWord.ADAPTER.asRepeated().encodedSizeWithTag(5, subtitleSentence.mcontents) + HighlightItemInSubtitle.ADAPTER.asRepeated().encodedSizeWithTag(6, subtitleSentence.mhighlight) + subtitleSentence.unknownFields().size();
        }

        /* renamed from: a */
        public SubtitleSentence decode(ProtoReader protoReader) throws IOException {
            C49872a aVar = new C49872a();
            aVar.f124872a = "";
            aVar.f124873b = "";
            aVar.f124874c = "";
            aVar.f124875d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124872a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124873b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124874c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124875d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124876e.add(SubtitleWord.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f124877f.add(HighlightItemInSubtitle.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SubtitleSentence subtitleSentence) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subtitleSentence.msid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subtitleSentence.mlanguage);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, subtitleSentence.mstart_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, subtitleSentence.mstop_time);
            SubtitleWord.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, subtitleSentence.mcontents);
            HighlightItemInSubtitle.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, subtitleSentence.mhighlight);
            protoWriter.writeBytes(subtitleSentence.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49872a newBuilder() {
        C49872a aVar = new C49872a();
        aVar.f124872a = this.msid;
        aVar.f124873b = this.mlanguage;
        aVar.f124874c = this.mstart_time;
        aVar.f124875d = this.mstop_time;
        aVar.f124876e = Internal.copyOf("mcontents", this.mcontents);
        aVar.f124877f = Internal.copyOf("mhighlight", this.mhighlight);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.SubtitleSentence$a */
    public static final class C49872a extends Message.Builder<SubtitleSentence, C49872a> {

        /* renamed from: a */
        public String f124872a;

        /* renamed from: b */
        public String f124873b;

        /* renamed from: c */
        public String f124874c;

        /* renamed from: d */
        public String f124875d;

        /* renamed from: e */
        public List<SubtitleWord> f124876e = Internal.newMutableList();

        /* renamed from: f */
        public List<HighlightItemInSubtitle> f124877f = Internal.newMutableList();

        /* renamed from: a */
        public SubtitleSentence build() {
            String str;
            String str2;
            String str3;
            String str4 = this.f124872a;
            if (str4 != null && (str = this.f124873b) != null && (str2 = this.f124874c) != null && (str3 = this.f124875d) != null) {
                return new SubtitleSentence(str4, str, str2, str3, this.f124876e, this.f124877f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "msid", this.f124873b, "mlanguage", this.f124874c, "mstart_time", this.f124875d, "mstop_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", sid=");
        sb.append(this.msid);
        sb.append(", language=");
        sb.append(this.mlanguage);
        sb.append(", start_time=");
        sb.append(this.mstart_time);
        sb.append(", stop_time=");
        sb.append(this.mstop_time);
        if (!this.mcontents.isEmpty()) {
            sb.append(", contents=");
            sb.append(this.mcontents);
        }
        if (!this.mhighlight.isEmpty()) {
            sb.append(", highlight=");
            sb.append(this.mhighlight);
        }
        StringBuilder replace = sb.replace(0, 2, "SubtitleSentence{");
        replace.append('}');
        return replace.toString();
    }

    public SubtitleSentence(String str, String str2, String str3, String str4, List<SubtitleWord> list, List<HighlightItemInSubtitle> list2) {
        this(str, str2, str3, str4, list, list2, ByteString.EMPTY);
    }

    public SubtitleSentence(String str, String str2, String str3, String str4, List<SubtitleWord> list, List<HighlightItemInSubtitle> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msid = str;
        this.mlanguage = str2;
        this.mstart_time = str3;
        this.mstop_time = str4;
        this.mcontents = Internal.immutableCopyOf("mcontents", list);
        this.mhighlight = Internal.immutableCopyOf("mhighlight", list2);
    }
}
