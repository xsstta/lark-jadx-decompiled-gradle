package com.ss.android.lark.pb.authorization;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class OperatePermission extends Message<OperatePermission, C49556a> {
    public static final ProtoAdapter<OperatePermission> ADAPTER = new C49557b();
    private static final long serialVersionUID = 0;
    public final C49553Entity mobject;
    public final PermissionType mperm_type;
    public final ResultType mresult;

    /* renamed from: com.ss.android.lark.pb.authorization.OperatePermission$b */
    private static final class C49557b extends ProtoAdapter<OperatePermission> {
        C49557b() {
            super(FieldEncoding.LENGTH_DELIMITED, OperatePermission.class);
        }

        /* renamed from: a */
        public int encodedSize(OperatePermission operatePermission) {
            return PermissionType.ADAPTER.encodedSizeWithTag(1, operatePermission.mperm_type) + ResultType.ADAPTER.encodedSizeWithTag(2, operatePermission.mresult) + C49553Entity.ADAPTER.encodedSizeWithTag(3, operatePermission.mobject) + operatePermission.unknownFields().size();
        }

        /* renamed from: a */
        public OperatePermission decode(ProtoReader protoReader) throws IOException {
            C49556a aVar = new C49556a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124168a = PermissionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f124169b = ResultType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124170c = C49553Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OperatePermission operatePermission) throws IOException {
            PermissionType.ADAPTER.encodeWithTag(protoWriter, 1, operatePermission.mperm_type);
            ResultType.ADAPTER.encodeWithTag(protoWriter, 2, operatePermission.mresult);
            C49553Entity.ADAPTER.encodeWithTag(protoWriter, 3, operatePermission.mobject);
            protoWriter.writeBytes(operatePermission.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49556a newBuilder() {
        C49556a aVar = new C49556a();
        aVar.f124168a = this.mperm_type;
        aVar.f124169b = this.mresult;
        aVar.f124170c = this.mobject;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.authorization.OperatePermission$a */
    public static final class C49556a extends Message.Builder<OperatePermission, C49556a> {

        /* renamed from: a */
        public PermissionType f124168a;

        /* renamed from: b */
        public ResultType f124169b;

        /* renamed from: c */
        public C49553Entity f124170c;

        /* renamed from: a */
        public OperatePermission build() {
            ResultType resultType;
            C49553Entity entity;
            PermissionType permissionType = this.f124168a;
            if (permissionType != null && (resultType = this.f124169b) != null && (entity = this.f124170c) != null) {
                return new OperatePermission(permissionType, resultType, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(permissionType, "mperm_type", this.f124169b, "mresult", this.f124170c, "mobject");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", perm_type=");
        sb.append(this.mperm_type);
        sb.append(", result=");
        sb.append(this.mresult);
        sb.append(", object=");
        sb.append(this.mobject);
        StringBuilder replace = sb.replace(0, 2, "OperatePermission{");
        replace.append('}');
        return replace.toString();
    }

    public OperatePermission(PermissionType permissionType, ResultType resultType, C49553Entity entity) {
        this(permissionType, resultType, entity, ByteString.EMPTY);
    }

    public OperatePermission(PermissionType permissionType, ResultType resultType, C49553Entity entity, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mperm_type = permissionType;
        this.mresult = resultType;
        this.mobject = entity;
    }
}
