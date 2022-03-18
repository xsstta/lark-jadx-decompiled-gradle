package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PutUrlPreviewActionRequest extends Message<PutUrlPreviewActionRequest, C17987a> {
    public static final ProtoAdapter<PutUrlPreviewActionRequest> ADAPTER = new C17988b();
    private static final long serialVersionUID = 0;
    public final String action_id;
    public final Map<String, String> parameters;
    public final String preview_id;
    public final String source_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutUrlPreviewActionRequest$b */
    private static final class C17988b extends ProtoAdapter<PutUrlPreviewActionRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45085a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C17988b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutUrlPreviewActionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutUrlPreviewActionRequest putUrlPreviewActionRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, putUrlPreviewActionRequest.source_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, putUrlPreviewActionRequest.preview_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, putUrlPreviewActionRequest.action_id) + this.f45085a.encodedSizeWithTag(4, putUrlPreviewActionRequest.parameters) + putUrlPreviewActionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutUrlPreviewActionRequest decode(ProtoReader protoReader) throws IOException {
            C17987a aVar = new C17987a();
            aVar.f45081a = "";
            aVar.f45082b = "";
            aVar.f45083c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45081a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45082b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45083c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45084d.putAll(this.f45085a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutUrlPreviewActionRequest putUrlPreviewActionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, putUrlPreviewActionRequest.source_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, putUrlPreviewActionRequest.preview_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, putUrlPreviewActionRequest.action_id);
            this.f45085a.encodeWithTag(protoWriter, 4, putUrlPreviewActionRequest.parameters);
            protoWriter.writeBytes(putUrlPreviewActionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutUrlPreviewActionRequest$a */
    public static final class C17987a extends Message.Builder<PutUrlPreviewActionRequest, C17987a> {

        /* renamed from: a */
        public String f45081a;

        /* renamed from: b */
        public String f45082b;

        /* renamed from: c */
        public String f45083c;

        /* renamed from: d */
        public Map<String, String> f45084d = Internal.newMutableMap();

        /* renamed from: a */
        public PutUrlPreviewActionRequest build() {
            String str;
            String str2;
            String str3 = this.f45081a;
            if (str3 != null && (str = this.f45082b) != null && (str2 = this.f45083c) != null) {
                return new PutUrlPreviewActionRequest(str3, str, str2, this.f45084d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "source_id", this.f45082b, "preview_id", this.f45083c, "action_id");
        }

        /* renamed from: a */
        public C17987a mo62501a(String str) {
            this.f45081a = str;
            return this;
        }

        /* renamed from: b */
        public C17987a mo62503b(String str) {
            this.f45082b = str;
            return this;
        }

        /* renamed from: c */
        public C17987a mo62504c(String str) {
            this.f45083c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17987a newBuilder() {
        C17987a aVar = new C17987a();
        aVar.f45081a = this.source_id;
        aVar.f45082b = this.preview_id;
        aVar.f45083c = this.action_id;
        aVar.f45084d = Internal.copyOf("parameters", this.parameters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutUrlPreviewActionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", source_id=");
        sb.append(this.source_id);
        sb.append(", preview_id=");
        sb.append(this.preview_id);
        sb.append(", action_id=");
        sb.append(this.action_id);
        if (!this.parameters.isEmpty()) {
            sb.append(", parameters=");
            sb.append(this.parameters);
        }
        StringBuilder replace = sb.replace(0, 2, "PutUrlPreviewActionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutUrlPreviewActionRequest(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, map, ByteString.EMPTY);
    }

    public PutUrlPreviewActionRequest(String str, String str2, String str3, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_id = str;
        this.preview_id = str2;
        this.action_id = str3;
        this.parameters = Internal.immutableCopyOf("parameters", map);
    }
}
