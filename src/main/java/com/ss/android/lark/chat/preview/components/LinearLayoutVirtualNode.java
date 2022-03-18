package com.ss.android.lark.chat.preview.components;

import com.ss.android.lark.chat.preview.entity.component.property.LinearLayoutProperty;
import com.ss.android.lark.tangram.base.node.LayoutVirtualNode;
import com.ss.android.lark.tangram.base.props.Props;
import com.ss.android.lark.tangram.base.style.TCStyle;
import com.ss.android.lark.tangram.engine.TangramNative;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/LinearLayoutVirtualNode;", "Lcom/ss/android/lark/tangram/base/node/LayoutVirtualNode;", "Lcom/ss/android/lark/chat/preview/entity/component/property/LinearLayoutProperty;", "id", "", "viewTypeIdentity", "props", "style", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/preview/entity/component/property/LinearLayoutProperty;Lcom/ss/android/lark/tangram/base/style/TCStyle;)V", "createNativeNode", "", "layout", "Landroid/graphics/RectF;", "oriWidth", "", "oriHeight", "syncChildNodeFrame", "", "nativePointer", "node", "Lcom/ss/android/lark/tangram/base/node/BaseVirtualNode;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.g */
public final class LinearLayoutVirtualNode extends LayoutVirtualNode<LinearLayoutProperty> {
    @Override // com.ss.android.lark.tangram.base.node.BaseVirtualNode
    /* renamed from: a */
    public long mo126290a() {
        long newLinearLayoutNode = TangramNative.newLinearLayoutNode();
        mo188744a(newLinearLayoutNode);
        if (mo188780u() instanceof LinearLayoutProperty) {
            Props u = mo188780u();
            if (u != null) {
                LinearLayoutProperty linearLayoutProperty = (LinearLayoutProperty) u;
                TangramNative.setLinearLayoutPropsPadding(newLinearLayoutNode, linearLayoutProperty.getPadding());
                TangramNative.setLinearLayoutPropsSpace(newLinearLayoutNode, linearLayoutProperty.getSpacing());
                TangramNative.setLinearLayoutPropsOrientation(newLinearLayoutNode, linearLayoutProperty.getOrientation().getValue());
                TangramNative.setLinearLayoutPropsAlign(newLinearLayoutNode, linearLayoutProperty.getCrossAxisAlign().getValue());
                TangramNative.setLinearLayoutPropsJustify(newLinearLayoutNode, linearLayoutProperty.getMainAxisJustify().getValue());
                TangramNative.setLinearLayoutPropsWrapWidth(newLinearLayoutNode, linearLayoutProperty.getWrapWidth());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.property.LinearLayoutProperty");
            }
        }
        return newLinearLayoutNode;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinearLayoutVirtualNode(String str, String str2, LinearLayoutProperty linearLayoutProperty, TCStyle tCStyle) {
        super(str, str2, linearLayoutProperty, tCStyle);
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "viewTypeIdentity");
        Intrinsics.checkParameterIsNotNull(linearLayoutProperty, "props");
    }
}
