package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import okio.ByteString;

public final class Scene extends Message<Scene, C18851a> {
    public static final ProtoAdapter<Scene> ADAPTER = new C18852b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String email_id;
    public final Long end_time;
    public final String from_id;
    public final Long start_time;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        AT_USERS(1),
        ADD_CHAT_CHATTERS(2),
        TRANSMIT_MESSAGES(3),
        SMART_SEARCH(4),
        SEARCH_MESSAGES(5),
        SEARCH_CHATS(6),
        SEARCH_CHATTERS(7),
        SEARCH_USERS(8),
        SEARCH_IN_CHAT(9),
        SEARCH_CHATTER_IN_EMAIL(10),
        SEARCH_MEMBER_IN_EMAIL(11),
        SEARCH_DOC(12),
        SEARCH_EMAIL_MESSAGES(13),
        SEARCH_DOCS_IN_DIALOG_SCENE(14),
        SEARCH_IN_CALENDAR_SCENE(15),
        SEARCH_HAD_CHAT_HISTORY_SCENE(16),
        SEARCH_MESSAGE_IN_CHAT_SCENE(17),
        SEARCH_FILE_IN_CHAT_SCENE(18),
        SEARCH_DOCS_IN_CHAT_SCENE(19),
        GET_FILE_IN_CHAT_SCENE(20),
        GET_DOCS_IN_CHAT_SCENE(21),
        SEARCH_BOX_SCENE(22),
        SEARCH_ONCALL_SCENE(23),
        SEARCH_MESSAGE_COUNT(24),
        SEARCH_THREAD_SCENE(25),
        SEARCH_CHAT_MENTION_SCENE(26),
        SEARCH_OPEN_APP_SCENE(27),
        LARGE_GROUP_SEARCH_SCENE(28),
        LARGE_GROUP_READ_SCENE(29),
        SEARCH_LINK_SCENE(30),
        SEARCH_FILE_SCENE(31),
        SEARCH_EXTERNAL_SCENE(32),
        SEARCH_WIKI_SCENE(33),
        SEARCH_WIKI_IN_CHAT_SCENE(34),
        ADVANCED_SEARCH_FILTER_SCENE(35),
        SEARCH_CALENDAR_EVENT_SCENE(36),
        SEARCH_CHATS_IN_ADVANCE_SCENE(37),
        SEARCH_CHATTERS_IN_ADVANCE_SCENE(38),
        SEARCH_DEPARTMENT_SCENE(39),
        SEARCH_PIN_MSG_SCENE(40),
        SEARCH_PANO_TAG_SCENE(41),
        SEARCH_PANO_VIEW_SCENE(42),
        SEARCH_SLASH_COMMAND_SCENE(43),
        SEARCH_OPEN_SEARCH_SCENE(44),
        SEARCH_DOCS_WIKI_IN_CHAT_SCENE(45),
        PULL_DOCS_WIKI_IN_CHAT_SCENE(46);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return AT_USERS;
                case 2:
                    return ADD_CHAT_CHATTERS;
                case 3:
                    return TRANSMIT_MESSAGES;
                case 4:
                    return SMART_SEARCH;
                case 5:
                    return SEARCH_MESSAGES;
                case 6:
                    return SEARCH_CHATS;
                case 7:
                    return SEARCH_CHATTERS;
                case 8:
                    return SEARCH_USERS;
                case 9:
                    return SEARCH_IN_CHAT;
                case 10:
                    return SEARCH_CHATTER_IN_EMAIL;
                case 11:
                    return SEARCH_MEMBER_IN_EMAIL;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return SEARCH_DOC;
                case 13:
                    return SEARCH_EMAIL_MESSAGES;
                case 14:
                    return SEARCH_DOCS_IN_DIALOG_SCENE;
                case 15:
                    return SEARCH_IN_CALENDAR_SCENE;
                case 16:
                    return SEARCH_HAD_CHAT_HISTORY_SCENE;
                case 17:
                    return SEARCH_MESSAGE_IN_CHAT_SCENE;
                case 18:
                    return SEARCH_FILE_IN_CHAT_SCENE;
                case 19:
                    return SEARCH_DOCS_IN_CHAT_SCENE;
                case 20:
                    return GET_FILE_IN_CHAT_SCENE;
                case 21:
                    return GET_DOCS_IN_CHAT_SCENE;
                case 22:
                    return SEARCH_BOX_SCENE;
                case 23:
                    return SEARCH_ONCALL_SCENE;
                case 24:
                    return SEARCH_MESSAGE_COUNT;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                    return SEARCH_THREAD_SCENE;
                case 26:
                    return SEARCH_CHAT_MENTION_SCENE;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                    return SEARCH_OPEN_APP_SCENE;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    return LARGE_GROUP_SEARCH_SCENE;
                case 29:
                    return LARGE_GROUP_READ_SCENE;
                case 30:
                    return SEARCH_LINK_SCENE;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    return SEARCH_FILE_SCENE;
                case 32:
                    return SEARCH_EXTERNAL_SCENE;
                case 33:
                    return SEARCH_WIKI_SCENE;
                case 34:
                    return SEARCH_WIKI_IN_CHAT_SCENE;
                case 35:
                    return ADVANCED_SEARCH_FILTER_SCENE;
                case 36:
                    return SEARCH_CALENDAR_EVENT_SCENE;
                case 37:
                    return SEARCH_CHATS_IN_ADVANCE_SCENE;
                case 38:
                    return SEARCH_CHATTERS_IN_ADVANCE_SCENE;
                case 39:
                    return SEARCH_DEPARTMENT_SCENE;
                case 40:
                    return SEARCH_PIN_MSG_SCENE;
                case 41:
                    return SEARCH_PANO_TAG_SCENE;
                case 42:
                    return SEARCH_PANO_VIEW_SCENE;
                case 43:
                    return SEARCH_SLASH_COMMAND_SCENE;
                case 44:
                    return SEARCH_OPEN_SEARCH_SCENE;
                case 45:
                    return SEARCH_DOCS_WIKI_IN_CHAT_SCENE;
                case 46:
                    return PULL_DOCS_WIKI_IN_CHAT_SCENE;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.Scene$b */
    private static final class C18852b extends ProtoAdapter<Scene> {
        C18852b() {
            super(FieldEncoding.LENGTH_DELIMITED, Scene.class);
        }

        /* renamed from: a */
        public int encodedSize(Scene scene) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (scene.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, scene.type);
            } else {
                i = 0;
            }
            if (scene.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(10, scene.chat_id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (scene.from_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(20, scene.from_id);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (scene.start_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(21, scene.start_time);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (scene.end_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(22, scene.end_time);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (scene.email_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(30, scene.email_id);
            }
            return i10 + i6 + scene.unknownFields().size();
        }

        /* renamed from: a */
        public Scene decode(ProtoReader protoReader) throws IOException {
            C18851a aVar = new C18851a();
            aVar.f46529a = Type.UNKNOWN;
            aVar.f46530b = "";
            aVar.f46531c = "";
            aVar.f46532d = 0L;
            aVar.f46533e = 0L;
            aVar.f46534f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46529a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 10) {
                    aVar.f46530b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 30) {
                    switch (nextTag) {
                        case 20:
                            aVar.f46531c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 21:
                            aVar.f46532d = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        case 22:
                            aVar.f46533e = ProtoAdapter.INT64.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f46534f = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Scene scene) throws IOException {
            if (scene.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, scene.type);
            }
            if (scene.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, scene.chat_id);
            }
            if (scene.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, scene.from_id);
            }
            if (scene.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, scene.start_time);
            }
            if (scene.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 22, scene.end_time);
            }
            if (scene.email_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, scene.email_id);
            }
            protoWriter.writeBytes(scene.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.Scene$a */
    public static final class C18851a extends Message.Builder<Scene, C18851a> {

        /* renamed from: a */
        public Type f46529a;

        /* renamed from: b */
        public String f46530b;

        /* renamed from: c */
        public String f46531c;

        /* renamed from: d */
        public Long f46532d;

        /* renamed from: e */
        public Long f46533e;

        /* renamed from: f */
        public String f46534f;

        /* renamed from: a */
        public Scene build() {
            return new Scene(this.f46529a, this.f46530b, this.f46531c, this.f46532d, this.f46533e, this.f46534f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18851a mo64716a(Type type) {
            this.f46529a = type;
            return this;
        }

        /* renamed from: a */
        public C18851a mo64717a(String str) {
            this.f46530b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18851a newBuilder() {
        C18851a aVar = new C18851a();
        aVar.f46529a = this.type;
        aVar.f46530b = this.chat_id;
        aVar.f46531c = this.from_id;
        aVar.f46532d = this.start_time;
        aVar.f46533e = this.end_time;
        aVar.f46534f = this.email_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "Scene");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.email_id != null) {
            sb.append(", email_id=");
            sb.append(this.email_id);
        }
        StringBuilder replace = sb.replace(0, 2, "Scene{");
        replace.append('}');
        return replace.toString();
    }

    public Scene(Type type2, String str, String str2, Long l, Long l2, String str3) {
        this(type2, str, str2, l, l2, str3, ByteString.EMPTY);
    }

    public Scene(Type type2, String str, String str2, Long l, Long l2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.chat_id = str;
        this.from_id = str2;
        this.start_time = l;
        this.end_time = l2;
        this.email_id = str3;
    }
}
