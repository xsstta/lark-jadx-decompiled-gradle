package com.ss.android.lark.audit.security_event;

import com.google.protobuf.AbstractC23103a;
import com.google.protobuf.AbstractC23127n;
import com.google.protobuf.AbstractC23129p;
import com.google.protobuf.C23108e;
import com.google.protobuf.C23111g;
import com.google.protobuf.C23115i;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.Objects;

public final class SecurityEvent {

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$b */
    public interface AbstractC29353b extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$d */
    public interface AbstractC29356d extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$f */
    public interface AbstractC29359f extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$h */
    public interface AbstractC29362h extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$j */
    public interface AbstractC29365j extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$l */
    public interface AbstractC29368l extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$n */
    public interface AbstractC29371n extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$p */
    public interface AbstractC29374p extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$r */
    public interface AbstractC29377r extends AbstractC23127n {
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$t */
    public interface AbstractC29380t extends AbstractC23127n {
    }

    public enum AppDetail implements C23115i.AbstractC23116a {
        AppDetailUnknown(0),
        WeChat(1),
        WeChatMoments(2),
        QQ(3),
        Weibo(4),
        Others(5);
        
        private static final C23115i.AbstractC23117b<AppDetail> internalValueMap = new C23115i.AbstractC23117b<AppDetail>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.AppDetail.C293411 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<AppDetail> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static AppDetail valueOf(int i) {
            return forNumber(i);
        }

        public static AppDetail forNumber(int i) {
            if (i == 0) {
                return AppDetailUnknown;
            }
            if (i == 1) {
                return WeChat;
            }
            if (i == 2) {
                return WeChatMoments;
            }
            if (i == 3) {
                return QQ;
            }
            if (i == 4) {
                return Weibo;
            }
            if (i != 5) {
                return null;
            }
            return Others;
        }

        private AppDetail(int i) {
            this.value = i;
        }
    }

    public enum ClientType implements C23115i.AbstractC23116a {
        ClientUnknown(0),
        ClientLarkPC(1),
        ClientAndroid(2),
        ClientIOS(3),
        ClientWeb(4);
        
        private static final C23115i.AbstractC23117b<ClientType> internalValueMap = new C23115i.AbstractC23117b<ClientType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.ClientType.C293421 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<ClientType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static ClientType valueOf(int i) {
            return forNumber(i);
        }

        public static ClientType forNumber(int i) {
            if (i == 0) {
                return ClientUnknown;
            }
            if (i == 1) {
                return ClientLarkPC;
            }
            if (i == 2) {
                return ClientAndroid;
            }
            if (i == 3) {
                return ClientIOS;
            }
            if (i != 4) {
                return null;
            }
            return ClientWeb;
        }

        private ClientType(int i) {
            this.value = i;
        }
    }

    public enum CommentType implements C23115i.AbstractC23116a {
        CommentTypeUnknown(0),
        AddComment(1),
        AddReply(2),
        EditReply(3),
        DeleteReply(4),
        UpdateComment(5);
        
        private static final C23115i.AbstractC23117b<CommentType> internalValueMap = new C23115i.AbstractC23117b<CommentType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.CommentType.C293431 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<CommentType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static CommentType valueOf(int i) {
            return forNumber(i);
        }

        public static CommentType forNumber(int i) {
            if (i == 0) {
                return CommentTypeUnknown;
            }
            if (i == 1) {
                return AddComment;
            }
            if (i == 2) {
                return AddReply;
            }
            if (i == 3) {
                return EditReply;
            }
            if (i == 4) {
                return DeleteReply;
            }
            if (i != 5) {
                return null;
            }
            return UpdateComment;
        }

        private CommentType(int i) {
            this.value = i;
        }
    }

    public enum ContainerType implements C23115i.AbstractC23116a {
        ContainerTypeUnknown(0),
        Wiki(1);
        
        private static final C23115i.AbstractC23117b<ContainerType> internalValueMap = new C23115i.AbstractC23117b<ContainerType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.ContainerType.C293441 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<ContainerType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static ContainerType valueOf(int i) {
            return forNumber(i);
        }

        public static ContainerType forNumber(int i) {
            if (i == 0) {
                return ContainerTypeUnknown;
            }
            if (i != 1) {
                return null;
            }
            return Wiki;
        }

        private ContainerType(int i) {
            this.value = i;
        }
    }

    public enum EntityType implements C23115i.AbstractC23116a {
        EntityTypeUnknown(0),
        EntityUserID(1),
        EntityDepartmentID(2),
        EntityTenantID(3),
        EntityChatID(4),
        EntityDocID(5),
        EntitySheetID(6),
        EntityFileID(7),
        EntityFolderID(8),
        EntityMindNoteID(9),
        EntityBitableID(10),
        EntitySlideID(11),
        EntityBotID(12),
        EntityVideoID(13),
        EntityDriverSDKFileID(14),
        EntityLink(15),
        EntityChatter(16),
        EntityImage(17),
        EntityVideoIM(18),
        EntityFileIM(19),
        EntityMiniProgramsAndH5(20),
        EntityLocalFile(21),
        EntityUserEmail(22),
        EntityPublicEmail(23),
        EntityEmailGroup(24),
        EntityUserMobile(25),
        EntityEmailContent(26),
        EntityEmailSubject(27),
        EntityEmailAttachment(28),
        EntityOKRType(29),
        EntityIMContent(30),
        EntityDocxID(31),
        EntityDevice(45);
        
        private static final C23115i.AbstractC23117b<EntityType> internalValueMap = new C23115i.AbstractC23117b<EntityType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.EntityType.C293451 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<EntityType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static EntityType valueOf(int i) {
            return forNumber(i);
        }

        public static EntityType forNumber(int i) {
            if (i == 45) {
                return EntityDevice;
            }
            switch (i) {
                case 0:
                    return EntityTypeUnknown;
                case 1:
                    return EntityUserID;
                case 2:
                    return EntityDepartmentID;
                case 3:
                    return EntityTenantID;
                case 4:
                    return EntityChatID;
                case 5:
                    return EntityDocID;
                case 6:
                    return EntitySheetID;
                case 7:
                    return EntityFileID;
                case 8:
                    return EntityFolderID;
                case 9:
                    return EntityMindNoteID;
                case 10:
                    return EntityBitableID;
                case 11:
                    return EntitySlideID;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return EntityBotID;
                case 13:
                    return EntityVideoID;
                case 14:
                    return EntityDriverSDKFileID;
                case 15:
                    return EntityLink;
                case 16:
                    return EntityChatter;
                case 17:
                    return EntityImage;
                case 18:
                    return EntityVideoIM;
                case 19:
                    return EntityFileIM;
                case 20:
                    return EntityMiniProgramsAndH5;
                case 21:
                    return EntityLocalFile;
                case 22:
                    return EntityUserEmail;
                case 23:
                    return EntityPublicEmail;
                case 24:
                    return EntityEmailGroup;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    return EntityUserMobile;
                case 26:
                    return EntityEmailContent;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    return EntityEmailSubject;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    return EntityEmailAttachment;
                case 29:
                    return EntityOKRType;
                case 30:
                    return EntityIMContent;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    return EntityDocxID;
                default:
                    return null;
            }
        }

        private EntityType(int i) {
            this.value = i;
        }
    }

    public enum FlagType implements C23115i.AbstractC23116a {
        FlagNormal(0),
        FlagTest(1),
        FlagStress(2);
        
        private static final C23115i.AbstractC23117b<FlagType> internalValueMap = new C23115i.AbstractC23117b<FlagType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.FlagType.C293461 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<FlagType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static FlagType valueOf(int i) {
            return forNumber(i);
        }

        public static FlagType forNumber(int i) {
            if (i == 0) {
                return FlagNormal;
            }
            if (i == 1) {
                return FlagTest;
            }
            if (i != 2) {
                return null;
            }
            return FlagStress;
        }

        private FlagType(int i) {
            this.value = i;
        }
    }

    public enum ModuleType implements C23115i.AbstractC23116a {
        ModuleUnknown(0),
        ModuleDocs(1),
        ModuleSheets(2),
        ModuleFiles(3),
        ModuleFolders(4),
        ModulePassport(5),
        ModuleMindNote(6),
        ModuleBitable(7),
        ModuleSlide(8),
        ModuleChat(9),
        ModuleIMImageAndVideo(10),
        ModuleVideo(11),
        ModuleIMFile(12),
        ModuleCommunication(13),
        ModuleCalendar(14),
        ModuleAddressBook(15),
        ModuleAPP(16),
        ModuleEmail(17),
        ModuleIM(18),
        ModuleDocx(19),
        ModulePeople(20),
        ModuleDevice(21);
        
        private static final C23115i.AbstractC23117b<ModuleType> internalValueMap = new C23115i.AbstractC23117b<ModuleType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.ModuleType.C293471 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<ModuleType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static ModuleType valueOf(int i) {
            return forNumber(i);
        }

        public static ModuleType forNumber(int i) {
            switch (i) {
                case 0:
                    return ModuleUnknown;
                case 1:
                    return ModuleDocs;
                case 2:
                    return ModuleSheets;
                case 3:
                    return ModuleFiles;
                case 4:
                    return ModuleFolders;
                case 5:
                    return ModulePassport;
                case 6:
                    return ModuleMindNote;
                case 7:
                    return ModuleBitable;
                case 8:
                    return ModuleSlide;
                case 9:
                    return ModuleChat;
                case 10:
                    return ModuleIMImageAndVideo;
                case 11:
                    return ModuleVideo;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return ModuleIMFile;
                case 13:
                    return ModuleCommunication;
                case 14:
                    return ModuleCalendar;
                case 15:
                    return ModuleAddressBook;
                case 16:
                    return ModuleAPP;
                case 17:
                    return ModuleEmail;
                case 18:
                    return ModuleIM;
                case 19:
                    return ModuleDocx;
                case 20:
                    return ModulePeople;
                case 21:
                    return ModuleDevice;
                default:
                    return null;
            }
        }

        private ModuleType(int i) {
            this.value = i;
        }
    }

    public enum OperationType implements C23115i.AbstractC23116a {
        OperationTypeUnknown(0),
        OperationCreate(1),
        OperationRead(2),
        OperationUpdate(3),
        OperationDelete(4),
        OperationComment(5),
        OperationExport(6),
        OperationDownload(7),
        OperationPrint(8),
        OperationUpdateCollaborator(9),
        OperationShareTo3rdApp(10),
        OperationUpdateShareSetting(11),
        OperationFrontExport(12),
        OperationOpenWith3rdApp(13),
        OperationImport(14),
        OperationLogin(15),
        OperationJoin(16),
        OperationQuit(17),
        OperationSaveAs(18),
        OperationCopyContent(19),
        OperationForward(20),
        OperationLoadToLocal(21),
        OperationAddExternalFriend(22),
        OperationStartExternalChat(23),
        OperationUploadCalendarAppendix(24),
        OperationLookDeptStruct(25),
        OperationObtainMobile(26),
        OperationLookProfile(27),
        OperationScreenShot(63),
        OperationScreenRecording(90);
        
        private static final C23115i.AbstractC23117b<OperationType> internalValueMap = new C23115i.AbstractC23117b<OperationType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.OperationType.C293481 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<OperationType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static OperationType valueOf(int i) {
            return forNumber(i);
        }

        public static OperationType forNumber(int i) {
            if (i == 63) {
                return OperationScreenShot;
            }
            if (i == 90) {
                return OperationScreenRecording;
            }
            switch (i) {
                case 0:
                    return OperationTypeUnknown;
                case 1:
                    return OperationCreate;
                case 2:
                    return OperationRead;
                case 3:
                    return OperationUpdate;
                case 4:
                    return OperationDelete;
                case 5:
                    return OperationComment;
                case 6:
                    return OperationExport;
                case 7:
                    return OperationDownload;
                case 8:
                    return OperationPrint;
                case 9:
                    return OperationUpdateCollaborator;
                case 10:
                    return OperationShareTo3rdApp;
                case 11:
                    return OperationUpdateShareSetting;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return OperationFrontExport;
                case 13:
                    return OperationOpenWith3rdApp;
                case 14:
                    return OperationImport;
                case 15:
                    return OperationLogin;
                case 16:
                    return OperationJoin;
                case 17:
                    return OperationQuit;
                case 18:
                    return OperationSaveAs;
                case 19:
                    return OperationCopyContent;
                case 20:
                    return OperationForward;
                case 21:
                    return OperationLoadToLocal;
                case 22:
                    return OperationAddExternalFriend;
                case 23:
                    return OperationStartExternalChat;
                case 24:
                    return OperationUploadCalendarAppendix;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    return OperationLookDeptStruct;
                case 26:
                    return OperationObtainMobile;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    return OperationLookProfile;
                default:
                    return null;
            }
        }

        private OperationType(int i) {
            this.value = i;
        }
    }

    public enum PermissionActionType implements C23115i.AbstractC23116a {
        PermissionActionTypeUnknown(0),
        AddUser(1),
        RemoveUser(2),
        AddChat(3),
        RemoveChat(4),
        AddDepartment(5),
        RemoveDepartment(6);
        
        private static final C23115i.AbstractC23117b<PermissionActionType> internalValueMap = new C23115i.AbstractC23117b<PermissionActionType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.PermissionActionType.C293491 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<PermissionActionType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static PermissionActionType valueOf(int i) {
            return forNumber(i);
        }

        public static PermissionActionType forNumber(int i) {
            switch (i) {
                case 0:
                    return PermissionActionTypeUnknown;
                case 1:
                    return AddUser;
                case 2:
                    return RemoveUser;
                case 3:
                    return AddChat;
                case 4:
                    return RemoveChat;
                case 5:
                    return AddDepartment;
                case 6:
                    return RemoveDepartment;
                default:
                    return null;
            }
        }

        private PermissionActionType(int i) {
            this.value = i;
        }
    }

    public enum PermissionSettingType implements C23115i.AbstractC23116a {
        PermissionSettingTypeUnknown(0),
        DisableLinkShare(1),
        CanReadByLinkInTenant(2),
        CanEditByLinkInTenant(3),
        CanReadByLinkInInternet(4),
        CanEditByLinkInInternet(5);
        
        private static final C23115i.AbstractC23117b<PermissionSettingType> internalValueMap = new C23115i.AbstractC23117b<PermissionSettingType>() {
            /* class com.ss.android.lark.audit.security_event.SecurityEvent.PermissionSettingType.C293501 */
        };
        private final int value;

        public static C23115i.AbstractC23117b<PermissionSettingType> internalGetValueMap() {
            return internalValueMap;
        }

        public final int getNumber() {
            return this.value;
        }

        public static PermissionSettingType valueOf(int i) {
            return forNumber(i);
        }

        public static PermissionSettingType forNumber(int i) {
            if (i == 0) {
                return PermissionSettingTypeUnknown;
            }
            if (i == 1) {
                return DisableLinkShare;
            }
            if (i == 2) {
                return CanReadByLinkInTenant;
            }
            if (i == 3) {
                return CanEditByLinkInTenant;
            }
            if (i == 4) {
                return CanReadByLinkInInternet;
            }
            if (i != 5) {
                return null;
            }
            return CanEditByLinkInInternet;
        }

        private PermissionSettingType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$a */
    public static final class C29351a extends GeneratedMessageLite<C29351a, C29352a> implements AbstractC29353b {

        /* renamed from: d */
        public static final C29351a f73384d;

        /* renamed from: l */
        private static volatile AbstractC23129p<C29351a> f73385l;

        /* renamed from: e */
        private int f73386e;

        /* renamed from: f */
        private int f73387f;

        /* renamed from: g */
        private String f73388g = "";

        /* renamed from: h */
        private String f73389h = "";

        /* renamed from: i */
        private String f73390i = "";

        /* renamed from: j */
        private String f73391j = "";

        /* renamed from: k */
        private int f73392k;

        /* renamed from: z */
        public static C29351a m107797z() {
            return f73384d;
        }

        /* renamed from: q */
        public String mo103942q() {
            return this.f73388g;
        }

        /* renamed from: s */
        public String mo103944s() {
            return this.f73389h;
        }

        /* renamed from: u */
        public String mo103946u() {
            return this.f73390i;
        }

        /* renamed from: w */
        public String mo103948w() {
            return this.f73391j;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$a$a */
        public static final class C29352a extends GeneratedMessageLite.AbstractC23068a<C29351a, C29352a> implements AbstractC29353b {
            private C29352a() {
                super(C29351a.f73384d);
            }

            /* synthetic */ C29352a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29352a mo103950a(ClientType clientType) {
                mo80141b();
                ((C29351a) this.f56983a).mo103934a(clientType);
                return this;
            }

            /* renamed from: b */
            public C29352a mo103953b(String str) {
                mo80141b();
                ((C29351a) this.f56983a).mo103937b(str);
                return this;
            }

            /* renamed from: c */
            public C29352a mo103954c(String str) {
                mo80141b();
                ((C29351a) this.f56983a).mo103938c(str);
                return this;
            }

            /* renamed from: d */
            public C29352a mo103955d(String str) {
                mo80141b();
                ((C29351a) this.f56983a).mo103939d(str);
                return this;
            }

            /* renamed from: a */
            public C29352a mo103951a(FlagType flagType) {
                mo80141b();
                ((C29351a) this.f56983a).mo103935a(flagType);
                return this;
            }

            /* renamed from: a */
            public C29352a mo103952a(String str) {
                mo80141b();
                ((C29351a) this.f56983a).mo103936a(str);
                return this;
            }
        }

        /* renamed from: A */
        public static AbstractC23129p<C29351a> m107795A() {
            return f73384d.mo80122d();
        }

        static {
            C29351a aVar = new C29351a();
            f73384d = aVar;
            aVar.mo80126g();
        }

        private C29351a() {
        }

        /* renamed from: y */
        public static C29352a m107796y() {
            return (C29352a) f73384d.mo80130k();
        }

        /* renamed from: o */
        public boolean mo103940o() {
            if ((this.f73386e & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public boolean mo103941p() {
            if ((this.f73386e & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: r */
        public boolean mo103943r() {
            if ((this.f73386e & 4) == 4) {
                return true;
            }
            return false;
        }

        /* renamed from: t */
        public boolean mo103945t() {
            if ((this.f73386e & 8) == 8) {
                return true;
            }
            return false;
        }

        /* renamed from: v */
        public boolean mo103947v() {
            if ((this.f73386e & 16) == 16) {
                return true;
            }
            return false;
        }

        /* renamed from: x */
        public boolean mo103949x() {
            if ((this.f73386e & 32) == 32) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f73386e & 1) == 1) {
                i2 = 0 + CodedOutputStream.m83541f(1, this.f73387f);
            }
            if ((this.f73386e & 2) == 2) {
                i2 += CodedOutputStream.m83530b(2, mo103942q());
            }
            if ((this.f73386e & 4) == 4) {
                i2 += CodedOutputStream.m83530b(3, mo103944s());
            }
            if ((this.f73386e & 8) == 8) {
                i2 += CodedOutputStream.m83530b(4, mo103946u());
            }
            if ((this.f73386e & 16) == 16) {
                i2 += CodedOutputStream.m83530b(5, mo103948w());
            }
            if ((this.f73386e & 32) == 32) {
                i2 += CodedOutputStream.m83541f(6, this.f73392k);
            }
            int e = i2 + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public void mo103934a(ClientType clientType) {
            Objects.requireNonNull(clientType);
            this.f73386e |= 1;
            this.f73387f = clientType.getNumber();
        }

        /* renamed from: b */
        public void mo103937b(String str) {
            Objects.requireNonNull(str);
            this.f73386e |= 4;
            this.f73389h = str;
        }

        /* renamed from: c */
        public void mo103938c(String str) {
            Objects.requireNonNull(str);
            this.f73386e |= 8;
            this.f73390i = str;
        }

        /* renamed from: d */
        public void mo103939d(String str) {
            Objects.requireNonNull(str);
            this.f73386e |= 16;
            this.f73391j = str;
        }

        /* renamed from: a */
        public void mo103935a(FlagType flagType) {
            Objects.requireNonNull(flagType);
            this.f73386e |= 32;
            this.f73392k = flagType.getNumber();
        }

        /* renamed from: a */
        public void mo103936a(String str) {
            Objects.requireNonNull(str);
            this.f73386e |= 2;
            this.f73388g = str;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f73386e & 1) == 1) {
                codedOutputStream.mo80056d(1, this.f73387f);
            }
            if ((this.f73386e & 2) == 2) {
                codedOutputStream.mo80048a(2, mo103942q());
            }
            if ((this.f73386e & 4) == 4) {
                codedOutputStream.mo80048a(3, mo103944s());
            }
            if ((this.f73386e & 8) == 8) {
                codedOutputStream.mo80048a(4, mo103946u());
            }
            if ((this.f73386e & 16) == 16) {
                codedOutputStream.mo80048a(5, mo103948w());
            }
            if ((this.f73386e & 32) == 32) {
                codedOutputStream.mo80056d(6, this.f73392k);
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29351a();
                case 2:
                    return f73384d;
                case 3:
                    return null;
                case 4:
                    return new C29352a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29351a aVar = (C29351a) obj2;
                    this.f73387f = iVar.mo80151a(mo103940o(), this.f73387f, aVar.mo103940o(), aVar.f73387f);
                    this.f73388g = iVar.mo80156a(mo103941p(), this.f73388g, aVar.mo103941p(), aVar.f73388g);
                    this.f73389h = iVar.mo80156a(mo103943r(), this.f73389h, aVar.mo103943r(), aVar.f73389h);
                    this.f73390i = iVar.mo80156a(mo103945t(), this.f73390i, aVar.mo103945t(), aVar.f73390i);
                    this.f73391j = iVar.mo80156a(mo103947v(), this.f73391j, aVar.mo103947v(), aVar.f73391j);
                    this.f73392k = iVar.mo80151a(mo103949x(), this.f73392k, aVar.mo103949x(), aVar.f73392k);
                    if (iVar == GeneratedMessageLite.C23076h.f56994a) {
                        this.f73386e |= aVar.f73386e;
                    }
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 8) {
                                    int g = eVar.mo80262g();
                                    if (ClientType.forNumber(g) == null) {
                                        super.mo80118a(1, g);
                                    } else {
                                        this.f73386e = 1 | this.f73386e;
                                        this.f73387f = g;
                                    }
                                } else if (a == 18) {
                                    String e = eVar.mo80260e();
                                    this.f73386e |= 2;
                                    this.f73388g = e;
                                } else if (a == 26) {
                                    String e2 = eVar.mo80260e();
                                    this.f73386e |= 4;
                                    this.f73389h = e2;
                                } else if (a == 34) {
                                    String e3 = eVar.mo80260e();
                                    this.f73386e |= 8;
                                    this.f73390i = e3;
                                } else if (a == 42) {
                                    String e4 = eVar.mo80260e();
                                    this.f73386e |= 16;
                                    this.f73391j = e4;
                                } else if (a == 48) {
                                    int g2 = eVar.mo80262g();
                                    if (FlagType.forNumber(g2) == null) {
                                        super.mo80118a(6, g2);
                                    } else {
                                        this.f73386e |= 32;
                                        this.f73392k = g2;
                                    }
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e5) {
                            throw new RuntimeException(e5.setUnfinishedMessage(this));
                        } catch (IOException e6) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e6.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73385l == null) {
                        synchronized (C29351a.class) {
                            if (f73385l == null) {
                                f73385l = new GeneratedMessageLite.C23069b(f73384d);
                            }
                        }
                    }
                    return f73385l;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73384d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$c */
    public static final class C29354c extends GeneratedMessageLite<C29354c, C29355a> implements AbstractC29356d {

        /* renamed from: d */
        public static final C29354c f73393d;

        /* renamed from: p */
        private static volatile AbstractC23129p<C29354c> f73394p;

        /* renamed from: e */
        private int f73395e;

        /* renamed from: f */
        private int f73396f;

        /* renamed from: g */
        private int f73397g;

        /* renamed from: h */
        private String f73398h = "";

        /* renamed from: i */
        private String f73399i = "";

        /* renamed from: j */
        private C29372o f73400j;

        /* renamed from: k */
        private C23115i.AbstractC23118c<C29378s> f73401k = m83630j();

        /* renamed from: l */
        private C23115i.AbstractC23118c<C29366k> f73402l = m83630j();

        /* renamed from: m */
        private C29351a f73403m;

        /* renamed from: n */
        private C29360g f73404n;

        /* renamed from: o */
        private byte f73405o = -1;

        /* renamed from: r */
        public String mo103968r() {
            return this.f73398h;
        }

        /* renamed from: t */
        public String mo103970t() {
            return this.f73399i;
        }

        /* renamed from: a */
        public void mo103936a(String str) {
            Objects.requireNonNull(str);
            this.f73395e |= 4;
            this.f73398h = str;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$c$a */
        public static final class C29355a extends GeneratedMessageLite.AbstractC23068a<C29354c, C29355a> implements AbstractC29356d {
            private C29355a() {
                super(C29354c.f73393d);
            }

            /* synthetic */ C29355a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29355a mo103977a(ModuleType moduleType) {
                mo80141b();
                ((C29354c) this.f56983a).mo103957a(moduleType);
                return this;
            }

            /* renamed from: b */
            public C29355a mo103983b(Iterable<? extends C29366k> iterable) {
                mo80141b();
                ((C29354c) this.f56983a).mo103964b(iterable);
                return this;
            }

            /* renamed from: a */
            public C29355a mo103978a(OperationType operationType) {
                mo80141b();
                ((C29354c) this.f56983a).mo103958a(operationType);
                return this;
            }

            /* renamed from: b */
            public C29355a mo103984b(String str) {
                mo80141b();
                ((C29354c) this.f56983a).mo103965b(str);
                return this;
            }

            /* renamed from: a */
            public C29355a mo103979a(C29351a aVar) {
                mo80141b();
                ((C29354c) this.f56983a).mo103959a(aVar);
                return this;
            }

            /* renamed from: a */
            public C29355a mo103980a(C29360g gVar) {
                mo80141b();
                ((C29354c) this.f56983a).mo103960a(gVar);
                return this;
            }

            /* renamed from: a */
            public C29355a mo103981a(C29372o oVar) {
                mo80141b();
                ((C29354c) this.f56983a).mo103961a(oVar);
                return this;
            }

            /* renamed from: a */
            public C29355a mo103982a(Iterable<? extends C29378s> iterable) {
                mo80141b();
                ((C29354c) this.f56983a).mo103962a(iterable);
                return this;
            }

            /* renamed from: a */
            public C29355a mo103952a(String str) {
                mo80141b();
                ((C29354c) this.f56983a).mo103936a(str);
                return this;
            }
        }

        /* renamed from: B */
        public static AbstractC23129p<C29354c> m107824B() {
            return f73393d.mo80122d();
        }

        /* renamed from: w */
        public int mo103973w() {
            return this.f73401k.size();
        }

        /* renamed from: x */
        public int mo103974x() {
            return this.f73402l.size();
        }

        static {
            C29354c cVar = new C29354c();
            f73393d = cVar;
            cVar.mo80126g();
        }

        /* renamed from: A */
        public static C29355a m107823A() {
            return (C29355a) f73393d.mo80130k();
        }

        /* renamed from: o */
        public boolean mo103940o() {
            if ((this.f73395e & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public boolean mo103966p() {
            if ((this.f73395e & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public boolean mo103967q() {
            if ((this.f73395e & 4) == 4) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public boolean mo103969s() {
            if ((this.f73395e & 8) == 8) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        public boolean mo103971u() {
            if ((this.f73395e & 16) == 16) {
                return true;
            }
            return false;
        }

        /* renamed from: v */
        public C29372o mo103972v() {
            C29372o oVar = this.f73400j;
            if (oVar == null) {
                return C29372o.m107947t();
            }
            return oVar;
        }

        /* renamed from: y */
        public C29351a mo103975y() {
            C29351a aVar = this.f73403m;
            if (aVar == null) {
                return C29351a.m107797z();
            }
            return aVar;
        }

        /* renamed from: z */
        public C29360g mo103976z() {
            C29360g gVar = this.f73404n;
            if (gVar == null) {
                return C29360g.m107872t();
            }
            return gVar;
        }

        private C29354c() {
        }

        /* renamed from: C */
        private void m107825C() {
            if (!this.f73401k.mo80236a()) {
                this.f73401k = GeneratedMessageLite.m83627a(this.f73401k);
            }
        }

        /* renamed from: D */
        private void m107826D() {
            if (!this.f73402l.mo80236a()) {
                this.f73402l = GeneratedMessageLite.m83627a(this.f73402l);
            }
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i;
            int i2 = this.f56981c;
            if (i2 != -1) {
                return i2;
            }
            if ((this.f73395e & 1) == 1) {
                i = CodedOutputStream.m83541f(1, this.f73396f) + 0;
            } else {
                i = 0;
            }
            if ((this.f73395e & 2) == 2) {
                i += CodedOutputStream.m83541f(2, this.f73397g);
            }
            if ((this.f73395e & 4) == 4) {
                i += CodedOutputStream.m83530b(3, mo103968r());
            }
            if ((this.f73395e & 8) == 8) {
                i += CodedOutputStream.m83530b(4, mo103970t());
            }
            if ((this.f73395e & 16) == 16) {
                i += CodedOutputStream.m83529b(5, mo103972v());
            }
            for (int i3 = 0; i3 < this.f73401k.size(); i3++) {
                i += CodedOutputStream.m83529b(6, this.f73401k.get(i3));
            }
            for (int i4 = 0; i4 < this.f73402l.size(); i4++) {
                i += CodedOutputStream.m83529b(7, this.f73402l.get(i4));
            }
            if ((this.f73395e & 32) == 32) {
                i += CodedOutputStream.m83529b(8, mo103975y());
            }
            if ((this.f73395e & 64) == 64) {
                i += CodedOutputStream.m83529b(9, mo103976z());
            }
            int e = i + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public C29378s mo103956a(int i) {
            return this.f73401k.get(i);
        }

        /* renamed from: b */
        public C29366k mo103963b(int i) {
            return this.f73402l.get(i);
        }

        /* renamed from: a */
        public void mo103957a(ModuleType moduleType) {
            Objects.requireNonNull(moduleType);
            this.f73395e |= 1;
            this.f73396f = moduleType.getNumber();
        }

        /* renamed from: b */
        public void mo103964b(Iterable<? extends C29366k> iterable) {
            m107826D();
            AbstractC23103a.m83739a(iterable, this.f73402l);
        }

        /* renamed from: a */
        public void mo103958a(OperationType operationType) {
            Objects.requireNonNull(operationType);
            this.f73395e |= 2;
            this.f73397g = operationType.getNumber();
        }

        /* renamed from: b */
        public void mo103965b(String str) {
            Objects.requireNonNull(str);
            this.f73395e |= 8;
            this.f73399i = str;
        }

        /* renamed from: a */
        public void mo103959a(C29351a aVar) {
            Objects.requireNonNull(aVar);
            this.f73403m = aVar;
            this.f73395e |= 32;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f73395e & 1) == 1) {
                codedOutputStream.mo80056d(1, this.f73396f);
            }
            if ((this.f73395e & 2) == 2) {
                codedOutputStream.mo80056d(2, this.f73397g);
            }
            if ((this.f73395e & 4) == 4) {
                codedOutputStream.mo80048a(3, mo103968r());
            }
            if ((this.f73395e & 8) == 8) {
                codedOutputStream.mo80048a(4, mo103970t());
            }
            if ((this.f73395e & 16) == 16) {
                codedOutputStream.mo80047a(5, mo103972v());
            }
            for (int i = 0; i < this.f73401k.size(); i++) {
                codedOutputStream.mo80047a(6, this.f73401k.get(i));
            }
            for (int i2 = 0; i2 < this.f73402l.size(); i2++) {
                codedOutputStream.mo80047a(7, this.f73402l.get(i2));
            }
            if ((this.f73395e & 32) == 32) {
                codedOutputStream.mo80047a(8, mo103975y());
            }
            if ((this.f73395e & 64) == 64) {
                codedOutputStream.mo80047a(9, mo103976z());
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* renamed from: a */
        public void mo103960a(C29360g gVar) {
            Objects.requireNonNull(gVar);
            this.f73404n = gVar;
            this.f73395e |= 64;
        }

        /* renamed from: a */
        public void mo103961a(C29372o oVar) {
            Objects.requireNonNull(oVar);
            this.f73400j = oVar;
            this.f73395e |= 16;
        }

        /* renamed from: a */
        public void mo103962a(Iterable<? extends C29378s> iterable) {
            m107825C();
            AbstractC23103a.m83739a(iterable, this.f73401k);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v60, resolved type: com.google.protobuf.i$c<com.ss.android.lark.audit.security_event.SecurityEvent$s> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v65, resolved type: com.google.protobuf.i$c<com.ss.android.lark.audit.security_event.SecurityEvent$k> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29354c();
                case 2:
                    byte b = this.f73405o;
                    if (b == 1) {
                        return f73393d;
                    }
                    if (b == 0) {
                        return null;
                    }
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (!mo103940o()) {
                        if (booleanValue) {
                            this.f73405o = 0;
                        }
                        return null;
                    } else if (!mo103966p()) {
                        if (booleanValue) {
                            this.f73405o = 0;
                        }
                        return null;
                    } else if (!mo103967q()) {
                        if (booleanValue) {
                            this.f73405o = 0;
                        }
                        return null;
                    } else if (!mo103971u()) {
                        if (booleanValue) {
                            this.f73405o = 0;
                        }
                        return null;
                    } else if (!mo103972v().mo80127h()) {
                        if (booleanValue) {
                            this.f73405o = 0;
                        }
                        return null;
                    } else {
                        for (int i = 0; i < mo103973w(); i++) {
                            if (!mo103956a(i).mo80127h()) {
                                if (booleanValue) {
                                    this.f73405o = 0;
                                }
                                return null;
                            }
                        }
                        for (int i2 = 0; i2 < mo103974x(); i2++) {
                            if (!mo103963b(i2).mo80127h()) {
                                if (booleanValue) {
                                    this.f73405o = 0;
                                }
                                return null;
                            }
                        }
                        if (booleanValue) {
                            this.f73405o = 1;
                        }
                        return f73393d;
                    }
                case 3:
                    this.f73401k.mo80241b();
                    this.f73402l.mo80241b();
                    return null;
                case 4:
                    return new C29355a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29354c cVar = (C29354c) obj2;
                    this.f73396f = iVar.mo80151a(mo103940o(), this.f73396f, cVar.mo103940o(), cVar.f73396f);
                    this.f73397g = iVar.mo80151a(mo103966p(), this.f73397g, cVar.mo103966p(), cVar.f73397g);
                    this.f73398h = iVar.mo80156a(mo103967q(), this.f73398h, cVar.mo103967q(), cVar.f73398h);
                    this.f73399i = iVar.mo80156a(mo103969s(), this.f73399i, cVar.mo103969s(), cVar.f73399i);
                    this.f73400j = (C29372o) iVar.mo80154a(this.f73400j, cVar.f73400j);
                    this.f73401k = iVar.mo80153a(this.f73401k, cVar.f73401k);
                    this.f73402l = iVar.mo80153a(this.f73402l, cVar.f73402l);
                    this.f73403m = (C29351a) iVar.mo80154a(this.f73403m, cVar.f73403m);
                    this.f73404n = (C29360g) iVar.mo80154a(this.f73404n, cVar.f73404n);
                    if (iVar == GeneratedMessageLite.C23076h.f56994a) {
                        this.f73395e |= cVar.f73395e;
                    }
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 8) {
                                    int g = eVar.mo80262g();
                                    if (ModuleType.forNumber(g) == null) {
                                        super.mo80118a(1, g);
                                    } else {
                                        this.f73395e |= 1;
                                        this.f73396f = g;
                                    }
                                } else if (a == 16) {
                                    int g2 = eVar.mo80262g();
                                    if (OperationType.forNumber(g2) == null) {
                                        super.mo80118a(2, g2);
                                    } else {
                                        this.f73395e |= 2;
                                        this.f73397g = g2;
                                    }
                                } else if (a == 26) {
                                    String e = eVar.mo80260e();
                                    this.f73395e |= 4;
                                    this.f73398h = e;
                                } else if (a == 34) {
                                    String e2 = eVar.mo80260e();
                                    this.f73395e = 8 | this.f73395e;
                                    this.f73399i = e2;
                                } else if (a == 42) {
                                    C29372o.C29373a aVar = (this.f73395e & 16) == 16 ? (C29372o.C29373a) this.f73400j.mo80130k() : null;
                                    C29372o oVar = (C29372o) eVar.mo80252a(C29372o.m107948u(), gVar);
                                    this.f73400j = oVar;
                                    if (aVar != null) {
                                        aVar.mo80139b((GeneratedMessageLite) oVar);
                                        this.f73400j = (C29372o) aVar.mo80147g();
                                    }
                                    this.f73395e |= 16;
                                } else if (a == 50) {
                                    if (!this.f73401k.mo80236a()) {
                                        this.f73401k = GeneratedMessageLite.m83627a(this.f73401k);
                                    }
                                    this.f73401k.add(eVar.mo80252a(C29378s.m107972t(), gVar));
                                } else if (a == 58) {
                                    if (!this.f73402l.mo80236a()) {
                                        this.f73402l = GeneratedMessageLite.m83627a(this.f73402l);
                                    }
                                    this.f73402l.add(eVar.mo80252a(C29366k.m107926t(), gVar));
                                } else if (a == 66) {
                                    C29351a.C29352a aVar2 = (this.f73395e & 32) == 32 ? (C29351a.C29352a) this.f73403m.mo80130k() : null;
                                    C29351a aVar3 = (C29351a) eVar.mo80252a(C29351a.m107795A(), gVar);
                                    this.f73403m = aVar3;
                                    if (aVar2 != null) {
                                        aVar2.mo80139b((GeneratedMessageLite) aVar3);
                                        this.f73403m = (C29351a) aVar2.mo80147g();
                                    }
                                    this.f73395e |= 32;
                                } else if (a == 74) {
                                    C29360g.C29361a aVar4 = (this.f73395e & 64) == 64 ? (C29360g.C29361a) this.f73404n.mo80130k() : null;
                                    C29360g gVar2 = (C29360g) eVar.mo80252a(C29360g.m107873u(), gVar);
                                    this.f73404n = gVar2;
                                    if (aVar4 != null) {
                                        aVar4.mo80139b((GeneratedMessageLite) gVar2);
                                        this.f73404n = (C29360g) aVar4.mo80147g();
                                    }
                                    this.f73395e |= 64;
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e3) {
                            throw new RuntimeException(e3.setUnfinishedMessage(this));
                        } catch (IOException e4) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73394p == null) {
                        synchronized (C29354c.class) {
                            if (f73394p == null) {
                                f73394p = new GeneratedMessageLite.C23069b(f73393d);
                            }
                        }
                    }
                    return f73394p;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73393d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$g */
    public static final class C29360g extends GeneratedMessageLite<C29360g, C29361a> implements AbstractC29362h {

        /* renamed from: d */
        public static final C29360g f73410d;

        /* renamed from: j */
        private static volatile AbstractC23129p<C29360g> f73411j;

        /* renamed from: e */
        private int f73412e;

        /* renamed from: f */
        private int f73413f;

        /* renamed from: g */
        private int f73414g;

        /* renamed from: h */
        private long f73415h;

        /* renamed from: i */
        private long f73416i;

        private C29360g() {
        }

        /* renamed from: t */
        public static C29360g m107872t() {
            return f73410d;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$g$a */
        public static final class C29361a extends GeneratedMessageLite.AbstractC23068a<C29360g, C29361a> implements AbstractC29362h {
            private C29361a() {
                super(C29360g.f73410d);
            }

            /* synthetic */ C29361a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29361a mo103994a(long j) {
                mo80141b();
                ((C29360g) this.f56983a).mo103987a(j);
                return this;
            }

            /* renamed from: b */
            public C29361a mo103997b(long j) {
                mo80141b();
                ((C29360g) this.f56983a).mo103990b(j);
                return this;
            }

            /* renamed from: a */
            public C29361a mo103995a(AppDetail appDetail) {
                mo80141b();
                ((C29360g) this.f56983a).mo103988a(appDetail);
                return this;
            }

            /* renamed from: a */
            public C29361a mo103996a(CommentType commentType) {
                mo80141b();
                ((C29360g) this.f56983a).mo103989a(commentType);
                return this;
            }
        }

        /* renamed from: u */
        public static AbstractC23129p<C29360g> m107873u() {
            return f73410d.mo80122d();
        }

        static {
            C29360g gVar = new C29360g();
            f73410d = gVar;
            gVar.mo80126g();
        }

        /* renamed from: s */
        public static C29361a m107871s() {
            return (C29361a) f73410d.mo80130k();
        }

        /* renamed from: o */
        public boolean mo103940o() {
            if ((this.f73412e & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public boolean mo103991p() {
            if ((this.f73412e & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public boolean mo103992q() {
            if ((this.f73412e & 4) == 4) {
                return true;
            }
            return false;
        }

        /* renamed from: r */
        public boolean mo103993r() {
            if ((this.f73412e & 8) == 8) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f73412e & 1) == 1) {
                i2 = 0 + CodedOutputStream.m83541f(1, this.f73413f);
            }
            if ((this.f73412e & 2) == 2) {
                i2 += CodedOutputStream.m83541f(2, this.f73414g);
            }
            if ((this.f73412e & 4) == 4) {
                i2 += CodedOutputStream.m83536d(3, this.f73415h);
            }
            if ((this.f73412e & 8) == 8) {
                i2 += CodedOutputStream.m83536d(4, this.f73416i);
            }
            int e = i2 + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public void mo103987a(long j) {
            this.f73412e |= 4;
            this.f73415h = j;
        }

        /* renamed from: b */
        public void mo103990b(long j) {
            this.f73412e |= 8;
            this.f73416i = j;
        }

        /* renamed from: a */
        public void mo103988a(AppDetail appDetail) {
            Objects.requireNonNull(appDetail);
            this.f73412e |= 2;
            this.f73414g = appDetail.getNumber();
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f73412e & 1) == 1) {
                codedOutputStream.mo80056d(1, this.f73413f);
            }
            if ((this.f73412e & 2) == 2) {
                codedOutputStream.mo80056d(2, this.f73414g);
            }
            if ((this.f73412e & 4) == 4) {
                codedOutputStream.mo80045a(3, this.f73415h);
            }
            if ((this.f73412e & 8) == 8) {
                codedOutputStream.mo80045a(4, this.f73416i);
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* renamed from: a */
        public void mo103989a(CommentType commentType) {
            Objects.requireNonNull(commentType);
            this.f73412e |= 1;
            this.f73413f = commentType.getNumber();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29360g();
                case 2:
                    return f73410d;
                case 3:
                    return null;
                case 4:
                    return new C29361a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29360g gVar = (C29360g) obj2;
                    this.f73413f = iVar.mo80151a(mo103940o(), this.f73413f, gVar.mo103940o(), gVar.f73413f);
                    this.f73414g = iVar.mo80151a(mo103991p(), this.f73414g, gVar.mo103991p(), gVar.f73414g);
                    this.f73415h = iVar.mo80152a(mo103992q(), this.f73415h, gVar.mo103992q(), gVar.f73415h);
                    this.f73416i = iVar.mo80152a(mo103993r(), this.f73416i, gVar.mo103993r(), gVar.f73416i);
                    if (iVar == GeneratedMessageLite.C23076h.f56994a) {
                        this.f73412e |= gVar.f73412e;
                    }
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar2 = (C23111g) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 8) {
                                    int g = eVar.mo80262g();
                                    if (CommentType.forNumber(g) == null) {
                                        super.mo80118a(1, g);
                                    } else {
                                        this.f73412e = 1 | this.f73412e;
                                        this.f73413f = g;
                                    }
                                } else if (a == 16) {
                                    int g2 = eVar.mo80262g();
                                    if (AppDetail.forNumber(g2) == null) {
                                        super.mo80118a(2, g2);
                                    } else {
                                        this.f73412e |= 2;
                                        this.f73414g = g2;
                                    }
                                } else if (a == 24) {
                                    this.f73412e |= 4;
                                    this.f73415h = eVar.mo80255b();
                                } else if (a == 32) {
                                    this.f73412e |= 8;
                                    this.f73416i = eVar.mo80255b();
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e.setUnfinishedMessage(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73411j == null) {
                        synchronized (C29360g.class) {
                            if (f73411j == null) {
                                f73411j = new GeneratedMessageLite.C23069b(f73410d);
                            }
                        }
                    }
                    return f73411j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73410d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$i */
    public static final class C29363i extends GeneratedMessageLite<C29363i, C29364a> implements AbstractC29365j {

        /* renamed from: d */
        public static final C29363i f73417d;

        /* renamed from: n */
        private static volatile AbstractC23129p<C29363i> f73418n;

        /* renamed from: e */
        private int f73419e;

        /* renamed from: f */
        private String f73420f = "";

        /* renamed from: g */
        private String f73421g = "";

        /* renamed from: h */
        private String f73422h = "";

        /* renamed from: i */
        private String f73423i = "";

        /* renamed from: j */
        private int f73424j;

        /* renamed from: k */
        private int f73425k;

        /* renamed from: l */
        private String f73426l = "";

        /* renamed from: m */
        private String f73427m = "";

        /* renamed from: D */
        public static C29363i m107890D() {
            return f73417d;
        }

        /* renamed from: B */
        public String mo103999B() {
            return this.f73427m;
        }

        /* renamed from: p */
        public String mo104007p() {
            return this.f73420f;
        }

        /* renamed from: r */
        public String mo104009r() {
            return this.f73421g;
        }

        /* renamed from: t */
        public String mo104011t() {
            return this.f73422h;
        }

        /* renamed from: v */
        public String mo104013v() {
            return this.f73423i;
        }

        /* renamed from: z */
        public String mo104017z() {
            return this.f73426l;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$i$a */
        public static final class C29364a extends GeneratedMessageLite.AbstractC23068a<C29363i, C29364a> implements AbstractC29365j {
            private C29364a() {
                super(C29363i.f73417d);
            }

            /* synthetic */ C29364a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29364a mo104018a(ContainerType containerType) {
                mo80141b();
                ((C29363i) this.f56983a).mo104000a(containerType);
                return this;
            }

            /* renamed from: b */
            public C29364a mo104020b(String str) {
                mo80141b();
                ((C29363i) this.f56983a).mo104002b(str);
                return this;
            }

            /* renamed from: c */
            public C29364a mo104021c(String str) {
                mo80141b();
                ((C29363i) this.f56983a).mo104003c(str);
                return this;
            }

            /* renamed from: d */
            public C29364a mo104022d(String str) {
                mo80141b();
                ((C29363i) this.f56983a).mo104004d(str);
                return this;
            }

            /* renamed from: e */
            public C29364a mo104023e(String str) {
                mo80141b();
                ((C29363i) this.f56983a).mo104005e(str);
                return this;
            }

            /* renamed from: f */
            public C29364a mo104024f(String str) {
                mo80141b();
                ((C29363i) this.f56983a).mo104006f(str);
                return this;
            }

            /* renamed from: a */
            public C29364a mo104019a(PermissionSettingType permissionSettingType) {
                mo80141b();
                ((C29363i) this.f56983a).mo104001a(permissionSettingType);
                return this;
            }

            /* renamed from: a */
            public C29364a mo103952a(String str) {
                mo80141b();
                ((C29363i) this.f56983a).mo103936a(str);
                return this;
            }
        }

        /* renamed from: E */
        public static AbstractC23129p<C29363i> m107891E() {
            return f73417d.mo80122d();
        }

        static {
            C29363i iVar = new C29363i();
            f73417d = iVar;
            iVar.mo80126g();
        }

        /* renamed from: C */
        public static C29364a m107889C() {
            return (C29364a) f73417d.mo80130k();
        }

        /* renamed from: A */
        public boolean mo103998A() {
            if ((this.f73419e & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                return true;
            }
            return false;
        }

        /* renamed from: o */
        public boolean mo103940o() {
            if ((this.f73419e & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public boolean mo104008q() {
            if ((this.f73419e & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public boolean mo104010s() {
            if ((this.f73419e & 4) == 4) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        public boolean mo104012u() {
            if ((this.f73419e & 8) == 8) {
                return true;
            }
            return false;
        }

        /* renamed from: w */
        public boolean mo104014w() {
            if ((this.f73419e & 16) == 16) {
                return true;
            }
            return false;
        }

        /* renamed from: x */
        public boolean mo104015x() {
            if ((this.f73419e & 32) == 32) {
                return true;
            }
            return false;
        }

        /* renamed from: y */
        public boolean mo104016y() {
            if ((this.f73419e & 64) == 64) {
                return true;
            }
            return false;
        }

        private C29363i() {
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f73419e & 1) == 1) {
                i2 = 0 + CodedOutputStream.m83530b(1, mo104007p());
            }
            if ((this.f73419e & 2) == 2) {
                i2 += CodedOutputStream.m83530b(2, mo104009r());
            }
            if ((this.f73419e & 4) == 4) {
                i2 += CodedOutputStream.m83530b(3, mo104011t());
            }
            if ((this.f73419e & 8) == 8) {
                i2 += CodedOutputStream.m83530b(4, mo104013v());
            }
            if ((this.f73419e & 16) == 16) {
                i2 += CodedOutputStream.m83541f(5, this.f73424j);
            }
            if ((this.f73419e & 32) == 32) {
                i2 += CodedOutputStream.m83541f(6, this.f73425k);
            }
            if ((this.f73419e & 64) == 64) {
                i2 += CodedOutputStream.m83530b(7, mo104017z());
            }
            if ((this.f73419e & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                i2 += CodedOutputStream.m83530b(8, mo103999B());
            }
            int e = i2 + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public void mo104000a(ContainerType containerType) {
            Objects.requireNonNull(containerType);
            this.f73419e |= 32;
            this.f73425k = containerType.getNumber();
        }

        /* renamed from: b */
        public void mo104002b(String str) {
            Objects.requireNonNull(str);
            this.f73419e |= 2;
            this.f73421g = str;
        }

        /* renamed from: c */
        public void mo104003c(String str) {
            Objects.requireNonNull(str);
            this.f73419e |= 4;
            this.f73422h = str;
        }

        /* renamed from: d */
        public void mo104004d(String str) {
            Objects.requireNonNull(str);
            this.f73419e |= 8;
            this.f73423i = str;
        }

        /* renamed from: e */
        public void mo104005e(String str) {
            Objects.requireNonNull(str);
            this.f73419e |= 64;
            this.f73426l = str;
        }

        /* renamed from: f */
        public void mo104006f(String str) {
            Objects.requireNonNull(str);
            this.f73419e |= SmActions.ACTION_ONTHECALL_EXIT;
            this.f73427m = str;
        }

        /* renamed from: a */
        public void mo104001a(PermissionSettingType permissionSettingType) {
            Objects.requireNonNull(permissionSettingType);
            this.f73419e |= 16;
            this.f73424j = permissionSettingType.getNumber();
        }

        /* renamed from: a */
        public void mo103936a(String str) {
            Objects.requireNonNull(str);
            this.f73419e |= 1;
            this.f73420f = str;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f73419e & 1) == 1) {
                codedOutputStream.mo80048a(1, mo104007p());
            }
            if ((this.f73419e & 2) == 2) {
                codedOutputStream.mo80048a(2, mo104009r());
            }
            if ((this.f73419e & 4) == 4) {
                codedOutputStream.mo80048a(3, mo104011t());
            }
            if ((this.f73419e & 8) == 8) {
                codedOutputStream.mo80048a(4, mo104013v());
            }
            if ((this.f73419e & 16) == 16) {
                codedOutputStream.mo80056d(5, this.f73424j);
            }
            if ((this.f73419e & 32) == 32) {
                codedOutputStream.mo80056d(6, this.f73425k);
            }
            if ((this.f73419e & 64) == 64) {
                codedOutputStream.mo80048a(7, mo104017z());
            }
            if ((this.f73419e & SmActions.ACTION_ONTHECALL_EXIT) == 128) {
                codedOutputStream.mo80048a(8, mo103999B());
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29363i();
                case 2:
                    return f73417d;
                case 3:
                    return null;
                case 4:
                    return new C29364a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29363i iVar2 = (C29363i) obj2;
                    this.f73420f = iVar.mo80156a(mo103940o(), this.f73420f, iVar2.mo103940o(), iVar2.f73420f);
                    this.f73421g = iVar.mo80156a(mo104008q(), this.f73421g, iVar2.mo104008q(), iVar2.f73421g);
                    this.f73422h = iVar.mo80156a(mo104010s(), this.f73422h, iVar2.mo104010s(), iVar2.f73422h);
                    this.f73423i = iVar.mo80156a(mo104012u(), this.f73423i, iVar2.mo104012u(), iVar2.f73423i);
                    this.f73424j = iVar.mo80151a(mo104014w(), this.f73424j, iVar2.mo104014w(), iVar2.f73424j);
                    this.f73425k = iVar.mo80151a(mo104015x(), this.f73425k, iVar2.mo104015x(), iVar2.f73425k);
                    this.f73426l = iVar.mo80156a(mo104016y(), this.f73426l, iVar2.mo104016y(), iVar2.f73426l);
                    this.f73427m = iVar.mo80156a(mo103998A(), this.f73427m, iVar2.mo103998A(), iVar2.f73427m);
                    if (iVar == GeneratedMessageLite.C23076h.f56994a) {
                        this.f73419e |= iVar2.f73419e;
                    }
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 10) {
                                    String e = eVar.mo80260e();
                                    this.f73419e = 1 | this.f73419e;
                                    this.f73420f = e;
                                } else if (a == 18) {
                                    String e2 = eVar.mo80260e();
                                    this.f73419e |= 2;
                                    this.f73421g = e2;
                                } else if (a == 26) {
                                    String e3 = eVar.mo80260e();
                                    this.f73419e |= 4;
                                    this.f73422h = e3;
                                } else if (a == 34) {
                                    String e4 = eVar.mo80260e();
                                    this.f73419e |= 8;
                                    this.f73423i = e4;
                                } else if (a == 40) {
                                    int g = eVar.mo80262g();
                                    if (PermissionSettingType.forNumber(g) == null) {
                                        super.mo80118a(5, g);
                                    } else {
                                        this.f73419e |= 16;
                                        this.f73424j = g;
                                    }
                                } else if (a == 48) {
                                    int g2 = eVar.mo80262g();
                                    if (ContainerType.forNumber(g2) == null) {
                                        super.mo80118a(6, g2);
                                    } else {
                                        this.f73419e |= 32;
                                        this.f73425k = g2;
                                    }
                                } else if (a == 58) {
                                    String e5 = eVar.mo80260e();
                                    this.f73419e |= 64;
                                    this.f73426l = e5;
                                } else if (a == 66) {
                                    String e6 = eVar.mo80260e();
                                    this.f73419e |= SmActions.ACTION_ONTHECALL_EXIT;
                                    this.f73427m = e6;
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e7) {
                            throw new RuntimeException(e7.setUnfinishedMessage(this));
                        } catch (IOException e8) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e8.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73418n == null) {
                        synchronized (C29363i.class) {
                            if (f73418n == null) {
                                f73418n = new GeneratedMessageLite.C23069b(f73417d);
                            }
                        }
                    }
                    return f73418n;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73417d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$k */
    public static final class C29366k extends GeneratedMessageLite<C29366k, C29367a> implements AbstractC29368l {

        /* renamed from: d */
        public static final C29366k f73428d;

        /* renamed from: j */
        private static volatile AbstractC23129p<C29366k> f73429j;

        /* renamed from: e */
        private int f73430e;

        /* renamed from: f */
        private int f73431f;

        /* renamed from: g */
        private String f73432g = "";

        /* renamed from: h */
        private C29363i f73433h;

        /* renamed from: i */
        private byte f73434i = -1;

        /* renamed from: q */
        public String mo104028q() {
            return this.f73432g;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$k$a */
        public static final class C29367a extends GeneratedMessageLite.AbstractC23068a<C29366k, C29367a> implements AbstractC29368l {
            private C29367a() {
                super(C29366k.f73428d);
            }

            /* synthetic */ C29367a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29367a mo104030a(EntityType entityType) {
                mo80141b();
                ((C29366k) this.f56983a).mo104025a(entityType);
                return this;
            }

            /* renamed from: a */
            public C29367a mo104031a(C29363i iVar) {
                mo80141b();
                ((C29366k) this.f56983a).mo104026a(iVar);
                return this;
            }

            /* renamed from: a */
            public C29367a mo103952a(String str) {
                mo80141b();
                ((C29366k) this.f56983a).mo103936a(str);
                return this;
            }
        }

        /* renamed from: t */
        public static AbstractC23129p<C29366k> m107926t() {
            return f73428d.mo80122d();
        }

        static {
            C29366k kVar = new C29366k();
            f73428d = kVar;
            kVar.mo80126g();
        }

        private C29366k() {
        }

        /* renamed from: s */
        public static C29367a m107925s() {
            return (C29367a) f73428d.mo80130k();
        }

        /* renamed from: o */
        public boolean mo103940o() {
            if ((this.f73430e & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public boolean mo104027p() {
            if ((this.f73430e & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: r */
        public C29363i mo104029r() {
            C29363i iVar = this.f73433h;
            if (iVar == null) {
                return C29363i.m107890D();
            }
            return iVar;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f73430e & 1) == 1) {
                i2 = 0 + CodedOutputStream.m83541f(1, this.f73431f);
            }
            if ((this.f73430e & 2) == 2) {
                i2 += CodedOutputStream.m83530b(2, mo104028q());
            }
            if ((this.f73430e & 4) == 4) {
                i2 += CodedOutputStream.m83529b(3, mo104029r());
            }
            int e = i2 + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public void mo104025a(EntityType entityType) {
            Objects.requireNonNull(entityType);
            this.f73430e |= 1;
            this.f73431f = entityType.getNumber();
        }

        /* renamed from: a */
        public void mo104026a(C29363i iVar) {
            Objects.requireNonNull(iVar);
            this.f73433h = iVar;
            this.f73430e |= 4;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f73430e & 1) == 1) {
                codedOutputStream.mo80056d(1, this.f73431f);
            }
            if ((this.f73430e & 2) == 2) {
                codedOutputStream.mo80048a(2, mo104028q());
            }
            if ((this.f73430e & 4) == 4) {
                codedOutputStream.mo80047a(3, mo104029r());
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* renamed from: a */
        public void mo103936a(String str) {
            Objects.requireNonNull(str);
            this.f73430e |= 2;
            this.f73432g = str;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C29363i.C29364a aVar;
            boolean z = false;
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29366k();
                case 2:
                    byte b = this.f73434i;
                    if (b == 1) {
                        return f73428d;
                    }
                    if (b == 0) {
                        return null;
                    }
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (!mo103940o()) {
                        if (booleanValue) {
                            this.f73434i = 0;
                        }
                        return null;
                    } else if (!mo104027p()) {
                        if (booleanValue) {
                            this.f73434i = 0;
                        }
                        return null;
                    } else {
                        if (booleanValue) {
                            this.f73434i = 1;
                        }
                        return f73428d;
                    }
                case 3:
                    return null;
                case 4:
                    return new C29367a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29366k kVar = (C29366k) obj2;
                    this.f73431f = iVar.mo80151a(mo103940o(), this.f73431f, kVar.mo103940o(), kVar.f73431f);
                    this.f73432g = iVar.mo80156a(mo104027p(), this.f73432g, kVar.mo104027p(), kVar.f73432g);
                    this.f73433h = (C29363i) iVar.mo80154a(this.f73433h, kVar.f73433h);
                    if (iVar == GeneratedMessageLite.C23076h.f56994a) {
                        this.f73430e |= kVar.f73430e;
                    }
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 8) {
                                    int g = eVar.mo80262g();
                                    if (EntityType.forNumber(g) == null) {
                                        super.mo80118a(1, g);
                                    } else {
                                        this.f73430e |= 1;
                                        this.f73431f = g;
                                    }
                                } else if (a == 18) {
                                    String e = eVar.mo80260e();
                                    this.f73430e |= 2;
                                    this.f73432g = e;
                                } else if (a == 26) {
                                    if ((this.f73430e & 4) == 4) {
                                        aVar = (C29363i.C29364a) this.f73433h.mo80130k();
                                    } else {
                                        aVar = null;
                                    }
                                    C29363i iVar2 = (C29363i) eVar.mo80252a(C29363i.m107891E(), gVar);
                                    this.f73433h = iVar2;
                                    if (aVar != null) {
                                        aVar.mo80139b((GeneratedMessageLite) iVar2);
                                        this.f73433h = (C29363i) aVar.mo80147g();
                                    }
                                    this.f73430e |= 4;
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw new RuntimeException(e2.setUnfinishedMessage(this));
                        } catch (IOException e3) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e3.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73429j == null) {
                        synchronized (C29366k.class) {
                            if (f73429j == null) {
                                f73429j = new GeneratedMessageLite.C23069b(f73428d);
                            }
                        }
                    }
                    return f73429j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73428d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$m */
    public static final class C29369m extends GeneratedMessageLite<C29369m, C29370a> implements AbstractC29371n {

        /* renamed from: d */
        public static final C29369m f73435d;

        /* renamed from: e */
        private static volatile AbstractC23129p<C29369m> f73436e;

        private C29369m() {
        }

        /* renamed from: p */
        public static C29369m m107941p() {
            return f73435d;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$m$a */
        public static final class C29370a extends GeneratedMessageLite.AbstractC23068a<C29369m, C29370a> implements AbstractC29371n {
            private C29370a() {
                super(C29369m.f73435d);
            }

            /* synthetic */ C29370a(C293401 r1) {
                this();
            }
        }

        /* renamed from: q */
        public static AbstractC23129p<C29369m> m107942q() {
            return f73435d.mo80122d();
        }

        static {
            C29369m mVar = new C29369m();
            f73435d = mVar;
            mVar.mo80126g();
        }

        /* renamed from: o */
        public static C29370a m107940o() {
            return (C29370a) f73435d.mo80130k();
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int e = this.f56980b.mo80469e() + 0;
            this.f56981c = e;
            return e;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29369m();
                case 2:
                    return f73435d;
                case 3:
                    return null;
                case 4:
                    return new C29370a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29369m mVar = (C29369m) obj2;
                    GeneratedMessageLite.C23076h hVar = GeneratedMessageLite.C23076h.f56994a;
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a == 0 || !mo80120a(a, eVar)) {
                                z = true;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e.setUnfinishedMessage(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73436e == null) {
                        synchronized (C29369m.class) {
                            if (f73436e == null) {
                                f73436e = new GeneratedMessageLite.C23069b(f73435d);
                            }
                        }
                    }
                    return f73436e;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73435d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$o */
    public static final class C29372o extends GeneratedMessageLite<C29372o, C29373a> implements AbstractC29374p {

        /* renamed from: d */
        public static final C29372o f73437d;

        /* renamed from: j */
        private static volatile AbstractC23129p<C29372o> f73438j;

        /* renamed from: e */
        private int f73439e;

        /* renamed from: f */
        private int f73440f;

        /* renamed from: g */
        private String f73441g = "";

        /* renamed from: h */
        private C29369m f73442h;

        /* renamed from: i */
        private byte f73443i = -1;

        /* renamed from: t */
        public static C29372o m107947t() {
            return f73437d;
        }

        /* renamed from: q */
        public String mo104035q() {
            return this.f73441g;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$o$a */
        public static final class C29373a extends GeneratedMessageLite.AbstractC23068a<C29372o, C29373a> implements AbstractC29374p {
            private C29373a() {
                super(C29372o.f73437d);
            }

            /* synthetic */ C29373a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29373a mo104037a(EntityType entityType) {
                mo80141b();
                ((C29372o) this.f56983a).mo104032a(entityType);
                return this;
            }

            /* renamed from: a */
            public C29373a mo104038a(C29369m mVar) {
                mo80141b();
                ((C29372o) this.f56983a).mo104033a(mVar);
                return this;
            }

            /* renamed from: a */
            public C29373a mo103952a(String str) {
                mo80141b();
                ((C29372o) this.f56983a).mo103936a(str);
                return this;
            }
        }

        /* renamed from: u */
        public static AbstractC23129p<C29372o> m107948u() {
            return f73437d.mo80122d();
        }

        static {
            C29372o oVar = new C29372o();
            f73437d = oVar;
            oVar.mo80126g();
        }

        private C29372o() {
        }

        /* renamed from: s */
        public static C29373a m107946s() {
            return (C29373a) f73437d.mo80130k();
        }

        /* renamed from: o */
        public boolean mo103940o() {
            if ((this.f73439e & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public boolean mo104034p() {
            if ((this.f73439e & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: r */
        public C29369m mo104036r() {
            C29369m mVar = this.f73442h;
            if (mVar == null) {
                return C29369m.m107941p();
            }
            return mVar;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f73439e & 1) == 1) {
                i2 = 0 + CodedOutputStream.m83541f(1, this.f73440f);
            }
            if ((this.f73439e & 2) == 2) {
                i2 += CodedOutputStream.m83530b(2, mo104035q());
            }
            if ((this.f73439e & 4) == 4) {
                i2 += CodedOutputStream.m83529b(3, mo104036r());
            }
            int e = i2 + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public void mo104032a(EntityType entityType) {
            Objects.requireNonNull(entityType);
            this.f73439e |= 1;
            this.f73440f = entityType.getNumber();
        }

        /* renamed from: a */
        public void mo104033a(C29369m mVar) {
            Objects.requireNonNull(mVar);
            this.f73442h = mVar;
            this.f73439e |= 4;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f73439e & 1) == 1) {
                codedOutputStream.mo80056d(1, this.f73440f);
            }
            if ((this.f73439e & 2) == 2) {
                codedOutputStream.mo80048a(2, mo104035q());
            }
            if ((this.f73439e & 4) == 4) {
                codedOutputStream.mo80047a(3, mo104036r());
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* renamed from: a */
        public void mo103936a(String str) {
            Objects.requireNonNull(str);
            this.f73439e |= 2;
            this.f73441g = str;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C29369m.C29370a aVar;
            boolean z = false;
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29372o();
                case 2:
                    byte b = this.f73443i;
                    if (b == 1) {
                        return f73437d;
                    }
                    if (b == 0) {
                        return null;
                    }
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (!mo103940o()) {
                        if (booleanValue) {
                            this.f73443i = 0;
                        }
                        return null;
                    } else if (!mo104034p()) {
                        if (booleanValue) {
                            this.f73443i = 0;
                        }
                        return null;
                    } else {
                        if (booleanValue) {
                            this.f73443i = 1;
                        }
                        return f73437d;
                    }
                case 3:
                    return null;
                case 4:
                    return new C29373a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29372o oVar = (C29372o) obj2;
                    this.f73440f = iVar.mo80151a(mo103940o(), this.f73440f, oVar.mo103940o(), oVar.f73440f);
                    this.f73441g = iVar.mo80156a(mo104034p(), this.f73441g, oVar.mo104034p(), oVar.f73441g);
                    this.f73442h = (C29369m) iVar.mo80154a(this.f73442h, oVar.f73442h);
                    if (iVar == GeneratedMessageLite.C23076h.f56994a) {
                        this.f73439e |= oVar.f73439e;
                    }
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 8) {
                                    int g = eVar.mo80262g();
                                    if (EntityType.forNumber(g) == null) {
                                        super.mo80118a(1, g);
                                    } else {
                                        this.f73439e |= 1;
                                        this.f73440f = g;
                                    }
                                } else if (a == 18) {
                                    String e = eVar.mo80260e();
                                    this.f73439e |= 2;
                                    this.f73441g = e;
                                } else if (a == 26) {
                                    if ((this.f73439e & 4) == 4) {
                                        aVar = (C29369m.C29370a) this.f73442h.mo80130k();
                                    } else {
                                        aVar = null;
                                    }
                                    C29369m mVar = (C29369m) eVar.mo80252a(C29369m.m107942q(), gVar);
                                    this.f73442h = mVar;
                                    if (aVar != null) {
                                        aVar.mo80139b((GeneratedMessageLite) mVar);
                                        this.f73442h = (C29369m) aVar.mo80147g();
                                    }
                                    this.f73439e |= 4;
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw new RuntimeException(e2.setUnfinishedMessage(this));
                        } catch (IOException e3) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e3.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73438j == null) {
                        synchronized (C29372o.class) {
                            if (f73438j == null) {
                                f73438j = new GeneratedMessageLite.C23069b(f73437d);
                            }
                        }
                    }
                    return f73438j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73437d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$q */
    public static final class C29375q extends GeneratedMessageLite<C29375q, C29376a> implements AbstractC29377r {

        /* renamed from: d */
        public static final C29375q f73444d;

        /* renamed from: g */
        private static volatile AbstractC23129p<C29375q> f73445g;

        /* renamed from: e */
        private int f73446e;

        /* renamed from: f */
        private int f73447f;

        private C29375q() {
        }

        /* renamed from: q */
        public static C29375q m107963q() {
            return f73444d;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$q$a */
        public static final class C29376a extends GeneratedMessageLite.AbstractC23068a<C29375q, C29376a> implements AbstractC29377r {
            private C29376a() {
                super(C29375q.f73444d);
            }

            /* synthetic */ C29376a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29376a mo104040a(PermissionActionType permissionActionType) {
                mo80141b();
                ((C29375q) this.f56983a).mo104039a(permissionActionType);
                return this;
            }
        }

        /* renamed from: r */
        public static AbstractC23129p<C29375q> m107964r() {
            return f73444d.mo80122d();
        }

        static {
            C29375q qVar = new C29375q();
            f73444d = qVar;
            qVar.mo80126g();
        }

        /* renamed from: p */
        public static C29376a m107962p() {
            return (C29376a) f73444d.mo80130k();
        }

        /* renamed from: o */
        public boolean mo103940o() {
            if ((this.f73446e & 1) == 1) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f73446e & 1) == 1) {
                i2 = 0 + CodedOutputStream.m83541f(1, this.f73447f);
            }
            int e = i2 + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public void mo104039a(PermissionActionType permissionActionType) {
            Objects.requireNonNull(permissionActionType);
            this.f73446e |= 1;
            this.f73447f = permissionActionType.getNumber();
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f73446e & 1) == 1) {
                codedOutputStream.mo80056d(1, this.f73447f);
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29375q();
                case 2:
                    return f73444d;
                case 3:
                    return null;
                case 4:
                    return new C29376a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29375q qVar = (C29375q) obj2;
                    this.f73447f = iVar.mo80151a(mo103940o(), this.f73447f, qVar.mo103940o(), qVar.f73447f);
                    if (iVar == GeneratedMessageLite.C23076h.f56994a) {
                        this.f73446e |= qVar.f73446e;
                    }
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 8) {
                                    int g = eVar.mo80262g();
                                    if (PermissionActionType.forNumber(g) == null) {
                                        super.mo80118a(1, g);
                                    } else {
                                        this.f73446e = 1 | this.f73446e;
                                        this.f73447f = g;
                                    }
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e.setUnfinishedMessage(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73445g == null) {
                        synchronized (C29375q.class) {
                            if (f73445g == null) {
                                f73445g = new GeneratedMessageLite.C23069b(f73444d);
                            }
                        }
                    }
                    return f73445g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73444d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$s */
    public static final class C29378s extends GeneratedMessageLite<C29378s, C29379a> implements AbstractC29380t {

        /* renamed from: d */
        public static final C29378s f73448d;

        /* renamed from: j */
        private static volatile AbstractC23129p<C29378s> f73449j;

        /* renamed from: e */
        private int f73450e;

        /* renamed from: f */
        private int f73451f;

        /* renamed from: g */
        private String f73452g = "";

        /* renamed from: h */
        private C29375q f73453h;

        /* renamed from: i */
        private byte f73454i = -1;

        /* renamed from: q */
        public String mo104044q() {
            return this.f73452g;
        }

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$s$a */
        public static final class C29379a extends GeneratedMessageLite.AbstractC23068a<C29378s, C29379a> implements AbstractC29380t {
            private C29379a() {
                super(C29378s.f73448d);
            }

            /* synthetic */ C29379a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29379a mo104046a(EntityType entityType) {
                mo80141b();
                ((C29378s) this.f56983a).mo104041a(entityType);
                return this;
            }

            /* renamed from: a */
            public C29379a mo104047a(C29375q qVar) {
                mo80141b();
                ((C29378s) this.f56983a).mo104042a(qVar);
                return this;
            }

            /* renamed from: a */
            public C29379a mo103952a(String str) {
                mo80141b();
                ((C29378s) this.f56983a).mo103936a(str);
                return this;
            }
        }

        /* renamed from: t */
        public static AbstractC23129p<C29378s> m107972t() {
            return f73448d.mo80122d();
        }

        static {
            C29378s sVar = new C29378s();
            f73448d = sVar;
            sVar.mo80126g();
        }

        private C29378s() {
        }

        /* renamed from: s */
        public static C29379a m107971s() {
            return (C29379a) f73448d.mo80130k();
        }

        /* renamed from: o */
        public boolean mo103940o() {
            if ((this.f73450e & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public boolean mo104043p() {
            if ((this.f73450e & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: r */
        public C29375q mo104045r() {
            C29375q qVar = this.f73453h;
            if (qVar == null) {
                return C29375q.m107963q();
            }
            return qVar;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f73450e & 1) == 1) {
                i2 = 0 + CodedOutputStream.m83541f(1, this.f73451f);
            }
            if ((this.f73450e & 2) == 2) {
                i2 += CodedOutputStream.m83530b(2, mo104044q());
            }
            if ((this.f73450e & 4) == 4) {
                i2 += CodedOutputStream.m83529b(3, mo104045r());
            }
            int e = i2 + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public void mo104041a(EntityType entityType) {
            Objects.requireNonNull(entityType);
            this.f73450e |= 1;
            this.f73451f = entityType.getNumber();
        }

        /* renamed from: a */
        public void mo104042a(C29375q qVar) {
            Objects.requireNonNull(qVar);
            this.f73453h = qVar;
            this.f73450e |= 4;
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f73450e & 1) == 1) {
                codedOutputStream.mo80056d(1, this.f73451f);
            }
            if ((this.f73450e & 2) == 2) {
                codedOutputStream.mo80048a(2, mo104044q());
            }
            if ((this.f73450e & 4) == 4) {
                codedOutputStream.mo80047a(3, mo104045r());
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* renamed from: a */
        public void mo103936a(String str) {
            Objects.requireNonNull(str);
            this.f73450e |= 2;
            this.f73452g = str;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C29375q.C29376a aVar;
            boolean z = false;
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29378s();
                case 2:
                    byte b = this.f73454i;
                    if (b == 1) {
                        return f73448d;
                    }
                    if (b == 0) {
                        return null;
                    }
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (!mo103940o()) {
                        if (booleanValue) {
                            this.f73454i = 0;
                        }
                        return null;
                    } else if (!mo104043p()) {
                        if (booleanValue) {
                            this.f73454i = 0;
                        }
                        return null;
                    } else {
                        if (booleanValue) {
                            this.f73454i = 1;
                        }
                        return f73448d;
                    }
                case 3:
                    return null;
                case 4:
                    return new C29379a(null);
                case 5:
                    GeneratedMessageLite.AbstractC23077i iVar = (GeneratedMessageLite.AbstractC23077i) obj;
                    C29378s sVar = (C29378s) obj2;
                    this.f73451f = iVar.mo80151a(mo103940o(), this.f73451f, sVar.mo103940o(), sVar.f73451f);
                    this.f73452g = iVar.mo80156a(mo104043p(), this.f73452g, sVar.mo104043p(), sVar.f73452g);
                    this.f73453h = (C29375q) iVar.mo80154a(this.f73453h, sVar.f73453h);
                    if (iVar == GeneratedMessageLite.C23076h.f56994a) {
                        this.f73450e |= sVar.f73450e;
                    }
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 8) {
                                    int g = eVar.mo80262g();
                                    if (EntityType.forNumber(g) == null) {
                                        super.mo80118a(1, g);
                                    } else {
                                        this.f73450e |= 1;
                                        this.f73451f = g;
                                    }
                                } else if (a == 18) {
                                    String e = eVar.mo80260e();
                                    this.f73450e |= 2;
                                    this.f73452g = e;
                                } else if (a == 26) {
                                    if ((this.f73450e & 4) == 4) {
                                        aVar = (C29375q.C29376a) this.f73453h.mo80130k();
                                    } else {
                                        aVar = null;
                                    }
                                    C29375q qVar = (C29375q) eVar.mo80252a(C29375q.m107964r(), gVar);
                                    this.f73453h = qVar;
                                    if (aVar != null) {
                                        aVar.mo80139b((GeneratedMessageLite) qVar);
                                        this.f73453h = (C29375q) aVar.mo80147g();
                                    }
                                    this.f73450e |= 4;
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw new RuntimeException(e2.setUnfinishedMessage(this));
                        } catch (IOException e3) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e3.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73449j == null) {
                        synchronized (C29378s.class) {
                            if (f73449j == null) {
                                f73449j = new GeneratedMessageLite.C23069b(f73448d);
                            }
                        }
                    }
                    return f73449j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73448d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$e */
    public static final class C29357e extends GeneratedMessageLite<C29357e, C29358a> implements AbstractC29359f {

        /* renamed from: d */
        public static final C29357e f73406d;

        /* renamed from: g */
        private static volatile AbstractC23129p<C29357e> f73407g;

        /* renamed from: e */
        private C23115i.AbstractC23118c<C29354c> f73408e = m83630j();

        /* renamed from: f */
        private byte f73409f = -1;

        /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$e$a */
        public static final class C29358a extends GeneratedMessageLite.AbstractC23068a<C29357e, C29358a> implements AbstractC29359f {
            private C29358a() {
                super(C29357e.f73406d);
            }

            /* synthetic */ C29358a(C293401 r1) {
                this();
            }

            /* renamed from: a */
            public C29358a mo103982a(Iterable<? extends C29354c> iterable) {
                mo80141b();
                ((C29357e) this.f56983a).mo103986a(iterable);
                return this;
            }
        }

        /* renamed from: o */
        public int mo103940o() {
            return this.f73408e.size();
        }

        static {
            C29357e eVar = new C29357e();
            f73406d = eVar;
            eVar.mo80126g();
        }

        private C29357e() {
        }

        /* renamed from: p */
        public static C29358a m107862p() {
            return (C29358a) f73406d.mo80130k();
        }

        /* renamed from: q */
        private void m107863q() {
            if (!this.f73408e.mo80236a()) {
                this.f73408e = GeneratedMessageLite.m83627a(this.f73408e);
            }
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: n */
        public int mo80296n() {
            int i = this.f56981c;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f73408e.size(); i3++) {
                i2 += CodedOutputStream.m83529b(1, this.f73408e.get(i3));
            }
            int e = i2 + this.f56980b.mo80469e();
            this.f56981c = e;
            return e;
        }

        /* renamed from: a */
        public C29354c mo103985a(int i) {
            return this.f73408e.get(i);
        }

        @Override // com.google.protobuf.AbstractC23125m
        /* renamed from: a */
        public void mo80295a(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f73408e.size(); i++) {
                codedOutputStream.mo80047a(1, this.f73408e.get(i));
            }
            this.f56980b.mo80464a(codedOutputStream);
        }

        /* renamed from: a */
        public void mo103986a(Iterable<? extends C29354c> iterable) {
            m107863q();
            AbstractC23103a.m83739a(iterable, this.f73408e);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v23, resolved type: com.google.protobuf.i$c<com.ss.android.lark.audit.security_event.SecurityEvent$c> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        /* renamed from: a */
        public final Object mo80117a(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C293401.f73383a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C29357e();
                case 2:
                    byte b = this.f73409f;
                    if (b == 1) {
                        return f73406d;
                    }
                    if (b == 0) {
                        return null;
                    }
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    for (int i = 0; i < mo103940o(); i++) {
                        if (!mo103985a(i).mo80127h()) {
                            if (booleanValue) {
                                this.f73409f = 0;
                            }
                            return null;
                        }
                    }
                    if (booleanValue) {
                        this.f73409f = 1;
                    }
                    return f73406d;
                case 3:
                    this.f73408e.mo80241b();
                    return null;
                case 4:
                    return new C29358a(null);
                case 5:
                    this.f73408e = ((GeneratedMessageLite.AbstractC23077i) obj).mo80153a(this.f73408e, ((C29357e) obj2).f73408e);
                    GeneratedMessageLite.C23076h hVar = GeneratedMessageLite.C23076h.f56994a;
                    return this;
                case 6:
                    C23108e eVar = (C23108e) obj;
                    C23111g gVar = (C23111g) obj2;
                    while (!z) {
                        try {
                            int a = eVar.mo80251a();
                            if (a != 0) {
                                if (a == 10) {
                                    if (!this.f73408e.mo80236a()) {
                                        this.f73408e = GeneratedMessageLite.m83627a(this.f73408e);
                                    }
                                    this.f73408e.add(eVar.mo80252a(C29354c.m107824B(), gVar));
                                } else if (!mo80120a(a, eVar)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e.setUnfinishedMessage(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f73407g == null) {
                        synchronized (C29357e.class) {
                            if (f73407g == null) {
                                f73407g = new GeneratedMessageLite.C23069b(f73406d);
                            }
                        }
                    }
                    return f73407g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f73406d;
        }
    }

    /* renamed from: com.ss.android.lark.audit.security_event.SecurityEvent$1 */
    static /* synthetic */ class C293401 {

        /* renamed from: a */
        static final /* synthetic */ int[] f73383a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.audit.security_event.SecurityEvent.C293401.f73383a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.audit.security_event.SecurityEvent.C293401.f73383a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.audit.security_event.SecurityEvent.C293401.f73383a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.audit.security_event.SecurityEvent.C293401.f73383a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.audit.security_event.SecurityEvent.C293401.f73383a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.audit.security_event.SecurityEvent.C293401.f73383a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.audit.security_event.SecurityEvent.C293401.f73383a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.audit.security_event.SecurityEvent.C293401.f73383a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.audit.security_event.SecurityEvent.C293401.<clinit>():void");
        }
    }
}
