package as_setting;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetUserASSettingResponse extends Message<SetUserASSettingResponse, C1643a> {
    public static final ProtoAdapter<SetUserASSettingResponse> ADAPTER = new C1644b();
    private static final long serialVersionUID = 0;

    /* renamed from: as_setting.SetUserASSettingResponse$b */
    private static final class C1644b extends ProtoAdapter<SetUserASSettingResponse> {
        C1644b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserASSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserASSettingResponse setUserASSettingResponse) {
            return setUserASSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserASSettingResponse decode(ProtoReader protoReader) throws IOException {
            C1643a aVar = new C1643a();
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
        public void encode(ProtoWriter protoWriter, SetUserASSettingResponse setUserASSettingResponse) throws IOException {
            protoWriter.writeBytes(setUserASSettingResponse.unknownFields());
        }
    }

    public SetUserASSettingResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: as_setting.SetUserASSettingResponse$a */
    public static final class C1643a extends Message.Builder<SetUserASSettingResponse, C1643a> {
        /* renamed from: a */
        public SetUserASSettingResponse build() {
            return new SetUserASSettingResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C1643a newBuilder() {
        C1643a aVar = new C1643a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("as_setting", "SetUserASSettingResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetUserASSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserASSettingResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
