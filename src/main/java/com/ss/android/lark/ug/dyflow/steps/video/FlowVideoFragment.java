package com.ss.android.lark.ug.dyflow.steps.video;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.player.p2511a.C52093l;
import com.ss.android.lark.player.p2513c.AbstractC52110k;
import com.ss.android.lark.player.widget.VideoView;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.dyflow.common.FlowStepResDependency;
import com.ss.android.lark.ug.dyflow.steps.video.cover.ControllerCover;
import com.ss.android.lark.ug.dyflow.steps.video.cover.ErrorCover;
import com.ss.android.lark.ug.dyflow.steps.video.cover.LoadingCover;
import com.ss.android.lark.utils.C57840j;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u00012\u00020\u0002:\u000201B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0003J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J\u001a\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010*\u001a\u00020\u0012H\u0016J\u0012\u0010+\u001a\u00020\u00122\b\b\u0002\u0010,\u001a\u00020&H\u0002J\u0012\u0010-\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/ss/android/lark/ug/dyflow/steps/video/VideoFragmentController;", "fragmentDependency", "Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$FragmentDependency;", "(Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$FragmentDependency;)V", "controllerCover", "Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover;", "coverUrl", "", "isMute", "", "rootView", "Landroid/view/ViewGroup;", "videoUrl", "videoView", "Lcom/ss/android/lark/player/widget/VideoView;", "asyncLoadViews", "", "initImageCover", "initVideoView", "context", "Landroid/content/Context;", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroyView", "onKeyDown", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKeyUp", "onPause", "play", "msc", "setMetric", "setupCover", "Lcom/ss/android/lark/player/cover/ReceiverGroup;", "Companion", "FragmentDependency", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a */
public final class FlowVideoFragment extends Fragment implements VideoFragmentController {

    /* renamed from: f */
    public static final Companion f141568f = new Companion(null);

    /* renamed from: a */
    public ViewGroup f141569a;

    /* renamed from: b */
    public VideoView f141570b;

    /* renamed from: c */
    public boolean f141571c = true;

    /* renamed from: d */
    public String f141572d;

    /* renamed from: e */
    public final FragmentDependency f141573e;

    /* renamed from: g */
    private ControllerCover f141574g;

    /* renamed from: h */
    private String f141575h;

    /* renamed from: i */
    private HashMap f141576i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$FragmentDependency;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepResDependency;", "onError", "", "onNext", "onSkip", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$b */
    public interface FragmentDependency extends FlowStepResDependency {
        /* renamed from: a */
        void mo195040a();

        /* renamed from: b */
        void mo195041b();

        /* renamed from: c */
        void mo195042c();
    }

    /* renamed from: b */
    public void mo195047b() {
        HashMap hashMap = this.f141576i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment;", "fragmentDependency", "Lcom/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$FragmentDependency;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final FlowVideoFragment mo195049a(FragmentDependency bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "fragmentDependency");
            return new FlowVideoFragment(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$setupCover$ctlListener$1", "Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ControllerCover$OnControllerListener;", "isInPlayState", "", "onChangeOrientation", "", "isPortrait", "onMute", "isMute", "onNext", "onPlay", "onSeekTo", "pos", "", "onSkip", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$i */
    public static final class C57465i implements ControllerCover.OnControllerListener {

        /* renamed from: a */
        final /* synthetic */ FlowVideoFragment f141584a;

        @Override // com.ss.android.lark.ug.dyflow.steps.video.cover.ControllerCover.OnControllerListener
        /* renamed from: b */
        public void mo195059b() {
            this.f141584a.f141573e.mo195041b();
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.cover.ControllerCover.OnControllerListener
        /* renamed from: c */
        public void mo195061c() {
            this.f141584a.f141573e.mo195042c();
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.cover.ControllerCover.OnControllerListener
        /* renamed from: a */
        public void mo195056a() {
            VideoView videoView = this.f141584a.f141570b;
            if (videoView == null) {
                return;
            }
            if (videoView.mo178599a()) {
                videoView.mo178604e();
            } else {
                FlowVideoFragment.m222983a(this.f141584a, 0, 1, null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57465i(FlowVideoFragment aVar) {
            this.f141584a = aVar;
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.cover.ControllerCover.OnControllerListener
        /* renamed from: a */
        public void mo195058a(boolean z) {
            this.f141584a.f141571c = z;
            VideoView videoView = this.f141584a.f141570b;
            if (videoView != null) {
                videoView.setMute(z);
            }
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.cover.ControllerCover.OnControllerListener
        /* renamed from: b */
        public void mo195060b(boolean z) {
            int i = !z ? 1 : 0;
            FragmentActivity activity = this.f141584a.getActivity();
            if (activity != null) {
                activity.setRequestedOrientation(i);
            }
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.cover.ControllerCover.OnControllerListener
        /* renamed from: a */
        public void mo195057a(int i) {
            VideoView videoView = this.f141584a.f141570b;
            if (videoView == null) {
                return;
            }
            if (videoView.mo178599a()) {
                videoView.mo178600b(i);
            } else {
                this.f141584a.mo195044a(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$initVideoView$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC57460d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FlowVideoFragment f141578a;

        /* renamed from: b */
        final /* synthetic */ VideoView f141579b;

        public void onGlobalLayout() {
            this.f141579b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            FlowVideoFragment.m222983a(this.f141578a, 0, 1, null);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC57460d(FlowVideoFragment aVar, VideoView videoView) {
            this.f141578a = aVar;
            this.f141579b = videoView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$e */
    static final class RunnableC57461e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FlowVideoFragment f141580a;

        RunnableC57461e(FlowVideoFragment aVar) {
            this.f141580a = aVar;
        }

        public final void run() {
            VideoView videoView = this.f141580a.f141570b;
            if (videoView != null) {
                videoView.mo178606g();
            }
            ViewGroup viewGroup = this.f141580a.f141569a;
            if (viewGroup != null) {
                viewGroup.removeView(this.f141580a.f141570b);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        VideoView videoView = this.f141570b;
        if (videoView != null) {
            videoView.mo178606g();
        }
        this.f141570b = null;
        ControllerCover aVar = this.f141574g;
        if (aVar != null) {
            aVar.mo195070c();
        }
        mo195047b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        VideoView videoView = this.f141570b;
        if (videoView != null && videoView.mo178601b()) {
            videoView.mo178603d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$f */
    public static final class RunnableC57462f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FlowVideoFragment f141581a;

        RunnableC57462f(FlowVideoFragment aVar) {
            this.f141581a = aVar;
        }

        public final void run() {
            VideoView videoView;
            if (UIUtils.isActivityRunning(this.f141581a.getActivity()) && (videoView = this.f141581a.f141570b) != null) {
                DataSource dataSource = new DataSource();
                dataSource.setData(this.f141581a.f141572d);
                videoView.setDataSource(dataSource);
                videoView.mo178602c();
            }
        }
    }

    /* renamed from: c */
    private final void m222985c() {
        C57840j.m224506b().mo196190b("videoplayer").observeOn(AndroidSchedulers.mainThread()).subscribe(new C57459c(this));
    }

    /* renamed from: d */
    private final void m222986d() {
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundColor(-16777216);
        ViewGroup viewGroup = this.f141569a;
        if (viewGroup != null) {
            viewGroup.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        }
        ImageLoader.with(getContext()).load(this.f141575h).into(imageView);
    }

    @Override // com.ss.android.lark.ug.dyflow.steps.video.VideoFragmentController
    /* renamed from: a */
    public void mo195043a() {
        UICallbackExecutor.execute(new RunnableC57461e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/video/FlowVideoFragment$setupCover$1", "Lcom/ss/android/lark/ug/dyflow/steps/video/cover/ErrorCover$OnErrorCoverClickListener;", "onRetryClick", "", "view", "Landroid/view/View;", "onSkipClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$h */
    public static final class C57464h implements ErrorCover.OnErrorCoverClickListener {

        /* renamed from: a */
        final /* synthetic */ FlowVideoFragment f141583a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57464h(FlowVideoFragment aVar) {
            this.f141583a = aVar;
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.cover.ErrorCover.OnErrorCoverClickListener
        /* renamed from: a */
        public void mo195054a(View view) {
            this.f141583a.f141573e.mo195041b();
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.video.cover.ErrorCover.OnErrorCoverClickListener
        /* renamed from: b */
        public void mo195055b(View view) {
            FlowVideoFragment.m222983a(this.f141583a, 0, 1, null);
        }
    }

    public FlowVideoFragment(FragmentDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "fragmentDependency");
        this.f141573e = bVar;
    }

    /* renamed from: a */
    private final void m222982a(VideoView videoView) {
        if (videoView != null) {
            videoView.setOnErrorEventListener(C57463g.f141582a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            ControllerCover aVar = this.f141574g;
            if (aVar != null) {
                aVar.mo195068b(false);
                return;
            }
            return;
        }
        ControllerCover aVar2 = this.f141574g;
        if (aVar2 != null) {
            aVar2.mo195068b(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f141572d = this.f141573e.mo194729d("video_content");
        this.f141575h = this.f141573e.mo194727b("video_cover");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$c */
    public static final class C57459c<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FlowVideoFragment f141577a;

        C57459c(FlowVideoFragment aVar) {
            this.f141577a = aVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            FragmentActivity activity = this.f141577a.getActivity();
            if (activity != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return@subscribe");
                if (UIUtils.isActivityRunning(activity)) {
                    Intrinsics.checkExpressionValueIsNotNull(bool, "result");
                    if (bool.booleanValue()) {
                        this.f141577a.mo195045a(activity);
                    } else {
                        this.f141577a.f141573e.mo195040a();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final C52093l m222984b(Context context) {
        C52093l lVar = new C52093l();
        ControllerCover aVar = new ControllerCover(context, this.f141575h, this.f141573e.mo194728c("video_skip"), this.f141573e.mo194728c("video_next"));
        this.f141574g = aVar;
        aVar.mo195065a(this.f141571c);
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        boolean z = true;
        if (resources.getConfiguration().orientation != 1) {
            z = false;
        }
        aVar.mo195068b(z);
        aVar.mo195064a(new C57465i(this));
        ErrorCover bVar = new ErrorCover(context);
        bVar.mo195089a(new C57464h(this));
        LoadingCover cVar = new LoadingCover(context);
        lVar.mo178468a("controller", aVar);
        lVar.mo178468a("error", bVar);
        lVar.mo178468a("loading", cVar);
        return lVar;
    }

    /* renamed from: a */
    public final void mo195044a(int i) {
        UICallbackExecutor.execute(new RunnableC57462f(this));
    }

    /* renamed from: a */
    public final void mo195045a(Context context) {
        VideoView videoView = new VideoView(context);
        this.f141570b = videoView;
        videoView.setReceiverGroup(m222984b(context));
        videoView.setMute(this.f141571c);
        m222982a(videoView);
        videoView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC57460d(this, videoView));
        ViewGroup viewGroup = this.f141569a;
        if (viewGroup != null) {
            viewGroup.addView(videoView, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.steps.video.VideoFragmentController
    /* renamed from: b */
    public boolean mo195048b(int i, KeyEvent keyEvent) {
        ControllerCover aVar = this.f141574g;
        if (aVar != null) {
            return aVar.mo195069b(i, keyEvent);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "bundle", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "onErrorEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.a$g */
    public static final class C57463g implements AbstractC52110k {

        /* renamed from: a */
        public static final C57463g f141582a = new C57463g();

        C57463g() {
        }

        @Override // com.ss.android.lark.player.p2513c.AbstractC52110k
        /* renamed from: a */
        public final void mo140067a(int i, Bundle bundle) {
            if (bundle != null) {
                int i2 = bundle.getInt("int_arg1");
                String string = bundle.getString("string_data");
                if (string == null) {
                    string = "";
                }
                Intrinsics.checkExpressionValueIsNotNull(string, "bundle?.getString(EventKey.STRING_DATA) ?: \"\"");
                switch (i2) {
                    case -10000:
                    case -9994:
                        UGApm.OnBoarding.f141199a.mo194476a(i2, "networkError", string);
                        return;
                    case -9999:
                    case -9993:
                    case -9991:
                        UGApm.OnBoarding.f141199a.mo194476a(i2, "invalidUrl", string);
                        return;
                    case -9998:
                    case -9996:
                        UGApm.OnBoarding.f141199a.mo194476a(i2, "parseError", string);
                        return;
                    case -9997:
                    case -9995:
                    case -9992:
                    default:
                        UGApm.OnBoarding.f141199a.mo194476a(i2, "other", string);
                        return;
                }
            }
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.steps.video.VideoFragmentController
    /* renamed from: a */
    public boolean mo195046a(int i, KeyEvent keyEvent) {
        ControllerCover aVar = this.f141574g;
        if (aVar != null) {
            return aVar.mo195066a(i, keyEvent);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        this.f141569a = new FrameLayout(layoutInflater.getContext());
        m222986d();
        m222985c();
        return this.f141569a;
    }

    /* renamed from: a */
    static /* synthetic */ void m222983a(FlowVideoFragment aVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        aVar.mo195044a(i);
    }
}
