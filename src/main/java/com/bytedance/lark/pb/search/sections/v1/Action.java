package com.bytedance.lark.pb.search.sections.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class Action extends Message<Action, C18789a> {
    public static final ProtoAdapter<Action> ADAPTER = new C18790b();
    public static final ActionType DEFAULT_TYPE = ActionType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Map<String, String> params;
    public final ActionType type;
    public final String uri;

    public enum ActionType implements WireEnum {
        UNKNOWN(0),
        SEARCH_INSIDE(1),
        SEARCH_OUTSIDE(2);
        
        public static final ProtoAdapter<ActionType> ADAPTER = ProtoAdapter.newEnumAdapter(ActionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SEARCH_INSIDE;
            }
            if (i != 2) {
                return null;
            }
            return SEARCH_OUTSIDE;
        }

        private ActionType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.Action$a */
    public static final class C18789a extends Message.Builder<Action, C18789a> {

        /* renamed from: a */
        public ActionType f46348a;

        /* renamed from: b */
        public String f46349b;

        /* renamed from: c */
        public Map<String, String> f46350c = Internal.newMutableMap();

        /* renamed from: a */
        public Action build() {
            return new Action(this.f46348a, this.f46349b, this.f46350c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.sections.v1.Action$b */
    private static final class C18790b extends ProtoAdapter<Action> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f46351a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18790b() {
            super(FieldEncoding.LENGTH_DELIMITED, Action.class);
        }

        /* renamed from: a */
        public int encodedSize(Action action) {
            int i;
            int i2 = 0;
            if (action.type != null) {
                i = ActionType.ADAPTER.encodedSizeWithTag(1, action.type);
            } else {
                i = 0;
            }
            if (action.uri != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, action.uri);
            }
            return i + i2 + this.f46351a.encodedSizeWithTag(3, action.params) + action.unknownFields().size();
        }

        /* renamed from: a */
        public Action decode(ProtoReader protoReader) throws IOException {
            C18789a aVar = new C18789a();
            aVar.f46348a = ActionType.UNKNOWN;
            aVar.f46349b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46348a = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46349b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46350c.putAll(this.f46351a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Action action) throws IOException {
            if (action.type != null) {
                ActionType.ADAPTER.encodeWithTag(protoWriter, 1, action.type);
            }
            if (action.uri != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, action.uri);
            }
            this.f46351a.encodeWithTag(protoWriter, 3, action.params);
            protoWriter.writeBytes(action.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18789a newBuilder() {
        C18789a aVar = new C18789a();
        aVar.f46348a = this.type;
        aVar.f46349b = this.uri;
        aVar.f46350c = Internal.copyOf("params", this.params);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "Action");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        StringBuilder replace = sb.replace(0, 2, "Action{");
        replace.append('}');
        return replace.toString();
    }

    public Action(ActionType actionType, String str, Map<String, String> map) {
        this(actionType, str, map, ByteString.EMPTY);
    }

    public Action(ActionType actionType, String str, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = actionType;
        this.uri = str;
        this.params = Internal.immutableCopyOf("params", map);
    }
}
