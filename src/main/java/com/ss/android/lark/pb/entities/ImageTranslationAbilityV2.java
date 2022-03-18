package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ImageTranslationAbilityV2 extends Message<ImageTranslationAbilityV2, C49726a> {
    public static final ProtoAdapter<ImageTranslationAbilityV2> ADAPTER = new C49727b();
    public static final Boolean DEFAULT_CAN_TRANSLATE = false;
    private static final long serialVersionUID = 0;
    public final Boolean mcan_translate;
    public final List<String> msrc_language;

    /* renamed from: com.ss.android.lark.pb.entities.ImageTranslationAbilityV2$b */
    private static final class C49727b extends ProtoAdapter<ImageTranslationAbilityV2> {
        C49727b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageTranslationAbilityV2.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageTranslationAbilityV2 imageTranslationAbilityV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, imageTranslationAbilityV2.mcan_translate) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, imageTranslationAbilityV2.msrc_language) + imageTranslationAbilityV2.unknownFields().size();
        }

        /* renamed from: a */
        public ImageTranslationAbilityV2 decode(ProtoReader protoReader) throws IOException {
            C49726a aVar = new C49726a();
            aVar.f124497a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124497a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124498b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageTranslationAbilityV2 imageTranslationAbilityV2) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, imageTranslationAbilityV2.mcan_translate);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, imageTranslationAbilityV2.msrc_language);
            protoWriter.writeBytes(imageTranslationAbilityV2.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ImageTranslationAbilityV2$a */
    public static final class C49726a extends Message.Builder<ImageTranslationAbilityV2, C49726a> {

        /* renamed from: a */
        public Boolean f124497a;

        /* renamed from: b */
        public List<String> f124498b = Internal.newMutableList();

        /* renamed from: a */
        public ImageTranslationAbilityV2 build() {
            Boolean bool = this.f124497a;
            if (bool != null) {
                return new ImageTranslationAbilityV2(bool, this.f124498b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mcan_translate");
        }
    }

    @Override // com.squareup.wire.Message
    public C49726a newBuilder() {
        C49726a aVar = new C49726a();
        aVar.f124497a = this.mcan_translate;
        aVar.f124498b = Internal.copyOf("msrc_language", this.msrc_language);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", can_translate=");
        sb.append(this.mcan_translate);
        if (!this.msrc_language.isEmpty()) {
            sb.append(", src_language=");
            sb.append(this.msrc_language);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageTranslationAbilityV2{");
        replace.append('}');
        return replace.toString();
    }

    public ImageTranslationAbilityV2(Boolean bool, List<String> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public ImageTranslationAbilityV2(Boolean bool, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcan_translate = bool;
        this.msrc_language = Internal.immutableCopyOf("msrc_language", list);
    }
}
