package com.ss.android.vc.meeting.module.joinmeetingauth;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.ShareItemType;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserService;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u0003567B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010 \u001a\u00020\u001eJ\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0016J\u001e\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010*J.\u0010+\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0006\u0010-\u001a\u00020\u001eJ\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0016J\u0010\u0010/\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010J<\u00100\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010&\u001a\u00020\u00162\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*2\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fJ\"\u00104\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u0001022\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "chattersCache", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "getChattersCache", "()Ljava/util/Map;", "setChattersCache", "(Ljava/util/Map;)V", "iSecuritySettingChangeListeners", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$ISecuritySettingChange;", "getISecuritySettingChangeListeners", "()Ljava/util/ArrayList;", "setISecuritySettingChangeListeners", "(Ljava/util/ArrayList;)V", "securitySettingForToast", "Lcom/ss/android/vc/entity/MeetingSecuritySetting;", "getSecuritySettingForToast", "()Lcom/ss/android/vc/entity/MeetingSecuritySetting;", "setSecuritySettingForToast", "(Lcom/ss/android/vc/entity/MeetingSecuritySetting;)V", "suiteQuotaEntity", "Lcom/ss/android/vc/entity/response/GetSuiteQuotaEntity;", "addSecuritySettingChangeListener", "", "listener", "clearCache", "getChatters", "setting", "iGetContactAndGroupInfo", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$IGetContactAndGroupInfo;", "getDisplayNameForContactGroup", "securitySetting", "getSuiteQuotaEntity", "meetingId", "callback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "getVideoChatShareItem", "roomResult", "onEnableLobbyChanged", "onSecuritySettingChanged", "removeSecuritySettingChangeListener", "requestChangeAuth", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "selectedItems", "requestLobbySettingChange", "Companion", "IGetContactAndGroupInfo", "ISecuritySettingChange", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.g.e */
public final class SecuritySettingManager {

    /* renamed from: b */
    public static final Companion f155357b = new Companion(null);

    /* renamed from: a */
    public C60987v f155358a;

    /* renamed from: c */
    private final String f155359c = "SecuritySettingManager";

    /* renamed from: d */
    private ArrayList<ISecuritySettingChange> f155360d = new ArrayList<>();

    /* renamed from: e */
    private Map<String, VideoChatShareItem> f155361e = new LinkedHashMap();

    /* renamed from: f */
    private MeetingSecuritySetting f155362f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$IGetContactAndGroupInfo;", "", "onGetContactAndGroupInfo", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$b */
    public interface IGetContactAndGroupInfo {
        void onGetContactAndGroupInfo(Map<String, VideoChatShareItem> map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$ISecuritySettingChange;", "", "onEnableLobbyChanged", "", "onSecuritySettingChanged", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$c */
    public interface ISecuritySettingChange {
        /* renamed from: a */
        void mo214273a();

        /* renamed from: b */
        void mo214274b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$Companion;", "", "()V", "getAuthHint", "", "securityLevel", "Lcom/ss/android/vc/entity/MeetingSecuritySetting$SecurityLevel;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo214271a(MeetingSecuritySetting.SecurityLevel securityLevel) {
            Intrinsics.checkParameterIsNotNull(securityLevel, "securityLevel");
            int i = C61888f.f155377a[securityLevel.ordinal()];
            if (i == 1) {
                String string = UIHelper.getString(R.string.View_M_PermissionsSetAnyone);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…w_M_PermissionsSetAnyone)");
                return string;
            } else if (i == 2) {
                String string2 = UIHelper.getString(R.string.View_M_PermissionsSetSelected);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…M_PermissionsSetSelected)");
                return string2;
            } else if (i == 3) {
                String string3 = UIHelper.getString(R.string.View_M_PermissionsSetOrganizerCompany);
                Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(R.str…sionsSetOrganizerCompany)");
                return string3;
            } else if (i != 4) {
                return "";
            } else {
                String string4 = UIHelper.getString(R.string.View_M_PermissionsSetHostInvited);
                Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(R.str…ermissionsSetHostInvited)");
                return string4;
            }
        }
    }

    /* renamed from: a */
    public final ArrayList<ISecuritySettingChange> mo214258a() {
        return this.f155360d;
    }

    /* renamed from: b */
    public final Map<String, VideoChatShareItem> mo214267b() {
        return this.f155361e;
    }

    /* renamed from: d */
    public final void mo214270d() {
        this.f155361e.clear();
        this.f155360d.clear();
    }

    /* renamed from: c */
    public final void mo214269c() {
        Iterator<T> it = this.f155360d.iterator();
        while (it.hasNext()) {
            it.next().mo214274b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$getSuiteQuotaEntity$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetSuiteQuotaEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$e */
    public static final class C61880e implements AbstractC63598b<C60987v> {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingManager f155367a;

        /* renamed from: b */
        final /* synthetic */ AbstractC63598b f155368b;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            AbstractC63598b bVar = this.f155368b;
            if (bVar != null) {
                bVar.onError(eVar);
            }
        }

        /* renamed from: a */
        public void onSuccess(C60987v vVar) {
            this.f155367a.f155358a = vVar;
            AbstractC63598b bVar = this.f155368b;
            if (bVar != null) {
                bVar.onSuccess(vVar);
            }
        }

        C61880e(SecuritySettingManager eVar, AbstractC63598b bVar) {
            this.f155367a = eVar;
            this.f155368b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u000028\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J<\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$getVideoChatShareItem$3", "Lio/reactivex/functions/BiFunction;", "", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "apply", "t1", "t2", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$h */
    public static final class C61883h implements BiFunction<Map<String, ? extends VideoChatShareItem>, Map<String, ? extends VideoChatShareItem>, Map<String, ? extends VideoChatShareItem>> {

        /* renamed from: a */
        final /* synthetic */ Map f155371a;

        C61883h(Map map) {
            this.f155371a = map;
        }

        /* renamed from: a */
        public Map<String, VideoChatShareItem> apply(Map<String, VideoChatShareItem> map, Map<String, VideoChatShareItem> map2) {
            Intrinsics.checkParameterIsNotNull(map, "t1");
            Intrinsics.checkParameterIsNotNull(map2, "t2");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            Map map3 = this.f155371a;
            if (map3 != null) {
                linkedHashMap.putAll(map3);
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$onSecuritySettingChanged$1", "Lcom/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$IGetContactAndGroupInfo;", "onGetContactAndGroupInfo", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$j */
    public static final class C61885j implements IGetContactAndGroupInfo {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingManager f155374a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61885j(SecuritySettingManager eVar) {
            this.f155374a = eVar;
        }

        @Override // com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager.IGetContactAndGroupInfo
        public void onGetContactAndGroupInfo(Map<String, VideoChatShareItem> map) {
            Iterator<T> it = this.f155374a.mo214258a().iterator();
            while (it.hasNext()) {
                it.next().mo214273a();
            }
        }
    }

    /* renamed from: a */
    public final void mo214264a(ISecuritySettingChange cVar) {
        if (cVar != null) {
            this.f155360d.add(cVar);
        }
    }

    /* renamed from: b */
    public final void mo214268b(ISecuritySettingChange cVar) {
        if (cVar != null) {
            this.f155360d.remove(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$getChatters$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "", "Lcom/ss/android/vc/entity/Room;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$d */
    public static final class C61879d extends UIGetDataCallback<Map<String, ? extends Room>> {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingManager f155363a;

        /* renamed from: b */
        final /* synthetic */ Map f155364b;

        /* renamed from: c */
        final /* synthetic */ MeetingSecuritySetting f155365c;

        /* renamed from: d */
        final /* synthetic */ IGetContactAndGroupInfo f155366d;

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            super.onErrored(errorResult);
            this.f155363a.mo214261a(this.f155365c, this.f155366d, this.f155364b);
        }

        /* renamed from: a */
        public void onSuccessed(Map<String, ? extends Room> map) {
            super.onSuccessed(map);
            if (map != null) {
                for (Iterator<Map.Entry<String, ? extends Room>> it = map.entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry<String, ? extends Room> next = it.next();
                    Map map2 = this.f155364b;
                    String key = next.getKey();
                    String str = ((Room) next.getValue()).primaryNameParticipant;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.value.primaryNameParticipant");
                    String str2 = ((Room) next.getValue()).avatarKey;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.value.avatarKey");
                    map2.put(key, new VideoChatShareItem(next.getKey(), str, str2, "", ShareItemType.ROOM, false, null, null, false, false, false, 0, null, null, null, false, null, 130048, null));
                }
            }
            this.f155363a.mo214261a(this.f155365c, this.f155366d, this.f155364b);
        }

        C61879d(SecuritySettingManager eVar, Map map, MeetingSecuritySetting meetingSecuritySetting, IGetContactAndGroupInfo bVar) {
            this.f155363a = eVar;
            this.f155364b = map;
            this.f155365c = meetingSecuritySetting;
            this.f155366d = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$requestChangeAuth$1", "Lcom/ss/android/vc/net/request/VcBizSender$VcLogCallback;", "onSuccess", "", "s", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$k */
    public static final class C61886k extends VcBizSender.C63594a {

        /* renamed from: a */
        final /* synthetic */ AbstractC63598b f155375a;

        @Override // com.ss.android.vc.net.request.VcBizSender.C63594a
        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "s");
            super.onSuccess(str);
            AbstractC63598b bVar = this.f155375a;
            if (bVar != null) {
                bVar.onSuccess(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61886k(AbstractC63598b bVar, String str) {
            super(str);
            this.f155375a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/joinmeetingauth/SecuritySettingManager$requestLobbySettingChange$1", "Lcom/ss/android/vc/net/request/VcBizSender$VcLogCallback;", "onSuccess", "", "s", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$l */
    public static final class C61887l extends VcBizSender.C63594a {

        /* renamed from: a */
        final /* synthetic */ AbstractC63598b f155376a;

        @Override // com.ss.android.vc.net.request.VcBizSender.C63594a
        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "s");
            super.onSuccess(str);
            AbstractC63598b bVar = this.f155376a;
            if (bVar != null) {
                bVar.onSuccess(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61887l(AbstractC63598b bVar, String str) {
            super(str);
            this.f155376a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$i */
    public static final class C61884i<T> implements Consumer<Map<String, ? extends VideoChatShareItem>> {

        /* renamed from: a */
        final /* synthetic */ SecuritySettingManager f155372a;

        /* renamed from: b */
        final /* synthetic */ IGetContactAndGroupInfo f155373b;

        C61884i(SecuritySettingManager eVar, IGetContactAndGroupInfo bVar) {
            this.f155372a = eVar;
            this.f155373b = bVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, VideoChatShareItem> map) {
            this.f155372a.mo214267b().clear();
            Map<String, VideoChatShareItem> b = this.f155372a.mo214267b();
            Intrinsics.checkExpressionValueIsNotNull(map, "it");
            b.putAll(map);
            IGetContactAndGroupInfo bVar = this.f155373b;
            if (bVar != null) {
                bVar.onGetContactAndGroupInfo(this.f155372a.mo214267b());
            }
        }
    }

    /* renamed from: a */
    public final void mo214259a(MeetingSecuritySetting meetingSecuritySetting) {
        MeetingSecuritySetting.SecurityLevel securityLevel;
        Intrinsics.checkParameterIsNotNull(meetingSecuritySetting, "securitySetting");
        MeetingSecuritySetting meetingSecuritySetting2 = this.f155362f;
        if (meetingSecuritySetting2 != null) {
            securityLevel = meetingSecuritySetting2.getSecurityLevel();
        } else {
            securityLevel = null;
        }
        if (securityLevel != meetingSecuritySetting.getSecurityLevel()) {
            this.f155362f = meetingSecuritySetting;
            Companion aVar = f155357b;
            MeetingSecuritySetting.SecurityLevel securityLevel2 = meetingSecuritySetting.getSecurityLevel();
            Intrinsics.checkExpressionValueIsNotNull(securityLevel2, "securitySetting.securityLevel");
            C60738ac.m236039c(aVar.mo214271a(securityLevel2));
        }
        if (meetingSecuritySetting.getSecurityLevel() == MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP) {
            mo214260a(meetingSecuritySetting, new C61885j(this));
            return;
        }
        Iterator<T> it = this.f155360d.iterator();
        while (it.hasNext()) {
            it.next().mo214273a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002 \u0006*\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "it", "", "kotlin.jvm.PlatformType", "", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$f */
    public static final class C61881f<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C61881f f155369a = new C61881f();

        C61881f() {
        }

        /* renamed from: a */
        public final Map<String, VideoChatShareItem> apply(List<String> list) {
            long j;
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkParameterIsNotNull(list, "it");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC60892h chatDependency = VideoChatModuleDependency.getChatDependency();
            ArrayList arrayList = new ArrayList(list);
            VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
            Intrinsics.checkExpressionValueIsNotNull(currentUser, "VideoChatUserService.getCurrentUser()");
            arrayList.add(currentUser.getId());
            Map<String, Chatter> syncGetChattersByIds = chatDependency.syncGetChattersByIds(arrayList);
            if (syncGetChattersByIds != null) {
                VideoChatUser currentUser2 = VideoChatUserService.getCurrentUser();
                Intrinsics.checkExpressionValueIsNotNull(currentUser2, "VideoChatUserService.getCurrentUser()");
                Chatter chatter = syncGetChattersByIds.get(currentUser2.getId());
                for (Map.Entry<String, Chatter> entry : syncGetChattersByIds.entrySet()) {
                    boolean z4 = false;
                    if (chatter != null) {
                        if (chatter.isCustomer() || !(!Intrinsics.areEqual(chatter.getTenantId(), entry.getValue().getTenantId()))) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (chatter.getWorkStatus() == WorkStatus.Status.ON_LEAVE) {
                            z4 = true;
                        }
                        z2 = z3;
                        z = z4;
                        j = chatter.getZenModeEndTime();
                    } else {
                        j = 0;
                        z2 = false;
                        z = false;
                    }
                    String key = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                    String key2 = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key2, "it.key");
                    String name = entry.getValue().getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "it.value.getName()");
                    String avatarKey = entry.getValue().getAvatarKey();
                    Intrinsics.checkExpressionValueIsNotNull(avatarKey, "it.value.getAvatarKey()");
                    linkedHashMap.put(key, new VideoChatShareItem(key2, name, avatarKey, "", ShareItemType.USER, false, null, null, z2, z, false, j, null, null, null, false, null, 128000, null));
                }
            }
            return linkedHashMap;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002 \u0006*\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "it", "", "kotlin.jvm.PlatformType", "", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.g.e$g */
    public static final class C61882g<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C61882g f155370a = new C61882g();

        C61882g() {
        }

        /* renamed from: a */
        public final Map<String, VideoChatShareItem> apply(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, OpenChat> syncGetChatsByIds = VideoChatModuleDependency.getChatDependency().syncGetChatsByIds(list);
            if (syncGetChatsByIds != null) {
                for (Map.Entry<String, OpenChat> entry : syncGetChatsByIds.entrySet()) {
                    String key = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                    String key2 = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key2, "it.key");
                    linkedHashMap.put(key, new VideoChatShareItem(key2, entry.getValue().getName(), entry.getValue().getAvatarKey(), "", ShareItemType.GROUP, entry.getValue().isSecret(), null, null, entry.getValue().isCrossTenant(), false, false, 0, null, null, null, false, null, 130048, null));
                }
            }
            return linkedHashMap;
        }
    }

    /* renamed from: b */
    public final String mo214266b(MeetingSecuritySetting meetingSecuritySetting) {
        Intrinsics.checkParameterIsNotNull(meetingSecuritySetting, "securitySetting");
        Map<String, VideoChatShareItem> map = this.f155361e;
        ArrayList arrayList = new ArrayList();
        List<MeetingSecuritySetting.SpecialGroupType> specialGroupTypes = meetingSecuritySetting.getSpecialGroupTypes();
        if (specialGroupTypes != null) {
            for (T t : specialGroupTypes) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                if (t.getNumber() == MeetingSecuritySetting.SpecialGroupType.CALENDAR_GUEST_LIST.getNumber()) {
                    arrayList.add(UIHelper.getString(R.string.View_G_EventGuests));
                }
            }
        }
        List<String> groupIds = meetingSecuritySetting.getGroupIds();
        if (groupIds != null) {
            Iterator<T> it = groupIds.iterator();
            while (it.hasNext()) {
                VideoChatShareItem videoChatShareItem = map.get(it.next());
                if (videoChatShareItem != null) {
                    arrayList.add(videoChatShareItem.getName());
                }
            }
        }
        List<String> userIds = meetingSecuritySetting.getUserIds();
        if (userIds != null) {
            Iterator<T> it2 = userIds.iterator();
            while (it2.hasNext()) {
                VideoChatShareItem videoChatShareItem2 = map.get(it2.next());
                if (videoChatShareItem2 != null) {
                    arrayList.add(videoChatShareItem2.getName());
                }
            }
        }
        List<String> roomIds = meetingSecuritySetting.getRoomIds();
        if (roomIds != null) {
            Iterator<T> it3 = roomIds.iterator();
            while (it3.hasNext()) {
                VideoChatShareItem videoChatShareItem3 = map.get(it3.next());
                if (videoChatShareItem3 != null) {
                    arrayList.add(videoChatShareItem3.getName());
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            return "";
        }
        String join = TextUtils.join("、", arrayList);
        Intrinsics.checkExpressionValueIsNotNull(join, "TextUtils.join(\"、\", strings)");
        return join;
    }

    /* renamed from: a */
    public final void mo214263a(C61303k kVar, AbstractC63598b<String> bVar) {
        String str;
        VideoChat e;
        VideoChatSettings videoChatSettings;
        MeetingSecuritySetting meetingSecuritySetting = null;
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = null;
        }
        HostManageRequest.Action action = HostManageRequest.Action.SET_SECURITY_LEVEL;
        if (!(kVar == null || (e = kVar.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null)) {
            meetingSecuritySetting = videoChatSettings.getSecuritySetting();
        }
        VcBizService.sendManageRequest(str, action, meetingSecuritySetting, new C61887l(bVar, "hostManage"));
    }

    /* renamed from: a */
    public final void mo214260a(MeetingSecuritySetting meetingSecuritySetting, IGetContactAndGroupInfo bVar) {
        Intrinsics.checkParameterIsNotNull(meetingSecuritySetting, "setting");
        if (meetingSecuritySetting.getSecurityLevel() == MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP) {
            ArrayList arrayList = new ArrayList();
            if (meetingSecuritySetting.getGroupIds() != null) {
                arrayList.addAll(meetingSecuritySetting.getGroupIds());
            }
            if (meetingSecuritySetting.getUserIds() != null) {
                arrayList.addAll(meetingSecuritySetting.getUserIds());
            }
            if (meetingSecuritySetting.getRoomIds() != null) {
                arrayList.addAll(meetingSecuritySetting.getRoomIds());
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                if (!this.f155361e.keySet().containsAll(arrayList2)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (meetingSecuritySetting.getRoomIds() == null || meetingSecuritySetting.getRoomIds().size() <= 0) {
                        mo214261a(meetingSecuritySetting, bVar, linkedHashMap);
                    } else {
                        VcBizService.getRoomById(meetingSecuritySetting.getRoomIds(), new C61879d(this, linkedHashMap, meetingSecuritySetting, bVar));
                    }
                } else if (bVar != null) {
                    bVar.onGetContactAndGroupInfo(this.f155361e);
                }
            } else if (bVar != null) {
                bVar.onGetContactAndGroupInfo(null);
            }
        }
    }

    /* renamed from: a */
    public final void mo214265a(String str, AbstractC63598b<C60987v> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        C60987v vVar = this.f155358a;
        if (vVar == null) {
            VcBizSender.m249303n(str).mo219889a(new C61880e(this, bVar));
        } else if (bVar != null) {
            bVar.onSuccess(vVar);
        }
    }

    /* renamed from: a */
    public final void mo214261a(MeetingSecuritySetting meetingSecuritySetting, IGetContactAndGroupInfo bVar, Map<String, VideoChatShareItem> map) {
        Observable.zip(Observable.just(meetingSecuritySetting.getUserIds()).map(C61881f.f155369a), Observable.just(meetingSecuritySetting.getGroupIds()).map(C61882g.f155370a), new C61883h(map)).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new C61884i(this, bVar));
    }

    /* renamed from: a */
    public final void mo214262a(C61303k kVar, MeetingSecuritySetting meetingSecuritySetting, AbstractC63598b<String> bVar, ArrayList<VideoChatShareItem> arrayList) {
        boolean z;
        String str;
        VideoChat e;
        VideoChatSettings videoChatSettings;
        MeetingSecuritySetting securitySetting;
        Intrinsics.checkParameterIsNotNull(meetingSecuritySetting, "securitySetting");
        this.f155362f = meetingSecuritySetting;
        Companion aVar = f155357b;
        MeetingSecuritySetting.SecurityLevel securityLevel = meetingSecuritySetting.getSecurityLevel();
        Intrinsics.checkExpressionValueIsNotNull(securityLevel, "securitySetting.securityLevel");
        C60738ac.m236039c(aVar.mo214271a(securityLevel));
        if (kVar == null || (e = kVar.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null || (securitySetting = videoChatSettings.getSecuritySetting()) == null) {
            z = true;
        } else {
            z = securitySetting.isEnableLobby();
        }
        meetingSecuritySetting.setEnableLobby(z);
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = null;
        }
        VcBizService.sendManageRequest(str, HostManageRequest.Action.SET_SECURITY_LEVEL, meetingSecuritySetting, new C61886k(bVar, "hostManage"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.vc.meeting.module.g.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m241708a(SecuritySettingManager eVar, C61303k kVar, MeetingSecuritySetting meetingSecuritySetting, AbstractC63598b bVar, ArrayList arrayList, int i, Object obj) {
        if ((i & 4) != 0) {
            bVar = null;
        }
        if ((i & 8) != 0) {
            arrayList = null;
        }
        eVar.mo214262a(kVar, meetingSecuritySetting, bVar, arrayList);
    }
}
