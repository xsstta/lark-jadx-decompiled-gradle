package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MessengerNotificationSetting extends Message<MessengerNotificationSetting, C19171a> {
    public static final ProtoAdapter<MessengerNotificationSetting> ADAPTER = new C19172b();
    public static final Boolean DEFAULT_BUZZ_OPEN = false;
    public static final Boolean DEFAULT_GROUP_CHAT_OPEN = false;
    public static final Boolean DEFAULT_MENTION_ALL_OPEN = false;
    public static final Boolean DEFAULT_MENTION_OPEN = false;
    public static final Boolean DEFAULT_P2P_CHAT_OPEN = false;
    public static final Boolean DEFAULT_REACTION_OPEN = false;
    public static final SwithState DEFAULT_SWITCH_STATE = SwithState.UNKNOWN_STATE;
    public static final Boolean DEFAULT_USER_P2P_CHAT_OPEN = false;
    private static final long serialVersionUID = 0;
    public final Boolean buzz_open;
    public final Boolean group_chat_open;
    public final Boolean mention_all_open;
    public final Boolean mention_open;
    public final Boolean p2p_chat_open;
    public final Boolean reaction_open;
    public final SwithState switch_state;
    public final Boolean user_p2p_chat_open;

    public enum SwithState implements WireEnum {
        UNKNOWN_STATE(0),
        CLOSED(1),
        HALF_OPEN(2),
        OPEN(3);
        
        public static final ProtoAdapter<SwithState> ADAPTER = ProtoAdapter.newEnumAdapter(SwithState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SwithState fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_STATE;
            }
            if (i == 1) {
                return CLOSED;
            }
            if (i == 2) {
                return HALF_OPEN;
            }
            if (i != 3) {
                return null;
            }
            return OPEN;
        }

        private SwithState(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.MessengerNotificationSetting$b */
    private static final class C19172b extends ProtoAdapter<MessengerNotificationSetting> {
        C19172b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessengerNotificationSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(MessengerNotificationSetting messengerNotificationSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = SwithState.ADAPTER.encodedSizeWithTag(1, messengerNotificationSetting.switch_state);
            int i7 = 0;
            if (messengerNotificationSetting.buzz_open != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, messengerNotificationSetting.buzz_open);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (messengerNotificationSetting.reaction_open != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, messengerNotificationSetting.reaction_open);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (messengerNotificationSetting.mention_open != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, messengerNotificationSetting.mention_open);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (messengerNotificationSetting.p2p_chat_open != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, messengerNotificationSetting.p2p_chat_open);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (messengerNotificationSetting.group_chat_open != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, messengerNotificationSetting.group_chat_open);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (messengerNotificationSetting.user_p2p_chat_open != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, messengerNotificationSetting.user_p2p_chat_open);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (messengerNotificationSetting.mention_all_open != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, messengerNotificationSetting.mention_all_open);
            }
            return i13 + i7 + messengerNotificationSetting.unknownFields().size();
        }

        /* renamed from: a */
        public MessengerNotificationSetting decode(ProtoReader protoReader) throws IOException {
            C19171a aVar = new C19171a();
            aVar.f47318a = SwithState.UNKNOWN_STATE;
            aVar.f47319b = false;
            aVar.f47320c = false;
            aVar.f47321d = false;
            aVar.f47322e = false;
            aVar.f47323f = false;
            aVar.f47324g = false;
            aVar.f47325h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f47318a = SwithState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f47319b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47320c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47321d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47322e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47323f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47324g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47325h = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MessengerNotificationSetting messengerNotificationSetting) throws IOException {
            SwithState.ADAPTER.encodeWithTag(protoWriter, 1, messengerNotificationSetting.switch_state);
            if (messengerNotificationSetting.buzz_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, messengerNotificationSetting.buzz_open);
            }
            if (messengerNotificationSetting.reaction_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, messengerNotificationSetting.reaction_open);
            }
            if (messengerNotificationSetting.mention_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, messengerNotificationSetting.mention_open);
            }
            if (messengerNotificationSetting.p2p_chat_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, messengerNotificationSetting.p2p_chat_open);
            }
            if (messengerNotificationSetting.group_chat_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, messengerNotificationSetting.group_chat_open);
            }
            if (messengerNotificationSetting.user_p2p_chat_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, messengerNotificationSetting.user_p2p_chat_open);
            }
            if (messengerNotificationSetting.mention_all_open != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, messengerNotificationSetting.mention_all_open);
            }
            protoWriter.writeBytes(messengerNotificationSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.MessengerNotificationSetting$a */
    public static final class C19171a extends Message.Builder<MessengerNotificationSetting, C19171a> {

        /* renamed from: a */
        public SwithState f47318a;

        /* renamed from: b */
        public Boolean f47319b;

        /* renamed from: c */
        public Boolean f47320c;

        /* renamed from: d */
        public Boolean f47321d;

        /* renamed from: e */
        public Boolean f47322e;

        /* renamed from: f */
        public Boolean f47323f;

        /* renamed from: g */
        public Boolean f47324g;

        /* renamed from: h */
        public Boolean f47325h;

        /* renamed from: a */
        public MessengerNotificationSetting build() {
            SwithState swithState = this.f47318a;
            if (swithState != null) {
                return new MessengerNotificationSetting(swithState, this.f47319b, this.f47320c, this.f47321d, this.f47322e, this.f47323f, this.f47324g, this.f47325h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(swithState, "switch_state");
        }

        /* renamed from: a */
        public C19171a mo65495a(SwithState swithState) {
            this.f47318a = swithState;
            return this;
        }

        /* renamed from: b */
        public C19171a mo65498b(Boolean bool) {
            this.f47321d = bool;
            return this;
        }

        /* renamed from: c */
        public C19171a mo65499c(Boolean bool) {
            this.f47324g = bool;
            return this;
        }

        /* renamed from: d */
        public C19171a mo65500d(Boolean bool) {
            this.f47325h = bool;
            return this;
        }

        /* renamed from: a */
        public C19171a mo65496a(Boolean bool) {
            this.f47319b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19171a newBuilder() {
        C19171a aVar = new C19171a();
        aVar.f47318a = this.switch_state;
        aVar.f47319b = this.buzz_open;
        aVar.f47320c = this.reaction_open;
        aVar.f47321d = this.mention_open;
        aVar.f47322e = this.p2p_chat_open;
        aVar.f47323f = this.group_chat_open;
        aVar.f47324g = this.user_p2p_chat_open;
        aVar.f47325h = this.mention_all_open;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "MessengerNotificationSetting");
        StringBuilder sb = new StringBuilder();
        sb.append(", switch_state=");
        sb.append(this.switch_state);
        if (this.buzz_open != null) {
            sb.append(", buzz_open=");
            sb.append(this.buzz_open);
        }
        if (this.reaction_open != null) {
            sb.append(", reaction_open=");
            sb.append(this.reaction_open);
        }
        if (this.mention_open != null) {
            sb.append(", mention_open=");
            sb.append(this.mention_open);
        }
        if (this.p2p_chat_open != null) {
            sb.append(", p2p_chat_open=");
            sb.append(this.p2p_chat_open);
        }
        if (this.group_chat_open != null) {
            sb.append(", group_chat_open=");
            sb.append(this.group_chat_open);
        }
        if (this.user_p2p_chat_open != null) {
            sb.append(", user_p2p_chat_open=");
            sb.append(this.user_p2p_chat_open);
        }
        if (this.mention_all_open != null) {
            sb.append(", mention_all_open=");
            sb.append(this.mention_all_open);
        }
        StringBuilder replace = sb.replace(0, 2, "MessengerNotificationSetting{");
        replace.append('}');
        return replace.toString();
    }

    public MessengerNotificationSetting(SwithState swithState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this(swithState, bool, bool2, bool3, bool4, bool5, bool6, bool7, ByteString.EMPTY);
    }

    public MessengerNotificationSetting(SwithState swithState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switch_state = swithState;
        this.buzz_open = bool;
        this.reaction_open = bool2;
        this.mention_open = bool3;
        this.p2p_chat_open = bool4;
        this.group_chat_open = bool5;
        this.user_p2p_chat_open = bool6;
        this.mention_all_open = bool7;
    }
}
