package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DepartmentMeta extends Message<DepartmentMeta, C50196a> {
    public static final ProtoAdapter<DepartmentMeta> ADAPTER = new C50197b();
    private static final long serialVersionUID = 0;
    public final String mid;

    /* renamed from: com.ss.android.lark.pb.usearch.DepartmentMeta$b */
    private static final class C50197b extends ProtoAdapter<DepartmentMeta> {
        C50197b() {
            super(FieldEncoding.LENGTH_DELIMITED, DepartmentMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(DepartmentMeta departmentMeta) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, departmentMeta.mid) + departmentMeta.unknownFields().size();
        }

        /* renamed from: a */
        public DepartmentMeta decode(ProtoReader protoReader) throws IOException {
            C50196a aVar = new C50196a();
            aVar.f125413a = "";
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
                    aVar.f125413a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DepartmentMeta departmentMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, departmentMeta.mid);
            protoWriter.writeBytes(departmentMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.DepartmentMeta$a */
    public static final class C50196a extends Message.Builder<DepartmentMeta, C50196a> {

        /* renamed from: a */
        public String f125413a;

        /* renamed from: a */
        public DepartmentMeta build() {
            String str = this.f125413a;
            if (str != null) {
                return new DepartmentMeta(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50196a newBuilder() {
        C50196a aVar = new C50196a();
        aVar.f125413a = this.mid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        StringBuilder replace = sb.replace(0, 2, "DepartmentMeta{");
        replace.append('}');
        return replace.toString();
    }

    public DepartmentMeta(String str) {
        this(str, ByteString.EMPTY);
    }

    public DepartmentMeta(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
    }
}
