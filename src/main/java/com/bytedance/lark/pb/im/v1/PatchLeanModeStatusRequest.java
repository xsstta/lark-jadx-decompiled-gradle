package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchLeanModeStatusRequest extends Message<PatchLeanModeStatusRequest, C17831a> {
    public static final ProtoAdapter<PatchLeanModeStatusRequest> ADAPTER = new C17832b();
    public static final Boolean DEFAULT_IS_ALL_DEVICE = false;
    public static final Boolean DEFAULT_IS_DEVICE_STATUS = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_all_device;
    public final Boolean is_device_status;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchLeanModeStatusRequest$b */
    private static final class C17832b extends ProtoAdapter<PatchLeanModeStatusRequest> {
        C17832b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchLeanModeStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchLeanModeStatusRequest patchLeanModeStatusRequest) {
            int i;
            int i2 = 0;
            if (patchLeanModeStatusRequest.is_device_status != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, patchLeanModeStatusRequest.is_device_status);
            } else {
                i = 0;
            }
            if (patchLeanModeStatusRequest.is_all_device != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, patchLeanModeStatusRequest.is_all_device);
            }
            return i + i2 + patchLeanModeStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchLeanModeStatusRequest decode(ProtoReader protoReader) throws IOException {
            C17831a aVar = new C17831a();
            aVar.f44890a = false;
            aVar.f44891b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44890a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44891b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchLeanModeStatusRequest patchLeanModeStatusRequest) throws IOException {
            if (patchLeanModeStatusRequest.is_device_status != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, patchLeanModeStatusRequest.is_device_status);
            }
            if (patchLeanModeStatusRequest.is_all_device != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, patchLeanModeStatusRequest.is_all_device);
            }
            protoWriter.writeBytes(patchLeanModeStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchLeanModeStatusRequest$a */
    public static final class C17831a extends Message.Builder<PatchLeanModeStatusRequest, C17831a> {

        /* renamed from: a */
        public Boolean f44890a;

        /* renamed from: b */
        public Boolean f44891b;

        /* renamed from: a */
        public PatchLeanModeStatusRequest build() {
            return new PatchLeanModeStatusRequest(this.f44890a, this.f44891b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17831a mo62152a(Boolean bool) {
            this.f44890a = bool;
            return this;
        }

        /* renamed from: b */
        public C17831a mo62154b(Boolean bool) {
            this.f44891b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17831a newBuilder() {
        C17831a aVar = new C17831a();
        aVar.f44890a = this.is_device_status;
        aVar.f44891b = this.is_all_device;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchLeanModeStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (this.is_device_status != null) {
            sb.append(", is_device_status=");
            sb.append(this.is_device_status);
        }
        if (this.is_all_device != null) {
            sb.append(", is_all_device=");
            sb.append(this.is_all_device);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchLeanModeStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchLeanModeStatusRequest(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public PatchLeanModeStatusRequest(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_device_status = bool;
        this.is_all_device = bool2;
    }
}
