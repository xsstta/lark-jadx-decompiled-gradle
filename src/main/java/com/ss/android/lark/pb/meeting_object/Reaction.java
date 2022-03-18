package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Reaction extends Message<Reaction, C49866a> {
    public static final ProtoAdapter<Reaction> ADAPTER = new C49867b();
    private static final long serialVersionUID = 0;
    public final Map<String, ParagraphComment> mcomments;
    public final Map<String, SubtitleParagraph> msubtitles;
    public final List<HighlightTimeLineItem> mtimeline;

    /* renamed from: com.ss.android.lark.pb.meeting_object.Reaction$a */
    public static final class C49866a extends Message.Builder<Reaction, C49866a> {

        /* renamed from: a */
        public List<HighlightTimeLineItem> f124853a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, ParagraphComment> f124854b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, SubtitleParagraph> f124855c = Internal.newMutableMap();

        /* renamed from: a */
        public Reaction build() {
            return new Reaction(this.f124853a, this.f124854b, this.f124855c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.Reaction$b */
    private static final class C49867b extends ProtoAdapter<Reaction> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ParagraphComment>> f124856a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ParagraphComment.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, SubtitleParagraph>> f124857b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SubtitleParagraph.ADAPTER);

        C49867b() {
            super(FieldEncoding.LENGTH_DELIMITED, Reaction.class);
        }

        /* renamed from: a */
        public int encodedSize(Reaction reaction) {
            return HighlightTimeLineItem.ADAPTER.asRepeated().encodedSizeWithTag(1, reaction.mtimeline) + this.f124856a.encodedSizeWithTag(2, reaction.mcomments) + this.f124857b.encodedSizeWithTag(3, reaction.msubtitles) + reaction.unknownFields().size();
        }

        /* renamed from: a */
        public Reaction decode(ProtoReader protoReader) throws IOException {
            C49866a aVar = new C49866a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124853a.add(HighlightTimeLineItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f124854b.putAll(this.f124856a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124855c.putAll(this.f124857b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Reaction reaction) throws IOException {
            HighlightTimeLineItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, reaction.mtimeline);
            this.f124856a.encodeWithTag(protoWriter, 2, reaction.mcomments);
            this.f124857b.encodeWithTag(protoWriter, 3, reaction.msubtitles);
            protoWriter.writeBytes(reaction.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49866a newBuilder() {
        C49866a aVar = new C49866a();
        aVar.f124853a = Internal.copyOf("mtimeline", this.mtimeline);
        aVar.f124854b = Internal.copyOf("mcomments", this.mcomments);
        aVar.f124855c = Internal.copyOf("msubtitles", this.msubtitles);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mtimeline.isEmpty()) {
            sb.append(", timeline=");
            sb.append(this.mtimeline);
        }
        if (!this.mcomments.isEmpty()) {
            sb.append(", comments=");
            sb.append(this.mcomments);
        }
        if (!this.msubtitles.isEmpty()) {
            sb.append(", subtitles=");
            sb.append(this.msubtitles);
        }
        StringBuilder replace = sb.replace(0, 2, "Reaction{");
        replace.append('}');
        return replace.toString();
    }

    public Reaction(List<HighlightTimeLineItem> list, Map<String, ParagraphComment> map, Map<String, SubtitleParagraph> map2) {
        this(list, map, map2, ByteString.EMPTY);
    }

    public Reaction(List<HighlightTimeLineItem> list, Map<String, ParagraphComment> map, Map<String, SubtitleParagraph> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtimeline = Internal.immutableCopyOf("mtimeline", list);
        this.mcomments = Internal.immutableCopyOf("mcomments", map);
        this.msubtitles = Internal.immutableCopyOf("msubtitles", map2);
    }
}
