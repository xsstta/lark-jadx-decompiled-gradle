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

public final class UploadAudioDataResponse extends Message<UploadAudioDataResponse, C18294a> {
    public static final ProtoAdapter<UploadAudioDataResponse> ADAPTER = new C18295b();
    public static final Integer DEFAULT_CODE = 0;
    public static final Integer DEFAULT_SEQUENCE_ID = 0;
    private static final long serialVersionUID = 0;
    public final String audio2text;
    public final Integer code;
    public final Integer sequence_id;
    public final String token;
    public final String upload_id;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadAudioDataResponse$b */
    private static final class C18295b extends ProtoAdapter<UploadAudioDataResponse> {
        C18295b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadAudioDataResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadAudioDataResponse uploadAudioDataResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadAudioDataResponse.upload_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, uploadAudioDataResponse.sequence_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, uploadAudioDataResponse.code);
            int i2 = 0;
            if (uploadAudioDataResponse.audio2text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, uploadAudioDataResponse.audio2text);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (uploadAudioDataResponse.token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, uploadAudioDataResponse.token);
            }
            return i3 + i2 + uploadAudioDataResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadAudioDataResponse decode(ProtoReader protoReader) throws IOException {
            C18294a aVar = new C18294a();
            aVar.f45593a = "";
            aVar.f45594b = 0;
            aVar.f45595c = 0;
            aVar.f45596d = "";
            aVar.f45597e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45593a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45594b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45595c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45596d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45597e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadAudioDataResponse uploadAudioDataResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadAudioDataResponse.upload_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, uploadAudioDataResponse.sequence_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, uploadAudioDataResponse.code);
            if (uploadAudioDataResponse.audio2text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, uploadAudioDataResponse.audio2text);
            }
            if (uploadAudioDataResponse.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, uploadAudioDataResponse.token);
            }
            protoWriter.writeBytes(uploadAudioDataResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadAudioDataResponse$a */
    public static final class C18294a extends Message.Builder<UploadAudioDataResponse, C18294a> {

        /* renamed from: a */
        public String f45593a;

        /* renamed from: b */
        public Integer f45594b;

        /* renamed from: c */
        public Integer f45595c;

        /* renamed from: d */
        public String f45596d;

        /* renamed from: e */
        public String f45597e;

        /* renamed from: a */
        public UploadAudioDataResponse build() {
            Integer num;
            Integer num2;
            String str = this.f45593a;
            if (str != null && (num = this.f45594b) != null && (num2 = this.f45595c) != null) {
                return new UploadAudioDataResponse(str, num, num2, this.f45596d, this.f45597e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "upload_id", this.f45594b, "sequence_id", this.f45595c, "code");
        }
    }

    @Override // com.squareup.wire.Message
    public C18294a newBuilder() {
        C18294a aVar = new C18294a();
        aVar.f45593a = this.upload_id;
        aVar.f45594b = this.sequence_id;
        aVar.f45595c = this.code;
        aVar.f45596d = this.audio2text;
        aVar.f45597e = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadAudioDataResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", upload_id=");
        sb.append(this.upload_id);
        sb.append(", sequence_id=");
        sb.append(this.sequence_id);
        sb.append(", code=");
        sb.append(this.code);
        if (this.audio2text != null) {
            sb.append(", audio2text=");
            sb.append(this.audio2text);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadAudioDataResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadAudioDataResponse(String str, Integer num, Integer num2, String str2, String str3) {
        this(str, num, num2, str2, str3, ByteString.EMPTY);
    }

    public UploadAudioDataResponse(String str, Integer num, Integer num2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.upload_id = str;
        this.sequence_id = num;
        this.code = num2;
        this.audio2text = str2;
        this.token = str3;
    }
}
