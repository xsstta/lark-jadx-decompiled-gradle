package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetGuideToRateEventResponse extends Message<SetGuideToRateEventResponse, C19207a> {
    public static final ProtoAdapter<SetGuideToRateEventResponse> ADAPTER = new C19208b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetGuideToRateEventResponse$b */
    private static final class C19208b extends ProtoAdapter<SetGuideToRateEventResponse> {
        C19208b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetGuideToRateEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetGuideToRateEventResponse setGuideToRateEventResponse) {
            return setGuideToRateEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetGuideToRateEventResponse decode(ProtoReader protoReader) throws IOException {
            C19207a aVar = new C19207a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetGuideToRateEventResponse setGuideToRateEventResponse) throws IOException {
            protoWriter.writeBytes(setGuideToRateEventResponse.unknownFields());
        }
    }

    public SetGuideToRateEventResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetGuideToRateEventResponse$a */
    public static final class C19207a extends Message.Builder<SetGuideToRateEventResponse, C19207a> {
        /* renamed from: a */
        public SetGuideToRateEventResponse build() {
            return new SetGuideToRateEventResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19207a newBuilder() {
        C19207a aVar = new C19207a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SetGuideToRateEventResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetGuideToRateEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetGuideToRateEventResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
