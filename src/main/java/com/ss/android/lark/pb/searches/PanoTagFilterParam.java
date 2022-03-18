package com.ss.android.lark.pb.searches;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PanoTagFilterParam extends Message<PanoTagFilterParam, C50026a> {
    public static final ProtoAdapter<PanoTagFilterParam> ADAPTER = new C50027b();
    public static final Long DEFAULT_CREATE_TIME_AFTER = 0L;
    public static final Long DEFAULT_CREATE_TIME_BEFORE = 0L;
    private static final long serialVersionUID = 0;
    public final Long mcreate_time_after;
    public final Long mcreate_time_before;
    public final List<Long> mcreator_ids;
    public final String mdescription_key;
    public final List<Long> mowners;
    public final SortType msort_type;
    public final List<String> mtag_id_values;
    public final Expr mtag_id_values_expr;
    public final List<String> mtag_ids;
    public final Expr mtag_ids_and_tag_id_values_expr;
    public final Expr mtag_ids_expr;
    public final List<Long> mtag_types;

    /* renamed from: com.ss.android.lark.pb.searches.PanoTagFilterParam$b */
    private static final class C50027b extends ProtoAdapter<PanoTagFilterParam> {
        C50027b() {
            super(FieldEncoding.LENGTH_DELIMITED, PanoTagFilterParam.class);
        }

        /* renamed from: a */
        public int encodedSize(PanoTagFilterParam panoTagFilterParam) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, panoTagFilterParam.mtag_ids);
            int i7 = 0;
            if (panoTagFilterParam.mtag_ids_expr != null) {
                i = Expr.ADAPTER.encodedSizeWithTag(2, panoTagFilterParam.mtag_ids_expr);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, panoTagFilterParam.mtag_id_values);
            if (panoTagFilterParam.mtag_id_values_expr != null) {
                i2 = Expr.ADAPTER.encodedSizeWithTag(4, panoTagFilterParam.mtag_id_values_expr);
            } else {
                i2 = 0;
            }
            int i8 = encodedSizeWithTag2 + i2;
            if (panoTagFilterParam.mtag_ids_and_tag_id_values_expr != null) {
                i3 = Expr.ADAPTER.encodedSizeWithTag(5, panoTagFilterParam.mtag_ids_and_tag_id_values_expr);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = i8 + i3 + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(6, panoTagFilterParam.mtag_types) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(7, panoTagFilterParam.mcreator_ids);
            if (panoTagFilterParam.mdescription_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, panoTagFilterParam.mdescription_key);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag4 = encodedSizeWithTag3 + i4 + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(9, panoTagFilterParam.mowners);
            if (panoTagFilterParam.mcreate_time_before != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(10, panoTagFilterParam.mcreate_time_before);
            } else {
                i5 = 0;
            }
            int i9 = encodedSizeWithTag4 + i5;
            if (panoTagFilterParam.mcreate_time_after != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(11, panoTagFilterParam.mcreate_time_after);
            } else {
                i6 = 0;
            }
            int i10 = i9 + i6;
            if (panoTagFilterParam.msort_type != null) {
                i7 = SortType.ADAPTER.encodedSizeWithTag(12, panoTagFilterParam.msort_type);
            }
            return i10 + i7 + panoTagFilterParam.unknownFields().size();
        }

        /* renamed from: a */
        public PanoTagFilterParam decode(ProtoReader protoReader) throws IOException {
            C50026a aVar = new C50026a();
            aVar.f125130h = "";
            aVar.f125132j = 0L;
            aVar.f125133k = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125123a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            try {
                                aVar.f125124b = Expr.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125125c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            try {
                                aVar.f125126d = Expr.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f125127e = Expr.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 6:
                            aVar.f125128f.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            aVar.f125129g.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            aVar.f125130h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125131i.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 10:
                            aVar.f125132j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125133k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            try {
                                aVar.f125134l = SortType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, PanoTagFilterParam panoTagFilterParam) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, panoTagFilterParam.mtag_ids);
            if (panoTagFilterParam.mtag_ids_expr != null) {
                Expr.ADAPTER.encodeWithTag(protoWriter, 2, panoTagFilterParam.mtag_ids_expr);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, panoTagFilterParam.mtag_id_values);
            if (panoTagFilterParam.mtag_id_values_expr != null) {
                Expr.ADAPTER.encodeWithTag(protoWriter, 4, panoTagFilterParam.mtag_id_values_expr);
            }
            if (panoTagFilterParam.mtag_ids_and_tag_id_values_expr != null) {
                Expr.ADAPTER.encodeWithTag(protoWriter, 5, panoTagFilterParam.mtag_ids_and_tag_id_values_expr);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 6, panoTagFilterParam.mtag_types);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 7, panoTagFilterParam.mcreator_ids);
            if (panoTagFilterParam.mdescription_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, panoTagFilterParam.mdescription_key);
            }
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 9, panoTagFilterParam.mowners);
            if (panoTagFilterParam.mcreate_time_before != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, panoTagFilterParam.mcreate_time_before);
            }
            if (panoTagFilterParam.mcreate_time_after != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, panoTagFilterParam.mcreate_time_after);
            }
            if (panoTagFilterParam.msort_type != null) {
                SortType.ADAPTER.encodeWithTag(protoWriter, 12, panoTagFilterParam.msort_type);
            }
            protoWriter.writeBytes(panoTagFilterParam.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.PanoTagFilterParam$a */
    public static final class C50026a extends Message.Builder<PanoTagFilterParam, C50026a> {

        /* renamed from: a */
        public List<String> f125123a = Internal.newMutableList();

        /* renamed from: b */
        public Expr f125124b;

        /* renamed from: c */
        public List<String> f125125c = Internal.newMutableList();

        /* renamed from: d */
        public Expr f125126d;

        /* renamed from: e */
        public Expr f125127e;

        /* renamed from: f */
        public List<Long> f125128f = Internal.newMutableList();

        /* renamed from: g */
        public List<Long> f125129g = Internal.newMutableList();

        /* renamed from: h */
        public String f125130h;

        /* renamed from: i */
        public List<Long> f125131i = Internal.newMutableList();

        /* renamed from: j */
        public Long f125132j;

        /* renamed from: k */
        public Long f125133k;

        /* renamed from: l */
        public SortType f125134l;

        /* renamed from: a */
        public PanoTagFilterParam build() {
            return new PanoTagFilterParam(this.f125123a, this.f125124b, this.f125125c, this.f125126d, this.f125127e, this.f125128f, this.f125129g, this.f125130h, this.f125131i, this.f125132j, this.f125133k, this.f125134l, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50026a newBuilder() {
        C50026a aVar = new C50026a();
        aVar.f125123a = Internal.copyOf("mtag_ids", this.mtag_ids);
        aVar.f125124b = this.mtag_ids_expr;
        aVar.f125125c = Internal.copyOf("mtag_id_values", this.mtag_id_values);
        aVar.f125126d = this.mtag_id_values_expr;
        aVar.f125127e = this.mtag_ids_and_tag_id_values_expr;
        aVar.f125128f = Internal.copyOf("mtag_types", this.mtag_types);
        aVar.f125129g = Internal.copyOf("mcreator_ids", this.mcreator_ids);
        aVar.f125130h = this.mdescription_key;
        aVar.f125131i = Internal.copyOf("mowners", this.mowners);
        aVar.f125132j = this.mcreate_time_before;
        aVar.f125133k = this.mcreate_time_after;
        aVar.f125134l = this.msort_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mtag_ids.isEmpty()) {
            sb.append(", tag_ids=");
            sb.append(this.mtag_ids);
        }
        if (this.mtag_ids_expr != null) {
            sb.append(", tag_ids_expr=");
            sb.append(this.mtag_ids_expr);
        }
        if (!this.mtag_id_values.isEmpty()) {
            sb.append(", tag_id_values=");
            sb.append(this.mtag_id_values);
        }
        if (this.mtag_id_values_expr != null) {
            sb.append(", tag_id_values_expr=");
            sb.append(this.mtag_id_values_expr);
        }
        if (this.mtag_ids_and_tag_id_values_expr != null) {
            sb.append(", tag_ids_and_tag_id_values_expr=");
            sb.append(this.mtag_ids_and_tag_id_values_expr);
        }
        if (!this.mtag_types.isEmpty()) {
            sb.append(", tag_types=");
            sb.append(this.mtag_types);
        }
        if (!this.mcreator_ids.isEmpty()) {
            sb.append(", creator_ids=");
            sb.append(this.mcreator_ids);
        }
        if (this.mdescription_key != null) {
            sb.append(", description_key=");
            sb.append(this.mdescription_key);
        }
        if (!this.mowners.isEmpty()) {
            sb.append(", owners=");
            sb.append(this.mowners);
        }
        if (this.mcreate_time_before != null) {
            sb.append(", create_time_before=");
            sb.append(this.mcreate_time_before);
        }
        if (this.mcreate_time_after != null) {
            sb.append(", create_time_after=");
            sb.append(this.mcreate_time_after);
        }
        if (this.msort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.msort_type);
        }
        StringBuilder replace = sb.replace(0, 2, "PanoTagFilterParam{");
        replace.append('}');
        return replace.toString();
    }

    public PanoTagFilterParam(List<String> list, Expr expr, List<String> list2, Expr expr2, Expr expr3, List<Long> list3, List<Long> list4, String str, List<Long> list5, Long l, Long l2, SortType sortType) {
        this(list, expr, list2, expr2, expr3, list3, list4, str, list5, l, l2, sortType, ByteString.EMPTY);
    }

    public PanoTagFilterParam(List<String> list, Expr expr, List<String> list2, Expr expr2, Expr expr3, List<Long> list3, List<Long> list4, String str, List<Long> list5, Long l, Long l2, SortType sortType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtag_ids = Internal.immutableCopyOf("mtag_ids", list);
        this.mtag_ids_expr = expr;
        this.mtag_id_values = Internal.immutableCopyOf("mtag_id_values", list2);
        this.mtag_id_values_expr = expr2;
        this.mtag_ids_and_tag_id_values_expr = expr3;
        this.mtag_types = Internal.immutableCopyOf("mtag_types", list3);
        this.mcreator_ids = Internal.immutableCopyOf("mcreator_ids", list4);
        this.mdescription_key = str;
        this.mowners = Internal.immutableCopyOf("mowners", list5);
        this.mcreate_time_before = l;
        this.mcreate_time_after = l2;
        this.msort_type = sortType;
    }
}
