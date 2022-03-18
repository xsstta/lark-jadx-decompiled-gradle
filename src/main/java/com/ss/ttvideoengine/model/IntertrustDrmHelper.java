package com.ss.ttvideoengine.model;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.ttvideoengine.net.TTHTTPNetwork;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import org.json.JSONObject;

public class IntertrustDrmHelper {
    public Class<?> mDrmClass;
    private Object mDrmNetworkCallback;
    private Handler mHandler;
    public Object mInstance;
    private Object mIntertrustCallback;
    public IntertrustDrmHelperListener mListener;
    public TTVNetClient mNetworkSession = new TTHTTPNetwork();

    public interface IntertrustDrmHelperListener {
        void onError(Error error);

        void onTokenProcessed(Error error);
    }

    public void _notifySuccess() {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(0));
    }

    public void release() {
        TTVideoEngineLog.m256500d("IntertrustDrmHelper", "release enter");
        if (this.mInstance != null) {
            try {
                if (this.mDrmClass == null) {
                    this.mDrmClass = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                }
                this.mDrmClass.getDeclaredMethod("release", new Class[0]).invoke(this.mInstance, new Object[0]);
                this.mInstance = null;
            } catch (ClassNotFoundException e) {
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            } catch (NoSuchMethodException e2) {
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            } catch (IllegalAccessException e3) {
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            } catch (InvocationTargetException e4) {
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            }
        }
    }

    public int start() {
        TTVideoEngineLog.m256500d("IntertrustDrmHelper", "start enter");
        if (this.mInstance == null) {
            return -1;
        }
        try {
            if (this.mDrmClass == null) {
                this.mDrmClass = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.mDrmClass.getDeclaredMethod("start", new Class[0]).invoke(this.mInstance, new Object[0])).intValue();
        } catch (ClassNotFoundException e) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e2) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e3) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e4) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        }
    }

    public int stop() {
        TTVideoEngineLog.m256500d("IntertrustDrmHelper", "stop enter");
        if (this.mInstance == null) {
            return -1;
        }
        try {
            if (this.mDrmClass == null) {
                this.mDrmClass = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.mDrmClass.getDeclaredMethod("stop", new Class[0]).invoke(this.mInstance, new Object[0])).intValue();
        } catch (ClassNotFoundException e) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e2) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e3) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e4) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        }
    }

    public void setListener(IntertrustDrmHelperListener intertrustDrmHelperListener) {
        this.mListener = intertrustDrmHelperListener;
    }

    /* access modifiers changed from: private */
    public class MyIntertrustListener implements InvocationHandler {
        private MyIntertrustListener() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            int i;
            String str;
            TTVideoEngineLog.m256500d("IntertrustDrmHelper", "intertrust listener invoke");
            String name = method.getName();
            if (name.equals("onTokenProcessed")) {
                IntertrustDrmHelper.this._notifySuccess();
                return null;
            } else if (name.equals("onError")) {
                int i2 = -1;
                if (objArr[0] != null) {
                    i = ((Integer) objArr[0]).intValue();
                } else {
                    i = -1;
                }
                if (objArr[1] != null) {
                    i2 = ((Integer) objArr[1]).intValue();
                }
                if (objArr[2] != null) {
                    str = objArr[2].toString();
                } else {
                    str = "";
                }
                if (i == -600000) {
                    i = -9935;
                } else if (i == -600001) {
                    i = -9934;
                }
                IntertrustDrmHelper.this._notifyError(new Error("kTTVideoErrorDomainIntertrustDRM", i, i2, str));
                return null;
            } else {
                TTVideoEngineLog.m256508w("IntertrustDrmHelper", "invalid method name:" + name);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public class MyNetworkListener implements InvocationHandler {
        private MyNetworkListener() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.ttvideoengine.net.TTVNetClient */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String str;
            Map map;
            JSONObject jSONObject;
            TTVideoEngineLog.m256500d("IntertrustDrmHelper", "network listener invoke");
            String name = method.getName();
            if (name.equals("startTask")) {
                if (objArr[0] != null) {
                    str = objArr[0].toString();
                } else {
                    str = "";
                }
                if (objArr[1] != null) {
                    map = (Map) objArr[1];
                } else {
                    map = null;
                }
                if (objArr[2] != null) {
                    jSONObject = (JSONObject) objArr[2];
                } else {
                    jSONObject = null;
                }
                IntertrustDrmHelper.this.mNetworkSession.startTask(str, map, jSONObject, 0, new myNetClientListener());
            } else if (name.equals("cancel")) {
                IntertrustDrmHelper.this.mNetworkSession.cancel();
            } else {
                TTVideoEngineLog.m256508w("IntertrustDrmHelper", "invalid method name:" + name);
            }
            return null;
        }
    }

    class myNetClientListener implements TTVNetClient.RawCompletionListener {
        myNetClientListener() {
        }

        @Override // com.ss.ttvideoengine.net.TTVNetClient.RawCompletionListener
        public void onCompletion(String str, Error error) {
            if (error != null) {
                String str2 = error.description;
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "get token return error code: " + error.code + ", internal:" + error.internalCode + ", description:" + error.description);
                if (!str2.contains("Canceled")) {
                    IntertrustDrmHelper.this._notifyError(error);
                }
            } else if (IntertrustDrmHelper.this.mInstance != null) {
                try {
                    if (IntertrustDrmHelper.this.mDrmClass == null) {
                        IntertrustDrmHelper.this.mDrmClass = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                    }
                    IntertrustDrmHelper.this.mDrmClass.getDeclaredMethod("processTokenComplete", String.class).invoke(IntertrustDrmHelper.this.mInstance, str);
                } catch (ClassNotFoundException e) {
                    TTVideoEngineLog.m256503e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
                } catch (NoSuchMethodException e2) {
                    TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
                } catch (IllegalAccessException e3) {
                    TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
                } catch (InvocationTargetException e4) {
                    TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
                }
            }
        }
    }

    public void _notifyError(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    /* access modifiers changed from: private */
    public class MyHandler extends Handler {
        private WeakReference<IntertrustDrmHelper> mHelper;

        public void handleMessage(Message message) {
            IntertrustDrmHelperListener intertrustDrmHelperListener;
            IntertrustDrmHelper intertrustDrmHelper = this.mHelper.get();
            if (intertrustDrmHelper != null && (intertrustDrmHelperListener = intertrustDrmHelper.mListener) != null) {
                int i = message.what;
                if (i == 0) {
                    intertrustDrmHelperListener.onTokenProcessed(null);
                } else if (i == 1) {
                    intertrustDrmHelperListener.onError((Error) message.obj);
                }
            }
        }

        public MyHandler(IntertrustDrmHelper intertrustDrmHelper, Looper looper) {
            super(looper);
            this.mHelper = new WeakReference<>(intertrustDrmHelper);
        }
    }

    public void setTokenUrlTemplate(String str) {
        TTVideoEngineLog.m256500d("IntertrustDrmHelper", "setTokenUrlTemplate enter");
        if (this.mInstance != null) {
            try {
                if (this.mDrmClass == null) {
                    this.mDrmClass = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                }
                this.mDrmClass.getDeclaredMethod("setTokenUrlTemplate", String.class).invoke(this.mInstance, str);
            } catch (ClassNotFoundException e) {
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            } catch (NoSuchMethodException e2) {
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            } catch (IllegalAccessException e3) {
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            } catch (InvocationTargetException e4) {
                TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            }
        }
    }

    public String makeUrl(String str, int i) {
        TTVideoEngineLog.m256500d("IntertrustDrmHelper", "makeUrl enter");
        if (this.mInstance == null) {
            return null;
        }
        try {
            if (this.mDrmClass == null) {
                this.mDrmClass = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return (String) this.mDrmClass.getDeclaredMethod("makeUrl", String.class, Integer.TYPE).invoke(this.mInstance, str, Integer.valueOf(i));
        } catch (ClassNotFoundException e) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return null;
        } catch (NoSuchMethodException e2) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            return null;
        } catch (IllegalAccessException e3) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            return null;
        } catch (InvocationTargetException e4) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return null;
        }
    }

    public int init(Context context, int i) {
        Object obj;
        TTVideoEngineLog.m256500d("IntertrustDrmHelper", "init enter");
        try {
            Class<?> cls = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            this.mDrmClass = cls;
            this.mInstance = cls.newInstance();
            Class<?> cls2 = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy$IntertrustDrmProxyListener");
            MyIntertrustListener myIntertrustListener = new MyIntertrustListener();
            this.mIntertrustCallback = Proxy.newProxyInstance(IntertrustDrmHelper.class.getClassLoader(), new Class[]{cls2}, myIntertrustListener);
            this.mDrmClass.getDeclaredMethod("setListener", cls2).invoke(this.mInstance, this.mIntertrustCallback);
            Class<?> cls3 = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy$IntertrustDrmProxyNetworkClient");
            MyNetworkListener myNetworkListener = new MyNetworkListener();
            this.mDrmNetworkCallback = Proxy.newProxyInstance(IntertrustDrmHelper.class.getClassLoader(), new Class[]{cls3}, myNetworkListener);
            this.mDrmClass.getDeclaredMethod("setNetworkClient", cls3).invoke(this.mInstance, this.mDrmNetworkCallback);
            if (i == 0) {
                obj = this.mDrmClass.getDeclaredMethod("init", Context.class).invoke(this.mInstance, context);
            } else {
                obj = this.mDrmClass.getDeclaredMethod("init", Context.class, Integer.TYPE).invoke(this.mInstance, context, Integer.valueOf(i));
            }
            this.mHandler = new MyHandler(this, TTHelper.getLooper());
            return ((Integer) obj).intValue();
        } catch (ClassNotFoundException e) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return IByteRtcError.BRERR_NO_PUBLISH_PERMISSION;
        } catch (InstantiationException e2) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "instance failed+" + e2.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e3) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "illegal access exception:" + e3.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e4) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method not found:" + e4.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e5) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "invoke failed:" + e5.getLocalizedMessage());
            return -1;
        }
    }

    public int processToken(int i, String str, String str2) {
        TTVideoEngineLog.m256500d("IntertrustDrmHelper", "processToken enter");
        if (this.mInstance == null) {
            return -1;
        }
        try {
            if (this.mDrmClass == null) {
                this.mDrmClass = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.mDrmClass.getDeclaredMethod("processToken", Integer.TYPE, String.class, String.class).invoke(this.mInstance, Integer.valueOf(i), str, str2)).intValue();
        } catch (ClassNotFoundException e) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e2) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e3) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e4) {
            TTVideoEngineLog.m256503e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        }
    }
}
