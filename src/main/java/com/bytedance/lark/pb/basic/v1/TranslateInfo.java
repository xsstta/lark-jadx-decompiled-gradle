package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TranslateInfo extends Message<TranslateInfo, C15352a> {
    public static final ProtoAdapter<TranslateInfo> ADAPTER = new C15353b();
    public static final Boolean DEFAULT_IS_AUTO_TRANSLATE = false;
    public static final Message.Type DEFAULT_MESSAGE_TYPE = Message.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Content content;
    public final ImageTranslationInfo image_translation_info;
    public final Boolean is_auto_translate;
    public final String language;
    public final String message_id;
    public final MessageSource message_source;
    public final Message.Type message_type;

    /* renamed from: com.bytedance.lark.pb.basic.v1.TranslateInfo$b */
    private static final class C15353b extends ProtoAdapter<TranslateInfo> {
        C15353b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateInfo translateInfo) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, translateInfo.message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, translateInfo.language) + Content.ADAPTER.encodedSizeWithTag(3, translateInfo.content) + Message.Type.ADAPTER.encodedSizeWithTag(4, translateInfo.message_type);
            int i3 = 0;
            if (translateInfo.is_auto_translate != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(5, translateInfo.is_auto_translate);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (translateInfo.message_source != null) {
                i2 = MessageSource.ADAPTER.encodedSizeWithTag(6, translateInfo.message_source);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (translateInfo.image_translation_info != null) {
                i3 = ImageTranslationInfo.ADAPTER.encodedSizeWithTag(7, translateInfo.image_translation_info);
            }
            return i5 + i3 + translateInfo.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateInfo decode(ProtoReader protoReader) throws IOException {
            C15352a aVar = new C15352a();
            aVar.f40661a = "";
            aVar.f40662b = "";
            aVar.f40664d = Message.Type.UNKNOWN;
            aVar.f40665e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40661a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f40662b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f40663c = Content.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f40664d = Message.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f40665e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40666f = MessageSource.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40667g = ImageTranslationInfo.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateInfo translateInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, translateInfo.message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, translateInfo.language);
            Content.ADAPTER.encodeWithTag(protoWriter, 3, translateInfo.content);
            Message.Type.ADAPTER.encodeWithTag(protoWriter, 4, translateInfo.message_type);
            if (translateInfo.is_auto_translate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, translateInfo.is_auto_translate);
            }
            if (translateInfo.message_source != null) {
                MessageSource.ADAPTER.encodeWithTag(protoWriter, 6, translateInfo.message_source);
            }
            if (translateInfo.image_translation_info != null) {
                ImageTranslationInfo.ADAPTER.encodeWithTag(protoWriter, 7, translateInfo.image_translation_info);
            }
            protoWriter.writeBytes(translateInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15352a newBuilder() {
        C15352a aVar = new C15352a();
        aVar.f40661a = this.message_id;
        aVar.f40662b = this.language;
        aVar.f40663c = this.content;
        aVar.f40664d = this.message_type;
        aVar.f40665e = this.is_auto_translate;
        aVar.f40666f = this.message_source;
        aVar.f40667g = this.image_translation_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TranslateInfo$a */
    public static final class C15352a extends Message.Builder<TranslateInfo, C15352a> {

        /* renamed from: a */
        public String f40661a;

        /* renamed from: b */
        public String f40662b;

        /* renamed from: c */
        public Content f40663c;

        /* renamed from: d */
        public Message.Type f40664d;

        /* renamed from: e */
        public Boolean f40665e;

        /* renamed from: f */
        public MessageSource f40666f;

        /* renamed from: g */
        public ImageTranslationInfo f40667g;

        /* renamed from: a */
        public TranslateInfo build() {
            String str;
            Content content;
            Message.Type type;
            String str2 = this.f40661a;
            if (str2 != null && (str = this.f40662b) != null && (content = this.f40663c) != null && (type = this.f40664d) != null) {
                return new TranslateInfo(str2, str, content, type, this.f40665e, this.f40666f, this.f40667g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "message_id", this.f40662b, "language", this.f40663c, "content", this.f40664d, "message_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TranslateInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", message_type=");
        sb.append(this.message_type);
        if (this.is_auto_translate != null) {
            sb.append(", is_auto_translate=");
            sb.append(this.is_auto_translate);
        }
        if (this.message_source != null) {
            sb.append(", message_source=");
            sb.append(this.message_source);
        }
        if (this.image_translation_info != null) {
            sb.append(", image_translation_info=");
            sb.append(this.image_translation_info);
        }
        StringBuilder replace = sb.replace(0, 2, "TranslateInfo{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateInfo(String str, String str2, Content content2, Message.Type type, Boolean bool, MessageSource messageSource, ImageTranslationInfo imageTranslationInfo) {
        this(str, str2, content2, type, bool, messageSource, imageTranslationInfo, ByteString.EMPTY);
    }

    public TranslateInfo(String str, String str2, Content content2, Message.Type type, Boolean bool, MessageSource messageSource, ImageTranslationInfo imageTranslationInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.language = str2;
        this.content = content2;
        this.message_type = type;
        this.is_auto_translate = bool;
        this.message_source = messageSource;
        this.image_translation_info = imageTranslationInfo;
    }
}
