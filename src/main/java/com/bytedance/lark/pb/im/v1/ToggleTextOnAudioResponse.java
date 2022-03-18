package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ToggleTextOnAudioResponse extends Message<ToggleTextOnAudioResponse, C18095a> {
    public static final ProtoAdapter<ToggleTextOnAudioResponse> ADAPTER = new C18096b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.ToggleTextOnAudioResponse$b */
    private static final class C18096b extends ProtoAdapter<ToggleTextOnAudioResponse> {
        C18096b() {
            super(FieldEncoding.LENGTH_DELIMITED, ToggleTextOnAudioResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ToggleTextOnAudioResponse toggleTextOnAudioResponse) {
            return toggleTextOnAudioResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ToggleTextOnAudioResponse decode(ProtoReader protoReader) throws IOException {
            C18095a aVar = new C18095a();
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
        public void encode(ProtoWriter protoWriter, ToggleTextOnAudioResponse toggleTextOnAudioResponse) throws IOException {
            protoWriter.writeBytes(toggleTextOnAudioResponse.unknownFields());
        }
    }

    public ToggleTextOnAudioResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ToggleTextOnAudioResponse$a */
    public static final class C18095a extends Message.Builder<ToggleTextOnAudioResponse, C18095a> {
        /* renamed from: a */
        public ToggleTextOnAudioResponse build() {
            return new ToggleTextOnAudioResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18095a newBuilder() {
        C18095a aVar = new C18095a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ToggleTextOnAudioResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "ToggleTextOnAudioResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ToggleTextOnAudioResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
