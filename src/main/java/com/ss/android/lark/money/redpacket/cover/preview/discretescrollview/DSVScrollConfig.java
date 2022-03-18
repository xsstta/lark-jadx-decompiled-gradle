package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview;

public enum DSVScrollConfig {
    ENABLED {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVScrollConfig
        public boolean isScrollBlocked(EnumC48077a aVar) {
            return false;
        }
    },
    FORWARD_ONLY {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVScrollConfig
        public boolean isScrollBlocked(EnumC48077a aVar) {
            if (aVar == EnumC48077a.START) {
                return true;
            }
            return false;
        }
    },
    BACKWARD_ONLY {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVScrollConfig
        public boolean isScrollBlocked(EnumC48077a aVar) {
            if (aVar == EnumC48077a.END) {
                return true;
            }
            return false;
        }
    },
    DISABLED {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVScrollConfig
        public boolean isScrollBlocked(EnumC48077a aVar) {
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    public abstract boolean isScrollBlocked(EnumC48077a aVar);
}
