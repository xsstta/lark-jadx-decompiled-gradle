package com.ss.android.lark.pb.flow;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetNewUserCreateTeamStrongGuideContextResponse extends Message<GetNewUserCreateTeamStrongGuideContextResponse, C49762a> {
    public static final ProtoAdapter<GetNewUserCreateTeamStrongGuideContextResponse> ADAPTER = new C49763b();
    public static final Integer DEFAULT_INVITATION_METHOD = 0;
    public static final Boolean DEFAULT_IS_ACCESS_EXPERIMENT = false;
    public static final Boolean DEFAULT_IS_SIMPLE_USER = false;
    public static final Boolean DEFAULT_SHOULD_SHOW_STRONG_GUIDE = false;
    public static final Integer DEFAULT_VERSION_ID = 0;
    private static final long serialVersionUID = 0;
    public final Integer minvitation_method;
    public final Boolean mis_access_experiment;
    public final Boolean mis_simple_user;
    public final Boolean mshould_show_strong_guide;
    public final Integer mversion_id;

    /* renamed from: com.ss.android.lark.pb.flow.GetNewUserCreateTeamStrongGuideContextResponse$b */
    private static final class C49763b extends ProtoAdapter<GetNewUserCreateTeamStrongGuideContextResponse> {
        C49763b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNewUserCreateTeamStrongGuideContextResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNewUserCreateTeamStrongGuideContextResponse getNewUserCreateTeamStrongGuideContextResponse) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getNewUserCreateTeamStrongGuideContextResponse.mshould_show_strong_guide);
            int i4 = 0;
            if (getNewUserCreateTeamStrongGuideContextResponse.mis_simple_user != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getNewUserCreateTeamStrongGuideContextResponse.mis_simple_user);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (getNewUserCreateTeamStrongGuideContextResponse.mis_access_experiment != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getNewUserCreateTeamStrongGuideContextResponse.mis_access_experiment);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (getNewUserCreateTeamStrongGuideContextResponse.minvitation_method != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, getNewUserCreateTeamStrongGuideContextResponse.minvitation_method);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getNewUserCreateTeamStrongGuideContextResponse.mversion_id != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, getNewUserCreateTeamStrongGuideContextResponse.mversion_id);
            }
            return i7 + i4 + getNewUserCreateTeamStrongGuideContextResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNewUserCreateTeamStrongGuideContextResponse decode(ProtoReader protoReader) throws IOException {
            C49762a aVar = new C49762a();
            aVar.f124639a = false;
            aVar.f124640b = false;
            aVar.f124641c = false;
            aVar.f124642d = 0;
            aVar.f124643e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124639a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124640b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124641c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124642d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124643e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNewUserCreateTeamStrongGuideContextResponse getNewUserCreateTeamStrongGuideContextResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getNewUserCreateTeamStrongGuideContextResponse.mshould_show_strong_guide);
            if (getNewUserCreateTeamStrongGuideContextResponse.mis_simple_user != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getNewUserCreateTeamStrongGuideContextResponse.mis_simple_user);
            }
            if (getNewUserCreateTeamStrongGuideContextResponse.mis_access_experiment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getNewUserCreateTeamStrongGuideContextResponse.mis_access_experiment);
            }
            if (getNewUserCreateTeamStrongGuideContextResponse.minvitation_method != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getNewUserCreateTeamStrongGuideContextResponse.minvitation_method);
            }
            if (getNewUserCreateTeamStrongGuideContextResponse.mversion_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getNewUserCreateTeamStrongGuideContextResponse.mversion_id);
            }
            protoWriter.writeBytes(getNewUserCreateTeamStrongGuideContextResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.flow.GetNewUserCreateTeamStrongGuideContextResponse$a */
    public static final class C49762a extends Message.Builder<GetNewUserCreateTeamStrongGuideContextResponse, C49762a> {

        /* renamed from: a */
        public Boolean f124639a;

        /* renamed from: b */
        public Boolean f124640b;

        /* renamed from: c */
        public Boolean f124641c;

        /* renamed from: d */
        public Integer f124642d;

        /* renamed from: e */
        public Integer f124643e;

        /* renamed from: a */
        public GetNewUserCreateTeamStrongGuideContextResponse build() {
            Boolean bool = this.f124639a;
            if (bool != null) {
                return new GetNewUserCreateTeamStrongGuideContextResponse(bool, this.f124640b, this.f124641c, this.f124642d, this.f124643e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mshould_show_strong_guide");
        }
    }

    @Override // com.squareup.wire.Message
    public C49762a newBuilder() {
        C49762a aVar = new C49762a();
        aVar.f124639a = this.mshould_show_strong_guide;
        aVar.f124640b = this.mis_simple_user;
        aVar.f124641c = this.mis_access_experiment;
        aVar.f124642d = this.minvitation_method;
        aVar.f124643e = this.mversion_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", should_show_strong_guide=");
        sb.append(this.mshould_show_strong_guide);
        if (this.mis_simple_user != null) {
            sb.append(", is_simple_user=");
            sb.append(this.mis_simple_user);
        }
        if (this.mis_access_experiment != null) {
            sb.append(", is_access_experiment=");
            sb.append(this.mis_access_experiment);
        }
        if (this.minvitation_method != null) {
            sb.append(", invitation_method=");
            sb.append(this.minvitation_method);
        }
        if (this.mversion_id != null) {
            sb.append(", version_id=");
            sb.append(this.mversion_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNewUserCreateTeamStrongGuideContextResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNewUserCreateTeamStrongGuideContextResponse(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2) {
        this(bool, bool2, bool3, num, num2, ByteString.EMPTY);
    }

    public GetNewUserCreateTeamStrongGuideContextResponse(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mshould_show_strong_guide = bool;
        this.mis_simple_user = bool2;
        this.mis_access_experiment = bool3;
        this.minvitation_method = num;
        this.mversion_id = num2;
    }
}
