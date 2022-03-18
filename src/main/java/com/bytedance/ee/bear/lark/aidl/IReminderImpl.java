package com.bytedance.ee.bear.lark.aidl;

import android.os.RemoteException;
import com.bytedance.ee.bear.lark.notification.docfeed.C8056h;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsRequest;
import com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsResponse;
import com.bytedance.lark.pb.space.doc.v1.UpdateDocFeedRequest;
import com.bytedance.lark.pb.space.doc.v1.UpdateDocFeedResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.doc.IFetchRemindCallback;
import com.ss.android.lark.doc.IPutRemindCallback;
import com.ss.android.lark.doc.IRemindStateChangeListener;
import com.ss.android.lark.doc.IReminder;
import com.ss.android.lark.doc.entity.C36836a;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.statistics.chat.ChatHitPoint;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class IReminderImpl extends IReminder.Stub {
    @Override // com.ss.android.lark.doc.IReminder
    public void registerRemindListener(IRemindStateChangeListener iRemindStateChangeListener) throws RemoteException {
        C7973a.m31833a().mo30905a(iRemindStateChangeListener);
    }

    @Override // com.ss.android.lark.doc.IReminder
    public void unRegisterRemindListener(IRemindStateChangeListener iRemindStateChangeListener) throws RemoteException {
        C7973a.m31833a().mo30906b(iRemindStateChangeListener);
    }

    private void loadFromService(final String str, final IFetchRemindCallback iFetchRemindCallback) {
        pullChatSettings(new LinkedList<String>(str) {
            /* class com.bytedance.ee.bear.lark.aidl.IReminderImpl.C79671 */
            final /* synthetic */ String val$feedId;

            {
                this.val$feedId = r2;
                add(r2);
            }
        }, new IGetDataCallback<Map<String, ChatSetting>>() {
            /* class com.bytedance.ee.bear.lark.aidl.IReminderImpl.C79682 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IFetchRemindCallback iFetchRemindCallback = iFetchRemindCallback;
                if (iFetchRemindCallback != null) {
                    try {
                        iFetchRemindCallback.onFaile(-2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }

            /* renamed from: a */
            public void onSuccess(Map<String, ChatSetting> map) {
                if (map != null) {
                    try {
                        ChatSetting chatSetting = map.get(str);
                        if (chatSetting != null) {
                            IFetchRemindCallback iFetchRemindCallback = iFetchRemindCallback;
                            if (iFetchRemindCallback != null) {
                                iFetchRemindCallback.onSuccess(str, chatSetting.isRemind());
                                return;
                            }
                            return;
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                IFetchRemindCallback iFetchRemindCallback2 = iFetchRemindCallback;
                if (iFetchRemindCallback2 != null) {
                    iFetchRemindCallback2.onFaile(1);
                }
            }
        });
    }

    private void pullChatSettings(LinkedList<String> linkedList, final IGetDataCallback<Map<String, ChatSetting>> iGetDataCallback) {
        pullDocFeeds(linkedList, new IGetDataCallback<C36836a>() {
            /* class com.bytedance.ee.bear.lark.aidl.IReminderImpl.C79715 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(C36836a aVar) {
                if (!(iGetDataCallback == null || aVar == null)) {
                    Map<String, DocFeed> a = aVar.mo135951a();
                    HashMap hashMap = new HashMap();
                    if (a != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        for (DocFeed docFeed : a.values()) {
                            hashMap.put(docFeed.getId(), new ChatSetting(docFeed.getId(), docFeed.isRemind(), currentTimeMillis));
                        }
                    }
                    iGetDataCallback.onSuccess(hashMap);
                }
            }
        });
    }

    @Override // com.ss.android.lark.doc.IReminder
    public void getRemindState(String str, IFetchRemindCallback iFetchRemindCallback) throws RemoteException {
        try {
            loadFromService(str, iFetchRemindCallback);
        } catch (Throwable unused) {
            if (iFetchRemindCallback != null) {
                iFetchRemindCallback.onFaile(-1);
            }
        }
    }

    private void pullDocFeeds(List<String> list, IGetDataCallback<C36836a> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MGET_DOC_FEEDS, new MGetDocFeedsRequest.C19269a().mo65737a(list), iGetDataCallback, new SdkSender.IParser<C36836a>() {
            /* class com.bytedance.ee.bear.lark.aidl.IReminderImpl.C79704 */

            /* renamed from: a */
            public C36836a parse(byte[] bArr) throws IOException {
                return C8056h.m32195a(MGetDocFeedsResponse.ADAPTER.decode(bArr).entity);
            }
        });
    }

    private void patchRemind(final String str, boolean z, final IPutRemindCallback iPutRemindCallback) {
        patchChatSetting(str, z, new IGetDataCallback<ChatSetting>() {
            /* class com.bytedance.ee.bear.lark.aidl.IReminderImpl.C79693 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IPutRemindCallback iPutRemindCallback = iPutRemindCallback;
                if (iPutRemindCallback != null) {
                    try {
                        iPutRemindCallback.onFaile(-2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }

            /* renamed from: a */
            public void onSuccess(ChatSetting chatSetting) {
                if (chatSetting != null) {
                    try {
                        IPutRemindCallback iPutRemindCallback = iPutRemindCallback;
                        if (iPutRemindCallback != null) {
                            iPutRemindCallback.onSuccess(str);
                            return;
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                iPutRemindCallback.onFaile(1);
            }
        });
    }

    public void patchChatSetting(String str, boolean z, IGetDataCallback<ChatSetting> iGetDataCallback) {
        UpdateDocFeedRequest.C19277a aVar = new UpdateDocFeedRequest.C19277a();
        aVar.mo65756a(str).mo65755a(Boolean.valueOf(z));
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_DOC_FEED, aVar, iGetDataCallback, new SdkSender.IParser<ChatSetting>() {
            /* class com.bytedance.ee.bear.lark.aidl.IReminderImpl.C79726 */

            /* renamed from: a */
            public ChatSetting parse(byte[] bArr) throws IOException {
                UpdateDocFeedResponse decode = UpdateDocFeedResponse.ADAPTER.decode(bArr);
                com.bytedance.lark.pb.basic.v1.DocFeed docFeed = decode.entity.doc_feeds.get(decode.doc_feed_id);
                if (docFeed != null) {
                    return new ChatSetting(docFeed.id, docFeed.is_remind.booleanValue(), System.currentTimeMillis());
                }
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.doc.IReminder
    public void setRemind(String str, boolean z, IPutRemindCallback iPutRemindCallback) throws RemoteException {
        patchRemind(str, z, iPutRemindCallback);
        if (z) {
            ChatHitPoint.f94671a.mo135788b("doc", str);
        } else {
            ChatHitPoint.f94671a.mo135787a("doc", str);
        }
    }
}
