package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageTranslationAbility;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class DetectImagesLanguageResponse extends Message<DetectImagesLanguageResponse, C17440a> {
    public static final ProtoAdapter<DetectImagesLanguageResponse> ADAPTER = new C17441b();
    private static final long serialVersionUID = 0;
    public final List<ImageTranslationAbility> images_translation_ability;

    /* renamed from: com.bytedance.lark.pb.im.v1.DetectImagesLanguageResponse$b */
    private static final class C17441b extends ProtoAdapter<DetectImagesLanguageResponse> {
        C17441b() {
            super(FieldEncoding.LENGTH_DELIMITED, DetectImagesLanguageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DetectImagesLanguageResponse detectImagesLanguageResponse) {
            return ImageTranslationAbility.ADAPTER.asRepeated().encodedSizeWithTag(1, detectImagesLanguageResponse.images_translation_ability) + detectImagesLanguageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DetectImagesLanguageResponse decode(ProtoReader protoReader) throws IOException {
            C17440a aVar = new C17440a();
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
                    aVar.f44334a.add(ImageTranslationAbility.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DetectImagesLanguageResponse detectImagesLanguageResponse) throws IOException {
            ImageTranslationAbility.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, detectImagesLanguageResponse.images_translation_ability);
            protoWriter.writeBytes(detectImagesLanguageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DetectImagesLanguageResponse$a */
    public static final class C17440a extends Message.Builder<DetectImagesLanguageResponse, C17440a> {

        /* renamed from: a */
        public List<ImageTranslationAbility> f44334a = Internal.newMutableList();

        /* renamed from: a */
        public DetectImagesLanguageResponse build() {
            return new DetectImagesLanguageResponse(this.f44334a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17440a newBuilder() {
        C17440a aVar = new C17440a();
        aVar.f44334a = Internal.copyOf("images_translation_ability", this.images_translation_ability);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DetectImagesLanguageResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.images_translation_ability.isEmpty()) {
            sb.append(", images_translation_ability=");
            sb.append(this.images_translation_ability);
        }
        StringBuilder replace = sb.replace(0, 2, "DetectImagesLanguageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DetectImagesLanguageResponse(List<ImageTranslationAbility> list) {
        this(list, ByteString.EMPTY);
    }

    public DetectImagesLanguageResponse(List<ImageTranslationAbility> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.images_translation_ability = Internal.immutableCopyOf("images_translation_ability", list);
    }
}
