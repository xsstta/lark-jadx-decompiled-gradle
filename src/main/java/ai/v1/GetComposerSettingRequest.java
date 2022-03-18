package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetComposerSettingRequest extends Message<GetComposerSettingRequest, C0053a> {
    public static final ProtoAdapter<GetComposerSettingRequest> ADAPTER = new C0054b();
    private static final long serialVersionUID = 0;

    /* renamed from: ai.v1.GetComposerSettingRequest$b */
    private static final class C0054b extends ProtoAdapter<GetComposerSettingRequest> {
        C0054b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetComposerSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetComposerSettingRequest getComposerSettingRequest) {
            return getComposerSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetComposerSettingRequest decode(ProtoReader protoReader) throws IOException {
            C0053a aVar = new C0053a();
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
        public void encode(ProtoWriter protoWriter, GetComposerSettingRequest getComposerSettingRequest) throws IOException {
            protoWriter.writeBytes(getComposerSettingRequest.unknownFields());
        }
    }

    public GetComposerSettingRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: ai.v1.GetComposerSettingRequest$a */
    public static final class C0053a extends Message.Builder<GetComposerSettingRequest, C0053a> {
        /* renamed from: a */
        public GetComposerSettingRequest build() {
            return new GetComposerSettingRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0053a newBuilder() {
        C0053a aVar = new C0053a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "GetComposerSettingRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetComposerSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetComposerSettingRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
