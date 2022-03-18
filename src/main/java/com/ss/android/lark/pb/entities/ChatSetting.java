package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatSetting extends Message<ChatSetting, C49690a> {
    public static final ProtoAdapter<ChatSetting> ADAPTER = new C49691b();
    public static final Long DEFAULT_ANONYMOUS_USER_ID = 0L;
    public static final Boolean DEFAULT_IS_AUTO_TRANSLATE = false;
    public static final Long DEFAULT_IS_AUTO_TRANSLATE_VERSION = 0L;
    public static final Boolean DEFAULT_IS_HIDDEN_NICKNAME = false;
    public static final Boolean DEFAULT_IS_REMIND = true;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long manonymous_user_id;
    public final CheckMessagePositionSetting.Enum mcheck_message_position;
    public final Boolean mis_auto_translate;
    public final Long mis_auto_translate_version;
    public final Boolean mis_hidden_nickname;
    public final Boolean mis_remind;
    public final Long mupdate_time;

    public static final class CheckMessagePositionSetting extends Message<CheckMessagePositionSetting, C49688a> {
        public static final ProtoAdapter<CheckMessagePositionSetting> ADAPTER = new C49689b();
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

        /* renamed from: com.ss.android.lark.pb.entities.ChatSetting$CheckMessagePositionSetting$b */
        private static final class C49689b extends ProtoAdapter<CheckMessagePositionSetting> {
            C49689b() {
                super(FieldEncoding.LENGTH_DELIMITED, CheckMessagePositionSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(CheckMessagePositionSetting checkMessagePositionSetting) {
                return checkMessagePositionSetting.unknownFields().size();
            }

            /* renamed from: a */
            public CheckMessagePositionSetting decode(ProtoReader protoReader) throws IOException {
                C49688a aVar = new C49688a();
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
            public void encode(ProtoWriter protoWriter, CheckMessagePositionSetting checkMessagePositionSetting) throws IOException {
                protoWriter.writeBytes(checkMessagePositionSetting.unknownFields());
            }
        }

        public CheckMessagePositionSetting() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatSetting$CheckMessagePositionSetting$a */
        public static final class C49688a extends Message.Builder<CheckMessagePositionSetting, C49688a> {
            /* renamed from: a */
            public CheckMessagePositionSetting build() {
                return new CheckMessagePositionSetting(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49688a newBuilder() {
            C49688a aVar = new C49688a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder replace = new StringBuilder().replace(0, 2, "CheckMessagePositionSetting{");
            replace.append('}');
            return replace.toString();
        }

        public CheckMessagePositionSetting(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public enum Field implements WireEnum {
        UNKNOWN(0),
        IS_REMIND(1),
        UPDATE_TIME(2),
        CHECK_MESSAGE_POSITION(3),
        IS_AUTO_TRANSLATE(4),
        IS_HIDDEN_NICKNAME(5);
        
        public static final ProtoAdapter<Field> ADAPTER = ProtoAdapter.newEnumAdapter(Field.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Field fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return IS_REMIND;
            }
            if (i == 2) {
                return UPDATE_TIME;
            }
            if (i == 3) {
                return CHECK_MESSAGE_POSITION;
            }
            if (i == 4) {
                return IS_AUTO_TRANSLATE;
            }
            if (i != 5) {
                return null;
            }
            return IS_HIDDEN_NICKNAME;
        }

        private Field(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ChatSetting$b */
    private static final class C49691b extends ProtoAdapter<ChatSetting> {
        C49691b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatSetting chatSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (chatSetting.mis_remind != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, chatSetting.mis_remind);
            } else {
                i = 0;
            }
            if (chatSetting.mupdate_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, chatSetting.mupdate_time);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (chatSetting.mcheck_message_position != null) {
                i3 = CheckMessagePositionSetting.Enum.ADAPTER.encodedSizeWithTag(3, chatSetting.mcheck_message_position);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (chatSetting.mis_auto_translate != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, chatSetting.mis_auto_translate);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (chatSetting.mis_hidden_nickname != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, chatSetting.mis_hidden_nickname);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (chatSetting.mis_auto_translate_version != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, chatSetting.mis_auto_translate_version);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (chatSetting.manonymous_user_id != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, chatSetting.manonymous_user_id);
            }
            return i12 + i7 + chatSetting.unknownFields().size();
        }

        /* renamed from: a */
        public ChatSetting decode(ProtoReader protoReader) throws IOException {
            C49690a aVar = new C49690a();
            aVar.f124410a = true;
            aVar.f124411b = 0L;
            aVar.f124413d = false;
            aVar.f124414e = false;
            aVar.f124415f = 0L;
            aVar.f124416g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124410a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124411b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f124412c = CheckMessagePositionSetting.Enum.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f124413d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124414e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124415f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124416g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ChatSetting chatSetting) throws IOException {
            if (chatSetting.mis_remind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, chatSetting.mis_remind);
            }
            if (chatSetting.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, chatSetting.mupdate_time);
            }
            if (chatSetting.mcheck_message_position != null) {
                CheckMessagePositionSetting.Enum.ADAPTER.encodeWithTag(protoWriter, 3, chatSetting.mcheck_message_position);
            }
            if (chatSetting.mis_auto_translate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, chatSetting.mis_auto_translate);
            }
            if (chatSetting.mis_hidden_nickname != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, chatSetting.mis_hidden_nickname);
            }
            if (chatSetting.mis_auto_translate_version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, chatSetting.mis_auto_translate_version);
            }
            if (chatSetting.manonymous_user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, chatSetting.manonymous_user_id);
            }
            protoWriter.writeBytes(chatSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ChatSetting$a */
    public static final class C49690a extends Message.Builder<ChatSetting, C49690a> {

        /* renamed from: a */
        public Boolean f124410a;

        /* renamed from: b */
        public Long f124411b;

        /* renamed from: c */
        public CheckMessagePositionSetting.Enum f124412c;

        /* renamed from: d */
        public Boolean f124413d;

        /* renamed from: e */
        public Boolean f124414e;

        /* renamed from: f */
        public Long f124415f;

        /* renamed from: g */
        public Long f124416g;

        /* renamed from: a */
        public ChatSetting build() {
            return new ChatSetting(this.f124410a, this.f124411b, this.f124412c, this.f124413d, this.f124414e, this.f124415f, this.f124416g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49690a newBuilder() {
        C49690a aVar = new C49690a();
        aVar.f124410a = this.mis_remind;
        aVar.f124411b = this.mupdate_time;
        aVar.f124412c = this.mcheck_message_position;
        aVar.f124413d = this.mis_auto_translate;
        aVar.f124414e = this.mis_hidden_nickname;
        aVar.f124415f = this.mis_auto_translate_version;
        aVar.f124416g = this.manonymous_user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mis_remind != null) {
            sb.append(", is_remind=");
            sb.append(this.mis_remind);
        }
        if (this.mupdate_time != null) {
            sb.append(", update_time=");
            sb.append(this.mupdate_time);
        }
        if (this.mcheck_message_position != null) {
            sb.append(", check_message_position=");
            sb.append(this.mcheck_message_position);
        }
        if (this.mis_auto_translate != null) {
            sb.append(", is_auto_translate=");
            sb.append(this.mis_auto_translate);
        }
        if (this.mis_hidden_nickname != null) {
            sb.append(", is_hidden_nickname=");
            sb.append(this.mis_hidden_nickname);
        }
        if (this.mis_auto_translate_version != null) {
            sb.append(", is_auto_translate_version=");
            sb.append(this.mis_auto_translate_version);
        }
        if (this.manonymous_user_id != null) {
            sb.append(", anonymous_user_id=");
            sb.append(this.manonymous_user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatSetting{");
        replace.append('}');
        return replace.toString();
    }

    public ChatSetting(Boolean bool, Long l, CheckMessagePositionSetting.Enum r12, Boolean bool2, Boolean bool3, Long l2, Long l3) {
        this(bool, l, r12, bool2, bool3, l2, l3, ByteString.EMPTY);
    }

    public ChatSetting(Boolean bool, Long l, CheckMessagePositionSetting.Enum r4, Boolean bool2, Boolean bool3, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mis_remind = bool;
        this.mupdate_time = l;
        this.mcheck_message_position = r4;
        this.mis_auto_translate = bool2;
        this.mis_hidden_nickname = bool3;
        this.mis_auto_translate_version = l2;
        this.manonymous_user_id = l3;
    }
}
