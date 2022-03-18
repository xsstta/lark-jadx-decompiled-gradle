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

public final class SummarySection extends Message<SummarySection, C49880a> {
    public static final ProtoAdapter<SummarySection> ADAPTER = new C49881b();
    public static final Integer DEFAULT_CONTENT_TYPE = 0;
    public static final Integer DEFAULT_SECTION_ID = 0;
    private static final long serialVersionUID = 0;
    public final List<String> mcontent_ids;
    public final Integer mcontent_type;
    public final Integer msection_id;

    /* renamed from: com.ss.android.lark.pb.meeting_object.SummarySection$b */
    private static final class C49881b extends ProtoAdapter<SummarySection> {
        C49881b() {
            super(FieldEncoding.LENGTH_DELIMITED, SummarySection.class);
        }

        /* renamed from: a */
        public int encodedSize(SummarySection summarySection) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, summarySection.msection_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, summarySection.mcontent_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, summarySection.mcontent_ids) + summarySection.unknownFields().size();
        }

        /* renamed from: a */
        public SummarySection decode(ProtoReader protoReader) throws IOException {
            C49880a aVar = new C49880a();
            aVar.f124901a = 0;
            aVar.f124902b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124901a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124902b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124903c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SummarySection summarySection) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, summarySection.msection_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, summarySection.mcontent_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, summarySection.mcontent_ids);
            protoWriter.writeBytes(summarySection.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49880a newBuilder() {
        C49880a aVar = new C49880a();
        aVar.f124901a = this.msection_id;
        aVar.f124902b = this.mcontent_type;
        aVar.f124903c = Internal.copyOf("mcontent_ids", this.mcontent_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.SummarySection$a */
    public static final class C49880a extends Message.Builder<SummarySection, C49880a> {

        /* renamed from: a */
        public Integer f124901a;

        /* renamed from: b */
        public Integer f124902b;

        /* renamed from: c */
        public List<String> f124903c = Internal.newMutableList();

        /* renamed from: a */
        public SummarySection build() {
            Integer num;
            Integer num2 = this.f124901a;
            if (num2 != null && (num = this.f124902b) != null) {
                return new SummarySection(num2, num, this.f124903c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "msection_id", this.f124902b, "mcontent_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", section_id=");
        sb.append(this.msection_id);
        sb.append(", content_type=");
        sb.append(this.mcontent_type);
        if (!this.mcontent_ids.isEmpty()) {
            sb.append(", content_ids=");
            sb.append(this.mcontent_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SummarySection{");
        replace.append('}');
        return replace.toString();
    }

    public SummarySection(Integer num, Integer num2, List<String> list) {
        this(num, num2, list, ByteString.EMPTY);
    }

    public SummarySection(Integer num, Integer num2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msection_id = num;
        this.mcontent_type = num2;
        this.mcontent_ids = Internal.immutableCopyOf("mcontent_ids", list);
    }
}
