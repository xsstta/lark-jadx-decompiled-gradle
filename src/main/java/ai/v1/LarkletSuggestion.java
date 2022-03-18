package ai.v1;

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

public final class LarkletSuggestion extends Message<LarkletSuggestion, C0065a> {
    public static final ProtoAdapter<LarkletSuggestion> ADAPTER = new C0066b();
    public static final Action DEFAULT_ACTION = Action.LOAD;
    public static final Double DEFAULT_CONFIDENCE = Double.valueOf(0.0d);
    private static final long serialVersionUID = 0;
    public final Action action;
    public final Double confidence;
    public final String larklet_name;

    public enum Action implements WireEnum {
        LOAD(0),
        DESTROY(1);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return LOAD;
            }
            if (i != 1) {
                return null;
            }
            return DESTROY;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: ai.v1.LarkletSuggestion$b */
    private static final class C0066b extends ProtoAdapter<LarkletSuggestion> {
        C0066b() {
            super(FieldEncoding.LENGTH_DELIMITED, LarkletSuggestion.class);
        }

        /* renamed from: a */
        public int encodedSize(LarkletSuggestion larkletSuggestion) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, larkletSuggestion.larklet_name) + Action.ADAPTER.encodedSizeWithTag(2, larkletSuggestion.action);
            if (larkletSuggestion.confidence != null) {
                i = ProtoAdapter.DOUBLE.encodedSizeWithTag(3, larkletSuggestion.confidence);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + larkletSuggestion.unknownFields().size();
        }

        /* renamed from: a */
        public LarkletSuggestion decode(ProtoReader protoReader) throws IOException {
            C0065a aVar = new C0065a();
            aVar.f116a = "";
            aVar.f117b = Action.LOAD;
            aVar.f118c = Double.valueOf(0.0d);
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f116a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f117b = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f118c = ProtoAdapter.DOUBLE.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LarkletSuggestion larkletSuggestion) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, larkletSuggestion.larklet_name);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, larkletSuggestion.action);
            if (larkletSuggestion.confidence != null) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, larkletSuggestion.confidence);
            }
            protoWriter.writeBytes(larkletSuggestion.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0065a newBuilder() {
        C0065a aVar = new C0065a();
        aVar.f116a = this.larklet_name;
        aVar.f117b = this.action;
        aVar.f118c = this.confidence;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: ai.v1.LarkletSuggestion$a */
    public static final class C0065a extends Message.Builder<LarkletSuggestion, C0065a> {

        /* renamed from: a */
        public String f116a;

        /* renamed from: b */
        public Action f117b;

        /* renamed from: c */
        public Double f118c;

        /* renamed from: a */
        public LarkletSuggestion build() {
            Action action;
            String str = this.f116a;
            if (str != null && (action = this.f117b) != null) {
                return new LarkletSuggestion(str, action, this.f118c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "larklet_name", this.f117b, "action");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "LarkletSuggestion");
        StringBuilder sb = new StringBuilder();
        sb.append(", larklet_name=");
        sb.append(this.larklet_name);
        sb.append(", action=");
        sb.append(this.action);
        if (this.confidence != null) {
            sb.append(", confidence=");
            sb.append(this.confidence);
        }
        StringBuilder replace = sb.replace(0, 2, "LarkletSuggestion{");
        replace.append('}');
        return replace.toString();
    }

    public LarkletSuggestion(String str, Action action2, Double d) {
        this(str, action2, d, ByteString.EMPTY);
    }

    public LarkletSuggestion(String str, Action action2, Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        this.larklet_name = str;
        this.action = action2;
        this.confidence = d;
    }
}
