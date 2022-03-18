package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class PlatformInfo extends Message<PlatformInfo, C15115a> {
    public static final ProtoAdapter<PlatformInfo> ADAPTER = new C15116b();
    private static final long serialVersionUID = 0;
    public final String minVersion;
    public final String type;

    /* renamed from: com.bytedance.lark.pb.basic.v1.PlatformInfo$b */
    private static final class C15116b extends ProtoAdapter<PlatformInfo> {
        C15116b() {
            super(FieldEncoding.LENGTH_DELIMITED, PlatformInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(PlatformInfo platformInfo) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, platformInfo.type);
            if (platformInfo.minVersion != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, platformInfo.minVersion);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + platformInfo.unknownFields().size();
        }

        /* renamed from: a */
        public PlatformInfo decode(ProtoReader protoReader) throws IOException {
            C15115a aVar = new C15115a();
            aVar.f40079a = "";
            aVar.f40080b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40079a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40080b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PlatformInfo platformInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, platformInfo.type);
            if (platformInfo.minVersion != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, platformInfo.minVersion);
            }
            protoWriter.writeBytes(platformInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PlatformInfo$a */
    public static final class C15115a extends Message.Builder<PlatformInfo, C15115a> {

        /* renamed from: a */
        public String f40079a;

        /* renamed from: b */
        public String f40080b;

        /* renamed from: a */
        public PlatformInfo build() {
            String str = this.f40079a;
            if (str != null) {
                return new PlatformInfo(str, this.f40080b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C15115a newBuilder() {
        C15115a aVar = new C15115a();
        aVar.f40079a = this.type;
        aVar.f40080b = this.minVersion;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PlatformInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (this.minVersion != null) {
            sb.append(", minVersion=");
            sb.append(this.minVersion);
        }
        StringBuilder replace = sb.replace(0, 2, "PlatformInfo{");
        replace.append('}');
        return replace.toString();
    }

    public PlatformInfo(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public PlatformInfo(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = str;
        this.minVersion = str2;
    }
}
