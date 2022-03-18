package com.ss.android.lark.create.groupchat.impl.inside;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.f2f.F2FCreateGroupLauncher;
import com.ss.android.lark.create.groupchat.impl.inside.C36332a;
import com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36276b;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a;
import com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36394g;
import com.ss.android.lark.create.groupchat.impl.type.C36400a;
import com.ss.android.lark.create.groupchat.impl.type.GroupTypeSelectorActivity;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.create.groupchat.impl.inside.b */
public class C36336b extends AbstractC36375a implements AbstractC36394g {

    /* renamed from: a */
    public C36340d f93764a;

    /* renamed from: b */
    AbstractC36248c.AbstractC36254f f93765b = CreateGroupChatModule.getDependency().getContactDependency();

    /* renamed from: c */
    public View f93766c;

    /* renamed from: d */
    public FragmentActivity f93767d;

    /* renamed from: e */
    public boolean f93768e = true;

    /* renamed from: f */
    public boolean f93769f = false;

    /* renamed from: g */
    private InsideGroupView.AbstractC36331a f93770g = new InsideGroupView.AbstractC36331a() {
        /* class com.ss.android.lark.create.groupchat.impl.inside.C36336b.C363371 */

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: f */
        public C36516a<?> mo134040f() {
            return C36336b.this;
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: c */
        public Activity mo134037c() {
            return C36336b.this.f93767d;
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: d */
        public void mo134038d() {
            KeyboardUtils.hideKeyboard(C36336b.this.getContext());
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: e */
        public void mo134039e() {
            F2FCreateGroupLauncher.m142891a(mo134037c(), 2);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: a */
        public void mo134031a() {
            if (DesktopUtil.m144307b()) {
                CreateGroupChatModule.getDependency().getMainDependency().mo133741a(C36336b.this.mContext, "conversation", null);
            } else if (C36336b.this.f93767d != null) {
                C36336b.this.f93767d.finish();
            }
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: b */
        public FragmentManager mo134036b() {
            if (C36336b.this.getParentFragment() != null) {
                return C36336b.this.getParentFragment().getChildFragmentManager();
            }
            if (C36336b.this.f93767d != null) {
                return C36336b.this.f93767d.getSupportFragmentManager();
            }
            Log.m165383e("InsideGroupFragment", "state err! Activity may be recycle.");
            return null;
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: a */
        public void mo134033a(C36332a.AbstractC36334b bVar) {
            ButterKnife.bind(bVar, C36336b.this.f93766c);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: a */
        public void mo134035a(List<SearchBaseInfo> list) {
            Fragment fragment;
            if (DesktopUtil.m144307b()) {
                fragment = C36336b.this.getParentFragment();
            } else {
                fragment = C36336b.this;
            }
            C36336b.this.f93765b.mo133739a(fragment, C36276b.m142827a(list), 18);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: a */
        public void mo134032a(GroupCreateInfo groupCreateInfo) {
            if (DesktopUtil.m144307b()) {
                if (C36336b.this.getParentFragment() != null) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_group_create_info", groupCreateInfo);
                    FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("GroupCreateActivity").mo134930b();
                    C36400a aVar = new C36400a();
                    aVar.setArguments(bundle);
                    C36512a.m144041a().mo134760a((C36516a) C36336b.this.getParentFragment(), aVar, a, 1);
                }
            } else if (C36336b.this.f93767d != null) {
                Intent intent = new Intent(C36336b.this.f93767d, GroupTypeSelectorActivity.class);
                intent.putExtra("key_group_create_info", groupCreateInfo);
                C36336b.this.startActivityForResult(intent, 1);
            }
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView.AbstractC36331a
        /* renamed from: a */
        public void mo134034a(String str) {
            if (C36336b.this.f93767d != null) {
                if (!C36336b.this.f93768e) {
                    Intent intent = new Intent();
                    intent.putExtra("result_chat_id", str);
                    C36336b.this.f93767d.setResult(-1, intent);
                } else if (C36336b.this.f93769f && mo134037c() != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("result_chat_id", str);
                    C36336b.this.f93767d.setResult(-1, intent2);
                }
                mo134031a();
            }
        }
    };

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a
    /* renamed from: b */
    public void mo134066b() {
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a
    /* renamed from: a */
    public void mo134065a() {
        C36340d dVar = this.f93764a;
        if (dVar != null) {
            dVar.mo134079b();
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36375a
    /* renamed from: c */
    public boolean mo134067c() {
        C36340d dVar = this.f93764a;
        if (dVar != null) {
            return dVar.mo134078a();
        }
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C36340d dVar = this.f93764a;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroyView();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f93764a.mo134075a(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        this.f93767d = activity;
        if (activity == null) {
            Log.m165383e("InsideGroupFragment", "Fragment " + this + " not attached to an activity.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        GroupCreateInfo groupCreateInfo;
        Log.m165379d("InsideGroupFragment", "savedInstanceState: " + bundle);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            groupCreateInfo = (GroupCreateInfo) arguments.getSerializable("key_group_create_info");
            str = arguments.getString(ShareHitPoint.f121868c, str);
        } else {
            groupCreateInfo = null;
        }
        if (groupCreateInfo == null) {
            groupCreateInfo = new GroupCreateInfo();
        }
        this.f93768e = groupCreateInfo.isOpenChat();
        this.f93769f = groupCreateInfo.isCreateTopicGroup();
        C36340d dVar = new C36340d(getContext(), bundle, groupCreateInfo, this.f93770g);
        this.f93764a = dVar;
        dVar.create();
        this.f93764a.mo134077a(str);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_inside_group, (ViewGroup) null, false);
        this.f93766c = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.create.groupchat.impl.select_member.AbstractC36394g
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i != 1) {
                if (i == 18) {
                    this.f93764a.mo134074a(intent);
                }
            } else if (intent != null) {
                GroupCreateInfo groupCreateInfo = (GroupCreateInfo) intent.getSerializableExtra("key_group_create_info");
                if (groupCreateInfo == null) {
                    groupCreateInfo = new GroupCreateInfo();
                }
                C36340d dVar = this.f93764a;
                if (dVar != null) {
                    dVar.mo134076a(groupCreateInfo);
                }
            }
        }
    }
}
