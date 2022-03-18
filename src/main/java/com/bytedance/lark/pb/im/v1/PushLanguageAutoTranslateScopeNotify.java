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

public final class PushLanguageAutoTranslateScopeNotify extends Message<PushLanguageAutoTranslateScopeNotify, C17901a> {
    public static final ProtoAdapter<PushLanguageAutoTranslateScopeNotify> ADAPTER = new C17902b();
    private static final long serialVersionUID = 0;
    public final Map<String, Integer> src_languages_scope;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLanguageAutoTranslateScopeNotify$a */
    public static final class C17901a extends Message.Builder<PushLanguageAutoTranslateScopeNotify, C17901a> {

        /* renamed from: a */
        public Map<String, Integer> f44981a = Internal.newMutableMap();

        /* renamed from: a */
        public PushLanguageAutoTranslateScopeNotify build() {
            return new PushLanguageAutoTranslateScopeNotify(this.f44981a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushLanguageAutoTranslateScopeNotify$b */
    private static final class C17902b extends ProtoAdapter<PushLanguageAutoTranslateScopeNotify> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Integer>> f44982a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        C17902b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushLanguageAutoTranslateScopeNotify.class);
        }

        /* renamed from: a */
        public int encodedSize(PushLanguageAutoTranslateScopeNotify pushLanguageAutoTranslateScopeNotify) {
            return this.f44982a.encodedSizeWithTag(1, pushLanguageAutoTranslateScopeNotify.src_languages_scope) + pushLanguageAutoTranslateScopeNotify.unknownFields().size();
        }

        /* renamed from: a */
        public PushLanguageAutoTranslateScopeNotify decode(ProtoReader protoReader) throws IOException {
            C17901a aVar = new C17901a();
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
                    aVar.f44981a.putAll(this.f44982a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushLanguageAutoTranslateScopeNotify pushLanguageAutoTranslateScopeNotify) throws IOException {
            this.f44982a.encodeWithTag(protoWriter, 1, pushLanguageAutoTranslateScopeNotify.src_languages_scope);
            protoWriter.writeBytes(pushLanguageAutoTranslateScopeNotify.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17901a newBuilder() {
        C17901a aVar = new C17901a();
        aVar.f44981a = Internal.copyOf("src_languages_scope", this.src_languages_scope);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushLanguageAutoTranslateScopeNotify");
        StringBuilder sb = new StringBuilder();
        if (!this.src_languages_scope.isEmpty()) {
            sb.append(", src_languages_scope=");
            sb.append(this.src_languages_scope);
        }
        StringBuilder replace = sb.replace(0, 2, "PushLanguageAutoTranslateScopeNotify{");
        replace.append('}');
        return replace.toString();
    }

    public PushLanguageAutoTranslateScopeNotify(Map<String, Integer> map) {
        this(map, ByteString.EMPTY);
    }

    public PushLanguageAutoTranslateScopeNotify(Map<String, Integer> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.src_languages_scope = Internal.immutableCopyOf("src_languages_scope", map);
    }
}
