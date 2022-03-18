package com.ss.ttvideoengine.fetcher.mdlfethcer;

import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FetcherMakerNew implements AVMDLNewFetcherMakerInterface {
    private static final List<WeakReference<MDLFetcherListener>> sFetcherListenerList = new ArrayList();

    private static synchronized MDLFetcherListener getMDLFetchListener(String str) {
        synchronized (FetcherMakerNew.class) {
            for (WeakReference<MDLFetcherListener> weakReference : sFetcherListenerList) {
                MDLFetcherListener mDLFetcherListener = weakReference.get();
                if (mDLFetcherListener != null && TextUtils.equals(str, mDLFetcherListener.getId())) {
                    return mDLFetcherListener;
                }
            }
            return null;
        }
    }

    public static synchronized void storeListener(MDLFetcherListener mDLFetcherListener) {
        synchronized (FetcherMakerNew.class) {
            if (mDLFetcherListener == null) {
                TTVideoEngineLog.m256505i("FetcherMakerNew", "storeListener fetcherListener is null");
                return;
            }
            TTVideoEngineLog.m256505i("FetcherMakerNew", "storeListener " + mDLFetcherListener);
            sFetcherListenerList.add(new WeakReference<>(mDLFetcherListener));
        }
    }

    public static synchronized void removeListener(MDLFetcherListener mDLFetcherListener) {
        synchronized (FetcherMakerNew.class) {
            if (mDLFetcherListener == null) {
                TTVideoEngineLog.m256505i("FetcherMakerNew", "removeListener fetcherListener is null");
                return;
            }
            TTVideoEngineLog.m256505i("FetcherMakerNew", "removeListener " + mDLFetcherListener);
            Iterator<WeakReference<MDLFetcherListener>> it = sFetcherListenerList.iterator();
            while (it.hasNext()) {
                WeakReference<MDLFetcherListener> next = it.next();
                if (next == null || next.get() == null) {
                    it.remove();
                } else if (next.get() == mDLFetcherListener) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface
    public AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3, String str4) {
        TTVideoEngineLog.m256505i("FetcherMakerNew", "getFetcher rawKey " + str + ", fileKey " + str2 + ", engineId " + str4);
        MDLFetcherListener mDLFetchListener = getMDLFetchListener(str4);
        if (mDLFetchListener == null) {
            TTVideoEngineLog.m256503e("FetcherMakerNew", "getFetcher MDLFetcherListener is null");
            return null;
        }
        MDLFetcherNew mDLFetcherNew = new MDLFetcherNew(mDLFetchListener);
        TTVideoEngineLog.m256505i("FetcherMakerNew", "return fetcher to mdl " + mDLFetcherNew);
        return mDLFetcherNew;
    }
}
