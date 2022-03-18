package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
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
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Chat extends Message<Chat, C14775a> {
    public static final ProtoAdapter<Chat> ADAPTER = new C14776b();
    public static final AddMemberApply.Enum DEFAULT_ADD_MEMBER_APPLY = AddMemberApply.Enum.NO_APPLY;
    public static final AddMemberPermission.Enum DEFAULT_ADD_MEMBER_PERMISSION = AddMemberPermission.Enum.ALL_MEMBERS;
    public static final Boolean DEFAULT_ALLOW_POST = true;
    public static final AnonymousSetting.Enum DEFAULT_ANONYMOUS_SETTING = AnonymousSetting.Enum.INVISIBLE;
    public static final Long DEFAULT_ANONYMOUS_TOTAL_QUOTA = 0L;
    public static final AtAllPermission.Enum DEFAULT_AT_ALL_PERMISSION = AtAllPermission.Enum.ALL_MEMBERS;
    public static final Integer DEFAULT_BURN_LIFE = 0;
    public static final Boolean DEFAULT_CHATABLE = true;
    public static final Integer DEFAULT_CHATTER_COUNT = 0;
    public static final ChatMode DEFAULT_CHAT_MODE = ChatMode.DEFAULT;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final CreateUrgentSetting.Enum DEFAULT_CREATE_URGENT_SETTING = CreateUrgentSetting.Enum.ALL_MEMBERS;
    public static final CreateVideoConferenceSetting.Enum DEFAULT_CREATE_VIDEO_CONFERENCE_SETTING = CreateVideoConferenceSetting.Enum.ALL_MEMBERS;
    public static final FeedCard.FeedType DEFAULT_FEED_TYPE = FeedCard.FeedType.INBOX;
    public static final Integer DEFAULT_FIRST_CHAT_MESSAGE_POSITION = -1;
    public static final Integer DEFAULT_FIRST_MESSAGE_POSITION = -1;
    public static final Boolean DEFAULT_HAS_WATER_MARK = false;
    public static final Boolean DEFAULT_IS_ADMIN = false;
    public static final Boolean DEFAULT_IS_ARCHIVED = false;
    public static final Boolean DEFAULT_IS_AUTO_TRANSLATE = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_CROSS_WITH_KA = false;
    public static final Boolean DEFAULT_IS_CRYPTO = false;
    public static final Boolean DEFAULT_IS_CUSTOMER_SERVICE = false;
    public static final Boolean DEFAULT_IS_CUSTOM_ICON = false;
    public static final Boolean DEFAULT_IS_DELETED = false;
    public static final Boolean DEFAULT_IS_DEPARTMENT = false;
    public static final Boolean DEFAULT_IS_DISSOLVED = false;
    public static final Boolean DEFAULT_IS_EDU = false;
    public static final Boolean DEFAULT_IS_IN_BOX = false;
    public static final Boolean DEFAULT_IS_MEETING = false;
    public static final Boolean DEFAULT_IS_OFFICIAL_ONCALL = false;
    public static final Boolean DEFAULT_IS_OFFLINE_ONCALL = false;
    public static final Boolean DEFAULT_IS_PUBLIC = false;
    public static final Boolean DEFAULT_IS_PUBLIC_V2 = false;
    public static final Boolean DEFAULT_IS_REMIND = true;
    public static final Boolean DEFAULT_IS_SHORTCUT = false;
    public static final Boolean DEFAULT_IS_SUPER = false;
    public static final Boolean DEFAULT_IS_SUPPORT_VIEW = false;
    public static final Boolean DEFAULT_IS_TEAM = false;
    public static final Boolean DEFAULT_IS_TENANT = false;
    public static final SystemMessageVisible.Enum DEFAULT_JOIN_MESSAGE_VISIBLE = SystemMessageVisible.Enum.ONLY_OWNER;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION_BADGE_COUNT = 0;
    public static final Float DEFAULT_LAST_READ_OFFSET = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
    public static final Integer DEFAULT_LAST_READ_POSITION = -1;
    public static final Integer DEFAULT_LAST_THREAD_POSITION = 0;
    public static final Integer DEFAULT_LAST_THREAD_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_LAST_VISIBLE_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_VISIBLE_THREAD_POSITION = 0;
    public static final MessagePosition.Enum DEFAULT_MESSAGE_POSITION = MessagePosition.Enum.RECENT_LEFT;
    public static final MessageVisibilitySetting.Enum DEFAULT_MESSAGE_VISIBILITY_SETTING = MessageVisibilitySetting.Enum.ALL_MESSAGES;
    public static final Boolean DEFAULT_MUTEABLE = true;
    public static final Long DEFAULT_MY_THREADS_LAST_TIMESTAMP = 0L;
    public static final Long DEFAULT_MY_THREADS_READ_TIMESTAMP = 0L;
    public static final Integer DEFAULT_MY_THREADS_UNREAD_COUNT = 0;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NEW_THREAD_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_THREAD_COUNT = 0;
    public static final Boolean DEFAULT_OFF_EDIT_GROUP_CHAT_INFO = false;
    public static final PinPermissionSetting.Enum DEFAULT_PIN_PERMISSION_SETTING = PinPermissionSetting.Enum.ALL_MEMBERS;
    public static final PostType DEFAULT_POST_TYPE = PostType.UNKNOWN_POST_TYPE;
    public static final Integer DEFAULT_PUT_CHATTER_APPLY_COUNT = 0;
    public static final SystemMessageVisible.Enum DEFAULT_QUIT_MESSAGE_VISIBLE = SystemMessageVisible.Enum.ONLY_OWNER;
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_READ_THREAD_POSITION = 0;
    public static final Integer DEFAULT_READ_THREAD_POSITION_BADGE_COUNT = 0;
    public static final Role DEFAULT_ROLE = Role.IGNORE;
    public static final ShareCardPermission.Enum DEFAULT_SHARE_CARD_PERMISSION = ShareCardPermission.Enum.ALLOWED;
    public static final Boolean DEFAULT_SHOW_BANNER = false;
    public static final Boolean DEFAULT_SHOW_NICKNAME = false;
    public static final TeamChatType DEFAULT_TEAM_CHAT_TYPE = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
    public static final Long DEFAULT_TEAM_ID = 0L;
    public static final TopNoticePermissionSetting.Enum DEFAULT_TOP_NOTICE_PERMISSION_SETTING = TopNoticePermissionSetting.Enum.ALL_MEMBERS;
    public static final Type DEFAULT_TYPE = Type.P2P;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Integer DEFAULT_USER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final AddMemberApply.Enum add_member_apply;
    public final AddMemberPermission.Enum add_member_permission;
    public final Boolean allow_post;
    public final Announcement announcement;
    public final String anonymous_id;
    public final AnonymousSetting.Enum anonymous_setting;
    public final Long anonymous_total_quota;
    public final AtAllPermission.Enum at_all_permission;
    public final Image avatar;
    public final String avatar_key;
    public final String avatar_path;
    public final List<String> avatar_urls;
    public final String box_id;
    public final Integer burn_life;
    public final ChatMode chat_mode;
    public final Boolean chatable;
    public final Integer chatter_count;
    public final String chatter_id;
    public final Long create_time;
    public final CreateUrgentSetting.Enum create_urgent_setting;
    public final CreateVideoConferenceSetting.Enum create_video_conference_setting;
    public final String description;
    public final FeedCard.FeedType feed_type;
    public final Integer first_chat_message_position;
    public final Integer first_message_position;
    public final Boolean has_water_mark;
    public final String id;
    public final Boolean is_admin;
    public final Boolean is_archived;
    public final Boolean is_auto_translate;
    public final Boolean is_cross_tenant;
    public final Boolean is_cross_with_ka;
    public final Boolean is_crypto;
    public final Boolean is_custom_icon;
    public final Boolean is_customer_service;
    public final Boolean is_deleted;
    public final Boolean is_department;
    public final Boolean is_dissolved;
    public final Boolean is_edu;
    public final Boolean is_in_box;
    public final Boolean is_meeting;
    public final Boolean is_official_oncall;
    public final Boolean is_offline_oncall;
    public final Boolean is_public;
    public final Boolean is_public_v2;
    public final Boolean is_remind;
    public final Boolean is_shortcut;
    public final Boolean is_super;
    public final Boolean is_support_view;
    public final Boolean is_team;
    public final Boolean is_tenant;
    public final SystemMessageVisible.Enum join_message_visible;
    public final String last_draft_id;
    public final String last_message_id;
    public final Integer last_message_position;
    public final Integer last_message_position_badge_count;
    public final Float last_read_offset;
    public final Integer last_read_position;
    public final String last_thread_id;
    public final Integer last_thread_position;
    public final Integer last_thread_position_badge_count;
    public final String last_visible_message_id;
    public final Integer last_visible_message_position;
    public final String last_visible_thread_id;
    public final Integer last_visible_thread_position;
    public final MessagePosition.Enum message_position;
    public final MessageVisibilitySetting.Enum message_visibility_setting;
    public final String mini_avatar_key;
    public final Boolean muteable;
    public final String my_threads_last_display_message_id;
    public final Long my_threads_last_timestamp;
    public final Long my_threads_read_timestamp;
    public final Integer my_threads_unread_count;
    public final String name;
    public final String name_pinyin;
    public final Integer new_message_count;
    public final Integer new_thread_count;
    public final Integer no_badged_new_message_count;
    public final Integer no_badged_new_thread_count;
    public final Boolean off_edit_group_chat_info;
    public final String oncall_id;
    public final String owner_id;
    public final PinPermissionSetting.Enum pin_permission_setting;
    public final String post_draft_id;
    public final PostType post_type;
    public final Integer put_chatter_apply_count;
    public final SystemMessageVisible.Enum quit_message_visible;
    public final Integer read_position;
    public final Integer read_position_badge_count;
    public final Integer read_thread_position;
    public final Integer read_thread_position_badge_count;
    public final Role role;
    public final ShareCardPermission.Enum share_card_permission;
    public final Boolean show_banner;
    public final Boolean show_nickname;
    public final List<SideBarButton> sidebar_buttons;
    public final String sidebar_id;
    public final List<Tag> tags;
    public final TeamChatType team_chat_type;
    public final Long team_id;
    public final String team_name;
    public final String tenant_id;
    public final String text_draft_id;
    public final TopNoticePermissionSetting.Enum top_notice_permission_setting;
    public final Type type;
    public final Long update_time;
    public final Integer user_count;

    public static final class AddMemberApply extends Message<AddMemberApply, C14749a> {
        public static final ProtoAdapter<AddMemberApply> ADAPTER = new C14750b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            NO_APPLY(1),
            NEED_APPLY(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return NO_APPLY;
                }
                if (i != 2) {
                    return null;
                }
                return NEED_APPLY;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$AddMemberApply$b */
        private static final class C14750b extends ProtoAdapter<AddMemberApply> {
            C14750b() {
                super(FieldEncoding.LENGTH_DELIMITED, AddMemberApply.class);
            }

            /* renamed from: a */
            public int encodedSize(AddMemberApply addMemberApply) {
                return addMemberApply.unknownFields().size();
            }

            /* renamed from: a */
            public AddMemberApply decode(ProtoReader protoReader) throws IOException {
                C14749a aVar = new C14749a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AddMemberApply addMemberApply) throws IOException {
                protoWriter.writeBytes(addMemberApply.unknownFields());
            }
        }

        public AddMemberApply() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$AddMemberApply$a */
        public static final class C14749a extends Message.Builder<AddMemberApply, C14749a> {
            /* renamed from: a */
            public AddMemberApply build() {
                return new AddMemberApply(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14749a newBuilder() {
            C14749a aVar = new C14749a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AddMemberApply");
            StringBuilder replace = new StringBuilder().replace(0, 2, "AddMemberApply{");
            replace.append('}');
            return replace.toString();
        }

        public AddMemberApply(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class AddMemberPermission extends Message<AddMemberPermission, C14751a> {
        public static final ProtoAdapter<AddMemberPermission> ADAPTER = new C14752b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_OWNER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_OWNER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$AddMemberPermission$b */
        private static final class C14752b extends ProtoAdapter<AddMemberPermission> {
            C14752b() {
                super(FieldEncoding.LENGTH_DELIMITED, AddMemberPermission.class);
            }

            /* renamed from: a */
            public int encodedSize(AddMemberPermission addMemberPermission) {
                return addMemberPermission.unknownFields().size();
            }

            /* renamed from: a */
            public AddMemberPermission decode(ProtoReader protoReader) throws IOException {
                C14751a aVar = new C14751a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AddMemberPermission addMemberPermission) throws IOException {
                protoWriter.writeBytes(addMemberPermission.unknownFields());
            }
        }

        public AddMemberPermission() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$AddMemberPermission$a */
        public static final class C14751a extends Message.Builder<AddMemberPermission, C14751a> {
            /* renamed from: a */
            public AddMemberPermission build() {
                return new AddMemberPermission(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14751a newBuilder() {
            C14751a aVar = new C14751a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AddMemberPermission");
            StringBuilder replace = new StringBuilder().replace(0, 2, "AddMemberPermission{");
            replace.append('}');
            return replace.toString();
        }

        public AddMemberPermission(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class AnonymousSetting extends Message<AnonymousSetting, C14755a> {
        public static final ProtoAdapter<AnonymousSetting> ADAPTER = new C14756b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            INVISIBLE(1),
            NOT_ALLOWED(2),
            ALLOWED(3),
            INVISIBLE_ALLOWED(100);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return INVISIBLE;
                }
                if (i == 2) {
                    return NOT_ALLOWED;
                }
                if (i == 3) {
                    return ALLOWED;
                }
                if (i != 100) {
                    return null;
                }
                return INVISIBLE_ALLOWED;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$AnonymousSetting$b */
        private static final class C14756b extends ProtoAdapter<AnonymousSetting> {
            C14756b() {
                super(FieldEncoding.LENGTH_DELIMITED, AnonymousSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(AnonymousSetting anonymousSetting) {
                return anonymousSetting.unknownFields().size();
            }

            /* renamed from: a */
            public AnonymousSetting decode(ProtoReader protoReader) throws IOException {
                C14755a aVar = new C14755a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AnonymousSetting anonymousSetting) throws IOException {
                protoWriter.writeBytes(anonymousSetting.unknownFields());
            }
        }

        public AnonymousSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$AnonymousSetting$a */
        public static final class C14755a extends Message.Builder<AnonymousSetting, C14755a> {
            /* renamed from: a */
            public AnonymousSetting build() {
                return new AnonymousSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14755a newBuilder() {
            C14755a aVar = new C14755a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AnonymousSetting");
            StringBuilder replace = new StringBuilder().replace(0, 2, "AnonymousSetting{");
            replace.append('}');
            return replace.toString();
        }

        public AnonymousSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class AtAllPermission extends Message<AtAllPermission, C14757a> {
        public static final ProtoAdapter<AtAllPermission> ADAPTER = new C14758b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_OWNER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_OWNER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$AtAllPermission$b */
        private static final class C14758b extends ProtoAdapter<AtAllPermission> {
            C14758b() {
                super(FieldEncoding.LENGTH_DELIMITED, AtAllPermission.class);
            }

            /* renamed from: a */
            public int encodedSize(AtAllPermission atAllPermission) {
                return atAllPermission.unknownFields().size();
            }

            /* renamed from: a */
            public AtAllPermission decode(ProtoReader protoReader) throws IOException {
                C14757a aVar = new C14757a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AtAllPermission atAllPermission) throws IOException {
                protoWriter.writeBytes(atAllPermission.unknownFields());
            }
        }

        public AtAllPermission() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$AtAllPermission$a */
        public static final class C14757a extends Message.Builder<AtAllPermission, C14757a> {
            /* renamed from: a */
            public AtAllPermission build() {
                return new AtAllPermission(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14757a newBuilder() {
            C14757a aVar = new C14757a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "AtAllPermission");
            StringBuilder replace = new StringBuilder().replace(0, 2, "AtAllPermission{");
            replace.append('}');
            return replace.toString();
        }

        public AtAllPermission(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class CreateUrgentSetting extends Message<CreateUrgentSetting, C14759a> {
        public static final ProtoAdapter<CreateUrgentSetting> ADAPTER = new C14760b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_MANAGER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_MANAGER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$CreateUrgentSetting$b */
        private static final class C14760b extends ProtoAdapter<CreateUrgentSetting> {
            C14760b() {
                super(FieldEncoding.LENGTH_DELIMITED, CreateUrgentSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(CreateUrgentSetting createUrgentSetting) {
                return createUrgentSetting.unknownFields().size();
            }

            /* renamed from: a */
            public CreateUrgentSetting decode(ProtoReader protoReader) throws IOException {
                C14759a aVar = new C14759a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CreateUrgentSetting createUrgentSetting) throws IOException {
                protoWriter.writeBytes(createUrgentSetting.unknownFields());
            }
        }

        public CreateUrgentSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$CreateUrgentSetting$a */
        public static final class C14759a extends Message.Builder<CreateUrgentSetting, C14759a> {
            /* renamed from: a */
            public CreateUrgentSetting build() {
                return new CreateUrgentSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14759a newBuilder() {
            C14759a aVar = new C14759a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "CreateUrgentSetting");
            StringBuilder replace = new StringBuilder().replace(0, 2, "CreateUrgentSetting{");
            replace.append('}');
            return replace.toString();
        }

        public CreateUrgentSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class CreateVideoConferenceSetting extends Message<CreateVideoConferenceSetting, C14761a> {
        public static final ProtoAdapter<CreateVideoConferenceSetting> ADAPTER = new C14762b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_MANAGER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_MANAGER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$CreateVideoConferenceSetting$b */
        private static final class C14762b extends ProtoAdapter<CreateVideoConferenceSetting> {
            C14762b() {
                super(FieldEncoding.LENGTH_DELIMITED, CreateVideoConferenceSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(CreateVideoConferenceSetting createVideoConferenceSetting) {
                return createVideoConferenceSetting.unknownFields().size();
            }

            /* renamed from: a */
            public CreateVideoConferenceSetting decode(ProtoReader protoReader) throws IOException {
                C14761a aVar = new C14761a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CreateVideoConferenceSetting createVideoConferenceSetting) throws IOException {
                protoWriter.writeBytes(createVideoConferenceSetting.unknownFields());
            }
        }

        public CreateVideoConferenceSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$CreateVideoConferenceSetting$a */
        public static final class C14761a extends Message.Builder<CreateVideoConferenceSetting, C14761a> {
            /* renamed from: a */
            public CreateVideoConferenceSetting build() {
                return new CreateVideoConferenceSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14761a newBuilder() {
            C14761a aVar = new C14761a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "CreateVideoConferenceSetting");
            StringBuilder replace = new StringBuilder().replace(0, 2, "CreateVideoConferenceSetting{");
            replace.append('}');
            return replace.toString();
        }

        public CreateVideoConferenceSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class MessagePosition extends Message<MessagePosition, C14763a> {
        public static final ProtoAdapter<MessagePosition> ADAPTER = new C14764b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            RECENT_LEFT(1),
            NEWEST_UNREAD(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return RECENT_LEFT;
                }
                if (i != 2) {
                    return null;
                }
                return NEWEST_UNREAD;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$MessagePosition$b */
        private static final class C14764b extends ProtoAdapter<MessagePosition> {
            C14764b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessagePosition.class);
            }

            /* renamed from: a */
            public int encodedSize(MessagePosition messagePosition) {
                return messagePosition.unknownFields().size();
            }

            /* renamed from: a */
            public MessagePosition decode(ProtoReader protoReader) throws IOException {
                C14763a aVar = new C14763a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessagePosition messagePosition) throws IOException {
                protoWriter.writeBytes(messagePosition.unknownFields());
            }
        }

        public MessagePosition() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$MessagePosition$a */
        public static final class C14763a extends Message.Builder<MessagePosition, C14763a> {
            /* renamed from: a */
            public MessagePosition build() {
                return new MessagePosition(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14763a newBuilder() {
            C14763a aVar = new C14763a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MessagePosition");
            StringBuilder replace = new StringBuilder().replace(0, 2, "MessagePosition{");
            replace.append('}');
            return replace.toString();
        }

        public MessagePosition(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class MessageVisibilitySetting extends Message<MessageVisibilitySetting, C14765a> {
        public static final ProtoAdapter<MessageVisibilitySetting> ADAPTER = new C14766b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MESSAGES(1),
            ONLY_NEW_MESSAGES(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MESSAGES;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_NEW_MESSAGES;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$MessageVisibilitySetting$b */
        private static final class C14766b extends ProtoAdapter<MessageVisibilitySetting> {
            C14766b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageVisibilitySetting.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageVisibilitySetting messageVisibilitySetting) {
                return messageVisibilitySetting.unknownFields().size();
            }

            /* renamed from: a */
            public MessageVisibilitySetting decode(ProtoReader protoReader) throws IOException {
                C14765a aVar = new C14765a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageVisibilitySetting messageVisibilitySetting) throws IOException {
                protoWriter.writeBytes(messageVisibilitySetting.unknownFields());
            }
        }

        public MessageVisibilitySetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$MessageVisibilitySetting$a */
        public static final class C14765a extends Message.Builder<MessageVisibilitySetting, C14765a> {
            /* renamed from: a */
            public MessageVisibilitySetting build() {
                return new MessageVisibilitySetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14765a newBuilder() {
            C14765a aVar = new C14765a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "MessageVisibilitySetting");
            StringBuilder replace = new StringBuilder().replace(0, 2, "MessageVisibilitySetting{");
            replace.append('}');
            return replace.toString();
        }

        public MessageVisibilitySetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class PinPermissionSetting extends Message<PinPermissionSetting, C14767a> {
        public static final ProtoAdapter<PinPermissionSetting> ADAPTER = new C14768b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_MANAGER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_MANAGER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$PinPermissionSetting$b */
        private static final class C14768b extends ProtoAdapter<PinPermissionSetting> {
            C14768b() {
                super(FieldEncoding.LENGTH_DELIMITED, PinPermissionSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(PinPermissionSetting pinPermissionSetting) {
                return pinPermissionSetting.unknownFields().size();
            }

            /* renamed from: a */
            public PinPermissionSetting decode(ProtoReader protoReader) throws IOException {
                C14767a aVar = new C14767a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PinPermissionSetting pinPermissionSetting) throws IOException {
                protoWriter.writeBytes(pinPermissionSetting.unknownFields());
            }
        }

        public PinPermissionSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$PinPermissionSetting$a */
        public static final class C14767a extends Message.Builder<PinPermissionSetting, C14767a> {
            /* renamed from: a */
            public PinPermissionSetting build() {
                return new PinPermissionSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14767a newBuilder() {
            C14767a aVar = new C14767a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "PinPermissionSetting");
            StringBuilder replace = new StringBuilder().replace(0, 2, "PinPermissionSetting{");
            replace.append('}');
            return replace.toString();
        }

        public PinPermissionSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class ShareCardPermission extends Message<ShareCardPermission, C14769a> {
        public static final ProtoAdapter<ShareCardPermission> ADAPTER = new C14770b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALLOWED(1),
            NOT_ALLOWED(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALLOWED;
                }
                if (i != 2) {
                    return null;
                }
                return NOT_ALLOWED;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$ShareCardPermission$b */
        private static final class C14770b extends ProtoAdapter<ShareCardPermission> {
            C14770b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareCardPermission.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareCardPermission shareCardPermission) {
                return shareCardPermission.unknownFields().size();
            }

            /* renamed from: a */
            public ShareCardPermission decode(ProtoReader protoReader) throws IOException {
                C14769a aVar = new C14769a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareCardPermission shareCardPermission) throws IOException {
                protoWriter.writeBytes(shareCardPermission.unknownFields());
            }
        }

        public ShareCardPermission() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$ShareCardPermission$a */
        public static final class C14769a extends Message.Builder<ShareCardPermission, C14769a> {
            /* renamed from: a */
            public ShareCardPermission build() {
                return new ShareCardPermission(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14769a newBuilder() {
            C14769a aVar = new C14769a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "ShareCardPermission");
            StringBuilder replace = new StringBuilder().replace(0, 2, "ShareCardPermission{");
            replace.append('}');
            return replace.toString();
        }

        public ShareCardPermission(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class SystemMessageVisible extends Message<SystemMessageVisible, C14771a> {
        public static final ProtoAdapter<SystemMessageVisible> ADAPTER = new C14772b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ONLY_OWNER(1),
            ALL_MEMBERS(2),
            NOT_ANYONE(3);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ONLY_OWNER;
                }
                if (i == 2) {
                    return ALL_MEMBERS;
                }
                if (i != 3) {
                    return null;
                }
                return NOT_ANYONE;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$SystemMessageVisible$b */
        private static final class C14772b extends ProtoAdapter<SystemMessageVisible> {
            C14772b() {
                super(FieldEncoding.LENGTH_DELIMITED, SystemMessageVisible.class);
            }

            /* renamed from: a */
            public int encodedSize(SystemMessageVisible systemMessageVisible) {
                return systemMessageVisible.unknownFields().size();
            }

            /* renamed from: a */
            public SystemMessageVisible decode(ProtoReader protoReader) throws IOException {
                C14771a aVar = new C14771a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SystemMessageVisible systemMessageVisible) throws IOException {
                protoWriter.writeBytes(systemMessageVisible.unknownFields());
            }
        }

        public SystemMessageVisible() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$SystemMessageVisible$a */
        public static final class C14771a extends Message.Builder<SystemMessageVisible, C14771a> {
            /* renamed from: a */
            public SystemMessageVisible build() {
                return new SystemMessageVisible(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14771a newBuilder() {
            C14771a aVar = new C14771a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "SystemMessageVisible");
            StringBuilder replace = new StringBuilder().replace(0, 2, "SystemMessageVisible{");
            replace.append('}');
            return replace.toString();
        }

        public SystemMessageVisible(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class TopNoticePermissionSetting extends Message<TopNoticePermissionSetting, C14773a> {
        public static final ProtoAdapter<TopNoticePermissionSetting> ADAPTER = new C14774b();
        private static final long serialVersionUID = 0;

        public enum Enum implements WireEnum {
            UNKNOWN(0),
            ALL_MEMBERS(1),
            ONLY_MANAGER(2);
            
            public static final ProtoAdapter<Enum> ADAPTER = ProtoAdapter.newEnumAdapter(Enum.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Enum fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ALL_MEMBERS;
                }
                if (i != 2) {
                    return null;
                }
                return ONLY_MANAGER;
            }

            private Enum(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$TopNoticePermissionSetting$b */
        private static final class C14774b extends ProtoAdapter<TopNoticePermissionSetting> {
            C14774b() {
                super(FieldEncoding.LENGTH_DELIMITED, TopNoticePermissionSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(TopNoticePermissionSetting topNoticePermissionSetting) {
                return topNoticePermissionSetting.unknownFields().size();
            }

            /* renamed from: a */
            public TopNoticePermissionSetting decode(ProtoReader protoReader) throws IOException {
                C14773a aVar = new C14773a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TopNoticePermissionSetting topNoticePermissionSetting) throws IOException {
                protoWriter.writeBytes(topNoticePermissionSetting.unknownFields());
            }
        }

        public TopNoticePermissionSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$TopNoticePermissionSetting$a */
        public static final class C14773a extends Message.Builder<TopNoticePermissionSetting, C14773a> {
            /* renamed from: a */
            public TopNoticePermissionSetting build() {
                return new TopNoticePermissionSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14773a newBuilder() {
            C14773a aVar = new C14773a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TopNoticePermissionSetting");
            StringBuilder replace = new StringBuilder().replace(0, 2, "TopNoticePermissionSetting{");
            replace.append('}');
            return replace.toString();
        }

        public TopNoticePermissionSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public enum ChatMode implements WireEnum {
        UNKNOWN(0, null),
        DEFAULT(1, null),
        THREAD(2, true),
        THREAD_V2(3, null);
        
        public static final ProtoAdapter<ChatMode> ADAPTER = ProtoAdapter.newEnumAdapter(ChatMode.class);
        public final Boolean deprecated;
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChatMode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
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

        private ChatMode(int i, Boolean bool) {
            this.value = i;
            this.deprecated = bool;
        }
    }

    public enum PostType implements WireEnum {
        UNKNOWN_POST_TYPE(0),
        ANYONE(1),
        ONLY_ADMIN(2),
        WHITE_LIST(3);
        
        public static final ProtoAdapter<PostType> ADAPTER = ProtoAdapter.newEnumAdapter(PostType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PostType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_POST_TYPE;
            }
            if (i == 1) {
                return ANYONE;
            }
            if (i == 2) {
                return ONLY_ADMIN;
            }
            if (i != 3) {
                return null;
            }
            return WHITE_LIST;
        }

        private PostType(int i) {
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

    public enum Type implements WireEnum {
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

    public Chat(String str, Type type2, String str2, String str3, Integer num, Integer num2, Long l, String str4, String str5, Long l2, String str6, Image image, String str7, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str8, Role role2, Boolean bool6, String str9, String str10, Integer num5, Boolean bool7, Announcement announcement2, Boolean bool8, String str11, Boolean bool9, Boolean bool10, MessagePosition.Enum r142, FeedCard.FeedType feedType, String str12, Integer num6, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num7, String str13, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool15, Boolean bool16, PostType postType, ChatMode chatMode, String str14, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, String str15, Boolean bool17, String str16, Integer num19, Float f, Boolean bool18, Boolean bool19, AddMemberPermission.Enum r175, AtAllPermission.Enum r176, SystemMessageVisible.Enum r177, SystemMessageVisible.Enum r178, ShareCardPermission.Enum r179, AddMemberApply.Enum r180, MessageVisibilitySetting.Enum r181, CreateUrgentSetting.Enum r182, CreateVideoConferenceSetting.Enum r183, PinPermissionSetting.Enum r184, TopNoticePermissionSetting.Enum r185, Integer num20, Boolean bool20, String str17, String str18, List<SideBarButton> list, Long l3, Long l4, Integer num21, String str19, AnonymousSetting.Enum r195, Long l5, Boolean bool21, String str20, Boolean bool22, Long l6, String str21, TeamChatType teamChatType, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, String str22, Boolean bool28, Boolean bool29, String str23, List<String> list2, Integer num22, Boolean bool30, Boolean bool31, List<Tag> list3) {
        this(str, type2, str2, str3, num, num2, l, str4, str5, l2, str6, image, str7, num3, num4, bool, bool2, bool3, bool4, bool5, str8, role2, bool6, str9, str10, num5, bool7, announcement2, bool8, str11, bool9, bool10, r142, feedType, str12, num6, bool11, bool12, bool13, bool14, num7, str13, num8, num9, num10, num11, bool15, bool16, postType, chatMode, str14, num12, num13, num14, num15, num16, num17, num18, str15, bool17, str16, num19, f, bool18, bool19, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, num20, bool20, str17, str18, list, l3, l4, num21, str19, r195, l5, bool21, str20, bool22, l6, str21, teamChatType, bool23, bool24, bool25, bool26, bool27, str22, bool28, bool29, str23, list2, num22, bool30, bool31, list3, ByteString.EMPTY);
    }

    public Chat(String str, Type type2, String str2, String str3, Integer num, Integer num2, Long l, String str4, String str5, Long l2, String str6, Image image, String str7, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str8, Role role2, Boolean bool6, String str9, String str10, Integer num5, Boolean bool7, Announcement announcement2, Boolean bool8, String str11, Boolean bool9, Boolean bool10, MessagePosition.Enum r36, FeedCard.FeedType feedType, String str12, Integer num6, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num7, String str13, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool15, Boolean bool16, PostType postType, ChatMode chatMode, String str14, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, String str15, Boolean bool17, String str16, Integer num19, Float f, Boolean bool18, Boolean bool19, AddMemberPermission.Enum r69, AtAllPermission.Enum r70, SystemMessageVisible.Enum r71, SystemMessageVisible.Enum r72, ShareCardPermission.Enum r73, AddMemberApply.Enum r74, MessageVisibilitySetting.Enum r75, CreateUrgentSetting.Enum r76, CreateVideoConferenceSetting.Enum r77, PinPermissionSetting.Enum r78, TopNoticePermissionSetting.Enum r79, Integer num20, Boolean bool20, String str17, String str18, List<SideBarButton> list, Long l3, Long l4, Integer num21, String str19, AnonymousSetting.Enum r89, Long l5, Boolean bool21, String str20, Boolean bool22, Long l6, String str21, TeamChatType teamChatType, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, String str22, Boolean bool28, Boolean bool29, String str23, List<String> list2, Integer num22, Boolean bool30, Boolean bool31, List<Tag> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.name = str2;
        this.last_message_id = str3;
        this.last_message_position = num;
        this.new_message_count = num2;
        this.update_time = l;
        this.avatar_key = str4;
        this.chatter_id = str5;
        this.create_time = l2;
        this.description = str6;
        this.avatar = image;
        this.owner_id = str7;
        this.chatter_count = num3;
        this.user_count = num4;
        this.is_department = bool;
        this.is_public = bool2;
        this.is_archived = bool3;
        this.is_deleted = bool4;
        this.is_remind = bool5;
        this.name_pinyin = str8;
        this.role = role2;
        this.is_customer_service = bool6;
        this.text_draft_id = str9;
        this.post_draft_id = str10;
        this.no_badged_new_message_count = num5;
        this.is_shortcut = bool7;
        this.announcement = announcement2;
        this.off_edit_group_chat_info = bool8;
        this.tenant_id = str11;
        this.is_custom_icon = bool9;
        this.is_dissolved = bool10;
        this.message_position = r36;
        this.feed_type = feedType;
        this.last_visible_message_id = str12;
        this.burn_life = num6;
        this.is_crypto = bool11;
        this.is_meeting = bool12;
        this.is_cross_tenant = bool13;
        this.is_support_view = bool14;
        this.first_message_position = num7;
        this.oncall_id = str13;
        this.last_visible_message_position = num8;
        this.read_position = num9;
        this.read_position_badge_count = num10;
        this.last_message_position_badge_count = num11;
        this.is_public_v2 = bool15;
        this.allow_post = bool16;
        this.post_type = postType;
        this.chat_mode = chatMode;
        this.last_thread_id = str14;
        this.last_thread_position = num12;
        this.new_thread_count = num13;
        this.no_badged_new_thread_count = num14;
        this.last_thread_position_badge_count = num15;
        this.read_thread_position = num16;
        this.read_thread_position_badge_count = num17;
        this.last_visible_thread_position = num18;
        this.last_visible_thread_id = str15;
        this.show_nickname = bool17;
        this.last_draft_id = str16;
        this.last_read_position = num19;
        this.last_read_offset = f;
        this.is_edu = bool18;
        this.is_admin = bool19;
        this.add_member_permission = r69;
        this.at_all_permission = r70;
        this.join_message_visible = r71;
        this.quit_message_visible = r72;
        this.share_card_permission = r73;
        this.add_member_apply = r74;
        this.message_visibility_setting = r75;
        this.create_urgent_setting = r76;
        this.create_video_conference_setting = r77;
        this.pin_permission_setting = r78;
        this.top_notice_permission_setting = r79;
        this.put_chatter_apply_count = num20;
        this.show_banner = bool20;
        this.mini_avatar_key = str17;
        this.sidebar_id = str18;
        this.sidebar_buttons = Internal.immutableCopyOf("sidebar_buttons", list);
        this.my_threads_read_timestamp = l3;
        this.my_threads_last_timestamp = l4;
        this.my_threads_unread_count = num21;
        this.my_threads_last_display_message_id = str19;
        this.anonymous_setting = r89;
        this.anonymous_total_quota = l5;
        this.is_cross_with_ka = bool21;
        this.anonymous_id = str20;
        this.is_team = bool22;
        this.team_id = l6;
        this.team_name = str21;
        this.team_chat_type = teamChatType;
        this.chatable = bool23;
        this.muteable = bool24;
        this.is_super = bool25;
        this.is_tenant = bool26;
        this.is_in_box = bool27;
        this.box_id = str22;
        this.is_auto_translate = bool28;
        this.has_water_mark = bool29;
        this.avatar_path = str23;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list2);
        this.first_chat_message_position = num22;
        this.is_official_oncall = bool30;
        this.is_offline_oncall = bool31;
        this.tags = Internal.immutableCopyOf("tags", list3);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$b */
    private static final class C14776b extends ProtoAdapter<Chat> {
        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Chat chat) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chat.id);
            if (chat.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, chat.type);
            }
            if (chat.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chat.name);
            }
            if (chat.last_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, chat.last_message_id);
            }
            if (chat.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, chat.last_message_position);
            }
            if (chat.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, chat.new_message_count);
            }
            if (chat.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, chat.update_time);
            }
            if (chat.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, chat.avatar_key);
            }
            if (chat.chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, chat.chatter_id);
            }
            if (chat.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 18, chat.create_time);
            }
            if (chat.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, chat.description);
            }
            if (chat.avatar != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 21, chat.avatar);
            }
            if (chat.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, chat.owner_id);
            }
            if (chat.chatter_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 23, chat.chatter_count);
            }
            if (chat.user_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 24, chat.user_count);
            }
            if (chat.is_department != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, chat.is_department);
            }
            if (chat.is_public != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, chat.is_public);
            }
            if (chat.is_archived != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, chat.is_archived);
            }
            if (chat.is_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, chat.is_deleted);
            }
            if (chat.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, chat.is_remind);
            }
            if (chat.name_pinyin != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, chat.name_pinyin);
            }
            if (chat.role != null) {
                Role.ADAPTER.encodeWithTag(protoWriter, 31, chat.role);
            }
            if (chat.is_customer_service != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 32, chat.is_customer_service);
            }
            if (chat.text_draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 33, chat.text_draft_id);
            }
            if (chat.post_draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 34, chat.post_draft_id);
            }
            if (chat.no_badged_new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 35, chat.no_badged_new_message_count);
            }
            if (chat.is_shortcut != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 36, chat.is_shortcut);
            }
            if (chat.announcement != null) {
                Announcement.ADAPTER.encodeWithTag(protoWriter, 37, chat.announcement);
            }
            if (chat.off_edit_group_chat_info != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, chat.off_edit_group_chat_info);
            }
            if (chat.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 39, chat.tenant_id);
            }
            if (chat.is_custom_icon != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 40, chat.is_custom_icon);
            }
            if (chat.is_dissolved != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, chat.is_dissolved);
            }
            if (chat.message_position != null) {
                MessagePosition.Enum.ADAPTER.encodeWithTag(protoWriter, 42, chat.message_position);
            }
            if (chat.feed_type != null) {
                FeedCard.FeedType.ADAPTER.encodeWithTag(protoWriter, 43, chat.feed_type);
            }
            if (chat.last_visible_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 44, chat.last_visible_message_id);
            }
            if (chat.burn_life != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 45, chat.burn_life);
            }
            if (chat.is_crypto != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 46, chat.is_crypto);
            }
            if (chat.is_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 47, chat.is_meeting);
            }
            if (chat.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 48, chat.is_cross_tenant);
            }
            if (chat.is_support_view != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 49, chat.is_support_view);
            }
            if (chat.first_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 50, chat.first_message_position);
            }
            if (chat.oncall_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 51, chat.oncall_id);
            }
            if (chat.last_visible_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 52, chat.last_visible_message_position);
            }
            if (chat.read_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 53, chat.read_position);
            }
            if (chat.read_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 54, chat.read_position_badge_count);
            }
            if (chat.last_message_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 55, chat.last_message_position_badge_count);
            }
            if (chat.is_public_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 56, chat.is_public_v2);
            }
            if (chat.allow_post != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 57, chat.allow_post);
            }
            if (chat.post_type != null) {
                PostType.ADAPTER.encodeWithTag(protoWriter, 58, chat.post_type);
            }
            if (chat.chat_mode != null) {
                ChatMode.ADAPTER.encodeWithTag(protoWriter, 60, chat.chat_mode);
            }
            if (chat.last_thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 61, chat.last_thread_id);
            }
            if (chat.last_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 62, chat.last_thread_position);
            }
            if (chat.new_thread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 63, chat.new_thread_count);
            }
            if (chat.no_badged_new_thread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 64, chat.no_badged_new_thread_count);
            }
            if (chat.last_thread_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 65, chat.last_thread_position_badge_count);
            }
            if (chat.read_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 66, chat.read_thread_position);
            }
            if (chat.read_thread_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 67, chat.read_thread_position_badge_count);
            }
            if (chat.last_visible_thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 68, chat.last_visible_thread_position);
            }
            if (chat.last_visible_thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 69, chat.last_visible_thread_id);
            }
            if (chat.show_nickname != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 70, chat.show_nickname);
            }
            if (chat.last_draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 71, chat.last_draft_id);
            }
            if (chat.last_read_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 72, chat.last_read_position);
            }
            if (chat.last_read_offset != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 73, chat.last_read_offset);
            }
            if (chat.is_edu != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 74, chat.is_edu);
            }
            if (chat.is_admin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 75, chat.is_admin);
            }
            if (chat.add_member_permission != null) {
                AddMemberPermission.Enum.ADAPTER.encodeWithTag(protoWriter, 100, chat.add_member_permission);
            }
            if (chat.at_all_permission != null) {
                AtAllPermission.Enum.ADAPTER.encodeWithTag(protoWriter, 101, chat.at_all_permission);
            }
            if (chat.join_message_visible != null) {
                SystemMessageVisible.Enum.ADAPTER.encodeWithTag(protoWriter, 102, chat.join_message_visible);
            }
            if (chat.quit_message_visible != null) {
                SystemMessageVisible.Enum.ADAPTER.encodeWithTag(protoWriter, 103, chat.quit_message_visible);
            }
            if (chat.share_card_permission != null) {
                ShareCardPermission.Enum.ADAPTER.encodeWithTag(protoWriter, 104, chat.share_card_permission);
            }
            if (chat.add_member_apply != null) {
                AddMemberApply.Enum.ADAPTER.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, chat.add_member_apply);
            }
            if (chat.message_visibility_setting != null) {
                MessageVisibilitySetting.Enum.ADAPTER.encodeWithTag(protoWriter, 118, chat.message_visibility_setting);
            }
            if (chat.create_urgent_setting != null) {
                CreateUrgentSetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmEvents.EVENT_NW, chat.create_urgent_setting);
            }
            if (chat.create_video_conference_setting != null) {
                CreateVideoConferenceSetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmActions.ACTION_INIT_ENTRY, chat.create_video_conference_setting);
            }
            if (chat.pin_permission_setting != null) {
                PinPermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmActions.ACTION_INIT_EXIT, chat.pin_permission_setting);
            }
            if (chat.top_notice_permission_setting != null) {
                TopNoticePermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmActions.ACTION_CALLING_ENTRY, chat.top_notice_permission_setting);
            }
            if (chat.put_chatter_apply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 106, chat.put_chatter_apply_count);
            }
            if (chat.show_banner != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, chat.show_banner);
            }
            if (chat.mini_avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 108, chat.mini_avatar_key);
            }
            if (chat.sidebar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, SmEvents.EVENT_NR, chat.sidebar_id);
            }
            SideBarButton.ADAPTER.asRepeated().encodeWithTag(protoWriter, SmEvents.EVENT_NO, chat.sidebar_buttons);
            if (chat.my_threads_read_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, SmEvents.EVENT_NT, chat.my_threads_read_timestamp);
            }
            if (chat.my_threads_last_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, SmEvents.EVENT_NE_RR, chat.my_threads_last_timestamp);
            }
            if (chat.my_threads_unread_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, SmEvents.EVENT_RE, chat.my_threads_unread_count);
            }
            if (chat.my_threads_last_display_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, SmEvents.EVENT_TO, chat.my_threads_last_display_message_id);
            }
            if (chat.anonymous_setting != null) {
                AnonymousSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 115, chat.anonymous_setting);
            }
            if (chat.anonymous_total_quota != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, SmEvents.EVENT_RS, chat.anonymous_total_quota);
            }
            if (chat.is_cross_with_ka != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 117, chat.is_cross_with_ka);
            }
            if (chat.anonymous_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 119, chat.anonymous_id);
            }
            if (chat.is_team != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, SmActions.ACTION_ONTHECALL_ENTRY, chat.is_team);
            }
            if (chat.team_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, SmActions.ACTION_ONTHECALL_EXIT, chat.team_id);
            }
            if (chat.team_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 129, chat.team_name);
            }
            if (chat.team_chat_type != null) {
                TeamChatType.ADAPTER.encodeWithTag(protoWriter, 130, chat.team_chat_type);
            }
            if (chat.chatable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, LocationRequest.PRIORITY_HD_ACCURACY, chat.chatable);
            }
            if (chat.muteable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 201, chat.muteable);
            }
            if (chat.is_super != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 202, chat.is_super);
            }
            if (chat.is_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 220, chat.is_tenant);
            }
            if (chat.is_in_box != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 221, chat.is_in_box);
            }
            if (chat.box_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 222, chat.box_id);
            }
            if (chat.is_auto_translate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 223, chat.is_auto_translate);
            }
            if (chat.has_water_mark != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 250, chat.has_water_mark);
            }
            if (chat.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 251, chat.avatar_path);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 252, chat.avatar_urls);
            if (chat.first_chat_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 253, chat.first_chat_message_position);
            }
            if (chat.is_official_oncall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 350, chat.is_official_oncall);
            }
            if (chat.is_offline_oncall != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 351, chat.is_offline_oncall);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, chat.tags);
            protoWriter.writeBytes(chat.unknownFields());
        }

        /* renamed from: a */
        public Chat decode(ProtoReader protoReader) throws IOException {
            C14775a aVar = new C14775a();
            aVar.f39025a = "";
            aVar.f39026b = Type.P2P;
            aVar.f39027c = "";
            aVar.f39028d = "";
            aVar.f39029e = 0;
            aVar.f39030f = 0;
            aVar.f39031g = 0L;
            aVar.f39032h = "";
            aVar.f39033i = "";
            aVar.f39034j = 0L;
            aVar.f39035k = "";
            aVar.f39037m = "";
            aVar.f39038n = 0;
            aVar.f39039o = 0;
            aVar.f39040p = false;
            aVar.f39041q = false;
            aVar.f39042r = false;
            aVar.f39043s = false;
            aVar.f39044t = true;
            aVar.f39045u = "";
            aVar.f39046v = Role.IGNORE;
            aVar.f39047w = false;
            aVar.f39048x = "";
            aVar.f39049y = "";
            aVar.f39050z = 0;
            aVar.f38999A = false;
            aVar.f39001C = false;
            aVar.f39002D = "";
            aVar.f39003E = false;
            aVar.f39004F = false;
            aVar.f39005G = MessagePosition.Enum.RECENT_LEFT;
            aVar.f39006H = FeedCard.FeedType.INBOX;
            aVar.f39007I = "";
            aVar.f39008J = 0;
            aVar.f39009K = false;
            aVar.f39010L = false;
            aVar.f39011M = false;
            aVar.f39012N = false;
            aVar.f39013O = -1;
            aVar.f39014P = "";
            aVar.f39015Q = 0;
            aVar.f39016R = 0;
            aVar.f39017S = 0;
            aVar.f39018T = 0;
            aVar.f39019U = false;
            aVar.f39020V = true;
            aVar.f39021W = PostType.UNKNOWN_POST_TYPE;
            aVar.f39022X = ChatMode.DEFAULT;
            aVar.f39023Y = "";
            aVar.f39024Z = 0;
            aVar.aa = 0;
            aVar.ab = 0;
            aVar.ac = 0;
            aVar.ad = 0;
            aVar.ae = 0;
            aVar.af = 0;
            aVar.ag = "";
            aVar.ah = false;
            aVar.f175425ai = "";
            aVar.aj = -1;
            aVar.ak = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            aVar.al = false;
            aVar.am = false;
            aVar.an = AddMemberPermission.Enum.ALL_MEMBERS;
            aVar.ao = AtAllPermission.Enum.ALL_MEMBERS;
            aVar.ap = SystemMessageVisible.Enum.ONLY_OWNER;
            aVar.aq = SystemMessageVisible.Enum.ONLY_OWNER;
            aVar.ar = ShareCardPermission.Enum.ALLOWED;
            aVar.as = AddMemberApply.Enum.NO_APPLY;
            aVar.at = MessageVisibilitySetting.Enum.ALL_MESSAGES;
            aVar.au = CreateUrgentSetting.Enum.ALL_MEMBERS;
            aVar.av = CreateVideoConferenceSetting.Enum.ALL_MEMBERS;
            aVar.aw = PinPermissionSetting.Enum.ALL_MEMBERS;
            aVar.ax = TopNoticePermissionSetting.Enum.ALL_MEMBERS;
            aVar.ay = 0;
            aVar.az = false;
            aVar.aA = "";
            aVar.aB = "";
            aVar.aD = 0L;
            aVar.aE = 0L;
            aVar.aF = 0;
            aVar.aG = "";
            aVar.aH = AnonymousSetting.Enum.INVISIBLE;
            aVar.aI = 0L;
            aVar.aJ = false;
            aVar.aK = "";
            aVar.aL = false;
            aVar.aM = 0L;
            aVar.aN = "";
            aVar.aO = TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
            aVar.aP = true;
            aVar.aQ = true;
            aVar.aR = false;
            aVar.aS = false;
            aVar.aT = false;
            aVar.aU = "";
            aVar.aV = false;
            aVar.aW = false;
            aVar.aX = "";
            aVar.aZ = -1;
            aVar.ba = false;
            aVar.bb = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 11) {
                    aVar.f39033i = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 18) {
                    aVar.f39034j = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 400) {
                    try {
                        aVar.bc.add(Tag.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 350) {
                    aVar.ba = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 351) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39025a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f39026b = Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            aVar.f39027c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f39028d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f39029e = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f39030f = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f39031g = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f39032h = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 20:
                                    aVar.f39035k = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 21:
                                    aVar.f39036l = Image.ADAPTER.decode(protoReader);
                                    continue;
                                case 22:
                                    aVar.f39037m = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 23:
                                    aVar.f39038n = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 24:
                                    aVar.f39039o = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                    aVar.f39040p = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 26:
                                    aVar.f39041q = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                                    aVar.f39042r = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                                    aVar.f39043s = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 29:
                                    aVar.f39044t = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 30:
                                    aVar.f39045u = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                    try {
                                        aVar.f39046v = Role.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                        break;
                                    }
                                case 32:
                                    aVar.f39047w = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 33:
                                    aVar.f39048x = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 34:
                                    aVar.f39049y = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 35:
                                    aVar.f39050z = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 36:
                                    aVar.f38999A = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 37:
                                    aVar.f39000B = Announcement.ADAPTER.decode(protoReader);
                                    continue;
                                case 38:
                                    aVar.f39001C = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 39:
                                    aVar.f39002D = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 40:
                                    aVar.f39003E = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 41:
                                    aVar.f39004F = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 42:
                                    try {
                                        aVar.f39005G = MessagePosition.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                        break;
                                    }
                                case 43:
                                    try {
                                        aVar.f39006H = FeedCard.FeedType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                        break;
                                    }
                                case 44:
                                    aVar.f39007I = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 45:
                                    aVar.f39008J = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 46:
                                    aVar.f39009K = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 47:
                                    aVar.f39010L = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 48:
                                    aVar.f39011M = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 49:
                                    aVar.f39012N = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                    aVar.f39013O = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 51:
                                    aVar.f39014P = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 52:
                                    aVar.f39015Q = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 53:
                                    aVar.f39016R = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 54:
                                    aVar.f39017S = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 55:
                                    aVar.f39018T = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 56:
                                    aVar.f39019U = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 57:
                                    aVar.f39020V = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 58:
                                    try {
                                        aVar.f39021W = PostType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                        break;
                                    }
                                default:
                                    switch (nextTag) {
                                        case 60:
                                            try {
                                                aVar.f39022X = ChatMode.ADAPTER.decode(protoReader);
                                                continue;
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                                break;
                                            }
                                        case 61:
                                            aVar.f39023Y = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 62:
                                            aVar.f39024Z = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        case 63:
                                            aVar.aa = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        case 64:
                                            aVar.ab = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        case 65:
                                            aVar.ac = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        case 66:
                                            aVar.ad = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        case 67:
                                            aVar.ae = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        case 68:
                                            aVar.af = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        case 69:
                                            aVar.ag = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 70:
                                            aVar.ah = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 71:
                                            aVar.f175425ai = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 72:
                                            aVar.aj = ProtoAdapter.INT32.decode(protoReader);
                                            continue;
                                        case 73:
                                            aVar.ak = ProtoAdapter.FLOAT.decode(protoReader);
                                            continue;
                                        case 74:
                                            aVar.al = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 75:
                                            aVar.am = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        default:
                                            switch (nextTag) {
                                                case 100:
                                                    try {
                                                        aVar.an = AddMemberPermission.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e8.value));
                                                        break;
                                                    }
                                                case 101:
                                                    try {
                                                        aVar.ao = AtAllPermission.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e9.value));
                                                        break;
                                                    }
                                                case 102:
                                                    try {
                                                        aVar.ap = SystemMessageVisible.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e10.value));
                                                        break;
                                                    }
                                                case 103:
                                                    try {
                                                        aVar.aq = SystemMessageVisible.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e11.value));
                                                        break;
                                                    }
                                                case 104:
                                                    try {
                                                        aVar.ar = ShareCardPermission.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e12.value));
                                                        break;
                                                    }
                                                case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                                    try {
                                                        aVar.as = AddMemberApply.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e13.value));
                                                        break;
                                                    }
                                                case 106:
                                                    aVar.ay = ProtoAdapter.INT32.decode(protoReader);
                                                    continue;
                                                case ActivityIdentificationData.WALKING /*{ENCODED_INT: 107}*/:
                                                    aVar.az = ProtoAdapter.BOOL.decode(protoReader);
                                                    continue;
                                                case 108:
                                                    aVar.aA = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                                                    aVar.aB = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                                                    aVar.aC.add(SideBarButton.ADAPTER.decode(protoReader));
                                                    continue;
                                                case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                                    aVar.aD = ProtoAdapter.INT64.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                                                    aVar.aE = ProtoAdapter.INT64.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                                                    aVar.aF = ProtoAdapter.INT32.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_TO /*{ENCODED_INT: 114}*/:
                                                    aVar.aG = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case 115:
                                                    try {
                                                        aVar.aH = AnonymousSetting.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e14.value));
                                                        break;
                                                    }
                                                case SmEvents.EVENT_RS /*{ENCODED_INT: 116}*/:
                                                    aVar.aI = ProtoAdapter.INT64.decode(protoReader);
                                                    continue;
                                                case 117:
                                                    aVar.aJ = ProtoAdapter.BOOL.decode(protoReader);
                                                    continue;
                                                case 118:
                                                    try {
                                                        aVar.at = MessageVisibilitySetting.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e15.value));
                                                        break;
                                                    }
                                                case 119:
                                                    aVar.aK = ProtoAdapter.STRING.decode(protoReader);
                                                    continue;
                                                case SmEvents.EVENT_NW /*{ENCODED_INT: 120}*/:
                                                    try {
                                                        aVar.au = CreateUrgentSetting.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e16.value));
                                                        break;
                                                    }
                                                case SmActions.ACTION_INIT_ENTRY /*{ENCODED_INT: 121}*/:
                                                    try {
                                                        aVar.av = CreateVideoConferenceSetting.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e17.value));
                                                        break;
                                                    }
                                                case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                                                    try {
                                                        aVar.aw = PinPermissionSetting.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e18) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e18.value));
                                                        break;
                                                    }
                                                case SmActions.ACTION_CALLING_ENTRY /*{ENCODED_INT: 123}*/:
                                                    try {
                                                        aVar.ax = TopNoticePermissionSetting.Enum.ADAPTER.decode(protoReader);
                                                        continue;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e19) {
                                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e19.value));
                                                        break;
                                                    }
                                                default:
                                                    switch (nextTag) {
                                                        case SmActions.ACTION_ONTHECALL_ENTRY /*{ENCODED_INT: 127}*/:
                                                            aVar.aL = ProtoAdapter.BOOL.decode(protoReader);
                                                            continue;
                                                        case SmActions.ACTION_ONTHECALL_EXIT /*{ENCODED_INT: 128}*/:
                                                            aVar.aM = ProtoAdapter.INT64.decode(protoReader);
                                                            continue;
                                                        case 129:
                                                            aVar.aN = ProtoAdapter.STRING.decode(protoReader);
                                                            continue;
                                                        case 130:
                                                            try {
                                                                aVar.aO = TeamChatType.ADAPTER.decode(protoReader);
                                                                continue;
                                                            } catch (ProtoAdapter.EnumConstantNotFoundException e20) {
                                                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e20.value));
                                                                break;
                                                            }
                                                        default:
                                                            switch (nextTag) {
                                                                case LocationRequest.PRIORITY_HD_ACCURACY /*{ENCODED_INT: 200}*/:
                                                                    aVar.aP = ProtoAdapter.BOOL.decode(protoReader);
                                                                    continue;
                                                                case 201:
                                                                    aVar.aQ = ProtoAdapter.BOOL.decode(protoReader);
                                                                    continue;
                                                                case 202:
                                                                    aVar.aR = ProtoAdapter.BOOL.decode(protoReader);
                                                                    continue;
                                                                default:
                                                                    switch (nextTag) {
                                                                        case 220:
                                                                            aVar.aS = ProtoAdapter.BOOL.decode(protoReader);
                                                                            continue;
                                                                        case 221:
                                                                            aVar.aT = ProtoAdapter.BOOL.decode(protoReader);
                                                                            continue;
                                                                        case 222:
                                                                            aVar.aU = ProtoAdapter.STRING.decode(protoReader);
                                                                            continue;
                                                                        case 223:
                                                                            aVar.aV = ProtoAdapter.BOOL.decode(protoReader);
                                                                            continue;
                                                                        default:
                                                                            switch (nextTag) {
                                                                                case 250:
                                                                                    aVar.aW = ProtoAdapter.BOOL.decode(protoReader);
                                                                                    continue;
                                                                                case 251:
                                                                                    aVar.aX = ProtoAdapter.STRING.decode(protoReader);
                                                                                    continue;
                                                                                case 252:
                                                                                    aVar.aY.add(ProtoAdapter.STRING.decode(protoReader));
                                                                                    continue;
                                                                                case 253:
                                                                                    aVar.aZ = ProtoAdapter.INT32.decode(protoReader);
                                                                                    continue;
                                                                                default:
                                                                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                                                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    aVar.bb = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        C14776b() {
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
            int i80;
            int i81;
            int i82;
            int i83;
            int i84;
            int i85;
            int i86;
            int i87;
            int i88;
            int i89;
            int i90;
            int i91;
            int i92;
            int i93;
            int i94;
            int i95;
            int i96;
            int i97;
            int i98;
            int i99;
            int i100;
            int i101;
            int i102;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chat.id);
            int i103 = 0;
            if (chat.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(2, chat.type);
            } else {
                i = 0;
            }
            int i104 = encodedSizeWithTag + i;
            if (chat.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, chat.name);
            } else {
                i2 = 0;
            }
            int i105 = i104 + i2;
            if (chat.last_message_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, chat.last_message_id);
            } else {
                i3 = 0;
            }
            int i106 = i105 + i3;
            if (chat.last_message_position != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, chat.last_message_position);
            } else {
                i4 = 0;
            }
            int i107 = i106 + i4;
            if (chat.new_message_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, chat.new_message_count);
            } else {
                i5 = 0;
            }
            int i108 = i107 + i5;
            if (chat.update_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, chat.update_time);
            } else {
                i6 = 0;
            }
            int i109 = i108 + i6;
            if (chat.avatar_key != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, chat.avatar_key);
            } else {
                i7 = 0;
            }
            int i110 = i109 + i7;
            if (chat.chatter_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, chat.chatter_id);
            } else {
                i8 = 0;
            }
            int i111 = i110 + i8;
            if (chat.create_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(18, chat.create_time);
            } else {
                i9 = 0;
            }
            int i112 = i111 + i9;
            if (chat.description != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(20, chat.description);
            } else {
                i10 = 0;
            }
            int i113 = i112 + i10;
            if (chat.avatar != null) {
                i11 = Image.ADAPTER.encodedSizeWithTag(21, chat.avatar);
            } else {
                i11 = 0;
            }
            int i114 = i113 + i11;
            if (chat.owner_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(22, chat.owner_id);
            } else {
                i12 = 0;
            }
            int i115 = i114 + i12;
            if (chat.chatter_count != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(23, chat.chatter_count);
            } else {
                i13 = 0;
            }
            int i116 = i115 + i13;
            if (chat.user_count != null) {
                i14 = ProtoAdapter.INT32.encodedSizeWithTag(24, chat.user_count);
            } else {
                i14 = 0;
            }
            int i117 = i116 + i14;
            if (chat.is_department != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(25, chat.is_department);
            } else {
                i15 = 0;
            }
            int i118 = i117 + i15;
            if (chat.is_public != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(26, chat.is_public);
            } else {
                i16 = 0;
            }
            int i119 = i118 + i16;
            if (chat.is_archived != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(27, chat.is_archived);
            } else {
                i17 = 0;
            }
            int i120 = i119 + i17;
            if (chat.is_deleted != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(28, chat.is_deleted);
            } else {
                i18 = 0;
            }
            int i121 = i120 + i18;
            if (chat.is_remind != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(29, chat.is_remind);
            } else {
                i19 = 0;
            }
            int i122 = i121 + i19;
            if (chat.name_pinyin != null) {
                i20 = ProtoAdapter.STRING.encodedSizeWithTag(30, chat.name_pinyin);
            } else {
                i20 = 0;
            }
            int i123 = i122 + i20;
            if (chat.role != null) {
                i21 = Role.ADAPTER.encodedSizeWithTag(31, chat.role);
            } else {
                i21 = 0;
            }
            int i124 = i123 + i21;
            if (chat.is_customer_service != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(32, chat.is_customer_service);
            } else {
                i22 = 0;
            }
            int i125 = i124 + i22;
            if (chat.text_draft_id != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(33, chat.text_draft_id);
            } else {
                i23 = 0;
            }
            int i126 = i125 + i23;
            if (chat.post_draft_id != null) {
                i24 = ProtoAdapter.STRING.encodedSizeWithTag(34, chat.post_draft_id);
            } else {
                i24 = 0;
            }
            int i127 = i126 + i24;
            if (chat.no_badged_new_message_count != null) {
                i25 = ProtoAdapter.INT32.encodedSizeWithTag(35, chat.no_badged_new_message_count);
            } else {
                i25 = 0;
            }
            int i128 = i127 + i25;
            if (chat.is_shortcut != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(36, chat.is_shortcut);
            } else {
                i26 = 0;
            }
            int i129 = i128 + i26;
            if (chat.announcement != null) {
                i27 = Announcement.ADAPTER.encodedSizeWithTag(37, chat.announcement);
            } else {
                i27 = 0;
            }
            int i130 = i129 + i27;
            if (chat.off_edit_group_chat_info != null) {
                i28 = ProtoAdapter.BOOL.encodedSizeWithTag(38, chat.off_edit_group_chat_info);
            } else {
                i28 = 0;
            }
            int i131 = i130 + i28;
            if (chat.tenant_id != null) {
                i29 = ProtoAdapter.STRING.encodedSizeWithTag(39, chat.tenant_id);
            } else {
                i29 = 0;
            }
            int i132 = i131 + i29;
            if (chat.is_custom_icon != null) {
                i30 = ProtoAdapter.BOOL.encodedSizeWithTag(40, chat.is_custom_icon);
            } else {
                i30 = 0;
            }
            int i133 = i132 + i30;
            if (chat.is_dissolved != null) {
                i31 = ProtoAdapter.BOOL.encodedSizeWithTag(41, chat.is_dissolved);
            } else {
                i31 = 0;
            }
            int i134 = i133 + i31;
            if (chat.message_position != null) {
                i32 = MessagePosition.Enum.ADAPTER.encodedSizeWithTag(42, chat.message_position);
            } else {
                i32 = 0;
            }
            int i135 = i134 + i32;
            if (chat.feed_type != null) {
                i33 = FeedCard.FeedType.ADAPTER.encodedSizeWithTag(43, chat.feed_type);
            } else {
                i33 = 0;
            }
            int i136 = i135 + i33;
            if (chat.last_visible_message_id != null) {
                i34 = ProtoAdapter.STRING.encodedSizeWithTag(44, chat.last_visible_message_id);
            } else {
                i34 = 0;
            }
            int i137 = i136 + i34;
            if (chat.burn_life != null) {
                i35 = ProtoAdapter.INT32.encodedSizeWithTag(45, chat.burn_life);
            } else {
                i35 = 0;
            }
            int i138 = i137 + i35;
            if (chat.is_crypto != null) {
                i36 = ProtoAdapter.BOOL.encodedSizeWithTag(46, chat.is_crypto);
            } else {
                i36 = 0;
            }
            int i139 = i138 + i36;
            if (chat.is_meeting != null) {
                i37 = ProtoAdapter.BOOL.encodedSizeWithTag(47, chat.is_meeting);
            } else {
                i37 = 0;
            }
            int i140 = i139 + i37;
            if (chat.is_cross_tenant != null) {
                i38 = ProtoAdapter.BOOL.encodedSizeWithTag(48, chat.is_cross_tenant);
            } else {
                i38 = 0;
            }
            int i141 = i140 + i38;
            if (chat.is_support_view != null) {
                i39 = ProtoAdapter.BOOL.encodedSizeWithTag(49, chat.is_support_view);
            } else {
                i39 = 0;
            }
            int i142 = i141 + i39;
            if (chat.first_message_position != null) {
                i40 = ProtoAdapter.INT32.encodedSizeWithTag(50, chat.first_message_position);
            } else {
                i40 = 0;
            }
            int i143 = i142 + i40;
            if (chat.oncall_id != null) {
                i41 = ProtoAdapter.STRING.encodedSizeWithTag(51, chat.oncall_id);
            } else {
                i41 = 0;
            }
            int i144 = i143 + i41;
            if (chat.last_visible_message_position != null) {
                i42 = ProtoAdapter.INT32.encodedSizeWithTag(52, chat.last_visible_message_position);
            } else {
                i42 = 0;
            }
            int i145 = i144 + i42;
            if (chat.read_position != null) {
                i43 = ProtoAdapter.INT32.encodedSizeWithTag(53, chat.read_position);
            } else {
                i43 = 0;
            }
            int i146 = i145 + i43;
            if (chat.read_position_badge_count != null) {
                i44 = ProtoAdapter.INT32.encodedSizeWithTag(54, chat.read_position_badge_count);
            } else {
                i44 = 0;
            }
            int i147 = i146 + i44;
            if (chat.last_message_position_badge_count != null) {
                i45 = ProtoAdapter.INT32.encodedSizeWithTag(55, chat.last_message_position_badge_count);
            } else {
                i45 = 0;
            }
            int i148 = i147 + i45;
            if (chat.is_public_v2 != null) {
                i46 = ProtoAdapter.BOOL.encodedSizeWithTag(56, chat.is_public_v2);
            } else {
                i46 = 0;
            }
            int i149 = i148 + i46;
            if (chat.allow_post != null) {
                i47 = ProtoAdapter.BOOL.encodedSizeWithTag(57, chat.allow_post);
            } else {
                i47 = 0;
            }
            int i150 = i149 + i47;
            if (chat.post_type != null) {
                i48 = PostType.ADAPTER.encodedSizeWithTag(58, chat.post_type);
            } else {
                i48 = 0;
            }
            int i151 = i150 + i48;
            if (chat.chat_mode != null) {
                i49 = ChatMode.ADAPTER.encodedSizeWithTag(60, chat.chat_mode);
            } else {
                i49 = 0;
            }
            int i152 = i151 + i49;
            if (chat.last_thread_id != null) {
                i50 = ProtoAdapter.STRING.encodedSizeWithTag(61, chat.last_thread_id);
            } else {
                i50 = 0;
            }
            int i153 = i152 + i50;
            if (chat.last_thread_position != null) {
                i51 = ProtoAdapter.INT32.encodedSizeWithTag(62, chat.last_thread_position);
            } else {
                i51 = 0;
            }
            int i154 = i153 + i51;
            if (chat.new_thread_count != null) {
                i52 = ProtoAdapter.INT32.encodedSizeWithTag(63, chat.new_thread_count);
            } else {
                i52 = 0;
            }
            int i155 = i154 + i52;
            if (chat.no_badged_new_thread_count != null) {
                i53 = ProtoAdapter.INT32.encodedSizeWithTag(64, chat.no_badged_new_thread_count);
            } else {
                i53 = 0;
            }
            int i156 = i155 + i53;
            if (chat.last_thread_position_badge_count != null) {
                i54 = ProtoAdapter.INT32.encodedSizeWithTag(65, chat.last_thread_position_badge_count);
            } else {
                i54 = 0;
            }
            int i157 = i156 + i54;
            if (chat.read_thread_position != null) {
                i55 = ProtoAdapter.INT32.encodedSizeWithTag(66, chat.read_thread_position);
            } else {
                i55 = 0;
            }
            int i158 = i157 + i55;
            if (chat.read_thread_position_badge_count != null) {
                i56 = ProtoAdapter.INT32.encodedSizeWithTag(67, chat.read_thread_position_badge_count);
            } else {
                i56 = 0;
            }
            int i159 = i158 + i56;
            if (chat.last_visible_thread_position != null) {
                i57 = ProtoAdapter.INT32.encodedSizeWithTag(68, chat.last_visible_thread_position);
            } else {
                i57 = 0;
            }
            int i160 = i159 + i57;
            if (chat.last_visible_thread_id != null) {
                i58 = ProtoAdapter.STRING.encodedSizeWithTag(69, chat.last_visible_thread_id);
            } else {
                i58 = 0;
            }
            int i161 = i160 + i58;
            if (chat.show_nickname != null) {
                i59 = ProtoAdapter.BOOL.encodedSizeWithTag(70, chat.show_nickname);
            } else {
                i59 = 0;
            }
            int i162 = i161 + i59;
            if (chat.last_draft_id != null) {
                i60 = ProtoAdapter.STRING.encodedSizeWithTag(71, chat.last_draft_id);
            } else {
                i60 = 0;
            }
            int i163 = i162 + i60;
            if (chat.last_read_position != null) {
                i61 = ProtoAdapter.INT32.encodedSizeWithTag(72, chat.last_read_position);
            } else {
                i61 = 0;
            }
            int i164 = i163 + i61;
            if (chat.last_read_offset != null) {
                i62 = ProtoAdapter.FLOAT.encodedSizeWithTag(73, chat.last_read_offset);
            } else {
                i62 = 0;
            }
            int i165 = i164 + i62;
            if (chat.is_edu != null) {
                i63 = ProtoAdapter.BOOL.encodedSizeWithTag(74, chat.is_edu);
            } else {
                i63 = 0;
            }
            int i166 = i165 + i63;
            if (chat.is_admin != null) {
                i64 = ProtoAdapter.BOOL.encodedSizeWithTag(75, chat.is_admin);
            } else {
                i64 = 0;
            }
            int i167 = i166 + i64;
            if (chat.add_member_permission != null) {
                i65 = AddMemberPermission.Enum.ADAPTER.encodedSizeWithTag(100, chat.add_member_permission);
            } else {
                i65 = 0;
            }
            int i168 = i167 + i65;
            if (chat.at_all_permission != null) {
                i66 = AtAllPermission.Enum.ADAPTER.encodedSizeWithTag(101, chat.at_all_permission);
            } else {
                i66 = 0;
            }
            int i169 = i168 + i66;
            if (chat.join_message_visible != null) {
                i67 = SystemMessageVisible.Enum.ADAPTER.encodedSizeWithTag(102, chat.join_message_visible);
            } else {
                i67 = 0;
            }
            int i170 = i169 + i67;
            if (chat.quit_message_visible != null) {
                i68 = SystemMessageVisible.Enum.ADAPTER.encodedSizeWithTag(103, chat.quit_message_visible);
            } else {
                i68 = 0;
            }
            int i171 = i170 + i68;
            if (chat.share_card_permission != null) {
                i69 = ShareCardPermission.Enum.ADAPTER.encodedSizeWithTag(104, chat.share_card_permission);
            } else {
                i69 = 0;
            }
            int i172 = i171 + i69;
            if (chat.add_member_apply != null) {
                i70 = AddMemberApply.Enum.ADAPTER.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, chat.add_member_apply);
            } else {
                i70 = 0;
            }
            int i173 = i172 + i70;
            if (chat.message_visibility_setting != null) {
                i71 = MessageVisibilitySetting.Enum.ADAPTER.encodedSizeWithTag(118, chat.message_visibility_setting);
            } else {
                i71 = 0;
            }
            int i174 = i173 + i71;
            if (chat.create_urgent_setting != null) {
                i72 = CreateUrgentSetting.Enum.ADAPTER.encodedSizeWithTag(SmEvents.EVENT_NW, chat.create_urgent_setting);
            } else {
                i72 = 0;
            }
            int i175 = i174 + i72;
            if (chat.create_video_conference_setting != null) {
                i73 = CreateVideoConferenceSetting.Enum.ADAPTER.encodedSizeWithTag(SmActions.ACTION_INIT_ENTRY, chat.create_video_conference_setting);
            } else {
                i73 = 0;
            }
            int i176 = i175 + i73;
            if (chat.pin_permission_setting != null) {
                i74 = PinPermissionSetting.Enum.ADAPTER.encodedSizeWithTag(SmActions.ACTION_INIT_EXIT, chat.pin_permission_setting);
            } else {
                i74 = 0;
            }
            int i177 = i176 + i74;
            if (chat.top_notice_permission_setting != null) {
                i75 = TopNoticePermissionSetting.Enum.ADAPTER.encodedSizeWithTag(SmActions.ACTION_CALLING_ENTRY, chat.top_notice_permission_setting);
            } else {
                i75 = 0;
            }
            int i178 = i177 + i75;
            if (chat.put_chatter_apply_count != null) {
                i76 = ProtoAdapter.INT32.encodedSizeWithTag(106, chat.put_chatter_apply_count);
            } else {
                i76 = 0;
            }
            int i179 = i178 + i76;
            if (chat.show_banner != null) {
                i77 = ProtoAdapter.BOOL.encodedSizeWithTag(ActivityIdentificationData.WALKING, chat.show_banner);
            } else {
                i77 = 0;
            }
            int i180 = i179 + i77;
            if (chat.mini_avatar_key != null) {
                i78 = ProtoAdapter.STRING.encodedSizeWithTag(108, chat.mini_avatar_key);
            } else {
                i78 = 0;
            }
            int i181 = i180 + i78;
            if (chat.sidebar_id != null) {
                i79 = ProtoAdapter.STRING.encodedSizeWithTag(SmEvents.EVENT_NR, chat.sidebar_id);
            } else {
                i79 = 0;
            }
            int encodedSizeWithTag2 = i181 + i79 + SideBarButton.ADAPTER.asRepeated().encodedSizeWithTag(SmEvents.EVENT_NO, chat.sidebar_buttons);
            if (chat.my_threads_read_timestamp != null) {
                i80 = ProtoAdapter.INT64.encodedSizeWithTag(SmEvents.EVENT_NT, chat.my_threads_read_timestamp);
            } else {
                i80 = 0;
            }
            int i182 = encodedSizeWithTag2 + i80;
            if (chat.my_threads_last_timestamp != null) {
                i81 = ProtoAdapter.INT64.encodedSizeWithTag(SmEvents.EVENT_NE_RR, chat.my_threads_last_timestamp);
            } else {
                i81 = 0;
            }
            int i183 = i182 + i81;
            if (chat.my_threads_unread_count != null) {
                i82 = ProtoAdapter.INT32.encodedSizeWithTag(SmEvents.EVENT_RE, chat.my_threads_unread_count);
            } else {
                i82 = 0;
            }
            int i184 = i183 + i82;
            if (chat.my_threads_last_display_message_id != null) {
                i83 = ProtoAdapter.STRING.encodedSizeWithTag(SmEvents.EVENT_TO, chat.my_threads_last_display_message_id);
            } else {
                i83 = 0;
            }
            int i185 = i184 + i83;
            if (chat.anonymous_setting != null) {
                i84 = AnonymousSetting.Enum.ADAPTER.encodedSizeWithTag(115, chat.anonymous_setting);
            } else {
                i84 = 0;
            }
            int i186 = i185 + i84;
            if (chat.anonymous_total_quota != null) {
                i85 = ProtoAdapter.INT64.encodedSizeWithTag(SmEvents.EVENT_RS, chat.anonymous_total_quota);
            } else {
                i85 = 0;
            }
            int i187 = i186 + i85;
            if (chat.is_cross_with_ka != null) {
                i86 = ProtoAdapter.BOOL.encodedSizeWithTag(117, chat.is_cross_with_ka);
            } else {
                i86 = 0;
            }
            int i188 = i187 + i86;
            if (chat.anonymous_id != null) {
                i87 = ProtoAdapter.STRING.encodedSizeWithTag(119, chat.anonymous_id);
            } else {
                i87 = 0;
            }
            int i189 = i188 + i87;
            if (chat.is_team != null) {
                i88 = ProtoAdapter.BOOL.encodedSizeWithTag(SmActions.ACTION_ONTHECALL_ENTRY, chat.is_team);
            } else {
                i88 = 0;
            }
            int i190 = i189 + i88;
            if (chat.team_id != null) {
                i89 = ProtoAdapter.INT64.encodedSizeWithTag(SmActions.ACTION_ONTHECALL_EXIT, chat.team_id);
            } else {
                i89 = 0;
            }
            int i191 = i190 + i89;
            if (chat.team_name != null) {
                i90 = ProtoAdapter.STRING.encodedSizeWithTag(129, chat.team_name);
            } else {
                i90 = 0;
            }
            int i192 = i191 + i90;
            if (chat.team_chat_type != null) {
                i91 = TeamChatType.ADAPTER.encodedSizeWithTag(130, chat.team_chat_type);
            } else {
                i91 = 0;
            }
            int i193 = i192 + i91;
            if (chat.chatable != null) {
                i92 = ProtoAdapter.BOOL.encodedSizeWithTag(LocationRequest.PRIORITY_HD_ACCURACY, chat.chatable);
            } else {
                i92 = 0;
            }
            int i194 = i193 + i92;
            if (chat.muteable != null) {
                i93 = ProtoAdapter.BOOL.encodedSizeWithTag(201, chat.muteable);
            } else {
                i93 = 0;
            }
            int i195 = i194 + i93;
            if (chat.is_super != null) {
                i94 = ProtoAdapter.BOOL.encodedSizeWithTag(202, chat.is_super);
            } else {
                i94 = 0;
            }
            int i196 = i195 + i94;
            if (chat.is_tenant != null) {
                i95 = ProtoAdapter.BOOL.encodedSizeWithTag(220, chat.is_tenant);
            } else {
                i95 = 0;
            }
            int i197 = i196 + i95;
            if (chat.is_in_box != null) {
                i96 = ProtoAdapter.BOOL.encodedSizeWithTag(221, chat.is_in_box);
            } else {
                i96 = 0;
            }
            int i198 = i197 + i96;
            if (chat.box_id != null) {
                i97 = ProtoAdapter.STRING.encodedSizeWithTag(222, chat.box_id);
            } else {
                i97 = 0;
            }
            int i199 = i198 + i97;
            if (chat.is_auto_translate != null) {
                i98 = ProtoAdapter.BOOL.encodedSizeWithTag(223, chat.is_auto_translate);
            } else {
                i98 = 0;
            }
            int i200 = i199 + i98;
            if (chat.has_water_mark != null) {
                i99 = ProtoAdapter.BOOL.encodedSizeWithTag(250, chat.has_water_mark);
            } else {
                i99 = 0;
            }
            int i201 = i200 + i99;
            if (chat.avatar_path != null) {
                i100 = ProtoAdapter.STRING.encodedSizeWithTag(251, chat.avatar_path);
            } else {
                i100 = 0;
            }
            int encodedSizeWithTag3 = i201 + i100 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(252, chat.avatar_urls);
            if (chat.first_chat_message_position != null) {
                i101 = ProtoAdapter.INT32.encodedSizeWithTag(253, chat.first_chat_message_position);
            } else {
                i101 = 0;
            }
            int i202 = encodedSizeWithTag3 + i101;
            if (chat.is_official_oncall != null) {
                i102 = ProtoAdapter.BOOL.encodedSizeWithTag(350, chat.is_official_oncall);
            } else {
                i102 = 0;
            }
            int i203 = i202 + i102;
            if (chat.is_offline_oncall != null) {
                i103 = ProtoAdapter.BOOL.encodedSizeWithTag(351, chat.is_offline_oncall);
            }
            return i203 + i103 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, chat.tags) + chat.unknownFields().size();
        }
    }

    public static final class Announcement extends Message<Announcement, C14753a> {
        public static final ProtoAdapter<Announcement> ADAPTER = new C14754b();
        public static final Boolean DEFAULT_ENABLE_OPEN_DOC = false;
        public static final Long DEFAULT_UPDATE_TIME = 0L;
        public static final Boolean DEFAULT_USE_OPENDOC = true;
        private static final long serialVersionUID = 0;
        public final String content;
        public final String doc_url;
        public final Boolean enable_open_doc;
        public final String last_editor_id;
        public final Long update_time;
        public final Boolean use_opendoc;

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$Announcement$b */
        private static final class C14754b extends ProtoAdapter<Announcement> {
            C14754b() {
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
                if (announcement.content != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, announcement.content);
                } else {
                    i = 0;
                }
                if (announcement.update_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, announcement.update_time);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (announcement.last_editor_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, announcement.last_editor_id);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (announcement.doc_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, announcement.doc_url);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (announcement.enable_open_doc != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, announcement.enable_open_doc);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (announcement.use_opendoc != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, announcement.use_opendoc);
                }
                return i10 + i6 + announcement.unknownFields().size();
            }

            /* renamed from: a */
            public Announcement decode(ProtoReader protoReader) throws IOException {
                C14753a aVar = new C14753a();
                aVar.f38993a = "";
                aVar.f38994b = 0L;
                aVar.f38995c = "";
                aVar.f38996d = "";
                aVar.f38997e = false;
                aVar.f38998f = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f38993a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f38994b = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 3:
                                aVar.f38995c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f38996d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f38997e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f38998f = ProtoAdapter.BOOL.decode(protoReader);
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
                if (announcement.content != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, announcement.content);
                }
                if (announcement.update_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, announcement.update_time);
                }
                if (announcement.last_editor_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, announcement.last_editor_id);
                }
                if (announcement.doc_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, announcement.doc_url);
                }
                if (announcement.enable_open_doc != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, announcement.enable_open_doc);
                }
                if (announcement.use_opendoc != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, announcement.use_opendoc);
                }
                protoWriter.writeBytes(announcement.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$Announcement$a */
        public static final class C14753a extends Message.Builder<Announcement, C14753a> {

            /* renamed from: a */
            public String f38993a;

            /* renamed from: b */
            public Long f38994b;

            /* renamed from: c */
            public String f38995c;

            /* renamed from: d */
            public String f38996d;

            /* renamed from: e */
            public Boolean f38997e;

            /* renamed from: f */
            public Boolean f38998f;

            /* renamed from: a */
            public Announcement build() {
                return new Announcement(this.f38993a, this.f38994b, this.f38995c, this.f38996d, this.f38997e, this.f38998f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14753a newBuilder() {
            C14753a aVar = new C14753a();
            aVar.f38993a = this.content;
            aVar.f38994b = this.update_time;
            aVar.f38995c = this.last_editor_id;
            aVar.f38996d = this.doc_url;
            aVar.f38997e = this.enable_open_doc;
            aVar.f38998f = this.use_opendoc;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Announcement");
            StringBuilder sb = new StringBuilder();
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            if (this.update_time != null) {
                sb.append(", update_time=");
                sb.append(this.update_time);
            }
            if (this.last_editor_id != null) {
                sb.append(", last_editor_id=");
                sb.append(this.last_editor_id);
            }
            if (this.doc_url != null) {
                sb.append(", doc_url=");
                sb.append(this.doc_url);
            }
            if (this.enable_open_doc != null) {
                sb.append(", enable_open_doc=");
                sb.append(this.enable_open_doc);
            }
            if (this.use_opendoc != null) {
                sb.append(", use_opendoc=");
                sb.append(this.use_opendoc);
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
            this.content = str;
            this.update_time = l;
            this.last_editor_id = str2;
            this.doc_url = str3;
            this.enable_open_doc = bool;
            this.use_opendoc = bool2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Chat$a */
    public static final class C14775a extends Message.Builder<Chat, C14775a> {

        /* renamed from: A */
        public Boolean f38999A;

        /* renamed from: B */
        public Announcement f39000B;

        /* renamed from: C */
        public Boolean f39001C;

        /* renamed from: D */
        public String f39002D;

        /* renamed from: E */
        public Boolean f39003E;

        /* renamed from: F */
        public Boolean f39004F;

        /* renamed from: G */
        public MessagePosition.Enum f39005G;

        /* renamed from: H */
        public FeedCard.FeedType f39006H;

        /* renamed from: I */
        public String f39007I;

        /* renamed from: J */
        public Integer f39008J;

        /* renamed from: K */
        public Boolean f39009K;

        /* renamed from: L */
        public Boolean f39010L;

        /* renamed from: M */
        public Boolean f39011M;

        /* renamed from: N */
        public Boolean f39012N;

        /* renamed from: O */
        public Integer f39013O;

        /* renamed from: P */
        public String f39014P;

        /* renamed from: Q */
        public Integer f39015Q;

        /* renamed from: R */
        public Integer f39016R;

        /* renamed from: S */
        public Integer f39017S;

        /* renamed from: T */
        public Integer f39018T;

        /* renamed from: U */
        public Boolean f39019U;

        /* renamed from: V */
        public Boolean f39020V;

        /* renamed from: W */
        public PostType f39021W;

        /* renamed from: X */
        public ChatMode f39022X;

        /* renamed from: Y */
        public String f39023Y;

        /* renamed from: Z */
        public Integer f39024Z;

        /* renamed from: a */
        public String f39025a;
        public String aA;
        public String aB;
        public List<SideBarButton> aC = Internal.newMutableList();
        public Long aD;
        public Long aE;
        public Integer aF;
        public String aG;
        public AnonymousSetting.Enum aH;
        public Long aI;
        public Boolean aJ;
        public String aK;
        public Boolean aL;
        public Long aM;
        public String aN;
        public TeamChatType aO;
        public Boolean aP;
        public Boolean aQ;
        public Boolean aR;
        public Boolean aS;
        public Boolean aT;
        public String aU;
        public Boolean aV;
        public Boolean aW;
        public String aX;
        public List<String> aY = Internal.newMutableList();
        public Integer aZ;
        public Integer aa;
        public Integer ab;
        public Integer ac;
        public Integer ad;
        public Integer ae;
        public Integer af;
        public String ag;
        public Boolean ah;

        /* renamed from: ai  reason: collision with root package name */
        public String f175425ai;
        public Integer aj;
        public Float ak;
        public Boolean al;
        public Boolean am;
        public AddMemberPermission.Enum an;
        public AtAllPermission.Enum ao;
        public SystemMessageVisible.Enum ap;
        public SystemMessageVisible.Enum aq;
        public ShareCardPermission.Enum ar;
        public AddMemberApply.Enum as;
        public MessageVisibilitySetting.Enum at;
        public CreateUrgentSetting.Enum au;
        public CreateVideoConferenceSetting.Enum av;
        public PinPermissionSetting.Enum aw;
        public TopNoticePermissionSetting.Enum ax;
        public Integer ay;
        public Boolean az;

        /* renamed from: b */
        public Type f39026b;
        public Boolean ba;
        public Boolean bb;
        public List<Tag> bc = Internal.newMutableList();

        /* renamed from: c */
        public String f39027c;

        /* renamed from: d */
        public String f39028d;

        /* renamed from: e */
        public Integer f39029e;

        /* renamed from: f */
        public Integer f39030f;

        /* renamed from: g */
        public Long f39031g;

        /* renamed from: h */
        public String f39032h;

        /* renamed from: i */
        public String f39033i;

        /* renamed from: j */
        public Long f39034j;

        /* renamed from: k */
        public String f39035k;

        /* renamed from: l */
        public Image f39036l;

        /* renamed from: m */
        public String f39037m;

        /* renamed from: n */
        public Integer f39038n;

        /* renamed from: o */
        public Integer f39039o;

        /* renamed from: p */
        public Boolean f39040p;

        /* renamed from: q */
        public Boolean f39041q;

        /* renamed from: r */
        public Boolean f39042r;

        /* renamed from: s */
        public Boolean f39043s;

        /* renamed from: t */
        public Boolean f39044t;

        /* renamed from: u */
        public String f39045u;

        /* renamed from: v */
        public Role f39046v;

        /* renamed from: w */
        public Boolean f39047w;

        /* renamed from: x */
        public String f39048x;

        /* renamed from: y */
        public String f39049y;

        /* renamed from: z */
        public Integer f39050z;

        /* renamed from: a */
        public Chat build() {
            String str = this.f39025a;
            if (str != null) {
                return new Chat(str, this.f39026b, this.f39027c, this.f39028d, this.f39029e, this.f39030f, this.f39031g, this.f39032h, this.f39033i, this.f39034j, this.f39035k, this.f39036l, this.f39037m, this.f39038n, this.f39039o, this.f39040p, this.f39041q, this.f39042r, this.f39043s, this.f39044t, this.f39045u, this.f39046v, this.f39047w, this.f39048x, this.f39049y, this.f39050z, this.f38999A, this.f39000B, this.f39001C, this.f39002D, this.f39003E, this.f39004F, this.f39005G, this.f39006H, this.f39007I, this.f39008J, this.f39009K, this.f39010L, this.f39011M, this.f39012N, this.f39013O, this.f39014P, this.f39015Q, this.f39016R, this.f39017S, this.f39018T, this.f39019U, this.f39020V, this.f39021W, this.f39022X, this.f39023Y, this.f39024Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.f175425ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, this.at, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aA, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG, this.aH, this.aI, this.aJ, this.aK, this.aL, this.aM, this.aN, this.aO, this.aP, this.aQ, this.aR, this.aS, this.aT, this.aU, this.aV, this.aW, this.aX, this.aY, this.aZ, this.ba, this.bb, this.bc, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C14775a newBuilder() {
        C14775a aVar = new C14775a();
        aVar.f39025a = this.id;
        aVar.f39026b = this.type;
        aVar.f39027c = this.name;
        aVar.f39028d = this.last_message_id;
        aVar.f39029e = this.last_message_position;
        aVar.f39030f = this.new_message_count;
        aVar.f39031g = this.update_time;
        aVar.f39032h = this.avatar_key;
        aVar.f39033i = this.chatter_id;
        aVar.f39034j = this.create_time;
        aVar.f39035k = this.description;
        aVar.f39036l = this.avatar;
        aVar.f39037m = this.owner_id;
        aVar.f39038n = this.chatter_count;
        aVar.f39039o = this.user_count;
        aVar.f39040p = this.is_department;
        aVar.f39041q = this.is_public;
        aVar.f39042r = this.is_archived;
        aVar.f39043s = this.is_deleted;
        aVar.f39044t = this.is_remind;
        aVar.f39045u = this.name_pinyin;
        aVar.f39046v = this.role;
        aVar.f39047w = this.is_customer_service;
        aVar.f39048x = this.text_draft_id;
        aVar.f39049y = this.post_draft_id;
        aVar.f39050z = this.no_badged_new_message_count;
        aVar.f38999A = this.is_shortcut;
        aVar.f39000B = this.announcement;
        aVar.f39001C = this.off_edit_group_chat_info;
        aVar.f39002D = this.tenant_id;
        aVar.f39003E = this.is_custom_icon;
        aVar.f39004F = this.is_dissolved;
        aVar.f39005G = this.message_position;
        aVar.f39006H = this.feed_type;
        aVar.f39007I = this.last_visible_message_id;
        aVar.f39008J = this.burn_life;
        aVar.f39009K = this.is_crypto;
        aVar.f39010L = this.is_meeting;
        aVar.f39011M = this.is_cross_tenant;
        aVar.f39012N = this.is_support_view;
        aVar.f39013O = this.first_message_position;
        aVar.f39014P = this.oncall_id;
        aVar.f39015Q = this.last_visible_message_position;
        aVar.f39016R = this.read_position;
        aVar.f39017S = this.read_position_badge_count;
        aVar.f39018T = this.last_message_position_badge_count;
        aVar.f39019U = this.is_public_v2;
        aVar.f39020V = this.allow_post;
        aVar.f39021W = this.post_type;
        aVar.f39022X = this.chat_mode;
        aVar.f39023Y = this.last_thread_id;
        aVar.f39024Z = this.last_thread_position;
        aVar.aa = this.new_thread_count;
        aVar.ab = this.no_badged_new_thread_count;
        aVar.ac = this.last_thread_position_badge_count;
        aVar.ad = this.read_thread_position;
        aVar.ae = this.read_thread_position_badge_count;
        aVar.af = this.last_visible_thread_position;
        aVar.ag = this.last_visible_thread_id;
        aVar.ah = this.show_nickname;
        aVar.f175425ai = this.last_draft_id;
        aVar.aj = this.last_read_position;
        aVar.ak = this.last_read_offset;
        aVar.al = this.is_edu;
        aVar.am = this.is_admin;
        aVar.an = this.add_member_permission;
        aVar.ao = this.at_all_permission;
        aVar.ap = this.join_message_visible;
        aVar.aq = this.quit_message_visible;
        aVar.ar = this.share_card_permission;
        aVar.as = this.add_member_apply;
        aVar.at = this.message_visibility_setting;
        aVar.au = this.create_urgent_setting;
        aVar.av = this.create_video_conference_setting;
        aVar.aw = this.pin_permission_setting;
        aVar.ax = this.top_notice_permission_setting;
        aVar.ay = this.put_chatter_apply_count;
        aVar.az = this.show_banner;
        aVar.aA = this.mini_avatar_key;
        aVar.aB = this.sidebar_id;
        aVar.aC = Internal.copyOf("sidebar_buttons", this.sidebar_buttons);
        aVar.aD = this.my_threads_read_timestamp;
        aVar.aE = this.my_threads_last_timestamp;
        aVar.aF = this.my_threads_unread_count;
        aVar.aG = this.my_threads_last_display_message_id;
        aVar.aH = this.anonymous_setting;
        aVar.aI = this.anonymous_total_quota;
        aVar.aJ = this.is_cross_with_ka;
        aVar.aK = this.anonymous_id;
        aVar.aL = this.is_team;
        aVar.aM = this.team_id;
        aVar.aN = this.team_name;
        aVar.aO = this.team_chat_type;
        aVar.aP = this.chatable;
        aVar.aQ = this.muteable;
        aVar.aR = this.is_super;
        aVar.aS = this.is_tenant;
        aVar.aT = this.is_in_box;
        aVar.aU = this.box_id;
        aVar.aV = this.is_auto_translate;
        aVar.aW = this.has_water_mark;
        aVar.aX = this.avatar_path;
        aVar.aY = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.aZ = this.first_chat_message_position;
        aVar.ba = this.is_official_oncall;
        aVar.bb = this.is_offline_oncall;
        aVar.bc = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Chat");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.last_message_id != null) {
            sb.append(", last_message_id=");
            sb.append(this.last_message_id);
        }
        if (this.last_message_position != null) {
            sb.append(", last_message_position=");
            sb.append(this.last_message_position);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.chatter_id != null) {
            sb.append(", chatter_id=");
            sb.append(this.chatter_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.chatter_count != null) {
            sb.append(", chatter_count=");
            sb.append(this.chatter_count);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        if (this.is_department != null) {
            sb.append(", is_department=");
            sb.append(this.is_department);
        }
        if (this.is_public != null) {
            sb.append(", is_public=");
            sb.append(this.is_public);
        }
        if (this.is_archived != null) {
            sb.append(", is_archived=");
            sb.append(this.is_archived);
        }
        if (this.is_deleted != null) {
            sb.append(", is_deleted=");
            sb.append(this.is_deleted);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        if (this.name_pinyin != null) {
            sb.append(", name_pinyin=");
            sb.append(this.name_pinyin);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.is_customer_service != null) {
            sb.append(", is_customer_service=");
            sb.append(this.is_customer_service);
        }
        if (this.text_draft_id != null) {
            sb.append(", text_draft_id=");
            sb.append(this.text_draft_id);
        }
        if (this.post_draft_id != null) {
            sb.append(", post_draft_id=");
            sb.append(this.post_draft_id);
        }
        if (this.no_badged_new_message_count != null) {
            sb.append(", no_badged_new_message_count=");
            sb.append(this.no_badged_new_message_count);
        }
        if (this.is_shortcut != null) {
            sb.append(", is_shortcut=");
            sb.append(this.is_shortcut);
        }
        if (this.announcement != null) {
            sb.append(", announcement=");
            sb.append(this.announcement);
        }
        if (this.off_edit_group_chat_info != null) {
            sb.append(", off_edit_group_chat_info=");
            sb.append(this.off_edit_group_chat_info);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.is_custom_icon != null) {
            sb.append(", is_custom_icon=");
            sb.append(this.is_custom_icon);
        }
        if (this.is_dissolved != null) {
            sb.append(", is_dissolved=");
            sb.append(this.is_dissolved);
        }
        if (this.message_position != null) {
            sb.append(", message_position=");
            sb.append(this.message_position);
        }
        if (this.feed_type != null) {
            sb.append(", feed_type=");
            sb.append(this.feed_type);
        }
        if (this.last_visible_message_id != null) {
            sb.append(", last_visible_message_id=");
            sb.append(this.last_visible_message_id);
        }
        if (this.burn_life != null) {
            sb.append(", burn_life=");
            sb.append(this.burn_life);
        }
        if (this.is_crypto != null) {
            sb.append(", is_crypto=");
            sb.append(this.is_crypto);
        }
        if (this.is_meeting != null) {
            sb.append(", is_meeting=");
            sb.append(this.is_meeting);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.is_support_view != null) {
            sb.append(", is_support_view=");
            sb.append(this.is_support_view);
        }
        if (this.first_message_position != null) {
            sb.append(", first_message_position=");
            sb.append(this.first_message_position);
        }
        if (this.oncall_id != null) {
            sb.append(", oncall_id=");
            sb.append(this.oncall_id);
        }
        if (this.last_visible_message_position != null) {
            sb.append(", last_visible_message_position=");
            sb.append(this.last_visible_message_position);
        }
        if (this.read_position != null) {
            sb.append(", read_position=");
            sb.append(this.read_position);
        }
        if (this.read_position_badge_count != null) {
            sb.append(", read_position_badge_count=");
            sb.append(this.read_position_badge_count);
        }
        if (this.last_message_position_badge_count != null) {
            sb.append(", last_message_position_badge_count=");
            sb.append(this.last_message_position_badge_count);
        }
        if (this.is_public_v2 != null) {
            sb.append(", is_public_v2=");
            sb.append(this.is_public_v2);
        }
        if (this.allow_post != null) {
            sb.append(", allow_post=");
            sb.append(this.allow_post);
        }
        if (this.post_type != null) {
            sb.append(", post_type=");
            sb.append(this.post_type);
        }
        if (this.chat_mode != null) {
            sb.append(", chat_mode=");
            sb.append(this.chat_mode);
        }
        if (this.last_thread_id != null) {
            sb.append(", last_thread_id=");
            sb.append(this.last_thread_id);
        }
        if (this.last_thread_position != null) {
            sb.append(", last_thread_position=");
            sb.append(this.last_thread_position);
        }
        if (this.new_thread_count != null) {
            sb.append(", new_thread_count=");
            sb.append(this.new_thread_count);
        }
        if (this.no_badged_new_thread_count != null) {
            sb.append(", no_badged_new_thread_count=");
            sb.append(this.no_badged_new_thread_count);
        }
        if (this.last_thread_position_badge_count != null) {
            sb.append(", last_thread_position_badge_count=");
            sb.append(this.last_thread_position_badge_count);
        }
        if (this.read_thread_position != null) {
            sb.append(", read_thread_position=");
            sb.append(this.read_thread_position);
        }
        if (this.read_thread_position_badge_count != null) {
            sb.append(", read_thread_position_badge_count=");
            sb.append(this.read_thread_position_badge_count);
        }
        if (this.last_visible_thread_position != null) {
            sb.append(", last_visible_thread_position=");
            sb.append(this.last_visible_thread_position);
        }
        if (this.last_visible_thread_id != null) {
            sb.append(", last_visible_thread_id=");
            sb.append(this.last_visible_thread_id);
        }
        if (this.show_nickname != null) {
            sb.append(", show_nickname=");
            sb.append(this.show_nickname);
        }
        if (this.last_draft_id != null) {
            sb.append(", last_draft_id=");
            sb.append(this.last_draft_id);
        }
        if (this.last_read_position != null) {
            sb.append(", last_read_position=");
            sb.append(this.last_read_position);
        }
        if (this.last_read_offset != null) {
            sb.append(", last_read_offset=");
            sb.append(this.last_read_offset);
        }
        if (this.is_edu != null) {
            sb.append(", is_edu=");
            sb.append(this.is_edu);
        }
        if (this.is_admin != null) {
            sb.append(", is_admin=");
            sb.append(this.is_admin);
        }
        if (this.add_member_permission != null) {
            sb.append(", add_member_permission=");
            sb.append(this.add_member_permission);
        }
        if (this.at_all_permission != null) {
            sb.append(", at_all_permission=");
            sb.append(this.at_all_permission);
        }
        if (this.join_message_visible != null) {
            sb.append(", join_message_visible=");
            sb.append(this.join_message_visible);
        }
        if (this.quit_message_visible != null) {
            sb.append(", quit_message_visible=");
            sb.append(this.quit_message_visible);
        }
        if (this.share_card_permission != null) {
            sb.append(", share_card_permission=");
            sb.append(this.share_card_permission);
        }
        if (this.add_member_apply != null) {
            sb.append(", add_member_apply=");
            sb.append(this.add_member_apply);
        }
        if (this.message_visibility_setting != null) {
            sb.append(", message_visibility_setting=");
            sb.append(this.message_visibility_setting);
        }
        if (this.create_urgent_setting != null) {
            sb.append(", create_urgent_setting=");
            sb.append(this.create_urgent_setting);
        }
        if (this.create_video_conference_setting != null) {
            sb.append(", create_video_conference_setting=");
            sb.append(this.create_video_conference_setting);
        }
        if (this.pin_permission_setting != null) {
            sb.append(", pin_permission_setting=");
            sb.append(this.pin_permission_setting);
        }
        if (this.top_notice_permission_setting != null) {
            sb.append(", top_notice_permission_setting=");
            sb.append(this.top_notice_permission_setting);
        }
        if (this.put_chatter_apply_count != null) {
            sb.append(", put_chatter_apply_count=");
            sb.append(this.put_chatter_apply_count);
        }
        if (this.show_banner != null) {
            sb.append(", show_banner=");
            sb.append(this.show_banner);
        }
        if (this.mini_avatar_key != null) {
            sb.append(", mini_avatar_key=");
            sb.append(this.mini_avatar_key);
        }
        if (this.sidebar_id != null) {
            sb.append(", sidebar_id=");
            sb.append(this.sidebar_id);
        }
        if (!this.sidebar_buttons.isEmpty()) {
            sb.append(", sidebar_buttons=");
            sb.append(this.sidebar_buttons);
        }
        if (this.my_threads_read_timestamp != null) {
            sb.append(", my_threads_read_timestamp=");
            sb.append(this.my_threads_read_timestamp);
        }
        if (this.my_threads_last_timestamp != null) {
            sb.append(", my_threads_last_timestamp=");
            sb.append(this.my_threads_last_timestamp);
        }
        if (this.my_threads_unread_count != null) {
            sb.append(", my_threads_unread_count=");
            sb.append(this.my_threads_unread_count);
        }
        if (this.my_threads_last_display_message_id != null) {
            sb.append(", my_threads_last_display_message_id=");
            sb.append(this.my_threads_last_display_message_id);
        }
        if (this.anonymous_setting != null) {
            sb.append(", anonymous_setting=");
            sb.append(this.anonymous_setting);
        }
        if (this.anonymous_total_quota != null) {
            sb.append(", anonymous_total_quota=");
            sb.append(this.anonymous_total_quota);
        }
        if (this.is_cross_with_ka != null) {
            sb.append(", is_cross_with_ka=");
            sb.append(this.is_cross_with_ka);
        }
        if (this.anonymous_id != null) {
            sb.append(", anonymous_id=");
            sb.append(this.anonymous_id);
        }
        if (this.is_team != null) {
            sb.append(", is_team=");
            sb.append(this.is_team);
        }
        if (this.team_id != null) {
            sb.append(", team_id=");
            sb.append(this.team_id);
        }
        if (this.team_name != null) {
            sb.append(", team_name=");
            sb.append(this.team_name);
        }
        if (this.team_chat_type != null) {
            sb.append(", team_chat_type=");
            sb.append(this.team_chat_type);
        }
        if (this.chatable != null) {
            sb.append(", chatable=");
            sb.append(this.chatable);
        }
        if (this.muteable != null) {
            sb.append(", muteable=");
            sb.append(this.muteable);
        }
        if (this.is_super != null) {
            sb.append(", is_super=");
            sb.append(this.is_super);
        }
        if (this.is_tenant != null) {
            sb.append(", is_tenant=");
            sb.append(this.is_tenant);
        }
        if (this.is_in_box != null) {
            sb.append(", is_in_box=");
            sb.append(this.is_in_box);
        }
        if (this.box_id != null) {
            sb.append(", box_id=");
            sb.append(this.box_id);
        }
        if (this.is_auto_translate != null) {
            sb.append(", is_auto_translate=");
            sb.append(this.is_auto_translate);
        }
        if (this.has_water_mark != null) {
            sb.append(", has_water_mark=");
            sb.append(this.has_water_mark);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.first_chat_message_position != null) {
            sb.append(", first_chat_message_position=");
            sb.append(this.first_chat_message_position);
        }
        if (this.is_official_oncall != null) {
            sb.append(", is_official_oncall=");
            sb.append(this.is_official_oncall);
        }
        if (this.is_offline_oncall != null) {
            sb.append(", is_offline_oncall=");
            sb.append(this.is_offline_oncall);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "Chat{");
        replace.append('}');
        return replace.toString();
    }
}
