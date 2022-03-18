package com.bytedance.lark.pb.sync.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SubOptions extends Message<SubOptions, C19429a> {
    public static final ProtoAdapter<SubOptions> ADAPTER = new C19430b();
    private static final long serialVersionUID = 0;
    public final SyncMsgResetConfig syncMsgResetConfig;

    /* renamed from: com.bytedance.lark.pb.sync.v1.SubOptions$b */
    private static final class C19430b extends ProtoAdapter<SubOptions> {
        C19430b() {
            super(FieldEncoding.LENGTH_DELIMITED, SubOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(SubOptions subOptions) {
            int i;
            if (subOptions.syncMsgResetConfig != null) {
                i = SyncMsgResetConfig.ADAPTER.encodedSizeWithTag(1, subOptions.syncMsgResetConfig);
            } else {
                i = 0;
            }
            return i + subOptions.unknownFields().size();
        }

        /* renamed from: a */
        public SubOptions decode(ProtoReader protoReader) throws IOException {
            C19429a aVar = new C19429a();
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
                    aVar.f47757a = SyncMsgResetConfig.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SubOptions subOptions) throws IOException {
            if (subOptions.syncMsgResetConfig != null) {
                SyncMsgResetConfig.ADAPTER.encodeWithTag(protoWriter, 1, subOptions.syncMsgResetConfig);
            }
            protoWriter.writeBytes(subOptions.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.sync.v1.SubOptions$a */
    public static final class C19429a extends Message.Builder<SubOptions, C19429a> {

        /* renamed from: a */
        public SyncMsgResetConfig f47757a;

        /* renamed from: a */
        public SubOptions build() {
            return new SubOptions(this.f47757a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19429a newBuilder() {
        C19429a aVar = new C19429a();
        aVar.f47757a = this.syncMsgResetConfig;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("sync", "SubOptions");
        StringBuilder sb = new StringBuilder();
        if (this.syncMsgResetConfig != null) {
            sb.append(", syncMsgResetConfig=");
            sb.append(this.syncMsgResetConfig);
        }
        StringBuilder replace = sb.replace(0, 2, "SubOptions{");
        replace.append('}');
        return replace.toString();
    }

    public SubOptions(SyncMsgResetConfig syncMsgResetConfig2) {
        this(syncMsgResetConfig2, ByteString.EMPTY);
    }

    public SubOptions(SyncMsgResetConfig syncMsgResetConfig2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.syncMsgResetConfig = syncMsgResetConfig2;
    }
}
