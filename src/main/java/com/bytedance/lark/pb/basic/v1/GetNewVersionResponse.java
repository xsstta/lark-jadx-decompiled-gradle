package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetNewVersionResponse extends Message<GetNewVersionResponse, C14979a> {
    public static final ProtoAdapter<GetNewVersionResponse> ADAPTER = new C14980b();
    public static final Boolean DEFAULT_HAS_NEW = false;
    private static final long serialVersionUID = 0;
    public final VersionData data;
    public final Boolean has_new;
    public final UpdatePlan plan;
    public final String reason;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetNewVersionResponse$b */
    private static final class C14980b extends ProtoAdapter<GetNewVersionResponse> {
        C14980b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNewVersionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNewVersionResponse getNewVersionResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getNewVersionResponse.has_new);
            int i3 = 0;
            if (getNewVersionResponse.data != null) {
                i = VersionData.ADAPTER.encodedSizeWithTag(2, getNewVersionResponse.data);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getNewVersionResponse.plan != null) {
                i2 = UpdatePlan.ADAPTER.encodedSizeWithTag(3, getNewVersionResponse.plan);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getNewVersionResponse.reason != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getNewVersionResponse.reason);
            }
            return i5 + i3 + getNewVersionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNewVersionResponse decode(ProtoReader protoReader) throws IOException {
            C14979a aVar = new C14979a();
            aVar.f39642a = false;
            aVar.f39645d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39642a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39643b = VersionData.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f39644c = UpdatePlan.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39645d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNewVersionResponse getNewVersionResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getNewVersionResponse.has_new);
            if (getNewVersionResponse.data != null) {
                VersionData.ADAPTER.encodeWithTag(protoWriter, 2, getNewVersionResponse.data);
            }
            if (getNewVersionResponse.plan != null) {
                UpdatePlan.ADAPTER.encodeWithTag(protoWriter, 3, getNewVersionResponse.plan);
            }
            if (getNewVersionResponse.reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getNewVersionResponse.reason);
            }
            protoWriter.writeBytes(getNewVersionResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14979a newBuilder() {
        C14979a aVar = new C14979a();
        aVar.f39642a = this.has_new;
        aVar.f39643b = this.data;
        aVar.f39644c = this.plan;
        aVar.f39645d = this.reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetNewVersionResponse$a */
    public static final class C14979a extends Message.Builder<GetNewVersionResponse, C14979a> {

        /* renamed from: a */
        public Boolean f39642a;

        /* renamed from: b */
        public VersionData f39643b;

        /* renamed from: c */
        public UpdatePlan f39644c;

        /* renamed from: d */
        public String f39645d;

        /* renamed from: a */
        public GetNewVersionResponse build() {
            Boolean bool = this.f39642a;
            if (bool != null) {
                return new GetNewVersionResponse(bool, this.f39643b, this.f39644c, this.f39645d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_new");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetNewVersionResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", has_new=");
        sb.append(this.has_new);
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        if (this.plan != null) {
            sb.append(", plan=");
            sb.append(this.plan);
        }
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNewVersionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNewVersionResponse(Boolean bool, VersionData versionData, UpdatePlan updatePlan, String str) {
        this(bool, versionData, updatePlan, str, ByteString.EMPTY);
    }

    public GetNewVersionResponse(Boolean bool, VersionData versionData, UpdatePlan updatePlan, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_new = bool;
        this.data = versionData;
        this.plan = updatePlan;
        this.reason = str;
    }
}
