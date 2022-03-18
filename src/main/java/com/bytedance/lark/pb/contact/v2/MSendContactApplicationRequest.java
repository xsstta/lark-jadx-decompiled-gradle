package com.bytedance.lark.pb.contact.v2;

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

public final class MSendContactApplicationRequest extends Message<MSendContactApplicationRequest, C16544a> {
    public static final ProtoAdapter<MSendContactApplicationRequest> ADAPTER = new C16545b();
    private static final long serialVersionUID = 0;
    public final String extra_message;
    public final Map<String, SourceInfo> source_infos;
    public final List<String> user_ids;

    /* renamed from: com.bytedance.lark.pb.contact.v2.MSendContactApplicationRequest$a */
    public static final class C16544a extends Message.Builder<MSendContactApplicationRequest, C16544a> {

        /* renamed from: a */
        public List<String> f42903a = Internal.newMutableList();

        /* renamed from: b */
        public String f42904b;

        /* renamed from: c */
        public Map<String, SourceInfo> f42905c = Internal.newMutableMap();

        /* renamed from: a */
        public MSendContactApplicationRequest build() {
            return new MSendContactApplicationRequest(this.f42903a, this.f42904b, this.f42905c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16544a mo58892a(String str) {
            this.f42904b = str;
            return this;
        }

        /* renamed from: a */
        public C16544a mo58893a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42903a = list;
            return this;
        }

        /* renamed from: a */
        public C16544a mo58894a(Map<String, SourceInfo> map) {
            Internal.checkElementsNotNull(map);
            this.f42905c = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.MSendContactApplicationRequest$b */
    private static final class C16545b extends ProtoAdapter<MSendContactApplicationRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SourceInfo>> f42906a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SourceInfo.ADAPTER);

        C16545b() {
            super(FieldEncoding.LENGTH_DELIMITED, MSendContactApplicationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MSendContactApplicationRequest mSendContactApplicationRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mSendContactApplicationRequest.user_ids);
            if (mSendContactApplicationRequest.extra_message != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mSendContactApplicationRequest.extra_message);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f42906a.encodedSizeWithTag(9, mSendContactApplicationRequest.source_infos) + mSendContactApplicationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MSendContactApplicationRequest decode(ProtoReader protoReader) throws IOException {
            C16544a aVar = new C16544a();
            aVar.f42904b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42903a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42904b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 9) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42905c.putAll(this.f42906a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MSendContactApplicationRequest mSendContactApplicationRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mSendContactApplicationRequest.user_ids);
            if (mSendContactApplicationRequest.extra_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mSendContactApplicationRequest.extra_message);
            }
            this.f42906a.encodeWithTag(protoWriter, 9, mSendContactApplicationRequest.source_infos);
            protoWriter.writeBytes(mSendContactApplicationRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16544a newBuilder() {
        C16544a aVar = new C16544a();
        aVar.f42903a = Internal.copyOf("user_ids", this.user_ids);
        aVar.f42904b = this.extra_message;
        aVar.f42905c = Internal.copyOf("source_infos", this.source_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "MSendContactApplicationRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.user_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.user_ids);
        }
        if (this.extra_message != null) {
            sb.append(", extra_message=");
            sb.append(this.extra_message);
        }
        if (!this.source_infos.isEmpty()) {
            sb.append(", source_infos=");
            sb.append(this.source_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "MSendContactApplicationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MSendContactApplicationRequest(List<String> list, String str, Map<String, SourceInfo> map) {
        this(list, str, map, ByteString.EMPTY);
    }

    public MSendContactApplicationRequest(List<String> list, String str, Map<String, SourceInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_ids = Internal.immutableCopyOf("user_ids", list);
        this.extra_message = str;
        this.source_infos = Internal.immutableCopyOf("source_infos", map);
    }
}
