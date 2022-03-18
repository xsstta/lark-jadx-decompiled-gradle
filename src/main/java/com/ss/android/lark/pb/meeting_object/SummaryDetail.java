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

public final class SummaryDetail extends Message<SummaryDetail, C49878a> {
    public static final ProtoAdapter<SummaryDetail> ADAPTER = new C49879b();
    public static final Boolean DEFAULT_AUTO_GEN = false;
    public static final Boolean DEFAULT_CHECKED = false;
    public static final Integer DEFAULT_CONTENT_TYPE = 0;
    public static final Integer DEFAULT_SECTION_ID = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_STOP_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean mauto_gen;
    public final Boolean mchecked;
    public final String mcontent_id;
    public final Integer mcontent_type;
    public final String mdata;
    public final Integer msection_id;
    public final List<String> msids;
    public final Long mstart_time;
    public final Integer mstatus;
    public final Long mstop_time;

    /* renamed from: com.ss.android.lark.pb.meeting_object.SummaryDetail$b */
    private static final class C49879b extends ProtoAdapter<SummaryDetail> {
        C49879b() {
            super(FieldEncoding.LENGTH_DELIMITED, SummaryDetail.class);
        }

        /* renamed from: a */
        public int encodedSize(SummaryDetail summaryDetail) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, summaryDetail.mcontent_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, summaryDetail.msection_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, summaryDetail.mcontent_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, summaryDetail.mdata);
            int i5 = 0;
            if (summaryDetail.mstart_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(5, summaryDetail.mstart_time);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (summaryDetail.mstop_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(6, summaryDetail.mstop_time);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (summaryDetail.mchecked != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(7, summaryDetail.mchecked);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (summaryDetail.mstatus != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(8, summaryDetail.mstatus);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i8 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, summaryDetail.msids);
            if (summaryDetail.mauto_gen != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(10, summaryDetail.mauto_gen);
            }
            return encodedSizeWithTag2 + i5 + summaryDetail.unknownFields().size();
        }

        /* renamed from: a */
        public SummaryDetail decode(ProtoReader protoReader) throws IOException {
            C49878a aVar = new C49878a();
            aVar.f124891a = "";
            aVar.f124892b = 0;
            aVar.f124893c = 0;
            aVar.f124894d = "";
            aVar.f124895e = 0L;
            aVar.f124896f = 0L;
            aVar.f124897g = false;
            aVar.f124898h = 0;
            aVar.f124900j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124891a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124892b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124893c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124894d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124895e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124896f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124897g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124898h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124899i.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            aVar.f124900j = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SummaryDetail summaryDetail) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, summaryDetail.mcontent_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, summaryDetail.msection_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, summaryDetail.mcontent_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, summaryDetail.mdata);
            if (summaryDetail.mstart_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, summaryDetail.mstart_time);
            }
            if (summaryDetail.mstop_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, summaryDetail.mstop_time);
            }
            if (summaryDetail.mchecked != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, summaryDetail.mchecked);
            }
            if (summaryDetail.mstatus != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, summaryDetail.mstatus);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, summaryDetail.msids);
            if (summaryDetail.mauto_gen != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, summaryDetail.mauto_gen);
            }
            protoWriter.writeBytes(summaryDetail.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49878a newBuilder() {
        C49878a aVar = new C49878a();
        aVar.f124891a = this.mcontent_id;
        aVar.f124892b = this.msection_id;
        aVar.f124893c = this.mcontent_type;
        aVar.f124894d = this.mdata;
        aVar.f124895e = this.mstart_time;
        aVar.f124896f = this.mstop_time;
        aVar.f124897g = this.mchecked;
        aVar.f124898h = this.mstatus;
        aVar.f124899i = Internal.copyOf("msids", this.msids);
        aVar.f124900j = this.mauto_gen;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.meeting_object.SummaryDetail$a */
    public static final class C49878a extends Message.Builder<SummaryDetail, C49878a> {

        /* renamed from: a */
        public String f124891a;

        /* renamed from: b */
        public Integer f124892b;

        /* renamed from: c */
        public Integer f124893c;

        /* renamed from: d */
        public String f124894d;

        /* renamed from: e */
        public Long f124895e;

        /* renamed from: f */
        public Long f124896f;

        /* renamed from: g */
        public Boolean f124897g;

        /* renamed from: h */
        public Integer f124898h;

        /* renamed from: i */
        public List<String> f124899i = Internal.newMutableList();

        /* renamed from: j */
        public Boolean f124900j;

        /* renamed from: a */
        public SummaryDetail build() {
            Integer num;
            Integer num2;
            String str;
            String str2 = this.f124891a;
            if (str2 != null && (num = this.f124892b) != null && (num2 = this.f124893c) != null && (str = this.f124894d) != null) {
                return new SummaryDetail(str2, num, num2, str, this.f124895e, this.f124896f, this.f124897g, this.f124898h, this.f124899i, this.f124900j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "mcontent_id", this.f124892b, "msection_id", this.f124893c, "mcontent_type", this.f124894d, "mdata");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", content_id=");
        sb.append(this.mcontent_id);
        sb.append(", section_id=");
        sb.append(this.msection_id);
        sb.append(", content_type=");
        sb.append(this.mcontent_type);
        sb.append(", data=");
        sb.append(this.mdata);
        if (this.mstart_time != null) {
            sb.append(", start_time=");
            sb.append(this.mstart_time);
        }
        if (this.mstop_time != null) {
            sb.append(", stop_time=");
            sb.append(this.mstop_time);
        }
        if (this.mchecked != null) {
            sb.append(", checked=");
            sb.append(this.mchecked);
        }
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (!this.msids.isEmpty()) {
            sb.append(", sids=");
            sb.append(this.msids);
        }
        if (this.mauto_gen != null) {
            sb.append(", auto_gen=");
            sb.append(this.mauto_gen);
        }
        StringBuilder replace = sb.replace(0, 2, "SummaryDetail{");
        replace.append('}');
        return replace.toString();
    }

    public SummaryDetail(String str, Integer num, Integer num2, String str2, Long l, Long l2, Boolean bool, Integer num3, List<String> list, Boolean bool2) {
        this(str, num, num2, str2, l, l2, bool, num3, list, bool2, ByteString.EMPTY);
    }

    public SummaryDetail(String str, Integer num, Integer num2, String str2, Long l, Long l2, Boolean bool, Integer num3, List<String> list, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcontent_id = str;
        this.msection_id = num;
        this.mcontent_type = num2;
        this.mdata = str2;
        this.mstart_time = l;
        this.mstop_time = l2;
        this.mchecked = bool;
        this.mstatus = num3;
        this.msids = Internal.immutableCopyOf("msids", list);
        this.mauto_gen = bool2;
    }
}
