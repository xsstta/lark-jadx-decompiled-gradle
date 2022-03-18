package com.ss.android.vc.meeting.framework.meeting.rtcstream;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.lifecycle.C60793b;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.AbstractC60908v;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.bytertc.C61235g;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec;
import com.ss.android.vc.meeting.p3104c.C61246b;
import com.ss.android.vc.net.service.RtcRenderOptimizeService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0012J\u001a\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0007J\u001a\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102J\u0006\u00103\u001a\u00020)J\u0006\u00104\u001a\u00020)J\"\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u0015j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f`\u0017J\u0006\u00106\u001a\u00020\u000bJ\u000e\u00107\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007J\u0010\u00108\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0007J\u0010\u00109\u001a\u0004\u0018\u00010\u001f2\u0006\u0010,\u001a\u00020\u0007J\u000e\u0010:\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007J\u0012\u0010;\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u0007J\u0010\u0010<\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0007J\u0010\u0010=\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0007H\u0002J\u0018\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0016J\u0006\u0010B\u001a\u00020)J\u001a\u0010C\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010D\u001a\u0004\u0018\u00010\u0007J\u0018\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0016J\u001a\u0010J\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010D\u001a\u0004\u0018\u00010\u0007J\b\u0010K\u001a\u00020)H\u0002J\u000e\u0010L\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0012J\u0010\u0010M\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u0007J\u001a\u0010N\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0007J\u001c\u0010O\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010P\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010Q\u001a\u00020)H\u0002J\u0012\u0010R\u001a\u00020)2\b\u0010S\u001a\u0004\u0018\u000100H\u0002J\u0010\u0010T\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u0007J\u0016\u0010U\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u001fJ\u001a\u0010W\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010,\u001a\u0004\u0018\u00010\u0007J\u001a\u0010X\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010,\u001a\u0004\u0018\u00010\u0007J\u0018\u0010Y\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0006\u0010Z\u001a\u00020\u000bJ(\u0010[\u001a\u00020\u000b2\b\u0010V\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010Z\u001a\u00020\u000bJ(\u0010[\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010Z\u001a\u00020\u000bJ2\u0010[\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0006\u0010`\u001a\u00020\r2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000bH\u0002J\u0010\u0010b\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100J\b\u0010c\u001a\u00020\u000bH\u0002J\b\u0010d\u001a\u00020)H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016`\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0019j\b\u0012\u0004\u0012\u00020\u0007`\u001aX\u000e¢\u0006\u0002\n\u0000R*\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0015j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R*\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u0015j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f`\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0005¨\u0006f"}, d2 = {"Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/StreamManagerGlobal;", "Lcom/ss/android/vc/dependency/ILifeCycleDependency$ILifecycleObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mBackgroundSubscribeFG", "", "mIdentity", "", "mInterceptSubscribe", "mIsBackground", "mObservers", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/IResumeSubscribeObserver;", "Lkotlin/collections/ArrayList;", "mPendingStreamMap", "Ljava/util/HashMap;", "Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/VCStream;", "Lkotlin/collections/HashMap;", "mRemoteFlagSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "mRtcJoinIdMap", "mScreenStreamManager", "Lcom/ss/android/vc/meeting/bytertc/VcRtcScreenStreamManager;", "mStreamMap", "Lcom/ss/android/vc/irtc/VcByteStream;", "mStreamSubscriber", "Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/VideoStreamSubscriber;", "mTopRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMeeting", "addObserver", "", "observer", "addScreenStream", "rtcJoinId", "streamId", "bindVideoView", "view", "Landroid/view/View;", "participant", "Lcom/ss/android/vc/entity/Participant;", "clearBindViews", "destroy", "getAllStreams", "getFg", "getRtcJoinId", "getScreenStreamId", "getStream", "getStreamId", "getVCStreamByStreamId", "hasRemoteFlag", "isScreenStream", "onAppLifecycleChanged", "oldState", "Lcom/ss/android/vc/common/lifecycle/VCAppStateInfo;", "newState", "onResumeSubscribe", "onScreenStreamRemove", "streamInfo", "onStateChanged", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onStreamRemove", "release", "removeObserver", "removeRemoteFlag", "removeScreenStream", "removeStream", "removeVCStream", "resumeSubscribeIfNeed", "setLocalViewRenderMode", "localView", "setRemoteFlag", "setStream", "stream", "setupLocalVideoView", "setupRemoteVideoView", "subscribeScreenStream", "isCameraMute", "subscribeStream", "scene", "Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/StreamSpec$Scene;", "res", "Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/StreamSpec$Resolution;", "resolutionIndex", "isMicrophoneMute", "unbindVideoView", "unsubscribeAllStreamsIfCan", "unsubscribeScreenStream", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class StreamManagerGlobal implements AbstractC1168n, AbstractC60908v.AbstractC60910b {

    /* renamed from: a */
    public static final Companion f153617a = new Companion(null);

    /* renamed from: b */
    private final String f153618b = "StreamManagerGlobal";

    /* renamed from: c */
    private final C61319d f153619c;

    /* renamed from: d */
    private C61235g f153620d;

    /* renamed from: e */
    private HashMap<String, VcByteStream> f153621e;

    /* renamed from: f */
    private HashMap<String, String> f153622f;

    /* renamed from: g */
    private HashSet<String> f153623g;

    /* renamed from: h */
    private boolean f153624h;

    /* renamed from: i */
    private boolean f153625i;

    /* renamed from: j */
    private WeakReference<Activity> f153626j;

    /* renamed from: k */
    private final ArrayList<IResumeSubscribeObserver> f153627k;

    /* renamed from: l */
    private final HashMap<String, VCStream> f153628l;

    /* renamed from: m */
    private boolean f153629m;

    /* renamed from: n */
    private int f153630n;

    /* renamed from: o */
    private C61303k f153631o;

    /* renamed from: a */
    public final boolean mo212213a() {
        return true;
    }

    /* renamed from: c */
    public final void mo212222c() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/meeting/framework/meeting/rtcstream/StreamManagerGlobal$Companion;", "", "()V", "createScreenSurface", "Lcom/ss/android/vc/meeting/gesture/GestureSurfaceViewWrapper;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "createSurface", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final View mo212233a() {
            C61237h a = C61237h.m238223a();
            RtcRenderOptimizeService instance = RtcRenderOptimizeService.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "RtcRenderOptimizeService.getInstance()");
            View c = a.mo210531c(instance.isUseSurfaceView());
            C61074b.m237511a(c, C60773o.m236126d(R.color.vc_bg_cam_off));
            Intrinsics.checkExpressionValueIsNotNull(c, "mSurface");
            return c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C61246b mo212234a(C61303k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "meeting");
            C61237h a = C61237h.m238223a();
            RtcRenderOptimizeService instance = RtcRenderOptimizeService.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "RtcRenderOptimizeService.getInstance()");
            View c = a.mo210531c(instance.isUseSurfaceView());
            C60773o.m236126d(R.color.vc_bg_cam_off);
            C61246b a2 = C61237h.m238223a().mo211787a(c, kVar);
            Intrinsics.checkExpressionValueIsNotNull(a2, "VcRtcService.getInstance…Wrapper(surface, meeting)");
            return a2;
        }
    }

    /* renamed from: b */
    public final HashMap<String, VcByteStream> mo212217b() {
        return this.f153621e;
    }

    /* renamed from: g */
    private final void m238750g() {
        C60700b.m235851b(this.f153618b, "[release]", "release");
        this.f153621e.clear();
        this.f153622f.clear();
        this.f153620d.mo211776a();
        this.f153623g.clear();
    }

    /* renamed from: e */
    public final void mo212229e() {
        Iterator<IResumeSubscribeObserver> it = this.f153627k.iterator();
        while (it.hasNext()) {
            it.next().mo212235a();
        }
    }

    /* renamed from: d */
    public final void mo212226d() {
        String str = this.f153618b;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(", destroy ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        C60700b.m235851b(str, "[destroy]", sb.toString());
        m238750g();
    }

    /* renamed from: h */
    private final void m238751h() {
        int size = this.f153628l.size();
        String str = this.f153618b;
        C60700b.m235851b(str, "[resumeSubscribeIfNeed]", "pending:" + size);
        for (VCStream cVar : this.f153628l.values()) {
            boolean a = m238746a(cVar.mo212237a(), cVar.mo212243d(), cVar.mo212242c(), cVar.mo212241b(), false);
            String str2 = this.f153618b;
            C60700b.m235851b(str2, "[resumeSubscribeIfNeed2]", a + ", " + cVar.mo212237a() + ", " + cVar.mo212243d());
        }
        this.f153628l.clear();
        mo212229e();
    }

    /* renamed from: f */
    private final boolean m238749f() {
        if (this.f153631o.mo212057f() != VideoChat.Type.MEET) {
            return false;
        }
        this.f153628l.clear();
        String f = mo212230f(this.f153631o.mo212092J().mo212531c());
        for (VCStream cVar : this.f153619c.mo212248a().values()) {
            if (cVar.mo212241b() && (!Intrinsics.areEqual(cVar.mo212237a(), f)) && !m238753j(cVar.mo212237a())) {
                this.f153628l.put(cVar.mo212237a(), VCStream.m238783a(cVar, null, !cVar.mo212241b(), !cVar.mo212242c(), 0, 9, null));
            }
        }
        for (VCStream cVar2 : this.f153628l.values()) {
            m238746a(cVar2.mo212237a(), cVar2.mo212243d(), false, true, false);
            String str = this.f153618b;
            C60700b.m235851b(str, "[unsubscribeAllStreamsIfCan]", "unsubscribe " + cVar2.mo212237a());
        }
        String str2 = this.f153618b;
        C60700b.m235851b(str2, "[unsubscribeAllStreamsIfCan2]", "unsubscribeAllStreams:" + this.f153628l.size());
        return true;
    }

    /* renamed from: i */
    private final void m238752i(String str) {
        this.f153619c.mo212250b(str);
    }

    /* renamed from: a */
    public final void mo212210a(String str) {
        if (str != null) {
            this.f153623g.add(str);
        }
    }

    /* renamed from: c */
    public final void mo212223c(String str) {
        if (str != null) {
            this.f153623g.remove(str);
        }
    }

    /* renamed from: g */
    public final VCStream mo212231g(String str) {
        return this.f153619c.mo212247a(str);
    }

    /* renamed from: b */
    public final void mo212219b(IResumeSubscribeObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f153627k.remove(aVar);
    }

    /* renamed from: e */
    public final VcByteStream mo212228e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        return this.f153621e.get(str);
    }

    /* renamed from: h */
    public final String mo212232h(String str) {
        String a = this.f153620d.mo211775a(str);
        Intrinsics.checkExpressionValueIsNotNull(a, "mScreenStreamManager.get…mIdByRtcJoinId(rtcJoinId)");
        return a;
    }

    /* renamed from: a */
    public final void mo212207a(View view) {
        if (view != null) {
            this.f153631o.mo212165y().mo211992a(view);
        }
    }

    /* renamed from: d */
    public final String mo212225d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "streamId");
        String str2 = this.f153622f.get(str);
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    /* renamed from: f */
    public final String mo212230f(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        VcByteStream vcByteStream = this.f153621e.get(str);
        if (vcByteStream == null || (str2 = vcByteStream.f152907a) == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: b */
    private final void m238747b(View view) {
        if (C60776r.m236152j()) {
            if (!C60776r.f151963c) {
                if (C60776r.m236152j() && C60776r.m236151i()) {
                    C60776r.f151963c = true;
                }
                if (!C60776r.f151963c) {
                    return;
                }
            }
            if (view == null) {
                return;
            }
            if (!C60776r.m236152j() || !C60776r.m236151i()) {
                C61237h.m238223a().mo210500a(view, 1);
            } else {
                C61237h.m238223a().mo210500a(view, 0);
            }
        }
    }

    /* renamed from: j */
    private final boolean m238753j(String str) {
        if (!this.f153631o.ay().mo216074e()) {
            return false;
        }
        return TextUtils.equals(mo212232h(this.f153631o.mo212092J().mo212534d()), str);
    }

    public StreamManagerGlobal(C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        this.f153631o = kVar;
        this.f153619c = new C61319d(kVar);
        this.f153620d = new C61235g();
        this.f153621e = new HashMap<>();
        this.f153622f = new HashMap<>();
        this.f153623g = new HashSet<>();
        this.f153627k = new ArrayList<>();
        this.f153628l = new HashMap<>();
        this.f153629m = mo212213a();
    }

    /* renamed from: a */
    public final void mo212209a(IResumeSubscribeObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        if (!this.f153627k.contains(aVar)) {
            this.f153627k.add(aVar);
        }
    }

    /* renamed from: b */
    public final boolean mo212221b(String str) {
        return CollectionsKt.contains(this.f153623g, str);
    }

    /* renamed from: d */
    public final void mo212227d(String str, String str2) {
        this.f153620d.mo211778b(str, str2);
    }

    /* renamed from: c */
    public final void mo212224c(String str, String str2) {
        this.f153620d.mo211777a(str, str2);
    }

    /* renamed from: b */
    public final void mo212218b(View view, String str) {
        if (view != null && str != null) {
            C61237h.m238223a().mo210505a(view, true);
            this.f153631o.mo212165y().mo212008b(view, str);
        }
    }

    /* renamed from: e */
    private final void m238748e(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HashMap<String, VcByteStream> hashMap = this.f153621e;
            if (hashMap != null) {
                C69121n.m265993j(hashMap).remove(str);
                HashMap<String, String> hashMap2 = this.f153622f;
                if (hashMap2 != null) {
                    C69121n.m265993j(hashMap2).remove(str2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    /* renamed from: a */
    public final void mo212208a(View view, String str) {
        if (view != null && str != null) {
            m238747b(view);
            this.f153631o.mo212165y().mo211995a(view, str);
            C61074b.m237511a(view, C60773o.m236126d(R.color.vc_bg_cam_off));
        }
    }

    /* renamed from: b */
    public final void mo212220b(String str, String str2) {
        String str3 = this.f153618b;
        C60700b.m235851b(str3, "[onScreenStreamRemove]", str + ", " + str2);
        mo212227d(str, str2);
        if (str2 != null) {
            m238752i(str2);
            this.f153628l.remove(str2);
        }
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60910b
    public void onAppLifecycleChanged(C60793b bVar, C60793b bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "oldState");
        Intrinsics.checkParameterIsNotNull(bVar2, "newState");
        boolean z = !bVar2.f152000b;
        this.f153624h = z;
        Activity activity = null;
        this.f153626j = null;
        if (z) {
            this.f153626j = new WeakReference<>(VCAppLifeCycle.m236256c());
        }
        String str = this.f153618b;
        StringBuilder sb = new StringBuilder();
        sb.append("isBackground:");
        sb.append(this.f153624h);
        sb.append(", topAct:");
        WeakReference<Activity> weakReference = this.f153626j;
        if (weakReference != null) {
            activity = weakReference.get();
        }
        sb.append(activity);
        C60700b.m235851b(str, "[onAppLifecycleChanged]", sb.toString());
    }

    /* renamed from: a */
    public final void mo212211a(String str, VcByteStream vcByteStream) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        Intrinsics.checkParameterIsNotNull(vcByteStream, "stream");
        this.f153621e.put(str, vcByteStream);
        if (vcByteStream.f152907a != null) {
            String str2 = vcByteStream.f152907a;
            Intrinsics.checkExpressionValueIsNotNull(str2, "stream.streamId");
            this.f153622f.put(str2, str);
        }
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        String str = this.f153618b;
        C60700b.m235851b(str, "[onStateChanged]", lifecycleOwner + ", " + event + ", " + this.f153629m);
        int i = C61318b.f153633b[event.ordinal()];
        if (i == 1) {
            this.f153630n = lifecycleOwner.hashCode();
            this.f153625i = false;
        } else if (i != 2) {
            if (i == 3) {
                if (this.f153631o.aE().mo208293c()) {
                    this.f153631o.aw().mo216155j();
                    this.f153631o.ax().mo214360n();
                }
                this.f153631o.ax().mo214339e(false);
                if (this.f153629m || this.f153631o.aE().mo208293c()) {
                    this.f153625i = m238749f();
                }
            } else if (i == 4) {
                this.f153625i = false;
                if (this.f153630n == lifecycleOwner.hashCode() && !this.f153629m && !this.f153631o.aE().mo208293c()) {
                    m238749f();
                }
            }
        } else if (this.f153625i) {
            this.f153625i = false;
            m238751h();
        } else if (this.f153631o.aE().mo208293c()) {
            mo212229e();
        }
    }

    /* renamed from: a */
    public final void mo212212a(String str, String str2) {
        String str3 = this.f153618b;
        C60700b.m235851b(str3, "[onStreamRemove]", str + ", " + str2);
        mo212223c(str);
        m238748e(str, str2);
        if (str2 != null) {
            m238752i(str2);
            this.f153628l.remove(str2);
        }
    }

    /* renamed from: a */
    public final boolean mo212216a(String str, boolean z) {
        if (z || !this.f153625i || this.f153631o.mo212067p() == DisplayMode.WINDOW || this.f153631o.mo212067p() == DisplayMode.FAST_ENTRY) {
            if (z && this.f153625i) {
                HashMap<String, VCStream> hashMap = this.f153628l;
                if (hashMap != null) {
                    C69121n.m265993j(hashMap).remove(str);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
            }
            boolean a = m238746a(str, 0, false, z, true);
            if (a) {
                String str2 = this.f153618b;
                C60700b.m235851b(str2, "[subscribeScreenStream4]", str + ", " + z);
            }
            return a;
        }
        String str3 = this.f153618b;
        C60700b.m235851b(str3, "[subscribeScreenStream3]", str + ", " + z + ", display mode = " + this.f153631o.mo212067p());
        if (str != null) {
            VCStream cVar = this.f153628l.get(str);
            if (cVar == null) {
                cVar = new VCStream(str, z, false, 0);
                this.f153628l.put(str, cVar);
            }
            cVar.mo212240b(false);
            cVar.mo212239a(z);
            cVar.mo212238a(0);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo212214a(com.ss.android.vc.irtc.VcByteStream r11, com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec.Scene r12, com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec.Resolution r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal.mo212214a(com.ss.android.vc.irtc.VcByteStream, com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec$Scene, com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamSpec$Resolution, boolean):boolean");
    }

    /* renamed from: a */
    public final boolean mo212215a(String str, StreamSpec.Scene scene, StreamSpec.Resolution resolution, boolean z) {
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(resolution, "res");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str == null) {
            Intrinsics.throwNpe();
        }
        VcByteStream e = mo212228e(str);
        if (e != null) {
            return mo212214a(e, scene, resolution, z);
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m238746a(String str, int i, boolean z, boolean z2, boolean z3) {
        return this.f153619c.mo212249a(str, i, z, z2, z3);
    }
}
