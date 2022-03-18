package com.ss.android.lark.pb.entities;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Chat extends Message<Chat, C49652a> {
    public static final ProtoAdapter<Chat> ADAPTER = new C49653b();
    public static final Boolean DEFAULT_ALLOW_POST = false;
    public static final Long DEFAULT_BURNED_TIME = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_ENABLE_WATERMARK = false;
    public static final Integer DEFAULT_FIRST_CHAT_MESSAGE_POSITION = 0;
    public static final Boolean DEFAULT_IS_ADMIN = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_CROSS_WITH_KA = false;
    public static final Boolean DEFAULT_IS_CRYPTO = false;
    public static final Boolean DEFAULT_IS_CUSTOMER_SERVICE = false;
    public static final Boolean DEFAULT_IS_CUSTOM_ICON = false;
    public static final Boolean DEFAULT_IS_DEPARTMENT = false;
    public static final Boolean DEFAULT_IS_DISSOLVED = false;
    public static final Boolean DEFAULT_IS_EDU = false;
    public static final Boolean DEFAULT_IS_LARGE_GROUP = false;
    public static final Boolean DEFAULT_IS_MEETING = false;
    public static final Boolean DEFAULT_IS_PUBLIC = false;
    public static final Boolean DEFAULT_IS_PUBLIC_V2 = false;
    public static final Boolean DEFAULT_IS_REMIND = true;
    public static final Boolean DEFAULT_IS_SAME_PAGE_MEETING = false;
    public static final Boolean DEFAULT_IS_SUPER = false;
    public static final Boolean DEFAULT_IS_TEAM = false;
    public static final Boolean DEFAULT_IS_TENANT = false;
    public static final Long DEFAULT_JOIN_TIME_MS = 0L;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_LAST_THREAD_POSITION = 0;
    public static final Integer DEFAULT_LAST_THREAD_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_LAST_VISIBLE_MESSAGE_NO_BADGED_COUNT = 0;
    public static final Integer DEFAULT_LAST_VISIBLE_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_VISIBLE_THREAD_POSITION = 0;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Long DEFAULT_MY_THREADS_LAST_DISPLAY_MESSAGE_ID = 0L;
    public static final Long DEFAULT_MY_THREADS_LAST_TIMESTAMP = 0L;
    public static final Long DEFAULT_MY_THREADS_READ_TIMESTAMP = 0L;
    public static final Integer DEFAULT_MY_THREADS_UNREAD_COUNT = 0;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NEW_THREAD_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_THREAD_COUNT = 0;
    public static final Boolean DEFAULT_OFF_EDIT_GROUP_CHAT_INFO = false;
    public static final Long DEFAULT_ONCALL_ID = 0L;
    public static final Integer DEFAULT_PUT_CHATTER_APPLY_COUNT = 0;
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_READ_THREAD_POSITION = 0;
    public static final Integer DEFAULT_READ_THREAD_POSITION_BADGE_COUNT = 0;
    public static final Boolean DEFAULT_SHOW_BANNER = false;
    public static final Integer DEFAULT_THREAD_START_POSITION = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Long DEFAULT_UPDATE_TIME_MS = 0L;
    public static final Integer DEFAULT_USER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean mallow_post;
    public final Announcement mannouncement;
    public final Image mavatar;
    public final ChatBizContent mbiz_content;
    public final Long mburned_time;
    public final ChatConfig mchat_config;
    public final ChatEntitySetting mchat_entity_setting;
    public final ChatMode mchat_mode;
    public final ChatSecurityConfig mchat_security_config;
    public final Long mcreate_time;
    public final String mdescription;
    public final Boolean menable_watermark;
    public final Map<String, String> mextra;
    public final Integer mfirst_chat_message_position;
    public final I18nInf mi18n_inf;
    public final Map<String, String> mi18n_names;
    public final String mid;
    public final Boolean mis_admin;
    public final Boolean mis_cross_tenant;
    public final Boolean mis_cross_with_ka;
    public final Boolean mis_crypto;
    public final Boolean mis_custom_icon;
    public final Boolean mis_customer_service;
    public final Boolean mis_department;
    public final Boolean mis_dissolved;
    public final Boolean mis_edu;
    public final Boolean mis_large_group;
    public final Boolean mis_meeting;
    public final Boolean mis_public;
    public final Boolean mis_public_v2;
    public final Boolean mis_remind;
    public final Boolean mis_same_page_meeting;
    public final Boolean mis_super;
    public final Boolean mis_team;
    public final Boolean mis_tenant;
    public final Long mjoin_time_ms;
    public final String mkey;
    public final String mlast_message_id;
    public final Integer mlast_message_position;
    public final Integer mlast_message_position_badge_count;
    public final String mlast_thread_id;
    public final Integer mlast_thread_position;
    public final Integer mlast_thread_position_badge_count;
    public final String mlast_visible_message_id;
    public final Integer mlast_visible_message_no_badged_count;
    public final Integer mlast_visible_message_position;
    public final String mlast_visible_thread_id;
    public final Integer mlast_visible_thread_position;
    public final Integer mmember_count;
    public final Image mmini_avatar;
    public final Long mmy_threads_last_display_message_id;
    public final Long mmy_threads_last_timestamp;
    public final Long mmy_threads_read_timestamp;
    public final Integer mmy_threads_unread_count;
    public final String mname;
    public final String mname_pinyin;
    public final String mname_py;
    public final Integer mnew_message_count;
    public final Integer mnew_thread_count;
    public final Integer mno_badged_new_message_count;
    public final Integer mno_badged_new_thread_count;
    public final Boolean moff_edit_group_chat_info;
    public final Long moncall_id;
    public final String mowner_id;
    public final ChatPostType mpost_type;
    public final Integer mput_chatter_apply_count;
    public final Integer mread_position;
    public final Integer mread_position_badge_count;
    public final Integer mread_thread_position;
    public final Integer mread_thread_position_badge_count;
    public final Role mrole;
    public final Boolean mshow_banner;
    public final String msidebar_id;
    public final Status mstatus;
    public final SupportView msupport_view;
    public final List<Integer> mtags;
    public final String mtenant_id;
    public final Integer mthread_start_position;
    public final Type mtype;
    public final Long mupdate_time;
    public final Long mupdate_time_ms;
    public final Integer muser_count;
    public final ChatSetting muser_setting;

    public enum ChatMode implements WireEnum {
        UNKNOWN_CHAT_MODE(0),
        DEFAULT(1),
        THREAD(2),
        THREAD_V2(3);
        
        public static final ProtoAdapter<ChatMode> ADAPTER = ProtoAdapter.newEnumAdapter(ChatMode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChatMode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_CHAT_MODE;
            }
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return THREAD;
            }
            if (i != 3) {
                return null;
            }
            return THREAD_V2;
        }

        private ChatMode(int i) {
            this.value = i;
        }
    }

    public enum Role implements WireEnum {
        IGNORE(0),
        MEMBER(1),
        VISITOR(2),
        THREAD_FOLLOWER(3);
        
        public static final ProtoAdapter<Role> ADAPTER = ProtoAdapter.newEnumAdapter(Role.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Role fromValue(int i) {
            if (i == 0) {
                return IGNORE;
            }
            if (i == 1) {
                return MEMBER;
            }
            if (i == 2) {
                return VISITOR;
            }
            if (i != 3) {
                return null;
            }
            return THREAD_FOLLOWER;
        }

        private Role(int i) {
            this.value = i;
        }
    }

    public enum Status implements WireEnum {
        NORMAL(0),
        ARCHIVE(1),
        DELETED(2);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i == 1) {
                return ARCHIVE;
            }
            if (i != 2) {
                return null;
            }
            return DELETED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum SupportView implements WireEnum {
        VIEW_UNKNOWN(0),
        VIEW_P2PGROUP(1),
        VIEW_MEETING(2),
        VIEW_THREAD(3),
        VIEW_CRYPTO(4);
        
        public static final ProtoAdapter<SupportView> ADAPTER = ProtoAdapter.newEnumAdapter(SupportView.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SupportView fromValue(int i) {
            if (i == 0) {
                return VIEW_UNKNOWN;
            }
            if (i == 1) {
                return VIEW_P2PGROUP;
            }
            if (i == 2) {
                return VIEW_MEETING;
            }
            if (i == 3) {
                return VIEW_THREAD;
            }
            if (i != 4) {
                return null;
            }
            return VIEW_CRYPTO;
        }

        private SupportView(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        P2P(1),
        GROUP(2),
        TOPIC_GROUP(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return P2P;
            }
            if (i == 2) {
                return GROUP;
            }
            if (i != 3) {
                return null;
            }
            return TOPIC_GROUP;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public Chat(String str, Type type, String str2, String str3, Image image, String str4, Integer num, Status status, Long l, String str5, String str6, Integer num2, Boolean bool, Boolean bool2, Integer num3, Integer num4, String str7, Long l2, Boolean bool3, Role role, Boolean bool4, Integer num5, Boolean bool5, Announcement announcement, String str8, Long l3, Boolean bool6, ChatEntitySetting chatEntitySetting, ChatSetting chatSetting, Boolean bool7, Boolean bool8, String str9, String str10, Integer num6, Integer num7, Boolean bool9, Integer num8, Integer num9, ChatMode chatMode, ChatConfig chatConfig, Boolean bool10, Boolean bool11, SupportView supportView, Long l4, Long l5, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Boolean bool12, Image image2, String str11, String str12, Map<String, String> map, I18nInf i18nInf, Integer num15, Integer num16, Integer num17, Integer num18, String str13, ChatSecurityConfig chatSecurityConfig, Boolean bool13, ChatPostType chatPostType, Boolean bool14, Long l6, Integer num19, Boolean bool15, Boolean bool16, Integer num20, List<Integer> list, Map<String, String> map2, Boolean bool17, Long l7, Long l8, Boolean bool18, Long l9, Integer num21, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, ChatBizContent chatBizContent) {
        this(str, type, str2, str3, image, str4, num, status, l, str5, str6, num2, bool, bool2, num3, num4, str7, l2, bool3, role, bool4, num5, bool5, announcement, str8, l3, bool6, chatEntitySetting, chatSetting, bool7, bool8, str9, str10, num6, num7, bool9, num8, num9, chatMode, chatConfig, bool10, bool11, supportView, l4, l5, num10, num11, num12, num13, num14, bool12, image2, str11, str12, map, i18nInf, num15, num16, num17, num18, str13, chatSecurityConfig, bool13, chatPostType, bool14, l6, num19, bool15, bool16, num20, list, map2, bool17, l7, l8, bool18, l9, num21, bool19, bool20, bool21, bool22, chatBizContent, ByteString.EMPTY);
    }

    public Chat(String str, Type type, String str2, String str3, Image image, String str4, Integer num, Status status, Long l, String str5, String str6, Integer num2, Boolean bool, Boolean bool2, Integer num3, Integer num4, String str7, Long l2, Boolean bool3, Role role, Boolean bool4, Integer num5, Boolean bool5, Announcement announcement, String str8, Long l3, Boolean bool6, ChatEntitySetting chatEntitySetting, ChatSetting chatSetting, Boolean bool7, Boolean bool8, String str9, String str10, Integer num6, Integer num7, Boolean bool9, Integer num8, Integer num9, ChatMode chatMode, ChatConfig chatConfig, Boolean bool10, Boolean bool11, SupportView supportView, Long l4, Long l5, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Boolean bool12, Image image2, String str11, String str12, Map<String, String> map, I18nInf i18nInf, Integer num15, Integer num16, Integer num17, Integer num18, String str13, ChatSecurityConfig chatSecurityConfig, Boolean bool13, ChatPostType chatPostType, Boolean bool14, Long l6, Integer num19, Boolean bool15, Boolean bool16, Integer num20, List<Integer> list, Map<String, String> map2, Boolean bool17, Long l7, Long l8, Boolean bool18, Long l9, Integer num21, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, ChatBizContent chatBizContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mtype = type;
        this.mlast_message_id = str2;
        this.mname = str3;
        this.mavatar = image;
        this.mowner_id = str4;
        this.mnew_message_count = num;
        this.mstatus = status;
        this.mupdate_time = l;
        this.mkey = str5;
        this.mdescription = str6;
        this.mmember_count = num2;
        this.mis_department = bool;
        this.mis_public = bool2;
        this.mlast_message_position = num3;
        this.muser_count = num4;
        this.mname_pinyin = str7;
        this.mcreate_time = l2;
        this.mis_customer_service = bool3;
        this.mrole = role;
        this.mis_custom_icon = bool4;
        this.mno_badged_new_message_count = num5;
        this.moff_edit_group_chat_info = bool5;
        this.mannouncement = announcement;
        this.mtenant_id = str8;
        this.mupdate_time_ms = l3;
        this.mis_remind = bool6;
        this.mchat_entity_setting = chatEntitySetting;
        this.muser_setting = chatSetting;
        this.mis_dissolved = bool7;
        this.mis_meeting = bool8;
        this.mlast_visible_message_id = str9;
        this.mlast_thread_id = str10;
        this.mnew_thread_count = num6;
        this.mlast_thread_position = num7;
        this.mis_crypto = bool9;
        this.mno_badged_new_thread_count = num8;
        this.mthread_start_position = num9;
        this.mchat_mode = chatMode;
        this.mchat_config = chatConfig;
        this.mis_cross_tenant = bool10;
        this.mis_tenant = bool11;
        this.msupport_view = supportView;
        this.mjoin_time_ms = l4;
        this.moncall_id = l5;
        this.mlast_visible_message_position = num10;
        this.mlast_visible_message_no_badged_count = num11;
        this.mread_position = num12;
        this.mread_position_badge_count = num13;
        this.mlast_message_position_badge_count = num14;
        this.menable_watermark = bool12;
        this.mmini_avatar = image2;
        this.msidebar_id = str11;
        this.mname_py = str12;
        this.mi18n_names = Internal.immutableCopyOf("mi18n_names", map);
        this.mi18n_inf = i18nInf;
        this.mread_thread_position = num15;
        this.mread_thread_position_badge_count = num16;
        this.mlast_thread_position_badge_count = num17;
        this.mlast_visible_thread_position = num18;
        this.mlast_visible_thread_id = str13;
        this.mchat_security_config = chatSecurityConfig;
        this.mis_public_v2 = bool13;
        this.mpost_type = chatPostType;
        this.mallow_post = bool14;
        this.mburned_time = l6;
        this.mput_chatter_apply_count = num19;
        this.mshow_banner = bool15;
        this.mis_large_group = bool16;
        this.mfirst_chat_message_position = num20;
        this.mtags = Internal.immutableCopyOf("mtags", list);
        this.mextra = Internal.immutableCopyOf("mextra", map2);
        this.mis_same_page_meeting = bool17;
        this.mmy_threads_read_timestamp = l7;
        this.mmy_threads_last_timestamp = l8;
        this.mis_edu = bool18;
        this.mmy_threads_last_display_message_id = l9;
        this.mmy_threads_unread_count = num21;
        this.mis_cross_with_ka = bool19;
        this.mis_admin = bool20;
        this.mis_super = bool21;
        this.mis_team = bool22;
        this.mbiz_content = chatBizContent;
    }

    /* renamed from: com.ss.android.lark.pb.entities.Chat$b */
    private static final class C49653b extends ProtoAdapter<Chat> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124383a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f124384b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Chat chat) throws IOException {
            if (chat.mid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chat.mid);
            }
            if (chat.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, chat.mtype);
            }
            if (chat.mlast_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chat.mlast_message_id);
            }
            if (chat.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, chat.mname);
            }
            if (chat.mavatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 5, chat.mavatar);
            }
            if (chat.mowner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, chat.mowner_id);
            }
            if (chat.mnew_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, chat.mnew_message_count);
            }
            if (chat.mstatus != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 8, chat.mstatus);
            }
            if (chat.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, chat.mupdate_time);
            }
            if (chat.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, chat.mkey);
            }
            if (chat.mdescription != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, chat.mdescription);
            }
            if (chat.mmember_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, chat.mmember_count);
            }
            if (chat.mis_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, chat.mis_department);
            }
            if (chat.mis_public != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, chat.mis_public);
            }
            if (chat.mlast_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, chat.mlast_message_position);
            }
            if (chat.muser_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, chat.muser_count);
            }
            if (chat.mname_pinyin != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, chat.mname_pinyin);
            }
            if (chat.mcreate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 18, chat.mcreate_time);
            }
            if (chat.mis_customer_service != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, chat.mis_customer_service);
            }
            if (chat.mrole != null) {
                Role.ADAPTER.encodeWithTag(protoWriter, 20, chat.mrole);
            }
            if (chat.mis_custom_icon != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, chat.mis_custom_icon);
            }
            if (chat.mno_badged_new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 22, chat.mno_badged_new_message_count);
            }
            if (chat.moff_edit_group_chat_info != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, chat.moff_edit_group_chat_info);
            }
            if (chat.mannouncement != null) {
                Announcement.ADAPTER.encodeWithTag(protoWriter, 24, chat.mannouncement);
            }
            if (chat.mtenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, chat.mtenant_id);
            }
            if (chat.mupdate_time_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 26, chat.mupdate_time_ms);
            }
            if (chat.mis_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, chat.mis_remind);
            }
            if (chat.mchat_entity_setting != null) {
                ChatEntitySetting.ADAPTER.encodeWithTag(protoWriter, 28, chat.mchat_entity_setting);
            }
            if (chat.muser_setting != null) {
                ChatSetting.ADAPTER.encodeWithTag(protoWriter, 29, chat.muser_setting);
            }
            if (chat.mis_dissolved != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, chat.mis_dissolved);
            }
            if (chat.mis_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, chat.mis_meeting);
            }
            if (chat.mlast_visible_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 32, chat.mlast_visible_message_id);
            }
            if (chat.mlast_thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 33, chat.mlast_thread_id);
            }
            if (chat.mnew_thread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 34, chat.mnew_thread_count);
            }
            if (chat.mlast_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 35, chat.mlast_thread_position);
            }
            if (chat.mis_crypto != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 36, chat.mis_crypto);
            }
            if (chat.mno_badged_new_thread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 37, chat.mno_badged_new_thread_count);
            }
            if (chat.mthread_start_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 38, chat.mthread_start_position);
            }
            if (chat.mchat_mode != null) {
                ChatMode.ADAPTER.encodeWithTag(protoWriter, 39, chat.mchat_mode);
            }
            if (chat.mchat_config != null) {
                ChatConfig.ADAPTER.encodeWithTag(protoWriter, 40, chat.mchat_config);
            }
            if (chat.mis_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, chat.mis_cross_tenant);
            }
            if (chat.mis_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 42, chat.mis_tenant);
            }
            if (chat.msupport_view != null) {
                SupportView.ADAPTER.encodeWithTag(protoWriter, 43, chat.msupport_view);
            }
            if (chat.mjoin_time_ms != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 44, chat.mjoin_time_ms);
            }
            if (chat.moncall_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 45, chat.moncall_id);
            }
            if (chat.mlast_visible_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 46, chat.mlast_visible_message_position);
            }
            if (chat.mlast_visible_message_no_badged_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 47, chat.mlast_visible_message_no_badged_count);
            }
            if (chat.mread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 48, chat.mread_position);
            }
            if (chat.mread_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 49, chat.mread_position_badge_count);
            }
            if (chat.mlast_message_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 50, chat.mlast_message_position_badge_count);
            }
            if (chat.menable_watermark != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 51, chat.menable_watermark);
            }
            if (chat.mmini_avatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 52, chat.mmini_avatar);
            }
            if (chat.msidebar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 53, chat.msidebar_id);
            }
            if (chat.mname_py != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, chat.mname_py);
            }
            this.f124383a.encodeWithTag(protoWriter, 101, chat.mi18n_names);
            if (chat.mi18n_inf != null) {
                I18nInf.ADAPTER.encodeWithTag(protoWriter, 102, chat.mi18n_inf);
            }
            if (chat.mread_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 103, chat.mread_thread_position);
            }
            if (chat.mread_thread_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 104, chat.mread_thread_position_badge_count);
            }
            if (chat.mlast_thread_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, chat.mlast_thread_position_badge_count);
            }
            if (chat.mlast_visible_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 106, chat.mlast_visible_thread_position);
            }
            if (chat.mlast_visible_thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, chat.mlast_visible_thread_id);
            }
            if (chat.mchat_security_config != null) {
                ChatSecurityConfig.ADAPTER.encodeWithTag(protoWriter, 108, chat.mchat_security_config);
            }
            if (chat.mis_public_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmEvents.EVENT_NR, chat.mis_public_v2);
            }
            if (chat.mpost_type != null) {
                ChatPostType.ADAPTER.encodeWithTag(protoWriter, SmEvents.EVENT_NO, chat.mpost_type);
            }
            if (chat.mallow_post != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmEvents.EVENT_NT, chat.mallow_post);
            }
            if (chat.mburned_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, SmEvents.EVENT_NE_RR, chat.mburned_time);
            }
            if (chat.mput_chatter_apply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, SmEvents.EVENT_RE, chat.mput_chatter_apply_count);
            }
            if (chat.mshow_banner != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmEvents.EVENT_TO, chat.mshow_banner);
            }
            if (chat.mis_large_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 115, chat.mis_large_group);
            }
            if (chat.mfirst_chat_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, SmEvents.EVENT_RS, chat.mfirst_chat_message_position);
            }
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 117, chat.mtags);
            this.f124384b.encodeWithTag(protoWriter, 118, chat.mextra);
            if (chat.mis_same_page_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 119, chat.mis_same_page_meeting);
            }
            if (chat.mmy_threads_read_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, SmEvents.EVENT_NW, chat.mmy_threads_read_timestamp);
            }
            if (chat.mmy_threads_last_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, SmActions.ACTION_INIT_ENTRY, chat.mmy_threads_last_timestamp);
            }
            if (chat.mis_edu != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmActions.ACTION_INIT_EXIT, chat.mis_edu);
            }
            if (chat.mmy_threads_last_display_message_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, SmActions.ACTION_CALLING_ENTRY, chat.mmy_threads_last_display_message_id);
            }
            if (chat.mmy_threads_unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, SmActions.ACTION_CALLING_EXIT, chat.mmy_threads_unread_count);
            }
            if (chat.mis_cross_with_ka != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmActions.ACTION_RINGING_ENTRY, chat.mis_cross_with_ka);
            }
            if (chat.mis_admin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmActions.ACTION_RINGING_EXIT, chat.mis_admin);
            }
            if (chat.mis_super != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmActions.ACTION_ONTHECALL_ENTRY, chat.mis_super);
            }
            if (chat.mis_team != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmActions.ACTION_ONTHECALL_EXIT, chat.mis_team);
            }
            if (chat.mbiz_content != null) {
                ChatBizContent.ADAPTER.encodeWithTag(protoWriter, 129, chat.mbiz_content);
            }
            protoWriter.writeBytes(chat.unknownFields());
        }

        /* renamed from: a */
        public Chat decode(ProtoReader protoReader) throws IOException {
            C49652a aVar = new C49652a();
            aVar.f124357a = "";
            aVar.f124359c = "";
            aVar.f124360d = "";
            aVar.f124362f = "";
            aVar.f124363g = 0;
            aVar.f124365i = 0L;
            aVar.f124366j = "";
            aVar.f124367k = "";
            aVar.f124368l = 0;
            aVar.f124369m = false;
            aVar.f124370n = false;
            aVar.f124371o = 0;
            aVar.f124372p = 0;
            aVar.f124373q = "";
            aVar.f124374r = 0L;
            aVar.f124375s = false;
            aVar.f124377u = false;
            aVar.f124378v = 0;
            aVar.f124379w = false;
            aVar.f124381y = "";
            aVar.f124382z = 0L;
            aVar.f124331A = true;
            aVar.f124334D = false;
            aVar.f124335E = false;
            aVar.f124336F = "";
            aVar.f124337G = "";
            aVar.f124338H = 0;
            aVar.f124339I = 0;
            aVar.f124340J = false;
            aVar.f124341K = 0;
            aVar.f124342L = 0;
            aVar.f124345O = false;
            aVar.f124346P = false;
            aVar.f124348R = 0L;
            aVar.f124349S = 0L;
            aVar.f124350T = 0;
            aVar.f124351U = 0;
            aVar.f124352V = 0;
            aVar.f124353W = 0;
            aVar.f124354X = 0;
            aVar.f124355Y = false;
            aVar.aa = "";
            aVar.ab = "";
            aVar.ae = 0;
            aVar.af = 0;
            aVar.ag = 0;
            aVar.ah = 0;
            aVar.f175454ai = "";
            aVar.ak = false;
            aVar.am = false;
            aVar.an = 0L;
            aVar.ao = 0;
            aVar.ap = false;
            aVar.aq = false;
            aVar.ar = 0;
            aVar.au = false;
            aVar.av = 0L;
            aVar.aw = 0L;
            aVar.ax = false;
            aVar.ay = 0L;
            aVar.az = 0;
            aVar.aA = false;
            aVar.aB = false;
            aVar.aC = false;
            aVar.aD = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124357a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f124358b = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f124359c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124360d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124361e = Image.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124362f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124363g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f124364h = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f124365i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124366j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124367k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124368l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f124369m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f124370n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f124371o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f124372p = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            aVar.f124373q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            aVar.f124374r = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 19:
                            aVar.f124375s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            try {
                                aVar.f124376t = Role.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 21:
                            aVar.f124377u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f124378v = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            aVar.f124379w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f124380x = Announcement.ADAPTER.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            aVar.f124381y = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            aVar.f124382z = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            aVar.f124331A = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f124332B = ChatEntitySetting.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            aVar.f124333C = ChatSetting.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            aVar.f124334D = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f124335E = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 32:
                            aVar.f124336F = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 33:
                            aVar.f124337G = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 34:
                            aVar.f124338H = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 35:
                            aVar.f124339I = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 36:
                            aVar.f124340J = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 37:
                            aVar.f124341K = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 38:
                            aVar.f124342L = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 39:
                            try {
                                aVar.f124343M = ChatMode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 40:
                            aVar.f124344N = ChatConfig.ADAPTER.decode(protoReader);
                            break;
                        case 41:
                            aVar.f124345O = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 42:
                            aVar.f124346P = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 43:
                            try {
                                aVar.f124347Q = SupportView.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 44:
                            aVar.f124348R = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 45:
                            aVar.f124349S = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 46:
                            aVar.f124350T = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 47:
                            aVar.f124351U = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 48:
                            aVar.f124352V = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 49:
                            aVar.f124353W = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case MmListControl.f116813f:
                            aVar.f124354X = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 51:
                            aVar.f124355Y = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 52:
                            aVar.f124356Z = Image.ADAPTER.decode(protoReader);
                            break;
                        case 53:
                            aVar.aa = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            switch (nextTag) {
                                case 100:
                                    aVar.ab = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 101:
                                    aVar.ac.putAll(this.f124383a.decode(protoReader));
                                    continue;
                                case 102:
                                    aVar.ad = I18nInf.ADAPTER.decode(protoReader);
                                    continue;
                                case 103:
                                    aVar.ae = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 104:
                                    aVar.af = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case LocationRequest.PRIORITY_NO_POWER:
                                    aVar.ag = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 106:
                                    aVar.ah = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case ActivityIdentificationData.WALKING:
                                    aVar.f175454ai = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 108:
                                    aVar.aj = ChatSecurityConfig.ADAPTER.decode(protoReader);
                                    continue;
                                case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                                    aVar.ak = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                                    try {
                                        aVar.al = ChatPostType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                        break;
                                    }
                                case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                    aVar.am = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                                    aVar.an = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                                    aVar.ao = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case SmEvents.EVENT_TO /*{ENCODED_INT: 114}*/:
                                    aVar.ap = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 115:
                                    aVar.aq = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case SmEvents.EVENT_RS /*{ENCODED_INT: 116}*/:
                                    aVar.ar = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 117:
                                    aVar.as.add(ProtoAdapter.INT32.decode(protoReader));
                                    continue;
                                case 118:
                                    aVar.at.putAll(this.f124384b.decode(protoReader));
                                    continue;
                                case 119:
                                    aVar.au = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case SmEvents.EVENT_NW /*{ENCODED_INT: 120}*/:
                                    aVar.av = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case SmActions.ACTION_INIT_ENTRY /*{ENCODED_INT: 121}*/:
                                    aVar.aw = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                                    aVar.ax = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case SmActions.ACTION_CALLING_ENTRY /*{ENCODED_INT: 123}*/:
                                    aVar.ay = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case SmActions.ACTION_CALLING_EXIT /*{ENCODED_INT: 124}*/:
                                    aVar.az = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case SmActions.ACTION_RINGING_ENTRY /*{ENCODED_INT: 125}*/:
                                    aVar.aA = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case SmActions.ACTION_RINGING_EXIT /*{ENCODED_INT: 126}*/:
                                    aVar.aB = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case SmActions.ACTION_ONTHECALL_ENTRY /*{ENCODED_INT: 127}*/:
                                    aVar.aC = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case SmActions.ACTION_ONTHECALL_EXIT /*{ENCODED_INT: 128}*/:
                                    aVar.aD = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 129:
                                    aVar.aE = ChatBizContent.ADAPTER.decode(protoReader);
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        C49653b() {
            super(FieldEncoding.LENGTH_DELIMITED, Chat.class);
        }

        /* renamed from: a */
        public int encodedSize(Chat chat) {
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
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            int i46;
            int i47;
            int i48;
            int i49;
            int i50;
            int i51;
            int i52;
            int i53;
            int i54;
            int i55;
            int i56;
            int i57;
            int i58;
            int i59;
            int i60;
            int i61;
            int i62;
            int i63;
            int i64;
            int i65;
            int i66;
            int i67;
            int i68;
            int i69;
            int i70;
            int i71;
            int i72;
            int i73;
            int i74;
            int i75;
            int i76;
            int i77;
            int i78;
            int i79;
            int i80 = 0;
            if (chat.mid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, chat.mid);
            } else {
                i = 0;
            }
            if (chat.mtype != null) {
                i2 = Type.ADAPTER.encodedSizeWithTag(2, chat.mtype);
            } else {
                i2 = 0;
            }
            int i81 = i + i2;
            if (chat.mlast_message_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, chat.mlast_message_id);
            } else {
                i3 = 0;
            }
            int i82 = i81 + i3;
            if (chat.mname != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, chat.mname);
            } else {
                i4 = 0;
            }
            int i83 = i82 + i4;
            if (chat.mavatar != null) {
                i5 = Image.ADAPTER.encodedSizeWithTag(5, chat.mavatar);
            } else {
                i5 = 0;
            }
            int i84 = i83 + i5;
            if (chat.mowner_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, chat.mowner_id);
            } else {
                i6 = 0;
            }
            int i85 = i84 + i6;
            if (chat.mnew_message_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, chat.mnew_message_count);
            } else {
                i7 = 0;
            }
            int i86 = i85 + i7;
            if (chat.mstatus != null) {
                i8 = Status.ADAPTER.encodedSizeWithTag(8, chat.mstatus);
            } else {
                i8 = 0;
            }
            int i87 = i86 + i8;
            if (chat.mupdate_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, chat.mupdate_time);
            } else {
                i9 = 0;
            }
            int i88 = i87 + i9;
            if (chat.mkey != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, chat.mkey);
            } else {
                i10 = 0;
            }
            int i89 = i88 + i10;
            if (chat.mdescription != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, chat.mdescription);
            } else {
                i11 = 0;
            }
            int i90 = i89 + i11;
            if (chat.mmember_count != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(12, chat.mmember_count);
            } else {
                i12 = 0;
            }
            int i91 = i90 + i12;
            if (chat.mis_department != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(13, chat.mis_department);
            } else {
                i13 = 0;
            }
            int i92 = i91 + i13;
            if (chat.mis_public != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(14, chat.mis_public);
            } else {
                i14 = 0;
            }
            int i93 = i92 + i14;
            if (chat.mlast_message_position != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(15, chat.mlast_message_position);
            } else {
                i15 = 0;
            }
            int i94 = i93 + i15;
            if (chat.muser_count != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(16, chat.muser_count);
            } else {
                i16 = 0;
            }
            int i95 = i94 + i16;
            if (chat.mname_pinyin != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(17, chat.mname_pinyin);
            } else {
                i17 = 0;
            }
            int i96 = i95 + i17;
            if (chat.mcreate_time != null) {
                i18 = ProtoAdapter.INT64.encodedSizeWithTag(18, chat.mcreate_time);
            } else {
                i18 = 0;
            }
            int i97 = i96 + i18;
            if (chat.mis_customer_service != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(19, chat.mis_customer_service);
            } else {
                i19 = 0;
            }
            int i98 = i97 + i19;
            if (chat.mrole != null) {
                i20 = Role.ADAPTER.encodedSizeWithTag(20, chat.mrole);
            } else {
                i20 = 0;
            }
            int i99 = i98 + i20;
            if (chat.mis_custom_icon != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(21, chat.mis_custom_icon);
            } else {
                i21 = 0;
            }
            int i100 = i99 + i21;
            if (chat.mno_badged_new_message_count != null) {
                i22 = ProtoAdapter.INT32.encodedSizeWithTag(22, chat.mno_badged_new_message_count);
            } else {
                i22 = 0;
            }
            int i101 = i100 + i22;
            if (chat.moff_edit_group_chat_info != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(23, chat.moff_edit_group_chat_info);
            } else {
                i23 = 0;
            }
            int i102 = i101 + i23;
            if (chat.mannouncement != null) {
                i24 = Announcement.ADAPTER.encodedSizeWithTag(24, chat.mannouncement);
            } else {
                i24 = 0;
            }
            int i103 = i102 + i24;
            if (chat.mtenant_id != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(25, chat.mtenant_id);
            } else {
                i25 = 0;
            }
            int i104 = i103 + i25;
            if (chat.mupdate_time_ms != null) {
                i26 = ProtoAdapter.INT64.encodedSizeWithTag(26, chat.mupdate_time_ms);
            } else {
                i26 = 0;
            }
            int i105 = i104 + i26;
            if (chat.mis_remind != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(27, chat.mis_remind);
            } else {
                i27 = 0;
            }
            int i106 = i105 + i27;
            if (chat.mchat_entity_setting != null) {
                i28 = ChatEntitySetting.ADAPTER.encodedSizeWithTag(28, chat.mchat_entity_setting);
            } else {
                i28 = 0;
            }
            int i107 = i106 + i28;
            if (chat.muser_setting != null) {
                i29 = ChatSetting.ADAPTER.encodedSizeWithTag(29, chat.muser_setting);
            } else {
                i29 = 0;
            }
            int i108 = i107 + i29;
            if (chat.mis_dissolved != null) {
                i30 = ProtoAdapter.BOOL.encodedSizeWithTag(30, chat.mis_dissolved);
            } else {
                i30 = 0;
            }
            int i109 = i108 + i30;
            if (chat.mis_meeting != null) {
                i31 = ProtoAdapter.BOOL.encodedSizeWithTag(31, chat.mis_meeting);
            } else {
                i31 = 0;
            }
            int i110 = i109 + i31;
            if (chat.mlast_visible_message_id != null) {
                i32 = ProtoAdapter.STRING.encodedSizeWithTag(32, chat.mlast_visible_message_id);
            } else {
                i32 = 0;
            }
            int i111 = i110 + i32;
            if (chat.mlast_thread_id != null) {
                i33 = ProtoAdapter.STRING.encodedSizeWithTag(33, chat.mlast_thread_id);
            } else {
                i33 = 0;
            }
            int i112 = i111 + i33;
            if (chat.mnew_thread_count != null) {
                i34 = ProtoAdapter.INT32.encodedSizeWithTag(34, chat.mnew_thread_count);
            } else {
                i34 = 0;
            }
            int i113 = i112 + i34;
            if (chat.mlast_thread_position != null) {
                i35 = ProtoAdapter.INT32.encodedSizeWithTag(35, chat.mlast_thread_position);
            } else {
                i35 = 0;
            }
            int i114 = i113 + i35;
            if (chat.mis_crypto != null) {
                i36 = ProtoAdapter.BOOL.encodedSizeWithTag(36, chat.mis_crypto);
            } else {
                i36 = 0;
            }
            int i115 = i114 + i36;
            if (chat.mno_badged_new_thread_count != null) {
                i37 = ProtoAdapter.INT32.encodedSizeWithTag(37, chat.mno_badged_new_thread_count);
            } else {
                i37 = 0;
            }
            int i116 = i115 + i37;
            if (chat.mthread_start_position != null) {
                i38 = ProtoAdapter.INT32.encodedSizeWithTag(38, chat.mthread_start_position);
            } else {
                i38 = 0;
            }
            int i117 = i116 + i38;
            if (chat.mchat_mode != null) {
                i39 = ChatMode.ADAPTER.encodedSizeWithTag(39, chat.mchat_mode);
            } else {
                i39 = 0;
            }
            int i118 = i117 + i39;
            if (chat.mchat_config != null) {
                i40 = ChatConfig.ADAPTER.encodedSizeWithTag(40, chat.mchat_config);
            } else {
                i40 = 0;
            }
            int i119 = i118 + i40;
            if (chat.mis_cross_tenant != null) {
                i41 = ProtoAdapter.BOOL.encodedSizeWithTag(41, chat.mis_cross_tenant);
            } else {
                i41 = 0;
            }
            int i120 = i119 + i41;
            if (chat.mis_tenant != null) {
                i42 = ProtoAdapter.BOOL.encodedSizeWithTag(42, chat.mis_tenant);
            } else {
                i42 = 0;
            }
            int i121 = i120 + i42;
            if (chat.msupport_view != null) {
                i43 = SupportView.ADAPTER.encodedSizeWithTag(43, chat.msupport_view);
            } else {
                i43 = 0;
            }
            int i122 = i121 + i43;
            if (chat.mjoin_time_ms != null) {
                i44 = ProtoAdapter.INT64.encodedSizeWithTag(44, chat.mjoin_time_ms);
            } else {
                i44 = 0;
            }
            int i123 = i122 + i44;
            if (chat.moncall_id != null) {
                i45 = ProtoAdapter.INT64.encodedSizeWithTag(45, chat.moncall_id);
            } else {
                i45 = 0;
            }
            int i124 = i123 + i45;
            if (chat.mlast_visible_message_position != null) {
                i46 = ProtoAdapter.INT32.encodedSizeWithTag(46, chat.mlast_visible_message_position);
            } else {
                i46 = 0;
            }
            int i125 = i124 + i46;
            if (chat.mlast_visible_message_no_badged_count != null) {
                i47 = ProtoAdapter.INT32.encodedSizeWithTag(47, chat.mlast_visible_message_no_badged_count);
            } else {
                i47 = 0;
            }
            int i126 = i125 + i47;
            if (chat.mread_position != null) {
                i48 = ProtoAdapter.INT32.encodedSizeWithTag(48, chat.mread_position);
            } else {
                i48 = 0;
            }
            int i127 = i126 + i48;
            if (chat.mread_position_badge_count != null) {
                i49 = ProtoAdapter.INT32.encodedSizeWithTag(49, chat.mread_position_badge_count);
            } else {
                i49 = 0;
            }
            int i128 = i127 + i49;
            if (chat.mlast_message_position_badge_count != null) {
                i50 = ProtoAdapter.INT32.encodedSizeWithTag(50, chat.mlast_message_position_badge_count);
            } else {
                i50 = 0;
            }
            int i129 = i128 + i50;
            if (chat.menable_watermark != null) {
                i51 = ProtoAdapter.BOOL.encodedSizeWithTag(51, chat.menable_watermark);
            } else {
                i51 = 0;
            }
            int i130 = i129 + i51;
            if (chat.mmini_avatar != null) {
                i52 = Image.ADAPTER.encodedSizeWithTag(52, chat.mmini_avatar);
            } else {
                i52 = 0;
            }
            int i131 = i130 + i52;
            if (chat.msidebar_id != null) {
                i53 = ProtoAdapter.STRING.encodedSizeWithTag(53, chat.msidebar_id);
            } else {
                i53 = 0;
            }
            int i132 = i131 + i53;
            if (chat.mname_py != null) {
                i54 = ProtoAdapter.STRING.encodedSizeWithTag(100, chat.mname_py);
            } else {
                i54 = 0;
            }
            int encodedSizeWithTag = i132 + i54 + this.f124383a.encodedSizeWithTag(101, chat.mi18n_names);
            if (chat.mi18n_inf != null) {
                i55 = I18nInf.ADAPTER.encodedSizeWithTag(102, chat.mi18n_inf);
            } else {
                i55 = 0;
            }
            int i133 = encodedSizeWithTag + i55;
            if (chat.mread_thread_position != null) {
                i56 = ProtoAdapter.INT32.encodedSizeWithTag(103, chat.mread_thread_position);
            } else {
                i56 = 0;
            }
            int i134 = i133 + i56;
            if (chat.mread_thread_position_badge_count != null) {
                i57 = ProtoAdapter.INT32.encodedSizeWithTag(104, chat.mread_thread_position_badge_count);
            } else {
                i57 = 0;
            }
            int i135 = i134 + i57;
            if (chat.mlast_thread_position_badge_count != null) {
                i58 = ProtoAdapter.INT32.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, chat.mlast_thread_position_badge_count);
            } else {
                i58 = 0;
            }
            int i136 = i135 + i58;
            if (chat.mlast_visible_thread_position != null) {
                i59 = ProtoAdapter.INT32.encodedSizeWithTag(106, chat.mlast_visible_thread_position);
            } else {
                i59 = 0;
            }
            int i137 = i136 + i59;
            if (chat.mlast_visible_thread_id != null) {
                i60 = ProtoAdapter.STRING.encodedSizeWithTag(ActivityIdentificationData.WALKING, chat.mlast_visible_thread_id);
            } else {
                i60 = 0;
            }
            int i138 = i137 + i60;
            if (chat.mchat_security_config != null) {
                i61 = ChatSecurityConfig.ADAPTER.encodedSizeWithTag(108, chat.mchat_security_config);
            } else {
                i61 = 0;
            }
            int i139 = i138 + i61;
            if (chat.mis_public_v2 != null) {
                i62 = ProtoAdapter.BOOL.encodedSizeWithTag(SmEvents.EVENT_NR, chat.mis_public_v2);
            } else {
                i62 = 0;
            }
            int i140 = i139 + i62;
            if (chat.mpost_type != null) {
                i63 = ChatPostType.ADAPTER.encodedSizeWithTag(SmEvents.EVENT_NO, chat.mpost_type);
            } else {
                i63 = 0;
            }
            int i141 = i140 + i63;
            if (chat.mallow_post != null) {
                i64 = ProtoAdapter.BOOL.encodedSizeWithTag(SmEvents.EVENT_NT, chat.mallow_post);
            } else {
                i64 = 0;
            }
            int i142 = i141 + i64;
            if (chat.mburned_time != null) {
                i65 = ProtoAdapter.INT64.encodedSizeWithTag(SmEvents.EVENT_NE_RR, chat.mburned_time);
            } else {
                i65 = 0;
            }
            int i143 = i142 + i65;
            if (chat.mput_chatter_apply_count != null) {
                i66 = ProtoAdapter.INT32.encodedSizeWithTag(SmEvents.EVENT_RE, chat.mput_chatter_apply_count);
            } else {
                i66 = 0;
            }
            int i144 = i143 + i66;
            if (chat.mshow_banner != null) {
                i67 = ProtoAdapter.BOOL.encodedSizeWithTag(SmEvents.EVENT_TO, chat.mshow_banner);
            } else {
                i67 = 0;
            }
            int i145 = i144 + i67;
            if (chat.mis_large_group != null) {
                i68 = ProtoAdapter.BOOL.encodedSizeWithTag(115, chat.mis_large_group);
            } else {
                i68 = 0;
            }
            int i146 = i145 + i68;
            if (chat.mfirst_chat_message_position != null) {
                i69 = ProtoAdapter.INT32.encodedSizeWithTag(SmEvents.EVENT_RS, chat.mfirst_chat_message_position);
            } else {
                i69 = 0;
            }
            int encodedSizeWithTag2 = i146 + i69 + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(117, chat.mtags) + this.f124384b.encodedSizeWithTag(118, chat.mextra);
            if (chat.mis_same_page_meeting != null) {
                i70 = ProtoAdapter.BOOL.encodedSizeWithTag(119, chat.mis_same_page_meeting);
            } else {
                i70 = 0;
            }
            int i147 = encodedSizeWithTag2 + i70;
            if (chat.mmy_threads_read_timestamp != null) {
                i71 = ProtoAdapter.INT64.encodedSizeWithTag(SmEvents.EVENT_NW, chat.mmy_threads_read_timestamp);
            } else {
                i71 = 0;
            }
            int i148 = i147 + i71;
            if (chat.mmy_threads_last_timestamp != null) {
                i72 = ProtoAdapter.INT64.encodedSizeWithTag(SmActions.ACTION_INIT_ENTRY, chat.mmy_threads_last_timestamp);
            } else {
                i72 = 0;
            }
            int i149 = i148 + i72;
            if (chat.mis_edu != null) {
                i73 = ProtoAdapter.BOOL.encodedSizeWithTag(SmActions.ACTION_INIT_EXIT, chat.mis_edu);
            } else {
                i73 = 0;
            }
            int i150 = i149 + i73;
            if (chat.mmy_threads_last_display_message_id != null) {
                i74 = ProtoAdapter.INT64.encodedSizeWithTag(SmActions.ACTION_CALLING_ENTRY, chat.mmy_threads_last_display_message_id);
            } else {
                i74 = 0;
            }
            int i151 = i150 + i74;
            if (chat.mmy_threads_unread_count != null) {
                i75 = ProtoAdapter.INT32.encodedSizeWithTag(SmActions.ACTION_CALLING_EXIT, chat.mmy_threads_unread_count);
            } else {
                i75 = 0;
            }
            int i152 = i151 + i75;
            if (chat.mis_cross_with_ka != null) {
                i76 = ProtoAdapter.BOOL.encodedSizeWithTag(SmActions.ACTION_RINGING_ENTRY, chat.mis_cross_with_ka);
            } else {
                i76 = 0;
            }
            int i153 = i152 + i76;
            if (chat.mis_admin != null) {
                i77 = ProtoAdapter.BOOL.encodedSizeWithTag(SmActions.ACTION_RINGING_EXIT, chat.mis_admin);
            } else {
                i77 = 0;
            }
            int i154 = i153 + i77;
            if (chat.mis_super != null) {
                i78 = ProtoAdapter.BOOL.encodedSizeWithTag(SmActions.ACTION_ONTHECALL_ENTRY, chat.mis_super);
            } else {
                i78 = 0;
            }
            int i155 = i154 + i78;
            if (chat.mis_team != null) {
                i79 = ProtoAdapter.BOOL.encodedSizeWithTag(SmActions.ACTION_ONTHECALL_EXIT, chat.mis_team);
            } else {
                i79 = 0;
            }
            int i156 = i155 + i79;
            if (chat.mbiz_content != null) {
                i80 = ChatBizContent.ADAPTER.encodedSizeWithTag(129, chat.mbiz_content);
            }
            return i156 + i80 + chat.unknownFields().size();
        }
    }

    public static final class Announcement extends Message<Announcement, C49648a> {
        public static final ProtoAdapter<Announcement> ADAPTER = new C49649b();
        public static final Boolean DEFAULT_ENABLE_OPENDOC = false;
        public static final Long DEFAULT_UPDATE_TIME = 0L;
        public static final Boolean DEFAULT_USE_OPENDOC = true;
        private static final long serialVersionUID = 0;
        public final String mcontent;
        public final String mdoc_url;
        public final Boolean menable_opendoc;
        public final String mlast_editor_id;
        public final Long mupdate_time;
        public final Boolean muse_opendoc;

        /* renamed from: com.ss.android.lark.pb.entities.Chat$Announcement$b */
        private static final class C49649b extends ProtoAdapter<Announcement> {
            C49649b() {
                super(FieldEncoding.LENGTH_DELIMITED, Announcement.class);
            }

            /* renamed from: a */
            public int encodedSize(Announcement announcement) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (announcement.mcontent != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, announcement.mcontent);
                } else {
                    i = 0;
                }
                if (announcement.mupdate_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, announcement.mupdate_time);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (announcement.mlast_editor_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, announcement.mlast_editor_id);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (announcement.mdoc_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, announcement.mdoc_url);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (announcement.menable_opendoc != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, announcement.menable_opendoc);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (announcement.muse_opendoc != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, announcement.muse_opendoc);
                }
                return i10 + i6 + announcement.unknownFields().size();
            }

            /* renamed from: a */
            public Announcement decode(ProtoReader protoReader) throws IOException {
                C49648a aVar = new C49648a();
                aVar.f124323a = "";
                aVar.f124324b = 0L;
                aVar.f124325c = "";
                aVar.f124326d = "";
                aVar.f124327e = false;
                aVar.f124328f = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f124323a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f124324b = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 3:
                                aVar.f124325c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f124326d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f124327e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f124328f = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Announcement announcement) throws IOException {
                if (announcement.mcontent != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, announcement.mcontent);
                }
                if (announcement.mupdate_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, announcement.mupdate_time);
                }
                if (announcement.mlast_editor_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, announcement.mlast_editor_id);
                }
                if (announcement.mdoc_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, announcement.mdoc_url);
                }
                if (announcement.menable_opendoc != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, announcement.menable_opendoc);
                }
                if (announcement.muse_opendoc != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, announcement.muse_opendoc);
                }
                protoWriter.writeBytes(announcement.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.Chat$Announcement$a */
        public static final class C49648a extends Message.Builder<Announcement, C49648a> {

            /* renamed from: a */
            public String f124323a;

            /* renamed from: b */
            public Long f124324b;

            /* renamed from: c */
            public String f124325c;

            /* renamed from: d */
            public String f124326d;

            /* renamed from: e */
            public Boolean f124327e;

            /* renamed from: f */
            public Boolean f124328f;

            /* renamed from: a */
            public Announcement build() {
                return new Announcement(this.f124323a, this.f124324b, this.f124325c, this.f124326d, this.f124327e, this.f124328f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49648a newBuilder() {
            C49648a aVar = new C49648a();
            aVar.f124323a = this.mcontent;
            aVar.f124324b = this.mupdate_time;
            aVar.f124325c = this.mlast_editor_id;
            aVar.f124326d = this.mdoc_url;
            aVar.f124327e = this.menable_opendoc;
            aVar.f124328f = this.muse_opendoc;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mcontent != null) {
                sb.append(", content=");
                sb.append(this.mcontent);
            }
            if (this.mupdate_time != null) {
                sb.append(", update_time=");
                sb.append(this.mupdate_time);
            }
            if (this.mlast_editor_id != null) {
                sb.append(", last_editor_id=");
                sb.append(this.mlast_editor_id);
            }
            if (this.mdoc_url != null) {
                sb.append(", doc_url=");
                sb.append(this.mdoc_url);
            }
            if (this.menable_opendoc != null) {
                sb.append(", enable_opendoc=");
                sb.append(this.menable_opendoc);
            }
            if (this.muse_opendoc != null) {
                sb.append(", use_opendoc=");
                sb.append(this.muse_opendoc);
            }
            StringBuilder replace = sb.replace(0, 2, "Announcement{");
            replace.append('}');
            return replace.toString();
        }

        public Announcement(String str, Long l, String str2, String str3, Boolean bool, Boolean bool2) {
            this(str, l, str2, str3, bool, bool2, ByteString.EMPTY);
        }

        public Announcement(String str, Long l, String str2, String str3, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mcontent = str;
            this.mupdate_time = l;
            this.mlast_editor_id = str2;
            this.mdoc_url = str3;
            this.menable_opendoc = bool;
            this.muse_opendoc = bool2;
        }
    }

    public static final class I18nInf extends Message<I18nInf, C49650a> {
        public static final ProtoAdapter<I18nInf> ADAPTER = new C49651b();
        private static final long serialVersionUID = 0;
        public final Map<String, String> mi18n_names;

        /* renamed from: com.ss.android.lark.pb.entities.Chat$I18nInf$a */
        public static final class C49650a extends Message.Builder<I18nInf, C49650a> {

            /* renamed from: a */
            public Map<String, String> f124329a = Internal.newMutableMap();

            /* renamed from: a */
            public I18nInf build() {
                return new I18nInf(this.f124329a, super.buildUnknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.Chat$I18nInf$b */
        private static final class C49651b extends ProtoAdapter<I18nInf> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f124330a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C49651b() {
                super(FieldEncoding.LENGTH_DELIMITED, I18nInf.class);
            }

            /* renamed from: a */
            public int encodedSize(I18nInf i18nInf) {
                return this.f124330a.encodedSizeWithTag(1, i18nInf.mi18n_names) + i18nInf.unknownFields().size();
            }

            /* renamed from: a */
            public I18nInf decode(ProtoReader protoReader) throws IOException {
                C49650a aVar = new C49650a();
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
                        aVar.f124329a.putAll(this.f124330a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, I18nInf i18nInf) throws IOException {
                this.f124330a.encodeWithTag(protoWriter, 1, i18nInf.mi18n_names);
                protoWriter.writeBytes(i18nInf.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49650a newBuilder() {
            C49650a aVar = new C49650a();
            aVar.f124329a = Internal.copyOf("mi18n_names", this.mi18n_names);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (!this.mi18n_names.isEmpty()) {
                sb.append(", i18n_names=");
                sb.append(this.mi18n_names);
            }
            StringBuilder replace = sb.replace(0, 2, "I18nInf{");
            replace.append('}');
            return replace.toString();
        }

        public I18nInf(Map<String, String> map) {
            this(map, ByteString.EMPTY);
        }

        public I18nInf(Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mi18n_names = Internal.immutableCopyOf("mi18n_names", map);
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.Chat$a */
    public static final class C49652a extends Message.Builder<Chat, C49652a> {

        /* renamed from: A */
        public Boolean f124331A;

        /* renamed from: B */
        public ChatEntitySetting f124332B;

        /* renamed from: C */
        public ChatSetting f124333C;

        /* renamed from: D */
        public Boolean f124334D;

        /* renamed from: E */
        public Boolean f124335E;

        /* renamed from: F */
        public String f124336F;

        /* renamed from: G */
        public String f124337G;

        /* renamed from: H */
        public Integer f124338H;

        /* renamed from: I */
        public Integer f124339I;

        /* renamed from: J */
        public Boolean f124340J;

        /* renamed from: K */
        public Integer f124341K;

        /* renamed from: L */
        public Integer f124342L;

        /* renamed from: M */
        public ChatMode f124343M;

        /* renamed from: N */
        public ChatConfig f124344N;

        /* renamed from: O */
        public Boolean f124345O;

        /* renamed from: P */
        public Boolean f124346P;

        /* renamed from: Q */
        public SupportView f124347Q;

        /* renamed from: R */
        public Long f124348R;

        /* renamed from: S */
        public Long f124349S;

        /* renamed from: T */
        public Integer f124350T;

        /* renamed from: U */
        public Integer f124351U;

        /* renamed from: V */
        public Integer f124352V;

        /* renamed from: W */
        public Integer f124353W;

        /* renamed from: X */
        public Integer f124354X;

        /* renamed from: Y */
        public Boolean f124355Y;

        /* renamed from: Z */
        public Image f124356Z;

        /* renamed from: a */
        public String f124357a;
        public Boolean aA;
        public Boolean aB;
        public Boolean aC;
        public Boolean aD;
        public ChatBizContent aE;
        public String aa;
        public String ab;
        public Map<String, String> ac = Internal.newMutableMap();
        public I18nInf ad;
        public Integer ae;
        public Integer af;
        public Integer ag;
        public Integer ah;

        /* renamed from: ai  reason: collision with root package name */
        public String f175454ai;
        public ChatSecurityConfig aj;
        public Boolean ak;
        public ChatPostType al;
        public Boolean am;
        public Long an;
        public Integer ao;
        public Boolean ap;
        public Boolean aq;
        public Integer ar;
        public List<Integer> as = Internal.newMutableList();
        public Map<String, String> at = Internal.newMutableMap();
        public Boolean au;
        public Long av;
        public Long aw;
        public Boolean ax;
        public Long ay;
        public Integer az;

        /* renamed from: b */
        public Type f124358b;

        /* renamed from: c */
        public String f124359c;

        /* renamed from: d */
        public String f124360d;

        /* renamed from: e */
        public Image f124361e;

        /* renamed from: f */
        public String f124362f;

        /* renamed from: g */
        public Integer f124363g;

        /* renamed from: h */
        public Status f124364h;

        /* renamed from: i */
        public Long f124365i;

        /* renamed from: j */
        public String f124366j;

        /* renamed from: k */
        public String f124367k;

        /* renamed from: l */
        public Integer f124368l;

        /* renamed from: m */
        public Boolean f124369m;

        /* renamed from: n */
        public Boolean f124370n;

        /* renamed from: o */
        public Integer f124371o;

        /* renamed from: p */
        public Integer f124372p;

        /* renamed from: q */
        public String f124373q;

        /* renamed from: r */
        public Long f124374r;

        /* renamed from: s */
        public Boolean f124375s;

        /* renamed from: t */
        public Role f124376t;

        /* renamed from: u */
        public Boolean f124377u;

        /* renamed from: v */
        public Integer f124378v;

        /* renamed from: w */
        public Boolean f124379w;

        /* renamed from: x */
        public Announcement f124380x;

        /* renamed from: y */
        public String f124381y;

        /* renamed from: z */
        public Long f124382z;

        /* renamed from: a */
        public Chat build() {
            return new Chat(this.f124357a, this.f124358b, this.f124359c, this.f124360d, this.f124361e, this.f124362f, this.f124363g, this.f124364h, this.f124365i, this.f124366j, this.f124367k, this.f124368l, this.f124369m, this.f124370n, this.f124371o, this.f124372p, this.f124373q, this.f124374r, this.f124375s, this.f124376t, this.f124377u, this.f124378v, this.f124379w, this.f124380x, this.f124381y, this.f124382z, this.f124331A, this.f124332B, this.f124333C, this.f124334D, this.f124335E, this.f124336F, this.f124337G, this.f124338H, this.f124339I, this.f124340J, this.f124341K, this.f124342L, this.f124343M, this.f124344N, this.f124345O, this.f124346P, this.f124347Q, this.f124348R, this.f124349S, this.f124350T, this.f124351U, this.f124352V, this.f124353W, this.f124354X, this.f124355Y, this.f124356Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.f175454ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aA, this.aB, this.aC, this.aD, this.aE, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49652a newBuilder() {
        C49652a aVar = new C49652a();
        aVar.f124357a = this.mid;
        aVar.f124358b = this.mtype;
        aVar.f124359c = this.mlast_message_id;
        aVar.f124360d = this.mname;
        aVar.f124361e = this.mavatar;
        aVar.f124362f = this.mowner_id;
        aVar.f124363g = this.mnew_message_count;
        aVar.f124364h = this.mstatus;
        aVar.f124365i = this.mupdate_time;
        aVar.f124366j = this.mkey;
        aVar.f124367k = this.mdescription;
        aVar.f124368l = this.mmember_count;
        aVar.f124369m = this.mis_department;
        aVar.f124370n = this.mis_public;
        aVar.f124371o = this.mlast_message_position;
        aVar.f124372p = this.muser_count;
        aVar.f124373q = this.mname_pinyin;
        aVar.f124374r = this.mcreate_time;
        aVar.f124375s = this.mis_customer_service;
        aVar.f124376t = this.mrole;
        aVar.f124377u = this.mis_custom_icon;
        aVar.f124378v = this.mno_badged_new_message_count;
        aVar.f124379w = this.moff_edit_group_chat_info;
        aVar.f124380x = this.mannouncement;
        aVar.f124381y = this.mtenant_id;
        aVar.f124382z = this.mupdate_time_ms;
        aVar.f124331A = this.mis_remind;
        aVar.f124332B = this.mchat_entity_setting;
        aVar.f124333C = this.muser_setting;
        aVar.f124334D = this.mis_dissolved;
        aVar.f124335E = this.mis_meeting;
        aVar.f124336F = this.mlast_visible_message_id;
        aVar.f124337G = this.mlast_thread_id;
        aVar.f124338H = this.mnew_thread_count;
        aVar.f124339I = this.mlast_thread_position;
        aVar.f124340J = this.mis_crypto;
        aVar.f124341K = this.mno_badged_new_thread_count;
        aVar.f124342L = this.mthread_start_position;
        aVar.f124343M = this.mchat_mode;
        aVar.f124344N = this.mchat_config;
        aVar.f124345O = this.mis_cross_tenant;
        aVar.f124346P = this.mis_tenant;
        aVar.f124347Q = this.msupport_view;
        aVar.f124348R = this.mjoin_time_ms;
        aVar.f124349S = this.moncall_id;
        aVar.f124350T = this.mlast_visible_message_position;
        aVar.f124351U = this.mlast_visible_message_no_badged_count;
        aVar.f124352V = this.mread_position;
        aVar.f124353W = this.mread_position_badge_count;
        aVar.f124354X = this.mlast_message_position_badge_count;
        aVar.f124355Y = this.menable_watermark;
        aVar.f124356Z = this.mmini_avatar;
        aVar.aa = this.msidebar_id;
        aVar.ab = this.mname_py;
        aVar.ac = Internal.copyOf("mi18n_names", this.mi18n_names);
        aVar.ad = this.mi18n_inf;
        aVar.ae = this.mread_thread_position;
        aVar.af = this.mread_thread_position_badge_count;
        aVar.ag = this.mlast_thread_position_badge_count;
        aVar.ah = this.mlast_visible_thread_position;
        aVar.f175454ai = this.mlast_visible_thread_id;
        aVar.aj = this.mchat_security_config;
        aVar.ak = this.mis_public_v2;
        aVar.al = this.mpost_type;
        aVar.am = this.mallow_post;
        aVar.an = this.mburned_time;
        aVar.ao = this.mput_chatter_apply_count;
        aVar.ap = this.mshow_banner;
        aVar.aq = this.mis_large_group;
        aVar.ar = this.mfirst_chat_message_position;
        aVar.as = Internal.copyOf("mtags", this.mtags);
        aVar.at = Internal.copyOf("mextra", this.mextra);
        aVar.au = this.mis_same_page_meeting;
        aVar.av = this.mmy_threads_read_timestamp;
        aVar.aw = this.mmy_threads_last_timestamp;
        aVar.ax = this.mis_edu;
        aVar.ay = this.mmy_threads_last_display_message_id;
        aVar.az = this.mmy_threads_unread_count;
        aVar.aA = this.mis_cross_with_ka;
        aVar.aB = this.mis_admin;
        aVar.aC = this.mis_super;
        aVar.aD = this.mis_team;
        aVar.aE = this.mbiz_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mlast_message_id != null) {
            sb.append(", last_message_id=");
            sb.append(this.mlast_message_id);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mavatar != null) {
            sb.append(", avatar=");
            sb.append(this.mavatar);
        }
        if (this.mowner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.mowner_id);
        }
        if (this.mnew_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.mnew_message_count);
        }
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mupdate_time != null) {
            sb.append(", update_time=");
            sb.append(this.mupdate_time);
        }
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (this.mdescription != null) {
            sb.append(", description=");
            sb.append(this.mdescription);
        }
        if (this.mmember_count != null) {
            sb.append(", member_count=");
            sb.append(this.mmember_count);
        }
        if (this.mis_department != null) {
            sb.append(", is_department=");
            sb.append(this.mis_department);
        }
        if (this.mis_public != null) {
            sb.append(", is_public=");
            sb.append(this.mis_public);
        }
        if (this.mlast_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.mlast_message_position);
        }
        if (this.muser_count != null) {
            sb.append(", user_count=");
            sb.append(this.muser_count);
        }
        if (this.mname_pinyin != null) {
            sb.append(", name_pinyin=");
            sb.append(this.mname_pinyin);
        }
        if (this.mcreate_time != null) {
            sb.append(", create_time=");
            sb.append(this.mcreate_time);
        }
        if (this.mis_customer_service != null) {
            sb.append(", is_customer_service=");
            sb.append(this.mis_customer_service);
        }
        if (this.mrole != null) {
            sb.append(", role=");
            sb.append(this.mrole);
        }
        if (this.mis_custom_icon != null) {
            sb.append(", is_custom_icon=");
            sb.append(this.mis_custom_icon);
        }
        if (this.mno_badged_new_message_count != null) {
            sb.append(", no_badged_new_message_count=");
            sb.append(this.mno_badged_new_message_count);
        }
        if (this.moff_edit_group_chat_info != null) {
            sb.append(", off_edit_group_chat_info=");
            sb.append(this.moff_edit_group_chat_info);
        }
        if (this.mannouncement != null) {
            sb.append(", announcement=");
            sb.append(this.mannouncement);
        }
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        if (this.mupdate_time_ms != null) {
            sb.append(", update_time_ms=");
            sb.append(this.mupdate_time_ms);
        }
        if (this.mis_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.mis_remind);
        }
        if (this.mchat_entity_setting != null) {
            sb.append(", chat_entity_setting=");
            sb.append(this.mchat_entity_setting);
        }
        if (this.muser_setting != null) {
            sb.append(", user_setting=");
            sb.append(this.muser_setting);
        }
        if (this.mis_dissolved != null) {
            sb.append(", is_dissolved=");
            sb.append(this.mis_dissolved);
        }
        if (this.mis_meeting != null) {
            sb.append(", is_meeting=");
            sb.append(this.mis_meeting);
        }
        if (this.mlast_visible_message_id != null) {
            sb.append(", last_visible_message_id=");
            sb.append(this.mlast_visible_message_id);
        }
        if (this.mlast_thread_id != null) {
            sb.append(", last_thread_id=");
            sb.append(this.mlast_thread_id);
        }
        if (this.mnew_thread_count != null) {
            sb.append(", new_thread_count=");
            sb.append(this.mnew_thread_count);
        }
        if (this.mlast_thread_position != null) {
            sb.append(", last_thread_position=");
            sb.append(this.mlast_thread_position);
        }
        if (this.mis_crypto != null) {
            sb.append(", is_crypto=");
            sb.append(this.mis_crypto);
        }
        if (this.mno_badged_new_thread_count != null) {
            sb.append(", no_badged_new_thread_count=");
            sb.append(this.mno_badged_new_thread_count);
        }
        if (this.mthread_start_position != null) {
            sb.append(", thread_start_position=");
            sb.append(this.mthread_start_position);
        }
        if (this.mchat_mode != null) {
            sb.append(", chat_mode=");
            sb.append(this.mchat_mode);
        }
        if (this.mchat_config != null) {
            sb.append(", chat_config=");
            sb.append(this.mchat_config);
        }
        if (this.mis_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.mis_cross_tenant);
        }
        if (this.mis_tenant != null) {
            sb.append(", is_tenant=");
            sb.append(this.mis_tenant);
        }
        if (this.msupport_view != null) {
            sb.append(", support_view=");
            sb.append(this.msupport_view);
        }
        if (this.mjoin_time_ms != null) {
            sb.append(", join_time_ms=");
            sb.append(this.mjoin_time_ms);
        }
        if (this.moncall_id != null) {
            sb.append(", oncall_id=");
            sb.append(this.moncall_id);
        }
        if (this.mlast_visible_message_position != null) {
            sb.append(", last_visible_message_position=");
            sb.append(this.mlast_visible_message_position);
        }
        if (this.mlast_visible_message_no_badged_count != null) {
            sb.append(", last_visible_message_no_badged_count=");
            sb.append(this.mlast_visible_message_no_badged_count);
        }
        if (this.mread_position != null) {
            sb.append(", read_position=");
            sb.append(this.mread_position);
        }
        if (this.mread_position_badge_count != null) {
            sb.append(", read_position_badge_count=");
            sb.append(this.mread_position_badge_count);
        }
        if (this.mlast_message_position_badge_count != null) {
            sb.append(", last_message_position_badge_count=");
            sb.append(this.mlast_message_position_badge_count);
        }
        if (this.menable_watermark != null) {
            sb.append(", enable_watermark=");
            sb.append(this.menable_watermark);
        }
        if (this.mmini_avatar != null) {
            sb.append(", mini_avatar=");
            sb.append(this.mmini_avatar);
        }
        if (this.msidebar_id != null) {
            sb.append(", sidebar_id=");
            sb.append(this.msidebar_id);
        }
        if (this.mname_py != null) {
            sb.append(", name_py=");
            sb.append(this.mname_py);
        }
        if (!this.mi18n_names.isEmpty()) {
            sb.append(", i18n_names=");
            sb.append(this.mi18n_names);
        }
        if (this.mi18n_inf != null) {
            sb.append(", i18n_inf=");
            sb.append(this.mi18n_inf);
        }
        if (this.mread_thread_position != null) {
            sb.append(", read_thread_position=");
            sb.append(this.mread_thread_position);
        }
        if (this.mread_thread_position_badge_count != null) {
            sb.append(", read_thread_position_badge_count=");
            sb.append(this.mread_thread_position_badge_count);
        }
        if (this.mlast_thread_position_badge_count != null) {
            sb.append(", last_thread_position_badge_count=");
            sb.append(this.mlast_thread_position_badge_count);
        }
        if (this.mlast_visible_thread_position != null) {
            sb.append(", last_visible_thread_position=");
            sb.append(this.mlast_visible_thread_position);
        }
        if (this.mlast_visible_thread_id != null) {
            sb.append(", last_visible_thread_id=");
            sb.append(this.mlast_visible_thread_id);
        }
        if (this.mchat_security_config != null) {
            sb.append(", chat_security_config=");
            sb.append(this.mchat_security_config);
        }
        if (this.mis_public_v2 != null) {
            sb.append(", is_public_v2=");
            sb.append(this.mis_public_v2);
        }
        if (this.mpost_type != null) {
            sb.append(", post_type=");
            sb.append(this.mpost_type);
        }
        if (this.mallow_post != null) {
            sb.append(", allow_post=");
            sb.append(this.mallow_post);
        }
        if (this.mburned_time != null) {
            sb.append(", burned_time=");
            sb.append(this.mburned_time);
        }
        if (this.mput_chatter_apply_count != null) {
            sb.append(", put_chatter_apply_count=");
            sb.append(this.mput_chatter_apply_count);
        }
        if (this.mshow_banner != null) {
            sb.append(", show_banner=");
            sb.append(this.mshow_banner);
        }
        if (this.mis_large_group != null) {
            sb.append(", is_large_group=");
            sb.append(this.mis_large_group);
        }
        if (this.mfirst_chat_message_position != null) {
            sb.append(", first_chat_message_position=");
            sb.append(this.mfirst_chat_message_position);
        }
        if (!this.mtags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.mtags);
        }
        if (!this.mextra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.mextra);
        }
        if (this.mis_same_page_meeting != null) {
            sb.append(", is_same_page_meeting=");
            sb.append(this.mis_same_page_meeting);
        }
        if (this.mmy_threads_read_timestamp != null) {
            sb.append(", my_threads_read_timestamp=");
            sb.append(this.mmy_threads_read_timestamp);
        }
        if (this.mmy_threads_last_timestamp != null) {
            sb.append(", my_threads_last_timestamp=");
            sb.append(this.mmy_threads_last_timestamp);
        }
        if (this.mis_edu != null) {
            sb.append(", is_edu=");
            sb.append(this.mis_edu);
        }
        if (this.mmy_threads_last_display_message_id != null) {
            sb.append(", my_threads_last_display_message_id=");
            sb.append(this.mmy_threads_last_display_message_id);
        }
        if (this.mmy_threads_unread_count != null) {
            sb.append(", my_threads_unread_count=");
            sb.append(this.mmy_threads_unread_count);
        }
        if (this.mis_cross_with_ka != null) {
            sb.append(", is_cross_with_ka=");
            sb.append(this.mis_cross_with_ka);
        }
        if (this.mis_admin != null) {
            sb.append(", is_admin=");
            sb.append(this.mis_admin);
        }
        if (this.mis_super != null) {
            sb.append(", is_super=");
            sb.append(this.mis_super);
        }
        if (this.mis_team != null) {
            sb.append(", is_team=");
            sb.append(this.mis_team);
        }
        if (this.mbiz_content != null) {
            sb.append(", biz_content=");
            sb.append(this.mbiz_content);
        }
        StringBuilder replace = sb.replace(0, 2, "Chat{");
        replace.append('}');
        return replace.toString();
    }
}
