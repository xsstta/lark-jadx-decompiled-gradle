package videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UploadEquipmentInfoResponse extends Message<UploadEquipmentInfoResponse, C70218a> {
    public static final ProtoAdapter<UploadEquipmentInfoResponse> ADAPTER = new C70219b();
    private static final long serialVersionUID = 0;

    /* renamed from: videoconference.v1.UploadEquipmentInfoResponse$b */
    private static final class C70219b extends ProtoAdapter<UploadEquipmentInfoResponse> {
        C70219b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadEquipmentInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadEquipmentInfoResponse uploadEquipmentInfoResponse) {
            return uploadEquipmentInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadEquipmentInfoResponse decode(ProtoReader protoReader) throws IOException {
            C70218a aVar = new C70218a();
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
        public void encode(ProtoWriter protoWriter, UploadEquipmentInfoResponse uploadEquipmentInfoResponse) throws IOException {
            protoWriter.writeBytes(uploadEquipmentInfoResponse.unknownFields());
        }
    }

    public UploadEquipmentInfoResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: videoconference.v1.UploadEquipmentInfoResponse$a */
    public static final class C70218a extends Message.Builder<UploadEquipmentInfoResponse, C70218a> {
        /* renamed from: a */
        public UploadEquipmentInfoResponse build() {
            return new UploadEquipmentInfoResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C70218a newBuilder() {
        C70218a aVar = new C70218a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UploadEquipmentInfoResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UploadEquipmentInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadEquipmentInfoResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
