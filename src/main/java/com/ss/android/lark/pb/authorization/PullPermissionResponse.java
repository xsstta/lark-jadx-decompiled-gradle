package com.ss.android.lark.pb.authorization;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullPermissionResponse extends Message<PullPermissionResponse, C49560a> {
    public static final ProtoAdapter<PullPermissionResponse> ADAPTER = new C49561b();
    public static final Boolean DEFAULT_CLEAR_OLD = false;
    private static final long serialVersionUID = 0;
    public final Boolean mclear_old;
    public final String mperm_version;
    public final AllPermissionData mpermission_data;

    /* renamed from: com.ss.android.lark.pb.authorization.PullPermissionResponse$b */
    private static final class C49561b extends ProtoAdapter<PullPermissionResponse> {
        C49561b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullPermissionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullPermissionResponse pullPermissionResponse) {
            return AllPermissionData.ADAPTER.encodedSizeWithTag(1, pullPermissionResponse.mpermission_data) + ProtoAdapter.BOOL.encodedSizeWithTag(2, pullPermissionResponse.mclear_old) + ProtoAdapter.STRING.encodedSizeWithTag(3, pullPermissionResponse.mperm_version) + pullPermissionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullPermissionResponse decode(ProtoReader protoReader) throws IOException {
            C49560a aVar = new C49560a();
            aVar.f124175b = false;
            aVar.f124176c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124174a = AllPermissionData.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124175b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124176c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullPermissionResponse pullPermissionResponse) throws IOException {
            AllPermissionData.ADAPTER.encodeWithTag(protoWriter, 1, pullPermissionResponse.mpermission_data);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullPermissionResponse.mclear_old);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullPermissionResponse.mperm_version);
            protoWriter.writeBytes(pullPermissionResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49560a newBuilder() {
        C49560a aVar = new C49560a();
        aVar.f124174a = this.mpermission_data;
        aVar.f124175b = this.mclear_old;
        aVar.f124176c = this.mperm_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.authorization.PullPermissionResponse$a */
    public static final class C49560a extends Message.Builder<PullPermissionResponse, C49560a> {

        /* renamed from: a */
        public AllPermissionData f124174a;

        /* renamed from: b */
        public Boolean f124175b;

        /* renamed from: c */
        public String f124176c;

        /* renamed from: a */
        public PullPermissionResponse build() {
            Boolean bool;
            String str;
            AllPermissionData allPermissionData = this.f124174a;
            if (allPermissionData != null && (bool = this.f124175b) != null && (str = this.f124176c) != null) {
                return new PullPermissionResponse(allPermissionData, bool, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(allPermissionData, "mpermission_data", this.f124175b, "mclear_old", this.f124176c, "mperm_version");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", permission_data=");
        sb.append(this.mpermission_data);
        sb.append(", clear_old=");
        sb.append(this.mclear_old);
        sb.append(", perm_version=");
        sb.append(this.mperm_version);
        StringBuilder replace = sb.replace(0, 2, "PullPermissionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullPermissionResponse(AllPermissionData allPermissionData, Boolean bool, String str) {
        this(allPermissionData, bool, str, ByteString.EMPTY);
    }

    public PullPermissionResponse(AllPermissionData allPermissionData, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpermission_data = allPermissionData;
        this.mclear_old = bool;
        this.mperm_version = str;
    }
}
