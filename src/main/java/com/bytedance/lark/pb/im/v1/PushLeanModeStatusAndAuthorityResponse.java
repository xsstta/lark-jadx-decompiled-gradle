package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushLeanModeStatusAndAuthorityResponse extends Message<PushLeanModeStatusAndAuthorityResponse, C17907a> {
    public static final ProtoAdapter<PushLeanModeStatusAndAuthorityResponse> ADAPTER = new C17908b();
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

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLeanModeStatusAndAuthorityResponse$b */
    private static final class C17908b extends ProtoAdapter<PushLeanModeStatusAndAuthorityResponse> {
        C17908b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushLeanModeStatusAndAuthorityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushLeanModeStatusAndAuthorityResponse pushLeanModeStatusAndAuthorityResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (pushLeanModeStatusAndAuthorityResponse.enable_lean_mode != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pushLeanModeStatusAndAuthorityResponse.enable_lean_mode);
            } else {
                i = 0;
            }
            if (pushLeanModeStatusAndAuthorityResponse.device_have_authority != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, pushLeanModeStatusAndAuthorityResponse.device_have_authority);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (pushLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, pushLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (pushLeanModeStatusAndAuthorityResponse.have_device_lean_mode != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pushLeanModeStatusAndAuthorityResponse.have_device_lean_mode);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (pushLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, pushLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (pushLeanModeStatusAndAuthorityResponse.update_time != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, pushLeanModeStatusAndAuthorityResponse.update_time);
            }
            return i10 + i6 + pushLeanModeStatusAndAuthorityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushLeanModeStatusAndAuthorityResponse decode(ProtoReader protoReader) throws IOException {
            C17907a aVar = new C17907a();
            aVar.f44988a = false;
            aVar.f44989b = false;
            aVar.f44990c = false;
            aVar.f44991d = false;
            aVar.f44992e = false;
            aVar.f44993f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44988a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44989b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44990c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44991d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44992e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44993f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PushLeanModeStatusAndAuthorityResponse pushLeanModeStatusAndAuthorityResponse) throws IOException {
            if (pushLeanModeStatusAndAuthorityResponse.enable_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pushLeanModeStatusAndAuthorityResponse.enable_lean_mode);
            }
            if (pushLeanModeStatusAndAuthorityResponse.device_have_authority != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pushLeanModeStatusAndAuthorityResponse.device_have_authority);
            }
            if (pushLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, pushLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode);
            }
            if (pushLeanModeStatusAndAuthorityResponse.have_device_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pushLeanModeStatusAndAuthorityResponse.have_device_lean_mode);
            }
            if (pushLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pushLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode);
            }
            if (pushLeanModeStatusAndAuthorityResponse.update_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pushLeanModeStatusAndAuthorityResponse.update_time);
            }
            protoWriter.writeBytes(pushLeanModeStatusAndAuthorityResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLeanModeStatusAndAuthorityResponse$a */
    public static final class C17907a extends Message.Builder<PushLeanModeStatusAndAuthorityResponse, C17907a> {

        /* renamed from: a */
        public Boolean f44988a;

        /* renamed from: b */
        public Boolean f44989b;

        /* renamed from: c */
        public Boolean f44990c;

        /* renamed from: d */
        public Boolean f44991d;

        /* renamed from: e */
        public Boolean f44992e;

        /* renamed from: f */
        public String f44993f;

        /* renamed from: a */
        public PushLeanModeStatusAndAuthorityResponse build() {
            return new PushLeanModeStatusAndAuthorityResponse(this.f44988a, this.f44989b, this.f44990c, this.f44991d, this.f44992e, this.f44993f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17907a newBuilder() {
        C17907a aVar = new C17907a();
        aVar.f44988a = this.enable_lean_mode;
        aVar.f44989b = this.device_have_authority;
        aVar.f44990c = this.other_closeable_device_is_lean_mode;
        aVar.f44991d = this.have_device_lean_mode;
        aVar.f44992e = this.have_all_device_lean_mode;
        aVar.f44993f = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushLeanModeStatusAndAuthorityResponse");
        StringBuilder sb = new StringBuilder();
        if (this.enable_lean_mode != null) {
            sb.append(", enable_lean_mode=");
            sb.append(this.enable_lean_mode);
        }
        if (this.device_have_authority != null) {
            sb.append(", device_have_authority=");
            sb.append(this.device_have_authority);
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
        StringBuilder replace = sb.replace(0, 2, "PushLeanModeStatusAndAuthorityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushLeanModeStatusAndAuthorityResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str) {
        this(bool, bool2, bool3, bool4, bool5, str, ByteString.EMPTY);
    }

    public PushLeanModeStatusAndAuthorityResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_lean_mode = bool;
        this.device_have_authority = bool2;
        this.other_closeable_device_is_lean_mode = bool3;
        this.have_device_lean_mode = bool4;
        this.have_all_device_lean_mode = bool5;
        this.update_time = str;
    }
}
