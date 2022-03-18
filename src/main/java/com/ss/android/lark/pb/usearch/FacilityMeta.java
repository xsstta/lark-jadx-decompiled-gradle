package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FacilityMeta extends Message<FacilityMeta, C50206a> {
    public static final ProtoAdapter<FacilityMeta> ADAPTER = new C50207b();
    private static final long serialVersionUID = 0;
    public final String mapp_link;
    public final String mid;
    public final String msource_key;

    /* renamed from: com.ss.android.lark.pb.usearch.FacilityMeta$b */
    private static final class C50207b extends ProtoAdapter<FacilityMeta> {
        C50207b() {
            super(FieldEncoding.LENGTH_DELIMITED, FacilityMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(FacilityMeta facilityMeta) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, facilityMeta.mid);
            int i2 = 0;
            if (facilityMeta.msource_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, facilityMeta.msource_key);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (facilityMeta.mapp_link != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, facilityMeta.mapp_link);
            }
            return i3 + i2 + facilityMeta.unknownFields().size();
        }

        /* renamed from: a */
        public FacilityMeta decode(ProtoReader protoReader) throws IOException {
            C50206a aVar = new C50206a();
            aVar.f125439a = "";
            aVar.f125440b = "";
            aVar.f125441c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125439a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125440b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125441c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FacilityMeta facilityMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, facilityMeta.mid);
            if (facilityMeta.msource_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, facilityMeta.msource_key);
            }
            if (facilityMeta.mapp_link != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, facilityMeta.mapp_link);
            }
            protoWriter.writeBytes(facilityMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50206a newBuilder() {
        C50206a aVar = new C50206a();
        aVar.f125439a = this.mid;
        aVar.f125440b = this.msource_key;
        aVar.f125441c = this.mapp_link;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.usearch.FacilityMeta$a */
    public static final class C50206a extends Message.Builder<FacilityMeta, C50206a> {

        /* renamed from: a */
        public String f125439a;

        /* renamed from: b */
        public String f125440b;

        /* renamed from: c */
        public String f125441c;

        /* renamed from: a */
        public FacilityMeta build() {
            String str = this.f125439a;
            if (str != null) {
                return new FacilityMeta(str, this.f125440b, this.f125441c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.msource_key != null) {
            sb.append(", source_key=");
            sb.append(this.msource_key);
        }
        if (this.mapp_link != null) {
            sb.append(", app_link=");
            sb.append(this.mapp_link);
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
        this.mid = str;
        this.msource_key = str2;
        this.mapp_link = str3;
    }
}
