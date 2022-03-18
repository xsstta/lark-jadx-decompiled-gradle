package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.search.slash.v1.SlashCommandParam;
import com.bytedance.lark.pb.search.v1.Scene;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class IntegrationSearchRequest extends Message<IntegrationSearchRequest, C18831a> {
    public static final ProtoAdapter<IntegrationSearchRequest> ADAPTER = new C18832b();
    public static final Integer DEFAULT_BEGIN = 0;
    public static final Integer DEFAULT_END = 10;
    public static final QueryState DEFAULT_QUERY_STATE = QueryState.Expand;
    public static final Scene.Type DEFAULT_SCENE_TYPE = Scene.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer begin;
    public final Integer end;
    public final SearchExtraParam extra_param;
    public final String extras;
    public final FilterParam filter_param;
    public final String impr_id;
    public final String query;
    public final QueryState query_state;
    public final Scene.Type scene_type;
    public final String search_session;
    public final SlashCommandParam slash_command_param;

    public static final class FilterParam extends Message<FilterParam, C18827a> {
        public static final ProtoAdapter<FilterParam> ADAPTER = new C18828b();
        public static final Integer DEFAULT_COUNT = 10;
        public static final Doc.Type DEFAULT_DOC_TYPE = Doc.Type.UNKNOWN;
        public static final Boolean DEFAULT_DO_NOT_SEARCH_RESIGNED_USER = false;
        public static final Long DEFAULT_LAST_CREATE_TIME = 0L;
        public static final Long DEFAULT_MESSAGE_END_TIME = 0L;
        public static final Long DEFAULT_MESSAGE_START_TIME = 0L;
        public static final Boolean DEFAULT_NEED_SEARCH_OUTER_TENANT = false;
        public static final Boolean DEFAULT_REVERSE = false;
        public static final TimeLabel DEFAULT_TIME_RANGE = TimeLabel.UNLIMITED;
        private static final long serialVersionUID = 0;
        public final CalendarFilterParam calendar_filter_param;
        public final ChatFilterParam chat_filter_param;
        public final List<String> chat_ids;
        public final List<ChatterFilterParam> chatter_filter_params;
        public final Integer count;
        public final Boolean do_not_search_resigned_user;
        public final String doc_creator_id;
        public final List<String> doc_creator_ids;
        public final DocFilterParam doc_filter_param;
        public final List<String> doc_sharer_ids;
        public final Doc.Type doc_type;
        public final List<String> doc_types;
        public final List<String> email_ids;
        public final String external_id;
        public final String is_read_message_id;
        public final Long last_create_time;
        public final String last_message_id;
        public final List<String> message_creator_ids;
        public final Long message_end_time;
        public final MessageFilterParam message_filter_param;
        public final Long message_start_time;
        public final List<MessageTag> message_tags;
        public final List<String> message_to_ids;
        public final List<Modifier> modifiers;
        public final Boolean need_search_outer_tenant;
        public final Boolean reverse;
        public final List<String> thread_ids;
        public final TimeLabel time_range;

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

        /* renamed from: com.bytedance.lark.pb.search.v1.IntegrationSearchRequest$FilterParam$b */
        private static final class C18828b extends ProtoAdapter<FilterParam> {
            C18828b() {
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
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, filterParam.chat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, filterParam.email_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, filterParam.message_creator_ids);
                int i17 = 0;
                if (filterParam.message_start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(4, filterParam.message_start_time);
                } else {
                    i = 0;
                }
                int i18 = encodedSizeWithTag + i;
                if (filterParam.message_end_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(5, filterParam.message_end_time);
                } else {
                    i2 = 0;
                }
                int i19 = i18 + i2;
                if (filterParam.need_search_outer_tenant != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, filterParam.need_search_outer_tenant);
                } else {
                    i3 = 0;
                }
                int i20 = i19 + i3;
                if (filterParam.last_create_time != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(7, filterParam.last_create_time);
                } else {
                    i4 = 0;
                }
                int i21 = i20 + i4;
                if (filterParam.last_message_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, filterParam.last_message_id);
                } else {
                    i5 = 0;
                }
                int i22 = i21 + i5;
                if (filterParam.count != null) {
                    i6 = ProtoAdapter.INT32.encodedSizeWithTag(9, filterParam.count);
                } else {
                    i6 = 0;
                }
                int i23 = i22 + i6;
                if (filterParam.reverse != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(10, filterParam.reverse);
                } else {
                    i7 = 0;
                }
                int i24 = i23 + i7;
                if (filterParam.doc_creator_id != null) {
                    i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, filterParam.doc_creator_id);
                } else {
                    i8 = 0;
                }
                int i25 = i24 + i8;
                if (filterParam.doc_type != null) {
                    i9 = Doc.Type.ADAPTER.encodedSizeWithTag(12, filterParam.doc_type);
                } else {
                    i9 = 0;
                }
                int encodedSizeWithTag2 = i25 + i9 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(13, filterParam.doc_creator_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(14, filterParam.doc_types);
                if (filterParam.time_range != null) {
                    i10 = TimeLabel.ADAPTER.encodedSizeWithTag(15, filterParam.time_range);
                } else {
                    i10 = 0;
                }
                int i26 = encodedSizeWithTag2 + i10;
                if (filterParam.do_not_search_resigned_user != null) {
                    i11 = ProtoAdapter.BOOL.encodedSizeWithTag(16, filterParam.do_not_search_resigned_user);
                } else {
                    i11 = 0;
                }
                int i27 = i26 + i11;
                if (filterParam.is_read_message_id != null) {
                    i12 = ProtoAdapter.STRING.encodedSizeWithTag(17, filterParam.is_read_message_id);
                } else {
                    i12 = 0;
                }
                int i28 = i27 + i12;
                if (filterParam.external_id != null) {
                    i13 = ProtoAdapter.STRING.encodedSizeWithTag(18, filterParam.external_id);
                } else {
                    i13 = 0;
                }
                int encodedSizeWithTag3 = i28 + i13 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(19, filterParam.thread_ids) + Modifier.ADAPTER.asRepeated().encodedSizeWithTag(20, filterParam.modifiers) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(21, filterParam.message_to_ids) + MessageTag.ADAPTER.asRepeated().encodedSizeWithTag(22, filterParam.message_tags);
                if (filterParam.chat_filter_param != null) {
                    i14 = ChatFilterParam.ADAPTER.encodedSizeWithTag(23, filterParam.chat_filter_param);
                } else {
                    i14 = 0;
                }
                int encodedSizeWithTag4 = encodedSizeWithTag3 + i14 + ChatterFilterParam.ADAPTER.asRepeated().encodedSizeWithTag(24, filterParam.chatter_filter_params);
                if (filterParam.calendar_filter_param != null) {
                    i15 = CalendarFilterParam.ADAPTER.encodedSizeWithTag(25, filterParam.calendar_filter_param);
                } else {
                    i15 = 0;
                }
                int i29 = encodedSizeWithTag4 + i15;
                if (filterParam.doc_filter_param != null) {
                    i16 = DocFilterParam.ADAPTER.encodedSizeWithTag(26, filterParam.doc_filter_param);
                } else {
                    i16 = 0;
                }
                int i30 = i29 + i16;
                if (filterParam.message_filter_param != null) {
                    i17 = MessageFilterParam.ADAPTER.encodedSizeWithTag(27, filterParam.message_filter_param);
                }
                return i30 + i17 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(30, filterParam.doc_sharer_ids) + filterParam.unknownFields().size();
            }

            /* renamed from: a */
            public FilterParam decode(ProtoReader protoReader) throws IOException {
                C18827a aVar = new C18827a();
                aVar.f46397d = 0L;
                aVar.f46398e = 0L;
                aVar.f46399f = false;
                aVar.f46400g = 0L;
                aVar.f46401h = "";
                aVar.f46402i = 10;
                aVar.f46403j = false;
                aVar.f46404k = "";
                aVar.f46405l = Doc.Type.UNKNOWN;
                aVar.f46408o = TimeLabel.UNLIMITED;
                aVar.f46409p = false;
                aVar.f46410q = "";
                aVar.f46411r = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 30) {
                        switch (nextTag) {
                            case 1:
                                aVar.f46394a.add(ProtoAdapter.STRING.decode(protoReader));
                                continue;
                            case 2:
                                aVar.f46395b.add(ProtoAdapter.STRING.decode(protoReader));
                                continue;
                            case 3:
                                aVar.f46396c.add(ProtoAdapter.STRING.decode(protoReader));
                                continue;
                            case 4:
                                aVar.f46397d = ProtoAdapter.INT64.decode(protoReader);
                                continue;
                            case 5:
                                aVar.f46398e = ProtoAdapter.INT64.decode(protoReader);
                                continue;
                            case 6:
                                aVar.f46399f = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 7:
                                aVar.f46400g = ProtoAdapter.INT64.decode(protoReader);
                                continue;
                            case 8:
                                aVar.f46401h = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 9:
                                aVar.f46402i = ProtoAdapter.INT32.decode(protoReader);
                                continue;
                            case 10:
                                aVar.f46403j = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 11:
                                aVar.f46404k = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                try {
                                    aVar.f46405l = Doc.Type.ADAPTER.decode(protoReader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 13:
                                aVar.f46406m.add(ProtoAdapter.STRING.decode(protoReader));
                                continue;
                            case 14:
                                aVar.f46407n.add(ProtoAdapter.STRING.decode(protoReader));
                                continue;
                            case 15:
                                try {
                                    aVar.f46408o = TimeLabel.ADAPTER.decode(protoReader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 16:
                                aVar.f46409p = ProtoAdapter.BOOL.decode(protoReader);
                                continue;
                            case 17:
                                aVar.f46410q = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 18:
                                aVar.f46411r = ProtoAdapter.STRING.decode(protoReader);
                                continue;
                            case 19:
                                aVar.f46412s.add(ProtoAdapter.STRING.decode(protoReader));
                                continue;
                            case 20:
                                aVar.f46413t.add(Modifier.ADAPTER.decode(protoReader));
                                continue;
                            case 21:
                                aVar.f46414u.add(ProtoAdapter.STRING.decode(protoReader));
                                continue;
                            case 22:
                                try {
                                    aVar.f46415v.add(MessageTag.ADAPTER.decode(protoReader));
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                    break;
                                }
                            case 23:
                                aVar.f46416w = ChatFilterParam.ADAPTER.decode(protoReader);
                                continue;
                            case 24:
                                aVar.f46417x.add(ChatterFilterParam.ADAPTER.decode(protoReader));
                                continue;
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                aVar.f46418y = CalendarFilterParam.ADAPTER.decode(protoReader);
                                continue;
                            case 26:
                                aVar.f46419z = DocFilterParam.ADAPTER.decode(protoReader);
                                continue;
                            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                                aVar.f46392A = MessageFilterParam.ADAPTER.decode(protoReader);
                                continue;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                continue;
                        }
                    } else {
                        aVar.f46393B.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FilterParam filterParam) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, filterParam.chat_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, filterParam.email_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, filterParam.message_creator_ids);
                if (filterParam.message_start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, filterParam.message_start_time);
                }
                if (filterParam.message_end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, filterParam.message_end_time);
                }
                if (filterParam.need_search_outer_tenant != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, filterParam.need_search_outer_tenant);
                }
                if (filterParam.last_create_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, filterParam.last_create_time);
                }
                if (filterParam.last_message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, filterParam.last_message_id);
                }
                if (filterParam.count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, filterParam.count);
                }
                if (filterParam.reverse != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, filterParam.reverse);
                }
                if (filterParam.doc_creator_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, filterParam.doc_creator_id);
                }
                if (filterParam.doc_type != null) {
                    Doc.Type.ADAPTER.encodeWithTag(protoWriter, 12, filterParam.doc_type);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 13, filterParam.doc_creator_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 14, filterParam.doc_types);
                if (filterParam.time_range != null) {
                    TimeLabel.ADAPTER.encodeWithTag(protoWriter, 15, filterParam.time_range);
                }
                if (filterParam.do_not_search_resigned_user != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, filterParam.do_not_search_resigned_user);
                }
                if (filterParam.is_read_message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, filterParam.is_read_message_id);
                }
                if (filterParam.external_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, filterParam.external_id);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 19, filterParam.thread_ids);
                Modifier.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, filterParam.modifiers);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 21, filterParam.message_to_ids);
                MessageTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, filterParam.message_tags);
                if (filterParam.chat_filter_param != null) {
                    ChatFilterParam.ADAPTER.encodeWithTag(protoWriter, 23, filterParam.chat_filter_param);
                }
                ChatterFilterParam.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, filterParam.chatter_filter_params);
                if (filterParam.calendar_filter_param != null) {
                    CalendarFilterParam.ADAPTER.encodeWithTag(protoWriter, 25, filterParam.calendar_filter_param);
                }
                if (filterParam.doc_filter_param != null) {
                    DocFilterParam.ADAPTER.encodeWithTag(protoWriter, 26, filterParam.doc_filter_param);
                }
                if (filterParam.message_filter_param != null) {
                    MessageFilterParam.ADAPTER.encodeWithTag(protoWriter, 27, filterParam.message_filter_param);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 30, filterParam.doc_sharer_ids);
                protoWriter.writeBytes(filterParam.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18827a newBuilder() {
            C18827a aVar = new C18827a();
            aVar.f46394a = Internal.copyOf("chat_ids", this.chat_ids);
            aVar.f46395b = Internal.copyOf("email_ids", this.email_ids);
            aVar.f46396c = Internal.copyOf("message_creator_ids", this.message_creator_ids);
            aVar.f46397d = this.message_start_time;
            aVar.f46398e = this.message_end_time;
            aVar.f46399f = this.need_search_outer_tenant;
            aVar.f46400g = this.last_create_time;
            aVar.f46401h = this.last_message_id;
            aVar.f46402i = this.count;
            aVar.f46403j = this.reverse;
            aVar.f46404k = this.doc_creator_id;
            aVar.f46405l = this.doc_type;
            aVar.f46406m = Internal.copyOf("doc_creator_ids", this.doc_creator_ids);
            aVar.f46407n = Internal.copyOf("doc_types", this.doc_types);
            aVar.f46408o = this.time_range;
            aVar.f46409p = this.do_not_search_resigned_user;
            aVar.f46410q = this.is_read_message_id;
            aVar.f46411r = this.external_id;
            aVar.f46412s = Internal.copyOf("thread_ids", this.thread_ids);
            aVar.f46413t = Internal.copyOf("modifiers", this.modifiers);
            aVar.f46414u = Internal.copyOf("message_to_ids", this.message_to_ids);
            aVar.f46415v = Internal.copyOf("message_tags", this.message_tags);
            aVar.f46416w = this.chat_filter_param;
            aVar.f46417x = Internal.copyOf("chatter_filter_params", this.chatter_filter_params);
            aVar.f46418y = this.calendar_filter_param;
            aVar.f46419z = this.doc_filter_param;
            aVar.f46392A = this.message_filter_param;
            aVar.f46393B = Internal.copyOf("doc_sharer_ids", this.doc_sharer_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.IntegrationSearchRequest$FilterParam$a */
        public static final class C18827a extends Message.Builder<FilterParam, C18827a> {

            /* renamed from: A */
            public MessageFilterParam f46392A;

            /* renamed from: B */
            public List<String> f46393B = Internal.newMutableList();

            /* renamed from: a */
            public List<String> f46394a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f46395b = Internal.newMutableList();

            /* renamed from: c */
            public List<String> f46396c = Internal.newMutableList();

            /* renamed from: d */
            public Long f46397d;

            /* renamed from: e */
            public Long f46398e;

            /* renamed from: f */
            public Boolean f46399f;

            /* renamed from: g */
            public Long f46400g;

            /* renamed from: h */
            public String f46401h;

            /* renamed from: i */
            public Integer f46402i;

            /* renamed from: j */
            public Boolean f46403j;

            /* renamed from: k */
            public String f46404k;

            /* renamed from: l */
            public Doc.Type f46405l;

            /* renamed from: m */
            public List<String> f46406m = Internal.newMutableList();

            /* renamed from: n */
            public List<String> f46407n = Internal.newMutableList();

            /* renamed from: o */
            public TimeLabel f46408o;

            /* renamed from: p */
            public Boolean f46409p;

            /* renamed from: q */
            public String f46410q;

            /* renamed from: r */
            public String f46411r;

            /* renamed from: s */
            public List<String> f46412s = Internal.newMutableList();

            /* renamed from: t */
            public List<Modifier> f46413t = Internal.newMutableList();

            /* renamed from: u */
            public List<String> f46414u = Internal.newMutableList();

            /* renamed from: v */
            public List<MessageTag> f46415v = Internal.newMutableList();

            /* renamed from: w */
            public ChatFilterParam f46416w;

            /* renamed from: x */
            public List<ChatterFilterParam> f46417x = Internal.newMutableList();

            /* renamed from: y */
            public CalendarFilterParam f46418y;

            /* renamed from: z */
            public DocFilterParam f46419z;

            /* renamed from: a */
            public FilterParam build() {
                return new FilterParam(this.f46394a, this.f46395b, this.f46396c, this.f46397d, this.f46398e, this.f46399f, this.f46400g, this.f46401h, this.f46402i, this.f46403j, this.f46404k, this.f46405l, this.f46406m, this.f46407n, this.f46408o, this.f46409p, this.f46410q, this.f46411r, this.f46412s, this.f46413t, this.f46414u, this.f46415v, this.f46416w, this.f46417x, this.f46418y, this.f46419z, this.f46392A, this.f46393B, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18827a mo64630a(CalendarFilterParam calendarFilterParam) {
                this.f46418y = calendarFilterParam;
                return this;
            }

            /* renamed from: b */
            public C18827a mo64638b(Boolean bool) {
                this.f46403j = bool;
                return this;
            }

            /* renamed from: c */
            public C18827a mo64641c(Boolean bool) {
                this.f46409p = bool;
                return this;
            }

            /* renamed from: a */
            public C18827a mo64631a(ChatFilterParam chatFilterParam) {
                this.f46416w = chatFilterParam;
                return this;
            }

            /* renamed from: b */
            public C18827a mo64639b(Long l) {
                this.f46398e = l;
                return this;
            }

            /* renamed from: c */
            public C18827a mo64642c(Long l) {
                this.f46400g = l;
                return this;
            }

            /* renamed from: d */
            public C18827a mo64644d(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f46406m = list;
                return this;
            }

            /* renamed from: e */
            public C18827a mo64645e(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f46407n = list;
                return this;
            }

            /* renamed from: f */
            public C18827a mo64646f(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f46412s = list;
                return this;
            }

            /* renamed from: g */
            public C18827a mo64647g(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f46414u = list;
                return this;
            }

            /* renamed from: h */
            public C18827a mo64648h(List<MessageTag> list) {
                Internal.checkElementsNotNull(list);
                this.f46415v = list;
                return this;
            }

            /* renamed from: a */
            public C18827a mo64632a(Boolean bool) {
                this.f46399f = bool;
                return this;
            }

            /* renamed from: b */
            public C18827a mo64640b(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f46395b = list;
                return this;
            }

            /* renamed from: c */
            public C18827a mo64643c(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f46396c = list;
                return this;
            }

            /* renamed from: a */
            public C18827a mo64633a(Integer num) {
                this.f46402i = num;
                return this;
            }

            /* renamed from: a */
            public C18827a mo64634a(Long l) {
                this.f46397d = l;
                return this;
            }

            /* renamed from: a */
            public C18827a mo64635a(String str) {
                this.f46401h = str;
                return this;
            }

            /* renamed from: a */
            public C18827a mo64636a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f46394a = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "FilterParam");
            StringBuilder sb = new StringBuilder();
            if (!this.chat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.chat_ids);
            }
            if (!this.email_ids.isEmpty()) {
                sb.append(", email_ids=");
                sb.append(this.email_ids);
            }
            if (!this.message_creator_ids.isEmpty()) {
                sb.append(", message_creator_ids=");
                sb.append(this.message_creator_ids);
            }
            if (this.message_start_time != null) {
                sb.append(", message_start_time=");
                sb.append(this.message_start_time);
            }
            if (this.message_end_time != null) {
                sb.append(", message_end_time=");
                sb.append(this.message_end_time);
            }
            if (this.need_search_outer_tenant != null) {
                sb.append(", need_search_outer_tenant=");
                sb.append(this.need_search_outer_tenant);
            }
            if (this.last_create_time != null) {
                sb.append(", last_create_time=");
                sb.append(this.last_create_time);
            }
            if (this.last_message_id != null) {
                sb.append(", last_message_id=");
                sb.append(this.last_message_id);
            }
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            if (this.reverse != null) {
                sb.append(", reverse=");
                sb.append(this.reverse);
            }
            if (this.doc_creator_id != null) {
                sb.append(", doc_creator_id=");
                sb.append(this.doc_creator_id);
            }
            if (this.doc_type != null) {
                sb.append(", doc_type=");
                sb.append(this.doc_type);
            }
            if (!this.doc_creator_ids.isEmpty()) {
                sb.append(", doc_creator_ids=");
                sb.append(this.doc_creator_ids);
            }
            if (!this.doc_types.isEmpty()) {
                sb.append(", doc_types=");
                sb.append(this.doc_types);
            }
            if (this.time_range != null) {
                sb.append(", time_range=");
                sb.append(this.time_range);
            }
            if (this.do_not_search_resigned_user != null) {
                sb.append(", do_not_search_resigned_user=");
                sb.append(this.do_not_search_resigned_user);
            }
            if (this.is_read_message_id != null) {
                sb.append(", is_read_message_id=");
                sb.append(this.is_read_message_id);
            }
            if (this.external_id != null) {
                sb.append(", external_id=");
                sb.append(this.external_id);
            }
            if (!this.thread_ids.isEmpty()) {
                sb.append(", thread_ids=");
                sb.append(this.thread_ids);
            }
            if (!this.modifiers.isEmpty()) {
                sb.append(", modifiers=");
                sb.append(this.modifiers);
            }
            if (!this.message_to_ids.isEmpty()) {
                sb.append(", message_to_ids=");
                sb.append(this.message_to_ids);
            }
            if (!this.message_tags.isEmpty()) {
                sb.append(", message_tags=");
                sb.append(this.message_tags);
            }
            if (this.chat_filter_param != null) {
                sb.append(", chat_filter_param=");
                sb.append(this.chat_filter_param);
            }
            if (!this.chatter_filter_params.isEmpty()) {
                sb.append(", chatter_filter_params=");
                sb.append(this.chatter_filter_params);
            }
            if (this.calendar_filter_param != null) {
                sb.append(", calendar_filter_param=");
                sb.append(this.calendar_filter_param);
            }
            if (this.doc_filter_param != null) {
                sb.append(", doc_filter_param=");
                sb.append(this.doc_filter_param);
            }
            if (this.message_filter_param != null) {
                sb.append(", message_filter_param=");
                sb.append(this.message_filter_param);
            }
            if (!this.doc_sharer_ids.isEmpty()) {
                sb.append(", doc_sharer_ids=");
                sb.append(this.doc_sharer_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "FilterParam{");
            replace.append('}');
            return replace.toString();
        }

        public FilterParam(List<String> list, List<String> list2, List<String> list3, Long l, Long l2, Boolean bool, Long l3, String str, Integer num, Boolean bool2, String str2, Doc.Type type, List<String> list4, List<String> list5, TimeLabel timeLabel, Boolean bool3, String str3, String str4, List<String> list6, List<Modifier> list7, List<String> list8, List<MessageTag> list9, ChatFilterParam chatFilterParam, List<ChatterFilterParam> list10, CalendarFilterParam calendarFilterParam, DocFilterParam docFilterParam, MessageFilterParam messageFilterParam, List<String> list11) {
            this(list, list2, list3, l, l2, bool, l3, str, num, bool2, str2, type, list4, list5, timeLabel, bool3, str3, str4, list6, list7, list8, list9, chatFilterParam, list10, calendarFilterParam, docFilterParam, messageFilterParam, list11, ByteString.EMPTY);
        }

        public FilterParam(List<String> list, List<String> list2, List<String> list3, Long l, Long l2, Boolean bool, Long l3, String str, Integer num, Boolean bool2, String str2, Doc.Type type, List<String> list4, List<String> list5, TimeLabel timeLabel, Boolean bool3, String str3, String str4, List<String> list6, List<Modifier> list7, List<String> list8, List<MessageTag> list9, ChatFilterParam chatFilterParam, List<ChatterFilterParam> list10, CalendarFilterParam calendarFilterParam, DocFilterParam docFilterParam, MessageFilterParam messageFilterParam, List<String> list11, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
            this.email_ids = Internal.immutableCopyOf("email_ids", list2);
            this.message_creator_ids = Internal.immutableCopyOf("message_creator_ids", list3);
            this.message_start_time = l;
            this.message_end_time = l2;
            this.need_search_outer_tenant = bool;
            this.last_create_time = l3;
            this.last_message_id = str;
            this.count = num;
            this.reverse = bool2;
            this.doc_creator_id = str2;
            this.doc_type = type;
            this.doc_creator_ids = Internal.immutableCopyOf("doc_creator_ids", list4);
            this.doc_types = Internal.immutableCopyOf("doc_types", list5);
            this.time_range = timeLabel;
            this.do_not_search_resigned_user = bool3;
            this.is_read_message_id = str3;
            this.external_id = str4;
            this.thread_ids = Internal.immutableCopyOf("thread_ids", list6);
            this.modifiers = Internal.immutableCopyOf("modifiers", list7);
            this.message_to_ids = Internal.immutableCopyOf("message_to_ids", list8);
            this.message_tags = Internal.immutableCopyOf("message_tags", list9);
            this.chat_filter_param = chatFilterParam;
            this.chatter_filter_params = Internal.immutableCopyOf("chatter_filter_params", list10);
            this.calendar_filter_param = calendarFilterParam;
            this.doc_filter_param = docFilterParam;
            this.message_filter_param = messageFilterParam;
            this.doc_sharer_ids = Internal.immutableCopyOf("doc_sharer_ids", list11);
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

    public static final class SearchExtraParam extends Message<SearchExtraParam, C18829a> {
        public static final ProtoAdapter<SearchExtraParam> ADAPTER = new C18830b();
        private static final long serialVersionUID = 0;
        public final ChatterPermissionsRequest chatter_permissions_request;

        /* renamed from: com.bytedance.lark.pb.search.v1.IntegrationSearchRequest$SearchExtraParam$b */
        private static final class C18830b extends ProtoAdapter<SearchExtraParam> {
            C18830b() {
                super(FieldEncoding.LENGTH_DELIMITED, SearchExtraParam.class);
            }

            /* renamed from: a */
            public int encodedSize(SearchExtraParam searchExtraParam) {
                int i;
                if (searchExtraParam.chatter_permissions_request != null) {
                    i = ChatterPermissionsRequest.ADAPTER.encodedSizeWithTag(1, searchExtraParam.chatter_permissions_request);
                } else {
                    i = 0;
                }
                return i + searchExtraParam.unknownFields().size();
            }

            /* renamed from: a */
            public SearchExtraParam decode(ProtoReader protoReader) throws IOException {
                C18829a aVar = new C18829a();
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
                        aVar.f46420a = ChatterPermissionsRequest.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SearchExtraParam searchExtraParam) throws IOException {
                if (searchExtraParam.chatter_permissions_request != null) {
                    ChatterPermissionsRequest.ADAPTER.encodeWithTag(protoWriter, 1, searchExtraParam.chatter_permissions_request);
                }
                protoWriter.writeBytes(searchExtraParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.IntegrationSearchRequest$SearchExtraParam$a */
        public static final class C18829a extends Message.Builder<SearchExtraParam, C18829a> {

            /* renamed from: a */
            public ChatterPermissionsRequest f46420a;

            /* renamed from: a */
            public SearchExtraParam build() {
                return new SearchExtraParam(this.f46420a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18829a mo64652a(ChatterPermissionsRequest chatterPermissionsRequest) {
                this.f46420a = chatterPermissionsRequest;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18829a newBuilder() {
            C18829a aVar = new C18829a();
            aVar.f46420a = this.chatter_permissions_request;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SearchExtraParam");
            StringBuilder sb = new StringBuilder();
            if (this.chatter_permissions_request != null) {
                sb.append(", chatter_permissions_request=");
                sb.append(this.chatter_permissions_request);
            }
            StringBuilder replace = sb.replace(0, 2, "SearchExtraParam{");
            replace.append('}');
            return replace.toString();
        }

        public SearchExtraParam(ChatterPermissionsRequest chatterPermissionsRequest) {
            this(chatterPermissionsRequest, ByteString.EMPTY);
        }

        public SearchExtraParam(ChatterPermissionsRequest chatterPermissionsRequest, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chatter_permissions_request = chatterPermissionsRequest;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.IntegrationSearchRequest$b */
    private static final class C18832b extends ProtoAdapter<IntegrationSearchRequest> {
        C18832b() {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, integrationSearchRequest.query);
            int i9 = 0;
            if (integrationSearchRequest.begin != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, integrationSearchRequest.begin);
            } else {
                i = 0;
            }
            int i10 = encodedSizeWithTag + i;
            if (integrationSearchRequest.end != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, integrationSearchRequest.end);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i10 + i2 + Scene.Type.ADAPTER.encodedSizeWithTag(4, integrationSearchRequest.scene_type);
            if (integrationSearchRequest.filter_param != null) {
                i3 = FilterParam.ADAPTER.encodedSizeWithTag(5, integrationSearchRequest.filter_param);
            } else {
                i3 = 0;
            }
            int i11 = encodedSizeWithTag2 + i3;
            if (integrationSearchRequest.search_session != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, integrationSearchRequest.search_session);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (integrationSearchRequest.query_state != null) {
                i5 = QueryState.ADAPTER.encodedSizeWithTag(7, integrationSearchRequest.query_state);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (integrationSearchRequest.extras != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, integrationSearchRequest.extras);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (integrationSearchRequest.extra_param != null) {
                i7 = SearchExtraParam.ADAPTER.encodedSizeWithTag(9, integrationSearchRequest.extra_param);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (integrationSearchRequest.impr_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(10, integrationSearchRequest.impr_id);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (integrationSearchRequest.slash_command_param != null) {
                i9 = SlashCommandParam.ADAPTER.encodedSizeWithTag(11, integrationSearchRequest.slash_command_param);
            }
            return i16 + i9 + integrationSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public IntegrationSearchRequest decode(ProtoReader protoReader) throws IOException {
            C18831a aVar = new C18831a();
            aVar.f46421a = "";
            aVar.f46422b = 0;
            aVar.f46423c = 10;
            aVar.f46424d = Scene.Type.UNKNOWN;
            aVar.f46426f = "";
            aVar.f46427g = QueryState.Expand;
            aVar.f46428h = "";
            aVar.f46430j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46421a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46422b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46423c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f46424d = Scene.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f46425e = FilterParam.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46426f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f46427g = QueryState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 8:
                            aVar.f46428h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46429i = SearchExtraParam.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46430j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46431k = SlashCommandParam.ADAPTER.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, integrationSearchRequest.query);
            if (integrationSearchRequest.begin != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, integrationSearchRequest.begin);
            }
            if (integrationSearchRequest.end != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, integrationSearchRequest.end);
            }
            Scene.Type.ADAPTER.encodeWithTag(protoWriter, 4, integrationSearchRequest.scene_type);
            if (integrationSearchRequest.filter_param != null) {
                FilterParam.ADAPTER.encodeWithTag(protoWriter, 5, integrationSearchRequest.filter_param);
            }
            if (integrationSearchRequest.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, integrationSearchRequest.search_session);
            }
            if (integrationSearchRequest.query_state != null) {
                QueryState.ADAPTER.encodeWithTag(protoWriter, 7, integrationSearchRequest.query_state);
            }
            if (integrationSearchRequest.extras != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, integrationSearchRequest.extras);
            }
            if (integrationSearchRequest.extra_param != null) {
                SearchExtraParam.ADAPTER.encodeWithTag(protoWriter, 9, integrationSearchRequest.extra_param);
            }
            if (integrationSearchRequest.impr_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, integrationSearchRequest.impr_id);
            }
            if (integrationSearchRequest.slash_command_param != null) {
                SlashCommandParam.ADAPTER.encodeWithTag(protoWriter, 11, integrationSearchRequest.slash_command_param);
            }
            protoWriter.writeBytes(integrationSearchRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18831a newBuilder() {
        C18831a aVar = new C18831a();
        aVar.f46421a = this.query;
        aVar.f46422b = this.begin;
        aVar.f46423c = this.end;
        aVar.f46424d = this.scene_type;
        aVar.f46425e = this.filter_param;
        aVar.f46426f = this.search_session;
        aVar.f46427g = this.query_state;
        aVar.f46428h = this.extras;
        aVar.f46429i = this.extra_param;
        aVar.f46430j = this.impr_id;
        aVar.f46431k = this.slash_command_param;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.IntegrationSearchRequest$a */
    public static final class C18831a extends Message.Builder<IntegrationSearchRequest, C18831a> {

        /* renamed from: a */
        public String f46421a;

        /* renamed from: b */
        public Integer f46422b;

        /* renamed from: c */
        public Integer f46423c;

        /* renamed from: d */
        public Scene.Type f46424d;

        /* renamed from: e */
        public FilterParam f46425e;

        /* renamed from: f */
        public String f46426f;

        /* renamed from: g */
        public QueryState f46427g;

        /* renamed from: h */
        public String f46428h;

        /* renamed from: i */
        public SearchExtraParam f46429i;

        /* renamed from: j */
        public String f46430j;

        /* renamed from: k */
        public SlashCommandParam f46431k;

        /* renamed from: a */
        public IntegrationSearchRequest build() {
            Scene.Type type;
            String str = this.f46421a;
            if (str != null && (type = this.f46424d) != null) {
                return new IntegrationSearchRequest(str, this.f46422b, this.f46423c, type, this.f46425e, this.f46426f, this.f46427g, this.f46428h, this.f46429i, this.f46430j, this.f46431k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, SearchIntents.EXTRA_QUERY, this.f46424d, "scene_type");
        }

        /* renamed from: a */
        public C18831a mo64657a(SlashCommandParam slashCommandParam) {
            this.f46431k = slashCommandParam;
            return this;
        }

        /* renamed from: b */
        public C18831a mo64664b(Integer num) {
            this.f46423c = num;
            return this;
        }

        /* renamed from: c */
        public C18831a mo64666c(String str) {
            this.f46428h = str;
            return this;
        }

        /* renamed from: d */
        public C18831a mo64667d(String str) {
            this.f46430j = str;
            return this;
        }

        /* renamed from: a */
        public C18831a mo64658a(FilterParam filterParam) {
            this.f46425e = filterParam;
            return this;
        }

        /* renamed from: b */
        public C18831a mo64665b(String str) {
            this.f46426f = str;
            return this;
        }

        /* renamed from: a */
        public C18831a mo64659a(SearchExtraParam searchExtraParam) {
            this.f46429i = searchExtraParam;
            return this;
        }

        /* renamed from: a */
        public C18831a mo64660a(Scene.Type type) {
            this.f46424d = type;
            return this;
        }

        /* renamed from: a */
        public C18831a mo64661a(Integer num) {
            this.f46422b = num;
            return this;
        }

        /* renamed from: a */
        public C18831a mo64662a(String str) {
            this.f46421a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "IntegrationSearchRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.query);
        if (this.begin != null) {
            sb.append(", begin=");
            sb.append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=");
            sb.append(this.end);
        }
        sb.append(", scene_type=");
        sb.append(this.scene_type);
        if (this.filter_param != null) {
            sb.append(", filter_param=");
            sb.append(this.filter_param);
        }
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (this.query_state != null) {
            sb.append(", query_state=");
            sb.append(this.query_state);
        }
        if (this.extras != null) {
            sb.append(", extras=");
            sb.append(this.extras);
        }
        if (this.extra_param != null) {
            sb.append(", extra_param=");
            sb.append(this.extra_param);
        }
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        if (this.slash_command_param != null) {
            sb.append(", slash_command_param=");
            sb.append(this.slash_command_param);
        }
        StringBuilder replace = sb.replace(0, 2, "IntegrationSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public IntegrationSearchRequest(String str, Integer num, Integer num2, Scene.Type type, FilterParam filterParam, String str2, QueryState queryState, String str3, SearchExtraParam searchExtraParam, String str4, SlashCommandParam slashCommandParam) {
        this(str, num, num2, type, filterParam, str2, queryState, str3, searchExtraParam, str4, slashCommandParam, ByteString.EMPTY);
    }

    public IntegrationSearchRequest(String str, Integer num, Integer num2, Scene.Type type, FilterParam filterParam, String str2, QueryState queryState, String str3, SearchExtraParam searchExtraParam, String str4, SlashCommandParam slashCommandParam, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.begin = num;
        this.end = num2;
        this.scene_type = type;
        this.filter_param = filterParam;
        this.search_session = str2;
        this.query_state = queryState;
        this.extras = str3;
        this.extra_param = searchExtraParam;
        this.impr_id = str4;
        this.slash_command_param = slashCommandParam;
    }
}
