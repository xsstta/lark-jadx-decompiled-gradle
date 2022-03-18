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

public final class PushProductGuide extends Message<PushProductGuide, C18610a> {
    public static final ProtoAdapter<PushProductGuide> ADAPTER = new C18611b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> guides;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PushProductGuide$a */
    public static final class C18610a extends Message.Builder<PushProductGuide, C18610a> {

        /* renamed from: a */
        public Map<String, Boolean> f46113a = Internal.newMutableMap();

        /* renamed from: a */
        public PushProductGuide build() {
            return new PushProductGuide(this.f46113a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.PushProductGuide$b */
    private static final class C18611b extends ProtoAdapter<PushProductGuide> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f46114a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C18611b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushProductGuide.class);
        }

        /* renamed from: a */
        public int encodedSize(PushProductGuide pushProductGuide) {
            return this.f46114a.encodedSizeWithTag(1, pushProductGuide.guides) + pushProductGuide.unknownFields().size();
        }

        /* renamed from: a */
        public PushProductGuide decode(ProtoReader protoReader) throws IOException {
            C18610a aVar = new C18610a();
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
                    aVar.f46113a.putAll(this.f46114a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushProductGuide pushProductGuide) throws IOException {
            this.f46114a.encodeWithTag(protoWriter, 1, pushProductGuide.guides);
            protoWriter.writeBytes(pushProductGuide.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18610a newBuilder() {
        C18610a aVar = new C18610a();
        aVar.f46113a = Internal.copyOf("guides", this.guides);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "PushProductGuide");
        StringBuilder sb = new StringBuilder();
        if (!this.guides.isEmpty()) {
            sb.append(", guides=");
            sb.append(this.guides);
        }
        StringBuilder replace = sb.replace(0, 2, "PushProductGuide{");
        replace.append('}');
        return replace.toString();
    }

    public PushProductGuide(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public PushProductGuide(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guides = Internal.immutableCopyOf("guides", map);
    }
}
