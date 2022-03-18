package com.ss.android.lark.pb.team;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullAvatarMetaRequest extends Message<PullAvatarMetaRequest, C50066a> {
    public static final ProtoAdapter<PullAvatarMetaRequest> ADAPTER = new C50067b();
    public static final FieldOptions FIELD_OPTIONS_MAVATAR_KEY = new FieldOptions.C23155a().mo80350a("split,type=file").build();
    private static final long serialVersionUID = 0;
    public final String mavatar_key;

    /* renamed from: com.ss.android.lark.pb.team.PullAvatarMetaRequest$b */
    private static final class C50067b extends ProtoAdapter<PullAvatarMetaRequest> {
        C50067b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAvatarMetaRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAvatarMetaRequest pullAvatarMetaRequest) {
            int i;
            if (pullAvatarMetaRequest.mavatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullAvatarMetaRequest.mavatar_key);
            } else {
                i = 0;
            }
            return i + pullAvatarMetaRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullAvatarMetaRequest decode(ProtoReader protoReader) throws IOException {
            C50066a aVar = new C50066a();
            aVar.f125193a = "";
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
                    aVar.f125193a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAvatarMetaRequest pullAvatarMetaRequest) throws IOException {
            if (pullAvatarMetaRequest.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullAvatarMetaRequest.mavatar_key);
            }
            protoWriter.writeBytes(pullAvatarMetaRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.team.PullAvatarMetaRequest$a */
    public static final class C50066a extends Message.Builder<PullAvatarMetaRequest, C50066a> {

        /* renamed from: a */
        public String f125193a;

        /* renamed from: a */
        public PullAvatarMetaRequest build() {
            return new PullAvatarMetaRequest(this.f125193a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50066a mo173939a(String str) {
            this.f125193a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50066a newBuilder() {
        C50066a aVar = new C50066a();
        aVar.f125193a = this.mavatar_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAvatarMetaRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullAvatarMetaRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public PullAvatarMetaRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mavatar_key = str;
    }
}
