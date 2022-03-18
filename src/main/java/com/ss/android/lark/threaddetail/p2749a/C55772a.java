package com.ss.android.lark.threaddetail.p2749a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.bytedance.lark.sdk.Sdk;
import com.google.gson.Gson;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.C36529b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.eetroublecapture.C36969b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.threaddetail.C55795c;
import com.ss.android.lark.threaddetail.C55809e;
import com.ss.android.lark.threaddetail.view.ThreadDetailView;
import com.ss.android.lark.threadwindow.C56095h;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.threaddetail.a.a */
public class C55772a extends BaseFragment implements AbstractC36982d {

    /* renamed from: a */
    public String f137595a;

    /* renamed from: b */
    public String f137596b;

    /* renamed from: c */
    public View f137597c;

    /* renamed from: d */
    private ThreadDetailView.AbstractC55854b f137598d = new ThreadDetailView.AbstractC55854b() {
        /* class com.ss.android.lark.threaddetail.p2749a.C55772a.C557731 */

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: c */
        public Fragment mo190271c() {
            return C55772a.this;
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: a */
        public FragmentActivity mo190262a() {
            return C55772a.this.getActivity();
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: b */
        public void mo190270b() {
            C55772a.this.finish();
            if (DesktopUtil.m144301a(C55772a.this.mContext) && (C55772a.this.getFragmentParams() instanceof MainWindowParams)) {
                C36529b bVar = new C36529b();
                Bundle bundle = new Bundle();
                bundle.putInt("holder", R.drawable.empty_default_icon);
                bVar.setArguments(bundle);
                C36512a.m144041a().mo134763a(bVar, new MainWindowParams.C36570a(ContainerType.Right).mo134958a("conversation").mo134930b());
                C29990c.m110930b().mo134512K().mo134687a(C55772a.this.mContext, (String) null);
            }
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: a */
        public void mo190266a(ThreadDetailView threadDetailView) {
            ButterKnife.bind(threadDetailView, C55772a.this.f137597c);
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: a */
        public void mo190267a(C58557a.C58559a aVar) {
            if (mo190262a() != null) {
                aVar.mo198512a(mo190262a(), C55772a.this, 233);
            }
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: a */
        public void mo190268a(C58633e.C58634a aVar) {
            if (mo190262a() != null) {
                aVar.mo198694a(mo190262a(), C55772a.this, 911);
            }
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: a */
        public void mo190264a(Context context, String str) {
            C56095h.m218564a().mo191239a(Navigation.from(C55772a.this.mContext), str, "thread_detail");
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: a */
        public void mo190265a(Chat chat, ArrayList<String> arrayList) {
            C29990c.m110930b().mo134506E().mo134373a(mo190262a(), C55772a.this, chat, arrayList, 9, "topic_click", "thread_details", false, "");
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: a */
        public void mo190269a(List<ReactionInfo> list, String str, final String str2) {
            C53002b a = C53002b.m205273a(C35237c.m137597a(list, false), str);
            a.mo181046a(new C53002b.AbstractC53005b() {
                /* class com.ss.android.lark.threaddetail.p2749a.C55772a.C557731.C557741 */

                @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
                public void onItemClicked(String str) {
                    C29990c.m110930b().mo134523V().mo134436a(C557731.this.mo190262a(), new ProfileSource.C36868a().mo136066c(str).mo136065b(str2).mo136064b(4).mo136060a(4).mo136063a());
                }
            });
            a.mo181044a(C55772a.this.getChildFragmentManager());
        }

        @Override // com.ss.android.lark.threaddetail.view.ThreadDetailView.AbstractC55854b
        /* renamed from: a */
        public void mo190263a(int i, List<PhotoItem> list, View view, boolean z, String str, int i2) {
            boolean a = C29990c.m110930b().mo134586n().mo134685a("translate.message.image.viewer.enable");
            for (PhotoItem photoItem : list) {
                if (photoItem != null) {
                    photoItem.getPhotoState().setLoadOrigin(true);
                }
            }
            C58630d.m227372a(mo190262a(), list, i, view, BaseData.AnimationType.TRANSLATE_ANIMATION, true, true, true, z, true, a, false, new DialogMenuClickListenerImpl(str), null, "", null, Biz.Messenger, Scene.Thread, i2);
        }
    };

    /* renamed from: e */
    private C55809e f137599e;

    /* renamed from: a */
    public boolean mo190261a() {
        boolean z;
        C55809e eVar = this.f137599e;
        if (eVar != null) {
            z = eVar.mo190373f();
        } else {
            z = false;
        }
        if (!z) {
            m216231b();
        }
        return z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C55809e eVar = this.f137599e;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C55809e eVar = this.f137599e;
        if (eVar != null) {
            eVar.mo190372e();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        C55809e eVar = this.f137599e;
        if (eVar != null) {
            eVar.mo190374g();
        }
        super.onStop();
    }

    /* renamed from: b */
    private void m216231b() {
        ThreadTopic i;
        C55809e eVar = this.f137599e;
        if (eVar != null && (i = eVar.mo190376i()) != null) {
            Intent intent = new Intent();
            intent.putExtra("key_params_thread", i);
            setResult(-1, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C55809e eVar = this.f137599e;
        if (eVar != null) {
            eVar.mo190371d();
        }
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.threaddetail.p2749a.C55772a.RunnableC557752 */

            public void run() {
                ChatTypeStateKeeper.f135671f.mo187406a(new ChatTypeStateKeeper.EnterChatParams.Builder().mo187428a(C55772a.this.f137595a).mo187429a(true).mo187435c(true).mo187434c(C55772a.this.f137595a).mo187431b(C55772a.this.f137596b).mo187441f(true).mo187451n());
                ChatTypeStateKeeper.m213145a("topic_thread");
            }
        });
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        try {
            List<Map<String, String>> b = C36969b.m145958b(getView().findViewById(R.id.thread_detail_rv));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("channel_id", this.f137595a);
            linkedHashMap.put("messages", b);
            String str = "user screenshot accompanying infos:" + new Gson().toJson(linkedHashMap);
            Log.m165389i(this.TAG, str);
            Sdk.log("screenshot", str);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C55809e eVar = this.f137599e;
        if (eVar != null) {
            eVar.mo190375h();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (m216232b(arguments)) {
            finish();
        } else {
            m216230a(m216229a(arguments));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public boolean onNewArguments(Bundle bundle) {
        if (m216232b(bundle)) {
            return false;
        }
        m216230a(m216229a(bundle));
        return true;
    }

    /* renamed from: a */
    private void m216230a(C55795c cVar) {
        C55809e eVar = this.f137599e;
        if (eVar != null) {
            eVar.mo190374g();
            this.f137599e.destroy();
            this.f137599e = null;
        }
        C55809e eVar2 = new C55809e(cVar, this.f137598d);
        this.f137599e = eVar2;
        eVar2.create();
        C29990c.m110930b().mo134512K().mo134687a(this.mContext, cVar.f137642a);
    }

    /* renamed from: b */
    private boolean m216232b(Bundle bundle) {
        if (bundle == null) {
            Log.m165383e("ThreadDetail", "Open Thread detail failed，bundle is null!!!");
            return true;
        }
        String string = bundle.getString("key_params_thread_id");
        this.f137595a = string;
        if (!TextUtils.isEmpty(string)) {
            return false;
        }
        Log.m165383e("ThreadDetail", "Open Thread detail failed，threadId is null!!!");
        return true;
    }

    /* renamed from: a */
    private C55795c m216229a(Bundle bundle) {
        C55795c cVar = new C55795c();
        cVar.f137642a = bundle.getString("key_params_thread_id");
        cVar.f137643b = (ThreadTopic) bundle.getSerializable("key_params_thread");
        cVar.f137644c = bundle.getString("key_params_thread_source", "");
        cVar.f137645d = (Chat) bundle.getSerializable("key_params_thread_chat");
        cVar.f137646e = bundle.getBoolean("key_params_show_reply", false);
        cVar.f137647f = bundle.getBoolean("key_params_show_keyboard", false);
        cVar.f137648g = bundle.getBoolean("key_params_load_from_start", false);
        cVar.f137649h = bundle.getInt("key_params_jump_position", -100);
        cVar.f137650i = bundle.getBoolean("key_params_need_show_bubble", true);
        cVar.f137651j = bundle.getBoolean("key_params_open_thread_window", true);
        cVar.f137652k = bundle.getBoolean("key_params_is_from_tab", false);
        cVar.f137653l = (TopicGroup) bundle.getSerializable("key_params_topic_group");
        cVar.f137654m = bundle.getBoolean("key_params_is_open_in_right_window");
        cVar.f137655n = bundle.getInt("key_params_feed_card_type", -1);
        cVar.f137656o = bundle.getBoolean("key_params_is_from_card", false);
        String string = bundle.getString("key_params_from", "");
        cVar.f137657p = string;
        this.f137596b = string;
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C55809e eVar = this.f137599e;
        if (eVar != null) {
            eVar.mo190367a(i, i2, intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_thread_detail, viewGroup, false);
        this.f137597c = inflate;
        return inflate;
    }
}
