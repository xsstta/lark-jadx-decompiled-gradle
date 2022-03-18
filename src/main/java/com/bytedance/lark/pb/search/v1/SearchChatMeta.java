package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Tag;
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
import okio.ByteString;

public final class SearchChatMeta extends Message<SearchChatMeta, C18857a> {
    public static final ProtoAdapter<SearchChatMeta> ADAPTER = new C18858b();
    public static final Boolean DEFAULT_ALLOW_POST = true;
    public static final Chat.ChatMode DEFAULT_CHAT_MODE = Chat.ChatMode.DEFAULT;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_CROSS_WITH_KA = false;
    public static final Boolean DEFAULT_IS_CRYPTO = false;
    public static final Boolean DEFAULT_IS_DELAYED = false;
    public static final Boolean DEFAULT_IS_DEPARTMENT = false;
    public static final Boolean DEFAULT_IS_MEETING = false;
    public static final Boolean DEFAULT_IS_MEMBER = false;
    public static final Boolean DEFAULT_IS_OFFICIAL_ONCALL = false;
    public static final Boolean DEFAULT_IS_PUBLIC_V2 = false;
    public static final Boolean DEFAULT_IS_REMIND = true;
    public static final Boolean DEFAULT_IS_TENANT = false;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_LAST_THREAD_POSITION = 0;
    public static final Integer DEFAULT_LAST_THREAD_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_READ_THREAD_POSITION = 0;
    public static final Integer DEFAULT_READ_THREAD_POSITION_BADGE_COUNT = 0;
    public static final Chat.Type DEFAULT_TYPE = Chat.Type.P2P;
    public static final Integer DEFAULT_USER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean allow_post;
    public final SearchAtInfo at_info;
    public final Chat.ChatMode chat_mode;
    public final String description;
    public final String id;
    public final Boolean is_cross_tenant;
    public final Boolean is_cross_with_ka;
    public final Boolean is_crypto;
    public final Boolean is_delayed;
    public final Boolean is_department;
    public final Boolean is_meeting;
    public final Boolean is_member;
    public final Boolean is_official_oncall;
    public final Boolean is_public_v2;
    public final Boolean is_remind;
    public final Boolean is_tenant;
    public final Integer last_message_position;
    public final Integer last_message_position_badge_count;
    public final Integer last_thread_position;
    public final Integer last_thread_position_badge_count;
    public final Integer member_count;
    public final Integer new_message_count;
    public final Integer no_badged_new_message_count;
    public final String oncall_id;
    public final String owner_id;
    public final Integer read_position;
    public final Integer read_position_badge_count;
    public final Integer read_thread_position;
    public final Integer read_thread_position_badge_count;
    public final List<Tag> tags;
    public final Chat.Type type;
    public final Integer user_count;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchChatMeta$b */
    private static final class C18858b extends ProtoAdapter<SearchChatMeta> {
        C18858b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchChatMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchChatMeta searchChatMeta) {
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
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchChatMeta.id);
            int i30 = 0;
            if (searchChatMeta.type != null) {
                i = Chat.Type.ADAPTER.encodedSizeWithTag(2, searchChatMeta.type);
            } else {
                i = 0;
            }
            int i31 = encodedSizeWithTag + i;
            if (searchChatMeta.member_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, searchChatMeta.member_count);
            } else {
                i2 = 0;
            }
            int i32 = i31 + i2;
            if (searchChatMeta.user_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, searchChatMeta.user_count);
            } else {
                i3 = 0;
            }
            int i33 = i32 + i3;
            if (searchChatMeta.new_message_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, searchChatMeta.new_message_count);
            } else {
                i4 = 0;
            }
            int i34 = i33 + i4;
            if (searchChatMeta.no_badged_new_message_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, searchChatMeta.no_badged_new_message_count);
            } else {
                i5 = 0;
            }
            int i35 = i34 + i5;
            if (searchChatMeta.is_remind != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, searchChatMeta.is_remind);
            } else {
                i6 = 0;
            }
            int i36 = i35 + i6;
            if (searchChatMeta.chat_mode != null) {
                i7 = Chat.ChatMode.ADAPTER.encodedSizeWithTag(8, searchChatMeta.chat_mode);
            } else {
                i7 = 0;
            }
            int i37 = i36 + i7;
            if (searchChatMeta.is_department != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, searchChatMeta.is_department);
            } else {
                i8 = 0;
            }
            int i38 = i37 + i8;
            if (searchChatMeta.is_tenant != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, searchChatMeta.is_tenant);
            } else {
                i9 = 0;
            }
            int i39 = i38 + i9;
            if (searchChatMeta.is_delayed != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(11, searchChatMeta.is_delayed);
            } else {
                i10 = 0;
            }
            int i40 = i39 + i10;
            if (searchChatMeta.is_cross_tenant != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, searchChatMeta.is_cross_tenant);
            } else {
                i11 = 0;
            }
            int i41 = i40 + i11;
            if (searchChatMeta.oncall_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, searchChatMeta.oncall_id);
            } else {
                i12 = 0;
            }
            int i42 = i41 + i12;
            if (searchChatMeta.read_position != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(14, searchChatMeta.read_position);
            } else {
                i13 = 0;
            }
            int i43 = i42 + i13;
            if (searchChatMeta.read_position_badge_count != null) {
                i14 = ProtoAdapter.INT32.encodedSizeWithTag(15, searchChatMeta.read_position_badge_count);
            } else {
                i14 = 0;
            }
            int i44 = i43 + i14;
            if (searchChatMeta.last_message_position != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(16, searchChatMeta.last_message_position);
            } else {
                i15 = 0;
            }
            int i45 = i44 + i15;
            if (searchChatMeta.last_message_position_badge_count != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(17, searchChatMeta.last_message_position_badge_count);
            } else {
                i16 = 0;
            }
            int i46 = i45 + i16;
            if (searchChatMeta.is_crypto != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(18, searchChatMeta.is_crypto);
            } else {
                i17 = 0;
            }
            int i47 = i46 + i17;
            if (searchChatMeta.is_public_v2 != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(19, searchChatMeta.is_public_v2);
            } else {
                i18 = 0;
            }
            int i48 = i47 + i18;
            if (searchChatMeta.is_member != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(20, searchChatMeta.is_member);
            } else {
                i19 = 0;
            }
            int i49 = i48 + i19;
            if (searchChatMeta.allow_post != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(21, searchChatMeta.allow_post);
            } else {
                i20 = 0;
            }
            int i50 = i49 + i20;
            if (searchChatMeta.last_thread_position != null) {
                i21 = ProtoAdapter.INT32.encodedSizeWithTag(22, searchChatMeta.last_thread_position);
            } else {
                i21 = 0;
            }
            int i51 = i50 + i21;
            if (searchChatMeta.read_thread_position != null) {
                i22 = ProtoAdapter.INT32.encodedSizeWithTag(23, searchChatMeta.read_thread_position);
            } else {
                i22 = 0;
            }
            int i52 = i51 + i22;
            if (searchChatMeta.read_thread_position_badge_count != null) {
                i23 = ProtoAdapter.INT32.encodedSizeWithTag(24, searchChatMeta.read_thread_position_badge_count);
            } else {
                i23 = 0;
            }
            int i53 = i52 + i23;
            if (searchChatMeta.last_thread_position_badge_count != null) {
                i24 = ProtoAdapter.INT32.encodedSizeWithTag(25, searchChatMeta.last_thread_position_badge_count);
            } else {
                i24 = 0;
            }
            int i54 = i53 + i24;
            if (searchChatMeta.description != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(26, searchChatMeta.description);
            } else {
                i25 = 0;
            }
            int i55 = i54 + i25;
            if (searchChatMeta.is_meeting != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(27, searchChatMeta.is_meeting);
            } else {
                i26 = 0;
            }
            int i56 = i55 + i26;
            if (searchChatMeta.is_official_oncall != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(28, searchChatMeta.is_official_oncall);
            } else {
                i27 = 0;
            }
            int i57 = i56 + i27;
            if (searchChatMeta.at_info != null) {
                i28 = SearchAtInfo.ADAPTER.encodedSizeWithTag(29, searchChatMeta.at_info);
            } else {
                i28 = 0;
            }
            int encodedSizeWithTag2 = i57 + i28 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(30, searchChatMeta.tags);
            if (searchChatMeta.owner_id != null) {
                i29 = ProtoAdapter.STRING.encodedSizeWithTag(31, searchChatMeta.owner_id);
            } else {
                i29 = 0;
            }
            int i58 = encodedSizeWithTag2 + i29;
            if (searchChatMeta.is_cross_with_ka != null) {
                i30 = ProtoAdapter.BOOL.encodedSizeWithTag(32, searchChatMeta.is_cross_with_ka);
            }
            return i58 + i30 + searchChatMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchChatMeta decode(ProtoReader protoReader) throws IOException {
            C18857a aVar = new C18857a();
            aVar.f46551a = "";
            aVar.f46552b = Chat.Type.P2P;
            aVar.f46553c = 0;
            aVar.f46554d = 0;
            aVar.f46555e = 0;
            aVar.f46556f = 0;
            aVar.f46557g = true;
            aVar.f46558h = Chat.ChatMode.DEFAULT;
            aVar.f46559i = false;
            aVar.f46560j = false;
            aVar.f46561k = false;
            aVar.f46562l = false;
            aVar.f46563m = "";
            aVar.f46564n = 0;
            aVar.f46565o = 0;
            aVar.f46566p = 0;
            aVar.f46567q = 0;
            aVar.f46568r = false;
            aVar.f46569s = false;
            aVar.f46570t = false;
            aVar.f46571u = true;
            aVar.f46572v = 0;
            aVar.f46573w = 0;
            aVar.f46574x = 0;
            aVar.f46575y = 0;
            aVar.f46576z = "";
            aVar.f46545A = false;
            aVar.f46546B = false;
            aVar.f46549E = "";
            aVar.f46550F = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46551a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f46552b = Chat.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f46553c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46554d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46555e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46556f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46557g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f46558h = Chat.ChatMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f46559i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46560j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46561k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46562l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f46563m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f46564n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            aVar.f46565o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f46566p = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            aVar.f46567q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f46568r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f46569s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f46570t = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            aVar.f46571u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f46572v = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            aVar.f46573w = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 24:
                            aVar.f46574x = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f46575y = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 26:
                            aVar.f46576z = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f46545A = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f46546B = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            aVar.f46547C = SearchAtInfo.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            try {
                                aVar.f46548D.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f46549E = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 32:
                            aVar.f46550F = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchChatMeta searchChatMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchChatMeta.id);
            if (searchChatMeta.type != null) {
                Chat.Type.ADAPTER.encodeWithTag(protoWriter, 2, searchChatMeta.type);
            }
            if (searchChatMeta.member_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, searchChatMeta.member_count);
            }
            if (searchChatMeta.user_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, searchChatMeta.user_count);
            }
            if (searchChatMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, searchChatMeta.new_message_count);
            }
            if (searchChatMeta.no_badged_new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, searchChatMeta.no_badged_new_message_count);
            }
            if (searchChatMeta.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, searchChatMeta.is_remind);
            }
            if (searchChatMeta.chat_mode != null) {
                Chat.ChatMode.ADAPTER.encodeWithTag(protoWriter, 8, searchChatMeta.chat_mode);
            }
            if (searchChatMeta.is_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, searchChatMeta.is_department);
            }
            if (searchChatMeta.is_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, searchChatMeta.is_tenant);
            }
            if (searchChatMeta.is_delayed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, searchChatMeta.is_delayed);
            }
            if (searchChatMeta.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, searchChatMeta.is_cross_tenant);
            }
            if (searchChatMeta.oncall_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, searchChatMeta.oncall_id);
            }
            if (searchChatMeta.read_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, searchChatMeta.read_position);
            }
            if (searchChatMeta.read_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, searchChatMeta.read_position_badge_count);
            }
            if (searchChatMeta.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, searchChatMeta.last_message_position);
            }
            if (searchChatMeta.last_message_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, searchChatMeta.last_message_position_badge_count);
            }
            if (searchChatMeta.is_crypto != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, searchChatMeta.is_crypto);
            }
            if (searchChatMeta.is_public_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, searchChatMeta.is_public_v2);
            }
            if (searchChatMeta.is_member != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, searchChatMeta.is_member);
            }
            if (searchChatMeta.allow_post != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, searchChatMeta.allow_post);
            }
            if (searchChatMeta.last_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 22, searchChatMeta.last_thread_position);
            }
            if (searchChatMeta.read_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 23, searchChatMeta.read_thread_position);
            }
            if (searchChatMeta.read_thread_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 24, searchChatMeta.read_thread_position_badge_count);
            }
            if (searchChatMeta.last_thread_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 25, searchChatMeta.last_thread_position_badge_count);
            }
            if (searchChatMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, searchChatMeta.description);
            }
            if (searchChatMeta.is_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, searchChatMeta.is_meeting);
            }
            if (searchChatMeta.is_official_oncall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, searchChatMeta.is_official_oncall);
            }
            if (searchChatMeta.at_info != null) {
                SearchAtInfo.ADAPTER.encodeWithTag(protoWriter, 29, searchChatMeta.at_info);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 30, searchChatMeta.tags);
            if (searchChatMeta.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, searchChatMeta.owner_id);
            }
            if (searchChatMeta.is_cross_with_ka != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 32, searchChatMeta.is_cross_with_ka);
            }
            protoWriter.writeBytes(searchChatMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchChatMeta$a */
    public static final class C18857a extends Message.Builder<SearchChatMeta, C18857a> {

        /* renamed from: A */
        public Boolean f46545A;

        /* renamed from: B */
        public Boolean f46546B;

        /* renamed from: C */
        public SearchAtInfo f46547C;

        /* renamed from: D */
        public List<Tag> f46548D = Internal.newMutableList();

        /* renamed from: E */
        public String f46549E;

        /* renamed from: F */
        public Boolean f46550F;

        /* renamed from: a */
        public String f46551a;

        /* renamed from: b */
        public Chat.Type f46552b;

        /* renamed from: c */
        public Integer f46553c;

        /* renamed from: d */
        public Integer f46554d;

        /* renamed from: e */
        public Integer f46555e;

        /* renamed from: f */
        public Integer f46556f;

        /* renamed from: g */
        public Boolean f46557g;

        /* renamed from: h */
        public Chat.ChatMode f46558h;

        /* renamed from: i */
        public Boolean f46559i;

        /* renamed from: j */
        public Boolean f46560j;

        /* renamed from: k */
        public Boolean f46561k;

        /* renamed from: l */
        public Boolean f46562l;

        /* renamed from: m */
        public String f46563m;

        /* renamed from: n */
        public Integer f46564n;

        /* renamed from: o */
        public Integer f46565o;

        /* renamed from: p */
        public Integer f46566p;

        /* renamed from: q */
        public Integer f46567q;

        /* renamed from: r */
        public Boolean f46568r;

        /* renamed from: s */
        public Boolean f46569s;

        /* renamed from: t */
        public Boolean f46570t;

        /* renamed from: u */
        public Boolean f46571u;

        /* renamed from: v */
        public Integer f46572v;

        /* renamed from: w */
        public Integer f46573w;

        /* renamed from: x */
        public Integer f46574x;

        /* renamed from: y */
        public Integer f46575y;

        /* renamed from: z */
        public String f46576z;

        /* renamed from: a */
        public SearchChatMeta build() {
            String str = this.f46551a;
            if (str != null) {
                return new SearchChatMeta(str, this.f46552b, this.f46553c, this.f46554d, this.f46555e, this.f46556f, this.f46557g, this.f46558h, this.f46559i, this.f46560j, this.f46561k, this.f46562l, this.f46563m, this.f46564n, this.f46565o, this.f46566p, this.f46567q, this.f46568r, this.f46569s, this.f46570t, this.f46571u, this.f46572v, this.f46573w, this.f46574x, this.f46575y, this.f46576z, this.f46545A, this.f46546B, this.f46547C, this.f46548D, this.f46549E, this.f46550F, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18857a newBuilder() {
        C18857a aVar = new C18857a();
        aVar.f46551a = this.id;
        aVar.f46552b = this.type;
        aVar.f46553c = this.member_count;
        aVar.f46554d = this.user_count;
        aVar.f46555e = this.new_message_count;
        aVar.f46556f = this.no_badged_new_message_count;
        aVar.f46557g = this.is_remind;
        aVar.f46558h = this.chat_mode;
        aVar.f46559i = this.is_department;
        aVar.f46560j = this.is_tenant;
        aVar.f46561k = this.is_delayed;
        aVar.f46562l = this.is_cross_tenant;
        aVar.f46563m = this.oncall_id;
        aVar.f46564n = this.read_position;
        aVar.f46565o = this.read_position_badge_count;
        aVar.f46566p = this.last_message_position;
        aVar.f46567q = this.last_message_position_badge_count;
        aVar.f46568r = this.is_crypto;
        aVar.f46569s = this.is_public_v2;
        aVar.f46570t = this.is_member;
        aVar.f46571u = this.allow_post;
        aVar.f46572v = this.last_thread_position;
        aVar.f46573w = this.read_thread_position;
        aVar.f46574x = this.read_thread_position_badge_count;
        aVar.f46575y = this.last_thread_position_badge_count;
        aVar.f46576z = this.description;
        aVar.f46545A = this.is_meeting;
        aVar.f46546B = this.is_official_oncall;
        aVar.f46547C = this.at_info;
        aVar.f46548D = Internal.copyOf("tags", this.tags);
        aVar.f46549E = this.owner_id;
        aVar.f46550F = this.is_cross_with_ka;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchChatMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.member_count != null) {
            sb.append(", member_count=");
            sb.append(this.member_count);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
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
        if (this.chat_mode != null) {
            sb.append(", chat_mode=");
            sb.append(this.chat_mode);
        }
        if (this.is_department != null) {
            sb.append(", is_department=");
            sb.append(this.is_department);
        }
        if (this.is_tenant != null) {
            sb.append(", is_tenant=");
            sb.append(this.is_tenant);
        }
        if (this.is_delayed != null) {
            sb.append(", is_delayed=");
            sb.append(this.is_delayed);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.oncall_id != null) {
            sb.append(", oncall_id=");
            sb.append(this.oncall_id);
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
        if (this.is_crypto != null) {
            sb.append(", is_crypto=");
            sb.append(this.is_crypto);
        }
        if (this.is_public_v2 != null) {
            sb.append(", is_public_v2=");
            sb.append(this.is_public_v2);
        }
        if (this.is_member != null) {
            sb.append(", is_member=");
            sb.append(this.is_member);
        }
        if (this.allow_post != null) {
            sb.append(", allow_post=");
            sb.append(this.allow_post);
        }
        if (this.last_thread_position != null) {
            sb.append(", last_thread_position=");
            sb.append(this.last_thread_position);
        }
        if (this.read_thread_position != null) {
            sb.append(", read_thread_position=");
            sb.append(this.read_thread_position);
        }
        if (this.read_thread_position_badge_count != null) {
            sb.append(", read_thread_position_badge_count=");
            sb.append(this.read_thread_position_badge_count);
        }
        if (this.last_thread_position_badge_count != null) {
            sb.append(", last_thread_position_badge_count=");
            sb.append(this.last_thread_position_badge_count);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.is_meeting != null) {
            sb.append(", is_meeting=");
            sb.append(this.is_meeting);
        }
        if (this.is_official_oncall != null) {
            sb.append(", is_official_oncall=");
            sb.append(this.is_official_oncall);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.is_cross_with_ka != null) {
            sb.append(", is_cross_with_ka=");
            sb.append(this.is_cross_with_ka);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchChatMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchChatMeta(String str, Chat.Type type2, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Chat.ChatMode chatMode, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Integer num5, Integer num6, Integer num7, Integer num8, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num9, Integer num10, Integer num11, Integer num12, String str3, Boolean bool10, Boolean bool11, SearchAtInfo searchAtInfo, List<Tag> list, String str4, Boolean bool12) {
        this(str, type2, num, num2, num3, num4, bool, chatMode, bool2, bool3, bool4, bool5, str2, num5, num6, num7, num8, bool6, bool7, bool8, bool9, num9, num10, num11, num12, str3, bool10, bool11, searchAtInfo, list, str4, bool12, ByteString.EMPTY);
    }

    public SearchChatMeta(String str, Chat.Type type2, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Chat.ChatMode chatMode, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Integer num5, Integer num6, Integer num7, Integer num8, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num9, Integer num10, Integer num11, Integer num12, String str3, Boolean bool10, Boolean bool11, SearchAtInfo searchAtInfo, List<Tag> list, String str4, Boolean bool12, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.member_count = num;
        this.user_count = num2;
        this.new_message_count = num3;
        this.no_badged_new_message_count = num4;
        this.is_remind = bool;
        this.chat_mode = chatMode;
        this.is_department = bool2;
        this.is_tenant = bool3;
        this.is_delayed = bool4;
        this.is_cross_tenant = bool5;
        this.oncall_id = str2;
        this.read_position = num5;
        this.read_position_badge_count = num6;
        this.last_message_position = num7;
        this.last_message_position_badge_count = num8;
        this.is_crypto = bool6;
        this.is_public_v2 = bool7;
        this.is_member = bool8;
        this.allow_post = bool9;
        this.last_thread_position = num9;
        this.read_thread_position = num10;
        this.read_thread_position_badge_count = num11;
        this.last_thread_position_badge_count = num12;
        this.description = str3;
        this.is_meeting = bool10;
        this.is_official_oncall = bool11;
        this.at_info = searchAtInfo;
        this.tags = Internal.immutableCopyOf("tags", list);
        this.owner_id = str4;
        this.is_cross_with_ka = bool12;
    }
}
