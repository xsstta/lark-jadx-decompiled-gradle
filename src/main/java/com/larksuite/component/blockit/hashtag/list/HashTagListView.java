package com.larksuite.component.blockit.hashtag.list;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.C24051c;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.TagPermissionType;
import com.larksuite.component.blockit.hashtag.HashTagViewData;
import com.larksuite.component.blockit.hashtag.list.HashTagSwipeAdapter;
import com.larksuite.component.blockit.hashtag.list.IHashTagListContract;
import com.larksuite.component.blockit.p1066a.C24048b;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.ui.C26174a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001!B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0016\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagListView;", "Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IView;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/larksuite/component/blockit/hashtag/list/HashTagListView$ViewDependency;", "hitPointParams", "", "", "", "(Landroid/view/View;Lcom/larksuite/component/blockit/hashtag/list/HashTagListView$ViewDependency;Ljava/util/Map;)V", "mAdapter", "Lcom/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter;", "getMRootView", "()Landroid/view/View;", "mViewDelegate", "Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IView$Delegate;", "create", "", "destroy", "initView", "setInitData", "initData", "Lcom/larksuite/component/blockit/hashtag/list/InitData;", "setViewDelegate", "viewDelegate", "showFailToast", "text", "showSuccToast", "showToast", "message", "iconRes", "", "ViewDependency", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.list.d */
public final class HashTagListView implements IHashTagListContract.IView {

    /* renamed from: a */
    public IHashTagListContract.IView.Delegate f59594a;

    /* renamed from: b */
    public HashTagSwipeAdapter f59595b;

    /* renamed from: c */
    public final ViewDependency f59596c;

    /* renamed from: d */
    public final Map<String, Object> f59597d;

    /* renamed from: e */
    private final View f59598e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagListView$ViewDependency;", "", "getActivityContext", "Landroidx/fragment/app/FragmentActivity;", "startAddHashTagActivity", "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.d$a */
    public interface ViewDependency {
        /* renamed from: a */
        FragmentActivity mo86511a();

        /* renamed from: b */
        void mo86512b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public final View mo86526a() {
        return this.f59598e;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m88053b();
    }

    /* renamed from: b */
    private final void m88053b() {
        ((CommonTitleBar) this.f59598e.findViewById(R.id.titleBar)).setTitle(R.string.Lark_Pano_WorkTopic);
        ((CommonTitleBar) this.f59598e.findViewById(R.id.titleBar)).setLeftImageResource(R.drawable.ic_svg_titlebar_close);
        FragmentActivity a = this.f59596c.mo86511a();
        if (a != null) {
            FragmentActivity fragmentActivity = a;
            String string = UIUtils.getString(fragmentActivity, R.string.Lark_Pano_IKnown);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(a.getResources().getColor(R.color.lkui_B500)), 0, string.length(), 33);
            this.f59595b = new HashTagSwipeAdapter(fragmentActivity, new C24106b(a, spannableString, this), false, false, 12, null);
            CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f59598e.findViewById(R.id.rvAddedHashTag);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.rvAddedHashTag");
            commonRecyclerView.setAdapter(this.f59595b);
            CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f59598e.findViewById(R.id.rvAddedHashTag);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.rvAddedHashTag");
            commonRecyclerView2.setItemAnimator(null);
            CommonRecyclerView commonRecyclerView3 = (CommonRecyclerView) this.f59598e.findViewById(R.id.rvAddedHashTag);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView3, "mRootView.rvAddedHashTag");
            commonRecyclerView3.setLayoutManager(new LinearLayoutManager(this.f59598e.getContext()));
            ((CommonRecyclerView) this.f59598e.findViewById(R.id.rvAddedHashTag)).setOnScrollListener(new C24110c(this));
            C26174a a2 = new C26174a.C26176a(fragmentActivity).mo93147a((float) UIUtils.dp2px(fragmentActivity, 0.5f)).mo93154e(R.color.lkui_N300).mo93150b((float) UIUtils.dp2px(fragmentActivity, 16.0f)).mo93149a();
            if (a2 != null) {
                ((CommonRecyclerView) this.f59598e.findViewById(R.id.rvAddedHashTag)).addItemDecoration(a2, 0);
            }
        }
        ((TextView) this.f59598e.findViewById(R.id.tvAddHashTag)).setOnClickListener(new C24111d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagListView$initView$1$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.d$c */
    public static final class C24110c extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ HashTagListView f59606a;

        C24110c(HashTagListView dVar) {
            this.f59606a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            HashTagSwipeAdapter eVar = this.f59606a.f59595b;
            if (eVar != null) {
                eVar.mo86622b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagListView$initView$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.d$d */
    public static final class C24111d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ HashTagListView f59607a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C24111d(HashTagListView dVar) {
            this.f59607a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f59607a.f59596c.mo86512b();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IHashTagListContract.IView.Delegate aVar) {
        this.f59594a = aVar;
    }

    @Override // com.larksuite.component.blockit.hashtag.list.IHashTagListContract.IView
    /* renamed from: a */
    public void mo86529a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        if (!TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f59598e.getContext(), (int) R.drawable.ic_svg_toast_succeed, str);
        }
    }

    @Override // com.larksuite.component.blockit.hashtag.list.IHashTagListContract.IView
    /* renamed from: b */
    public void mo86530b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        if (!TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f59598e.getContext(), str);
        }
    }

    @Override // com.larksuite.component.blockit.hashtag.list.IHashTagListContract.IView
    /* renamed from: a */
    public void mo86528a(InitData hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "initData");
        HashTagSwipeAdapter eVar = this.f59595b;
        if (eVar != null) {
            eVar.mo86537a(hVar.mo86543a());
        }
        if (!CollectionUtils.isEmpty(hVar.mo86543a())) {
            TextView textView = (TextView) this.f59598e.findViewById(R.id.tvAddedHashTagDesc);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.tvAddedHashTagDesc");
            textView.setVisibility(0);
            CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f59598e.findViewById(R.id.rvAddedHashTag);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.rvAddedHashTag");
            commonRecyclerView.setVisibility(0);
            FrameLayout frameLayout = (FrameLayout) this.f59598e.findViewById(R.id.flEmptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.flEmptyContainer");
            frameLayout.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) this.f59598e.findViewById(R.id.tvAddedHashTagDesc);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.tvAddedHashTagDesc");
        textView2.setVisibility(0);
        CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f59598e.findViewById(R.id.rvAddedHashTag);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.rvAddedHashTag");
        commonRecyclerView2.setVisibility(8);
        FrameLayout frameLayout2 = (FrameLayout) this.f59598e.findViewById(R.id.flEmptyContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mRootView.flEmptyContainer");
        frameLayout2.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagListView$initView$1$1", "Lcom/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter$ItemClickListener;", "onDeleteItemClicked", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onItemClicked", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.d$b */
    public static final class C24106b implements HashTagSwipeAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f59599a;

        /* renamed from: b */
        final /* synthetic */ SpannableString f59600b;

        /* renamed from: c */
        final /* synthetic */ HashTagListView f59601c;

        @Override // com.larksuite.component.blockit.hashtag.list.HashTagSwipeAdapter.ItemClickListener
        /* renamed from: a */
        public void mo86478a(int i, HashTagViewData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (bVar.mo86493f()) {
                JSONObject jSONObject = new JSONObject(this.f59601c.f59597d);
                jSONObject.put("tag_id", bVar.mo86487a());
                jSONObject.put("from", "panel");
                C24048b.m87864a("pano_panel_and_view_jump", jSONObject);
                C24051c.m87870a().mo86299a(this.f59601c.mo86526a().getContext(), bVar.mo86495h());
                return;
            }
            new C25639g(this.f59599a).mo89248g(R.string.Lark_Pano_UnableViewTopic).mo89251j(2).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Pano_ViewDesc, "name", bVar.mo86497i())).mo89225a(R.id.lkui_dialog_btn_right, this.f59600b, (DialogInterface.OnClickListener) null).mo89239c();
        }

        @Override // com.larksuite.component.blockit.hashtag.list.HashTagSwipeAdapter.ItemClickListener
        /* renamed from: b */
        public void mo86479b(int i, final HashTagViewData bVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (bVar.mo86494g()) {
                String string = UIHelper.getString(R.string.Lark_Pano_Remove);
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(new ForegroundColorSpan(this.f59599a.getResources().getColor(R.color.lkui_R500)), 0, string.length(), 33);
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Pano_RemoveTopicDesc, "name", bVar.mo86489c());
                if (bVar.mo86498j() == TagPermissionType.Private.value()) {
                    IHashTagListContract.IView.Delegate aVar = this.f59601c.f59594a;
                    if (aVar != null) {
                        str = aVar.mo86522a();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, BlockTypeID.CHAT.getValue())) {
                        mustacheFormat = UIHelper.getString(R.string.Lark_Pano_RemoveAutoTagTopicDesc);
                    }
                }
                new C25639g(this.f59599a).mo89237b(UIHelper.getString(R.string.Lark_Pano_RemoveTopic)).mo89251j(2).mo89242c(mustacheFormat).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_Pano_Cancel), new DialogInterface.OnClickListener(this) {
                    /* class com.larksuite.component.blockit.hashtag.list.HashTagListView.C24106b.DialogInterface$OnClickListenerC241071 */

                    /* renamed from: a */
                    final /* synthetic */ C24106b f59602a;

                    {
                        this.f59602a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        HashTagSwipeAdapter eVar = this.f59602a.f59601c.f59595b;
                        if (eVar != null) {
                            eVar.mo86622b();
                        }
                    }
                }).mo89225a(R.id.lkui_dialog_btn_right, spannableString, new DialogInterface.OnClickListener(this) {
                    /* class com.larksuite.component.blockit.hashtag.list.HashTagListView.C24106b.DialogInterface$OnClickListenerC241082 */

                    /* renamed from: a */
                    final /* synthetic */ C24106b f59603a;

                    {
                        this.f59603a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        Integer num;
                        HashTagSwipeAdapter eVar = this.f59603a.f59601c.f59595b;
                        if (eVar != null) {
                            eVar.mo86622b();
                        }
                        String b = bVar.mo86488b();
                        if (b != null) {
                            JSONObject jSONObject = new JSONObject(this.f59603a.f59601c.f59597d);
                            HashTagSwipeAdapter eVar2 = this.f59603a.f59601c.f59595b;
                            if (eVar2 != null) {
                                num = Integer.valueOf(eVar2.getItemCount());
                            } else {
                                num = null;
                            }
                            jSONObject.put("tag_count", num);
                            jSONObject.put("tag_id", bVar.mo86487a());
                            C24048b.m87864a("pano_action_panel_delete_tag", jSONObject);
                            IHashTagListContract.IView.Delegate aVar = this.f59603a.f59601c.f59594a;
                            if (aVar != null) {
                                aVar.mo86523a(bVar.mo86487a(), b);
                            }
                        }
                    }
                }).mo89239c();
                return;
            }
            new C25639g(this.f59599a).mo89248g(R.string.Lark_Pano_UnableDeleteTopic).mo89251j(2).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Pano_DeleteTopicDesc, "name", bVar.mo86497i())).mo89225a(R.id.lkui_dialog_btn_right, this.f59600b, new DialogInterface.OnClickListener(this) {
                /* class com.larksuite.component.blockit.hashtag.list.HashTagListView.C24106b.DialogInterface$OnClickListenerC241093 */

                /* renamed from: a */
                final /* synthetic */ C24106b f59605a;

                {
                    this.f59605a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    HashTagSwipeAdapter eVar = this.f59605a.f59601c.f59595b;
                    if (eVar != null) {
                        eVar.mo86622b();
                    }
                }
            }).mo89239c();
        }

        C24106b(FragmentActivity fragmentActivity, SpannableString spannableString, HashTagListView dVar) {
            this.f59599a = fragmentActivity;
            this.f59600b = spannableString;
            this.f59601c = dVar;
        }
    }

    public HashTagListView(View view, ViewDependency aVar, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(aVar, "mViewDependency");
        this.f59598e = view;
        this.f59596c = aVar;
        this.f59597d = map;
    }
}
