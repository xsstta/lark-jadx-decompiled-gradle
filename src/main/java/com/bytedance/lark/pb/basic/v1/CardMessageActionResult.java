package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class CardMessageActionResult extends Message<CardMessageActionResult, C14746a> {
    public static final ProtoAdapter<CardMessageActionResult> ADAPTER = new C14747b();
    public static final Integer DEFAULT_CARD_VERSION = 0;
    public static final Integer DEFAULT_ERROR_CODE = 0;
    public static final PushType DEFAULT_TYPE = PushType.PUSH_LOADING_START;
    private static final long serialVersionUID = 0;
    public final RichTextElement.ButtonProperty button;
    public final Integer card_version;
    public final Integer error_code;
    public final String error_msg;
    public final String message_id;
    public final C14928Entity packed_msg;
    public final PushType type;

    public enum PushType implements WireEnum {
        PUSH_LOADING_START(0),
        PUSH_LOADING_END_WITH_TOAST_SUCCESS(1),
        PUSH_LOADING_END_WITH_TOAST_FAILED(2);
        
        public static final ProtoAdapter<PushType> ADAPTER = ProtoAdapter.newEnumAdapter(PushType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PushType fromValue(int i) {
            if (i == 0) {
                return PUSH_LOADING_START;
            }
            if (i == 1) {
                return PUSH_LOADING_END_WITH_TOAST_SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return PUSH_LOADING_END_WITH_TOAST_FAILED;
        }

        private PushType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CardMessageActionResult$b */
    private static final class C14747b extends ProtoAdapter<CardMessageActionResult> {
        C14747b() {
            super(FieldEncoding.LENGTH_DELIMITED, CardMessageActionResult.class);
        }

        /* renamed from: a */
        public int encodedSize(CardMessageActionResult cardMessageActionResult) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (cardMessageActionResult.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, cardMessageActionResult.message_id);
            } else {
                i = 0;
            }
            if (cardMessageActionResult.type != null) {
                i2 = PushType.ADAPTER.encodedSizeWithTag(2, cardMessageActionResult.type);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (cardMessageActionResult.packed_msg != null) {
                i3 = C14928Entity.ADAPTER.encodedSizeWithTag(3, cardMessageActionResult.packed_msg);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (cardMessageActionResult.button != null) {
                i4 = RichTextElement.ButtonProperty.ADAPTER.encodedSizeWithTag(4, cardMessageActionResult.button);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (cardMessageActionResult.error_msg != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, cardMessageActionResult.error_msg);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (cardMessageActionResult.error_code != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, cardMessageActionResult.error_code);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (cardMessageActionResult.card_version != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, cardMessageActionResult.card_version);
            }
            return i12 + i7 + cardMessageActionResult.unknownFields().size();
        }

        /* renamed from: a */
        public CardMessageActionResult decode(ProtoReader protoReader) throws IOException {
            C14746a aVar = new C14746a();
            aVar.f38986a = "";
            aVar.f38987b = PushType.PUSH_LOADING_START;
            aVar.f38990e = "";
            aVar.f38991f = 0;
            aVar.f38992g = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38986a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f38987b = PushType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f38988c = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38989d = RichTextElement.ButtonProperty.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38990e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38991f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38992g = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CardMessageActionResult cardMessageActionResult) throws IOException {
            if (cardMessageActionResult.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardMessageActionResult.message_id);
            }
            if (cardMessageActionResult.type != null) {
                PushType.ADAPTER.encodeWithTag(protoWriter, 2, cardMessageActionResult.type);
            }
            if (cardMessageActionResult.packed_msg != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, cardMessageActionResult.packed_msg);
            }
            if (cardMessageActionResult.button != null) {
                RichTextElement.ButtonProperty.ADAPTER.encodeWithTag(protoWriter, 4, cardMessageActionResult.button);
            }
            if (cardMessageActionResult.error_msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, cardMessageActionResult.error_msg);
            }
            if (cardMessageActionResult.error_code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, cardMessageActionResult.error_code);
            }
            if (cardMessageActionResult.card_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, cardMessageActionResult.card_version);
            }
            protoWriter.writeBytes(cardMessageActionResult.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CardMessageActionResult$a */
    public static final class C14746a extends Message.Builder<CardMessageActionResult, C14746a> {

        /* renamed from: a */
        public String f38986a;

        /* renamed from: b */
        public PushType f38987b;

        /* renamed from: c */
        public C14928Entity f38988c;

        /* renamed from: d */
        public RichTextElement.ButtonProperty f38989d;

        /* renamed from: e */
        public String f38990e;

        /* renamed from: f */
        public Integer f38991f;

        /* renamed from: g */
        public Integer f38992g;

        /* renamed from: a */
        public CardMessageActionResult build() {
            return new CardMessageActionResult(this.f38986a, this.f38987b, this.f38988c, this.f38989d, this.f38990e, this.f38991f, this.f38992g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14746a newBuilder() {
        C14746a aVar = new C14746a();
        aVar.f38986a = this.message_id;
        aVar.f38987b = this.type;
        aVar.f38988c = this.packed_msg;
        aVar.f38989d = this.button;
        aVar.f38990e = this.error_msg;
        aVar.f38991f = this.error_code;
        aVar.f38992g = this.card_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CardMessageActionResult");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.packed_msg != null) {
            sb.append(", packed_msg=");
            sb.append(this.packed_msg);
        }
        if (this.button != null) {
            sb.append(", button=");
            sb.append(this.button);
        }
        if (this.error_msg != null) {
            sb.append(", error_msg=");
            sb.append(this.error_msg);
        }
        if (this.error_code != null) {
            sb.append(", error_code=");
            sb.append(this.error_code);
        }
        if (this.card_version != null) {
            sb.append(", card_version=");
            sb.append(this.card_version);
        }
        StringBuilder replace = sb.replace(0, 2, "CardMessageActionResult{");
        replace.append('}');
        return replace.toString();
    }

    public CardMessageActionResult(String str, PushType pushType, C14928Entity entity, RichTextElement.ButtonProperty buttonProperty, String str2, Integer num, Integer num2) {
        this(str, pushType, entity, buttonProperty, str2, num, num2, ByteString.EMPTY);
    }

    public CardMessageActionResult(String str, PushType pushType, C14928Entity entity, RichTextElement.ButtonProperty buttonProperty, String str2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.type = pushType;
        this.packed_msg = entity;
        this.button = buttonProperty;
        this.error_msg = str2;
        this.error_code = num;
        this.card_version = num2;
    }
}
