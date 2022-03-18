package com.bytedance.lark.pb.ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PutTranslationFeedbackRequest extends Message<PutTranslationFeedbackRequest, C14629a> {
    public static final ProtoAdapter<PutTranslationFeedbackRequest> ADAPTER = new C14630b();
    public static final Boolean DEFAULT_EDITED_SUGGESTED_TEXT = false;
    public static final Boolean DEFAULT_HAS_SUGGESTED_TEXT = false;
    public static final TranslationScene DEFAULT_SCENE = TranslationScene.MESSAGE;
    public static final Integer DEFAULT_SCORE = 0;
    private static final long serialVersionUID = 0;
    public final Boolean edited_suggested_text;
    public final Boolean has_suggested_text;
    public final String object_id;
    public final String origin_language;
    public final String origin_text;
    public final TranslationScene scene;
    public final Integer score;
    public final String suggested_text;
    public final String target_language;
    public final String target_text;

    /* renamed from: com.bytedance.lark.pb.ai.v1.PutTranslationFeedbackRequest$b */
    private static final class C14630b extends ProtoAdapter<PutTranslationFeedbackRequest> {
        C14630b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutTranslationFeedbackRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutTranslationFeedbackRequest putTranslationFeedbackRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = TranslationScene.ADAPTER.encodedSizeWithTag(1, putTranslationFeedbackRequest.scene) + ProtoAdapter.STRING.encodedSizeWithTag(2, putTranslationFeedbackRequest.object_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, putTranslationFeedbackRequest.score) + ProtoAdapter.STRING.encodedSizeWithTag(4, putTranslationFeedbackRequest.origin_text) + ProtoAdapter.STRING.encodedSizeWithTag(5, putTranslationFeedbackRequest.target_text) + ProtoAdapter.BOOL.encodedSizeWithTag(6, putTranslationFeedbackRequest.has_suggested_text);
            int i3 = 0;
            if (putTranslationFeedbackRequest.suggested_text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(7, putTranslationFeedbackRequest.suggested_text);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.BOOL.encodedSizeWithTag(8, putTranslationFeedbackRequest.edited_suggested_text);
            if (putTranslationFeedbackRequest.origin_language != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(9, putTranslationFeedbackRequest.origin_language);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag2 + i2;
            if (putTranslationFeedbackRequest.target_language != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(10, putTranslationFeedbackRequest.target_language);
            }
            return i4 + i3 + putTranslationFeedbackRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutTranslationFeedbackRequest decode(ProtoReader protoReader) throws IOException {
            C14629a aVar = new C14629a();
            aVar.f38718a = TranslationScene.MESSAGE;
            aVar.f38719b = "";
            aVar.f38720c = 0;
            aVar.f38721d = "";
            aVar.f38722e = "";
            aVar.f38723f = false;
            aVar.f38724g = "";
            aVar.f38725h = false;
            aVar.f38726i = "";
            aVar.f38727j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f38718a = TranslationScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f38719b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38720c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38721d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38722e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38723f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38724g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f38725h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f38726i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f38727j = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PutTranslationFeedbackRequest putTranslationFeedbackRequest) throws IOException {
            TranslationScene.ADAPTER.encodeWithTag(protoWriter, 1, putTranslationFeedbackRequest.scene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, putTranslationFeedbackRequest.object_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, putTranslationFeedbackRequest.score);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, putTranslationFeedbackRequest.origin_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, putTranslationFeedbackRequest.target_text);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, putTranslationFeedbackRequest.has_suggested_text);
            if (putTranslationFeedbackRequest.suggested_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, putTranslationFeedbackRequest.suggested_text);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, putTranslationFeedbackRequest.edited_suggested_text);
            if (putTranslationFeedbackRequest.origin_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, putTranslationFeedbackRequest.origin_language);
            }
            if (putTranslationFeedbackRequest.target_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, putTranslationFeedbackRequest.target_language);
            }
            protoWriter.writeBytes(putTranslationFeedbackRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14629a newBuilder() {
        C14629a aVar = new C14629a();
        aVar.f38718a = this.scene;
        aVar.f38719b = this.object_id;
        aVar.f38720c = this.score;
        aVar.f38721d = this.origin_text;
        aVar.f38722e = this.target_text;
        aVar.f38723f = this.has_suggested_text;
        aVar.f38724g = this.suggested_text;
        aVar.f38725h = this.edited_suggested_text;
        aVar.f38726i = this.origin_language;
        aVar.f38727j = this.target_language;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.PutTranslationFeedbackRequest$a */
    public static final class C14629a extends Message.Builder<PutTranslationFeedbackRequest, C14629a> {

        /* renamed from: a */
        public TranslationScene f38718a;

        /* renamed from: b */
        public String f38719b;

        /* renamed from: c */
        public Integer f38720c;

        /* renamed from: d */
        public String f38721d;

        /* renamed from: e */
        public String f38722e;

        /* renamed from: f */
        public Boolean f38723f;

        /* renamed from: g */
        public String f38724g;

        /* renamed from: h */
        public Boolean f38725h;

        /* renamed from: i */
        public String f38726i;

        /* renamed from: j */
        public String f38727j;

        /* renamed from: a */
        public PutTranslationFeedbackRequest build() {
            String str;
            Integer num;
            String str2;
            String str3;
            Boolean bool;
            Boolean bool2;
            TranslationScene translationScene = this.f38718a;
            if (translationScene != null && (str = this.f38719b) != null && (num = this.f38720c) != null && (str2 = this.f38721d) != null && (str3 = this.f38722e) != null && (bool = this.f38723f) != null && (bool2 = this.f38725h) != null) {
                return new PutTranslationFeedbackRequest(translationScene, str, num, str2, str3, bool, this.f38724g, bool2, this.f38726i, this.f38727j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(translationScene, "scene", this.f38719b, "object_id", this.f38720c, "score", this.f38721d, "origin_text", this.f38722e, "target_text", this.f38723f, "has_suggested_text", this.f38725h, "edited_suggested_text");
        }

        /* renamed from: a */
        public C14629a mo53969a(TranslationScene translationScene) {
            this.f38718a = translationScene;
            return this;
        }

        /* renamed from: b */
        public C14629a mo53974b(Boolean bool) {
            this.f38725h = bool;
            return this;
        }

        /* renamed from: c */
        public C14629a mo53976c(String str) {
            this.f38722e = str;
            return this;
        }

        /* renamed from: d */
        public C14629a mo53977d(String str) {
            this.f38724g = str;
            return this;
        }

        /* renamed from: e */
        public C14629a mo53978e(String str) {
            this.f38726i = str;
            return this;
        }

        /* renamed from: f */
        public C14629a mo53979f(String str) {
            this.f38727j = str;
            return this;
        }

        /* renamed from: a */
        public C14629a mo53970a(Boolean bool) {
            this.f38723f = bool;
            return this;
        }

        /* renamed from: b */
        public C14629a mo53975b(String str) {
            this.f38721d = str;
            return this;
        }

        /* renamed from: a */
        public C14629a mo53971a(Integer num) {
            this.f38720c = num;
            return this;
        }

        /* renamed from: a */
        public C14629a mo53972a(String str) {
            this.f38719b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "PutTranslationFeedbackRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", object_id=");
        sb.append(this.object_id);
        sb.append(", score=");
        sb.append(this.score);
        sb.append(", origin_text=");
        sb.append(this.origin_text);
        sb.append(", target_text=");
        sb.append(this.target_text);
        sb.append(", has_suggested_text=");
        sb.append(this.has_suggested_text);
        if (this.suggested_text != null) {
            sb.append(", suggested_text=");
            sb.append(this.suggested_text);
        }
        sb.append(", edited_suggested_text=");
        sb.append(this.edited_suggested_text);
        if (this.origin_language != null) {
            sb.append(", origin_language=");
            sb.append(this.origin_language);
        }
        if (this.target_language != null) {
            sb.append(", target_language=");
            sb.append(this.target_language);
        }
        StringBuilder replace = sb.replace(0, 2, "PutTranslationFeedbackRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutTranslationFeedbackRequest(TranslationScene translationScene, String str, Integer num, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6) {
        this(translationScene, str, num, str2, str3, bool, str4, bool2, str5, str6, ByteString.EMPTY);
    }

    public PutTranslationFeedbackRequest(TranslationScene translationScene, String str, Integer num, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = translationScene;
        this.object_id = str;
        this.score = num;
        this.origin_text = str2;
        this.target_text = str3;
        this.has_suggested_text = bool;
        this.suggested_text = str4;
        this.edited_suggested_text = bool2;
        this.origin_language = str5;
        this.target_language = str6;
    }
}
