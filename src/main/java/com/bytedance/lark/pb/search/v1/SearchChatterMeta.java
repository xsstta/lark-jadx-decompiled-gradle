package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class SearchChatterMeta extends Message<SearchChatterMeta, C18861a> {
    public static final ProtoAdapter<SearchChatterMeta> ADAPTER = new C18862b();
    public static final Boolean DEFAULT_ACCEPT_SMS_PHONE_URGENT = false;
    public static final Boolean DEFAULT_CAN_JOIN_GROUP = true;
    public static final Chatter.Description.Type DEFAULT_DESCRIPTION_FLAG = Chatter.Description.Type.ON_DEFAULT;
    public static final Long DEFAULT_DO_NOT_DISTURB_END_TIME = 0L;
    public static final Boolean DEFAULT_IN_CONTACTS = true;
    public static final Boolean DEFAULT_IS_READ_MESSAGE = false;
    public static final Boolean DEFAULT_IS_REGISTERED = false;
    public static final Boolean DEFAULT_IS_REMIND = true;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    public static final Chatter.Type DEFAULT_TYPE = Chatter.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean accept_sms_phone_urgent;
    public final SearchAtInfo at_info;
    public final Boolean can_join_group;
    public final List<ActionType> denied_permissions;
    public final Map<Integer, DeniedReason> denied_reason;
    public final String description;
    public final Chatter.Description.Type description_flag;
    public final Long do_not_disturb_end_time;
    public final List<String> extra_hit_terms;
    public final String extra_title;
    public final String full_department_path;
    public final String id;
    public final List<String> in_chat_ids;
    public final Boolean in_contacts;
    public final Boolean is_read_message;
    public final Boolean is_registered;
    public final Boolean is_remind;
    public final Integer last_message_position;
    public final Integer last_message_position_badge_count;
    public final String mail_address;
    public final Integer new_message_count;
    public final Integer no_badged_new_message_count;
    public final String p2p_chat_id;
    public final Integer read_position;
    public final Integer read_position_badge_count;
    public final List<SubTitleInfo> subtitle_infos;
    public final List<Tag> tags;
    public final String tenant_id;
    public final TimeZone timezone;
    public final Chatter.Type type;
    public final String with_bot_tag;
    public final WorkStatus work_status;

    public static final class SubTitleInfo extends Message<SubTitleInfo, C18859a> {
        public static final ProtoAdapter<SubTitleInfo> ADAPTER = new C18860b();
        private static final long serialVersionUID = 0;
        public final List<String> hit_terms;
        public final String title;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchChatterMeta$SubTitleInfo$b */
        private static final class C18860b extends ProtoAdapter<SubTitleInfo> {
            C18860b() {
                super(FieldEncoding.LENGTH_DELIMITED, SubTitleInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(SubTitleInfo subTitleInfo) {
                int i;
                if (subTitleInfo.title != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, subTitleInfo.title);
                } else {
                    i = 0;
                }
                return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, subTitleInfo.hit_terms) + subTitleInfo.unknownFields().size();
            }

            /* renamed from: a */
            public SubTitleInfo decode(ProtoReader protoReader) throws IOException {
                C18859a aVar = new C18859a();
                aVar.f46577a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46577a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46578b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SubTitleInfo subTitleInfo) throws IOException {
                if (subTitleInfo.title != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subTitleInfo.title);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, subTitleInfo.hit_terms);
                protoWriter.writeBytes(subTitleInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchChatterMeta$SubTitleInfo$a */
        public static final class C18859a extends Message.Builder<SubTitleInfo, C18859a> {

            /* renamed from: a */
            public String f46577a;

            /* renamed from: b */
            public List<String> f46578b = Internal.newMutableList();

            /* renamed from: a */
            public SubTitleInfo build() {
                return new SubTitleInfo(this.f46577a, this.f46578b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18859a newBuilder() {
            C18859a aVar = new C18859a();
            aVar.f46577a = this.title;
            aVar.f46578b = Internal.copyOf("hit_terms", this.hit_terms);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SubTitleInfo");
            StringBuilder sb = new StringBuilder();
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (!this.hit_terms.isEmpty()) {
                sb.append(", hit_terms=");
                sb.append(this.hit_terms);
            }
            StringBuilder replace = sb.replace(0, 2, "SubTitleInfo{");
            replace.append('}');
            return replace.toString();
        }

        public SubTitleInfo(String str, List<String> list) {
            this(str, list, ByteString.EMPTY);
        }

        public SubTitleInfo(String str, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.title = str;
            this.hit_terms = Internal.immutableCopyOf("hit_terms", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchChatterMeta$b */
    private static final class C18862b extends ProtoAdapter<SearchChatterMeta> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Integer, DeniedReason>> f46611a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, DeniedReason.ADAPTER);

        C18862b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchChatterMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchChatterMeta searchChatterMeta) {
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
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchChatterMeta.id);
            int i25 = 0;
            if (searchChatterMeta.type != null) {
                i = Chatter.Type.ADAPTER.encodedSizeWithTag(2, searchChatterMeta.type);
            } else {
                i = 0;
            }
            int i26 = encodedSizeWithTag + i;
            if (searchChatterMeta.description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchChatterMeta.description);
            } else {
                i2 = 0;
            }
            int i27 = i26 + i2;
            if (searchChatterMeta.description_flag != null) {
                i3 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(4, searchChatterMeta.description_flag);
            } else {
                i3 = 0;
            }
            int i28 = i27 + i3;
            if (searchChatterMeta.is_registered != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, searchChatterMeta.is_registered);
            } else {
                i4 = 0;
            }
            int i29 = i28 + i4;
            if (searchChatterMeta.p2p_chat_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchChatterMeta.p2p_chat_id);
            } else {
                i5 = 0;
            }
            int i30 = i29 + i5;
            if (searchChatterMeta.new_message_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(7, searchChatterMeta.new_message_count);
            } else {
                i6 = 0;
            }
            int i31 = i30 + i6;
            if (searchChatterMeta.no_badged_new_message_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, searchChatterMeta.no_badged_new_message_count);
            } else {
                i7 = 0;
            }
            int i32 = i31 + i7;
            if (searchChatterMeta.is_remind != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, searchChatterMeta.is_remind);
            } else {
                i8 = 0;
            }
            int i33 = i32 + i8;
            if (searchChatterMeta.with_bot_tag != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, searchChatterMeta.with_bot_tag);
            } else {
                i9 = 0;
            }
            int i34 = i33 + i9;
            if (searchChatterMeta.in_contacts != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(11, searchChatterMeta.in_contacts);
            } else {
                i10 = 0;
            }
            int i35 = i34 + i10;
            if (searchChatterMeta.can_join_group != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, searchChatterMeta.can_join_group);
            } else {
                i11 = 0;
            }
            int i36 = i35 + i11;
            if (searchChatterMeta.tenant_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, searchChatterMeta.tenant_id);
            } else {
                i12 = 0;
            }
            int i37 = i36 + i12;
            if (searchChatterMeta.work_status != null) {
                i13 = WorkStatus.ADAPTER.encodedSizeWithTag(14, searchChatterMeta.work_status);
            } else {
                i13 = 0;
            }
            int i38 = i37 + i13;
            if (searchChatterMeta.read_position != null) {
                i14 = ProtoAdapter.INT32.encodedSizeWithTag(15, searchChatterMeta.read_position);
            } else {
                i14 = 0;
            }
            int i39 = i38 + i14;
            if (searchChatterMeta.read_position_badge_count != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(16, searchChatterMeta.read_position_badge_count);
            } else {
                i15 = 0;
            }
            int i40 = i39 + i15;
            if (searchChatterMeta.last_message_position != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(17, searchChatterMeta.last_message_position);
            } else {
                i16 = 0;
            }
            int i41 = i40 + i16;
            if (searchChatterMeta.last_message_position_badge_count != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(18, searchChatterMeta.last_message_position_badge_count);
            } else {
                i17 = 0;
            }
            int i42 = i41 + i17;
            if (searchChatterMeta.mail_address != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(19, searchChatterMeta.mail_address);
            } else {
                i18 = 0;
            }
            int i43 = i42 + i18;
            if (searchChatterMeta.do_not_disturb_end_time != null) {
                i19 = ProtoAdapter.INT64.encodedSizeWithTag(20, searchChatterMeta.do_not_disturb_end_time);
            } else {
                i19 = 0;
            }
            int encodedSizeWithTag2 = i43 + i19 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(21, searchChatterMeta.in_chat_ids);
            if (searchChatterMeta.is_read_message != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(22, searchChatterMeta.is_read_message);
            } else {
                i20 = 0;
            }
            int i44 = encodedSizeWithTag2 + i20;
            if (searchChatterMeta.accept_sms_phone_urgent != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(23, searchChatterMeta.accept_sms_phone_urgent);
            } else {
                i21 = 0;
            }
            int i45 = i44 + i21;
            if (searchChatterMeta.extra_title != null) {
                i22 = ProtoAdapter.STRING.encodedSizeWithTag(24, searchChatterMeta.extra_title);
            } else {
                i22 = 0;
            }
            int encodedSizeWithTag3 = i45 + i22 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(25, searchChatterMeta.extra_hit_terms);
            if (searchChatterMeta.full_department_path != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(26, searchChatterMeta.full_department_path);
            } else {
                i23 = 0;
            }
            int encodedSizeWithTag4 = encodedSizeWithTag3 + i23 + SubTitleInfo.ADAPTER.asRepeated().encodedSizeWithTag(27, searchChatterMeta.subtitle_infos) + ActionType.ADAPTER.asRepeated().encodedSizeWithTag(28, searchChatterMeta.denied_permissions);
            if (searchChatterMeta.timezone != null) {
                i24 = TimeZone.ADAPTER.encodedSizeWithTag(29, searchChatterMeta.timezone);
            } else {
                i24 = 0;
            }
            int i46 = encodedSizeWithTag4 + i24;
            if (searchChatterMeta.at_info != null) {
                i25 = SearchAtInfo.ADAPTER.encodedSizeWithTag(30, searchChatterMeta.at_info);
            }
            return i46 + i25 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(31, searchChatterMeta.tags) + this.f46611a.encodedSizeWithTag(32, searchChatterMeta.denied_reason) + searchChatterMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchChatterMeta decode(ProtoReader protoReader) throws IOException {
            C18861a aVar = new C18861a();
            aVar.f46585a = "";
            aVar.f46586b = Chatter.Type.UNKNOWN;
            aVar.f46587c = "";
            aVar.f46588d = Chatter.Description.Type.ON_DEFAULT;
            aVar.f46589e = false;
            aVar.f46590f = "";
            aVar.f46591g = 0;
            aVar.f46592h = 0;
            aVar.f46593i = true;
            aVar.f46594j = "bot";
            aVar.f46595k = true;
            aVar.f46596l = true;
            aVar.f46597m = "";
            aVar.f46599o = 0;
            aVar.f46600p = 0;
            aVar.f46601q = 0;
            aVar.f46602r = 0;
            aVar.f46603s = "";
            aVar.f46604t = 0L;
            aVar.f46606v = false;
            aVar.f46607w = false;
            aVar.f46608x = "";
            aVar.f46610z = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46585a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46586b = Chatter.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f46587c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f46588d = Chatter.Description.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f46589e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46590f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46591g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46592h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46593i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46594j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46595k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46596l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f46597m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f46598n = WorkStatus.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            aVar.f46599o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f46600p = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            aVar.f46601q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f46602r = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            aVar.f46603s = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 20:
                            aVar.f46604t = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 21:
                            aVar.f46605u.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 22:
                            aVar.f46606v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f46607w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f46608x = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f46609y.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 26:
                            aVar.f46610z = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f46579A.add(SubTitleInfo.ADAPTER.decode(protoReader));
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            try {
                                aVar.f46580B.add(ActionType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 29:
                            aVar.f46581C = TimeZone.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            aVar.f46582D = SearchAtInfo.ADAPTER.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            try {
                                aVar.f46583E.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 32:
                            aVar.f46584F.putAll(this.f46611a.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SearchChatterMeta searchChatterMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchChatterMeta.id);
            if (searchChatterMeta.type != null) {
                Chatter.Type.ADAPTER.encodeWithTag(protoWriter, 2, searchChatterMeta.type);
            }
            if (searchChatterMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchChatterMeta.description);
            }
            if (searchChatterMeta.description_flag != null) {
                Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 4, searchChatterMeta.description_flag);
            }
            if (searchChatterMeta.is_registered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, searchChatterMeta.is_registered);
            }
            if (searchChatterMeta.p2p_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchChatterMeta.p2p_chat_id);
            }
            if (searchChatterMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, searchChatterMeta.new_message_count);
            }
            if (searchChatterMeta.no_badged_new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, searchChatterMeta.no_badged_new_message_count);
            }
            if (searchChatterMeta.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, searchChatterMeta.is_remind);
            }
            if (searchChatterMeta.with_bot_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, searchChatterMeta.with_bot_tag);
            }
            if (searchChatterMeta.in_contacts != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, searchChatterMeta.in_contacts);
            }
            if (searchChatterMeta.can_join_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, searchChatterMeta.can_join_group);
            }
            if (searchChatterMeta.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, searchChatterMeta.tenant_id);
            }
            if (searchChatterMeta.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 14, searchChatterMeta.work_status);
            }
            if (searchChatterMeta.read_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, searchChatterMeta.read_position);
            }
            if (searchChatterMeta.read_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, searchChatterMeta.read_position_badge_count);
            }
            if (searchChatterMeta.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, searchChatterMeta.last_message_position);
            }
            if (searchChatterMeta.last_message_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, searchChatterMeta.last_message_position_badge_count);
            }
            if (searchChatterMeta.mail_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, searchChatterMeta.mail_address);
            }
            if (searchChatterMeta.do_not_disturb_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, searchChatterMeta.do_not_disturb_end_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 21, searchChatterMeta.in_chat_ids);
            if (searchChatterMeta.is_read_message != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, searchChatterMeta.is_read_message);
            }
            if (searchChatterMeta.accept_sms_phone_urgent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, searchChatterMeta.accept_sms_phone_urgent);
            }
            if (searchChatterMeta.extra_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, searchChatterMeta.extra_title);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 25, searchChatterMeta.extra_hit_terms);
            if (searchChatterMeta.full_department_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, searchChatterMeta.full_department_path);
            }
            SubTitleInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 27, searchChatterMeta.subtitle_infos);
            ActionType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 28, searchChatterMeta.denied_permissions);
            if (searchChatterMeta.timezone != null) {
                TimeZone.ADAPTER.encodeWithTag(protoWriter, 29, searchChatterMeta.timezone);
            }
            if (searchChatterMeta.at_info != null) {
                SearchAtInfo.ADAPTER.encodeWithTag(protoWriter, 30, searchChatterMeta.at_info);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 31, searchChatterMeta.tags);
            this.f46611a.encodeWithTag(protoWriter, 32, searchChatterMeta.denied_reason);
            protoWriter.writeBytes(searchChatterMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchChatterMeta$a */
    public static final class C18861a extends Message.Builder<SearchChatterMeta, C18861a> {

        /* renamed from: A */
        public List<SubTitleInfo> f46579A = Internal.newMutableList();

        /* renamed from: B */
        public List<ActionType> f46580B = Internal.newMutableList();

        /* renamed from: C */
        public TimeZone f46581C;

        /* renamed from: D */
        public SearchAtInfo f46582D;

        /* renamed from: E */
        public List<Tag> f46583E = Internal.newMutableList();

        /* renamed from: F */
        public Map<Integer, DeniedReason> f46584F = Internal.newMutableMap();

        /* renamed from: a */
        public String f46585a;

        /* renamed from: b */
        public Chatter.Type f46586b;

        /* renamed from: c */
        public String f46587c;

        /* renamed from: d */
        public Chatter.Description.Type f46588d;

        /* renamed from: e */
        public Boolean f46589e;

        /* renamed from: f */
        public String f46590f;

        /* renamed from: g */
        public Integer f46591g;

        /* renamed from: h */
        public Integer f46592h;

        /* renamed from: i */
        public Boolean f46593i;

        /* renamed from: j */
        public String f46594j;

        /* renamed from: k */
        public Boolean f46595k;

        /* renamed from: l */
        public Boolean f46596l;

        /* renamed from: m */
        public String f46597m;

        /* renamed from: n */
        public WorkStatus f46598n;

        /* renamed from: o */
        public Integer f46599o;

        /* renamed from: p */
        public Integer f46600p;

        /* renamed from: q */
        public Integer f46601q;

        /* renamed from: r */
        public Integer f46602r;

        /* renamed from: s */
        public String f46603s;

        /* renamed from: t */
        public Long f46604t;

        /* renamed from: u */
        public List<String> f46605u = Internal.newMutableList();

        /* renamed from: v */
        public Boolean f46606v;

        /* renamed from: w */
        public Boolean f46607w;

        /* renamed from: x */
        public String f46608x;

        /* renamed from: y */
        public List<String> f46609y = Internal.newMutableList();

        /* renamed from: z */
        public String f46610z;

        /* renamed from: a */
        public SearchChatterMeta build() {
            String str = this.f46585a;
            if (str != null) {
                return new SearchChatterMeta(str, this.f46586b, this.f46587c, this.f46588d, this.f46589e, this.f46590f, this.f46591g, this.f46592h, this.f46593i, this.f46594j, this.f46595k, this.f46596l, this.f46597m, this.f46598n, this.f46599o, this.f46600p, this.f46601q, this.f46602r, this.f46603s, this.f46604t, this.f46605u, this.f46606v, this.f46607w, this.f46608x, this.f46609y, this.f46610z, this.f46579A, this.f46580B, this.f46581C, this.f46582D, this.f46583E, this.f46584F, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18861a newBuilder() {
        C18861a aVar = new C18861a();
        aVar.f46585a = this.id;
        aVar.f46586b = this.type;
        aVar.f46587c = this.description;
        aVar.f46588d = this.description_flag;
        aVar.f46589e = this.is_registered;
        aVar.f46590f = this.p2p_chat_id;
        aVar.f46591g = this.new_message_count;
        aVar.f46592h = this.no_badged_new_message_count;
        aVar.f46593i = this.is_remind;
        aVar.f46594j = this.with_bot_tag;
        aVar.f46595k = this.in_contacts;
        aVar.f46596l = this.can_join_group;
        aVar.f46597m = this.tenant_id;
        aVar.f46598n = this.work_status;
        aVar.f46599o = this.read_position;
        aVar.f46600p = this.read_position_badge_count;
        aVar.f46601q = this.last_message_position;
        aVar.f46602r = this.last_message_position_badge_count;
        aVar.f46603s = this.mail_address;
        aVar.f46604t = this.do_not_disturb_end_time;
        aVar.f46605u = Internal.copyOf("in_chat_ids", this.in_chat_ids);
        aVar.f46606v = this.is_read_message;
        aVar.f46607w = this.accept_sms_phone_urgent;
        aVar.f46608x = this.extra_title;
        aVar.f46609y = Internal.copyOf("extra_hit_terms", this.extra_hit_terms);
        aVar.f46610z = this.full_department_path;
        aVar.f46579A = Internal.copyOf("subtitle_infos", this.subtitle_infos);
        aVar.f46580B = Internal.copyOf("denied_permissions", this.denied_permissions);
        aVar.f46581C = this.timezone;
        aVar.f46582D = this.at_info;
        aVar.f46583E = Internal.copyOf("tags", this.tags);
        aVar.f46584F = Internal.copyOf("denied_reason", this.denied_reason);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchChatterMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.description_flag != null) {
            sb.append(", description_flag=");
            sb.append(this.description_flag);
        }
        if (this.is_registered != null) {
            sb.append(", is_registered=");
            sb.append(this.is_registered);
        }
        if (this.p2p_chat_id != null) {
            sb.append(", p2p_chat_id=");
            sb.append(this.p2p_chat_id);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.no_badged_new_message_count != null) {
            sb.append(", no_badged_new_message_count=");
            sb.append(this.no_badged_new_message_count);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        if (this.with_bot_tag != null) {
            sb.append(", with_bot_tag=");
            sb.append(this.with_bot_tag);
        }
        if (this.in_contacts != null) {
            sb.append(", in_contacts=");
            sb.append(this.in_contacts);
        }
        if (this.can_join_group != null) {
            sb.append(", can_join_group=");
            sb.append(this.can_join_group);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        if (this.read_position != null) {
            sb.append(", read_position=");
            sb.append(this.read_position);
        }
        if (this.read_position_badge_count != null) {
            sb.append(", read_position_badge_count=");
            sb.append(this.read_position_badge_count);
        }
        if (this.last_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.last_message_position);
        }
        if (this.last_message_position_badge_count != null) {
            sb.append(", last_message_position_badge_count=");
            sb.append(this.last_message_position_badge_count);
        }
        if (this.mail_address != null) {
            sb.append(", mail_address=");
            sb.append(this.mail_address);
        }
        if (this.do_not_disturb_end_time != null) {
            sb.append(", do_not_disturb_end_time=");
            sb.append(this.do_not_disturb_end_time);
        }
        if (!this.in_chat_ids.isEmpty()) {
            sb.append(", in_chat_ids=");
            sb.append(this.in_chat_ids);
        }
        if (this.is_read_message != null) {
            sb.append(", is_read_message=");
            sb.append(this.is_read_message);
        }
        if (this.accept_sms_phone_urgent != null) {
            sb.append(", accept_sms_phone_urgent=");
            sb.append(this.accept_sms_phone_urgent);
        }
        if (this.extra_title != null) {
            sb.append(", extra_title=");
            sb.append(this.extra_title);
        }
        if (!this.extra_hit_terms.isEmpty()) {
            sb.append(", extra_hit_terms=");
            sb.append(this.extra_hit_terms);
        }
        if (this.full_department_path != null) {
            sb.append(", full_department_path=");
            sb.append(this.full_department_path);
        }
        if (!this.subtitle_infos.isEmpty()) {
            sb.append(", subtitle_infos=");
            sb.append(this.subtitle_infos);
        }
        if (!this.denied_permissions.isEmpty()) {
            sb.append(", denied_permissions=");
            sb.append(this.denied_permissions);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (!this.denied_reason.isEmpty()) {
            sb.append(", denied_reason=");
            sb.append(this.denied_reason);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchChatterMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchChatterMeta(String str, Chatter.Type type2, String str2, Chatter.Description.Type type3, Boolean bool, String str3, Integer num, Integer num2, Boolean bool2, String str4, Boolean bool3, Boolean bool4, String str5, WorkStatus workStatus, Integer num3, Integer num4, Integer num5, Integer num6, String str6, Long l, List<String> list, Boolean bool5, Boolean bool6, String str7, List<String> list2, String str8, List<SubTitleInfo> list3, List<ActionType> list4, TimeZone timeZone, SearchAtInfo searchAtInfo, List<Tag> list5, Map<Integer, DeniedReason> map) {
        this(str, type2, str2, type3, bool, str3, num, num2, bool2, str4, bool3, bool4, str5, workStatus, num3, num4, num5, num6, str6, l, list, bool5, bool6, str7, list2, str8, list3, list4, timeZone, searchAtInfo, list5, map, ByteString.EMPTY);
    }

    public SearchChatterMeta(String str, Chatter.Type type2, String str2, Chatter.Description.Type type3, Boolean bool, String str3, Integer num, Integer num2, Boolean bool2, String str4, Boolean bool3, Boolean bool4, String str5, WorkStatus workStatus, Integer num3, Integer num4, Integer num5, Integer num6, String str6, Long l, List<String> list, Boolean bool5, Boolean bool6, String str7, List<String> list2, String str8, List<SubTitleInfo> list3, List<ActionType> list4, TimeZone timeZone, SearchAtInfo searchAtInfo, List<Tag> list5, Map<Integer, DeniedReason> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.description = str2;
        this.description_flag = type3;
        this.is_registered = bool;
        this.p2p_chat_id = str3;
        this.new_message_count = num;
        this.no_badged_new_message_count = num2;
        this.is_remind = bool2;
        this.with_bot_tag = str4;
        this.in_contacts = bool3;
        this.can_join_group = bool4;
        this.tenant_id = str5;
        this.work_status = workStatus;
        this.read_position = num3;
        this.read_position_badge_count = num4;
        this.last_message_position = num5;
        this.last_message_position_badge_count = num6;
        this.mail_address = str6;
        this.do_not_disturb_end_time = l;
        this.in_chat_ids = Internal.immutableCopyOf("in_chat_ids", list);
        this.is_read_message = bool5;
        this.accept_sms_phone_urgent = bool6;
        this.extra_title = str7;
        this.extra_hit_terms = Internal.immutableCopyOf("extra_hit_terms", list2);
        this.full_department_path = str8;
        this.subtitle_infos = Internal.immutableCopyOf("subtitle_infos", list3);
        this.denied_permissions = Internal.immutableCopyOf("denied_permissions", list4);
        this.timezone = timeZone;
        this.at_info = searchAtInfo;
        this.tags = Internal.immutableCopyOf("tags", list5);
        this.denied_reason = Internal.immutableCopyOf("denied_reason", map);
    }
}
