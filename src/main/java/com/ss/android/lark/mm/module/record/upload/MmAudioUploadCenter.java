package com.ss.android.lark.mm.module.record.upload;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioFileHelper;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import io.reactivex.AbstractC68307f;
import io.reactivex.BackpressureStrategy;
import io.reactivex.p3457e.C68294a;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004J\b\u0010\u0012\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\u0010H\u0007J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter;", "", "()V", "TAG", "", "isStarted", "Ljava/util/concurrent/ConcurrentHashMap;", "", "stateSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$MmAudioUploadData;", "uploadTaskMap", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager;", "getMmAudioRecordingUploadManager", "objectToken", "removeUploadManager", "", "token", "startUpload", "stopUpload", "subscribeUploadStates", "Lio/reactivex/Flowable;", "MmAudioUploadData", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.upload.a */
public final class MmAudioUploadCenter {

    /* renamed from: a */
    public static final MmAudioUploadCenter f118224a = new MmAudioUploadCenter();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Boolean> f118225b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<String, MmAudioUploadManager> f118226c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static final C68294a<MmAudioUploadData> f118227d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$MmAudioUploadData;", "", "token", "", "uploadState", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$UploadState;", "uploadingProgress", "", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$UploadState;Ljava/lang/Integer;)V", "getToken", "()Ljava/lang/String;", "getUploadState", "()Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$UploadState;", "getUploadingProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$UploadState;Ljava/lang/Integer;)Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$MmAudioUploadData;", "equals", "", "other", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.a$a */
    public static final class MmAudioUploadData {

        /* renamed from: a */
        private final String f118228a;

        /* renamed from: b */
        private final MmAudioUploadManager.UploadState f118229b;

        /* renamed from: c */
        private final Integer f118230c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MmAudioUploadData)) {
                return false;
            }
            MmAudioUploadData aVar = (MmAudioUploadData) obj;
            return Intrinsics.areEqual(this.f118228a, aVar.f118228a) && Intrinsics.areEqual(this.f118229b, aVar.f118229b) && Intrinsics.areEqual(this.f118230c, aVar.f118230c);
        }

        public int hashCode() {
            String str = this.f118228a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            MmAudioUploadManager.UploadState uploadState = this.f118229b;
            int hashCode2 = (hashCode + (uploadState != null ? uploadState.hashCode() : 0)) * 31;
            Integer num = this.f118230c;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "MmAudioUploadData(token=" + this.f118228a + ", uploadState=" + this.f118229b + ", uploadingProgress=" + this.f118230c + ")";
        }

        /* renamed from: a */
        public final String mo164914a() {
            return this.f118228a;
        }

        /* renamed from: b */
        public final MmAudioUploadManager.UploadState mo164915b() {
            return this.f118229b;
        }

        /* renamed from: c */
        public final Integer mo164916c() {
            return this.f118230c;
        }

        public MmAudioUploadData(String str, MmAudioUploadManager.UploadState uploadState, Integer num) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(uploadState, "uploadState");
            this.f118228a = str;
            this.f118229b = uploadState;
            this.f118230c = num;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MmAudioUploadData(String str, MmAudioUploadManager.UploadState uploadState, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uploadState, (i & 4) != 0 ? null : num);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$getMmAudioRecordingUploadManager$1$1", "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadManager$IUploadStateChangeListener;", "onUploadStateChange", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/upload/MmAudioUploadCenter$MmAudioUploadData;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.a$b */
    public static final class C46970b implements MmAudioUploadManager.IUploadStateChangeListener {
        C46970b() {
        }

        @Override // com.ss.android.lark.mm.module.record.upload.MmAudioUploadManager.IUploadStateChangeListener
        /* renamed from: a */
        public void mo164575a(MmAudioUploadData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            MmAudioUploadCenter aVar2 = MmAudioUploadCenter.f118224a;
            MmAudioUploadCenter.f118227d.onNext(aVar);
        }
    }

    private MmAudioUploadCenter() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final synchronized void m185965b() {
        synchronized (MmAudioUploadCenter.class) {
            C45857i.m181676a(RunnableC46971c.f118231a);
        }
    }

    /* renamed from: a */
    public final AbstractC68307f<MmAudioUploadData> mo164912a() {
        AbstractC68307f<MmAudioUploadData> flowable = f118227d.toFlowable(BackpressureStrategy.LATEST);
        Intrinsics.checkExpressionValueIsNotNull(flowable, "stateSubject.toFlowable(…kpressureStrategy.LATEST)");
        return flowable;
    }

    static {
        C68294a<MmAudioUploadData> a = C68294a.m265043a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BehaviorSubject.create()");
        f118227d = a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.upload.a$c */
    static final class RunnableC46971c implements Runnable {

        /* renamed from: a */
        public static final RunnableC46971c f118231a = new RunnableC46971c();

        RunnableC46971c() {
        }

        public final void run() {
            boolean z;
            String a = MmAudioFileHelper.f117976a.mo164598a();
            String str = a;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                MmAudioUploadCenter aVar = MmAudioUploadCenter.f118224a;
                if (MmAudioUploadCenter.f118225b.get(a) != null) {
                    MmAudioUploadCenter aVar2 = MmAudioUploadCenter.f118224a;
                    if (!Intrinsics.areEqual((Object) ((Boolean) MmAudioUploadCenter.f118225b.get(a)), (Object) false)) {
                        return;
                    }
                }
                MmAudioUploadCenter aVar3 = MmAudioUploadCenter.f118224a;
                MmAudioUploadCenter.f118225b.put(a, true);
                C45855f.m181664c("MmAudioUploadCenter", "startUpload, key: " + a);
                MmAudioFileHelper.f117976a.mo164602a(C469721.INSTANCE);
            }
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final synchronized void m185966c() {
        boolean z;
        synchronized (MmAudioUploadCenter.class) {
            String a = MmAudioFileHelper.f117976a.mo164598a();
            String str = a;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = f118225b;
                if (Intrinsics.areEqual((Object) concurrentHashMap.get(a), (Object) true)) {
                    concurrentHashMap.put(a, false);
                    C45855f.m181664c("MmAudioUploadCenter", "stopUpload, key: " + a);
                    Collection<MmAudioUploadManager> values = f118226c.values();
                    Intrinsics.checkExpressionValueIsNotNull(values, "uploadTaskMap.values");
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        it.next().mo164897b();
                    }
                    f118226c.clear();
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo164913b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        f118226c.remove(str);
    }

    /* renamed from: a */
    public final synchronized MmAudioUploadManager mo164911a(String str) {
        MmAudioUploadManager mmAudioUploadManager;
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        ConcurrentHashMap<String, MmAudioUploadManager> concurrentHashMap = f118226c;
        if (!concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
            MmAudioUploadManager mmAudioUploadManager2 = new MmAudioUploadManager();
            concurrentHashMap.put(str, mmAudioUploadManager2);
            C45855f.m181664c("MmAudioUploadCenter", "[getMmAudioRecordingUploadManager] new, token: " + str);
            mmAudioUploadManager = mmAudioUploadManager2;
        } else {
            C45855f.m181664c("MmAudioUploadCenter", "[getMmAudioRecordingUploadManager] from map, token: " + str);
            MmAudioUploadManager mmAudioUploadManager3 = concurrentHashMap.get(str);
            if (mmAudioUploadManager3 != null) {
                mmAudioUploadManager = mmAudioUploadManager3;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        mmAudioUploadManager.mo164893a(new C46970b());
        return mmAudioUploadManager;
    }
}
