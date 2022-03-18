package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview;

/* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.a */
enum EnumC48077a {
    START {
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.EnumC48077a
        public int applyTo(int i) {
            return i * -1;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.EnumC48077a
        public boolean sameAs(int i) {
            return i < 0;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.EnumC48077a
        public EnumC48077a reverse() {
            return EnumC48077a.END;
        }
    },
    END {
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.EnumC48077a
        public int applyTo(int i) {
            return i;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.EnumC48077a
        public boolean sameAs(int i) {
            return i > 0;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.EnumC48077a
        public EnumC48077a reverse() {
            return EnumC48077a.START;
        }
    };

    public abstract int applyTo(int i);

    public abstract EnumC48077a reverse();

    public abstract boolean sameAs(int i);

    public static EnumC48077a fromDelta(int i) {
        if (i > 0) {
            return END;
        }
        return START;
    }
}
