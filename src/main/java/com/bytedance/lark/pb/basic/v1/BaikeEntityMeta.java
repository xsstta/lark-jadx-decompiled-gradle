package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class BaikeEntityMeta extends Message<BaikeEntityMeta, C14700a> {
    public static final ProtoAdapter<BaikeEntityMeta> ADAPTER = new C14701b();
    public static final Boolean DEFAULT_IS_ALLOW_ALL = false;
    private static final long serialVersionUID = 0;
    public final Map<String, TypedIDs> allowed_typed_ids;
    public final String id;
    public final Boolean is_allow_all;
    public final Map<String, String> platform_disable_option;

    public static final class TypedIDs extends Message<TypedIDs, C14698a> {
        public static final ProtoAdapter<TypedIDs> ADAPTER = new C14699b();
        private static final long serialVersionUID = 0;
        public final List<String> ids;

        /* renamed from: com.bytedance.lark.pb.basic.v1.BaikeEntityMeta$TypedIDs$b */
        private static final class C14699b extends ProtoAdapter<TypedIDs> {
            C14699b() {
                super(FieldEncoding.LENGTH_DELIMITED, TypedIDs.class);
            }

            /* renamed from: a */
            public int encodedSize(TypedIDs typedIDs) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, typedIDs.ids) + typedIDs.unknownFields().size();
            }

            /* renamed from: a */
            public TypedIDs decode(ProtoReader protoReader) throws IOException {
                C14698a aVar = new C14698a();
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
                        aVar.f38863a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TypedIDs typedIDs) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, typedIDs.ids);
                protoWriter.writeBytes(typedIDs.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.BaikeEntityMeta$TypedIDs$a */
        public static final class C14698a extends Message.Builder<TypedIDs, C14698a> {

            /* renamed from: a */
            public List<String> f38863a = Internal.newMutableList();

            /* renamed from: a */
            public TypedIDs build() {
                return new TypedIDs(this.f38863a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14698a newBuilder() {
            C14698a aVar = new C14698a();
            aVar.f38863a = Internal.copyOf("ids", this.ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "TypedIDs");
            StringBuilder sb = new StringBuilder();
            if (!this.ids.isEmpty()) {
                sb.append(", ids=");
                sb.append(this.ids);
            }
            StringBuilder replace = sb.replace(0, 2, "TypedIDs{");
            replace.append('}');
            return replace.toString();
        }

        public TypedIDs(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public TypedIDs(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.ids = Internal.immutableCopyOf("ids", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.BaikeEntityMeta$b */
    private static final class C14701b extends ProtoAdapter<BaikeEntityMeta> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, TypedIDs>> f38868a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, TypedIDs.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f38869b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C14701b() {
            super(FieldEncoding.LENGTH_DELIMITED, BaikeEntityMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(BaikeEntityMeta baikeEntityMeta) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, baikeEntityMeta.id);
            if (baikeEntityMeta.is_allow_all != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, baikeEntityMeta.is_allow_all);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f38868a.encodedSizeWithTag(3, baikeEntityMeta.allowed_typed_ids) + this.f38869b.encodedSizeWithTag(4, baikeEntityMeta.platform_disable_option) + baikeEntityMeta.unknownFields().size();
        }

        /* renamed from: a */
        public BaikeEntityMeta decode(ProtoReader protoReader) throws IOException {
            C14700a aVar = new C14700a();
            aVar.f38864a = "";
            aVar.f38865b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38864a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f38865b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f38866c.putAll(this.f38868a.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38867d.putAll(this.f38869b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BaikeEntityMeta baikeEntityMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, baikeEntityMeta.id);
            if (baikeEntityMeta.is_allow_all != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, baikeEntityMeta.is_allow_all);
            }
            this.f38868a.encodeWithTag(protoWriter, 3, baikeEntityMeta.allowed_typed_ids);
            this.f38869b.encodeWithTag(protoWriter, 4, baikeEntityMeta.platform_disable_option);
            protoWriter.writeBytes(baikeEntityMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.BaikeEntityMeta$a */
    public static final class C14700a extends Message.Builder<BaikeEntityMeta, C14700a> {

        /* renamed from: a */
        public String f38864a;

        /* renamed from: b */
        public Boolean f38865b;

        /* renamed from: c */
        public Map<String, TypedIDs> f38866c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, String> f38867d = Internal.newMutableMap();

        /* renamed from: a */
        public BaikeEntityMeta build() {
            String str = this.f38864a;
            if (str != null) {
                return new BaikeEntityMeta(str, this.f38865b, this.f38866c, this.f38867d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C14700a newBuilder() {
        C14700a aVar = new C14700a();
        aVar.f38864a = this.id;
        aVar.f38865b = this.is_allow_all;
        aVar.f38866c = Internal.copyOf("allowed_typed_ids", this.allowed_typed_ids);
        aVar.f38867d = Internal.copyOf("platform_disable_option", this.platform_disable_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "BaikeEntityMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.is_allow_all != null) {
            sb.append(", is_allow_all=");
            sb.append(this.is_allow_all);
        }
        if (!this.allowed_typed_ids.isEmpty()) {
            sb.append(", allowed_typed_ids=");
            sb.append(this.allowed_typed_ids);
        }
        if (!this.platform_disable_option.isEmpty()) {
            sb.append(", platform_disable_option=");
            sb.append(this.platform_disable_option);
        }
        StringBuilder replace = sb.replace(0, 2, "BaikeEntityMeta{");
        replace.append('}');
        return replace.toString();
    }

    public BaikeEntityMeta(String str, Boolean bool, Map<String, TypedIDs> map, Map<String, String> map2) {
        this(str, bool, map, map2, ByteString.EMPTY);
    }

    public BaikeEntityMeta(String str, Boolean bool, Map<String, TypedIDs> map, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.is_allow_all = bool;
        this.allowed_typed_ids = Internal.immutableCopyOf("allowed_typed_ids", map);
        this.platform_disable_option = Internal.immutableCopyOf("platform_disable_option", map2);
    }
}
