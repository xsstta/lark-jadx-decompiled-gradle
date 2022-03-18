package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ChatterTagInfo extends Message<ChatterTagInfo, C16138a> {
    public static final ProtoAdapter<ChatterTagInfo> ADAPTER = new C16139b();
    private static final long serialVersionUID = 0;
    public final List<EduRoleType> role_types;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ChatterTagInfo$b */
    private static final class C16139b extends ProtoAdapter<ChatterTagInfo> {
        C16139b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatterTagInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatterTagInfo chatterTagInfo) {
            return EduRoleType.ADAPTER.asRepeated().encodedSizeWithTag(1, chatterTagInfo.role_types) + chatterTagInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ChatterTagInfo decode(ProtoReader protoReader) throws IOException {
            C16138a aVar = new C16138a();
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
                    try {
                        aVar.f42251a.add(EduRoleType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatterTagInfo chatterTagInfo) throws IOException {
            EduRoleType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, chatterTagInfo.role_types);
            protoWriter.writeBytes(chatterTagInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ChatterTagInfo$a */
    public static final class C16138a extends Message.Builder<ChatterTagInfo, C16138a> {

        /* renamed from: a */
        public List<EduRoleType> f42251a = Internal.newMutableList();

        /* renamed from: a */
        public ChatterTagInfo build() {
            return new ChatterTagInfo(this.f42251a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16138a newBuilder() {
        C16138a aVar = new C16138a();
        aVar.f42251a = Internal.copyOf("role_types", this.role_types);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ChatterTagInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.role_types.isEmpty()) {
            sb.append(", role_types=");
            sb.append(this.role_types);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatterTagInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ChatterTagInfo(List<EduRoleType> list) {
        this(list, ByteString.EMPTY);
    }

    public ChatterTagInfo(List<EduRoleType> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.role_types = Internal.immutableCopyOf("role_types", list);
    }
}
