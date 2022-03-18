package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class LiveSettingPrivilegeScope extends Message<LiveSettingPrivilegeScope, C50380a> {
    public static final ProtoAdapter<LiveSettingPrivilegeScope> ADAPTER = new C50381b();
    private static final long serialVersionUID = 0;
    public final LiveSettingElement mscope_public;
    public final LiveSettingElement mscope_tenant;

    /* renamed from: com.ss.android.lark.pb.videochat.LiveSettingPrivilegeScope$b */
    private static final class C50381b extends ProtoAdapter<LiveSettingPrivilegeScope> {
        C50381b() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveSettingPrivilegeScope.class);
        }

        /* renamed from: a */
        public int encodedSize(LiveSettingPrivilegeScope liveSettingPrivilegeScope) {
            int i;
            int i2 = 0;
            if (liveSettingPrivilegeScope.mscope_tenant != null) {
                i = LiveSettingElement.ADAPTER.encodedSizeWithTag(1, liveSettingPrivilegeScope.mscope_tenant);
            } else {
                i = 0;
            }
            if (liveSettingPrivilegeScope.mscope_public != null) {
                i2 = LiveSettingElement.ADAPTER.encodedSizeWithTag(2, liveSettingPrivilegeScope.mscope_public);
            }
            return i + i2 + liveSettingPrivilegeScope.unknownFields().size();
        }

        /* renamed from: a */
        public LiveSettingPrivilegeScope decode(ProtoReader protoReader) throws IOException {
            C50380a aVar = new C50380a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125787a = LiveSettingElement.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125788b = LiveSettingElement.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LiveSettingPrivilegeScope liveSettingPrivilegeScope) throws IOException {
            if (liveSettingPrivilegeScope.mscope_tenant != null) {
                LiveSettingElement.ADAPTER.encodeWithTag(protoWriter, 1, liveSettingPrivilegeScope.mscope_tenant);
            }
            if (liveSettingPrivilegeScope.mscope_public != null) {
                LiveSettingElement.ADAPTER.encodeWithTag(protoWriter, 2, liveSettingPrivilegeScope.mscope_public);
            }
            protoWriter.writeBytes(liveSettingPrivilegeScope.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.LiveSettingPrivilegeScope$a */
    public static final class C50380a extends Message.Builder<LiveSettingPrivilegeScope, C50380a> {

        /* renamed from: a */
        public LiveSettingElement f125787a;

        /* renamed from: b */
        public LiveSettingElement f125788b;

        /* renamed from: a */
        public LiveSettingPrivilegeScope build() {
            return new LiveSettingPrivilegeScope(this.f125787a, this.f125788b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50380a newBuilder() {
        C50380a aVar = new C50380a();
        aVar.f125787a = this.mscope_tenant;
        aVar.f125788b = this.mscope_public;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mscope_tenant != null) {
            sb.append(", scope_tenant=");
            sb.append(this.mscope_tenant);
        }
        if (this.mscope_public != null) {
            sb.append(", scope_public=");
            sb.append(this.mscope_public);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveSettingPrivilegeScope{");
        replace.append('}');
        return replace.toString();
    }

    public LiveSettingPrivilegeScope(LiveSettingElement liveSettingElement, LiveSettingElement liveSettingElement2) {
        this(liveSettingElement, liveSettingElement2, ByteString.EMPTY);
    }

    public LiveSettingPrivilegeScope(LiveSettingElement liveSettingElement, LiveSettingElement liveSettingElement2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mscope_tenant = liveSettingElement;
        this.mscope_public = liveSettingElement2;
    }
}
