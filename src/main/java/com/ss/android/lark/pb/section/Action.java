package com.ss.android.lark.pb.section;

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

public final class Action extends Message<Action, C50048a> {
    public static final ProtoAdapter<Action> ADAPTER = new C50049b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> mparams;
    public final ActionType mtype;
    public final String muri;

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

    /* renamed from: com.ss.android.lark.pb.section.Action$a */
    public static final class C50048a extends Message.Builder<Action, C50048a> {

        /* renamed from: a */
        public ActionType f125163a;

        /* renamed from: b */
        public String f125164b;

        /* renamed from: c */
        public Map<String, String> f125165c = Internal.newMutableMap();

        /* renamed from: a */
        public Action build() {
            return new Action(this.f125163a, this.f125164b, this.f125165c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.section.Action$b */
    private static final class C50049b extends ProtoAdapter<Action> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f125166a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C50049b() {
            super(FieldEncoding.LENGTH_DELIMITED, Action.class);
        }

        /* renamed from: a */
        public int encodedSize(Action action) {
            int i;
            int i2 = 0;
            if (action.mtype != null) {
                i = ActionType.ADAPTER.encodedSizeWithTag(1, action.mtype);
            } else {
                i = 0;
            }
            if (action.muri != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, action.muri);
            }
            return i + i2 + this.f125166a.encodedSizeWithTag(3, action.mparams) + action.unknownFields().size();
        }

        /* renamed from: a */
        public Action decode(ProtoReader protoReader) throws IOException {
            C50048a aVar = new C50048a();
            aVar.f125164b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f125163a = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f125164b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125165c.putAll(this.f125166a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Action action) throws IOException {
            if (action.mtype != null) {
                ActionType.ADAPTER.encodeWithTag(protoWriter, 1, action.mtype);
            }
            if (action.muri != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, action.muri);
            }
            this.f125166a.encodeWithTag(protoWriter, 3, action.mparams);
            protoWriter.writeBytes(action.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50048a newBuilder() {
        C50048a aVar = new C50048a();
        aVar.f125163a = this.mtype;
        aVar.f125164b = this.muri;
        aVar.f125165c = Internal.copyOf("mparams", this.mparams);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.muri != null) {
            sb.append(", uri=");
            sb.append(this.muri);
        }
        if (!this.mparams.isEmpty()) {
            sb.append(", params=");
            sb.append(this.mparams);
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
        this.mtype = actionType;
        this.muri = str;
        this.mparams = Internal.immutableCopyOf("mparams", map);
    }
}
