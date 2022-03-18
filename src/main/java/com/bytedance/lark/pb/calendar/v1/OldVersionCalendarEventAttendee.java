package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class OldVersionCalendarEventAttendee extends Message<OldVersionCalendarEventAttendee, C15888a> {
    public static final ProtoAdapter<OldVersionCalendarEventAttendee> ADAPTER = new C15889b();
    public static final Integer DEFAULT_ADDITIONAL_GUESTS_COUNT = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_DISABLED = false;
    public static final Boolean DEFAULT_IS_EDITABLE = false;
    public static final Boolean DEFAULT_IS_GROUP = false;
    public static final Boolean DEFAULT_IS_OPTIONAL = false;
    public static final Boolean DEFAULT_IS_ORGANIZER = false;
    public static final Boolean DEFAULT_IS_RESOURCE = false;
    public static final Boolean DEFAULT_IS_THIRD_PARTY = false;
    public static final Boolean DEFAULT_OPEN_SECURITY = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Integer DEFAULT_SHOW_MEMBER_LIMIT = 0;
    public static final Status DEFAULT_STATUS = Status.NEEDS_ACTION;
    public static final Calendar.Type DEFAULT_TYPE = Calendar.Type.PRIMARY;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer additional_guests_count;
    public final String attendee_calendar_id;
    public final ImageSet avatar;
    public final String avatar_key;
    public final String avatar_path;
    public final Long create_time;
    public final String display_name;
    public final String email;
    public final String group_id;
    public final List<OldVersionCalendarEventAttendee> group_members;
    public final String id;
    public final String inviter_calendar_id;
    public final Boolean is_cross_tenant;
    public final Boolean is_disabled;
    public final Boolean is_editable;
    public final Boolean is_group;
    public final Boolean is_optional;
    public final Boolean is_organizer;
    public final Boolean is_resource;
    public final Boolean is_third_party;
    public final String key;
    public final String localized_display_name;
    public final Boolean open_security;
    public final Long original_time;
    public final Integer show_member_limit;
    public final Status status;
    public final String tags;
    public final String tenant_id;
    public final Calendar.Type type;
    public final Long update_time;
    public final String user_id;

    public enum Status implements WireEnum {
        NEEDS_ACTION(1),
        ACCEPT(2),
        TENTATIVE(3),
        DECLINE(4),
        REMOVED(5);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return NEEDS_ACTION;
            }
            if (i == 2) {
                return ACCEPT;
            }
            if (i == 3) {
                return TENTATIVE;
            }
            if (i == 4) {
                return DECLINE;
            }
            if (i != 5) {
                return null;
            }
            return REMOVED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OldVersionCalendarEventAttendee$b */
    private static final class C15889b extends ProtoAdapter<OldVersionCalendarEventAttendee> {
        C15889b() {
            super(FieldEncoding.LENGTH_DELIMITED, OldVersionCalendarEventAttendee.class);
        }

        /* renamed from: a */
        public int encodedSize(OldVersionCalendarEventAttendee oldVersionCalendarEventAttendee) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, oldVersionCalendarEventAttendee.id);
            int i28 = 0;
            if (oldVersionCalendarEventAttendee.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, oldVersionCalendarEventAttendee.key);
            } else {
                i = 0;
            }
            int i29 = encodedSizeWithTag + i;
            if (oldVersionCalendarEventAttendee.original_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, oldVersionCalendarEventAttendee.original_time);
            } else {
                i2 = 0;
            }
            int i30 = i29 + i2;
            if (oldVersionCalendarEventAttendee.display_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, oldVersionCalendarEventAttendee.display_name);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i30 + i3 + ProtoAdapter.STRING.encodedSizeWithTag(5, oldVersionCalendarEventAttendee.attendee_calendar_id);
            if (oldVersionCalendarEventAttendee.is_organizer != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, oldVersionCalendarEventAttendee.is_organizer);
            } else {
                i4 = 0;
            }
            int i31 = encodedSizeWithTag2 + i4;
            if (oldVersionCalendarEventAttendee.is_resource != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(7, oldVersionCalendarEventAttendee.is_resource);
            } else {
                i5 = 0;
            }
            int i32 = i31 + i5;
            if (oldVersionCalendarEventAttendee.is_optional != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(8, oldVersionCalendarEventAttendee.is_optional);
            } else {
                i6 = 0;
            }
            int i33 = i32 + i6;
            if (oldVersionCalendarEventAttendee.status != null) {
                i7 = Status.ADAPTER.encodedSizeWithTag(9, oldVersionCalendarEventAttendee.status);
            } else {
                i7 = 0;
            }
            int i34 = i33 + i7;
            if (oldVersionCalendarEventAttendee.additional_guests_count != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(10, oldVersionCalendarEventAttendee.additional_guests_count);
            } else {
                i8 = 0;
            }
            int i35 = i34 + i8;
            if (oldVersionCalendarEventAttendee.avatar != null) {
                i9 = ImageSet.ADAPTER.encodedSizeWithTag(11, oldVersionCalendarEventAttendee.avatar);
            } else {
                i9 = 0;
            }
            int i36 = i35 + i9;
            if (oldVersionCalendarEventAttendee.create_time != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(12, oldVersionCalendarEventAttendee.create_time);
            } else {
                i10 = 0;
            }
            int i37 = i36 + i10;
            if (oldVersionCalendarEventAttendee.update_time != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(13, oldVersionCalendarEventAttendee.update_time);
            } else {
                i11 = 0;
            }
            int i38 = i37 + i11;
            if (oldVersionCalendarEventAttendee.type != null) {
                i12 = Calendar.Type.ADAPTER.encodedSizeWithTag(14, oldVersionCalendarEventAttendee.type);
            } else {
                i12 = 0;
            }
            int i39 = i38 + i12;
            if (oldVersionCalendarEventAttendee.tags != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(15, oldVersionCalendarEventAttendee.tags);
            } else {
                i13 = 0;
            }
            int i40 = i39 + i13;
            if (oldVersionCalendarEventAttendee.group_id != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(16, oldVersionCalendarEventAttendee.group_id);
            } else {
                i14 = 0;
            }
            int i41 = i40 + i14;
            if (oldVersionCalendarEventAttendee.is_group != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(17, oldVersionCalendarEventAttendee.is_group);
            } else {
                i15 = 0;
            }
            int encodedSizeWithTag3 = i41 + i15 + OldVersionCalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(18, oldVersionCalendarEventAttendee.group_members);
            if (oldVersionCalendarEventAttendee.avatar_key != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(19, oldVersionCalendarEventAttendee.avatar_key);
            } else {
                i16 = 0;
            }
            int i42 = encodedSizeWithTag3 + i16;
            if (oldVersionCalendarEventAttendee.localized_display_name != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(20, oldVersionCalendarEventAttendee.localized_display_name);
            } else {
                i17 = 0;
            }
            int i43 = i42 + i17;
            if (oldVersionCalendarEventAttendee.is_cross_tenant != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(21, oldVersionCalendarEventAttendee.is_cross_tenant);
            } else {
                i18 = 0;
            }
            int i44 = i43 + i18;
            if (oldVersionCalendarEventAttendee.tenant_id != null) {
                i19 = ProtoAdapter.STRING.encodedSizeWithTag(22, oldVersionCalendarEventAttendee.tenant_id);
            } else {
                i19 = 0;
            }
            int i45 = i44 + i19;
            if (oldVersionCalendarEventAttendee.open_security != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(23, oldVersionCalendarEventAttendee.open_security);
            } else {
                i20 = 0;
            }
            int i46 = i45 + i20;
            if (oldVersionCalendarEventAttendee.show_member_limit != null) {
                i21 = ProtoAdapter.INT32.encodedSizeWithTag(24, oldVersionCalendarEventAttendee.show_member_limit);
            } else {
                i21 = 0;
            }
            int i47 = i46 + i21;
            if (oldVersionCalendarEventAttendee.user_id != null) {
                i22 = ProtoAdapter.STRING.encodedSizeWithTag(25, oldVersionCalendarEventAttendee.user_id);
            } else {
                i22 = 0;
            }
            int i48 = i47 + i22;
            if (oldVersionCalendarEventAttendee.is_editable != null) {
                i23 = ProtoAdapter.BOOL.encodedSizeWithTag(26, oldVersionCalendarEventAttendee.is_editable);
            } else {
                i23 = 0;
            }
            int i49 = i48 + i23;
            if (oldVersionCalendarEventAttendee.inviter_calendar_id != null) {
                i24 = ProtoAdapter.STRING.encodedSizeWithTag(27, oldVersionCalendarEventAttendee.inviter_calendar_id);
            } else {
                i24 = 0;
            }
            int i50 = i49 + i24;
            if (oldVersionCalendarEventAttendee.is_disabled != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(28, oldVersionCalendarEventAttendee.is_disabled);
            } else {
                i25 = 0;
            }
            int i51 = i50 + i25;
            if (oldVersionCalendarEventAttendee.email != null) {
                i26 = ProtoAdapter.STRING.encodedSizeWithTag(29, oldVersionCalendarEventAttendee.email);
            } else {
                i26 = 0;
            }
            int i52 = i51 + i26;
            if (oldVersionCalendarEventAttendee.is_third_party != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(30, oldVersionCalendarEventAttendee.is_third_party);
            } else {
                i27 = 0;
            }
            int i53 = i52 + i27;
            if (oldVersionCalendarEventAttendee.avatar_path != null) {
                i28 = ProtoAdapter.STRING.encodedSizeWithTag(31, oldVersionCalendarEventAttendee.avatar_path);
            }
            return i53 + i28 + oldVersionCalendarEventAttendee.unknownFields().size();
        }

        /* renamed from: a */
        public OldVersionCalendarEventAttendee decode(ProtoReader protoReader) throws IOException {
            C15888a aVar = new C15888a();
            aVar.f41810a = "";
            aVar.f41811b = "";
            aVar.f41812c = 0L;
            aVar.f41813d = "";
            aVar.f41814e = "";
            aVar.f41815f = false;
            aVar.f41816g = false;
            aVar.f41817h = false;
            aVar.f41818i = Status.NEEDS_ACTION;
            aVar.f41819j = 0;
            aVar.f41821l = 0L;
            aVar.f41822m = 0L;
            aVar.f41823n = Calendar.Type.PRIMARY;
            aVar.f41824o = "";
            aVar.f41825p = "";
            aVar.f41826q = false;
            aVar.f41828s = "";
            aVar.f41829t = "";
            aVar.f41830u = false;
            aVar.f41831v = "";
            aVar.f41832w = false;
            aVar.f41833x = 0;
            aVar.f41834y = "";
            aVar.f41835z = false;
            aVar.f41805A = "";
            aVar.f41806B = false;
            aVar.f41807C = "";
            aVar.f41808D = false;
            aVar.f41809E = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41810a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41811b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41812c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41813d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41814e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41815f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41816g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41817h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            try {
                                aVar.f41818i = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 10:
                            aVar.f41819j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41820k = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41821l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f41822m = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f41823n = Calendar.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 15:
                            aVar.f41824o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f41825p = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 17:
                            aVar.f41826q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            aVar.f41827r.add(OldVersionCalendarEventAttendee.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            aVar.f41828s = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 20:
                            aVar.f41829t = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            aVar.f41830u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f41831v = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            aVar.f41832w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f41833x = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f41834y = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            aVar.f41835z = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f41805A = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f41806B = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            aVar.f41807C = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 30:
                            aVar.f41808D = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f41809E = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, OldVersionCalendarEventAttendee oldVersionCalendarEventAttendee) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oldVersionCalendarEventAttendee.id);
            if (oldVersionCalendarEventAttendee.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, oldVersionCalendarEventAttendee.key);
            }
            if (oldVersionCalendarEventAttendee.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, oldVersionCalendarEventAttendee.original_time);
            }
            if (oldVersionCalendarEventAttendee.display_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, oldVersionCalendarEventAttendee.display_name);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, oldVersionCalendarEventAttendee.attendee_calendar_id);
            if (oldVersionCalendarEventAttendee.is_organizer != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, oldVersionCalendarEventAttendee.is_organizer);
            }
            if (oldVersionCalendarEventAttendee.is_resource != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, oldVersionCalendarEventAttendee.is_resource);
            }
            if (oldVersionCalendarEventAttendee.is_optional != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, oldVersionCalendarEventAttendee.is_optional);
            }
            if (oldVersionCalendarEventAttendee.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 9, oldVersionCalendarEventAttendee.status);
            }
            if (oldVersionCalendarEventAttendee.additional_guests_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, oldVersionCalendarEventAttendee.additional_guests_count);
            }
            if (oldVersionCalendarEventAttendee.avatar != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 11, oldVersionCalendarEventAttendee.avatar);
            }
            if (oldVersionCalendarEventAttendee.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, oldVersionCalendarEventAttendee.create_time);
            }
            if (oldVersionCalendarEventAttendee.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, oldVersionCalendarEventAttendee.update_time);
            }
            if (oldVersionCalendarEventAttendee.type != null) {
                Calendar.Type.ADAPTER.encodeWithTag(protoWriter, 14, oldVersionCalendarEventAttendee.type);
            }
            if (oldVersionCalendarEventAttendee.tags != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, oldVersionCalendarEventAttendee.tags);
            }
            if (oldVersionCalendarEventAttendee.group_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, oldVersionCalendarEventAttendee.group_id);
            }
            if (oldVersionCalendarEventAttendee.is_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, oldVersionCalendarEventAttendee.is_group);
            }
            OldVersionCalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 18, oldVersionCalendarEventAttendee.group_members);
            if (oldVersionCalendarEventAttendee.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, oldVersionCalendarEventAttendee.avatar_key);
            }
            if (oldVersionCalendarEventAttendee.localized_display_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, oldVersionCalendarEventAttendee.localized_display_name);
            }
            if (oldVersionCalendarEventAttendee.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, oldVersionCalendarEventAttendee.is_cross_tenant);
            }
            if (oldVersionCalendarEventAttendee.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, oldVersionCalendarEventAttendee.tenant_id);
            }
            if (oldVersionCalendarEventAttendee.open_security != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, oldVersionCalendarEventAttendee.open_security);
            }
            if (oldVersionCalendarEventAttendee.show_member_limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 24, oldVersionCalendarEventAttendee.show_member_limit);
            }
            if (oldVersionCalendarEventAttendee.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, oldVersionCalendarEventAttendee.user_id);
            }
            if (oldVersionCalendarEventAttendee.is_editable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, oldVersionCalendarEventAttendee.is_editable);
            }
            if (oldVersionCalendarEventAttendee.inviter_calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 27, oldVersionCalendarEventAttendee.inviter_calendar_id);
            }
            if (oldVersionCalendarEventAttendee.is_disabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, oldVersionCalendarEventAttendee.is_disabled);
            }
            if (oldVersionCalendarEventAttendee.email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 29, oldVersionCalendarEventAttendee.email);
            }
            if (oldVersionCalendarEventAttendee.is_third_party != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, oldVersionCalendarEventAttendee.is_third_party);
            }
            if (oldVersionCalendarEventAttendee.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, oldVersionCalendarEventAttendee.avatar_path);
            }
            protoWriter.writeBytes(oldVersionCalendarEventAttendee.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OldVersionCalendarEventAttendee$a */
    public static final class C15888a extends Message.Builder<OldVersionCalendarEventAttendee, C15888a> {

        /* renamed from: A */
        public String f41805A;

        /* renamed from: B */
        public Boolean f41806B;

        /* renamed from: C */
        public String f41807C;

        /* renamed from: D */
        public Boolean f41808D;

        /* renamed from: E */
        public String f41809E;

        /* renamed from: a */
        public String f41810a;

        /* renamed from: b */
        public String f41811b;

        /* renamed from: c */
        public Long f41812c;

        /* renamed from: d */
        public String f41813d;

        /* renamed from: e */
        public String f41814e;

        /* renamed from: f */
        public Boolean f41815f;

        /* renamed from: g */
        public Boolean f41816g;

        /* renamed from: h */
        public Boolean f41817h;

        /* renamed from: i */
        public Status f41818i;

        /* renamed from: j */
        public Integer f41819j;

        /* renamed from: k */
        public ImageSet f41820k;

        /* renamed from: l */
        public Long f41821l;

        /* renamed from: m */
        public Long f41822m;

        /* renamed from: n */
        public Calendar.Type f41823n;

        /* renamed from: o */
        public String f41824o;

        /* renamed from: p */
        public String f41825p;

        /* renamed from: q */
        public Boolean f41826q;

        /* renamed from: r */
        public List<OldVersionCalendarEventAttendee> f41827r = Internal.newMutableList();

        /* renamed from: s */
        public String f41828s;

        /* renamed from: t */
        public String f41829t;

        /* renamed from: u */
        public Boolean f41830u;

        /* renamed from: v */
        public String f41831v;

        /* renamed from: w */
        public Boolean f41832w;

        /* renamed from: x */
        public Integer f41833x;

        /* renamed from: y */
        public String f41834y;

        /* renamed from: z */
        public Boolean f41835z;

        /* renamed from: a */
        public OldVersionCalendarEventAttendee build() {
            String str;
            String str2 = this.f41810a;
            if (str2 != null && (str = this.f41814e) != null) {
                return new OldVersionCalendarEventAttendee(str2, this.f41811b, this.f41812c, this.f41813d, str, this.f41815f, this.f41816g, this.f41817h, this.f41818i, this.f41819j, this.f41820k, this.f41821l, this.f41822m, this.f41823n, this.f41824o, this.f41825p, this.f41826q, this.f41827r, this.f41828s, this.f41829t, this.f41830u, this.f41831v, this.f41832w, this.f41833x, this.f41834y, this.f41835z, this.f41805A, this.f41806B, this.f41807C, this.f41808D, this.f41809E, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f41814e, "attendee_calendar_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15888a newBuilder() {
        C15888a aVar = new C15888a();
        aVar.f41810a = this.id;
        aVar.f41811b = this.key;
        aVar.f41812c = this.original_time;
        aVar.f41813d = this.display_name;
        aVar.f41814e = this.attendee_calendar_id;
        aVar.f41815f = this.is_organizer;
        aVar.f41816g = this.is_resource;
        aVar.f41817h = this.is_optional;
        aVar.f41818i = this.status;
        aVar.f41819j = this.additional_guests_count;
        aVar.f41820k = this.avatar;
        aVar.f41821l = this.create_time;
        aVar.f41822m = this.update_time;
        aVar.f41823n = this.type;
        aVar.f41824o = this.tags;
        aVar.f41825p = this.group_id;
        aVar.f41826q = this.is_group;
        aVar.f41827r = Internal.copyOf("group_members", this.group_members);
        aVar.f41828s = this.avatar_key;
        aVar.f41829t = this.localized_display_name;
        aVar.f41830u = this.is_cross_tenant;
        aVar.f41831v = this.tenant_id;
        aVar.f41832w = this.open_security;
        aVar.f41833x = this.show_member_limit;
        aVar.f41834y = this.user_id;
        aVar.f41835z = this.is_editable;
        aVar.f41805A = this.inviter_calendar_id;
        aVar.f41806B = this.is_disabled;
        aVar.f41807C = this.email;
        aVar.f41808D = this.is_third_party;
        aVar.f41809E = this.avatar_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "OldVersionCalendarEventAttendee");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        sb.append(", attendee_calendar_id=");
        sb.append(this.attendee_calendar_id);
        if (this.is_organizer != null) {
            sb.append(", is_organizer=");
            sb.append(this.is_organizer);
        }
        if (this.is_resource != null) {
            sb.append(", is_resource=");
            sb.append(this.is_resource);
        }
        if (this.is_optional != null) {
            sb.append(", is_optional=");
            sb.append(this.is_optional);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.additional_guests_count != null) {
            sb.append(", additional_guests_count=");
            sb.append(this.additional_guests_count);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.tags != null) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.is_group != null) {
            sb.append(", is_group=");
            sb.append(this.is_group);
        }
        if (!this.group_members.isEmpty()) {
            sb.append(", group_members=");
            sb.append(this.group_members);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.localized_display_name != null) {
            sb.append(", localized_display_name=");
            sb.append(this.localized_display_name);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.open_security != null) {
            sb.append(", open_security=");
            sb.append(this.open_security);
        }
        if (this.show_member_limit != null) {
            sb.append(", show_member_limit=");
            sb.append(this.show_member_limit);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.is_editable != null) {
            sb.append(", is_editable=");
            sb.append(this.is_editable);
        }
        if (this.inviter_calendar_id != null) {
            sb.append(", inviter_calendar_id=");
            sb.append(this.inviter_calendar_id);
        }
        if (this.is_disabled != null) {
            sb.append(", is_disabled=");
            sb.append(this.is_disabled);
        }
        if (this.email != null) {
            sb.append(", email=");
            sb.append(this.email);
        }
        if (this.is_third_party != null) {
            sb.append(", is_third_party=");
            sb.append(this.is_third_party);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        StringBuilder replace = sb.replace(0, 2, "OldVersionCalendarEventAttendee{");
        replace.append('}');
        return replace.toString();
    }

    public OldVersionCalendarEventAttendee(String str, String str2, Long l, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Status status2, Integer num, ImageSet imageSet, Long l2, Long l3, Calendar.Type type2, String str5, String str6, Boolean bool4, List<OldVersionCalendarEventAttendee> list, String str7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num2, String str10, Boolean bool7, String str11, Boolean bool8, String str12, Boolean bool9, String str13) {
        this(str, str2, l, str3, str4, bool, bool2, bool3, status2, num, imageSet, l2, l3, type2, str5, str6, bool4, list, str7, str8, bool5, str9, bool6, num2, str10, bool7, str11, bool8, str12, bool9, str13, ByteString.EMPTY);
    }

    public OldVersionCalendarEventAttendee(String str, String str2, Long l, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Status status2, Integer num, ImageSet imageSet, Long l2, Long l3, Calendar.Type type2, String str5, String str6, Boolean bool4, List<OldVersionCalendarEventAttendee> list, String str7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num2, String str10, Boolean bool7, String str11, Boolean bool8, String str12, Boolean bool9, String str13, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.key = str2;
        this.original_time = l;
        this.display_name = str3;
        this.attendee_calendar_id = str4;
        this.is_organizer = bool;
        this.is_resource = bool2;
        this.is_optional = bool3;
        this.status = status2;
        this.additional_guests_count = num;
        this.avatar = imageSet;
        this.create_time = l2;
        this.update_time = l3;
        this.type = type2;
        this.tags = str5;
        this.group_id = str6;
        this.is_group = bool4;
        this.group_members = Internal.immutableCopyOf("group_members", list);
        this.avatar_key = str7;
        this.localized_display_name = str8;
        this.is_cross_tenant = bool5;
        this.tenant_id = str9;
        this.open_security = bool6;
        this.show_member_limit = num2;
        this.user_id = str10;
        this.is_editable = bool7;
        this.inviter_calendar_id = str11;
        this.is_disabled = bool8;
        this.email = str12;
        this.is_third_party = bool9;
        this.avatar_path = str13;
    }
}
