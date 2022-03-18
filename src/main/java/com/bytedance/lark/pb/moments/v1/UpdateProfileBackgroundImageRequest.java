package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateProfileBackgroundImageRequest extends Message<UpdateProfileBackgroundImageRequest, C18556a> {
    public static final ProtoAdapter<UpdateProfileBackgroundImageRequest> ADAPTER = new C18557b();
    private static final long serialVersionUID = 0;
    public final String profile_background_image_key;

    /* renamed from: com.bytedance.lark.pb.moments.v1.UpdateProfileBackgroundImageRequest$b */
    private static final class C18557b extends ProtoAdapter<UpdateProfileBackgroundImageRequest> {
        C18557b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateProfileBackgroundImageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateProfileBackgroundImageRequest updateProfileBackgroundImageRequest) {
            int i;
            if (updateProfileBackgroundImageRequest.profile_background_image_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, updateProfileBackgroundImageRequest.profile_background_image_key);
            } else {
                i = 0;
            }
            return i + updateProfileBackgroundImageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateProfileBackgroundImageRequest decode(ProtoReader protoReader) throws IOException {
            C18556a aVar = new C18556a();
            aVar.f46045a = "";
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
                    aVar.f46045a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateProfileBackgroundImageRequest updateProfileBackgroundImageRequest) throws IOException {
            if (updateProfileBackgroundImageRequest.profile_background_image_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateProfileBackgroundImageRequest.profile_background_image_key);
            }
            protoWriter.writeBytes(updateProfileBackgroundImageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.UpdateProfileBackgroundImageRequest$a */
    public static final class C18556a extends Message.Builder<UpdateProfileBackgroundImageRequest, C18556a> {

        /* renamed from: a */
        public String f46045a;

        /* renamed from: a */
        public UpdateProfileBackgroundImageRequest build() {
            return new UpdateProfileBackgroundImageRequest(this.f46045a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18556a mo63999a(String str) {
            this.f46045a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18556a newBuilder() {
        C18556a aVar = new C18556a();
        aVar.f46045a = this.profile_background_image_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "UpdateProfileBackgroundImageRequest");
        StringBuilder sb = new StringBuilder();
        if (this.profile_background_image_key != null) {
            sb.append(", profile_background_image_key=");
            sb.append(this.profile_background_image_key);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateProfileBackgroundImageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateProfileBackgroundImageRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public UpdateProfileBackgroundImageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.profile_background_image_key = str;
    }
}
