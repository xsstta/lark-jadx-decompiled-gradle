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

public final class PatchLanguagesAutoTranslationScopeRequest extends Message<PatchLanguagesAutoTranslationScopeRequest, C17829a> {
    public static final ProtoAdapter<PatchLanguagesAutoTranslationScopeRequest> ADAPTER = new C17830b();
    private static final long serialVersionUID = 0;
    public final Map<String, Integer> src_languages_scope;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchLanguagesAutoTranslationScopeRequest$a */
    public static final class C17829a extends Message.Builder<PatchLanguagesAutoTranslationScopeRequest, C17829a> {

        /* renamed from: a */
        public Map<String, Integer> f44888a = Internal.newMutableMap();

        /* renamed from: a */
        public PatchLanguagesAutoTranslationScopeRequest build() {
            return new PatchLanguagesAutoTranslationScopeRequest(this.f44888a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17829a mo62147a(Map<String, Integer> map) {
            Internal.checkElementsNotNull(map);
            this.f44888a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchLanguagesAutoTranslationScopeRequest$b */
    private static final class C17830b extends ProtoAdapter<PatchLanguagesAutoTranslationScopeRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Integer>> f44889a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        C17830b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchLanguagesAutoTranslationScopeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchLanguagesAutoTranslationScopeRequest patchLanguagesAutoTranslationScopeRequest) {
            return this.f44889a.encodedSizeWithTag(1, patchLanguagesAutoTranslationScopeRequest.src_languages_scope) + patchLanguagesAutoTranslationScopeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchLanguagesAutoTranslationScopeRequest decode(ProtoReader protoReader) throws IOException {
            C17829a aVar = new C17829a();
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
                    aVar.f44888a.putAll(this.f44889a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchLanguagesAutoTranslationScopeRequest patchLanguagesAutoTranslationScopeRequest) throws IOException {
            this.f44889a.encodeWithTag(protoWriter, 1, patchLanguagesAutoTranslationScopeRequest.src_languages_scope);
            protoWriter.writeBytes(patchLanguagesAutoTranslationScopeRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17829a newBuilder() {
        C17829a aVar = new C17829a();
        aVar.f44888a = Internal.copyOf("src_languages_scope", this.src_languages_scope);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchLanguagesAutoTranslationScopeRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.src_languages_scope.isEmpty()) {
            sb.append(", src_languages_scope=");
            sb.append(this.src_languages_scope);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchLanguagesAutoTranslationScopeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchLanguagesAutoTranslationScopeRequest(Map<String, Integer> map) {
        this(map, ByteString.EMPTY);
    }

    public PatchLanguagesAutoTranslationScopeRequest(Map<String, Integer> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.src_languages_scope = Internal.immutableCopyOf("src_languages_scope", map);
    }
}
