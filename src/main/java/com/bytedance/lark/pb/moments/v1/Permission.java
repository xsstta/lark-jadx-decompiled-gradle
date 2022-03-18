package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Permission extends Message<Permission, C18490a> {
    public static final ProtoAdapter<Permission> ADAPTER = new C18491b();
    public static final Boolean DEFAULT_CAN_ACCESS = false;
    public static final Boolean DEFAULT_IS_ADMIN = false;
    public static final Boolean DEFAULT_IS_MUTED = false;
    public static final Long DEFAULT_MUTED_END_TIME_SEC = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean can_access;
    public final Boolean is_admin;
    public final Boolean is_muted;
    public final Long muted_end_time_sec;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Permission$b */
    private static final class C18491b extends ProtoAdapter<Permission> {
        C18491b() {
            super(FieldEncoding.LENGTH_DELIMITED, Permission.class);
        }

        /* renamed from: a */
        public int encodedSize(Permission permission) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (permission.can_access != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, permission.can_access);
            } else {
                i = 0;
            }
            if (permission.is_admin != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, permission.is_admin);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (permission.is_muted != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, permission.is_muted);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (permission.muted_end_time_sec != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, permission.muted_end_time_sec);
            }
            return i6 + i4 + permission.unknownFields().size();
        }

        /* renamed from: a */
        public Permission decode(ProtoReader protoReader) throws IOException {
            C18490a aVar = new C18490a();
            aVar.f45919a = false;
            aVar.f45920b = false;
            aVar.f45921c = false;
            aVar.f45922d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45919a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45920b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45921c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45922d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Permission permission) throws IOException {
            if (permission.can_access != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, permission.can_access);
            }
            if (permission.is_admin != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, permission.is_admin);
            }
            if (permission.is_muted != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, permission.is_muted);
            }
            if (permission.muted_end_time_sec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, permission.muted_end_time_sec);
            }
            protoWriter.writeBytes(permission.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Permission$a */
    public static final class C18490a extends Message.Builder<Permission, C18490a> {

        /* renamed from: a */
        public Boolean f45919a;

        /* renamed from: b */
        public Boolean f45920b;

        /* renamed from: c */
        public Boolean f45921c;

        /* renamed from: d */
        public Long f45922d;

        /* renamed from: a */
        public Permission build() {
            return new Permission(this.f45919a, this.f45920b, this.f45921c, this.f45922d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18490a newBuilder() {
        C18490a aVar = new C18490a();
        aVar.f45919a = this.can_access;
        aVar.f45920b = this.is_admin;
        aVar.f45921c = this.is_muted;
        aVar.f45922d = this.muted_end_time_sec;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Permission");
        StringBuilder sb = new StringBuilder();
        if (this.can_access != null) {
            sb.append(", can_access=");
            sb.append(this.can_access);
        }
        if (this.is_admin != null) {
            sb.append(", is_admin=");
            sb.append(this.is_admin);
        }
        if (this.is_muted != null) {
            sb.append(", is_muted=");
            sb.append(this.is_muted);
        }
        if (this.muted_end_time_sec != null) {
            sb.append(", muted_end_time_sec=");
            sb.append(this.muted_end_time_sec);
        }
        StringBuilder replace = sb.replace(0, 2, "Permission{");
        replace.append('}');
        return replace.toString();
    }

    public Permission(Boolean bool, Boolean bool2, Boolean bool3, Long l) {
        this(bool, bool2, bool3, l, ByteString.EMPTY);
    }

    public Permission(Boolean bool, Boolean bool2, Boolean bool3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_access = bool;
        this.is_admin = bool2;
        this.is_muted = bool3;
        this.muted_end_time_sec = l;
    }
}
