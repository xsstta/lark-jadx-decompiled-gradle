package com.ss.android.lark.pb.meeting_object;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class Summary extends Message<Summary, C49876a> {
    public static final ProtoAdapter<Summary> ADAPTER = new C49877b();
    public static final Integer DEFAULT_GEN_COUNT = 0;
    public static final Boolean DEFAULT_IS_AUTO_GEN = false;
    public static final Boolean DEFAULT_IS_REGEN = false;
    public static final Integer DEFAULT_SUMMARY_STATUS = 0;
    private static final long serialVersionUID = 0;
    public final Integer mgen_count;
    public final Boolean mis_auto_gen;
    public final Boolean mis_regen;
    public final Map<Integer, SummarySection> msection_list;
    public final Map<String, SummaryDetail> msummaries;
    public final Integer msummary_status;

    /* renamed from: com.ss.android.lark.pb.meeting_object.Summary$b */
    private static final class C49877b extends ProtoAdapter<Summary> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Integer, SummarySection>> f124889a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, SummarySection.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, SummaryDetail>> f124890b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SummaryDetail.ADAPTER);

        C49877b() {
            super(FieldEncoding.LENGTH_DELIMITED, Summary.class);
        }

        /* renamed from: a */
        public int encodedSize(Summary summary) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, summary.msummary_status);
            int i3 = 0;
            if (summary.mis_auto_gen != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, summary.mis_auto_gen);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (summary.mis_regen != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, summary.mis_regen);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (summary.mgen_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, summary.mgen_count);
            }
            return i5 + i3 + this.f124889a.encodedSizeWithTag(5, summary.msection_list) + this.f124890b.encodedSizeWithTag(6, summary.msummaries) + summary.unknownFields().size();
        }

        /* renamed from: a */
        public Summary decode(ProtoReader protoReader) throws IOException {
            C49876a aVar = new C49876a();
            aVar.f124883a = 0;
            aVar.f124884b = false;
            aVar.f124885c = false;
            aVar.f124886d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124883a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124884b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124885c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124886d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124887e.putAll(this.f124889a.decode(protoReader));
                            break;
                        case 6:
                            aVar.f124888f.putAll(this.f124890b.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, Summary summary) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, summary.msummary_status);
            if (summary.mis_auto_gen != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, summary.mis_auto_gen);
            }
            if (summary.mis_regen != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, summary.mis_regen);
            }
            if (summary.mgen_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, summary.mgen_count);
            }
            this.f124889a.encodeWithTag(protoWriter, 5, summary.msection_list);
            this.f124890b.encodeWithTag(protoWriter, 6, summary.msummaries);
            protoWriter.writeBytes(summary.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.Summary$a */
    public static final class C49876a extends Message.Builder<Summary, C49876a> {

        /* renamed from: a */
        public Integer f124883a;

        /* renamed from: b */
        public Boolean f124884b;

        /* renamed from: c */
        public Boolean f124885c;

        /* renamed from: d */
        public Integer f124886d;

        /* renamed from: e */
        public Map<Integer, SummarySection> f124887e = Internal.newMutableMap();

        /* renamed from: f */
        public Map<String, SummaryDetail> f124888f = Internal.newMutableMap();

        /* renamed from: a */
        public Summary build() {
            Integer num = this.f124883a;
            if (num != null) {
                return new Summary(num, this.f124884b, this.f124885c, this.f124886d, this.f124887e, this.f124888f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "msummary_status");
        }
    }

    @Override // com.squareup.wire.Message
    public C49876a newBuilder() {
        C49876a aVar = new C49876a();
        aVar.f124883a = this.msummary_status;
        aVar.f124884b = this.mis_auto_gen;
        aVar.f124885c = this.mis_regen;
        aVar.f124886d = this.mgen_count;
        aVar.f124887e = Internal.copyOf("msection_list", this.msection_list);
        aVar.f124888f = Internal.copyOf("msummaries", this.msummaries);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", summary_status=");
        sb.append(this.msummary_status);
        if (this.mis_auto_gen != null) {
            sb.append(", is_auto_gen=");
            sb.append(this.mis_auto_gen);
        }
        if (this.mis_regen != null) {
            sb.append(", is_regen=");
            sb.append(this.mis_regen);
        }
        if (this.mgen_count != null) {
            sb.append(", gen_count=");
            sb.append(this.mgen_count);
        }
        if (!this.msection_list.isEmpty()) {
            sb.append(", section_list=");
            sb.append(this.msection_list);
        }
        if (!this.msummaries.isEmpty()) {
            sb.append(", summaries=");
            sb.append(this.msummaries);
        }
        StringBuilder replace = sb.replace(0, 2, "Summary{");
        replace.append('}');
        return replace.toString();
    }

    public Summary(Integer num, Boolean bool, Boolean bool2, Integer num2, Map<Integer, SummarySection> map, Map<String, SummaryDetail> map2) {
        this(num, bool, bool2, num2, map, map2, ByteString.EMPTY);
    }

    public Summary(Integer num, Boolean bool, Boolean bool2, Integer num2, Map<Integer, SummarySection> map, Map<String, SummaryDetail> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msummary_status = num;
        this.mis_auto_gen = bool;
        this.mis_regen = bool2;
        this.mgen_count = num2;
        this.msection_list = Internal.immutableCopyOf("msection_list", map);
        this.msummaries = Internal.immutableCopyOf("msummaries", map2);
    }
}
