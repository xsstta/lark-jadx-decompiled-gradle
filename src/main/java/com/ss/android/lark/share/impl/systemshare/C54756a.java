package com.ss.android.lark.share.impl.systemshare;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.keyboard.plugin.tool.checker.AbsInvalidTip;
import com.ss.android.lark.keyboard.plugin.tool.checker.SendFileTip;
import com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.dto.SystemShareData;
import com.ss.android.lark.share.impl.systemshare.mvp.C54778b;
import com.ss.android.lark.share.impl.systemshare.mvp.C54783c;
import com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView;
import com.ss.android.lark.share.p2681a.AbstractC54714a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.lark.share.impl.systemshare.a */
public class C54756a extends BaseFragment {

    /* renamed from: f */
    public static final String[] f135212f = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: a */
    public Activity f135213a;

    /* renamed from: b */
    public View f135214b;

    /* renamed from: c */
    public C51331a f135215c;

    /* renamed from: d */
    public AbstractC54714a.AbstractC54719e f135216d;

    /* renamed from: e */
    public int f135217e = 1;

    /* renamed from: g */
    private SystemShareData f135218g;

    /* renamed from: h */
    private C54783c f135219h;

    /* renamed from: i */
    private C54783c.AbstractC54787b f135220i = new C54783c.AbstractC54787b() {
        /* class com.ss.android.lark.share.impl.systemshare.C54756a.C547571 */

        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54787b
        /* renamed from: a */
        public void mo186916a(CommonShareData commonShareData) {
            C54713a.m212321a().mo178390c().mo178395a(C54756a.this.f135213a, commonShareData, !C54756a.this.f135216d.mo178410a(C54756a.this.f135213a));
        }

        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54787b
        /* renamed from: a */
        public void mo186918a(final AbstractC51324c cVar) {
            C54756a.this.f135215c.mo176924c(C54756a.f135212f).subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.share.impl.systemshare.C54756a.C547571.C547581 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (cVar == null) {
                        return;
                    }
                    if (bool.booleanValue()) {
                        cVar.mo49823a();
                    } else {
                        cVar.mo49824b();
                    }
                }
            });
        }

        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54787b
        /* renamed from: a */
        public void mo186917a(CommonShareData commonShareData, C54783c.AbstractC54788c cVar) {
            Map<String, Long> videos = commonShareData.getVideos();
            if (CollectionUtils.isNotEmpty(videos)) {
                new VideoSendChecker().mo147417a(new ArrayList(videos.keySet()), C54756a.this.mo186914a(commonShareData, cVar));
                return;
            }
            Log.m165389i("ShareContentFragment", "no has video, send share data");
            cVar.mo186957a();
        }
    };

    /* renamed from: j */
    private VideoSendChecker.Callback f135221j;

    /* renamed from: k */
    private ShareContentView.AbstractC54773a f135222k = new ShareContentView.AbstractC54773a() {
        /* class com.ss.android.lark.share.impl.systemshare.C54756a.C547614 */

        @Override // com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView.AbstractC54773a
        /* renamed from: a */
        public void mo186920a() {
            if (C54756a.this.f135217e == 1) {
                C54756a.this.finish();
            } else {
                C54756a.this.f135213a.finish();
            }
        }

        @Override // com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView.AbstractC54773a
        /* renamed from: a */
        public void mo186921a(ShareContentView shareContentView) {
            ButterKnife.bind(shareContentView, C54756a.this.f135214b);
        }
    };

    /* renamed from: c */
    private void m212466c() {
        C54783c cVar = this.f135219h;
        if (cVar != null) {
            cVar.mo186955c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C54783c cVar = this.f135219h;
        if (cVar != null) {
            cVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private boolean m212464a() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        this.f135218g = (SystemShareData) arguments.getParcelable("key_outside_share");
        this.f135217e = arguments.getInt("launch_mode");
        if (this.f135218g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m212465b() {
        C54783c cVar = new C54783c(new C54778b(this.f135218g, this.f135213a), new ShareContentView(this.f135222k), this.f135220i);
        this.f135219h = cVar;
        cVar.create();
    }

    /* renamed from: a */
    public VideoSendChecker.Callback mo186914a(final CommonShareData commonShareData, final C54783c.AbstractC54788c cVar) {
        C547592 r0 = new VideoSendChecker.Callback() {
            /* class com.ss.android.lark.share.impl.systemshare.C54756a.C547592 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker.Callback
            /* renamed from: a */
            public void mo147418a(VideoSendChecker.Result result, ArrayList<String> arrayList) {
                if (result == VideoSendChecker.Result.VALID) {
                    Log.m165389i("ShareContentFragment", "all videos are valid");
                    cVar.mo186957a();
                    return;
                }
                Log.m165389i("ShareContentFragment", "some videos are invalid, result: " + result);
                C54756a.this.mo186915a(commonShareData, cVar, result, arrayList).mo147425a();
            }
        };
        this.f135221j = r0;
        return r0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f135216d = C54713a.m212321a().mo178393f();
        this.f135215c = new C51331a(this.f135213a);
        if (!m212464a()) {
            Log.m165383e("ShareContentFragment", "share data is invalid data");
            m212466c();
            finish();
            return;
        }
        m212465b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f135214b = layoutInflater.inflate(R.layout.activity_share_content, viewGroup, false);
        this.f135213a = getActivity();
        return this.f135214b;
    }

    /* renamed from: a */
    public AbsInvalidTip mo186915a(final CommonShareData commonShareData, final C54783c.AbstractC54788c cVar, VideoSendChecker.Result result, final ArrayList<String> arrayList) {
        return new SendFileTip(result) {
            /* class com.ss.android.lark.share.impl.systemshare.C54756a.C547603 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.keyboard.plugin.tool.checker.SendFileTip
            /* renamed from: c */
            public void mo147430c() {
                Log.m165389i("ShareContentFragment", "send image and valid video, invalid video will be sent as file");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    commonShareData.getVideos().remove((String) it.next());
                }
                commonShareData.getFiles().addAll(arrayList);
                cVar.mo186957a();
            }
        };
    }
}
