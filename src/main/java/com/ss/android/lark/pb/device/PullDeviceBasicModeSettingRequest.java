package com.ss.android.lark.pb.device;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullDeviceBasicModeSettingRequest extends Message<PullDeviceBasicModeSettingRequest, C49608a> {
    public static final ProtoAdapter<PullDeviceBasicModeSettingRequest> ADAPTER = new C49609b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.device.PullDeviceBasicModeSettingRequest$b */
    private static final class C49609b extends ProtoAdapter<PullDeviceBasicModeSettingRequest> {
        C49609b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullDeviceBasicModeSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullDeviceBasicModeSettingRequest pullDeviceBasicModeSettingRequest) {
            return pullDeviceBasicModeSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullDeviceBasicModeSettingRequest decode(ProtoReader protoReader) throws IOException {
            C49608a aVar = new C49608a();
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
        public void encode(ProtoWriter protoWriter, PullDeviceBasicModeSettingRequest pullDeviceBasicModeSettingRequest) throws IOException {
            protoWriter.writeBytes(pullDeviceBasicModeSettingRequest.unknownFields());
        }
    }

    public PullDeviceBasicModeSettingRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.device.PullDeviceBasicModeSettingRequest$a */
    public static final class C49608a extends Message.Builder<PullDeviceBasicModeSettingRequest, C49608a> {
        /* renamed from: a */
        public PullDeviceBasicModeSettingRequest build() {
            return new PullDeviceBasicModeSettingRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49608a newBuilder() {
        C49608a aVar = new C49608a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullDeviceBasicModeSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullDeviceBasicModeSettingRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
