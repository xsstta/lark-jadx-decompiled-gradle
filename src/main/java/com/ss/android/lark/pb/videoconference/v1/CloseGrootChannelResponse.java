package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CloseGrootChannelResponse extends Message<CloseGrootChannelResponse, C50511a> {
    public static final ProtoAdapter<CloseGrootChannelResponse> ADAPTER = new C50512b();
    private static final long serialVersionUID = 0;
    public final PushGrootChannelStatus status;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CloseGrootChannelResponse$b */
    private static final class C50512b extends ProtoAdapter<CloseGrootChannelResponse> {
        C50512b() {
            super(FieldEncoding.LENGTH_DELIMITED, CloseGrootChannelResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CloseGrootChannelResponse closeGrootChannelResponse) {
            return PushGrootChannelStatus.ADAPTER.encodedSizeWithTag(1, closeGrootChannelResponse.status) + closeGrootChannelResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CloseGrootChannelResponse decode(ProtoReader protoReader) throws IOException {
            C50511a aVar = new C50511a();
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
                    aVar.f126101a = PushGrootChannelStatus.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CloseGrootChannelResponse closeGrootChannelResponse) throws IOException {
            PushGrootChannelStatus.ADAPTER.encodeWithTag(protoWriter, 1, closeGrootChannelResponse.status);
            protoWriter.writeBytes(closeGrootChannelResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CloseGrootChannelResponse$a */
    public static final class C50511a extends Message.Builder<CloseGrootChannelResponse, C50511a> {

        /* renamed from: a */
        public PushGrootChannelStatus f126101a;

        /* renamed from: a */
        public CloseGrootChannelResponse build() {
            PushGrootChannelStatus pushGrootChannelStatus = this.f126101a;
            if (pushGrootChannelStatus != null) {
                return new CloseGrootChannelResponse(pushGrootChannelStatus, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(pushGrootChannelStatus, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public C50511a newBuilder() {
        C50511a aVar = new C50511a();
        aVar.f126101a = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CloseGrootChannelResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        StringBuilder replace = sb.replace(0, 2, "CloseGrootChannelResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CloseGrootChannelResponse(PushGrootChannelStatus pushGrootChannelStatus) {
        this(pushGrootChannelStatus, ByteString.EMPTY);
    }

    public CloseGrootChannelResponse(PushGrootChannelStatus pushGrootChannelStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = pushGrootChannelStatus;
    }
}
