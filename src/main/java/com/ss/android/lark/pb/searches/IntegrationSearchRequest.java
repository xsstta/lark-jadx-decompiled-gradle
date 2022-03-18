package com.ss.android.lark.pb.searches;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.DocType;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class IntegrationSearchRequest extends Message<IntegrationSearchRequest, C50018a> {
    public static final ProtoAdapter<IntegrationSearchRequest> ADAPTER = new C50019b();
    public static final Integer DEFAULT_BEGIN = 0;
    public static final Integer DEFAULT_END = 10;
    private static final long serialVersionUID = 0;
    public final Integer mbegin;
    public final Integer mend;
    public final SearchExtraParam mextra_param;
    public final String mextras;
    public final FilterParam mfilter_param;
    public final String mimpr_id;
    public final String mlocale_identifier;
    public final String mquery;
    public final QueryState mquery_state;
    public final Scene mscene;
    public final String msearch_session;
    public final SlashCommandParam mslash_command_param;

    public static final class FilterParam extends Message<FilterParam, C50014a> {
        public static final ProtoAdapter<FilterParam> ADAPTER = new C50015b();
        public static final Integer DEFAULT_COUNT = 10;
        public static final Boolean DEFAULT_DO_NOT_SEARCH_RESIGNED_USER = false;
        public static final Long DEFAULT_LAST_CREATE_TIME = 0L;
        public static final Long DEFAULT_MESSAGE_END_TIME = 0L;
        public static final Long DEFAULT_MESSAGE_START_TIME = 0L;
        public static final Boolean DEFAULT_NEED_SEARCH_OUTER_TENANT = false;
        public static final Boolean DEFAULT_REVERSE = false;
        private static final long serialVersionUID = 0;
        public final CalendarFilterParam mcalendar_filter_param;
        public final ChatFilterParam mchat_filter_param;
        public final List<String> mchat_ids;
        public final List<ChatterFilterParam> mchatter_filter_params;
        public final Integer mcount;
        public final Boolean mdo_not_search_resigned_user;
        public final String mdoc_creator_id;
        public final List<String> mdoc_creator_ids;
        public final DocFilterParam mdoc_filter_param;
        public final List<String> mdoc_sharer_ids;
        public final DocType mdoc_type;
        public final List<String> mdoc_types;
        public final List<String> memail_ids;
        public final String mexternal_id;
        public final String mis_read_message_id;
        public final Long mlast_create_time;
        public final String mlast_message_id;
        public final List<String> mmessage_creator_ids;
        public final Long mmessage_end_time;
        public final MessageFilterParam mmessage_filter_param;
        public final Long mmessage_start_time;
        public final List<MessageTag> mmessage_tags;
        public final List<String> mmessage_to_ids;
        public final List<Modifier> mmodifiers;
        public final Boolean mneed_search_outer_tenant;
        public final PanoTagFilterParam mpano_tag_filter_param;
        public final Boolean mreverse;
        public final List<String> mthread_ids;
        public final TimeLabel mtime_range;

        public enum MessageTag implements WireEnum {
            UNKNOWN(0),
            PIN(1);
            
            public static final ProtoAdapter<MessageTag> ADAPTER = ProtoAdapter.newEnumAdapter(MessageTag.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static MessageTag fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return PIN;
            }

            private MessageTag(int i) {
                this.value = i;
            }
        }

        public enum TimeLabel implements WireEnum {
            UNLIMITED(0),
            YESTERDAY(1),
            LAST_7_DAYS(2),
            LAST_30_DAYS(3),
            LAST_90_DAYS(4);
            
            public static final ProtoAdapter<TimeLabel> ADAPTER = ProtoAdapter.newEnumAdapter(TimeLabel.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static TimeLabel fromValue(int i) {
                if (i == 0) {
                    return UNLIMITED;
                }
                if (i == 1) {
                    return YESTERDAY;
                }
                if (i == 2) {
                    return LAST_7_DAYS;
                }
                if (i == 3) {
                    return LAST_30_DAYS;
                }
                if (i != 4) {
                    return null;
                }
                return LAST_90_DAYS;
            }

            private TimeLabel(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.searches.IntegrationSearchRequest$FilterParam$b */
        private static final class C50015b extends ProtoAdapter<FilterParam> {
            C50015b() {
                super(FieldEncoding.LENGTH_DELIMITED, FilterParam.class);
            }

            /* renamed from: a */
            public int encodedSize(FilterParam filterParam) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, filterParam.mchat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, filterParam.memail_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, filterParam.mmessage_creator_ids);
                int i18 = 0;
                if (filterParam.mmessage_start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(4, filterParam.mmessage_start_time);
                } else {
                    i = 0;
                }
                int i19 = encodedSizeWithTag + i;
                if (filterParam.mmessage_end_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(5, filterParam.mmessage_end_time);
                } else {
                    i2 = 0;
                }
                int i20 = i19 + i2;
                if (filterParam.mneed_search_outer_tenant != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, filterParam.mneed_search_outer_tenant);
                } else {
                    i3 = 0;
                }
                int i21 = i20 + i3;
                if (filterParam.mlast_create_time != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(7, filterParam.mlast_create_time);
                } else {
                    i4 = 0;
                }
                int i22 = i21 + i4;
                if (filterParam.mlast_message_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, filterParam.mlast_message_id);
                } else {
                    i5 = 0;
                }
                int i23 = i22 + i5;
                if (filterParam.mcount != null) {
                    i6 = ProtoAdapter.INT32.encodedSizeWithTag(9, filterParam.mcount);
                } else {
                    i6 = 0;
                }
                int i24 = i23 + i6;
                if (filterParam.mreverse != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(10, filterParam.mreverse);
                } else {
                    i7 = 0;
                }
                int i25 = i24 + i7;
                if (filterParam.mdoc_creator_id != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, filterParam.mdoc_creator_id);
                } else {
                    i8 = 0;
                }
                int i26 = i25 + i8;
                if (filterParam.mdoc_type != null) {
                    i9 = DocType.ADAPTER.encodedSizeWithTag(12, filterParam.mdoc_type);
                } else {
                    i9 = 0;
                }
                int encodedSizeWithTag2 = i26 + i9 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(13, filterParam.mdoc_creator_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(14, filterParam.mdoc_types);
                if (filterParam.mtime_range != null) {
                    i10 = TimeLabel.ADAPTER.encodedSizeWithTag(15, filterParam.mtime_range);
                } else {
                    i10 = 0;
                }
                int i27 = encodedSizeWithTag2 + i10;
                if (filterParam.mdo_not_search_resigned_user != null) {
                    i11 = ProtoAdapter.BOOL.encodedSizeWithTag(16, filterParam.mdo_not_search_resigned_user);
                } else {
                    i11 = 0;
                }
                int i28 = i27 + i11;
                if (filterParam.mis_read_message_id != null) {
                    i12 = ProtoAdapter.STRING.encodedSizeWithTag(17, filterParam.mis_read_message_id);
                } else {
                    i12 = 0;
                }
                int i29 = i28 + i12;
                if (filterParam.mexternal_id != null) {
                    i13 = ProtoAdapter.STRING.encodedSizeWithTag(18, filterParam.mexternal_id);
                } else {
                    i13 = 0;
                }
                int encodedSizeWithTag3 = i29 + i13 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(19, filterParam.mthread_ids) + Modifier.ADAPTER.asRepeated().encodedSizeWithTag(20, filterParam.mmodifiers) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(21, filterParam.mmessage_to_ids) + MessageTag.ADAPTER.asRepeated().encodedSizeWithTag(22, filterParam.mmessage_tags);
                if (filterParam.mchat_filter_param != null) {
                    i14 = ChatFilterParam.ADAPTER.encodedSizeWithTag(23, filterParam.mchat_filter_param);
                } else {
                    i14 = 0;
                }
                int encodedSizeWithTag4 = encodedSizeWithTag3 + i14 + ChatterFilterParam.ADAPTER.asRepeated().encodedSizeWithTag(24, filterParam.mchatter_filter_params);
                if (filterParam.mcalendar_filter_param != null) {
                    i15 = CalendarFilterParam.ADAPTER.encodedSizeWithTag(25, filterParam.mcalendar_filter_param);
                } else {
                    i15 = 0;
                }
                int i30 = encodedSizeWithTag4 + i15;
                if (filterParam.mdoc_filter_param != null) {
                    i16 = DocFilterParam.ADAPTER.encodedSizeWithTag(26, filterParam.mdoc_filter_param);
                } else {
                    i16 = 0;
                }
                int i31 = i30 + i16;
                if (filterParam.mmessage_filter_param != null) {
                    i17 = MessageFilterParam.ADAPTER.encodedSizeWithTag(27, filterParam.mmessage_filter_param);
                } else {
                    i17 = 0;
                }
                int i32 = i31 + i17;
                if (filterParam.mpano_tag_filter_param != null) {
                    i18 = PanoTagFilterParam.ADAPTER.encodedSizeWithTag(28, filterParam.mpano_tag_filter_param);
                }
                return i32 + i18 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(29, filterParam.mdoc_sharer_ids) + filterParam.unknownFields().size();
            }

            /* renamed from: a */
            public FilterParam decode(ProtoReader protoReader) throws IOException {
                C50014a aVar = new C50014a();
                aVar.f125074d = 0L;
                aVar.f125075e = 0L;
                aVar.f125076f = false;
                aVar.f125077g = 0L;
                aVar.f125078h = "";
                aVar.f125079i = 10;
                aVar.f125080j = false;
                aVar.f125081k = "";
                aVar.f125086p = false;
                aVar.f125087q = "";
                aVar.f125088r = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f125071a.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 2:
                                aVar.f125072b.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 3:
                                aVar.f125073c.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 4:
                                aVar.f125074d = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                aVar.f125075e = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 6:
                                aVar.f125076f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f125077g = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 8:
                                aVar.f125078h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f125079i = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 10:
                                aVar.f125080j = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f125081k = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                try {
                                    aVar.f125082l = DocType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 13:
                                aVar.f125083m.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 14:
                                aVar.f125084n.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 15:
                                try {
                                    aVar.f125085o = TimeLabel.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 16:
                                aVar.f125086p = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 17:
                                aVar.f125087q = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 18:
                                aVar.f125088r = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 19:
                                aVar.f125089s.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 20:
                                aVar.f125090t.add(Modifier.ADAPTER.decode(protoReader));
                                break;
                            case 21:
                                aVar.f125091u.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 22:
                                try {
                                    aVar.f125092v.add(MessageTag.ADAPTER.decode(protoReader));
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
                            case 23:
                                aVar.f125093w = ChatFilterParam.ADAPTER.decode(protoReader);
                                break;
                            case 24:
                                aVar.f125094x.add(ChatterFilterParam.ADAPTER.decode(protoReader));
                                break;
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                                aVar.f125095y = CalendarFilterParam.ADAPTER.decode(protoReader);
                                break;
                            case 26:
                                aVar.f125096z = DocFilterParam.ADAPTER.decode(protoReader);
                                break;
                            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                                aVar.f125068A = MessageFilterParam.ADAPTER.decode(protoReader);
                                break;
                            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                aVar.f125069B = PanoTagFilterParam.ADAPTER.decode(protoReader);
                                break;
                            case 29:
                                aVar.f125070C.add(ProtoAdapter.STRING.decode(protoReader));
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
            public void encode(ProtoWriter protoWriter, FilterParam filterParam) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, filterParam.mchat_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, filterParam.memail_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, filterParam.mmessage_creator_ids);
                if (filterParam.mmessage_start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, filterParam.mmessage_start_time);
                }
                if (filterParam.mmessage_end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, filterParam.mmessage_end_time);
                }
                if (filterParam.mneed_search_outer_tenant != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, filterParam.mneed_search_outer_tenant);
                }
                if (filterParam.mlast_create_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, filterParam.mlast_create_time);
                }
                if (filterParam.mlast_message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, filterParam.mlast_message_id);
                }
                if (filterParam.mcount != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, filterParam.mcount);
                }
                if (filterParam.mreverse != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, filterParam.mreverse);
                }
                if (filterParam.mdoc_creator_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, filterParam.mdoc_creator_id);
                }
                if (filterParam.mdoc_type != null) {
                    DocType.ADAPTER.encodeWithTag(protoWriter, 12, filterParam.mdoc_type);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 13, filterParam.mdoc_creator_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 14, filterParam.mdoc_types);
                if (filterParam.mtime_range != null) {
                    TimeLabel.ADAPTER.encodeWithTag(protoWriter, 15, filterParam.mtime_range);
                }
                if (filterParam.mdo_not_search_resigned_user != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, filterParam.mdo_not_search_resigned_user);
                }
                if (filterParam.mis_read_message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, filterParam.mis_read_message_id);
                }
                if (filterParam.mexternal_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, filterParam.mexternal_id);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 19, filterParam.mthread_ids);
                Modifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, filterParam.mmodifiers);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 21, filterParam.mmessage_to_ids);
                MessageTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, filterParam.mmessage_tags);
                if (filterParam.mchat_filter_param != null) {
                    ChatFilterParam.ADAPTER.encodeWithTag(protoWriter, 23, filterParam.mchat_filter_param);
                }
                ChatterFilterParam.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, filterParam.mchatter_filter_params);
                if (filterParam.mcalendar_filter_param != null) {
                    CalendarFilterParam.ADAPTER.encodeWithTag(protoWriter, 25, filterParam.mcalendar_filter_param);
                }
                if (filterParam.mdoc_filter_param != null) {
                    DocFilterParam.ADAPTER.encodeWithTag(protoWriter, 26, filterParam.mdoc_filter_param);
                }
                if (filterParam.mmessage_filter_param != null) {
                    MessageFilterParam.ADAPTER.encodeWithTag(protoWriter, 27, filterParam.mmessage_filter_param);
                }
                if (filterParam.mpano_tag_filter_param != null) {
                    PanoTagFilterParam.ADAPTER.encodeWithTag(protoWriter, 28, filterParam.mpano_tag_filter_param);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 29, filterParam.mdoc_sharer_ids);
                protoWriter.writeBytes(filterParam.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.searches.IntegrationSearchRequest$FilterParam$a */
        public static final class C50014a extends Message.Builder<FilterParam, C50014a> {

            /* renamed from: A */
            public MessageFilterParam f125068A;

            /* renamed from: B */
            public PanoTagFilterParam f125069B;

            /* renamed from: C */
            public List<String> f125070C = Internal.newMutableList();

            /* renamed from: a */
            public List<String> f125071a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f125072b = Internal.newMutableList();

            /* renamed from: c */
            public List<String> f125073c = Internal.newMutableList();

            /* renamed from: d */
            public Long f125074d;

            /* renamed from: e */
            public Long f125075e;

            /* renamed from: f */
            public Boolean f125076f;

            /* renamed from: g */
            public Long f125077g;

            /* renamed from: h */
            public String f125078h;

            /* renamed from: i */
            public Integer f125079i;

            /* renamed from: j */
            public Boolean f125080j;

            /* renamed from: k */
            public String f125081k;

            /* renamed from: l */
            public DocType f125082l;

            /* renamed from: m */
            public List<String> f125083m = Internal.newMutableList();

            /* renamed from: n */
            public List<String> f125084n = Internal.newMutableList();

            /* renamed from: o */
            public TimeLabel f125085o;

            /* renamed from: p */
            public Boolean f125086p;

            /* renamed from: q */
            public String f125087q;

            /* renamed from: r */
            public String f125088r;

            /* renamed from: s */
            public List<String> f125089s = Internal.newMutableList();

            /* renamed from: t */
            public List<Modifier> f125090t = Internal.newMutableList();

            /* renamed from: u */
            public List<String> f125091u = Internal.newMutableList();

            /* renamed from: v */
            public List<MessageTag> f125092v = Internal.newMutableList();

            /* renamed from: w */
            public ChatFilterParam f125093w;

            /* renamed from: x */
            public List<ChatterFilterParam> f125094x = Internal.newMutableList();

            /* renamed from: y */
            public CalendarFilterParam f125095y;

            /* renamed from: z */
            public DocFilterParam f125096z;

            /* renamed from: a */
            public FilterParam build() {
                return new FilterParam(this.f125071a, this.f125072b, this.f125073c, this.f125074d, this.f125075e, this.f125076f, this.f125077g, this.f125078h, this.f125079i, this.f125080j, this.f125081k, this.f125082l, this.f125083m, this.f125084n, this.f125085o, this.f125086p, this.f125087q, this.f125088r, this.f125089s, this.f125090t, this.f125091u, this.f125092v, this.f125093w, this.f125094x, this.f125095y, this.f125096z, this.f125068A, this.f125069B, this.f125070C, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50014a newBuilder() {
            C50014a aVar = new C50014a();
            aVar.f125071a = Internal.copyOf("mchat_ids", this.mchat_ids);
            aVar.f125072b = Internal.copyOf("memail_ids", this.memail_ids);
            aVar.f125073c = Internal.copyOf("mmessage_creator_ids", this.mmessage_creator_ids);
            aVar.f125074d = this.mmessage_start_time;
            aVar.f125075e = this.mmessage_end_time;
            aVar.f125076f = this.mneed_search_outer_tenant;
            aVar.f125077g = this.mlast_create_time;
            aVar.f125078h = this.mlast_message_id;
            aVar.f125079i = this.mcount;
            aVar.f125080j = this.mreverse;
            aVar.f125081k = this.mdoc_creator_id;
            aVar.f125082l = this.mdoc_type;
            aVar.f125083m = Internal.copyOf("mdoc_creator_ids", this.mdoc_creator_ids);
            aVar.f125084n = Internal.copyOf("mdoc_types", this.mdoc_types);
            aVar.f125085o = this.mtime_range;
            aVar.f125086p = this.mdo_not_search_resigned_user;
            aVar.f125087q = this.mis_read_message_id;
            aVar.f125088r = this.mexternal_id;
            aVar.f125089s = Internal.copyOf("mthread_ids", this.mthread_ids);
            aVar.f125090t = Internal.copyOf("mmodifiers", this.mmodifiers);
            aVar.f125091u = Internal.copyOf("mmessage_to_ids", this.mmessage_to_ids);
            aVar.f125092v = Internal.copyOf("mmessage_tags", this.mmessage_tags);
            aVar.f125093w = this.mchat_filter_param;
            aVar.f125094x = Internal.copyOf("mchatter_filter_params", this.mchatter_filter_params);
            aVar.f125095y = this.mcalendar_filter_param;
            aVar.f125096z = this.mdoc_filter_param;
            aVar.f125068A = this.mmessage_filter_param;
            aVar.f125069B = this.mpano_tag_filter_param;
            aVar.f125070C = Internal.copyOf("mdoc_sharer_ids", this.mdoc_sharer_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (!this.mchat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.mchat_ids);
            }
            if (!this.memail_ids.isEmpty()) {
                sb.append(", email_ids=");
                sb.append(this.memail_ids);
            }
            if (!this.mmessage_creator_ids.isEmpty()) {
                sb.append(", message_creator_ids=");
                sb.append(this.mmessage_creator_ids);
            }
            if (this.mmessage_start_time != null) {
                sb.append(", message_start_time=");
                sb.append(this.mmessage_start_time);
            }
            if (this.mmessage_end_time != null) {
                sb.append(", message_end_time=");
                sb.append(this.mmessage_end_time);
            }
            if (this.mneed_search_outer_tenant != null) {
                sb.append(", need_search_outer_tenant=");
                sb.append(this.mneed_search_outer_tenant);
            }
            if (this.mlast_create_time != null) {
                sb.append(", last_create_time=");
                sb.append(this.mlast_create_time);
            }
            if (this.mlast_message_id != null) {
                sb.append(", last_message_id=");
                sb.append(this.mlast_message_id);
            }
            if (this.mcount != null) {
                sb.append(", count=");
                sb.append(this.mcount);
            }
            if (this.mreverse != null) {
                sb.append(", reverse=");
                sb.append(this.mreverse);
            }
            if (this.mdoc_creator_id != null) {
                sb.append(", doc_creator_id=");
                sb.append(this.mdoc_creator_id);
            }
            if (this.mdoc_type != null) {
                sb.append(", doc_type=");
                sb.append(this.mdoc_type);
            }
            if (!this.mdoc_creator_ids.isEmpty()) {
                sb.append(", doc_creator_ids=");
                sb.append(this.mdoc_creator_ids);
            }
            if (!this.mdoc_types.isEmpty()) {
                sb.append(", doc_types=");
                sb.append(this.mdoc_types);
            }
            if (this.mtime_range != null) {
                sb.append(", time_range=");
                sb.append(this.mtime_range);
            }
            if (this.mdo_not_search_resigned_user != null) {
                sb.append(", do_not_search_resigned_user=");
                sb.append(this.mdo_not_search_resigned_user);
            }
            if (this.mis_read_message_id != null) {
                sb.append(", is_read_message_id=");
                sb.append(this.mis_read_message_id);
            }
            if (this.mexternal_id != null) {
                sb.append(", external_id=");
                sb.append(this.mexternal_id);
            }
            if (!this.mthread_ids.isEmpty()) {
                sb.append(", thread_ids=");
                sb.append(this.mthread_ids);
            }
            if (!this.mmodifiers.isEmpty()) {
                sb.append(", modifiers=");
                sb.append(this.mmodifiers);
            }
            if (!this.mmessage_to_ids.isEmpty()) {
                sb.append(", message_to_ids=");
                sb.append(this.mmessage_to_ids);
            }
            if (!this.mmessage_tags.isEmpty()) {
                sb.append(", message_tags=");
                sb.append(this.mmessage_tags);
            }
            if (this.mchat_filter_param != null) {
                sb.append(", chat_filter_param=");
                sb.append(this.mchat_filter_param);
            }
            if (!this.mchatter_filter_params.isEmpty()) {
                sb.append(", chatter_filter_params=");
                sb.append(this.mchatter_filter_params);
            }
            if (this.mcalendar_filter_param != null) {
                sb.append(", calendar_filter_param=");
                sb.append(this.mcalendar_filter_param);
            }
            if (this.mdoc_filter_param != null) {
                sb.append(", doc_filter_param=");
                sb.append(this.mdoc_filter_param);
            }
            if (this.mmessage_filter_param != null) {
                sb.append(", message_filter_param=");
                sb.append(this.mmessage_filter_param);
            }
            if (this.mpano_tag_filter_param != null) {
                sb.append(", pano_tag_filter_param=");
                sb.append(this.mpano_tag_filter_param);
            }
            if (!this.mdoc_sharer_ids.isEmpty()) {
                sb.append(", doc_sharer_ids=");
                sb.append(this.mdoc_sharer_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "FilterParam{");
            replace.append('}');
            return replace.toString();
        }

        public FilterParam(List<String> list, List<String> list2, List<String> list3, Long l, Long l2, Boolean bool, Long l3, String str, Integer num, Boolean bool2, String str2, DocType docType, List<String> list4, List<String> list5, TimeLabel timeLabel, Boolean bool3, String str3, String str4, List<String> list6, List<Modifier> list7, List<String> list8, List<MessageTag> list9, ChatFilterParam chatFilterParam, List<ChatterFilterParam> list10, CalendarFilterParam calendarFilterParam, DocFilterParam docFilterParam, MessageFilterParam messageFilterParam, PanoTagFilterParam panoTagFilterParam, List<String> list11) {
            this(list, list2, list3, l, l2, bool, l3, str, num, bool2, str2, docType, list4, list5, timeLabel, bool3, str3, str4, list6, list7, list8, list9, chatFilterParam, list10, calendarFilterParam, docFilterParam, messageFilterParam, panoTagFilterParam, list11, ByteString.EMPTY);
        }

        public FilterParam(List<String> list, List<String> list2, List<String> list3, Long l, Long l2, Boolean bool, Long l3, String str, Integer num, Boolean bool2, String str2, DocType docType, List<String> list4, List<String> list5, TimeLabel timeLabel, Boolean bool3, String str3, String str4, List<String> list6, List<Modifier> list7, List<String> list8, List<MessageTag> list9, ChatFilterParam chatFilterParam, List<ChatterFilterParam> list10, CalendarFilterParam calendarFilterParam, DocFilterParam docFilterParam, MessageFilterParam messageFilterParam, PanoTagFilterParam panoTagFilterParam, List<String> list11, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mchat_ids = Internal.immutableCopyOf("mchat_ids", list);
            this.memail_ids = Internal.immutableCopyOf("memail_ids", list2);
            this.mmessage_creator_ids = Internal.immutableCopyOf("mmessage_creator_ids", list3);
            this.mmessage_start_time = l;
            this.mmessage_end_time = l2;
            this.mneed_search_outer_tenant = bool;
            this.mlast_create_time = l3;
            this.mlast_message_id = str;
            this.mcount = num;
            this.mreverse = bool2;
            this.mdoc_creator_id = str2;
            this.mdoc_type = docType;
            this.mdoc_creator_ids = Internal.immutableCopyOf("mdoc_creator_ids", list4);
            this.mdoc_types = Internal.immutableCopyOf("mdoc_types", list5);
            this.mtime_range = timeLabel;
            this.mdo_not_search_resigned_user = bool3;
            this.mis_read_message_id = str3;
            this.mexternal_id = str4;
            this.mthread_ids = Internal.immutableCopyOf("mthread_ids", list6);
            this.mmodifiers = Internal.immutableCopyOf("mmodifiers", list7);
            this.mmessage_to_ids = Internal.immutableCopyOf("mmessage_to_ids", list8);
            this.mmessage_tags = Internal.immutableCopyOf("mmessage_tags", list9);
            this.mchat_filter_param = chatFilterParam;
            this.mchatter_filter_params = Internal.immutableCopyOf("mchatter_filter_params", list10);
            this.mcalendar_filter_param = calendarFilterParam;
            this.mdoc_filter_param = docFilterParam;
            this.mmessage_filter_param = messageFilterParam;
            this.mpano_tag_filter_param = panoTagFilterParam;
            this.mdoc_sharer_ids = Internal.immutableCopyOf("mdoc_sharer_ids", list11);
        }
    }

    public enum QueryState implements WireEnum {
        Expand(0),
        Shrink(1);
        
        public static final ProtoAdapter<QueryState> ADAPTER = ProtoAdapter.newEnumAdapter(QueryState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static QueryState fromValue(int i) {
            if (i == 0) {
                return Expand;
            }
            if (i != 1) {
                return null;
            }
            return Shrink;
        }

        private QueryState(int i) {
            this.value = i;
        }
    }

    public static final class SearchExtraParam extends Message<SearchExtraParam, C50016a> {
        public static final ProtoAdapter<SearchExtraParam> ADAPTER = new C50017b();
        public static final ByteString DEFAULT_CHATTER_PERMISSONS_REQUEST = ByteString.EMPTY;
        private static final long serialVersionUID = 0;
        public final ByteString mchatter_permissons_request;

        /* renamed from: com.ss.android.lark.pb.searches.IntegrationSearchRequest$SearchExtraParam$b */
        private static final class C50017b extends ProtoAdapter<SearchExtraParam> {
            C50017b() {
                super(FieldEncoding.LENGTH_DELIMITED, SearchExtraParam.class);
            }

            /* renamed from: a */
            public int encodedSize(SearchExtraParam searchExtraParam) {
                int i;
                if (searchExtraParam.mchatter_permissons_request != null) {
                    i = ProtoAdapter.BYTES.encodedSizeWithTag(1, searchExtraParam.mchatter_permissons_request);
                } else {
                    i = 0;
                }
                return i + searchExtraParam.unknownFields().size();
            }

            /* renamed from: a */
            public SearchExtraParam decode(ProtoReader protoReader) throws IOException {
                C50016a aVar = new C50016a();
                aVar.f125097a = ByteString.EMPTY;
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
                        aVar.f125097a = ProtoAdapter.BYTES.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SearchExtraParam searchExtraParam) throws IOException {
                if (searchExtraParam.mchatter_permissons_request != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, searchExtraParam.mchatter_permissons_request);
                }
                protoWriter.writeBytes(searchExtraParam.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.searches.IntegrationSearchRequest$SearchExtraParam$a */
        public static final class C50016a extends Message.Builder<SearchExtraParam, C50016a> {

            /* renamed from: a */
            public ByteString f125097a;

            /* renamed from: a */
            public SearchExtraParam build() {
                return new SearchExtraParam(this.f125097a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50016a newBuilder() {
            C50016a aVar = new C50016a();
            aVar.f125097a = this.mchatter_permissons_request;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mchatter_permissons_request != null) {
                sb.append(", chatter_permissons_request=");
                sb.append(this.mchatter_permissons_request);
            }
            StringBuilder replace = sb.replace(0, 2, "SearchExtraParam{");
            replace.append('}');
            return replace.toString();
        }

        public SearchExtraParam(ByteString byteString) {
            this(byteString, ByteString.EMPTY);
        }

        public SearchExtraParam(ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            this.mchatter_permissons_request = byteString;
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.IntegrationSearchRequest$b */
    private static final class C50019b extends ProtoAdapter<IntegrationSearchRequest> {
        C50019b() {
            super(FieldEncoding.LENGTH_DELIMITED, IntegrationSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(IntegrationSearchRequest integrationSearchRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, integrationSearchRequest.mquery);
            int i10 = 0;
            if (integrationSearchRequest.mlocale_identifier != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, integrationSearchRequest.mlocale_identifier);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (integrationSearchRequest.mbegin != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, integrationSearchRequest.mbegin);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (integrationSearchRequest.mend != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, integrationSearchRequest.mend);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i12 + i3 + Scene.ADAPTER.encodedSizeWithTag(5, integrationSearchRequest.mscene);
            if (integrationSearchRequest.mfilter_param != null) {
                i4 = FilterParam.ADAPTER.encodedSizeWithTag(6, integrationSearchRequest.mfilter_param);
            } else {
                i4 = 0;
            }
            int i13 = encodedSizeWithTag2 + i4;
            if (integrationSearchRequest.msearch_session != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, integrationSearchRequest.msearch_session);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (integrationSearchRequest.mquery_state != null) {
                i6 = QueryState.ADAPTER.encodedSizeWithTag(8, integrationSearchRequest.mquery_state);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (integrationSearchRequest.mextras != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, integrationSearchRequest.mextras);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (integrationSearchRequest.mextra_param != null) {
                i8 = SearchExtraParam.ADAPTER.encodedSizeWithTag(10, integrationSearchRequest.mextra_param);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (integrationSearchRequest.mimpr_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(11, integrationSearchRequest.mimpr_id);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (integrationSearchRequest.mslash_command_param != null) {
                i10 = SlashCommandParam.ADAPTER.encodedSizeWithTag(12, integrationSearchRequest.mslash_command_param);
            }
            return i18 + i10 + integrationSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public IntegrationSearchRequest decode(ProtoReader protoReader) throws IOException {
            C50018a aVar = new C50018a();
            aVar.f125098a = "";
            aVar.f125099b = "zh_CN";
            aVar.f125100c = 0;
            aVar.f125101d = 10;
            aVar.f125104g = "";
            aVar.f125106i = "";
            aVar.f125108k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125098a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125099b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125100c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125101d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f125102e = Scene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f125103f = FilterParam.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125104g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f125105h = QueryState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f125106i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125107j = SearchExtraParam.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125108k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125109l = SlashCommandParam.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, IntegrationSearchRequest integrationSearchRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, integrationSearchRequest.mquery);
            if (integrationSearchRequest.mlocale_identifier != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, integrationSearchRequest.mlocale_identifier);
            }
            if (integrationSearchRequest.mbegin != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, integrationSearchRequest.mbegin);
            }
            if (integrationSearchRequest.mend != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, integrationSearchRequest.mend);
            }
            Scene.ADAPTER.encodeWithTag(protoWriter, 5, integrationSearchRequest.mscene);
            if (integrationSearchRequest.mfilter_param != null) {
                FilterParam.ADAPTER.encodeWithTag(protoWriter, 6, integrationSearchRequest.mfilter_param);
            }
            if (integrationSearchRequest.msearch_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, integrationSearchRequest.msearch_session);
            }
            if (integrationSearchRequest.mquery_state != null) {
                QueryState.ADAPTER.encodeWithTag(protoWriter, 8, integrationSearchRequest.mquery_state);
            }
            if (integrationSearchRequest.mextras != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, integrationSearchRequest.mextras);
            }
            if (integrationSearchRequest.mextra_param != null) {
                SearchExtraParam.ADAPTER.encodeWithTag(protoWriter, 10, integrationSearchRequest.mextra_param);
            }
            if (integrationSearchRequest.mimpr_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, integrationSearchRequest.mimpr_id);
            }
            if (integrationSearchRequest.mslash_command_param != null) {
                SlashCommandParam.ADAPTER.encodeWithTag(protoWriter, 12, integrationSearchRequest.mslash_command_param);
            }
            protoWriter.writeBytes(integrationSearchRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50018a newBuilder() {
        C50018a aVar = new C50018a();
        aVar.f125098a = this.mquery;
        aVar.f125099b = this.mlocale_identifier;
        aVar.f125100c = this.mbegin;
        aVar.f125101d = this.mend;
        aVar.f125102e = this.mscene;
        aVar.f125103f = this.mfilter_param;
        aVar.f125104g = this.msearch_session;
        aVar.f125105h = this.mquery_state;
        aVar.f125106i = this.mextras;
        aVar.f125107j = this.mextra_param;
        aVar.f125108k = this.mimpr_id;
        aVar.f125109l = this.mslash_command_param;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.searches.IntegrationSearchRequest$a */
    public static final class C50018a extends Message.Builder<IntegrationSearchRequest, C50018a> {

        /* renamed from: a */
        public String f125098a;

        /* renamed from: b */
        public String f125099b;

        /* renamed from: c */
        public Integer f125100c;

        /* renamed from: d */
        public Integer f125101d;

        /* renamed from: e */
        public Scene f125102e;

        /* renamed from: f */
        public FilterParam f125103f;

        /* renamed from: g */
        public String f125104g;

        /* renamed from: h */
        public QueryState f125105h;

        /* renamed from: i */
        public String f125106i;

        /* renamed from: j */
        public SearchExtraParam f125107j;

        /* renamed from: k */
        public String f125108k;

        /* renamed from: l */
        public SlashCommandParam f125109l;

        /* renamed from: a */
        public IntegrationSearchRequest build() {
            Scene scene;
            String str = this.f125098a;
            if (str != null && (scene = this.f125102e) != null) {
                return new IntegrationSearchRequest(str, this.f125099b, this.f125100c, this.f125101d, scene, this.f125103f, this.f125104g, this.f125105h, this.f125106i, this.f125107j, this.f125108k, this.f125109l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mquery", this.f125102e, "mscene");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.mquery);
        if (this.mlocale_identifier != null) {
            sb.append(", locale_identifier=");
            sb.append(this.mlocale_identifier);
        }
        if (this.mbegin != null) {
            sb.append(", begin=");
            sb.append(this.mbegin);
        }
        if (this.mend != null) {
            sb.append(", end=");
            sb.append(this.mend);
        }
        sb.append(", scene=");
        sb.append(this.mscene);
        if (this.mfilter_param != null) {
            sb.append(", filter_param=");
            sb.append(this.mfilter_param);
        }
        if (this.msearch_session != null) {
            sb.append(", search_session=");
            sb.append(this.msearch_session);
        }
        if (this.mquery_state != null) {
            sb.append(", query_state=");
            sb.append(this.mquery_state);
        }
        if (this.mextras != null) {
            sb.append(", extras=");
            sb.append(this.mextras);
        }
        if (this.mextra_param != null) {
            sb.append(", extra_param=");
            sb.append(this.mextra_param);
        }
        if (this.mimpr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.mimpr_id);
        }
        if (this.mslash_command_param != null) {
            sb.append(", slash_command_param=");
            sb.append(this.mslash_command_param);
        }
        StringBuilder replace = sb.replace(0, 2, "IntegrationSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public IntegrationSearchRequest(String str, String str2, Integer num, Integer num2, Scene scene, FilterParam filterParam, String str3, QueryState queryState, String str4, SearchExtraParam searchExtraParam, String str5, SlashCommandParam slashCommandParam) {
        this(str, str2, num, num2, scene, filterParam, str3, queryState, str4, searchExtraParam, str5, slashCommandParam, ByteString.EMPTY);
    }

    public IntegrationSearchRequest(String str, String str2, Integer num, Integer num2, Scene scene, FilterParam filterParam, String str3, QueryState queryState, String str4, SearchExtraParam searchExtraParam, String str5, SlashCommandParam slashCommandParam, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mquery = str;
        this.mlocale_identifier = str2;
        this.mbegin = num;
        this.mend = num2;
        this.mscene = scene;
        this.mfilter_param = filterParam;
        this.msearch_session = str3;
        this.mquery_state = queryState;
        this.mextras = str4;
        this.mextra_param = searchExtraParam;
        this.mimpr_id = str5;
        this.mslash_command_param = slashCommandParam;
    }
}
