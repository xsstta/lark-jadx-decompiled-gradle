package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AITextCorrectionResult extends Message<AITextCorrectionResult, C49421a> {
    public static final ProtoAdapter<AITextCorrectionResult> ADAPTER = new C49422b();
    public static final Boolean DEFAULT_NO_UPDATE = false;
    private static final long serialVersionUID = 0;
    public final String mcorrection_id;
    public final List<AITextCorrectionMatch> mmatches;
    public final Boolean mno_update;

    /* renamed from: com.ss.android.lark.pb.ai.AITextCorrectionResult$b */
    private static final class C49422b extends ProtoAdapter<AITextCorrectionResult> {
        C49422b() {
            super(FieldEncoding.LENGTH_DELIMITED, AITextCorrectionResult.class);
        }

        /* renamed from: a */
        public int encodedSize(AITextCorrectionResult aITextCorrectionResult) {
            int i;
            int encodedSizeWithTag = AITextCorrectionMatch.ADAPTER.asRepeated().encodedSizeWithTag(1, aITextCorrectionResult.mmatches) + ProtoAdapter.STRING.encodedSizeWithTag(2, aITextCorrectionResult.mcorrection_id);
            if (aITextCorrectionResult.mno_update != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(3, aITextCorrectionResult.mno_update);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + aITextCorrectionResult.unknownFields().size();
        }

        /* renamed from: a */
        public AITextCorrectionResult decode(ProtoReader protoReader) throws IOException {
            C49421a aVar = new C49421a();
            aVar.f123963b = "";
            aVar.f123964c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f123962a.add(AITextCorrectionMatch.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f123963b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f123964c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AITextCorrectionResult aITextCorrectionResult) throws IOException {
            AITextCorrectionMatch.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, aITextCorrectionResult.mmatches);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, aITextCorrectionResult.mcorrection_id);
            if (aITextCorrectionResult.mno_update != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, aITextCorrectionResult.mno_update);
            }
            protoWriter.writeBytes(aITextCorrectionResult.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49421a newBuilder() {
        C49421a aVar = new C49421a();
        aVar.f123962a = Internal.copyOf("mmatches", this.mmatches);
        aVar.f123963b = this.mcorrection_id;
        aVar.f123964c = this.mno_update;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.AITextCorrectionResult$a */
    public static final class C49421a extends Message.Builder<AITextCorrectionResult, C49421a> {

        /* renamed from: a */
        public List<AITextCorrectionMatch> f123962a = Internal.newMutableList();

        /* renamed from: b */
        public String f123963b;

        /* renamed from: c */
        public Boolean f123964c;

        /* renamed from: a */
        public AITextCorrectionResult build() {
            String str = this.f123963b;
            if (str != null) {
                return new AITextCorrectionResult(this.f123962a, str, this.f123964c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mcorrection_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mmatches.isEmpty()) {
            sb.append(", matches=");
            sb.append(this.mmatches);
        }
        sb.append(", correction_id=");
        sb.append(this.mcorrection_id);
        if (this.mno_update != null) {
            sb.append(", no_update=");
            sb.append(this.mno_update);
        }
        StringBuilder replace = sb.replace(0, 2, "AITextCorrectionResult{");
        replace.append('}');
        return replace.toString();
    }

    public AITextCorrectionResult(List<AITextCorrectionMatch> list, String str, Boolean bool) {
        this(list, str, bool, ByteString.EMPTY);
    }

    public AITextCorrectionResult(List<AITextCorrectionMatch> list, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmatches = Internal.immutableCopyOf("mmatches", list);
        this.mcorrection_id = str;
        this.mno_update = bool;
    }
}
