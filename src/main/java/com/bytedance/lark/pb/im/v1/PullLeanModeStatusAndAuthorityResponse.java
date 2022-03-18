package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullLeanModeStatusAndAuthorityResponse extends Message<PullLeanModeStatusAndAuthorityResponse, C17863a> {
    public static final ProtoAdapter<PullLeanModeStatusAndAuthorityResponse> ADAPTER = new C17864b();
    public static final Boolean DEFAULT_DEVICE_HAVE_AUTHORITY = false;
    public static final Boolean DEFAULT_ENABLE_LEAN_MODE = false;
    public static final Boolean DEFAULT_HAVE_ALL_DEVICE_LEAN_MODE = false;
    public static final Boolean DEFAULT_HAVE_DEVICE_LEAN_MODE = false;
    public static final Boolean DEFAULT_OTHER_CLOSEABLE_DEVICE_IS_LEAN_MODE = false;
    private static final long serialVersionUID = 0;
    public final Boolean device_have_authority;
    public final Boolean enable_lean_mode;
    public final Boolean have_all_device_lean_mode;
    public final Boolean have_device_lean_mode;
    public final Boolean other_closeable_device_is_lean_mode;
    public final String update_time;

    /* renamed from: com.bytedance.lark.pb.im.v1.PullLeanModeStatusAndAuthorityResponse$b */
    private static final class C17864b extends ProtoAdapter<PullLeanModeStatusAndAuthorityResponse> {
        C17864b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullLeanModeStatusAndAuthorityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullLeanModeStatusAndAuthorityResponse pullLeanModeStatusAndAuthorityResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (pullLeanModeStatusAndAuthorityResponse.device_have_authority != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pullLeanModeStatusAndAuthorityResponse.device_have_authority);
            } else {
                i = 0;
            }
            if (pullLeanModeStatusAndAuthorityResponse.enable_lean_mode != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, pullLeanModeStatusAndAuthorityResponse.enable_lean_mode);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (pullLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, pullLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (pullLeanModeStatusAndAuthorityResponse.have_device_lean_mode != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pullLeanModeStatusAndAuthorityResponse.have_device_lean_mode);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (pullLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, pullLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (pullLeanModeStatusAndAuthorityResponse.update_time != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, pullLeanModeStatusAndAuthorityResponse.update_time);
            }
            return i10 + i6 + pullLeanModeStatusAndAuthorityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullLeanModeStatusAndAuthorityResponse decode(ProtoReader protoReader) throws IOException {
            C17863a aVar = new C17863a();
            aVar.f44929a = false;
            aVar.f44930b = false;
            aVar.f44931c = false;
            aVar.f44932d = false;
            aVar.f44933e = false;
            aVar.f44934f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44929a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44930b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44931c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44932d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44933e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44934f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PullLeanModeStatusAndAuthorityResponse pullLeanModeStatusAndAuthorityResponse) throws IOException {
            if (pullLeanModeStatusAndAuthorityResponse.device_have_authority != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pullLeanModeStatusAndAuthorityResponse.device_have_authority);
            }
            if (pullLeanModeStatusAndAuthorityResponse.enable_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullLeanModeStatusAndAuthorityResponse.enable_lean_mode);
            }
            if (pullLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, pullLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode);
            }
            if (pullLeanModeStatusAndAuthorityResponse.have_device_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pullLeanModeStatusAndAuthorityResponse.have_device_lean_mode);
            }
            if (pullLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pullLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode);
            }
            if (pullLeanModeStatusAndAuthorityResponse.update_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pullLeanModeStatusAndAuthorityResponse.update_time);
            }
            protoWriter.writeBytes(pullLeanModeStatusAndAuthorityResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PullLeanModeStatusAndAuthorityResponse$a */
    public static final class C17863a extends Message.Builder<PullLeanModeStatusAndAuthorityResponse, C17863a> {

        /* renamed from: a */
        public Boolean f44929a;

        /* renamed from: b */
        public Boolean f44930b;

        /* renamed from: c */
        public Boolean f44931c;

        /* renamed from: d */
        public Boolean f44932d;

        /* renamed from: e */
        public Boolean f44933e;

        /* renamed from: f */
        public String f44934f;

        /* renamed from: a */
        public PullLeanModeStatusAndAuthorityResponse build() {
            return new PullLeanModeStatusAndAuthorityResponse(this.f44929a, this.f44930b, this.f44931c, this.f44932d, this.f44933e, this.f44934f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17863a newBuilder() {
        C17863a aVar = new C17863a();
        aVar.f44929a = this.device_have_authority;
        aVar.f44930b = this.enable_lean_mode;
        aVar.f44931c = this.other_closeable_device_is_lean_mode;
        aVar.f44932d = this.have_device_lean_mode;
        aVar.f44933e = this.have_all_device_lean_mode;
        aVar.f44934f = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PullLeanModeStatusAndAuthorityResponse");
        StringBuilder sb = new StringBuilder();
        if (this.device_have_authority != null) {
            sb.append(", device_have_authority=");
            sb.append(this.device_have_authority);
        }
        if (this.enable_lean_mode != null) {
            sb.append(", enable_lean_mode=");
            sb.append(this.enable_lean_mode);
        }
        if (this.other_closeable_device_is_lean_mode != null) {
            sb.append(", other_closeable_device_is_lean_mode=");
            sb.append(this.other_closeable_device_is_lean_mode);
        }
        if (this.have_device_lean_mode != null) {
            sb.append(", have_device_lean_mode=");
            sb.append(this.have_device_lean_mode);
        }
        if (this.have_all_device_lean_mode != null) {
            sb.append(", have_all_device_lean_mode=");
            sb.append(this.have_all_device_lean_mode);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "PullLeanModeStatusAndAuthorityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullLeanModeStatusAndAuthorityResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str) {
        this(bool, bool2, bool3, bool4, bool5, str, ByteString.EMPTY);
    }

    public PullLeanModeStatusAndAuthorityResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.device_have_authority = bool;
        this.enable_lean_mode = bool2;
        this.other_closeable_device_is_lean_mode = bool3;
        this.have_device_lean_mode = bool4;
        this.have_all_device_lean_mode = bool5;
        this.update_time = str;
    }
}
