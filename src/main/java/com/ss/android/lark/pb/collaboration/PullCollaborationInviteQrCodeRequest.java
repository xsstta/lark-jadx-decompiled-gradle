package com.ss.android.lark.pb.collaboration;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullCollaborationInviteQrCodeRequest extends Message<PullCollaborationInviteQrCodeRequest, C49604a> {
    public static final ProtoAdapter<PullCollaborationInviteQrCodeRequest> ADAPTER = new C49605b();
    public static final Boolean DEFAULT_RESET = false;
    private static final long serialVersionUID = 0;
    public final Boolean mreset;

    /* renamed from: com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeRequest$b */
    private static final class C49605b extends ProtoAdapter<PullCollaborationInviteQrCodeRequest> {
        C49605b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullCollaborationInviteQrCodeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullCollaborationInviteQrCodeRequest pullCollaborationInviteQrCodeRequest) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, pullCollaborationInviteQrCodeRequest.mreset) + pullCollaborationInviteQrCodeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullCollaborationInviteQrCodeRequest decode(ProtoReader protoReader) throws IOException {
            C49604a aVar = new C49604a();
            aVar.f124231a = false;
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
                    aVar.f124231a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullCollaborationInviteQrCodeRequest pullCollaborationInviteQrCodeRequest) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pullCollaborationInviteQrCodeRequest.mreset);
            protoWriter.writeBytes(pullCollaborationInviteQrCodeRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.collaboration.PullCollaborationInviteQrCodeRequest$a */
    public static final class C49604a extends Message.Builder<PullCollaborationInviteQrCodeRequest, C49604a> {

        /* renamed from: a */
        public Boolean f124231a;

        /* renamed from: a */
        public PullCollaborationInviteQrCodeRequest build() {
            Boolean bool = this.f124231a;
            if (bool != null) {
                return new PullCollaborationInviteQrCodeRequest(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mreset");
        }

        /* renamed from: a */
        public C49604a mo172938a(Boolean bool) {
            this.f124231a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49604a newBuilder() {
        C49604a aVar = new C49604a();
        aVar.f124231a = this.mreset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", reset=");
        sb.append(this.mreset);
        StringBuilder replace = sb.replace(0, 2, "PullCollaborationInviteQrCodeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullCollaborationInviteQrCodeRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public PullCollaborationInviteQrCodeRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mreset = bool;
    }
}
