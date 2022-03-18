package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.ChatMailSetting;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;
import okio.ByteString;

public final class UpdateChatRequest extends Message<UpdateChatRequest, C18137a> {
    public static final ProtoAdapter<UpdateChatRequest> ADAPTER = new C18138b();
    public static final Chat.AddMemberApply.Enum DEFAULT_ADD_MEMBER_APPLY = Chat.AddMemberApply.Enum.NO_APPLY;
    public static final Chat.AddMemberPermission.Enum DEFAULT_ADD_MEMBER_PERMISSION = Chat.AddMemberPermission.Enum.ALL_MEMBERS;
    public static final Boolean DEFAULT_ALLOW_MAIL_SEND = true;
    public static final Chat.AnonymousSetting.Enum DEFAULT_ANONYMOUS_SETTING = Chat.AnonymousSetting.Enum.UNKNOWN;
    public static final Chat.AtAllPermission.Enum DEFAULT_AT_ALL_PERMISSION = Chat.AtAllPermission.Enum.ALL_MEMBERS;
    public static final Integer DEFAULT_BURN_LIFE = 0;
    public static final Integer DEFAULT_CHATTER_COUNT = 0;
    public static final Chat.CreateUrgentSetting.Enum DEFAULT_CREATE_URGENT_SETTING = Chat.CreateUrgentSetting.Enum.ALL_MEMBERS;
    public static final Chat.CreateVideoConferenceSetting.Enum DEFAULT_CREATE_VIDEO_CONFERENCE_SETTING = Chat.CreateVideoConferenceSetting.Enum.ALL_MEMBERS;
    public static final Long DEFAULT_GROUP_COMPANIES_ID = 0L;
    public static final ByteString DEFAULT_ICON_DATA = ByteString.EMPTY;
    public static final Boolean DEFAULT_IS_ARCHIVE = false;
    public static final Boolean DEFAULT_IS_AUTO_TRANSLATE = false;
    public static final Boolean DEFAULT_IS_DISSOLVED = false;
    public static final Boolean DEFAULT_IS_GROUP_COMPANIES = false;
    public static final Boolean DEFAULT_IS_INNER = false;
    public static final Boolean DEFAULT_IS_PUBLIC = false;
    public static final Boolean DEFAULT_IS_PUBLIC_V2 = false;
    public static final Boolean DEFAULT_IS_REMIND = true;
    public static final Chat.SystemMessageVisible.Enum DEFAULT_JOIN_MESSAGE_VISIBLE = Chat.SystemMessageVisible.Enum.ONLY_OWNER;
    public static final ChatMailSetting.SendPermission DEFAULT_MAIL_SEND_PERMISSION = ChatMailSetting.SendPermission.GROUP_MEMBERS;
    public static final Chat.MessagePosition.Enum DEFAULT_MESSAGE_POSITION = Chat.MessagePosition.Enum.RECENT_LEFT;
    public static final Chat.MessageVisibilitySetting.Enum DEFAULT_MESSAGE_VISIBILITY_SETTING = Chat.MessageVisibilitySetting.Enum.ALL_MESSAGES;
    public static final Boolean DEFAULT_OFF_EDIT_INFO = false;
    public static final Long DEFAULT_ORGANIZATION_ID = 0L;
    public static final Chat.PinPermissionSetting.Enum DEFAULT_PIN_PERMISSION_SETTING = Chat.PinPermissionSetting.Enum.ALL_MEMBERS;
    public static final Chat.SystemMessageVisible.Enum DEFAULT_QUIT_MESSAGE_VISIBLE = Chat.SystemMessageVisible.Enum.ONLY_OWNER;
    public static final Chat.ShareCardPermission.Enum DEFAULT_SHARE_CARD_PERMISSION = Chat.ShareCardPermission.Enum.ALLOWED;
    public static final Chat.TopNoticePermissionSetting.Enum DEFAULT_TOP_NOTICE_PERMISSION_SETTING = Chat.TopNoticePermissionSetting.Enum.ALL_MEMBERS;
    private static final long serialVersionUID = 0;
    public final Chat.AddMemberApply.Enum add_member_apply;
    public final Chat.AddMemberPermission.Enum add_member_permission;
    public final Boolean allow_mail_send;
    public final String announcement;
    public final Chat.AnonymousSetting.Enum anonymous_setting;
    public final Chat.AtAllPermission.Enum at_all_permission;
    public final AvatarMeta avatar_meta;
    public final Integer burn_life;
    public final String chat_id;
    public final Integer chatter_count;
    public final Chat.CreateUrgentSetting.Enum create_urgent_setting;
    public final Chat.CreateVideoConferenceSetting.Enum create_video_conference_setting;
    public final String description;
    public final Long group_companies_id;
    public final ByteString icon_data;
    public final String icon_key;
    public final Boolean is_archive;
    public final Boolean is_auto_translate;
    public final Boolean is_dissolved;
    public final Boolean is_group_companies;
    public final Boolean is_inner;
    public final Boolean is_public;
    public final Boolean is_public_v2;
    public final Boolean is_remind;
    public final Chat.SystemMessageVisible.Enum join_message_visible;
    public final ChatMailSetting.SendPermission mail_send_permission;
    public final Chat.MessagePosition.Enum message_position;
    public final Chat.MessageVisibilitySetting.Enum message_visibility_setting;
    public final String name;
    public final Boolean off_edit_info;
    public final Long organization_id;
    public final String owner_id;
    public final Chat.PinPermissionSetting.Enum pin_permission_setting;
    public final Chat.SystemMessageVisible.Enum quit_message_visible;
    public final Chat.ShareCardPermission.Enum share_card_permission;
    public final Chat.TopNoticePermissionSetting.Enum top_notice_permission_setting;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatRequest$a */
    public static final class C18137a extends Message.Builder<UpdateChatRequest, C18137a> {

        /* renamed from: A */
        public Chat.ShareCardPermission.Enum f45298A;

        /* renamed from: B */
        public Chat.AddMemberApply.Enum f45299B;

        /* renamed from: C */
        public Boolean f45300C;

        /* renamed from: D */
        public ChatMailSetting.SendPermission f45301D;

        /* renamed from: E */
        public Chat.AnonymousSetting.Enum f45302E;

        /* renamed from: F */
        public Chat.MessageVisibilitySetting.Enum f45303F;

        /* renamed from: G */
        public Chat.CreateUrgentSetting.Enum f45304G;

        /* renamed from: H */
        public Chat.CreateVideoConferenceSetting.Enum f45305H;

        /* renamed from: I */
        public Chat.PinPermissionSetting.Enum f45306I;

        /* renamed from: J */
        public Chat.TopNoticePermissionSetting.Enum f45307J;

        /* renamed from: a */
        public String f45308a;

        /* renamed from: b */
        public String f45309b;

        /* renamed from: c */
        public ByteString f45310c;

        /* renamed from: d */
        public String f45311d;

        /* renamed from: e */
        public String f45312e;

        /* renamed from: f */
        public String f45313f;

        /* renamed from: g */
        public Integer f45314g;

        /* renamed from: h */
        public Boolean f45315h;

        /* renamed from: i */
        public Boolean f45316i;

        /* renamed from: j */
        public Boolean f45317j;

        /* renamed from: k */
        public Long f45318k;

        /* renamed from: l */
        public Boolean f45319l;

        /* renamed from: m */
        public Long f45320m;

        /* renamed from: n */
        public Boolean f45321n;

        /* renamed from: o */
        public Boolean f45322o;

        /* renamed from: p */
        public String f45323p;

        /* renamed from: q */
        public Boolean f45324q;

        /* renamed from: r */
        public Chat.MessagePosition.Enum f45325r;

        /* renamed from: s */
        public Integer f45326s;

        /* renamed from: t */
        public Boolean f45327t;

        /* renamed from: u */
        public Boolean f45328u;

        /* renamed from: v */
        public AvatarMeta f45329v;

        /* renamed from: w */
        public Chat.AddMemberPermission.Enum f45330w;

        /* renamed from: x */
        public Chat.AtAllPermission.Enum f45331x;

        /* renamed from: y */
        public Chat.SystemMessageVisible.Enum f45332y;

        /* renamed from: z */
        public Chat.SystemMessageVisible.Enum f45333z;

        /* renamed from: a */
        public C18137a mo62912a(String str) {
            this.f45308a = str;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62910a(Boolean bool) {
            this.f45321n = bool;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62911a(Integer num) {
            this.f45326s = num;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62907a(Chat.SystemMessageVisible.Enum r1) {
            this.f45332y = r1;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62909a(ChatMailSetting.SendPermission sendPermission) {
            this.f45301D = sendPermission;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62908a(Chat.TopNoticePermissionSetting.Enum r1) {
            this.f45307J = r1;
            return this;
        }

        /* renamed from: a */
        public UpdateChatRequest build() {
            String str = this.f45308a;
            if (str != null) {
                return new UpdateChatRequest(str, this.f45309b, this.f45310c, this.f45311d, this.f45312e, this.f45313f, this.f45314g, this.f45315h, this.f45316i, this.f45317j, this.f45318k, this.f45319l, this.f45320m, this.f45321n, this.f45322o, this.f45323p, this.f45324q, this.f45325r, this.f45326s, this.f45327t, this.f45328u, this.f45329v, this.f45330w, this.f45331x, this.f45332y, this.f45333z, this.f45298A, this.f45299B, this.f45300C, this.f45301D, this.f45302E, this.f45303F, this.f45304G, this.f45305H, this.f45306I, this.f45307J, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C18137a mo62896a(AvatarMeta avatarMeta) {
            this.f45329v = avatarMeta;
            return this;
        }

        /* renamed from: b */
        public C18137a mo62914b(Chat.SystemMessageVisible.Enum r1) {
            this.f45333z = r1;
            return this;
        }

        /* renamed from: c */
        public C18137a mo62917c(Boolean bool) {
            this.f45324q = bool;
            return this;
        }

        /* renamed from: d */
        public C18137a mo62919d(Boolean bool) {
            this.f45327t = bool;
            return this;
        }

        /* renamed from: e */
        public C18137a mo62921e(Boolean bool) {
            this.f45328u = bool;
            return this;
        }

        /* renamed from: f */
        public C18137a mo62923f(Boolean bool) {
            this.f45300C = bool;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62897a(Chat.AddMemberApply.Enum r1) {
            this.f45299B = r1;
            return this;
        }

        /* renamed from: b */
        public C18137a mo62915b(Boolean bool) {
            this.f45322o = bool;
            return this;
        }

        /* renamed from: c */
        public C18137a mo62918c(String str) {
            this.f45311d = str;
            return this;
        }

        /* renamed from: d */
        public C18137a mo62920d(String str) {
            this.f45312e = str;
            return this;
        }

        /* renamed from: e */
        public C18137a mo62922e(String str) {
            this.f45313f = str;
            return this;
        }

        /* renamed from: f */
        public C18137a mo62924f(String str) {
            this.f45323p = str;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62898a(Chat.AddMemberPermission.Enum r1) {
            this.f45330w = r1;
            return this;
        }

        /* renamed from: b */
        public C18137a mo62916b(String str) {
            this.f45309b = str;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62899a(Chat.AnonymousSetting.Enum r1) {
            this.f45302E = r1;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62900a(Chat.AtAllPermission.Enum r1) {
            this.f45331x = r1;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62901a(Chat.CreateUrgentSetting.Enum r1) {
            this.f45304G = r1;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62902a(Chat.CreateVideoConferenceSetting.Enum r1) {
            this.f45305H = r1;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62903a(Chat.MessagePosition.Enum r1) {
            this.f45325r = r1;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62904a(Chat.MessageVisibilitySetting.Enum r1) {
            this.f45303F = r1;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62905a(Chat.PinPermissionSetting.Enum r1) {
            this.f45306I = r1;
            return this;
        }

        /* renamed from: a */
        public C18137a mo62906a(Chat.ShareCardPermission.Enum r1) {
            this.f45298A = r1;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatRequest$b */
    private static final class C18138b extends ProtoAdapter<UpdateChatRequest> {
        C18138b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatRequest updateChatRequest) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, updateChatRequest.chat_id);
            int i35 = 0;
            if (updateChatRequest.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, updateChatRequest.name);
            } else {
                i = 0;
            }
            int i36 = encodedSizeWithTag + i;
            if (updateChatRequest.icon_data != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(3, updateChatRequest.icon_data);
            } else {
                i2 = 0;
            }
            int i37 = i36 + i2;
            if (updateChatRequest.description != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, updateChatRequest.description);
            } else {
                i3 = 0;
            }
            int i38 = i37 + i3;
            if (updateChatRequest.announcement != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, updateChatRequest.announcement);
            } else {
                i4 = 0;
            }
            int i39 = i38 + i4;
            if (updateChatRequest.owner_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, updateChatRequest.owner_id);
            } else {
                i5 = 0;
            }
            int i40 = i39 + i5;
            if (updateChatRequest.chatter_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(7, updateChatRequest.chatter_count);
            } else {
                i6 = 0;
            }
            int i41 = i40 + i6;
            if (updateChatRequest.is_archive != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, updateChatRequest.is_archive);
            } else {
                i7 = 0;
            }
            int i42 = i41 + i7;
            if (updateChatRequest.is_public != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, updateChatRequest.is_public);
            } else {
                i8 = 0;
            }
            int i43 = i42 + i8;
            if (updateChatRequest.is_inner != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, updateChatRequest.is_inner);
            } else {
                i9 = 0;
            }
            int i44 = i43 + i9;
            if (updateChatRequest.organization_id != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(11, updateChatRequest.organization_id);
            } else {
                i10 = 0;
            }
            int i45 = i44 + i10;
            if (updateChatRequest.is_group_companies != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(12, updateChatRequest.is_group_companies);
            } else {
                i11 = 0;
            }
            int i46 = i45 + i11;
            if (updateChatRequest.group_companies_id != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(13, updateChatRequest.group_companies_id);
            } else {
                i12 = 0;
            }
            int i47 = i46 + i12;
            if (updateChatRequest.is_remind != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(14, updateChatRequest.is_remind);
            } else {
                i13 = 0;
            }
            int i48 = i47 + i13;
            if (updateChatRequest.off_edit_info != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(15, updateChatRequest.off_edit_info);
            } else {
                i14 = 0;
            }
            int i49 = i48 + i14;
            if (updateChatRequest.icon_key != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(16, updateChatRequest.icon_key);
            } else {
                i15 = 0;
            }
            int i50 = i49 + i15;
            if (updateChatRequest.is_dissolved != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(17, updateChatRequest.is_dissolved);
            } else {
                i16 = 0;
            }
            int i51 = i50 + i16;
            if (updateChatRequest.message_position != null) {
                i17 = Chat.MessagePosition.Enum.ADAPTER.encodedSizeWithTag(18, updateChatRequest.message_position);
            } else {
                i17 = 0;
            }
            int i52 = i51 + i17;
            if (updateChatRequest.burn_life != null) {
                i18 = ProtoAdapter.INT32.encodedSizeWithTag(19, updateChatRequest.burn_life);
            } else {
                i18 = 0;
            }
            int i53 = i52 + i18;
            if (updateChatRequest.is_auto_translate != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(20, updateChatRequest.is_auto_translate);
            } else {
                i19 = 0;
            }
            int i54 = i53 + i19;
            if (updateChatRequest.is_public_v2 != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(21, updateChatRequest.is_public_v2);
            } else {
                i20 = 0;
            }
            int i55 = i54 + i20;
            if (updateChatRequest.avatar_meta != null) {
                i21 = AvatarMeta.ADAPTER.encodedSizeWithTag(22, updateChatRequest.avatar_meta);
            } else {
                i21 = 0;
            }
            int i56 = i55 + i21;
            if (updateChatRequest.add_member_permission != null) {
                i22 = Chat.AddMemberPermission.Enum.ADAPTER.encodedSizeWithTag(100, updateChatRequest.add_member_permission);
            } else {
                i22 = 0;
            }
            int i57 = i56 + i22;
            if (updateChatRequest.at_all_permission != null) {
                i23 = Chat.AtAllPermission.Enum.ADAPTER.encodedSizeWithTag(101, updateChatRequest.at_all_permission);
            } else {
                i23 = 0;
            }
            int i58 = i57 + i23;
            if (updateChatRequest.join_message_visible != null) {
                i24 = Chat.SystemMessageVisible.Enum.ADAPTER.encodedSizeWithTag(102, updateChatRequest.join_message_visible);
            } else {
                i24 = 0;
            }
            int i59 = i58 + i24;
            if (updateChatRequest.quit_message_visible != null) {
                i25 = Chat.SystemMessageVisible.Enum.ADAPTER.encodedSizeWithTag(103, updateChatRequest.quit_message_visible);
            } else {
                i25 = 0;
            }
            int i60 = i59 + i25;
            if (updateChatRequest.share_card_permission != null) {
                i26 = Chat.ShareCardPermission.Enum.ADAPTER.encodedSizeWithTag(104, updateChatRequest.share_card_permission);
            } else {
                i26 = 0;
            }
            int i61 = i60 + i26;
            if (updateChatRequest.add_member_apply != null) {
                i27 = Chat.AddMemberApply.Enum.ADAPTER.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, updateChatRequest.add_member_apply);
            } else {
                i27 = 0;
            }
            int i62 = i61 + i27;
            if (updateChatRequest.allow_mail_send != null) {
                i28 = ProtoAdapter.BOOL.encodedSizeWithTag(106, updateChatRequest.allow_mail_send);
            } else {
                i28 = 0;
            }
            int i63 = i62 + i28;
            if (updateChatRequest.mail_send_permission != null) {
                i29 = ChatMailSetting.SendPermission.ADAPTER.encodedSizeWithTag(ActivityIdentificationData.WALKING, updateChatRequest.mail_send_permission);
            } else {
                i29 = 0;
            }
            int i64 = i63 + i29;
            if (updateChatRequest.anonymous_setting != null) {
                i30 = Chat.AnonymousSetting.Enum.ADAPTER.encodedSizeWithTag(108, updateChatRequest.anonymous_setting);
            } else {
                i30 = 0;
            }
            int i65 = i64 + i30;
            if (updateChatRequest.message_visibility_setting != null) {
                i31 = Chat.MessageVisibilitySetting.Enum.ADAPTER.encodedSizeWithTag(SmEvents.EVENT_NR, updateChatRequest.message_visibility_setting);
            } else {
                i31 = 0;
            }
            int i66 = i65 + i31;
            if (updateChatRequest.create_urgent_setting != null) {
                i32 = Chat.CreateUrgentSetting.Enum.ADAPTER.encodedSizeWithTag(SmEvents.EVENT_NO, updateChatRequest.create_urgent_setting);
            } else {
                i32 = 0;
            }
            int i67 = i66 + i32;
            if (updateChatRequest.create_video_conference_setting != null) {
                i33 = Chat.CreateVideoConferenceSetting.Enum.ADAPTER.encodedSizeWithTag(SmEvents.EVENT_NT, updateChatRequest.create_video_conference_setting);
            } else {
                i33 = 0;
            }
            int i68 = i67 + i33;
            if (updateChatRequest.pin_permission_setting != null) {
                i34 = Chat.PinPermissionSetting.Enum.ADAPTER.encodedSizeWithTag(SmEvents.EVENT_NE_RR, updateChatRequest.pin_permission_setting);
            } else {
                i34 = 0;
            }
            int i69 = i68 + i34;
            if (updateChatRequest.top_notice_permission_setting != null) {
                i35 = Chat.TopNoticePermissionSetting.Enum.ADAPTER.encodedSizeWithTag(SmEvents.EVENT_RE, updateChatRequest.top_notice_permission_setting);
            }
            return i69 + i35 + updateChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatRequest decode(ProtoReader protoReader) throws IOException {
            C18137a aVar = new C18137a();
            aVar.f45308a = "";
            aVar.f45309b = "";
            aVar.f45310c = ByteString.EMPTY;
            aVar.f45311d = "";
            aVar.f45312e = "";
            aVar.f45313f = "";
            aVar.f45314g = 0;
            aVar.f45315h = false;
            aVar.f45316i = false;
            aVar.f45317j = false;
            aVar.f45318k = 0L;
            aVar.f45319l = false;
            aVar.f45320m = 0L;
            aVar.f45321n = true;
            aVar.f45322o = false;
            aVar.f45323p = "";
            aVar.f45324q = false;
            aVar.f45325r = Chat.MessagePosition.Enum.RECENT_LEFT;
            aVar.f45326s = 0;
            aVar.f45327t = false;
            aVar.f45328u = false;
            aVar.f45330w = Chat.AddMemberPermission.Enum.ALL_MEMBERS;
            aVar.f45331x = Chat.AtAllPermission.Enum.ALL_MEMBERS;
            aVar.f45332y = Chat.SystemMessageVisible.Enum.ONLY_OWNER;
            aVar.f45333z = Chat.SystemMessageVisible.Enum.ONLY_OWNER;
            aVar.f45298A = Chat.ShareCardPermission.Enum.ALLOWED;
            aVar.f45299B = Chat.AddMemberApply.Enum.NO_APPLY;
            aVar.f45300C = true;
            aVar.f45301D = ChatMailSetting.SendPermission.GROUP_MEMBERS;
            aVar.f45302E = Chat.AnonymousSetting.Enum.UNKNOWN;
            aVar.f45303F = Chat.MessageVisibilitySetting.Enum.ALL_MESSAGES;
            aVar.f45304G = Chat.CreateUrgentSetting.Enum.ALL_MEMBERS;
            aVar.f45305H = Chat.CreateVideoConferenceSetting.Enum.ALL_MEMBERS;
            aVar.f45306I = Chat.PinPermissionSetting.Enum.ALL_MEMBERS;
            aVar.f45307J = Chat.TopNoticePermissionSetting.Enum.ALL_MEMBERS;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45308a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45309b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45310c = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45311d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45312e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45313f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45314g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45315h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f45316i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f45317j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f45318k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f45319l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f45320m = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            aVar.f45321n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f45322o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f45323p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f45324q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            try {
                                aVar.f45325r = Chat.MessagePosition.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 19:
                            aVar.f45326s = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 20:
                            aVar.f45327t = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            aVar.f45328u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f45329v = AvatarMeta.ADAPTER.decode(protoReader);
                            break;
                        default:
                            switch (nextTag) {
                                case 100:
                                    try {
                                        aVar.f45330w = Chat.AddMemberPermission.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                        break;
                                    }
                                case 101:
                                    try {
                                        aVar.f45331x = Chat.AtAllPermission.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                        break;
                                    }
                                case 102:
                                    try {
                                        aVar.f45332y = Chat.SystemMessageVisible.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                        break;
                                    }
                                case 103:
                                    try {
                                        aVar.f45333z = Chat.SystemMessageVisible.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                        break;
                                    }
                                case 104:
                                    try {
                                        aVar.f45298A = Chat.ShareCardPermission.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                        break;
                                    }
                                case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                    try {
                                        aVar.f45299B = Chat.AddMemberApply.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                        break;
                                    }
                                case 106:
                                    aVar.f45300C = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case ActivityIdentificationData.WALKING /*{ENCODED_INT: 107}*/:
                                    try {
                                        aVar.f45301D = ChatMailSetting.SendPermission.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e8.value));
                                        break;
                                    }
                                case 108:
                                    try {
                                        aVar.f45302E = Chat.AnonymousSetting.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e9.value));
                                        break;
                                    }
                                case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                                    try {
                                        aVar.f45303F = Chat.MessageVisibilitySetting.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e10.value));
                                        break;
                                    }
                                case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                                    try {
                                        aVar.f45304G = Chat.CreateUrgentSetting.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e11.value));
                                        break;
                                    }
                                case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                    try {
                                        aVar.f45305H = Chat.CreateVideoConferenceSetting.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e12.value));
                                        break;
                                    }
                                case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                                    try {
                                        aVar.f45306I = Chat.PinPermissionSetting.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e13.value));
                                        break;
                                    }
                                case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                                    try {
                                        aVar.f45307J = Chat.TopNoticePermissionSetting.Enum.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e14.value));
                                        break;
                                    }
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

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatRequest updateChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateChatRequest.chat_id);
            if (updateChatRequest.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateChatRequest.name);
            }
            if (updateChatRequest.icon_data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, updateChatRequest.icon_data);
            }
            if (updateChatRequest.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, updateChatRequest.description);
            }
            if (updateChatRequest.announcement != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, updateChatRequest.announcement);
            }
            if (updateChatRequest.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, updateChatRequest.owner_id);
            }
            if (updateChatRequest.chatter_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, updateChatRequest.chatter_count);
            }
            if (updateChatRequest.is_archive != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, updateChatRequest.is_archive);
            }
            if (updateChatRequest.is_public != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, updateChatRequest.is_public);
            }
            if (updateChatRequest.is_inner != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, updateChatRequest.is_inner);
            }
            if (updateChatRequest.organization_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, updateChatRequest.organization_id);
            }
            if (updateChatRequest.is_group_companies != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, updateChatRequest.is_group_companies);
            }
            if (updateChatRequest.group_companies_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, updateChatRequest.group_companies_id);
            }
            if (updateChatRequest.is_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, updateChatRequest.is_remind);
            }
            if (updateChatRequest.off_edit_info != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, updateChatRequest.off_edit_info);
            }
            if (updateChatRequest.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, updateChatRequest.icon_key);
            }
            if (updateChatRequest.is_dissolved != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, updateChatRequest.is_dissolved);
            }
            if (updateChatRequest.message_position != null) {
                Chat.MessagePosition.Enum.ADAPTER.encodeWithTag(protoWriter, 18, updateChatRequest.message_position);
            }
            if (updateChatRequest.burn_life != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, updateChatRequest.burn_life);
            }
            if (updateChatRequest.is_auto_translate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, updateChatRequest.is_auto_translate);
            }
            if (updateChatRequest.is_public_v2 != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, updateChatRequest.is_public_v2);
            }
            if (updateChatRequest.avatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 22, updateChatRequest.avatar_meta);
            }
            if (updateChatRequest.add_member_permission != null) {
                Chat.AddMemberPermission.Enum.ADAPTER.encodeWithTag(protoWriter, 100, updateChatRequest.add_member_permission);
            }
            if (updateChatRequest.at_all_permission != null) {
                Chat.AtAllPermission.Enum.ADAPTER.encodeWithTag(protoWriter, 101, updateChatRequest.at_all_permission);
            }
            if (updateChatRequest.join_message_visible != null) {
                Chat.SystemMessageVisible.Enum.ADAPTER.encodeWithTag(protoWriter, 102, updateChatRequest.join_message_visible);
            }
            if (updateChatRequest.quit_message_visible != null) {
                Chat.SystemMessageVisible.Enum.ADAPTER.encodeWithTag(protoWriter, 103, updateChatRequest.quit_message_visible);
            }
            if (updateChatRequest.share_card_permission != null) {
                Chat.ShareCardPermission.Enum.ADAPTER.encodeWithTag(protoWriter, 104, updateChatRequest.share_card_permission);
            }
            if (updateChatRequest.add_member_apply != null) {
                Chat.AddMemberApply.Enum.ADAPTER.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, updateChatRequest.add_member_apply);
            }
            if (updateChatRequest.allow_mail_send != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 106, updateChatRequest.allow_mail_send);
            }
            if (updateChatRequest.mail_send_permission != null) {
                ChatMailSetting.SendPermission.ADAPTER.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, updateChatRequest.mail_send_permission);
            }
            if (updateChatRequest.anonymous_setting != null) {
                Chat.AnonymousSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 108, updateChatRequest.anonymous_setting);
            }
            if (updateChatRequest.message_visibility_setting != null) {
                Chat.MessageVisibilitySetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmEvents.EVENT_NR, updateChatRequest.message_visibility_setting);
            }
            if (updateChatRequest.create_urgent_setting != null) {
                Chat.CreateUrgentSetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmEvents.EVENT_NO, updateChatRequest.create_urgent_setting);
            }
            if (updateChatRequest.create_video_conference_setting != null) {
                Chat.CreateVideoConferenceSetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmEvents.EVENT_NT, updateChatRequest.create_video_conference_setting);
            }
            if (updateChatRequest.pin_permission_setting != null) {
                Chat.PinPermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmEvents.EVENT_NE_RR, updateChatRequest.pin_permission_setting);
            }
            if (updateChatRequest.top_notice_permission_setting != null) {
                Chat.TopNoticePermissionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, SmEvents.EVENT_RE, updateChatRequest.top_notice_permission_setting);
            }
            protoWriter.writeBytes(updateChatRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18137a newBuilder() {
        C18137a aVar = new C18137a();
        aVar.f45308a = this.chat_id;
        aVar.f45309b = this.name;
        aVar.f45310c = this.icon_data;
        aVar.f45311d = this.description;
        aVar.f45312e = this.announcement;
        aVar.f45313f = this.owner_id;
        aVar.f45314g = this.chatter_count;
        aVar.f45315h = this.is_archive;
        aVar.f45316i = this.is_public;
        aVar.f45317j = this.is_inner;
        aVar.f45318k = this.organization_id;
        aVar.f45319l = this.is_group_companies;
        aVar.f45320m = this.group_companies_id;
        aVar.f45321n = this.is_remind;
        aVar.f45322o = this.off_edit_info;
        aVar.f45323p = this.icon_key;
        aVar.f45324q = this.is_dissolved;
        aVar.f45325r = this.message_position;
        aVar.f45326s = this.burn_life;
        aVar.f45327t = this.is_auto_translate;
        aVar.f45328u = this.is_public_v2;
        aVar.f45329v = this.avatar_meta;
        aVar.f45330w = this.add_member_permission;
        aVar.f45331x = this.at_all_permission;
        aVar.f45332y = this.join_message_visible;
        aVar.f45333z = this.quit_message_visible;
        aVar.f45298A = this.share_card_permission;
        aVar.f45299B = this.add_member_apply;
        aVar.f45300C = this.allow_mail_send;
        aVar.f45301D = this.mail_send_permission;
        aVar.f45302E = this.anonymous_setting;
        aVar.f45303F = this.message_visibility_setting;
        aVar.f45304G = this.create_urgent_setting;
        aVar.f45305H = this.create_video_conference_setting;
        aVar.f45306I = this.pin_permission_setting;
        aVar.f45307J = this.top_notice_permission_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.icon_data != null) {
            sb.append(", icon_data=");
            sb.append(this.icon_data);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.announcement != null) {
            sb.append(", announcement=");
            sb.append(this.announcement);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.chatter_count != null) {
            sb.append(", chatter_count=");
            sb.append(this.chatter_count);
        }
        if (this.is_archive != null) {
            sb.append(", is_archive=");
            sb.append(this.is_archive);
        }
        if (this.is_public != null) {
            sb.append(", is_public=");
            sb.append(this.is_public);
        }
        if (this.is_inner != null) {
            sb.append(", is_inner=");
            sb.append(this.is_inner);
        }
        if (this.organization_id != null) {
            sb.append(", organization_id=");
            sb.append(this.organization_id);
        }
        if (this.is_group_companies != null) {
            sb.append(", is_group_companies=");
            sb.append(this.is_group_companies);
        }
        if (this.group_companies_id != null) {
            sb.append(", group_companies_id=");
            sb.append(this.group_companies_id);
        }
        if (this.is_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.is_remind);
        }
        if (this.off_edit_info != null) {
            sb.append(", off_edit_info=");
            sb.append(this.off_edit_info);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.is_dissolved != null) {
            sb.append(", is_dissolved=");
            sb.append(this.is_dissolved);
        }
        if (this.message_position != null) {
            sb.append(", message_position=");
            sb.append(this.message_position);
        }
        if (this.burn_life != null) {
            sb.append(", burn_life=");
            sb.append(this.burn_life);
        }
        if (this.is_auto_translate != null) {
            sb.append(", is_auto_translate=");
            sb.append(this.is_auto_translate);
        }
        if (this.is_public_v2 != null) {
            sb.append(", is_public_v2=");
            sb.append(this.is_public_v2);
        }
        if (this.avatar_meta != null) {
            sb.append(", avatar_meta=");
            sb.append(this.avatar_meta);
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
        if (this.allow_mail_send != null) {
            sb.append(", allow_mail_send=");
            sb.append(this.allow_mail_send);
        }
        if (this.mail_send_permission != null) {
            sb.append(", mail_send_permission=");
            sb.append(this.mail_send_permission);
        }
        if (this.anonymous_setting != null) {
            sb.append(", anonymous_setting=");
            sb.append(this.anonymous_setting);
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
        StringBuilder replace = sb.replace(0, 2, "UpdateChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatRequest(String str, String str2, ByteString byteString, String str3, String str4, String str5, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Long l, Boolean bool4, Long l2, Boolean bool5, Boolean bool6, String str6, Boolean bool7, Chat.MessagePosition.Enum r56, Integer num2, Boolean bool8, Boolean bool9, AvatarMeta avatarMeta, Chat.AddMemberPermission.Enum r61, Chat.AtAllPermission.Enum r62, Chat.SystemMessageVisible.Enum r63, Chat.SystemMessageVisible.Enum r64, Chat.ShareCardPermission.Enum r65, Chat.AddMemberApply.Enum r66, Boolean bool10, ChatMailSetting.SendPermission sendPermission, Chat.AnonymousSetting.Enum r69, Chat.MessageVisibilitySetting.Enum r70, Chat.CreateUrgentSetting.Enum r71, Chat.CreateVideoConferenceSetting.Enum r72, Chat.PinPermissionSetting.Enum r73, Chat.TopNoticePermissionSetting.Enum r74) {
        this(str, str2, byteString, str3, str4, str5, num, bool, bool2, bool3, l, bool4, l2, bool5, bool6, str6, bool7, r56, num2, bool8, bool9, avatarMeta, r61, r62, r63, r64, r65, r66, bool10, sendPermission, r69, r70, r71, r72, r73, r74, ByteString.EMPTY);
    }

    public UpdateChatRequest(String str, String str2, ByteString byteString, String str3, String str4, String str5, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Long l, Boolean bool4, Long l2, Boolean bool5, Boolean bool6, String str6, Boolean bool7, Chat.MessagePosition.Enum r21, Integer num2, Boolean bool8, Boolean bool9, AvatarMeta avatarMeta, Chat.AddMemberPermission.Enum r26, Chat.AtAllPermission.Enum r27, Chat.SystemMessageVisible.Enum r28, Chat.SystemMessageVisible.Enum r29, Chat.ShareCardPermission.Enum r30, Chat.AddMemberApply.Enum r31, Boolean bool10, ChatMailSetting.SendPermission sendPermission, Chat.AnonymousSetting.Enum r34, Chat.MessageVisibilitySetting.Enum r35, Chat.CreateUrgentSetting.Enum r36, Chat.CreateVideoConferenceSetting.Enum r37, Chat.PinPermissionSetting.Enum r38, Chat.TopNoticePermissionSetting.Enum r39, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.chat_id = str;
        this.name = str2;
        this.icon_data = byteString;
        this.description = str3;
        this.announcement = str4;
        this.owner_id = str5;
        this.chatter_count = num;
        this.is_archive = bool;
        this.is_public = bool2;
        this.is_inner = bool3;
        this.organization_id = l;
        this.is_group_companies = bool4;
        this.group_companies_id = l2;
        this.is_remind = bool5;
        this.off_edit_info = bool6;
        this.icon_key = str6;
        this.is_dissolved = bool7;
        this.message_position = r21;
        this.burn_life = num2;
        this.is_auto_translate = bool8;
        this.is_public_v2 = bool9;
        this.avatar_meta = avatarMeta;
        this.add_member_permission = r26;
        this.at_all_permission = r27;
        this.join_message_visible = r28;
        this.quit_message_visible = r29;
        this.share_card_permission = r30;
        this.add_member_apply = r31;
        this.allow_mail_send = bool10;
        this.mail_send_permission = sendPermission;
        this.anonymous_setting = r34;
        this.message_visibility_setting = r35;
        this.create_urgent_setting = r36;
        this.create_video_conference_setting = r37;
        this.pin_permission_setting = r38;
        this.top_notice_permission_setting = r39;
    }
}
