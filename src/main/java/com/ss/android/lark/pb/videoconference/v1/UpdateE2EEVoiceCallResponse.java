package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateE2EEVoiceCallResponse extends Message<UpdateE2EEVoiceCallResponse, C51128a> {
    public static final ProtoAdapter<UpdateE2EEVoiceCallResponse> ADAPTER = new C51129b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateE2EEVoiceCallResponse$b */
    private static final class C51129b extends ProtoAdapter<UpdateE2EEVoiceCallResponse> {
        C51129b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateE2EEVoiceCallResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateE2EEVoiceCallResponse updateE2EEVoiceCallResponse) {
            return updateE2EEVoiceCallResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateE2EEVoiceCallResponse decode(ProtoReader protoReader) throws IOException {
            C51128a aVar = new C51128a();
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
        public void encode(ProtoWriter protoWriter, UpdateE2EEVoiceCallResponse updateE2EEVoiceCallResponse) throws IOException {
            protoWriter.writeBytes(updateE2EEVoiceCallResponse.unknownFields());
        }
    }

    public UpdateE2EEVoiceCallResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateE2EEVoiceCallResponse$a */
    public static final class C51128a extends Message.Builder<UpdateE2EEVoiceCallResponse, C51128a> {
        /* renamed from: a */
        public UpdateE2EEVoiceCallResponse build() {
            return new UpdateE2EEVoiceCallResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51128a newBuilder() {
        C51128a aVar = new C51128a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateE2EEVoiceCallResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateE2EEVoiceCallResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateE2EEVoiceCallResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
