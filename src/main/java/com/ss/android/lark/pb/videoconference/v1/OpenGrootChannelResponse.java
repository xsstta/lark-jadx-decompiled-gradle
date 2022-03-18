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

public final class OpenGrootChannelResponse extends Message<OpenGrootChannelResponse, C50894a> {
    public static final ProtoAdapter<OpenGrootChannelResponse> ADAPTER = new C50895b();
    private static final long serialVersionUID = 0;
    public final PushGrootChannelStatus status;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.OpenGrootChannelResponse$b */
    private static final class C50895b extends ProtoAdapter<OpenGrootChannelResponse> {
        C50895b() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenGrootChannelResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(OpenGrootChannelResponse openGrootChannelResponse) {
            return PushGrootChannelStatus.ADAPTER.encodedSizeWithTag(1, openGrootChannelResponse.status) + openGrootChannelResponse.unknownFields().size();
        }

        /* renamed from: a */
        public OpenGrootChannelResponse decode(ProtoReader protoReader) throws IOException {
            C50894a aVar = new C50894a();
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
                    aVar.f126826a = PushGrootChannelStatus.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OpenGrootChannelResponse openGrootChannelResponse) throws IOException {
            PushGrootChannelStatus.ADAPTER.encodeWithTag(protoWriter, 1, openGrootChannelResponse.status);
            protoWriter.writeBytes(openGrootChannelResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.OpenGrootChannelResponse$a */
    public static final class C50894a extends Message.Builder<OpenGrootChannelResponse, C50894a> {

        /* renamed from: a */
        public PushGrootChannelStatus f126826a;

        /* renamed from: a */
        public OpenGrootChannelResponse build() {
            PushGrootChannelStatus pushGrootChannelStatus = this.f126826a;
            if (pushGrootChannelStatus != null) {
                return new OpenGrootChannelResponse(pushGrootChannelStatus, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(pushGrootChannelStatus, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public C50894a newBuilder() {
        C50894a aVar = new C50894a();
        aVar.f126826a = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "OpenGrootChannelResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        StringBuilder replace = sb.replace(0, 2, "OpenGrootChannelResponse{");
        replace.append('}');
        return replace.toString();
    }

    public OpenGrootChannelResponse(PushGrootChannelStatus pushGrootChannelStatus) {
        this(pushGrootChannelStatus, ByteString.EMPTY);
    }

    public OpenGrootChannelResponse(PushGrootChannelStatus pushGrootChannelStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = pushGrootChannelStatus;
    }
}
