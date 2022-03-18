package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchLeanModeStatusResponse extends Message<PatchLeanModeStatusResponse, C17833a> {
    public static final ProtoAdapter<PatchLeanModeStatusResponse> ADAPTER = new C17834b();
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

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchLeanModeStatusResponse$b */
    private static final class C17834b extends ProtoAdapter<PatchLeanModeStatusResponse> {
        C17834b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchLeanModeStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchLeanModeStatusResponse patchLeanModeStatusResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (patchLeanModeStatusResponse.device_have_authority != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, patchLeanModeStatusResponse.device_have_authority);
            } else {
                i = 0;
            }
            if (patchLeanModeStatusResponse.enable_lean_mode != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, patchLeanModeStatusResponse.enable_lean_mode);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (patchLeanModeStatusResponse.other_closeable_device_is_lean_mode != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, patchLeanModeStatusResponse.other_closeable_device_is_lean_mode);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (patchLeanModeStatusResponse.have_device_lean_mode != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, patchLeanModeStatusResponse.have_device_lean_mode);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (patchLeanModeStatusResponse.have_all_device_lean_mode != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, patchLeanModeStatusResponse.have_all_device_lean_mode);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (patchLeanModeStatusResponse.update_time != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, patchLeanModeStatusResponse.update_time);
            }
            return i10 + i6 + patchLeanModeStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchLeanModeStatusResponse decode(ProtoReader protoReader) throws IOException {
            C17833a aVar = new C17833a();
            aVar.f44892a = false;
            aVar.f44893b = false;
            aVar.f44894c = false;
            aVar.f44895d = false;
            aVar.f44896e = false;
            aVar.f44897f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44892a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44893b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44894c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44895d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44896e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44897f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PatchLeanModeStatusResponse patchLeanModeStatusResponse) throws IOException {
            if (patchLeanModeStatusResponse.device_have_authority != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, patchLeanModeStatusResponse.device_have_authority);
            }
            if (patchLeanModeStatusResponse.enable_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, patchLeanModeStatusResponse.enable_lean_mode);
            }
            if (patchLeanModeStatusResponse.other_closeable_device_is_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, patchLeanModeStatusResponse.other_closeable_device_is_lean_mode);
            }
            if (patchLeanModeStatusResponse.have_device_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, patchLeanModeStatusResponse.have_device_lean_mode);
            }
            if (patchLeanModeStatusResponse.have_all_device_lean_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, patchLeanModeStatusResponse.have_all_device_lean_mode);
            }
            if (patchLeanModeStatusResponse.update_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, patchLeanModeStatusResponse.update_time);
            }
            protoWriter.writeBytes(patchLeanModeStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchLeanModeStatusResponse$a */
    public static final class C17833a extends Message.Builder<PatchLeanModeStatusResponse, C17833a> {

        /* renamed from: a */
        public Boolean f44892a;

        /* renamed from: b */
        public Boolean f44893b;

        /* renamed from: c */
        public Boolean f44894c;

        /* renamed from: d */
        public Boolean f44895d;

        /* renamed from: e */
        public Boolean f44896e;

        /* renamed from: f */
        public String f44897f;

        /* renamed from: a */
        public PatchLeanModeStatusResponse build() {
            return new PatchLeanModeStatusResponse(this.f44892a, this.f44893b, this.f44894c, this.f44895d, this.f44896e, this.f44897f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17833a newBuilder() {
        C17833a aVar = new C17833a();
        aVar.f44892a = this.device_have_authority;
        aVar.f44893b = this.enable_lean_mode;
        aVar.f44894c = this.other_closeable_device_is_lean_mode;
        aVar.f44895d = this.have_device_lean_mode;
        aVar.f44896e = this.have_all_device_lean_mode;
        aVar.f44897f = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchLeanModeStatusResponse");
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
        StringBuilder replace = sb.replace(0, 2, "PatchLeanModeStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchLeanModeStatusResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str) {
        this(bool, bool2, bool3, bool4, bool5, str, ByteString.EMPTY);
    }

    public PatchLeanModeStatusResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.device_have_authority = bool;
        this.enable_lean_mode = bool2;
        this.other_closeable_device_is_lean_mode = bool3;
        this.have_device_lean_mode = bool4;
        this.have_all_device_lean_mode = bool5;
        this.update_time = str;
    }
}
