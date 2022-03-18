package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ExtendParam extends Message<ExtendParam, C16172a> {
    public static final ProtoAdapter<ExtendParam> ADAPTER = new C16173b();
    public static final ActionType DEFAULT_ACTION_TYPE = ActionType.UNKNOWN_ACTION;
    public static final Boolean DEFAULT_CAN_INVITE_SAME_CHAT_TAG = false;
    public static final Boolean DEFAULT_HAS_LEAD_PERM = false;
    public static final Boolean DEFAULT_NEED_USER_PROFILE_FIELDS = false;
    public static final Boolean DEFAULT_SELECT_ENTERPRISE_EMAIL = false;
    private static final long serialVersionUID = 0;
    public final ActionType action_type;
    public final Boolean can_invite_same_chat_tag;
    public final Boolean has_lead_perm;
    public final String in_chat_id;
    public final Boolean need_user_profile_fields;
    public final Boolean select_enterprise_email;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ExtendParam$b */
    private static final class C16173b extends ProtoAdapter<ExtendParam> {
        C16173b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtendParam.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtendParam extendParam) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (extendParam.in_chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, extendParam.in_chat_id);
            } else {
                i = 0;
            }
            if (extendParam.can_invite_same_chat_tag != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, extendParam.can_invite_same_chat_tag);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (extendParam.action_type != null) {
                i3 = ActionType.ADAPTER.encodedSizeWithTag(3, extendParam.action_type);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (extendParam.has_lead_perm != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, extendParam.has_lead_perm);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (extendParam.need_user_profile_fields != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, extendParam.need_user_profile_fields);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (extendParam.select_enterprise_email != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, extendParam.select_enterprise_email);
            }
            return i10 + i6 + extendParam.unknownFields().size();
        }

        /* renamed from: a */
        public ExtendParam decode(ProtoReader protoReader) throws IOException {
            C16172a aVar = new C16172a();
            aVar.f42303a = "";
            aVar.f42304b = false;
            aVar.f42305c = ActionType.UNKNOWN_ACTION;
            aVar.f42306d = false;
            aVar.f42307e = false;
            aVar.f42308f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42303a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42304b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f42305c = ActionType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f42306d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42307e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42308f = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ExtendParam extendParam) throws IOException {
            if (extendParam.in_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extendParam.in_chat_id);
            }
            if (extendParam.can_invite_same_chat_tag != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, extendParam.can_invite_same_chat_tag);
            }
            if (extendParam.action_type != null) {
                ActionType.ADAPTER.encodeWithTag(protoWriter, 3, extendParam.action_type);
            }
            if (extendParam.has_lead_perm != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, extendParam.has_lead_perm);
            }
            if (extendParam.need_user_profile_fields != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, extendParam.need_user_profile_fields);
            }
            if (extendParam.select_enterprise_email != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, extendParam.select_enterprise_email);
            }
            protoWriter.writeBytes(extendParam.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ExtendParam$a */
    public static final class C16172a extends Message.Builder<ExtendParam, C16172a> {

        /* renamed from: a */
        public String f42303a;

        /* renamed from: b */
        public Boolean f42304b;

        /* renamed from: c */
        public ActionType f42305c;

        /* renamed from: d */
        public Boolean f42306d;

        /* renamed from: e */
        public Boolean f42307e;

        /* renamed from: f */
        public Boolean f42308f;

        /* renamed from: a */
        public ExtendParam build() {
            return new ExtendParam(this.f42303a, this.f42304b, this.f42305c, this.f42306d, this.f42307e, this.f42308f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16172a mo58013a(ActionType actionType) {
            this.f42305c = actionType;
            return this;
        }

        /* renamed from: b */
        public C16172a mo58017b(Boolean bool) {
            this.f42306d = bool;
            return this;
        }

        /* renamed from: c */
        public C16172a mo58018c(Boolean bool) {
            this.f42307e = bool;
            return this;
        }

        /* renamed from: d */
        public C16172a mo58019d(Boolean bool) {
            this.f42308f = bool;
            return this;
        }

        /* renamed from: a */
        public C16172a mo58014a(Boolean bool) {
            this.f42304b = bool;
            return this;
        }

        /* renamed from: a */
        public C16172a mo58015a(String str) {
            this.f42303a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16172a newBuilder() {
        C16172a aVar = new C16172a();
        aVar.f42303a = this.in_chat_id;
        aVar.f42304b = this.can_invite_same_chat_tag;
        aVar.f42305c = this.action_type;
        aVar.f42306d = this.has_lead_perm;
        aVar.f42307e = this.need_user_profile_fields;
        aVar.f42308f = this.select_enterprise_email;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ExtendParam");
        StringBuilder sb = new StringBuilder();
        if (this.in_chat_id != null) {
            sb.append(", in_chat_id=");
            sb.append(this.in_chat_id);
        }
        if (this.can_invite_same_chat_tag != null) {
            sb.append(", can_invite_same_chat_tag=");
            sb.append(this.can_invite_same_chat_tag);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.has_lead_perm != null) {
            sb.append(", has_lead_perm=");
            sb.append(this.has_lead_perm);
        }
        if (this.need_user_profile_fields != null) {
            sb.append(", need_user_profile_fields=");
            sb.append(this.need_user_profile_fields);
        }
        if (this.select_enterprise_email != null) {
            sb.append(", select_enterprise_email=");
            sb.append(this.select_enterprise_email);
        }
        StringBuilder replace = sb.replace(0, 2, "ExtendParam{");
        replace.append('}');
        return replace.toString();
    }

    public ExtendParam(String str, Boolean bool, ActionType actionType, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(str, bool, actionType, bool2, bool3, bool4, ByteString.EMPTY);
    }

    public ExtendParam(String str, Boolean bool, ActionType actionType, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.in_chat_id = str;
        this.can_invite_same_chat_tag = bool;
        this.action_type = actionType;
        this.has_lead_perm = bool2;
        this.need_user_profile_fields = bool3;
        this.select_enterprise_email = bool4;
    }
}
