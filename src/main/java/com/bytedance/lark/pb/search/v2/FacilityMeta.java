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

public final class FacilityMeta extends Message<FacilityMeta, C18991a> {
    public static final ProtoAdapter<FacilityMeta> ADAPTER = new C18992b();
    private static final long serialVersionUID = 0;
    public final String app_link;
    public final String id;
    public final String source_key;

    /* renamed from: com.bytedance.lark.pb.search.v2.FacilityMeta$b */
    private static final class C18992b extends ProtoAdapter<FacilityMeta> {
        C18992b() {
            super(FieldEncoding.LENGTH_DELIMITED, FacilityMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(FacilityMeta facilityMeta) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, facilityMeta.id);
            int i2 = 0;
            if (facilityMeta.source_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, facilityMeta.source_key);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (facilityMeta.app_link != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, facilityMeta.app_link);
            }
            return i3 + i2 + facilityMeta.unknownFields().size();
        }

        /* renamed from: a */
        public FacilityMeta decode(ProtoReader protoReader) throws IOException {
            C18991a aVar = new C18991a();
            aVar.f46966a = "";
            aVar.f46967b = "";
            aVar.f46968c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46966a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46967b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46968c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FacilityMeta facilityMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, facilityMeta.id);
            if (facilityMeta.source_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, facilityMeta.source_key);
            }
            if (facilityMeta.app_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, facilityMeta.app_link);
            }
            protoWriter.writeBytes(facilityMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18991a newBuilder() {
        C18991a aVar = new C18991a();
        aVar.f46966a = this.id;
        aVar.f46967b = this.source_key;
        aVar.f46968c = this.app_link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.FacilityMeta$a */
    public static final class C18991a extends Message.Builder<FacilityMeta, C18991a> {

        /* renamed from: a */
        public String f46966a;

        /* renamed from: b */
        public String f46967b;

        /* renamed from: c */
        public String f46968c;

        /* renamed from: a */
        public FacilityMeta build() {
            String str = this.f46966a;
            if (str != null) {
                return new FacilityMeta(str, this.f46967b, this.f46968c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "FacilityMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.source_key != null) {
            sb.append(", source_key=");
            sb.append(this.source_key);
        }
        if (this.app_link != null) {
            sb.append(", app_link=");
            sb.append(this.app_link);
        }
        StringBuilder replace = sb.replace(0, 2, "FacilityMeta{");
        replace.append('}');
        return replace.toString();
    }

    public FacilityMeta(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public FacilityMeta(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.source_key = str2;
        this.app_link = str3;
    }
}
