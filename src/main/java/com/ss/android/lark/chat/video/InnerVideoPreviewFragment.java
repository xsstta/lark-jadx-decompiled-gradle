package com.ss.android.lark.chat.video;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.service.impl.PreviewVideoService;
import com.ss.android.lark.chat.video.C34395d;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.player.p2511a.C52093l;
import com.ss.android.lark.player.widget.VideoView;
import com.ss.android.lark.utils.C57840j;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001LB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0006H\u0016J\u0010\u00108\u001a\u0002042\u0006\u00109\u001a\u00020:H\u0016J\u0012\u0010;\u001a\u0002042\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J&\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u001b2\b\u0010<\u001a\u0004\u0018\u00010=H\u0017J\b\u0010C\u001a\u000204H\u0016J\b\u0010D\u001a\u000204H\u0016J\b\u0010E\u001a\u000204H\u0016J\b\u0010F\u001a\u000204H\u0016J\b\u0010G\u001a\u000204H\u0002J\u0010\u0010H\u001a\u0002042\u0006\u0010I\u001a\u00020\u0006H\u0002J\b\u0010J\u001a\u00020KH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006M"}, d2 = {"Lcom/ss/android/lark/chat/video/InnerVideoPreviewFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/ss/android/lark/chat/video/SharedElementListener;", "Lcom/ss/android/lark/chat/video/BackListener;", "()V", "isPortrait", "", "listener", "Lcom/ss/android/lark/chat/video/OnFragmentInteractListener;", "mAnimationCoverIV", "Landroid/widget/ImageView;", "getMAnimationCoverIV", "()Landroid/widget/ImageView;", "setMAnimationCoverIV", "(Landroid/widget/ImageView;)V", "mControllerCover", "Lcom/ss/android/lark/chat/video/PreviewControllerCover;", "getMControllerCover", "()Lcom/ss/android/lark/chat/video/PreviewControllerCover;", "setMControllerCover", "(Lcom/ss/android/lark/chat/video/PreviewControllerCover;)V", "mInflated", "getMInflated", "()Z", "setMInflated", "(Z)V", "mRootView", "Landroid/view/ViewGroup;", "getMRootView", "()Landroid/view/ViewGroup;", "setMRootView", "(Landroid/view/ViewGroup;)V", "mVideoCover", "Lcom/ss/android/lark/image/entity/Image;", "getMVideoCover", "()Lcom/ss/android/lark/image/entity/Image;", "setMVideoCover", "(Lcom/ss/android/lark/image/entity/Image;)V", "mVideoOriginUrl", "", "getMVideoOriginUrl", "()Ljava/lang/String;", "setMVideoOriginUrl", "(Ljava/lang/String;)V", "mVideoPlayUrl", "mVideoView", "Lcom/ss/android/lark/player/widget/VideoView;", "getMVideoView", "()Lcom/ss/android/lark/player/widget/VideoView;", "setMVideoView", "(Lcom/ss/android/lark/player/widget/VideoView;)V", "onAttach", "", "context", "Landroid/content/Context;", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroyView", "onDetach", "onPause", "onSharedElementEnd", "playInner", "playVideo", "useNet", "setupCovers", "Lcom/ss/android/lark/player/cover/ReceiverGroup;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.video.b */
public final class InnerVideoPreviewFragment extends Fragment implements BackListener, SharedElementListener {

    /* renamed from: e */
    public static final Companion f88780e = new Companion(null);

    /* renamed from: a */
    public String f88781a;

    /* renamed from: b */
    public String f88782b;

    /* renamed from: c */
    public OnFragmentInteractListener f88783c;

    /* renamed from: d */
    public boolean f88784d = true;

    /* renamed from: f */
    private Image f88785f;

    /* renamed from: g */
    private VideoView f88786g;

    /* renamed from: h */
    private C34395d f88787h;

    /* renamed from: i */
    private boolean f88788i;

    /* renamed from: j */
    private ViewGroup f88789j;

    /* renamed from: k */
    private ImageView f88790k;

    /* renamed from: l */
    private HashMap f88791l;

    /* renamed from: j */
    public void mo126998j() {
        HashMap hashMap = this.f88791l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/video/InnerVideoPreviewFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/ss/android/lark/chat/video/InnerVideoPreviewFragment;", "videoOriginUrl", "cover", "Lcom/ss/android/lark/image/entity/Image;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final InnerVideoPreviewFragment mo126999a(String str, Image image) {
            Intrinsics.checkParameterIsNotNull(str, "videoOriginUrl");
            InnerVideoPreviewFragment bVar = new InnerVideoPreviewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("video_origin_url", str);
            bundle.putSerializable("video_cover", image);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: b */
    public final Image mo126989b() {
        return this.f88785f;
    }

    /* renamed from: c */
    public final VideoView mo126991c() {
        return this.f88786g;
    }

    /* renamed from: d */
    public final boolean mo126992d() {
        return this.f88788i;
    }

    /* renamed from: e */
    public final ViewGroup mo126993e() {
        return this.f88789j;
    }

    /* renamed from: f */
    public final ImageView mo126994f() {
        return this.f88790k;
    }

    /* renamed from: i */
    public final void mo126997i() {
        VideoView videoView = this.f88786g;
        if (videoView != null) {
            UICallbackExecutor.execute(new RunnableC34389d(this, videoView));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f88783c = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onPlay", "com/ss/android/lark/chat/video/InnerVideoPreviewFragment$setupCovers$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$g */
    public static final class C34392g implements C34395d.AbstractC34405a {

        /* renamed from: a */
        final /* synthetic */ InnerVideoPreviewFragment f88803a;

        C34392g(InnerVideoPreviewFragment bVar) {
            this.f88803a = bVar;
        }

        @Override // com.ss.android.lark.chat.video.C34395d.AbstractC34405a
        /* renamed from: a */
        public final void mo127006a() {
            VideoView c = this.f88803a.mo126991c();
            if (c == null) {
                return;
            }
            if (c.mo178599a()) {
                c.mo178604e();
            } else {
                this.f88803a.mo126990b(false);
            }
        }
    }

    @Override // com.ss.android.lark.chat.video.SharedElementListener
    /* renamed from: g */
    public void mo126995g() {
        if (this.f88786g != null) {
            ViewGroup viewGroup = this.f88789j;
            if (viewGroup != null) {
                viewGroup.removeView(this.f88790k);
            }
            VideoView videoView = this.f88786g;
            if (videoView != null) {
                videoView.setVisibility(0);
            }
            mo126990b(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        VideoView videoView = this.f88786g;
        if (videoView != null) {
            videoView.mo178606g();
        }
        this.f88786g = null;
        mo126998j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        VideoView videoView = this.f88786g;
        if (videoView != null && videoView.mo178601b()) {
            videoView.mo178603d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$c */
    static final class C34387c<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ InnerVideoPreviewFragment f88793a;

        /* renamed from: b */
        final /* synthetic */ LayoutInflater f88794b;

        C34387c(InnerVideoPreviewFragment bVar, LayoutInflater layoutInflater) {
            this.f88793a = bVar;
            this.f88794b = layoutInflater;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "onGlobalLayout", "com/ss/android/lark/chat/video/InnerVideoPreviewFragment$onCreateView$1$1$1$1", "com/ss/android/lark/chat/video/InnerVideoPreviewFragment$onCreateView$1$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.video.b$c$a */
        public static final class ViewTreeObserver$OnGlobalLayoutListenerC34388a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: a */
            final /* synthetic */ FrameLayout.LayoutParams f88795a;

            /* renamed from: b */
            final /* synthetic */ C52093l f88796b;

            /* renamed from: c */
            final /* synthetic */ C34387c f88797c;

            /* renamed from: d */
            final /* synthetic */ Boolean f88798d;

            ViewTreeObserver$OnGlobalLayoutListenerC34388a(FrameLayout.LayoutParams layoutParams, C52093l lVar, C34387c cVar, Boolean bool) {
                this.f88795a = layoutParams;
                this.f88796b = lVar;
                this.f88797c = cVar;
                this.f88798d = bool;
            }

            public final void onGlobalLayout() {
                if (!this.f88797c.f88793a.mo126992d()) {
                    VideoView c = this.f88797c.f88793a.mo126991c();
                    if (c != null) {
                        c.setVisibility(8);
                    }
                    OnFragmentInteractListener cVar = this.f88797c.f88793a.f88783c;
                    if (cVar != null) {
                        cVar.mo126960a();
                    }
                    this.f88797c.f88793a.mo126988a(true);
                }
            }
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            FragmentActivity activity = this.f88793a.getActivity();
            if (activity != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                if (!activity.isFinishing()) {
                    if (Intrinsics.areEqual((Object) true, (Object) bool)) {
                        C52093l h = this.f88793a.mo126996h();
                        this.f88793a.mo126987a(new VideoView(this.f88794b.getContext()));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        VideoView c = this.f88793a.mo126991c();
                        if (c != null) {
                            ViewGroup e = this.f88793a.mo126993e();
                            if (e != null) {
                                e.addView(c, layoutParams);
                            }
                            this.f88793a.mo126986a(new ImageView(this.f88794b.getContext()));
                            ImageView f = this.f88793a.mo126994f();
                            if (f != null) {
                                f.setBackgroundColor(-16777216);
                            }
                            ViewGroup e2 = this.f88793a.mo126993e();
                            if (e2 != null) {
                                e2.addView(this.f88793a.mo126994f(), layoutParams);
                            }
                            Image b = this.f88793a.mo126989b();
                            if (b == null) {
                                Intrinsics.throwNpe();
                            }
                            ImageLoader.with(this.f88793a.getContext()).load(new C38824b(b.getKey())).error(R.drawable.__picker_ic_broken_image_black_48dp).into(this.f88793a.mo126994f());
                            c.setReceiverGroup(h);
                            c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC34388a(layoutParams, h, this, bool));
                            return;
                        }
                        return;
                    }
                    activity.finish();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$b */
    public static final class RunnableC34386b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InnerVideoPreviewFragment f88792a;

        RunnableC34386b(InnerVideoPreviewFragment bVar) {
            this.f88792a = bVar;
        }

        public final void run() {
            VideoView c = this.f88792a.mo126991c();
            if (c != null) {
                c.mo178606g();
            }
            ViewGroup e = this.f88792a.mo126993e();
            if (e != null) {
                e.removeView(this.f88792a.mo126991c());
            }
            if (this.f88792a.f88784d) {
                FragmentActivity activity = this.f88792a.getActivity();
                if (activity != null) {
                    activity.finishAfterTransition();
                    return;
                }
                return;
            }
            FragmentActivity activity2 = this.f88792a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$d */
    public static final class RunnableC34389d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InnerVideoPreviewFragment f88799a;

        /* renamed from: b */
        final /* synthetic */ VideoView f88800b;

        RunnableC34389d(InnerVideoPreviewFragment bVar, VideoView videoView) {
            this.f88799a = bVar;
            this.f88800b = videoView;
        }

        public final void run() {
            FragmentActivity activity = this.f88799a.getActivity();
            if (activity != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    DataSource dataSource = new DataSource();
                    dataSource.setData(this.f88799a.f88782b);
                    this.f88800b.setDataSource(dataSource);
                    this.f88800b.mo178602c();
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.video.BackListener
    /* renamed from: a */
    public boolean mo126985a() {
        ViewParent viewParent;
        ImageView imageView = this.f88790k;
        if (imageView != null) {
            viewParent = imageView.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewGroup viewGroup = this.f88789j;
            if (viewGroup != null) {
                viewGroup.addView(this.f88790k, layoutParams);
            }
        }
        UICallbackExecutor.post(new RunnableC34386b(this));
        return true;
    }

    /* renamed from: h */
    public final C52093l mo126996h() {
        C52093l lVar = new C52093l();
        C34395d dVar = new C34395d(getActivity(), this.f88785f);
        this.f88787h = dVar;
        if (dVar != null) {
            dVar.mo127017a(new View$OnClickListenerC34391f(this));
            dVar.mo127018a(new C34392g(this));
        }
        C34406e eVar = new C34406e(getActivity());
        eVar.mo127042a(new View$OnClickListenerC34393h(this));
        eVar.mo127044b(new View$OnClickListenerC34394i(this));
        C34408f fVar = new C34408f(getActivity());
        lVar.mo178468a("controller", this.f88787h);
        lVar.mo178468a("error", eVar);
        lVar.mo178468a("loading", fVar);
        return lVar;
    }

    /* renamed from: a */
    public final void mo126986a(ImageView imageView) {
        this.f88790k = imageView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/video/InnerVideoPreviewFragment$playVideo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$e */
    public static final class C34390e implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ InnerVideoPreviewFragment f88801a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34390e(InnerVideoPreviewFragment bVar) {
            this.f88801a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            this.f88801a.f88782b = str;
            this.f88801a.mo126997i();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("InnerVideoPreviewFragment", "getPreviewVideoSource net errorcode:" + errorResult.getErrorCode() + ",msg:" + errorResult.getDisplayMsg());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$i */
    public static final class View$OnClickListenerC34394i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InnerVideoPreviewFragment f88805a;

        View$OnClickListenerC34394i(InnerVideoPreviewFragment bVar) {
            this.f88805a = bVar;
        }

        public final void onClick(View view) {
            this.f88805a.mo126990b(true);
        }
    }

    /* renamed from: a */
    public final void mo126987a(VideoView videoView) {
        this.f88786g = videoView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chat/video/InnerVideoPreviewFragment$setupCovers$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$f */
    public static final class View$OnClickListenerC34391f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InnerVideoPreviewFragment f88802a;

        View$OnClickListenerC34391f(InnerVideoPreviewFragment bVar) {
            this.f88802a = bVar;
        }

        public final void onClick(View view) {
            OnFragmentInteractListener cVar = this.f88802a.f88783c;
            if (cVar != null) {
                cVar.mo126962b();
            }
            this.f88802a.mo126985a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.b$h */
    public static final class View$OnClickListenerC34393h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InnerVideoPreviewFragment f88804a;

        View$OnClickListenerC34393h(InnerVideoPreviewFragment bVar) {
            this.f88804a = bVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.f88804a.getActivity();
            if (activity != null) {
                activity.finishAfterTransition();
            }
        }
    }

    /* renamed from: a */
    public final void mo126988a(boolean z) {
        this.f88788i = z;
    }

    /* renamed from: b */
    public final void mo126990b(boolean z) {
        PreviewVideoService xVar = PreviewVideoService.f88580a;
        String str = this.f88781a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoOriginUrl");
        }
        xVar.mo126836a(str, z, new C34390e(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.onAttach(context);
        if (context instanceof OnFragmentInteractListener) {
            this.f88783c = (OnFragmentInteractListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        boolean z = true;
        if (configuration.orientation != 1) {
            z = false;
        }
        this.f88784d = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("video_origin_url");
            this.f88785f = (Image) arguments.getSerializable("video_cover");
            if (string != null) {
                this.f88781a = string;
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finishAfterTransition();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.f88789j = frameLayout;
        if (frameLayout != null) {
            frameLayout.setTransitionName("show_video_share_element");
        }
        C57840j.m224506b().mo196190b("videoplayer").observeOn(AndroidSchedulers.mainThread()).subscribe(new C34387c(this, layoutInflater));
        return this.f88789j;
    }
}
