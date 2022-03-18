package com.lynx.tasm.base;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SystemMessageHandler extends Handler {

    /* renamed from: a */
    private long f65868a;

    /* renamed from: b */
    private boolean f65869b = true;

    /* renamed from: c */
    private Method f65870c;

    /* renamed from: d */
    private boolean f65871d;

    private native void nativeRunWork(long j);

    private void stop() {
        this.f65869b = false;
    }

    private void scheduleWork() {
        sendMessage(m96431a(1));
    }

    /* renamed from: a */
    private void m96432a() {
        if (!this.f65871d) {
            if (Build.VERSION.SDK_INT < 22) {
                try {
                    this.f65870c = Class.forName("android.os.Message").getMethod("setAsynchronous", Boolean.TYPE);
                } catch (ClassNotFoundException e) {
                    LLog.m96429e("SystemMessageHandler", "Failed to find android.os.Message class:" + e);
                } catch (NoSuchMethodException e2) {
                    LLog.m96429e("SystemMessageHandler", "Failed to load Message.setAsynchronous method:" + e2);
                } catch (RuntimeException e3) {
                    LLog.m96429e("SystemMessageHandler", "Exception while loading Message.setAsynchronous method: " + e3);
                }
            }
            this.f65871d = true;
        }
    }

    public static SystemMessageHandler create(long j) {
        return new SystemMessageHandler(j);
    }

    private SystemMessageHandler(long j) {
        this.f65868a = j;
    }

    public void handleMessage(Message message) {
        if (this.f65869b) {
            TraceEvent.m96443a("SysMessageHandler::handlerMessage");
            nativeRunWork(this.f65868a);
            TraceEvent.m96444b("SysMessageHandler::handlerMessage");
        }
    }

    /* renamed from: a */
    private Message m96431a(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        if (Build.VERSION.SDK_INT >= 22) {
            obtain.setAsynchronous(true);
        } else {
            m96432a();
            Method method = this.f65870c;
            if (method != null) {
                try {
                    method.invoke(obtain, true);
                } catch (IllegalAccessException unused) {
                    LLog.m96429e("SystemMessageHandler", "Illegal access to asynchronous message creation, disabling.");
                    this.f65870c = null;
                } catch (IllegalArgumentException unused2) {
                    LLog.m96429e("SystemMessageHandler", "Illegal argument for asynchronous message creation, disabling.");
                    this.f65870c = null;
                } catch (InvocationTargetException unused3) {
                    LLog.m96429e("SystemMessageHandler", "Invocation exception during asynchronous message creation, disabling.");
                    this.f65870c = null;
                } catch (RuntimeException unused4) {
                    LLog.m96429e("SystemMessageHandler", "Runtime exception during asynchronous message creation, disabling.");
                    this.f65870c = null;
                }
            }
        }
        return obtain;
    }
}
