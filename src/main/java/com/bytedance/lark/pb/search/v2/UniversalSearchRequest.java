package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UniversalSearchRequest extends Message<UniversalSearchRequest, C19089a> {
    public static final ProtoAdapter<UniversalSearchRequest> ADAPTER = new C19090b();
    public static final InvokeMode DEFAULT_INVOKE_MODE = InvokeMode.CALLBACK;
    private static final long serialVersionUID = 0;
    public final SearchCommonRequestHeader header;
    public final InvokeMode invoke_mode;

    public enum InvokeMode implements WireEnum {
        CALLBACK(0),
        PUSH_FLOW(1);
        
        public static final ProtoAdapter<InvokeMode> ADAPTER = ProtoAdapter.newEnumAdapter(InvokeMode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static InvokeMode fromValue(int i) {
            if (i == 0) {
                return CALLBACK;
            }
            if (i != 1) {
                return null;
            }
            return PUSH_FLOW;
        }

        private InvokeMode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSearchRequest$b */
    private static final class C19090b extends ProtoAdapter<UniversalSearchRequest> {
        C19090b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalSearchRequest universalSearchRequest) {
            int i;
            int encodedSizeWithTag = SearchCommonRequestHeader.ADAPTER.encodedSizeWithTag(1, universalSearchRequest.header);
            if (universalSearchRequest.invoke_mode != null) {
                i = InvokeMode.ADAPTER.encodedSizeWithTag(2, universalSearchRequest.invoke_mode);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + universalSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalSearchRequest decode(ProtoReader protoReader) throws IOException {
            C19089a aVar = new C19089a();
            aVar.f47202b = InvokeMode.CALLBACK;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47201a = SearchCommonRequestHeader.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47202b = InvokeMode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UniversalSearchRequest universalSearchRequest) throws IOException {
            SearchCommonRequestHeader.ADAPTER.encodeWithTag(protoWriter, 1, universalSearchRequest.header);
            if (universalSearchRequest.invoke_mode != null) {
                InvokeMode.ADAPTER.encodeWithTag(protoWriter, 2, universalSearchRequest.invoke_mode);
            }
            protoWriter.writeBytes(universalSearchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSearchRequest$a */
    public static final class C19089a extends Message.Builder<UniversalSearchRequest, C19089a> {

        /* renamed from: a */
        public SearchCommonRequestHeader f47201a;

        /* renamed from: b */
        public InvokeMode f47202b;

        /* renamed from: a */
        public UniversalSearchRequest build() {
            SearchCommonRequestHeader searchCommonRequestHeader = this.f47201a;
            if (searchCommonRequestHeader != null) {
                return new UniversalSearchRequest(searchCommonRequestHeader, this.f47202b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(searchCommonRequestHeader, "header");
        }

        /* renamed from: a */
        public C19089a mo65311a(SearchCommonRequestHeader searchCommonRequestHeader) {
            this.f47201a = searchCommonRequestHeader;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19089a newBuilder() {
        C19089a aVar = new C19089a();
        aVar.f47201a = this.header;
        aVar.f47202b = this.invoke_mode;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "UniversalSearchRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", header=");
        sb.append(this.header);
        if (this.invoke_mode != null) {
            sb.append(", invoke_mode=");
            sb.append(this.invoke_mode);
        }
        StringBuilder replace = sb.replace(0, 2, "UniversalSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalSearchRequest(SearchCommonRequestHeader searchCommonRequestHeader, InvokeMode invokeMode) {
        this(searchCommonRequestHeader, invokeMode, ByteString.EMPTY);
    }

    public UniversalSearchRequest(SearchCommonRequestHeader searchCommonRequestHeader, InvokeMode invokeMode, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = searchCommonRequestHeader;
        this.invoke_mode = invokeMode;
    }
}
