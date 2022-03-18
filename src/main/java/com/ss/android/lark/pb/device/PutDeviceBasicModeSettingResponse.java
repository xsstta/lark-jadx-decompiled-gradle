package com.ss.android.lark.pb.device;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutDeviceBasicModeSettingResponse extends Message<PutDeviceBasicModeSettingResponse, C49614a> {
    public static final ProtoAdapter<PutDeviceBasicModeSettingResponse> ADAPTER = new C49615b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.device.PutDeviceBasicModeSettingResponse$b */
    private static final class C49615b extends ProtoAdapter<PutDeviceBasicModeSettingResponse> {
        C49615b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutDeviceBasicModeSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutDeviceBasicModeSettingResponse putDeviceBasicModeSettingResponse) {
            return putDeviceBasicModeSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutDeviceBasicModeSettingResponse decode(ProtoReader protoReader) throws IOException {
            C49614a aVar = new C49614a();
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
        public void encode(ProtoWriter protoWriter, PutDeviceBasicModeSettingResponse putDeviceBasicModeSettingResponse) throws IOException {
            protoWriter.writeBytes(putDeviceBasicModeSettingResponse.unknownFields());
        }
    }

    public PutDeviceBasicModeSettingResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.device.PutDeviceBasicModeSettingResponse$a */
    public static final class C49614a extends Message.Builder<PutDeviceBasicModeSettingResponse, C49614a> {
        /* renamed from: a */
        public PutDeviceBasicModeSettingResponse build() {
            return new PutDeviceBasicModeSettingResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49614a newBuilder() {
        C49614a aVar = new C49614a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PutDeviceBasicModeSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutDeviceBasicModeSettingResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
