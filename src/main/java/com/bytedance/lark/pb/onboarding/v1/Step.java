package com.bytedance.lark.pb.onboarding.v1;

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

public final class Step extends Message<Step, C18620a> {
    public static final ProtoAdapter<Step> ADAPTER = new C18621b();
    private static final long serialVersionUID = 0;
    public final Map<String, Slot> slots;
    public final String step_id;
    public final String step_name;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Step$b */
    private static final class C18621b extends ProtoAdapter<Step> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Slot>> f46130a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Slot.ADAPTER);

        C18621b() {
            super(FieldEncoding.LENGTH_DELIMITED, Step.class);
        }

        /* renamed from: a */
        public int encodedSize(Step step) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, step.step_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, step.step_name) + this.f46130a.encodedSizeWithTag(3, step.slots) + step.unknownFields().size();
        }

        /* renamed from: a */
        public Step decode(ProtoReader protoReader) throws IOException {
            C18620a aVar = new C18620a();
            aVar.f46127a = "";
            aVar.f46128b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46127a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46128b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46129c.putAll(this.f46130a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Step step) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, step.step_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, step.step_name);
            this.f46130a.encodeWithTag(protoWriter, 3, step.slots);
            protoWriter.writeBytes(step.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18620a newBuilder() {
        C18620a aVar = new C18620a();
        aVar.f46127a = this.step_id;
        aVar.f46128b = this.step_name;
        aVar.f46129c = Internal.copyOf("slots", this.slots);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Step$a */
    public static final class C18620a extends Message.Builder<Step, C18620a> {

        /* renamed from: a */
        public String f46127a;

        /* renamed from: b */
        public String f46128b;

        /* renamed from: c */
        public Map<String, Slot> f46129c = Internal.newMutableMap();

        /* renamed from: a */
        public Step build() {
            String str;
            String str2 = this.f46127a;
            if (str2 != null && (str = this.f46128b) != null) {
                return new Step(str2, str, this.f46129c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "step_id", this.f46128b, "step_name");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "Step");
        StringBuilder sb = new StringBuilder();
        sb.append(", step_id=");
        sb.append(this.step_id);
        sb.append(", step_name=");
        sb.append(this.step_name);
        if (!this.slots.isEmpty()) {
            sb.append(", slots=");
            sb.append(this.slots);
        }
        StringBuilder replace = sb.replace(0, 2, "Step{");
        replace.append('}');
        return replace.toString();
    }

    public Step(String str, String str2, Map<String, Slot> map) {
        this(str, str2, map, ByteString.EMPTY);
    }

    public Step(String str, String str2, Map<String, Slot> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.step_id = str;
        this.step_name = str2;
        this.slots = Internal.immutableCopyOf("slots", map);
    }
}
