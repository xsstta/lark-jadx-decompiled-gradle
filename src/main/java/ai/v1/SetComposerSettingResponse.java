package ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetComposerSettingResponse extends Message<SetComposerSettingResponse, C0075a> {
    public static final ProtoAdapter<SetComposerSettingResponse> ADAPTER = new C0076b();
    private static final long serialVersionUID = 0;

    /* renamed from: ai.v1.SetComposerSettingResponse$b */
    private static final class C0076b extends ProtoAdapter<SetComposerSettingResponse> {
        C0076b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetComposerSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetComposerSettingResponse setComposerSettingResponse) {
            return setComposerSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetComposerSettingResponse decode(ProtoReader protoReader) throws IOException {
            C0075a aVar = new C0075a();
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
        public void encode(ProtoWriter protoWriter, SetComposerSettingResponse setComposerSettingResponse) throws IOException {
            protoWriter.writeBytes(setComposerSettingResponse.unknownFields());
        }
    }

    public SetComposerSettingResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: ai.v1.SetComposerSettingResponse$a */
    public static final class C0075a extends Message.Builder<SetComposerSettingResponse, C0075a> {
        /* renamed from: a */
        public SetComposerSettingResponse build() {
            return new SetComposerSettingResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C0075a newBuilder() {
        C0075a aVar = new C0075a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "SetComposerSettingResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetComposerSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetComposerSettingResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
