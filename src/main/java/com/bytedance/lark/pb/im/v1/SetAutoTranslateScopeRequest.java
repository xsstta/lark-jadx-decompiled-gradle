package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetAutoTranslateScopeRequest extends Message<SetAutoTranslateScopeRequest, C18039a> {
    public static final ProtoAdapter<SetAutoTranslateScopeRequest> ADAPTER = new C18040b();
    public static final Integer DEFAULT_MODIFYSCOPES = 0;
    private static final long serialVersionUID = 0;
    public final Integer modifyScopes;

    /* renamed from: com.bytedance.lark.pb.im.v1.SetAutoTranslateScopeRequest$b */
    private static final class C18040b extends ProtoAdapter<SetAutoTranslateScopeRequest> {
        C18040b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetAutoTranslateScopeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetAutoTranslateScopeRequest setAutoTranslateScopeRequest) {
            int i;
            if (setAutoTranslateScopeRequest.modifyScopes != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, setAutoTranslateScopeRequest.modifyScopes);
            } else {
                i = 0;
            }
            return i + setAutoTranslateScopeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetAutoTranslateScopeRequest decode(ProtoReader protoReader) throws IOException {
            C18039a aVar = new C18039a();
            aVar.f45162a = 0;
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
                    aVar.f45162a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetAutoTranslateScopeRequest setAutoTranslateScopeRequest) throws IOException {
            if (setAutoTranslateScopeRequest.modifyScopes != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, setAutoTranslateScopeRequest.modifyScopes);
            }
            protoWriter.writeBytes(setAutoTranslateScopeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SetAutoTranslateScopeRequest$a */
    public static final class C18039a extends Message.Builder<SetAutoTranslateScopeRequest, C18039a> {

        /* renamed from: a */
        public Integer f45162a;

        /* renamed from: a */
        public SetAutoTranslateScopeRequest build() {
            return new SetAutoTranslateScopeRequest(this.f45162a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18039a mo62649a(Integer num) {
            this.f45162a = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18039a newBuilder() {
        C18039a aVar = new C18039a();
        aVar.f45162a = this.modifyScopes;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SetAutoTranslateScopeRequest");
        StringBuilder sb = new StringBuilder();
        if (this.modifyScopes != null) {
            sb.append(", modifyScopes=");
            sb.append(this.modifyScopes);
        }
        StringBuilder replace = sb.replace(0, 2, "SetAutoTranslateScopeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetAutoTranslateScopeRequest(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public SetAutoTranslateScopeRequest(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.modifyScopes = num;
    }
}
