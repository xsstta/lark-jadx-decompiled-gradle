package com.ss.android.lark.keyboard.plugin.tool.face;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40923b;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40941e;
import com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency;
import com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment;
import com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000bJ\u0014\u0010 \u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0010J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePagerNewAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentList", "", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "mEmojiDependency", "Lcom/ss/android/lark/keyboard/widget/emoji/IEmojiDependency;", "mEmojiOperationListener", "Lcom/ss/android/lark/keyboard/widget/emoji/base/OnEmojiOperationListener;", "mEmojiOperator", "Lkotlin/Function0;", "", "mOperationListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/OnOperationListener;", "mStickerDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/face/sticker/IStickerDependency;", "getCount", "", "getItem", "position", "getItemPosition", "object", "", "saveState", "Landroid/os/Parcelable;", "setEmojiDependency", "emojiDependency", "setOnEmojiOperationListener", "onEmojiOperationListener", "setOnEmojiOperatorCallback", "callback", "setOnOperationListener", "onOperationListener", "setStickerDependency", "stickerDependency", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.e */
public final class FacePagerNewAdapter extends AbstractC1045n {

    /* renamed from: a */
    private AbstractC40930c f104131a;

    /* renamed from: b */
    private AbstractC40963j f104132b;

    /* renamed from: c */
    private Function0<Unit> f104133c;

    /* renamed from: d */
    private IEmojiDependency f104134d;

    /* renamed from: e */
    private OnEmojiOperationListener f104135e;

    /* renamed from: f */
    private final List<Fragment> f104136f;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f104136f.size();
    }

    @Override // androidx.fragment.app.AbstractC1045n, androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        Parcelable saveState = super.saveState();
        if (saveState == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(saveState, "super.saveState() ?: return null");
        if (saveState != null) {
            Bundle bundle = (Bundle) saveState;
            bundle.putParcelableArray("states", null);
            return bundle;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Bundle");
    }

    /* renamed from: a */
    public final void mo147615a(AbstractC40930c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "stickerDependency");
        this.f104131a = cVar;
    }

    /* renamed from: a */
    public final void mo147616a(AbstractC40963j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "onOperationListener");
        this.f104132b = jVar;
    }

    /* renamed from: a */
    public final void mo147617a(OnEmojiOperationListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onEmojiOperationListener");
        this.f104135e = bVar;
    }

    /* renamed from: a */
    public final void mo147618a(IEmojiDependency dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "emojiDependency");
        this.f104134d = dVar;
    }

    @Override // androidx.fragment.app.AbstractC1045n
    /* renamed from: a */
    public Fragment mo5615a(int i) {
        if (i > getCount()) {
            Intrinsics.throwNpe();
            return null;
        }
        Fragment fragment = this.f104136f.get(i);
        if (fragment instanceof EmojiPageBaseFragment) {
            if (FaceFgUtil.m162148a()) {
                Function0<Unit> function0 = this.f104133c;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                EmojiPageBaseFragment aVar = (EmojiPageBaseFragment) fragment;
                aVar.mo148241a(this.f104135e);
                aVar.mo148242a(this.f104134d);
            }
        } else if (fragment instanceof C40923b) {
            C40923b bVar = (C40923b) fragment;
            bVar.mo147570a(this.f104132b);
            bVar.mo147569a(this.f104131a);
        } else if (fragment instanceof C40941e) {
            C40941e eVar = (C40941e) fragment;
            eVar.mo147593a(this.f104132b);
            eVar.mo147592a(this.f104131a);
        }
        if (fragment == null) {
            Intrinsics.throwNpe();
        }
        return fragment;
    }

    /* renamed from: a */
    public final void mo147619a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        this.f104133c = function0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacePagerNewAdapter(FragmentManager fragmentManager, List<? extends Fragment> list) {
        super(fragmentManager);
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(list, "fragmentList");
        this.f104136f = list;
    }
}
