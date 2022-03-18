package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UploadParticipantInfoRequest extends Message<UploadParticipantInfoRequest, C50411a> {
    public static final ProtoAdapter<UploadParticipantInfoRequest> ADAPTER = new C50412b();
    private static final long serialVersionUID = 0;
    public final String mmeeting_id;
    public final NetworkType mnetwork_type;

    /* renamed from: com.ss.android.lark.pb.videochat.UploadParticipantInfoRequest$b */
    private static final class C50412b extends ProtoAdapter<UploadParticipantInfoRequest> {
        C50412b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadParticipantInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadParticipantInfoRequest uploadParticipantInfoRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadParticipantInfoRequest.mmeeting_id);
            if (uploadParticipantInfoRequest.mnetwork_type != null) {
                i = NetworkType.ADAPTER.encodedSizeWithTag(2, uploadParticipantInfoRequest.mnetwork_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + uploadParticipantInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadParticipantInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50411a aVar = new C50411a();
            aVar.f125886a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125886a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125887b = NetworkType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadParticipantInfoRequest uploadParticipantInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadParticipantInfoRequest.mmeeting_id);
            if (uploadParticipantInfoRequest.mnetwork_type != null) {
                NetworkType.ADAPTER.encodeWithTag(protoWriter, 2, uploadParticipantInfoRequest.mnetwork_type);
            }
            protoWriter.writeBytes(uploadParticipantInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.UploadParticipantInfoRequest$a */
    public static final class C50411a extends Message.Builder<UploadParticipantInfoRequest, C50411a> {

        /* renamed from: a */
        public String f125886a;

        /* renamed from: b */
        public NetworkType f125887b;

        /* renamed from: a */
        public UploadParticipantInfoRequest build() {
            String str = this.f125886a;
            if (str != null) {
                return new UploadParticipantInfoRequest(str, this.f125887b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mmeeting_id");
        }

        /* renamed from: a */
        public C50411a mo174713a(String str) {
            this.f125886a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50411a newBuilder() {
        C50411a aVar = new C50411a();
        aVar.f125886a = this.mmeeting_id;
        aVar.f125887b = this.mnetwork_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.mmeeting_id);
        if (this.mnetwork_type != null) {
            sb.append(", network_type=");
            sb.append(this.mnetwork_type);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadParticipantInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadParticipantInfoRequest(String str, NetworkType networkType) {
        this(str, networkType, ByteString.EMPTY);
    }

    public UploadParticipantInfoRequest(String str, NetworkType networkType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmeeting_id = str;
        this.mnetwork_type = networkType;
    }
}
