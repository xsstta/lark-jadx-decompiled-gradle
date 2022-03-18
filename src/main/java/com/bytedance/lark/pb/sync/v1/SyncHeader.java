package com.bytedance.lark.pb.sync.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SyncHeader extends Message<SyncHeader, C19437a> {
    public static final ProtoAdapter<SyncHeader> ADAPTER = new C19438b();
    private static final long serialVersionUID = 0;
    public final String app_name;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncHeader$b */
    private static final class C19438b extends ProtoAdapter<SyncHeader> {
        C19438b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncHeader.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncHeader syncHeader) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, syncHeader.app_name);
            if (syncHeader.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, syncHeader.token);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + syncHeader.unknownFields().size();
        }

        /* renamed from: a */
        public SyncHeader decode(ProtoReader protoReader) throws IOException {
            C19437a aVar = new C19437a();
            aVar.f47765a = "";
            aVar.f47766b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47765a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47766b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncHeader syncHeader) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncHeader.app_name);
            if (syncHeader.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, syncHeader.token);
            }
            protoWriter.writeBytes(syncHeader.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SyncHeader$a */
    public static final class C19437a extends Message.Builder<SyncHeader, C19437a> {

        /* renamed from: a */
        public String f47765a;

        /* renamed from: b */
        public String f47766b;

        /* renamed from: a */
        public SyncHeader build() {
            String str = this.f47765a;
            if (str != null) {
                return new SyncHeader(str, this.f47766b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "app_name");
        }
    }

    @Override // com.squareup.wire.Message
    public C19437a newBuilder() {
        C19437a aVar = new C19437a();
        aVar.f47765a = this.app_name;
        aVar.f47766b = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SyncHeader");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_name=");
        sb.append(this.app_name);
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncHeader{");
        replace.append('}');
        return replace.toString();
    }

    public SyncHeader(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SyncHeader(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_name = str;
        this.token = str2;
    }
}
