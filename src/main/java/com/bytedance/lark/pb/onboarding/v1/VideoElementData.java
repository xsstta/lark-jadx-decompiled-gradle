package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VideoElementData extends Message<VideoElementData, C18630a> {
    public static final ProtoAdapter<VideoElementData> ADAPTER = new C18631b();
    public static final Boolean DEFAULT_IS_VERTICAL = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_vertical;
    public final String video_url;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.VideoElementData$b */
    private static final class C18631b extends ProtoAdapter<VideoElementData> {
        C18631b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoElementData.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoElementData videoElementData) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, videoElementData.video_url);
            if (videoElementData.is_vertical != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, videoElementData.is_vertical);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + videoElementData.unknownFields().size();
        }

        /* renamed from: a */
        public VideoElementData decode(ProtoReader protoReader) throws IOException {
            C18630a aVar = new C18630a();
            aVar.f46138a = "";
            aVar.f46139b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46138a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46139b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoElementData videoElementData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoElementData.video_url);
            if (videoElementData.is_vertical != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, videoElementData.is_vertical);
            }
            protoWriter.writeBytes(videoElementData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.VideoElementData$a */
    public static final class C18630a extends Message.Builder<VideoElementData, C18630a> {

        /* renamed from: a */
        public String f46138a;

        /* renamed from: b */
        public Boolean f46139b;

        /* renamed from: a */
        public VideoElementData build() {
            String str = this.f46138a;
            if (str != null) {
                return new VideoElementData(str, this.f46139b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "video_url");
        }

        /* renamed from: a */
        public C18630a mo64173a(String str) {
            this.f46138a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18630a newBuilder() {
        C18630a aVar = new C18630a();
        aVar.f46138a = this.video_url;
        aVar.f46139b = this.is_vertical;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "VideoElementData");
        StringBuilder sb = new StringBuilder();
        sb.append(", video_url=");
        sb.append(this.video_url);
        if (this.is_vertical != null) {
            sb.append(", is_vertical=");
            sb.append(this.is_vertical);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoElementData{");
        replace.append('}');
        return replace.toString();
    }

    public VideoElementData(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public VideoElementData(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_url = str;
        this.is_vertical = bool;
    }
}
