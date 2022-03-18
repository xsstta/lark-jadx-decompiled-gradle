package com.ss.android.lark.pb.urecommend;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class RecommendEntitySections extends Message<RecommendEntitySections, C50156a> {
    public static final ProtoAdapter<RecommendEntitySections> ADAPTER = new C50157b();
    private static final long serialVersionUID = 0;
    public final List<RecommendEntitySection> mentity_sections;

    /* renamed from: com.ss.android.lark.pb.urecommend.RecommendEntitySections$b */
    private static final class C50157b extends ProtoAdapter<RecommendEntitySections> {
        C50157b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecommendEntitySections.class);
        }

        /* renamed from: a */
        public int encodedSize(RecommendEntitySections recommendEntitySections) {
            return RecommendEntitySection.ADAPTER.asRepeated().encodedSizeWithTag(1, recommendEntitySections.mentity_sections) + recommendEntitySections.unknownFields().size();
        }

        /* renamed from: a */
        public RecommendEntitySections decode(ProtoReader protoReader) throws IOException {
            C50156a aVar = new C50156a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125351a.add(RecommendEntitySection.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecommendEntitySections recommendEntitySections) throws IOException {
            RecommendEntitySection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, recommendEntitySections.mentity_sections);
            protoWriter.writeBytes(recommendEntitySections.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.urecommend.RecommendEntitySections$a */
    public static final class C50156a extends Message.Builder<RecommendEntitySections, C50156a> {

        /* renamed from: a */
        public List<RecommendEntitySection> f125351a = Internal.newMutableList();

        /* renamed from: a */
        public RecommendEntitySections build() {
            return new RecommendEntitySections(this.f125351a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50156a newBuilder() {
        C50156a aVar = new C50156a();
        aVar.f125351a = Internal.copyOf("mentity_sections", this.mentity_sections);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mentity_sections.isEmpty()) {
            sb.append(", entity_sections=");
            sb.append(this.mentity_sections);
        }
        StringBuilder replace = sb.replace(0, 2, "RecommendEntitySections{");
        replace.append('}');
        return replace.toString();
    }

    public RecommendEntitySections(List<RecommendEntitySection> list) {
        this(list, ByteString.EMPTY);
    }

    public RecommendEntitySections(List<RecommendEntitySection> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mentity_sections = Internal.immutableCopyOf("mentity_sections", list);
    }
}
