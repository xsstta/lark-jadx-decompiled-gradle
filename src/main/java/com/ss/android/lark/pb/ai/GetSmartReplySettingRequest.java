package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetSmartReplySettingRequest extends Message<GetSmartReplySettingRequest, C49475a> {
    public static final ProtoAdapter<GetSmartReplySettingRequest> ADAPTER = new C49476b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.ai.GetSmartReplySettingRequest$b */
    private static final class C49476b extends ProtoAdapter<GetSmartReplySettingRequest> {
        C49476b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSmartReplySettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSmartReplySettingRequest getSmartReplySettingRequest) {
            return getSmartReplySettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSmartReplySettingRequest decode(ProtoReader protoReader) throws IOException {
            C49475a aVar = new C49475a();
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
        public void encode(ProtoWriter protoWriter, GetSmartReplySettingRequest getSmartReplySettingRequest) throws IOException {
            protoWriter.writeBytes(getSmartReplySettingRequest.unknownFields());
        }
    }

    public GetSmartReplySettingRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetSmartReplySettingRequest$a */
    public static final class C49475a extends Message.Builder<GetSmartReplySettingRequest, C49475a> {
        /* renamed from: a */
        public GetSmartReplySettingRequest build() {
            return new GetSmartReplySettingRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49475a newBuilder() {
        C49475a aVar = new C49475a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetSmartReplySettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSmartReplySettingRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
