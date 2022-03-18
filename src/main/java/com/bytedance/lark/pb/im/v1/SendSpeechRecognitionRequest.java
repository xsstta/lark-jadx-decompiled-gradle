package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SendSpeechRecognitionRequest extends Message<SendSpeechRecognitionRequest, C18033a> {
    public static final ProtoAdapter<SendSpeechRecognitionRequest> ADAPTER = new C18034b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN;
    public static final ByteString DEFAULT_AUDIO_DATA = ByteString.EMPTY;
    public static final Integer DEFAULT_AUDIO_RATE = 16;
    public static final Integer DEFAULT_SEQUENCE_ID = 0;
    public static final Boolean DEFAULT_SHOULD_DIFF_RESULT = false;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final ByteString audio_data;
    public final String audio_format;
    public final Integer audio_rate;
    public final String chat_id;
    public final String device_locale;
    public final Integer sequence_id;
    public final String session;
    public final Boolean should_diff_result;
    public final String source_id;
    public final String speech_locale;

    public enum Action implements WireEnum {
        UNKNOWN(0),
        BEGIN(1),
        END(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return BEGIN;
            }
            if (i != 2) {
                return null;
            }
            return END;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendSpeechRecognitionRequest$b */
    private static final class C18034b extends ProtoAdapter<SendSpeechRecognitionRequest> {
        C18034b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendSpeechRecognitionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendSpeechRecognitionRequest sendSpeechRecognitionRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11 = 0;
            if (sendSpeechRecognitionRequest.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendSpeechRecognitionRequest.source_id);
            } else {
                i = 0;
            }
            if (sendSpeechRecognitionRequest.sequence_id != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, sendSpeechRecognitionRequest.sequence_id);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (sendSpeechRecognitionRequest.device_locale != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sendSpeechRecognitionRequest.device_locale);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (sendSpeechRecognitionRequest.audio_data != null) {
                i4 = ProtoAdapter.BYTES.encodedSizeWithTag(4, sendSpeechRecognitionRequest.audio_data);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (sendSpeechRecognitionRequest.action != null) {
                i5 = Action.ADAPTER.encodedSizeWithTag(5, sendSpeechRecognitionRequest.action);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (sendSpeechRecognitionRequest.audio_rate != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, sendSpeechRecognitionRequest.audio_rate);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (sendSpeechRecognitionRequest.audio_format != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, sendSpeechRecognitionRequest.audio_format);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (sendSpeechRecognitionRequest.should_diff_result != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, sendSpeechRecognitionRequest.should_diff_result);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (sendSpeechRecognitionRequest.speech_locale != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, sendSpeechRecognitionRequest.speech_locale);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (sendSpeechRecognitionRequest.session != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, sendSpeechRecognitionRequest.session);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (sendSpeechRecognitionRequest.chat_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, sendSpeechRecognitionRequest.chat_id);
            }
            return i20 + i11 + sendSpeechRecognitionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendSpeechRecognitionRequest decode(ProtoReader protoReader) throws IOException {
            C18033a aVar = new C18033a();
            aVar.f45144a = "";
            aVar.f45145b = 0;
            aVar.f45146c = "";
            aVar.f45147d = ByteString.EMPTY;
            aVar.f45148e = Action.UNKNOWN;
            aVar.f45149f = 16;
            aVar.f45150g = "opus";
            aVar.f45151h = false;
            aVar.f45152i = "";
            aVar.f45153j = "";
            aVar.f45154k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45144a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45145b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45146c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45147d = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f45148e = Action.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f45149f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45150g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45151h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f45152i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f45153j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f45154k = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SendSpeechRecognitionRequest sendSpeechRecognitionRequest) throws IOException {
            if (sendSpeechRecognitionRequest.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendSpeechRecognitionRequest.source_id);
            }
            if (sendSpeechRecognitionRequest.sequence_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendSpeechRecognitionRequest.sequence_id);
            }
            if (sendSpeechRecognitionRequest.device_locale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sendSpeechRecognitionRequest.device_locale);
            }
            if (sendSpeechRecognitionRequest.audio_data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, sendSpeechRecognitionRequest.audio_data);
            }
            if (sendSpeechRecognitionRequest.action != null) {
                Action.ADAPTER.encodeWithTag(protoWriter, 5, sendSpeechRecognitionRequest.action);
            }
            if (sendSpeechRecognitionRequest.audio_rate != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, sendSpeechRecognitionRequest.audio_rate);
            }
            if (sendSpeechRecognitionRequest.audio_format != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, sendSpeechRecognitionRequest.audio_format);
            }
            if (sendSpeechRecognitionRequest.should_diff_result != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, sendSpeechRecognitionRequest.should_diff_result);
            }
            if (sendSpeechRecognitionRequest.speech_locale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, sendSpeechRecognitionRequest.speech_locale);
            }
            if (sendSpeechRecognitionRequest.session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, sendSpeechRecognitionRequest.session);
            }
            if (sendSpeechRecognitionRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, sendSpeechRecognitionRequest.chat_id);
            }
            protoWriter.writeBytes(sendSpeechRecognitionRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18033a newBuilder() {
        C18033a aVar = new C18033a();
        aVar.f45144a = this.source_id;
        aVar.f45145b = this.sequence_id;
        aVar.f45146c = this.device_locale;
        aVar.f45147d = this.audio_data;
        aVar.f45148e = this.action;
        aVar.f45149f = this.audio_rate;
        aVar.f45150g = this.audio_format;
        aVar.f45151h = this.should_diff_result;
        aVar.f45152i = this.speech_locale;
        aVar.f45153j = this.session;
        aVar.f45154k = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendSpeechRecognitionRequest$a */
    public static final class C18033a extends Message.Builder<SendSpeechRecognitionRequest, C18033a> {

        /* renamed from: a */
        public String f45144a;

        /* renamed from: b */
        public Integer f45145b;

        /* renamed from: c */
        public String f45146c;

        /* renamed from: d */
        public ByteString f45147d;

        /* renamed from: e */
        public Action f45148e;

        /* renamed from: f */
        public Integer f45149f;

        /* renamed from: g */
        public String f45150g;

        /* renamed from: h */
        public Boolean f45151h;

        /* renamed from: i */
        public String f45152i;

        /* renamed from: j */
        public String f45153j;

        /* renamed from: k */
        public String f45154k;

        /* renamed from: a */
        public SendSpeechRecognitionRequest build() {
            return new SendSpeechRecognitionRequest(this.f45144a, this.f45145b, this.f45146c, this.f45147d, this.f45148e, this.f45149f, this.f45150g, this.f45151h, this.f45152i, this.f45153j, this.f45154k, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18033a mo62626a(Action action) {
            this.f45148e = action;
            return this;
        }

        /* renamed from: b */
        public C18033a mo62632b(Integer num) {
            this.f45149f = num;
            return this;
        }

        /* renamed from: c */
        public C18033a mo62634c(String str) {
            this.f45150g = str;
            return this;
        }

        /* renamed from: d */
        public C18033a mo62635d(String str) {
            this.f45152i = str;
            return this;
        }

        /* renamed from: e */
        public C18033a mo62636e(String str) {
            this.f45154k = str;
            return this;
        }

        /* renamed from: a */
        public C18033a mo62627a(Boolean bool) {
            this.f45151h = bool;
            return this;
        }

        /* renamed from: b */
        public C18033a mo62633b(String str) {
            this.f45146c = str;
            return this;
        }

        /* renamed from: a */
        public C18033a mo62628a(Integer num) {
            this.f45145b = num;
            return this;
        }

        /* renamed from: a */
        public C18033a mo62629a(String str) {
            this.f45144a = str;
            return this;
        }

        /* renamed from: a */
        public C18033a mo62630a(ByteString byteString) {
            this.f45147d = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendSpeechRecognitionRequest");
        StringBuilder sb = new StringBuilder();
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        if (this.device_locale != null) {
            sb.append(", device_locale=");
            sb.append(this.device_locale);
        }
        if (this.audio_data != null) {
            sb.append(", audio_data=");
            sb.append(this.audio_data);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.audio_rate != null) {
            sb.append(", audio_rate=");
            sb.append(this.audio_rate);
        }
        if (this.audio_format != null) {
            sb.append(", audio_format=");
            sb.append(this.audio_format);
        }
        if (this.should_diff_result != null) {
            sb.append(", should_diff_result=");
            sb.append(this.should_diff_result);
        }
        if (this.speech_locale != null) {
            sb.append(", speech_locale=");
            sb.append(this.speech_locale);
        }
        if (this.session != null) {
            sb.append(", session=");
            sb.append(this.session);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SendSpeechRecognitionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendSpeechRecognitionRequest(String str, Integer num, String str2, ByteString byteString, Action action2, Integer num2, String str3, Boolean bool, String str4, String str5, String str6) {
        this(str, num, str2, byteString, action2, num2, str3, bool, str4, str5, str6, ByteString.EMPTY);
    }

    public SendSpeechRecognitionRequest(String str, Integer num, String str2, ByteString byteString, Action action2, Integer num2, String str3, Boolean bool, String str4, String str5, String str6, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.source_id = str;
        this.sequence_id = num;
        this.device_locale = str2;
        this.audio_data = byteString;
        this.action = action2;
        this.audio_rate = num2;
        this.audio_format = str3;
        this.should_diff_result = bool;
        this.speech_locale = str4;
        this.session = str5;
        this.chat_id = str6;
    }
}
