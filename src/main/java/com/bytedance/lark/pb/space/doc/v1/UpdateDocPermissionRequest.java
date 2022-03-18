package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UpdateDocPermissionRequest extends Message<UpdateDocPermissionRequest, C19291a> {
    public static final ProtoAdapter<UpdateDocPermissionRequest> ADAPTER = new C19292b();
    private static final long serialVersionUID = 0;
    public final List<Pair> pairs;

    public enum Permission implements WireEnum {
        UNKNOWN(0),
        READ(1),
        EDIT(4),
        FORBIDDEN(501);
        
        public static final ProtoAdapter<Permission> ADAPTER = ProtoAdapter.newEnumAdapter(Permission.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Permission fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return READ;
            }
            if (i == 4) {
                return EDIT;
            }
            if (i != 501) {
                return null;
            }
            return FORBIDDEN;
        }

        private Permission(int i) {
            this.value = i;
        }
    }

    public static final class Pair extends Message<Pair, C19289a> {
        public static final ProtoAdapter<Pair> ADAPTER = new C19290b();
        public static final Permission DEFAULT_PERM = Permission.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String message_id;
        public final Permission perm;
        public final String token;

        /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocPermissionRequest$Pair$b */
        private static final class C19290b extends ProtoAdapter<Pair> {
            C19290b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pair.class);
            }

            /* renamed from: a */
            public int encodedSize(Pair pair) {
                int i;
                int i2;
                int i3 = 0;
                if (pair.message_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, pair.message_id);
                } else {
                    i = 0;
                }
                if (pair.perm != null) {
                    i2 = Permission.ADAPTER.encodedSizeWithTag(2, pair.perm);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (pair.token != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pair.token);
                }
                return i4 + i3 + pair.unknownFields().size();
            }

            /* renamed from: a */
            public Pair decode(ProtoReader protoReader) throws IOException {
                C19289a aVar = new C19289a();
                aVar.f47476a = "";
                aVar.f47477b = Permission.UNKNOWN;
                aVar.f47478c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47476a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            aVar.f47477b = Permission.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47478c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Pair pair) throws IOException {
                if (pair.message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pair.message_id);
                }
                if (pair.perm != null) {
                    Permission.ADAPTER.encodeWithTag(protoWriter, 2, pair.perm);
                }
                if (pair.token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pair.token);
                }
                protoWriter.writeBytes(pair.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocPermissionRequest$Pair$a */
        public static final class C19289a extends Message.Builder<Pair, C19289a> {

            /* renamed from: a */
            public String f47476a;

            /* renamed from: b */
            public Permission f47477b;

            /* renamed from: c */
            public String f47478c;

            /* renamed from: a */
            public Pair build() {
                return new Pair(this.f47476a, this.f47477b, this.f47478c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19289a newBuilder() {
            C19289a aVar = new C19289a();
            aVar.f47476a = this.message_id;
            aVar.f47477b = this.perm;
            aVar.f47478c = this.token;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("space", "Pair");
            StringBuilder sb = new StringBuilder();
            if (this.message_id != null) {
                sb.append(", message_id=");
                sb.append(this.message_id);
            }
            if (this.perm != null) {
                sb.append(", perm=");
                sb.append(this.perm);
            }
            if (this.token != null) {
                sb.append(", token=");
                sb.append(this.token);
            }
            StringBuilder replace = sb.replace(0, 2, "Pair{");
            replace.append('}');
            return replace.toString();
        }

        public Pair(String str, Permission permission, String str2) {
            this(str, permission, str2, ByteString.EMPTY);
        }

        public Pair(String str, Permission permission, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.message_id = str;
            this.perm = permission;
            this.token = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocPermissionRequest$b */
    private static final class C19292b extends ProtoAdapter<UpdateDocPermissionRequest> {
        C19292b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateDocPermissionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateDocPermissionRequest updateDocPermissionRequest) {
            return Pair.ADAPTER.asRepeated().encodedSizeWithTag(1, updateDocPermissionRequest.pairs) + updateDocPermissionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateDocPermissionRequest decode(ProtoReader protoReader) throws IOException {
            C19291a aVar = new C19291a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47479a.add(Pair.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateDocPermissionRequest updateDocPermissionRequest) throws IOException {
            Pair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateDocPermissionRequest.pairs);
            protoWriter.writeBytes(updateDocPermissionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocPermissionRequest$a */
    public static final class C19291a extends Message.Builder<UpdateDocPermissionRequest, C19291a> {

        /* renamed from: a */
        public List<Pair> f47479a = Internal.newMutableList();

        /* renamed from: a */
        public UpdateDocPermissionRequest build() {
            return new UpdateDocPermissionRequest(this.f47479a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19291a mo65791a(List<Pair> list) {
            Internal.checkElementsNotNull(list);
            this.f47479a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19291a newBuilder() {
        C19291a aVar = new C19291a();
        aVar.f47479a = Internal.copyOf("pairs", this.pairs);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UpdateDocPermissionRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.pairs.isEmpty()) {
            sb.append(", pairs=");
            sb.append(this.pairs);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateDocPermissionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateDocPermissionRequest(List<Pair> list) {
        this(list, ByteString.EMPTY);
    }

    public UpdateDocPermissionRequest(List<Pair> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pairs = Internal.immutableCopyOf("pairs", list);
    }
}
