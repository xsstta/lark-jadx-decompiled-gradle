package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatPullLiveSettingResponse extends Message<VideoChatPullLiveSettingResponse, C50431a> {
    public static final ProtoAdapter<VideoChatPullLiveSettingResponse> ADAPTER = new C50432b();
    private static final long serialVersionUID = 0;
    public final LiveBindingData mbinding_info;
    public final LiveSettingElement menable_interaction_setting;
    public final LiveSettingLayoutType mlayout_type_setting;
    public final String mlive_url;
    public final LiveSettingPrivilegeScope mprivilege_scope_setting;

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatPullLiveSettingResponse$b */
    private static final class C50432b extends ProtoAdapter<VideoChatPullLiveSettingResponse> {
        C50432b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatPullLiveSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatPullLiveSettingResponse videoChatPullLiveSettingResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (videoChatPullLiveSettingResponse.mprivilege_scope_setting != null) {
                i = LiveSettingPrivilegeScope.ADAPTER.encodedSizeWithTag(1, videoChatPullLiveSettingResponse.mprivilege_scope_setting);
            } else {
                i = 0;
            }
            if (videoChatPullLiveSettingResponse.mlayout_type_setting != null) {
                i2 = LiveSettingLayoutType.ADAPTER.encodedSizeWithTag(2, videoChatPullLiveSettingResponse.mlayout_type_setting);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (videoChatPullLiveSettingResponse.mlive_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, videoChatPullLiveSettingResponse.mlive_url);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (videoChatPullLiveSettingResponse.menable_interaction_setting != null) {
                i4 = LiveSettingElement.ADAPTER.encodedSizeWithTag(4, videoChatPullLiveSettingResponse.menable_interaction_setting);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (videoChatPullLiveSettingResponse.mbinding_info != null) {
                i5 = LiveBindingData.ADAPTER.encodedSizeWithTag(5, videoChatPullLiveSettingResponse.mbinding_info);
            }
            return i8 + i5 + videoChatPullLiveSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatPullLiveSettingResponse decode(ProtoReader protoReader) throws IOException {
            C50431a aVar = new C50431a();
            aVar.f125940c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125938a = LiveSettingPrivilegeScope.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125939b = LiveSettingLayoutType.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125940c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125941d = LiveSettingElement.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125942e = LiveBindingData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatPullLiveSettingResponse videoChatPullLiveSettingResponse) throws IOException {
            if (videoChatPullLiveSettingResponse.mprivilege_scope_setting != null) {
                LiveSettingPrivilegeScope.ADAPTER.encodeWithTag(protoWriter, 1, videoChatPullLiveSettingResponse.mprivilege_scope_setting);
            }
            if (videoChatPullLiveSettingResponse.mlayout_type_setting != null) {
                LiveSettingLayoutType.ADAPTER.encodeWithTag(protoWriter, 2, videoChatPullLiveSettingResponse.mlayout_type_setting);
            }
            if (videoChatPullLiveSettingResponse.mlive_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoChatPullLiveSettingResponse.mlive_url);
            }
            if (videoChatPullLiveSettingResponse.menable_interaction_setting != null) {
                LiveSettingElement.ADAPTER.encodeWithTag(protoWriter, 4, videoChatPullLiveSettingResponse.menable_interaction_setting);
            }
            if (videoChatPullLiveSettingResponse.mbinding_info != null) {
                LiveBindingData.ADAPTER.encodeWithTag(protoWriter, 5, videoChatPullLiveSettingResponse.mbinding_info);
            }
            protoWriter.writeBytes(videoChatPullLiveSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatPullLiveSettingResponse$a */
    public static final class C50431a extends Message.Builder<VideoChatPullLiveSettingResponse, C50431a> {

        /* renamed from: a */
        public LiveSettingPrivilegeScope f125938a;

        /* renamed from: b */
        public LiveSettingLayoutType f125939b;

        /* renamed from: c */
        public String f125940c;

        /* renamed from: d */
        public LiveSettingElement f125941d;

        /* renamed from: e */
        public LiveBindingData f125942e;

        /* renamed from: a */
        public VideoChatPullLiveSettingResponse build() {
            return new VideoChatPullLiveSettingResponse(this.f125938a, this.f125939b, this.f125940c, this.f125941d, this.f125942e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50431a newBuilder() {
        C50431a aVar = new C50431a();
        aVar.f125938a = this.mprivilege_scope_setting;
        aVar.f125939b = this.mlayout_type_setting;
        aVar.f125940c = this.mlive_url;
        aVar.f125941d = this.menable_interaction_setting;
        aVar.f125942e = this.mbinding_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mprivilege_scope_setting != null) {
            sb.append(", privilege_scope_setting=");
            sb.append(this.mprivilege_scope_setting);
        }
        if (this.mlayout_type_setting != null) {
            sb.append(", layout_type_setting=");
            sb.append(this.mlayout_type_setting);
        }
        if (this.mlive_url != null) {
            sb.append(", live_url=");
            sb.append(this.mlive_url);
        }
        if (this.menable_interaction_setting != null) {
            sb.append(", enable_interaction_setting=");
            sb.append(this.menable_interaction_setting);
        }
        if (this.mbinding_info != null) {
            sb.append(", binding_info=");
            sb.append(this.mbinding_info);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatPullLiveSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatPullLiveSettingResponse(LiveSettingPrivilegeScope liveSettingPrivilegeScope, LiveSettingLayoutType liveSettingLayoutType, String str, LiveSettingElement liveSettingElement, LiveBindingData liveBindingData) {
        this(liveSettingPrivilegeScope, liveSettingLayoutType, str, liveSettingElement, liveBindingData, ByteString.EMPTY);
    }

    public VideoChatPullLiveSettingResponse(LiveSettingPrivilegeScope liveSettingPrivilegeScope, LiveSettingLayoutType liveSettingLayoutType, String str, LiveSettingElement liveSettingElement, LiveBindingData liveBindingData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mprivilege_scope_setting = liveSettingPrivilegeScope;
        this.mlayout_type_setting = liveSettingLayoutType;
        this.mlive_url = str;
        this.menable_interaction_setting = liveSettingElement;
        this.mbinding_info = liveBindingData;
    }
}
