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

public final class SubtitleParagraph extends Message<SubtitleParagraph, C49870a> {
    public static final ProtoAdapter<SubtitleParagraph> ADAPTER = new C49871b();
    public static final Integer DEFAULT_PARAGRAPH_TYPE = 0;
    private static final long serialVersionUID = 0;
    public final Integer mparagraph_type;
    public final String mpid;
    public final List<SubtitleSentence> msentences;
    public final Participant mspeaker;
    public final String mstart_time;
    public final String mstop_time;

    /* renamed from: com.ss.android.lark.pb.meeting_object.SubtitleParagraph$b */
    private static final class C49871b extends ProtoAdapter<SubtitleParagraph> {
        C49871b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubtitleParagraph.class);
        }

        /* renamed from: a */
        public int encodedSize(SubtitleParagraph subtitleParagraph) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, subtitleParagraph.mpid) + ProtoAdapter.STRING.encodedSizeWithTag(2, subtitleParagraph.mstart_time) + ProtoAdapter.STRING.encodedSizeWithTag(3, subtitleParagraph.mstop_time) + ProtoAdapter.INT32.encodedSizeWithTag(4, subtitleParagraph.mparagraph_type);
            if (subtitleParagraph.mspeaker != null) {
                i = Participant.ADAPTER.encodedSizeWithTag(5, subtitleParagraph.mspeaker);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + SubtitleSentence.ADAPTER.asRepeated().encodedSizeWithTag(6, subtitleParagraph.msentences) + subtitleParagraph.unknownFields().size();
        }

        /* renamed from: a */
        public SubtitleParagraph decode(ProtoReader protoReader) throws IOException {
            C49870a aVar = new C49870a();
            aVar.f124866a = "";
            aVar.f124867b = "";
            aVar.f124868c = "";
            aVar.f124869d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124866a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124867b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124868c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124869d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124870e = Participant.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124871f.add(SubtitleSentence.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SubtitleParagraph subtitleParagraph) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subtitleParagraph.mpid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subtitleParagraph.mstart_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, subtitleParagraph.mstop_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, subtitleParagraph.mparagraph_type);
            if (subtitleParagraph.mspeaker != null) {
                Participant.ADAPTER.encodeWithTag(protoWriter, 5, subtitleParagraph.mspeaker);
            }
            SubtitleSentence.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, subtitleParagraph.msentences);
            protoWriter.writeBytes(subtitleParagraph.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49870a newBuilder() {
        C49870a aVar = new C49870a();
        aVar.f124866a = this.mpid;
        aVar.f124867b = this.mstart_time;
        aVar.f124868c = this.mstop_time;
        aVar.f124869d = this.mparagraph_type;
        aVar.f124870e = this.mspeaker;
        aVar.f124871f = Internal.copyOf("msentences", this.msentences);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.SubtitleParagraph$a */
    public static final class C49870a extends Message.Builder<SubtitleParagraph, C49870a> {

        /* renamed from: a */
        public String f124866a;

        /* renamed from: b */
        public String f124867b;

        /* renamed from: c */
        public String f124868c;

        /* renamed from: d */
        public Integer f124869d;

        /* renamed from: e */
        public Participant f124870e;

        /* renamed from: f */
        public List<SubtitleSentence> f124871f = Internal.newMutableList();

        /* renamed from: a */
        public SubtitleParagraph build() {
            String str;
            String str2;
            Integer num;
            String str3 = this.f124866a;
            if (str3 != null && (str = this.f124867b) != null && (str2 = this.f124868c) != null && (num = this.f124869d) != null) {
                return new SubtitleParagraph(str3, str, str2, num, this.f124870e, this.f124871f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "mpid", this.f124867b, "mstart_time", this.f124868c, "mstop_time", this.f124869d, "mparagraph_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", pid=");
        sb.append(this.mpid);
        sb.append(", start_time=");
        sb.append(this.mstart_time);
        sb.append(", stop_time=");
        sb.append(this.mstop_time);
        sb.append(", paragraph_type=");
        sb.append(this.mparagraph_type);
        if (this.mspeaker != null) {
            sb.append(", speaker=");
            sb.append(this.mspeaker);
        }
        if (!this.msentences.isEmpty()) {
            sb.append(", sentences=");
            sb.append(this.msentences);
        }
        StringBuilder replace = sb.replace(0, 2, "SubtitleParagraph{");
        replace.append('}');
        return replace.toString();
    }

    public SubtitleParagraph(String str, String str2, String str3, Integer num, Participant participant, List<SubtitleSentence> list) {
        this(str, str2, str3, num, participant, list, ByteString.EMPTY);
    }

    public SubtitleParagraph(String str, String str2, String str3, Integer num, Participant participant, List<SubtitleSentence> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpid = str;
        this.mstart_time = str2;
        this.mstop_time = str3;
        this.mparagraph_type = num;
        this.mspeaker = participant;
        this.msentences = Internal.immutableCopyOf("msentences", list);
    }
}
