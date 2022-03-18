package com.ss.ttvideoengine;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.ActivityIdentificationData;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.preloader.TTAVPreloaderItem;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public class TTVideoEngineLooperThread {
    private List mCondList;
    private TTVideoEngine mEngine;
    private Handler mEngineMsgHandler;
    public Lock mEngineMsgLock;
    Parcel mEngineMsgRetValue;
    private boolean mIsHandlingMainMsg;
    private Handler mMainLooperHandler;
    public Lock mMainMsgLock;
    Parcel mMainMsgRetValue;
    private HandlerThread mMessageThread;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public boolean isStarted() {
        if (this.mEngineMsgHandler != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public class RunableMsgHandler implements Runnable {
        Message msg;
        WeakReference<Handler> msgHandler;

        public void run() {
            Handler handler;
            WeakReference<Handler> weakReference = this.msgHandler;
            if (weakReference != null && (handler = weakReference.get()) != null) {
                handler.handleMessage(this.msg);
            }
        }

        RunableMsgHandler(Handler handler, Message message) {
            this.msgHandler = new WeakReference<>(handler);
            this.msg = message;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean checkSendMainLooper() {
        Looper looper;
        if (this.mEngineMsgHandler == null) {
            return false;
        }
        Handler handler = this.mMainLooperHandler;
        if (handler == null || handler.getLooper() == null || this.mMainLooperHandler.getLooper().getThread() == null || this.mMainLooperHandler.getLooper().getThread().isAlive()) {
            if (Looper.myLooper() != null) {
                looper = Looper.myLooper();
            } else {
                looper = Looper.getMainLooper();
            }
            Handler handler2 = this.mMainLooperHandler;
            if (handler2 != null && handler2.getLooper() != looper) {
                return true;
            }
            if (this.mMainLooperHandler != null) {
                TTVideoEngineLog.m256500d("TTVideoEngineLooperThread", "mainHandler looper:" + this.mMainLooperHandler.getLooper());
            }
            return false;
        }
        TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "main looper thread is not alive, return false");
        return false;
    }

    /* access modifiers changed from: package-private */
    public void closeEngineLooperThread() {
        Lock lock = this.mEngineMsgLock;
        if (lock != null) {
            lock.lock();
            List list = this.mCondList;
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < this.mCondList.size(); i++) {
                    ((Condition) this.mCondList.get(i)).signalAll();
                }
                this.mCondList.clear();
            }
            Handler handler = this.mEngineMsgHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                Looper looper = this.mEngineMsgHandler.getLooper();
                if (looper != null) {
                    looper.quit();
                }
                this.mEngineMsgHandler = null;
            }
            this.mEngineMsgLock.unlock();
        }
    }

    TTVideoEngineLooperThread(TTVideoEngine tTVideoEngine) {
        this.mEngine = tTVideoEngine;
    }

    /* access modifiers changed from: package-private */
    public void postEngineMessage(int i) {
        postEngineMessage(i, 0, 0, null);
    }

    /* access modifiers changed from: package-private */
    public boolean checkEngineLooperThread(boolean z) {
        if (!this.mIsHandlingMainMsg || !z) {
            Lock lock = this.mEngineMsgLock;
            if (lock != null) {
                lock.lock();
                Handler handler = this.mEngineMsgHandler;
                if (handler == null || handler.getLooper() == null || Looper.myLooper() == this.mEngineMsgHandler.getLooper()) {
                    this.mEngineMsgLock.unlock();
                } else {
                    this.mEngineMsgLock.unlock();
                    return true;
                }
            }
            return false;
        }
        TTVideoEngineLog.m256505i("TTVideoEngineLooperThread", "mIsHandlingMainMsg return false, thread:" + Looper.myLooper().getThread());
        return false;
    }

    public void start(HandlerThread handlerThread) {
        TTVideoEngineLog.m256505i("TTVideoEngineLooperThread", "start, handlerThread:" + handlerThread);
        this.mEngineMsgLock = new ReentrantLock();
        this.mCondList = new ArrayList();
        this.mEngineMsgRetValue = Parcel.obtain();
        if (handlerThread != null) {
            this.mMessageThread = handlerThread;
            handlerThread.setName("engineMsgLooper");
        } else {
            this.mMessageThread = new_android_os_HandlerThread_by_knot("engineMsgLooper");
        }
        this.mMessageThread.start();
        this.mEngineMsgHandler = new MessageHandler(this.mEngine, this.mMessageThread.getLooper());
        this.mMainMsgLock = new ReentrantLock();
        this.mMainMsgRetValue = Parcel.obtain();
        this.mMainLooperHandler = new MyMainLooperHandler(this.mEngine);
        TTVideoEngineLog.m256505i("TTVideoEngineLooperThread", "enable engine looper thread");
    }

    /* access modifiers changed from: private */
    public class MyMainLooperHandler extends Handler {
        private WeakReference<TTVideoEngine> mEngineRef;

        public void handleMessage(Message message) {
            Object obj;
            Condition condition;
            Map map;
            TTVideoEngine tTVideoEngine = this.mEngineRef.get();
            if (tTVideoEngine == null) {
                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "engine is null, return.");
                return;
            }
            String str = null;
            if (message.obj != null) {
                map = (Map) message.obj;
                if (map.containsKey("msgCond")) {
                    condition = (Condition) map.get("msgCond");
                } else {
                    condition = null;
                }
                if (map.containsKey("paramObj")) {
                    obj = map.get("paramObj");
                } else {
                    obj = null;
                }
            } else {
                map = null;
                condition = null;
                obj = null;
            }
            int i = message.what;
            if (i != 600) {
                boolean z = false;
                switch (i) {
                    case MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL:
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onPlaybackStateChanged(tTVideoEngine, message.arg1);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onPlaybackStateChanged(tTVideoEngine, message.arg1);
                            break;
                        }
                        break;
                    case 401:
                        int i2 = message.arg1;
                        if (message.arg2 == 1) {
                            z = true;
                        }
                        if (z || i2 != 3) {
                            if (tTVideoEngine.mVideoEngineListener != null) {
                                tTVideoEngine.mVideoEngineListener.onLoadStateChanged(tTVideoEngine, i2);
                            }
                            if (tTVideoEngine.mSimpleCallback != null) {
                                tTVideoEngine.mSimpleCallback.onLoadStateChanged(tTVideoEngine, i2);
                                break;
                            }
                        }
                        break;
                    case 402:
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onVideoSizeChanged(tTVideoEngine, message.arg1, message.arg2);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onVideoSizeChanged(tTVideoEngine, message.arg1, message.arg2);
                            break;
                        }
                        break;
                    case 403:
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onBufferingUpdate(tTVideoEngine, message.arg1);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onBufferingUpdate(tTVideoEngine, message.arg1);
                            break;
                        }
                        break;
                    case 404:
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onPrepare(tTVideoEngine);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onPrepare(tTVideoEngine);
                            break;
                        }
                        break;
                    case 405:
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onPrepared(tTVideoEngine);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onPrepared(tTVideoEngine);
                            break;
                        }
                        break;
                    case 406:
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (str2 == tTVideoEngine.mTraceId) {
                                if (tTVideoEngine.mVideoEngineListener != null) {
                                    TTVideoEngineLog.m256505i("TTVideoEngineLooperThread", "notify render start");
                                    tTVideoEngine.mVideoEngineListener.onRenderStart(tTVideoEngine);
                                }
                                if (tTVideoEngine.mSimpleCallback != null) {
                                    TTVideoEngineLog.m256505i("TTVideoEngineLooperThread", "notify render start");
                                    tTVideoEngine.mSimpleCallback.onRenderStart(tTVideoEngine);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "MSG_NOTIFY_RENDER_START engine:" + tTVideoEngine + ", traceId not same, should be:" + str2 + ", now:" + tTVideoEngine.mTraceId);
                                break;
                            }
                        }
                        break;
                    case 407:
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onStreamChanged(tTVideoEngine, message.arg1);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onStreamChanged(tTVideoEngine, message.arg1);
                            break;
                        }
                        break;
                    case 408:
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onCompletion(tTVideoEngine);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onCompletion(tTVideoEngine);
                            break;
                        }
                        break;
                    case 409:
                        Error error = (Error) obj;
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onError(error);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onError(error);
                            break;
                        }
                        break;
                    case 410:
                        if (tTVideoEngine.mVideoEngineListener != null) {
                            tTVideoEngine.mVideoEngineListener.onVideoStatusException(message.arg1);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onVideoStatusException(message.arg1);
                            break;
                        }
                        break;
                    case TTVideoEngine.PLAYER_OPTION_USE_THREAD_POOL /*{ENCODED_INT: 411}*/:
                        VideoModel videoModel = (VideoModel) obj;
                        if (tTVideoEngine.mVideoInfoListener != null) {
                            boolean onFetchedVideoInfo = tTVideoEngine.mVideoInfoListener.onFetchedVideoInfo(videoModel);
                            TTVideoEngineLooperThread.this.mMainMsgRetValue.setDataPosition(0);
                            TTVideoEngineLooperThread.this.mMainMsgRetValue.writeInt(onFetchedVideoInfo ? 1 : 0);
                            break;
                        }
                        break;
                    case TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC /*{ENCODED_INT: 412}*/:
                        if (tTVideoEngine.mVideoEngineInfoListener != null) {
                            tTVideoEngine.mVideoEngineInfoListener.onVideoEngineInfos((VideoEngineInfos) obj);
                            break;
                        }
                        break;
                    case TTVideoEngine.PLAYER_OPTION_ENABEL_HARDWARE_DECODE_AUDIO /*{ENCODED_INT: 413}*/:
                        Error error2 = (Error) obj;
                        if (map != null && map.containsKey("paramObj1")) {
                            str = (String) map.get("paramObj1");
                        }
                        if (tTVideoEngine.mVideoRouteListener != null) {
                            tTVideoEngine.mVideoRouteListener.onFailed(error2, str);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onVideoURLRouteFailed(error2, str);
                            break;
                        }
                        break;
                    case TTVideoEngine.PLAYER_OPTION_DEFAULT_RENDER_TYPE /*{ENCODED_INT: 414}*/:
                        if (message.arg1 == 1) {
                            z = true;
                        }
                        if (tTVideoEngine.mSeekCompletionListener != null) {
                            tTVideoEngine.mSeekCompletionListener.onCompletion(z);
                            tTVideoEngine.mSeekCompletionListener = null;
                            break;
                        }
                        break;
                    case 415:
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            int intValue = ((Integer) map2.get("bufferStartAction")).intValue();
                            String str3 = (String) map2.get("traceid");
                            if (str3 == tTVideoEngine.mTraceId) {
                                if (tTVideoEngine.mVideoBufferListener != null) {
                                    tTVideoEngine.mVideoBufferListener.onBufferStart(message.arg1);
                                }
                                if (tTVideoEngine.mVideoBufferDetailListener != null) {
                                    tTVideoEngine.mVideoBufferDetailListener.onBufferStart(message.arg1, message.arg2, intValue);
                                }
                                if (tTVideoEngine.mSimpleCallback != null) {
                                    tTVideoEngine.mSimpleCallback.onBufferStart(message.arg1, message.arg2, intValue);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "MSG_NOTIFY_BUFFER_START engine:" + tTVideoEngine + ", traceId not same, should be:" + str3 + ", now:" + tTVideoEngine.mTraceId);
                                break;
                            }
                        }
                        break;
                    case 416:
                        if (tTVideoEngine.mVideoBufferListener != null) {
                            tTVideoEngine.mVideoBufferListener.onBufferEnd(message.arg1);
                        }
                        if (tTVideoEngine.mVideoBufferDetailListener != null) {
                            tTVideoEngine.mVideoBufferDetailListener.onBufferEnd(message.arg1);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onBufferEnd(message.arg1);
                            break;
                        }
                        break;
                    case 417:
                        Resolution resolution = (Resolution) obj;
                        if (tTVideoEngine.mStreamInfoListener != null) {
                            tTVideoEngine.mStreamInfoListener.onVideoStreamBitrateChanged(resolution, message.arg1);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onVideoStreamBitrateChanged(resolution, message.arg1);
                            break;
                        }
                        break;
                    case 418:
                        if (tTVideoEngine.mSARChangeListener != null) {
                            tTVideoEngine.mSARChangeListener.onSARChanged(message.arg1, message.arg2);
                        }
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onSARChanged(message.arg1, message.arg2);
                            break;
                        }
                        break;
                    case 419:
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onReadyForDisplay(tTVideoEngine);
                            break;
                        }
                        break;
                    case 420:
                        Map map3 = (Map) obj;
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onAVBadInterlaced(map3);
                            break;
                        }
                        break;
                    default:
                        TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "unknown message: " + message.what);
                        break;
                }
            } else {
                if (tTVideoEngine.mABRListener != null) {
                    tTVideoEngine.mABRListener.onPredictBitrate(message.arg1, message.arg2);
                }
                if (tTVideoEngine.mSimpleCallback != null) {
                    tTVideoEngine.mSimpleCallback.onABRPredictBitrate(message.arg1, message.arg2);
                }
            }
            TTVideoEngineLooperThread tTVideoEngineLooperThread = TTVideoEngineLooperThread.this;
            tTVideoEngineLooperThread.notifyMsgComplete(tTVideoEngineLooperThread.mMainMsgLock, condition);
        }

        public MyMainLooperHandler(TTVideoEngine tTVideoEngine) {
            this.mEngineRef = new WeakReference<>(tTVideoEngine);
        }
    }

    /* access modifiers changed from: private */
    public class MessageHandler extends Handler {
        private WeakReference<TTVideoEngine> mEngineRef;

        public void handleMessage(Message message) {
            Object obj;
            Condition condition;
            Map map;
            String str;
            String str2;
            TTVideoEngine tTVideoEngine = this.mEngineRef.get();
            if (tTVideoEngine == null) {
                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "engine is null, return.");
                return;
            }
            Map<Integer, String> map2 = null;
            r3 = null;
            String str3 = null;
            r3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            map2 = null;
            if (message.obj != null) {
                map = (Map) message.obj;
                if (map.containsKey("msgCond")) {
                    condition = (Condition) map.get("msgCond");
                } else {
                    condition = null;
                }
                if (map.containsKey("paramObj")) {
                    obj = map.get("paramObj");
                } else {
                    obj = null;
                }
            } else {
                map = null;
                condition = null;
                obj = null;
            }
            int i = message.what;
            if (i != 300) {
                if (i != 301) {
                    boolean z = true;
                    switch (i) {
                        case 1:
                            tTVideoEngine._doPlay();
                            break;
                        case 2:
                            tTVideoEngine._doPause();
                            break;
                        case 3:
                            tTVideoEngine._doStop();
                            break;
                        case 4:
                            tTVideoEngine._doRelease();
                            break;
                        case 5:
                            tTVideoEngine._doReleaseAsync();
                            break;
                        case 6:
                            if (message.arg1 != 1) {
                                z = false;
                            }
                            tTVideoEngine._doSetLooping(z);
                            break;
                        case 7:
                            tTVideoEngine._seekTo(message.arg1, false);
                            break;
                        case 8:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_configResolution invalid param");
                                break;
                            } else {
                                Resolution resolution = (Resolution) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    map2 = (Map) map.get("paramObj1");
                                }
                                tTVideoEngine._switchToResolution(resolution, map2);
                                break;
                            }
                        case 9:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_setPlayerVolume invalid param");
                                break;
                            } else {
                                float floatValue = ((Float) obj).floatValue();
                                if (map != null && map.containsKey("paramObj1")) {
                                    tTVideoEngine._setPlayerVolume(floatValue, ((Float) map.get("paramObj1")).floatValue());
                                    break;
                                } else {
                                    tTVideoEngine._setPlayerVolume(floatValue, floatValue);
                                    break;
                                }
                            }
                        case 10:
                            if (message.arg1 != 1) {
                                z = false;
                            }
                            tTVideoEngine._setPlayerMute(z);
                            break;
                        case 11:
                            tTVideoEngine._pauseByInterruption();
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetDataSource invalid param");
                                break;
                            } else {
                                tTVideoEngine._doSetDataSource((FileDescriptor) obj);
                                break;
                            }
                        case 13:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetDataSource invalid param");
                                break;
                            } else {
                                tTVideoEngine._doSetDataSource((IMediaDataSource) obj);
                                break;
                            }
                        case 14:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetVideoID invalid param");
                                break;
                            } else {
                                tTVideoEngine._doSetVideoID((String) obj);
                                break;
                            }
                        case 15:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetVideoID invalid param");
                                break;
                            } else {
                                tTVideoEngine._doSetPreloaderItem((TTAVPreloaderItem) obj);
                                break;
                            }
                        case 16:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetVideoModel invalid param");
                                break;
                            } else {
                                tTVideoEngine._doSetVideoModel((VideoModel) obj);
                                break;
                            }
                        case 17:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetPlayItem invalid param");
                                break;
                            } else {
                                tTVideoEngine._doSetPlayItem((TTVideoEnginePlayItem) obj);
                                break;
                            }
                        case 18:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetLocalURL invalid param");
                                break;
                            } else {
                                tTVideoEngine._doSetLocalURL((String) obj);
                                break;
                            }
                        case 19:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetDirectURL invalid param");
                                break;
                            } else {
                                String str7 = (String) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    tTVideoEngine._doSetDirectURL(str7, (String) map.get("paramObj1"));
                                    break;
                                } else {
                                    tTVideoEngine._doSetDirectURL(str7);
                                    break;
                                }
                            }
                            break;
                        case 20:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                break;
                            } else {
                                String[] strArr = (String[]) obj;
                                if (map != null) {
                                    if (map.containsKey("paramObj1")) {
                                        str2 = (String) map.get("paramObj1");
                                    } else {
                                        str2 = null;
                                    }
                                    if (map.containsKey("paramObj2")) {
                                        str5 = (String) map.get("paramObj2");
                                    }
                                    str6 = str2;
                                    str = str5;
                                } else {
                                    str = null;
                                }
                                tTVideoEngine._doSetDirectUrlUseDataLoader(strArr, str6, str);
                                break;
                            }
                        case 21:
                            if (obj == null) {
                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                break;
                            } else {
                                String str8 = (String) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    str4 = (String) map.get("paramObj1");
                                }
                                tTVideoEngine.setDirectUrlUseDataLoaderByFilePath(new String[]{str8}, str4);
                                break;
                            }
                        case 22:
                            tTVideoEngine._doPrepare();
                            break;
                        case 23:
                            tTVideoEngine._doStart();
                            break;
                        case 24:
                            tTVideoEngine._doHeartBeatThings();
                            break;
                        default:
                            switch (i) {
                                case MmListControl.f116813f:
                                    if (message.arg1 != 1) {
                                        z = false;
                                    }
                                    tTVideoEngine._doSetAsyncInit(z, message.arg2);
                                    break;
                                case 51:
                                    if (obj == null) {
                                        TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_setUnSupportSampleRates invalid param");
                                        break;
                                    } else {
                                        tTVideoEngine._setUnSupportSampleRates((int[]) obj);
                                        break;
                                    }
                                case 52:
                                    tTVideoEngine._doSetTestSpeedEnbale(message.arg1);
                                    break;
                                case 53:
                                    if (obj == null) {
                                        TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetPlaybackParams invalid param");
                                        break;
                                    } else {
                                        tTVideoEngine._doSetPlaybackParams((PlaybackParams) obj);
                                        break;
                                    }
                                case 54:
                                    tTVideoEngine._doSetSurface((Surface) obj);
                                    break;
                                case 55:
                                    tTVideoEngine._doSetSurfaceHolder((SurfaceHolder) obj);
                                    break;
                                case 56:
                                    tTVideoEngine._doSetPlayerSurface((Surface) obj, message.arg1);
                                    break;
                                case 57:
                                    String str9 = (String) obj;
                                    if (map != null && map.containsKey("paramObj1")) {
                                        str3 = (String) map.get("paramObj1");
                                    }
                                    tTVideoEngine._doSetCustomHeader(str9, str3);
                                    break;
                                default:
                                    switch (i) {
                                        case 101:
                                            tTVideoEngine._doSetIntOption(message.arg1, message.arg2);
                                            break;
                                        case 102:
                                            if (obj == null) {
                                                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetLongOption invalid param for key:" + message.arg1);
                                                break;
                                            } else {
                                                tTVideoEngine._doSetLongOption(message.arg1, ((Long) obj).longValue());
                                                break;
                                            }
                                        case 103:
                                            int _doGetIntOption = tTVideoEngine._doGetIntOption(message.arg1);
                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeInt(_doGetIntOption);
                                            break;
                                        case 104:
                                            long _doGetLongOption = tTVideoEngine._doGetLongOption(message.arg1);
                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeLong(_doGetLongOption);
                                            break;
                                        default:
                                            switch (i) {
                                                case 106:
                                                    float _doGetFloatOption = tTVideoEngine._doGetFloatOption(message.arg1);
                                                    TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                                    TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeFloat(_doGetFloatOption);
                                                    break;
                                                case ActivityIdentificationData.WALKING:
                                                    String _doGetStringOption = tTVideoEngine._doGetStringOption(message.arg1);
                                                    TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                                    TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeString(_doGetStringOption);
                                                    break;
                                                case 108:
                                                    if (obj == null) {
                                                        TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doSetStrungOption invalid param for key:" + message.arg1);
                                                        break;
                                                    } else {
                                                        tTVideoEngine._doSetStringOption(message.arg1, (String) obj);
                                                        break;
                                                    }
                                                default:
                                                    switch (i) {
                                                        case 150:
                                                            boolean _doIsSystemPlayer = tTVideoEngine._doIsSystemPlayer();
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeInt(_doIsSystemPlayer ? 1 : 0);
                                                            break;
                                                        case 151:
                                                            int _doGetCurrentPlaybackTime = tTVideoEngine._doGetCurrentPlaybackTime();
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeInt(_doGetCurrentPlaybackTime);
                                                            break;
                                                        case 152:
                                                            int videoWidth = tTVideoEngine.getVideoWidth();
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeInt(videoWidth);
                                                            break;
                                                        case 153:
                                                            int videoHeight = tTVideoEngine.getVideoHeight();
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeInt(videoHeight);
                                                            break;
                                                        case 154:
                                                            JSONObject _doGetPlayErrorInfo = tTVideoEngine._doGetPlayErrorInfo();
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeValue(_doGetPlayErrorInfo);
                                                            break;
                                                        case 155:
                                                            boolean _doIsMute = tTVideoEngine._doIsMute();
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.setDataPosition(0);
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeInt(_doIsMute ? 1 : 0);
                                                            break;
                                                        case 156:
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeInt(tTVideoEngine._doSupportByteVC1Playback() ? 1 : 0);
                                                            break;
                                                        case 157:
                                                            TTVideoEngineLooperThread.this.mEngineMsgRetValue.writeInt(tTVideoEngine._doSupportByteVC2Playback() ? 1 : 0);
                                                            break;
                                                        default:
                                                            TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "unknown message: " + message.what);
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else if (obj != null) {
                    tTVideoEngine._doParseIPAddress((VideoModel) obj);
                } else {
                    TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doParseDNSComplete no model");
                }
            } else if (obj != null) {
                tTVideoEngine._doParseDNSComplete((String) obj);
            } else {
                TTVideoEngineLog.m256508w("TTVideoEngineLooperThread", "_doParseDNSComplete invalid param");
            }
            TTVideoEngineLooperThread tTVideoEngineLooperThread = TTVideoEngineLooperThread.this;
            tTVideoEngineLooperThread.notifyMsgComplete(tTVideoEngineLooperThread.mEngineMsgLock, condition);
        }

        public MessageHandler(TTVideoEngine tTVideoEngine) {
            this.mEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public MessageHandler(TTVideoEngine tTVideoEngine, Looper looper) {
            super(looper);
            this.mEngineRef = new WeakReference<>(tTVideoEngine);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyMsgComplete(Lock lock, Condition condition) {
        if (condition != null) {
            lock.lock();
            condition.signal();
            lock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void postEngineMessage(int i, int i2) {
        postEngineMessage(i, i2, 0, null);
    }

    /* access modifiers changed from: package-private */
    public void postEngineMessageDelay(int i, int i2) {
        postEngineMessageDelay(i, 0, 0, null, null, i2);
    }

    /* access modifiers changed from: package-private */
    public boolean sendEngineMessage(int i, long j) {
        return sendEngineMessage(i, j, 0, 0, null);
    }

    /* access modifiers changed from: package-private */
    public void postEngineMessage(int i, int i2, int i3) {
        postEngineMessage(i, i2, i3, null);
    }

    /* access modifiers changed from: package-private */
    public boolean sendEngineMessage(int i, long j, int i2) {
        return sendEngineMessage(i, j, i2, 0, null);
    }

    /* access modifiers changed from: package-private */
    public void postMainLooperMessage(int i, int i2, int i3, Object obj) {
        postMainLooperMessage(i, i2, i3, obj, null);
    }

    /* access modifiers changed from: package-private */
    public void postEngineMessage(int i, int i2, int i3, Object obj) {
        postEngineMessage(i, i2, i3, obj, null);
    }

    /* access modifiers changed from: package-private */
    public boolean sendEngineMessage(int i, long j, int i2, int i3) {
        return sendEngineMessage(i, j, i2, i3, null);
    }

    /* access modifiers changed from: package-private */
    public void sendMainLooperMessage(int i, int i2, int i3, Object obj) {
        if (this.mMainLooperHandler != null) {
            HashMap hashMap = new HashMap();
            Condition newCondition = this.mMainMsgLock.newCondition();
            Message obtainMessage = this.mMainLooperHandler.obtainMessage(i, i2, i3);
            hashMap.put("paramObj", obj);
            hashMap.put("msgCond", newCondition);
            try {
                this.mMainMsgLock.lock();
                this.mIsHandlingMainMsg = true;
                obtainMessage.obj = hashMap;
                obtainMessage.sendToTarget();
                newCondition.await();
                this.mIsHandlingMainMsg = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mMainMsgLock.unlock();
                throw th;
            }
            this.mMainMsgLock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void postMainLooperMessage(int i, int i2, int i3, Object obj, Object obj2) {
        if (this.mMainLooperHandler != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            Message obtainMessage = this.mMainLooperHandler.obtainMessage(i, i2, i3);
            obtainMessage.obj = hashMap;
            obtainMessage.sendToTarget();
        }
    }

    /* access modifiers changed from: package-private */
    public void postEngineMessage(int i, int i2, int i3, Object obj, Object obj2) {
        postEngineMessage(i, i2, i3, obj, obj2, null);
    }

    /* access modifiers changed from: package-private */
    public boolean sendEngineMessage(int i, long j, int i2, int i3, Object obj) {
        return sendEngineMessage(i, j, i2, i3, obj, null);
    }

    /* access modifiers changed from: package-private */
    public void postEngineMessageDelay(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        Handler handler;
        if (this.mEngine.mState != 5 && (handler = this.mEngineMsgHandler) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            Message obtainMessage = handler.obtainMessage(i, i2, i3);
            obtainMessage.obj = hashMap;
            handler.postDelayed(new RunableMsgHandler(handler, obtainMessage), (long) i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void postEngineMessage(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        Handler handler;
        if (this.mEngine.mState != 5 && (handler = this.mEngineMsgHandler) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paramObj", obj);
            if (obj2 != null) {
                hashMap.put("paramObj1", obj2);
            }
            if (obj3 != null) {
                hashMap.put("paramObj2", obj3);
            }
            Message obtainMessage = handler.obtainMessage(i, i2, i3);
            obtainMessage.obj = hashMap;
            obtainMessage.sendToTarget();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r5.mEngine.mState == 5) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        if (r5.mEngine.mState == 5) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        r5.mCondList.remove(r3);
        r5.mEngineMsgLock.unlock();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendEngineMessage(int r6, long r7, int r9, int r10, java.lang.Object r11, java.lang.Object r12) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngineLooperThread.sendEngineMessage(int, long, int, int, java.lang.Object, java.lang.Object):boolean");
    }
}
