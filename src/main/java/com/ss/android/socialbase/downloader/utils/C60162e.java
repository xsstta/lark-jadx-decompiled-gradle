package com.ss.android.socialbase.downloader.utils;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbstractC60024b;
import com.ss.android.socialbase.downloader.depend.AbstractC60026d;
import com.ss.android.socialbase.downloader.depend.AbstractC60027e;
import com.ss.android.socialbase.downloader.depend.AbstractC60028f;
import com.ss.android.socialbase.downloader.depend.AbstractC60029g;
import com.ss.android.socialbase.downloader.depend.AbstractC60030h;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.AbstractC60032j;
import com.ss.android.socialbase.downloader.depend.AbstractC60033k;
import com.ss.android.socialbase.downloader.depend.AbstractC60034l;
import com.ss.android.socialbase.downloader.depend.AbstractC60035m;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.AbstractC60040r;
import com.ss.android.socialbase.downloader.depend.AbstractC60042t;
import com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlListener;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback;
import com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback;
import com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator;
import com.ss.android.socialbase.downloader.depend.ProcessAidlCallback;
import com.ss.android.socialbase.downloader.downloader.AbstractC60058h;
import com.ss.android.socialbase.downloader.downloader.AbstractC60067q;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadAidlTask;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.utils.e */
public class C60162e {

    /* renamed from: a */
    public static Handler f150158a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static DownloadAidlTask m233855a(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return null;
        }
        return new IPCUtils$1(downloadTask);
    }

    /* renamed from: a */
    public static IDownloadNotificationEventAidlListener m233837a(AbstractC60036n nVar) {
        if (nVar == null) {
            return null;
        }
        return new IPCUtils$3(nVar);
    }

    /* renamed from: a */
    public static INotificationClickAidlCallback m233838a(AbstractC60040r rVar) {
        if (rVar == null) {
            return null;
        }
        return new IPCUtils$4(rVar);
    }

    /* renamed from: a */
    public static IRetryDelayTimeAidlCalculator m233839a(AbstractC60067q qVar) {
        if (qVar == null) {
            return null;
        }
        return new IPCUtils$5(qVar);
    }

    /* renamed from: a */
    public static IDownloadForbiddenAidlHandler m233835a(AbstractC60033k kVar) {
        if (kVar == null) {
            return null;
        }
        return new IPCUtils$6(kVar);
    }

    /* renamed from: a */
    public static AbstractC60032j m233846a(final IDownloadForbiddenAidlCallback iDownloadForbiddenAidlCallback) {
        if (iDownloadForbiddenAidlCallback == null) {
            return null;
        }
        return new AbstractC60032j() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.AnonymousClass15 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60032j
            /* renamed from: a */
            public boolean mo204503a() {
                try {
                    return iDownloadForbiddenAidlCallback.hasCallback();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60032j
            /* renamed from: a */
            public void mo204502a(List<String> list) {
                try {
                    iDownloadForbiddenAidlCallback.onCallback(list);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60028f m233843a(final IDownloadDiskSpaceAidlCallback iDownloadDiskSpaceAidlCallback) {
        if (iDownloadDiskSpaceAidlCallback == null) {
            return null;
        }
        return new AbstractC60028f() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601631 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60028f
            /* renamed from: a */
            public void mo204510a() {
                try {
                    iDownloadDiskSpaceAidlCallback.onDiskCleaned();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public static DownloadTask m233856a(DownloadAidlTask downloadAidlTask) {
        if (downloadAidlTask == null) {
            return null;
        }
        try {
            DownloadTask downloadTask = new DownloadTask(downloadAidlTask.getDownloadInfo());
            downloadTask.chunkStategy(m233853a(downloadAidlTask.getChunkStrategy())).notificationEventListener(m233850a(downloadAidlTask.getDownloadNotificationEventListener())).interceptor(m233848a(downloadAidlTask.getInterceptor())).depend(m233842a(downloadAidlTask.getDepend())).monitorDepend(m233849a(downloadAidlTask.getMonitorDepend())).forbiddenHandler(m233847a(downloadAidlTask.getForbiddenHandler())).diskSpaceHandler(m233844a(downloadAidlTask.getDiskSpaceHandler())).fileUriProvider(m233845a(downloadAidlTask.getFileProvider())).notificationClickCallback(m233851a(downloadAidlTask.getNotificationClickCallback())).retryDelayTimeCalculator(m233854a(downloadAidlTask.getRetryDelayTimeCalculator())).downloadCompleteHandler(m233841a(downloadAidlTask.getDownloadCompleteAidlHandler()));
            IDownloadAidlListener singleDownloadListener = downloadAidlTask.getSingleDownloadListener(ListenerType.MAIN.ordinal());
            if (singleDownloadListener != null) {
                downloadTask.mainThreadListenerWithHashCode(singleDownloadListener.hashCode(), m233836a(singleDownloadListener));
            }
            IDownloadAidlListener singleDownloadListener2 = downloadAidlTask.getSingleDownloadListener(ListenerType.SUB.ordinal());
            if (singleDownloadListener2 != null) {
                downloadTask.subThreadListenerWithHashCode(singleDownloadListener2.hashCode(), m233836a(singleDownloadListener2));
            }
            IDownloadAidlListener singleDownloadListener3 = downloadAidlTask.getSingleDownloadListener(ListenerType.NOTIFICATION.ordinal());
            if (singleDownloadListener3 != null) {
                downloadTask.notificationListenerWithHashCode(singleDownloadListener3.hashCode(), m233836a(singleDownloadListener3));
            }
            m233857a(downloadTask, downloadAidlTask, ListenerType.MAIN);
            m233857a(downloadTask, downloadAidlTask, ListenerType.SUB);
            m233857a(downloadTask, downloadAidlTask, ListenerType.NOTIFICATION);
            return downloadTask;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static void m233857a(DownloadTask downloadTask, DownloadAidlTask downloadAidlTask, ListenerType listenerType) throws RemoteException {
        SparseArray<IDownloadListener> sparseArray = new SparseArray<>();
        for (int i = 0; i < downloadAidlTask.getDownloadListenerSize(listenerType.ordinal()); i++) {
            IDownloadAidlListener downloadListenerByIndex = downloadAidlTask.getDownloadListenerByIndex(listenerType.ordinal(), i);
            if (downloadListenerByIndex != null) {
                sparseArray.put(downloadListenerByIndex.getOriginHashCode(), m233836a(downloadListenerByIndex));
            }
        }
        downloadTask.setDownloadListeners(sparseArray, listenerType);
    }

    /* renamed from: a */
    public static AbstractC60036n m233850a(final IDownloadNotificationEventAidlListener iDownloadNotificationEventAidlListener) {
        if (iDownloadNotificationEventAidlListener == null) {
            return null;
        }
        return new AbstractC60036n() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601642 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60036n
            /* renamed from: a */
            public String mo204518a() {
                try {
                    return iDownloadNotificationEventAidlListener.getNotifyProcessName();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60036n
            /* renamed from: a */
            public boolean mo204520a(boolean z) {
                try {
                    return iDownloadNotificationEventAidlListener.interceptAfterNotificationSuccess(z);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60036n
            /* renamed from: a */
            public void mo204519a(int i, DownloadInfo downloadInfo, String str, String str2) {
                try {
                    iDownloadNotificationEventAidlListener.onNotificationEvent(i, downloadInfo, str, str2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60026d m233841a(final IDownloadCompleteAidlHandler iDownloadCompleteAidlHandler) {
        if (iDownloadCompleteAidlHandler == null) {
            return null;
        }
        return new AbstractC60026d() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601653 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60026d
            /* renamed from: a */
            public void mo204507a(DownloadInfo downloadInfo) throws BaseException {
                try {
                    iDownloadCompleteAidlHandler.handle(downloadInfo);
                } catch (RemoteException e) {
                    throw new BaseException(1008, e);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60026d
            /* renamed from: b */
            public boolean mo204508b(DownloadInfo downloadInfo) {
                try {
                    return iDownloadCompleteAidlHandler.needHandle(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60040r m233851a(final INotificationClickAidlCallback iNotificationClickAidlCallback) {
        if (iNotificationClickAidlCallback == null) {
            return null;
        }
        return new AbstractC60040r() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601664 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60040r
            /* renamed from: a */
            public boolean mo204525a(DownloadInfo downloadInfo) {
                try {
                    return iNotificationClickAidlCallback.onClickWhenUnSuccess(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60040r
            /* renamed from: b */
            public boolean mo204526b(DownloadInfo downloadInfo) {
                try {
                    return iNotificationClickAidlCallback.onClickWhenSuccess(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60040r
            /* renamed from: c */
            public boolean mo204527c(DownloadInfo downloadInfo) {
                try {
                    return iNotificationClickAidlCallback.onClickWhenInstalled(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60058h m233853a(final IChunkCntAidlCalculator iChunkCntAidlCalculator) {
        if (iChunkCntAidlCalculator == null) {
            return null;
        }
        return new AbstractC60058h() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601675 */

            @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60058h
            /* renamed from: a */
            public int mo204770a(long j) {
                try {
                    return iChunkCntAidlCalculator.calculateChunkCount(j);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60027e m233842a(final IDownloadAidlDepend iDownloadAidlDepend) {
        if (iDownloadAidlDepend == null) {
            return null;
        }
        return new AbstractC60027e() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601686 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60027e
            /* renamed from: a */
            public void mo204509a(DownloadInfo downloadInfo, BaseException baseException, int i) {
                if (downloadInfo != null) {
                    try {
                        iDownloadAidlDepend.monitorLogSend(downloadInfo, baseException, i);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60035m m233849a(final IDownloadAidlMonitorDepend iDownloadAidlMonitorDepend) {
        if (iDownloadAidlMonitorDepend == null) {
            return null;
        }
        return new AbstractC60024b() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601697 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60024b
            /* renamed from: a */
            public int[] mo204504a() {
                try {
                    return iDownloadAidlMonitorDepend.getAdditionalMonitorStatus();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60035m
            /* renamed from: b */
            public String mo204517b() {
                try {
                    return iDownloadAidlMonitorDepend.getEventPage();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return "";
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60035m
            /* renamed from: a */
            public void mo204516a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    try {
                        iDownloadAidlMonitorDepend.monitorLogSend(jSONObject.toString());
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60033k m233847a(final IDownloadForbiddenAidlHandler iDownloadForbiddenAidlHandler) {
        if (iDownloadForbiddenAidlHandler == null) {
            return null;
        }
        return new AbstractC60033k() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601708 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60033k
            /* renamed from: a */
            public boolean mo204514a(AbstractC60032j jVar) {
                try {
                    return iDownloadForbiddenAidlHandler.onForbidden(C60162e.m233834a(jVar));
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static IDownloadForbiddenAidlCallback m233834a(AbstractC60032j jVar) {
        if (jVar == null) {
            return null;
        }
        return new IPCUtils$23(jVar);
    }

    /* renamed from: a */
    public static ProcessAidlCallback m233840a(AbstractC60042t tVar) {
        if (tVar == null) {
            return null;
        }
        return new IPCUtils$24(tVar);
    }

    /* renamed from: a */
    public static AbstractC60042t m233852a(final ProcessAidlCallback processAidlCallback) {
        if (processAidlCallback == null) {
            return null;
        }
        return new AbstractC60042t() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.C601719 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60042t
            /* renamed from: a */
            public void mo204530a(int i, int i2) {
                try {
                    processAidlCallback.callback(i, i2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60029g m233844a(final IDownloadDiskSpaceAidlHandler iDownloadDiskSpaceAidlHandler) {
        if (iDownloadDiskSpaceAidlHandler == null) {
            return null;
        }
        return new AbstractC60029g() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.AnonymousClass10 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60029g
            /* renamed from: a */
            public boolean mo204511a(long j, long j2, AbstractC60028f fVar) {
                try {
                    return iDownloadDiskSpaceAidlHandler.cleanUpDisk(j, j2, C60162e.m233832a(fVar));
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60067q m233854a(final IRetryDelayTimeAidlCalculator iRetryDelayTimeAidlCalculator) {
        if (iRetryDelayTimeAidlCalculator == null) {
            return null;
        }
        return new AbstractC60067q() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.AnonymousClass11 */

            @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60067q
            /* renamed from: a */
            public long mo204838a(int i, int i2) {
                try {
                    return iRetryDelayTimeAidlCalculator.calculateRetryDelayTime(i, i2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60034l m233848a(final IDownloadAidlInterceptor iDownloadAidlInterceptor) {
        if (iDownloadAidlInterceptor == null) {
            return null;
        }
        return new AbstractC60034l() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.AnonymousClass12 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60034l
            /* renamed from: a */
            public boolean mo204515a() {
                try {
                    return iDownloadAidlInterceptor.intercept();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractC60031i m233845a(final IDownloadAidlFileProvider iDownloadAidlFileProvider) {
        if (iDownloadAidlFileProvider == null) {
            return null;
        }
        return new AbstractC60031i() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.AnonymousClass13 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60031i
            /* renamed from: a */
            public Uri mo204513a(String str, String str2) {
                try {
                    return iDownloadAidlFileProvider.getUriForFile(str, str2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };
    }

    /* renamed from: a */
    public static IDownloadListener m233836a(final IDownloadAidlListener iDownloadAidlListener) {
        if (iDownloadAidlListener == null) {
            return null;
        }
        return new AbstractC60030h() {
            /* class com.ss.android.socialbase.downloader.utils.C60162e.AnonymousClass14 */

            @Override // com.ss.android.socialbase.downloader.depend.AbstractC60030h
            /* renamed from: a */
            public void mo204512a(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onWaitingDownloadCompleteHandler(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onCanceled(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onCanceled(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onFirstStart(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onFirstStart(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onFirstSuccess(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onFirstSuccess(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onPause(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onPause(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onPrepare(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onPrepare(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onProgress(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onProgress(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onStart(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onStart(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onSuccessed(DownloadInfo downloadInfo) {
                try {
                    iDownloadAidlListener.onSuccessed(downloadInfo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    iDownloadAidlListener.onFailed(downloadInfo, baseException);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    iDownloadAidlListener.onRetry(downloadInfo, baseException);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    iDownloadAidlListener.onRetryDelay(downloadInfo, baseException);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* renamed from: a */
    public static IChunkCntAidlCalculator m233825a(AbstractC60058h hVar) {
        if (hVar == null) {
            return null;
        }
        return new IPCUtils$13(hVar);
    }

    /* renamed from: a */
    public static IDownloadAidlDepend m233826a(AbstractC60027e eVar) {
        if (eVar == null) {
            return null;
        }
        return new IPCUtils$11(eVar);
    }

    /* renamed from: a */
    public static IDownloadAidlFileProvider m233827a(AbstractC60031i iVar) {
        if (iVar == null) {
            return null;
        }
        return new IPCUtils$7(iVar);
    }

    /* renamed from: a */
    public static IDownloadAidlInterceptor m233828a(AbstractC60034l lVar) {
        if (lVar == null) {
            return null;
        }
        return new IPCUtils$14(lVar);
    }

    /* renamed from: a */
    public static IDownloadAidlMonitorDepend m233830a(AbstractC60035m mVar) {
        if (mVar == null) {
            return null;
        }
        return new IPCUtils$12(mVar);
    }

    /* renamed from: a */
    public static IDownloadCompleteAidlHandler m233831a(AbstractC60026d dVar) {
        if (dVar == null) {
            return null;
        }
        return new IPCUtils$17(dVar);
    }

    /* renamed from: a */
    public static IDownloadDiskSpaceAidlCallback m233832a(AbstractC60028f fVar) {
        if (fVar == null) {
            return null;
        }
        return new IPCUtils$27(fVar);
    }

    /* renamed from: a */
    public static IDownloadDiskSpaceAidlHandler m233833a(AbstractC60029g gVar) {
        if (gVar == null) {
            return null;
        }
        return new IPCUtils$9(gVar);
    }

    /* renamed from: a */
    public static IDownloadAidlListener m233829a(IDownloadListener iDownloadListener, boolean z) {
        if (iDownloadListener == null) {
            return null;
        }
        return new IPCUtils$2(iDownloadListener, z);
    }
}
