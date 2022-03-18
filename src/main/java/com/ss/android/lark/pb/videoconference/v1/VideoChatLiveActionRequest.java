package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.InMeetingData;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class VideoChatLiveActionRequest extends Message<VideoChatLiveActionRequest, C51250a> {
    public static final ProtoAdapter<VideoChatLiveActionRequest> ADAPTER = new C51251b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN;
    public static final Boolean DEFAULT_ENABLE_LIVE_COMMENT = false;
    public static final InMeetingData.LiveMeetingData.LayoutStyle DEFAULT_LAYOUT_STYLE = InMeetingData.LiveMeetingData.LayoutStyle.STYLE_UNKNOWN;
    public static final InMeetingData.LiveMeetingData.Privilege DEFAULT_PRIVILEGE = InMeetingData.LiveMeetingData.Privilege.PREVILEGE_UNKNOWN;
    public static final StreamScope DEFAULT_STREAM_SCOPE = StreamScope.UNKNOWN_SCOPE;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final Boolean enable_live_comment;
    public final InMeetingData.LiveMeetingData.LayoutStyle layout_style;
    public final String meeting_id;
    public final InMeetingData.LiveMeetingData.Privilege privilege;
    public final ByteviewUser requester;
    public final StreamScope stream_scope;
    public final Map<String, Boolean> stream_status;
    public final String vote_id;

    public enum Action implements WireEnum {
        UNKNOWN(0),
        START(1),
        STOP(2),
        HOST_ACCEPT(3),
        HOST_REFUSE(4),
        PARTICIPANT_REQUEST_START(5),
        VOTE_ACCEPT(6),
        VOTE_REFUSE(7),
        LIVE_SETTING(8);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return START;
                case 2:
                    return STOP;
                case 3:
                    return HOST_ACCEPT;
                case 4:
                    return HOST_REFUSE;
                case 5:
                    return PARTICIPANT_REQUEST_START;
                case 6:
                    return VOTE_ACCEPT;
                case 7:
                    return VOTE_REFUSE;
                case 8:
                    return LIVE_SETTING;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum StreamScope implements WireEnum {
        UNKNOWN_SCOPE(0),
        ALL(1),
        ONLY_BIND(2),
        ONLY_WEB(3);
        
        public static final ProtoAdapter<StreamScope> ADAPTER = ProtoAdapter.newEnumAdapter(StreamScope.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static StreamScope fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_SCOPE;
            }
            if (i == 1) {
                return ALL;
            }
            if (i == 2) {
                return ONLY_BIND;
            }
            if (i != 3) {
                return null;
            }
            return ONLY_WEB;
        }

        private StreamScope(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLiveActionRequest$b */
    private static final class C51251b extends ProtoAdapter<VideoChatLiveActionRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f127640a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C51251b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatLiveActionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatLiveActionRequest videoChatLiveActionRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatLiveActionRequest.meeting_id) + Action.ADAPTER.encodedSizeWithTag(2, videoChatLiveActionRequest.action);
            int i6 = 0;
            if (videoChatLiveActionRequest.requester != null) {
                i = ByteviewUser.ADAPTER.encodedSizeWithTag(3, videoChatLiveActionRequest.requester);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (videoChatLiveActionRequest.vote_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, videoChatLiveActionRequest.vote_id);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (videoChatLiveActionRequest.privilege != null) {
                i3 = InMeetingData.LiveMeetingData.Privilege.ADAPTER.encodedSizeWithTag(5, videoChatLiveActionRequest.privilege);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i8 + i3 + this.f127640a.encodedSizeWithTag(6, videoChatLiveActionRequest.stream_status);
            if (videoChatLiveActionRequest.stream_scope != null) {
                i4 = StreamScope.ADAPTER.encodedSizeWithTag(7, videoChatLiveActionRequest.stream_scope);
            } else {
                i4 = 0;
            }
            int i9 = encodedSizeWithTag2 + i4;
            if (videoChatLiveActionRequest.layout_style != null) {
                i5 = InMeetingData.LiveMeetingData.LayoutStyle.ADAPTER.encodedSizeWithTag(8, videoChatLiveActionRequest.layout_style);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (videoChatLiveActionRequest.enable_live_comment != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(9, videoChatLiveActionRequest.enable_live_comment);
            }
            return i10 + i6 + videoChatLiveActionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatLiveActionRequest decode(ProtoReader protoReader) throws IOException {
            C51250a aVar = new C51250a();
            aVar.f127631a = "";
            aVar.f127632b = Action.UNKNOWN;
            aVar.f127634d = "";
            aVar.f127635e = InMeetingData.LiveMeetingData.Privilege.PREVILEGE_UNKNOWN;
            aVar.f127637g = StreamScope.UNKNOWN_SCOPE;
            aVar.f127638h = InMeetingData.LiveMeetingData.LayoutStyle.STYLE_UNKNOWN;
            aVar.f127639i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127631a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f127632b = Action.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f127633c = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127634d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f127635e = InMeetingData.LiveMeetingData.Privilege.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f127636f.putAll(this.f127640a.decode(protoReader));
                            break;
                        case 7:
                            try {
                                aVar.f127637g = StreamScope.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 8:
                            try {
                                aVar.f127638h = InMeetingData.LiveMeetingData.LayoutStyle.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 9:
                            aVar.f127639i = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, VideoChatLiveActionRequest videoChatLiveActionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatLiveActionRequest.meeting_id);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, videoChatLiveActionRequest.action);
            if (videoChatLiveActionRequest.requester != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 3, videoChatLiveActionRequest.requester);
            }
            if (videoChatLiveActionRequest.vote_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoChatLiveActionRequest.vote_id);
            }
            if (videoChatLiveActionRequest.privilege != null) {
                InMeetingData.LiveMeetingData.Privilege.ADAPTER.encodeWithTag(protoWriter, 5, videoChatLiveActionRequest.privilege);
            }
            this.f127640a.encodeWithTag(protoWriter, 6, videoChatLiveActionRequest.stream_status);
            if (videoChatLiveActionRequest.stream_scope != null) {
                StreamScope.ADAPTER.encodeWithTag(protoWriter, 7, videoChatLiveActionRequest.stream_scope);
            }
            if (videoChatLiveActionRequest.layout_style != null) {
                InMeetingData.LiveMeetingData.LayoutStyle.ADAPTER.encodeWithTag(protoWriter, 8, videoChatLiveActionRequest.layout_style);
            }
            if (videoChatLiveActionRequest.enable_live_comment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, videoChatLiveActionRequest.enable_live_comment);
            }
            protoWriter.writeBytes(videoChatLiveActionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51250a newBuilder() {
        C51250a aVar = new C51250a();
        aVar.f127631a = this.meeting_id;
        aVar.f127632b = this.action;
        aVar.f127633c = this.requester;
        aVar.f127634d = this.vote_id;
        aVar.f127635e = this.privilege;
        aVar.f127636f = Internal.copyOf("stream_status", this.stream_status);
        aVar.f127637g = this.stream_scope;
        aVar.f127638h = this.layout_style;
        aVar.f127639i = this.enable_live_comment;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLiveActionRequest$a */
    public static final class C51250a extends Message.Builder<VideoChatLiveActionRequest, C51250a> {

        /* renamed from: a */
        public String f127631a;

        /* renamed from: b */
        public Action f127632b;

        /* renamed from: c */
        public ByteviewUser f127633c;

        /* renamed from: d */
        public String f127634d;

        /* renamed from: e */
        public InMeetingData.LiveMeetingData.Privilege f127635e;

        /* renamed from: f */
        public Map<String, Boolean> f127636f = Internal.newMutableMap();

        /* renamed from: g */
        public StreamScope f127637g;

        /* renamed from: h */
        public InMeetingData.LiveMeetingData.LayoutStyle f127638h;

        /* renamed from: i */
        public Boolean f127639i;

        /* renamed from: a */
        public VideoChatLiveActionRequest build() {
            Action action;
            String str = this.f127631a;
            if (str != null && (action = this.f127632b) != null) {
                return new VideoChatLiveActionRequest(str, action, this.f127633c, this.f127634d, this.f127635e, this.f127636f, this.f127637g, this.f127638h, this.f127639i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id", this.f127632b, "action");
        }

        /* renamed from: a */
        public C51250a mo176710a(ByteviewUser byteviewUser) {
            this.f127633c = byteviewUser;
            return this;
        }

        /* renamed from: b */
        public C51250a mo176717b(String str) {
            this.f127634d = str;
            return this;
        }

        /* renamed from: a */
        public C51250a mo176711a(InMeetingData.LiveMeetingData.LayoutStyle layoutStyle) {
            this.f127638h = layoutStyle;
            return this;
        }

        /* renamed from: a */
        public C51250a mo176712a(InMeetingData.LiveMeetingData.Privilege privilege) {
            this.f127635e = privilege;
            return this;
        }

        /* renamed from: a */
        public C51250a mo176713a(Action action) {
            this.f127632b = action;
            return this;
        }

        /* renamed from: a */
        public C51250a mo176714a(Boolean bool) {
            this.f127639i = bool;
            return this;
        }

        /* renamed from: a */
        public C51250a mo176715a(String str) {
            this.f127631a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatLiveActionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", action=");
        sb.append(this.action);
        if (this.requester != null) {
            sb.append(", requester=");
            sb.append(this.requester);
        }
        if (this.vote_id != null) {
            sb.append(", vote_id=");
            sb.append(this.vote_id);
        }
        if (this.privilege != null) {
            sb.append(", privilege=");
            sb.append(this.privilege);
        }
        if (!this.stream_status.isEmpty()) {
            sb.append(", stream_status=");
            sb.append(this.stream_status);
        }
        if (this.stream_scope != null) {
            sb.append(", stream_scope=");
            sb.append(this.stream_scope);
        }
        if (this.layout_style != null) {
            sb.append(", layout_style=");
            sb.append(this.layout_style);
        }
        if (this.enable_live_comment != null) {
            sb.append(", enable_live_comment=");
            sb.append(this.enable_live_comment);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatLiveActionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatLiveActionRequest(String str, Action action2, ByteviewUser byteviewUser, String str2, InMeetingData.LiveMeetingData.Privilege privilege2, Map<String, Boolean> map, StreamScope streamScope, InMeetingData.LiveMeetingData.LayoutStyle layoutStyle, Boolean bool) {
        this(str, action2, byteviewUser, str2, privilege2, map, streamScope, layoutStyle, bool, ByteString.EMPTY);
    }

    public VideoChatLiveActionRequest(String str, Action action2, ByteviewUser byteviewUser, String str2, InMeetingData.LiveMeetingData.Privilege privilege2, Map<String, Boolean> map, StreamScope streamScope, InMeetingData.LiveMeetingData.LayoutStyle layoutStyle, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.action = action2;
        this.requester = byteviewUser;
        this.vote_id = str2;
        this.privilege = privilege2;
        this.stream_status = Internal.immutableCopyOf("stream_status", map);
        this.stream_scope = streamScope;
        this.layout_style = layoutStyle;
        this.enable_live_comment = bool;
    }
}
