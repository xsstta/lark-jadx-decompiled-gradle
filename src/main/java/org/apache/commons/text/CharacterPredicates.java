package org.apache.commons.text;

public enum CharacterPredicates implements AbstractC69966a {
    LETTERS {
        @Override // org.apache.commons.text.AbstractC69966a
        public boolean test(int i) {
            return Character.isLetter(i);
        }
    },
    DIGITS {
        @Override // org.apache.commons.text.AbstractC69966a
        public boolean test(int i) {
            return Character.isDigit(i);
        }
    },
    ARABIC_NUMERALS {
        @Override // org.apache.commons.text.AbstractC69966a
        public boolean test(int i) {
            return i >= 48 && i <= 57;
        }
    },
    ASCII_LOWERCASE_LETTERS {
        @Override // org.apache.commons.text.AbstractC69966a
        public boolean test(int i) {
            return i >= 97 && i <= 122;
        }
    },
    ASCII_UPPERCASE_LETTERS {
        @Override // org.apache.commons.text.AbstractC69966a
        public boolean test(int i) {
            return i >= 65 && i <= 90;
        }
    },
    ASCII_LETTERS {
        @Override // org.apache.commons.text.AbstractC69966a
        public boolean test(int i) {
            if (ASCII_LOWERCASE_LETTERS.test(i) || ASCII_UPPERCASE_LETTERS.test(i)) {
                return true;
            }
            return false;
        }
    },
    ASCII_ALPHA_NUMERALS {
        @Override // org.apache.commons.text.AbstractC69966a
        public boolean test(int i) {
            if (ASCII_LOWERCASE_LETTERS.test(i) || ASCII_UPPERCASE_LETTERS.test(i) || ARABIC_NUMERALS.test(i)) {
                return true;
            }
            return false;
        }
    }
}
