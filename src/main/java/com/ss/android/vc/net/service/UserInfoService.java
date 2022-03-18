package com.ss.android.vc.net.service;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteViewUserInfo;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.entity.response.C60988w;
import com.ss.android.vc.entity.response.av;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class UserInfoService {
    private static int MAX_REQUEST_SIZE = 50;
    private static AtomicBoolean isInited = new AtomicBoolean(false);
    private static IMeetingsSizeChangeListener meetingsSizeChangeListener = new IMeetingsSizeChangeListener() {
        /* class com.ss.android.vc.net.service.UserInfoService.C636051 */

        @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
        /* renamed from: a */
        public /* synthetic */ void mo208172a(List list) {
            IMeetingsSizeChangeListener.CC.$default$a(this, list);
        }

        @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
        public void onMeetingsBegin(boolean z) {
        }

        @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
        public void onMeetingsEnd() {
            UserInfoService.clearUserMap();
        }
    };
    private static Map<String, VideoChatUser> neoVideoChatUserMap = new ConcurrentHashMap();
    public static Map<String, VideoChatUser> newTypeUserMap = new ConcurrentHashMap();
    private static Map<String, VideoChatUser> roomUserMap = new ConcurrentHashMap();
    public static Map<String, av> tabTenantMap = new ConcurrentHashMap();
    private static Map<String, VideoChatUser> unknownTypedUserMap = new ConcurrentHashMap();
    private static Map<String, VideoChatUser> videoChatUserMap = new ConcurrentHashMap();

    public static void clearUserMap() {
        roomUserMap.clear();
        videoChatUserMap.clear();
        neoVideoChatUserMap.clear();
        unknownTypedUserMap.clear();
        newTypeUserMap.clear();
        tabTenantMap.clear();
    }

    public static void init() {
        if (isInited.compareAndSet(false, true)) {
            MeetingManager.m238341a().addMeetingsSizeChangeListener(meetingsSizeChangeListener);
        }
    }

    public static void getChattersByIds(final List<String> list) {
        if (list != null && list.size() != 0) {
            VideoChatModuleDependency.getChatDependency().getChattersByIds(list, new XIGetDataCallback<Map<String, OpenChatter>>() {
                /* class com.ss.android.vc.net.service.UserInfoService.C636084 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                @XMethod
                public void onError(ErrorResult errorResult) {
                    C60700b.m235864f("UserInfoService", "[getChattersByIds]", "error = " + errorResult.toString());
                    for (String str : list) {
                        VideoChatUser videoChatUser = new VideoChatUser();
                        videoChatUser.setId(str);
                        videoChatUser.setName(ar.m236694a().getString(R.string.View_VM_Unknown));
                        videoChatUser.setAvatarKey("");
                        videoChatUser.setType(ParticipantType.LARK_USER);
                    }
                }

                @XMethod(bigParamIndex = {0})
                public void onSuccess(Map<String, OpenChatter> map) {
                    if (map != null) {
                        for (String str : list) {
                            OpenChatter openChatter = map.get(str);
                            if (openChatter != null && !TextUtils.isEmpty(openChatter.getId()) && TextUtils.equals(openChatter.getId(), str)) {
                                String a = VideoChatModuleDependency.getChatterNameDependency().mo196369a(openChatter);
                                VideoChatUser videoChatUser = new VideoChatUser();
                                videoChatUser.setId(openChatter.getId());
                                videoChatUser.setName(a);
                                videoChatUser.setAvatarKey(openChatter.getAvatarKey());
                                videoChatUser.setType(ParticipantType.LARK_USER);
                                UserInfoService.setUserInfoToCache(videoChatUser);
                            }
                        }
                    }
                }
            });
        }
    }

    public static void getNeoChattersByIds(final List<String> list) {
        AbstractC60892h chatDependency;
        if (list != null && list.size() != 0 && (chatDependency = VideoChatModuleDependency.getChatDependency()) != null) {
            chatDependency.getChattersByIds(list, new XIGetDataCallback<Map<String, OpenChatter>>() {
                /* class com.ss.android.vc.net.service.UserInfoService.C636117 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                @XMethod
                public void onError(ErrorResult errorResult) {
                    C60700b.m235864f("UserInfoService", "[getNeoChattersByIds]", "error = " + errorResult.toString());
                    for (String str : list) {
                        VideoChatUser videoChatUser = new VideoChatUser();
                        videoChatUser.setId(str);
                        videoChatUser.setName(ar.m236694a().getString(R.string.View_VM_Unknown));
                        videoChatUser.setAvatarKey("");
                        videoChatUser.setType(ParticipantType.NEO_USER);
                    }
                }

                @XMethod
                public void onSuccess(Map<String, OpenChatter> map) {
                    if (map != null) {
                        for (String str : list) {
                            OpenChatter openChatter = map.get(str);
                            if (openChatter != null && !TextUtils.isEmpty(openChatter.getId()) && TextUtils.equals(openChatter.getId(), str)) {
                                String a = VideoChatModuleDependency.getChatterNameDependency().mo196369a(openChatter);
                                VideoChatUser videoChatUser = new VideoChatUser();
                                videoChatUser.setId(openChatter.getId());
                                videoChatUser.setName(a);
                                videoChatUser.setAvatarKey(openChatter.getAvatarKey());
                                videoChatUser.setType(ParticipantType.NEO_USER);
                                UserInfoService.setUserInfoToCache(videoChatUser);
                            }
                        }
                    }
                }
            });
        }
    }

    public static VideoChatUser toVideoChatUser(ByteViewUserInfo byteViewUserInfo) {
        VideoChatUser videoChatUser = new VideoChatUser();
        videoChatUser.setId(byteViewUserInfo.user.getUserId());
        videoChatUser.setType(byteViewUserInfo.user.getParticipantType());
        if (!TextUtils.isEmpty(byteViewUserInfo.displayName)) {
            videoChatUser.setName(byteViewUserInfo.displayName);
        } else {
            videoChatUser.setName(byteViewUserInfo.fullName);
        }
        videoChatUser.setAvatarKey(byteViewUserInfo.avatar_key);
        return videoChatUser;
    }

    public static void setUserInfoToCache(VideoChatUser videoChatUser) {
        if (videoChatUser != null && !TextUtils.isEmpty(videoChatUser.getId())) {
            if (videoChatUser.getType() == ParticipantType.ROOM) {
                roomUserMap.put(videoChatUser.getId(), videoChatUser);
            } else if (videoChatUser.getType() == ParticipantType.NEO_USER) {
                neoVideoChatUserMap.put(videoChatUser.getId(), videoChatUser);
            } else if (videoChatUser.getType().isNewType()) {
                newTypeUserMap.put(videoChatUser.getId(), videoChatUser);
            } else if (videoChatUser.getType().isUnknownType()) {
                unknownTypedUserMap.put(videoChatUser.getId(), videoChatUser);
            } else {
                videoChatUserMap.put(videoChatUser.getId(), videoChatUser);
            }
        }
    }

    public static List<VideoChatUser> toChatUserList(Map<String, Room> map) {
        ArrayList arrayList = new ArrayList();
        if (!(map == null || map.size() == 0)) {
            for (Map.Entry<String, Room> entry : map.entrySet()) {
                VideoChatUser videoChatUser = new VideoChatUser();
                videoChatUser.setRoom(entry.getValue());
                videoChatUser.setId(entry.getValue().roomId);
                videoChatUser.setName(entry.getValue().fullNameParticipant);
                videoChatUser.setAvatarKey(entry.getValue().avatarKey);
                videoChatUser.setType(ParticipantType.ROOM);
                arrayList.add(videoChatUser);
            }
        }
        return arrayList;
    }

    public static void getUserInfoByIds(String str, Map<String, ParticipantType> map) {
        getUserInfoByIds(str, map, true);
    }

    public static void getChatterById(final String str, final GetUserInfoListener getUserInfoListener) {
        VideoChatModuleDependency.getChatDependency().getChatterById(str, new XIGetDataCallback<OpenChatter>() {
            /* class com.ss.android.vc.net.service.UserInfoService.C636073 */

            @XMethod
            public void onSuccess(OpenChatter openChatter) {
                String a = VideoChatModuleDependency.getChatterNameDependency().mo196369a(openChatter);
                VideoChatUser videoChatUser = new VideoChatUser();
                videoChatUser.setId(openChatter.getId());
                videoChatUser.setName(a);
                videoChatUser.setAvatarKey(openChatter.getAvatarKey());
                videoChatUser.setType(ParticipantType.LARK_USER);
                C26171w.m94675a(new Runnable(videoChatUser) {
                    /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$3$8li9yWuNBmmJ8ts1Wf_NSBOxE */
                    public final /* synthetic */ VideoChatUser f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        UserInfoService.C636073.lambda$onSuccess$0(GetUserInfoListener.this, this.f$1);
                    }
                });
                UserInfoService.setUserInfoToCache(videoChatUser);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            @XMethod
            public void onError(ErrorResult errorResult) {
                C60700b.m235864f("UserInfoService", "[getChatterById]", "error = " + errorResult.toString() + ", userId = " + str);
                VideoChatUser videoChatUser = new VideoChatUser();
                videoChatUser.setId(str);
                videoChatUser.setName(ar.m236694a().getString(R.string.View_VM_Unknown));
                videoChatUser.setAvatarKey("");
                videoChatUser.setType(ParticipantType.LARK_USER);
                C26171w.m94675a(new Runnable(videoChatUser) {
                    /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$3$7QLXEk1P73rXi7XCbHk8HVfbJdY */
                    public final /* synthetic */ VideoChatUser f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        UserInfoService.C636073.lambda$onError$1(GetUserInfoListener.this, this.f$1);
                    }
                });
            }

            static /* synthetic */ void lambda$onError$1(GetUserInfoListener getUserInfoListener, VideoChatUser videoChatUser) {
                if (getUserInfoListener != null) {
                    getUserInfoListener.onGetUserInfo(videoChatUser);
                }
            }

            static /* synthetic */ void lambda$onSuccess$0(GetUserInfoListener getUserInfoListener, VideoChatUser videoChatUser) {
                if (getUserInfoListener != null) {
                    getUserInfoListener.onGetUserInfo(videoChatUser);
                }
            }
        });
    }

    public static void getNeoChatterById(final String str, final GetUserInfoListener getUserInfoListener) {
        VideoChatModuleDependency.getChatDependency().getChatterById(str, new XIGetDataCallback<OpenChatter>() {
            /* class com.ss.android.vc.net.service.UserInfoService.C636106 */

            @XMethod
            public void onSuccess(OpenChatter openChatter) {
                String a = VideoChatModuleDependency.getChatterNameDependency().mo196369a(openChatter);
                VideoChatUser videoChatUser = new VideoChatUser();
                videoChatUser.setId(openChatter.getId());
                videoChatUser.setName(a);
                videoChatUser.setAvatarKey(openChatter.getAvatarKey());
                videoChatUser.setType(ParticipantType.NEO_USER);
                C26171w.m94675a(new Runnable(videoChatUser) {
                    /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$6$C6YWplanOMtQ4N2K9eNpgCSfKg */
                    public final /* synthetic */ VideoChatUser f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        UserInfoService.C636106.lambda$onSuccess$0(GetUserInfoListener.this, this.f$1);
                    }
                });
                UserInfoService.setUserInfoToCache(videoChatUser);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            @XMethod
            public void onError(ErrorResult errorResult) {
                C60700b.m235864f("UserInfoService", "[getNeoChatterById]", "error = " + errorResult.toString() + ", userId = " + str);
                VideoChatUser videoChatUser = new VideoChatUser();
                videoChatUser.setId(str);
                videoChatUser.setName(ar.m236694a().getString(R.string.View_VM_Unknown));
                videoChatUser.setAvatarKey("");
                videoChatUser.setType(ParticipantType.NEO_USER);
                C26171w.m94675a(new Runnable(videoChatUser) {
                    /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$6$cQcF1vuLF8ph1ONKqPRc5HElE4c */
                    public final /* synthetic */ VideoChatUser f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        UserInfoService.C636106.lambda$onError$1(GetUserInfoListener.this, this.f$1);
                    }
                });
            }

            static /* synthetic */ void lambda$onError$1(GetUserInfoListener getUserInfoListener, VideoChatUser videoChatUser) {
                if (getUserInfoListener != null) {
                    getUserInfoListener.onGetUserInfo(videoChatUser);
                }
            }

            static /* synthetic */ void lambda$onSuccess$0(GetUserInfoListener getUserInfoListener, VideoChatUser videoChatUser) {
                if (getUserInfoListener != null) {
                    getUserInfoListener.onGetUserInfo(videoChatUser);
                }
            }
        });
    }

    public static void getRoomById(List<String> list, final GetUserInfoListener getUserInfoListener) {
        if (list != null && list.size() != 0) {
            VcBizService.getRoomById(list, new UIGetDataCallback<Map<String, Room>>() {
                /* class com.ss.android.vc.net.service.UserInfoService.C636128 */

                @Override // com.larksuite.framework.callback.UIGetDataCallback
                public void onErrored(ErrorResult errorResult) {
                    super.onErrored(errorResult);
                }

                public void onSuccessed(Map<String, Room> map) {
                    for (VideoChatUser videoChatUser : UserInfoService.toChatUserList(map)) {
                        GetUserInfoListener getUserInfoListener = getUserInfoListener;
                        if (getUserInfoListener != null) {
                            C26171w.m94675a(new Runnable(videoChatUser) {
                                /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$8$0LleyHtI99Z7jwe5iM1CWYFalEs */
                                public final /* synthetic */ VideoChatUser f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    GetUserInfoListener.this.onGetUserInfo(this.f$1);
                                }
                            });
                        }
                        UserInfoService.setUserInfoToCache(videoChatUser);
                    }
                }
            });
        }
    }

    public static void getTabTenant(final String str, final AbstractC63598b<av> bVar) {
        if (!tabTenantMap.containsKey(str) || tabTenantMap.get(str) == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            VcBizSender.m249287h(arrayList).mo219889a(new AbstractC63598b<C60988w>() {
                /* class com.ss.android.vc.net.service.UserInfoService.AnonymousClass11 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("UserInfoService", "[getTabTenant2]", "get tab chatters error!" + eVar.toString());
                    bVar.onError(eVar);
                }

                public void onSuccess(C60988w wVar) {
                    C60700b.m235851b("UserInfoService", "[getTabTenant]", "get tab chatters success!");
                    if (wVar == null || C60742af.m236059a(wVar.mo210138a())) {
                        bVar.onSuccess(new av(str, ""));
                    } else {
                        bVar.onSuccess(wVar.mo210138a().get(0));
                    }
                }
            });
            return;
        }
        bVar.onSuccess(tabTenantMap.get(str));
    }

    public static VideoChatUser getUserInfoInCache(String str, ParticipantType participantType) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (participantType == ParticipantType.ROOM) {
            return roomUserMap.get(str);
        }
        if (participantType == ParticipantType.NEO_USER) {
            return neoVideoChatUserMap.get(str);
        }
        if (participantType.isNewType()) {
            return newTypeUserMap.get(str);
        }
        if (participantType.isUnknownType()) {
            return unknownTypedUserMap.get(str);
        }
        return videoChatUserMap.get(str);
    }

    public static void getNewTypeUserInfos(String str, Map<String, ParticipantType> map, final AbstractC63598b<List<ByteViewUserInfo>> bVar) {
        if (!CollectionUtils.isEmpty(map)) {
            if (TextUtils.isEmpty(str)) {
                C60700b.m235864f("UserInfoService", "[getNewTypeUserInfos]", "empty meetingId");
            } else {
                VcBizService.pullParticipantInfos(str, map, new AbstractC63598b<List<ByteViewUserInfo>>() {
                    /* class com.ss.android.vc.net.service.UserInfoService.C636095 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235864f("UserInfoService", "[getNewTypeUserInfos3]", "[error]" + eVar);
                        AbstractC63598b bVar = bVar;
                        if (bVar != null) {
                            C26171w.m94675a(new Runnable(eVar) {
                                /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$5$LEE1iZyCwKlWU5HLyHYitemJpws */
                                public final /* synthetic */ C63602e f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    AbstractC63598b.this.onError(this.f$1);
                                }
                            });
                        }
                    }

                    public void onSuccess(List<ByteViewUserInfo> list) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("[success]");
                        sb.append(CollectionUtils.isEmpty(list) ? "size = 0" : " size = " + list.size());
                        C60700b.m235864f("UserInfoService", "[getNewTypeUserInfos2]", sb.toString());
                        if (!CollectionUtils.isEmpty(list)) {
                            for (ByteViewUserInfo byteViewUserInfo : list) {
                                UserInfoService.setUserInfoToCache(UserInfoService.toVideoChatUser(byteViewUserInfo));
                            }
                        }
                        AbstractC63598b bVar = bVar;
                        if (bVar != null) {
                            C26171w.m94675a(new Runnable(list) {
                                /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$5$mjJnOGb3FnxxQz2LwcMqDmMM */
                                public final /* synthetic */ List f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    AbstractC63598b.this.onSuccess(this.f$1);
                                }
                            });
                        }
                    }
                });
            }
        }
    }

    public static void getDefaultChatter(String str, ParticipantType participantType, GetUserInfoListener getUserInfoListener) {
        VideoChatUser videoChatUser = new VideoChatUser();
        videoChatUser.setId(str);
        videoChatUser.setType(participantType);
        videoChatUser.setName(ar.m236694a().getString(R.string.View_VM_Unknown));
        if (getUserInfoListener != null) {
            C26171w.m94675a(new Runnable(videoChatUser) {
                /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$ZqVzZH7kYcTwdRRwnvzBHGSmI */
                public final /* synthetic */ VideoChatUser f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    GetUserInfoListener.this.onGetUserInfo(this.f$1);
                }
            });
        }
    }

    private static void getUserInfoById(String str, ParticipantType participantType, GetUserInfoListener getUserInfoListener) {
        if (!TextUtils.isEmpty(str) && getUserInfoListener != null) {
            if (participantType == ParticipantType.ROOM) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                getRoomById(arrayList, getUserInfoListener);
            } else if (participantType == ParticipantType.NEO_USER) {
                getNeoChatterById(str, getUserInfoListener);
            } else if (participantType.isUnknownType()) {
                getDefaultChatter(str, participantType, getUserInfoListener);
            } else {
                getChatterById(str, getUserInfoListener);
            }
        }
    }

    public static void getTabTenants(final String[] strArr, int[] iArr, final AbstractC63598b<List<av>> bVar) {
        if (!(strArr == null || iArr == null)) {
            final List<av> arrayList = new ArrayList<>();
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                if (tabTenantMap.containsKey(str) && tabTenantMap.get(str) != null) {
                    arrayList.add(tabTenantMap.get(str));
                } else if (ParticipantType.forNumber(iArr[i]) == ParticipantType.ROOM) {
                    arrayList3.add(str);
                } else {
                    arrayList2.add(str);
                }
            }
            if (!C60742af.m236059a(arrayList2) || !C60742af.m236059a(arrayList3)) {
                if (!C60742af.m236059a(arrayList2)) {
                    VcBizSender.m249287h(arrayList2).mo219889a(new AbstractC63598b<C60988w>() {
                        /* class com.ss.android.vc.net.service.UserInfoService.C636139 */

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            C60700b.m235864f("UserInfoService", "[getTabTenants2]", "get tab chatters error!" + eVar.toString());
                            bVar.onError(eVar);
                        }

                        public void onSuccess(C60988w wVar) {
                            C60700b.m235851b("UserInfoService", "[getTabTenants]", "get tab chatters success!");
                            if (wVar != null && !C60742af.m236059a(wVar.mo210138a())) {
                                for (av avVar : wVar.mo210138a()) {
                                    if (!UserInfoService.tabTenantMap.containsKey(avVar.mo210116a())) {
                                        UserInfoService.tabTenantMap.put(avVar.mo210116a(), avVar);
                                        arrayList.add(avVar);
                                    }
                                }
                            }
                            for (String str : arrayList2) {
                                if (UserInfoService.tabTenantMap.get(str) == null) {
                                    arrayList.add(new av(str, ""));
                                }
                            }
                            if (arrayList.size() == strArr.length) {
                                bVar.onSuccess(arrayList);
                            }
                        }
                    });
                }
                if (!C60742af.m236059a(arrayList3)) {
                    VcBizSender.m249291i(arrayList3).mo219889a(new AbstractC63598b<C60988w>() {
                        /* class com.ss.android.vc.net.service.UserInfoService.AnonymousClass10 */

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            C60700b.m235864f("UserInfoService", "[getTabTenants4]", "get tab rooms error!" + eVar.toString());
                            bVar.onError(eVar);
                        }

                        public void onSuccess(C60988w wVar) {
                            C60700b.m235851b("UserInfoService", "[getTabTenants3]", "get tab rooms success!");
                            if (wVar != null && !C60742af.m236059a(wVar.mo210138a())) {
                                for (av avVar : wVar.mo210138a()) {
                                    if (!UserInfoService.tabTenantMap.containsKey(avVar.mo210116a())) {
                                        UserInfoService.tabTenantMap.put(avVar.mo210116a(), avVar);
                                        arrayList.add(avVar);
                                    }
                                }
                            }
                            for (String str : arrayList3) {
                                if (UserInfoService.tabTenantMap.get(str) == null) {
                                    arrayList.add(new av(str, ""));
                                }
                            }
                            if (arrayList.size() == strArr.length) {
                                bVar.onSuccess(arrayList);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            bVar.onSuccess(arrayList);
        }
    }

    public static void getUserInfoByIds(String str, Map<String, ParticipantType> map, boolean z) {
        if (!(map == null || map.size() == 0)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                ParticipantType participantType = map.get(str2);
                if ((z ? getUserInfoInCache(str2, participantType) : null) == null) {
                    if (participantType == ParticipantType.ROOM) {
                        if (arrayList.size() >= MAX_REQUEST_SIZE) {
                            getRoomById(new ArrayList(arrayList), null);
                            arrayList.clear();
                        }
                        arrayList.add(str2);
                    } else if (participantType == ParticipantType.NEO_USER) {
                        if (arrayList2.size() >= MAX_REQUEST_SIZE) {
                            getNeoChattersByIds(new ArrayList(arrayList2));
                            arrayList2.clear();
                        }
                        arrayList2.add(str2);
                    } else if (participantType == ParticipantType.LARK_USER) {
                        if (arrayList3.size() >= MAX_REQUEST_SIZE) {
                            getChattersByIds(new ArrayList(arrayList3));
                            arrayList3.clear();
                        }
                        arrayList3.add(str2);
                    } else if (participantType.isNewType()) {
                        if (hashMap.size() >= MAX_REQUEST_SIZE) {
                            getNewTypeUserInfos(str, new HashMap(hashMap), null);
                            hashMap.clear();
                        }
                        hashMap.put(str2, participantType);
                    }
                }
            }
            getRoomById(arrayList, null);
            getNeoChattersByIds(arrayList2);
            getChattersByIds(arrayList3);
            getNewTypeUserInfos(str, hashMap, null);
        }
    }

    public static void getUserInfoById(String str, String str2, ParticipantType participantType, GetUserInfoListener getUserInfoListener) {
        getUserInfoById(str, str2, participantType, true, getUserInfoListener);
    }

    public static void getUserInfoById(String str, String str2, ParticipantType participantType, IGetDataCallback<VideoChatUser> iGetDataCallback) {
        iGetDataCallback.getClass();
        getUserInfoById(str, str2, participantType, new GetUserInfoListener() {
            /* class com.ss.android.vc.net.service.$$Lambda$jccAI8svE4txedguZfWy7VE8LU */

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                IGetDataCallback.this.onSuccess(videoChatUser);
            }
        });
    }

    private static void getNewTypeUserInfo(String str, final String str2, final ParticipantType participantType, final GetUserInfoListener getUserInfoListener) {
        if (!TextUtils.isEmpty(str2)) {
            VcBizService.pullParticipantInfo(str2, "0", participantType, str, new UIGetDataCallback<ByteViewUserInfo>() {
                /* class com.ss.android.vc.net.service.UserInfoService.C636062 */

                @Override // com.larksuite.framework.callback.UIGetDataCallback
                public void onErrored(ErrorResult errorResult) {
                    super.onErrored(errorResult);
                    C60700b.m235864f("UserInfoService", "[getNewTypeUserInfo3]", "load user info failed: " + errorResult);
                    UserInfoService.getDefaultChatter(str2, participantType, getUserInfoListener);
                }

                public void onSuccessed(ByteViewUserInfo byteViewUserInfo) {
                    if (byteViewUserInfo == null) {
                        C60700b.m235864f("UserInfoService", "[getNewTypeUserInfo]", "load user info return with null");
                        UserInfoService.getDefaultChatter(str2, participantType, getUserInfoListener);
                        return;
                    }
                    C60700b.m235851b("UserInfoService", "[getNewTypeUserInfo2]", "load user info succeed: " + byteViewUserInfo.user);
                    VideoChatUser videoChatUser = UserInfoService.toVideoChatUser(byteViewUserInfo);
                    UserInfoService.newTypeUserMap.put(str2, videoChatUser);
                    GetUserInfoListener getUserInfoListener = getUserInfoListener;
                    if (getUserInfoListener != null) {
                        getUserInfoListener.onGetUserInfo(videoChatUser);
                    }
                }
            });
        }
    }

    public static void getUserInfoById(String str, String str2, ParticipantType participantType, boolean z, GetUserInfoListener getUserInfoListener) {
        VideoChatUser videoChatUser;
        if (z) {
            videoChatUser = getUserInfoInCache(str2, participantType);
        } else {
            videoChatUser = null;
        }
        if (videoChatUser != null) {
            C60700b.m235843a("UserInfoService", "[getUserInfoById]", "found in cache  [uid]" + str2 + "  [info]" + videoChatUser);
            C26171w.m94675a(new Runnable(videoChatUser) {
                /* class com.ss.android.vc.net.service.$$Lambda$UserInfoService$FurqALuvEIM2DCyMBEr3aR8IrXw */
                public final /* synthetic */ VideoChatUser f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    GetUserInfoListener.this.onGetUserInfo(this.f$1);
                }
            });
        } else if (participantType.isNewType()) {
            getNewTypeUserInfo(str, str2, participantType, getUserInfoListener);
        } else {
            getUserInfoById(str2, participantType, getUserInfoListener);
        }
    }
}
