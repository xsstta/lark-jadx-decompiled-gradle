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
import java.util.Map;
import okio.ByteString;

public final class PushImageTranslationInfo extends Message<PushImageTranslationInfo, C17895a> {
    public static final ProtoAdapter<PushImageTranslationInfo> ADAPTER = new C17896b();
    public static final Boolean DEFAULT_AFFECT_ENTITY_TO_ORIGIN = false;
    private static final long serialVersionUID = 0;
    public final Map<String, String> affect_addition_info;
    public final Boolean affect_entity_to_origin;
    public final ImageTranslationInfo images_translation_info;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushImageTranslationInfo$b */
    private static final class C17896b extends ProtoAdapter<PushImageTranslationInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f44975a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C17896b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushImageTranslationInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(PushImageTranslationInfo pushImageTranslationInfo) {
            int i;
            int encodedSizeWithTag = ImageTranslationInfo.ADAPTER.encodedSizeWithTag(1, pushImageTranslationInfo.images_translation_info);
            if (pushImageTranslationInfo.affect_entity_to_origin != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, pushImageTranslationInfo.affect_entity_to_origin);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f44975a.encodedSizeWithTag(3, pushImageTranslationInfo.affect_addition_info) + pushImageTranslationInfo.unknownFields().size();
        }

        /* renamed from: a */
        public PushImageTranslationInfo decode(ProtoReader protoReader) throws IOException {
            C17895a aVar = new C17895a();
            aVar.f44973b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44972a = ImageTranslationInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44973b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44974c.putAll(this.f44975a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushImageTranslationInfo pushImageTranslationInfo) throws IOException {
            ImageTranslationInfo.ADAPTER.encodeWithTag(protoWriter, 1, pushImageTranslationInfo.images_translation_info);
            if (pushImageTranslationInfo.affect_entity_to_origin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pushImageTranslationInfo.affect_entity_to_origin);
            }
            this.f44975a.encodeWithTag(protoWriter, 3, pushImageTranslationInfo.affect_addition_info);
            protoWriter.writeBytes(pushImageTranslationInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17895a newBuilder() {
        C17895a aVar = new C17895a();
        aVar.f44972a = this.images_translation_info;
        aVar.f44973b = this.affect_entity_to_origin;
        aVar.f44974c = Internal.copyOf("affect_addition_info", this.affect_addition_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushImageTranslationInfo$a */
    public static final class C17895a extends Message.Builder<PushImageTranslationInfo, C17895a> {

        /* renamed from: a */
        public ImageTranslationInfo f44972a;

        /* renamed from: b */
        public Boolean f44973b;

        /* renamed from: c */
        public Map<String, String> f44974c = Internal.newMutableMap();

        /* renamed from: a */
        public PushImageTranslationInfo build() {
            ImageTranslationInfo imageTranslationInfo = this.f44972a;
            if (imageTranslationInfo != null) {
                return new PushImageTranslationInfo(imageTranslationInfo, this.f44973b, this.f44974c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageTranslationInfo, "images_translation_info");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushImageTranslationInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", images_translation_info=");
        sb.append(this.images_translation_info);
        if (this.affect_entity_to_origin != null) {
            sb.append(", affect_entity_to_origin=");
            sb.append(this.affect_entity_to_origin);
        }
        if (!this.affect_addition_info.isEmpty()) {
            sb.append(", affect_addition_info=");
            sb.append(this.affect_addition_info);
        }
        StringBuilder replace = sb.replace(0, 2, "PushImageTranslationInfo{");
        replace.append('}');
        return replace.toString();
    }

    public PushImageTranslationInfo(ImageTranslationInfo imageTranslationInfo, Boolean bool, Map<String, String> map) {
        this(imageTranslationInfo, bool, map, ByteString.EMPTY);
    }

    public PushImageTranslationInfo(ImageTranslationInfo imageTranslationInfo, Boolean bool, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.images_translation_info = imageTranslationInfo;
        this.affect_entity_to_origin = bool;
        this.affect_addition_info = Internal.immutableCopyOf("affect_addition_info", map);
    }
}
