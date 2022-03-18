package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PushGuideToRateState extends Message<PushGuideToRateState, C19185a> {
    public static final ProtoAdapter<PushGuideToRateState> ADAPTER = new C19186b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> switches;

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushGuideToRateState$a */
    public static final class C19185a extends Message.Builder<PushGuideToRateState, C19185a> {

        /* renamed from: a */
        public Map<String, Boolean> f47343a = Internal.newMutableMap();

        /* renamed from: a */
        public PushGuideToRateState build() {
            return new PushGuideToRateState(this.f47343a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.PushGuideToRateState$b */
    private static final class C19186b extends ProtoAdapter<PushGuideToRateState> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f47344a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C19186b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushGuideToRateState.class);
        }

        /* renamed from: a */
        public int encodedSize(PushGuideToRateState pushGuideToRateState) {
            return this.f47344a.encodedSizeWithTag(1, pushGuideToRateState.switches) + pushGuideToRateState.unknownFields().size();
        }

        /* renamed from: a */
        public PushGuideToRateState decode(ProtoReader protoReader) throws IOException {
            C19185a aVar = new C19185a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47343a.putAll(this.f47344a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushGuideToRateState pushGuideToRateState) throws IOException {
            this.f47344a.encodeWithTag(protoWriter, 1, pushGuideToRateState.switches);
            protoWriter.writeBytes(pushGuideToRateState.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19185a newBuilder() {
        C19185a aVar = new C19185a();
        aVar.f47343a = Internal.copyOf("switches", this.switches);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "PushGuideToRateState");
        StringBuilder sb = new StringBuilder();
        if (!this.switches.isEmpty()) {
            sb.append(", switches=");
            sb.append(this.switches);
        }
        StringBuilder replace = sb.replace(0, 2, "PushGuideToRateState{");
        replace.append('}');
        return replace.toString();
    }

    public PushGuideToRateState(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public PushGuideToRateState(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switches = Internal.immutableCopyOf("switches", map);
    }
}
