package com.he.v8_inspect.server;

import android.content.Context;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.he.v8_inspect.ChromeDiscoveryHandler;
import com.he.v8_inspect.Inspector;
import com.he.v8_inspect.server.http.HandlerRegistry;
import com.he.v8_inspect.server.http.LightHttpServer;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.util.ProcessUtil;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class LocalSocketServer {
    private final ChromeDiscoveryHandler mChromeDiscoveryHandler;
    private final Context mContext;
    private final HandlerRegistry mHandlerRegistry = new HandlerRegistry();
    public LightHttpServer mLightHttpServer;
    private LocalServerSocket mServerSocket;
    private final AtomicInteger mThreadId = new AtomicInteger();

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    private LightHttpServer createServer() {
        this.mChromeDiscoveryHandler.register(this.mHandlerRegistry);
        return new LightHttpServer(this.mHandlerRegistry);
    }

    public void onRelease() {
        LocalServerSocket localServerSocket = this.mServerSocket;
        if (localServerSocket != null) {
            try {
                localServerSocket.close();
            } catch (IOException e) {
                Log.m165384e("LocalSocketServer", "IOException", e);
            }
        }
    }

    public void start() {
        new_insert_after_java_lang_Thread_by_knot(new Thread(new Runnable() {
            /* class com.he.v8_inspect.server.$$Lambda$LocalSocketServer$jDmqbYQq1dHTGm4CW2u_LyoImw */

            public final void run() {
                LocalSocketServer.this.lambda$start$0$LocalSocketServer();
            }
        })).start();
    }

    private class WorkerThread extends Thread {
        private final LocalSocket mSocket;

        public void run() {
            try {
                LocalSocketServer.this.mLightHttpServer.serve(new SocketLike(this.mSocket, new LeakyBufferedInputStream(this.mSocket.getInputStream(), 1024)));
            } catch (Exception e) {
                AppBrandLogger.m52829e("LocalSocketServer", e);
            }
        }

        public WorkerThread(LocalSocket localSocket) {
            this.mSocket = localSocket;
        }
    }

    public /* synthetic */ void lambda$start$0$LocalSocketServer() {
        try {
            this.mServerSocket = new LocalServerSocket("miniApp_" + ProcessUtil.getCurProcessName(this.mContext) + "_devtools_remote");
            this.mLightHttpServer = createServer();
            while (!Thread.interrupted()) {
                WorkerThread workerThread = new WorkerThread(this.mServerSocket.accept());
                workerThread.setName("LocalSocketServer_WorkerThread_" + this.mThreadId.incrementAndGet());
                workerThread.setDaemon(true);
                workerThread.start();
            }
        } catch (IOException e) {
            AppBrandLogger.m52829e("LocalSocketServer", e);
        }
    }

    public LocalSocketServer(Context context) {
        this.mContext = context;
        this.mChromeDiscoveryHandler = new ChromeDiscoveryHandler(context);
    }

    public void addInspect(Inspector inspector) {
        this.mChromeDiscoveryHandler.addInspectTarget(inspector.getInspectTarget());
        this.mHandlerRegistry.register(inspector.getExactPathMatcher(), inspector.getWebSocketHandler());
    }

    public void removeInspect(Inspector inspector) {
        this.mChromeDiscoveryHandler.removeInspectTarget(inspector.getInspectTarget());
        this.mHandlerRegistry.unregister(inspector.getExactPathMatcher(), inspector.getWebSocketHandler());
    }
}
