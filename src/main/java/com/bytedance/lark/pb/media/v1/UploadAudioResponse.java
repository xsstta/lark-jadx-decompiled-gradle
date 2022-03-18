package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UploadAudioResponse extends Message<UploadAudioResponse, C18296a> {
    public static final ProtoAdapter<UploadAudioResponse> ADAPTER = new C18297b();
    private static final long serialVersionUID = 0;
    public final String local_key;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadAudioResponse$b */
    private static final class C18297b extends ProtoAdapter<UploadAudioResponse> {
        C18297b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadAudioResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadAudioResponse uploadAudioResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, uploadAudioResponse.local_key) + uploadAudioResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadAudioResponse decode(ProtoReader protoReader) throws IOException {
            C18296a aVar = new C18296a();
            aVar.f45598a = "";
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
                    aVar.f45598a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadAudioResponse uploadAudioResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadAudioResponse.local_key);
            protoWriter.writeBytes(uploadAudioResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadAudioResponse$a */
    public static final class C18296a extends Message.Builder<UploadAudioResponse, C18296a> {

        /* renamed from: a */
        public String f45598a;

        /* renamed from: a */
        public UploadAudioResponse build() {
            String str = this.f45598a;
            if (str != null) {
                return new UploadAudioResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "local_key");
        }
    }

    @Override // com.squareup.wire.Message
    public C18296a newBuilder() {
        C18296a aVar = new C18296a();
        aVar.f45598a = this.local_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadAudioResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", local_key=");
        sb.append(this.local_key);
        StringBuilder replace = sb.replace(0, 2, "UploadAudioResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadAudioResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public UploadAudioResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_key = str;
    }
}
