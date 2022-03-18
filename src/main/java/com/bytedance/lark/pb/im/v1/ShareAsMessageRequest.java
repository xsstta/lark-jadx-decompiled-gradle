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

public final class ShareAsMessageRequest extends Message<ShareAsMessageRequest, C18061a> {
    public static final ProtoAdapter<ShareAsMessageRequest> ADAPTER = new C18062b();
    private static final long serialVersionUID = 0;
    public final List<ShareObject> share_object;
    public final List<ShareTarget> targets;

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAsMessageRequest$b */
    private static final class C18062b extends ProtoAdapter<ShareAsMessageRequest> {
        C18062b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareAsMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareAsMessageRequest shareAsMessageRequest) {
            return ShareObject.ADAPTER.asRepeated().encodedSizeWithTag(1, shareAsMessageRequest.share_object) + ShareTarget.ADAPTER.asRepeated().encodedSizeWithTag(2, shareAsMessageRequest.targets) + shareAsMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareAsMessageRequest decode(ProtoReader protoReader) throws IOException {
            C18061a aVar = new C18061a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45186a.add(ShareObject.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45187b.add(ShareTarget.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareAsMessageRequest shareAsMessageRequest) throws IOException {
            ShareObject.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shareAsMessageRequest.share_object);
            ShareTarget.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, shareAsMessageRequest.targets);
            protoWriter.writeBytes(shareAsMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAsMessageRequest$a */
    public static final class C18061a extends Message.Builder<ShareAsMessageRequest, C18061a> {

        /* renamed from: a */
        public List<ShareObject> f45186a = Internal.newMutableList();

        /* renamed from: b */
        public List<ShareTarget> f45187b = Internal.newMutableList();

        /* renamed from: a */
        public ShareAsMessageRequest build() {
            return new ShareAsMessageRequest(this.f45186a, this.f45187b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18061a mo62704a(List<ShareObject> list) {
            Internal.checkElementsNotNull(list);
            this.f45186a = list;
            return this;
        }

        /* renamed from: b */
        public C18061a mo62706b(List<ShareTarget> list) {
            Internal.checkElementsNotNull(list);
            this.f45187b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18061a newBuilder() {
        C18061a aVar = new C18061a();
        aVar.f45186a = Internal.copyOf("share_object", this.share_object);
        aVar.f45187b = Internal.copyOf("targets", this.targets);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareAsMessageRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.share_object.isEmpty()) {
            sb.append(", share_object=");
            sb.append(this.share_object);
        }
        if (!this.targets.isEmpty()) {
            sb.append(", targets=");
            sb.append(this.targets);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareAsMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ShareAsMessageRequest(List<ShareObject> list, List<ShareTarget> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public ShareAsMessageRequest(List<ShareObject> list, List<ShareTarget> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_object = Internal.immutableCopyOf("share_object", list);
        this.targets = Internal.immutableCopyOf("targets", list2);
    }
}
