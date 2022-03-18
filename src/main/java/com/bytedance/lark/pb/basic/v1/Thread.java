package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Thread extends Message<Thread, C15326a> {
    public static final ProtoAdapter<Thread> ADAPTER = new C15327b();
    public static final Boolean DEFAULT_ANONYMOUS_ENABLE = false;
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final FeedCard.FeedType DEFAULT_FEED_TYPE = FeedCard.FeedType.INBOX;
    public static final ThreadFollowStatus DEFAULT_FOLLOW_STATUS = ThreadFollowStatus.NOT_FOLLOWING;
    public static final Boolean DEFAULT_IS_BADGED = false;
    public static final Boolean DEFAULT_IS_FOLLOW = false;
    public static final Boolean DEFAULT_IS_NO_TRACE_DELETED = false;
    public static final Boolean DEFAULT_IS_PARTICIPANT = false;
    public static final Boolean DEFAULT_IS_VISIBLE = false;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_LAST_MESSAGE_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_LAST_VISIBLE_MESSAGE_POSITION = 0;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_ORIGIN_BADGE_COUNT = 0;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_RANK_TIME = 0L;
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_REPLY_COUNT = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean anonymous_enable;
    public final String anonymous_id;
    public final String avatar_key;
    public final String avatar_path;
    public final Integer badge_count;
    public final Channel channel;
    public final FeedCard.FeedType feed_type;
    public final ThreadFollowStatus follow_status;
    public final String id;
    public final Boolean is_badged;
    public final Boolean is_follow;
    public final Boolean is_no_trace_deleted;
    public final Boolean is_participant;
    public final Boolean is_visible;
    public final String last_message_id;
    public final Integer last_message_position;
    public final Integer last_message_position_badge_count;
    public final List<String> last_reply_ids;
    public final String last_visible_message_id;
    public final Integer last_visible_message_position;
    public final List<String> latest_at_message_id;
    public final Integer new_message_count;
    public final Integer no_badged_new_message_count;
    public final Integer origin_badge_count;
    public final String owner_id;
    public final Integer position;
    public final Long rank_time;
    public final Integer read_position;
    public final Integer read_position_badge_count;
    public final Integer reply_count;
    public final String root_message_id;
    public final ThreadStateInfo state_info;
    public final String subtitle;
    public final String topic;
    public final Long update_time;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Thread$b */
    private static final class C15327b extends ProtoAdapter<Thread> {
        C15327b() {
            super(FieldEncoding.LENGTH_DELIMITED, Thread.class);
        }

        /* renamed from: a */
        public int encodedSize(Thread thread) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, thread.id) + Channel.ADAPTER.encodedSizeWithTag(2, thread.channel);
            int i31 = 0;
            if (thread.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, thread.topic);
            } else {
                i = 0;
            }
            int i32 = encodedSizeWithTag + i;
            if (thread.position != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, thread.position);
            } else {
                i2 = 0;
            }
            int i33 = i32 + i2;
            if (thread.root_message_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, thread.root_message_id);
            } else {
                i3 = 0;
            }
            int i34 = i33 + i3;
            if (thread.last_message_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, thread.last_message_id);
            } else {
                i4 = 0;
            }
            int i35 = i34 + i4;
            if (thread.last_message_position != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(7, thread.last_message_position);
            } else {
                i5 = 0;
            }
            int i36 = i35 + i5;
            if (thread.new_message_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(8, thread.new_message_count);
            } else {
                i6 = 0;
            }
            int i37 = i36 + i6;
            if (thread.no_badged_new_message_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(9, thread.no_badged_new_message_count);
            } else {
                i7 = 0;
            }
            int i38 = i37 + i7;
            if (thread.update_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(10, thread.update_time);
            } else {
                i8 = 0;
            }
            int i39 = i38 + i8;
            if (thread.reply_count != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(11, thread.reply_count);
            } else {
                i9 = 0;
            }
            int i40 = i39 + i9;
            if (thread.is_participant != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(12, thread.is_participant);
            } else {
                i10 = 0;
            }
            int i41 = i40 + i10;
            if (thread.owner_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(13, thread.owner_id);
            } else {
                i11 = 0;
            }
            int i42 = i41 + i11;
            if (thread.last_message_position_badge_count != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(14, thread.last_message_position_badge_count);
            } else {
                i12 = 0;
            }
            int i43 = i42 + i12;
            if (thread.read_position != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(15, thread.read_position);
            } else {
                i13 = 0;
            }
            int i44 = i43 + i13;
            if (thread.read_position_badge_count != null) {
                i14 = ProtoAdapter.INT32.encodedSizeWithTag(16, thread.read_position_badge_count);
            } else {
                i14 = 0;
            }
            int i45 = i44 + i14;
            if (thread.last_visible_message_position != null) {
                i15 = ProtoAdapter.INT32.encodedSizeWithTag(17, thread.last_visible_message_position);
            } else {
                i15 = 0;
            }
            int i46 = i45 + i15;
            if (thread.last_visible_message_id != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(18, thread.last_visible_message_id);
            } else {
                i16 = 0;
            }
            int i47 = i46 + i16;
            if (thread.badge_count != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(19, thread.badge_count);
            } else {
                i17 = 0;
            }
            int i48 = i47 + i17;
            if (thread.is_visible != null) {
                i18 = ProtoAdapter.BOOL.encodedSizeWithTag(20, thread.is_visible);
            } else {
                i18 = 0;
            }
            int i49 = i48 + i18;
            if (thread.is_badged != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(21, thread.is_badged);
            } else {
                i19 = 0;
            }
            int i50 = i49 + i19;
            if (thread.subtitle != null) {
                i20 = ProtoAdapter.STRING.encodedSizeWithTag(22, thread.subtitle);
            } else {
                i20 = 0;
            }
            int encodedSizeWithTag2 = i50 + i20 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(23, thread.last_reply_ids);
            if (thread.is_no_trace_deleted != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(24, thread.is_no_trace_deleted);
            } else {
                i21 = 0;
            }
            int i51 = encodedSizeWithTag2 + i21;
            if (thread.origin_badge_count != null) {
                i22 = ProtoAdapter.INT32.encodedSizeWithTag(25, thread.origin_badge_count);
            } else {
                i22 = 0;
            }
            int encodedSizeWithTag3 = i51 + i22 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(26, thread.latest_at_message_id);
            if (thread.rank_time != null) {
                i23 = ProtoAdapter.INT64.encodedSizeWithTag(27, thread.rank_time);
            } else {
                i23 = 0;
            }
            int i52 = encodedSizeWithTag3 + i23;
            if (thread.is_follow != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(50, thread.is_follow);
            } else {
                i24 = 0;
            }
            int i53 = i52 + i24;
            if (thread.follow_status != null) {
                i25 = ThreadFollowStatus.ADAPTER.encodedSizeWithTag(51, thread.follow_status);
            } else {
                i25 = 0;
            }
            int i54 = i53 + i25;
            if (thread.anonymous_id != null) {
                i26 = ProtoAdapter.STRING.encodedSizeWithTag(52, thread.anonymous_id);
            } else {
                i26 = 0;
            }
            int i55 = i54 + i26;
            if (thread.anonymous_enable != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(53, thread.anonymous_enable);
            } else {
                i27 = 0;
            }
            int i56 = i55 + i27;
            if (thread.feed_type != null) {
                i28 = FeedCard.FeedType.ADAPTER.encodedSizeWithTag(100, thread.feed_type);
            } else {
                i28 = 0;
            }
            int i57 = i56 + i28;
            if (thread.avatar_key != null) {
                i29 = ProtoAdapter.STRING.encodedSizeWithTag(101, thread.avatar_key);
            } else {
                i29 = 0;
            }
            int i58 = i57 + i29;
            if (thread.avatar_path != null) {
                i30 = ProtoAdapter.STRING.encodedSizeWithTag(102, thread.avatar_path);
            } else {
                i30 = 0;
            }
            int i59 = i58 + i30;
            if (thread.state_info != null) {
                i31 = ThreadStateInfo.ADAPTER.encodedSizeWithTag(103, thread.state_info);
            }
            return i59 + i31 + thread.unknownFields().size();
        }

        /* renamed from: a */
        public Thread decode(ProtoReader protoReader) throws IOException {
            C15326a aVar = new C15326a();
            aVar.f40579a = "";
            aVar.f40581c = "";
            aVar.f40582d = 0;
            aVar.f40583e = "";
            aVar.f40584f = "";
            aVar.f40585g = 0;
            aVar.f40586h = 0;
            aVar.f40587i = 0;
            aVar.f40588j = 0L;
            aVar.f40589k = 0;
            aVar.f40590l = false;
            aVar.f40591m = "";
            aVar.f40592n = 0;
            aVar.f40593o = 0;
            aVar.f40594p = 0;
            aVar.f40595q = 0;
            aVar.f40596r = "";
            aVar.f40597s = 0;
            aVar.f40598t = false;
            aVar.f40599u = false;
            aVar.f40600v = "";
            aVar.f40602x = false;
            aVar.f40603y = 0;
            aVar.f40570A = 0L;
            aVar.f40571B = false;
            aVar.f40572C = ThreadFollowStatus.NOT_FOLLOWING;
            aVar.f40573D = "";
            aVar.f40574E = false;
            aVar.f40575F = FeedCard.FeedType.INBOX;
            aVar.f40576G = "";
            aVar.f40577H = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40579a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40580b = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40581c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40582d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40583e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40584f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40585g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f40586h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f40587i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f40588j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f40589k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f40590l = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 13:
                            aVar.f40591m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f40592n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            aVar.f40593o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f40594p = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            aVar.f40595q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f40596r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f40597s = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 20:
                            aVar.f40598t = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            aVar.f40599u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f40600v = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            aVar.f40601w.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 24:
                            aVar.f40602x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f40603y = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 26:
                            aVar.f40604z.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f40570A = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            switch (nextTag) {
                                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                    aVar.f40571B = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 51:
                                    try {
                                        aVar.f40572C = ThreadFollowStatus.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 52:
                                    aVar.f40573D = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 53:
                                    aVar.f40574E = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case 100:
                                            try {
                                                aVar.f40575F = FeedCard.FeedType.ADAPTER.decode(protoReader);
                                                continue;
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                                break;
                                            }
                                        case 101:
                                            aVar.f40576G = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 102:
                                            aVar.f40577H = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 103:
                                            aVar.f40578I = ThreadStateInfo.ADAPTER.decode(protoReader);
                                            continue;
                                        default:
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            continue;
                                            continue;
                                    }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Thread thread) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, thread.id);
            Channel.ADAPTER.encodeWithTag(protoWriter, 2, thread.channel);
            if (thread.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, thread.topic);
            }
            if (thread.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, thread.position);
            }
            if (thread.root_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, thread.root_message_id);
            }
            if (thread.last_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, thread.last_message_id);
            }
            if (thread.last_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, thread.last_message_position);
            }
            if (thread.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, thread.new_message_count);
            }
            if (thread.no_badged_new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, thread.no_badged_new_message_count);
            }
            if (thread.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, thread.update_time);
            }
            if (thread.reply_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, thread.reply_count);
            }
            if (thread.is_participant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, thread.is_participant);
            }
            if (thread.owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, thread.owner_id);
            }
            if (thread.last_message_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, thread.last_message_position_badge_count);
            }
            if (thread.read_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, thread.read_position);
            }
            if (thread.read_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, thread.read_position_badge_count);
            }
            if (thread.last_visible_message_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, thread.last_visible_message_position);
            }
            if (thread.last_visible_message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, thread.last_visible_message_id);
            }
            if (thread.badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, thread.badge_count);
            }
            if (thread.is_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, thread.is_visible);
            }
            if (thread.is_badged != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, thread.is_badged);
            }
            if (thread.subtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, thread.subtitle);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 23, thread.last_reply_ids);
            if (thread.is_no_trace_deleted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, thread.is_no_trace_deleted);
            }
            if (thread.origin_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 25, thread.origin_badge_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 26, thread.latest_at_message_id);
            if (thread.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 27, thread.rank_time);
            }
            if (thread.is_follow != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 50, thread.is_follow);
            }
            if (thread.follow_status != null) {
                ThreadFollowStatus.ADAPTER.encodeWithTag(protoWriter, 51, thread.follow_status);
            }
            if (thread.anonymous_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 52, thread.anonymous_id);
            }
            if (thread.anonymous_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 53, thread.anonymous_enable);
            }
            if (thread.feed_type != null) {
                FeedCard.FeedType.ADAPTER.encodeWithTag(protoWriter, 100, thread.feed_type);
            }
            if (thread.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 101, thread.avatar_key);
            }
            if (thread.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 102, thread.avatar_path);
            }
            if (thread.state_info != null) {
                ThreadStateInfo.ADAPTER.encodeWithTag(protoWriter, 103, thread.state_info);
            }
            protoWriter.writeBytes(thread.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Thread$a */
    public static final class C15326a extends Message.Builder<Thread, C15326a> {

        /* renamed from: A */
        public Long f40570A;

        /* renamed from: B */
        public Boolean f40571B;

        /* renamed from: C */
        public ThreadFollowStatus f40572C;

        /* renamed from: D */
        public String f40573D;

        /* renamed from: E */
        public Boolean f40574E;

        /* renamed from: F */
        public FeedCard.FeedType f40575F;

        /* renamed from: G */
        public String f40576G;

        /* renamed from: H */
        public String f40577H;

        /* renamed from: I */
        public ThreadStateInfo f40578I;

        /* renamed from: a */
        public String f40579a;

        /* renamed from: b */
        public Channel f40580b;

        /* renamed from: c */
        public String f40581c;

        /* renamed from: d */
        public Integer f40582d;

        /* renamed from: e */
        public String f40583e;

        /* renamed from: f */
        public String f40584f;

        /* renamed from: g */
        public Integer f40585g;

        /* renamed from: h */
        public Integer f40586h;

        /* renamed from: i */
        public Integer f40587i;

        /* renamed from: j */
        public Long f40588j;

        /* renamed from: k */
        public Integer f40589k;

        /* renamed from: l */
        public Boolean f40590l;

        /* renamed from: m */
        public String f40591m;

        /* renamed from: n */
        public Integer f40592n;

        /* renamed from: o */
        public Integer f40593o;

        /* renamed from: p */
        public Integer f40594p;

        /* renamed from: q */
        public Integer f40595q;

        /* renamed from: r */
        public String f40596r;

        /* renamed from: s */
        public Integer f40597s;

        /* renamed from: t */
        public Boolean f40598t;

        /* renamed from: u */
        public Boolean f40599u;

        /* renamed from: v */
        public String f40600v;

        /* renamed from: w */
        public List<String> f40601w = Internal.newMutableList();

        /* renamed from: x */
        public Boolean f40602x;

        /* renamed from: y */
        public Integer f40603y;

        /* renamed from: z */
        public List<String> f40604z = Internal.newMutableList();

        /* renamed from: a */
        public Thread build() {
            Channel channel;
            String str = this.f40579a;
            if (str != null && (channel = this.f40580b) != null) {
                return new Thread(str, channel, this.f40581c, this.f40582d, this.f40583e, this.f40584f, this.f40585g, this.f40586h, this.f40587i, this.f40588j, this.f40589k, this.f40590l, this.f40591m, this.f40592n, this.f40593o, this.f40594p, this.f40595q, this.f40596r, this.f40597s, this.f40598t, this.f40599u, this.f40600v, this.f40601w, this.f40602x, this.f40603y, this.f40604z, this.f40570A, this.f40571B, this.f40572C, this.f40573D, this.f40574E, this.f40575F, this.f40576G, this.f40577H, this.f40578I, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f40580b, "channel");
        }
    }

    @Override // com.squareup.wire.Message
    public C15326a newBuilder() {
        C15326a aVar = new C15326a();
        aVar.f40579a = this.id;
        aVar.f40580b = this.channel;
        aVar.f40581c = this.topic;
        aVar.f40582d = this.position;
        aVar.f40583e = this.root_message_id;
        aVar.f40584f = this.last_message_id;
        aVar.f40585g = this.last_message_position;
        aVar.f40586h = this.new_message_count;
        aVar.f40587i = this.no_badged_new_message_count;
        aVar.f40588j = this.update_time;
        aVar.f40589k = this.reply_count;
        aVar.f40590l = this.is_participant;
        aVar.f40591m = this.owner_id;
        aVar.f40592n = this.last_message_position_badge_count;
        aVar.f40593o = this.read_position;
        aVar.f40594p = this.read_position_badge_count;
        aVar.f40595q = this.last_visible_message_position;
        aVar.f40596r = this.last_visible_message_id;
        aVar.f40597s = this.badge_count;
        aVar.f40598t = this.is_visible;
        aVar.f40599u = this.is_badged;
        aVar.f40600v = this.subtitle;
        aVar.f40601w = Internal.copyOf("last_reply_ids", this.last_reply_ids);
        aVar.f40602x = this.is_no_trace_deleted;
        aVar.f40603y = this.origin_badge_count;
        aVar.f40604z = Internal.copyOf("latest_at_message_id", this.latest_at_message_id);
        aVar.f40570A = this.rank_time;
        aVar.f40571B = this.is_follow;
        aVar.f40572C = this.follow_status;
        aVar.f40573D = this.anonymous_id;
        aVar.f40574E = this.anonymous_enable;
        aVar.f40575F = this.feed_type;
        aVar.f40576G = this.avatar_key;
        aVar.f40577H = this.avatar_path;
        aVar.f40578I = this.state_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Thread");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", channel=");
        sb.append(this.channel);
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.root_message_id != null) {
            sb.append(", root_message_id=");
            sb.append(this.root_message_id);
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
        if (this.no_badged_new_message_count != null) {
            sb.append(", no_badged_new_message_count=");
            sb.append(this.no_badged_new_message_count);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.reply_count != null) {
            sb.append(", reply_count=");
            sb.append(this.reply_count);
        }
        if (this.is_participant != null) {
            sb.append(", is_participant=");
            sb.append(this.is_participant);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.last_message_position_badge_count != null) {
            sb.append(", last_message_position_badge_count=");
            sb.append(this.last_message_position_badge_count);
        }
        if (this.read_position != null) {
            sb.append(", read_position=");
            sb.append(this.read_position);
        }
        if (this.read_position_badge_count != null) {
            sb.append(", read_position_badge_count=");
            sb.append(this.read_position_badge_count);
        }
        if (this.last_visible_message_position != null) {
            sb.append(", last_visible_message_position=");
            sb.append(this.last_visible_message_position);
        }
        if (this.last_visible_message_id != null) {
            sb.append(", last_visible_message_id=");
            sb.append(this.last_visible_message_id);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        if (this.is_visible != null) {
            sb.append(", is_visible=");
            sb.append(this.is_visible);
        }
        if (this.is_badged != null) {
            sb.append(", is_badged=");
            sb.append(this.is_badged);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (!this.last_reply_ids.isEmpty()) {
            sb.append(", last_reply_ids=");
            sb.append(this.last_reply_ids);
        }
        if (this.is_no_trace_deleted != null) {
            sb.append(", is_no_trace_deleted=");
            sb.append(this.is_no_trace_deleted);
        }
        if (this.origin_badge_count != null) {
            sb.append(", origin_badge_count=");
            sb.append(this.origin_badge_count);
        }
        if (!this.latest_at_message_id.isEmpty()) {
            sb.append(", latest_at_message_id=");
            sb.append(this.latest_at_message_id);
        }
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (this.is_follow != null) {
            sb.append(", is_follow=");
            sb.append(this.is_follow);
        }
        if (this.follow_status != null) {
            sb.append(", follow_status=");
            sb.append(this.follow_status);
        }
        if (this.anonymous_id != null) {
            sb.append(", anonymous_id=");
            sb.append(this.anonymous_id);
        }
        if (this.anonymous_enable != null) {
            sb.append(", anonymous_enable=");
            sb.append(this.anonymous_enable);
        }
        if (this.feed_type != null) {
            sb.append(", feed_type=");
            sb.append(this.feed_type);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (this.state_info != null) {
            sb.append(", state_info=");
            sb.append(this.state_info);
        }
        StringBuilder replace = sb.replace(0, 2, "Thread{");
        replace.append('}');
        return replace.toString();
    }

    public Thread(String str, Channel channel2, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, Integer num4, Long l, Integer num5, Boolean bool, String str5, Integer num6, Integer num7, Integer num8, Integer num9, String str6, Integer num10, Boolean bool2, Boolean bool3, String str7, List<String> list, Boolean bool4, Integer num11, List<String> list2, Long l2, Boolean bool5, ThreadFollowStatus threadFollowStatus, String str8, Boolean bool6, FeedCard.FeedType feedType, String str9, String str10, ThreadStateInfo threadStateInfo) {
        this(str, channel2, str2, num, str3, str4, num2, num3, num4, l, num5, bool, str5, num6, num7, num8, num9, str6, num10, bool2, bool3, str7, list, bool4, num11, list2, l2, bool5, threadFollowStatus, str8, bool6, feedType, str9, str10, threadStateInfo, ByteString.EMPTY);
    }

    public Thread(String str, Channel channel2, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, Integer num4, Long l, Integer num5, Boolean bool, String str5, Integer num6, Integer num7, Integer num8, Integer num9, String str6, Integer num10, Boolean bool2, Boolean bool3, String str7, List<String> list, Boolean bool4, Integer num11, List<String> list2, Long l2, Boolean bool5, ThreadFollowStatus threadFollowStatus, String str8, Boolean bool6, FeedCard.FeedType feedType, String str9, String str10, ThreadStateInfo threadStateInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.channel = channel2;
        this.topic = str2;
        this.position = num;
        this.root_message_id = str3;
        this.last_message_id = str4;
        this.last_message_position = num2;
        this.new_message_count = num3;
        this.no_badged_new_message_count = num4;
        this.update_time = l;
        this.reply_count = num5;
        this.is_participant = bool;
        this.owner_id = str5;
        this.last_message_position_badge_count = num6;
        this.read_position = num7;
        this.read_position_badge_count = num8;
        this.last_visible_message_position = num9;
        this.last_visible_message_id = str6;
        this.badge_count = num10;
        this.is_visible = bool2;
        this.is_badged = bool3;
        this.subtitle = str7;
        this.last_reply_ids = Internal.immutableCopyOf("last_reply_ids", list);
        this.is_no_trace_deleted = bool4;
        this.origin_badge_count = num11;
        this.latest_at_message_id = Internal.immutableCopyOf("latest_at_message_id", list2);
        this.rank_time = l2;
        this.is_follow = bool5;
        this.follow_status = threadFollowStatus;
        this.anonymous_id = str8;
        this.anonymous_enable = bool6;
        this.feed_type = feedType;
        this.avatar_key = str9;
        this.avatar_path = str10;
        this.state_info = threadStateInfo;
    }
}
