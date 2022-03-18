package com.ss.android.lark.pb.device;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PutDeviceBasicModeSettingRequest extends Message<PutDeviceBasicModeSettingRequest, C49612a> {
    public static final ProtoAdapter<PutDeviceBasicModeSettingRequest> ADAPTER = new C49613b();
    public static final Boolean DEFAULT_BASIC_MODE_STATUS = false;
    private static final long serialVersionUID = 0;
    public final Boolean mbasic_mode_status;

    /* renamed from: com.ss.android.lark.pb.device.PutDeviceBasicModeSettingRequest$b */
    private static final class C49613b extends ProtoAdapter<PutDeviceBasicModeSettingRequest> {
        C49613b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutDeviceBasicModeSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutDeviceBasicModeSettingRequest putDeviceBasicModeSettingRequest) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, putDeviceBasicModeSettingRequest.mbasic_mode_status) + putDeviceBasicModeSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutDeviceBasicModeSettingRequest decode(ProtoReader protoReader) throws IOException {
            C49612a aVar = new C49612a();
            aVar.f124240a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124240a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutDeviceBasicModeSettingRequest putDeviceBasicModeSettingRequest) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, putDeviceBasicModeSettingRequest.mbasic_mode_status);
            protoWriter.writeBytes(putDeviceBasicModeSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.device.PutDeviceBasicModeSettingRequest$a */
    public static final class C49612a extends Message.Builder<PutDeviceBasicModeSettingRequest, C49612a> {

        /* renamed from: a */
        public Boolean f124240a;

        /* renamed from: a */
        public PutDeviceBasicModeSettingRequest build() {
            Boolean bool = this.f124240a;
            if (bool != null) {
                return new PutDeviceBasicModeSettingRequest(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mbasic_mode_status");
        }

        /* renamed from: a */
        public C49612a mo172955a(Boolean bool) {
            this.f124240a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49612a newBuilder() {
        C49612a aVar = new C49612a();
        aVar.f124240a = this.mbasic_mode_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", basic_mode_status=");
        sb.append(this.mbasic_mode_status);
        StringBuilder replace = sb.replace(0, 2, "PutDeviceBasicModeSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutDeviceBasicModeSettingRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public PutDeviceBasicModeSettingRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbasic_mode_status = bool;
    }
}
