package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UploadSecureImageResponse extends Message<UploadSecureImageResponse, C18314a> {
    public static final ProtoAdapter<UploadSecureImageResponse> ADAPTER = new C18315b();
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Integer height;
    public final String token;
    public final Integer width;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadSecureImageResponse$b */
    private static final class C18315b extends ProtoAdapter<UploadSecureImageResponse> {
        C18315b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadSecureImageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadSecureImageResponse uploadSecureImageResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (uploadSecureImageResponse.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadSecureImageResponse.token);
            } else {
                i = 0;
            }
            if (uploadSecureImageResponse.width != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, uploadSecureImageResponse.width);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (uploadSecureImageResponse.height != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, uploadSecureImageResponse.height);
            }
            return i4 + i3 + uploadSecureImageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadSecureImageResponse decode(ProtoReader protoReader) throws IOException {
            C18314a aVar = new C18314a();
            aVar.f45621a = "";
            aVar.f45622b = 0;
            aVar.f45623c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45621a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45622b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45623c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadSecureImageResponse uploadSecureImageResponse) throws IOException {
            if (uploadSecureImageResponse.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadSecureImageResponse.token);
            }
            if (uploadSecureImageResponse.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, uploadSecureImageResponse.width);
            }
            if (uploadSecureImageResponse.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, uploadSecureImageResponse.height);
            }
            protoWriter.writeBytes(uploadSecureImageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadSecureImageResponse$a */
    public static final class C18314a extends Message.Builder<UploadSecureImageResponse, C18314a> {

        /* renamed from: a */
        public String f45621a;

        /* renamed from: b */
        public Integer f45622b;

        /* renamed from: c */
        public Integer f45623c;

        /* renamed from: a */
        public UploadSecureImageResponse build() {
            return new UploadSecureImageResponse(this.f45621a, this.f45622b, this.f45623c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18314a newBuilder() {
        C18314a aVar = new C18314a();
        aVar.f45621a = this.token;
        aVar.f45622b = this.width;
        aVar.f45623c = this.height;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadSecureImageResponse");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadSecureImageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadSecureImageResponse(String str, Integer num, Integer num2) {
        this(str, num, num2, ByteString.EMPTY);
    }

    public UploadSecureImageResponse(String str, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.width = num;
        this.height = num2;
    }
}
