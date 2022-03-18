package com.ss.android.lark.mm.module.player.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.FormatUtil;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0018J\u0010\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u0002R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/mm/module/player/core/widget/PlayerSpeedPicker;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/lark/mm/module/player/core/widget/OnPlayerSpeedListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "TAG", "", "playerPicker", "Landroid/view/ViewGroup;", "value", "", "speed", "setSpeed", "(F)V", "speedDepend", "Lcom/ss/android/lark/mm/module/player/core/widget/IPlayerSpeedDepend;", "speedListener", "init", "", "initPick", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onSpeed", "setSpeedDepend", "dep", "setSpeedListener", "listener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PlayerSpeedPicker extends LinearLayout implements OnPlayerSpeedListener {

    /* renamed from: a */
    private final String f117466a;

    /* renamed from: b */
    private ViewGroup f117467b;

    /* renamed from: c */
    private OnPlayerSpeedListener f117468c;

    /* renamed from: d */
    private AbstractC46697a f117469d;

    /* renamed from: e */
    private float f117470e;

    /* renamed from: a */
    public final void mo164004a() {
        AbstractC46697a aVar = this.f117469d;
        if (aVar != null) {
            setSpeed(aVar.mo163867a());
        }
        OnPlayerSpeedListener bVar = this.f117468c;
        if (bVar != null) {
            bVar.onSpeed(this.f117470e);
        }
    }

    /* renamed from: b */
    private final void m184754b() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_player_speed_picker, this);
        View findViewById = findViewById(R.id.player_picker_holder);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.player_picker_holder)");
        this.f117467b = (ViewGroup) findViewById;
    }

    public final void setSpeedListener(OnPlayerSpeedListener bVar) {
        this.f117468c = bVar;
    }

    public final void setSpeedDepend(AbstractC46697a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dep");
        this.f117469d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayerSpeedPicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final void setSpeed(float f) {
        this.f117470e = f;
        ViewGroup viewGroup = this.f117467b;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerPicker");
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup2 = this.f117467b;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerPicker");
            }
            View childAt = viewGroup2.getChildAt(i);
            if (childAt != null) {
                PlayerSpeedItem playerSpeedItem = (PlayerSpeedItem) childAt;
                if (Math.abs(f - playerSpeedItem.getSpeed()) < 0.1f) {
                    playerSpeedItem.mo164000a(true, false);
                    return;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.player.core.widget.PlayerSpeedItem");
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view;
        if (motionEvent != null && motionEvent.getAction() == 2) {
            int measuredHeight = getMeasuredHeight();
            ViewGroup viewGroup = this.f117467b;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerPicker");
            }
            int y = (int) (motionEvent.getY() / ((float) (measuredHeight / viewGroup.getChildCount())));
            ViewGroup viewGroup2 = this.f117467b;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerPicker");
            }
            PlayerSpeedItem playerSpeedItem = null;
            if (viewGroup2 != null) {
                view = viewGroup2.getChildAt(y);
            } else {
                view = null;
            }
            if (view instanceof PlayerSpeedItem) {
                playerSpeedItem = view;
            }
            PlayerSpeedItem playerSpeedItem2 = playerSpeedItem;
            if (playerSpeedItem2 != null) {
                playerSpeedItem2.mo164000a(true, true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.ss.android.lark.mm.module.player.core.widget.OnPlayerSpeedListener
    public void onSpeed(float f) {
        String str = this.f117466a;
        C45855f.m181663b(str, "onSpeed " + f);
        C47083e.m186423a(getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("speed_change").mo165420c(FormatUtil.f118607a.mo165482a(f)).mo165417b("player").mo165421c());
        C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("speed_change").mo165423e("none").mo165424f("player").mo165413a("speed_type", FormatUtil.f118607a.mo165482a(f)).mo165421c());
        OnPlayerSpeedListener bVar = this.f117468c;
        if (bVar != null) {
            bVar.onSpeed(f);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayerSpeedPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlayerSpeedPicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerSpeedPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117466a = "PlayerSpeedPicker";
        this.f117470e = 1.0f;
        m184754b();
    }
}
