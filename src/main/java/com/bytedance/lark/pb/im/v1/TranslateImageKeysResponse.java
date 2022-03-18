package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageTranslationInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TranslateImageKeysResponse extends Message<TranslateImageKeysResponse, C18101a> {
    public static final ProtoAdapter<TranslateImageKeysResponse> ADAPTER = new C18102b();
    public static final Boolean DEFAULT_AFFECT_ENTITY_TO_TRANSLATE = false;
    private static final long serialVersionUID = 0;
    public final Boolean affect_entity_to_translate;
    public final ImageTranslationInfo images_translation_info;

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateImageKeysResponse$b */
    private static final class C18102b extends ProtoAdapter<TranslateImageKeysResponse> {
        C18102b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateImageKeysResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateImageKeysResponse translateImageKeysResponse) {
            int i;
            int encodedSizeWithTag = ImageTranslationInfo.ADAPTER.encodedSizeWithTag(1, translateImageKeysResponse.images_translation_info);
            if (translateImageKeysResponse.affect_entity_to_translate != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, translateImageKeysResponse.affect_entity_to_translate);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + translateImageKeysResponse.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateImageKeysResponse decode(ProtoReader protoReader) throws IOException {
            C18101a aVar = new C18101a();
            aVar.f45247b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45246a = ImageTranslationInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45247b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateImageKeysResponse translateImageKeysResponse) throws IOException {
            ImageTranslationInfo.ADAPTER.encodeWithTag(protoWriter, 1, translateImageKeysResponse.images_translation_info);
            if (translateImageKeysResponse.affect_entity_to_translate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, translateImageKeysResponse.affect_entity_to_translate);
            }
            protoWriter.writeBytes(translateImageKeysResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateImageKeysResponse$a */
    public static final class C18101a extends Message.Builder<TranslateImageKeysResponse, C18101a> {

        /* renamed from: a */
        public ImageTranslationInfo f45246a;

        /* renamed from: b */
        public Boolean f45247b;

        /* renamed from: a */
        public TranslateImageKeysResponse build() {
            ImageTranslationInfo imageTranslationInfo = this.f45246a;
            if (imageTranslationInfo != null) {
                return new TranslateImageKeysResponse(imageTranslationInfo, this.f45247b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageTranslationInfo, "images_translation_info");
        }
    }

    @Override // com.squareup.wire.Message
    public C18101a newBuilder() {
        C18101a aVar = new C18101a();
        aVar.f45246a = this.images_translation_info;
        aVar.f45247b = this.affect_entity_to_translate;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TranslateImageKeysResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", images_translation_info=");
        sb.append(this.images_translation_info);
        if (this.affect_entity_to_translate != null) {
            sb.append(", affect_entity_to_translate=");
            sb.append(this.affect_entity_to_translate);
        }
        StringBuilder replace = sb.replace(0, 2, "TranslateImageKeysResponse{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateImageKeysResponse(ImageTranslationInfo imageTranslationInfo, Boolean bool) {
        this(imageTranslationInfo, bool, ByteString.EMPTY);
    }

    public TranslateImageKeysResponse(ImageTranslationInfo imageTranslationInfo, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.images_translation_info = imageTranslationInfo;
        this.affect_entity_to_translate = bool;
    }
}
