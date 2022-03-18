package com.bytedance.ee.bear.debug.net;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.DebugRequest;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.util.p701d.C13614b;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/debug/net/RequestDetailFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "request", "Lcom/bytedance/ee/bear/contract/DebugRequest;", "getFormatResponse", "", "getHeaderValueString", "list", "", "initRequestHeader", "", "root", "Landroid/view/View;", "initResponse", "initResponseHeader", "initTitleBar", "initUrl", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.net.b */
public final class RequestDetailFragment extends C7667e {

    /* renamed from: a */
    public static final Companion f15211a = new Companion(null);

    /* renamed from: b */
    private DebugRequest f15212b = new DebugRequest(0, null, null, null, null, null, 63, null);

    /* renamed from: c */
    private HashMap f15213c;

    /* renamed from: a */
    public void mo21325a() {
        HashMap hashMap = this.f15213c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo21325a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/debug/net/RequestDetailFragment$Companion;", "", "()V", "EXTRA_REQUEST", "", "newInstance", "Landroidx/fragment/app/Fragment;", "request", "Lcom/bytedance/ee/bear/contract/DebugRequest;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo21326a(DebugRequest debugRequest) {
            Intrinsics.checkParameterIsNotNull(debugRequest, "request");
            RequestDetailFragment bVar = new RequestDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_request", debugRequest);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: b */
    private final String m21693b() {
        try {
            JsonElement parse = new JsonParser().parse(this.f15212b.mo20052f());
            Intrinsics.checkExpressionValueIsNotNull(parse, "jsonParser.parse(request.response)");
            JsonObject asJsonObject = parse.getAsJsonObject();
            Intrinsics.checkExpressionValueIsNotNull(asJsonObject, "jsonParser.parse(request.response).asJsonObject");
            Gson create = new GsonBuilder().setPrettyPrinting().create();
            Intrinsics.checkExpressionValueIsNotNull(create, "GsonBuilder().setPrettyPrinting().create()");
            String json = create.toJson((JsonElement) asJsonObject);
            Intrinsics.checkExpressionValueIsNotNull(json, "gson.toJson(jsonObject)");
            return json;
        } catch (Throwable unused) {
            return this.f15212b.mo20052f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestDetailFragment$initRequestHeader$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.b$b */
    public static final class C5304b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ View f15214a;

        C5304b(View view) {
            this.f15214a = view;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            TextView textView = (TextView) this.f15214a.findViewById(R.id.requestHeaderText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "root.requestHeaderText");
            if (textView.getVisibility() == 0) {
                TextView textView2 = (TextView) this.f15214a.findViewById(R.id.requestHeaderText);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "root.requestHeaderText");
                textView2.setVisibility(8);
                ((ImageView) this.f15214a.findViewById(R.id.requestHeaderArrow)).setImageResource(R.drawable.ud_icon_expand_up_filled);
                return;
            }
            TextView textView3 = (TextView) this.f15214a.findViewById(R.id.requestHeaderText);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "root.requestHeaderText");
            textView3.setVisibility(0);
            ((ImageView) this.f15214a.findViewById(R.id.requestHeaderArrow)).setImageResource(R.drawable.ud_icon_expand_down_filled);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestDetailFragment$initResponse$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.b$c */
    public static final class C5305c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ View f15215a;

        C5305c(View view) {
            this.f15215a = view;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            TextView textView = (TextView) this.f15215a.findViewById(R.id.responseBodyText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "root.responseBodyText");
            if (textView.getVisibility() == 0) {
                TextView textView2 = (TextView) this.f15215a.findViewById(R.id.responseBodyText);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "root.responseBodyText");
                textView2.setVisibility(8);
                ((ImageView) this.f15215a.findViewById(R.id.responseBodyArrow)).setImageResource(R.drawable.ud_icon_expand_up_filled);
                return;
            }
            TextView textView3 = (TextView) this.f15215a.findViewById(R.id.responseBodyText);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "root.responseBodyText");
            textView3.setVisibility(0);
            ((ImageView) this.f15215a.findViewById(R.id.responseBodyArrow)).setImageResource(R.drawable.ud_icon_expand_down_filled);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestDetailFragment$initResponseHeader$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.b$e */
    public static final class C5307e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ View f15218a;

        C5307e(View view) {
            this.f15218a = view;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            TextView textView = (TextView) this.f15218a.findViewById(R.id.responseHeaderText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "root.responseHeaderText");
            if (textView.getVisibility() == 0) {
                TextView textView2 = (TextView) this.f15218a.findViewById(R.id.responseHeaderText);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "root.responseHeaderText");
                textView2.setVisibility(8);
                ((ImageView) this.f15218a.findViewById(R.id.responseHeaderArrow)).setImageResource(R.drawable.ud_icon_expand_up_filled);
                return;
            }
            TextView textView3 = (TextView) this.f15218a.findViewById(R.id.responseHeaderText);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "root.responseHeaderText");
            textView3.setVisibility(0);
            ((ImageView) this.f15218a.findViewById(R.id.responseHeaderArrow)).setImageResource(R.drawable.ud_icon_expand_down_filled);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestDetailFragment$initTitleBar$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.b$g */
    public static final class C5309g extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ RequestDetailFragment f15221a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5309g(RequestDetailFragment bVar) {
            this.f15221a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            FragmentActivity activity = this.f15221a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.b$f */
    public static final class View$OnLongClickListenerC5308f implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ RequestDetailFragment f15219a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f15220b;

        View$OnLongClickListenerC5308f(RequestDetailFragment bVar, Ref.ObjectRef objectRef) {
            this.f15219a = bVar;
            this.f15220b = objectRef;
        }

        public final boolean onLongClick(View view) {
            C13614b.m55259a(this.f15219a.requireContext(), this.f15220b.element);
            Toast.showText(this.f15219a.requireContext(), "复制成功");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.b$d */
    public static final class View$OnLongClickListenerC5306d implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ RequestDetailFragment f15216a;

        /* renamed from: b */
        final /* synthetic */ View f15217b;

        View$OnLongClickListenerC5306d(RequestDetailFragment bVar, View view) {
            this.f15216a = bVar;
            this.f15217b = view;
        }

        public final boolean onLongClick(View view) {
            Context requireContext = this.f15216a.requireContext();
            TextView textView = (TextView) this.f15217b.findViewById(R.id.responseBodyText);
            Intrinsics.checkExpressionValueIsNotNull(textView, "root.responseBodyText");
            C13614b.m55259a(requireContext, textView.getText().toString());
            Toast.showText(this.f15216a.requireContext(), "复制成功");
            return true;
        }
    }

    /* renamed from: a */
    private final String m21691a(List<String> list) {
        Iterator<T> it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + ((String) it.next()) + ';';
        }
        return str;
    }

    /* renamed from: b */
    private final void m21694b(View view) {
        TextView textView = (TextView) view.findViewById(R.id.url);
        Intrinsics.checkExpressionValueIsNotNull(textView, "root.url");
        textView.setText("URL:" + this.f15212b.mo20046b());
    }

    /* renamed from: e */
    private final void m21697e(View view) {
        ((LinearLayout) view.findViewById(R.id.responseBodyLayout)).setOnClickListener(new C5305c(view));
        TextView textView = (TextView) view.findViewById(R.id.responseBodyText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "root.responseBodyText");
        textView.setText(m21693b());
        ((TextView) view.findViewById(R.id.responseBodyText)).setOnLongClickListener(new View$OnLongClickListenerC5306d(this, view));
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        DebugRequest debugRequest;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (debugRequest = (DebugRequest) arguments.getParcelable("extra_request")) == null) {
            debugRequest = new DebugRequest(0, null, null, null, null, null, 63, null);
        }
        this.f15212b = debugRequest;
    }

    /* renamed from: a */
    private final void m21692a(View view) {
        ((BaseTitleBar) view.findViewById(R.id.titleBar)).setLeftClickListener(new C5309g(this));
        ((BaseTitleBar) view.findViewById(R.id.titleBar)).setTitle("请求详情");
    }

    /* renamed from: c */
    private final void m21695c(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.requestHeaderLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "root.requestHeaderLayout");
        linearLayout.setVisibility(8);
        TextView textView = (TextView) view.findViewById(R.id.requestHeaderText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "root.requestHeaderText");
        textView.setVisibility(8);
        ((LinearLayout) view.findViewById(R.id.requestHeaderLayout)).setOnClickListener(new C5304b(view));
        String str = "";
        int i = 0;
        for (Object obj : MapsKt.toList(this.f15212b.mo20047c())) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            str = str + ((String) pair.getFirst()) + ":" + m21691a((List) pair.getSecond());
            if (i != MapsKt.toList(this.f15212b.mo20047c()).size() - 1) {
                str = str + "\n";
            }
            i = i2;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.requestHeaderText);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "root.requestHeaderText");
        textView2.setText(str);
    }

    /* renamed from: d */
    private final void m21696d(View view) {
        ((LinearLayout) view.findViewById(R.id.responseHeaderLayout)).setOnClickListener(new C5307e(view));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        int i = 0;
        for (Object obj : MapsKt.toList(this.f15212b.mo20050e())) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            objectRef.element = (T) (((String) objectRef.element) + ((String) pair.getFirst()) + ":" + m21691a((List) pair.getSecond()));
            if (i != MapsKt.toList(this.f15212b.mo20047c()).size() - 1) {
                objectRef.element = (T) (((String) objectRef.element) + "\n");
            }
            i = i2;
        }
        TextView textView = (TextView) view.findViewById(R.id.responseHeaderText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "root.responseHeaderText");
        textView.setText(objectRef.element);
        ((TextView) view.findViewById(R.id.responseHeaderText)).setOnLongClickListener(new View$OnLongClickListenerC5308f(this, objectRef));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m21692a(view);
        m21694b(view);
        m21695c(view);
        m21696d(view);
        m21697e(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_request_detail, viewGroup, false);
    }
}
