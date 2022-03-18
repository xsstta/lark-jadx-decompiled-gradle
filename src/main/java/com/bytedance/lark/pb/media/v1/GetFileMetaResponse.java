package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetFileMetaResponse extends Message<GetFileMetaResponse, C18236a> {
    public static final ProtoAdapter<GetFileMetaResponse> ADAPTER = new C18237b();
    public static final Integer DEFAULT_PROGRESS = 0;
    private static final long serialVersionUID = 0;
    public final String file_path;
    public final Integer progress;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetFileMetaResponse$b */
    private static final class C18237b extends ProtoAdapter<GetFileMetaResponse> {
        C18237b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFileMetaResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFileMetaResponse getFileMetaResponse) {
            int i;
            int i2 = 0;
            if (getFileMetaResponse.file_path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getFileMetaResponse.file_path);
            } else {
                i = 0;
            }
            if (getFileMetaResponse.progress != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getFileMetaResponse.progress);
            }
            return i + i2 + getFileMetaResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFileMetaResponse decode(ProtoReader protoReader) throws IOException {
            C18236a aVar = new C18236a();
            aVar.f45483a = "";
            aVar.f45484b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45483a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45484b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFileMetaResponse getFileMetaResponse) throws IOException {
            if (getFileMetaResponse.file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getFileMetaResponse.file_path);
            }
            if (getFileMetaResponse.progress != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getFileMetaResponse.progress);
            }
            protoWriter.writeBytes(getFileMetaResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetFileMetaResponse$a */
    public static final class C18236a extends Message.Builder<GetFileMetaResponse, C18236a> {

        /* renamed from: a */
        public String f45483a;

        /* renamed from: b */
        public Integer f45484b;

        /* renamed from: a */
        public GetFileMetaResponse build() {
            return new GetFileMetaResponse(this.f45483a, this.f45484b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18236a newBuilder() {
        C18236a aVar = new C18236a();
        aVar.f45483a = this.file_path;
        aVar.f45484b = this.progress;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetFileMetaResponse");
        StringBuilder sb = new StringBuilder();
        if (this.file_path != null) {
            sb.append(", file_path=");
            sb.append(this.file_path);
        }
        if (this.progress != null) {
            sb.append(", progress=");
            sb.append(this.progress);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFileMetaResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFileMetaResponse(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public GetFileMetaResponse(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_path = str;
        this.progress = num;
    }
}
