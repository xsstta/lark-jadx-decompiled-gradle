package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.videoconference.v1.LiveBindingData;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class InMeetingData extends Message<InMeetingData, C50797a> {
    public static final ProtoAdapter<InMeetingData> ADAPTER = new C50798b();
    public static final Long DEFAULT_SEQ_ID = 0L;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ApplyByteviewAccessibilityData apply_byteview_accessibility_data;
    public final ApplyRemoteControlData apply_remote_control_data;
    public final EnableShareAlphaColorData enable_share_alpha_color_data;
    public final FeatureConfig feature_config;
    public final FollowData follow_data;
    public final HostTransferredData host_transfer_data;
    public final InterviewCodingData interview_coding_data;
    public final LiveMeetingData live_data;
    public final String meeting_id;
    public final ByteviewUser meeting_owner;
    public final MinutesStatusData minutes_status_data;
    public final AllMicrophoneMutedData mute_all_data;
    public final ParticipantsChangedData participants_changed_data;
    public final RecordMeetingData recording_data;
    public final ScreenSharedData screen_shared_data;
    public final Long seq_id;
    public final SettingsChangedData settings_changed_data;
    public final SubtitleStatusData subtitle_status_data;
    public final Type type;
    public final List<WhiteboardData> whiteboard_data;

    public static final class LiveMeetingData extends Message<LiveMeetingData, C50779a> {
        public static final ProtoAdapter<LiveMeetingData> ADAPTER = new C50780b();
        public static final Type DEFAULT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final LiveInfo live_info;
        public final ByteviewUser requester;
        public final Type type;

        public static final class LiveVote extends Message<LiveVote, C50777a> {
            public static final ProtoAdapter<LiveVote> ADAPTER = new C50778b();
            public static final Boolean DEFAULT_ISVOTING = false;
            public static final REASON DEFAULT_REASON = REASON.UNKNOWN;
            private static final long serialVersionUID = 0;
            public final Boolean isVoting;
            public final REASON reason;
            public final String sponsor_id;
            public final String vote_id;

            public enum REASON implements WireEnum {
                UNKNOWN(0),
                CANCEL(1),
                REFUSED(2),
                ACCEPT(3);
                
                public static final ProtoAdapter<REASON> ADAPTER = ProtoAdapter.newEnumAdapter(REASON.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static REASON fromValue(int i) {
                    if (i == 0) {
                        return UNKNOWN;
                    }
                    if (i == 1) {
                        return CANCEL;
                    }
                    if (i == 2) {
                        return REFUSED;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return ACCEPT;
                }

                private REASON(int i) {
                    this.value = i;
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$LiveMeetingData$LiveVote$b */
            private static final class C50778b extends ProtoAdapter<LiveVote> {
                C50778b() {
                    super(FieldEncoding.LENGTH_DELIMITED, LiveVote.class);
                }

                /* renamed from: a */
                public int encodedSize(LiveVote liveVote) {
                    int i;
                    int i2;
                    int i3;
                    int i4 = 0;
                    if (liveVote.vote_id != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, liveVote.vote_id);
                    } else {
                        i = 0;
                    }
                    if (liveVote.isVoting != null) {
                        i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, liveVote.isVoting);
                    } else {
                        i2 = 0;
                    }
                    int i5 = i + i2;
                    if (liveVote.reason != null) {
                        i3 = REASON.ADAPTER.encodedSizeWithTag(3, liveVote.reason);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5 + i3;
                    if (liveVote.sponsor_id != null) {
                        i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, liveVote.sponsor_id);
                    }
                    return i6 + i4 + liveVote.unknownFields().size();
                }

                /* renamed from: a */
                public LiveVote decode(ProtoReader protoReader) throws IOException {
                    C50777a aVar = new C50777a();
                    aVar.f126580a = "";
                    aVar.f126581b = false;
                    aVar.f126582c = REASON.UNKNOWN;
                    aVar.f126583d = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f126580a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f126581b = ProtoAdapter.BOOL.decode(protoReader);
                        } else if (nextTag == 3) {
                            try {
                                aVar.f126582c = REASON.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        } else if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f126583d = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, LiveVote liveVote) throws IOException {
                    if (liveVote.vote_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, liveVote.vote_id);
                    }
                    if (liveVote.isVoting != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, liveVote.isVoting);
                    }
                    if (liveVote.reason != null) {
                        REASON.ADAPTER.encodeWithTag(protoWriter, 3, liveVote.reason);
                    }
                    if (liveVote.sponsor_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, liveVote.sponsor_id);
                    }
                    protoWriter.writeBytes(liveVote.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$LiveMeetingData$LiveVote$a */
            public static final class C50777a extends Message.Builder<LiveVote, C50777a> {

                /* renamed from: a */
                public String f126580a;

                /* renamed from: b */
                public Boolean f126581b;

                /* renamed from: c */
                public REASON f126582c;

                /* renamed from: d */
                public String f126583d;

                /* renamed from: a */
                public LiveVote build() {
                    return new LiveVote(this.f126580a, this.f126581b, this.f126582c, this.f126583d, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50777a newBuilder() {
                C50777a aVar = new C50777a();
                aVar.f126580a = this.vote_id;
                aVar.f126581b = this.isVoting;
                aVar.f126582c = this.reason;
                aVar.f126583d = this.sponsor_id;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "LiveVote");
                StringBuilder sb = new StringBuilder();
                if (this.vote_id != null) {
                    sb.append(", vote_id=");
                    sb.append(this.vote_id);
                }
                if (this.isVoting != null) {
                    sb.append(", isVoting=");
                    sb.append(this.isVoting);
                }
                if (this.reason != null) {
                    sb.append(", reason=");
                    sb.append(this.reason);
                }
                if (this.sponsor_id != null) {
                    sb.append(", sponsor_id=");
                    sb.append(this.sponsor_id);
                }
                StringBuilder replace = sb.replace(0, 2, "LiveVote{");
                replace.append('}');
                return replace.toString();
            }

            public LiveVote(String str, Boolean bool, REASON reason2, String str2) {
                this(str, bool, reason2, str2, ByteString.EMPTY);
            }

            public LiveVote(String str, Boolean bool, REASON reason2, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.vote_id = str;
                this.isVoting = bool;
                this.reason = reason2;
                this.sponsor_id = str2;
            }
        }

        public enum LayoutStyle implements WireEnum {
            STYLE_UNKNOWN(0),
            LIST(1),
            GALLERY(2),
            SIMPLE(3),
            PORTRAIT(4);
            
            public static final ProtoAdapter<LayoutStyle> ADAPTER = ProtoAdapter.newEnumAdapter(LayoutStyle.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static LayoutStyle fromValue(int i) {
                if (i == 0) {
                    return STYLE_UNKNOWN;
                }
                if (i == 1) {
                    return LIST;
                }
                if (i == 2) {
                    return GALLERY;
                }
                if (i == 3) {
                    return SIMPLE;
                }
                if (i != 4) {
                    return null;
                }
                return PORTRAIT;
            }

            private LayoutStyle(int i) {
                this.value = i;
            }
        }

        public enum Privilege implements WireEnum {
            PREVILEGE_UNKNOWN(0),
            ANONYMOUS(1),
            EMPLOYEE(2);
            
            public static final ProtoAdapter<Privilege> ADAPTER = ProtoAdapter.newEnumAdapter(Privilege.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Privilege fromValue(int i) {
                if (i == 0) {
                    return PREVILEGE_UNKNOWN;
                }
                if (i == 1) {
                    return ANONYMOUS;
                }
                if (i != 2) {
                    return null;
                }
                return EMPLOYEE;
            }

            private Privilege(int i) {
                this.value = i;
            }
        }

        public enum Type implements WireEnum {
            UNKNOWN(0),
            LIVE_INFO_CHANGE(1),
            PARTICIPANT_REQUEST(2),
            HOST_RESPONSE(3);
            
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
                    return LIVE_INFO_CHANGE;
                }
                if (i == 2) {
                    return PARTICIPANT_REQUEST;
                }
                if (i != 3) {
                    return null;
                }
                return HOST_RESPONSE;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public static final class LiveInfo extends Message<LiveInfo, C50775a> {
            public static final ProtoAdapter<LiveInfo> ADAPTER = new C50776b();
            public static final Boolean DEFAULT_DEFAULT_ENABLE_LIVE_COMMENT = false;
            public static final LayoutStyle DEFAULT_DEFAULT_LAYOUT_STYLE = LayoutStyle.STYLE_UNKNOWN;
            public static final Privilege DEFAULT_DEFAULT_PRIVILEGE = Privilege.PREVILEGE_UNKNOWN;
            public static final Boolean DEFAULT_ENABLE_LIVE_COMMENT = false;
            public static final Boolean DEFAULT_IS_LIVING = false;
            public static final LayoutStyle DEFAULT_LAYOUT_STYLE = LayoutStyle.STYLE_UNKNOWN;
            public static final Long DEFAULT_LIVE_ID = 0L;
            public static final Privilege DEFAULT_PRIVILEGE = Privilege.PREVILEGE_UNKNOWN;
            public static final Long DEFAULT_SID = 0L;
            private static final long serialVersionUID = 0;
            public final BindingLiveInfo binding_living;
            public final Boolean default_enable_live_comment;
            public final LayoutStyle default_layout_style;
            public final Privilege default_privilege;
            public final Boolean enable_live_comment;
            public final Boolean is_living;
            public final LayoutStyle layout_style;
            public final Long live_id;
            public final String live_name;
            public final String live_session_id;
            public final String live_url;
            public final LiveVote live_vote;
            public final Privilege privilege;
            public final Long sid;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$LiveMeetingData$LiveInfo$b */
            private static final class C50776b extends ProtoAdapter<LiveInfo> {
                C50776b() {
                    super(FieldEncoding.LENGTH_DELIMITED, LiveInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(LiveInfo liveInfo) {
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
                    int i14 = 0;
                    if (liveInfo.live_name != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, liveInfo.live_name);
                    } else {
                        i = 0;
                    }
                    if (liveInfo.live_url != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, liveInfo.live_url);
                    } else {
                        i2 = 0;
                    }
                    int i15 = i + i2;
                    if (liveInfo.is_living != null) {
                        i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, liveInfo.is_living);
                    } else {
                        i3 = 0;
                    }
                    int i16 = i15 + i3;
                    if (liveInfo.live_vote != null) {
                        i4 = LiveVote.ADAPTER.encodedSizeWithTag(4, liveInfo.live_vote);
                    } else {
                        i4 = 0;
                    }
                    int i17 = i16 + i4;
                    if (liveInfo.sid != null) {
                        i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, liveInfo.sid);
                    } else {
                        i5 = 0;
                    }
                    int i18 = i17 + i5;
                    if (liveInfo.privilege != null) {
                        i6 = Privilege.ADAPTER.encodedSizeWithTag(6, liveInfo.privilege);
                    } else {
                        i6 = 0;
                    }
                    int i19 = i18 + i6;
                    if (liveInfo.binding_living != null) {
                        i7 = BindingLiveInfo.ADAPTER.encodedSizeWithTag(7, liveInfo.binding_living);
                    } else {
                        i7 = 0;
                    }
                    int i20 = i19 + i7;
                    if (liveInfo.layout_style != null) {
                        i8 = LayoutStyle.ADAPTER.encodedSizeWithTag(8, liveInfo.layout_style);
                    } else {
                        i8 = 0;
                    }
                    int i21 = i20 + i8;
                    if (liveInfo.default_layout_style != null) {
                        i9 = LayoutStyle.ADAPTER.encodedSizeWithTag(9, liveInfo.default_layout_style);
                    } else {
                        i9 = 0;
                    }
                    int i22 = i21 + i9;
                    if (liveInfo.enable_live_comment != null) {
                        i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, liveInfo.enable_live_comment);
                    } else {
                        i10 = 0;
                    }
                    int i23 = i22 + i10;
                    if (liveInfo.default_enable_live_comment != null) {
                        i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, liveInfo.default_enable_live_comment);
                    } else {
                        i11 = 0;
                    }
                    int i24 = i23 + i11;
                    if (liveInfo.default_privilege != null) {
                        i12 = Privilege.ADAPTER.encodedSizeWithTag(12, liveInfo.default_privilege);
                    } else {
                        i12 = 0;
                    }
                    int i25 = i24 + i12;
                    if (liveInfo.live_id != null) {
                        i13 = ProtoAdapter.INT64.encodedSizeWithTag(13, liveInfo.live_id);
                    } else {
                        i13 = 0;
                    }
                    int i26 = i25 + i13;
                    if (liveInfo.live_session_id != null) {
                        i14 = ProtoAdapter.STRING.encodedSizeWithTag(14, liveInfo.live_session_id);
                    }
                    return i26 + i14 + liveInfo.unknownFields().size();
                }

                /* renamed from: a */
                public LiveInfo decode(ProtoReader protoReader) throws IOException {
                    C50775a aVar = new C50775a();
                    aVar.f126566a = "";
                    aVar.f126567b = "";
                    aVar.f126568c = false;
                    aVar.f126570e = 0L;
                    aVar.f126571f = Privilege.PREVILEGE_UNKNOWN;
                    aVar.f126573h = LayoutStyle.STYLE_UNKNOWN;
                    aVar.f126574i = LayoutStyle.STYLE_UNKNOWN;
                    aVar.f126575j = false;
                    aVar.f126576k = false;
                    aVar.f126577l = Privilege.PREVILEGE_UNKNOWN;
                    aVar.f126578m = 0L;
                    aVar.f126579n = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    aVar.f126566a = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    aVar.f126567b = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    aVar.f126568c = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 4:
                                    aVar.f126569d = LiveVote.ADAPTER.decode(protoReader);
                                    break;
                                case 5:
                                    aVar.f126570e = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 6:
                                    try {
                                        aVar.f126571f = Privilege.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 7:
                                    aVar.f126572g = BindingLiveInfo.ADAPTER.decode(protoReader);
                                    break;
                                case 8:
                                    try {
                                        aVar.f126573h = LayoutStyle.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                        break;
                                    }
                                case 9:
                                    try {
                                        aVar.f126574i = LayoutStyle.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                        break;
                                    }
                                case 10:
                                    aVar.f126575j = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 11:
                                    aVar.f126576k = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case HwBuildEx.VersionCodes.EMUI_5_1:
                                    try {
                                        aVar.f126577l = Privilege.ADAPTER.decode(protoReader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                        break;
                                    }
                                case 13:
                                    aVar.f126578m = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 14:
                                    aVar.f126579n = ProtoAdapter.STRING.decode(protoReader);
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
                public void encode(ProtoWriter protoWriter, LiveInfo liveInfo) throws IOException {
                    if (liveInfo.live_name != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, liveInfo.live_name);
                    }
                    if (liveInfo.live_url != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, liveInfo.live_url);
                    }
                    if (liveInfo.is_living != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, liveInfo.is_living);
                    }
                    if (liveInfo.live_vote != null) {
                        LiveVote.ADAPTER.encodeWithTag(protoWriter, 4, liveInfo.live_vote);
                    }
                    if (liveInfo.sid != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, liveInfo.sid);
                    }
                    if (liveInfo.privilege != null) {
                        Privilege.ADAPTER.encodeWithTag(protoWriter, 6, liveInfo.privilege);
                    }
                    if (liveInfo.binding_living != null) {
                        BindingLiveInfo.ADAPTER.encodeWithTag(protoWriter, 7, liveInfo.binding_living);
                    }
                    if (liveInfo.layout_style != null) {
                        LayoutStyle.ADAPTER.encodeWithTag(protoWriter, 8, liveInfo.layout_style);
                    }
                    if (liveInfo.default_layout_style != null) {
                        LayoutStyle.ADAPTER.encodeWithTag(protoWriter, 9, liveInfo.default_layout_style);
                    }
                    if (liveInfo.enable_live_comment != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, liveInfo.enable_live_comment);
                    }
                    if (liveInfo.default_enable_live_comment != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, liveInfo.default_enable_live_comment);
                    }
                    if (liveInfo.default_privilege != null) {
                        Privilege.ADAPTER.encodeWithTag(protoWriter, 12, liveInfo.default_privilege);
                    }
                    if (liveInfo.live_id != null) {
                        ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, liveInfo.live_id);
                    }
                    if (liveInfo.live_session_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, liveInfo.live_session_id);
                    }
                    protoWriter.writeBytes(liveInfo.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$LiveMeetingData$LiveInfo$a */
            public static final class C50775a extends Message.Builder<LiveInfo, C50775a> {

                /* renamed from: a */
                public String f126566a;

                /* renamed from: b */
                public String f126567b;

                /* renamed from: c */
                public Boolean f126568c;

                /* renamed from: d */
                public LiveVote f126569d;

                /* renamed from: e */
                public Long f126570e;

                /* renamed from: f */
                public Privilege f126571f;

                /* renamed from: g */
                public BindingLiveInfo f126572g;

                /* renamed from: h */
                public LayoutStyle f126573h;

                /* renamed from: i */
                public LayoutStyle f126574i;

                /* renamed from: j */
                public Boolean f126575j;

                /* renamed from: k */
                public Boolean f126576k;

                /* renamed from: l */
                public Privilege f126577l;

                /* renamed from: m */
                public Long f126578m;

                /* renamed from: n */
                public String f126579n;

                /* renamed from: a */
                public LiveInfo build() {
                    return new LiveInfo(this.f126566a, this.f126567b, this.f126568c, this.f126569d, this.f126570e, this.f126571f, this.f126572g, this.f126573h, this.f126574i, this.f126575j, this.f126576k, this.f126577l, this.f126578m, this.f126579n, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50775a newBuilder() {
                C50775a aVar = new C50775a();
                aVar.f126566a = this.live_name;
                aVar.f126567b = this.live_url;
                aVar.f126568c = this.is_living;
                aVar.f126569d = this.live_vote;
                aVar.f126570e = this.sid;
                aVar.f126571f = this.privilege;
                aVar.f126572g = this.binding_living;
                aVar.f126573h = this.layout_style;
                aVar.f126574i = this.default_layout_style;
                aVar.f126575j = this.enable_live_comment;
                aVar.f126576k = this.default_enable_live_comment;
                aVar.f126577l = this.default_privilege;
                aVar.f126578m = this.live_id;
                aVar.f126579n = this.live_session_id;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "LiveInfo");
                StringBuilder sb = new StringBuilder();
                if (this.live_name != null) {
                    sb.append(", live_name=");
                    sb.append(this.live_name);
                }
                if (this.live_url != null) {
                    sb.append(", live_url=");
                    sb.append(this.live_url);
                }
                if (this.is_living != null) {
                    sb.append(", is_living=");
                    sb.append(this.is_living);
                }
                if (this.live_vote != null) {
                    sb.append(", live_vote=");
                    sb.append(this.live_vote);
                }
                if (this.sid != null) {
                    sb.append(", sid=");
                    sb.append(this.sid);
                }
                if (this.privilege != null) {
                    sb.append(", privilege=");
                    sb.append(this.privilege);
                }
                if (this.binding_living != null) {
                    sb.append(", binding_living=");
                    sb.append(this.binding_living);
                }
                if (this.layout_style != null) {
                    sb.append(", layout_style=");
                    sb.append(this.layout_style);
                }
                if (this.default_layout_style != null) {
                    sb.append(", default_layout_style=");
                    sb.append(this.default_layout_style);
                }
                if (this.enable_live_comment != null) {
                    sb.append(", enable_live_comment=");
                    sb.append(this.enable_live_comment);
                }
                if (this.default_enable_live_comment != null) {
                    sb.append(", default_enable_live_comment=");
                    sb.append(this.default_enable_live_comment);
                }
                if (this.default_privilege != null) {
                    sb.append(", default_privilege=");
                    sb.append(this.default_privilege);
                }
                if (this.live_id != null) {
                    sb.append(", live_id=");
                    sb.append(this.live_id);
                }
                if (this.live_session_id != null) {
                    sb.append(", live_session_id=");
                    sb.append(this.live_session_id);
                }
                StringBuilder replace = sb.replace(0, 2, "LiveInfo{");
                replace.append('}');
                return replace.toString();
            }

            public LiveInfo(String str, String str2, Boolean bool, LiveVote liveVote, Long l, Privilege privilege2, BindingLiveInfo bindingLiveInfo, LayoutStyle layoutStyle, LayoutStyle layoutStyle2, Boolean bool2, Boolean bool3, Privilege privilege3, Long l2, String str3) {
                this(str, str2, bool, liveVote, l, privilege2, bindingLiveInfo, layoutStyle, layoutStyle2, bool2, bool3, privilege3, l2, str3, ByteString.EMPTY);
            }

            public LiveInfo(String str, String str2, Boolean bool, LiveVote liveVote, Long l, Privilege privilege2, BindingLiveInfo bindingLiveInfo, LayoutStyle layoutStyle, LayoutStyle layoutStyle2, Boolean bool2, Boolean bool3, Privilege privilege3, Long l2, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                this.live_name = str;
                this.live_url = str2;
                this.is_living = bool;
                this.live_vote = liveVote;
                this.sid = l;
                this.privilege = privilege2;
                this.binding_living = bindingLiveInfo;
                this.layout_style = layoutStyle;
                this.default_layout_style = layoutStyle2;
                this.enable_live_comment = bool2;
                this.default_enable_live_comment = bool3;
                this.default_privilege = privilege3;
                this.live_id = l2;
                this.live_session_id = str3;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$LiveMeetingData$b */
        private static final class C50780b extends ProtoAdapter<LiveMeetingData> {
            C50780b() {
                super(FieldEncoding.LENGTH_DELIMITED, LiveMeetingData.class);
            }

            /* renamed from: a */
            public int encodedSize(LiveMeetingData liveMeetingData) {
                int i;
                int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, liveMeetingData.type);
                int i2 = 0;
                if (liveMeetingData.live_info != null) {
                    i = LiveInfo.ADAPTER.encodedSizeWithTag(2, liveMeetingData.live_info);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (liveMeetingData.requester != null) {
                    i2 = ByteviewUser.ADAPTER.encodedSizeWithTag(3, liveMeetingData.requester);
                }
                return i3 + i2 + liveMeetingData.unknownFields().size();
            }

            /* renamed from: a */
            public LiveMeetingData decode(ProtoReader protoReader) throws IOException {
                C50779a aVar = new C50779a();
                aVar.f126584a = Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f126584a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f126585b = LiveInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126586c = ByteviewUser.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LiveMeetingData liveMeetingData) throws IOException {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, liveMeetingData.type);
                if (liveMeetingData.live_info != null) {
                    LiveInfo.ADAPTER.encodeWithTag(protoWriter, 2, liveMeetingData.live_info);
                }
                if (liveMeetingData.requester != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 3, liveMeetingData.requester);
                }
                protoWriter.writeBytes(liveMeetingData.unknownFields());
            }
        }

        public static final class BindingLiveInfo extends Message<BindingLiveInfo, C50773a> {
            public static final ProtoAdapter<BindingLiveInfo> ADAPTER = new C50774b();
            private static final long serialVersionUID = 0;
            public final Map<String, LiveBindingData.LiveAccountData> account_bindings;
            public final Map<String, LiveBindingData.LiveStreamData> stream_bindings;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$LiveMeetingData$BindingLiveInfo$a */
            public static final class C50773a extends Message.Builder<BindingLiveInfo, C50773a> {

                /* renamed from: a */
                public Map<String, LiveBindingData.LiveAccountData> f126562a = Internal.newMutableMap();

                /* renamed from: b */
                public Map<String, LiveBindingData.LiveStreamData> f126563b = Internal.newMutableMap();

                /* renamed from: a */
                public BindingLiveInfo build() {
                    return new BindingLiveInfo(this.f126562a, this.f126563b, super.buildUnknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$LiveMeetingData$BindingLiveInfo$b */
            private static final class C50774b extends ProtoAdapter<BindingLiveInfo> {

                /* renamed from: a */
                private final ProtoAdapter<Map<String, LiveBindingData.LiveAccountData>> f126564a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LiveBindingData.LiveAccountData.ADAPTER);

                /* renamed from: b */
                private final ProtoAdapter<Map<String, LiveBindingData.LiveStreamData>> f126565b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LiveBindingData.LiveStreamData.ADAPTER);

                C50774b() {
                    super(FieldEncoding.LENGTH_DELIMITED, BindingLiveInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(BindingLiveInfo bindingLiveInfo) {
                    return this.f126564a.encodedSizeWithTag(1, bindingLiveInfo.account_bindings) + this.f126565b.encodedSizeWithTag(2, bindingLiveInfo.stream_bindings) + bindingLiveInfo.unknownFields().size();
                }

                /* renamed from: a */
                public BindingLiveInfo decode(ProtoReader protoReader) throws IOException {
                    C50773a aVar = new C50773a();
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f126562a.putAll(this.f126564a.decode(protoReader));
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f126563b.putAll(this.f126565b.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, BindingLiveInfo bindingLiveInfo) throws IOException {
                    this.f126564a.encodeWithTag(protoWriter, 1, bindingLiveInfo.account_bindings);
                    this.f126565b.encodeWithTag(protoWriter, 2, bindingLiveInfo.stream_bindings);
                    protoWriter.writeBytes(bindingLiveInfo.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50773a newBuilder() {
                C50773a aVar = new C50773a();
                aVar.f126562a = Internal.copyOf("account_bindings", this.account_bindings);
                aVar.f126563b = Internal.copyOf("stream_bindings", this.stream_bindings);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "BindingLiveInfo");
                StringBuilder sb = new StringBuilder();
                if (!this.account_bindings.isEmpty()) {
                    sb.append(", account_bindings=");
                    sb.append(this.account_bindings);
                }
                if (!this.stream_bindings.isEmpty()) {
                    sb.append(", stream_bindings=");
                    sb.append(this.stream_bindings);
                }
                StringBuilder replace = sb.replace(0, 2, "BindingLiveInfo{");
                replace.append('}');
                return replace.toString();
            }

            public BindingLiveInfo(Map<String, LiveBindingData.LiveAccountData> map, Map<String, LiveBindingData.LiveStreamData> map2) {
                this(map, map2, ByteString.EMPTY);
            }

            public BindingLiveInfo(Map<String, LiveBindingData.LiveAccountData> map, Map<String, LiveBindingData.LiveStreamData> map2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.account_bindings = Internal.immutableCopyOf("account_bindings", map);
                this.stream_bindings = Internal.immutableCopyOf("stream_bindings", map2);
            }
        }

        @Override // com.squareup.wire.Message
        public C50779a newBuilder() {
            C50779a aVar = new C50779a();
            aVar.f126584a = this.type;
            aVar.f126585b = this.live_info;
            aVar.f126586c = this.requester;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$LiveMeetingData$a */
        public static final class C50779a extends Message.Builder<LiveMeetingData, C50779a> {

            /* renamed from: a */
            public Type f126584a;

            /* renamed from: b */
            public LiveInfo f126585b;

            /* renamed from: c */
            public ByteviewUser f126586c;

            /* renamed from: a */
            public LiveMeetingData build() {
                Type type = this.f126584a;
                if (type != null) {
                    return new LiveMeetingData(type, this.f126585b, this.f126586c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "LiveMeetingData");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (this.live_info != null) {
                sb.append(", live_info=");
                sb.append(this.live_info);
            }
            if (this.requester != null) {
                sb.append(", requester=");
                sb.append(this.requester);
            }
            StringBuilder replace = sb.replace(0, 2, "LiveMeetingData{");
            replace.append('}');
            return replace.toString();
        }

        public LiveMeetingData(Type type2, LiveInfo liveInfo, ByteviewUser byteviewUser) {
            this(type2, liveInfo, byteviewUser, ByteString.EMPTY);
        }

        public LiveMeetingData(Type type2, LiveInfo liveInfo, ByteviewUser byteviewUser, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.live_info = liveInfo;
            this.requester = byteviewUser;
        }
    }

    public static final class ParticipantsChangedData extends Message<ParticipantsChangedData, C50781a> {
        public static final ProtoAdapter<ParticipantsChangedData> ADAPTER = new C50782b();
        public static final OperationSource DEFAULT_OPERATION_SOURCE = OperationSource.UNKNOWN_SOURCE;
        private static final long serialVersionUID = 0;
        public final OperationSource operation_source;
        public final List<Participant> participants;

        public enum OperationSource implements WireEnum {
            UNKNOWN_SOURCE(0),
            PARTICIPANT_MUTE_MIC(1),
            PARTICIPANT_MUTE_CAMERA(2),
            HOST_MUTE_MIC(3),
            HOST_MUTE_CAMERA(4),
            HOST_MUTE_ALL_MIC(5);
            
            public static final ProtoAdapter<OperationSource> ADAPTER = ProtoAdapter.newEnumAdapter(OperationSource.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static OperationSource fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN_SOURCE;
                }
                if (i == 1) {
                    return PARTICIPANT_MUTE_MIC;
                }
                if (i == 2) {
                    return PARTICIPANT_MUTE_CAMERA;
                }
                if (i == 3) {
                    return HOST_MUTE_MIC;
                }
                if (i == 4) {
                    return HOST_MUTE_CAMERA;
                }
                if (i != 5) {
                    return null;
                }
                return HOST_MUTE_ALL_MIC;
            }

            private OperationSource(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ParticipantsChangedData$b */
        private static final class C50782b extends ProtoAdapter<ParticipantsChangedData> {
            C50782b() {
                super(FieldEncoding.LENGTH_DELIMITED, ParticipantsChangedData.class);
            }

            /* renamed from: a */
            public int encodedSize(ParticipantsChangedData participantsChangedData) {
                int i;
                int encodedSizeWithTag = Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, participantsChangedData.participants);
                if (participantsChangedData.operation_source != null) {
                    i = OperationSource.ADAPTER.encodedSizeWithTag(2, participantsChangedData.operation_source);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + participantsChangedData.unknownFields().size();
            }

            /* renamed from: a */
            public ParticipantsChangedData decode(ProtoReader protoReader) throws IOException {
                C50781a aVar = new C50781a();
                aVar.f126588b = OperationSource.UNKNOWN_SOURCE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126587a.add(Participant.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f126588b = OperationSource.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ParticipantsChangedData participantsChangedData) throws IOException {
                Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, participantsChangedData.participants);
                if (participantsChangedData.operation_source != null) {
                    OperationSource.ADAPTER.encodeWithTag(protoWriter, 2, participantsChangedData.operation_source);
                }
                protoWriter.writeBytes(participantsChangedData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ParticipantsChangedData$a */
        public static final class C50781a extends Message.Builder<ParticipantsChangedData, C50781a> {

            /* renamed from: a */
            public List<Participant> f126587a = Internal.newMutableList();

            /* renamed from: b */
            public OperationSource f126588b;

            /* renamed from: a */
            public ParticipantsChangedData build() {
                return new ParticipantsChangedData(this.f126587a, this.f126588b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50781a newBuilder() {
            C50781a aVar = new C50781a();
            aVar.f126587a = Internal.copyOf("participants", this.participants);
            aVar.f126588b = this.operation_source;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ParticipantsChangedData");
            StringBuilder sb = new StringBuilder();
            if (!this.participants.isEmpty()) {
                sb.append(", participants=");
                sb.append(this.participants);
            }
            if (this.operation_source != null) {
                sb.append(", operation_source=");
                sb.append(this.operation_source);
            }
            StringBuilder replace = sb.replace(0, 2, "ParticipantsChangedData{");
            replace.append('}');
            return replace.toString();
        }

        public ParticipantsChangedData(List<Participant> list, OperationSource operationSource) {
            this(list, operationSource, ByteString.EMPTY);
        }

        public ParticipantsChangedData(List<Participant> list, OperationSource operationSource, ByteString byteString) {
            super(ADAPTER, byteString);
            this.participants = Internal.immutableCopyOf("participants", list);
            this.operation_source = operationSource;
        }
    }

    public static final class RecordMeetingData extends Message<RecordMeetingData, C50783a> {
        public static final ProtoAdapter<RecordMeetingData> ADAPTER = new C50784b();
        public static final Boolean DEFAULT_IS_RECORDING = false;
        public static final Type DEFAULT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final Boolean is_recording;
        public final String policy_url;
        public final I18nKeyInfo recording_hover;
        public final I18nKeyInfo recording_stop;
        public final MsgInfo recording_stop_v2;
        public final ByteviewUser request_participant;
        public final ByteviewUser requester;
        public final Type type;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            RECORDING_STATUS_CHANGE(1),
            PARTICIPANT_REQUEST(2),
            HOST_RESPONSE(3),
            RECORDING_INFO(10);
            
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
                    return RECORDING_STATUS_CHANGE;
                }
                if (i == 2) {
                    return PARTICIPANT_REQUEST;
                }
                if (i == 3) {
                    return HOST_RESPONSE;
                }
                if (i != 10) {
                    return null;
                }
                return RECORDING_INFO;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$RecordMeetingData$b */
        private static final class C50784b extends ProtoAdapter<RecordMeetingData> {
            C50784b() {
                super(FieldEncoding.LENGTH_DELIMITED, RecordMeetingData.class);
            }

            /* renamed from: a */
            public int encodedSize(RecordMeetingData recordMeetingData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, recordMeetingData.type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, recordMeetingData.is_recording);
                int i6 = 0;
                if (recordMeetingData.request_participant != null) {
                    i = ByteviewUser.ADAPTER.encodedSizeWithTag(3, recordMeetingData.request_participant);
                } else {
                    i = 0;
                }
                int i7 = encodedSizeWithTag + i;
                if (recordMeetingData.requester != null) {
                    i2 = ByteviewUser.ADAPTER.encodedSizeWithTag(4, recordMeetingData.requester);
                } else {
                    i2 = 0;
                }
                int i8 = i7 + i2;
                if (recordMeetingData.policy_url != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, recordMeetingData.policy_url);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (recordMeetingData.recording_hover != null) {
                    i4 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(6, recordMeetingData.recording_hover);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (recordMeetingData.recording_stop != null) {
                    i5 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(7, recordMeetingData.recording_stop);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (recordMeetingData.recording_stop_v2 != null) {
                    i6 = MsgInfo.ADAPTER.encodedSizeWithTag(8, recordMeetingData.recording_stop_v2);
                }
                return i11 + i6 + recordMeetingData.unknownFields().size();
            }

            /* renamed from: a */
            public RecordMeetingData decode(ProtoReader protoReader) throws IOException {
                C50783a aVar = new C50783a();
                aVar.f126589a = Type.UNKNOWN;
                aVar.f126590b = false;
                aVar.f126593e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f126589a = Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f126590b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126591c = ByteviewUser.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126592d = ByteviewUser.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126593e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126594f = I18nKeyInfo.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126595g = I18nKeyInfo.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                aVar.f126596h = MsgInfo.ADAPTER.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, RecordMeetingData recordMeetingData) throws IOException {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, recordMeetingData.type);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, recordMeetingData.is_recording);
                if (recordMeetingData.request_participant != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 3, recordMeetingData.request_participant);
                }
                if (recordMeetingData.requester != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 4, recordMeetingData.requester);
                }
                if (recordMeetingData.policy_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, recordMeetingData.policy_url);
                }
                if (recordMeetingData.recording_hover != null) {
                    I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 6, recordMeetingData.recording_hover);
                }
                if (recordMeetingData.recording_stop != null) {
                    I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 7, recordMeetingData.recording_stop);
                }
                if (recordMeetingData.recording_stop_v2 != null) {
                    MsgInfo.ADAPTER.encodeWithTag(protoWriter, 8, recordMeetingData.recording_stop_v2);
                }
                protoWriter.writeBytes(recordMeetingData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$RecordMeetingData$a */
        public static final class C50783a extends Message.Builder<RecordMeetingData, C50783a> {

            /* renamed from: a */
            public Type f126589a;

            /* renamed from: b */
            public Boolean f126590b;

            /* renamed from: c */
            public ByteviewUser f126591c;

            /* renamed from: d */
            public ByteviewUser f126592d;

            /* renamed from: e */
            public String f126593e;

            /* renamed from: f */
            public I18nKeyInfo f126594f;

            /* renamed from: g */
            public I18nKeyInfo f126595g;

            /* renamed from: h */
            public MsgInfo f126596h;

            /* renamed from: a */
            public RecordMeetingData build() {
                Boolean bool;
                Type type = this.f126589a;
                if (type != null && (bool = this.f126590b) != null) {
                    return new RecordMeetingData(type, bool, this.f126591c, this.f126592d, this.f126593e, this.f126594f, this.f126595g, this.f126596h, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f126590b, "is_recording");
            }
        }

        @Override // com.squareup.wire.Message
        public C50783a newBuilder() {
            C50783a aVar = new C50783a();
            aVar.f126589a = this.type;
            aVar.f126590b = this.is_recording;
            aVar.f126591c = this.request_participant;
            aVar.f126592d = this.requester;
            aVar.f126593e = this.policy_url;
            aVar.f126594f = this.recording_hover;
            aVar.f126595g = this.recording_stop;
            aVar.f126596h = this.recording_stop_v2;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "RecordMeetingData");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", is_recording=");
            sb.append(this.is_recording);
            if (this.request_participant != null) {
                sb.append(", request_participant=");
                sb.append(this.request_participant);
            }
            if (this.requester != null) {
                sb.append(", requester=");
                sb.append(this.requester);
            }
            if (this.policy_url != null) {
                sb.append(", policy_url=");
                sb.append(this.policy_url);
            }
            if (this.recording_hover != null) {
                sb.append(", recording_hover=");
                sb.append(this.recording_hover);
            }
            if (this.recording_stop != null) {
                sb.append(", recording_stop=");
                sb.append(this.recording_stop);
            }
            if (this.recording_stop_v2 != null) {
                sb.append(", recording_stop_v2=");
                sb.append(this.recording_stop_v2);
            }
            StringBuilder replace = sb.replace(0, 2, "RecordMeetingData{");
            replace.append('}');
            return replace.toString();
        }

        public RecordMeetingData(Type type2, Boolean bool, ByteviewUser byteviewUser, ByteviewUser byteviewUser2, String str, I18nKeyInfo i18nKeyInfo, I18nKeyInfo i18nKeyInfo2, MsgInfo msgInfo) {
            this(type2, bool, byteviewUser, byteviewUser2, str, i18nKeyInfo, i18nKeyInfo2, msgInfo, ByteString.EMPTY);
        }

        public RecordMeetingData(Type type2, Boolean bool, ByteviewUser byteviewUser, ByteviewUser byteviewUser2, String str, I18nKeyInfo i18nKeyInfo, I18nKeyInfo i18nKeyInfo2, MsgInfo msgInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.is_recording = bool;
            this.request_participant = byteviewUser;
            this.requester = byteviewUser2;
            this.policy_url = str;
            this.recording_hover = i18nKeyInfo;
            this.recording_stop = i18nKeyInfo2;
            this.recording_stop_v2 = msgInfo;
        }
    }

    public static final class ScreenSharedData extends Message<ScreenSharedData, C50789a> {
        public static final ProtoAdapter<ScreenSharedData> ADAPTER = new C50790b();
        public static final Boolean DEFAULT_ACCESSIBILITY = false;
        public static final BrushType DEFAULT_BRUSH = BrushType.BRUSH_NONE;
        public static final Boolean DEFAULT_CAN_SKETCH = false;
        public static final Integer DEFAULT_HEIGHT = 0;
        public static final Boolean DEFAULT_IS_PORTRAIT_MODE = false;
        public static final Boolean DEFAULT_IS_SHARING = false;
        public static final Boolean DEFAULT_IS_SKETCH = false;
        public static final Boolean DEFAULT_IS_SMOOTH_MODE = false;
        public static final ParticipantType DEFAULT_PARTICIPANT_TYPE = ParticipantType.LARK_USER;
        public static final SketchTransferMode DEFAULT_SKETCH_TRANSFER_MODE = SketchTransferMode.BY_DATA;
        public static final Integer DEFAULT_VERSION = 0;
        public static final Integer DEFAULT_WIDTH = 0;
        private static final long serialVersionUID = 0;
        public final Boolean accessibility;
        public final BrushType brush;
        public final Boolean can_sketch;
        public final Integer height;
        public final Boolean is_portrait_mode;
        public final Boolean is_sharing;
        public final Boolean is_sketch;
        public final Boolean is_smooth_mode;
        public final String participant_device_id;
        public final String participant_id;
        public final ParticipantType participant_type;
        public final RemoteControlData remote_control_data;
        public final String share_screen_id;
        public final SketchTransferMode sketch_transfer_mode;
        public final Integer version;
        public final Integer width;

        public enum BrushType implements WireEnum {
            BRUSH_NONE(0),
            BRUSH_PEN(1);
            
            public static final ProtoAdapter<BrushType> ADAPTER = ProtoAdapter.newEnumAdapter(BrushType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static BrushType fromValue(int i) {
                if (i == 0) {
                    return BRUSH_NONE;
                }
                if (i != 1) {
                    return null;
                }
                return BRUSH_PEN;
            }

            private BrushType(int i) {
                this.value = i;
            }
        }

        public enum SketchTransferMode implements WireEnum {
            BY_DATA(0),
            BY_VIDEO(1);
            
            public static final ProtoAdapter<SketchTransferMode> ADAPTER = ProtoAdapter.newEnumAdapter(SketchTransferMode.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static SketchTransferMode fromValue(int i) {
                if (i == 0) {
                    return BY_DATA;
                }
                if (i != 1) {
                    return null;
                }
                return BY_VIDEO;
            }

            private SketchTransferMode(int i) {
                this.value = i;
            }
        }

        public static final class RemoteControlData extends Message<RemoteControlData, C50787a> {
            public static final ProtoAdapter<RemoteControlData> ADAPTER = new C50788b();
            private static final long serialVersionUID = 0;
            public final ByteviewUser controller;
            public final ControllerSetting controller_setting;
            public final String remote_control_id;

            public static final class ControllerSetting extends Message<ControllerSetting, C50785a> {
                public static final ProtoAdapter<ControllerSetting> ADAPTER = new C50786b();
                public static final Status DEFAULT_STATUS = Status.UNKNOWN;
                public static final Integer DEFAULT_VERSION = 0;
                private static final long serialVersionUID = 0;
                public final Status status;
                public final Integer version;

                public enum Status implements WireEnum {
                    UNKNOWN(0),
                    CONTROLLING(1),
                    PAUSE(2);
                    
                    public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
                    private final int value;

                    @Override // com.squareup.wire.WireEnum
                    public int getValue() {
                        return this.value;
                    }

                    public static Status fromValue(int i) {
                        if (i == 0) {
                            return UNKNOWN;
                        }
                        if (i == 1) {
                            return CONTROLLING;
                        }
                        if (i != 2) {
                            return null;
                        }
                        return PAUSE;
                    }

                    private Status(int i) {
                        this.value = i;
                    }
                }

                /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$RemoteControlData$ControllerSetting$b */
                private static final class C50786b extends ProtoAdapter<ControllerSetting> {
                    C50786b() {
                        super(FieldEncoding.LENGTH_DELIMITED, ControllerSetting.class);
                    }

                    /* renamed from: a */
                    public int encodedSize(ControllerSetting controllerSetting) {
                        int i;
                        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, controllerSetting.version);
                        if (controllerSetting.status != null) {
                            i = Status.ADAPTER.encodedSizeWithTag(2, controllerSetting.status);
                        } else {
                            i = 0;
                        }
                        return encodedSizeWithTag + i + controllerSetting.unknownFields().size();
                    }

                    /* renamed from: a */
                    public ControllerSetting decode(ProtoReader protoReader) throws IOException {
                        C50785a aVar = new C50785a();
                        aVar.f126597a = 0;
                        aVar.f126598b = Status.UNKNOWN;
                        long beginMessage = protoReader.beginMessage();
                        while (true) {
                            int nextTag = protoReader.nextTag();
                            if (nextTag == -1) {
                                protoReader.endMessage(beginMessage);
                                return aVar.build();
                            } else if (nextTag == 1) {
                                aVar.f126597a = ProtoAdapter.INT32.decode(protoReader);
                            } else if (nextTag != 2) {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    aVar.f126598b = Status.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                }
                            }
                        }
                    }

                    /* renamed from: a */
                    public void encode(ProtoWriter protoWriter, ControllerSetting controllerSetting) throws IOException {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, controllerSetting.version);
                        if (controllerSetting.status != null) {
                            Status.ADAPTER.encodeWithTag(protoWriter, 2, controllerSetting.status);
                        }
                        protoWriter.writeBytes(controllerSetting.unknownFields());
                    }
                }

                /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$RemoteControlData$ControllerSetting$a */
                public static final class C50785a extends Message.Builder<ControllerSetting, C50785a> {

                    /* renamed from: a */
                    public Integer f126597a;

                    /* renamed from: b */
                    public Status f126598b;

                    /* renamed from: a */
                    public ControllerSetting build() {
                        Integer num = this.f126597a;
                        if (num != null) {
                            return new ControllerSetting(num, this.f126598b, super.buildUnknownFields());
                        }
                        throw Internal.missingRequiredFields(num, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
                    }
                }

                @Override // com.squareup.wire.Message
                public C50785a newBuilder() {
                    C50785a aVar = new C50785a();
                    aVar.f126597a = this.version;
                    aVar.f126598b = this.status;
                    aVar.addUnknownFields(unknownFields());
                    return aVar;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    C1911a.m8540a("videoconference", "ControllerSetting");
                    StringBuilder sb = new StringBuilder();
                    sb.append(", version=");
                    sb.append(this.version);
                    if (this.status != null) {
                        sb.append(", status=");
                        sb.append(this.status);
                    }
                    StringBuilder replace = sb.replace(0, 2, "ControllerSetting{");
                    replace.append('}');
                    return replace.toString();
                }

                public ControllerSetting(Integer num, Status status2) {
                    this(num, status2, ByteString.EMPTY);
                }

                public ControllerSetting(Integer num, Status status2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    this.version = num;
                    this.status = status2;
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$RemoteControlData$b */
            private static final class C50788b extends ProtoAdapter<RemoteControlData> {
                C50788b() {
                    super(FieldEncoding.LENGTH_DELIMITED, RemoteControlData.class);
                }

                /* renamed from: a */
                public int encodedSize(RemoteControlData remoteControlData) {
                    int i;
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, remoteControlData.remote_control_id);
                    int i2 = 0;
                    if (remoteControlData.controller != null) {
                        i = ByteviewUser.ADAPTER.encodedSizeWithTag(2, remoteControlData.controller);
                    } else {
                        i = 0;
                    }
                    int i3 = encodedSizeWithTag + i;
                    if (remoteControlData.controller_setting != null) {
                        i2 = ControllerSetting.ADAPTER.encodedSizeWithTag(3, remoteControlData.controller_setting);
                    }
                    return i3 + i2 + remoteControlData.unknownFields().size();
                }

                /* renamed from: a */
                public RemoteControlData decode(ProtoReader protoReader) throws IOException {
                    C50787a aVar = new C50787a();
                    aVar.f126599a = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f126599a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f126600b = ByteviewUser.ADAPTER.decode(protoReader);
                        } else if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f126601c = ControllerSetting.ADAPTER.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, RemoteControlData remoteControlData) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, remoteControlData.remote_control_id);
                    if (remoteControlData.controller != null) {
                        ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 2, remoteControlData.controller);
                    }
                    if (remoteControlData.controller_setting != null) {
                        ControllerSetting.ADAPTER.encodeWithTag(protoWriter, 3, remoteControlData.controller_setting);
                    }
                    protoWriter.writeBytes(remoteControlData.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50787a newBuilder() {
                C50787a aVar = new C50787a();
                aVar.f126599a = this.remote_control_id;
                aVar.f126600b = this.controller;
                aVar.f126601c = this.controller_setting;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$RemoteControlData$a */
            public static final class C50787a extends Message.Builder<RemoteControlData, C50787a> {

                /* renamed from: a */
                public String f126599a;

                /* renamed from: b */
                public ByteviewUser f126600b;

                /* renamed from: c */
                public ControllerSetting f126601c;

                /* renamed from: a */
                public RemoteControlData build() {
                    String str = this.f126599a;
                    if (str != null) {
                        return new RemoteControlData(str, this.f126600b, this.f126601c, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str, "remote_control_id");
                }
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "RemoteControlData");
                StringBuilder sb = new StringBuilder();
                sb.append(", remote_control_id=");
                sb.append(this.remote_control_id);
                if (this.controller != null) {
                    sb.append(", controller=");
                    sb.append(this.controller);
                }
                if (this.controller_setting != null) {
                    sb.append(", controller_setting=");
                    sb.append(this.controller_setting);
                }
                StringBuilder replace = sb.replace(0, 2, "RemoteControlData{");
                replace.append('}');
                return replace.toString();
            }

            public RemoteControlData(String str, ByteviewUser byteviewUser, ControllerSetting controllerSetting) {
                this(str, byteviewUser, controllerSetting, ByteString.EMPTY);
            }

            public RemoteControlData(String str, ByteviewUser byteviewUser, ControllerSetting controllerSetting, ByteString byteString) {
                super(ADAPTER, byteString);
                this.remote_control_id = str;
                this.controller = byteviewUser;
                this.controller_setting = controllerSetting;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$b */
        private static final class C50790b extends ProtoAdapter<ScreenSharedData> {
            C50790b() {
                super(FieldEncoding.LENGTH_DELIMITED, ScreenSharedData.class);
            }

            /* renamed from: a */
            public int encodedSize(ScreenSharedData screenSharedData) {
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
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, screenSharedData.participant_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, screenSharedData.is_sharing);
                int i14 = 0;
                if (screenSharedData.participant_type != null) {
                    i = ParticipantType.ADAPTER.encodedSizeWithTag(3, screenSharedData.participant_type);
                } else {
                    i = 0;
                }
                int i15 = encodedSizeWithTag + i;
                if (screenSharedData.participant_device_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, screenSharedData.participant_device_id);
                } else {
                    i2 = 0;
                }
                int i16 = i15 + i2;
                if (screenSharedData.width != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, screenSharedData.width);
                } else {
                    i3 = 0;
                }
                int i17 = i16 + i3;
                if (screenSharedData.height != null) {
                    i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, screenSharedData.height);
                } else {
                    i4 = 0;
                }
                int i18 = i17 + i4;
                if (screenSharedData.share_screen_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, screenSharedData.share_screen_id);
                } else {
                    i5 = 0;
                }
                int i19 = i18 + i5;
                if (screenSharedData.is_sketch != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(8, screenSharedData.is_sketch);
                } else {
                    i6 = 0;
                }
                int i20 = i19 + i6;
                if (screenSharedData.can_sketch != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, screenSharedData.can_sketch);
                } else {
                    i7 = 0;
                }
                int i21 = i20 + i7;
                if (screenSharedData.version != null) {
                    i8 = ProtoAdapter.INT32.encodedSizeWithTag(10, screenSharedData.version);
                } else {
                    i8 = 0;
                }
                int i22 = i21 + i8;
                if (screenSharedData.accessibility != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(11, screenSharedData.accessibility);
                } else {
                    i9 = 0;
                }
                int i23 = i22 + i9;
                if (screenSharedData.remote_control_data != null) {
                    i10 = RemoteControlData.ADAPTER.encodedSizeWithTag(12, screenSharedData.remote_control_data);
                } else {
                    i10 = 0;
                }
                int i24 = i23 + i10;
                if (screenSharedData.brush != null) {
                    i11 = BrushType.ADAPTER.encodedSizeWithTag(13, screenSharedData.brush);
                } else {
                    i11 = 0;
                }
                int i25 = i24 + i11;
                if (screenSharedData.is_smooth_mode != null) {
                    i12 = ProtoAdapter.BOOL.encodedSizeWithTag(14, screenSharedData.is_smooth_mode);
                } else {
                    i12 = 0;
                }
                int i26 = i25 + i12;
                if (screenSharedData.is_portrait_mode != null) {
                    i13 = ProtoAdapter.BOOL.encodedSizeWithTag(15, screenSharedData.is_portrait_mode);
                } else {
                    i13 = 0;
                }
                int i27 = i26 + i13;
                if (screenSharedData.sketch_transfer_mode != null) {
                    i14 = SketchTransferMode.ADAPTER.encodedSizeWithTag(16, screenSharedData.sketch_transfer_mode);
                }
                return i27 + i14 + screenSharedData.unknownFields().size();
            }

            /* renamed from: a */
            public ScreenSharedData decode(ProtoReader protoReader) throws IOException {
                C50789a aVar = new C50789a();
                aVar.f126602a = "";
                aVar.f126603b = false;
                aVar.f126604c = ParticipantType.LARK_USER;
                aVar.f126605d = "";
                aVar.f126606e = 0;
                aVar.f126607f = 0;
                aVar.f126608g = "";
                aVar.f126609h = false;
                aVar.f126610i = false;
                aVar.f126611j = 0;
                aVar.f126612k = false;
                aVar.f126614m = BrushType.BRUSH_NONE;
                aVar.f126615n = false;
                aVar.f126616o = false;
                aVar.f126617p = SketchTransferMode.BY_DATA;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f126602a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f126603b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                try {
                                    aVar.f126604c = ParticipantType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 4:
                                aVar.f126605d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126606e = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126607f = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126608g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f126609h = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 9:
                                aVar.f126610i = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 10:
                                aVar.f126611j = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 11:
                                aVar.f126612k = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                aVar.f126613l = RemoteControlData.ADAPTER.decode(protoReader);
                                break;
                            case 13:
                                try {
                                    aVar.f126614m = BrushType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                    break;
                                }
                            case 14:
                                aVar.f126615n = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 15:
                                aVar.f126616o = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 16:
                                try {
                                    aVar.f126617p = SketchTransferMode.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
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
            public void encode(ProtoWriter protoWriter, ScreenSharedData screenSharedData) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, screenSharedData.participant_id);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, screenSharedData.is_sharing);
                if (screenSharedData.participant_type != null) {
                    ParticipantType.ADAPTER.encodeWithTag(protoWriter, 3, screenSharedData.participant_type);
                }
                if (screenSharedData.participant_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, screenSharedData.participant_device_id);
                }
                if (screenSharedData.width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, screenSharedData.width);
                }
                if (screenSharedData.height != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, screenSharedData.height);
                }
                if (screenSharedData.share_screen_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, screenSharedData.share_screen_id);
                }
                if (screenSharedData.is_sketch != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, screenSharedData.is_sketch);
                }
                if (screenSharedData.can_sketch != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, screenSharedData.can_sketch);
                }
                if (screenSharedData.version != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, screenSharedData.version);
                }
                if (screenSharedData.accessibility != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, screenSharedData.accessibility);
                }
                if (screenSharedData.remote_control_data != null) {
                    RemoteControlData.ADAPTER.encodeWithTag(protoWriter, 12, screenSharedData.remote_control_data);
                }
                if (screenSharedData.brush != null) {
                    BrushType.ADAPTER.encodeWithTag(protoWriter, 13, screenSharedData.brush);
                }
                if (screenSharedData.is_smooth_mode != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, screenSharedData.is_smooth_mode);
                }
                if (screenSharedData.is_portrait_mode != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, screenSharedData.is_portrait_mode);
                }
                if (screenSharedData.sketch_transfer_mode != null) {
                    SketchTransferMode.ADAPTER.encodeWithTag(protoWriter, 16, screenSharedData.sketch_transfer_mode);
                }
                protoWriter.writeBytes(screenSharedData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$a */
        public static final class C50789a extends Message.Builder<ScreenSharedData, C50789a> {

            /* renamed from: a */
            public String f126602a;

            /* renamed from: b */
            public Boolean f126603b;

            /* renamed from: c */
            public ParticipantType f126604c;

            /* renamed from: d */
            public String f126605d;

            /* renamed from: e */
            public Integer f126606e;

            /* renamed from: f */
            public Integer f126607f;

            /* renamed from: g */
            public String f126608g;

            /* renamed from: h */
            public Boolean f126609h;

            /* renamed from: i */
            public Boolean f126610i;

            /* renamed from: j */
            public Integer f126611j;

            /* renamed from: k */
            public Boolean f126612k;

            /* renamed from: l */
            public RemoteControlData f126613l;

            /* renamed from: m */
            public BrushType f126614m;

            /* renamed from: n */
            public Boolean f126615n;

            /* renamed from: o */
            public Boolean f126616o;

            /* renamed from: p */
            public SketchTransferMode f126617p;

            /* renamed from: a */
            public ScreenSharedData build() {
                Boolean bool;
                String str = this.f126602a;
                if (str != null && (bool = this.f126603b) != null) {
                    return new ScreenSharedData(str, bool, this.f126604c, this.f126605d, this.f126606e, this.f126607f, this.f126608g, this.f126609h, this.f126610i, this.f126611j, this.f126612k, this.f126613l, this.f126614m, this.f126615n, this.f126616o, this.f126617p, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "participant_id", this.f126603b, "is_sharing");
            }
        }

        @Override // com.squareup.wire.Message
        public C50789a newBuilder() {
            C50789a aVar = new C50789a();
            aVar.f126602a = this.participant_id;
            aVar.f126603b = this.is_sharing;
            aVar.f126604c = this.participant_type;
            aVar.f126605d = this.participant_device_id;
            aVar.f126606e = this.width;
            aVar.f126607f = this.height;
            aVar.f126608g = this.share_screen_id;
            aVar.f126609h = this.is_sketch;
            aVar.f126610i = this.can_sketch;
            aVar.f126611j = this.version;
            aVar.f126612k = this.accessibility;
            aVar.f126613l = this.remote_control_data;
            aVar.f126614m = this.brush;
            aVar.f126615n = this.is_smooth_mode;
            aVar.f126616o = this.is_portrait_mode;
            aVar.f126617p = this.sketch_transfer_mode;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ScreenSharedData");
            StringBuilder sb = new StringBuilder();
            sb.append(", participant_id=");
            sb.append(this.participant_id);
            sb.append(", is_sharing=");
            sb.append(this.is_sharing);
            if (this.participant_type != null) {
                sb.append(", participant_type=");
                sb.append(this.participant_type);
            }
            if (this.participant_device_id != null) {
                sb.append(", participant_device_id=");
                sb.append(this.participant_device_id);
            }
            if (this.width != null) {
                sb.append(", width=");
                sb.append(this.width);
            }
            if (this.height != null) {
                sb.append(", height=");
                sb.append(this.height);
            }
            if (this.share_screen_id != null) {
                sb.append(", share_screen_id=");
                sb.append(this.share_screen_id);
            }
            if (this.is_sketch != null) {
                sb.append(", is_sketch=");
                sb.append(this.is_sketch);
            }
            if (this.can_sketch != null) {
                sb.append(", can_sketch=");
                sb.append(this.can_sketch);
            }
            if (this.version != null) {
                sb.append(", version=");
                sb.append(this.version);
            }
            if (this.accessibility != null) {
                sb.append(", accessibility=");
                sb.append(this.accessibility);
            }
            if (this.remote_control_data != null) {
                sb.append(", remote_control_data=");
                sb.append(this.remote_control_data);
            }
            if (this.brush != null) {
                sb.append(", brush=");
                sb.append(this.brush);
            }
            if (this.is_smooth_mode != null) {
                sb.append(", is_smooth_mode=");
                sb.append(this.is_smooth_mode);
            }
            if (this.is_portrait_mode != null) {
                sb.append(", is_portrait_mode=");
                sb.append(this.is_portrait_mode);
            }
            if (this.sketch_transfer_mode != null) {
                sb.append(", sketch_transfer_mode=");
                sb.append(this.sketch_transfer_mode);
            }
            StringBuilder replace = sb.replace(0, 2, "ScreenSharedData{");
            replace.append('}');
            return replace.toString();
        }

        public ScreenSharedData(String str, Boolean bool, ParticipantType participantType, String str2, Integer num, Integer num2, String str3, Boolean bool2, Boolean bool3, Integer num3, Boolean bool4, RemoteControlData remoteControlData, BrushType brushType, Boolean bool5, Boolean bool6, SketchTransferMode sketchTransferMode) {
            this(str, bool, participantType, str2, num, num2, str3, bool2, bool3, num3, bool4, remoteControlData, brushType, bool5, bool6, sketchTransferMode, ByteString.EMPTY);
        }

        public ScreenSharedData(String str, Boolean bool, ParticipantType participantType, String str2, Integer num, Integer num2, String str3, Boolean bool2, Boolean bool3, Integer num3, Boolean bool4, RemoteControlData remoteControlData, BrushType brushType, Boolean bool5, Boolean bool6, SketchTransferMode sketchTransferMode, ByteString byteString) {
            super(ADAPTER, byteString);
            this.participant_id = str;
            this.is_sharing = bool;
            this.participant_type = participantType;
            this.participant_device_id = str2;
            this.width = num;
            this.height = num2;
            this.share_screen_id = str3;
            this.is_sketch = bool2;
            this.can_sketch = bool3;
            this.version = num3;
            this.accessibility = bool4;
            this.remote_control_data = remoteControlData;
            this.brush = brushType;
            this.is_smooth_mode = bool5;
            this.is_portrait_mode = bool6;
            this.sketch_transfer_mode = sketchTransferMode;
        }
    }

    public static final class SubtitleStatusData extends Message<SubtitleStatusData, C50795a> {
        public static final ProtoAdapter<SubtitleStatusData> ADAPTER = new C50796b();
        public static final Boolean DEFAULT_IS_SUBTITLE_ON = false;
        public static final Status DEFAULT_STATUS = Status.STATUS_UNKNOWN;
        private static final long serialVersionUID = 0;
        public final ByteviewUser first_one_open_subtitle;
        public final String global_spoken_language;
        public final Boolean is_subtitle_on;
        public final LangDetectInfo lang_detect_info;
        public final Status status;

        public static final class LangDetectInfo extends Message<LangDetectInfo, C50793a> {
            public static final ProtoAdapter<LangDetectInfo> ADAPTER = new C50794b();
            public static final Type DEFAULT_TYPE = Type.UNKNOWN;
            private static final long serialVersionUID = 0;
            public final String detected_language;
            public final String detected_language_key;
            public final String language;
            public final String language_key;
            public final Type type;

            public enum Type implements WireEnum {
                UNKNOWN(0),
                MISMATCH(1),
                UNSUPPORTED(2);
                
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
                        return MISMATCH;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return UNSUPPORTED;
                }

                private Type(int i) {
                    this.value = i;
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$SubtitleStatusData$LangDetectInfo$b */
            private static final class C50794b extends ProtoAdapter<LangDetectInfo> {
                C50794b() {
                    super(FieldEncoding.LENGTH_DELIMITED, LangDetectInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(LangDetectInfo langDetectInfo) {
                    int i;
                    int i2;
                    int i3;
                    int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, langDetectInfo.type);
                    int i4 = 0;
                    if (langDetectInfo.detected_language != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(2, langDetectInfo.detected_language);
                    } else {
                        i = 0;
                    }
                    int i5 = encodedSizeWithTag + i;
                    if (langDetectInfo.detected_language_key != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, langDetectInfo.detected_language_key);
                    } else {
                        i2 = 0;
                    }
                    int i6 = i5 + i2;
                    if (langDetectInfo.language != null) {
                        i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, langDetectInfo.language);
                    } else {
                        i3 = 0;
                    }
                    int i7 = i6 + i3;
                    if (langDetectInfo.language_key != null) {
                        i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, langDetectInfo.language_key);
                    }
                    return i7 + i4 + langDetectInfo.unknownFields().size();
                }

                /* renamed from: a */
                public LangDetectInfo decode(ProtoReader protoReader) throws IOException {
                    C50793a aVar = new C50793a();
                    aVar.f126619a = Type.UNKNOWN;
                    aVar.f126620b = "";
                    aVar.f126621c = "";
                    aVar.f126622d = "";
                    aVar.f126623e = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            try {
                                aVar.f126619a = Type.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        } else if (nextTag == 2) {
                            aVar.f126620b = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 3) {
                            aVar.f126621c = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 4) {
                            aVar.f126622d = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 5) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f126623e = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, LangDetectInfo langDetectInfo) throws IOException {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, langDetectInfo.type);
                    if (langDetectInfo.detected_language != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, langDetectInfo.detected_language);
                    }
                    if (langDetectInfo.detected_language_key != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, langDetectInfo.detected_language_key);
                    }
                    if (langDetectInfo.language != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, langDetectInfo.language);
                    }
                    if (langDetectInfo.language_key != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, langDetectInfo.language_key);
                    }
                    protoWriter.writeBytes(langDetectInfo.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$SubtitleStatusData$LangDetectInfo$a */
            public static final class C50793a extends Message.Builder<LangDetectInfo, C50793a> {

                /* renamed from: a */
                public Type f126619a;

                /* renamed from: b */
                public String f126620b;

                /* renamed from: c */
                public String f126621c;

                /* renamed from: d */
                public String f126622d;

                /* renamed from: e */
                public String f126623e;

                /* renamed from: a */
                public LangDetectInfo build() {
                    Type type = this.f126619a;
                    if (type != null) {
                        return new LangDetectInfo(type, this.f126620b, this.f126621c, this.f126622d, this.f126623e, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
                }
            }

            @Override // com.squareup.wire.Message
            public C50793a newBuilder() {
                C50793a aVar = new C50793a();
                aVar.f126619a = this.type;
                aVar.f126620b = this.detected_language;
                aVar.f126621c = this.detected_language_key;
                aVar.f126622d = this.language;
                aVar.f126623e = this.language_key;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "LangDetectInfo");
                StringBuilder sb = new StringBuilder();
                sb.append(", type=");
                sb.append(this.type);
                if (this.detected_language != null) {
                    sb.append(", detected_language=");
                    sb.append(this.detected_language);
                }
                if (this.detected_language_key != null) {
                    sb.append(", detected_language_key=");
                    sb.append(this.detected_language_key);
                }
                if (this.language != null) {
                    sb.append(", language=");
                    sb.append(this.language);
                }
                if (this.language_key != null) {
                    sb.append(", language_key=");
                    sb.append(this.language_key);
                }
                StringBuilder replace = sb.replace(0, 2, "LangDetectInfo{");
                replace.append('}');
                return replace.toString();
            }

            public LangDetectInfo(Type type2, String str, String str2, String str3, String str4) {
                this(type2, str, str2, str3, str4, ByteString.EMPTY);
            }

            public LangDetectInfo(Type type2, String str, String str2, String str3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                this.type = type2;
                this.detected_language = str;
                this.detected_language_key = str2;
                this.language = str3;
                this.language_key = str4;
            }
        }

        public enum Status implements WireEnum {
            STATUS_UNKNOWN(0),
            OPEN_SUCCESS(1),
            OPEN_FAILED(2),
            EXCEPTION(3),
            RECOVERABLE_EXCEPTION(4),
            RECOVER_SUCCESS(5),
            LANG_DETECTED(6),
            FIRST_OPEN(7),
            MEETING_SUBTITLE_STATUS_CHANGE(8),
            APPLY_GLOBAL_SPOKEN_LANGUAGE(9);
            
            public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Status fromValue(int i) {
                switch (i) {
                    case 0:
                        return STATUS_UNKNOWN;
                    case 1:
                        return OPEN_SUCCESS;
                    case 2:
                        return OPEN_FAILED;
                    case 3:
                        return EXCEPTION;
                    case 4:
                        return RECOVERABLE_EXCEPTION;
                    case 5:
                        return RECOVER_SUCCESS;
                    case 6:
                        return LANG_DETECTED;
                    case 7:
                        return FIRST_OPEN;
                    case 8:
                        return MEETING_SUBTITLE_STATUS_CHANGE;
                    case 9:
                        return APPLY_GLOBAL_SPOKEN_LANGUAGE;
                    default:
                        return null;
                }
            }

            private Status(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$SubtitleStatusData$b */
        private static final class C50796b extends ProtoAdapter<SubtitleStatusData> {
            C50796b() {
                super(FieldEncoding.LENGTH_DELIMITED, SubtitleStatusData.class);
            }

            /* renamed from: a */
            public int encodedSize(SubtitleStatusData subtitleStatusData) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = Status.ADAPTER.encodedSizeWithTag(1, subtitleStatusData.status);
                int i4 = 0;
                if (subtitleStatusData.lang_detect_info != null) {
                    i = LangDetectInfo.ADAPTER.encodedSizeWithTag(2, subtitleStatusData.lang_detect_info);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (subtitleStatusData.first_one_open_subtitle != null) {
                    i2 = ByteviewUser.ADAPTER.encodedSizeWithTag(3, subtitleStatusData.first_one_open_subtitle);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (subtitleStatusData.is_subtitle_on != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, subtitleStatusData.is_subtitle_on);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (subtitleStatusData.global_spoken_language != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, subtitleStatusData.global_spoken_language);
                }
                return i7 + i4 + subtitleStatusData.unknownFields().size();
            }

            /* renamed from: a */
            public SubtitleStatusData decode(ProtoReader protoReader) throws IOException {
                C50795a aVar = new C50795a();
                aVar.f126624a = Status.STATUS_UNKNOWN;
                aVar.f126627d = false;
                aVar.f126628e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f126624a = Status.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f126625b = LangDetectInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126626c = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f126627d = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126628e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SubtitleStatusData subtitleStatusData) throws IOException {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, subtitleStatusData.status);
                if (subtitleStatusData.lang_detect_info != null) {
                    LangDetectInfo.ADAPTER.encodeWithTag(protoWriter, 2, subtitleStatusData.lang_detect_info);
                }
                if (subtitleStatusData.first_one_open_subtitle != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 3, subtitleStatusData.first_one_open_subtitle);
                }
                if (subtitleStatusData.is_subtitle_on != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, subtitleStatusData.is_subtitle_on);
                }
                if (subtitleStatusData.global_spoken_language != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, subtitleStatusData.global_spoken_language);
                }
                protoWriter.writeBytes(subtitleStatusData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$SubtitleStatusData$a */
        public static final class C50795a extends Message.Builder<SubtitleStatusData, C50795a> {

            /* renamed from: a */
            public Status f126624a;

            /* renamed from: b */
            public LangDetectInfo f126625b;

            /* renamed from: c */
            public ByteviewUser f126626c;

            /* renamed from: d */
            public Boolean f126627d;

            /* renamed from: e */
            public String f126628e;

            /* renamed from: a */
            public SubtitleStatusData build() {
                Status status = this.f126624a;
                if (status != null) {
                    return new SubtitleStatusData(status, this.f126625b, this.f126626c, this.f126627d, this.f126628e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(status, UpdateKey.STATUS);
            }
        }

        @Override // com.squareup.wire.Message
        public C50795a newBuilder() {
            C50795a aVar = new C50795a();
            aVar.f126624a = this.status;
            aVar.f126625b = this.lang_detect_info;
            aVar.f126626c = this.first_one_open_subtitle;
            aVar.f126627d = this.is_subtitle_on;
            aVar.f126628e = this.global_spoken_language;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SubtitleStatusData");
            StringBuilder sb = new StringBuilder();
            sb.append(", status=");
            sb.append(this.status);
            if (this.lang_detect_info != null) {
                sb.append(", lang_detect_info=");
                sb.append(this.lang_detect_info);
            }
            if (this.first_one_open_subtitle != null) {
                sb.append(", first_one_open_subtitle=");
                sb.append(this.first_one_open_subtitle);
            }
            if (this.is_subtitle_on != null) {
                sb.append(", is_subtitle_on=");
                sb.append(this.is_subtitle_on);
            }
            if (this.global_spoken_language != null) {
                sb.append(", global_spoken_language=");
                sb.append(this.global_spoken_language);
            }
            StringBuilder replace = sb.replace(0, 2, "SubtitleStatusData{");
            replace.append('}');
            return replace.toString();
        }

        public SubtitleStatusData(Status status2, LangDetectInfo langDetectInfo, ByteviewUser byteviewUser, Boolean bool, String str) {
            this(status2, langDetectInfo, byteviewUser, bool, str, ByteString.EMPTY);
        }

        public SubtitleStatusData(Status status2, LangDetectInfo langDetectInfo, ByteviewUser byteviewUser, Boolean bool, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.status = status2;
            this.lang_detect_info = langDetectInfo;
            this.first_one_open_subtitle = byteviewUser;
            this.is_subtitle_on = bool;
            this.global_spoken_language = str;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        SETTINGS_CHANGED(1),
        PARTICIPANTS_CHANGED(2),
        HOST_TRANSFERRED(3),
        ALL_MICROPHONE_MUTED(4),
        SCREEN_SHARED(5),
        UNMUTE_CAMERA_CONFIRMED(6),
        UPGRADE_MEETING(7),
        FOLLOW_CHANGED(8),
        FOLLOW_ACTION_CHANGED(9),
        UNMUTE_MICROPHONE_CONFIRMED(10),
        RECORD_MEETING(11),
        REQUEST_FOLLOW_TOKEN(12),
        GRANT_FOLLOW_TOKEN(13),
        SUBTITLE_STATUS_CONFIRMED(14),
        APPLY_REMOTE_CONTROL(15),
        LIVE_MEETING(16),
        APPLY_BYTEVIEW_ACCESSIBILITY(17),
        WHITEBOARD(18),
        SUBTITLE_STATUS_CHANGE(20),
        UI_FEATURE_CONFIG(22),
        SHARE_ALPHA_COLOR(23),
        INTERVIEW_CODING(24),
        MINUTES_STATUS(25),
        HOST_MUTE_MIC(101),
        HOST_MUTE_CAMERA(102),
        SECURITY_LEVEL_FASTEN(103),
        SECURITY_LEVEL_UNFASTEN(104);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 20) {
                return SUBTITLE_STATUS_CHANGE;
            }
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return SETTINGS_CHANGED;
                case 2:
                    return PARTICIPANTS_CHANGED;
                case 3:
                    return HOST_TRANSFERRED;
                case 4:
                    return ALL_MICROPHONE_MUTED;
                case 5:
                    return SCREEN_SHARED;
                case 6:
                    return UNMUTE_CAMERA_CONFIRMED;
                case 7:
                    return UPGRADE_MEETING;
                case 8:
                    return FOLLOW_CHANGED;
                case 9:
                    return FOLLOW_ACTION_CHANGED;
                case 10:
                    return UNMUTE_MICROPHONE_CONFIRMED;
                case 11:
                    return RECORD_MEETING;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return REQUEST_FOLLOW_TOKEN;
                case 13:
                    return GRANT_FOLLOW_TOKEN;
                case 14:
                    return SUBTITLE_STATUS_CONFIRMED;
                case 15:
                    return APPLY_REMOTE_CONTROL;
                case 16:
                    return LIVE_MEETING;
                case 17:
                    return APPLY_BYTEVIEW_ACCESSIBILITY;
                case 18:
                    return WHITEBOARD;
                default:
                    switch (i) {
                        case 22:
                            return UI_FEATURE_CONFIG;
                        case 23:
                            return SHARE_ALPHA_COLOR;
                        case 24:
                            return INTERVIEW_CODING;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            return MINUTES_STATUS;
                        default:
                            switch (i) {
                                case 101:
                                    return HOST_MUTE_MIC;
                                case 102:
                                    return HOST_MUTE_CAMERA;
                                case 103:
                                    return SECURITY_LEVEL_FASTEN;
                                case 104:
                                    return SECURITY_LEVEL_UNFASTEN;
                                default:
                                    return null;
                            }
                    }
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class FollowData extends Message<FollowData, C50769a> {
        public static final ProtoAdapter<FollowData> ADAPTER = new C50770b();
        private static final long serialVersionUID = 0;
        public final List<FollowAction> follow_actions;
        public final FollowInfo follow_info;
        public final FollowPresenterChanged presenter_changed;
        public final ByteviewUser token_granter;
        public final ByteviewUser token_requester;

        public static final class FollowPresenterChanged extends Message<FollowPresenterChanged, C50767a> {
            public static final ProtoAdapter<FollowPresenterChanged> ADAPTER = new C50768b();
            private static final long serialVersionUID = 0;
            public final ByteviewUser Current;
            public final ByteviewUser origin;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$FollowData$FollowPresenterChanged$b */
            private static final class C50768b extends ProtoAdapter<FollowPresenterChanged> {
                C50768b() {
                    super(FieldEncoding.LENGTH_DELIMITED, FollowPresenterChanged.class);
                }

                /* renamed from: a */
                public int encodedSize(FollowPresenterChanged followPresenterChanged) {
                    int i;
                    int i2 = 0;
                    if (followPresenterChanged.origin != null) {
                        i = ByteviewUser.ADAPTER.encodedSizeWithTag(1, followPresenterChanged.origin);
                    } else {
                        i = 0;
                    }
                    if (followPresenterChanged.Current != null) {
                        i2 = ByteviewUser.ADAPTER.encodedSizeWithTag(2, followPresenterChanged.Current);
                    }
                    return i + i2 + followPresenterChanged.unknownFields().size();
                }

                /* renamed from: a */
                public FollowPresenterChanged decode(ProtoReader protoReader) throws IOException {
                    C50767a aVar = new C50767a();
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f126552a = ByteviewUser.ADAPTER.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f126553b = ByteviewUser.ADAPTER.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, FollowPresenterChanged followPresenterChanged) throws IOException {
                    if (followPresenterChanged.origin != null) {
                        ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, followPresenterChanged.origin);
                    }
                    if (followPresenterChanged.Current != null) {
                        ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 2, followPresenterChanged.Current);
                    }
                    protoWriter.writeBytes(followPresenterChanged.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$FollowData$FollowPresenterChanged$a */
            public static final class C50767a extends Message.Builder<FollowPresenterChanged, C50767a> {

                /* renamed from: a */
                public ByteviewUser f126552a;

                /* renamed from: b */
                public ByteviewUser f126553b;

                /* renamed from: a */
                public FollowPresenterChanged build() {
                    return new FollowPresenterChanged(this.f126552a, this.f126553b, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50767a newBuilder() {
                C50767a aVar = new C50767a();
                aVar.f126552a = this.origin;
                aVar.f126553b = this.Current;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "FollowPresenterChanged");
                StringBuilder sb = new StringBuilder();
                if (this.origin != null) {
                    sb.append(", origin=");
                    sb.append(this.origin);
                }
                if (this.Current != null) {
                    sb.append(", Current=");
                    sb.append(this.Current);
                }
                StringBuilder replace = sb.replace(0, 2, "FollowPresenterChanged{");
                replace.append('}');
                return replace.toString();
            }

            public FollowPresenterChanged(ByteviewUser byteviewUser, ByteviewUser byteviewUser2) {
                this(byteviewUser, byteviewUser2, ByteString.EMPTY);
            }

            public FollowPresenterChanged(ByteviewUser byteviewUser, ByteviewUser byteviewUser2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.origin = byteviewUser;
                this.Current = byteviewUser2;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$FollowData$b */
        private static final class C50770b extends ProtoAdapter<FollowData> {
            C50770b() {
                super(FieldEncoding.LENGTH_DELIMITED, FollowData.class);
            }

            /* renamed from: a */
            public int encodedSize(FollowData followData) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (followData.follow_info != null) {
                    i = FollowInfo.ADAPTER.encodedSizeWithTag(1, followData.follow_info);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + FollowAction.ADAPTER.asRepeated().encodedSizeWithTag(2, followData.follow_actions);
                if (followData.token_requester != null) {
                    i2 = ByteviewUser.ADAPTER.encodedSizeWithTag(3, followData.token_requester);
                } else {
                    i2 = 0;
                }
                int i5 = encodedSizeWithTag + i2;
                if (followData.token_granter != null) {
                    i3 = ByteviewUser.ADAPTER.encodedSizeWithTag(4, followData.token_granter);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (followData.presenter_changed != null) {
                    i4 = FollowPresenterChanged.ADAPTER.encodedSizeWithTag(101, followData.presenter_changed);
                }
                return i6 + i4 + followData.unknownFields().size();
            }

            /* renamed from: a */
            public FollowData decode(ProtoReader protoReader) throws IOException {
                C50769a aVar = new C50769a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126554a = FollowInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126555b.add(FollowAction.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.f126556c = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f126557d = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag != 101) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126558e = FollowPresenterChanged.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FollowData followData) throws IOException {
                if (followData.follow_info != null) {
                    FollowInfo.ADAPTER.encodeWithTag(protoWriter, 1, followData.follow_info);
                }
                FollowAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, followData.follow_actions);
                if (followData.token_requester != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 3, followData.token_requester);
                }
                if (followData.token_granter != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 4, followData.token_granter);
                }
                if (followData.presenter_changed != null) {
                    FollowPresenterChanged.ADAPTER.encodeWithTag(protoWriter, 101, followData.presenter_changed);
                }
                protoWriter.writeBytes(followData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$FollowData$a */
        public static final class C50769a extends Message.Builder<FollowData, C50769a> {

            /* renamed from: a */
            public FollowInfo f126554a;

            /* renamed from: b */
            public List<FollowAction> f126555b = Internal.newMutableList();

            /* renamed from: c */
            public ByteviewUser f126556c;

            /* renamed from: d */
            public ByteviewUser f126557d;

            /* renamed from: e */
            public FollowPresenterChanged f126558e;

            /* renamed from: a */
            public FollowData build() {
                return new FollowData(this.f126554a, this.f126555b, this.f126556c, this.f126557d, this.f126558e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50769a newBuilder() {
            C50769a aVar = new C50769a();
            aVar.f126554a = this.follow_info;
            aVar.f126555b = Internal.copyOf("follow_actions", this.follow_actions);
            aVar.f126556c = this.token_requester;
            aVar.f126557d = this.token_granter;
            aVar.f126558e = this.presenter_changed;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "FollowData");
            StringBuilder sb = new StringBuilder();
            if (this.follow_info != null) {
                sb.append(", follow_info=");
                sb.append(this.follow_info);
            }
            if (!this.follow_actions.isEmpty()) {
                sb.append(", follow_actions=");
                sb.append(this.follow_actions);
            }
            if (this.token_requester != null) {
                sb.append(", token_requester=");
                sb.append(this.token_requester);
            }
            if (this.token_granter != null) {
                sb.append(", token_granter=");
                sb.append(this.token_granter);
            }
            if (this.presenter_changed != null) {
                sb.append(", presenter_changed=");
                sb.append(this.presenter_changed);
            }
            StringBuilder replace = sb.replace(0, 2, "FollowData{");
            replace.append('}');
            return replace.toString();
        }

        public FollowData(FollowInfo followInfo, List<FollowAction> list, ByteviewUser byteviewUser, ByteviewUser byteviewUser2, FollowPresenterChanged followPresenterChanged) {
            this(followInfo, list, byteviewUser, byteviewUser2, followPresenterChanged, ByteString.EMPTY);
        }

        public FollowData(FollowInfo followInfo, List<FollowAction> list, ByteviewUser byteviewUser, ByteviewUser byteviewUser2, FollowPresenterChanged followPresenterChanged, ByteString byteString) {
            super(ADAPTER, byteString);
            this.follow_info = followInfo;
            this.follow_actions = Internal.immutableCopyOf("follow_actions", list);
            this.token_requester = byteviewUser;
            this.token_granter = byteviewUser2;
            this.presenter_changed = followPresenterChanged;
        }
    }

    public static final class AllMicrophoneMutedData extends Message<AllMicrophoneMutedData, C50759a> {
        public static final ProtoAdapter<AllMicrophoneMutedData> ADAPTER = new C50760b();
        public static final Boolean DEFAULT_IS_MUTED = false;
        private static final long serialVersionUID = 0;
        public final String breakout_room_id;
        public final Boolean is_muted;
        public final ByteviewUser operation_user;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$AllMicrophoneMutedData$b */
        private static final class C50760b extends ProtoAdapter<AllMicrophoneMutedData> {
            C50760b() {
                super(FieldEncoding.LENGTH_DELIMITED, AllMicrophoneMutedData.class);
            }

            /* renamed from: a */
            public int encodedSize(AllMicrophoneMutedData allMicrophoneMutedData) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, allMicrophoneMutedData.is_muted);
                int i2 = 0;
                if (allMicrophoneMutedData.operation_user != null) {
                    i = ByteviewUser.ADAPTER.encodedSizeWithTag(2, allMicrophoneMutedData.operation_user);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (allMicrophoneMutedData.breakout_room_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, allMicrophoneMutedData.breakout_room_id);
                }
                return i3 + i2 + allMicrophoneMutedData.unknownFields().size();
            }

            /* renamed from: a */
            public AllMicrophoneMutedData decode(ProtoReader protoReader) throws IOException {
                C50759a aVar = new C50759a();
                aVar.f126543a = false;
                aVar.f126545c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126543a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126544b = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126545c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AllMicrophoneMutedData allMicrophoneMutedData) throws IOException {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, allMicrophoneMutedData.is_muted);
                if (allMicrophoneMutedData.operation_user != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 2, allMicrophoneMutedData.operation_user);
                }
                if (allMicrophoneMutedData.breakout_room_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, allMicrophoneMutedData.breakout_room_id);
                }
                protoWriter.writeBytes(allMicrophoneMutedData.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50759a newBuilder() {
            C50759a aVar = new C50759a();
            aVar.f126543a = this.is_muted;
            aVar.f126544b = this.operation_user;
            aVar.f126545c = this.breakout_room_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$AllMicrophoneMutedData$a */
        public static final class C50759a extends Message.Builder<AllMicrophoneMutedData, C50759a> {

            /* renamed from: a */
            public Boolean f126543a;

            /* renamed from: b */
            public ByteviewUser f126544b;

            /* renamed from: c */
            public String f126545c;

            /* renamed from: a */
            public AllMicrophoneMutedData build() {
                Boolean bool = this.f126543a;
                if (bool != null) {
                    return new AllMicrophoneMutedData(bool, this.f126544b, this.f126545c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(bool, "is_muted");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "AllMicrophoneMutedData");
            StringBuilder sb = new StringBuilder();
            sb.append(", is_muted=");
            sb.append(this.is_muted);
            if (this.operation_user != null) {
                sb.append(", operation_user=");
                sb.append(this.operation_user);
            }
            if (this.breakout_room_id != null) {
                sb.append(", breakout_room_id=");
                sb.append(this.breakout_room_id);
            }
            StringBuilder replace = sb.replace(0, 2, "AllMicrophoneMutedData{");
            replace.append('}');
            return replace.toString();
        }

        public AllMicrophoneMutedData(Boolean bool, ByteviewUser byteviewUser, String str) {
            this(bool, byteviewUser, str, ByteString.EMPTY);
        }

        public AllMicrophoneMutedData(Boolean bool, ByteviewUser byteviewUser, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_muted = bool;
            this.operation_user = byteviewUser;
            this.breakout_room_id = str;
        }
    }

    public static final class ApplyByteviewAccessibilityData extends Message<ApplyByteviewAccessibilityData, C50761a> {
        public static final ProtoAdapter<ApplyByteviewAccessibilityData> ADAPTER = new C50762b();
        private static final long serialVersionUID = 0;
        public final ByteviewUser applier;
        public final String share_screen_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ApplyByteviewAccessibilityData$b */
        private static final class C50762b extends ProtoAdapter<ApplyByteviewAccessibilityData> {
            C50762b() {
                super(FieldEncoding.LENGTH_DELIMITED, ApplyByteviewAccessibilityData.class);
            }

            /* renamed from: a */
            public int encodedSize(ApplyByteviewAccessibilityData applyByteviewAccessibilityData) {
                int i;
                int encodedSizeWithTag = ByteviewUser.ADAPTER.encodedSizeWithTag(1, applyByteviewAccessibilityData.applier);
                if (applyByteviewAccessibilityData.share_screen_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, applyByteviewAccessibilityData.share_screen_id);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + applyByteviewAccessibilityData.unknownFields().size();
            }

            /* renamed from: a */
            public ApplyByteviewAccessibilityData decode(ProtoReader protoReader) throws IOException {
                C50761a aVar = new C50761a();
                aVar.f126547b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126546a = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126547b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ApplyByteviewAccessibilityData applyByteviewAccessibilityData) throws IOException {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, applyByteviewAccessibilityData.applier);
                if (applyByteviewAccessibilityData.share_screen_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, applyByteviewAccessibilityData.share_screen_id);
                }
                protoWriter.writeBytes(applyByteviewAccessibilityData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ApplyByteviewAccessibilityData$a */
        public static final class C50761a extends Message.Builder<ApplyByteviewAccessibilityData, C50761a> {

            /* renamed from: a */
            public ByteviewUser f126546a;

            /* renamed from: b */
            public String f126547b;

            /* renamed from: a */
            public ApplyByteviewAccessibilityData build() {
                ByteviewUser byteviewUser = this.f126546a;
                if (byteviewUser != null) {
                    return new ApplyByteviewAccessibilityData(byteviewUser, this.f126547b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(byteviewUser, "applier");
            }
        }

        @Override // com.squareup.wire.Message
        public C50761a newBuilder() {
            C50761a aVar = new C50761a();
            aVar.f126546a = this.applier;
            aVar.f126547b = this.share_screen_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ApplyByteviewAccessibilityData");
            StringBuilder sb = new StringBuilder();
            sb.append(", applier=");
            sb.append(this.applier);
            if (this.share_screen_id != null) {
                sb.append(", share_screen_id=");
                sb.append(this.share_screen_id);
            }
            StringBuilder replace = sb.replace(0, 2, "ApplyByteviewAccessibilityData{");
            replace.append('}');
            return replace.toString();
        }

        public ApplyByteviewAccessibilityData(ByteviewUser byteviewUser, String str) {
            this(byteviewUser, str, ByteString.EMPTY);
        }

        public ApplyByteviewAccessibilityData(ByteviewUser byteviewUser, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.applier = byteviewUser;
            this.share_screen_id = str;
        }
    }

    public static final class ApplyRemoteControlData extends Message<ApplyRemoteControlData, C50763a> {
        public static final ProtoAdapter<ApplyRemoteControlData> ADAPTER = new C50764b();
        private static final long serialVersionUID = 0;
        public final ByteviewUser applier;
        public final String share_screen_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ApplyRemoteControlData$b */
        private static final class C50764b extends ProtoAdapter<ApplyRemoteControlData> {
            C50764b() {
                super(FieldEncoding.LENGTH_DELIMITED, ApplyRemoteControlData.class);
            }

            /* renamed from: a */
            public int encodedSize(ApplyRemoteControlData applyRemoteControlData) {
                return ByteviewUser.ADAPTER.encodedSizeWithTag(1, applyRemoteControlData.applier) + ProtoAdapter.STRING.encodedSizeWithTag(2, applyRemoteControlData.share_screen_id) + applyRemoteControlData.unknownFields().size();
            }

            /* renamed from: a */
            public ApplyRemoteControlData decode(ProtoReader protoReader) throws IOException {
                C50763a aVar = new C50763a();
                aVar.f126549b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126548a = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126549b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ApplyRemoteControlData applyRemoteControlData) throws IOException {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, applyRemoteControlData.applier);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, applyRemoteControlData.share_screen_id);
                protoWriter.writeBytes(applyRemoteControlData.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50763a newBuilder() {
            C50763a aVar = new C50763a();
            aVar.f126548a = this.applier;
            aVar.f126549b = this.share_screen_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$ApplyRemoteControlData$a */
        public static final class C50763a extends Message.Builder<ApplyRemoteControlData, C50763a> {

            /* renamed from: a */
            public ByteviewUser f126548a;

            /* renamed from: b */
            public String f126549b;

            /* renamed from: a */
            public ApplyRemoteControlData build() {
                String str;
                ByteviewUser byteviewUser = this.f126548a;
                if (byteviewUser != null && (str = this.f126549b) != null) {
                    return new ApplyRemoteControlData(byteviewUser, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(byteviewUser, "applier", this.f126549b, "share_screen_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ApplyRemoteControlData");
            StringBuilder sb = new StringBuilder();
            sb.append(", applier=");
            sb.append(this.applier);
            sb.append(", share_screen_id=");
            sb.append(this.share_screen_id);
            StringBuilder replace = sb.replace(0, 2, "ApplyRemoteControlData{");
            replace.append('}');
            return replace.toString();
        }

        public ApplyRemoteControlData(ByteviewUser byteviewUser, String str) {
            this(byteviewUser, str, ByteString.EMPTY);
        }

        public ApplyRemoteControlData(ByteviewUser byteviewUser, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.applier = byteviewUser;
            this.share_screen_id = str;
        }
    }

    public static final class EnableShareAlphaColorData extends Message<EnableShareAlphaColorData, C50765a> {
        public static final ProtoAdapter<EnableShareAlphaColorData> ADAPTER = new C50766b();
        public static final Boolean DEFAULT_ENABLE_SHARE_ALPHA_COLOR = false;
        public static final Long DEFAULT_VERSION = 0L;
        private static final long serialVersionUID = 0;
        public final Boolean enable_share_alpha_color;
        public final Long version;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$EnableShareAlphaColorData$b */
        private static final class C50766b extends ProtoAdapter<EnableShareAlphaColorData> {
            C50766b() {
                super(FieldEncoding.LENGTH_DELIMITED, EnableShareAlphaColorData.class);
            }

            /* renamed from: a */
            public int encodedSize(EnableShareAlphaColorData enableShareAlphaColorData) {
                int i;
                int i2 = 0;
                if (enableShareAlphaColorData.enable_share_alpha_color != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, enableShareAlphaColorData.enable_share_alpha_color);
                } else {
                    i = 0;
                }
                if (enableShareAlphaColorData.version != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, enableShareAlphaColorData.version);
                }
                return i + i2 + enableShareAlphaColorData.unknownFields().size();
            }

            /* renamed from: a */
            public EnableShareAlphaColorData decode(ProtoReader protoReader) throws IOException {
                C50765a aVar = new C50765a();
                aVar.f126550a = false;
                aVar.f126551b = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126550a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126551b = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EnableShareAlphaColorData enableShareAlphaColorData) throws IOException {
                if (enableShareAlphaColorData.enable_share_alpha_color != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, enableShareAlphaColorData.enable_share_alpha_color);
                }
                if (enableShareAlphaColorData.version != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, enableShareAlphaColorData.version);
                }
                protoWriter.writeBytes(enableShareAlphaColorData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$EnableShareAlphaColorData$a */
        public static final class C50765a extends Message.Builder<EnableShareAlphaColorData, C50765a> {

            /* renamed from: a */
            public Boolean f126550a;

            /* renamed from: b */
            public Long f126551b;

            /* renamed from: a */
            public EnableShareAlphaColorData build() {
                return new EnableShareAlphaColorData(this.f126550a, this.f126551b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50765a newBuilder() {
            C50765a aVar = new C50765a();
            aVar.f126550a = this.enable_share_alpha_color;
            aVar.f126551b = this.version;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "EnableShareAlphaColorData");
            StringBuilder sb = new StringBuilder();
            if (this.enable_share_alpha_color != null) {
                sb.append(", enable_share_alpha_color=");
                sb.append(this.enable_share_alpha_color);
            }
            if (this.version != null) {
                sb.append(", version=");
                sb.append(this.version);
            }
            StringBuilder replace = sb.replace(0, 2, "EnableShareAlphaColorData{");
            replace.append('}');
            return replace.toString();
        }

        public EnableShareAlphaColorData(Boolean bool, Long l) {
            this(bool, l, ByteString.EMPTY);
        }

        public EnableShareAlphaColorData(Boolean bool, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            this.enable_share_alpha_color = bool;
            this.version = l;
        }
    }

    public static final class HostTransferredData extends Message<HostTransferredData, C50771a> {
        public static final ProtoAdapter<HostTransferredData> ADAPTER = new C50772b();
        public static final ParticipantType DEFAULT_HOST_TYPE = ParticipantType.LARK_USER;
        private static final long serialVersionUID = 0;
        public final String host_device_id;
        public final String host_id;
        public final ParticipantType host_type;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$HostTransferredData$b */
        private static final class C50772b extends ProtoAdapter<HostTransferredData> {
            C50772b() {
                super(FieldEncoding.LENGTH_DELIMITED, HostTransferredData.class);
            }

            /* renamed from: a */
            public int encodedSize(HostTransferredData hostTransferredData) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, hostTransferredData.host_id);
                int i2 = 0;
                if (hostTransferredData.host_type != null) {
                    i = ParticipantType.ADAPTER.encodedSizeWithTag(5, hostTransferredData.host_type);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (hostTransferredData.host_device_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, hostTransferredData.host_device_id);
                }
                return i3 + i2 + hostTransferredData.unknownFields().size();
            }

            /* renamed from: a */
            public HostTransferredData decode(ProtoReader protoReader) throws IOException {
                C50771a aVar = new C50771a();
                aVar.f126559a = "";
                aVar.f126560b = ParticipantType.LARK_USER;
                aVar.f126561c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126559a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 5) {
                        try {
                            aVar.f126560b = ParticipantType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 6) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126561c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, HostTransferredData hostTransferredData) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hostTransferredData.host_id);
                if (hostTransferredData.host_type != null) {
                    ParticipantType.ADAPTER.encodeWithTag(protoWriter, 5, hostTransferredData.host_type);
                }
                if (hostTransferredData.host_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, hostTransferredData.host_device_id);
                }
                protoWriter.writeBytes(hostTransferredData.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50771a newBuilder() {
            C50771a aVar = new C50771a();
            aVar.f126559a = this.host_id;
            aVar.f126560b = this.host_type;
            aVar.f126561c = this.host_device_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$HostTransferredData$a */
        public static final class C50771a extends Message.Builder<HostTransferredData, C50771a> {

            /* renamed from: a */
            public String f126559a;

            /* renamed from: b */
            public ParticipantType f126560b;

            /* renamed from: c */
            public String f126561c;

            /* renamed from: a */
            public HostTransferredData build() {
                String str = this.f126559a;
                if (str != null) {
                    return new HostTransferredData(str, this.f126560b, this.f126561c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "host_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "HostTransferredData");
            StringBuilder sb = new StringBuilder();
            sb.append(", host_id=");
            sb.append(this.host_id);
            if (this.host_type != null) {
                sb.append(", host_type=");
                sb.append(this.host_type);
            }
            if (this.host_device_id != null) {
                sb.append(", host_device_id=");
                sb.append(this.host_device_id);
            }
            StringBuilder replace = sb.replace(0, 2, "HostTransferredData{");
            replace.append('}');
            return replace.toString();
        }

        public HostTransferredData(String str, ParticipantType participantType, String str2) {
            this(str, participantType, str2, ByteString.EMPTY);
        }

        public HostTransferredData(String str, ParticipantType participantType, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.host_id = str;
            this.host_type = participantType;
            this.host_device_id = str2;
        }
    }

    public static final class SettingsChangedData extends Message<SettingsChangedData, C50791a> {
        public static final ProtoAdapter<SettingsChangedData> ADAPTER = new C50792b();
        private static final long serialVersionUID = 0;
        public final VideoChatSettings meeting_settings;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$SettingsChangedData$b */
        private static final class C50792b extends ProtoAdapter<SettingsChangedData> {
            C50792b() {
                super(FieldEncoding.LENGTH_DELIMITED, SettingsChangedData.class);
            }

            /* renamed from: a */
            public int encodedSize(SettingsChangedData settingsChangedData) {
                return VideoChatSettings.ADAPTER.encodedSizeWithTag(1, settingsChangedData.meeting_settings) + settingsChangedData.unknownFields().size();
            }

            /* renamed from: a */
            public SettingsChangedData decode(ProtoReader protoReader) throws IOException {
                C50791a aVar = new C50791a();
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
                        aVar.f126618a = VideoChatSettings.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SettingsChangedData settingsChangedData) throws IOException {
                VideoChatSettings.ADAPTER.encodeWithTag(protoWriter, 1, settingsChangedData.meeting_settings);
                protoWriter.writeBytes(settingsChangedData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$SettingsChangedData$a */
        public static final class C50791a extends Message.Builder<SettingsChangedData, C50791a> {

            /* renamed from: a */
            public VideoChatSettings f126618a;

            /* renamed from: a */
            public SettingsChangedData build() {
                VideoChatSettings videoChatSettings = this.f126618a;
                if (videoChatSettings != null) {
                    return new SettingsChangedData(videoChatSettings, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(videoChatSettings, "meeting_settings");
            }
        }

        @Override // com.squareup.wire.Message
        public C50791a newBuilder() {
            C50791a aVar = new C50791a();
            aVar.f126618a = this.meeting_settings;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SettingsChangedData");
            StringBuilder sb = new StringBuilder();
            sb.append(", meeting_settings=");
            sb.append(this.meeting_settings);
            StringBuilder replace = sb.replace(0, 2, "SettingsChangedData{");
            replace.append('}');
            return replace.toString();
        }

        public SettingsChangedData(VideoChatSettings videoChatSettings) {
            this(videoChatSettings, ByteString.EMPTY);
        }

        public SettingsChangedData(VideoChatSettings videoChatSettings, ByteString byteString) {
            super(ADAPTER, byteString);
            this.meeting_settings = videoChatSettings;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$b */
    private static final class C50798b extends ProtoAdapter<InMeetingData> {
        C50798b() {
            super(FieldEncoding.LENGTH_DELIMITED, InMeetingData.class);
        }

        /* renamed from: a */
        public int encodedSize(InMeetingData inMeetingData) {
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
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, inMeetingData.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, inMeetingData.meeting_id);
            int i17 = 0;
            if (inMeetingData.settings_changed_data != null) {
                i = SettingsChangedData.ADAPTER.encodedSizeWithTag(3, inMeetingData.settings_changed_data);
            } else {
                i = 0;
            }
            int i18 = encodedSizeWithTag + i;
            if (inMeetingData.participants_changed_data != null) {
                i2 = ParticipantsChangedData.ADAPTER.encodedSizeWithTag(4, inMeetingData.participants_changed_data);
            } else {
                i2 = 0;
            }
            int i19 = i18 + i2;
            if (inMeetingData.host_transfer_data != null) {
                i3 = HostTransferredData.ADAPTER.encodedSizeWithTag(5, inMeetingData.host_transfer_data);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (inMeetingData.mute_all_data != null) {
                i4 = AllMicrophoneMutedData.ADAPTER.encodedSizeWithTag(6, inMeetingData.mute_all_data);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (inMeetingData.screen_shared_data != null) {
                i5 = ScreenSharedData.ADAPTER.encodedSizeWithTag(7, inMeetingData.screen_shared_data);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (inMeetingData.follow_data != null) {
                i6 = FollowData.ADAPTER.encodedSizeWithTag(8, inMeetingData.follow_data);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (inMeetingData.recording_data != null) {
                i7 = RecordMeetingData.ADAPTER.encodedSizeWithTag(9, inMeetingData.recording_data);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (inMeetingData.subtitle_status_data != null) {
                i8 = SubtitleStatusData.ADAPTER.encodedSizeWithTag(10, inMeetingData.subtitle_status_data);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (inMeetingData.apply_remote_control_data != null) {
                i9 = ApplyRemoteControlData.ADAPTER.encodedSizeWithTag(11, inMeetingData.apply_remote_control_data);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (inMeetingData.live_data != null) {
                i10 = LiveMeetingData.ADAPTER.encodedSizeWithTag(12, inMeetingData.live_data);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (inMeetingData.apply_byteview_accessibility_data != null) {
                i11 = ApplyByteviewAccessibilityData.ADAPTER.encodedSizeWithTag(13, inMeetingData.apply_byteview_accessibility_data);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (inMeetingData.seq_id != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(14, inMeetingData.seq_id);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag2 = i28 + i12 + WhiteboardData.ADAPTER.asRepeated().encodedSizeWithTag(15, inMeetingData.whiteboard_data);
            if (inMeetingData.feature_config != null) {
                i13 = FeatureConfig.ADAPTER.encodedSizeWithTag(17, inMeetingData.feature_config);
            } else {
                i13 = 0;
            }
            int i29 = encodedSizeWithTag2 + i13;
            if (inMeetingData.meeting_owner != null) {
                i14 = ByteviewUser.ADAPTER.encodedSizeWithTag(18, inMeetingData.meeting_owner);
            } else {
                i14 = 0;
            }
            int i30 = i29 + i14;
            if (inMeetingData.enable_share_alpha_color_data != null) {
                i15 = EnableShareAlphaColorData.ADAPTER.encodedSizeWithTag(19, inMeetingData.enable_share_alpha_color_data);
            } else {
                i15 = 0;
            }
            int i31 = i30 + i15;
            if (inMeetingData.interview_coding_data != null) {
                i16 = InterviewCodingData.ADAPTER.encodedSizeWithTag(20, inMeetingData.interview_coding_data);
            } else {
                i16 = 0;
            }
            int i32 = i31 + i16;
            if (inMeetingData.minutes_status_data != null) {
                i17 = MinutesStatusData.ADAPTER.encodedSizeWithTag(21, inMeetingData.minutes_status_data);
            }
            return i32 + i17 + inMeetingData.unknownFields().size();
        }

        /* renamed from: a */
        public InMeetingData decode(ProtoReader protoReader) throws IOException {
            C50797a aVar = new C50797a();
            aVar.f126629a = Type.UNKNOWN;
            aVar.f126630b = "";
            aVar.f126642n = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f126629a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f126630b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126631c = SettingsChangedData.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126632d = ParticipantsChangedData.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126633e = HostTransferredData.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126634f = AllMicrophoneMutedData.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126635g = ScreenSharedData.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126636h = FollowData.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126637i = RecordMeetingData.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126638j = SubtitleStatusData.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f126639k = ApplyRemoteControlData.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126640l = LiveMeetingData.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f126641m = ApplyByteviewAccessibilityData.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            aVar.f126642n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            aVar.f126643o.add(WhiteboardData.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 17:
                            aVar.f126644p = FeatureConfig.ADAPTER.decode(protoReader);
                            break;
                        case 18:
                            aVar.f126645q = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            aVar.f126646r = EnableShareAlphaColorData.ADAPTER.decode(protoReader);
                            break;
                        case 20:
                            aVar.f126647s = InterviewCodingData.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            aVar.f126648t = MinutesStatusData.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InMeetingData inMeetingData) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, inMeetingData.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, inMeetingData.meeting_id);
            if (inMeetingData.settings_changed_data != null) {
                SettingsChangedData.ADAPTER.encodeWithTag(protoWriter, 3, inMeetingData.settings_changed_data);
            }
            if (inMeetingData.participants_changed_data != null) {
                ParticipantsChangedData.ADAPTER.encodeWithTag(protoWriter, 4, inMeetingData.participants_changed_data);
            }
            if (inMeetingData.host_transfer_data != null) {
                HostTransferredData.ADAPTER.encodeWithTag(protoWriter, 5, inMeetingData.host_transfer_data);
            }
            if (inMeetingData.mute_all_data != null) {
                AllMicrophoneMutedData.ADAPTER.encodeWithTag(protoWriter, 6, inMeetingData.mute_all_data);
            }
            if (inMeetingData.screen_shared_data != null) {
                ScreenSharedData.ADAPTER.encodeWithTag(protoWriter, 7, inMeetingData.screen_shared_data);
            }
            if (inMeetingData.follow_data != null) {
                FollowData.ADAPTER.encodeWithTag(protoWriter, 8, inMeetingData.follow_data);
            }
            if (inMeetingData.recording_data != null) {
                RecordMeetingData.ADAPTER.encodeWithTag(protoWriter, 9, inMeetingData.recording_data);
            }
            if (inMeetingData.subtitle_status_data != null) {
                SubtitleStatusData.ADAPTER.encodeWithTag(protoWriter, 10, inMeetingData.subtitle_status_data);
            }
            if (inMeetingData.apply_remote_control_data != null) {
                ApplyRemoteControlData.ADAPTER.encodeWithTag(protoWriter, 11, inMeetingData.apply_remote_control_data);
            }
            if (inMeetingData.live_data != null) {
                LiveMeetingData.ADAPTER.encodeWithTag(protoWriter, 12, inMeetingData.live_data);
            }
            if (inMeetingData.apply_byteview_accessibility_data != null) {
                ApplyByteviewAccessibilityData.ADAPTER.encodeWithTag(protoWriter, 13, inMeetingData.apply_byteview_accessibility_data);
            }
            if (inMeetingData.seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, inMeetingData.seq_id);
            }
            WhiteboardData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, inMeetingData.whiteboard_data);
            if (inMeetingData.feature_config != null) {
                FeatureConfig.ADAPTER.encodeWithTag(protoWriter, 17, inMeetingData.feature_config);
            }
            if (inMeetingData.meeting_owner != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 18, inMeetingData.meeting_owner);
            }
            if (inMeetingData.enable_share_alpha_color_data != null) {
                EnableShareAlphaColorData.ADAPTER.encodeWithTag(protoWriter, 19, inMeetingData.enable_share_alpha_color_data);
            }
            if (inMeetingData.interview_coding_data != null) {
                InterviewCodingData.ADAPTER.encodeWithTag(protoWriter, 20, inMeetingData.interview_coding_data);
            }
            if (inMeetingData.minutes_status_data != null) {
                MinutesStatusData.ADAPTER.encodeWithTag(protoWriter, 21, inMeetingData.minutes_status_data);
            }
            protoWriter.writeBytes(inMeetingData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InMeetingData$a */
    public static final class C50797a extends Message.Builder<InMeetingData, C50797a> {

        /* renamed from: a */
        public Type f126629a;

        /* renamed from: b */
        public String f126630b;

        /* renamed from: c */
        public SettingsChangedData f126631c;

        /* renamed from: d */
        public ParticipantsChangedData f126632d;

        /* renamed from: e */
        public HostTransferredData f126633e;

        /* renamed from: f */
        public AllMicrophoneMutedData f126634f;

        /* renamed from: g */
        public ScreenSharedData f126635g;

        /* renamed from: h */
        public FollowData f126636h;

        /* renamed from: i */
        public RecordMeetingData f126637i;

        /* renamed from: j */
        public SubtitleStatusData f126638j;

        /* renamed from: k */
        public ApplyRemoteControlData f126639k;

        /* renamed from: l */
        public LiveMeetingData f126640l;

        /* renamed from: m */
        public ApplyByteviewAccessibilityData f126641m;

        /* renamed from: n */
        public Long f126642n;

        /* renamed from: o */
        public List<WhiteboardData> f126643o = Internal.newMutableList();

        /* renamed from: p */
        public FeatureConfig f126644p;

        /* renamed from: q */
        public ByteviewUser f126645q;

        /* renamed from: r */
        public EnableShareAlphaColorData f126646r;

        /* renamed from: s */
        public InterviewCodingData f126647s;

        /* renamed from: t */
        public MinutesStatusData f126648t;

        /* renamed from: a */
        public InMeetingData build() {
            String str;
            Type type = this.f126629a;
            if (type != null && (str = this.f126630b) != null) {
                return new InMeetingData(type, str, this.f126631c, this.f126632d, this.f126633e, this.f126634f, this.f126635g, this.f126636h, this.f126637i, this.f126638j, this.f126639k, this.f126640l, this.f126641m, this.f126642n, this.f126643o, this.f126644p, this.f126645q, this.f126646r, this.f126647s, this.f126648t, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f126630b, "meeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50797a newBuilder() {
        C50797a aVar = new C50797a();
        aVar.f126629a = this.type;
        aVar.f126630b = this.meeting_id;
        aVar.f126631c = this.settings_changed_data;
        aVar.f126632d = this.participants_changed_data;
        aVar.f126633e = this.host_transfer_data;
        aVar.f126634f = this.mute_all_data;
        aVar.f126635g = this.screen_shared_data;
        aVar.f126636h = this.follow_data;
        aVar.f126637i = this.recording_data;
        aVar.f126638j = this.subtitle_status_data;
        aVar.f126639k = this.apply_remote_control_data;
        aVar.f126640l = this.live_data;
        aVar.f126641m = this.apply_byteview_accessibility_data;
        aVar.f126642n = this.seq_id;
        aVar.f126643o = Internal.copyOf("whiteboard_data", this.whiteboard_data);
        aVar.f126644p = this.feature_config;
        aVar.f126645q = this.meeting_owner;
        aVar.f126646r = this.enable_share_alpha_color_data;
        aVar.f126647s = this.interview_coding_data;
        aVar.f126648t = this.minutes_status_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "InMeetingData");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (this.settings_changed_data != null) {
            sb.append(", settings_changed_data=");
            sb.append(this.settings_changed_data);
        }
        if (this.participants_changed_data != null) {
            sb.append(", participants_changed_data=");
            sb.append(this.participants_changed_data);
        }
        if (this.host_transfer_data != null) {
            sb.append(", host_transfer_data=");
            sb.append(this.host_transfer_data);
        }
        if (this.mute_all_data != null) {
            sb.append(", mute_all_data=");
            sb.append(this.mute_all_data);
        }
        if (this.screen_shared_data != null) {
            sb.append(", screen_shared_data=");
            sb.append(this.screen_shared_data);
        }
        if (this.follow_data != null) {
            sb.append(", follow_data=");
            sb.append(this.follow_data);
        }
        if (this.recording_data != null) {
            sb.append(", recording_data=");
            sb.append(this.recording_data);
        }
        if (this.subtitle_status_data != null) {
            sb.append(", subtitle_status_data=");
            sb.append(this.subtitle_status_data);
        }
        if (this.apply_remote_control_data != null) {
            sb.append(", apply_remote_control_data=");
            sb.append(this.apply_remote_control_data);
        }
        if (this.live_data != null) {
            sb.append(", live_data=");
            sb.append(this.live_data);
        }
        if (this.apply_byteview_accessibility_data != null) {
            sb.append(", apply_byteview_accessibility_data=");
            sb.append(this.apply_byteview_accessibility_data);
        }
        if (this.seq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.seq_id);
        }
        if (!this.whiteboard_data.isEmpty()) {
            sb.append(", whiteboard_data=");
            sb.append(this.whiteboard_data);
        }
        if (this.feature_config != null) {
            sb.append(", feature_config=");
            sb.append(this.feature_config);
        }
        if (this.meeting_owner != null) {
            sb.append(", meeting_owner=");
            sb.append(this.meeting_owner);
        }
        if (this.enable_share_alpha_color_data != null) {
            sb.append(", enable_share_alpha_color_data=");
            sb.append(this.enable_share_alpha_color_data);
        }
        if (this.interview_coding_data != null) {
            sb.append(", interview_coding_data=");
            sb.append(this.interview_coding_data);
        }
        if (this.minutes_status_data != null) {
            sb.append(", minutes_status_data=");
            sb.append(this.minutes_status_data);
        }
        StringBuilder replace = sb.replace(0, 2, "InMeetingData{");
        replace.append('}');
        return replace.toString();
    }

    public InMeetingData(Type type2, String str, SettingsChangedData settingsChangedData, ParticipantsChangedData participantsChangedData, HostTransferredData hostTransferredData, AllMicrophoneMutedData allMicrophoneMutedData, ScreenSharedData screenSharedData, FollowData followData, RecordMeetingData recordMeetingData, SubtitleStatusData subtitleStatusData, ApplyRemoteControlData applyRemoteControlData, LiveMeetingData liveMeetingData, ApplyByteviewAccessibilityData applyByteviewAccessibilityData, Long l, List<WhiteboardData> list, FeatureConfig featureConfig, ByteviewUser byteviewUser, EnableShareAlphaColorData enableShareAlphaColorData, InterviewCodingData interviewCodingData, MinutesStatusData minutesStatusData) {
        this(type2, str, settingsChangedData, participantsChangedData, hostTransferredData, allMicrophoneMutedData, screenSharedData, followData, recordMeetingData, subtitleStatusData, applyRemoteControlData, liveMeetingData, applyByteviewAccessibilityData, l, list, featureConfig, byteviewUser, enableShareAlphaColorData, interviewCodingData, minutesStatusData, ByteString.EMPTY);
    }

    public InMeetingData(Type type2, String str, SettingsChangedData settingsChangedData, ParticipantsChangedData participantsChangedData, HostTransferredData hostTransferredData, AllMicrophoneMutedData allMicrophoneMutedData, ScreenSharedData screenSharedData, FollowData followData, RecordMeetingData recordMeetingData, SubtitleStatusData subtitleStatusData, ApplyRemoteControlData applyRemoteControlData, LiveMeetingData liveMeetingData, ApplyByteviewAccessibilityData applyByteviewAccessibilityData, Long l, List<WhiteboardData> list, FeatureConfig featureConfig, ByteviewUser byteviewUser, EnableShareAlphaColorData enableShareAlphaColorData, InterviewCodingData interviewCodingData, MinutesStatusData minutesStatusData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.meeting_id = str;
        this.settings_changed_data = settingsChangedData;
        this.participants_changed_data = participantsChangedData;
        this.host_transfer_data = hostTransferredData;
        this.mute_all_data = allMicrophoneMutedData;
        this.screen_shared_data = screenSharedData;
        this.follow_data = followData;
        this.recording_data = recordMeetingData;
        this.subtitle_status_data = subtitleStatusData;
        this.apply_remote_control_data = applyRemoteControlData;
        this.live_data = liveMeetingData;
        this.apply_byteview_accessibility_data = applyByteviewAccessibilityData;
        this.seq_id = l;
        this.whiteboard_data = Internal.immutableCopyOf("whiteboard_data", list);
        this.feature_config = featureConfig;
        this.meeting_owner = byteviewUser;
        this.enable_share_alpha_color_data = enableShareAlphaColorData;
        this.interview_coding_data = interviewCodingData;
        this.minutes_status_data = minutesStatusData;
    }
}
