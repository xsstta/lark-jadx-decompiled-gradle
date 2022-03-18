package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullProductGuideRequest extends Message<PullProductGuideRequest, C49790a> {
    public static final ProtoAdapter<PullProductGuideRequest> ADAPTER = new C49791b();
    private static final long serialVersionUID = 0;
    public final GuideScene mscene;

    /* renamed from: com.ss.android.lark.pb.guide.PullProductGuideRequest$b */
    private static final class C49791b extends ProtoAdapter<PullProductGuideRequest> {
        C49791b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullProductGuideRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullProductGuideRequest pullProductGuideRequest) {
            int i;
            if (pullProductGuideRequest.mscene != null) {
                i = GuideScene.ADAPTER.encodedSizeWithTag(1, pullProductGuideRequest.mscene);
            } else {
                i = 0;
            }
            return i + pullProductGuideRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullProductGuideRequest decode(ProtoReader protoReader) throws IOException {
            C49790a aVar = new C49790a();
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
                    try {
                        aVar.f124724a = GuideScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullProductGuideRequest pullProductGuideRequest) throws IOException {
            if (pullProductGuideRequest.mscene != null) {
                GuideScene.ADAPTER.encodeWithTag(protoWriter, 1, pullProductGuideRequest.mscene);
            }
            protoWriter.writeBytes(pullProductGuideRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.PullProductGuideRequest$a */
    public static final class C49790a extends Message.Builder<PullProductGuideRequest, C49790a> {

        /* renamed from: a */
        public GuideScene f124724a;

        /* renamed from: a */
        public PullProductGuideRequest build() {
            return new PullProductGuideRequest(this.f124724a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49790a mo173324a(GuideScene guideScene) {
            this.f124724a = guideScene;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49790a newBuilder() {
        C49790a aVar = new C49790a();
        aVar.f124724a = this.mscene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mscene != null) {
            sb.append(", scene=");
            sb.append(this.mscene);
        }
        StringBuilder replace = sb.replace(0, 2, "PullProductGuideRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullProductGuideRequest(GuideScene guideScene) {
        this(guideScene, ByteString.EMPTY);
    }

    public PullProductGuideRequest(GuideScene guideScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mscene = guideScene;
    }
}
