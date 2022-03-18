package com.bytedance.ee.bear.share.bitableshare;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.share.DefaultShareMeta;
import com.bytedance.ee.bear.share.IShareMeta;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ6\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/share/bitableshare/BitableShareSwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checkChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "shareMeta", "Lcom/bytedance/ee/bear/share/IShareMeta;", "shareType", "tableId", "", "token", "viewId", "init", "", "onDetachedFromWindow", "setMeta", "isChecked", "", "updateState", "Companion", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableShareSwitchView extends ConstraintLayout {

    /* renamed from: c */
    public static final Companion f29585c = new Companion(null);

    /* renamed from: a */
    public IShareMeta f29586a;

    /* renamed from: b */
    public CompoundButton.OnCheckedChangeListener f29587b;

    /* renamed from: d */
    private String f29588d;

    /* renamed from: e */
    private String f29589e;

    /* renamed from: f */
    private String f29590f;

    /* renamed from: g */
    private int f29591g;

    /* renamed from: h */
    private C68289a f29592h;

    /* renamed from: i */
    private HashMap f29593i;

    /* renamed from: a */
    public View mo41737a(int i) {
        if (this.f29593i == null) {
            this.f29593i = new HashMap();
        }
        View view = (View) this.f29593i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f29593i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/share/bitableshare/BitableShareSwitchView$Companion;", "", "()V", "TAG", "", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.bitableshare.BitableShareSwitchView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29592h.dispose();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BitableShareSwitchView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.bitableshare.BitableShareSwitchView$c */
    public static final class C10993c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareSwitchView f29597a;

        /* renamed from: b */
        final /* synthetic */ boolean f29598b;

        C10993c(BitableShareSwitchView bitableShareSwitchView, boolean z) {
            this.f29597a = bitableShareSwitchView;
            this.f29598b = z;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("BitableShareSwitchView", "setMeta()...error", th);
            UDSwitch uDSwitch = (UDSwitch) this.f29597a.mo41737a(R.id.switchView);
            Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switchView");
            uDSwitch.setChecked(!this.f29598b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.bitableshare.BitableShareSwitchView$b */
    public static final class C10992b<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ BitableShareSwitchView f29595a;

        /* renamed from: b */
        final /* synthetic */ boolean f29596b;

        C10992b(BitableShareSwitchView bitableShareSwitchView, boolean z) {
            this.f29595a = bitableShareSwitchView;
            this.f29596b = z;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C13479a.m54764b("BitableShareSwitchView", "setMeta()...succeed");
            this.f29595a.mo41739a(this.f29596b);
            this.f29595a.f29586a.setFlag(this.f29596b ? 1 : 0);
            IShareMeta iShareMeta = this.f29595a.f29586a;
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            iShareMeta.setShareToken(str);
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f29595a.f29587b;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged((UDSwitch) this.f29595a.mo41737a(R.id.switchView), this.f29596b);
            }
        }
    }

    public final void setMeta(boolean z) {
        this.f29592h.mo237935a();
        this.f29592h.mo237937a(((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36644a(this.f29588d, this.f29589e, this.f29590f, this.f29591g, z ? 1 : 0).mo238001b(new C10992b(this, z), new C10993c(this, z)));
    }

    /* renamed from: a */
    public final void mo41739a(boolean z) {
        int i;
        UDSwitch uDSwitch = (UDSwitch) mo41737a(R.id.switchView);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switchView");
        uDSwitch.setChecked(z);
        if (z) {
            i = R.string.Bitable_Form_FormCollectionIsOn;
        } else {
            i = R.string.Bitable_Form_FormCollectionIsOff;
        }
        ((TextView) mo41737a(R.id.textTv)).setText(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BitableShareSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableShareSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f29588d = "";
        this.f29589e = "";
        this.f29590f = "";
        this.f29586a = new DefaultShareMeta();
        this.f29592h = new C68289a();
        LayoutInflater.from(context).inflate(R.layout.form_switch_layout, this);
        ((UDSwitch) mo41737a(R.id.switchView)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.ee.bear.share.bitableshare.BitableShareSwitchView.View$OnClickListenerC109911 */

            /* renamed from: a */
            final /* synthetic */ BitableShareSwitchView f29594a;

            {
                this.f29594a = r1;
            }

            public final void onClick(View view) {
                UDSwitch uDSwitch = (UDSwitch) this.f29594a.mo41737a(R.id.switchView);
                Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switchView");
                boolean isChecked = uDSwitch.isChecked();
                ShareBitableShareAnalytic.f29611a.mo41751a(isChecked);
                this.f29594a.setMeta(isChecked);
            }
        });
    }

    /* renamed from: a */
    public final void mo41738a(String str, String str2, String str3, int i, IShareMeta iShareMeta, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "tableId");
        Intrinsics.checkParameterIsNotNull(str3, "viewId");
        Intrinsics.checkParameterIsNotNull(iShareMeta, "shareMeta");
        Intrinsics.checkParameterIsNotNull(onCheckedChangeListener, "checkChangeListener");
        this.f29588d = str;
        this.f29589e = str2;
        this.f29590f = str3;
        this.f29591g = i;
        this.f29586a = iShareMeta;
        this.f29587b = onCheckedChangeListener;
        mo41739a(iShareMeta.isOpen());
    }
}
