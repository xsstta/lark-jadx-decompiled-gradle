package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class ActionInfo extends Message<ActionInfo, C49638a> {
    public static final ProtoAdapter<ActionInfo> ADAPTER = new C49639b();
    private static final long serialVersionUID = 0;
    public final ActionCode maction_code;
    public final ActionExtraInfo mextra;
    public final Map<String, String> mi18n_text;
    public final ActionOperateCode moperator_code;

    public enum ActionCode implements WireEnum {
        ACTION_NONE(0),
        ACTION_CONTACT_ADMIN(1),
        ACTION_APPLY_USE(2);
        
        public static final ProtoAdapter<ActionCode> ADAPTER = ProtoAdapter.newEnumAdapter(ActionCode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionCode fromValue(int i) {
            if (i == 0) {
                return ACTION_NONE;
            }
            if (i == 1) {
                return ACTION_CONTACT_ADMIN;
            }
            if (i != 2) {
                return null;
            }
            return ACTION_APPLY_USE;
        }

        private ActionCode(int i) {
            this.value = i;
        }
    }

    public enum ActionOperateCode implements WireEnum {
        CLOSE_WINDOW(1),
        CLOSE_APP(2);
        
        public static final ProtoAdapter<ActionOperateCode> ADAPTER = ProtoAdapter.newEnumAdapter(ActionOperateCode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionOperateCode fromValue(int i) {
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

    /* renamed from: com.ss.android.lark.pb.entities.ActionInfo$a */
    public static final class C49638a extends Message.Builder<ActionInfo, C49638a> {

        /* renamed from: a */
        public Map<String, String> f124284a = Internal.newMutableMap();

        /* renamed from: b */
        public ActionOperateCode f124285b;

        /* renamed from: c */
        public ActionCode f124286c;

        /* renamed from: d */
        public ActionExtraInfo f124287d;

        /* renamed from: a */
        public ActionInfo build() {
            return new ActionInfo(this.f124284a, this.f124285b, this.f124286c, this.f124287d, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ActionInfo$b */
    private static final class C49639b extends ProtoAdapter<ActionInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124288a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49639b() {
            super(FieldEncoding.LENGTH_DELIMITED, ActionInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ActionInfo actionInfo) {
            int i;
            int i2;
            int encodedSizeWithTag = this.f124288a.encodedSizeWithTag(1, actionInfo.mi18n_text);
            int i3 = 0;
            if (actionInfo.moperator_code != null) {
                i = ActionOperateCode.ADAPTER.encodedSizeWithTag(2, actionInfo.moperator_code);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (actionInfo.maction_code != null) {
                i2 = ActionCode.ADAPTER.encodedSizeWithTag(3, actionInfo.maction_code);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (actionInfo.mextra != null) {
                i3 = ActionExtraInfo.ADAPTER.encodedSizeWithTag(4, actionInfo.mextra);
            }
            return i5 + i3 + actionInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ActionInfo decode(ProtoReader protoReader) throws IOException {
            C49638a aVar = new C49638a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124284a.putAll(this.f124288a.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        aVar.f124285b = ActionOperateCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        aVar.f124286c = ActionCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124287d = ActionExtraInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ActionInfo actionInfo) throws IOException {
            this.f124288a.encodeWithTag(protoWriter, 1, actionInfo.mi18n_text);
            if (actionInfo.moperator_code != null) {
                ActionOperateCode.ADAPTER.encodeWithTag(protoWriter, 2, actionInfo.moperator_code);
            }
            if (actionInfo.maction_code != null) {
                ActionCode.ADAPTER.encodeWithTag(protoWriter, 3, actionInfo.maction_code);
            }
            if (actionInfo.mextra != null) {
                ActionExtraInfo.ADAPTER.encodeWithTag(protoWriter, 4, actionInfo.mextra);
            }
            protoWriter.writeBytes(actionInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49638a newBuilder() {
        C49638a aVar = new C49638a();
        aVar.f124284a = Internal.copyOf("mi18n_text", this.mi18n_text);
        aVar.f124285b = this.moperator_code;
        aVar.f124286c = this.maction_code;
        aVar.f124287d = this.mextra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mi18n_text.isEmpty()) {
            sb.append(", i18n_text=");
            sb.append(this.mi18n_text);
        }
        if (this.moperator_code != null) {
            sb.append(", operator_code=");
            sb.append(this.moperator_code);
        }
        if (this.maction_code != null) {
            sb.append(", action_code=");
            sb.append(this.maction_code);
        }
        if (this.mextra != null) {
            sb.append(", extra=");
            sb.append(this.mextra);
        }
        StringBuilder replace = sb.replace(0, 2, "ActionInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ActionInfo(Map<String, String> map, ActionOperateCode actionOperateCode, ActionCode actionCode, ActionExtraInfo actionExtraInfo) {
        this(map, actionOperateCode, actionCode, actionExtraInfo, ByteString.EMPTY);
    }

    public ActionInfo(Map<String, String> map, ActionOperateCode actionOperateCode, ActionCode actionCode, ActionExtraInfo actionExtraInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mi18n_text = Internal.immutableCopyOf("mi18n_text", map);
        this.moperator_code = actionOperateCode;
        this.maction_code = actionCode;
        this.mextra = actionExtraInfo;
    }
}
