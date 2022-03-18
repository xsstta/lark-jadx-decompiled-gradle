package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class LarkError extends Message<LarkError, C15035a> {
    public static final ProtoAdapter<LarkError> ADAPTER = new C15036b();
    public static final Integer DEFAULT_CODE = 0;
    public static final Integer DEFAULT_ERROR_TIMES = 0;
    public static final ErrorType DEFAULT_TYPE = ErrorType.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final Integer code;
    public final String debug_message;
    public final String display_message;
    public final Integer error_times;
    public final String request_id;
    public final String server_message;
    public final ErrorType type;
    public final String user_err_title;

    /* renamed from: com.bytedance.lark.pb.basic.v1.LarkError$b */
    private static final class C15036b extends ProtoAdapter<LarkError> {
        C15036b() {
            super(FieldEncoding.LENGTH_DELIMITED, LarkError.class);
        }

        /* renamed from: a */
        public int encodedSize(LarkError larkError) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (larkError.debug_message != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, larkError.debug_message);
            } else {
                i = 0;
            }
            if (larkError.display_message != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, larkError.display_message);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (larkError.code != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, larkError.code);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (larkError.type != null) {
                i4 = ErrorType.ADAPTER.encodedSizeWithTag(4, larkError.type);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (larkError.user_err_title != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, larkError.user_err_title);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (larkError.request_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, larkError.request_id);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (larkError.server_message != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, larkError.server_message);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (larkError.error_times != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, larkError.error_times);
            }
            return i14 + i8 + larkError.unknownFields().size();
        }

        /* renamed from: a */
        public LarkError decode(ProtoReader protoReader) throws IOException {
            C15035a aVar = new C15035a();
            aVar.f39776a = "";
            aVar.f39777b = "";
            aVar.f39778c = 0;
            aVar.f39779d = ErrorType.UNKNOWN_TYPE;
            aVar.f39780e = "";
            aVar.f39781f = "";
            aVar.f39782g = "";
            aVar.f39783h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39776a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39777b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39778c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f39779d = ErrorType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f39780e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39781f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39782g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39783h = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, LarkError larkError) throws IOException {
            if (larkError.debug_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, larkError.debug_message);
            }
            if (larkError.display_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, larkError.display_message);
            }
            if (larkError.code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, larkError.code);
            }
            if (larkError.type != null) {
                ErrorType.ADAPTER.encodeWithTag(protoWriter, 4, larkError.type);
            }
            if (larkError.user_err_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, larkError.user_err_title);
            }
            if (larkError.request_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, larkError.request_id);
            }
            if (larkError.server_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, larkError.server_message);
            }
            if (larkError.error_times != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, larkError.error_times);
            }
            protoWriter.writeBytes(larkError.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.LarkError$a */
    public static final class C15035a extends Message.Builder<LarkError, C15035a> {

        /* renamed from: a */
        public String f39776a;

        /* renamed from: b */
        public String f39777b;

        /* renamed from: c */
        public Integer f39778c;

        /* renamed from: d */
        public ErrorType f39779d;

        /* renamed from: e */
        public String f39780e;

        /* renamed from: f */
        public String f39781f;

        /* renamed from: g */
        public String f39782g;

        /* renamed from: h */
        public Integer f39783h;

        /* renamed from: a */
        public LarkError build() {
            return new LarkError(this.f39776a, this.f39777b, this.f39778c, this.f39779d, this.f39780e, this.f39781f, this.f39782g, this.f39783h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15035a newBuilder() {
        C15035a aVar = new C15035a();
        aVar.f39776a = this.debug_message;
        aVar.f39777b = this.display_message;
        aVar.f39778c = this.code;
        aVar.f39779d = this.type;
        aVar.f39780e = this.user_err_title;
        aVar.f39781f = this.request_id;
        aVar.f39782g = this.server_message;
        aVar.f39783h = this.error_times;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "LarkError");
        StringBuilder sb = new StringBuilder();
        if (this.debug_message != null) {
            sb.append(", debug_message=");
            sb.append(this.debug_message);
        }
        if (this.display_message != null) {
            sb.append(", display_message=");
            sb.append(this.display_message);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.user_err_title != null) {
            sb.append(", user_err_title=");
            sb.append(this.user_err_title);
        }
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (this.server_message != null) {
            sb.append(", server_message=");
            sb.append(this.server_message);
        }
        if (this.error_times != null) {
            sb.append(", error_times=");
            sb.append(this.error_times);
        }
        StringBuilder replace = sb.replace(0, 2, "LarkError{");
        replace.append('}');
        return replace.toString();
    }

    public LarkError(String str, String str2, Integer num, ErrorType errorType, String str3, String str4, String str5, Integer num2) {
        this(str, str2, num, errorType, str3, str4, str5, num2, ByteString.EMPTY);
    }

    public LarkError(String str, String str2, Integer num, ErrorType errorType, String str3, String str4, String str5, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.debug_message = str;
        this.display_message = str2;
        this.code = num;
        this.type = errorType;
        this.user_err_title = str3;
        this.request_id = str4;
        this.server_message = str5;
        this.error_times = num2;
    }
}
