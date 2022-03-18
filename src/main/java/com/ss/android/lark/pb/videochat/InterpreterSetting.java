package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class InterpreterSetting extends Message<InterpreterSetting, C50362a> {
    public static final ProtoAdapter<InterpreterSetting> ADAPTER = new C50363b();
    public static final Long DEFAULT_CONFIRM_INTERPRETATION_TIME = 0L;
    public static final Long DEFAULT_INTERPRETER_SET_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long mconfirm_interpretation_time;
    public final ConfirmStatus mconfirm_status;
    public final LanguageType mfirst_language;
    public final Long minterpreter_set_time;
    public final LanguageType minterpreting_language;
    public final LanguageType msecond_language;

    public enum ConfirmStatus implements WireEnum {
        RESERVE(0),
        WAIT_CONFIRM(1),
        CONFIRMED(2);
        
        public static final ProtoAdapter<ConfirmStatus> ADAPTER = ProtoAdapter.newEnumAdapter(ConfirmStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ConfirmStatus fromValue(int i) {
            if (i == 0) {
                return RESERVE;
            }
            if (i == 1) {
                return WAIT_CONFIRM;
            }
            if (i != 2) {
                return null;
            }
            return CONFIRMED;
        }

        private ConfirmStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.InterpreterSetting$b */
    private static final class C50363b extends ProtoAdapter<InterpreterSetting> {
        C50363b() {
            super(FieldEncoding.LENGTH_DELIMITED, InterpreterSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(InterpreterSetting interpreterSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (interpreterSetting.mfirst_language != null) {
                i = LanguageType.ADAPTER.encodedSizeWithTag(1, interpreterSetting.mfirst_language);
            } else {
                i = 0;
            }
            if (interpreterSetting.msecond_language != null) {
                i2 = LanguageType.ADAPTER.encodedSizeWithTag(2, interpreterSetting.msecond_language);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (interpreterSetting.mconfirm_status != null) {
                i3 = ConfirmStatus.ADAPTER.encodedSizeWithTag(3, interpreterSetting.mconfirm_status);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (interpreterSetting.minterpreting_language != null) {
                i4 = LanguageType.ADAPTER.encodedSizeWithTag(4, interpreterSetting.minterpreting_language);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (interpreterSetting.mconfirm_interpretation_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, interpreterSetting.mconfirm_interpretation_time);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (interpreterSetting.minterpreter_set_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, interpreterSetting.minterpreter_set_time);
            }
            return i10 + i6 + interpreterSetting.unknownFields().size();
        }

        /* renamed from: a */
        public InterpreterSetting decode(ProtoReader protoReader) throws IOException {
            C50362a aVar = new C50362a();
            aVar.f125754e = 0L;
            aVar.f125755f = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125750a = LanguageType.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125751b = LanguageType.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f125752c = ConfirmStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f125753d = LanguageType.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125754e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125755f = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, InterpreterSetting interpreterSetting) throws IOException {
            if (interpreterSetting.mfirst_language != null) {
                LanguageType.ADAPTER.encodeWithTag(protoWriter, 1, interpreterSetting.mfirst_language);
            }
            if (interpreterSetting.msecond_language != null) {
                LanguageType.ADAPTER.encodeWithTag(protoWriter, 2, interpreterSetting.msecond_language);
            }
            if (interpreterSetting.mconfirm_status != null) {
                ConfirmStatus.ADAPTER.encodeWithTag(protoWriter, 3, interpreterSetting.mconfirm_status);
            }
            if (interpreterSetting.minterpreting_language != null) {
                LanguageType.ADAPTER.encodeWithTag(protoWriter, 4, interpreterSetting.minterpreting_language);
            }
            if (interpreterSetting.mconfirm_interpretation_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, interpreterSetting.mconfirm_interpretation_time);
            }
            if (interpreterSetting.minterpreter_set_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, interpreterSetting.minterpreter_set_time);
            }
            protoWriter.writeBytes(interpreterSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.InterpreterSetting$a */
    public static final class C50362a extends Message.Builder<InterpreterSetting, C50362a> {

        /* renamed from: a */
        public LanguageType f125750a;

        /* renamed from: b */
        public LanguageType f125751b;

        /* renamed from: c */
        public ConfirmStatus f125752c;

        /* renamed from: d */
        public LanguageType f125753d;

        /* renamed from: e */
        public Long f125754e;

        /* renamed from: f */
        public Long f125755f;

        /* renamed from: a */
        public InterpreterSetting build() {
            return new InterpreterSetting(this.f125750a, this.f125751b, this.f125752c, this.f125753d, this.f125754e, this.f125755f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50362a newBuilder() {
        C50362a aVar = new C50362a();
        aVar.f125750a = this.mfirst_language;
        aVar.f125751b = this.msecond_language;
        aVar.f125752c = this.mconfirm_status;
        aVar.f125753d = this.minterpreting_language;
        aVar.f125754e = this.mconfirm_interpretation_time;
        aVar.f125755f = this.minterpreter_set_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mfirst_language != null) {
            sb.append(", first_language=");
            sb.append(this.mfirst_language);
        }
        if (this.msecond_language != null) {
            sb.append(", second_language=");
            sb.append(this.msecond_language);
        }
        if (this.mconfirm_status != null) {
            sb.append(", confirm_status=");
            sb.append(this.mconfirm_status);
        }
        if (this.minterpreting_language != null) {
            sb.append(", interpreting_language=");
            sb.append(this.minterpreting_language);
        }
        if (this.mconfirm_interpretation_time != null) {
            sb.append(", confirm_interpretation_time=");
            sb.append(this.mconfirm_interpretation_time);
        }
        if (this.minterpreter_set_time != null) {
            sb.append(", interpreter_set_time=");
            sb.append(this.minterpreter_set_time);
        }
        StringBuilder replace = sb.replace(0, 2, "InterpreterSetting{");
        replace.append('}');
        return replace.toString();
    }

    public InterpreterSetting(LanguageType languageType, LanguageType languageType2, ConfirmStatus confirmStatus, LanguageType languageType3, Long l, Long l2) {
        this(languageType, languageType2, confirmStatus, languageType3, l, l2, ByteString.EMPTY);
    }

    public InterpreterSetting(LanguageType languageType, LanguageType languageType2, ConfirmStatus confirmStatus, LanguageType languageType3, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mfirst_language = languageType;
        this.msecond_language = languageType2;
        this.mconfirm_status = confirmStatus;
        this.minterpreting_language = languageType3;
        this.mconfirm_interpretation_time = l;
        this.minterpreter_set_time = l2;
    }
}
