package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DepartmentMeta extends Message<DepartmentMeta, C18979a> {
    public static final ProtoAdapter<DepartmentMeta> ADAPTER = new C18980b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.search.v2.DepartmentMeta$b */
    private static final class C18980b extends ProtoAdapter<DepartmentMeta> {
        C18980b() {
            super(FieldEncoding.LENGTH_DELIMITED, DepartmentMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(DepartmentMeta departmentMeta) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, departmentMeta.id) + departmentMeta.unknownFields().size();
        }

        /* renamed from: a */
        public DepartmentMeta decode(ProtoReader protoReader) throws IOException {
            C18979a aVar = new C18979a();
            aVar.f46936a = "";
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
                    aVar.f46936a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DepartmentMeta departmentMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, departmentMeta.id);
            protoWriter.writeBytes(departmentMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.DepartmentMeta$a */
    public static final class C18979a extends Message.Builder<DepartmentMeta, C18979a> {

        /* renamed from: a */
        public String f46936a;

        /* renamed from: a */
        public DepartmentMeta build() {
            String str = this.f46936a;
            if (str != null) {
                return new DepartmentMeta(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18979a newBuilder() {
        C18979a aVar = new C18979a();
        aVar.f46936a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "DepartmentMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        StringBuilder replace = sb.replace(0, 2, "DepartmentMeta{");
        replace.append('}');
        return replace.toString();
    }

    public DepartmentMeta(String str) {
        this(str, ByteString.EMPTY);
    }

    public DepartmentMeta(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
