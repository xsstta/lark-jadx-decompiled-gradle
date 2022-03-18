package com.bytedance.ee.bear.debug;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/debug/AppendParamsActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "adapter", "Lcom/bytedance/ee/bear/debug/AppendParamsActivity$ParamsAdapter;", "appendParamsSP", "Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "paramsList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/debug/AppendParamsActivity$ParamsItem;", "Lkotlin/collections/ArrayList;", "title", "", "toastMsg", "initData", "", "initFromIntent", "initView", "onDoCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ParamsAdapter", "ParamsItem", "TextWatcherImpl", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AppendParamsActivity extends BaseActivity {

    /* renamed from: e */
    public static final Companion f14987e = new Companion(null);

    /* renamed from: a */
    public PersistenceSharedPreference f14988a;

    /* renamed from: b */
    public String f14989b;

    /* renamed from: c */
    public final ArrayList<ParamsItem> f14990c = new ArrayList<>();

    /* renamed from: d */
    public final ParamsAdapter f14991d = new ParamsAdapter();

    /* renamed from: f */
    private String f14992f;

    /* renamed from: g */
    private HashMap f14993g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J*\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/debug/AppendParamsActivity$TextWatcherImpl;", "Landroid/text/TextWatcher;", "()V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$d */
    public static abstract class TextWatcherImpl implements TextWatcher {
        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: a */
    public Context mo21121a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo21122a() {
        return super.getResources();
    }

    /* renamed from: a */
    public View mo21123a(int i) {
        if (this.f14993g == null) {
            this.f14993g = new HashMap();
        }
        View view = (View) this.f14993g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14993g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo21124a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m21426a(this, context);
    }

    /* renamed from: b */
    public void mo21125b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo21126c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m21424a(this, configuration);
    }

    public AssetManager getAssets() {
        return m21431e(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m21428c(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m21430d(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/debug/AppendParamsActivity$Companion;", "", "()V", "DEFAULT_SP_NAME", "", "DEFAULT_TOAST", "KEY_SP_NAME", "KEY_SUCCESS_TOAST", "KEY_TITLE", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/debug/AppendParamsActivity$ParamsItem;", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getValue", "setValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$c */
    public static final class ParamsItem {

        /* renamed from: a */
        private String f14998a;

        /* renamed from: b */
        private String f14999b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParamsItem)) {
                return false;
            }
            ParamsItem cVar = (ParamsItem) obj;
            return Intrinsics.areEqual(this.f14998a, cVar.f14998a) && Intrinsics.areEqual(this.f14999b, cVar.f14999b);
        }

        public int hashCode() {
            String str = this.f14998a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f14999b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ParamsItem(key=" + this.f14998a + ", value=" + this.f14999b + ")";
        }

        /* renamed from: a */
        public final String mo21133a() {
            return this.f14998a;
        }

        /* renamed from: b */
        public final String mo21135b() {
            return this.f14999b;
        }

        /* renamed from: a */
        public final void mo21134a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f14998a = str;
        }

        /* renamed from: b */
        public final void mo21136b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f14999b = str;
        }

        public ParamsItem(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "value");
            this.f14998a = str;
            this.f14999b = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/debug/AppendParamsActivity$ParamsAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/debug/AppendParamsActivity$ParamsItem;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "()V", "convert", "", "helper", "paramsItem", "onViewRecycled", "holder", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$b */
    public static final class ParamsAdapter extends BaseQuickAdapter<ParamsItem, C20923c> {
        public ParamsAdapter() {
            super((int) R.layout.item_params_input);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/AppendParamsActivity$ParamsAdapter$convert$keyWatcher$1", "Lcom/bytedance/ee/bear/debug/AppendParamsActivity$TextWatcherImpl;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$b$b */
        public static final class C5243b extends TextWatcherImpl {

            /* renamed from: a */
            final /* synthetic */ ParamsItem f14996a;

            C5243b(ParamsItem cVar) {
                this.f14996a = cVar;
            }

            @Override // com.bytedance.ee.bear.debug.AppendParamsActivity.TextWatcherImpl
            public void afterTextChanged(Editable editable) {
                String str;
                ParamsItem cVar = this.f14996a;
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                cVar.mo21134a(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/AppendParamsActivity$ParamsAdapter$convert$valueWatcher$1", "Lcom/bytedance/ee/bear/debug/AppendParamsActivity$TextWatcherImpl;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$b$c */
        public static final class C5244c extends TextWatcherImpl {

            /* renamed from: a */
            final /* synthetic */ ParamsItem f14997a;

            C5244c(ParamsItem cVar) {
                this.f14997a = cVar;
            }

            @Override // com.bytedance.ee.bear.debug.AppendParamsActivity.TextWatcherImpl
            public void afterTextChanged(Editable editable) {
                String str;
                ParamsItem cVar = this.f14997a;
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                cVar.mo21136b(str);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$b$a */
        public static final class View$OnClickListenerC5242a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ParamsAdapter f14994a;

            /* renamed from: b */
            final /* synthetic */ ParamsItem f14995b;

            View$OnClickListenerC5242a(ParamsAdapter bVar, ParamsItem cVar) {
                this.f14994a = bVar;
                this.f14995b = cVar;
            }

            public final void onClick(View view) {
                this.f14994a.mo70673b().remove(this.f14995b);
                this.f14994a.notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void onViewRecycled(C20923c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "holder");
            super.onViewRecycled(cVar);
            View view = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            Object tag = ((SpaceEditText) view.findViewById(R.id.paramsKey)).getTag(R.id.tag_watcher);
            if (tag instanceof TextWatcher) {
                View view2 = cVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                ((SpaceEditText) view2.findViewById(R.id.paramsKey)).removeTextChangedListener((TextWatcher) tag);
            }
            View view3 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
            Object tag2 = ((SpaceEditText) view3.findViewById(R.id.paramsValue)).getTag(R.id.tag_watcher);
            if (tag2 instanceof TextWatcher) {
                View view4 = cVar.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "holder.itemView");
                ((SpaceEditText) view4.findViewById(R.id.paramsValue)).removeTextChangedListener((TextWatcher) tag2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16806a(C20923c cVar, ParamsItem cVar2) {
            Intrinsics.checkParameterIsNotNull(cVar, "helper");
            Intrinsics.checkParameterIsNotNull(cVar2, "paramsItem");
            View view = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "helper.itemView");
            ((SpaceEditText) view.findViewById(R.id.paramsKey)).setText(cVar2.mo21133a());
            ((SpaceEditText) view.findViewById(R.id.paramsValue)).setText(cVar2.mo21135b());
            C5243b bVar = new C5243b(cVar2);
            ((SpaceEditText) view.findViewById(R.id.paramsKey)).addTextChangedListener(bVar);
            ((SpaceEditText) view.findViewById(R.id.paramsKey)).setTag(R.id.tag_watcher, bVar);
            C5244c cVar3 = new C5244c(cVar2);
            ((SpaceEditText) view.findViewById(R.id.paramsValue)).addTextChangedListener(cVar3);
            ((SpaceEditText) view.findViewById(R.id.paramsValue)).setTag(R.id.tag_watcher, cVar3);
            ((ImageView) view.findViewById(R.id.deleteIcon)).setOnClickListener(new View$OnClickListenerC5242a(this, cVar2));
        }
    }

    /* renamed from: d */
    private final void m21429d() {
        String str;
        String str2;
        String str3;
        Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("key_sp_name")) == null) {
            str = "append_params_sp";
        }
        this.f14988a = new PersistenceSharedPreference(str);
        Intent intent2 = getIntent();
        if (intent2 == null || (str2 = intent2.getStringExtra("key_title")) == null) {
            str2 = "";
        }
        this.f14992f = str2;
        Intent intent3 = getIntent();
        if (intent3 == null || (str3 = intent3.getStringExtra("key_success_toast")) == null) {
            str3 = "保存成功";
        }
        this.f14989b = str3;
    }

    /* renamed from: e */
    private final void m21432e() {
        PersistenceSharedPreference aVar = this.f14988a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appendParamsSP");
        }
        Map<String, ?> all = aVar.getAll();
        if (all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                this.f14990c.add(new ParamsItem(entry.getKey(), (String) entry.getValue()));
            }
            if (this.f14990c.isEmpty()) {
                this.f14990c.add(new ParamsItem("", ""));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
    }

    /* renamed from: f */
    private final void m21433f() {
        BaseTitleBar baseTitleBar = (BaseTitleBar) mo21123a(R.id.titleBar);
        String str = this.f14992f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        baseTitleBar.setTitle(str);
        ((BaseTitleBar) mo21123a(R.id.titleBar)).mo45070a(new C5245e(this, R.drawable.ud_icon_more_add_outlined));
        this.f14991d.mo70690f(this.f14990c);
        RecyclerView recyclerView = (RecyclerView) mo21123a(R.id.paramsRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "paramsRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerView2 = (RecyclerView) mo21123a(R.id.paramsRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "paramsRv");
        recyclerView2.setAdapter(this.f14991d);
        ((Button) mo21123a(R.id.confirmBtn)).setOnClickListener(new View$OnClickListenerC5246f(this));
        ((Button) mo21123a(R.id.clearBtn)).setOnClickListener(new View$OnClickListenerC5247g(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ PersistenceSharedPreference m21425a(AppendParamsActivity appendParamsActivity) {
        PersistenceSharedPreference aVar = appendParamsActivity.f14988a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appendParamsSP");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m21427b(AppendParamsActivity appendParamsActivity) {
        String str = appendParamsActivity.f14989b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toastMsg");
        }
        return str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/AppendParamsActivity$initView$1", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$e */
    public static final class C5245e extends BaseTitleBar.C11803d {

        /* renamed from: a */
        final /* synthetic */ AppendParamsActivity f15000a;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            super.mo16854a(view);
            this.f15000a.f14990c.add(new ParamsItem("", ""));
            this.f15000a.f14991d.notifyDataSetChanged();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5245e(AppendParamsActivity appendParamsActivity, int i) {
            super(i);
            this.f15000a = appendParamsActivity;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$g */
    public static final class View$OnClickListenerC5247g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppendParamsActivity f15002a;

        View$OnClickListenerC5247g(AppendParamsActivity appendParamsActivity) {
            this.f15002a = appendParamsActivity;
        }

        public final void onClick(View view) {
            this.f15002a.f14990c.clear();
            this.f15002a.f14991d.notifyDataSetChanged();
            AppendParamsActivity.m21425a(this.f15002a).edit().clear().apply();
        }
    }

    /* renamed from: c */
    public static Resources m21428c(AppendParamsActivity appendParamsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appendParamsActivity);
        }
        return appendParamsActivity.mo21122a();
    }

    /* renamed from: e */
    public static AssetManager m21431e(AppendParamsActivity appendParamsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appendParamsActivity);
        }
        return appendParamsActivity.mo21126c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.AppendParamsActivity$f */
    public static final class View$OnClickListenerC5246f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppendParamsActivity f15001a;

        View$OnClickListenerC5246f(AppendParamsActivity appendParamsActivity) {
            this.f15001a = appendParamsActivity;
        }

        public final void onClick(View view) {
            boolean z;
            AppendParamsActivity.m21425a(this.f15001a).edit().clear().apply();
            Iterator<ParamsItem> it = this.f15001a.f14990c.iterator();
            while (it.hasNext()) {
                ParamsItem next = it.next();
                boolean z2 = true;
                if (next.mo21133a().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (next.mo21135b().length() <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        AppendParamsActivity.m21425a(this.f15001a).mo34037a(next.mo21133a(), next.mo21135b());
                    }
                }
            }
            AppendParamsActivity appendParamsActivity = this.f15001a;
            Toast.showText(appendParamsActivity, AppendParamsActivity.m21427b(appendParamsActivity));
            this.f15001a.finish();
        }
    }

    /* renamed from: d */
    public static void m21430d(AppendParamsActivity appendParamsActivity) {
        appendParamsActivity.mo21125b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppendParamsActivity appendParamsActivity2 = appendParamsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appendParamsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.activity_append_params);
        m21429d();
        m21432e();
        m21433f();
    }

    /* renamed from: a */
    public static void m21426a(AppendParamsActivity appendParamsActivity, Context context) {
        appendParamsActivity.mo21124a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appendParamsActivity);
        }
    }

    /* renamed from: a */
    public static Context m21424a(AppendParamsActivity appendParamsActivity, Configuration configuration) {
        Context a = appendParamsActivity.mo21121a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
