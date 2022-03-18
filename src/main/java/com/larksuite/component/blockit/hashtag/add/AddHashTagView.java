package com.larksuite.component.blockit.hashtag.add;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.component.blockit.entity.TagPermissionType;
import com.larksuite.component.blockit.hashtag.HashTagViewData;
import com.larksuite.component.blockit.hashtag.add.IAddHashTagContract;
import com.larksuite.component.blockit.hashtag.list.HashTagSwipeAdapter;
import com.larksuite.component.blockit.p1066a.C24047a;
import com.larksuite.component.blockit.p1066a.C24048b;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.ui.C26174a;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001,B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\t¢\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0016J(\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\n2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010$2\u0006\u0010%\u001a\u00020\u0007H\u0016J\u0012\u0010&\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+H\u0016R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/AddHashTagView;", "Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IView;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/larksuite/component/blockit/hashtag/add/AddHashTagView$ViewDependency;", "mIsAdd", "", "hitPointParams", "", "", "", "(Landroid/view/View;Lcom/larksuite/component/blockit/hashtag/add/AddHashTagView$ViewDependency;ZLjava/util/Map;)V", "mAdapter", "Lcom/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter;", "mContext", "Landroid/content/Context;", "mHitSessionId", "mViewDelegate", "Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IView$Delegate;", "create", "", "destroy", "finish", "initView", "onAddItemClicked", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "it", "onMentionItemClicked", "requestInputFocus", "setInitData", "initData", "Lcom/larksuite/component/blockit/hashtag/add/InitData;", "setSearchData", SearchIntents.EXTRA_QUERY, "", "needCreate", "setViewDelegate", "viewDelegate", "showToast", "message", "iconRes", "", "ViewDependency", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.add.d */
public final class AddHashTagView implements IAddHashTagContract.IView {

    /* renamed from: a */
    public IAddHashTagContract.IView.Delegate f59547a;

    /* renamed from: b */
    public Context f59548b;

    /* renamed from: c */
    public final View f59549c;

    /* renamed from: d */
    public final boolean f59550d;

    /* renamed from: e */
    private HashTagSwipeAdapter f59551e;

    /* renamed from: f */
    private String f59552f;

    /* renamed from: g */
    private final ViewDependency f59553g;

    /* renamed from: h */
    private final Map<String, Object> f59554h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/AddHashTagView$ViewDependency;", "", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.d$a */
    public interface ViewDependency {
        /* renamed from: a */
        FragmentActivity mo86448a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m87986c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.d$g */
    public static final class RunnableC24100g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AddHashTagView f59562a;

        RunnableC24100g(AddHashTagView dVar) {
            this.f59562a = dVar;
        }

        public final void run() {
            KeyboardUtils.showKeyboard((EditText) this.f59562a.f59549c.findViewById(R.id.etSearchHashTag));
        }
    }

    @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IView
    /* renamed from: b */
    public void mo86476b() {
        FragmentActivity a = this.f59553g.mo86448a();
        if (a != null) {
            a.setResult(-1);
        }
        FragmentActivity a2 = this.f59553g.mo86448a();
        if (a2 != null) {
            a2.finish();
        }
    }

    /* renamed from: a */
    public final void mo86470a() {
        EditText editText = (EditText) this.f59549c.findViewById(R.id.etSearchHashTag);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        this.f59549c.postDelayed(new RunnableC24100g(this), 150);
    }

    /* renamed from: c */
    private final void m87986c() {
        this.f59548b = this.f59553g.mo86448a();
        if (this.f59550d) {
            JSONObject jSONObject = new JSONObject(this.f59554h);
            String a = new C24047a().mo86288a();
            this.f59552f = a;
            jSONObject.put("session_id", a);
            C24048b.m87864a("pano_tag_mention_begin", jSONObject);
            ((CommonTitleBar) this.f59549c.findViewById(R.id.titleBar)).setTitle(R.string.Lark_Pano_AddTopic);
            TextView textView = (TextView) this.f59549c.findViewById(R.id.tvRecommendDesc);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.tvRecommendDesc");
            textView.setText(UIUtils.getString(this.f59548b, R.string.Lark_Pano_RecommendTopic));
        } else {
            ((CommonTitleBar) this.f59549c.findViewById(R.id.titleBar)).setTitle(R.string.Lark_Pano_Mention_ChoiceTag);
            ((CommonTitleBar) this.f59549c.findViewById(R.id.titleBar)).setLeftImageResource(R.drawable.ic_svg_titlebar_close);
            TextView textView2 = (TextView) this.f59549c.findViewById(R.id.tvRecommendDesc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.tvRecommendDesc");
            textView2.setText(UIUtils.getString(this.f59548b, R.string.Lark_Pano_Mention_RecommendTag));
        }
        EditText editText = (EditText) this.f59549c.findViewById(R.id.etSearchHashTag);
        editText.addTextChangedListener(new C24096c(this));
        editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC24097d(editText, this));
        ((ImageView) this.f59549c.findViewById(R.id.ivSearchDelete)).setOnClickListener(new C24098e(this));
        ((FrameLayout) this.f59549c.findViewById(R.id.flSearchContainer)).setOnClickListener(new C24099f(this));
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f59549c.findViewById(R.id.rvHashTags);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.rvHashTags");
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(this.f59549c.getContext()));
        C26174a a2 = new C26174a.C26176a(this.f59548b).mo93147a((float) UIUtils.dp2px(this.f59548b, 0.5f)).mo93154e(R.color.lkui_N300).mo93150b((float) UIUtils.dp2px(this.f59548b, 16.0f)).mo93149a();
        if (a2 != null) {
            ((CommonRecyclerView) this.f59549c.findViewById(R.id.rvHashTags)).addItemDecoration(a2, 0);
        }
        Context context = this.f59548b;
        if (context != null) {
            this.f59551e = new HashTagSwipeAdapter(context, new C24095b(context, this), false, this.f59550d);
            CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f59549c.findViewById(R.id.rvHashTags);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.rvHashTags");
            commonRecyclerView2.setAdapter(this.f59551e);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IAddHashTagContract.IView.Delegate bVar) {
        this.f59547a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagView$initView$1$1", "Lcom/ss/android/lark/utils/SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.d$c */
    public static final class C24096c extends C57767ae {

        /* renamed from: a */
        final /* synthetic */ AddHashTagView f59557a;

        C24096c(AddHashTagView dVar) {
            this.f59557a = dVar;
        }

        @Override // com.ss.android.lark.utils.C57767ae
        public void afterTextChanged(Editable editable) {
            boolean z;
            String valueOf = String.valueOf(editable);
            if (valueOf.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageView imageView = (ImageView) this.f59557a.f59549c.findViewById(R.id.ivSearchDelete);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.ivSearchDelete");
                imageView.setVisibility(8);
                IAddHashTagContract.IView.Delegate bVar = this.f59557a.f59547a;
                if (bVar != null) {
                    bVar.mo86462a(valueOf);
                    return;
                }
                return;
            }
            ImageView imageView2 = (ImageView) this.f59557a.f59549c.findViewById(R.id.ivSearchDelete);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mRootView.ivSearchDelete");
            imageView2.setVisibility(0);
            IAddHashTagContract.IView.Delegate bVar2 = this.f59557a.f59547a;
            if (bVar2 != null) {
                bVar2.mo86462a(valueOf);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagView$initView$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.d$e */
    public static final class C24098e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ AddHashTagView f59560a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C24098e(AddHashTagView dVar) {
            this.f59560a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ((EditText) this.f59560a.f59549c.findViewById(R.id.etSearchHashTag)).setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagView$initView$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.d$f */
    public static final class C24099f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ AddHashTagView f59561a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C24099f(AddHashTagView dVar) {
            this.f59561a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f59561a.mo86470a();
        }
    }

    @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IView
    /* renamed from: a */
    public void mo86472a(InitData fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "initData");
        HashTagSwipeAdapter eVar = this.f59551e;
        if (eVar != null) {
            eVar.mo86537a(fVar.mo86483a());
        }
        if (CollectionUtils.isNotEmpty(fVar.mo86483a())) {
            TextView textView = (TextView) this.f59549c.findViewById(R.id.tvRecommendDesc);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.tvRecommendDesc");
            textView.setVisibility(0);
            CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f59549c.findViewById(R.id.rvHashTags);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.rvHashTags");
            commonRecyclerView.setVisibility(0);
        } else {
            TextView textView2 = (TextView) this.f59549c.findViewById(R.id.tvRecommendDesc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.tvRecommendDesc");
            textView2.setVisibility(8);
            CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f59549c.findViewById(R.id.rvHashTags);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.rvHashTags");
            commonRecyclerView2.setVisibility(8);
        }
        if (!this.f59550d) {
            JSONObject jSONObject = new JSONObject(this.f59554h);
            jSONObject.put("session_id", this.f59552f);
            jSONObject.put("if_input", false);
            C24048b.m87864a("pano_mention_input_word", jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagView$initView$5$1", "Lcom/larksuite/component/blockit/hashtag/list/HashTagSwipeAdapter$ItemClickListener;", "onDeleteItemClicked", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onItemClicked", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.d$b */
    public static final class C24095b implements HashTagSwipeAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f59555a;

        /* renamed from: b */
        final /* synthetic */ AddHashTagView f59556b;

        @Override // com.larksuite.component.blockit.hashtag.list.HashTagSwipeAdapter.ItemClickListener
        /* renamed from: b */
        public void mo86479b(int i, HashTagViewData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }

        C24095b(Context context, AddHashTagView dVar) {
            this.f59555a = context;
            this.f59556b = dVar;
        }

        @Override // com.larksuite.component.blockit.hashtag.list.HashTagSwipeAdapter.ItemClickListener
        /* renamed from: a */
        public void mo86478a(int i, HashTagViewData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (this.f59556b.f59550d) {
                this.f59556b.mo86477b(bVar, this.f59555a);
            } else {
                this.f59556b.mo86473a(bVar, this.f59555a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/larksuite/component/blockit/hashtag/add/AddHashTagView$initView$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.d$d */
    public static final class View$OnFocusChangeListenerC24097d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ EditText f59558a;

        /* renamed from: b */
        final /* synthetic */ AddHashTagView f59559b;

        View$OnFocusChangeListenerC24097d(EditText editText, AddHashTagView dVar) {
            this.f59558a = editText;
            this.f59559b = dVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                KeyboardUtils.showKeyboard(this.f59558a);
            } else if (TextUtils.isEmpty(this.f59558a.getText())) {
                KeyboardUtils.hideKeyboard(this.f59559b.f59548b);
            }
        }
    }

    @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IView
    /* renamed from: a */
    public void mo86474a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        if (!TextUtils.isEmpty(str)) {
            if (i != 0) {
                LKUIToast.show(this.f59548b, i, str);
            } else {
                LKUIToast.show(this.f59548b, str);
            }
        }
    }

    /* renamed from: a */
    public final void mo86473a(HashTagViewData bVar, Context context) {
        boolean z;
        JSONObject jSONObject = new JSONObject(this.f59554h);
        jSONObject.put("session_id", this.f59552f);
        jSONObject.put("tag_id", bVar.mo86487a());
        if (((EditText) this.f59549c.findViewById(R.id.etSearchHashTag)).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("if_input", z);
        C24048b.m87864a("pano_mention_click_result", jSONObject);
        Intent intent = new Intent();
        intent.putExtra("extra.hash.tag.id", bVar.mo86487a());
        intent.putExtra("extra.hash.tag.name", bVar.mo86489c());
        intent.putExtra("extra.hash.tag.is.authorized", bVar.mo86493f());
        FragmentActivity a = this.f59553g.mo86448a();
        if (a != null) {
            a.setResult(-1, intent);
        }
        FragmentActivity a2 = this.f59553g.mo86448a();
        if (a2 != null) {
            a2.finish();
        }
    }

    /* renamed from: b */
    public final void mo86477b(HashTagViewData bVar, Context context) {
        String str;
        Integer num = null;
        if (bVar.mo86500l()) {
            IAddHashTagContract.IView.Delegate bVar2 = this.f59547a;
            if (bVar2 != null) {
                bVar2.mo86461a(bVar);
            }
            JSONObject jSONObject = new JSONObject(this.f59554h);
            HashTagSwipeAdapter eVar = this.f59551e;
            if (eVar != null) {
                num = Integer.valueOf(eVar.getItemCount() - 1);
            }
            jSONObject.put("tag_count", num);
            C24048b.m87864a("pano_action_panel_create_new_tag", jSONObject);
        } else if (bVar.mo86491e()) {
            String a = C57582a.m223604a(context, (int) R.string.Lark_Pano_RepeatAdd);
            Intrinsics.checkExpressionValueIsNotNull(a, "UiUtils.getString(it, R.…ring.Lark_Pano_RepeatAdd)");
            IAddHashTagContract.IView.C24101a.m88006a(this, a, 0, 2, null);
        } else if (bVar.mo86493f()) {
            IAddHashTagContract.IView.Delegate bVar3 = this.f59547a;
            if (bVar3 != null) {
                bVar3.mo86463b(bVar);
            }
            JSONObject jSONObject2 = new JSONObject(this.f59554h);
            HashTagSwipeAdapter eVar2 = this.f59551e;
            if (eVar2 != null) {
                num = Integer.valueOf(eVar2.getItemCount() - 1);
            }
            jSONObject2.put("tag_count", num);
            jSONObject2.put("tag_id", bVar.mo86487a());
            if (((EditText) this.f59549c.findViewById(R.id.etSearchHashTag)).length() == 0) {
                str = "recommend";
            } else {
                str = "search";
            }
            jSONObject2.put("tag_type", str);
            C24048b.m87864a("pano_action_panel_add_listed_tag", jSONObject2);
        } else {
            new C25639g(context).mo89248g(R.string.Lark_Pano_UnableAddTopic).mo89251j(2).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Pano_addDesc, "name", bVar.mo86497i())).mo89225a(R.id.lkui_dialog_btn_right, UIUtils.getString(context, R.string.Lark_Pano_IKnown), (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IView
    /* renamed from: a */
    public void mo86475a(String str, List<HashTagViewData> list, boolean z) {
        List mutableList;
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        ArrayList arrayList = new ArrayList();
        if (this.f59550d && z) {
            EditText editText = (EditText) this.f59549c.findViewById(R.id.etSearchHashTag);
            Intrinsics.checkExpressionValueIsNotNull(editText, "mRootView.etSearchHashTag");
            HashTagViewData bVar = new HashTagViewData("", "", editText.getText().toString(), false, false, true, false, "", "", TagPermissionType.Private.value(), null, true, 1024, null);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(bVar);
            }
        }
        if (!(list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null)) {
            arrayList.addAll(mutableList);
        }
        HashTagSwipeAdapter eVar = this.f59551e;
        if (eVar != null) {
            eVar.mo86537a(arrayList);
        }
        ArrayList arrayList2 = arrayList;
        if (CollectionUtils.isNotEmpty(arrayList2)) {
            CommonRecyclerView commonRecyclerView = (CommonRecyclerView) this.f59549c.findViewById(R.id.rvHashTags);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "mRootView.rvHashTags");
            commonRecyclerView.setVisibility(0);
        } else {
            CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) this.f59549c.findViewById(R.id.rvHashTags);
            Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "mRootView.rvHashTags");
            commonRecyclerView2.setVisibility(8);
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2) || !CollectionUtils.isEmpty(arrayList2)) {
            LinearLayout linearLayout = (LinearLayout) this.f59549c.findViewById(R.id.search_empty_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.search_empty_container");
            linearLayout.setVisibility(8);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) this.f59549c.findViewById(R.id.search_empty_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mRootView.search_empty_container");
            linearLayout2.setVisibility(0);
            String str3 = "未搜索到“" + str + "”相关结果";
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str3, str, 0, false, 6, (Object) null);
            int length = str.length() + indexOf$default;
            SpannableString spannableString = new SpannableString(str3);
            Context context = this.f59548b;
            if (context != null) {
                spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.lkui_B500)), indexOf$default, length, 33);
            }
            TextView textView = (TextView) this.f59549c.findViewById(R.id.tv_search_empty);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.tv_search_empty");
            textView.setText(spannableString);
        }
        if (!TextUtils.isEmpty(str2) || !CollectionUtils.isNotEmpty(list)) {
            TextView textView2 = (TextView) this.f59549c.findViewById(R.id.tvRecommendDesc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.tvRecommendDesc");
            textView2.setVisibility(8);
        } else {
            TextView textView3 = (TextView) this.f59549c.findViewById(R.id.tvRecommendDesc);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "mRootView.tvRecommendDesc");
            textView3.setVisibility(0);
        }
        if (!this.f59550d) {
            JSONObject jSONObject = new JSONObject(this.f59554h);
            jSONObject.put("session_id", this.f59552f);
            jSONObject.put("if_input", !TextUtils.isEmpty(str2));
            C24048b.m87864a("pano_mention_input_word", jSONObject);
        }
    }

    public AddHashTagView(View view, ViewDependency aVar, boolean z, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(aVar, "mViewDependency");
        this.f59549c = view;
        this.f59553g = aVar;
        this.f59550d = z;
        this.f59554h = map;
    }
}
