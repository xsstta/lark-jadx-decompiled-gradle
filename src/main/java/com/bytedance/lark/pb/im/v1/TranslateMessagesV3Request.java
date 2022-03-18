package com.bytedance.lark.pb.im.v1;

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

public final class TranslateMessagesV3Request extends Message<TranslateMessagesV3Request, C18105a> {
    public static final ProtoAdapter<TranslateMessagesV3Request> ADAPTER = new C18106b();
    public static final Boolean DEFAULT_IS_TRANSLATE_BY_USER = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_translate_by_user;
    public final List<TranslateMessageContext> translate_contexts;

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateMessagesV3Request$b */
    private static final class C18106b extends ProtoAdapter<TranslateMessagesV3Request> {
        C18106b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateMessagesV3Request.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateMessagesV3Request translateMessagesV3Request) {
            return TranslateMessageContext.ADAPTER.asRepeated().encodedSizeWithTag(1, translateMessagesV3Request.translate_contexts) + ProtoAdapter.BOOL.encodedSizeWithTag(2, translateMessagesV3Request.is_translate_by_user) + translateMessagesV3Request.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateMessagesV3Request decode(ProtoReader protoReader) throws IOException {
            C18105a aVar = new C18105a();
            aVar.f45253b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45252a.add(TranslateMessageContext.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45253b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateMessagesV3Request translateMessagesV3Request) throws IOException {
            TranslateMessageContext.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, translateMessagesV3Request.translate_contexts);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, translateMessagesV3Request.is_translate_by_user);
            protoWriter.writeBytes(translateMessagesV3Request.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateMessagesV3Request$a */
    public static final class C18105a extends Message.Builder<TranslateMessagesV3Request, C18105a> {

        /* renamed from: a */
        public List<TranslateMessageContext> f45252a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f45253b;

        /* renamed from: a */
        public TranslateMessagesV3Request build() {
            Boolean bool = this.f45253b;
            if (bool != null) {
                return new TranslateMessagesV3Request(this.f45252a, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_translate_by_user");
        }

        /* renamed from: a */
        public C18105a mo62807a(Boolean bool) {
            this.f45253b = bool;
            return this;
        }

        /* renamed from: a */
        public C18105a mo62808a(List<TranslateMessageContext> list) {
            Internal.checkElementsNotNull(list);
            this.f45252a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18105a newBuilder() {
        C18105a aVar = new C18105a();
        aVar.f45252a = Internal.copyOf("translate_contexts", this.translate_contexts);
        aVar.f45253b = this.is_translate_by_user;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TranslateMessagesV3Request");
        StringBuilder sb = new StringBuilder();
        if (!this.translate_contexts.isEmpty()) {
            sb.append(", translate_contexts=");
            sb.append(this.translate_contexts);
        }
        sb.append(", is_translate_by_user=");
        sb.append(this.is_translate_by_user);
        StringBuilder replace = sb.replace(0, 2, "TranslateMessagesV3Request{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateMessagesV3Request(List<TranslateMessageContext> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public TranslateMessagesV3Request(List<TranslateMessageContext> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.translate_contexts = Internal.immutableCopyOf("translate_contexts", list);
        this.is_translate_by_user = bool;
    }
}
