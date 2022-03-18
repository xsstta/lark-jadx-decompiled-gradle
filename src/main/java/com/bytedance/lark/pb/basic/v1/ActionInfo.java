package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ActionInfo extends Message<ActionInfo, C14648a> {
    public static final ProtoAdapter<ActionInfo> ADAPTER = new C14649b();
    public static final ActionCode DEFAULT_ACTION_CODE = ActionCode.UNKNOWN;
    public static final ActionOperateCode DEFAULT_OPERATOR_CODE = ActionOperateCode.UNKNOWN_OP;
    private static final long serialVersionUID = 0;
    public final ActionCode action_code;
    public final ActionExtraInfo extra;
    public final String i18n_text;
    public final ActionOperateCode operator_code;

    public enum ActionCode implements WireEnum {
        UNKNOWN(0),
        ACTION_NONE(1),
        ACTION_CONTACT_ADMIN(2),
        ACTION_APPLY_USE(3),
        ACTION_APPLY_VISIBLE(4);
        
        public static final ProtoAdapter<ActionCode> ADAPTER = ProtoAdapter.newEnumAdapter(ActionCode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionCode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ACTION_NONE;
            }
            if (i == 2) {
                return ACTION_CONTACT_ADMIN;
            }
            if (i == 3) {
                return ACTION_APPLY_USE;
            }
            if (i != 4) {
                return null;
            }
            return ACTION_APPLY_VISIBLE;
        }

        private ActionCode(int i) {
            this.value = i;
        }
    }

    public enum ActionOperateCode implements WireEnum {
        UNKNOWN_OP(0),
        CLOSE_WINDOW(1),
        CLOSE_APP(2);
        
        public static final ProtoAdapter<ActionOperateCode> ADAPTER = ProtoAdapter.newEnumAdapter(ActionOperateCode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionOperateCode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_OP;
            }
            if (i == 1) {
                return CLOSE_WINDOW;
            }
            if (i != 2) {
                return null;
            }
            return CLOSE_APP;
        }

        private ActionOperateCode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ActionInfo$b */
    private static final class C14649b extends ProtoAdapter<ActionInfo> {
        C14649b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionInfo actionInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (actionInfo.i18n_text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, actionInfo.i18n_text);
            } else {
                i = 0;
            }
            if (actionInfo.operator_code != null) {
                i2 = ActionOperateCode.ADAPTER.encodedSizeWithTag(2, actionInfo.operator_code);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (actionInfo.action_code != null) {
                i3 = ActionCode.ADAPTER.encodedSizeWithTag(3, actionInfo.action_code);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (actionInfo.extra != null) {
                i4 = ActionExtraInfo.ADAPTER.encodedSizeWithTag(4, actionInfo.extra);
            }
            return i6 + i4 + actionInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ActionInfo decode(ProtoReader protoReader) throws IOException {
            C14648a aVar = new C14648a();
            aVar.f38756a = "";
            aVar.f38757b = ActionOperateCode.UNKNOWN_OP;
            aVar.f38758c = ActionCode.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38756a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f38757b = ActionOperateCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f38758c = ActionCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38759d = ActionExtraInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionInfo actionInfo) throws IOException {
            if (actionInfo.i18n_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, actionInfo.i18n_text);
            }
            if (actionInfo.operator_code != null) {
                ActionOperateCode.ADAPTER.encodeWithTag(protoWriter, 2, actionInfo.operator_code);
            }
            if (actionInfo.action_code != null) {
                ActionCode.ADAPTER.encodeWithTag(protoWriter, 3, actionInfo.action_code);
            }
            if (actionInfo.extra != null) {
                ActionExtraInfo.ADAPTER.encodeWithTag(protoWriter, 4, actionInfo.extra);
            }
            protoWriter.writeBytes(actionInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ActionInfo$a */
    public static final class C14648a extends Message.Builder<ActionInfo, C14648a> {

        /* renamed from: a */
        public String f38756a;

        /* renamed from: b */
        public ActionOperateCode f38757b;

        /* renamed from: c */
        public ActionCode f38758c;

        /* renamed from: d */
        public ActionExtraInfo f38759d;

        /* renamed from: a */
        public ActionInfo build() {
            return new ActionInfo(this.f38756a, this.f38757b, this.f38758c, this.f38759d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14648a newBuilder() {
        C14648a aVar = new C14648a();
        aVar.f38756a = this.i18n_text;
        aVar.f38757b = this.operator_code;
        aVar.f38758c = this.action_code;
        aVar.f38759d = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ActionInfo");
        StringBuilder sb = new StringBuilder();
        if (this.i18n_text != null) {
            sb.append(", i18n_text=");
            sb.append(this.i18n_text);
        }
        if (this.operator_code != null) {
            sb.append(", operator_code=");
            sb.append(this.operator_code);
        }
        if (this.action_code != null) {
            sb.append(", action_code=");
            sb.append(this.action_code);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "ActionInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ActionInfo(String str, ActionOperateCode actionOperateCode, ActionCode actionCode, ActionExtraInfo actionExtraInfo) {
        this(str, actionOperateCode, actionCode, actionExtraInfo, ByteString.EMPTY);
    }

    public ActionInfo(String str, ActionOperateCode actionOperateCode, ActionCode actionCode, ActionExtraInfo actionExtraInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_text = str;
        this.operator_code = actionOperateCode;
        this.action_code = actionCode;
        this.extra = actionExtraInfo;
    }
}
