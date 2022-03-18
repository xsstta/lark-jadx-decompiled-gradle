package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushResourceResponse extends Message<PushResourceResponse, C18280a> {
    public static final ProtoAdapter<PushResourceResponse> ADAPTER = new C18281b();
    public static final Status DEFAULT_STATUS = Status.SUCCESS;
    private static final long serialVersionUID = 0;
    public final String key;
    public final Resource resource;
    public final Status status;

    public enum Status implements WireEnum {
        SUCCESS(1),
        FAIL(2);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return FAIL;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.PushResourceResponse$b */
    private static final class C18281b extends ProtoAdapter<PushResourceResponse> {
        C18281b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushResourceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushResourceResponse pushResourceResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushResourceResponse.key) + Status.ADAPTER.encodedSizeWithTag(2, pushResourceResponse.status);
            if (pushResourceResponse.resource != null) {
                i = Resource.ADAPTER.encodedSizeWithTag(3, pushResourceResponse.resource);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushResourceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushResourceResponse decode(ProtoReader protoReader) throws IOException {
            C18280a aVar = new C18280a();
            aVar.f45554a = "";
            aVar.f45555b = Status.SUCCESS;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45554a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f45555b = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45556c = Resource.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushResourceResponse pushResourceResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushResourceResponse.key);
            Status.ADAPTER.encodeWithTag(protoWriter, 2, pushResourceResponse.status);
            if (pushResourceResponse.resource != null) {
                Resource.ADAPTER.encodeWithTag(protoWriter, 3, pushResourceResponse.resource);
            }
            protoWriter.writeBytes(pushResourceResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18280a newBuilder() {
        C18280a aVar = new C18280a();
        aVar.f45554a = this.key;
        aVar.f45555b = this.status;
        aVar.f45556c = this.resource;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.PushResourceResponse$a */
    public static final class C18280a extends Message.Builder<PushResourceResponse, C18280a> {

        /* renamed from: a */
        public String f45554a;

        /* renamed from: b */
        public Status f45555b;

        /* renamed from: c */
        public Resource f45556c;

        /* renamed from: a */
        public PushResourceResponse build() {
            Status status;
            String str = this.f45554a;
            if (str != null && (status = this.f45555b) != null) {
                return new PushResourceResponse(str, status, this.f45556c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key", this.f45555b, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "PushResourceResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", status=");
        sb.append(this.status);
        if (this.resource != null) {
            sb.append(", resource=");
            sb.append(this.resource);
        }
        StringBuilder replace = sb.replace(0, 2, "PushResourceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushResourceResponse(String str, Status status2, Resource resource2) {
        this(str, status2, resource2, ByteString.EMPTY);
    }

    public PushResourceResponse(String str, Status status2, Resource resource2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.status = status2;
        this.resource = resource2;
    }
}
