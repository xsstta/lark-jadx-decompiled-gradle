package com.ss.ttvideoengine.fetcher;

import android.content.Context;
import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Hashtable;

public class FetcherMaker implements AVMDLFetcherMakerInterface {
    private static Hashtable<String, FetcherBase> sFallbackCenter = new Hashtable<>();
    private final Context mContext;

    public FetcherMaker() {
    }

    public FetcherMaker(Context context) {
        this.mContext = context;
    }

    public static void remove(String str) {
        if (!TextUtils.isEmpty(str)) {
            sFallbackCenter.remove(str);
        }
    }

    @Override // com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface
    public AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3) {
        TTVideoEngineLog.m256505i("FetcherMaker", "getFetcher rawKey " + str + ", fileKey " + str2 + ", oldURL " + str3);
        FetcherBase fetcherBase = sFallbackCenter.get(str);
        if (fetcherBase == null) {
            TTVideoEngineLog.m256505i("FetcherMaker", "getFetcher FetcherBase is null");
            return null;
        }
        String keyseed = fetcherBase.getKeyseed();
        String fallbackAPI = fetcherBase.getFallbackAPI();
        int videoModelVersion = fetcherBase.getVideoModelVersion();
        if (TextUtils.isEmpty(fallbackAPI) || (videoModelVersion != 3 && TextUtils.isEmpty(keyseed))) {
            TTVideoEngineLog.m256505i("FetcherMaker", "getFetcher FetcherBase is error " + fetcherBase);
            return null;
        }
        MDLFetcher mDLFetcher = new MDLFetcher(this.mContext, fallbackAPI, keyseed);
        TTVideoEngineLog.m256505i("FetcherMaker", "return fetcher to mdl " + mDLFetcher);
        return mDLFetcher;
    }

    public static void store(String str, String str2, String str3, int i) {
        TTVideoEngineLog.m256505i("FetcherMaker", "store videoId " + str + ", keyseed " + str2 + ", fallbackAPI " + str3 + ", version " + i);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || (i != 3 && TextUtils.isEmpty(str2))) {
            TTVideoEngineLog.m256505i("FetcherMaker", "mdlFetch store fail");
        } else {
            sFallbackCenter.put(str, new FetcherBase(str2, str3, i));
        }
    }
}
