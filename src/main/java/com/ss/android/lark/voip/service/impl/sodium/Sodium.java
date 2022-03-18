package com.ss.android.lark.voip.service.impl.sodium;

import org.libsodium.jni.SodiumJNI;

public class Sodium {
    public static void randombytes_stir() {
        SodiumJNI.randombytes_stir();
    }

    public static int crypto_aead_chacha20poly1305_abytes() {
        return SodiumJNI.crypto_aead_chacha20poly1305_abytes();
    }

    public static int crypto_aead_chacha20poly1305_ietf_npubbytes() {
        return SodiumJNI.crypto_aead_chacha20poly1305_ietf_npubbytes();
    }

    public static int crypto_aead_chacha20poly1305_keybytes() {
        return SodiumJNI.crypto_aead_chacha20poly1305_keybytes();
    }

    public static int crypto_aead_chacha20poly1305_npubbytes() {
        return SodiumJNI.crypto_aead_chacha20poly1305_npubbytes();
    }

    public static int crypto_aead_chacha20poly1305_nsecbytes() {
        return SodiumJNI.crypto_aead_chacha20poly1305_nsecbytes();
    }

    public static int crypto_auth_bytes() {
        return SodiumJNI.crypto_auth_bytes();
    }

    public static int crypto_auth_hmacsha256_bytes() {
        return SodiumJNI.crypto_auth_hmacsha256_bytes();
    }

    public static int crypto_auth_hmacsha256_keybytes() {
        return SodiumJNI.crypto_auth_hmacsha256_keybytes();
    }

    public static int crypto_auth_hmacsha256_statebytes() {
        return SodiumJNI.crypto_auth_hmacsha256_statebytes();
    }

    public static int crypto_auth_hmacsha512256_bytes() {
        return SodiumJNI.crypto_auth_hmacsha512256_bytes();
    }

    public static int crypto_auth_hmacsha512256_keybytes() {
        return SodiumJNI.crypto_auth_hmacsha512256_keybytes();
    }

    public static int crypto_auth_hmacsha512256_statebytes() {
        return SodiumJNI.crypto_auth_hmacsha512256_statebytes();
    }

    public static int crypto_auth_hmacsha512_bytes() {
        return SodiumJNI.crypto_auth_hmacsha512_bytes();
    }

    public static int crypto_auth_hmacsha512_keybytes() {
        return SodiumJNI.crypto_auth_hmacsha512_keybytes();
    }

    public static int crypto_auth_hmacsha512_statebytes() {
        return SodiumJNI.crypto_auth_hmacsha512_statebytes();
    }

    public static int crypto_auth_keybytes() {
        return SodiumJNI.crypto_auth_keybytes();
    }

    public static byte[] crypto_auth_primitive() {
        return SodiumJNI.crypto_auth_primitive();
    }

    public static int crypto_box_beforenmbytes() {
        return SodiumJNI.crypto_box_beforenmbytes();
    }

    public static int crypto_box_boxzerobytes() {
        return SodiumJNI.crypto_box_boxzerobytes();
    }

    public static int crypto_box_curve25519xsalsa20poly1305_beforenmbytes() {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_beforenmbytes();
    }

    public static int crypto_box_curve25519xsalsa20poly1305_boxzerobytes() {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_boxzerobytes();
    }

    public static int crypto_box_curve25519xsalsa20poly1305_macbytes() {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_macbytes();
    }

    public static int crypto_box_curve25519xsalsa20poly1305_noncebytes() {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_noncebytes();
    }

    public static int crypto_box_curve25519xsalsa20poly1305_publickeybytes() {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_publickeybytes();
    }

    public static int crypto_box_curve25519xsalsa20poly1305_secretkeybytes() {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_secretkeybytes();
    }

    public static int crypto_box_curve25519xsalsa20poly1305_seedbytes() {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_seedbytes();
    }

    public static int crypto_box_curve25519xsalsa20poly1305_zerobytes() {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_zerobytes();
    }

    public static int crypto_box_macbytes() {
        return SodiumJNI.crypto_box_macbytes();
    }

    public static int crypto_box_noncebytes() {
        return SodiumJNI.crypto_box_noncebytes();
    }

    public static byte[] crypto_box_primitive() {
        return SodiumJNI.crypto_box_primitive();
    }

    public static int crypto_box_publickeybytes() {
        return SodiumJNI.crypto_box_publickeybytes();
    }

    public static int crypto_box_sealbytes() {
        return SodiumJNI.crypto_box_sealbytes();
    }

    public static int crypto_box_secretkeybytes() {
        return SodiumJNI.crypto_box_secretkeybytes();
    }

    public static int crypto_box_seedbytes() {
        return SodiumJNI.crypto_box_seedbytes();
    }

    public static int crypto_box_zerobytes() {
        return SodiumJNI.crypto_box_zerobytes();
    }

    public static int crypto_core_hsalsa20_constbytes() {
        return SodiumJNI.crypto_core_hsalsa20_constbytes();
    }

    public static int crypto_core_hsalsa20_inputbytes() {
        return SodiumJNI.crypto_core_hsalsa20_inputbytes();
    }

    public static int crypto_core_hsalsa20_keybytes() {
        return SodiumJNI.crypto_core_hsalsa20_keybytes();
    }

    public static int crypto_core_hsalsa20_outputbytes() {
        return SodiumJNI.crypto_core_hsalsa20_outputbytes();
    }

    public static int crypto_core_salsa20_constbytes() {
        return SodiumJNI.crypto_core_salsa20_constbytes();
    }

    public static int crypto_core_salsa20_inputbytes() {
        return SodiumJNI.crypto_core_salsa20_inputbytes();
    }

    public static int crypto_core_salsa20_keybytes() {
        return SodiumJNI.crypto_core_salsa20_keybytes();
    }

    public static int crypto_core_salsa20_outputbytes() {
        return SodiumJNI.crypto_core_salsa20_outputbytes();
    }

    public static int crypto_generichash_blake2b_bytes() {
        return SodiumJNI.crypto_generichash_blake2b_bytes();
    }

    public static int crypto_generichash_blake2b_bytes_max() {
        return SodiumJNI.crypto_generichash_blake2b_bytes_max();
    }

    public static int crypto_generichash_blake2b_bytes_min() {
        return SodiumJNI.crypto_generichash_blake2b_bytes_min();
    }

    public static int crypto_generichash_blake2b_keybytes() {
        return SodiumJNI.crypto_generichash_blake2b_keybytes();
    }

    public static int crypto_generichash_blake2b_keybytes_max() {
        return SodiumJNI.crypto_generichash_blake2b_keybytes_max();
    }

    public static int crypto_generichash_blake2b_keybytes_min() {
        return SodiumJNI.crypto_generichash_blake2b_keybytes_min();
    }

    public static int crypto_generichash_blake2b_personalbytes() {
        return SodiumJNI.crypto_generichash_blake2b_personalbytes();
    }

    public static int crypto_generichash_blake2b_saltbytes() {
        return SodiumJNI.crypto_generichash_blake2b_saltbytes();
    }

    public static int crypto_generichash_bytes() {
        return SodiumJNI.crypto_generichash_bytes();
    }

    public static int crypto_generichash_bytes_max() {
        return SodiumJNI.crypto_generichash_bytes_max();
    }

    public static int crypto_generichash_bytes_min() {
        return SodiumJNI.crypto_generichash_bytes_min();
    }

    public static int crypto_generichash_keybytes() {
        return SodiumJNI.crypto_generichash_keybytes();
    }

    public static int crypto_generichash_keybytes_max() {
        return SodiumJNI.crypto_generichash_keybytes_max();
    }

    public static int crypto_generichash_keybytes_min() {
        return SodiumJNI.crypto_generichash_keybytes_min();
    }

    public static byte[] crypto_generichash_primitive() {
        return SodiumJNI.crypto_generichash_primitive();
    }

    public static int crypto_generichash_statebytes() {
        return SodiumJNI.crypto_generichash_statebytes();
    }

    public static int crypto_hash_sha256_bytes() {
        return SodiumJNI.crypto_hash_sha256_bytes();
    }

    public static int crypto_hash_sha256_statebytes() {
        return SodiumJNI.crypto_hash_sha256_statebytes();
    }

    public static int crypto_hash_sha512_bytes() {
        return SodiumJNI.crypto_hash_sha512_bytes();
    }

    public static int crypto_hash_sha512_statebytes() {
        return SodiumJNI.crypto_hash_sha512_statebytes();
    }

    public static int crypto_kdf_keybytes() {
        return SodiumJNI.crypto_kdf_keybytes();
    }

    public static int crypto_kx_publickeybytes() {
        return SodiumJNI.crypto_kx_publickeybytes();
    }

    public static int crypto_kx_secretkeybytes() {
        return SodiumJNI.crypto_kx_secretkeybytes();
    }

    public static int crypto_kx_seedbytes() {
        return SodiumJNI.crypto_kx_seedbytes();
    }

    public static int crypto_kx_sessionkeybytes() {
        return SodiumJNI.crypto_kx_sessionkeybytes();
    }

    public static int crypto_onetimeauth_bytes() {
        return SodiumJNI.crypto_onetimeauth_bytes();
    }

    public static int crypto_onetimeauth_keybytes() {
        return SodiumJNI.crypto_onetimeauth_keybytes();
    }

    public static int crypto_onetimeauth_poly1305_bytes() {
        return SodiumJNI.crypto_onetimeauth_poly1305_bytes();
    }

    public static int crypto_onetimeauth_poly1305_keybytes() {
        return SodiumJNI.crypto_onetimeauth_poly1305_keybytes();
    }

    public static byte[] crypto_onetimeauth_primitive() {
        return SodiumJNI.crypto_onetimeauth_primitive();
    }

    public static int crypto_onetimeauth_statebytes() {
        return SodiumJNI.crypto_onetimeauth_statebytes();
    }

    public static int crypto_pwhash_alg_argon2i13() {
        return SodiumJNI.crypto_pwhash_alg_argon2i13();
    }

    public static int crypto_pwhash_alg_default() {
        return SodiumJNI.crypto_pwhash_alg_default();
    }

    public static int crypto_pwhash_bytes_max() {
        return SodiumJNI.crypto_pwhash_bytes_max();
    }

    public static int crypto_pwhash_bytes_min() {
        return SodiumJNI.crypto_pwhash_bytes_min();
    }

    public static int crypto_pwhash_memlimit_interactive() {
        return SodiumJNI.crypto_pwhash_memlimit_interactive();
    }

    public static int crypto_pwhash_memlimit_max() {
        return SodiumJNI.crypto_pwhash_memlimit_max();
    }

    public static int crypto_pwhash_memlimit_min() {
        return SodiumJNI.crypto_pwhash_memlimit_min();
    }

    public static int crypto_pwhash_memlimit_moderate() {
        return SodiumJNI.crypto_pwhash_memlimit_moderate();
    }

    public static int crypto_pwhash_memlimit_sensitive() {
        return SodiumJNI.crypto_pwhash_memlimit_sensitive();
    }

    public static int crypto_pwhash_opslimit_interactive() {
        return SodiumJNI.crypto_pwhash_opslimit_interactive();
    }

    public static int crypto_pwhash_opslimit_max() {
        return SodiumJNI.crypto_pwhash_opslimit_max();
    }

    public static int crypto_pwhash_opslimit_min() {
        return SodiumJNI.crypto_pwhash_opslimit_min();
    }

    public static int crypto_pwhash_opslimit_moderate() {
        return SodiumJNI.crypto_pwhash_opslimit_moderate();
    }

    public static int crypto_pwhash_opslimit_sensitive() {
        return SodiumJNI.crypto_pwhash_opslimit_sensitive();
    }

    public static int crypto_pwhash_passwd_max() {
        return SodiumJNI.crypto_pwhash_passwd_max();
    }

    public static int crypto_pwhash_passwd_min() {
        return SodiumJNI.crypto_pwhash_passwd_min();
    }

    public static byte[] crypto_pwhash_primitive() {
        return SodiumJNI.crypto_pwhash_primitive();
    }

    public static int crypto_pwhash_saltbytes() {
        return SodiumJNI.crypto_pwhash_saltbytes();
    }

    public static int crypto_pwhash_strbytes() {
        return SodiumJNI.crypto_pwhash_strbytes();
    }

    public static byte[] crypto_pwhash_strprefix() {
        return SodiumJNI.crypto_pwhash_strprefix();
    }

    public static int crypto_scalarmult_bytes() {
        return SodiumJNI.crypto_scalarmult_bytes();
    }

    public static int crypto_scalarmult_curve25519_bytes() {
        return SodiumJNI.crypto_scalarmult_curve25519_bytes();
    }

    public static int crypto_scalarmult_curve25519_scalarbytes() {
        return SodiumJNI.crypto_scalarmult_curve25519_scalarbytes();
    }

    public static byte[] crypto_scalarmult_primitive() {
        return SodiumJNI.crypto_scalarmult_primitive();
    }

    public static int crypto_scalarmult_scalarbytes() {
        return SodiumJNI.crypto_scalarmult_scalarbytes();
    }

    public static int crypto_secretbox_boxzerobytes() {
        return SodiumJNI.crypto_secretbox_boxzerobytes();
    }

    public static int crypto_secretbox_keybytes() {
        return SodiumJNI.crypto_secretbox_keybytes();
    }

    public static int crypto_secretbox_macbytes() {
        return SodiumJNI.crypto_secretbox_macbytes();
    }

    public static int crypto_secretbox_noncebytes() {
        return SodiumJNI.crypto_secretbox_noncebytes();
    }

    public static byte[] crypto_secretbox_primitive() {
        return SodiumJNI.crypto_secretbox_primitive();
    }

    public static int crypto_secretbox_xsalsa20poly1305_boxzerobytes() {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305_boxzerobytes();
    }

    public static int crypto_secretbox_xsalsa20poly1305_keybytes() {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305_keybytes();
    }

    public static int crypto_secretbox_xsalsa20poly1305_macbytes() {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305_macbytes();
    }

    public static int crypto_secretbox_xsalsa20poly1305_noncebytes() {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305_noncebytes();
    }

    public static int crypto_secretbox_xsalsa20poly1305_zerobytes() {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305_zerobytes();
    }

    public static int crypto_secretbox_zerobytes() {
        return SodiumJNI.crypto_secretbox_zerobytes();
    }

    public static int crypto_shorthash_bytes() {
        return SodiumJNI.crypto_shorthash_bytes();
    }

    public static int crypto_shorthash_keybytes() {
        return SodiumJNI.crypto_shorthash_keybytes();
    }

    public static byte[] crypto_shorthash_primitive() {
        return SodiumJNI.crypto_shorthash_primitive();
    }

    public static int crypto_shorthash_siphash24_bytes() {
        return SodiumJNI.crypto_shorthash_siphash24_bytes();
    }

    public static int crypto_shorthash_siphash24_keybytes() {
        return SodiumJNI.crypto_shorthash_siphash24_keybytes();
    }

    public static int crypto_sign_bytes() {
        return SodiumJNI.crypto_sign_bytes();
    }

    public static int crypto_sign_ed25519_bytes() {
        return SodiumJNI.crypto_sign_ed25519_bytes();
    }

    public static int crypto_sign_ed25519_publickeybytes() {
        return SodiumJNI.crypto_sign_ed25519_publickeybytes();
    }

    public static int crypto_sign_ed25519_secretkeybytes() {
        return SodiumJNI.crypto_sign_ed25519_secretkeybytes();
    }

    public static int crypto_sign_ed25519_seedbytes() {
        return SodiumJNI.crypto_sign_ed25519_seedbytes();
    }

    public static byte[] crypto_sign_primitive() {
        return SodiumJNI.crypto_sign_primitive();
    }

    public static int crypto_sign_publickeybytes() {
        return SodiumJNI.crypto_sign_publickeybytes();
    }

    public static int crypto_sign_secretkeybytes() {
        return SodiumJNI.crypto_sign_secretkeybytes();
    }

    public static int crypto_sign_seedbytes() {
        return SodiumJNI.crypto_sign_seedbytes();
    }

    public static int crypto_stream_chacha20_ietf_noncebytes() {
        return SodiumJNI.crypto_stream_chacha20_ietf_noncebytes();
    }

    public static int crypto_stream_chacha20_keybytes() {
        return SodiumJNI.crypto_stream_chacha20_keybytes();
    }

    public static int crypto_stream_chacha20_noncebytes() {
        return SodiumJNI.crypto_stream_chacha20_noncebytes();
    }

    public static int crypto_stream_salsa20_keybytes() {
        return SodiumJNI.crypto_stream_salsa20_keybytes();
    }

    public static int crypto_stream_salsa20_noncebytes() {
        return SodiumJNI.crypto_stream_salsa20_noncebytes();
    }

    public static int crypto_stream_xsalsa20_keybytes() {
        return SodiumJNI.crypto_stream_xsalsa20_keybytes();
    }

    public static int crypto_stream_xsalsa20_noncebytes() {
        return SodiumJNI.crypto_stream_xsalsa20_noncebytes();
    }

    public static int randombytes_close() {
        return SodiumJNI.randombytes_close();
    }

    public static int randombytes_random() {
        return SodiumJNI.randombytes_random();
    }

    public static int sodium_init() {
        return SodiumJNI.sodium_init();
    }

    public static byte[] sodium_version_string() {
        return SodiumJNI.sodium_version_string();
    }

    public static int crypto_hash_sha256_init(byte[] bArr) {
        return SodiumJNI.crypto_hash_sha256_init(bArr);
    }

    public static int crypto_hash_sha512_init(byte[] bArr) {
        return SodiumJNI.crypto_hash_sha512_init(bArr);
    }

    public static int randombytes_uniform(int i) {
        return SodiumJNI.randombytes_uniform(i);
    }

    public static void randombytes(byte[] bArr, int i) {
        SodiumJNI.randombytes(bArr, i);
    }

    public static void randombytes_buf(byte[] bArr, int i) {
        SodiumJNI.randombytes_buf(bArr, i);
    }

    public static void sodium_increment(byte[] bArr, int i) {
        SodiumJNI.sodium_increment(bArr, i);
    }

    public static int crypto_auth_hmacsha256_final(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_auth_hmacsha256_final(bArr, bArr2);
    }

    public static int crypto_auth_hmacsha512256_final(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_auth_hmacsha512256_final(bArr, bArr2);
    }

    public static int crypto_auth_hmacsha512_final(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_auth_hmacsha512_final(bArr, bArr2);
    }

    public static int crypto_box_curve25519xsalsa20poly1305_keypair(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_keypair(bArr, bArr2);
    }

    public static int crypto_box_keypair(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_box_keypair(bArr, bArr2);
    }

    public static int crypto_hash_sha256_final(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_hash_sha256_final(bArr, bArr2);
    }

    public static int crypto_hash_sha512_final(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_hash_sha512_final(bArr, bArr2);
    }

    public static int crypto_onetimeauth_final(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_onetimeauth_final(bArr, bArr2);
    }

    public static int crypto_onetimeauth_init(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_onetimeauth_init(bArr, bArr2);
    }

    public static int crypto_onetimeauth_poly1305_final(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_onetimeauth_poly1305_final(bArr, bArr2);
    }

    public static int crypto_onetimeauth_poly1305_init(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_onetimeauth_poly1305_init(bArr, bArr2);
    }

    public static int crypto_scalarmult_base(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_scalarmult_base(bArr, bArr2);
    }

    public static int crypto_scalarmult_curve25519_base(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_scalarmult_curve25519_base(bArr, bArr2);
    }

    public static int crypto_sign_ed25519_keypair(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_sign_ed25519_keypair(bArr, bArr2);
    }

    public static int crypto_sign_ed25519_pk_to_curve25519(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_sign_ed25519_pk_to_curve25519(bArr, bArr2);
    }

    public static int crypto_sign_ed25519_sk_to_curve25519(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_sign_ed25519_sk_to_curve25519(bArr, bArr2);
    }

    public static int crypto_sign_ed25519_sk_to_pk(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_sign_ed25519_sk_to_pk(bArr, bArr2);
    }

    public static int crypto_sign_ed25519_sk_to_seed(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_sign_ed25519_sk_to_seed(bArr, bArr2);
    }

    public static int crypto_sign_keypair(byte[] bArr, byte[] bArr2) {
        return SodiumJNI.crypto_sign_keypair(bArr, bArr2);
    }

    public static int crypto_auth_hmacsha256_init(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_auth_hmacsha256_init(bArr, bArr2, i);
    }

    public static int crypto_auth_hmacsha256_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_auth_hmacsha256_update(bArr, bArr2, i);
    }

    public static int crypto_auth_hmacsha512256_init(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_auth_hmacsha512256_init(bArr, bArr2, i);
    }

    public static int crypto_auth_hmacsha512256_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_auth_hmacsha512256_update(bArr, bArr2, i);
    }

    public static int crypto_auth_hmacsha512_init(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_auth_hmacsha512_init(bArr, bArr2, i);
    }

    public static int crypto_auth_hmacsha512_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_auth_hmacsha512_update(bArr, bArr2, i);
    }

    public static int crypto_box_beforenm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_box_beforenm(bArr, bArr2, bArr3);
    }

    public static int crypto_box_curve25519xsalsa20poly1305_beforenm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_beforenm(bArr, bArr2, bArr3);
    }

    public static int crypto_box_curve25519xsalsa20poly1305_seed_keypair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_seed_keypair(bArr, bArr2, bArr3);
    }

    public static int crypto_box_seed_keypair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_box_seed_keypair(bArr, bArr2, bArr3);
    }

    public static int crypto_generichash_blake2b_final(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_generichash_blake2b_final(bArr, bArr2, i);
    }

    public static int crypto_generichash_blake2b_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_generichash_blake2b_update(bArr, bArr2, i);
    }

    public static int crypto_generichash_final(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_generichash_final(bArr, bArr2, i);
    }

    public static int crypto_generichash_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_generichash_update(bArr, bArr2, i);
    }

    public static int crypto_hash_sha256(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_hash_sha256(bArr, bArr2, i);
    }

    public static int crypto_hash_sha256_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_hash_sha256_update(bArr, bArr2, i);
    }

    public static int crypto_hash_sha512(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_hash_sha512(bArr, bArr2, i);
    }

    public static int crypto_hash_sha512_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_hash_sha512_update(bArr, bArr2, i);
    }

    public static int crypto_kx_seed_keypair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_kx_seed_keypair(bArr, bArr2, bArr3);
    }

    public static int crypto_onetimeauth_poly1305_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_onetimeauth_poly1305_update(bArr, bArr2, i);
    }

    public static int crypto_onetimeauth_update(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_onetimeauth_update(bArr, bArr2, i);
    }

    public static int crypto_pwhash_str_verify(byte[] bArr, byte[] bArr2, int i) {
        return SodiumJNI.crypto_pwhash_str_verify(bArr, bArr2, i);
    }

    public static int crypto_scalarmult(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_scalarmult(bArr, bArr2, bArr3);
    }

    public static int crypto_scalarmult_curve25519(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_scalarmult_curve25519(bArr, bArr2, bArr3);
    }

    public static int crypto_sign_ed25519_seed_keypair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_sign_ed25519_seed_keypair(bArr, bArr2, bArr3);
    }

    public static int crypto_sign_seed_keypair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_sign_seed_keypair(bArr, bArr2, bArr3);
    }

    public static int crypto_auth(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_auth(bArr, bArr2, i, bArr3);
    }

    public static int crypto_auth_hmacsha256(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_auth_hmacsha256(bArr, bArr2, i, bArr3);
    }

    public static int crypto_auth_hmacsha256_verify(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_auth_hmacsha256_verify(bArr, bArr2, i, bArr3);
    }

    public static int crypto_auth_hmacsha512(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_auth_hmacsha512(bArr, bArr2, i, bArr3);
    }

    public static int crypto_auth_hmacsha512256(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_auth_hmacsha512256(bArr, bArr2, i, bArr3);
    }

    public static int crypto_auth_hmacsha512256_verify(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_auth_hmacsha512256_verify(bArr, bArr2, i, bArr3);
    }

    public static int crypto_auth_hmacsha512_verify(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_auth_hmacsha512_verify(bArr, bArr2, i, bArr3);
    }

    public static int crypto_auth_verify(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_auth_verify(bArr, bArr2, i, bArr3);
    }

    public static int crypto_box_seal(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_box_seal(bArr, bArr2, i, bArr3);
    }

    public static int crypto_core_hsalsa20(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_core_hsalsa20(bArr, bArr2, bArr3, bArr4);
    }

    public static int crypto_core_salsa20(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_core_salsa20(bArr, bArr2, bArr3, bArr4);
    }

    public static int crypto_generichash_blake2b_init(byte[] bArr, byte[] bArr2, int i, int i2) {
        return SodiumJNI.crypto_generichash_blake2b_init(bArr, bArr2, i, i2);
    }

    public static int crypto_generichash_init(byte[] bArr, byte[] bArr2, int i, int i2) {
        return SodiumJNI.crypto_generichash_init(bArr, bArr2, i, i2);
    }

    public static int crypto_onetimeauth(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_onetimeauth(bArr, bArr2, i, bArr3);
    }

    public static int crypto_onetimeauth_poly1305(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_onetimeauth_poly1305(bArr, bArr2, i, bArr3);
    }

    public static int crypto_onetimeauth_poly1305_verify(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_onetimeauth_poly1305_verify(bArr, bArr2, i, bArr3);
    }

    public static int crypto_onetimeauth_verify(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_onetimeauth_verify(bArr, bArr2, i, bArr3);
    }

    public static int crypto_shorthash(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_shorthash(bArr, bArr2, i, bArr3);
    }

    public static int crypto_shorthash_siphash24(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_shorthash_siphash24(bArr, bArr2, i, bArr3);
    }

    public static int crypto_sign_ed25519_verify_detached(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_sign_ed25519_verify_detached(bArr, bArr2, i, bArr3);
    }

    public static int crypto_sign_verify_detached(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_sign_verify_detached(bArr, bArr2, i, bArr3);
    }

    public static int crypto_stream_chacha20(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_stream_chacha20(bArr, i, bArr2, bArr3);
    }

    public static int crypto_stream_chacha20_ietf(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_stream_chacha20_ietf(bArr, i, bArr2, bArr3);
    }

    public static int crypto_stream_salsa20(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_stream_salsa20(bArr, i, bArr2, bArr3);
    }

    public static int crypto_stream_xsalsa20(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_stream_xsalsa20(bArr, i, bArr2, bArr3);
    }

    public static int crypto_box_afternm(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_box_afternm(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_box_curve25519xsalsa20poly1305_afternm(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_afternm(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_box_curve25519xsalsa20poly1305_open_afternm(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_open_afternm(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_box_easy_afternm(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_box_easy_afternm(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_box_open_afternm(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_box_open_afternm(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_box_open_easy_afternm(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_box_open_easy_afternm(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_box_seal_open(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_box_seal_open(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_kdf_derive_from_key(byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3) {
        return SodiumJNI.crypto_kdf_derive_from_key(bArr, i, i2, bArr2, bArr3);
    }

    public static int crypto_kx_client_session_keys(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_kx_client_session_keys(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int crypto_kx_server_session_keys(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_kx_server_session_keys(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int crypto_pwhash_str(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        return SodiumJNI.crypto_pwhash_str(bArr, bArr2, i, i2, i3);
    }

    public static int crypto_secretbox_easy(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_secretbox_easy(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_secretbox_open_easy(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_secretbox_open_easy(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_secretbox_xsalsa20poly1305(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_secretbox_xsalsa20poly1305_open(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_secretbox_xsalsa20poly1305_open(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_sign(byte[] bArr, int[] iArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_sign(bArr, iArr, bArr2, i, bArr3);
    }

    public static int crypto_sign_detached(byte[] bArr, int[] iArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_sign_detached(bArr, iArr, bArr2, i, bArr3);
    }

    public static int crypto_sign_ed25519(byte[] bArr, int[] iArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_sign_ed25519(bArr, iArr, bArr2, i, bArr3);
    }

    public static int crypto_sign_ed25519_detached(byte[] bArr, int[] iArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_sign_ed25519_detached(bArr, iArr, bArr2, i, bArr3);
    }

    public static int crypto_sign_ed25519_open(byte[] bArr, int[] iArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_sign_ed25519_open(bArr, iArr, bArr2, i, bArr3);
    }

    public static int crypto_sign_open(byte[] bArr, int[] iArr, byte[] bArr2, int i, byte[] bArr3) {
        return SodiumJNI.crypto_sign_open(bArr, iArr, bArr2, i, bArr3);
    }

    public static int crypto_stream_chacha20_ietf_xor(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_stream_chacha20_ietf_xor(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_stream_chacha20_xor(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_stream_chacha20_xor(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_stream_salsa20_xor(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_stream_salsa20_xor(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_stream_xsalsa20_xor(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_stream_xsalsa20_xor(bArr, bArr2, i, bArr3, bArr4);
    }

    public static int crypto_box(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_box(bArr, bArr2, i, bArr3, bArr4, bArr5);
    }

    public static int crypto_box_curve25519xsalsa20poly1305(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305(bArr, bArr2, i, bArr3, bArr4, bArr5);
    }

    public static int crypto_box_curve25519xsalsa20poly1305_open(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_box_curve25519xsalsa20poly1305_open(bArr, bArr2, i, bArr3, bArr4, bArr5);
    }

    public static int crypto_box_detached_afternm(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_box_detached_afternm(bArr, bArr2, bArr3, i, bArr4, bArr5);
    }

    public static int crypto_box_easy(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_box_easy(bArr, bArr2, i, bArr3, bArr4, bArr5);
    }

    public static int crypto_box_open(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_box_open(bArr, bArr2, i, bArr3, bArr4, bArr5);
    }

    public static int crypto_box_open_detached_afternm(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_box_open_detached_afternm(bArr, bArr2, bArr3, i, bArr4, bArr5);
    }

    public static int crypto_box_open_easy(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_box_open_easy(bArr, bArr2, i, bArr3, bArr4, bArr5);
    }

    public static int crypto_generichash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        return SodiumJNI.crypto_generichash(bArr, i, bArr2, i2, bArr3, i3);
    }

    public static int crypto_generichash_blake2b(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        return SodiumJNI.crypto_generichash_blake2b(bArr, i, bArr2, i2, bArr3, i3);
    }

    public static int crypto_generichash_blake2b_init_salt_personal(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, byte[] bArr4) {
        return SodiumJNI.crypto_generichash_blake2b_init_salt_personal(bArr, bArr2, i, i2, bArr3, bArr4);
    }

    public static int crypto_secretbox_detached(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_secretbox_detached(bArr, bArr2, bArr3, i, bArr4, bArr5);
    }

    public static int crypto_secretbox_open_detached(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_secretbox_open_detached(bArr, bArr2, bArr3, i, bArr4, bArr5);
    }

    public static int crypto_stream_chacha20_ietf_xor_ic(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4) {
        return SodiumJNI.crypto_stream_chacha20_ietf_xor_ic(bArr, bArr2, i, bArr3, i2, bArr4);
    }

    public static int crypto_stream_chacha20_xor_ic(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4) {
        return SodiumJNI.crypto_stream_chacha20_xor_ic(bArr, bArr2, i, bArr3, i2, bArr4);
    }

    public static int crypto_stream_salsa20_xor_ic(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4) {
        return SodiumJNI.crypto_stream_salsa20_xor_ic(bArr, bArr2, i, bArr3, i2, bArr4);
    }

    public static int crypto_stream_xsalsa20_xor_ic(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4) {
        return SodiumJNI.crypto_stream_xsalsa20_xor_ic(bArr, bArr2, i, bArr3, i2, bArr4);
    }

    public static int crypto_box_detached(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return SodiumJNI.crypto_box_detached(bArr, bArr2, bArr3, i, bArr4, bArr5, bArr6);
    }

    public static int crypto_box_open_detached(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return SodiumJNI.crypto_box_open_detached(bArr, bArr2, bArr3, i, bArr4, bArr5, bArr6);
    }

    public static int crypto_generichash_blake2b_salt_personal(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, byte[] bArr4, byte[] bArr5) {
        return SodiumJNI.crypto_generichash_blake2b_salt_personal(bArr, i, bArr2, i2, bArr3, i3, bArr4, bArr5);
    }

    public static int crypto_pwhash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, int i5) {
        return SodiumJNI.crypto_pwhash(bArr, i, bArr2, i2, bArr3, i3, i4, i5);
    }

    public static int crypto_aead_chacha20poly1305_decrypt(byte[] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i2, byte[] bArr5, byte[] bArr6) {
        return SodiumJNI.crypto_aead_chacha20poly1305_decrypt(bArr, iArr, bArr2, bArr3, i, bArr4, i2, bArr5, bArr6);
    }

    public static int crypto_aead_chacha20poly1305_encrypt(byte[] bArr, int[] iArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return SodiumJNI.crypto_aead_chacha20poly1305_encrypt(bArr, iArr, bArr2, i, bArr3, i2, bArr4, bArr5, bArr6);
    }

    public static int crypto_aead_chacha20poly1305_ietf_decrypt(byte[] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i2, byte[] bArr5, byte[] bArr6) {
        return SodiumJNI.crypto_aead_chacha20poly1305_ietf_decrypt(bArr, iArr, bArr2, bArr3, i, bArr4, i2, bArr5, bArr6);
    }

    public static int crypto_aead_chacha20poly1305_ietf_encrypt(byte[] bArr, int[] iArr, byte[] bArr2, int i, byte[] bArr3, int i2, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return SodiumJNI.crypto_aead_chacha20poly1305_ietf_encrypt(bArr, iArr, bArr2, i, bArr3, i2, bArr4, bArr5, bArr6);
    }
}
