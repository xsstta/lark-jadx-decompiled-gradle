package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DetectImagesLanguageRequest extends Message<DetectImagesLanguageRequest, C17438a> {
    public static final ProtoAdapter<DetectImagesLanguageRequest> ADAPTER = new C17439b();
    private static final long serialVersionUID = 0;
    public final List<String> image_keys;

    /* renamed from: com.bytedance.lark.pb.im.v1.DetectImagesLanguageRequest$b */
    private static final class C17439b extends ProtoAdapter<DetectImagesLanguageRequest> {
        C17439b() {
            super(FieldEncoding.LENGTH_DELIMITED, DetectImagesLanguageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DetectImagesLanguageRequest detectImagesLanguageRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, detectImagesLanguageRequest.image_keys) + detectImagesLanguageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DetectImagesLanguageRequest decode(ProtoReader protoReader) throws IOException {
            C17438a aVar = new C17438a();
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
                    aVar.f44333a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DetectImagesLanguageRequest detectImagesLanguageRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, detectImagesLanguageRequest.image_keys);
            protoWriter.writeBytes(detectImagesLanguageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DetectImagesLanguageRequest$a */
    public static final class C17438a extends Message.Builder<DetectImagesLanguageRequest, C17438a> {

        /* renamed from: a */
        public List<String> f44333a = Internal.newMutableList();

        /* renamed from: a */
        public DetectImagesLanguageRequest build() {
            return new DetectImagesLanguageRequest(this.f44333a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17438a mo61157a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44333a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17438a newBuilder() {
        C17438a aVar = new C17438a();
        aVar.f44333a = Internal.copyOf("image_keys", this.image_keys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DetectImagesLanguageRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.image_keys.isEmpty()) {
            sb.append(", image_keys=");
            sb.append(this.image_keys);
        }
        StringBuilder replace = sb.replace(0, 2, "DetectImagesLanguageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DetectImagesLanguageRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public DetectImagesLanguageRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_keys = Internal.immutableCopyOf("image_keys", list);
    }
}
