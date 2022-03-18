package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class InterpreterSetting extends Message<InterpreterSetting, C50801a> {
    public static final ProtoAdapter<InterpreterSetting> ADAPTER = new C50802b();
    public static final Long DEFAULT_CONFIRM_INTERPRETATION_TIME = 0L;
    public static final ConfirmStatus DEFAULT_CONFIRM_STATUS = ConfirmStatus.RESERVE;
    public static final Long DEFAULT_INTERPRETER_SET_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long confirm_interpretation_time;
    public final ConfirmStatus confirm_status;
    public final LanguageType first_language;
    public final Long interpreter_set_time;
    public final LanguageType interpreting_language;
    public final LanguageType second_language;

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

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InterpreterSetting$b */
    private static final class C50802b extends ProtoAdapter<InterpreterSetting> {
        C50802b() {
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
            if (interpreterSetting.first_language != null) {
                i = LanguageType.ADAPTER.encodedSizeWithTag(1, interpreterSetting.first_language);
            } else {
                i = 0;
            }
            if (interpreterSetting.second_language != null) {
                i2 = LanguageType.ADAPTER.encodedSizeWithTag(2, interpreterSetting.second_language);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (interpreterSetting.confirm_status != null) {
                i3 = ConfirmStatus.ADAPTER.encodedSizeWithTag(3, interpreterSetting.confirm_status);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (interpreterSetting.interpreting_language != null) {
                i4 = LanguageType.ADAPTER.encodedSizeWithTag(4, interpreterSetting.interpreting_language);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (interpreterSetting.confirm_interpretation_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, interpreterSetting.confirm_interpretation_time);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (interpreterSetting.interpreter_set_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, interpreterSetting.interpreter_set_time);
            }
            return i10 + i6 + interpreterSetting.unknownFields().size();
        }

        /* renamed from: a */
        public InterpreterSetting decode(ProtoReader protoReader) throws IOException {
            C50801a aVar = new C50801a();
            aVar.f126654c = ConfirmStatus.RESERVE;
            aVar.f126656e = 0L;
            aVar.f126657f = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126652a = LanguageType.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126653b = LanguageType.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f126654c = ConfirmStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f126655d = LanguageType.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126656e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126657f = ProtoAdapter.INT64.decode(protoReader);
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
            if (interpreterSetting.first_language != null) {
                LanguageType.ADAPTER.encodeWithTag(protoWriter, 1, interpreterSetting.first_language);
            }
            if (interpreterSetting.second_language != null) {
                LanguageType.ADAPTER.encodeWithTag(protoWriter, 2, interpreterSetting.second_language);
            }
            if (interpreterSetting.confirm_status != null) {
                ConfirmStatus.ADAPTER.encodeWithTag(protoWriter, 3, interpreterSetting.confirm_status);
            }
            if (interpreterSetting.interpreting_language != null) {
                LanguageType.ADAPTER.encodeWithTag(protoWriter, 4, interpreterSetting.interpreting_language);
            }
            if (interpreterSetting.confirm_interpretation_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, interpreterSetting.confirm_interpretation_time);
            }
            if (interpreterSetting.interpreter_set_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, interpreterSetting.interpreter_set_time);
            }
            protoWriter.writeBytes(interpreterSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InterpreterSetting$a */
    public static final class C50801a extends Message.Builder<InterpreterSetting, C50801a> {

        /* renamed from: a */
        public LanguageType f126652a;

        /* renamed from: b */
        public LanguageType f126653b;

        /* renamed from: c */
        public ConfirmStatus f126654c;

        /* renamed from: d */
        public LanguageType f126655d;

        /* renamed from: e */
        public Long f126656e;

        /* renamed from: f */
        public Long f126657f;

        /* renamed from: a */
        public InterpreterSetting build() {
            return new InterpreterSetting(this.f126652a, this.f126653b, this.f126654c, this.f126655d, this.f126656e, this.f126657f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50801a mo175613a(ConfirmStatus confirmStatus) {
            this.f126654c = confirmStatus;
            return this;
        }

        /* renamed from: b */
        public C50801a mo175617b(LanguageType languageType) {
            this.f126653b = languageType;
            return this;
        }

        /* renamed from: c */
        public C50801a mo175619c(LanguageType languageType) {
            this.f126655d = languageType;
            return this;
        }

        /* renamed from: a */
        public C50801a mo175614a(LanguageType languageType) {
            this.f126652a = languageType;
            return this;
        }

        /* renamed from: b */
        public C50801a mo175618b(Long l) {
            this.f126657f = l;
            return this;
        }

        /* renamed from: a */
        public C50801a mo175615a(Long l) {
            this.f126656e = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50801a newBuilder() {
        C50801a aVar = new C50801a();
        aVar.f126652a = this.first_language;
        aVar.f126653b = this.second_language;
        aVar.f126654c = this.confirm_status;
        aVar.f126655d = this.interpreting_language;
        aVar.f126656e = this.confirm_interpretation_time;
        aVar.f126657f = this.interpreter_set_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "InterpreterSetting");
        StringBuilder sb = new StringBuilder();
        if (this.first_language != null) {
            sb.append(", first_language=");
            sb.append(this.first_language);
        }
        if (this.second_language != null) {
            sb.append(", second_language=");
            sb.append(this.second_language);
        }
        if (this.confirm_status != null) {
            sb.append(", confirm_status=");
            sb.append(this.confirm_status);
        }
        if (this.interpreting_language != null) {
            sb.append(", interpreting_language=");
            sb.append(this.interpreting_language);
        }
        if (this.confirm_interpretation_time != null) {
            sb.append(", confirm_interpretation_time=");
            sb.append(this.confirm_interpretation_time);
        }
        if (this.interpreter_set_time != null) {
            sb.append(", interpreter_set_time=");
            sb.append(this.interpreter_set_time);
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
        this.first_language = languageType;
        this.second_language = languageType2;
        this.confirm_status = confirmStatus;
        this.interpreting_language = languageType3;
        this.confirm_interpretation_time = l;
        this.interpreter_set_time = l2;
    }
}
