package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.FollowInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShareFollowRequest extends Message<ShareFollowRequest, C51038a> {
    public static final ProtoAdapter<ShareFollowRequest> ADAPTER = new C51039b();
    public static final Action DEFAULT_ACTION = Action.UNKNOWN;
    public static final FollowAssociateType DEFAULT_ASSOCIATE_TYPE = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
    public static final Integer DEFAULT_AUTHORITY_MASK = 0;
    public static final FollowInfo.InitSource DEFAULT_INIT_SOURCE = FollowInfo.InitSource.UNKNOWN_INIT_SOURCE;
    public static final FollowInfo.LifeTime DEFAULT_LIFE_TIME = FollowInfo.LifeTime.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final FollowAssociateType associate_type;
    public final Integer authority_mask;
    public final String breakout_meeting_id;
    public final FollowInfo.InitSource init_source;
    public final List<FollowAction> initial_actions;
    public final FollowInfo.LifeTime life_time;
    public final String login_token;
    public final String meeting_id;
    public final FollowInfo.Options options;
    public final ReactivateData reactivate_data;
    public final TakeOverData take_over;
    public final TransPresenterData trans_presenter_data;
    public final String url;

    public enum Action implements WireEnum {
        UNKNOWN(0),
        START(1),
        STOP(2),
        UPDATE_OPTIONS(3),
        TRANS_PRESENTER(4),
        TAKE_OVER(5),
        REACTIVATE(6);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return START;
                case 2:
                    return STOP;
                case 3:
                    return UPDATE_OPTIONS;
                case 4:
                    return TRANS_PRESENTER;
                case 5:
                    return TAKE_OVER;
                case 6:
                    return REACTIVATE;
                default:
                    return null;
            }
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum AuthorityMask implements WireEnum {
        GRANT_INTERNAL_READ(1),
        GRANT_INTERNAL_EDIT(2),
        GRANT_EXTERNAL_READ(16),
        GRANT_EXTERNAL_EDIT(32),
        GRANT_EXTERNAL_COMMENT(64);
        
        public static final ProtoAdapter<AuthorityMask> ADAPTER = ProtoAdapter.newEnumAdapter(AuthorityMask.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AuthorityMask fromValue(int i) {
            if (i == 1) {
                return GRANT_INTERNAL_READ;
            }
            if (i == 2) {
                return GRANT_INTERNAL_EDIT;
            }
            if (i == 16) {
                return GRANT_EXTERNAL_READ;
            }
            if (i == 32) {
                return GRANT_EXTERNAL_EDIT;
            }
            if (i != 64) {
                return null;
            }
            return GRANT_EXTERNAL_COMMENT;
        }

        private AuthorityMask(int i) {
            this.value = i;
        }
    }

    public static final class ReactivateData extends Message<ReactivateData, C51032a> {
        public static final ProtoAdapter<ReactivateData> ADAPTER = new C51033b();
        private static final long serialVersionUID = 0;
        public final String share_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest$ReactivateData$b */
        private static final class C51033b extends ProtoAdapter<ReactivateData> {
            C51033b() {
                super(FieldEncoding.LENGTH_DELIMITED, ReactivateData.class);
            }

            /* renamed from: a */
            public int encodedSize(ReactivateData reactivateData) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, reactivateData.share_id) + reactivateData.unknownFields().size();
            }

            /* renamed from: a */
            public ReactivateData decode(ProtoReader protoReader) throws IOException {
                C51032a aVar = new C51032a();
                aVar.f127089a = "";
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
                        aVar.f127089a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ReactivateData reactivateData) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reactivateData.share_id);
                protoWriter.writeBytes(reactivateData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest$ReactivateData$a */
        public static final class C51032a extends Message.Builder<ReactivateData, C51032a> {

            /* renamed from: a */
            public String f127089a;

            /* renamed from: a */
            public ReactivateData build() {
                String str = this.f127089a;
                if (str != null) {
                    return new ReactivateData(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "share_id");
            }

            /* renamed from: a */
            public C51032a mo176178a(String str) {
                this.f127089a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C51032a newBuilder() {
            C51032a aVar = new C51032a();
            aVar.f127089a = this.share_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ReactivateData");
            StringBuilder sb = new StringBuilder();
            sb.append(", share_id=");
            sb.append(this.share_id);
            StringBuilder replace = sb.replace(0, 2, "ReactivateData{");
            replace.append('}');
            return replace.toString();
        }

        public ReactivateData(String str) {
            this(str, ByteString.EMPTY);
        }

        public ReactivateData(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.share_id = str;
        }
    }

    public static final class TakeOverData extends Message<TakeOverData, C51034a> {
        public static final ProtoAdapter<TakeOverData> ADAPTER = new C51035b();
        private static final long serialVersionUID = 0;
        public final String share_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest$TakeOverData$b */
        private static final class C51035b extends ProtoAdapter<TakeOverData> {
            C51035b() {
                super(FieldEncoding.LENGTH_DELIMITED, TakeOverData.class);
            }

            /* renamed from: a */
            public int encodedSize(TakeOverData takeOverData) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, takeOverData.share_id) + takeOverData.unknownFields().size();
            }

            /* renamed from: a */
            public TakeOverData decode(ProtoReader protoReader) throws IOException {
                C51034a aVar = new C51034a();
                aVar.f127090a = "";
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
                        aVar.f127090a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TakeOverData takeOverData) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, takeOverData.share_id);
                protoWriter.writeBytes(takeOverData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest$TakeOverData$a */
        public static final class C51034a extends Message.Builder<TakeOverData, C51034a> {

            /* renamed from: a */
            public String f127090a;

            /* renamed from: a */
            public TakeOverData build() {
                String str = this.f127090a;
                if (str != null) {
                    return new TakeOverData(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "share_id");
            }

            /* renamed from: a */
            public C51034a mo176183a(String str) {
                this.f127090a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C51034a newBuilder() {
            C51034a aVar = new C51034a();
            aVar.f127090a = this.share_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "TakeOverData");
            StringBuilder sb = new StringBuilder();
            sb.append(", share_id=");
            sb.append(this.share_id);
            StringBuilder replace = sb.replace(0, 2, "TakeOverData{");
            replace.append('}');
            return replace.toString();
        }

        public TakeOverData(String str) {
            this(str, ByteString.EMPTY);
        }

        public TakeOverData(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.share_id = str;
        }
    }

    public static final class TransPresenterData extends Message<TransPresenterData, C51036a> {
        public static final ProtoAdapter<TransPresenterData> ADAPTER = new C51037b();
        private static final long serialVersionUID = 0;
        public final ByteviewUser new_presenter;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest$TransPresenterData$b */
        private static final class C51037b extends ProtoAdapter<TransPresenterData> {
            C51037b() {
                super(FieldEncoding.LENGTH_DELIMITED, TransPresenterData.class);
            }

            /* renamed from: a */
            public int encodedSize(TransPresenterData transPresenterData) {
                return ByteviewUser.ADAPTER.encodedSizeWithTag(1, transPresenterData.new_presenter) + transPresenterData.unknownFields().size();
            }

            /* renamed from: a */
            public TransPresenterData decode(ProtoReader protoReader) throws IOException {
                C51036a aVar = new C51036a();
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
                        aVar.f127091a = ByteviewUser.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TransPresenterData transPresenterData) throws IOException {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, transPresenterData.new_presenter);
                protoWriter.writeBytes(transPresenterData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest$TransPresenterData$a */
        public static final class C51036a extends Message.Builder<TransPresenterData, C51036a> {

            /* renamed from: a */
            public ByteviewUser f127091a;

            /* renamed from: a */
            public TransPresenterData build() {
                ByteviewUser byteviewUser = this.f127091a;
                if (byteviewUser != null) {
                    return new TransPresenterData(byteviewUser, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(byteviewUser, "new_presenter");
            }
        }

        @Override // com.squareup.wire.Message
        public C51036a newBuilder() {
            C51036a aVar = new C51036a();
            aVar.f127091a = this.new_presenter;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "TransPresenterData");
            StringBuilder sb = new StringBuilder();
            sb.append(", new_presenter=");
            sb.append(this.new_presenter);
            StringBuilder replace = sb.replace(0, 2, "TransPresenterData{");
            replace.append('}');
            return replace.toString();
        }

        public TransPresenterData(ByteviewUser byteviewUser) {
            this(byteviewUser, ByteString.EMPTY);
        }

        public TransPresenterData(ByteviewUser byteviewUser, ByteString byteString) {
            super(ADAPTER, byteString);
            this.new_presenter = byteviewUser;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest$b */
    private static final class C51039b extends ProtoAdapter<ShareFollowRequest> {
        C51039b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareFollowRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareFollowRequest shareFollowRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, shareFollowRequest.meeting_id) + Action.ADAPTER.encodedSizeWithTag(2, shareFollowRequest.action) + ProtoAdapter.STRING.encodedSizeWithTag(3, shareFollowRequest.url);
            int i10 = 0;
            if (shareFollowRequest.options != null) {
                i = FollowInfo.Options.ADAPTER.encodedSizeWithTag(4, shareFollowRequest.options);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + FollowAction.ADAPTER.asRepeated().encodedSizeWithTag(5, shareFollowRequest.initial_actions);
            if (shareFollowRequest.life_time != null) {
                i2 = FollowInfo.LifeTime.ADAPTER.encodedSizeWithTag(6, shareFollowRequest.life_time);
            } else {
                i2 = 0;
            }
            int i11 = encodedSizeWithTag2 + i2;
            if (shareFollowRequest.login_token != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, shareFollowRequest.login_token);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (shareFollowRequest.trans_presenter_data != null) {
                i4 = TransPresenterData.ADAPTER.encodedSizeWithTag(8, shareFollowRequest.trans_presenter_data);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (shareFollowRequest.authority_mask != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(9, shareFollowRequest.authority_mask);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (shareFollowRequest.init_source != null) {
                i6 = FollowInfo.InitSource.ADAPTER.encodedSizeWithTag(10, shareFollowRequest.init_source);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (shareFollowRequest.take_over != null) {
                i7 = TakeOverData.ADAPTER.encodedSizeWithTag(11, shareFollowRequest.take_over);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (shareFollowRequest.reactivate_data != null) {
                i8 = ReactivateData.ADAPTER.encodedSizeWithTag(12, shareFollowRequest.reactivate_data);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (shareFollowRequest.breakout_meeting_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(21, shareFollowRequest.breakout_meeting_id);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (shareFollowRequest.associate_type != null) {
                i10 = FollowAssociateType.ADAPTER.encodedSizeWithTag(22, shareFollowRequest.associate_type);
            }
            return i18 + i10 + shareFollowRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareFollowRequest decode(ProtoReader protoReader) throws IOException {
            C51038a aVar = new C51038a();
            aVar.f127092a = "";
            aVar.f127093b = Action.UNKNOWN;
            aVar.f127094c = "";
            aVar.f127097f = FollowInfo.LifeTime.UNKNOWN;
            aVar.f127098g = "";
            aVar.f127100i = 0;
            aVar.f127101j = FollowInfo.InitSource.UNKNOWN_INIT_SOURCE;
            aVar.f127104m = "";
            aVar.f127105n = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 21) {
                    aVar.f127104m = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 22) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127092a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            try {
                                aVar.f127093b = Action.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f127094c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f127095d = FollowInfo.Options.ADAPTER.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f127096e.add(FollowAction.ADAPTER.decode(protoReader));
                            continue;
                        case 6:
                            try {
                                aVar.f127097f = FollowInfo.LifeTime.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f127098g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f127099h = TransPresenterData.ADAPTER.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f127100i = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 10:
                            try {
                                aVar.f127101j = FollowInfo.InitSource.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 11:
                            aVar.f127102k = TakeOverData.ADAPTER.decode(protoReader);
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127103l = ReactivateData.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    try {
                        aVar.f127105n = FollowAssociateType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareFollowRequest shareFollowRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareFollowRequest.meeting_id);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, shareFollowRequest.action);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareFollowRequest.url);
            if (shareFollowRequest.options != null) {
                FollowInfo.Options.ADAPTER.encodeWithTag(protoWriter, 4, shareFollowRequest.options);
            }
            FollowAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, shareFollowRequest.initial_actions);
            if (shareFollowRequest.life_time != null) {
                FollowInfo.LifeTime.ADAPTER.encodeWithTag(protoWriter, 6, shareFollowRequest.life_time);
            }
            if (shareFollowRequest.login_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, shareFollowRequest.login_token);
            }
            if (shareFollowRequest.trans_presenter_data != null) {
                TransPresenterData.ADAPTER.encodeWithTag(protoWriter, 8, shareFollowRequest.trans_presenter_data);
            }
            if (shareFollowRequest.authority_mask != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, shareFollowRequest.authority_mask);
            }
            if (shareFollowRequest.init_source != null) {
                FollowInfo.InitSource.ADAPTER.encodeWithTag(protoWriter, 10, shareFollowRequest.init_source);
            }
            if (shareFollowRequest.take_over != null) {
                TakeOverData.ADAPTER.encodeWithTag(protoWriter, 11, shareFollowRequest.take_over);
            }
            if (shareFollowRequest.reactivate_data != null) {
                ReactivateData.ADAPTER.encodeWithTag(protoWriter, 12, shareFollowRequest.reactivate_data);
            }
            if (shareFollowRequest.breakout_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, shareFollowRequest.breakout_meeting_id);
            }
            if (shareFollowRequest.associate_type != null) {
                FollowAssociateType.ADAPTER.encodeWithTag(protoWriter, 22, shareFollowRequest.associate_type);
            }
            protoWriter.writeBytes(shareFollowRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51038a newBuilder() {
        C51038a aVar = new C51038a();
        aVar.f127092a = this.meeting_id;
        aVar.f127093b = this.action;
        aVar.f127094c = this.url;
        aVar.f127095d = this.options;
        aVar.f127096e = Internal.copyOf("initial_actions", this.initial_actions);
        aVar.f127097f = this.life_time;
        aVar.f127098g = this.login_token;
        aVar.f127099h = this.trans_presenter_data;
        aVar.f127100i = this.authority_mask;
        aVar.f127101j = this.init_source;
        aVar.f127102k = this.take_over;
        aVar.f127103l = this.reactivate_data;
        aVar.f127104m = this.breakout_meeting_id;
        aVar.f127105n = this.associate_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShareFollowRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", url=");
        sb.append(this.url);
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        if (!this.initial_actions.isEmpty()) {
            sb.append(", initial_actions=");
            sb.append(this.initial_actions);
        }
        if (this.life_time != null) {
            sb.append(", life_time=");
            sb.append(this.life_time);
        }
        if (this.login_token != null) {
            sb.append(", login_token=");
            sb.append(this.login_token);
        }
        if (this.trans_presenter_data != null) {
            sb.append(", trans_presenter_data=");
            sb.append(this.trans_presenter_data);
        }
        if (this.authority_mask != null) {
            sb.append(", authority_mask=");
            sb.append(this.authority_mask);
        }
        if (this.init_source != null) {
            sb.append(", init_source=");
            sb.append(this.init_source);
        }
        if (this.take_over != null) {
            sb.append(", take_over=");
            sb.append(this.take_over);
        }
        if (this.reactivate_data != null) {
            sb.append(", reactivate_data=");
            sb.append(this.reactivate_data);
        }
        if (this.breakout_meeting_id != null) {
            sb.append(", breakout_meeting_id=");
            sb.append(this.breakout_meeting_id);
        }
        if (this.associate_type != null) {
            sb.append(", associate_type=");
            sb.append(this.associate_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareFollowRequest{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowRequest$a */
    public static final class C51038a extends Message.Builder<ShareFollowRequest, C51038a> {

        /* renamed from: a */
        public String f127092a;

        /* renamed from: b */
        public Action f127093b;

        /* renamed from: c */
        public String f127094c;

        /* renamed from: d */
        public FollowInfo.Options f127095d;

        /* renamed from: e */
        public List<FollowAction> f127096e = Internal.newMutableList();

        /* renamed from: f */
        public FollowInfo.LifeTime f127097f;

        /* renamed from: g */
        public String f127098g;

        /* renamed from: h */
        public TransPresenterData f127099h;

        /* renamed from: i */
        public Integer f127100i;

        /* renamed from: j */
        public FollowInfo.InitSource f127101j;

        /* renamed from: k */
        public TakeOverData f127102k;

        /* renamed from: l */
        public ReactivateData f127103l;

        /* renamed from: m */
        public String f127104m;

        /* renamed from: n */
        public FollowAssociateType f127105n;

        /* renamed from: a */
        public ShareFollowRequest build() {
            Action action;
            String str;
            String str2 = this.f127092a;
            if (str2 != null && (action = this.f127093b) != null && (str = this.f127094c) != null) {
                return new ShareFollowRequest(str2, action, str, this.f127095d, this.f127096e, this.f127097f, this.f127098g, this.f127099h, this.f127100i, this.f127101j, this.f127102k, this.f127103l, this.f127104m, this.f127105n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "meeting_id", this.f127093b, "action", this.f127094c, "url");
        }

        /* renamed from: a */
        public C51038a mo176192a(FollowInfo.InitSource initSource) {
            this.f127101j = initSource;
            return this;
        }

        /* renamed from: b */
        public C51038a mo176202b(String str) {
            this.f127094c = str;
            return this;
        }

        /* renamed from: c */
        public C51038a mo176203c(String str) {
            this.f127104m = str;
            return this;
        }

        /* renamed from: a */
        public C51038a mo176193a(FollowInfo.LifeTime lifeTime) {
            this.f127097f = lifeTime;
            return this;
        }

        /* renamed from: a */
        public C51038a mo176194a(FollowInfo.Options options) {
            this.f127095d = options;
            return this;
        }

        /* renamed from: a */
        public C51038a mo176195a(Action action) {
            this.f127093b = action;
            return this;
        }

        /* renamed from: a */
        public C51038a mo176196a(ReactivateData reactivateData) {
            this.f127103l = reactivateData;
            return this;
        }

        /* renamed from: a */
        public C51038a mo176197a(TakeOverData takeOverData) {
            this.f127102k = takeOverData;
            return this;
        }

        /* renamed from: a */
        public C51038a mo176198a(TransPresenterData transPresenterData) {
            this.f127099h = transPresenterData;
            return this;
        }

        /* renamed from: a */
        public C51038a mo176199a(Integer num) {
            this.f127100i = num;
            return this;
        }

        /* renamed from: a */
        public C51038a mo176200a(String str) {
            this.f127092a = str;
            return this;
        }
    }

    public ShareFollowRequest(String str, Action action2, String str2, FollowInfo.Options options2, List<FollowAction> list, FollowInfo.LifeTime lifeTime, String str3, TransPresenterData transPresenterData, Integer num, FollowInfo.InitSource initSource, TakeOverData takeOverData, ReactivateData reactivateData, String str4, FollowAssociateType followAssociateType) {
        this(str, action2, str2, options2, list, lifeTime, str3, transPresenterData, num, initSource, takeOverData, reactivateData, str4, followAssociateType, ByteString.EMPTY);
    }

    public ShareFollowRequest(String str, Action action2, String str2, FollowInfo.Options options2, List<FollowAction> list, FollowInfo.LifeTime lifeTime, String str3, TransPresenterData transPresenterData, Integer num, FollowInfo.InitSource initSource, TakeOverData takeOverData, ReactivateData reactivateData, String str4, FollowAssociateType followAssociateType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.action = action2;
        this.url = str2;
        this.options = options2;
        this.initial_actions = Internal.immutableCopyOf("initial_actions", list);
        this.life_time = lifeTime;
        this.login_token = str3;
        this.trans_presenter_data = transPresenterData;
        this.authority_mask = num;
        this.init_source = initSource;
        this.take_over = takeOverData;
        this.reactivate_data = reactivateData;
        this.breakout_meeting_id = str4;
        this.associate_type = followAssociateType;
    }
}
