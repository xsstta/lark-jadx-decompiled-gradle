package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetSmartReplySettingResponse extends Message<SetSmartReplySettingResponse, C49517a> {
    public static final ProtoAdapter<SetSmartReplySettingResponse> ADAPTER = new C49518b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.ai.SetSmartReplySettingResponse$b */
    private static final class C49518b extends ProtoAdapter<SetSmartReplySettingResponse> {
        C49518b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSmartReplySettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSmartReplySettingResponse setSmartReplySettingResponse) {
            return setSmartReplySettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetSmartReplySettingResponse decode(ProtoReader protoReader) throws IOException {
            C49517a aVar = new C49517a();
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
        public void encode(ProtoWriter protoWriter, SetSmartReplySettingResponse setSmartReplySettingResponse) throws IOException {
            protoWriter.writeBytes(setSmartReplySettingResponse.unknownFields());
        }
    }

    public SetSmartReplySettingResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.ai.SetSmartReplySettingResponse$a */
    public static final class C49517a extends Message.Builder<SetSmartReplySettingResponse, C49517a> {
        /* renamed from: a */
        public SetSmartReplySettingResponse build() {
            return new SetSmartReplySettingResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49517a newBuilder() {
        C49517a aVar = new C49517a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetSmartReplySettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetSmartReplySettingResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
