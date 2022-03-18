package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DocPermission;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetMessageDocPermissionsResponse extends Message<GetMessageDocPermissionsResponse, C19267a> {
    public static final ProtoAdapter<GetMessageDocPermissionsResponse> ADAPTER = new C19268b();
    private static final long serialVersionUID = 0;
    public final Map<String, DocPermission.Permission> message_id2permission;
    public final Map<String, PermissionInfo> message_id2permission_info;
    public final Map<String, PermissionListInfo> message_id2permission_list_info;

    public static final class PermissionListInfo extends Message<PermissionListInfo, C19265a> {
        public static final ProtoAdapter<PermissionListInfo> ADAPTER = new C19266b();
        private static final long serialVersionUID = 0;
        public final Map<String, PermissionList> doc_url2permission_list;

        public static final class PermissionList extends Message<PermissionList, C19263a> {
            public static final ProtoAdapter<PermissionList> ADAPTER = new C19264b();
            private static final long serialVersionUID = 0;
            public final List<DocPermission.Permission> permissions;

            /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse$PermissionListInfo$PermissionList$b */
            private static final class C19264b extends ProtoAdapter<PermissionList> {
                C19264b() {
                    super(FieldEncoding.LENGTH_DELIMITED, PermissionList.class);
                }

                /* renamed from: a */
                public int encodedSize(PermissionList permissionList) {
                    return DocPermission.Permission.ADAPTER.asRepeated().encodedSizeWithTag(1, permissionList.permissions) + permissionList.unknownFields().size();
                }

                /* renamed from: a */
                public PermissionList decode(ProtoReader protoReader) throws IOException {
                    C19263a aVar = new C19263a();
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
                            aVar.f47454a.add(DocPermission.Permission.ADAPTER.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, PermissionList permissionList) throws IOException {
                    DocPermission.Permission.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, permissionList.permissions);
                    protoWriter.writeBytes(permissionList.unknownFields());
                }
            }

            /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse$PermissionListInfo$PermissionList$a */
            public static final class C19263a extends Message.Builder<PermissionList, C19263a> {

                /* renamed from: a */
                public List<DocPermission.Permission> f47454a = Internal.newMutableList();

                /* renamed from: a */
                public PermissionList build() {
                    return new PermissionList(this.f47454a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C19263a newBuilder() {
                C19263a aVar = new C19263a();
                aVar.f47454a = Internal.copyOf("permissions", this.permissions);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("space", "PermissionList");
                StringBuilder sb = new StringBuilder();
                if (!this.permissions.isEmpty()) {
                    sb.append(", permissions=");
                    sb.append(this.permissions);
                }
                StringBuilder replace = sb.replace(0, 2, "PermissionList{");
                replace.append('}');
                return replace.toString();
            }

            public PermissionList(List<DocPermission.Permission> list) {
                this(list, ByteString.EMPTY);
            }

            public PermissionList(List<DocPermission.Permission> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.permissions = Internal.immutableCopyOf("permissions", list);
            }
        }

        /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse$PermissionListInfo$a */
        public static final class C19265a extends Message.Builder<PermissionListInfo, C19265a> {

            /* renamed from: a */
            public Map<String, PermissionList> f47455a = Internal.newMutableMap();

            /* renamed from: a */
            public PermissionListInfo build() {
                return new PermissionListInfo(this.f47455a, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse$PermissionListInfo$b */
        private static final class C19266b extends ProtoAdapter<PermissionListInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, PermissionList>> f47456a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PermissionList.ADAPTER);

            C19266b() {
                super(FieldEncoding.LENGTH_DELIMITED, PermissionListInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(PermissionListInfo permissionListInfo) {
                return this.f47456a.encodedSizeWithTag(1, permissionListInfo.doc_url2permission_list) + permissionListInfo.unknownFields().size();
            }

            /* renamed from: a */
            public PermissionListInfo decode(ProtoReader protoReader) throws IOException {
                C19265a aVar = new C19265a();
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
                        aVar.f47455a.putAll(this.f47456a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PermissionListInfo permissionListInfo) throws IOException {
                this.f47456a.encodeWithTag(protoWriter, 1, permissionListInfo.doc_url2permission_list);
                protoWriter.writeBytes(permissionListInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19265a newBuilder() {
            C19265a aVar = new C19265a();
            aVar.f47455a = Internal.copyOf("doc_url2permission_list", this.doc_url2permission_list);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("space", "PermissionListInfo");
            StringBuilder sb = new StringBuilder();
            if (!this.doc_url2permission_list.isEmpty()) {
                sb.append(", doc_url2permission_list=");
                sb.append(this.doc_url2permission_list);
            }
            StringBuilder replace = sb.replace(0, 2, "PermissionListInfo{");
            replace.append('}');
            return replace.toString();
        }

        public PermissionListInfo(Map<String, PermissionList> map) {
            this(map, ByteString.EMPTY);
        }

        public PermissionListInfo(Map<String, PermissionList> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.doc_url2permission_list = Internal.immutableCopyOf("doc_url2permission_list", map);
        }
    }

    public static final class PermissionInfo extends Message<PermissionInfo, C19261a> {
        public static final ProtoAdapter<PermissionInfo> ADAPTER = new C19262b();
        private static final long serialVersionUID = 0;
        public final Map<String, DocPermission.Permission> doc_url2permission;

        /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse$PermissionInfo$a */
        public static final class C19261a extends Message.Builder<PermissionInfo, C19261a> {

            /* renamed from: a */
            public Map<String, DocPermission.Permission> f47452a = Internal.newMutableMap();

            /* renamed from: a */
            public PermissionInfo build() {
                return new PermissionInfo(this.f47452a, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse$PermissionInfo$b */
        private static final class C19262b extends ProtoAdapter<PermissionInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, DocPermission.Permission>> f47453a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermission.Permission.ADAPTER);

            C19262b() {
                super(FieldEncoding.LENGTH_DELIMITED, PermissionInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(PermissionInfo permissionInfo) {
                return this.f47453a.encodedSizeWithTag(1, permissionInfo.doc_url2permission) + permissionInfo.unknownFields().size();
            }

            /* renamed from: a */
            public PermissionInfo decode(ProtoReader protoReader) throws IOException {
                C19261a aVar = new C19261a();
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
                        aVar.f47452a.putAll(this.f47453a.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, PermissionInfo permissionInfo) throws IOException {
                this.f47453a.encodeWithTag(protoWriter, 1, permissionInfo.doc_url2permission);
                protoWriter.writeBytes(permissionInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19261a newBuilder() {
            C19261a aVar = new C19261a();
            aVar.f47452a = Internal.copyOf("doc_url2permission", this.doc_url2permission);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("space", "PermissionInfo");
            StringBuilder sb = new StringBuilder();
            if (!this.doc_url2permission.isEmpty()) {
                sb.append(", doc_url2permission=");
                sb.append(this.doc_url2permission);
            }
            StringBuilder replace = sb.replace(0, 2, "PermissionInfo{");
            replace.append('}');
            return replace.toString();
        }

        public PermissionInfo(Map<String, DocPermission.Permission> map) {
            this(map, ByteString.EMPTY);
        }

        public PermissionInfo(Map<String, DocPermission.Permission> map, ByteString byteString) {
            super(ADAPTER, byteString);
            this.doc_url2permission = Internal.immutableCopyOf("doc_url2permission", map);
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse$a */
    public static final class C19267a extends Message.Builder<GetMessageDocPermissionsResponse, C19267a> {

        /* renamed from: a */
        public Map<String, DocPermission.Permission> f47457a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, PermissionInfo> f47458b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, PermissionListInfo> f47459c = Internal.newMutableMap();

        /* renamed from: a */
        public GetMessageDocPermissionsResponse build() {
            return new GetMessageDocPermissionsResponse(this.f47457a, this.f47458b, this.f47459c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetMessageDocPermissionsResponse$b */
    private static final class C19268b extends ProtoAdapter<GetMessageDocPermissionsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, DocPermission.Permission>> f47460a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DocPermission.Permission.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, PermissionInfo>> f47461b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PermissionInfo.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, PermissionListInfo>> f47462c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PermissionListInfo.ADAPTER);

        C19268b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageDocPermissionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageDocPermissionsResponse getMessageDocPermissionsResponse) {
            return this.f47460a.encodedSizeWithTag(1, getMessageDocPermissionsResponse.message_id2permission) + this.f47461b.encodedSizeWithTag(2, getMessageDocPermissionsResponse.message_id2permission_info) + this.f47462c.encodedSizeWithTag(3, getMessageDocPermissionsResponse.message_id2permission_list_info) + getMessageDocPermissionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageDocPermissionsResponse decode(ProtoReader protoReader) throws IOException {
            C19267a aVar = new C19267a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47457a.putAll(this.f47460a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47458b.putAll(this.f47461b.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47459c.putAll(this.f47462c.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageDocPermissionsResponse getMessageDocPermissionsResponse) throws IOException {
            this.f47460a.encodeWithTag(protoWriter, 1, getMessageDocPermissionsResponse.message_id2permission);
            this.f47461b.encodeWithTag(protoWriter, 2, getMessageDocPermissionsResponse.message_id2permission_info);
            this.f47462c.encodeWithTag(protoWriter, 3, getMessageDocPermissionsResponse.message_id2permission_list_info);
            protoWriter.writeBytes(getMessageDocPermissionsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19267a newBuilder() {
        C19267a aVar = new C19267a();
        aVar.f47457a = Internal.copyOf("message_id2permission", this.message_id2permission);
        aVar.f47458b = Internal.copyOf("message_id2permission_info", this.message_id2permission_info);
        aVar.f47459c = Internal.copyOf("message_id2permission_list_info", this.message_id2permission_list_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetMessageDocPermissionsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_id2permission.isEmpty()) {
            sb.append(", message_id2permission=");
            sb.append(this.message_id2permission);
        }
        if (!this.message_id2permission_info.isEmpty()) {
            sb.append(", message_id2permission_info=");
            sb.append(this.message_id2permission_info);
        }
        if (!this.message_id2permission_list_info.isEmpty()) {
            sb.append(", message_id2permission_list_info=");
            sb.append(this.message_id2permission_list_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageDocPermissionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageDocPermissionsResponse(Map<String, DocPermission.Permission> map, Map<String, PermissionInfo> map2, Map<String, PermissionListInfo> map3) {
        this(map, map2, map3, ByteString.EMPTY);
    }

    public GetMessageDocPermissionsResponse(Map<String, DocPermission.Permission> map, Map<String, PermissionInfo> map2, Map<String, PermissionListInfo> map3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id2permission = Internal.immutableCopyOf("message_id2permission", map);
        this.message_id2permission_info = Internal.immutableCopyOf("message_id2permission_info", map2);
        this.message_id2permission_list_info = Internal.immutableCopyOf("message_id2permission_list_info", map3);
    }
}
