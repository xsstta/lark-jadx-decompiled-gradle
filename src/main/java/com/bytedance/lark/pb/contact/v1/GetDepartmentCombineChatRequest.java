package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetDepartmentCombineChatRequest extends Message<GetDepartmentCombineChatRequest, C16224a> {
    public static final ProtoAdapter<GetDepartmentCombineChatRequest> ADAPTER = new C16225b();
    public static final Integer DEFAULT_CHATTER_COUNT = 20;
    public static final Integer DEFAULT_CHATTER_OFFSET = 0;
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Boolean DEFAULT_SUB_DEPARTMENT_PAGING = false;
    public static final Boolean DEFAULT_USE_DISPLAY_ORDER = false;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer chatter_count;
    public final Integer chatter_offset;
    public final Integer count;
    public final String department_id;
    public final ExtendParam extend_param;
    public final Integer offset;
    public final Boolean sub_department_paging;
    public final Boolean use_display_order;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentCombineChatRequest$b */
    private static final class C16225b extends ProtoAdapter<GetDepartmentCombineChatRequest> {
        C16225b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDepartmentCombineChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDepartmentCombineChatRequest getDepartmentCombineChatRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (getDepartmentCombineChatRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getDepartmentCombineChatRequest.chat_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.encodedSizeWithTag(2, getDepartmentCombineChatRequest.department_id);
            if (getDepartmentCombineChatRequest.chatter_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getDepartmentCombineChatRequest.chatter_count);
            } else {
                i2 = 0;
            }
            int i9 = encodedSizeWithTag + i2;
            if (getDepartmentCombineChatRequest.chatter_offset != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, getDepartmentCombineChatRequest.chatter_offset);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (getDepartmentCombineChatRequest.extend_param != null) {
                i4 = ExtendParam.ADAPTER.encodedSizeWithTag(5, getDepartmentCombineChatRequest.extend_param);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (getDepartmentCombineChatRequest.offset != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, getDepartmentCombineChatRequest.offset);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (getDepartmentCombineChatRequest.count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(7, getDepartmentCombineChatRequest.count);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (getDepartmentCombineChatRequest.sub_department_paging != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(8, getDepartmentCombineChatRequest.sub_department_paging);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (getDepartmentCombineChatRequest.use_display_order != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(9, getDepartmentCombineChatRequest.use_display_order);
            }
            return i14 + i8 + getDepartmentCombineChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDepartmentCombineChatRequest decode(ProtoReader protoReader) throws IOException {
            C16224a aVar = new C16224a();
            aVar.f42402a = "";
            aVar.f42403b = "";
            aVar.f42404c = 20;
            aVar.f42405d = 0;
            aVar.f42407f = 0;
            aVar.f42408g = 0;
            aVar.f42409h = false;
            aVar.f42410i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42402a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42403b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42404c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42405d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42406e = ExtendParam.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42407f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42408g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42409h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42410i = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetDepartmentCombineChatRequest getDepartmentCombineChatRequest) throws IOException {
            if (getDepartmentCombineChatRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getDepartmentCombineChatRequest.chat_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getDepartmentCombineChatRequest.department_id);
            if (getDepartmentCombineChatRequest.chatter_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getDepartmentCombineChatRequest.chatter_count);
            }
            if (getDepartmentCombineChatRequest.chatter_offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getDepartmentCombineChatRequest.chatter_offset);
            }
            if (getDepartmentCombineChatRequest.extend_param != null) {
                ExtendParam.ADAPTER.encodeWithTag(protoWriter, 5, getDepartmentCombineChatRequest.extend_param);
            }
            if (getDepartmentCombineChatRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getDepartmentCombineChatRequest.offset);
            }
            if (getDepartmentCombineChatRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, getDepartmentCombineChatRequest.count);
            }
            if (getDepartmentCombineChatRequest.sub_department_paging != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, getDepartmentCombineChatRequest.sub_department_paging);
            }
            if (getDepartmentCombineChatRequest.use_display_order != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, getDepartmentCombineChatRequest.use_display_order);
            }
            protoWriter.writeBytes(getDepartmentCombineChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentCombineChatRequest$a */
    public static final class C16224a extends Message.Builder<GetDepartmentCombineChatRequest, C16224a> {

        /* renamed from: a */
        public String f42402a;

        /* renamed from: b */
        public String f42403b;

        /* renamed from: c */
        public Integer f42404c;

        /* renamed from: d */
        public Integer f42405d;

        /* renamed from: e */
        public ExtendParam f42406e;

        /* renamed from: f */
        public Integer f42407f;

        /* renamed from: g */
        public Integer f42408g;

        /* renamed from: h */
        public Boolean f42409h;

        /* renamed from: i */
        public Boolean f42410i;

        /* renamed from: a */
        public GetDepartmentCombineChatRequest build() {
            String str = this.f42403b;
            if (str != null) {
                return new GetDepartmentCombineChatRequest(this.f42402a, str, this.f42404c, this.f42405d, this.f42406e, this.f42407f, this.f42408g, this.f42409h, this.f42410i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "department_id");
        }

        /* renamed from: a */
        public C16224a mo58140a(ExtendParam extendParam) {
            this.f42406e = extendParam;
            return this;
        }

        /* renamed from: b */
        public C16224a mo58145b(Boolean bool) {
            this.f42410i = bool;
            return this;
        }

        /* renamed from: a */
        public C16224a mo58141a(Boolean bool) {
            this.f42409h = bool;
            return this;
        }

        /* renamed from: b */
        public C16224a mo58146b(Integer num) {
            this.f42408g = num;
            return this;
        }

        /* renamed from: a */
        public C16224a mo58142a(Integer num) {
            this.f42407f = num;
            return this;
        }

        /* renamed from: a */
        public C16224a mo58143a(String str) {
            this.f42403b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16224a newBuilder() {
        C16224a aVar = new C16224a();
        aVar.f42402a = this.chat_id;
        aVar.f42403b = this.department_id;
        aVar.f42404c = this.chatter_count;
        aVar.f42405d = this.chatter_offset;
        aVar.f42406e = this.extend_param;
        aVar.f42407f = this.offset;
        aVar.f42408g = this.count;
        aVar.f42409h = this.sub_department_paging;
        aVar.f42410i = this.use_display_order;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetDepartmentCombineChatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        sb.append(", department_id=");
        sb.append(this.department_id);
        if (this.chatter_count != null) {
            sb.append(", chatter_count=");
            sb.append(this.chatter_count);
        }
        if (this.chatter_offset != null) {
            sb.append(", chatter_offset=");
            sb.append(this.chatter_offset);
        }
        if (this.extend_param != null) {
            sb.append(", extend_param=");
            sb.append(this.extend_param);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.sub_department_paging != null) {
            sb.append(", sub_department_paging=");
            sb.append(this.sub_department_paging);
        }
        if (this.use_display_order != null) {
            sb.append(", use_display_order=");
            sb.append(this.use_display_order);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDepartmentCombineChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDepartmentCombineChatRequest(String str, String str2, Integer num, Integer num2, ExtendParam extendParam, Integer num3, Integer num4, Boolean bool, Boolean bool2) {
        this(str, str2, num, num2, extendParam, num3, num4, bool, bool2, ByteString.EMPTY);
    }

    public GetDepartmentCombineChatRequest(String str, String str2, Integer num, Integer num2, ExtendParam extendParam, Integer num3, Integer num4, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.department_id = str2;
        this.chatter_count = num;
        this.chatter_offset = num2;
        this.extend_param = extendParam;
        this.offset = num3;
        this.count = num4;
        this.sub_department_paging = bool;
        this.use_display_order = bool2;
    }
}
