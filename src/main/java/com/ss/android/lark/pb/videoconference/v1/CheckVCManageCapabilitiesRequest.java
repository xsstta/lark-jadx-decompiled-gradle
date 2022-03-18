package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckVCManageCapabilitiesRequest extends Message<CheckVCManageCapabilitiesRequest, C50505a> {
    public static final ProtoAdapter<CheckVCManageCapabilitiesRequest> ADAPTER = new C50506b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final ByteviewUser target_user;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CheckVCManageCapabilitiesRequest$b */
    private static final class C50506b extends ProtoAdapter<CheckVCManageCapabilitiesRequest> {
        C50506b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckVCManageCapabilitiesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckVCManageCapabilitiesRequest checkVCManageCapabilitiesRequest) {
            int i;
            int i2 = 0;
            if (checkVCManageCapabilitiesRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, checkVCManageCapabilitiesRequest.meeting_id);
            } else {
                i = 0;
            }
            if (checkVCManageCapabilitiesRequest.target_user != null) {
                i2 = ByteviewUser.ADAPTER.encodedSizeWithTag(2, checkVCManageCapabilitiesRequest.target_user);
            }
            return i + i2 + checkVCManageCapabilitiesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckVCManageCapabilitiesRequest decode(ProtoReader protoReader) throws IOException {
            C50505a aVar = new C50505a();
            aVar.f126095a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126095a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126096b = ByteviewUser.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckVCManageCapabilitiesRequest checkVCManageCapabilitiesRequest) throws IOException {
            if (checkVCManageCapabilitiesRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkVCManageCapabilitiesRequest.meeting_id);
            }
            if (checkVCManageCapabilitiesRequest.target_user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 2, checkVCManageCapabilitiesRequest.target_user);
            }
            protoWriter.writeBytes(checkVCManageCapabilitiesRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CheckVCManageCapabilitiesRequest$a */
    public static final class C50505a extends Message.Builder<CheckVCManageCapabilitiesRequest, C50505a> {

        /* renamed from: a */
        public String f126095a;

        /* renamed from: b */
        public ByteviewUser f126096b;

        /* renamed from: a */
        public CheckVCManageCapabilitiesRequest build() {
            return new CheckVCManageCapabilitiesRequest(this.f126095a, this.f126096b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50505a mo174925a(ByteviewUser byteviewUser) {
            this.f126096b = byteviewUser;
            return this;
        }

        /* renamed from: a */
        public C50505a mo174926a(String str) {
            this.f126095a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50505a newBuilder() {
        C50505a aVar = new C50505a();
        aVar.f126095a = this.meeting_id;
        aVar.f126096b = this.target_user;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CheckVCManageCapabilitiesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.target_user != null) {
            sb.append(", target_user=");
            sb.append(this.target_user);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckVCManageCapabilitiesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckVCManageCapabilitiesRequest(String str, ByteviewUser byteviewUser) {
        this(str, byteviewUser, ByteString.EMPTY);
    }

    public CheckVCManageCapabilitiesRequest(String str, ByteviewUser byteviewUser, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.target_user = byteviewUser;
    }
}
