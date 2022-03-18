package com.ss.android.lark.pb.device;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullDeviceBasicModeSettingResponse extends Message<PullDeviceBasicModeSettingResponse, C49610a> {
    public static final ProtoAdapter<PullDeviceBasicModeSettingResponse> ADAPTER = new C49611b();
    public static final Boolean DEFAULT_BASIC_MODE_STATUS = false;
    private static final long serialVersionUID = 0;
    public final Boolean mbasic_mode_status;

    /* renamed from: com.ss.android.lark.pb.device.PullDeviceBasicModeSettingResponse$b */
    private static final class C49611b extends ProtoAdapter<PullDeviceBasicModeSettingResponse> {
        C49611b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullDeviceBasicModeSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullDeviceBasicModeSettingResponse pullDeviceBasicModeSettingResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, pullDeviceBasicModeSettingResponse.mbasic_mode_status) + pullDeviceBasicModeSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullDeviceBasicModeSettingResponse decode(ProtoReader protoReader) throws IOException {
            C49610a aVar = new C49610a();
            aVar.f124239a = false;
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
                    aVar.f124239a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullDeviceBasicModeSettingResponse pullDeviceBasicModeSettingResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pullDeviceBasicModeSettingResponse.mbasic_mode_status);
            protoWriter.writeBytes(pullDeviceBasicModeSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.device.PullDeviceBasicModeSettingResponse$a */
    public static final class C49610a extends Message.Builder<PullDeviceBasicModeSettingResponse, C49610a> {

        /* renamed from: a */
        public Boolean f124239a;

        /* renamed from: a */
        public PullDeviceBasicModeSettingResponse build() {
            Boolean bool = this.f124239a;
            if (bool != null) {
                return new PullDeviceBasicModeSettingResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mbasic_mode_status");
        }
    }

    @Override // com.squareup.wire.Message
    public C49610a newBuilder() {
        C49610a aVar = new C49610a();
        aVar.f124239a = this.mbasic_mode_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", basic_mode_status=");
        sb.append(this.mbasic_mode_status);
        StringBuilder replace = sb.replace(0, 2, "PullDeviceBasicModeSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullDeviceBasicModeSettingResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public PullDeviceBasicModeSettingResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbasic_mode_status = bool;
    }
}
