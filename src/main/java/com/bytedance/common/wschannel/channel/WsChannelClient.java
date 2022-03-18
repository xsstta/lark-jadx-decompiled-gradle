package com.bytedance.common.wschannel.channel;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.channel.impl.ok.OkChannelImpl;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class WsChannelClient implements IWsChannelClient {
    private static String sMyselfChannelImplClass = "";
    private static boolean useMySelfChannel = true;
    private final int mChannelId;
    private boolean mDestroy;
    private final Handler mHandler;
    private IMessageHandler mMessageHandler;
    private List<String> mUrls;
    private boolean mUseCronetPlugin = true;
    private IWsChannelClient mWsChannelImpl;

    private boolean useMySelfChannel() {
        return useMySelfChannel;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void stopConnection() {
        IWsChannelClient iWsChannelClient = this.mWsChannelImpl;
        if (iWsChannelClient != null) {
            iWsChannelClient.stopConnection();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean isConnected() {
        IWsChannelClient iWsChannelClient = this.mWsChannelImpl;
        if (iWsChannelClient != null) {
            return iWsChannelClient.isConnected();
        }
        return false;
    }

    private void tryResolveMySelfChannelImpl() throws Exception {
        if (this.mWsChannelImpl == null) {
            Class<?> cls = null;
            if (!StringUtils.isEmpty(sMyselfChannelImplClass)) {
                cls = checkClass(sMyselfChannelImplClass);
            }
            if (cls == null) {
                cls = checkClass("org.chromium.wschannel.MySelfChannelImpl");
                this.mUseCronetPlugin = true;
            }
            if (cls == null) {
                cls = checkClass("com.b.c.ws.MySelfChannelImpl");
                this.mUseCronetPlugin = false;
            }
            if (cls != null) {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof IWsChannelClient) {
                    this.mWsChannelImpl = (IWsChannelClient) newInstance;
                    return;
                }
                return;
            }
            throw new ClassNotFoundException("plugin class not found");
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void destroy() {
        String str;
        synchronized (this) {
            this.mDestroy = true;
            IWsChannelClient iWsChannelClient = this.mWsChannelImpl;
            if (iWsChannelClient != null) {
                iWsChannelClient.destroy();
                if (!(this.mWsChannelImpl instanceof OkChannelImpl)) {
                    JSONObject jSONObject = new JSONObject();
                    List<String> list = this.mUrls;
                    if (list == null || list.size() < 1) {
                        str = "";
                    } else {
                        str = this.mUrls.get(0);
                    }
                    try {
                        jSONObject.put(ShareHitPoint.f121869d, 0);
                        jSONObject.put("state", 3);
                        jSONObject.put("url", str);
                        jSONObject.put("channel_type", 1);
                        onConnectionInternal(jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private Class<?> checkClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onAppStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.mWsChannelImpl;
        if (iWsChannelClient != null) {
            iWsChannelClient.onAppStateChanged(i);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onNetworkStateChanged(int i) {
        IWsChannelClient iWsChannelClient = this.mWsChannelImpl;
        if (iWsChannelClient != null) {
            iWsChannelClient.onNetworkStateChanged(i);
        }
    }

    private void onConnectionInternal(JSONObject jSONObject) {
        IMessageHandler iMessageHandler = this.mMessageHandler;
        if (iMessageHandler != null) {
            iMessageHandler.onConnection(this, this.mChannelId, jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onConnection(JSONObject jSONObject) {
        synchronized (this) {
            if (!this.mDestroy) {
                onConnectionInternal(jSONObject);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onMessage(byte[] bArr) {
        IMessageHandler iMessageHandler = this.mMessageHandler;
        if (iMessageHandler != null) {
            iMessageHandler.onMessage(this.mChannelId, bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public boolean sendMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.mWsChannelImpl;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(bArr);
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void onParameterChange(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.mWsChannelImpl;
        if (iWsChannelClient != null) {
            iWsChannelClient.onParameterChange(map, list);
        }
        this.mUrls = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void openConnection(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.mWsChannelImpl;
        if (iWsChannelClient != null) {
            iWsChannelClient.openConnection(map, list);
        }
        this.mUrls = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public void init(Context context, IWsChannelClient iWsChannelClient) {
        IWsChannelClient iWsChannelClient2 = this.mWsChannelImpl;
        if (iWsChannelClient2 != null) {
            try {
                iWsChannelClient2.init(context, iWsChannelClient);
            } catch (Throwable th) {
                if (!(this.mWsChannelImpl instanceof OkChannelImpl)) {
                    th.printStackTrace();
                    Logger.m15167d("WsChannelClient", "cronet长连接初始化失败，用ok实现");
                    OkChannelImpl okChannelImpl = new OkChannelImpl(this.mChannelId, this.mHandler);
                    this.mWsChannelImpl = okChannelImpl;
                    okChannelImpl.init(context, iWsChannelClient);
                    return;
                }
                throw th;
            }
        }
    }

    public static WsChannelClient newInstance(int i, IMessageHandler iMessageHandler, Handler handler) {
        return new WsChannelClient(i, iMessageHandler, handler);
    }

    private WsChannelClient(int i, IMessageHandler iMessageHandler, Handler handler) {
        this.mChannelId = i;
        this.mMessageHandler = iMessageHandler;
        this.mHandler = handler;
        if (useMySelfChannel()) {
            try {
                tryResolveMySelfChannelImpl();
                if (this.mUseCronetPlugin) {
                    Logger.m15167d("WsChannelClient", "使用cronet建立长链接");
                } else {
                    Logger.m15167d("WsChannelClient", "使用PushManager建立长链接");
                    useMySelfChannel = false;
                }
            } catch (ClassNotFoundException unused) {
                Logger.m15167d("WsChannelClient", "未检测到插件或者插件下载失败");
            } catch (Throwable th) {
                th.printStackTrace();
                Logger.m15167d("WsChannelClient", "未检测到插件或者插件下载失败");
            }
        }
        if (this.mWsChannelImpl == null) {
            Logger.m15167d("WsChannelClient", "使用okhttp建立长链接");
            this.mWsChannelImpl = new OkChannelImpl(i, handler);
        }
    }
}
